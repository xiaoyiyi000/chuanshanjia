package com.aidex.controller;

import com.aidex.common.core.domain.AjaxResult;
import com.aidex.domain.ProAnswer;
import com.aidex.domain.ProContainer;
import com.aidex.domain.ProString;
//import com.aidex.service.ProContainerService;
//import com.aidex.service.ProStuService;
import com.aidex.service.ProContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;

@RestController
@RequestMapping("/container")
public class ProContainerController {

    @Autowired
    private ProContainerService proContainerService;

    @PostMapping("/answer")
    public boolean checkanswer(@RequestBody ProAnswer proAnswer) {
        ProContainer container=proContainerService.selectContainerById(proAnswer.getContainerId());
        String trueanswer=container.getFlag();
        if(proAnswer.getAnswer().equals(trueanswer))
            return true;
        else
            return false;
    }

    @GetMapping("/create/{containername}")//应该改为image名字，比如redis
    public ProString createcontainer(@PathVariable("containername") String containername){

        ProString strs=new ProString();
        ProContainer container=new ProContainer();
        container.setStarted(1);
        int hostport;
        int containerport;
        Random r = new Random();
        hostport=r.nextInt(20000) +30000;
        container.setLocalport(hostport);
        String url="https://localhost:"+hostport;
        containerport=6380;//容器端口是指定的
        container.setContainerport(containerport);
        Runtime run =Runtime.getRuntime();

        try {
            while(isLoclePortUsing(hostport))
            {
                hostport=r.nextInt(20000) +30000;
                container.setLocalport(hostport);
                url="https://localhost:"+hostport;
            }
            strs.setUrl(url);
            container.setUrl(url);
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            run.exec("docker run -it -d -p "+"  "+hostport+":"+
                                    containerport+ " "+containername).getInputStream(),
                            "GB2312"
                    )
            );
            String line;
            StringBuilder b = new StringBuilder();
            while ((line = br.readLine()) != null) {
                b.append(line).append("\n");
            }
            strs.setContainerid(b.toString().replaceAll("\\n", ""));
            container.setContainerId(b.toString().replaceAll("\\n", ""));
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        proContainerService.insertContainer(container);
        return strs;

    }


    /*@GetMapping("/stopcontainer/{containerid}")//(value = {"/", "/{userId}"})
    public void stopcontainer(@PathVariable("containerid") String containerid){*/
    public void stopcontainer(String containerid){
        Runtime run =Runtime.getRuntime();
        String name=containerid;
        try {
            Process p = run.exec("docker stop "+containerid);

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }


    @GetMapping("/removecontainer/{containerid}")
    public void removecontainer(@PathVariable("containerid") String containerid){

        stopcontainer(containerid);
        Runtime run =Runtime.getRuntime();
        try {
            Process p= run.exec("docker rm "+containerid);
        } catch (
                IOException e) {
            e.printStackTrace();
        }
        proContainerService.deleteContainerById(containerid);

    }

    public static boolean isLoclePortUsing(int port){
        boolean flag = true;
        try{
            flag = isPortUsing("127.0.0.1", port);
        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    public static boolean isPortUsing(String host, int port) throws UnknownHostException {
        boolean flag = false;
        InetAddress theAddress = InetAddress.getByName(host);
        try{
            Socket socket = new Socket(theAddress, port);
            flag = true;
        } catch (IOException e) {
            //如果所测试端口号没有被占用，那么会抛出异常，这里利用这个机制来判断
            //所以，这里在捕获异常后，什么也不用做
        }
        return flag;
    }





}

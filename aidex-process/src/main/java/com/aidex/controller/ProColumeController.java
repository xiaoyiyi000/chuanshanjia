package com.aidex.controller;

import com.aidex.common.core.controller.BaseController;
import com.aidex.domain.ProColume;
import com.aidex.service.ProColumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/process/column")
public class ProColumeController extends BaseController {

    @Autowired
    private ProColumeService columeService;

    /*@GetMapping("/list")
    public R<PageInfo> page(ProColume proColume, HttpServletRequest request, HttpServletResponse response) {
        proColume.setPage(new PageDomain(request, response));
        return R.data(columeService.findPage(proColume));
    }*/

    @GetMapping("/pagelist")
    public List<ProColume> columeList() {
        List<ProColume> procolumelist = columeService.findPage();
        //List<List<ProColume>> list=new List<List<ProColume>>();
        return procolumelist;
    }

    @GetMapping("/list")
    public List<List<ProColume>> pageList() {
        List<ProColume> procolumelist = columeList();
        List<List<ProColume>> plist = new LinkedList<>();
        int i = 0;
        for (i = 0; i < procolumelist.size() / 3 * 3; i = i + 3) {
            //&&i<=procolumelist.size()-(i+1)%3-1//.clear();
            /*if ((i > procolumelist.size() - procolumelist.size() % 3 - 1)||procolumelist.size()<3) {
                for (int j = i; j < procolumelist.size(); j++) {
                    tempList.add(procolumelist.get(j));
                }
                plist.add(tempList);
                return plist;
            } else {
                if (i % 3 != 2) {
                    tempList.add(procolumelist.get(i));
                } else {
                    tempList.add(procolumelist.get(i));
                    List<ProColume> tList = tempList;
                    plist.add(tList);
                    tempList.clear();
                }


            }

        }
        return plist;*/
            List<ProColume> tempList = new ArrayList<ProColume>();
            if (i % 3 == 0) {
                tempList.add(procolumelist.get(i));
                tempList.add(procolumelist.get(i + 1));
                tempList.add(procolumelist.get(i + 2));
            }
            plist.add(tempList);
        }
        if(procolumelist.size()<3||i+1<=procolumelist.size())
        {
            List<ProColume> tempList = new ArrayList<ProColume>();
            for (int j = i; j < procolumelist.size(); j++) {
                tempList.add(procolumelist.get(i));
            }
            plist.add(tempList);
        }
        return plist;
    }
}

package com.aidex.controller;

import com.aidex.common.core.controller.BaseController;
import com.aidex.domain.ProTraining;
import com.aidex.service.ProTrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/process/training")
public class ProTrainingController extends BaseController {
    @Autowired
    private ProTrainingService trainingService;

    /*@GetMapping("/list")
    public R<PageInfo> page(ProTraining proTraining, HttpServletRequest request, HttpServletResponse response) {
        proTraining.setPage(new PageDomain(request, response));
        return R.data(trainingService.findPage(proTraining));
    }*/
    @GetMapping("/list")
    public  List<ProTraining>  trainingList()
    {
        List<ProTraining> proTraininglist = trainingService.findPage();
        return proTraininglist;
    }
}

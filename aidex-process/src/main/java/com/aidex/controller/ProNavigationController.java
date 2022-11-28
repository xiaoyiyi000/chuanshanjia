package com.aidex.controller;

import com.aidex.common.core.controller.BaseController;
import com.aidex.domain.ProColume;
import com.aidex.domain.ProNavigation;
import com.aidex.service.ProColumeService;
import com.aidex.service.ProNavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/process/navigation")
public class ProNavigationController extends BaseController {

    @Autowired
    private ProNavigationService navigatonService;

    @GetMapping("/list")
    public List<ProNavigation> navigationList()
    {
        List<ProNavigation> navigationList = navigatonService.findPage();
        return navigationList;
    }


}

package com.aidex.controller;

import com.aidex.common.core.controller.BaseController;
import com.aidex.domain.ProCarousel;
import com.aidex.domain.ProColume;
import com.aidex.service.ProCarouselService;
import com.aidex.service.ProColumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/process/carousel")
public class ProCarouselController extends BaseController {

    @Autowired
    private ProCarouselService carouselService;

    @GetMapping("/list")
    public List<ProCarousel> carouselList()
    {
        List<ProCarousel> procarousellist = carouselService.findPage();
        return procarousellist;
    }
}

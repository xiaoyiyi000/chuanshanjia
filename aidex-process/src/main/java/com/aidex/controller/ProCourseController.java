package com.aidex.controller;

import com.aidex.common.core.controller.BaseController;
import com.aidex.domain.ProCourse;
import com.aidex.service.ProCourseService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/process/course")
public class ProCourseController extends BaseController {
    @Autowired
    private ProCourseService courseService;

    /*@GetMapping("/list")
    public R<PageInfo> page(ProCourse proCourse, HttpServletRequest request, HttpServletResponse response) {
        proCourse.setPage(new PageDomain(request, response));
        return R.data(courseService.findPage(proCourse));
    }*/
    @GetMapping("/prolist")
    public List<ProCourse> coourseList()
    {
        List<ProCourse> procourselist = courseService.findPage();
        return procourselist;
    }

}

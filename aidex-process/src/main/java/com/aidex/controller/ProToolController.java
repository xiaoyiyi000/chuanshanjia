package com.aidex.controller;

import com.aidex.common.core.controller.BaseController;
import com.aidex.common.core.domain.R;
import com.aidex.common.core.page.PageDomain;
import com.aidex.domain.ProTool;
import com.aidex.service.ProToolService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/process/tool")
public class ProToolController extends BaseController {
    @Autowired
    private ProToolService toolService;

    /*@GetMapping("/list")
    public R<PageInfo> page(ProTool proTool, HttpServletRequest request, HttpServletResponse response) {
        proTool.setPage(new PageDomain(request, response));
        return R.data(toolService.findPage(proTool));
    }*/
    @GetMapping("/list")
    public List<ProTool> trainingList()
    {
        List<ProTool> protoollist = toolService.findPage();
        return protoollist;
    }

}

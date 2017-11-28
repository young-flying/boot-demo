package org.jewi.work.controller;

import java.util.ArrayList;
import java.util.List;

import org.jewi.work.entity.LearnResouce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/learn")
public class LearnResourceController {
    @RequestMapping("/")
    public ModelAndView index(){
        List<LearnResouce> learnList =new ArrayList<LearnResouce>();
        LearnResouce bean =new LearnResouce("百度","www.baidu.com","http://www.baidu.com");
        learnList.add(bean);
        bean =new LearnResouce("阿里云","aliyun.com","http://aliyun.com");
        learnList.add(bean);
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("learnList", learnList);
        return modelAndView;
    }
}
package com.telusko;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {
    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request,HttpServletResponse response)
    {
        System.out.println("i am added");
        int i=Integer.parseInt(request.getParameter("t1"));
        int j=Integer.parseInt(request.getParameter("t2"));
        int k=i+j;
        ModelAndView mv=new ModelAndView();
        mv.setViewName("Display.jsp");
        mv.addObject("result",k);
//        return "Display.jsp";
        return mv;
    }

}

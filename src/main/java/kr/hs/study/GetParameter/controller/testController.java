package kr.hs.study.GetParameter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

@Controller
public class testController {
    @GetMapping("/test1")
    public String test1(HttpServletRequest req){
        String a = req.getParameter("data1");
        String b = req.getParameter("data2");
        String c = req.getParameter("data3");
        System.out.println(a+" "+b+" "+c);

        return "result";
    }

    @GetMapping("/test2")
    public String test2(HttpServletRequest req){
        String a = req.getParameter("data1");
        String b = req.getParameter("data2");
        String[] c = req.getParameterValues("data3");
        System.out.print(a+" "+b+" ");
        for(String i : c) System.out.print(i+" ");

        return "result";
    }

    @GetMapping("/test3")
    public String test3(WebRequest req){
        String a = req.getParameter("data1");
        String b = req.getParameter("data2");
        String[] c = req.getParameterValues("data3");
        System.out.print(a+" "+b+" ");
        for(String i : c) System.out.print(i+" ");

        return "result";
    }
}

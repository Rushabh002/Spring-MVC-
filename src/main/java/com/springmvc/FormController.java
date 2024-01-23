package com.springmvc;

import com.springmvc.EmployeeLogin.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @RequestMapping("form")
    public String show(){

        return  "form";
    }
    @RequestMapping("store")
    public String view(@ModelAttribute("l1") Login log){

        return "store";
    }

    /*RequestParam Method
    @RequestMapping("store")
    public String view(@RequestParam("email") String e, @RequestParam("username") String u, @RequestParam("pass") String p, Model m){
        m.addAttribute("email",e);
        m.addAttribute("username",u);
        m.addAttribute("password",p);

        return "store";
    }*/
}

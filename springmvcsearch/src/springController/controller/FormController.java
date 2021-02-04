package springController.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

    @RequestMapping(path = "/login",method = RequestMethod.GET)
    public  String ShowForm(){
        return "complexForm";
    }

    @RequestMapping(path = "/home",method = RequestMethod.GET)
    public  String home(){
        return "home";
    }
}

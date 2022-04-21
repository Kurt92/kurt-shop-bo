package a.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class aController {

    @RequestMapping(value = "/")
    public String main(){

        return "";
    }

}

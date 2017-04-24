package com.lzz.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lzz on 17/4/24.
 */
@Controller
public class IndexControl {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}

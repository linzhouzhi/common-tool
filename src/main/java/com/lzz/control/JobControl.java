package com.lzz.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lzz on 17/4/24.
 */
@Controller
public class JobControl {
    @RequestMapping("/job/datax/addJob")
    public String dataxAddJob(Model model){
        model.addAttribute("jobtype", "datax");
        return "job/add_datax_job";
    }
    @RequestMapping("/job/datax/history")
    public String dataxHistory(Model model){
        model.addAttribute("jobtype", "datax");
        return "history";
    }
    @RequestMapping("/job/datax/list")
    public String dataxList(Model model){
        model.addAttribute("jobtype", "datax");
        return "list";
    }

    /* -------------- restful ----------------*/
    @RequestMapping("/job/restful/addJob")
    public String restfulAddJob(Model model){
        model.addAttribute("jobtype", "restful");
        return "job/add_restful_job";
    }
    @RequestMapping("/job/restful/history")
    public String restfulHistory(Model model){
        model.addAttribute("jobtype", "restful");
        return "history";
    }
    @RequestMapping("/job/restful/list")
    public String restfulList(Model model){
        model.addAttribute("jobtype", "restful");
        return "list";
    }

}

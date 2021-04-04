package com.example.genderdetector.controller;

import com.example.genderdetector.model.Names;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String getHomePage(){
        return "home";
    }

    @GetMapping("/result")
    public String getHomePage(@RequestParam(value = "names") String names, @RequestParam(value = "version") String version, ModelMap map){
        Names names1 = new Names(names);
        if (version.equalsIgnoreCase("simple")) map.put("result",names1.determineGenderSimpleVersion() );
        if (version.equalsIgnoreCase("full")) map.put("result",names1.determineGenderFullVersion() );
        return "result";
    }



}

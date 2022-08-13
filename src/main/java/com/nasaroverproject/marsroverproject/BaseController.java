package com.nasaroverproject.marsroverproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.nasaroverproject.marsroverproject.response.MarsRoverAPIResponse;
import com.nasaroverproject.marsroverproject.service.RoverAPIService;

//Controller listens for incoming requests, then executes certain code.
@Controller
public class BaseController {

    @Autowired
    private RoverAPIService roverService;

    @GetMapping("/")
    public String getHomeView(ModelMap model) {
        MarsRoverAPIResponse response = roverService.getRoverData("curiosity");
        model.put("roverData", response);
        return "index";        
    }

    
    @GetMapping("/curiosity")
    public String getCuriosityView(ModelMap model) {
        MarsRoverAPIResponse response = roverService.getRoverData("curiosity");
        model.put("roverData", response);
        return "index";        
    }
    @GetMapping("/spirit")
    public String getSpiritView(ModelMap model) {
        MarsRoverAPIResponse response = roverService.getRoverData("spirit");
        model.put("roverData", response);
        return "index";        
    }
    @GetMapping("/opportunity")
    public String getOpportunityView(ModelMap model) {
        MarsRoverAPIResponse response = roverService.getRoverData("opportunity");
        model.put("roverData", response);
        return "index";        
    }
}

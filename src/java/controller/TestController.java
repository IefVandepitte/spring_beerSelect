/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Color;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.TestServiceInterface;

/**
 *
 * @author ief
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private TestServiceInterface testService;
   
    @RequestMapping(value="/index", method = RequestMethod.GET)
    public String Test(Model m){
        m.addAttribute("colors", testService.getColors());
        m.addAttribute("color", new Color());
        return "beerChoice";
    }
        
    @RequestMapping(value="/index", method = RequestMethod.POST)
    public String onSubmit(@ModelAttribute Color color, Model m){
        
        m.addAttribute("beerColor", color.getValue());
        List<String> adviezen = (List<String>) testService.getAdvice(color.getValue());
        m.addAttribute("adviezen", adviezen);
        return "beerSelect";       
    }
}

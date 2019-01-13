/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ief
 */
public class TestServiceImpl implements TestServiceInterface {

    private ArrayList<String> colors;
    private ArrayList<String> voorkeuren;
    @Override
    public List<String> getColors() {
        colors =  new ArrayList<String>();
        colors.add("light");
        colors.add("brown");
        colors.add("dark");
        return colors;
    }

    @Override
    public List<String> getAdvice(String voorkeur) {
        voorkeuren = new ArrayList<>();
        switch(voorkeur){
        case "light":
            voorkeuren.add("Hoegaarden");
            voorkeuren.add("Brugs Witbier");
        break;
        case "brown":
            voorkeuren.add("Westmalle bruin");
            voorkeuren.add("Leffe bruin");
            break;
        case "dark":
            voorkeuren.add("Affligem Donker");
            break;
        }
        return voorkeuren;            
    }    
}

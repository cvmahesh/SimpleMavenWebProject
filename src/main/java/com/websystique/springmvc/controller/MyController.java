package com.websystique.springmvc.controller;
 
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/")
public class MyController {
 
     
  @RequestMapping(value = "/mycall", method = RequestMethod.GET)
  public String sayHelloThere(ModelMap model) {
      model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
      
      HashMap<String,String> myMap = new HashMap<String,String>();
      myMap.put("First","You mean first? from my call");
      myMap.put("Second","You mean second? from my call");
      model.addAttribute("myobjmycall", myMap);
      
      return "welcome";
  }
}
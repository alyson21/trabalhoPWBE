package com.cotemig.SpringBDController.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cotemig.SpringBDController.model.Time;
import com.cotemig.SpringBDController.service.TimeService;
import com.cotemig.SpringBDController.model.Atleta;
import com.cotemig.SpringBDController.service.AtletaService;

@Controller
public class SpringBdController {

	@Autowired
	private TimeService timeService;
	@Autowired
	private AtletaService atletaService;
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
    public ModelAndView insert(Integer tipo) {
		
		 
		if(tipo == 1) {
			return new ModelAndView("insert", "time", new Time());			
		}else {
			ModelAndView mav = new ModelAndView("insertAtleta", "atleta", new Atleta());
			mav.addObject("times", timeService.getAllTimes());
			return mav;		
		}
    }
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("time")Time time, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		timeService.insertTime(time);
        
        return "redirect:";
    }
	
	@RequestMapping(value = "/insertatleta", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("atleta")Atleta atleta, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		atletaService.insertAtleta(atleta);
        
        return "redirect:";
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id, Integer tipo) {
		if(tipo == 1){
			return new ModelAndView("delete", "time", timeService.getTimeById(id).get());
		}else{
			return new ModelAndView("delete", "atleta", atletaService.getAtletaById(id).get());
		}
    }
	
	@RequestMapping(value = "/deleteTime", method = RequestMethod.POST)
    public String submitDeleteTime(@Valid @ModelAttribute("time")Time time,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
		
		timeService.deleteTimeById(time.getId());
        
        return "redirect:";
    }
	
	@RequestMapping(value = "/deleteAtleta", method = RequestMethod.POST)
    public String submitDeleteAtleta(@Valid @ModelAttribute("atleta")Atleta atleta,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
		
		timeService.deleteTimeById(atleta.getId());
        
        return "redirect:";
    }
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id, Integer tipo) {
		if(tipo == 1){
			 return new ModelAndView("update", "time", timeService.getTimeById(id).get());
		}else{
			return new ModelAndView("update", "atleta", atletaService.getAtletaById(id).get());			
		}
		
    }
	
	@RequestMapping(value = "/updateTime", method = RequestMethod.POST)
    public String submitUpdateTime(@Valid @ModelAttribute("time")Time time,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
		
		timeService.updateTime(time);
        
        return "redirect:";
    }
	
	@RequestMapping(value = "/updateAtleta", method = RequestMethod.POST)
    public String submitUpdateAtleta(@Valid @ModelAttribute("atleta")Atleta atleta,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
		
		atletaService.updateAtleta(atleta);
        
        return "redirect:";
    }
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
    public ModelAndView read() {
        
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("times", timeService.getAllTimes());
        mav.addObject("atletas",  atletaService.getAllAtletas());
        return mav;
        
    }
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("times", timeService.getAllTimes());
        mav.addObject("atletas", atletaService.getAllAtletas());
        return mav;
        
    }
}

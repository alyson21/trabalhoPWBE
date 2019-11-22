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

import com.cotemig.SpringBDController.model.Salario;
import com.cotemig.SpringBDController.service.SalarioService;
import com.cotemig.SpringBDController.model.Setor;
import com.cotemig.SpringBDController.service.SetorService;

@Controller
public class SpringBdController {

	@Autowired
	private SalarioService SalarioService;
	@Autowired
	private SetorService setorService;
	
	
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
    public ModelAndView insert(Integer tipo) {
		 
		if(tipo == 1) {
			return new ModelAndView("insert", "Salario", new Salario());			
		}else {
			ModelAndView mav = new ModelAndView("insertSetor", "setor", new Setor());
			mav.addObject("Salarios", SalarioService.getAll());
			return mav;		
		}
    }
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("Salario")Salario Salario, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		SalarioService.insert(Salario);
        
        return "redirect:";
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView delete(Integer id, Integer tipo) {
		if(tipo == 1){
			return new ModelAndView("deleteSalario", "Salario", SalarioService.getById(id).get());
		}else{
			return new ModelAndView("delete", "setor", setorService.getById(id).get());
		}
    }
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String submitDeleteSetor(@Valid @ModelAttribute("setor")Setor setor,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
		
		setorService.deleteById(setor.getId());
        
        return "redirect:";
    }
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
    public ModelAndView update(Integer id, Integer tipo) {
		if(tipo == 1){
			 return new ModelAndView("updateSalario", "Salario", SalarioService.getById(id).get());
		}else{
			return new ModelAndView("update", "setor", setorService.getById(id).get());			
		}
		
    }
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
    public String submitUpdateSalario(@Valid @ModelAttribute("Salario")Salario Salario,
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
		
		SalarioService.update(Salario);
        
        return "redirect:";
    }
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
    public ModelAndView read() {
        
        ModelAndView mav = new ModelAndView("read");
        mav.addObject("Salarios", SalarioService.getAll());
        mav.addObject("setors",  setorService.getAll());
        return mav;
        
    }
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("Salarios", SalarioService.getAll());
        mav.addObject("setors", setorService.getAll());
        return mav;
        
    }
}

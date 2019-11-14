package com.cotemig.SpringBDController.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cotemig.SpringBDController.model.Setor;
import com.cotemig.SpringBDController.service.SetorService;

public class SetorController {
	@Autowired
	private SetorService setorService;
	
	

	@RequestMapping(value = "/setor", method = RequestMethod.GET)
    public ModelAndView listar() {
		ModelAndView mav = new ModelAndView();
			return new ModelAndView("setor", "Setor", setorService.getAll());	
    }
	
	@RequestMapping(value = "/insertsetor", method = RequestMethod.GET)
    public String insert() {
			return "insertSetor";		
    }
	
	
	@RequestMapping(value = "/insertsetor", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("Setor")Setor setor, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		setorService.insert(setor);
        
        return "sucesso";
    }
	
	@RequestMapping(value = "/updatesetor", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
		return new ModelAndView("updateSetor", "Setor", setorService.getById(id).get());
		
    }
	
	
	@RequestMapping(value = "/updatesetor", method = RequestMethod.POST)
    public String submitUpdate(@Valid @ModelAttribute("Setor")Setor setor, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		setorService.update(setor);
        
        return "sucesso";
    }
	
	
	@RequestMapping(value = "/deletesetor", method = RequestMethod.GET)
    public String delete() {
			return "deleteSetor";		
    }
	
	
	@RequestMapping(value = "/deletesetor", method = RequestMethod.POST)
    public String submitDelete(@Valid @ModelAttribute("Setor")Setor setor, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		setorService.deleteById(setor.getId());
        
        return "sucesso";
    }
	
	

}

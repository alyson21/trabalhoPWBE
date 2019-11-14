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

import com.cotemig.SpringBDController.model.Pagamentos;
import com.cotemig.SpringBDController.service.PagamentosService;
@Controller
public class PagamentosController {
	
	
	@Autowired
	private PagamentosService pagamentoService;
	

	@RequestMapping(value = "/pagamentos", method = RequestMethod.GET)
    public ModelAndView listar() {
		ModelAndView mav = new ModelAndView();
			return new ModelAndView("pagamentos", "Pagamentos", pagamentoService.getAll());	
    }
	
	@RequestMapping(value = "/insertpagamentos", method = RequestMethod.GET)
    public String insert() {
			return "insertFuncionario";		
    }
	
	
	@RequestMapping(value = "/insertpagamentos", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("Pagamentos")Pagamentos pagamentos, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		pagamentoService.insert(pagamentos);
        
        return "sucesso";
    }
	
	@RequestMapping(value = "/updatepagamentos", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
		return new ModelAndView("updatePagamentos", "Pagamentos", pagamentoService.getById(id).get());
		
    }
	
	
	@RequestMapping(value = "/updatepagamentos", method = RequestMethod.POST)
    public String submitUpdate(@Valid @ModelAttribute("Pagamentos")Pagamentos pagamentos, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		pagamentoService.update(pagamentos);
        
        return "sucesso";
    }
	
	
	@RequestMapping(value = "/deletepagamentos", method = RequestMethod.GET)
    public String delete() {
			return "deletePagamentos";		
    }
	
	
	@RequestMapping(value = "/deletepagamentos", method = RequestMethod.POST)
    public String submitDelete(@Valid @ModelAttribute("Pagamentos")Pagamentos pagamentos, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		pagamentoService.deleteById(pagamentos.getId());
        
        return "sucesso";
    }

}

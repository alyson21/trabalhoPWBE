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

import com.cotemig.SpringBDController.model.Pagamento;
import com.cotemig.SpringBDController.model.ValoresVariaveis;
import com.cotemig.SpringBDController.service.FuncionarioService;
import com.cotemig.SpringBDController.service.PagamentosService;
import com.cotemig.SpringBDController.service.ValoresVariaveisService;
@Controller
public class ValoresVariaveisControler {
	
	@Autowired
	private ValoresVariaveisService valoresVariaveisService;
	@Autowired
	private FuncionarioService funcionarioService;
	
	
	

	@RequestMapping(value = "/valoresvariaveis", method = RequestMethod.GET)
    public ModelAndView listar() {
		ModelAndView mav = new ModelAndView("valoresvariaveis");
		mav.addObject("valores", valoresVariaveisService.getAll());
		return mav;	
    }
	
	@RequestMapping(value = "/insertvaloresvariaveis", method = RequestMethod.GET)
    public ModelAndView insert() {
		ModelAndView mav = new ModelAndView("insertvaloresvariaveis");
		mav.addObject("funcionarios", funcionarioService.getAll());
		return mav;		
		
    }
	
	
	@RequestMapping(value = "/insertvaloresvariaveis", method = RequestMethod.POST)
    public String submitInsert(@Valid @ModelAttribute("ValoresVariaveis")ValoresVariaveis valoresvariaveis, 
      BindingResult result, ModelMap model, Integer funcionario) {
        
		if (result.hasErrors()) {
            return "error";
        }
		valoresvariaveis.setPagamento(valoresVariaveisService.findPagamentoByCompetenciaID(valoresvariaveis.getCompetencia(), funcionario));
		valoresVariaveisService.insert(valoresvariaveis);
        return "sucesso";
    }

	@RequestMapping(value = "/updatevaloresvariaveis", method = RequestMethod.GET)
    public ModelAndView update(Integer id) {
		return new ModelAndView("updateValoresVariaveis", "ValoresVariaveis", valoresVariaveisService.getById(id).get());
		
    }
	
	
	@RequestMapping(value = "/updatevaloresvariaveis", method = RequestMethod.POST)
    public String submitUpdate(@Valid @ModelAttribute("ValoresVariaveis")ValoresVariaveis valoresvariaveis, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		valoresVariaveisService.update(valoresvariaveis);
        
        return "sucesso";
    }
	
	
	@RequestMapping(value = "/deletevaloresvariaveis", method = RequestMethod.GET)
    public String delete() {
			return "deleteValoresVariaveis";		
    }
	
	
	@RequestMapping(value = "/deletevaloresvariaveis", method = RequestMethod.POST)
    public String submitDelete(@Valid @ModelAttribute("ValoresVariaveis")ValoresVariaveis valoresvariaveis, 
      BindingResult result, ModelMap model) {
        
		if (result.hasErrors()) {
            return "error";
        }
        
		valoresVariaveisService.deleteById(valoresvariaveis.getId());
        
        return "sucesso";
    }

}

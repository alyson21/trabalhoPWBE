//package com.cotemig.SpringBDController.controller;
//
////import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cotemig.SpringBDController.model.Time;
//import com.cotemig.SpringBDController.service.TimeService;
//import com.cotemig.SpringBDController.model.Atleta;
//import com.cotemig.SpringBDController.service.AtletaService;

//
//@RestController
//public class SpringBdRestController {
//
//	@Autowired
//	private TimeService timeService;
//	@Autowired
//	private AtletaService atletaService;
//	
//    @RequestMapping(value = "/rest/getAll", method = RequestMethod.GET)
//    public List<?> getAll(Integer tipo) {
//    	if(tipo == 1) {
//    		return timeService.getAllTimes();
//    	}else {
//    		return atletaService.getAllAtletas();
//    	}
//	}
//    
//    @RequestMapping(value = "/rest/gettime/{id}", method = RequestMethod.GET)
//    public Optional<Time> getTime(@PathVariable("id") Integer id) {
//		return timeService.getTimeById(id);
//	}
//    @RequestMapping(value = "/rest/getatleta/{id}", method = RequestMethod.GET)
//    public Optional<Time> getAtleta(@PathVariable("id") Integer id) {
//		return timeService.getTimeById(id);
//	}
//	
//    @RequestMapping(value = "/rest/deleteAllTimes", method = RequestMethod.DELETE)
//    public void deleteTimes() {
//    	timeService.deleteAllTimes();
//	}
//    @RequestMapping(value = "/rest/deleteAllAtletas", method = RequestMethod.DELETE)
//    public void deleteAtletas() {
//    	atletaService.deleteAllAtletas();
//	}
//    
//    @RequestMapping(value = "/rest/deletetime/{id}", method = RequestMethod.DELETE)
//    public void deleteTime(@PathVariable("id") Integer id) {
//    	timeService.deleteTimeById(id);
//	}
//    @RequestMapping(value = "/rest/deleteatleta/{id}", method = RequestMethod.DELETE)
//    public void deleteAtleta(@PathVariable("id") Integer id) {
//    	atletaService.deleteAtletaById(id);
//	}
//    
//    @RequestMapping(value = "/rest/updateTime/{id}", method = RequestMethod.POST)
//    public void updateTime(@RequestBody Time time, @PathVariable("id") Integer id) {
//    	timeService.updateTimeById(id, time);
//	}
//    @RequestMapping(value = "/rest/updateAtleta/{id}", method = RequestMethod.POST)
//    public void updateAtleta(@RequestBody Atleta atleta, @PathVariable("id") Integer id) {
//    	atletaService.updateAtletaById(id, atleta);
//	}
//    
//    @RequestMapping(value = "/rest/insertTime", method = RequestMethod.POST)
//    public void updateAluno(@RequestBody Time time) {
//		timeService.insertTime(time);
//	}
//    @RequestMapping(value = "/rest/insertAtleta", method = RequestMethod.POST)
//    public void updateAtleta(@RequestBody Atleta atleta) {
//		atletaService.insertAtleta(atleta);
//	}
//
//}
//   
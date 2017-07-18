package com.jwt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.jwt.model.Crudite;
import com.jwt.service.CruditeService;

@Controller
public class CruditeController {

	private static final Logger logger = Logger
			.getLogger(CruditeController.class);

	public CruditeController() {
		System.out.println("CruditeController()");
	}

	@Autowired
	private CruditeService cruditeService;

	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		List<Crudite> listCrudite = cruditeService.getAllCrudite();
		model.addObject("listCrudite", listCrudite);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newCrudite", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Crudite crudite = new Crudite();
		model.addObject("crudite", crudite);
		model.setViewName("CruditeForm");
		return model;
	}

	@RequestMapping(value = "/saveCrudite", method = RequestMethod.POST)
	public ModelAndView saveCrudite(@ModelAttribute Crudite crudite) {
		if (crudite.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			cruditeService.addCrudite(crudite);
		} else {
			cruditeService.updateCrudite(crudite);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteCrudite", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(HttpServletRequest request) {
		int crudId = Integer.parseInt(request.getParameter("id"));
		cruditeService.deleteCrudite(crudId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editCrudite", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int crudId = Integer.parseInt(request.getParameter("id"));
		Crudite crudite = cruditeService.getCrudite(crudId);
		ModelAndView model = new ModelAndView("CruditeForm");
		model.addObject("crudite", crudite);

		return model;
	}

}
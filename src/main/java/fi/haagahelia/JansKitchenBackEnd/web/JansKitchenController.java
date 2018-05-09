package fi.haagahelia.JansKitchenBackEnd.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fi.haagahelia.JansKitchenBackEnd.domain.Recipe;
import fi.haagahelia.JansKitchenBackEnd.domain.RecipeRepository;
import fi.haagahelia.JansKitchenBackEnd.domain.User;
import fi.haagahelia.JansKitchenBackEnd.domain.UserRepository;

@Controller

public class JansKitchenController {
	@Autowired
	public UserRepository uRepo;
	
	@Autowired 
	public RecipeRepository recipeRepo;
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Spring";
	}
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
	
	//must have @ResponseBody annotation to work
	@RequestMapping(value = "/getusers")
	@ResponseBody 
	List<User> getUsers() {
		return (List<User>) uRepo.findAll();
	}
	
	@RequestMapping(value = "/getrecipes")
	@ResponseBody 
	List<Recipe> getRecipes() {
		return (List<Recipe>) recipeRepo.findAll();
	}
	
}

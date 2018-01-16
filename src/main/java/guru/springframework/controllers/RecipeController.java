package guru.springframework.controllers;

import guru.springframework.domain.Recipe;
import guru.springframework.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Eric on 2018-01-14 22:26
 */
@Slf4j
@Controller
public class RecipeController {
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    RecipeService recipeService;

    @RequestMapping(value = "/recipe/show/{recipeId}",method = RequestMethod.GET)
    public String getShowPage(Model model, @PathVariable("recipeId") long recipeId){
        log.debug("show page");

        Recipe recipe = recipeService.findById(recipeId);
        model.addAttribute("recipe",recipe);
        return "recipe/show";
    }

}

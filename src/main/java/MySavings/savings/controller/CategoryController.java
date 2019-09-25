package MySavings.savings.controller;

import MySavings.savings.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {

    private final CategoryService categoryService;

    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("category-list")
    public ModelAndView categoryList() {
        ModelAndView modelAndView = new ModelAndView("category-list");
        modelAndView.addObject("categories", categoryService.getCategoriesListWithCountedAmounts());
        return modelAndView;
    }

    @GetMapping("/")
    public ModelAndView getCurrentPage() {
        return new ModelAndView("main");
    }
    @GetMapping("main")
    public ModelAndView getMainPage() {
        return new ModelAndView("main");
    }
}

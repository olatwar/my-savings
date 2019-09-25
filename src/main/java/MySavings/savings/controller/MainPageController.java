//package MySavings.savings.controller;
//
//import MySavings.savings.service.CategoryService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class MainPageController {
//
//    private final CategoryService categoryService;
//
//    @Autowired
//    public MainPageController(CategoryService categoryService) {
//        this.categoryService = categoryService;
//    }
//
//    @GetMapping("main-page")
//    public ModelAndView countingPercentageExpenses() {
//        ModelAndView modelAndView = new ModelAndView("redirect:category-list");
//        //todo metoda licząca
//        modelAndView.addObject("main-page", categoryService.metodaliczaca);
//        return modelAndView;
//    }
//}

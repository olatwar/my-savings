package MySavings.savings.controller;


import MySavings.savings.dto.ExpenseDto;
import MySavings.savings.model.Expense;
import MySavings.savings.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/expenses")
public class ExpensesListController {

    private final ExpenseService expenseService;

    @GetMapping("/list")
    public ModelAndView expenseList() {
        ModelAndView modelAndView = new ModelAndView("expense-list");
        modelAndView.addObject("expenses", expenseService.getAllExpenses());
        return modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView addExpense() {
        ModelAndView modelAndView = new ModelAndView("add-expense");
        modelAndView.addObject("expense", new Expense());
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView saveExpense(@ModelAttribute ExpenseDto expense){
        expenseService.addNewExpense(expense);
        return new ModelAndView("redirect:/expenses/list");
    }

    @PostMapping("/delete")
    public ModelAndView deleteExpense(@ModelAttribute ExpenseDto expense) {
        expenseService.deleteExpense(expense.getId());
        return new ModelAndView("redirect:/expenses/list");
    }
}

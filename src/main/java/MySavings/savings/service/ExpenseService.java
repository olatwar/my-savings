package MySavings.savings.service;

import MySavings.savings.dto.ExpenseDto;
import MySavings.savings.model.Expense;

import java.util.List;

public interface ExpenseService {

    Expense expense(Long id);

    List<ExpenseDto> getAllExpenses();

    Expense addNewExpense(ExpenseDto expense);

    void deleteExpense(Long id);
}

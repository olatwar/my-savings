package MySavings.savings.service;

import MySavings.savings.converter.ExpenseConverter;
import MySavings.savings.converter.ExpenseDtoConverter;
import MySavings.savings.dto.ExpenseDto;
import MySavings.savings.model.Expense;
import MySavings.savings.repository.ExpensesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DBExpenseService implements ExpenseService {

    private final ExpensesRepository expensesRepository;
    private final ExpenseConverter expenseConverter = new ExpenseConverter();
    private final ExpenseDtoConverter expenseDtoConverter = new ExpenseDtoConverter();

    @Override
    public Expense expense(Long id) {
        return expensesRepository.findById(id).orElse(null);
    }

    @Override
    public List<ExpenseDto> getAllExpenses() {
        List<Expense> expenseList = expensesRepository.findAll();
        return expenseList.stream().map(expenseDtoConverter).collect(Collectors.toList());
    }

    @Override
    public Expense addNewExpense(ExpenseDto expense) {
        return expensesRepository.save(expenseConverter.apply(expense));
    }

    @Override
    public void deleteExpense(Long id) {
        expensesRepository.deleteById(id);
    }

}

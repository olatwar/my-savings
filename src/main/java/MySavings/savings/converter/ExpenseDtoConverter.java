package MySavings.savings.converter;

import MySavings.savings.dto.ExpenseDto;
import MySavings.savings.model.Expense;

import java.util.function.Function;

public class ExpenseDtoConverter implements Function<Expense, ExpenseDto> {

    @Override
    public ExpenseDto apply(Expense expense) {
        return new ExpenseDto(expense.getId(), expense.getName(), expense.getCost(), expense.getCategory());
    }
}


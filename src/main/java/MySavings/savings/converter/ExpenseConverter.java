package MySavings.savings.converter;

import MySavings.savings.dto.ExpenseDto;
import MySavings.savings.model.Expense;

import java.util.function.Function;

public class ExpenseConverter implements Function<ExpenseDto, Expense> {

    @Override
    public Expense apply(ExpenseDto dto) {
        Expense expense = new Expense();
        expense.setId(dto.getId());
        expense.setName(dto.getName());
        expense.setCost(dto.getCost());
        expense.setCategory(dto.getCategory());
        return expense;
    }
}


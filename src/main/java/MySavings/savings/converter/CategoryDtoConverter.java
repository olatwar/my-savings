package MySavings.savings.converter;

import MySavings.savings.dto.CategoryDto;
import MySavings.savings.model.Category;

import java.util.function.Function;

public class CategoryDtoConverter implements Function<Category, CategoryDto> {


    @Override
    public CategoryDto apply(Category category) {
        CategoryDto categoryDto = new CategoryDto(category.getId(), category.getName(), category.getPercent(), category.getAmount());
        return categoryDto;
    }

    public static Category convertToCategory(CategoryDto dto) {
        return new Category(dto.getName(), dto.getPercent(), dto.getAmount());
    }
}
package MySavings.savings.service;

import MySavings.savings.model.Category;
import MySavings.savings.model.Salary;
import MySavings.savings.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class DBCategoryService implements CategoryService {

    private final CategoriesRepository categoriesRepository;
    Salary salary = new Salary(BigDecimal.valueOf(10000));

    @Autowired
    public DBCategoryService(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    @Override
    public List<Category> categories() {
        return categoriesRepository.findAll();
    }

    @Override
    public Category category(Long id) {
        return null;
    }

    @Override
    public List<Category> getAllCategories() {
        return categoriesRepository.getAllCategories();
    }

    @Override
    public List<Category> getCategoriesListWithCountedAmounts() {
        List<Category> categoriesList = getAllCategories();
        for (Category category : categoriesList){
            category.setAmount(salary.getSalary().multiply(BigDecimal.valueOf(category.getPercent())));
        }
        return categoriesList;
    }
}

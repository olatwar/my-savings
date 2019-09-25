package MySavings.savings.service;

import MySavings.savings.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    List<Category> categories();

    //todo metoda licząca
    Category category(Long id);
    List<Category> getAllCategories();
    List<Category> getCategoriesListWithCountedAmounts();
}

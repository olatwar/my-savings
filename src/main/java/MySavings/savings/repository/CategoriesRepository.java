package MySavings.savings.repository;

import MySavings.savings.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriesRepository extends JpaRepository<Category, Long> {

    @Query(value = "SELECT * FROM Category", nativeQuery = true)
    List<Category> getAllCategories();
}

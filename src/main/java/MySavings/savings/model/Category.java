package MySavings.savings.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Float percent;
    private BigDecimal amount;
    @OneToOne(cascade = CascadeType.ALL)
    Salary salary = new Salary(BigDecimal.valueOf(10200));

    public Category(String name, Float percent, BigDecimal amount) {
        this.name = name;
        this.percent = percent;
        this.amount = amount.setScale(2, RoundingMode.HALF_UP);
    }

    public Category(String name, Float percent) {
        this.name = name;
        this.percent = percent;
        this.amount = salary.getSalary().multiply(BigDecimal.valueOf(percent)).setScale(2, RoundingMode.HALF_UP);
    }

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Float getPercent() {
        return percent;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount.setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (!id.equals(category.id)) return false;
        if (!name.equals(category.name)) return false;
        if (!percent.equals(category.percent)) return false;
        return amount != null ? amount.equals(category.amount) : category.amount == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + percent.hashCode();
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", percent=" + percent +
                ", amount=" + amount +
                '}';
    }
}

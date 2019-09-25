package MySavings.savings.dto;

import MySavings.savings.model.Salary;

import javax.persistence.*;
import java.math.BigDecimal;

public class CategoryDto {

    private Long id;
    private String name;
    private Float percent;
    private BigDecimal amount;
    Salary salary;

    public CategoryDto(Long id, String name, Float percent, BigDecimal amount) {
        this.id = id;
        this.name = name;
        this.percent = percent;
        this.amount = amount;
    }

    public CategoryDto(Long id, String name, Float percent) {
        this.id = id;
        this.name = name;
        this.percent = percent;
        this.amount = salary.getSalary()
                .multiply(BigDecimal.valueOf(percent));
    }

    public CategoryDto(String name, Float percent, BigDecimal amount) {
        this.name = name;
        this.percent = percent;
        this.amount = amount;
    }

    public CategoryDto(String name, Float percent) {
        this.name = name;
        this.percent = percent;
        this.amount = salary.getSalary()
                .multiply(BigDecimal.valueOf(percent));
    }

    public CategoryDto() {
    }

    public void setId(Long id) {
        this.id = id;
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
}

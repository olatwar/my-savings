package MySavings.savings.dto;

import MySavings.savings.model.Category;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ExpenseDto {

    private Long id;
    private String name;
    private BigDecimal cost;
    private Category category;

}

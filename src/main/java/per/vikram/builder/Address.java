package per.vikram.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Address {
    private String streetName;
    private String city;
    private Integer postCode;
}

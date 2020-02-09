package per.vikram.creational.builder;

import java.time.LocalDate;
import java.time.Period;

public class UserDTOBuilderConcrete implements UserDTOBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private UserDtoConcrete userDtoConcrete;
    @Override
    public UserDTOBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public UserDTOBuilder withDob(LocalDate localDate) {
        Period ageInYears = Period.between(localDate,LocalDate.now());
        age = ageInYears.getYears();
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = address.getStreetName()+", "+address.getCity()+", "+address.getPostCode();
        return this;
    }

    @Override
    public UserDTO build() {
        userDtoConcrete = new UserDtoConcrete(this.firstName+" "+this.lastName,address,age);
        return userDtoConcrete;
    }

    @Override
    public UserDTO getUserDTO() {
        return userDtoConcrete;
    }
}

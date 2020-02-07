package per.vikram.builder;

import java.time.LocalDate;

public interface UserDTOBuilder {
    UserDTOBuilder withFirstName(String firstName);
    UserDTOBuilder withLastName(String lastName);
    UserDTOBuilder withDob(LocalDate localDate);
    UserDTOBuilder withAddress(Address address);
    UserDTO build();
    UserDTO getUserDTO();
}

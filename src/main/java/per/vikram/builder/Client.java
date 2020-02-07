package per.vikram.builder;

import java.time.LocalDate;

public class Client {
    public void createUser() {

        UserDTO userDTO = new UserDTOBuilderConcrete()
                .withFirstName("John")
                .withLastName("Doe")
                .withDob(LocalDate.of(2000,05,8))
                .withAddress(new Address("Nice Street","New York",475128))
                .build();
        System.out.println(userDTO);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.createUser();
    }
}

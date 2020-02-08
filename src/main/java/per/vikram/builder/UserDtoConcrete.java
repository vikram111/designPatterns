package per.vikram.builder;

public class UserDtoConcrete implements UserDTO {
    private String name;
    private String address;
    private int age;

    public UserDtoConcrete(String name,String address,int age){
        this.age=age;
        this.address = address;
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.name+" lives at "+this.address+" and is "+this.age+" years old";
    }
}

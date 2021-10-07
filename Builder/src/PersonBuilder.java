public interface PersonBuilder {
    PersonBuilder setName(String name);
    PersonBuilder setMoney(int money);
    PersonBuilder setAge(int age);
    Person build();
}

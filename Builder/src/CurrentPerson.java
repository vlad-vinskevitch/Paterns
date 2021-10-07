public class CurrentPerson implements PersonBuilder{
    Person person = new Person();
    @Override
    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    @Override
    public PersonBuilder setMoney(int money) {
        person.money = money;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        person.age = age;
        return this;
    }

    @Override
    public Person build() {
        return person;
    }

}

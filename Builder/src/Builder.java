public class Builder {
    public static void main(String[] args) {
        Person builder = new CurrentPerson()
                .setAge(18)
                .setMoney(500)
                .build();
        builder.print();
    }
}

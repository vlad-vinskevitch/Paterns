public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cash cash = new Cash();
        cash.setStudent(new Student());


        Student student = cash.getStudent();
    }
}

public class Student implements Cloneable{
    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}

import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        Student student1= new Student("Giovannello","Giovannelli",null,3127897);
        Car car1=new Car("Hyunday","Tucson","GG000GG");
        student1.setCar(car1);
        System.out.println(student1);
        Rectangle rectangle1=new Rectangle(5F,12F);
        Triangle triangle1=new Triangle(2.2F,3.3F);
        System.out.println(rectangle1.calculateArea());
        System.out.println(triangle1.calculateArea());
    }
}
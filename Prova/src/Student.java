public class Student {
    private String name;
    private String surname;
    private Integer age;
    private Integer ID;
    private Car car;

    public Student(String name, String surname, Integer age, Integer ID) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        if (age == null) {
            return "[Student: " +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", ID=" + ID +
                    ", car=" + car +
                    ']';
        } else {
            return "[Student: " +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age=" + age +
                    ", ID=" + ID +
                    ", car=" + car +
                    ']';
        }
    }
}

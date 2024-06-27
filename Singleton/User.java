public class User {
    private String name;
    private int age;

    private User() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private static User user;

    public static User getUser() {
        if (user == null) {
            user = new User();
            user.setName("Vuoto");
        }
        return user;
    }

    public void printInfo(String name, int age) {
        System.out.println("The name's user is " + name +
                "\nThe user has " + age + " years\n");
    }
}

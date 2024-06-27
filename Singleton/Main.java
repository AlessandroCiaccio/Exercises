public class Main {


    public static void main(String[] args) {
        User user1 = User.getUser();
        User user2 = User.getUser();
//        user1.setName("Luca");
//        user1.setAge(51);
        user1.printInfo(user1.getName(), user1.getAge());

        user2.setName("Paolo");
        user2.setAge(49);
        user2.printInfo(user2.getName(), user2.getAge());
    }
}

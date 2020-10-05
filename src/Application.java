import java.time.LocalDate;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        User user1 = new User("Ion", "Saratean", 23, "ionsaratean@gmail.com", Status.ACTIVE, LocalDate.of(2020, 9, 15));
        User user2 = new User("Vasile", "Munteanu", 18, "vmunteanu@gmail.com", Status.NEW, LocalDate.of(2020, 10, 2));
        User user3 = new User("Mihai", "Duhlicher", 20, "duhlichermihai@gmail.com", Status.INACTIVE, LocalDate.of(2020, 8, 12));
        User user4 = new User("Dorin", "Malai", 22, "malaidorin@gmail.com", Status.BlOCKED, LocalDate.of(2020, 1, 3));
        User user5 = new User("Danu", "Raulet", 21, "danudanu@gmail.com", Status.NEW, LocalDate.of(2020, 10, 3));
        User user6 = new User("Georgel", "Postica", 20, "posticageorge@gmail.com", Status.NEW, LocalDate.of(2020, 9, 5));
        User user7 = new User("Gheorghe", "Izmana", 22, "izmana123@gmail.com", Status.INACTIVE, LocalDate.of(2020, 9, 1));
        User user8 = new User("Iacob", "Speianu", 22, "speianujacob@gmail.com", Status.INACTIVE, LocalDate.of(2020, 9, 6));
        User user9 = new User("Andries", "Calcatinge", 19, "calcandrei@gmail.com");
        User user10 = new User("Iuna", "Malinovschi", 21, "malinovschi@gmail.com");

        ArrayList<User> users = new ArrayList<>();

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user6);
        users.add(user7);
        users.add(user8);
        users.add(user9);
        users.add(user10);

        for (User user : users) {
            System.out.println(user);
        }

        System.out.println("\n.........Begin Status Update\n");

        setStatusToActive(users);
        setStatusToBlocked(users);

        for (User user : users) {
            System.out.println(user);
        }

    }

    public static void setStatusToActive(ArrayList<User> users) {
        var yesterday = LocalDate.now().minusDays(1);
        for (var s : users) {
            if (s.getTimestamp().isBefore(yesterday) && s.getStatus() == Status.NEW) {
                s.setStatus(Status.ACTIVE);
            }
        }
    }

    public static void setStatusToBlocked(ArrayList<User> users) {
        var monthago = LocalDate.now().minusMonths(1);
        for (var s : users) {
            if (s.getTimestamp().isBefore(monthago) && s.getStatus() == Status.INACTIVE) {
                s.setStatus(Status.BlOCKED);
            }
        }
    }


}
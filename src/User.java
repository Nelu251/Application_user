import java.time.LocalDate;

public class User {
    private String firstname;
    private String lastname;
    private int age;
    private String email;
    private Status status;
    private LocalDate timestamp;

    public User(String firstname, String lastname, int age, String email) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.status = Status.NEW;
        this.timestamp = LocalDate.now();
    }

    public User(String firstname, String lastname, int age, String email, Status status, LocalDate timestamp) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.status = status;
        this.timestamp = timestamp;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public Status getStatus() {
        return status;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }


    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", timestamp=" + timestamp +
                '}';
    }

}
import java.util.ArrayList;
import java.util.List;

class User {

    int id;
    String username;
    String email;

    User(int id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return id + " | " + username + " | " + email;
    }
}

public class UserAPI {

    static List<User> users = new ArrayList<>();

    // GET: получение всех пользователей
    public static void getUsers() {

        System.out.println("Список всех пользователей:");

        for (User user : users) {
            System.out.println(user);
        }
    }

    // POST: добавление пользователя
    public static void addUser(User user) {

        users.add(user);

        System.out.println("Пользователь успешно добавлен (201)");
    }

    // GET: поиск пользователя по ID
    public static void getUserById(int id) {

        for (User user : users) {

            if (user.id == id) {
                System.out.println("Пользователь найден: " + user);
                return;
            }
        }

        System.out.println("404: Пользователь не найден");
    }

    // PUT: обновление пользователя
    public static void updateUser(
            int id, String newName, String newEmail) {

        for (User user : users) {

            if (user.id == id) {

                user.username = newName;
                user.email = newEmail;

                System.out.println(
                        "Данные пользователя обновлены (200)");
                return;
            }
        }

        System.out.println("404: Пользователь не найден");
    }

    // DELETE: удаление пользователя
    public static void deleteUser(int id) {

        boolean removed = users.removeIf(
                user -> user.id == id);

        if (removed) {
            System.out.println(
                    "Пользователь успешно удален (204)");
        } else {
            System.out.println(
                    "404: Пользователь не найден");
        }
    }

    public static void main(String[] args) {

        addUser(new User(
                101, "shabayev", "user@example.com"));

        addUser(new User(
                102, "student", "student@example.com"));

        getUsers();

        getUserById(101);

        updateUser(
                101, "newuser", "new@example.com");

        deleteUser(102);

        getUsers();
    }
}
package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        final UserService userService = new UserServiceImpl();
        final User user1 = new User("Maksim", "Maksimov", (byte) 25);
        final User user2 = new User("Ivan", "Ivanov", (byte) 23);
        final User user3 = new User("Petr", "Petrov", (byte) 32);
        final User user4 = new User("Denis", "Denisov", (byte) 45);

        userService.createUsersTable();

        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());

        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());

        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());

        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());

        userService.removeUserById(2L);

        userService.getAllUsers();
        userService.cleanUsersTable();

        userService.dropUsersTable();
        userService.getAllUsers();

        Util.closeSessionFactory();
    }
}


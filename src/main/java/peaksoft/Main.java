package peaksoft;

import peaksoft.model.User;
import peaksoft.service.UserServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь

        UserServiceImpl userService = new UserServiceImpl();
//        userService.createUsersTable();
//
//
//        userService.saveUser("Dilbara","Asanalieva",(byte)19);
//        userService.saveUser("Chynara","Mamtalieva",(byte)34);
//        userService.saveUser("Aichurok","Turganbaeva",(byte)33);
//        userService.removeUserById(2);
//        System.out.println(userService.getAllUsers());
//        userService.cleanUsersTable();
//        userService.dropUsersTable();
        System.out.println(userService.existsByFirstName("Dilbara"));
    }
}



//
//    private final Connection connection;
//
//    public Main() throws SQLException {
//        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/project_db",
//                "postgres",
//                "postgresql22");
//    }
//    public Connection getConnection(){
//        return connection;
//    }
//}

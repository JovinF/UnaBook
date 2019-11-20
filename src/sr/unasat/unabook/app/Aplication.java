package sr.unasat.unabook.app;

import sr.unasat.unabook.services.AuthenticationService;
import sr.unasat.unabook.exceptions.ForbiddenException;
import sr.unasat.unabook.exceptions.InvalidCredentialsException;
import  sr.unasat.unabook.model.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Aplication {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<User>();
        User user  = new User(1, "rowell@unasat.sr", "123456", "Fortune", "Rowell", LocalDateTime.MAX);
        User user1 = new User(2, "jovin@unasat.sr", "123456", "Fransman", "Jovin", LocalDateTime.MAX);
        User user2 = new User(3, "dean@unasat.sr", "123456", "Alex", "Dean", LocalDateTime.MAX);
        userList.add(user);
        userList.add(user1);
        userList.add(user2);


        AuthenticationService  auth = new  AuthenticationService(userList);
try {
    auth.login("jovin@unasat.sr", "123456");
}catch (ForbiddenException| InvalidCredentialsException e) {
}
        auth.showLoggedInUsers();

}
    }





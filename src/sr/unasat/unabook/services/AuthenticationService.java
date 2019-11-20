package sr.unasat.unabook.services;
/*Import */
import java.util.ArrayList;
import java.util.List;
import sr.unasat.unabook.model.User;
import sr.unasat.unabook.exceptions.*;


public class AuthenticationService {
    List<User> loggedinusers = new ArrayList<User>();
    List<User> users = new ArrayList<User>();

    public AuthenticationService(List<User> userList) {
        this.users = userList;
    }

    public void login(String email, String password) throws ForbiddenException,InvalidCredentialsException{
        for (int index = 0; index < users.size(); index++) {

            try{
            if (users.get(index).getEmail().equals(email)) {
                if (users.get(index).getPassword().equals(password)) {
                    loggedinusers.add(users.get(index));
                    System.out.println("Hallo, welkom "+ users.get(index));
                }else {
                    throw new InvalidCredentialsException("Password incorrect");
                }
            }else{
                throw new ForbiddenException("De user bestaat niet");

            }

            }catch (Exception e){
                System.out.println(e);
            }


        }
    }

    public void showLoggedInUsers() {
        for (User user : loggedinusers) {
            System.out.println("LOGGED IN USERS: ");
            System.out.println(user);
        }
    }
}
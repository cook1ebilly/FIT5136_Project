package userinterface;

import controller.UserLoginController;
import entity.UserData;

import java.util.Scanner;


public class Userinterface {

    private UserLoginController userLoginController;
    private UserData userData;

    public void entry() {
        try {
            userData = login();
            System.out.println("login successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());

            //System.out.println("wrong password or username");
        } finally {
            if (null == userData) {
                entry();
            }
        }

    }

    private UserData login() throws Exception{

        UserLoginController userLoginController= new UserLoginController();
        Scanner userinput = new Scanner(System.in);
     System.out.println("enter your username");
     String username= userinput.next();
     System.out.println("enter your password");
     String password= userinput.next();

     return userLoginController.verifyAccount(username,password);








    }








}

package userinterface;

import controller.UserLoginController;
import entity.UserData;

import java.util.Scanner;

public class Userinterface {

    private UserLoginController userLoginController;
    private UserData userData;



    private UserData login() throws Exception{
        Scanner userinput = new Scanner(System.in);
     System.out.println("enter your username");
     String username= userinput.next();
     System.out.println("enter your password");
     String password= userinput.next();

     return userLoginController.verifyAccount(username,password);








    }








}

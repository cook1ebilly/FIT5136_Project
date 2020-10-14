package controller;

import entity.UserData;
import userinterface.Userinterface;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserLoginController {
    private UserData userData;
    private static final UserLoginController userLoginController = new UserLoginController();

    public List<UserData> loadAllUserData() {

        List<UserData> users = new ArrayList<>();
        File userCsvFile= new File("/Users/cook1e/IdeaProjects/FIT5136_Project/Bakeshop/src/resource/user.csv");

        try {
            BufferedReader userData = new BufferedReader(new FileReader(userCsvFile));
            userData.readLine();
            String userInfo = "";
            while ((userInfo = userData.readLine()) != null) {
                String[] userAttribute = userInfo.split(",");
                users.add(transferUserDataToObject(userAttribute));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return users;
    }
    private UserData transferUserDataToObject(String[] userInfo) {
        UserData user = new UserData();
        user.setUsername(userInfo[0]);
        user.setPassword(userInfo[1]);


        return user;
    }

    public UserData findUserBy(String username) throws Exception {
        List<UserData> users = loadAllUserData();
        UserData targetUser = null;

        for (UserData user : users) {
            if (username.equals(user.getUsername())) {
                targetUser = user;
                break;
            }
        }

        if (targetUser==null){
            throw new Exception("Username does not exit");
        }

        return targetUser;
    }

    public UserData verifyAccount(String username, String password) throws Exception{
        UserData user;

        user = findUserBy(username);

        if (!validUserPassword(user, password)) {
            throw new Exception("Password not right");
        }

        return user;


    }
    private boolean validUserPassword(UserData user, String password) {
        return user.getPassword().equals(password);
    }

}







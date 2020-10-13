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



    public UserData verifyAccount(String username, String password) throws Exception{
          List<UserData> users= new ArrayList<>();
          File userCsvFile= new File("/Users/cook1e/IdeaProjects/FIT5136_Project/Bakeshop/src/resource/user.csv");
          try{
              BufferedReader userdata = new BufferedReader(new FileReader(userCsvFile));
              userdata.readLine();
              String userInfo="";
              while ((userInfo=userdata.readLine())!=null){
                  String[] userAttr= userInfo.split(",");
                 System.out.println("userInfo");

              }



          } catch (IOException e) {
              e.printStackTrace();
          }










       return userData;

    }

}




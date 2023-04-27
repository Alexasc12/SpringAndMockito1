package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class UserDaoImpl implements UserDao{
    List<User> listUser;





    public UserDaoImpl(){
        this.listUser = Arrays.asList(
                new User( "Misha"),
                new User( "Kate")
        );

    }
    @Override
    public User getUserByName(String name) {
        for (User user : listUser){
            if(user.getName().equals(name)){
                return user;
            }
        }
        return null;

    }



    @Override
    public List< User>  findAllUsers(){
        return listUser;
    }



}
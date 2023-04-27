package org.example;

public class UserService {

    UserDaoImpl userDao;

    public UserService(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public boolean checkUserExist(User user){
        return userDao.getUserByName(user.getName()) != null;
    }



}
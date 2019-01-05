package com.neuedu;

import com.neuedu.service.IUserService;
import com.neuedu.service.UserServiceImpl;

public class Test {
    public static void main(String[] args) {
        IUserService userService = new UserServiceImpl();
        System.out.println(userService.getLists());
    }
}

package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mendy
 * @create 2023-06-28 16:12
 */

@Controller
public class UserController {

    // response page/jump to the page
    @RequestMapping("/toJumpPage")
    // Note
// 1. Do not add @ResponseBody here. If added, it will directly return "page.jsp" as a string to the frontend.
// 2. The method needs to return a String.
    public String toJumpPage(){
        System.out.println("Jump to Page");
        return "page.jsp";
    }


    //response text data
    @RequestMapping("/toText")
    @ResponseBody
    public String toText(){
        System.out.println("return pure text data");
        return "response pure text data";
    }


    //response POJO object
    @RequestMapping("/toJsonPOJO")
    @ResponseBody
    public User toJsonPOJO(){
        System.out.println("return json object data");
        User user = new User();
        user.setName("itcast");
        user.setAge(15);
        return user;
    }



    //response POJO collection object
    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        System.out.println("return json collection data");
        User user1 = new User();
        user1.setName("传智播客");
        user1.setAge(15);

        User user2 = new User();
        user2.setName("黑马程序员");
        user2.setAge(12);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

        return userList;
    }

}



package com.edward.QQZoneProject.controller;

import com.edward.QQZoneProject.pojo.Topic;
import com.edward.QQZoneProject.pojo.UserBasic;
import com.edward.QQZoneProject.servic.TopicService;
import com.edward.QQZoneProject.servic.UserBasicService;

import javax.servlet.http.HttpSession;
import java.util.List;

public class UserController {
    private UserBasicService userBasicService;
    private TopicService topicService;
    public  String login(String loginId, String pwd, HttpSession session){
        UserBasic userBasic=userBasicService.login(loginId,pwd);
        if (userBasic !=null){
            List<UserBasic> friendList =userBasicService.getFriendList(userBasic);
            List<Topic> topicList=topicService.getTopicList(userBasic);

            userBasic.setFriendList(friendList);
            userBasic.setTopicList(topicList);
            session.setAttribute("userBasic",userBasic);
            return "index";


        }else {
            return "login";
        }

    }
}

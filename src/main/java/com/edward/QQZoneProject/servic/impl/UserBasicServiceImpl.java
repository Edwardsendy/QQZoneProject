package com.edward.QQZoneProject.servic.impl;

import com.edward.QQZoneProject.dao.UserBasicDAO;
import com.edward.QQZoneProject.pojo.UserBasic;
import com.edward.QQZoneProject.servic.UserBasicService;

import java.util.ArrayList;
import java.util.List;

public class UserBasicServiceImpl implements UserBasicService {
    private UserBasicDAO userBasicDAO=null;
    @Override
    public UserBasic login(String loginId, String pwd) {
       UserBasic userBasic= userBasicDAO.getUserBasic(loginId,pwd);


        return userBasic;
    }

    @Override
    public List<UserBasic> getFriendList(UserBasic userBasic) {
        List<UserBasic> userBasicList=userBasicDAO.getUserBasicList(userBasic);
        List<UserBasic> friendList=new ArrayList<>(userBasicList.size());

        for (int i = 0; i <userBasicList.size() ; i++) {
            UserBasic friend=userBasicList.get(i);
            friend= userBasicDAO.getUserBasicById(friend.getId());
            friendList.add(friend);

        }
        return friendList;
    }
}

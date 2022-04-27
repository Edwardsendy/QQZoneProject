package com.edward.QQZoneProject.servic;

import com.edward.QQZoneProject.pojo.UserBasic;

import java.util.List;

public interface UserBasicService {
    UserBasic login(String loginId,String pwd);
    List<UserBasic> getFriendList(UserBasic userBasic);
}

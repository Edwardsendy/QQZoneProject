package com.edward.QQZoneProject.dao;

import com.edward.QQZoneProject.pojo.UserBasic;

import java.util.List;

public interface UserBasicDAO {

    public UserBasic getUserBasic(String loginid,String pwd);

    public List<UserBasic> getUserBasicList(UserBasic userBasic);

    UserBasic getUserBasicById(Integer id);
}

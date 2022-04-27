package com.edward.QQZoneProject.dao.impl;

import com.edward.QQZoneProject.dao.UserBasicDAO;
import com.edward.QQZoneProject.pojo.UserBasic;
import com.edward.myssm.basedao.BaseDAO;

import javax.jws.soap.SOAPBinding;
import java.util.List;

public class UserBasicDAOImpl extends BaseDAO<UserBasic> implements UserBasicDAO {
    @Override
    public UserBasic getUserBasic(String loginid, String pwd) {
        return super.load("select * from t_user_basic where loginId =? and pwd=?",loginid,pwd);
    }

    @Override
    public List<UserBasic> getUserBasicList(UserBasic userBasic) {
        String sql="select fid from t_friend where uid=? ";
        return super.executeQuery(sql,userBasic.getId());
    }

    @Override
    public UserBasic getUserBasicById(Integer id) {

        return super.load("select * from t_user_basic where id=?",id);
    }
}

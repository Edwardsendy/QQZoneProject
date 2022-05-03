package com.edward.QQZoneProject.dao.impl;

import com.edward.myssm.basedao.BaseDAO;
import com.edward.QQZoneProject.dao.HostReplyDAO;
import com.edward.QQZoneProject.pojo.HostReply;

public class HostReplyDAOImpl extends BaseDAO<HostReply> implements HostReplyDAO {
    @Override
    public HostReply getHostReplyByReplyId(Integer replyId) {
        return load("select * from t_host_reply where reply = ? " , replyId);
    }

    @Override
    public void delHostReply(Integer id) {
        super.executeUpdate("delete from t_host_reply where id = ? " , id) ;
    }
}

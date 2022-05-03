package com.edward.QQZoneProject.dao.impl;

import com.edward.myssm.basedao.BaseDAO;
import com.edward.QQZoneProject.dao.ReplyDAO;
import com.edward.QQZoneProject.pojo.Reply;
import com.edward.QQZoneProject.pojo.Topic;

import java.util.List;

public class ReplyDAOImpl extends BaseDAO<Reply> implements ReplyDAO {
    @Override
    public List<Reply> getReplyList(Topic topic) {
        return executeQuery("select * from t_reply where topic = ? " , topic.getId());
    }

    @Override
    public void addReply(Reply reply) {
        executeUpdate("insert into t_reply values(0,?,?,?,?)",reply.getContent(),reply.getReplyDate(),reply.getAuthor().getId() , reply.getTopic().getId()) ;
    }

    @Override
    public void delReply(Integer id) {
        executeUpdate("delete from t_reply where id = ? " , id) ;
    }

    @Override
    public Reply getReply(Integer id) {
        return load("select * from t_reply where id =? " , id);
    }
}

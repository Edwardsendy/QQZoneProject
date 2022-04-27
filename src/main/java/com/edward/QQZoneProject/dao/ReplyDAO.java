package com.edward.QQZoneProject.dao;

import com.edward.QQZoneProject.pojo.Reply;

import java.util.List;

public interface ReplyDAO {
    List<Reply> geReplyList();

    void addReply(Integer id);

    void delReply(Integer id);
}

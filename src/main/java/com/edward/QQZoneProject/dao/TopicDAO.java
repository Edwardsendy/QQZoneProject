package com.edward.QQZoneProject.dao;

import com.edward.QQZoneProject.pojo.Topic;
import com.edward.QQZoneProject.pojo.UserBasic;

import java.util.List;

public interface TopicDAO {

    public List<Topic> getTopicList(UserBasic userBasic);

    public void  addTopic(Topic topic);

    void delTopic(Topic topic);

    Topic getTopic();

}

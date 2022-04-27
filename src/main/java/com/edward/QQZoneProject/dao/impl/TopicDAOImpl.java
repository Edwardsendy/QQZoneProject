package com.edward.QQZoneProject.dao.impl;

import com.edward.QQZoneProject.dao.TopicDAO;
import com.edward.QQZoneProject.pojo.Topic;
import com.edward.QQZoneProject.pojo.UserBasic;
import com.edward.myssm.basedao.BaseDAO;

import java.util.List;

public class TopicDAOImpl extends BaseDAO<Topic> implements TopicDAO {
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return super.executeQuery("select * from t_topic where author =?",userBasic.getId());
    }

    @Override
    public void addTopic(Topic topic) {

    }

    @Override
    public void delTopic(Topic topic) {

    }

    @Override
    public Topic getTopic() {
        return null;
    }
}

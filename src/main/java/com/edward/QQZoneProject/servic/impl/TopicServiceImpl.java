package com.edward.QQZoneProject.servic.impl;

import com.edward.QQZoneProject.dao.TopicDAO;
import com.edward.QQZoneProject.pojo.Topic;
import com.edward.QQZoneProject.pojo.UserBasic;
import com.edward.QQZoneProject.servic.TopicService;

import java.util.List;

public class TopicServiceImpl implements TopicService {
    private TopicDAO topicDAO =null;
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return topicDAO.getTopicList(userBasic);
    }
}

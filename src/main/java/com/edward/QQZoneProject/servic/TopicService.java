package com.edward.QQZoneProject.servic;

import com.edward.QQZoneProject.pojo.Topic;
import com.edward.QQZoneProject.pojo.UserBasic;

import java.util.List;

public interface TopicService {
    List<Topic> getTopicList(UserBasic userBasic);

}

package com.edward.QQZoneProject.service;

import com.edward.QQZoneProject.pojo.HostReply;

public interface HostReplyService {
    HostReply getHostReplyByReplyId(Integer replyId);
    void delHostReply(Integer id);
}

package com.edward.QQZoneProject.service.impl;

import com.edward.QQZoneProject.dao.HostReplyDAO;
import com.edward.QQZoneProject.pojo.HostReply;
import com.edward.QQZoneProject.service.HostReplyService;

public class HostReplyServiceImpl implements HostReplyService {

    private HostReplyDAO hostReplyDAO ;

    @Override
    public HostReply getHostReplyByReplyId(Integer replyId) {
        return hostReplyDAO.getHostReplyByReplyId(replyId);
    }

    @Override
    public void delHostReply(Integer id) {
        hostReplyDAO.delHostReply(id);
    }
}

package com.ywkj.mapper;

import com.ywkj.pojo.QxyFlowProgressArchived;

public interface QxyFlowProgressArchivedMapper {
    int deleteByPrimaryKey(String id);

    int insert(QxyFlowProgressArchived record);

    int insertSelective(QxyFlowProgressArchived record);

    QxyFlowProgressArchived selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(QxyFlowProgressArchived record);

    int updateByPrimaryKey(QxyFlowProgressArchived record);
}
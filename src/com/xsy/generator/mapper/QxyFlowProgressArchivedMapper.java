package com.xsy.generator.mapper;

import com.xsy.generator.pojo.QxyFlowProgressArchived;

public interface QxyFlowProgressArchivedMapper {
    int deleteByPrimaryKey(String id);

    int insert(QxyFlowProgressArchived record);

    int insertSelective(QxyFlowProgressArchived record);

    QxyFlowProgressArchived selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(QxyFlowProgressArchived record);

    int updateByPrimaryKey(QxyFlowProgressArchived record);
}
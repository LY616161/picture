package com.so.picture.movie.mapper;

import com.so.picture.movie.entry.MsgLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MsgLogMapper {
    void insert(MsgLog msgLog);

    void updateStatus(MsgLog msgLog);

    List<MsgLog> selectTimeoutMsg();

    void updateTryCount(MsgLog msgLog);

    MsgLog selectByPrimaryKey(String msgId);
}

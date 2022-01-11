package com.cygs.gsweb.connectGachaUser.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cygs.gsweb.connectGachaUser.entity.ConnectGachaUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 赛勒一点也不努力
 */
@Repository
@Mapper
public interface ConnectGachaUserDao extends BaseMapper<ConnectGachaUserEntity> {
    List<ConnectGachaUserEntity> getUids();

    void insertUid(Integer uid);
}

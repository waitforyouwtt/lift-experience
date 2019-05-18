package com.yidiandian.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author: 一点点
 * @Date: 2019/5/18 0:43
 * @Version 1.0
 */
public interface DynamicsService {
    List<Map<String, Object>> selectByParam(String tableName);
    List<Map<String, Object>> selectByParam(String tableName,  String columnName , String columnParams);
}

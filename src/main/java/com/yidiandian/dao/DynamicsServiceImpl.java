package com.yidiandian.dao;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Map;

/**
 * @Author: 一点点
 * @Date: 2019/5/18 0:45
 * @Version 1.0
 */
@Service
public class DynamicsServiceImpl implements DynamicsService {

    @Autowired
    DynamicsDao dynamicsDao;

    @Override
    public List<Map<String, Object>> selectByParam(String tableName) {
        return null;
    }

    @Override
    public List<Map<String, Object>> selectByParam(String tableName, String columnName, String columnParams) {
        if (StringUtils.isBlank( tableName )){
            throw new RuntimeException( "表名不能为空" );
        }
      /*  if (StringUtils.isBlank(columnName)){
           return dynamicsDao.queryTable( tableName );
        }else{
            return dynamicsDao.selectByParam( tableName,columnName,columnParams );
        }*/
        return dynamicsDao.selectByParam( tableName,columnName,columnParams );
    }
}

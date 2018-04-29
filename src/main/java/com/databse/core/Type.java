package com.databse.core;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;

/**
 *数据库连接工具常量类
 */
public class Type {

    public final static Integer SUCESS_FULL = 0;//正确返回

    public final static Integer COLSE_ERROR = 1;//关闭异常返回

    public final static Integer INIT_ERROR  = 2;//初始化异常返回

    public final static Integer NULL_ERROR  = 3;//空指针异常返回

    public final static Integer SQL_SELECT_ERROR  = 4;//查询错误返回

    public final static Integer SQL_UPDATE_ERROR  = 5;//更新错误返回

    public final static Integer SQL_DELETE_ERROR  = 6;//删除错误返回

    public final static Integer SQL_INSERT_ERROE  = 7;//插入错误返回



    public final static Map<String,String> SQL_TYPE= new HashMap<String,String>(){
        {
            put("mysql","com.mysql.jdbc.Driver");
        }
    };
}

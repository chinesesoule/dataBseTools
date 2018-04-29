package com.databse.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Base {

    private Logger logger = LoggerFactory.getLogger(getClass());
    private Connection connection = null;
    protected String userName;
    protected String password;
    protected String url;
    protected String type;



    public Base(){}

    public Base(Connection connection){
        this.connection = connection;
    }


    protected void close(Connection connection, ResultSet resultSet, PreparedStatement preparedStatement){
        try {
                
            if(resultSet != null){
                resultSet.close();
                resultSet = null;
            }
            if(preparedStatement != null){
                preparedStatement.close();
                preparedStatement = null;
            }
            if(connection != null){
                connection.close();
                connection = null;
            }
            System.gc();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

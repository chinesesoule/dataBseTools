package com.databse.core.sql;

import com.databse.core.entity.Columns;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public interface DbDatabaseMetaData  {


    String getUserName();

    String getPasssword();

    String getDataBaseVersion();

    String getDataBaseUrl();

    String getDataBaseType();

    LinkedList<Columns> getColumns(String TableName);

    String getDriverName();

    String getDriveVersion();

    boolean isReadOnly();

    boolean supportsTransactions();
}

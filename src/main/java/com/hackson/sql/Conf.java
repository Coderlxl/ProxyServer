package com.hackson.sql;

/**
 * TIDB 的基本信息类
 * <p>
 * 注意：根据实际信息填写：TIDB_URL，TIDB_USER，TIDB_PASSWROD
 */
public class Conf {

    public final static String FLINK_DB_NAME = "hive.test_demo_db";

    //TODO
    public final static String TIDB_URL = "${ip}:${port}";

    //TODO
    public final static String TIDB_USER = "root";

    //TODO
    public final static String TIDB_PASSWROD = "";

    //TODO
    public static String HIVE_CONF_DIR = "/root/apache-hive-2.1.1-bin/conf";
}

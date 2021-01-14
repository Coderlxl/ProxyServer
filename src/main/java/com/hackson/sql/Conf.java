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
    public final static String TIDB_USER = "${user}";

    //TODO
    public final static String TIDB_PASSWROD = "${password}";

    //TODO
    public static String HIVE_CONF_DIR = "";
}

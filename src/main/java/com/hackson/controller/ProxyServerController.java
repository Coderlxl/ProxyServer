package com.hackson.controller;

import com.hackson.sql.SqlRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProxyServerController {

    private SqlRunner sqlRunner = new SqlRunner();

    @RequestMapping(value = "/proxy-server/status", method = RequestMethod.GET)
    public String status() {
        return "ok";
    }

    /**
     * @param sql: DDL SQL / Insert SQL
     * @return
     */
    @RequestMapping(value = "/proxy-server/ddlOrInsert", method = RequestMethod.POST)
    public String executeTiDBDDLSQL(boolean isHiveTable, String sql) {
        if (isHiveTable) {
            return sqlRunner.executeHiveSQL(sql);
        } else {
            return sqlRunner.executeSQL(sql);
        }
    }
    
    /**
     * @param sql Query SQL
     * @return
     */
    @RequestMapping(value = "/proxy-server/query", method = RequestMethod.POST)
    public String executeQuerySQL(String sql) {
        String result = sqlRunner.executeQuerySQL(sql);
        return result;
    }
}

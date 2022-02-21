package com.shville.entity;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


// 1. 定义数据模型封装yml中的指定数据
/** 2. 定义为spring管理的bean !! */
@Component

/** 3. 加载yml中指定数据 !! */
@ConfigurationProperties("datasource")
// @ConfigurationProperties(prefix = "datasource")
public class JdbcSource {

    private String driver;
    private String url;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "JdbcSource{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

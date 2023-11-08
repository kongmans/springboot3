//package com.kong.ssm.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.support.jakarta.StatViewServlet;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//import java.util.HashMap;
//
//@Configuration
//public class druidConfig {
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
////    @ConditionalOnProperty(name = "spring.datasource.type", havingValue = "com.alibaba.druid.pool.DruidDataSource")
//    public DataSource dataSource(){
//        return  new DruidDataSource();
//    }
//
//
//    @Bean
//    public ServletRegistrationBean servletRegistrationBean(){
//        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet());
//        HashMap<Object, Object> initParamaters = new HashMap<>();
//        initParamaters.put("loginUsername","admin");
//        initParamaters.put("loginPassword","123456");
//
//        initParamaters.put("allow","");
////        initParamaters.put("zhangsan","127.0.0.1");
//
//
//
//        return bean;
//
//    }
//
//
//
////
//
//
//}

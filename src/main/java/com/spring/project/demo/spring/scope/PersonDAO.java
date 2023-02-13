package com.spring.project.demo.spring.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PersonDAO {
    @Autowired
    jdbcConnection jdbcConnection;

    public com.spring.project.demo.spring.scope.jdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(com.spring.project.demo.spring.scope.jdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}

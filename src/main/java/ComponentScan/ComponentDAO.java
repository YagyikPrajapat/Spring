package ComponentScan;

import com.spring.project.demo.spring.scope.jdbcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentDAO {
    @Autowired
    ComponentScan.ComponentJdbcConnection jdbcConnection;

    public ComponentScan.ComponentJdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }

    public void setJdbcConnection(ComponentScan.ComponentJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }
}

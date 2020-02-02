package io.pivotal.pal.tracker;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class PalTrackerApplication {


      @Bean
      public  TimeEntryRepository timeEntryRepository(){
          return new JdbcTimeEntryRepository(mysqlDataSource());
          }


    @Bean
    public DriverManagerDataSource mysqlDataSource() {
       DriverManagerDataSource dataSource = new DriverManagerDataSource();
       dataSource.setUrl(System.getenv("SPRING_DATASOURCE_URL"));


        return dataSource;
    }
    public static void main(String[] args) {
        SpringApplication.run(PalTrackerApplication.class, args);
    }
}
package com.oracle.java.databaseappservice;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Configuration {
	
	@Bean
	  public DataSource dataSource() {
	      DriverManagerDataSource ds = new DriverManagerDataSource();
	      ds.setDriverClassName(oracle.jdbc.driver.OracleDriver.class.getName());
	      String path = System.getProperty("user.dir").replace('\\','/')+"/src/main/resources/Wallet_DWDEV";
	       ds.setUrl("jdbc:oracle:thin:@dwdev_high?TNS_ADMIN=" + path);
	      ds.setUsername("QUEST");
	      ds.setPassword("L029K2#@eajk");
	      return ds;
	  }

}

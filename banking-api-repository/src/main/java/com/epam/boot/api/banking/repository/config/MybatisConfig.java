package com.epam.boot.api.banking.repository.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

@Configuration
public class MybatisConfig {

    @Autowired
    DataSource dataSource;

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() {
       SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
       sqlSessionFactoryBean.setDataSource(dataSource);
       sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(
                "SqlMapConfig.xml"));
        sqlSessionFactoryBean.setMapperLocations(new ClassPathResource("sqlmaps/Account.xml"));
       return sqlSessionFactoryBean;
  }

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}

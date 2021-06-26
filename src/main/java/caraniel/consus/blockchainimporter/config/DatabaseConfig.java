package caraniel.consus.blockchainimporter.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:consus/config/database.properties")
public class DatabaseConfig
{
  @Value("${database.driverClassName}")
  private String dbDriverClass;
  @Value("${database.url}")
  private String dbUrl;
  @Value("${database.username}")
  private String dbUser;
  @Value("${database.password}")
  private String dbPwd;

  @Bean
  public DataSource dataSource()
  {
    BasicDataSource ds = new BasicDataSource();
    ds.setDriverClassName(dbDriverClass);
    ds.setUrl(dbUrl);
    ds.setUsername(dbUser);
    ds.setPassword(dbPwd);
    return ds;
  }

  @Bean
  public static PropertySourcesPlaceholderConfigurer propertyConfigInDev()
  {
    return new PropertySourcesPlaceholderConfigurer();
  }
}

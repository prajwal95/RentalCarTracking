package prajwal.rentTrack;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class JPAConfig 
{

@Bean

public LocalContainerEntityManagerFactoryBean emf()
{
	
	LocalContainerEntityManagerFactoryBean emf=new LocalContainerEntityManagerFactoryBean();
	
	emf.setDataSource(getDataSource());
	
	emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
	
	emf.setPackagesToScan("prajwal.rentTrack.entity");
	
	
	
	Properties prop=new Properties();
	prop.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
	prop.put("hibernate.hbm2ddl.auto", "validate");
	prop.put("hibernate.show_sql", "true");
	
	emf.setJpaProperties(prop);
	
	return emf;
	
}

@Bean
public DataSource getDataSource()
{
	DriverManagerDataSource ds=new DriverManagerDataSource();
	ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	ds.setUrl("jdbc:mysql://localhost:3306/java_new");
	ds.setUsername("root");
	ds.setPassword("1234");
	
	return ds;
}

@Bean
public PlatformTransactionManager txnManager(EntityManagerFactory emf)
{
	JpaTransactionManager txn=new JpaTransactionManager(emf);
	return txn;
}


}

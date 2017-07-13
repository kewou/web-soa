package com.beezy.websoa.config;

import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Configuration
@EnableWebMvc
@ComponentScan("com.beezy.websoa")
@EnableTransactionManagement
public class ApplicationContext extends WebMvcConfigurerAdapter{
	
	
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver multipartResolver() {	    
	    CommonsMultipartResolver multipartResolver 
	            = new CommonsMultipartResolver();
	    return multipartResolver;
	}
    

	@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolver =  new InternalResourceViewResolver();		
		viewResolver.setPrefix("/WEB-INF/vues/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }
	
	@Bean
	public ReloadableResourceBundleMessageSource getMessageSource(){
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("classpath:messages");
		messageSource.setDefaultEncoding("UTF-8");
		return messageSource;
	}
	
	@Bean
	public BasicDataSource getDataSource(){
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/postgres");
		dataSource.setUsername("postgres");
		dataSource.setPassword("beezyAdmin");
		return dataSource;
	}
	
	
    @Bean
    public LocalSessionFactoryBean sessionFactory() {
    	LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
    	sessionFactory.setDataSource(getDataSource());
    	sessionFactory.setPackagesToScan(new String[] { "com.beezy.websoa.data.entities" });
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.dialect","org.hibernate.dialect.PostgreSQLDialect");
		hibernateProperties.put("hibernate.show_sql", "true");
        sessionFactory.setHibernateProperties(hibernateProperties);   
        return sessionFactory;
    } 
    
    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        MappingJackson2HttpMessageConverter converter = 
            new MappingJackson2HttpMessageConverter(mapper);
        return converter;
    } 
	
	
//   @Bean
//   @Autowired
//   public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {	  
//      HibernateTransactionManager txManager= new HibernateTransactionManager();
//      txManager.setSessionFactory(sessionFactory);	 
//      return txManager;
//   }
//   
   @Bean
   public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
      return new PersistenceExceptionTranslationPostProcessor();
   }
	
}
	

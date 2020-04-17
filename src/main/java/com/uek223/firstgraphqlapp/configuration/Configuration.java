package com.uek223.firstgraphqlapp.configuration;

import org.apache.tomcat.util.file.ConfigurationSource;
import org.neo4j.driver.internal.SessionFactory;
import org.springframework.context.annotation.Bean;

public class Configuration {

    /*
    @Bean
    public org.neo4j.ogm.config.Configuration configuration() {
        ConfigurationSource properties = new ClasspathConfigurationSource("db.properties");
        return new org.neo4j.ogm.config.Configuration.Builder(properties).build();
    }


    @Bean
    public SessionFactory sessionFactory() {
        return new SessionFactory(configuration(), domainmodels );
    }

     */
}

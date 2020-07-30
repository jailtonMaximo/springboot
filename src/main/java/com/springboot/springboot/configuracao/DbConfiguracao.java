package com.springboot.springboot.configuracao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DbConfiguracao {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String testeDataBaseConexao(){
        System.out.println("Conexo 1");
        System.out.println(driverClassName);
        System.out.println(url);
		return "Conexao 1";
    }
    
    @Profile("prod")
    @Bean
    public String producaoDataBaseConexao(){
        System.out.println("Conexo 1");
        System.out.println(driverClassName);
        System.out.println(url);
		return "Conexao 1";
    }

}

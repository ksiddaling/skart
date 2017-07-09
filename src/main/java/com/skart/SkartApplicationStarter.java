package com.skart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.skart.config.AuthorizationServerConfiguration;
import com.skart.config.EmbeddedTomcatWithSSLConfiguration;
import com.skart.config.JNDIConfig;
import com.skart.config.MethodSecurityConfig;
import com.skart.config.OAuth2SecurityConfiguration;
import com.skart.config.ResourceServerConfiguration;

@Import({ JNDIConfig.class, ResourceServerConfiguration.class, AuthorizationServerConfiguration.class, OAuth2SecurityConfiguration.class, MethodSecurityConfig.class })
@SpringBootApplication
public class SkartApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(SkartApplicationStarter.class, args);
	}

}

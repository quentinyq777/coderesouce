package com.sany.conf;

/**
 * 
 * @ClassName: WebConfiguration
 * @Description: 
 * @Author 于群
 * @DateTime 2018年11月12日 下午4:36:40
 * 
 * 
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
 
public class WebConfiguration {
	
}
/*
@Configuration
public class WebConfiguration {
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.setMaxAge(3600l);
        return corsConfiguration;
    }
 
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		// 配置所有请求
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }
}

/*import java.io.Serializable;

//@Configuration
//@EnableRedisHttpSession(maxInactiveIntervalInSeconds= 3600,redisNamespace = "1")
public class RedisSessionConfig implements Serializable{
	private static final long serialVersionUID = 1L;
	
}*/

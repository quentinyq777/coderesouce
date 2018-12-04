package com.sany.conf;

/**
 * 
 * @ClassName: WebConfiguration
 * @Description: 允许跨域
 * @Author 于群
 * @DateTime 2018年11月12日 下午4:36:40
 * 
 */
public class WebConfiguration {}
/*@Configuration
public class WebConfiguration {
	
    private CorsConfiguration buildConfig() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        return corsConfiguration;
    }
 
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		// 配置所有请求
        source.registerCorsConfiguration("/**", buildConfig());
        return new CorsFilter(source);
    }
    
    
}*/

package top.lance.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import top.lance.handler.JsonAuthenticationFailureHandler;
import top.lance.handler.JsonAuthenticationSuccessHandler;

/**
 * @author： Lance
 * @create： 2024/11/14
 * @Description MySecurityConfig
 **/
@Configuration
@EnableWebSecurity
public class MySecurityConfig {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        // 配置所有的Http请求必须认证
        http.authorizeHttpRequests()
                .requestMatchers("/login.html").permitAll()
                .anyRequest().authenticated();
        http.formLogin()
                // 自定义登录处理 URL
                .loginProcessingUrl("/custom/login")
                //自定义用户名参数名称
                .usernameParameter("name")
                //自定义密码参数名称
                .passwordParameter("pass")
                .successHandler(new JsonAuthenticationSuccessHandler())
                .failureHandler(new JsonAuthenticationFailureHandler());
        // 开启Basic认证
        http.httpBasic();
        // 关闭CSRF
        http.csrf().disable();
        return http.build();
    }

}
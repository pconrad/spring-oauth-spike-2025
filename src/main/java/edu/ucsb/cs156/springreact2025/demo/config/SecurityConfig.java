package edu.ucsb.cs156.springreact2025.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // Allow the home page ("/") to be accessed without authentication
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/login","/error").permitAll()  // Home page is unsecured
                .anyRequest().authenticated()    // Require authentication for all other requests
            )
            // Enable form-based login using a customizer
            .formLogin(form -> form
                .permitAll()           // Allow all to access the login page
            )
            // Enable logout functionality
            .logout(logout -> logout
                .permitAll() // Allow all to access logout
                .logoutUrl("/logout") // Specify logout URL (default is /logout)
                .logoutSuccessUrl("/") // Redirect to home after logout
            );

        return http.build();
    }
}



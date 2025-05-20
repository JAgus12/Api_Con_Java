package api.rest.app.biblioteca.Jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import api.rest.app.biblioteca.Jwt.model.JwtAuthenticationFilter;


@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    private final JwtAuthenticationFilter jwtAuthenticationFilter;
    private final AuthenticationProvider authProvider;

    
    public SecurityConfig(JwtAuthenticationFilter jwtAuthenticationFilter, AuthenticationProvider authProvider) {
        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
        this.authProvider = authProvider;
    }



    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
    {
        return http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(authRequest ->
            authRequest
                .requestMatchers("/auth/**").permitAll()
                .requestMatchers("/api/usuarios/**").hasRole("ADMIN")
                .requestMatchers(HttpMethod.GET,"/api/libros/**").hasAnyRole("ADMIN","USER")
                .requestMatchers("/api/libros/**").hasRole("ADMIN")
                .anyRequest().authenticated()
            )
            .sessionManagement(sessionManager -> 
               sessionManager
                    .sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .authenticationProvider(authProvider)
            .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
            .build();
    }


}

package sistema.contable.SistemC.seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import sistema.contable.SistemC.servicios.usuarios.UsuariosServicio;

/**
 *
 * @author juank
 */
@Configuration
@EnableWebSecurity
public class Securityapp extends WebSecurityConfigurerAdapter 
{
    @Autowired
    private UsuariosServicio usuariosServicio;

    /*@Bean
    public BCryptPasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider()
    {
        DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
        auth.setUserDetailsService(usuariosServicio);
        auth.setPasswordEncoder(passwordEncoder());
        return auth;
    }
    
    protected void configure(AuthenticationManagerBuilder auth)throws Exception
    {
        auth.authenticationProvider(authenticationProvider());
    } */
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception 
    {
        UserBuilder usuarios = User.withDefaultPasswordEncoder();
        
        auth.inMemoryAuthentication()
                .withUser(usuarios.username("juan").password("123").roles("aux","admin"))
                .withUser(usuarios.username("ana").password("124").roles("aux"));
               
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception 
    {
               //http.authorizeRequests().anyRequest().authenticated()
               http.authorizeRequests()
               .antMatchers("/").hasRole("aux")//permiso a pagina inicio
               .antMatchers("/adminautenticado/**").hasRole("admin")//permiso a pagina adicionar
                       
               .and()
               .formLogin()
               .loginPage("/milogin")
               .loginProcessingUrl("/usuarioautenticado")
               .permitAll()
               .and()
               .logout()
               //.logoutSuccessUrl("/milogin?logout")        
               .permitAll()
               .and()
               .exceptionHandling().accessDeniedPage("/acceso_denegado");
                   
    }
    
    
       
}

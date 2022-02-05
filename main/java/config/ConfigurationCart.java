package config;

import data.DataCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class ConfigurationCart {

    @Bean
    @SessionScope
    public DataCart createNewCart() {
        return new DataCart(itemId);
    }
}

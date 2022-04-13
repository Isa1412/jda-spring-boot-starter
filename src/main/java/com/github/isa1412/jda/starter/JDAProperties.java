package com.github.isa1412.jda.starter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties for autoconfiguration JDA.
 */
@Data
@ConfigurationProperties(prefix = "spring.jda")
public class JDAProperties {

    private String token;

}

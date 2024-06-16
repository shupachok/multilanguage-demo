package com.sp.multilanguagedemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;

@Configuration
public class LocaleResolverConfig {

  @Bean
  public LocaleResolver localeResolver() {
    return new PathVariableLocaleResolver("language"); // Customize "language" to your path variable name
  }
}
package com.sp.multilanguagedemo.configuration;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.LocaleResolver;

import java.util.Locale;

public class PathVariableLocaleResolver implements LocaleResolver {

  private final String pathVariableName;

  public PathVariableLocaleResolver(String pathVariableName) {
    this.pathVariableName = pathVariableName;
  }

  @Override
  public Locale resolveLocale(HttpServletRequest request) {
    String localeString = ((HttpServletRequest) request).getAttribute(pathVariableName).toString();

    if (localeString != null) {
      try {
        return Locale.forLanguageTag(localeString);
      } catch (IllegalArgumentException e) {
        // Handle invalid locale format (optional: log or return default)
      }
    }
    return Locale.getDefault(); // Fallback to default locale
  }

  @Override
  public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

  }
}
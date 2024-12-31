package net.ow.movie.tmdb.config;

import net.ow.shared.propertyutils.factory.YAMLPropertySourceFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:application-tmdb.yml", factory = YAMLPropertySourceFactory.class)
public class TMDBConfig {}

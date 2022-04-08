package com.test.project.config;

import org.mapstruct.MapperConfig;
import org.mapstruct.NullValueMappingStrategy;

/**
 * Mapper config.
 */
@MapperConfig(componentModel = "spring", nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT)
public interface SpringMapperConfig {
}

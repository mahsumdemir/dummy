package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nameProjection", types = {Person.class})
public interface NameProjection {
    String getName();
}

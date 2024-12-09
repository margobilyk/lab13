package ua.ucu.edu.apps.task3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.ToString;

@Data @ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Company {
    private String name;
    private String description;
}

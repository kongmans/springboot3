package com.kong.boot.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
//@JacksonXmlRootElement
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private long    id;
    private String  name;
    private Integer age;
    private String  email;
    private String  role;

}

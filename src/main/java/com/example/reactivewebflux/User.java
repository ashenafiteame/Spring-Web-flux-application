package com.example.reactivewebflux;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id","name","department"})
@ToString
@Document(value = "users")
public class User {
    @Id
    private String id;
    private String name;
    private int age;
    private double salary;
    private String department;
}

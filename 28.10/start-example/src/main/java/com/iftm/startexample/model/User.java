package com.iftm.startexample.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Data
@Document(collection = "user")
public class User {
    @Id // Use @MongoId(targetType = FieldType.OBJECT_ID) if needed
    private ObjectId id;

    @Field("name")
    private String name;

    private int age;

    private Address address;

    public User() {
    }

    public User(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // The @Data annotation handles the generation of getters, setters, 
    // equals, hashCode, and toString methods
}

package com.sungp.elasticsearch.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.GeoPointField;

/**
 * @author sungp
 * @description: TODO
 * @date 2022年11月01日 11:53
 */
@Data
@Document(indexName = "index_user")
public class User {

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    @Id
    private Long id;

    @Field(type = FieldType.Text , analyzer = "")
    private String name;
    @Transient
    private String sex;

    private Integer age;
    @GeoPointField
    private String desc;

}

package com.pjqdyd.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * 用户实体类
 */
//@Document(collection = "xx_user") //指定集合的名字
@Data
public class User {

    @Id
    private long id;

    private String userName;

    private Integer age;

}

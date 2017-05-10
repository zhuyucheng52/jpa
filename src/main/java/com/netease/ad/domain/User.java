package com.netease.ad.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by echo on 17-5-10.
 */
@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Long addressId;

    @Column
    private String name;

    @Column
    private Integer age;
}

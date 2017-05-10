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
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String description;
}

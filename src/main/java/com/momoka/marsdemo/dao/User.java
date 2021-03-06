package com.momoka.marsdemo.dao;

import java.io.Serializable;

import lombok.*;

/**
 * user
 * @author 
 */
@Data
public class User implements Serializable {
    private Long id;

    private String name;

    private String passwd;

    private static final long serialVersionUID = 1L;

}
package com.qf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @version 1.0
 * @user cgc
 * @date 2019/6/30 22:49
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Email implements Serializable {
    private Integer id;
    private String emailname;
}

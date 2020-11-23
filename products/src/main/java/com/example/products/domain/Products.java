package com.example.products.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * t_products
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products implements Serializable {
    private Integer pid;

    private String productName;

    private String productDesc;

    private Integer inventory;

    private static final long serialVersionUID = 1L;
}
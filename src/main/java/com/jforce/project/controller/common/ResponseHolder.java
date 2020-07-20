package com.jforce.project.controller.common;

import lombok.*;

import java.io.Serializable;

/**
 * @author Iraz Şanlı
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResponseHolder<T> implements Serializable {
    private T responseData;
}
package com.taboola.backstage.model;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

/**
 * Created by vladi.m
 * Date 03/10/2018
 * Time 16:21
 * Copyright Taboola
 */
public enum DayOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY,
    @JsonEnumDefaultValue UNSUPPORTED_BY_SDK_VALUE
}

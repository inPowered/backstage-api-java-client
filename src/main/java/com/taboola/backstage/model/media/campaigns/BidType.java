package com.taboola.backstage.model.media.campaigns;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

/**
 * Created by vladi.m
 * Date 03/10/2018
 * Time 12:01
 * Copyright Taboola
 */
public enum BidType {
    FIXED,
    OPTIMIZED_CONVERSIONS,
    @Deprecated OPTIMIZED_PAGEVIEWS,
    @JsonEnumDefaultValue UNSUPPORTED_BY_SDK_VALUE
}

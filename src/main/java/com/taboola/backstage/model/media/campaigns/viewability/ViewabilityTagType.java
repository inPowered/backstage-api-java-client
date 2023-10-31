package com.taboola.backstage.model.media.campaigns.viewability;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

/**
 * Created by vladi.m
 * Date 16/04/2020
 * Time 13
 * Copyright Taboola
 */
public enum ViewabilityTagType {
    MOAT,
    IAS,
    GOOGLE_DCM,
    DOUBLE_VERIFY,
    UNKNOWN,
    @JsonEnumDefaultValue UNSUPPORTED_BY_SDK_VALUE
}

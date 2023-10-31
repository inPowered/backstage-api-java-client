package com.taboola.backstage.model.media.campaigns.scheduling;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

/**
 * <p>
 *    <br>⚫ INCLUDE - Only supplied values will activate campaign
 *    <br>⚫ EXCLUDE - All values should activate campaign other than the supplied values.
 * </p>
 *
 * Created by vladi.m
 * Date 03/10/2018
 * Time 16:15
 * Copyright Taboola
 */
public enum SchedulingItemType {
    INCLUDE,
    EXCLUDE,
    @JsonEnumDefaultValue UNSUPPORTED_BY_SDK_VALUE
}

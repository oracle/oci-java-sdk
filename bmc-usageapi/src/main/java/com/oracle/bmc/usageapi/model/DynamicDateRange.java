/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The saved dynamic date range (Required when staticDateRange is missing).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DynamicDateRange.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "dateRangeType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DynamicDateRange extends DateRange {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dynamicDateRangeType")
        private DynamicDateRangeType dynamicDateRangeType;

        public Builder dynamicDateRangeType(DynamicDateRangeType dynamicDateRangeType) {
            this.dynamicDateRangeType = dynamicDateRangeType;
            this.__explicitlySet__.add("dynamicDateRangeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DynamicDateRange build() {
            DynamicDateRange __instance__ = new DynamicDateRange(dynamicDateRangeType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DynamicDateRange o) {
            Builder copiedBuilder = dynamicDateRangeType(o.getDynamicDateRangeType());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public DynamicDateRange(DynamicDateRangeType dynamicDateRangeType) {
        super();
        this.dynamicDateRangeType = dynamicDateRangeType;
    }

    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DynamicDateRangeType {
        Last7Days("LAST_7_DAYS"),
        LastCalendarWeek("LAST_CALENDAR_WEEK"),
        LastCalendarMonth("LAST_CALENDAR_MONTH"),
        Last30Days("LAST_30_DAYS"),
        MonthToDate("MONTH_TO_DATE"),
        LastYear("LAST_YEAR"),
        YearTodate("YEAR_TODATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, DynamicDateRangeType> map;

        static {
            map = new java.util.HashMap<>();
            for (DynamicDateRangeType v : DynamicDateRangeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DynamicDateRangeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DynamicDateRangeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DynamicDateRangeType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("dynamicDateRangeType")
    DynamicDateRangeType dynamicDateRangeType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

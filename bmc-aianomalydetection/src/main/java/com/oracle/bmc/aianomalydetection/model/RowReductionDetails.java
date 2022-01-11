/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * Information regarding how/what row reduction methods will be applied. If this property is not present or is null, then it means row reduction is not applied.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RowReductionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RowReductionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isReductionEnabled")
        private Boolean isReductionEnabled;

        public Builder isReductionEnabled(Boolean isReductionEnabled) {
            this.isReductionEnabled = isReductionEnabled;
            this.__explicitlySet__.add("isReductionEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reductionPercentage")
        private Double reductionPercentage;

        public Builder reductionPercentage(Double reductionPercentage) {
            this.reductionPercentage = reductionPercentage;
            this.__explicitlySet__.add("reductionPercentage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reductionMethod")
        private ReductionMethod reductionMethod;

        public Builder reductionMethod(ReductionMethod reductionMethod) {
            this.reductionMethod = reductionMethod;
            this.__explicitlySet__.add("reductionMethod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RowReductionDetails build() {
            RowReductionDetails __instance__ =
                    new RowReductionDetails(
                            isReductionEnabled, reductionPercentage, reductionMethod);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RowReductionDetails o) {
            Builder copiedBuilder =
                    isReductionEnabled(o.getIsReductionEnabled())
                            .reductionPercentage(o.getReductionPercentage())
                            .reductionMethod(o.getReductionMethod());

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

    /**
     * A boolean value to indicate if row reduction is applied
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReductionEnabled")
    Boolean isReductionEnabled;

    /**
     * A percentage to reduce data size down to on top of original data
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reductionPercentage")
    Double reductionPercentage;
    /**
     * Method for row reduction:
     *   * DELETE_ROW - delete rows with equal intervals
     *   * AVERAGE_ROW - average multiple rows to one row
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ReductionMethod {
        DeleteRow("DELETE_ROW"),
        AverageRow("AVERAGE_ROW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ReductionMethod> map;

        static {
            map = new java.util.HashMap<>();
            for (ReductionMethod v : ReductionMethod.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ReductionMethod(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReductionMethod create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ReductionMethod', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Method for row reduction:
     *   * DELETE_ROW - delete rows with equal intervals
     *   * AVERAGE_ROW - average multiple rows to one row
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reductionMethod")
    ReductionMethod reductionMethod;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

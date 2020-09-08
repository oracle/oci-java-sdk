/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Field value representing and entry in a list-of-values field.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FieldValue.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class FieldValue {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayValue")
        private String displayValue;

        public Builder displayValue(String displayValue) {
            this.displayValue = displayValue;
            this.__explicitlySet__.add("displayValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalValue")
        private Object internalValue;

        public Builder internalValue(Object internalValue) {
            this.internalValue = internalValue;
            this.__explicitlySet__.add("internalValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDeleted")
        private Boolean isDeleted;

        public Builder isDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            this.__explicitlySet__.add("isDeleted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FieldValue build() {
            FieldValue __instance__ = new FieldValue(displayValue, internalValue, isDeleted);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FieldValue o) {
            Builder copiedBuilder =
                    displayValue(o.getDisplayValue())
                            .internalValue(o.getInternalValue())
                            .isDeleted(o.getIsDeleted());

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
     * Display representation of the field value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayValue")
    String displayValue;

    /**
     * Internal representation of the field value.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalValue")
    Object internalValue;

    /**
     * Denotes if this list-of-values value has been marked as deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDeleted")
    Boolean isDeleted;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

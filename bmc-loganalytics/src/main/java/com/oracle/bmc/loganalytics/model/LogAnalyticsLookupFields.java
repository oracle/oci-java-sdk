/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsLookupFields
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsLookupFields.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsLookupFields {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("commonFieldName")
        private String commonFieldName;

        public Builder commonFieldName(String commonFieldName) {
            this.commonFieldName = commonFieldName;
            this.__explicitlySet__.add("commonFieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultMatchValue")
        private String defaultMatchValue;

        public Builder defaultMatchValue(String defaultMatchValue) {
            this.defaultMatchValue = defaultMatchValue;
            this.__explicitlySet__.add("defaultMatchValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCommonField")
        private Boolean isCommonField;

        public Builder isCommonField(Boolean isCommonField) {
            this.isCommonField = isCommonField;
            this.__explicitlySet__.add("isCommonField");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("matchOperator")
        private String matchOperator;

        public Builder matchOperator(String matchOperator) {
            this.matchOperator = matchOperator;
            this.__explicitlySet__.add("matchOperator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private Long position;

        public Builder position(Long position) {
            this.position = position;
            this.__explicitlySet__.add("position");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsLookupFields build() {
            LogAnalyticsLookupFields __instance__ =
                    new LogAnalyticsLookupFields(
                            commonFieldName,
                            defaultMatchValue,
                            displayName,
                            isCommonField,
                            matchOperator,
                            name,
                            position);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsLookupFields o) {
            Builder copiedBuilder =
                    commonFieldName(o.getCommonFieldName())
                            .defaultMatchValue(o.getDefaultMatchValue())
                            .displayName(o.getDisplayName())
                            .isCommonField(o.getIsCommonField())
                            .matchOperator(o.getMatchOperator())
                            .name(o.getName())
                            .position(o.getPosition());

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
     * The common field name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commonFieldName")
    String commonFieldName;

    /**
     * The default match value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultMatchValue")
    String defaultMatchValue;

    /**
     * The display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * A flag indicating whether or not the field is a common field.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCommonField")
    Boolean isCommonField;

    /**
     * The match operator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchOperator")
    String matchOperator;

    /**
     * The field name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The position.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    Long position;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

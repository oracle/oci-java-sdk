/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Property overrides at the scope of objects.
 * For example, if you want to use logSourceName as 'xyz' for all objects that conatins string 'abc/' then
 * define matchType as 'contains', matchValue as 'abc/', propertyName as 'logSourceName' and propertyValue as 'xyz'.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PropertyOverride.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class PropertyOverride {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("matchType")
        private String matchType;

        public Builder matchType(String matchType) {
            this.matchType = matchType;
            this.__explicitlySet__.add("matchType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("matchValue")
        private String matchValue;

        public Builder matchValue(String matchValue) {
            this.matchValue = matchValue;
            this.__explicitlySet__.add("matchValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("propertyName")
        private String propertyName;

        public Builder propertyName(String propertyName) {
            this.propertyName = propertyName;
            this.__explicitlySet__.add("propertyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("propertyValue")
        private String propertyValue;

        public Builder propertyValue(String propertyValue) {
            this.propertyValue = propertyValue;
            this.__explicitlySet__.add("propertyValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PropertyOverride build() {
            PropertyOverride __instance__ =
                    new PropertyOverride(matchType, matchValue, propertyName, propertyValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PropertyOverride o) {
            Builder copiedBuilder =
                    matchType(o.getMatchType())
                            .matchValue(o.getMatchValue())
                            .propertyName(o.getPropertyName())
                            .propertyValue(o.getPropertyValue());

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
     * Match Type. Accepted values are: contains
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchType")
    String matchType;

    /**
     * Match Value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchValue")
    String matchValue;

    /**
     * Property to override. Accepted values are: logSourceName, charEncoding.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("propertyName")
    String propertyName;

    /**
     * Value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("propertyValue")
    String propertyValue;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

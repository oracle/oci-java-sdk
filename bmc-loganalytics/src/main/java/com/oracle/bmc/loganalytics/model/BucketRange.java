/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Represents querylanguage bucket command input arguments in parse endpoint output.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BucketRange.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BucketRange {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("lower")
        private java.math.BigDecimal lower;

        public Builder lower(java.math.BigDecimal lower) {
            this.lower = lower;
            this.__explicitlySet__.add("lower");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("upper")
        private java.math.BigDecimal upper;

        public Builder upper(java.math.BigDecimal upper) {
            this.upper = upper;
            this.__explicitlySet__.add("upper");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("alias")
        private String alias;

        public Builder alias(String alias) {
            this.alias = alias;
            this.__explicitlySet__.add("alias");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BucketRange build() {
            BucketRange __instance__ = new BucketRange(lower, upper, alias);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BucketRange o) {
            Builder copiedBuilder = lower(o.getLower()).upper(o.getUpper()).alias(o.getAlias());

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
     * Lower bound of the bucket range specified in the querystring for the numeric field referenced in tbe bucket command.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lower")
    java.math.BigDecimal lower;

    /**
     * Upper bound of the bucket range specified in the querystring for the numeric field referenced in tbe bucket command.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upper")
    java.math.BigDecimal upper;

    /**
     * Optional alias of the bucket range if specified in the querystring.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    String alias;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

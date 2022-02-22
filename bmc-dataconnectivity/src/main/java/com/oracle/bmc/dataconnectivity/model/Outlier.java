/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * To capture all the Outlier details related to profiling
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Outlier.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Outlier {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("low")
        private String low;

        public Builder low(String low) {
            this.low = low;
            this.__explicitlySet__.add("low");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("high")
        private String high;

        public Builder high(String high) {
            this.high = high;
            this.__explicitlySet__.add("high");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lowCount")
        private String lowCount;

        public Builder lowCount(String lowCount) {
            this.lowCount = lowCount;
            this.__explicitlySet__.add("lowCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("highCount")
        private String highCount;

        public Builder highCount(String highCount) {
            this.highCount = highCount;
            this.__explicitlySet__.add("highCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Outlier build() {
            Outlier __instance__ = new Outlier(low, high, lowCount, highCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Outlier o) {
            Builder copiedBuilder =
                    low(o.getLow())
                            .high(o.getHigh())
                            .lowCount(o.getLowCount())
                            .highCount(o.getHighCount());

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
     * low value of outlier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("low")
    String low;

    /**
     * high value of outlier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("high")
    String high;

    /**
     * lowCount value of outlier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lowCount")
    String lowCount;

    /**
     * highCount value of outlier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("highCount")
    String highCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

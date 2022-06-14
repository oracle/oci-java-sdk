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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Outlier.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Outlier {
    @Deprecated
    @java.beans.ConstructorProperties({"low", "high", "lowCount", "highCount"})
    public Outlier(String low, String high, String lowCount, String highCount) {
        super();
        this.low = low;
        this.high = high;
        this.lowCount = lowCount;
        this.highCount = highCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * low value of outlier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("low")
        private String low;

        /**
         * low value of outlier
         * @param low the value to set
         * @return this builder
         **/
        public Builder low(String low) {
            this.low = low;
            this.__explicitlySet__.add("low");
            return this;
        }
        /**
         * high value of outlier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("high")
        private String high;

        /**
         * high value of outlier
         * @param high the value to set
         * @return this builder
         **/
        public Builder high(String high) {
            this.high = high;
            this.__explicitlySet__.add("high");
            return this;
        }
        /**
         * lowCount value of outlier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lowCount")
        private String lowCount;

        /**
         * lowCount value of outlier
         * @param lowCount the value to set
         * @return this builder
         **/
        public Builder lowCount(String lowCount) {
            this.lowCount = lowCount;
            this.__explicitlySet__.add("lowCount");
            return this;
        }
        /**
         * highCount value of outlier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("highCount")
        private String highCount;

        /**
         * highCount value of outlier
         * @param highCount the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * low value of outlier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("low")
    private final String low;

    /**
     * low value of outlier
     * @return the value
     **/
    public String getLow() {
        return low;
    }

    /**
     * high value of outlier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("high")
    private final String high;

    /**
     * high value of outlier
     * @return the value
     **/
    public String getHigh() {
        return high;
    }

    /**
     * lowCount value of outlier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lowCount")
    private final String lowCount;

    /**
     * lowCount value of outlier
     * @return the value
     **/
    public String getLowCount() {
        return lowCount;
    }

    /**
     * highCount value of outlier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("highCount")
    private final String highCount;

    /**
     * highCount value of outlier
     * @return the value
     **/
    public String getHighCount() {
        return highCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Outlier(");
        sb.append("low=").append(String.valueOf(this.low));
        sb.append(", high=").append(String.valueOf(this.high));
        sb.append(", lowCount=").append(String.valueOf(this.lowCount));
        sb.append(", highCount=").append(String.valueOf(this.highCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Outlier)) {
            return false;
        }

        Outlier other = (Outlier) o;
        return java.util.Objects.equals(this.low, other.low)
                && java.util.Objects.equals(this.high, other.high)
                && java.util.Objects.equals(this.lowCount, other.lowCount)
                && java.util.Objects.equals(this.highCount, other.highCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.low == null ? 43 : this.low.hashCode());
        result = (result * PRIME) + (this.high == null ? 43 : this.high.hashCode());
        result = (result * PRIME) + (this.lowCount == null ? 43 : this.lowCount.hashCode());
        result = (result * PRIME) + (this.highCount == null ? 43 : this.highCount.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}

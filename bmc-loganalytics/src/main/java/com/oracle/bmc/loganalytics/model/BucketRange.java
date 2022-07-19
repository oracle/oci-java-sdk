/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Represents querylanguage bucket command input arguments in parse output.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BucketRange.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BucketRange {
    @Deprecated
    @java.beans.ConstructorProperties({"lower", "upper", "alias"})
    public BucketRange(java.math.BigDecimal lower, java.math.BigDecimal upper, String alias) {
        super();
        this.lower = lower;
        this.upper = upper;
        this.alias = alias;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Lower bound of the bucket range specified in the querystring for the numeric field referenced in tbe bucket command.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lower")
        private java.math.BigDecimal lower;

        /**
         * Lower bound of the bucket range specified in the querystring for the numeric field referenced in tbe bucket command.
         *
         * @param lower the value to set
         * @return this builder
         **/
        public Builder lower(java.math.BigDecimal lower) {
            this.lower = lower;
            this.__explicitlySet__.add("lower");
            return this;
        }
        /**
         * Upper bound of the bucket range specified in the querystring for the numeric field referenced in tbe bucket command.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("upper")
        private java.math.BigDecimal upper;

        /**
         * Upper bound of the bucket range specified in the querystring for the numeric field referenced in tbe bucket command.
         *
         * @param upper the value to set
         * @return this builder
         **/
        public Builder upper(java.math.BigDecimal upper) {
            this.upper = upper;
            this.__explicitlySet__.add("upper");
            return this;
        }
        /**
         * Optional alias of the bucket range if specified in the querystring.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alias")
        private String alias;

        /**
         * Optional alias of the bucket range if specified in the querystring.
         *
         * @param alias the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Lower bound of the bucket range specified in the querystring for the numeric field referenced in tbe bucket command.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lower")
    private final java.math.BigDecimal lower;

    /**
     * Lower bound of the bucket range specified in the querystring for the numeric field referenced in tbe bucket command.
     *
     * @return the value
     **/
    public java.math.BigDecimal getLower() {
        return lower;
    }

    /**
     * Upper bound of the bucket range specified in the querystring for the numeric field referenced in tbe bucket command.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upper")
    private final java.math.BigDecimal upper;

    /**
     * Upper bound of the bucket range specified in the querystring for the numeric field referenced in tbe bucket command.
     *
     * @return the value
     **/
    public java.math.BigDecimal getUpper() {
        return upper;
    }

    /**
     * Optional alias of the bucket range if specified in the querystring.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    private final String alias;

    /**
     * Optional alias of the bucket range if specified in the querystring.
     *
     * @return the value
     **/
    public String getAlias() {
        return alias;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BucketRange(");
        sb.append("lower=").append(String.valueOf(this.lower));
        sb.append(", upper=").append(String.valueOf(this.upper));
        sb.append(", alias=").append(String.valueOf(this.alias));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BucketRange)) {
            return false;
        }

        BucketRange other = (BucketRange) o;
        return java.util.Objects.equals(this.lower, other.lower)
                && java.util.Objects.equals(this.upper, other.upper)
                && java.util.Objects.equals(this.alias, other.alias)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.lower == null ? 43 : this.lower.hashCode());
        result = (result * PRIME) + (this.upper == null ? 43 : this.upper.hashCode());
        result = (result * PRIME) + (this.alias == null ? 43 : this.alias.hashCode());
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

/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Represents querylanguage bucket command input arguments in parse output. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BucketRange.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BucketRange extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
         * Lower bound of the bucket range specified in the querystring for the numeric field
         * referenced in tbe bucket command.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lower")
        private java.math.BigDecimal lower;

        /**
         * Lower bound of the bucket range specified in the querystring for the numeric field
         * referenced in tbe bucket command.
         *
         * @param lower the value to set
         * @return this builder
         */
        public Builder lower(java.math.BigDecimal lower) {
            this.lower = lower;
            this.__explicitlySet__.add("lower");
            return this;
        }
        /**
         * Upper bound of the bucket range specified in the querystring for the numeric field
         * referenced in tbe bucket command.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("upper")
        private java.math.BigDecimal upper;

        /**
         * Upper bound of the bucket range specified in the querystring for the numeric field
         * referenced in tbe bucket command.
         *
         * @param upper the value to set
         * @return this builder
         */
        public Builder upper(java.math.BigDecimal upper) {
            this.upper = upper;
            this.__explicitlySet__.add("upper");
            return this;
        }
        /** Optional alias of the bucket range if specified in the querystring. */
        @com.fasterxml.jackson.annotation.JsonProperty("alias")
        private String alias;

        /**
         * Optional alias of the bucket range if specified in the querystring.
         *
         * @param alias the value to set
         * @return this builder
         */
        public Builder alias(String alias) {
            this.alias = alias;
            this.__explicitlySet__.add("alias");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BucketRange build() {
            BucketRange model = new BucketRange(this.lower, this.upper, this.alias);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BucketRange model) {
            if (model.wasPropertyExplicitlySet("lower")) {
                this.lower(model.getLower());
            }
            if (model.wasPropertyExplicitlySet("upper")) {
                this.upper(model.getUpper());
            }
            if (model.wasPropertyExplicitlySet("alias")) {
                this.alias(model.getAlias());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Lower bound of the bucket range specified in the querystring for the numeric field referenced
     * in tbe bucket command.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lower")
    private final java.math.BigDecimal lower;

    /**
     * Lower bound of the bucket range specified in the querystring for the numeric field referenced
     * in tbe bucket command.
     *
     * @return the value
     */
    public java.math.BigDecimal getLower() {
        return lower;
    }

    /**
     * Upper bound of the bucket range specified in the querystring for the numeric field referenced
     * in tbe bucket command.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("upper")
    private final java.math.BigDecimal upper;

    /**
     * Upper bound of the bucket range specified in the querystring for the numeric field referenced
     * in tbe bucket command.
     *
     * @return the value
     */
    public java.math.BigDecimal getUpper() {
        return upper;
    }

    /** Optional alias of the bucket range if specified in the querystring. */
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    private final String alias;

    /**
     * Optional alias of the bucket range if specified in the querystring.
     *
     * @return the value
     */
    public String getAlias() {
        return alias;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BucketRange(");
        sb.append("super=").append(super.toString());
        sb.append("lower=").append(String.valueOf(this.lower));
        sb.append(", upper=").append(String.valueOf(this.upper));
        sb.append(", alias=").append(String.valueOf(this.alias));
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.lower == null ? 43 : this.lower.hashCode());
        result = (result * PRIME) + (this.upper == null ? 43 : this.upper.hashCode());
        result = (result * PRIME) + (this.alias == null ? 43 : this.alias.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

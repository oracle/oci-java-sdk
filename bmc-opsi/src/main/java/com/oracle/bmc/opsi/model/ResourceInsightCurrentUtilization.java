/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Current utilization(High/low) for cpu or storage <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResourceInsightCurrentUtilization.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ResourceInsightCurrentUtilization
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"low", "high"})
    public ResourceInsightCurrentUtilization(
            java.util.List<String> low, java.util.List<String> high) {
        super();
        this.low = low;
        this.high = high;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of db ids with low usage */
        @com.fasterxml.jackson.annotation.JsonProperty("low")
        private java.util.List<String> low;

        /**
         * List of db ids with low usage
         *
         * @param low the value to set
         * @return this builder
         */
        public Builder low(java.util.List<String> low) {
            this.low = low;
            this.__explicitlySet__.add("low");
            return this;
        }
        /** List of db ids with high usage */
        @com.fasterxml.jackson.annotation.JsonProperty("high")
        private java.util.List<String> high;

        /**
         * List of db ids with high usage
         *
         * @param high the value to set
         * @return this builder
         */
        public Builder high(java.util.List<String> high) {
            this.high = high;
            this.__explicitlySet__.add("high");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceInsightCurrentUtilization build() {
            ResourceInsightCurrentUtilization model =
                    new ResourceInsightCurrentUtilization(this.low, this.high);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceInsightCurrentUtilization model) {
            if (model.wasPropertyExplicitlySet("low")) {
                this.low(model.getLow());
            }
            if (model.wasPropertyExplicitlySet("high")) {
                this.high(model.getHigh());
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

    /** List of db ids with low usage */
    @com.fasterxml.jackson.annotation.JsonProperty("low")
    private final java.util.List<String> low;

    /**
     * List of db ids with low usage
     *
     * @return the value
     */
    public java.util.List<String> getLow() {
        return low;
    }

    /** List of db ids with high usage */
    @com.fasterxml.jackson.annotation.JsonProperty("high")
    private final java.util.List<String> high;

    /**
     * List of db ids with high usage
     *
     * @return the value
     */
    public java.util.List<String> getHigh() {
        return high;
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
        sb.append("ResourceInsightCurrentUtilization(");
        sb.append("super=").append(super.toString());
        sb.append("low=").append(String.valueOf(this.low));
        sb.append(", high=").append(String.valueOf(this.high));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceInsightCurrentUtilization)) {
            return false;
        }

        ResourceInsightCurrentUtilization other = (ResourceInsightCurrentUtilization) o;
        return java.util.Objects.equals(this.low, other.low)
                && java.util.Objects.equals(this.high, other.high)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.low == null ? 43 : this.low.hashCode());
        result = (result * PRIME) + (this.high == null ? 43 : this.high.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

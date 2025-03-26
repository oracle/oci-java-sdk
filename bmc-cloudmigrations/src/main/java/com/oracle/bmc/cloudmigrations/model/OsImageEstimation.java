/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Cost estimation for the OS image.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OsImageEstimation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OsImageEstimation extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"totalPerHour", "totalPerHourBySubscription"})
    public OsImageEstimation(
            java.math.BigDecimal totalPerHour, java.math.BigDecimal totalPerHourBySubscription) {
        super();
        this.totalPerHour = totalPerHour;
        this.totalPerHourBySubscription = totalPerHourBySubscription;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Total price per hour
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalPerHour")
        private java.math.BigDecimal totalPerHour;

        /**
         * Total price per hour
         * @param totalPerHour the value to set
         * @return this builder
         **/
        public Builder totalPerHour(java.math.BigDecimal totalPerHour) {
            this.totalPerHour = totalPerHour;
            this.__explicitlySet__.add("totalPerHour");
            return this;
        }
        /**
         * Total price per hour by subscription
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalPerHourBySubscription")
        private java.math.BigDecimal totalPerHourBySubscription;

        /**
         * Total price per hour by subscription
         * @param totalPerHourBySubscription the value to set
         * @return this builder
         **/
        public Builder totalPerHourBySubscription(java.math.BigDecimal totalPerHourBySubscription) {
            this.totalPerHourBySubscription = totalPerHourBySubscription;
            this.__explicitlySet__.add("totalPerHourBySubscription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OsImageEstimation build() {
            OsImageEstimation model =
                    new OsImageEstimation(this.totalPerHour, this.totalPerHourBySubscription);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OsImageEstimation model) {
            if (model.wasPropertyExplicitlySet("totalPerHour")) {
                this.totalPerHour(model.getTotalPerHour());
            }
            if (model.wasPropertyExplicitlySet("totalPerHourBySubscription")) {
                this.totalPerHourBySubscription(model.getTotalPerHourBySubscription());
            }
            return this;
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
     * Total price per hour
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalPerHour")
    private final java.math.BigDecimal totalPerHour;

    /**
     * Total price per hour
     * @return the value
     **/
    public java.math.BigDecimal getTotalPerHour() {
        return totalPerHour;
    }

    /**
     * Total price per hour by subscription
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalPerHourBySubscription")
    private final java.math.BigDecimal totalPerHourBySubscription;

    /**
     * Total price per hour by subscription
     * @return the value
     **/
    public java.math.BigDecimal getTotalPerHourBySubscription() {
        return totalPerHourBySubscription;
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
        sb.append("OsImageEstimation(");
        sb.append("super=").append(super.toString());
        sb.append("totalPerHour=").append(String.valueOf(this.totalPerHour));
        sb.append(", totalPerHourBySubscription=")
                .append(String.valueOf(this.totalPerHourBySubscription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OsImageEstimation)) {
            return false;
        }

        OsImageEstimation other = (OsImageEstimation) o;
        return java.util.Objects.equals(this.totalPerHour, other.totalPerHour)
                && java.util.Objects.equals(
                        this.totalPerHourBySubscription, other.totalPerHourBySubscription)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalPerHour == null ? 43 : this.totalPerHour.hashCode());
        result =
                (result * PRIME)
                        + (this.totalPerHourBySubscription == null
                                ? 43
                                : this.totalPerHourBySubscription.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

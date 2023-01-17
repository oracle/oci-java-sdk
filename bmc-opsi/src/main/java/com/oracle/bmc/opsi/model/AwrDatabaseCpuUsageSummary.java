/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * A summary of the AWR CPU resource limits and metrics.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AwrDatabaseCpuUsageSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AwrDatabaseCpuUsageSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timestamp", "avgUsageInSecs"})
    public AwrDatabaseCpuUsageSummary(java.util.Date timestamp, Double avgUsageInSecs) {
        super();
        this.timestamp = timestamp;
        this.avgUsageInSecs = avgUsageInSecs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The timestamp for the CPU summary data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The timestamp for the CPU summary data.
         * @param timestamp the value to set
         * @return this builder
         **/
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /**
         * The average CPU usage per second.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("avgUsageInSecs")
        private Double avgUsageInSecs;

        /**
         * The average CPU usage per second.
         * @param avgUsageInSecs the value to set
         * @return this builder
         **/
        public Builder avgUsageInSecs(Double avgUsageInSecs) {
            this.avgUsageInSecs = avgUsageInSecs;
            this.__explicitlySet__.add("avgUsageInSecs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDatabaseCpuUsageSummary build() {
            AwrDatabaseCpuUsageSummary model =
                    new AwrDatabaseCpuUsageSummary(this.timestamp, this.avgUsageInSecs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDatabaseCpuUsageSummary model) {
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("avgUsageInSecs")) {
                this.avgUsageInSecs(model.getAvgUsageInSecs());
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
     * The timestamp for the CPU summary data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The timestamp for the CPU summary data.
     * @return the value
     **/
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * The average CPU usage per second.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("avgUsageInSecs")
    private final Double avgUsageInSecs;

    /**
     * The average CPU usage per second.
     * @return the value
     **/
    public Double getAvgUsageInSecs() {
        return avgUsageInSecs;
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
        sb.append("AwrDatabaseCpuUsageSummary(");
        sb.append("super=").append(super.toString());
        sb.append("timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", avgUsageInSecs=").append(String.valueOf(this.avgUsageInSecs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrDatabaseCpuUsageSummary)) {
            return false;
        }

        AwrDatabaseCpuUsageSummary other = (AwrDatabaseCpuUsageSummary) o;
        return java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.avgUsageInSecs, other.avgUsageInSecs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.avgUsageInSecs == null ? 43 : this.avgUsageInSecs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

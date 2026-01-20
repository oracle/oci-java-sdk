/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Availability metrics details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AvailabilityMetricsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AvailabilityMetricsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"metrics", "collectionIntervalInSeconds"})
    public AvailabilityMetricsDetails(
            java.util.List<String> metrics, Integer collectionIntervalInSeconds) {
        super();
        this.metrics = metrics;
        this.collectionIntervalInSeconds = collectionIntervalInSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of metrics used for availability calculation for the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<String> metrics;

        /**
         * List of metrics used for availability calculation for the resource.
         *
         * @param metrics the value to set
         * @return this builder
         */
        public Builder metrics(java.util.List<String> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }
        /** Availability metric collection internal in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("collectionIntervalInSeconds")
        private Integer collectionIntervalInSeconds;

        /**
         * Availability metric collection internal in seconds.
         *
         * @param collectionIntervalInSeconds the value to set
         * @return this builder
         */
        public Builder collectionIntervalInSeconds(Integer collectionIntervalInSeconds) {
            this.collectionIntervalInSeconds = collectionIntervalInSeconds;
            this.__explicitlySet__.add("collectionIntervalInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AvailabilityMetricsDetails build() {
            AvailabilityMetricsDetails model =
                    new AvailabilityMetricsDetails(this.metrics, this.collectionIntervalInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AvailabilityMetricsDetails model) {
            if (model.wasPropertyExplicitlySet("metrics")) {
                this.metrics(model.getMetrics());
            }
            if (model.wasPropertyExplicitlySet("collectionIntervalInSeconds")) {
                this.collectionIntervalInSeconds(model.getCollectionIntervalInSeconds());
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

    /** List of metrics used for availability calculation for the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<String> metrics;

    /**
     * List of metrics used for availability calculation for the resource.
     *
     * @return the value
     */
    public java.util.List<String> getMetrics() {
        return metrics;
    }

    /** Availability metric collection internal in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("collectionIntervalInSeconds")
    private final Integer collectionIntervalInSeconds;

    /**
     * Availability metric collection internal in seconds.
     *
     * @return the value
     */
    public Integer getCollectionIntervalInSeconds() {
        return collectionIntervalInSeconds;
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
        sb.append("AvailabilityMetricsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("metrics=").append(String.valueOf(this.metrics));
        sb.append(", collectionIntervalInSeconds=")
                .append(String.valueOf(this.collectionIntervalInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AvailabilityMetricsDetails)) {
            return false;
        }

        AvailabilityMetricsDetails other = (AvailabilityMetricsDetails) o;
        return java.util.Objects.equals(this.metrics, other.metrics)
                && java.util.Objects.equals(
                        this.collectionIntervalInSeconds, other.collectionIntervalInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result =
                (result * PRIME)
                        + (this.collectionIntervalInSeconds == null
                                ? 43
                                : this.collectionIntervalInSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

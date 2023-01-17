/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Post historical metric details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SubmitHistoricalMetricsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SubmitHistoricalMetricsDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"historicalMetrics"})
    public SubmitHistoricalMetricsDetails(java.util.List<HistoricalMetric> historicalMetrics) {
        super();
        this.historicalMetrics = historicalMetrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of asset historical metrics.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("historicalMetrics")
        private java.util.List<HistoricalMetric> historicalMetrics;

        /**
         * List of asset historical metrics.
         * @param historicalMetrics the value to set
         * @return this builder
         **/
        public Builder historicalMetrics(java.util.List<HistoricalMetric> historicalMetrics) {
            this.historicalMetrics = historicalMetrics;
            this.__explicitlySet__.add("historicalMetrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubmitHistoricalMetricsDetails build() {
            SubmitHistoricalMetricsDetails model =
                    new SubmitHistoricalMetricsDetails(this.historicalMetrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubmitHistoricalMetricsDetails model) {
            if (model.wasPropertyExplicitlySet("historicalMetrics")) {
                this.historicalMetrics(model.getHistoricalMetrics());
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
     * List of asset historical metrics.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("historicalMetrics")
    private final java.util.List<HistoricalMetric> historicalMetrics;

    /**
     * List of asset historical metrics.
     * @return the value
     **/
    public java.util.List<HistoricalMetric> getHistoricalMetrics() {
        return historicalMetrics;
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
        sb.append("SubmitHistoricalMetricsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("historicalMetrics=").append(String.valueOf(this.historicalMetrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubmitHistoricalMetricsDetails)) {
            return false;
        }

        SubmitHistoricalMetricsDetails other = (SubmitHistoricalMetricsDetails) o;
        return java.util.Objects.equals(this.historicalMetrics, other.historicalMetrics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.historicalMetrics == null ? 43 : this.historicalMetrics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

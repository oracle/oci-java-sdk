/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * The strategy based on average usage. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AverageResourceAssessmentStrategy.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "strategyType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AverageResourceAssessmentStrategy extends ResourceAssessmentStrategy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceType resourceType;

        public Builder resourceType(ResourceType resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * The real resource usage is multiplied to this number before making any recommendation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adjustmentMultiplier")
        private Float adjustmentMultiplier;

        /**
         * The real resource usage is multiplied to this number before making any recommendation.
         *
         * @param adjustmentMultiplier the value to set
         * @return this builder
         */
        public Builder adjustmentMultiplier(Float adjustmentMultiplier) {
            this.adjustmentMultiplier = adjustmentMultiplier;
            this.__explicitlySet__.add("adjustmentMultiplier");
            return this;
        }
        /** The current state of the migration plan. */
        @com.fasterxml.jackson.annotation.JsonProperty("metricType")
        private MetricType metricType;

        /**
         * The current state of the migration plan.
         *
         * @param metricType the value to set
         * @return this builder
         */
        public Builder metricType(MetricType metricType) {
            this.metricType = metricType;
            this.__explicitlySet__.add("metricType");
            return this;
        }
        /** The current state of the migration plan. */
        @com.fasterxml.jackson.annotation.JsonProperty("metricTimeWindow")
        private MetricTimeWindow metricTimeWindow;

        /**
         * The current state of the migration plan.
         *
         * @param metricTimeWindow the value to set
         * @return this builder
         */
        public Builder metricTimeWindow(MetricTimeWindow metricTimeWindow) {
            this.metricTimeWindow = metricTimeWindow;
            this.__explicitlySet__.add("metricTimeWindow");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AverageResourceAssessmentStrategy build() {
            AverageResourceAssessmentStrategy model =
                    new AverageResourceAssessmentStrategy(
                            this.resourceType,
                            this.adjustmentMultiplier,
                            this.metricType,
                            this.metricTimeWindow);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AverageResourceAssessmentStrategy model) {
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("adjustmentMultiplier")) {
                this.adjustmentMultiplier(model.getAdjustmentMultiplier());
            }
            if (model.wasPropertyExplicitlySet("metricType")) {
                this.metricType(model.getMetricType());
            }
            if (model.wasPropertyExplicitlySet("metricTimeWindow")) {
                this.metricTimeWindow(model.getMetricTimeWindow());
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

    @Deprecated
    public AverageResourceAssessmentStrategy(
            ResourceType resourceType,
            Float adjustmentMultiplier,
            MetricType metricType,
            MetricTimeWindow metricTimeWindow) {
        super(resourceType);
        this.adjustmentMultiplier = adjustmentMultiplier;
        this.metricType = metricType;
        this.metricTimeWindow = metricTimeWindow;
    }

    /** The real resource usage is multiplied to this number before making any recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("adjustmentMultiplier")
    private final Float adjustmentMultiplier;

    /**
     * The real resource usage is multiplied to this number before making any recommendation.
     *
     * @return the value
     */
    public Float getAdjustmentMultiplier() {
        return adjustmentMultiplier;
    }

    /** The current state of the migration plan. */
    @com.fasterxml.jackson.annotation.JsonProperty("metricType")
    private final MetricType metricType;

    /**
     * The current state of the migration plan.
     *
     * @return the value
     */
    public MetricType getMetricType() {
        return metricType;
    }

    /** The current state of the migration plan. */
    @com.fasterxml.jackson.annotation.JsonProperty("metricTimeWindow")
    private final MetricTimeWindow metricTimeWindow;

    /**
     * The current state of the migration plan.
     *
     * @return the value
     */
    public MetricTimeWindow getMetricTimeWindow() {
        return metricTimeWindow;
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
        sb.append("AverageResourceAssessmentStrategy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", adjustmentMultiplier=").append(String.valueOf(this.adjustmentMultiplier));
        sb.append(", metricType=").append(String.valueOf(this.metricType));
        sb.append(", metricTimeWindow=").append(String.valueOf(this.metricTimeWindow));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AverageResourceAssessmentStrategy)) {
            return false;
        }

        AverageResourceAssessmentStrategy other = (AverageResourceAssessmentStrategy) o;
        return java.util.Objects.equals(this.adjustmentMultiplier, other.adjustmentMultiplier)
                && java.util.Objects.equals(this.metricType, other.metricType)
                && java.util.Objects.equals(this.metricTimeWindow, other.metricTimeWindow)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.adjustmentMultiplier == null
                                ? 43
                                : this.adjustmentMultiplier.hashCode());
        result = (result * PRIME) + (this.metricType == null ? 43 : this.metricType.hashCode());
        result =
                (result * PRIME)
                        + (this.metricTimeWindow == null ? 43 : this.metricTimeWindow.hashCode());
        return result;
    }
}

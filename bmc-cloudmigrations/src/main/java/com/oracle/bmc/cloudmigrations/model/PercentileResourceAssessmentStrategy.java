/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * The strategy based on percentile usage. <br>
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
        builder = PercentileResourceAssessmentStrategy.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "strategyType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PercentileResourceAssessmentStrategy extends ResourceAssessmentStrategy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceType resourceType;

        public Builder resourceType(ResourceType resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** Percentile value */
        @com.fasterxml.jackson.annotation.JsonProperty("percentile")
        private Percentile percentile;

        /**
         * Percentile value
         *
         * @param percentile the value to set
         * @return this builder
         */
        public Builder percentile(Percentile percentile) {
            this.percentile = percentile;
            this.__explicitlySet__.add("percentile");
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

        public PercentileResourceAssessmentStrategy build() {
            PercentileResourceAssessmentStrategy model =
                    new PercentileResourceAssessmentStrategy(
                            this.resourceType,
                            this.percentile,
                            this.adjustmentMultiplier,
                            this.metricTimeWindow);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PercentileResourceAssessmentStrategy model) {
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("percentile")) {
                this.percentile(model.getPercentile());
            }
            if (model.wasPropertyExplicitlySet("adjustmentMultiplier")) {
                this.adjustmentMultiplier(model.getAdjustmentMultiplier());
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
    public PercentileResourceAssessmentStrategy(
            ResourceType resourceType,
            Percentile percentile,
            Float adjustmentMultiplier,
            MetricTimeWindow metricTimeWindow) {
        super(resourceType);
        this.percentile = percentile;
        this.adjustmentMultiplier = adjustmentMultiplier;
        this.metricTimeWindow = metricTimeWindow;
    }

    /** Percentile value */
    public enum Percentile implements com.oracle.bmc.http.internal.BmcEnum {
        P50("P50"),
        P90("P90"),
        P95("P95"),
        P99("P99"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Percentile.class);

        private final String value;
        private static java.util.Map<String, Percentile> map;

        static {
            map = new java.util.HashMap<>();
            for (Percentile v : Percentile.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Percentile(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Percentile create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Percentile', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Percentile value */
    @com.fasterxml.jackson.annotation.JsonProperty("percentile")
    private final Percentile percentile;

    /**
     * Percentile value
     *
     * @return the value
     */
    public Percentile getPercentile() {
        return percentile;
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
        sb.append("PercentileResourceAssessmentStrategy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", percentile=").append(String.valueOf(this.percentile));
        sb.append(", adjustmentMultiplier=").append(String.valueOf(this.adjustmentMultiplier));
        sb.append(", metricTimeWindow=").append(String.valueOf(this.metricTimeWindow));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PercentileResourceAssessmentStrategy)) {
            return false;
        }

        PercentileResourceAssessmentStrategy other = (PercentileResourceAssessmentStrategy) o;
        return java.util.Objects.equals(this.percentile, other.percentile)
                && java.util.Objects.equals(this.adjustmentMultiplier, other.adjustmentMultiplier)
                && java.util.Objects.equals(this.metricTimeWindow, other.metricTimeWindow)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.percentile == null ? 43 : this.percentile.hashCode());
        result =
                (result * PRIME)
                        + (this.adjustmentMultiplier == null
                                ? 43
                                : this.adjustmentMultiplier.hashCode());
        result =
                (result * PRIME)
                        + (this.metricTimeWindow == null ? 43 : this.metricTimeWindow.hashCode());
        return result;
    }
}

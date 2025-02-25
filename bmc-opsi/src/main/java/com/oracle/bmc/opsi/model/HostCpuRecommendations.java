/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Contains CPU recommendation.
 *
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
    builder = HostCpuRecommendations.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricRecommendationName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HostCpuRecommendations extends HostInsightHostRecommendations {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Show if OPSI recommends to convert an instance to a burstable instance and show recommended cpu baseline if positive recommendation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("burstable")
        private Burstable burstable;

        /**
         * Show if OPSI recommends to convert an instance to a burstable instance and show recommended cpu baseline if positive recommendation.
         * @param burstable the value to set
         * @return this builder
         **/
        public Builder burstable(Burstable burstable) {
            this.burstable = burstable;
            this.__explicitlySet__.add("burstable");
            return this;
        }
        /**
         * Show if OPSI recommends to change the shape of an instance and show recommended shape based on CPU utilization.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * Show if OPSI recommends to change the shape of an instance and show recommended shape based on CPU utilization.
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * Identify unused instances based on cpu, memory and network metrics.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unusedInstance")
        private UnusedInstance unusedInstance;

        /**
         * Identify unused instances based on cpu, memory and network metrics.
         * @param unusedInstance the value to set
         * @return this builder
         **/
        public Builder unusedInstance(UnusedInstance unusedInstance) {
            this.unusedInstance = unusedInstance;
            this.__explicitlySet__.add("unusedInstance");
            return this;
        }
        /**
         * Identify if an instance is abandoned.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAbandonedInstance")
        private Boolean isAbandonedInstance;

        /**
         * Identify if an instance is abandoned.
         * @param isAbandonedInstance the value to set
         * @return this builder
         **/
        public Builder isAbandonedInstance(Boolean isAbandonedInstance) {
            this.isAbandonedInstance = isAbandonedInstance;
            this.__explicitlySet__.add("isAbandonedInstance");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HostCpuRecommendations build() {
            HostCpuRecommendations model =
                    new HostCpuRecommendations(
                            this.burstable,
                            this.shape,
                            this.unusedInstance,
                            this.isAbandonedInstance);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HostCpuRecommendations model) {
            if (model.wasPropertyExplicitlySet("burstable")) {
                this.burstable(model.getBurstable());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("unusedInstance")) {
                this.unusedInstance(model.getUnusedInstance());
            }
            if (model.wasPropertyExplicitlySet("isAbandonedInstance")) {
                this.isAbandonedInstance(model.getIsAbandonedInstance());
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

    @Deprecated
    public HostCpuRecommendations(
            Burstable burstable,
            String shape,
            UnusedInstance unusedInstance,
            Boolean isAbandonedInstance) {
        super();
        this.burstable = burstable;
        this.shape = shape;
        this.unusedInstance = unusedInstance;
        this.isAbandonedInstance = isAbandonedInstance;
    }

    /**
     * Show if OPSI recommends to convert an instance to a burstable instance and show recommended cpu baseline if positive recommendation.
     **/
    public enum Burstable {
        Baseline18("BASELINE_1_8"),
        Baseline12("BASELINE_1_2"),
        NoRecommendation("NO_RECOMMENDATION"),
        DisableBurstable("DISABLE_BURSTABLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Burstable.class);

        private final String value;
        private static java.util.Map<String, Burstable> map;

        static {
            map = new java.util.HashMap<>();
            for (Burstable v : Burstable.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Burstable(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Burstable create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Burstable', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Show if OPSI recommends to convert an instance to a burstable instance and show recommended cpu baseline if positive recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("burstable")
    private final Burstable burstable;

    /**
     * Show if OPSI recommends to convert an instance to a burstable instance and show recommended cpu baseline if positive recommendation.
     * @return the value
     **/
    public Burstable getBurstable() {
        return burstable;
    }

    /**
     * Show if OPSI recommends to change the shape of an instance and show recommended shape based on CPU utilization.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * Show if OPSI recommends to change the shape of an instance and show recommended shape based on CPU utilization.
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    /**
     * Identify unused instances based on cpu, memory and network metrics.
     **/
    public enum UnusedInstance {
        InUse("IN_USE"),
        NotInUse("NOT_IN_USE"),
        IsNotDetermined("IS_NOT_DETERMINED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UnusedInstance.class);

        private final String value;
        private static java.util.Map<String, UnusedInstance> map;

        static {
            map = new java.util.HashMap<>();
            for (UnusedInstance v : UnusedInstance.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UnusedInstance(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UnusedInstance create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UnusedInstance', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Identify unused instances based on cpu, memory and network metrics.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unusedInstance")
    private final UnusedInstance unusedInstance;

    /**
     * Identify unused instances based on cpu, memory and network metrics.
     * @return the value
     **/
    public UnusedInstance getUnusedInstance() {
        return unusedInstance;
    }

    /**
     * Identify if an instance is abandoned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAbandonedInstance")
    private final Boolean isAbandonedInstance;

    /**
     * Identify if an instance is abandoned.
     * @return the value
     **/
    public Boolean getIsAbandonedInstance() {
        return isAbandonedInstance;
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
        sb.append("HostCpuRecommendations(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", burstable=").append(String.valueOf(this.burstable));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", unusedInstance=").append(String.valueOf(this.unusedInstance));
        sb.append(", isAbandonedInstance=").append(String.valueOf(this.isAbandonedInstance));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostCpuRecommendations)) {
            return false;
        }

        HostCpuRecommendations other = (HostCpuRecommendations) o;
        return java.util.Objects.equals(this.burstable, other.burstable)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.unusedInstance, other.unusedInstance)
                && java.util.Objects.equals(this.isAbandonedInstance, other.isAbandonedInstance)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.burstable == null ? 43 : this.burstable.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.unusedInstance == null ? 43 : this.unusedInstance.hashCode());
        result =
                (result * PRIME)
                        + (this.isAbandonedInstance == null
                                ? 43
                                : this.isAbandonedInstance.hashCode());
        return result;
    }
}

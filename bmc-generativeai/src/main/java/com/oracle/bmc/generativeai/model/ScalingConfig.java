/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * The auto scaling configuration for the Hosted Application. Defines the minimum and maximum number
 * of replicas. When unspecified, the service applies service-defined default scaling values. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ScalingConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScalingConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "minReplica",
        "maxReplica",
        "scalingType",
        "targetCpuThreshold",
        "targetMemoryThreshold",
        "targetConcurrencyThreshold",
        "targetRpsThreshold"
    })
    public ScalingConfig(
            Integer minReplica,
            Integer maxReplica,
            ScalingType scalingType,
            Integer targetCpuThreshold,
            Integer targetMemoryThreshold,
            Integer targetConcurrencyThreshold,
            Integer targetRpsThreshold) {
        super();
        this.minReplica = minReplica;
        this.maxReplica = maxReplica;
        this.scalingType = scalingType;
        this.targetCpuThreshold = targetCpuThreshold;
        this.targetMemoryThreshold = targetMemoryThreshold;
        this.targetConcurrencyThreshold = targetConcurrencyThreshold;
        this.targetRpsThreshold = targetRpsThreshold;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Minimum number of replicas to keep running. */
        @com.fasterxml.jackson.annotation.JsonProperty("minReplica")
        private Integer minReplica;

        /**
         * Minimum number of replicas to keep running.
         *
         * @param minReplica the value to set
         * @return this builder
         */
        public Builder minReplica(Integer minReplica) {
            this.minReplica = minReplica;
            this.__explicitlySet__.add("minReplica");
            return this;
        }
        /** Maximum number of replicas allowed. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxReplica")
        private Integer maxReplica;

        /**
         * Maximum number of replicas allowed.
         *
         * @param maxReplica the value to set
         * @return this builder
         */
        public Builder maxReplica(Integer maxReplica) {
            this.maxReplica = maxReplica;
            this.__explicitlySet__.add("maxReplica");
            return this;
        }
        /** scaling type for application. */
        @com.fasterxml.jackson.annotation.JsonProperty("scalingType")
        private ScalingType scalingType;

        /**
         * scaling type for application.
         *
         * @param scalingType the value to set
         * @return this builder
         */
        public Builder scalingType(ScalingType scalingType) {
            this.scalingType = scalingType;
            this.__explicitlySet__.add("scalingType");
            return this;
        }
        /** Scale up if average CPU utilization exceeds this threshold. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetCpuThreshold")
        private Integer targetCpuThreshold;

        /**
         * Scale up if average CPU utilization exceeds this threshold.
         *
         * @param targetCpuThreshold the value to set
         * @return this builder
         */
        public Builder targetCpuThreshold(Integer targetCpuThreshold) {
            this.targetCpuThreshold = targetCpuThreshold;
            this.__explicitlySet__.add("targetCpuThreshold");
            return this;
        }
        /** Scale up if average memory utilization exceeds this threshold. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetMemoryThreshold")
        private Integer targetMemoryThreshold;

        /**
         * Scale up if average memory utilization exceeds this threshold.
         *
         * @param targetMemoryThreshold the value to set
         * @return this builder
         */
        public Builder targetMemoryThreshold(Integer targetMemoryThreshold) {
            this.targetMemoryThreshold = targetMemoryThreshold;
            this.__explicitlySet__.add("targetMemoryThreshold");
            return this;
        }
        /** number of simultaneous requests that can be processed by each replica. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetConcurrencyThreshold")
        private Integer targetConcurrencyThreshold;

        /**
         * number of simultaneous requests that can be processed by each replica.
         *
         * @param targetConcurrencyThreshold the value to set
         * @return this builder
         */
        public Builder targetConcurrencyThreshold(Integer targetConcurrencyThreshold) {
            this.targetConcurrencyThreshold = targetConcurrencyThreshold;
            this.__explicitlySet__.add("targetConcurrencyThreshold");
            return this;
        }
        /** requests-per-second per replica of an application. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetRpsThreshold")
        private Integer targetRpsThreshold;

        /**
         * requests-per-second per replica of an application.
         *
         * @param targetRpsThreshold the value to set
         * @return this builder
         */
        public Builder targetRpsThreshold(Integer targetRpsThreshold) {
            this.targetRpsThreshold = targetRpsThreshold;
            this.__explicitlySet__.add("targetRpsThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScalingConfig build() {
            ScalingConfig model =
                    new ScalingConfig(
                            this.minReplica,
                            this.maxReplica,
                            this.scalingType,
                            this.targetCpuThreshold,
                            this.targetMemoryThreshold,
                            this.targetConcurrencyThreshold,
                            this.targetRpsThreshold);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScalingConfig model) {
            if (model.wasPropertyExplicitlySet("minReplica")) {
                this.minReplica(model.getMinReplica());
            }
            if (model.wasPropertyExplicitlySet("maxReplica")) {
                this.maxReplica(model.getMaxReplica());
            }
            if (model.wasPropertyExplicitlySet("scalingType")) {
                this.scalingType(model.getScalingType());
            }
            if (model.wasPropertyExplicitlySet("targetCpuThreshold")) {
                this.targetCpuThreshold(model.getTargetCpuThreshold());
            }
            if (model.wasPropertyExplicitlySet("targetMemoryThreshold")) {
                this.targetMemoryThreshold(model.getTargetMemoryThreshold());
            }
            if (model.wasPropertyExplicitlySet("targetConcurrencyThreshold")) {
                this.targetConcurrencyThreshold(model.getTargetConcurrencyThreshold());
            }
            if (model.wasPropertyExplicitlySet("targetRpsThreshold")) {
                this.targetRpsThreshold(model.getTargetRpsThreshold());
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

    /** Minimum number of replicas to keep running. */
    @com.fasterxml.jackson.annotation.JsonProperty("minReplica")
    private final Integer minReplica;

    /**
     * Minimum number of replicas to keep running.
     *
     * @return the value
     */
    public Integer getMinReplica() {
        return minReplica;
    }

    /** Maximum number of replicas allowed. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxReplica")
    private final Integer maxReplica;

    /**
     * Maximum number of replicas allowed.
     *
     * @return the value
     */
    public Integer getMaxReplica() {
        return maxReplica;
    }

    /** scaling type for application. */
    public enum ScalingType implements com.oracle.bmc.http.internal.BmcEnum {
        Cpu("CPU"),
        Memory("MEMORY"),
        Concurrency("CONCURRENCY"),
        RequestsPerSecond("REQUESTS_PER_SECOND"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ScalingType.class);

        private final String value;
        private static java.util.Map<String, ScalingType> map;

        static {
            map = new java.util.HashMap<>();
            for (ScalingType v : ScalingType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ScalingType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ScalingType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ScalingType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** scaling type for application. */
    @com.fasterxml.jackson.annotation.JsonProperty("scalingType")
    private final ScalingType scalingType;

    /**
     * scaling type for application.
     *
     * @return the value
     */
    public ScalingType getScalingType() {
        return scalingType;
    }

    /** Scale up if average CPU utilization exceeds this threshold. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetCpuThreshold")
    private final Integer targetCpuThreshold;

    /**
     * Scale up if average CPU utilization exceeds this threshold.
     *
     * @return the value
     */
    public Integer getTargetCpuThreshold() {
        return targetCpuThreshold;
    }

    /** Scale up if average memory utilization exceeds this threshold. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetMemoryThreshold")
    private final Integer targetMemoryThreshold;

    /**
     * Scale up if average memory utilization exceeds this threshold.
     *
     * @return the value
     */
    public Integer getTargetMemoryThreshold() {
        return targetMemoryThreshold;
    }

    /** number of simultaneous requests that can be processed by each replica. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetConcurrencyThreshold")
    private final Integer targetConcurrencyThreshold;

    /**
     * number of simultaneous requests that can be processed by each replica.
     *
     * @return the value
     */
    public Integer getTargetConcurrencyThreshold() {
        return targetConcurrencyThreshold;
    }

    /** requests-per-second per replica of an application. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetRpsThreshold")
    private final Integer targetRpsThreshold;

    /**
     * requests-per-second per replica of an application.
     *
     * @return the value
     */
    public Integer getTargetRpsThreshold() {
        return targetRpsThreshold;
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
        sb.append("ScalingConfig(");
        sb.append("super=").append(super.toString());
        sb.append("minReplica=").append(String.valueOf(this.minReplica));
        sb.append(", maxReplica=").append(String.valueOf(this.maxReplica));
        sb.append(", scalingType=").append(String.valueOf(this.scalingType));
        sb.append(", targetCpuThreshold=").append(String.valueOf(this.targetCpuThreshold));
        sb.append(", targetMemoryThreshold=").append(String.valueOf(this.targetMemoryThreshold));
        sb.append(", targetConcurrencyThreshold=")
                .append(String.valueOf(this.targetConcurrencyThreshold));
        sb.append(", targetRpsThreshold=").append(String.valueOf(this.targetRpsThreshold));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScalingConfig)) {
            return false;
        }

        ScalingConfig other = (ScalingConfig) o;
        return java.util.Objects.equals(this.minReplica, other.minReplica)
                && java.util.Objects.equals(this.maxReplica, other.maxReplica)
                && java.util.Objects.equals(this.scalingType, other.scalingType)
                && java.util.Objects.equals(this.targetCpuThreshold, other.targetCpuThreshold)
                && java.util.Objects.equals(this.targetMemoryThreshold, other.targetMemoryThreshold)
                && java.util.Objects.equals(
                        this.targetConcurrencyThreshold, other.targetConcurrencyThreshold)
                && java.util.Objects.equals(this.targetRpsThreshold, other.targetRpsThreshold)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.minReplica == null ? 43 : this.minReplica.hashCode());
        result = (result * PRIME) + (this.maxReplica == null ? 43 : this.maxReplica.hashCode());
        result = (result * PRIME) + (this.scalingType == null ? 43 : this.scalingType.hashCode());
        result =
                (result * PRIME)
                        + (this.targetCpuThreshold == null
                                ? 43
                                : this.targetCpuThreshold.hashCode());
        result =
                (result * PRIME)
                        + (this.targetMemoryThreshold == null
                                ? 43
                                : this.targetMemoryThreshold.hashCode());
        result =
                (result * PRIME)
                        + (this.targetConcurrencyThreshold == null
                                ? 43
                                : this.targetConcurrencyThreshold.hashCode());
        result =
                (result * PRIME)
                        + (this.targetRpsThreshold == null
                                ? 43
                                : this.targetRpsThreshold.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

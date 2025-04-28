/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Information about the available capacity for a shape. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CapacityReportShapeAvailability.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CapacityReportShapeAvailability
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "faultDomain",
        "instanceShape",
        "instanceShapeConfig",
        "availableCount",
        "availabilityStatus"
    })
    public CapacityReportShapeAvailability(
            String faultDomain,
            String instanceShape,
            CapacityReportInstanceShapeConfig instanceShapeConfig,
            Long availableCount,
            AvailabilityStatus availabilityStatus) {
        super();
        this.faultDomain = faultDomain;
        this.instanceShape = instanceShape;
        this.instanceShapeConfig = instanceShapeConfig;
        this.availableCount = availableCount;
        this.availabilityStatus = availabilityStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The fault domain for the capacity report.
         *
         * <p>If you do not specify the fault domain, the capacity report includes information about
         * all fault domains.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * The fault domain for the capacity report.
         *
         * <p>If you do not specify the fault domain, the capacity report includes information about
         * all fault domains.
         *
         * @param faultDomain the value to set
         * @return this builder
         */
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /** The shape that the capacity report was requested for. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceShape")
        private String instanceShape;

        /**
         * The shape that the capacity report was requested for.
         *
         * @param instanceShape the value to set
         * @return this builder
         */
        public Builder instanceShape(String instanceShape) {
            this.instanceShape = instanceShape;
            this.__explicitlySet__.add("instanceShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceShapeConfig")
        private CapacityReportInstanceShapeConfig instanceShapeConfig;

        public Builder instanceShapeConfig(CapacityReportInstanceShapeConfig instanceShapeConfig) {
            this.instanceShapeConfig = instanceShapeConfig;
            this.__explicitlySet__.add("instanceShapeConfig");
            return this;
        }
        /**
         * The total number of new instances that can be created with the specified shape
         * configuration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableCount")
        private Long availableCount;

        /**
         * The total number of new instances that can be created with the specified shape
         * configuration.
         *
         * @param availableCount the value to set
         * @return this builder
         */
        public Builder availableCount(Long availableCount) {
            this.availableCount = availableCount;
            this.__explicitlySet__.add("availableCount");
            return this;
        }
        /** A flag denoting whether capacity is available. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityStatus")
        private AvailabilityStatus availabilityStatus;

        /**
         * A flag denoting whether capacity is available.
         *
         * @param availabilityStatus the value to set
         * @return this builder
         */
        public Builder availabilityStatus(AvailabilityStatus availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
            this.__explicitlySet__.add("availabilityStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CapacityReportShapeAvailability build() {
            CapacityReportShapeAvailability model =
                    new CapacityReportShapeAvailability(
                            this.faultDomain,
                            this.instanceShape,
                            this.instanceShapeConfig,
                            this.availableCount,
                            this.availabilityStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CapacityReportShapeAvailability model) {
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("instanceShape")) {
                this.instanceShape(model.getInstanceShape());
            }
            if (model.wasPropertyExplicitlySet("instanceShapeConfig")) {
                this.instanceShapeConfig(model.getInstanceShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("availableCount")) {
                this.availableCount(model.getAvailableCount());
            }
            if (model.wasPropertyExplicitlySet("availabilityStatus")) {
                this.availabilityStatus(model.getAvailabilityStatus());
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
     * The fault domain for the capacity report.
     *
     * <p>If you do not specify the fault domain, the capacity report includes information about all
     * fault domains.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * The fault domain for the capacity report.
     *
     * <p>If you do not specify the fault domain, the capacity report includes information about all
     * fault domains.
     *
     * @return the value
     */
    public String getFaultDomain() {
        return faultDomain;
    }

    /** The shape that the capacity report was requested for. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceShape")
    private final String instanceShape;

    /**
     * The shape that the capacity report was requested for.
     *
     * @return the value
     */
    public String getInstanceShape() {
        return instanceShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("instanceShapeConfig")
    private final CapacityReportInstanceShapeConfig instanceShapeConfig;

    public CapacityReportInstanceShapeConfig getInstanceShapeConfig() {
        return instanceShapeConfig;
    }

    /**
     * The total number of new instances that can be created with the specified shape configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableCount")
    private final Long availableCount;

    /**
     * The total number of new instances that can be created with the specified shape configuration.
     *
     * @return the value
     */
    public Long getAvailableCount() {
        return availableCount;
    }

    /** A flag denoting whether capacity is available. */
    public enum AvailabilityStatus implements com.oracle.bmc.http.internal.BmcEnum {
        OutOfHostCapacity("OUT_OF_HOST_CAPACITY"),
        HardwareNotSupported("HARDWARE_NOT_SUPPORTED"),
        Available("AVAILABLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AvailabilityStatus.class);

        private final String value;
        private static java.util.Map<String, AvailabilityStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (AvailabilityStatus v : AvailabilityStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AvailabilityStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AvailabilityStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AvailabilityStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** A flag denoting whether capacity is available. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityStatus")
    private final AvailabilityStatus availabilityStatus;

    /**
     * A flag denoting whether capacity is available.
     *
     * @return the value
     */
    public AvailabilityStatus getAvailabilityStatus() {
        return availabilityStatus;
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
        sb.append("CapacityReportShapeAvailability(");
        sb.append("super=").append(super.toString());
        sb.append("faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", instanceShape=").append(String.valueOf(this.instanceShape));
        sb.append(", instanceShapeConfig=").append(String.valueOf(this.instanceShapeConfig));
        sb.append(", availableCount=").append(String.valueOf(this.availableCount));
        sb.append(", availabilityStatus=").append(String.valueOf(this.availabilityStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CapacityReportShapeAvailability)) {
            return false;
        }

        CapacityReportShapeAvailability other = (CapacityReportShapeAvailability) o;
        return java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.instanceShape, other.instanceShape)
                && java.util.Objects.equals(this.instanceShapeConfig, other.instanceShapeConfig)
                && java.util.Objects.equals(this.availableCount, other.availableCount)
                && java.util.Objects.equals(this.availabilityStatus, other.availabilityStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceShape == null ? 43 : this.instanceShape.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceShapeConfig == null
                                ? 43
                                : this.instanceShapeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.availableCount == null ? 43 : this.availableCount.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityStatus == null
                                ? 43
                                : this.availabilityStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

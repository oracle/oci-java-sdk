/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides additional information for a management station event.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManagementStationEventData.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagementStationEventData
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "operationType",
        "healthState",
        "status",
        "additionalDetails"
    })
    public ManagementStationEventData(
            OperationType operationType,
            HealthState healthState,
            EventStatus status,
            WorkRequestEventDataAdditionalDetails additionalDetails) {
        super();
        this.operationType = operationType;
        this.healthState = healthState;
        this.status = status;
        this.additionalDetails = additionalDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of management station operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationType operationType;

        /**
         * Type of management station operation.
         * @param operationType the value to set
         * @return this builder
         **/
        public Builder operationType(OperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /**
         * Health state of the management station
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("healthState")
        private HealthState healthState;

        /**
         * Health state of the management station
         * @param healthState the value to set
         * @return this builder
         **/
        public Builder healthState(HealthState healthState) {
            this.healthState = healthState;
            this.__explicitlySet__.add("healthState");
            return this;
        }
        /**
         * Status of the management station operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private EventStatus status;

        /**
         * Status of the management station operation.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(EventStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private WorkRequestEventDataAdditionalDetails additionalDetails;

        public Builder additionalDetails(WorkRequestEventDataAdditionalDetails additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementStationEventData build() {
            ManagementStationEventData model =
                    new ManagementStationEventData(
                            this.operationType,
                            this.healthState,
                            this.status,
                            this.additionalDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementStationEventData model) {
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("healthState")) {
                this.healthState(model.getHealthState());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
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
     * Type of management station operation.
     **/
    public enum OperationType {
        SetManagementStationConfig("SET_MANAGEMENT_STATION_CONFIG"),
        SyncManagementStationMirror("SYNC_MANAGEMENT_STATION_MIRROR"),
        UpdateManagementStationSoftware("UPDATE_MANAGEMENT_STATION_SOFTWARE"),
        SetManagementStationHealthState("SET_MANAGEMENT_STATION_HEALTH_STATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OperationType.class);

        private final String value;
        private static java.util.Map<String, OperationType> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationType v : OperationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OperationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OperationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of management station operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final OperationType operationType;

    /**
     * Type of management station operation.
     * @return the value
     **/
    public OperationType getOperationType() {
        return operationType;
    }

    /**
     * Health state of the management station
     **/
    public enum HealthState {
        Healthy("HEALTHY"),
        Unhealthy("UNHEALTHY"),
        Unavailable("UNAVAILABLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(HealthState.class);

        private final String value;
        private static java.util.Map<String, HealthState> map;

        static {
            map = new java.util.HashMap<>();
            for (HealthState v : HealthState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        HealthState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HealthState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'HealthState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Health state of the management station
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("healthState")
    private final HealthState healthState;

    /**
     * Health state of the management station
     * @return the value
     **/
    public HealthState getHealthState() {
        return healthState;
    }

    /**
     * Status of the management station operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final EventStatus status;

    /**
     * Status of the management station operation.
     * @return the value
     **/
    public EventStatus getStatus() {
        return status;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final WorkRequestEventDataAdditionalDetails additionalDetails;

    public WorkRequestEventDataAdditionalDetails getAdditionalDetails() {
        return additionalDetails;
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
        sb.append("ManagementStationEventData(");
        sb.append("super=").append(super.toString());
        sb.append("operationType=").append(String.valueOf(this.operationType));
        sb.append(", healthState=").append(String.valueOf(this.healthState));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementStationEventData)) {
            return false;
        }

        ManagementStationEventData other = (ManagementStationEventData) o;
        return java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.healthState, other.healthState)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + (this.healthState == null ? 43 : this.healthState.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

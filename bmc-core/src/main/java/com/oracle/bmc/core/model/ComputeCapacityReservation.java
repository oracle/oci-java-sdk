/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A template that defines the settings to use when creating compute capacity reservations. <br>
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
        builder = ComputeCapacityReservation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeCapacityReservation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "id",
        "isDefaultReservation",
        "instanceReservationConfigs",
        "lifecycleState",
        "reservedInstanceCount",
        "timeUpdated",
        "timeCreated",
        "usedInstanceCount"
    })
    public ComputeCapacityReservation(
            String availabilityDomain,
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            Boolean isDefaultReservation,
            java.util.List<InstanceReservationConfig> instanceReservationConfigs,
            LifecycleState lifecycleState,
            Long reservedInstanceCount,
            java.util.Date timeUpdated,
            java.util.Date timeCreated,
            Long usedInstanceCount) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.isDefaultReservation = isDefaultReservation;
        this.instanceReservationConfigs = instanceReservationConfigs;
        this.lifecycleState = lifecycleState;
        this.reservedInstanceCount = reservedInstanceCount;
        this.timeUpdated = timeUpdated;
        this.timeCreated = timeCreated;
        this.usedInstanceCount = usedInstanceCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain of the compute capacity reservation.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain of the compute capacity reservation.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the compute capacity reservation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the compute capacity reservation.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute capacity reservation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute capacity reservation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Whether this capacity reservation is the default. For more information, see [Capacity
         * Reservations](https://docs.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDefaultReservation")
        private Boolean isDefaultReservation;

        /**
         * Whether this capacity reservation is the default. For more information, see [Capacity
         * Reservations](https://docs.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
         *
         * @param isDefaultReservation the value to set
         * @return this builder
         */
        public Builder isDefaultReservation(Boolean isDefaultReservation) {
            this.isDefaultReservation = isDefaultReservation;
            this.__explicitlySet__.add("isDefaultReservation");
            return this;
        }
        /**
         * The capacity configurations for the capacity reservation.
         *
         * <p>To use the reservation for the desired shape, specify the shape, count, and optionally
         * the fault domain where you want this configuration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceReservationConfigs")
        private java.util.List<InstanceReservationConfig> instanceReservationConfigs;

        /**
         * The capacity configurations for the capacity reservation.
         *
         * <p>To use the reservation for the desired shape, specify the shape, count, and optionally
         * the fault domain where you want this configuration.
         *
         * @param instanceReservationConfigs the value to set
         * @return this builder
         */
        public Builder instanceReservationConfigs(
                java.util.List<InstanceReservationConfig> instanceReservationConfigs) {
            this.instanceReservationConfigs = instanceReservationConfigs;
            this.__explicitlySet__.add("instanceReservationConfigs");
            return this;
        }
        /** The current state of the compute capacity reservation. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the compute capacity reservation.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The number of instances for which capacity will be held with this compute capacity
         * reservation. This number is the sum of the values of the {@code reservedCount} fields for
         * all of the instance capacity configurations under this reservation. The purpose of this
         * field is to calculate the percentage usage of the reservation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reservedInstanceCount")
        private Long reservedInstanceCount;

        /**
         * The number of instances for which capacity will be held with this compute capacity
         * reservation. This number is the sum of the values of the {@code reservedCount} fields for
         * all of the instance capacity configurations under this reservation. The purpose of this
         * field is to calculate the percentage usage of the reservation.
         *
         * @param reservedInstanceCount the value to set
         * @return this builder
         */
        public Builder reservedInstanceCount(Long reservedInstanceCount) {
            this.reservedInstanceCount = reservedInstanceCount;
            this.__explicitlySet__.add("reservedInstanceCount");
            return this;
        }
        /**
         * The date and time the compute capacity reservation was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the compute capacity reservation was updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The date and time the compute capacity reservation was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the compute capacity reservation was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The total number of instances currently consuming space in this compute capacity
         * reservation. This number is the sum of the values of the {@code usedCount} fields for all
         * of the instance capacity configurations under this reservation. The purpose of this field
         * is to calculate the percentage usage of the reservation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("usedInstanceCount")
        private Long usedInstanceCount;

        /**
         * The total number of instances currently consuming space in this compute capacity
         * reservation. This number is the sum of the values of the {@code usedCount} fields for all
         * of the instance capacity configurations under this reservation. The purpose of this field
         * is to calculate the percentage usage of the reservation.
         *
         * @param usedInstanceCount the value to set
         * @return this builder
         */
        public Builder usedInstanceCount(Long usedInstanceCount) {
            this.usedInstanceCount = usedInstanceCount;
            this.__explicitlySet__.add("usedInstanceCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeCapacityReservation build() {
            ComputeCapacityReservation model =
                    new ComputeCapacityReservation(
                            this.availabilityDomain,
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.id,
                            this.isDefaultReservation,
                            this.instanceReservationConfigs,
                            this.lifecycleState,
                            this.reservedInstanceCount,
                            this.timeUpdated,
                            this.timeCreated,
                            this.usedInstanceCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeCapacityReservation model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("isDefaultReservation")) {
                this.isDefaultReservation(model.getIsDefaultReservation());
            }
            if (model.wasPropertyExplicitlySet("instanceReservationConfigs")) {
                this.instanceReservationConfigs(model.getInstanceReservationConfigs());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("reservedInstanceCount")) {
                this.reservedInstanceCount(model.getReservedInstanceCount());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("usedInstanceCount")) {
                this.usedInstanceCount(model.getUsedInstanceCount());
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
     * The availability domain of the compute capacity reservation.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain of the compute capacity reservation.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the compute capacity reservation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the compute capacity reservation.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute capacity reservation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute capacity reservation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Whether this capacity reservation is the default. For more information, see [Capacity
     * Reservations](https://docs.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefaultReservation")
    private final Boolean isDefaultReservation;

    /**
     * Whether this capacity reservation is the default. For more information, see [Capacity
     * Reservations](https://docs.oracle.com/iaas/Content/Compute/Tasks/reserve-capacity.htm#default).
     *
     * @return the value
     */
    public Boolean getIsDefaultReservation() {
        return isDefaultReservation;
    }

    /**
     * The capacity configurations for the capacity reservation.
     *
     * <p>To use the reservation for the desired shape, specify the shape, count, and optionally the
     * fault domain where you want this configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceReservationConfigs")
    private final java.util.List<InstanceReservationConfig> instanceReservationConfigs;

    /**
     * The capacity configurations for the capacity reservation.
     *
     * <p>To use the reservation for the desired shape, specify the shape, count, and optionally the
     * fault domain where you want this configuration.
     *
     * @return the value
     */
    public java.util.List<InstanceReservationConfig> getInstanceReservationConfigs() {
        return instanceReservationConfigs;
    }

    /** The current state of the compute capacity reservation. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Creating("CREATING"),
        Updating("UPDATING"),
        Moving("MOVING"),
        Deleted("DELETED"),
        Deleting("DELETING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the compute capacity reservation. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the compute capacity reservation.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The number of instances for which capacity will be held with this compute capacity
     * reservation. This number is the sum of the values of the {@code reservedCount} fields for all
     * of the instance capacity configurations under this reservation. The purpose of this field is
     * to calculate the percentage usage of the reservation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reservedInstanceCount")
    private final Long reservedInstanceCount;

    /**
     * The number of instances for which capacity will be held with this compute capacity
     * reservation. This number is the sum of the values of the {@code reservedCount} fields for all
     * of the instance capacity configurations under this reservation. The purpose of this field is
     * to calculate the percentage usage of the reservation.
     *
     * @return the value
     */
    public Long getReservedInstanceCount() {
        return reservedInstanceCount;
    }

    /**
     * The date and time the compute capacity reservation was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the compute capacity reservation was updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The date and time the compute capacity reservation was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the compute capacity reservation was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The total number of instances currently consuming space in this compute capacity reservation.
     * This number is the sum of the values of the {@code usedCount} fields for all of the instance
     * capacity configurations under this reservation. The purpose of this field is to calculate the
     * percentage usage of the reservation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("usedInstanceCount")
    private final Long usedInstanceCount;

    /**
     * The total number of instances currently consuming space in this compute capacity reservation.
     * This number is the sum of the values of the {@code usedCount} fields for all of the instance
     * capacity configurations under this reservation. The purpose of this field is to calculate the
     * percentage usage of the reservation.
     *
     * @return the value
     */
    public Long getUsedInstanceCount() {
        return usedInstanceCount;
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
        sb.append("ComputeCapacityReservation(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", isDefaultReservation=").append(String.valueOf(this.isDefaultReservation));
        sb.append(", instanceReservationConfigs=")
                .append(String.valueOf(this.instanceReservationConfigs));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", reservedInstanceCount=").append(String.valueOf(this.reservedInstanceCount));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", usedInstanceCount=").append(String.valueOf(this.usedInstanceCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeCapacityReservation)) {
            return false;
        }

        ComputeCapacityReservation other = (ComputeCapacityReservation) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.isDefaultReservation, other.isDefaultReservation)
                && java.util.Objects.equals(
                        this.instanceReservationConfigs, other.instanceReservationConfigs)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.reservedInstanceCount, other.reservedInstanceCount)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.usedInstanceCount, other.usedInstanceCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.isDefaultReservation == null
                                ? 43
                                : this.isDefaultReservation.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceReservationConfigs == null
                                ? 43
                                : this.instanceReservationConfigs.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.reservedInstanceCount == null
                                ? 43
                                : this.reservedInstanceCount.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.usedInstanceCount == null ? 43 : this.usedInstanceCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

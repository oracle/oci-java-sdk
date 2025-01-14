/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Information about an instance that belongs to an instance pool. <br>
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
        builder = InstancePoolInstance.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstancePoolInstance
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "instancePoolId",
        "availabilityDomain",
        "lifecycleState",
        "compartmentId",
        "displayName",
        "faultDomain",
        "instanceConfigurationId",
        "region",
        "shape",
        "state",
        "timeCreated",
        "loadBalancerBackends"
    })
    public InstancePoolInstance(
            String id,
            String instancePoolId,
            String availabilityDomain,
            LifecycleState lifecycleState,
            String compartmentId,
            String displayName,
            String faultDomain,
            String instanceConfigurationId,
            String region,
            String shape,
            String state,
            java.util.Date timeCreated,
            java.util.List<InstancePoolInstanceLoadBalancerBackend> loadBalancerBackends) {
        super();
        this.id = id;
        this.instancePoolId = instancePoolId;
        this.availabilityDomain = availabilityDomain;
        this.lifecycleState = lifecycleState;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.faultDomain = faultDomain;
        this.instanceConfigurationId = instanceConfigurationId;
        this.region = region;
        this.shape = shape;
        this.state = state;
        this.timeCreated = timeCreated;
        this.loadBalancerBackends = loadBalancerBackends;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the instance.
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the instance pool.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instancePoolId")
        private String instancePoolId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the instance pool.
         *
         * @param instancePoolId the value to set
         * @return this builder
         */
        public Builder instancePoolId(String instancePoolId) {
            this.instancePoolId = instancePoolId;
            this.__explicitlySet__.add("instancePoolId");
            return this;
        }
        /** The availability domain the instance is running in. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain the instance is running in.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /** The attachment state of the instance in relation to the instance pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The attachment state of the instance in relation to the instance pool.
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains the instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment that contains the instance.
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
        /** The fault domain the instance is running in. */
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * The fault domain the instance is running in.
         *
         * @param faultDomain the value to set
         * @return this builder
         */
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the instance configuration used to create the instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceConfigurationId")
        private String instanceConfigurationId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the instance configuration used to create the instance.
         *
         * @param instanceConfigurationId the value to set
         * @return this builder
         */
        public Builder instanceConfigurationId(String instanceConfigurationId) {
            this.instanceConfigurationId = instanceConfigurationId;
            this.__explicitlySet__.add("instanceConfigurationId");
            return this;
        }
        /** The region that contains the availability domain the instance is running in. */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The region that contains the availability domain the instance is running in.
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * The shape of the instance. The shape determines the number of CPUs, amount of memory, and
         * other resources allocated to the instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of the instance. The shape determines the number of CPUs, amount of memory, and
         * other resources allocated to the instance.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * The lifecycle state of the instance. Refer to {@code lifecycleState} in the {@link
         * Instance} resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private String state;

        /**
         * The lifecycle state of the instance. Refer to {@code lifecycleState} in the {@link
         * Instance} resource.
         *
         * @param state the value to set
         * @return this builder
         */
        public Builder state(String state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /**
         * The date and time the instance pool instance was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the instance pool instance was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The load balancer backends that are configured for the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerBackends")
        private java.util.List<InstancePoolInstanceLoadBalancerBackend> loadBalancerBackends;

        /**
         * The load balancer backends that are configured for the instance.
         *
         * @param loadBalancerBackends the value to set
         * @return this builder
         */
        public Builder loadBalancerBackends(
                java.util.List<InstancePoolInstanceLoadBalancerBackend> loadBalancerBackends) {
            this.loadBalancerBackends = loadBalancerBackends;
            this.__explicitlySet__.add("loadBalancerBackends");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstancePoolInstance build() {
            InstancePoolInstance model =
                    new InstancePoolInstance(
                            this.id,
                            this.instancePoolId,
                            this.availabilityDomain,
                            this.lifecycleState,
                            this.compartmentId,
                            this.displayName,
                            this.faultDomain,
                            this.instanceConfigurationId,
                            this.region,
                            this.shape,
                            this.state,
                            this.timeCreated,
                            this.loadBalancerBackends);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstancePoolInstance model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("instancePoolId")) {
                this.instancePoolId(model.getInstancePoolId());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("instanceConfigurationId")) {
                this.instanceConfigurationId(model.getInstanceConfigurationId());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("loadBalancerBackends")) {
                this.loadBalancerBackends(model.getLoadBalancerBackends());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the instance.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the instance pool.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instancePoolId")
    private final String instancePoolId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the instance pool.
     *
     * @return the value
     */
    public String getInstancePoolId() {
        return instancePoolId;
    }

    /** The availability domain the instance is running in. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain the instance is running in.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /** The attachment state of the instance in relation to the instance pool. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Attaching("ATTACHING"),
        Active("ACTIVE"),
        Detaching("DETACHING"),

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
    /** The attachment state of the instance in relation to the instance pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The attachment state of the instance in relation to the instance pool.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment that contains the instance.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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

    /** The fault domain the instance is running in. */
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * The fault domain the instance is running in.
     *
     * @return the value
     */
    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the instance configuration used to create the instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceConfigurationId")
    private final String instanceConfigurationId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the instance configuration used to create the instance.
     *
     * @return the value
     */
    public String getInstanceConfigurationId() {
        return instanceConfigurationId;
    }

    /** The region that contains the availability domain the instance is running in. */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The region that contains the availability domain the instance is running in.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /**
     * The shape of the instance. The shape determines the number of CPUs, amount of memory, and
     * other resources allocated to the instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of the instance. The shape determines the number of CPUs, amount of memory, and
     * other resources allocated to the instance.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /**
     * The lifecycle state of the instance. Refer to {@code lifecycleState} in the {@link Instance}
     * resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final String state;

    /**
     * The lifecycle state of the instance. Refer to {@code lifecycleState} in the {@link Instance}
     * resource.
     *
     * @return the value
     */
    public String getState() {
        return state;
    }

    /**
     * The date and time the instance pool instance was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the instance pool instance was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The load balancer backends that are configured for the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerBackends")
    private final java.util.List<InstancePoolInstanceLoadBalancerBackend> loadBalancerBackends;

    /**
     * The load balancer backends that are configured for the instance.
     *
     * @return the value
     */
    public java.util.List<InstancePoolInstanceLoadBalancerBackend> getLoadBalancerBackends() {
        return loadBalancerBackends;
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
        sb.append("InstancePoolInstance(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", instancePoolId=").append(String.valueOf(this.instancePoolId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", instanceConfigurationId=")
                .append(String.valueOf(this.instanceConfigurationId));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", loadBalancerBackends=").append(String.valueOf(this.loadBalancerBackends));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstancePoolInstance)) {
            return false;
        }

        InstancePoolInstance other = (InstancePoolInstance) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.instancePoolId, other.instancePoolId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(
                        this.instanceConfigurationId, other.instanceConfigurationId)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.loadBalancerBackends, other.loadBalancerBackends)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.instancePoolId == null ? 43 : this.instancePoolId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceConfigurationId == null
                                ? 43
                                : this.instanceConfigurationId.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.loadBalancerBackends == null
                                ? 43
                                : this.loadBalancerBackends.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

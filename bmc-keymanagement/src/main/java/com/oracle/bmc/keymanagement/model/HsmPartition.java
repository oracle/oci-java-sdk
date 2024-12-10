/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * Dedicated KMS-HSM Partition Management
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HsmPartition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HsmPartition extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "portInformation",
        "timeCreated",
        "timeUpdated",
        "lifecycleState"
    })
    public HsmPartition(
            String id,
            String compartmentId,
            java.util.List<PortInformation> portInformation,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.portInformation = portInformation;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the HSM resource. Each HSM resource has a unique OCID as an identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the HSM resource. Each HSM resource has a unique OCID as an identifier.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment that contains a particular HSM resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains a particular HSM resource.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Details of a single portInformation item include the PortNumber (an integer used as an identifier) and the PortType (refers to either an enum value of Managementutility,Clientutility, or null)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("portInformation")
        private java.util.List<PortInformation> portInformation;

        /**
         * Details of a single portInformation item include the PortNumber (an integer used as an identifier) and the PortType (refers to either an enum value of Managementutility,Clientutility, or null)
         * @param portInformation the value to set
         * @return this builder
         **/
        public Builder portInformation(java.util.List<PortInformation> portInformation) {
            this.portInformation = portInformation;
            this.__explicitlySet__.add("portInformation");
            return this;
        }
        /**
         * The date and time a HSMPartition was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * <p>
         * Example: {@code 2018-04-03T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time a HSMPartition was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * <p>
         * Example: {@code 2018-04-03T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time a HSMPartition was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * <p>
         * Example: {@code 2018-04-03T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time a HSMPartition was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * <p>
         * Example: {@code 2018-04-03T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * A HSMCluster resource's current lifecycle state.
         * <p>
         * Example: {@code ACTIVE}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * A HSMCluster resource's current lifecycle state.
         * <p>
         * Example: {@code ACTIVE}
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HsmPartition build() {
            HsmPartition model =
                    new HsmPartition(
                            this.id,
                            this.compartmentId,
                            this.portInformation,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HsmPartition model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("portInformation")) {
                this.portInformation(model.getPortInformation());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
     * The OCID of the HSM resource. Each HSM resource has a unique OCID as an identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the HSM resource. Each HSM resource has a unique OCID as an identifier.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment that contains a particular HSM resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains a particular HSM resource.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Details of a single portInformation item include the PortNumber (an integer used as an identifier) and the PortType (refers to either an enum value of Managementutility,Clientutility, or null)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("portInformation")
    private final java.util.List<PortInformation> portInformation;

    /**
     * Details of a single portInformation item include the PortNumber (an integer used as an identifier) and the PortType (refers to either an enum value of Managementutility,Clientutility, or null)
     * @return the value
     **/
    public java.util.List<PortInformation> getPortInformation() {
        return portInformation;
    }

    /**
     * The date and time a HSMPartition was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * <p>
     * Example: {@code 2018-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time a HSMPartition was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * <p>
     * Example: {@code 2018-04-03T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time a HSMPartition was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * <p>
     * Example: {@code 2018-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time a HSMPartition was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * <p>
     * Example: {@code 2018-04-03T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * A HSMCluster resource's current lifecycle state.
     * <p>
     * Example: {@code ACTIVE}
     *
     **/
    public enum LifecycleState {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Activating("ACTIVATING"),
        ActivationRequired("ACTIVATION_REQUIRED"),
        SchedulingDeletion("SCHEDULING_DELETION"),
        PendingDeletion("PENDING_DELETION"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * A HSMCluster resource's current lifecycle state.
     * <p>
     * Example: {@code ACTIVE}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * A HSMCluster resource's current lifecycle state.
     * <p>
     * Example: {@code ACTIVE}
     *
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("HsmPartition(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", portInformation=").append(String.valueOf(this.portInformation));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HsmPartition)) {
            return false;
        }

        HsmPartition other = (HsmPartition) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.portInformation, other.portInformation)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.portInformation == null ? 43 : this.portInformation.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

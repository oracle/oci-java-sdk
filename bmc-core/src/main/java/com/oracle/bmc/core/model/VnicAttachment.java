/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Represents an attachment between a VNIC and an instance. For more information, see [Virtual
 * Network Interface Cards
 * (VNICs)](https://docs.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VnicAttachment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VnicAttachment
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "compartmentId",
        "displayName",
        "id",
        "instanceId",
        "lifecycleState",
        "nicIndex",
        "subnetId",
        "vlanId",
        "timeCreated",
        "vlanTag",
        "vnicId"
    })
    public VnicAttachment(
            String availabilityDomain,
            String compartmentId,
            String displayName,
            String id,
            String instanceId,
            LifecycleState lifecycleState,
            Integer nicIndex,
            String subnetId,
            String vlanId,
            java.util.Date timeCreated,
            Integer vlanTag,
            String vnicId) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.id = id;
        this.instanceId = instanceId;
        this.lifecycleState = lifecycleState;
        this.nicIndex = nicIndex;
        this.subnetId = subnetId;
        this.vlanId = vlanId;
        this.timeCreated = timeCreated;
        this.vlanTag = vlanTag;
        this.vnicId = vnicId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The availability domain of the instance.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain of the instance.
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
         * The OCID of the compartment the VNIC attachment is in, which is the same compartment the
         * instance is in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment the VNIC attachment is in, which is the same compartment the
         * instance is in.
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
        /** The OCID of the VNIC attachment. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the VNIC attachment.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * The OCID of the instance.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /** The current state of the VNIC attachment. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the VNIC attachment.
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
         * Which physical network interface card (NIC) the VNIC uses. Certain bare metal instance
         * shapes have two active physical NICs (0 and 1). If you add a secondary VNIC to one of
         * these instances, you can specify which NIC the VNIC will use. For more information, see
         * [Virtual Network Interface Cards
         * (VNICs)](https://docs.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nicIndex")
        private Integer nicIndex;

        /**
         * Which physical network interface card (NIC) the VNIC uses. Certain bare metal instance
         * shapes have two active physical NICs (0 and 1). If you add a secondary VNIC to one of
         * these instances, you can specify which NIC the VNIC will use. For more information, see
         * [Virtual Network Interface Cards
         * (VNICs)](https://docs.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
         *
         * @param nicIndex the value to set
         * @return this builder
         */
        public Builder nicIndex(Integer nicIndex) {
            this.nicIndex = nicIndex;
            this.__explicitlySet__.add("nicIndex");
            return this;
        }
        /** The OCID of the subnet to create the VNIC in. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the subnet to create the VNIC in.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The OCID of the VLAN to create the VNIC in. Creating the VNIC in a VLAN (instead of a
         * subnet) is possible only if you are an Oracle Cloud VMware Solution customer. See {@link
         * Vlan}.
         *
         * <p>An error is returned if the instance already has a VNIC attached to it from this VLAN.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
        private String vlanId;

        /**
         * The OCID of the VLAN to create the VNIC in. Creating the VNIC in a VLAN (instead of a
         * subnet) is possible only if you are an Oracle Cloud VMware Solution customer. See {@link
         * Vlan}.
         *
         * <p>An error is returned if the instance already has a VNIC attached to it from this VLAN.
         *
         * @param vlanId the value to set
         * @return this builder
         */
        public Builder vlanId(String vlanId) {
            this.vlanId = vlanId;
            this.__explicitlySet__.add("vlanId");
            return this;
        }
        /**
         * The date and time the VNIC attachment was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the VNIC attachment was created, in the format defined by
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
         * The Oracle-assigned VLAN tag of the attached VNIC. Available after the attachment process
         * is complete.
         *
         * <p>However, if the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution,
         * the {@code vlanTag} value is instead the value of the {@code vlanTag} attribute for the
         * VLAN. See {@link Vlan}.
         *
         * <p>Example: {@code 0}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vlanTag")
        private Integer vlanTag;

        /**
         * The Oracle-assigned VLAN tag of the attached VNIC. Available after the attachment process
         * is complete.
         *
         * <p>However, if the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution,
         * the {@code vlanTag} value is instead the value of the {@code vlanTag} attribute for the
         * VLAN. See {@link Vlan}.
         *
         * <p>Example: {@code 0}
         *
         * @param vlanTag the value to set
         * @return this builder
         */
        public Builder vlanTag(Integer vlanTag) {
            this.vlanTag = vlanTag;
            this.__explicitlySet__.add("vlanTag");
            return this;
        }
        /** The OCID of the VNIC. Available after the attachment process is complete. */
        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        /**
         * The OCID of the VNIC. Available after the attachment process is complete.
         *
         * @param vnicId the value to set
         * @return this builder
         */
        public Builder vnicId(String vnicId) {
            this.vnicId = vnicId;
            this.__explicitlySet__.add("vnicId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VnicAttachment build() {
            VnicAttachment model =
                    new VnicAttachment(
                            this.availabilityDomain,
                            this.compartmentId,
                            this.displayName,
                            this.id,
                            this.instanceId,
                            this.lifecycleState,
                            this.nicIndex,
                            this.subnetId,
                            this.vlanId,
                            this.timeCreated,
                            this.vlanTag,
                            this.vnicId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VnicAttachment model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("nicIndex")) {
                this.nicIndex(model.getNicIndex());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("vlanId")) {
                this.vlanId(model.getVlanId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("vlanTag")) {
                this.vlanTag(model.getVlanTag());
            }
            if (model.wasPropertyExplicitlySet("vnicId")) {
                this.vnicId(model.getVnicId());
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
     * The availability domain of the instance.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain of the instance.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The OCID of the compartment the VNIC attachment is in, which is the same compartment the
     * instance is in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment the VNIC attachment is in, which is the same compartment the
     * instance is in.
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

    /** The OCID of the VNIC attachment. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the VNIC attachment.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * The OCID of the instance.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /** The current state of the VNIC attachment. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Attaching("ATTACHING"),
        Attached("ATTACHED"),
        Detaching("DETACHING"),
        Detached("DETACHED"),

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
    /** The current state of the VNIC attachment. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the VNIC attachment.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Which physical network interface card (NIC) the VNIC uses. Certain bare metal instance shapes
     * have two active physical NICs (0 and 1). If you add a secondary VNIC to one of these
     * instances, you can specify which NIC the VNIC will use. For more information, see [Virtual
     * Network Interface Cards
     * (VNICs)](https://docs.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nicIndex")
    private final Integer nicIndex;

    /**
     * Which physical network interface card (NIC) the VNIC uses. Certain bare metal instance shapes
     * have two active physical NICs (0 and 1). If you add a secondary VNIC to one of these
     * instances, you can specify which NIC the VNIC will use. For more information, see [Virtual
     * Network Interface Cards
     * (VNICs)](https://docs.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
     *
     * @return the value
     */
    public Integer getNicIndex() {
        return nicIndex;
    }

    /** The OCID of the subnet to create the VNIC in. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the subnet to create the VNIC in.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The OCID of the VLAN to create the VNIC in. Creating the VNIC in a VLAN (instead of a subnet)
     * is possible only if you are an Oracle Cloud VMware Solution customer. See {@link Vlan}.
     *
     * <p>An error is returned if the instance already has a VNIC attached to it from this VLAN.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
    private final String vlanId;

    /**
     * The OCID of the VLAN to create the VNIC in. Creating the VNIC in a VLAN (instead of a subnet)
     * is possible only if you are an Oracle Cloud VMware Solution customer. See {@link Vlan}.
     *
     * <p>An error is returned if the instance already has a VNIC attached to it from this VLAN.
     *
     * @return the value
     */
    public String getVlanId() {
        return vlanId;
    }

    /**
     * The date and time the VNIC attachment was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the VNIC attachment was created, in the format defined by
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
     * The Oracle-assigned VLAN tag of the attached VNIC. Available after the attachment process is
     * complete.
     *
     * <p>However, if the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution, the
     * {@code vlanTag} value is instead the value of the {@code vlanTag} attribute for the VLAN. See
     * {@link Vlan}.
     *
     * <p>Example: {@code 0}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vlanTag")
    private final Integer vlanTag;

    /**
     * The Oracle-assigned VLAN tag of the attached VNIC. Available after the attachment process is
     * complete.
     *
     * <p>However, if the VNIC belongs to a VLAN as part of the Oracle Cloud VMware Solution, the
     * {@code vlanTag} value is instead the value of the {@code vlanTag} attribute for the VLAN. See
     * {@link Vlan}.
     *
     * <p>Example: {@code 0}
     *
     * @return the value
     */
    public Integer getVlanTag() {
        return vlanTag;
    }

    /** The OCID of the VNIC. Available after the attachment process is complete. */
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    private final String vnicId;

    /**
     * The OCID of the VNIC. Available after the attachment process is complete.
     *
     * @return the value
     */
    public String getVnicId() {
        return vnicId;
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
        sb.append("VnicAttachment(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", nicIndex=").append(String.valueOf(this.nicIndex));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", vlanId=").append(String.valueOf(this.vlanId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", vlanTag=").append(String.valueOf(this.vlanTag));
        sb.append(", vnicId=").append(String.valueOf(this.vnicId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VnicAttachment)) {
            return false;
        }

        VnicAttachment other = (VnicAttachment) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.nicIndex, other.nicIndex)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.vlanId, other.vlanId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.vlanTag, other.vlanTag)
                && java.util.Objects.equals(this.vnicId, other.vnicId)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.nicIndex == null ? 43 : this.nicIndex.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.vlanId == null ? 43 : this.vlanId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.vlanTag == null ? 43 : this.vlanTag.hashCode());
        result = (result * PRIME) + (this.vnicId == null ? 43 : this.vnicId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

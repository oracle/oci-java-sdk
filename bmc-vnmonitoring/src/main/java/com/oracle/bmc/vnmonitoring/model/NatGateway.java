/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * A NAT (Network Address Translation) gateway, which represents a router that lets instances
 * without public IPs contact the public internet without exposing the instance to inbound
 * internet traffic. For more information, see
 * [NAT Gateway](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/NATgateway.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an
 * IAM policy. If you are not authorized, talk to an
 * administrator. If you are an administrator who needs to write
 * policies to give users access, see [Getting Started with
 * Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NatGateway.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NatGateway extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "id",
        "blockTraffic",
        "lifecycleState",
        "natIp",
        "timeCreated",
        "vcnId",
        "publicIpId",
        "routeTableId"
    })
    public NatGateway(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            Boolean blockTraffic,
            LifecycleState lifecycleState,
            String natIp,
            java.util.Date timeCreated,
            String vcnId,
            String publicIpId,
            String routeTableId) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.blockTraffic = blockTraffic;
        this.lifecycleState = lifecycleState;
        this.natIp = natIp;
        this.timeCreated = timeCreated;
        this.vcnId = vcnId;
        this.publicIpId = publicIpId;
        this.routeTableId = routeTableId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains
         * the NAT gateway.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains
         * the NAT gateway.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * NAT gateway.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * NAT gateway.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Whether the NAT gateway blocks traffic through it. The default is {@code false}.
         * <p>
         * Example: {@code true}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("blockTraffic")
        private Boolean blockTraffic;

        /**
         * Whether the NAT gateway blocks traffic through it. The default is {@code false}.
         * <p>
         * Example: {@code true}
         *
         * @param blockTraffic the value to set
         * @return this builder
         **/
        public Builder blockTraffic(Boolean blockTraffic) {
            this.blockTraffic = blockTraffic;
            this.__explicitlySet__.add("blockTraffic");
            return this;
        }
        /**
         * The NAT gateway's current state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The NAT gateway's current state.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The IP address associated with the NAT gateway.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("natIp")
        private String natIp;

        /**
         * The IP address associated with the NAT gateway.
         *
         * @param natIp the value to set
         * @return this builder
         **/
        public Builder natIp(String natIp) {
            this.natIp = natIp;
            this.__explicitlySet__.add("natIp");
            return this;
        }
        /**
         * The date and time the NAT gateway was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the NAT gateway was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         * Example: {@code 2016-08-25T21:10:29.600Z}
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN the NAT gateway
         * belongs to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN the NAT gateway
         * belongs to.
         *
         * @param vcnId the value to set
         * @return this builder
         **/
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the public IP address associated with the NAT gateway.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicIpId")
        private String publicIpId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the public IP address associated with the NAT gateway.
         *
         * @param publicIpId the value to set
         * @return this builder
         **/
        public Builder publicIpId(String publicIpId) {
            this.publicIpId = publicIpId;
            this.__explicitlySet__.add("publicIpId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table used by the NAT gateway.
         * <p>
         * If you don't specify a route table here, the NAT gateway is created without an associated route
         * table. The Networking service does NOT automatically associate the attached VCN's default route table
         * with the NAT gateway.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table used by the NAT gateway.
         * <p>
         * If you don't specify a route table here, the NAT gateway is created without an associated route
         * table. The Networking service does NOT automatically associate the attached VCN's default route table
         * with the NAT gateway.
         *
         * @param routeTableId the value to set
         * @return this builder
         **/
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NatGateway build() {
            NatGateway model =
                    new NatGateway(
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.id,
                            this.blockTraffic,
                            this.lifecycleState,
                            this.natIp,
                            this.timeCreated,
                            this.vcnId,
                            this.publicIpId,
                            this.routeTableId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NatGateway model) {
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
            if (model.wasPropertyExplicitlySet("blockTraffic")) {
                this.blockTraffic(model.getBlockTraffic());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("natIp")) {
                this.natIp(model.getNatIp());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("publicIpId")) {
                this.publicIpId(model.getPublicIpId());
            }
            if (model.wasPropertyExplicitlySet("routeTableId")) {
                this.routeTableId(model.getRouteTableId());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains
     * the NAT gateway.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains
     * the NAT gateway.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * NAT gateway.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * NAT gateway.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Whether the NAT gateway blocks traffic through it. The default is {@code false}.
     * <p>
     * Example: {@code true}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockTraffic")
    private final Boolean blockTraffic;

    /**
     * Whether the NAT gateway blocks traffic through it. The default is {@code false}.
     * <p>
     * Example: {@code true}
     *
     * @return the value
     **/
    public Boolean getBlockTraffic() {
        return blockTraffic;
    }

    /**
     * The NAT gateway's current state.
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };
    /**
     * The NAT gateway's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The NAT gateway's current state.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The IP address associated with the NAT gateway.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("natIp")
    private final String natIp;

    /**
     * The IP address associated with the NAT gateway.
     *
     * @return the value
     **/
    public String getNatIp() {
        return natIp;
    }

    /**
     * The date and time the NAT gateway was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the NAT gateway was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN the NAT gateway
     * belongs to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN the NAT gateway
     * belongs to.
     *
     * @return the value
     **/
    public String getVcnId() {
        return vcnId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the public IP address associated with the NAT gateway.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicIpId")
    private final String publicIpId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the public IP address associated with the NAT gateway.
     *
     * @return the value
     **/
    public String getPublicIpId() {
        return publicIpId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table used by the NAT gateway.
     * <p>
     * If you don't specify a route table here, the NAT gateway is created without an associated route
     * table. The Networking service does NOT automatically associate the attached VCN's default route table
     * with the NAT gateway.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    private final String routeTableId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table used by the NAT gateway.
     * <p>
     * If you don't specify a route table here, the NAT gateway is created without an associated route
     * table. The Networking service does NOT automatically associate the attached VCN's default route table
     * with the NAT gateway.
     *
     * @return the value
     **/
    public String getRouteTableId() {
        return routeTableId;
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
        sb.append("NatGateway(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", blockTraffic=").append(String.valueOf(this.blockTraffic));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", natIp=").append(String.valueOf(this.natIp));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", publicIpId=").append(String.valueOf(this.publicIpId));
        sb.append(", routeTableId=").append(String.valueOf(this.routeTableId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NatGateway)) {
            return false;
        }

        NatGateway other = (NatGateway) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.blockTraffic, other.blockTraffic)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.natIp, other.natIp)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.publicIpId, other.publicIpId)
                && java.util.Objects.equals(this.routeTableId, other.routeTableId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.blockTraffic == null ? 43 : this.blockTraffic.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.natIp == null ? 43 : this.natIp.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.publicIpId == null ? 43 : this.publicIpId.hashCode());
        result = (result * PRIME) + (this.routeTableId == null ? 43 : this.routeTableId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

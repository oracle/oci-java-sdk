/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A local peering gateway (LPG) is an object on a VCN that lets that VCN peer with another VCN in
 * the same region. *Peering* means that the two VCNs can communicate using private IP addresses,
 * but without the traffic traversing the internet or routing through your on-premises network. For
 * more information, see [VCN
 * Peering](https://docs.oracle.com/iaas/Content/Network/Tasks/VCNpeering.htm).
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm). <br>
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
        builder = LocalPeeringGateway.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LocalPeeringGateway
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTags",
        "displayName",
        "freeformTags",
        "securityAttributes",
        "id",
        "isCrossTenancyPeering",
        "lifecycleState",
        "peerAdvertisedCidr",
        "peerAdvertisedCidrDetails",
        "peeringStatus",
        "peeringStatusDetails",
        "peerId",
        "routeTableId",
        "timeCreated",
        "vcnId"
    })
    public LocalPeeringGateway(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            String id,
            Boolean isCrossTenancyPeering,
            LifecycleState lifecycleState,
            String peerAdvertisedCidr,
            java.util.List<String> peerAdvertisedCidrDetails,
            PeeringStatus peeringStatus,
            String peeringStatusDetails,
            String peerId,
            String routeTableId,
            java.util.Date timeCreated,
            String vcnId) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.securityAttributes = securityAttributes;
        this.id = id;
        this.isCrossTenancyPeering = isCrossTenancyPeering;
        this.lifecycleState = lifecycleState;
        this.peerAdvertisedCidr = peerAdvertisedCidr;
        this.peerAdvertisedCidrDetails = peerAdvertisedCidrDetails;
        this.peeringStatus = peeringStatus;
        this.peeringStatusDetails = peeringStatusDetails;
        this.peerId = peerId;
        this.routeTableId = routeTableId;
        this.timeCreated = timeCreated;
        this.vcnId = vcnId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the LPG.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the LPG.
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
         * [Security
         * attributes](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
         * are labels for a resource that can be referenced in a [Zero Trust Packet
         * Routing](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm)
         * (ZPR) policy to control access to ZPR-supported resources.
         *
         * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
         * {"value":"42","mode":"audit"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * [Security
         * attributes](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
         * are labels for a resource that can be referenced in a [Zero Trust Packet
         * Routing](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm)
         * (ZPR) policy to control access to ZPR-supported resources.
         *
         * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
         * {"value":"42","mode":"audit"}}}}
         *
         * @param securityAttributes the value to set
         * @return this builder
         */
        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
            return this;
        }
        /**
         * The LPG's Oracle ID
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The LPG's Oracle ID
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
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
         * Whether the VCN at the other end of the peering is in a different tenancy.
         *
         * <p>Example: {@code false}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCrossTenancyPeering")
        private Boolean isCrossTenancyPeering;

        /**
         * Whether the VCN at the other end of the peering is in a different tenancy.
         *
         * <p>Example: {@code false}
         *
         * @param isCrossTenancyPeering the value to set
         * @return this builder
         */
        public Builder isCrossTenancyPeering(Boolean isCrossTenancyPeering) {
            this.isCrossTenancyPeering = isCrossTenancyPeering;
            this.__explicitlySet__.add("isCrossTenancyPeering");
            return this;
        }
        /** The LPG's current lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The LPG's current lifecycle state.
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
         * The smallest aggregate CIDR that contains all the CIDR routes advertised by the VCN at
         * the other end of the peering from this LPG. See {@code peerAdvertisedCidrDetails} for the
         * individual CIDRs. The value is {@code null} if the LPG is not peered.
         *
         * <p>Example: {@code 192.168.0.0/16}, or if aggregated with {@code 172.16.0.0/24} then
         * {@code 128.0.0.0/1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerAdvertisedCidr")
        private String peerAdvertisedCidr;

        /**
         * The smallest aggregate CIDR that contains all the CIDR routes advertised by the VCN at
         * the other end of the peering from this LPG. See {@code peerAdvertisedCidrDetails} for the
         * individual CIDRs. The value is {@code null} if the LPG is not peered.
         *
         * <p>Example: {@code 192.168.0.0/16}, or if aggregated with {@code 172.16.0.0/24} then
         * {@code 128.0.0.0/1}
         *
         * @param peerAdvertisedCidr the value to set
         * @return this builder
         */
        public Builder peerAdvertisedCidr(String peerAdvertisedCidr) {
            this.peerAdvertisedCidr = peerAdvertisedCidr;
            this.__explicitlySet__.add("peerAdvertisedCidr");
            return this;
        }
        /**
         * The specific ranges of IP addresses available on or via the VCN at the other end of the
         * peering from this LPG. The value is {@code null} if the LPG is not peered. You can use
         * these as destination CIDRs for route rules to route a subnet's traffic to this LPG.
         *
         * <p>Example: [{@code 192.168.0.0/16}, {@code 172.16.0.0/24}]
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerAdvertisedCidrDetails")
        private java.util.List<String> peerAdvertisedCidrDetails;

        /**
         * The specific ranges of IP addresses available on or via the VCN at the other end of the
         * peering from this LPG. The value is {@code null} if the LPG is not peered. You can use
         * these as destination CIDRs for route rules to route a subnet's traffic to this LPG.
         *
         * <p>Example: [{@code 192.168.0.0/16}, {@code 172.16.0.0/24}]
         *
         * @param peerAdvertisedCidrDetails the value to set
         * @return this builder
         */
        public Builder peerAdvertisedCidrDetails(java.util.List<String> peerAdvertisedCidrDetails) {
            this.peerAdvertisedCidrDetails = peerAdvertisedCidrDetails;
            this.__explicitlySet__.add("peerAdvertisedCidrDetails");
            return this;
        }
        /**
         * Whether the LPG is peered with another LPG. {@code NEW} means the LPG has not yet been
         * peered. {@code PENDING} means the peering is being established. {@code REVOKED} means the
         * LPG at the other end of the peering has been deleted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peeringStatus")
        private PeeringStatus peeringStatus;

        /**
         * Whether the LPG is peered with another LPG. {@code NEW} means the LPG has not yet been
         * peered. {@code PENDING} means the peering is being established. {@code REVOKED} means the
         * LPG at the other end of the peering has been deleted.
         *
         * @param peeringStatus the value to set
         * @return this builder
         */
        public Builder peeringStatus(PeeringStatus peeringStatus) {
            this.peeringStatus = peeringStatus;
            this.__explicitlySet__.add("peeringStatus");
            return this;
        }
        /** Additional information regarding the peering status, if applicable. */
        @com.fasterxml.jackson.annotation.JsonProperty("peeringStatusDetails")
        private String peeringStatusDetails;

        /**
         * Additional information regarding the peering status, if applicable.
         *
         * @param peeringStatusDetails the value to set
         * @return this builder
         */
        public Builder peeringStatusDetails(String peeringStatusDetails) {
            this.peeringStatusDetails = peeringStatusDetails;
            this.__explicitlySet__.add("peeringStatusDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * peered LPG.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerId")
        private String peerId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * peered LPG.
         *
         * @param peerId the value to set
         * @return this builder
         */
        public Builder peerId(String peerId) {
            this.peerId = peerId;
            this.__explicitlySet__.add("peerId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * route table the LPG is using.
         *
         * <p>For information about why you would associate a route table with an LPG, see [Transit
         * Routing: Access to Multiple VCNs in Same
         * Region](https://docs.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * route table the LPG is using.
         *
         * <p>For information about why you would associate a route table with an LPG, see [Transit
         * Routing: Access to Multiple VCNs in Same
         * Region](https://docs.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm).
         *
         * @param routeTableId the value to set
         * @return this builder
         */
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }
        /**
         * The date and time the LPG was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the LPG was created, in the format defined by
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VCN that uses the LPG.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VCN that uses the LPG.
         *
         * @param vcnId the value to set
         * @return this builder
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LocalPeeringGateway build() {
            LocalPeeringGateway model =
                    new LocalPeeringGateway(
                            this.compartmentId,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.securityAttributes,
                            this.id,
                            this.isCrossTenancyPeering,
                            this.lifecycleState,
                            this.peerAdvertisedCidr,
                            this.peerAdvertisedCidrDetails,
                            this.peeringStatus,
                            this.peeringStatusDetails,
                            this.peerId,
                            this.routeTableId,
                            this.timeCreated,
                            this.vcnId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LocalPeeringGateway model) {
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
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("isCrossTenancyPeering")) {
                this.isCrossTenancyPeering(model.getIsCrossTenancyPeering());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("peerAdvertisedCidr")) {
                this.peerAdvertisedCidr(model.getPeerAdvertisedCidr());
            }
            if (model.wasPropertyExplicitlySet("peerAdvertisedCidrDetails")) {
                this.peerAdvertisedCidrDetails(model.getPeerAdvertisedCidrDetails());
            }
            if (model.wasPropertyExplicitlySet("peeringStatus")) {
                this.peeringStatus(model.getPeeringStatus());
            }
            if (model.wasPropertyExplicitlySet("peeringStatusDetails")) {
                this.peeringStatusDetails(model.getPeeringStatusDetails());
            }
            if (model.wasPropertyExplicitlySet("peerId")) {
                this.peerId(model.getPeerId());
            }
            if (model.wasPropertyExplicitlySet("routeTableId")) {
                this.routeTableId(model.getRouteTableId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the LPG.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the LPG.
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
     * [Security
     * attributes](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
     * are labels for a resource that can be referenced in a [Zero Trust Packet
     * Routing](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm) (ZPR)
     * policy to control access to ZPR-supported resources.
     *
     * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
     * {"value":"42","mode":"audit"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * [Security
     * attributes](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
     * are labels for a resource that can be referenced in a [Zero Trust Packet
     * Routing](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm) (ZPR)
     * policy to control access to ZPR-supported resources.
     *
     * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
     * {"value":"42","mode":"audit"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
    }

    /**
     * The LPG's Oracle ID
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The LPG's Oracle ID
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * Whether the VCN at the other end of the peering is in a different tenancy.
     *
     * <p>Example: {@code false}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isCrossTenancyPeering")
    private final Boolean isCrossTenancyPeering;

    /**
     * Whether the VCN at the other end of the peering is in a different tenancy.
     *
     * <p>Example: {@code false}
     *
     * @return the value
     */
    public Boolean getIsCrossTenancyPeering() {
        return isCrossTenancyPeering;
    }

    /** The LPG's current lifecycle state. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

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
    /** The LPG's current lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The LPG's current lifecycle state.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The smallest aggregate CIDR that contains all the CIDR routes advertised by the VCN at the
     * other end of the peering from this LPG. See {@code peerAdvertisedCidrDetails} for the
     * individual CIDRs. The value is {@code null} if the LPG is not peered.
     *
     * <p>Example: {@code 192.168.0.0/16}, or if aggregated with {@code 172.16.0.0/24} then {@code
     * 128.0.0.0/1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerAdvertisedCidr")
    private final String peerAdvertisedCidr;

    /**
     * The smallest aggregate CIDR that contains all the CIDR routes advertised by the VCN at the
     * other end of the peering from this LPG. See {@code peerAdvertisedCidrDetails} for the
     * individual CIDRs. The value is {@code null} if the LPG is not peered.
     *
     * <p>Example: {@code 192.168.0.0/16}, or if aggregated with {@code 172.16.0.0/24} then {@code
     * 128.0.0.0/1}
     *
     * @return the value
     */
    public String getPeerAdvertisedCidr() {
        return peerAdvertisedCidr;
    }

    /**
     * The specific ranges of IP addresses available on or via the VCN at the other end of the
     * peering from this LPG. The value is {@code null} if the LPG is not peered. You can use these
     * as destination CIDRs for route rules to route a subnet's traffic to this LPG.
     *
     * <p>Example: [{@code 192.168.0.0/16}, {@code 172.16.0.0/24}]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerAdvertisedCidrDetails")
    private final java.util.List<String> peerAdvertisedCidrDetails;

    /**
     * The specific ranges of IP addresses available on or via the VCN at the other end of the
     * peering from this LPG. The value is {@code null} if the LPG is not peered. You can use these
     * as destination CIDRs for route rules to route a subnet's traffic to this LPG.
     *
     * <p>Example: [{@code 192.168.0.0/16}, {@code 172.16.0.0/24}]
     *
     * @return the value
     */
    public java.util.List<String> getPeerAdvertisedCidrDetails() {
        return peerAdvertisedCidrDetails;
    }

    /**
     * Whether the LPG is peered with another LPG. {@code NEW} means the LPG has not yet been
     * peered. {@code PENDING} means the peering is being established. {@code REVOKED} means the LPG
     * at the other end of the peering has been deleted.
     */
    public enum PeeringStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Invalid("INVALID"),
        New("NEW"),
        Peered("PEERED"),
        Pending("PENDING"),
        Revoked("REVOKED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PeeringStatus.class);

        private final String value;
        private static java.util.Map<String, PeeringStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (PeeringStatus v : PeeringStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PeeringStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PeeringStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PeeringStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Whether the LPG is peered with another LPG. {@code NEW} means the LPG has not yet been
     * peered. {@code PENDING} means the peering is being established. {@code REVOKED} means the LPG
     * at the other end of the peering has been deleted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peeringStatus")
    private final PeeringStatus peeringStatus;

    /**
     * Whether the LPG is peered with another LPG. {@code NEW} means the LPG has not yet been
     * peered. {@code PENDING} means the peering is being established. {@code REVOKED} means the LPG
     * at the other end of the peering has been deleted.
     *
     * @return the value
     */
    public PeeringStatus getPeeringStatus() {
        return peeringStatus;
    }

    /** Additional information regarding the peering status, if applicable. */
    @com.fasterxml.jackson.annotation.JsonProperty("peeringStatusDetails")
    private final String peeringStatusDetails;

    /**
     * Additional information regarding the peering status, if applicable.
     *
     * @return the value
     */
    public String getPeeringStatusDetails() {
        return peeringStatusDetails;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * peered LPG.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerId")
    private final String peerId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * peered LPG.
     *
     * @return the value
     */
    public String getPeerId() {
        return peerId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * route table the LPG is using.
     *
     * <p>For information about why you would associate a route table with an LPG, see [Transit
     * Routing: Access to Multiple VCNs in Same
     * Region](https://docs.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    private final String routeTableId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * route table the LPG is using.
     *
     * <p>For information about why you would associate a route table with an LPG, see [Transit
     * Routing: Access to Multiple VCNs in Same
     * Region](https://docs.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm).
     *
     * @return the value
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * The date and time the LPG was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the LPG was created, in the format defined by
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN
     * that uses the LPG.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN
     * that uses the LPG.
     *
     * @return the value
     */
    public String getVcnId() {
        return vcnId;
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
        sb.append("LocalPeeringGateway(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", isCrossTenancyPeering=").append(String.valueOf(this.isCrossTenancyPeering));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", peerAdvertisedCidr=").append(String.valueOf(this.peerAdvertisedCidr));
        sb.append(", peerAdvertisedCidrDetails=")
                .append(String.valueOf(this.peerAdvertisedCidrDetails));
        sb.append(", peeringStatus=").append(String.valueOf(this.peeringStatus));
        sb.append(", peeringStatusDetails=").append(String.valueOf(this.peeringStatusDetails));
        sb.append(", peerId=").append(String.valueOf(this.peerId));
        sb.append(", routeTableId=").append(String.valueOf(this.routeTableId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LocalPeeringGateway)) {
            return false;
        }

        LocalPeeringGateway other = (LocalPeeringGateway) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.isCrossTenancyPeering, other.isCrossTenancyPeering)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.peerAdvertisedCidr, other.peerAdvertisedCidr)
                && java.util.Objects.equals(
                        this.peerAdvertisedCidrDetails, other.peerAdvertisedCidrDetails)
                && java.util.Objects.equals(this.peeringStatus, other.peeringStatus)
                && java.util.Objects.equals(this.peeringStatusDetails, other.peeringStatusDetails)
                && java.util.Objects.equals(this.peerId, other.peerId)
                && java.util.Objects.equals(this.routeTableId, other.routeTableId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
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
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.isCrossTenancyPeering == null
                                ? 43
                                : this.isCrossTenancyPeering.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.peerAdvertisedCidr == null
                                ? 43
                                : this.peerAdvertisedCidr.hashCode());
        result =
                (result * PRIME)
                        + (this.peerAdvertisedCidrDetails == null
                                ? 43
                                : this.peerAdvertisedCidrDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.peeringStatus == null ? 43 : this.peeringStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.peeringStatusDetails == null
                                ? 43
                                : this.peeringStatusDetails.hashCode());
        result = (result * PRIME) + (this.peerId == null ? 43 : this.peerId.hashCode());
        result = (result * PRIME) + (this.routeTableId == null ? 43 : this.routeTableId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

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
        "id",
        "isCrossTenancyPeering",
        "lifecycleState",
        "peerAdvertisedCidr",
        "peeringStatus",
        "peeringStatusDetails",
        "timeCreated",
        "vcnId"
    })
    public LocalPeeringGateway(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String id,
            Boolean isCrossTenancyPeering,
            LifecycleState lifecycleState,
            String peerAdvertisedCidr,
            PeeringStatus peeringStatus,
            String peeringStatusDetails,
            java.util.Date timeCreated,
            String vcnId) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.isCrossTenancyPeering = isCrossTenancyPeering;
        this.lifecycleState = lifecycleState;
        this.peerAdvertisedCidr = peerAdvertisedCidr;
        this.peeringStatus = peeringStatus;
        this.peeringStatusDetails = peeringStatusDetails;
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * The range of IP addresses available on the VCN at the other end of the peering from this
         * LPG. The value is {@code null} if the LPG is not peered. You can use this as the
         * destination CIDR for a route rule to route a subnet's traffic to this LPG.
         *
         * <p>Example: {@code 192.168.0.0/16}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerAdvertisedCidr")
        private String peerAdvertisedCidr;

        /**
         * The range of IP addresses available on the VCN at the other end of the peering from this
         * LPG. The value is {@code null} if the LPG is not peered. You can use this as the
         * destination CIDR for a route rule to route a subnet's traffic to this LPG.
         *
         * <p>Example: {@code 192.168.0.0/16}
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
                            this.id,
                            this.isCrossTenancyPeering,
                            this.lifecycleState,
                            this.peerAdvertisedCidr,
                            this.peeringStatus,
                            this.peeringStatusDetails,
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
            if (model.wasPropertyExplicitlySet("peeringStatus")) {
                this.peeringStatus(model.getPeeringStatus());
            }
            if (model.wasPropertyExplicitlySet("peeringStatusDetails")) {
                this.peeringStatusDetails(model.getPeeringStatusDetails());
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
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
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
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
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
     * The range of IP addresses available on the VCN at the other end of the peering from this LPG.
     * The value is {@code null} if the LPG is not peered. You can use this as the destination CIDR
     * for a route rule to route a subnet's traffic to this LPG.
     *
     * <p>Example: {@code 192.168.0.0/16}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerAdvertisedCidr")
    private final String peerAdvertisedCidr;

    /**
     * The range of IP addresses available on the VCN at the other end of the peering from this LPG.
     * The value is {@code null} if the LPG is not peered. You can use this as the destination CIDR
     * for a route rule to route a subnet's traffic to this LPG.
     *
     * <p>Example: {@code 192.168.0.0/16}
     *
     * @return the value
     */
    public String getPeerAdvertisedCidr() {
        return peerAdvertisedCidr;
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
        ;

        private final String value;
        private static java.util.Map<String, PeeringStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (PeeringStatus v : PeeringStatus.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid PeeringStatus: " + key);
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
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", isCrossTenancyPeering=").append(String.valueOf(this.isCrossTenancyPeering));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", peerAdvertisedCidr=").append(String.valueOf(this.peerAdvertisedCidr));
        sb.append(", peeringStatus=").append(String.valueOf(this.peeringStatus));
        sb.append(", peeringStatusDetails=").append(String.valueOf(this.peeringStatusDetails));
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
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.isCrossTenancyPeering, other.isCrossTenancyPeering)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.peerAdvertisedCidr, other.peerAdvertisedCidr)
                && java.util.Objects.equals(this.peeringStatus, other.peeringStatus)
                && java.util.Objects.equals(this.peeringStatusDetails, other.peeringStatusDetails)
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
                        + (this.peeringStatus == null ? 43 : this.peeringStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.peeringStatusDetails == null
                                ? 43
                                : this.peeringStatusDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

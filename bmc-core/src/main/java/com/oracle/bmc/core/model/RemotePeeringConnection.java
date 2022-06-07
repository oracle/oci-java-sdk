/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A remote peering connection (RPC) is an object on a DRG that lets the VCN that is attached
 * to the DRG peer with a VCN in a different region. *Peering* means that the two VCNs can
 * communicate using private IP addresses, but without the traffic traversing the internet or
 * routing through your on-premises network. For more information, see
 * [VCN Peering](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/VCNpeering.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RemotePeeringConnection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RemotePeeringConnection {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTags",
        "displayName",
        "drgId",
        "freeformTags",
        "id",
        "isCrossTenancyPeering",
        "lifecycleState",
        "peerId",
        "peerRegionName",
        "peerTenancyId",
        "peeringStatus",
        "timeCreated"
    })
    public RemotePeeringConnection(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            String drgId,
            java.util.Map<String, String> freeformTags,
            String id,
            Boolean isCrossTenancyPeering,
            LifecycleState lifecycleState,
            String peerId,
            String peerRegionName,
            String peerTenancyId,
            PeeringStatus peeringStatus,
            java.util.Date timeCreated) {
        super();
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.drgId = drgId;
        this.freeformTags = freeformTags;
        this.id = id;
        this.isCrossTenancyPeering = isCrossTenancyPeering;
        this.lifecycleState = lifecycleState;
        this.peerId = peerId;
        this.peerRegionName = peerRegionName;
        this.peerTenancyId = peerTenancyId;
        this.peeringStatus = peeringStatus;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("drgId")
        private String drgId;

        public Builder drgId(String drgId) {
            this.drgId = drgId;
            this.__explicitlySet__.add("drgId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCrossTenancyPeering")
        private Boolean isCrossTenancyPeering;

        public Builder isCrossTenancyPeering(Boolean isCrossTenancyPeering) {
            this.isCrossTenancyPeering = isCrossTenancyPeering;
            this.__explicitlySet__.add("isCrossTenancyPeering");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerId")
        private String peerId;

        public Builder peerId(String peerId) {
            this.peerId = peerId;
            this.__explicitlySet__.add("peerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerRegionName")
        private String peerRegionName;

        public Builder peerRegionName(String peerRegionName) {
            this.peerRegionName = peerRegionName;
            this.__explicitlySet__.add("peerRegionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerTenancyId")
        private String peerTenancyId;

        public Builder peerTenancyId(String peerTenancyId) {
            this.peerTenancyId = peerTenancyId;
            this.__explicitlySet__.add("peerTenancyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peeringStatus")
        private PeeringStatus peeringStatus;

        public Builder peeringStatus(PeeringStatus peeringStatus) {
            this.peeringStatus = peeringStatus;
            this.__explicitlySet__.add("peeringStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemotePeeringConnection build() {
            RemotePeeringConnection __instance__ =
                    new RemotePeeringConnection(
                            compartmentId,
                            definedTags,
                            displayName,
                            drgId,
                            freeformTags,
                            id,
                            isCrossTenancyPeering,
                            lifecycleState,
                            peerId,
                            peerRegionName,
                            peerTenancyId,
                            peeringStatus,
                            timeCreated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemotePeeringConnection o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .drgId(o.getDrgId())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .isCrossTenancyPeering(o.getIsCrossTenancyPeering())
                            .lifecycleState(o.getLifecycleState())
                            .peerId(o.getPeerId())
                            .peerRegionName(o.getPeerRegionName())
                            .peerTenancyId(o.getPeerTenancyId())
                            .peeringStatus(o.getPeeringStatus())
                            .timeCreated(o.getTimeCreated());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment that contains the RPC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

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

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG that this RPC belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drgId")
    private final String drgId;

    public String getDrgId() {
        return drgId;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the RPC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * Whether the VCN at the other end of the peering is in a different tenancy.
     * <p>
     * Example: {@code false}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCrossTenancyPeering")
    private final Boolean isCrossTenancyPeering;

    public Boolean getIsCrossTenancyPeering() {
        return isCrossTenancyPeering;
    }

    /**
     * The RPC's current lifecycle state.
     **/
    public enum LifecycleState {
        Available("AVAILABLE"),
        Provisioning("PROVISIONING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

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
     * The RPC's current lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * If this RPC is peered, this value is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the other RPC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerId")
    private final String peerId;

    public String getPeerId() {
        return peerId;
    }

    /**
     * If this RPC is peered, this value is the region that contains the other RPC.
     * <p>
     * Example: {@code us-ashburn-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerRegionName")
    private final String peerRegionName;

    public String getPeerRegionName() {
        return peerRegionName;
    }

    /**
     * If this RPC is peered, this value is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the other RPC's tenancy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerTenancyId")
    private final String peerTenancyId;

    public String getPeerTenancyId() {
        return peerTenancyId;
    }

    /**
     * Whether the RPC is peered with another RPC. {@code NEW} means the RPC has not yet been
     * peered. {@code PENDING} means the peering is being established. {@code REVOKED} means the
     * RPC at the other end of the peering has been deleted.
     *
     **/
    public enum PeeringStatus {
        Invalid("INVALID"),
        New("NEW"),
        Pending("PENDING"),
        Peered("PEERED"),
        Revoked("REVOKED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * Whether the RPC is peered with another RPC. {@code NEW} means the RPC has not yet been
     * peered. {@code PENDING} means the peering is being established. {@code REVOKED} means the
     * RPC at the other end of the peering has been deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peeringStatus")
    private final PeeringStatus peeringStatus;

    public PeeringStatus getPeeringStatus() {
        return peeringStatus;
    }

    /**
     * The date and time the RPC was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RemotePeeringConnection(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", drgId=").append(String.valueOf(this.drgId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", isCrossTenancyPeering=").append(String.valueOf(this.isCrossTenancyPeering));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", peerId=").append(String.valueOf(this.peerId));
        sb.append(", peerRegionName=").append(String.valueOf(this.peerRegionName));
        sb.append(", peerTenancyId=").append(String.valueOf(this.peerTenancyId));
        sb.append(", peeringStatus=").append(String.valueOf(this.peeringStatus));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemotePeeringConnection)) {
            return false;
        }

        RemotePeeringConnection other = (RemotePeeringConnection) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.drgId, other.drgId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.isCrossTenancyPeering, other.isCrossTenancyPeering)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.peerId, other.peerId)
                && java.util.Objects.equals(this.peerRegionName, other.peerRegionName)
                && java.util.Objects.equals(this.peerTenancyId, other.peerTenancyId)
                && java.util.Objects.equals(this.peeringStatus, other.peeringStatus)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result = (result * PRIME) + (this.drgId == null ? 43 : this.drgId.hashCode());
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
        result = (result * PRIME) + (this.peerId == null ? 43 : this.peerId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerRegionName == null ? 43 : this.peerRegionName.hashCode());
        result =
                (result * PRIME)
                        + (this.peerTenancyId == null ? 43 : this.peerTenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.peeringStatus == null ? 43 : this.peeringStatus.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}

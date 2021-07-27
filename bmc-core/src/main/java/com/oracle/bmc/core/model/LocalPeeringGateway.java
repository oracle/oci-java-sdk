/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A local peering gateway (LPG) is an object on a VCN that lets that VCN peer
 * with another VCN in the same region. *Peering* means that the two VCNs can
 * communicate using private IP addresses, but without the traffic traversing the
 * internet or routing through your on-premises network. For more information,
 * see [VCN Peering](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/VCNpeering.htm).
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LocalPeeringGateway.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LocalPeeringGateway {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        @com.fasterxml.jackson.annotation.JsonProperty("peerAdvertisedCidr")
        private String peerAdvertisedCidr;

        public Builder peerAdvertisedCidr(String peerAdvertisedCidr) {
            this.peerAdvertisedCidr = peerAdvertisedCidr;
            this.__explicitlySet__.add("peerAdvertisedCidr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerAdvertisedCidrDetails")
        private java.util.List<String> peerAdvertisedCidrDetails;

        public Builder peerAdvertisedCidrDetails(java.util.List<String> peerAdvertisedCidrDetails) {
            this.peerAdvertisedCidrDetails = peerAdvertisedCidrDetails;
            this.__explicitlySet__.add("peerAdvertisedCidrDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peeringStatus")
        private PeeringStatus peeringStatus;

        public Builder peeringStatus(PeeringStatus peeringStatus) {
            this.peeringStatus = peeringStatus;
            this.__explicitlySet__.add("peeringStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peeringStatusDetails")
        private String peeringStatusDetails;

        public Builder peeringStatusDetails(String peeringStatusDetails) {
            this.peeringStatusDetails = peeringStatusDetails;
            this.__explicitlySet__.add("peeringStatusDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerId")
        private String peerId;

        public Builder peerId(String peerId) {
            this.peerId = peerId;
            this.__explicitlySet__.add("peerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LocalPeeringGateway build() {
            LocalPeeringGateway __instance__ =
                    new LocalPeeringGateway(
                            compartmentId,
                            definedTags,
                            displayName,
                            freeformTags,
                            id,
                            isCrossTenancyPeering,
                            lifecycleState,
                            peerAdvertisedCidr,
                            peerAdvertisedCidrDetails,
                            peeringStatus,
                            peeringStatusDetails,
                            peerId,
                            routeTableId,
                            timeCreated,
                            vcnId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LocalPeeringGateway o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .isCrossTenancyPeering(o.getIsCrossTenancyPeering())
                            .lifecycleState(o.getLifecycleState())
                            .peerAdvertisedCidr(o.getPeerAdvertisedCidr())
                            .peerAdvertisedCidrDetails(o.getPeerAdvertisedCidrDetails())
                            .peeringStatus(o.getPeeringStatus())
                            .peeringStatusDetails(o.getPeeringStatusDetails())
                            .peerId(o.getPeerId())
                            .routeTableId(o.getRouteTableId())
                            .timeCreated(o.getTimeCreated())
                            .vcnId(o.getVcnId());

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

    /**
     * The OCID of the compartment containing the LPG.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid
     * entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The LPG's Oracle ID (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Whether the VCN at the other end of the peering is in a different tenancy.
     * <p>
     * Example: {@code false}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCrossTenancyPeering")
    Boolean isCrossTenancyPeering;
    /**
     * The LPG's current lifecycle state.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The LPG's current lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The smallest aggregate CIDR that contains all the CIDR routes advertised by the VCN
     * at the other end of the peering from this LPG. See {@code peerAdvertisedCidrDetails} for
     * the individual CIDRs. The value is {@code null} if the LPG is not peered.
     * <p>
     * Example: {@code 192.168.0.0/16}, or if aggregated with {@code 172.16.0.0/24} then {@code 128.0.0.0/1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerAdvertisedCidr")
    String peerAdvertisedCidr;

    /**
     * The specific ranges of IP addresses available on or via the VCN at the other
     * end of the peering from this LPG. The value is {@code null} if the LPG is not peered.
     * You can use these as destination CIDRs for route rules to route a subnet's
     * traffic to this LPG.
     * <p>
     * Example: [{@code 192.168.0.0/16}, {@code 172.16.0.0/24}]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerAdvertisedCidrDetails")
    java.util.List<String> peerAdvertisedCidrDetails;
    /**
     * Whether the LPG is peered with another LPG. {@code NEW} means the LPG has not yet been
     * peered. {@code PENDING} means the peering is being established. {@code REVOKED} means the
     * LPG at the other end of the peering has been deleted.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PeeringStatus {
        Invalid("INVALID"),
        New("NEW"),
        Peered("PEERED"),
        Pending("PENDING"),
        Revoked("REVOKED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * peered. {@code PENDING} means the peering is being established. {@code REVOKED} means the
     * LPG at the other end of the peering has been deleted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peeringStatus")
    PeeringStatus peeringStatus;

    /**
     * Additional information regarding the peering status, if applicable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peeringStatusDetails")
    String peeringStatusDetails;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the peered LPG.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerId")
    String peerId;

    /**
     * The OCID of the route table the LPG is using.
     * <p>
     * For information about why you would associate a route table with an LPG, see
     * [Transit Routing: Access to Multiple VCNs in Same Region](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    String routeTableId;

    /**
     * The date and time the LPG was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN that uses the LPG.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    String vcnId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A DRG attachment serves as a link between a DRG and a network resource. A DRG can be attached to a VCN,
 * IPSec tunnel, remote peering connection, or virtual circuit.
 * <p>
 * For more information, see [Overview of the Networking Service](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/overview.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DrgAttachment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DrgAttachment {
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

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("drgRouteTableId")
        private String drgRouteTableId;

        public Builder drgRouteTableId(String drgRouteTableId) {
            this.drgRouteTableId = drgRouteTableId;
            this.__explicitlySet__.add("drgRouteTableId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkDetails")
        private DrgAttachmentNetworkDetails networkDetails;

        public Builder networkDetails(DrgAttachmentNetworkDetails networkDetails) {
            this.networkDetails = networkDetails;
            this.__explicitlySet__.add("networkDetails");
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

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exportDrgRouteDistributionId")
        private String exportDrgRouteDistributionId;

        public Builder exportDrgRouteDistributionId(String exportDrgRouteDistributionId) {
            this.exportDrgRouteDistributionId = exportDrgRouteDistributionId;
            this.__explicitlySet__.add("exportDrgRouteDistributionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCrossTenancy")
        private Boolean isCrossTenancy;

        public Builder isCrossTenancy(Boolean isCrossTenancy) {
            this.isCrossTenancy = isCrossTenancy;
            this.__explicitlySet__.add("isCrossTenancy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrgAttachment build() {
            DrgAttachment __instance__ =
                    new DrgAttachment(
                            compartmentId,
                            displayName,
                            drgId,
                            id,
                            lifecycleState,
                            timeCreated,
                            drgRouteTableId,
                            networkDetails,
                            definedTags,
                            freeformTags,
                            routeTableId,
                            vcnId,
                            exportDrgRouteDistributionId,
                            isCrossTenancy);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrgAttachment o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .drgId(o.getDrgId())
                            .id(o.getId())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .drgRouteTableId(o.getDrgRouteTableId())
                            .networkDetails(o.getNetworkDetails())
                            .definedTags(o.getDefinedTags())
                            .freeformTags(o.getFreeformTags())
                            .routeTableId(o.getRouteTableId())
                            .vcnId(o.getVcnId())
                            .exportDrgRouteDistributionId(o.getExportDrgRouteDistributionId())
                            .isCrossTenancy(o.getIsCrossTenancy());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the DRG attachment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DRG.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drgId")
    String drgId;

    /**
     * The DRG attachment's Oracle ID ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;
    /**
     * The DRG attachment's current state.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Attaching("ATTACHING"),
        Attached("ATTACHED"),
        Detaching("DETACHING"),
        Detached("DETACHED"),

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
     * The DRG attachment's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The date and time the DRG attachment was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table that is assigned to this attachment.
     * <p>
     * The DRG route table manages traffic inside the DRG.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drgRouteTableId")
    String drgRouteTableId;

    @com.fasterxml.jackson.annotation.JsonProperty("networkDetails")
    DrgAttachmentNetworkDetails networkDetails;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The OCID of the route table the DRG attachment is using.
     * <p>
     * For information about why you would associate a route table with a DRG attachment, see:
     * <p>
     * [Transit Routing: Access to Multiple VCNs in Same Region](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm)
     *   * [Transit Routing: Private Access to Oracle Services](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
     *
     * This field is deprecated. Instead, use the `networkDetails` field to view the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the attached resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    String routeTableId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VCN.
     * This field is deprecated. Instead, use the `networkDetails` field to view the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the attached resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    String vcnId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the export route distribution used to specify how routes in the assigned DRG route table
     * are advertised to the attachment.
     * If this value is null, no routes are advertised through this attachment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exportDrgRouteDistributionId")
    String exportDrgRouteDistributionId;

    /**
     * Indicates whether the DRG attachment and attached network live in a different tenancy than the DRG.
     * <p>
     * Example: `false`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCrossTenancy")
    Boolean isCrossTenancy;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

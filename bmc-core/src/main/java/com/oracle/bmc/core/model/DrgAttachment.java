/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A DRG attachment serves as a link between a DRG and a network resource. A DRG can be attached to
 * a VCN, IPSec tunnel, remote peering connection, or virtual circuit.
 *
 * <p>For more information, see [Overview of the Networking
 * Service](https://docs.oracle.com/iaas/Content/Network/Concepts/overview.htm). <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DrgAttachment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DrgAttachment extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "drgId",
        "id",
        "lifecycleState",
        "timeCreated",
        "drgRouteTableId",
        "networkDetails",
        "definedTags",
        "freeformTags",
        "routeTableId",
        "vcnId",
        "exportDrgRouteDistributionId",
        "isCrossTenancy"
    })
    public DrgAttachment(
            String compartmentId,
            String displayName,
            String drgId,
            String id,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            String drgRouteTableId,
            DrgAttachmentNetworkDetails networkDetails,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            String routeTableId,
            String vcnId,
            String exportDrgRouteDistributionId,
            Boolean isCrossTenancy) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.drgId = drgId;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.drgRouteTableId = drgRouteTableId;
        this.networkDetails = networkDetails;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.routeTableId = routeTableId;
        this.vcnId = vcnId;
        this.exportDrgRouteDistributionId = exportDrgRouteDistributionId;
        this.isCrossTenancy = isCrossTenancy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the DRG attachment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the DRG attachment.
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
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * DRG.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("drgId")
        private String drgId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * DRG.
         *
         * @param drgId the value to set
         * @return this builder
         */
        public Builder drgId(String drgId) {
            this.drgId = drgId;
            this.__explicitlySet__.add("drgId");
            return this;
        }
        /**
         * The DRG attachment's Oracle ID
         * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The DRG attachment's Oracle ID
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
        /** The DRG attachment's current state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The DRG attachment's current state.
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
         * The date and time the DRG attachment was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the DRG attachment was created, in the format defined by
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
         * DRG route table that is assigned to this attachment.
         *
         * <p>The DRG route table manages traffic inside the DRG.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("drgRouteTableId")
        private String drgRouteTableId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * DRG route table that is assigned to this attachment.
         *
         * <p>The DRG route table manages traffic inside the DRG.
         *
         * @param drgRouteTableId the value to set
         * @return this builder
         */
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
         * route table the DRG attachment is using.
         *
         * <p>For information about why you would associate a route table with a DRG attachment,
         * see:
         *
         * <p>[Transit Routing: Access to Multiple VCNs in Same
         * Region](https://docs.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm) * [Transit
         * Routing: Private Access to Oracle
         * Services](https://docs.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
         *
         * <p>This field is deprecated. Instead, use the {@code networkDetails} field to view the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * attached resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * route table the DRG attachment is using.
         *
         * <p>For information about why you would associate a route table with a DRG attachment,
         * see:
         *
         * <p>[Transit Routing: Access to Multiple VCNs in Same
         * Region](https://docs.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm) * [Transit
         * Routing: Private Access to Oracle
         * Services](https://docs.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
         *
         * <p>This field is deprecated. Instead, use the {@code networkDetails} field to view the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * attached resource.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VCN. This field is deprecated. Instead, use the {@code networkDetails} field to view the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * attached resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VCN. This field is deprecated. Instead, use the {@code networkDetails} field to view the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * attached resource.
         *
         * @param vcnId the value to set
         * @return this builder
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * export route distribution used to specify how routes in the assigned DRG route table are
         * advertised to the attachment. If this value is null, no routes are advertised through
         * this attachment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exportDrgRouteDistributionId")
        private String exportDrgRouteDistributionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * export route distribution used to specify how routes in the assigned DRG route table are
         * advertised to the attachment. If this value is null, no routes are advertised through
         * this attachment.
         *
         * @param exportDrgRouteDistributionId the value to set
         * @return this builder
         */
        public Builder exportDrgRouteDistributionId(String exportDrgRouteDistributionId) {
            this.exportDrgRouteDistributionId = exportDrgRouteDistributionId;
            this.__explicitlySet__.add("exportDrgRouteDistributionId");
            return this;
        }
        /**
         * Indicates whether the DRG attachment and attached network live in a different tenancy
         * than the DRG.
         *
         * <p>Example: {@code false}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCrossTenancy")
        private Boolean isCrossTenancy;

        /**
         * Indicates whether the DRG attachment and attached network live in a different tenancy
         * than the DRG.
         *
         * <p>Example: {@code false}
         *
         * @param isCrossTenancy the value to set
         * @return this builder
         */
        public Builder isCrossTenancy(Boolean isCrossTenancy) {
            this.isCrossTenancy = isCrossTenancy;
            this.__explicitlySet__.add("isCrossTenancy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrgAttachment build() {
            DrgAttachment model =
                    new DrgAttachment(
                            this.compartmentId,
                            this.displayName,
                            this.drgId,
                            this.id,
                            this.lifecycleState,
                            this.timeCreated,
                            this.drgRouteTableId,
                            this.networkDetails,
                            this.definedTags,
                            this.freeformTags,
                            this.routeTableId,
                            this.vcnId,
                            this.exportDrgRouteDistributionId,
                            this.isCrossTenancy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrgAttachment model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("drgId")) {
                this.drgId(model.getDrgId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("drgRouteTableId")) {
                this.drgRouteTableId(model.getDrgRouteTableId());
            }
            if (model.wasPropertyExplicitlySet("networkDetails")) {
                this.networkDetails(model.getNetworkDetails());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("routeTableId")) {
                this.routeTableId(model.getRouteTableId());
            }
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("exportDrgRouteDistributionId")) {
                this.exportDrgRouteDistributionId(model.getExportDrgRouteDistributionId());
            }
            if (model.wasPropertyExplicitlySet("isCrossTenancy")) {
                this.isCrossTenancy(model.getIsCrossTenancy());
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
     * compartment containing the DRG attachment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the DRG attachment.
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("drgId")
    private final String drgId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
     *
     * @return the value
     */
    public String getDrgId() {
        return drgId;
    }

    /**
     * The DRG attachment's Oracle ID
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The DRG attachment's Oracle ID
     * ([OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The DRG attachment's current state. */
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
    /** The DRG attachment's current state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The DRG attachment's current state.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the DRG attachment was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the DRG attachment was created, in the format defined by
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG
     * route table that is assigned to this attachment.
     *
     * <p>The DRG route table manages traffic inside the DRG.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("drgRouteTableId")
    private final String drgRouteTableId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG
     * route table that is assigned to this attachment.
     *
     * <p>The DRG route table manages traffic inside the DRG.
     *
     * @return the value
     */
    public String getDrgRouteTableId() {
        return drgRouteTableId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkDetails")
    private final DrgAttachmentNetworkDetails networkDetails;

    public DrgAttachmentNetworkDetails getNetworkDetails() {
        return networkDetails;
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
     * route table the DRG attachment is using.
     *
     * <p>For information about why you would associate a route table with a DRG attachment, see:
     *
     * <p>[Transit Routing: Access to Multiple VCNs in Same
     * Region](https://docs.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm) * [Transit
     * Routing: Private Access to Oracle
     * Services](https://docs.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
     *
     * <p>This field is deprecated. Instead, use the {@code networkDetails} field to view the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the attached
     * resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    private final String routeTableId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * route table the DRG attachment is using.
     *
     * <p>For information about why you would associate a route table with a DRG attachment, see:
     *
     * <p>[Transit Routing: Access to Multiple VCNs in Same
     * Region](https://docs.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm) * [Transit
     * Routing: Private Access to Oracle
     * Services](https://docs.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
     *
     * <p>This field is deprecated. Instead, use the {@code networkDetails} field to view the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the attached
     * resource.
     *
     * @return the value
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
     * This field is deprecated. Instead, use the {@code networkDetails} field to view the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the attached
     * resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
     * This field is deprecated. Instead, use the {@code networkDetails} field to view the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the attached
     * resource.
     *
     * @return the value
     */
    public String getVcnId() {
        return vcnId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * export route distribution used to specify how routes in the assigned DRG route table are
     * advertised to the attachment. If this value is null, no routes are advertised through this
     * attachment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exportDrgRouteDistributionId")
    private final String exportDrgRouteDistributionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * export route distribution used to specify how routes in the assigned DRG route table are
     * advertised to the attachment. If this value is null, no routes are advertised through this
     * attachment.
     *
     * @return the value
     */
    public String getExportDrgRouteDistributionId() {
        return exportDrgRouteDistributionId;
    }

    /**
     * Indicates whether the DRG attachment and attached network live in a different tenancy than
     * the DRG.
     *
     * <p>Example: {@code false}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isCrossTenancy")
    private final Boolean isCrossTenancy;

    /**
     * Indicates whether the DRG attachment and attached network live in a different tenancy than
     * the DRG.
     *
     * <p>Example: {@code false}
     *
     * @return the value
     */
    public Boolean getIsCrossTenancy() {
        return isCrossTenancy;
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
        sb.append("DrgAttachment(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", drgId=").append(String.valueOf(this.drgId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", drgRouteTableId=").append(String.valueOf(this.drgRouteTableId));
        sb.append(", networkDetails=").append(String.valueOf(this.networkDetails));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", routeTableId=").append(String.valueOf(this.routeTableId));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", exportDrgRouteDistributionId=")
                .append(String.valueOf(this.exportDrgRouteDistributionId));
        sb.append(", isCrossTenancy=").append(String.valueOf(this.isCrossTenancy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrgAttachment)) {
            return false;
        }

        DrgAttachment other = (DrgAttachment) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.drgId, other.drgId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.drgRouteTableId, other.drgRouteTableId)
                && java.util.Objects.equals(this.networkDetails, other.networkDetails)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.routeTableId, other.routeTableId)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(
                        this.exportDrgRouteDistributionId, other.exportDrgRouteDistributionId)
                && java.util.Objects.equals(this.isCrossTenancy, other.isCrossTenancy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.drgId == null ? 43 : this.drgId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.drgRouteTableId == null ? 43 : this.drgRouteTableId.hashCode());
        result =
                (result * PRIME)
                        + (this.networkDetails == null ? 43 : this.networkDetails.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.routeTableId == null ? 43 : this.routeTableId.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result =
                (result * PRIME)
                        + (this.exportDrgRouteDistributionId == null
                                ? 43
                                : this.exportDrgRouteDistributionId.hashCode());
        result =
                (result * PRIME)
                        + (this.isCrossTenancy == null ? 43 : this.isCrossTenancy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

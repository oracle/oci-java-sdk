/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
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
    builder = UpdateDrgAttachmentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateDrgAttachmentDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "drgRouteTableId",
        "networkDetails",
        "definedTags",
        "freeformTags",
        "exportDrgRouteDistributionId",
        "routeTableId"
    })
    public UpdateDrgAttachmentDetails(
            String displayName,
            String drgRouteTableId,
            DrgAttachmentNetworkUpdateDetails networkDetails,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            String exportDrgRouteDistributionId,
            String routeTableId) {
        super();
        this.displayName = displayName;
        this.drgRouteTableId = drgRouteTableId;
        this.networkDetails = networkDetails;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.exportDrgRouteDistributionId = exportDrgRouteDistributionId;
        this.routeTableId = routeTableId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table that is assigned to this attachment.
         * <p>
         * The DRG route table manages traffic inside the DRG.
         * <p>
         * You can't remove a DRG route table from a DRG attachment, but you can reassign which
         * DRG route table it uses.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("drgRouteTableId")
        private String drgRouteTableId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table that is assigned to this attachment.
         * <p>
         * The DRG route table manages traffic inside the DRG.
         * <p>
         * You can't remove a DRG route table from a DRG attachment, but you can reassign which
         * DRG route table it uses.
         *
         * @param drgRouteTableId the value to set
         * @return this builder
         **/
        public Builder drgRouteTableId(String drgRouteTableId) {
            this.drgRouteTableId = drgRouteTableId;
            this.__explicitlySet__.add("drgRouteTableId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkDetails")
        private DrgAttachmentNetworkUpdateDetails networkDetails;

        public Builder networkDetails(DrgAttachmentNetworkUpdateDetails networkDetails) {
            this.networkDetails = networkDetails;
            this.__explicitlySet__.add("networkDetails");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the export route distribution used to specify how routes in the assigned DRG route table
         * are advertised out through the attachment.
         * If this value is null, no routes are advertised through this attachment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("exportDrgRouteDistributionId")
        private String exportDrgRouteDistributionId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the export route distribution used to specify how routes in the assigned DRG route table
         * are advertised out through the attachment.
         * If this value is null, no routes are advertised through this attachment.
         *
         * @param exportDrgRouteDistributionId the value to set
         * @return this builder
         **/
        public Builder exportDrgRouteDistributionId(String exportDrgRouteDistributionId) {
            this.exportDrgRouteDistributionId = exportDrgRouteDistributionId;
            this.__explicitlySet__.add("exportDrgRouteDistributionId");
            return this;
        }
        /**
         * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table that is used to route the traffic as it enters a VCN through this attachment.
         * <p>
         * For information about why you would associate a route table with a DRG attachment, see:
         * <p>
         * [Transit Routing: Access to Multiple VCNs in Same Region](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm)
         *   * [Transit Routing: Private Access to Oracle Services](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        /**
         * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table that is used to route the traffic as it enters a VCN through this attachment.
         * <p>
         * For information about why you would associate a route table with a DRG attachment, see:
         * <p>
         * [Transit Routing: Access to Multiple VCNs in Same Region](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm)
         *   * [Transit Routing: Private Access to Oracle Services](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
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

        public UpdateDrgAttachmentDetails build() {
            UpdateDrgAttachmentDetails model =
                    new UpdateDrgAttachmentDetails(
                            this.displayName,
                            this.drgRouteTableId,
                            this.networkDetails,
                            this.definedTags,
                            this.freeformTags,
                            this.exportDrgRouteDistributionId,
                            this.routeTableId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDrgAttachmentDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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
            if (model.wasPropertyExplicitlySet("exportDrgRouteDistributionId")) {
                this.exportDrgRouteDistributionId(model.getExportDrgRouteDistributionId());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table that is assigned to this attachment.
     * <p>
     * The DRG route table manages traffic inside the DRG.
     * <p>
     * You can't remove a DRG route table from a DRG attachment, but you can reassign which
     * DRG route table it uses.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drgRouteTableId")
    private final String drgRouteTableId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table that is assigned to this attachment.
     * <p>
     * The DRG route table manages traffic inside the DRG.
     * <p>
     * You can't remove a DRG route table from a DRG attachment, but you can reassign which
     * DRG route table it uses.
     *
     * @return the value
     **/
    public String getDrgRouteTableId() {
        return drgRouteTableId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkDetails")
    private final DrgAttachmentNetworkUpdateDetails networkDetails;

    public DrgAttachmentNetworkUpdateDetails getNetworkDetails() {
        return networkDetails;
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

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the export route distribution used to specify how routes in the assigned DRG route table
     * are advertised out through the attachment.
     * If this value is null, no routes are advertised through this attachment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exportDrgRouteDistributionId")
    private final String exportDrgRouteDistributionId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the export route distribution used to specify how routes in the assigned DRG route table
     * are advertised out through the attachment.
     * If this value is null, no routes are advertised through this attachment.
     *
     * @return the value
     **/
    public String getExportDrgRouteDistributionId() {
        return exportDrgRouteDistributionId;
    }

    /**
     * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table that is used to route the traffic as it enters a VCN through this attachment.
     * <p>
     * For information about why you would associate a route table with a DRG attachment, see:
     * <p>
     * [Transit Routing: Access to Multiple VCNs in Same Region](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm)
     *   * [Transit Routing: Private Access to Oracle Services](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    private final String routeTableId;

    /**
     * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table that is used to route the traffic as it enters a VCN through this attachment.
     * <p>
     * For information about why you would associate a route table with a DRG attachment, see:
     * <p>
     * [Transit Routing: Access to Multiple VCNs in Same Region](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm)
     *   * [Transit Routing: Private Access to Oracle Services](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
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
        sb.append("UpdateDrgAttachmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", drgRouteTableId=").append(String.valueOf(this.drgRouteTableId));
        sb.append(", networkDetails=").append(String.valueOf(this.networkDetails));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", exportDrgRouteDistributionId=")
                .append(String.valueOf(this.exportDrgRouteDistributionId));
        sb.append(", routeTableId=").append(String.valueOf(this.routeTableId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDrgAttachmentDetails)) {
            return false;
        }

        UpdateDrgAttachmentDetails other = (UpdateDrgAttachmentDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.drgRouteTableId, other.drgRouteTableId)
                && java.util.Objects.equals(this.networkDetails, other.networkDetails)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(
                        this.exportDrgRouteDistributionId, other.exportDrgRouteDistributionId)
                && java.util.Objects.equals(this.routeTableId, other.routeTableId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.drgRouteTableId == null ? 43 : this.drgRouteTableId.hashCode());
        result =
                (result * PRIME)
                        + (this.networkDetails == null ? 43 : this.networkDetails.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.exportDrgRouteDistributionId == null
                                ? 43
                                : this.exportDrgRouteDistributionId.hashCode());
        result = (result * PRIME) + (this.routeTableId == null ? 43 : this.routeTableId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

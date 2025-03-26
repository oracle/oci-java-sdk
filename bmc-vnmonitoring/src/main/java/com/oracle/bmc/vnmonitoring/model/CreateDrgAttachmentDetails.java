/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

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
    builder = CreateDrgAttachmentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDrgAttachmentDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "drgId",
        "drgRouteTableId",
        "networkDetails",
        "definedTags",
        "freeformTags",
        "routeTableId",
        "vcnId"
    })
    public CreateDrgAttachmentDetails(
            String displayName,
            String drgId,
            String drgRouteTableId,
            DrgAttachmentNetworkCreateDetails networkDetails,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            String routeTableId,
            String vcnId) {
        super();
        this.displayName = displayName;
        this.drgId = drgId;
        this.drgRouteTableId = drgRouteTableId;
        this.networkDetails = networkDetails;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.routeTableId = routeTableId;
        this.vcnId = vcnId;
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("drgId")
        private String drgId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
         * @param drgId the value to set
         * @return this builder
         **/
        public Builder drgId(String drgId) {
            this.drgId = drgId;
            this.__explicitlySet__.add("drgId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table that is assigned to this attachment.
         * <p>
         * The DRG route table manages traffic inside the DRG.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("drgRouteTableId")
        private String drgRouteTableId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table that is assigned to this attachment.
         * <p>
         * The DRG route table manages traffic inside the DRG.
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
        private DrgAttachmentNetworkCreateDetails networkDetails;

        public Builder networkDetails(DrgAttachmentNetworkCreateDetails networkDetails) {
            this.networkDetails = networkDetails;
            this.__explicitlySet__.add("networkDetails");
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table used by the DRG attachment.
         * <p>
         * If you don't specify a route table here, the DRG attachment is created without an associated route
         * table. The Networking service does NOT automatically associate the attached VCN's default route table
         * with the DRG attachment.
         * For information about why you would associate a route table with a DRG attachment, see:
         * <p>
         * [Transit Routing: Access to Multiple VCNs in Same Region](https://docs.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm)
         *   * [Transit Routing: Private Access to Oracle Services](https://docs.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
         * This field is deprecated. Instead, use the networkDetails field to specify the VCN route table for this attachment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table used by the DRG attachment.
         * <p>
         * If you don't specify a route table here, the DRG attachment is created without an associated route
         * table. The Networking service does NOT automatically associate the attached VCN's default route table
         * with the DRG attachment.
         * For information about why you would associate a route table with a DRG attachment, see:
         * <p>
         * [Transit Routing: Access to Multiple VCNs in Same Region](https://docs.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm)
         *   * [Transit Routing: Private Access to Oracle Services](https://docs.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
         * This field is deprecated. Instead, use the networkDetails field to specify the VCN route table for this attachment.
         *
         * @param routeTableId the value to set
         * @return this builder
         **/
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
         * This field is deprecated. Instead, use the {@code networkDetails} field to specify the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the attached resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
         * This field is deprecated. Instead, use the {@code networkDetails} field to specify the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the attached resource.
         *
         * @param vcnId the value to set
         * @return this builder
         **/
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDrgAttachmentDetails build() {
            CreateDrgAttachmentDetails model =
                    new CreateDrgAttachmentDetails(
                            this.displayName,
                            this.drgId,
                            this.drgRouteTableId,
                            this.networkDetails,
                            this.definedTags,
                            this.freeformTags,
                            this.routeTableId,
                            this.vcnId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDrgAttachmentDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("drgId")) {
                this.drgId(model.getDrgId());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drgId")
    private final String drgId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG.
     * @return the value
     **/
    public String getDrgId() {
        return drgId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table that is assigned to this attachment.
     * <p>
     * The DRG route table manages traffic inside the DRG.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drgRouteTableId")
    private final String drgRouteTableId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DRG route table that is assigned to this attachment.
     * <p>
     * The DRG route table manages traffic inside the DRG.
     *
     * @return the value
     **/
    public String getDrgRouteTableId() {
        return drgRouteTableId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkDetails")
    private final DrgAttachmentNetworkCreateDetails networkDetails;

    public DrgAttachmentNetworkCreateDetails getNetworkDetails() {
        return networkDetails;
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table used by the DRG attachment.
     * <p>
     * If you don't specify a route table here, the DRG attachment is created without an associated route
     * table. The Networking service does NOT automatically associate the attached VCN's default route table
     * with the DRG attachment.
     * For information about why you would associate a route table with a DRG attachment, see:
     * <p>
     * [Transit Routing: Access to Multiple VCNs in Same Region](https://docs.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm)
     *   * [Transit Routing: Private Access to Oracle Services](https://docs.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
     * This field is deprecated. Instead, use the networkDetails field to specify the VCN route table for this attachment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    private final String routeTableId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table used by the DRG attachment.
     * <p>
     * If you don't specify a route table here, the DRG attachment is created without an associated route
     * table. The Networking service does NOT automatically associate the attached VCN's default route table
     * with the DRG attachment.
     * For information about why you would associate a route table with a DRG attachment, see:
     * <p>
     * [Transit Routing: Access to Multiple VCNs in Same Region](https://docs.oracle.com/iaas/Content/Network/Tasks/transitrouting.htm)
     *   * [Transit Routing: Private Access to Oracle Services](https://docs.oracle.com/iaas/Content/Network/Tasks/transitroutingoracleservices.htm)
     * This field is deprecated. Instead, use the networkDetails field to specify the VCN route table for this attachment.
     *
     * @return the value
     **/
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
     * This field is deprecated. Instead, use the {@code networkDetails} field to specify the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the attached resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN.
     * This field is deprecated. Instead, use the {@code networkDetails} field to specify the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the attached resource.
     *
     * @return the value
     **/
    public String getVcnId() {
        return vcnId;
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
        sb.append("CreateDrgAttachmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", drgId=").append(String.valueOf(this.drgId));
        sb.append(", drgRouteTableId=").append(String.valueOf(this.drgRouteTableId));
        sb.append(", networkDetails=").append(String.valueOf(this.networkDetails));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", routeTableId=").append(String.valueOf(this.routeTableId));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDrgAttachmentDetails)) {
            return false;
        }

        CreateDrgAttachmentDetails other = (CreateDrgAttachmentDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.drgId, other.drgId)
                && java.util.Objects.equals(this.drgRouteTableId, other.drgRouteTableId)
                && java.util.Objects.equals(this.networkDetails, other.networkDetails)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.routeTableId, other.routeTableId)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.drgId == null ? 43 : this.drgId.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

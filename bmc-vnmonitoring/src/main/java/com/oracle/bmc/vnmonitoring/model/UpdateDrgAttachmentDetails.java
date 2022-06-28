/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
    builder = UpdateDrgAttachmentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateDrgAttachmentDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "drgRouteTableId",
        "networkDetails",
        "definedTags",
        "freeformTags",
        "exportDrgRouteDistributionId"
    })
    public UpdateDrgAttachmentDetails(
            String displayName,
            String drgRouteTableId,
            DrgAttachmentNetworkUpdateDetails networkDetails,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            String exportDrgRouteDistributionId) {
        super();
        this.displayName = displayName;
        this.drgRouteTableId = drgRouteTableId;
        this.networkDetails = networkDetails;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.exportDrgRouteDistributionId = exportDrgRouteDistributionId;
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDrgAttachmentDetails build() {
            UpdateDrgAttachmentDetails __instance__ =
                    new UpdateDrgAttachmentDetails(
                            displayName,
                            drgRouteTableId,
                            networkDetails,
                            definedTags,
                            freeformTags,
                            exportDrgRouteDistributionId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDrgAttachmentDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .drgRouteTableId(o.getDrgRouteTableId())
                            .networkDetails(o.getNetworkDetails())
                            .definedTags(o.getDefinedTags())
                            .freeformTags(o.getFreeformTags())
                            .exportDrgRouteDistributionId(o.getExportDrgRouteDistributionId());

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

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateDrgAttachmentDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", drgRouteTableId=").append(String.valueOf(this.drgRouteTableId));
        sb.append(", networkDetails=").append(String.valueOf(this.networkDetails));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", exportDrgRouteDistributionId=")
                .append(String.valueOf(this.exportDrgRouteDistributionId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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

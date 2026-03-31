/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.gdp.model;

/**
 * The information about the new pipeline.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateGdpPipelineDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateGdpPipelineDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "description",
        "serviceLogGroupId",
        "pipelineType",
        "fileTypes",
        "bucketDetails",
        "peeringRegion",
        "authorizationDetails",
        "isFileOverrideInDestinationEnabled",
        "isScanningEnabled",
        "isChunkingEnabled",
        "isApprovalNeeded",
        "approvalKeyVaultId",
        "freeformTags",
        "definedTags"
    })
    public CreateGdpPipelineDetails(
            String compartmentId,
            String displayName,
            String description,
            String serviceLogGroupId,
            GdpPipeline.PipelineType pipelineType,
            java.util.List<String> fileTypes,
            java.util.List<BucketDetailsDefinition> bucketDetails,
            String peeringRegion,
            String authorizationDetails,
            Boolean isFileOverrideInDestinationEnabled,
            Boolean isScanningEnabled,
            Boolean isChunkingEnabled,
            Boolean isApprovalNeeded,
            String approvalKeyVaultId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.serviceLogGroupId = serviceLogGroupId;
        this.pipelineType = pipelineType;
        this.fileTypes = fileTypes;
        this.bucketDetails = bucketDetails;
        this.peeringRegion = peeringRegion;
        this.authorizationDetails = authorizationDetails;
        this.isFileOverrideInDestinationEnabled = isFileOverrideInDestinationEnabled;
        this.isScanningEnabled = isScanningEnabled;
        this.isChunkingEnabled = isChunkingEnabled;
        this.isApprovalNeeded = isApprovalNeeded;
        this.approvalKeyVaultId = approvalKeyVaultId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Pipeline short name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Pipeline short name.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Short field input by customer for a description of the data pipeline use-case.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Short field input by customer for a description of the data pipeline use-case.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * the OCID of the service log group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceLogGroupId")
        private String serviceLogGroupId;

        /**
         * the OCID of the service log group.
         * @param serviceLogGroupId the value to set
         * @return this builder
         **/
        public Builder serviceLogGroupId(String serviceLogGroupId) {
            this.serviceLogGroupId = serviceLogGroupId;
            this.__explicitlySet__.add("serviceLogGroupId");
            return this;
        }
        /**
         * Type of pipeline. Can be SENDER or RECEIVER.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pipelineType")
        private GdpPipeline.PipelineType pipelineType;

        /**
         * Type of pipeline. Can be SENDER or RECEIVER.
         * @param pipelineType the value to set
         * @return this builder
         **/
        public Builder pipelineType(GdpPipeline.PipelineType pipelineType) {
            this.pipelineType = pipelineType;
            this.__explicitlySet__.add("pipelineType");
            return this;
        }
        /**
         * List of file types allowed to be transferred in the pipeline according to the authorization details (e.g. .pdf, .xml, .doc).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileTypes")
        private java.util.List<String> fileTypes;

        /**
         * List of file types allowed to be transferred in the pipeline according to the authorization details (e.g. .pdf, .xml, .doc).
         * @param fileTypes the value to set
         * @return this builder
         **/
        public Builder fileTypes(java.util.List<String> fileTypes) {
            this.fileTypes = fileTypes;
            this.__explicitlySet__.add("fileTypes");
            return this;
        }
        /**
         * Information about the bucket in the pipeline being configured.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bucketDetails")
        private java.util.List<BucketDetailsDefinition> bucketDetails;

        /**
         * Information about the bucket in the pipeline being configured.
         * @param bucketDetails the value to set
         * @return this builder
         **/
        public Builder bucketDetails(java.util.List<BucketDetailsDefinition> bucketDetails) {
            this.bucketDetails = bucketDetails;
            this.__explicitlySet__.add("bucketDetails");
            return this;
        }
        /**
         * Public region name where the peered pipeline exists.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peeringRegion")
        private String peeringRegion;

        /**
         * Public region name where the peered pipeline exists.
         * @param peeringRegion the value to set
         * @return this builder
         **/
        public Builder peeringRegion(String peeringRegion) {
            this.peeringRegion = peeringRegion;
            this.__explicitlySet__.add("peeringRegion");
            return this;
        }
        /**
         * Authorization information about the pipeline being configured.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authorizationDetails")
        private String authorizationDetails;

        /**
         * Authorization information about the pipeline being configured.
         * @param authorizationDetails the value to set
         * @return this builder
         **/
        public Builder authorizationDetails(String authorizationDetails) {
            this.authorizationDetails = authorizationDetails;
            this.__explicitlySet__.add("authorizationDetails");
            return this;
        }
        /**
         * Enable file override feature in destination bucket
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFileOverrideInDestinationEnabled")
        private Boolean isFileOverrideInDestinationEnabled;

        /**
         * Enable file override feature in destination bucket
         * @param isFileOverrideInDestinationEnabled the value to set
         * @return this builder
         **/
        public Builder isFileOverrideInDestinationEnabled(
                Boolean isFileOverrideInDestinationEnabled) {
            this.isFileOverrideInDestinationEnabled = isFileOverrideInDestinationEnabled;
            this.__explicitlySet__.add("isFileOverrideInDestinationEnabled");
            return this;
        }
        /**
         * Determines whether GDP Scanning should be enabled for the pipeline.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isScanningEnabled")
        private Boolean isScanningEnabled;

        /**
         * Determines whether GDP Scanning should be enabled for the pipeline.
         * @param isScanningEnabled the value to set
         * @return this builder
         **/
        public Builder isScanningEnabled(Boolean isScanningEnabled) {
            this.isScanningEnabled = isScanningEnabled;
            this.__explicitlySet__.add("isScanningEnabled");
            return this;
        }
        /**
         * Determines whether file must be chunked during the transfer. This is only a property of SENDER pipelines.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isChunkingEnabled")
        private Boolean isChunkingEnabled;

        /**
         * Determines whether file must be chunked during the transfer. This is only a property of SENDER pipelines.
         * @param isChunkingEnabled the value to set
         * @return this builder
         **/
        public Builder isChunkingEnabled(Boolean isChunkingEnabled) {
            this.isChunkingEnabled = isChunkingEnabled;
            this.__explicitlySet__.add("isChunkingEnabled");
            return this;
        }
        /**
         * Determines whether file transfers need to go through an approval workflow.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isApprovalNeeded")
        private Boolean isApprovalNeeded;

        /**
         * Determines whether file transfers need to go through an approval workflow.
         * @param isApprovalNeeded the value to set
         * @return this builder
         **/
        public Builder isApprovalNeeded(Boolean isApprovalNeeded) {
            this.isApprovalNeeded = isApprovalNeeded;
            this.__explicitlySet__.add("isApprovalNeeded");
            return this;
        }
        /**
         * The KMS vault OCID for the key to be used for file transfer approvals.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approvalKeyVaultId")
        private String approvalKeyVaultId;

        /**
         * The KMS vault OCID for the key to be used for file transfer approvals.
         * @param approvalKeyVaultId the value to set
         * @return this builder
         **/
        public Builder approvalKeyVaultId(String approvalKeyVaultId) {
            this.approvalKeyVaultId = approvalKeyVaultId;
            this.__explicitlySet__.add("approvalKeyVaultId");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateGdpPipelineDetails build() {
            CreateGdpPipelineDetails model =
                    new CreateGdpPipelineDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.serviceLogGroupId,
                            this.pipelineType,
                            this.fileTypes,
                            this.bucketDetails,
                            this.peeringRegion,
                            this.authorizationDetails,
                            this.isFileOverrideInDestinationEnabled,
                            this.isScanningEnabled,
                            this.isChunkingEnabled,
                            this.isApprovalNeeded,
                            this.approvalKeyVaultId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateGdpPipelineDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("serviceLogGroupId")) {
                this.serviceLogGroupId(model.getServiceLogGroupId());
            }
            if (model.wasPropertyExplicitlySet("pipelineType")) {
                this.pipelineType(model.getPipelineType());
            }
            if (model.wasPropertyExplicitlySet("fileTypes")) {
                this.fileTypes(model.getFileTypes());
            }
            if (model.wasPropertyExplicitlySet("bucketDetails")) {
                this.bucketDetails(model.getBucketDetails());
            }
            if (model.wasPropertyExplicitlySet("peeringRegion")) {
                this.peeringRegion(model.getPeeringRegion());
            }
            if (model.wasPropertyExplicitlySet("authorizationDetails")) {
                this.authorizationDetails(model.getAuthorizationDetails());
            }
            if (model.wasPropertyExplicitlySet("isFileOverrideInDestinationEnabled")) {
                this.isFileOverrideInDestinationEnabled(
                        model.getIsFileOverrideInDestinationEnabled());
            }
            if (model.wasPropertyExplicitlySet("isScanningEnabled")) {
                this.isScanningEnabled(model.getIsScanningEnabled());
            }
            if (model.wasPropertyExplicitlySet("isChunkingEnabled")) {
                this.isChunkingEnabled(model.getIsChunkingEnabled());
            }
            if (model.wasPropertyExplicitlySet("isApprovalNeeded")) {
                this.isApprovalNeeded(model.getIsApprovalNeeded());
            }
            if (model.wasPropertyExplicitlySet("approvalKeyVaultId")) {
                this.approvalKeyVaultId(model.getApprovalKeyVaultId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Pipeline short name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Pipeline short name.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Short field input by customer for a description of the data pipeline use-case.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Short field input by customer for a description of the data pipeline use-case.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * the OCID of the service log group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceLogGroupId")
    private final String serviceLogGroupId;

    /**
     * the OCID of the service log group.
     * @return the value
     **/
    public String getServiceLogGroupId() {
        return serviceLogGroupId;
    }

    /**
     * Type of pipeline. Can be SENDER or RECEIVER.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pipelineType")
    private final GdpPipeline.PipelineType pipelineType;

    /**
     * Type of pipeline. Can be SENDER or RECEIVER.
     * @return the value
     **/
    public GdpPipeline.PipelineType getPipelineType() {
        return pipelineType;
    }

    /**
     * List of file types allowed to be transferred in the pipeline according to the authorization details (e.g. .pdf, .xml, .doc).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileTypes")
    private final java.util.List<String> fileTypes;

    /**
     * List of file types allowed to be transferred in the pipeline according to the authorization details (e.g. .pdf, .xml, .doc).
     * @return the value
     **/
    public java.util.List<String> getFileTypes() {
        return fileTypes;
    }

    /**
     * Information about the bucket in the pipeline being configured.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketDetails")
    private final java.util.List<BucketDetailsDefinition> bucketDetails;

    /**
     * Information about the bucket in the pipeline being configured.
     * @return the value
     **/
    public java.util.List<BucketDetailsDefinition> getBucketDetails() {
        return bucketDetails;
    }

    /**
     * Public region name where the peered pipeline exists.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peeringRegion")
    private final String peeringRegion;

    /**
     * Public region name where the peered pipeline exists.
     * @return the value
     **/
    public String getPeeringRegion() {
        return peeringRegion;
    }

    /**
     * Authorization information about the pipeline being configured.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authorizationDetails")
    private final String authorizationDetails;

    /**
     * Authorization information about the pipeline being configured.
     * @return the value
     **/
    public String getAuthorizationDetails() {
        return authorizationDetails;
    }

    /**
     * Enable file override feature in destination bucket
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFileOverrideInDestinationEnabled")
    private final Boolean isFileOverrideInDestinationEnabled;

    /**
     * Enable file override feature in destination bucket
     * @return the value
     **/
    public Boolean getIsFileOverrideInDestinationEnabled() {
        return isFileOverrideInDestinationEnabled;
    }

    /**
     * Determines whether GDP Scanning should be enabled for the pipeline.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isScanningEnabled")
    private final Boolean isScanningEnabled;

    /**
     * Determines whether GDP Scanning should be enabled for the pipeline.
     * @return the value
     **/
    public Boolean getIsScanningEnabled() {
        return isScanningEnabled;
    }

    /**
     * Determines whether file must be chunked during the transfer. This is only a property of SENDER pipelines.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isChunkingEnabled")
    private final Boolean isChunkingEnabled;

    /**
     * Determines whether file must be chunked during the transfer. This is only a property of SENDER pipelines.
     * @return the value
     **/
    public Boolean getIsChunkingEnabled() {
        return isChunkingEnabled;
    }

    /**
     * Determines whether file transfers need to go through an approval workflow.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isApprovalNeeded")
    private final Boolean isApprovalNeeded;

    /**
     * Determines whether file transfers need to go through an approval workflow.
     * @return the value
     **/
    public Boolean getIsApprovalNeeded() {
        return isApprovalNeeded;
    }

    /**
     * The KMS vault OCID for the key to be used for file transfer approvals.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approvalKeyVaultId")
    private final String approvalKeyVaultId;

    /**
     * The KMS vault OCID for the key to be used for file transfer approvals.
     * @return the value
     **/
    public String getApprovalKeyVaultId() {
        return approvalKeyVaultId;
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
        sb.append("CreateGdpPipelineDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", serviceLogGroupId=").append(String.valueOf(this.serviceLogGroupId));
        sb.append(", pipelineType=").append(String.valueOf(this.pipelineType));
        sb.append(", fileTypes=").append(String.valueOf(this.fileTypes));
        sb.append(", bucketDetails=").append(String.valueOf(this.bucketDetails));
        sb.append(", peeringRegion=").append(String.valueOf(this.peeringRegion));
        sb.append(", authorizationDetails=").append(String.valueOf(this.authorizationDetails));
        sb.append(", isFileOverrideInDestinationEnabled=")
                .append(String.valueOf(this.isFileOverrideInDestinationEnabled));
        sb.append(", isScanningEnabled=").append(String.valueOf(this.isScanningEnabled));
        sb.append(", isChunkingEnabled=").append(String.valueOf(this.isChunkingEnabled));
        sb.append(", isApprovalNeeded=").append(String.valueOf(this.isApprovalNeeded));
        sb.append(", approvalKeyVaultId=").append(String.valueOf(this.approvalKeyVaultId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateGdpPipelineDetails)) {
            return false;
        }

        CreateGdpPipelineDetails other = (CreateGdpPipelineDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.serviceLogGroupId, other.serviceLogGroupId)
                && java.util.Objects.equals(this.pipelineType, other.pipelineType)
                && java.util.Objects.equals(this.fileTypes, other.fileTypes)
                && java.util.Objects.equals(this.bucketDetails, other.bucketDetails)
                && java.util.Objects.equals(this.peeringRegion, other.peeringRegion)
                && java.util.Objects.equals(this.authorizationDetails, other.authorizationDetails)
                && java.util.Objects.equals(
                        this.isFileOverrideInDestinationEnabled,
                        other.isFileOverrideInDestinationEnabled)
                && java.util.Objects.equals(this.isScanningEnabled, other.isScanningEnabled)
                && java.util.Objects.equals(this.isChunkingEnabled, other.isChunkingEnabled)
                && java.util.Objects.equals(this.isApprovalNeeded, other.isApprovalNeeded)
                && java.util.Objects.equals(this.approvalKeyVaultId, other.approvalKeyVaultId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
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
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceLogGroupId == null ? 43 : this.serviceLogGroupId.hashCode());
        result = (result * PRIME) + (this.pipelineType == null ? 43 : this.pipelineType.hashCode());
        result = (result * PRIME) + (this.fileTypes == null ? 43 : this.fileTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.bucketDetails == null ? 43 : this.bucketDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.peeringRegion == null ? 43 : this.peeringRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.authorizationDetails == null
                                ? 43
                                : this.authorizationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isFileOverrideInDestinationEnabled == null
                                ? 43
                                : this.isFileOverrideInDestinationEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isScanningEnabled == null ? 43 : this.isScanningEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isChunkingEnabled == null ? 43 : this.isChunkingEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isApprovalNeeded == null ? 43 : this.isApprovalNeeded.hashCode());
        result =
                (result * PRIME)
                        + (this.approvalKeyVaultId == null
                                ? 43
                                : this.approvalKeyVaultId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

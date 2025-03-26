/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Creation details for a new ZeroETL pipeline.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateZeroEtlPipelineDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "recipeType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateZeroEtlPipelineDetails extends CreatePipelineDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
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

        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceConnectionDetails")
        private SourcePipelineConnectionDetails sourceConnectionDetails;

        public Builder sourceConnectionDetails(
                SourcePipelineConnectionDetails sourceConnectionDetails) {
            this.sourceConnectionDetails = sourceConnectionDetails;
            this.__explicitlySet__.add("sourceConnectionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetConnectionDetails")
        private TargetPipelineConnectionDetails targetConnectionDetails;

        public Builder targetConnectionDetails(
                TargetPipelineConnectionDetails targetConnectionDetails) {
            this.targetConnectionDetails = targetConnectionDetails;
            this.__explicitlySet__.add("targetConnectionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("processOptions")
        private ProcessOptions processOptions;

        public Builder processOptions(ProcessOptions processOptions) {
            this.processOptions = processOptions;
            this.__explicitlySet__.add("processOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateZeroEtlPipelineDetails build() {
            CreateZeroEtlPipelineDetails model =
                    new CreateZeroEtlPipelineDetails(
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.licenseModel,
                            this.freeformTags,
                            this.definedTags,
                            this.locks,
                            this.sourceConnectionDetails,
                            this.targetConnectionDetails,
                            this.processOptions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateZeroEtlPipelineDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("sourceConnectionDetails")) {
                this.sourceConnectionDetails(model.getSourceConnectionDetails());
            }
            if (model.wasPropertyExplicitlySet("targetConnectionDetails")) {
                this.targetConnectionDetails(model.getTargetConnectionDetails());
            }
            if (model.wasPropertyExplicitlySet("processOptions")) {
                this.processOptions(model.getProcessOptions());
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

    @Deprecated
    public CreateZeroEtlPipelineDetails(
            String displayName,
            String description,
            String compartmentId,
            LicenseModel licenseModel,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<ResourceLock> locks,
            SourcePipelineConnectionDetails sourceConnectionDetails,
            TargetPipelineConnectionDetails targetConnectionDetails,
            ProcessOptions processOptions) {
        super(
                displayName,
                description,
                compartmentId,
                licenseModel,
                freeformTags,
                definedTags,
                locks,
                sourceConnectionDetails,
                targetConnectionDetails);
        this.processOptions = processOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("processOptions")
    private final ProcessOptions processOptions;

    public ProcessOptions getProcessOptions() {
        return processOptions;
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
        sb.append("CreateZeroEtlPipelineDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", processOptions=").append(String.valueOf(this.processOptions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateZeroEtlPipelineDetails)) {
            return false;
        }

        CreateZeroEtlPipelineDetails other = (CreateZeroEtlPipelineDetails) o;
        return java.util.Objects.equals(this.processOptions, other.processOptions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.processOptions == null ? 43 : this.processOptions.hashCode());
        return result;
    }
}

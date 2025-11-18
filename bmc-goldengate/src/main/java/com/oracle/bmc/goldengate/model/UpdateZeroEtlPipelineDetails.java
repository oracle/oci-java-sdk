/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Information to update for an existing ZeroETL pipeline. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateZeroEtlPipelineDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "recipeType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateZeroEtlPipelineDetails extends UpdatePipelineDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("processOptions")
        private ProcessOptions processOptions;

        public Builder processOptions(ProcessOptions processOptions) {
            this.processOptions = processOptions;
            this.__explicitlySet__.add("processOptions");
            return this;
        }
        /** Mapping for source/target schema/tables for the pipeline data replication. */
        @com.fasterxml.jackson.annotation.JsonProperty("mappingRules")
        private java.util.List<MappingRule> mappingRules;

        /**
         * Mapping for source/target schema/tables for the pipeline data replication.
         *
         * @param mappingRules the value to set
         * @return this builder
         */
        public Builder mappingRules(java.util.List<MappingRule> mappingRules) {
            this.mappingRules = mappingRules;
            this.__explicitlySet__.add("mappingRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateZeroEtlPipelineDetails build() {
            UpdateZeroEtlPipelineDetails model =
                    new UpdateZeroEtlPipelineDetails(
                            this.displayName,
                            this.description,
                            this.licenseModel,
                            this.freeformTags,
                            this.definedTags,
                            this.subnetId,
                            this.processOptions,
                            this.mappingRules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateZeroEtlPipelineDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("processOptions")) {
                this.processOptions(model.getProcessOptions());
            }
            if (model.wasPropertyExplicitlySet("mappingRules")) {
                this.mappingRules(model.getMappingRules());
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

    @Deprecated
    public UpdateZeroEtlPipelineDetails(
            String displayName,
            String description,
            LicenseModel licenseModel,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String subnetId,
            ProcessOptions processOptions,
            java.util.List<MappingRule> mappingRules) {
        super(displayName, description, licenseModel, freeformTags, definedTags, subnetId);
        this.processOptions = processOptions;
        this.mappingRules = mappingRules;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("processOptions")
    private final ProcessOptions processOptions;

    public ProcessOptions getProcessOptions() {
        return processOptions;
    }

    /** Mapping for source/target schema/tables for the pipeline data replication. */
    @com.fasterxml.jackson.annotation.JsonProperty("mappingRules")
    private final java.util.List<MappingRule> mappingRules;

    /**
     * Mapping for source/target schema/tables for the pipeline data replication.
     *
     * @return the value
     */
    public java.util.List<MappingRule> getMappingRules() {
        return mappingRules;
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
        sb.append("UpdateZeroEtlPipelineDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", processOptions=").append(String.valueOf(this.processOptions));
        sb.append(", mappingRules=").append(String.valueOf(this.mappingRules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateZeroEtlPipelineDetails)) {
            return false;
        }

        UpdateZeroEtlPipelineDetails other = (UpdateZeroEtlPipelineDetails) o;
        return java.util.Objects.equals(this.processOptions, other.processOptions)
                && java.util.Objects.equals(this.mappingRules, other.mappingRules)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.processOptions == null ? 43 : this.processOptions.hashCode());
        result = (result * PRIME) + (this.mappingRules == null ? 43 : this.mappingRules.hashCode());
        return result;
    }
}

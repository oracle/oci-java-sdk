/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Create Migration resource parameters. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateOracleMigrationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "databaseCombination")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateOracleMigrationDetails extends UpdateMigrationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private MigrationTypes type;

        public Builder type(MigrationTypes type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabaseConnectionId")
        private String sourceDatabaseConnectionId;

        public Builder sourceDatabaseConnectionId(String sourceDatabaseConnectionId) {
            this.sourceDatabaseConnectionId = sourceDatabaseConnectionId;
            this.__explicitlySet__.add("sourceDatabaseConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseConnectionId")
        private String targetDatabaseConnectionId;

        public Builder targetDatabaseConnectionId(String targetDatabaseConnectionId) {
            this.targetDatabaseConnectionId = targetDatabaseConnectionId;
            this.__explicitlySet__.add("targetDatabaseConnectionId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("dataTransferMediumDetails")
        private UpdateOracleDataTransferMediumDetails dataTransferMediumDetails;

        public Builder dataTransferMediumDetails(
                UpdateOracleDataTransferMediumDetails dataTransferMediumDetails) {
            this.dataTransferMediumDetails = dataTransferMediumDetails;
            this.__explicitlySet__.add("dataTransferMediumDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialLoadSettings")
        private UpdateOracleInitialLoadSettings initialLoadSettings;

        public Builder initialLoadSettings(UpdateOracleInitialLoadSettings initialLoadSettings) {
            this.initialLoadSettings = initialLoadSettings;
            this.__explicitlySet__.add("initialLoadSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("advisorSettings")
        private UpdateOracleAdvisorSettings advisorSettings;

        public Builder advisorSettings(UpdateOracleAdvisorSettings advisorSettings) {
            this.advisorSettings = advisorSettings;
            this.__explicitlySet__.add("advisorSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hubDetails")
        private UpdateGoldenGateHubDetails hubDetails;

        public Builder hubDetails(UpdateGoldenGateHubDetails hubDetails) {
            this.hubDetails = hubDetails;
            this.__explicitlySet__.add("hubDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ggsDetails")
        private UpdateOracleGgsDeploymentDetails ggsDetails;

        public Builder ggsDetails(UpdateOracleGgsDeploymentDetails ggsDetails) {
            this.ggsDetails = ggsDetails;
            this.__explicitlySet__.add("ggsDetails");
            return this;
        }
        /** List of Migration Parameter objects. */
        @com.fasterxml.jackson.annotation.JsonProperty("advancedParameters")
        private java.util.List<MigrationParameterDetails> advancedParameters;

        /**
         * List of Migration Parameter objects.
         *
         * @param advancedParameters the value to set
         * @return this builder
         */
        public Builder advancedParameters(
                java.util.List<MigrationParameterDetails> advancedParameters) {
            this.advancedParameters = advancedParameters;
            this.__explicitlySet__.add("advancedParameters");
            return this;
        }
        /** The OCID of the resource being updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseConnectionId")
        private String sourceContainerDatabaseConnectionId;

        /**
         * The OCID of the resource being updated.
         *
         * @param sourceContainerDatabaseConnectionId the value to set
         * @return this builder
         */
        public Builder sourceContainerDatabaseConnectionId(
                String sourceContainerDatabaseConnectionId) {
            this.sourceContainerDatabaseConnectionId = sourceContainerDatabaseConnectionId;
            this.__explicitlySet__.add("sourceContainerDatabaseConnectionId");
            return this;
        }
        /** The OCID of the resource being updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceStandbyDatabaseConnectionId")
        private String sourceStandbyDatabaseConnectionId;

        /**
         * The OCID of the resource being updated.
         *
         * @param sourceStandbyDatabaseConnectionId the value to set
         * @return this builder
         */
        public Builder sourceStandbyDatabaseConnectionId(String sourceStandbyDatabaseConnectionId) {
            this.sourceStandbyDatabaseConnectionId = sourceStandbyDatabaseConnectionId;
            this.__explicitlySet__.add("sourceStandbyDatabaseConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOracleMigrationDetails build() {
            UpdateOracleMigrationDetails model =
                    new UpdateOracleMigrationDetails(
                            this.description,
                            this.type,
                            this.displayName,
                            this.sourceDatabaseConnectionId,
                            this.targetDatabaseConnectionId,
                            this.freeformTags,
                            this.definedTags,
                            this.dataTransferMediumDetails,
                            this.initialLoadSettings,
                            this.advisorSettings,
                            this.hubDetails,
                            this.ggsDetails,
                            this.advancedParameters,
                            this.sourceContainerDatabaseConnectionId,
                            this.sourceStandbyDatabaseConnectionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOracleMigrationDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("sourceDatabaseConnectionId")) {
                this.sourceDatabaseConnectionId(model.getSourceDatabaseConnectionId());
            }
            if (model.wasPropertyExplicitlySet("targetDatabaseConnectionId")) {
                this.targetDatabaseConnectionId(model.getTargetDatabaseConnectionId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("dataTransferMediumDetails")) {
                this.dataTransferMediumDetails(model.getDataTransferMediumDetails());
            }
            if (model.wasPropertyExplicitlySet("initialLoadSettings")) {
                this.initialLoadSettings(model.getInitialLoadSettings());
            }
            if (model.wasPropertyExplicitlySet("advisorSettings")) {
                this.advisorSettings(model.getAdvisorSettings());
            }
            if (model.wasPropertyExplicitlySet("hubDetails")) {
                this.hubDetails(model.getHubDetails());
            }
            if (model.wasPropertyExplicitlySet("ggsDetails")) {
                this.ggsDetails(model.getGgsDetails());
            }
            if (model.wasPropertyExplicitlySet("advancedParameters")) {
                this.advancedParameters(model.getAdvancedParameters());
            }
            if (model.wasPropertyExplicitlySet("sourceContainerDatabaseConnectionId")) {
                this.sourceContainerDatabaseConnectionId(
                        model.getSourceContainerDatabaseConnectionId());
            }
            if (model.wasPropertyExplicitlySet("sourceStandbyDatabaseConnectionId")) {
                this.sourceStandbyDatabaseConnectionId(
                        model.getSourceStandbyDatabaseConnectionId());
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
    public UpdateOracleMigrationDetails(
            String description,
            MigrationTypes type,
            String displayName,
            String sourceDatabaseConnectionId,
            String targetDatabaseConnectionId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            UpdateOracleDataTransferMediumDetails dataTransferMediumDetails,
            UpdateOracleInitialLoadSettings initialLoadSettings,
            UpdateOracleAdvisorSettings advisorSettings,
            UpdateGoldenGateHubDetails hubDetails,
            UpdateOracleGgsDeploymentDetails ggsDetails,
            java.util.List<MigrationParameterDetails> advancedParameters,
            String sourceContainerDatabaseConnectionId,
            String sourceStandbyDatabaseConnectionId) {
        super(
                description,
                type,
                displayName,
                sourceDatabaseConnectionId,
                targetDatabaseConnectionId,
                freeformTags,
                definedTags);
        this.dataTransferMediumDetails = dataTransferMediumDetails;
        this.initialLoadSettings = initialLoadSettings;
        this.advisorSettings = advisorSettings;
        this.hubDetails = hubDetails;
        this.ggsDetails = ggsDetails;
        this.advancedParameters = advancedParameters;
        this.sourceContainerDatabaseConnectionId = sourceContainerDatabaseConnectionId;
        this.sourceStandbyDatabaseConnectionId = sourceStandbyDatabaseConnectionId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataTransferMediumDetails")
    private final UpdateOracleDataTransferMediumDetails dataTransferMediumDetails;

    public UpdateOracleDataTransferMediumDetails getDataTransferMediumDetails() {
        return dataTransferMediumDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("initialLoadSettings")
    private final UpdateOracleInitialLoadSettings initialLoadSettings;

    public UpdateOracleInitialLoadSettings getInitialLoadSettings() {
        return initialLoadSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("advisorSettings")
    private final UpdateOracleAdvisorSettings advisorSettings;

    public UpdateOracleAdvisorSettings getAdvisorSettings() {
        return advisorSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("hubDetails")
    private final UpdateGoldenGateHubDetails hubDetails;

    public UpdateGoldenGateHubDetails getHubDetails() {
        return hubDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ggsDetails")
    private final UpdateOracleGgsDeploymentDetails ggsDetails;

    public UpdateOracleGgsDeploymentDetails getGgsDetails() {
        return ggsDetails;
    }

    /** List of Migration Parameter objects. */
    @com.fasterxml.jackson.annotation.JsonProperty("advancedParameters")
    private final java.util.List<MigrationParameterDetails> advancedParameters;

    /**
     * List of Migration Parameter objects.
     *
     * @return the value
     */
    public java.util.List<MigrationParameterDetails> getAdvancedParameters() {
        return advancedParameters;
    }

    /** The OCID of the resource being updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseConnectionId")
    private final String sourceContainerDatabaseConnectionId;

    /**
     * The OCID of the resource being updated.
     *
     * @return the value
     */
    public String getSourceContainerDatabaseConnectionId() {
        return sourceContainerDatabaseConnectionId;
    }

    /** The OCID of the resource being updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceStandbyDatabaseConnectionId")
    private final String sourceStandbyDatabaseConnectionId;

    /**
     * The OCID of the resource being updated.
     *
     * @return the value
     */
    public String getSourceStandbyDatabaseConnectionId() {
        return sourceStandbyDatabaseConnectionId;
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
        sb.append("UpdateOracleMigrationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dataTransferMediumDetails=")
                .append(String.valueOf(this.dataTransferMediumDetails));
        sb.append(", initialLoadSettings=").append(String.valueOf(this.initialLoadSettings));
        sb.append(", advisorSettings=").append(String.valueOf(this.advisorSettings));
        sb.append(", hubDetails=").append(String.valueOf(this.hubDetails));
        sb.append(", ggsDetails=").append(String.valueOf(this.ggsDetails));
        sb.append(", advancedParameters=").append(String.valueOf(this.advancedParameters));
        sb.append(", sourceContainerDatabaseConnectionId=")
                .append(String.valueOf(this.sourceContainerDatabaseConnectionId));
        sb.append(", sourceStandbyDatabaseConnectionId=")
                .append(String.valueOf(this.sourceStandbyDatabaseConnectionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOracleMigrationDetails)) {
            return false;
        }

        UpdateOracleMigrationDetails other = (UpdateOracleMigrationDetails) o;
        return java.util.Objects.equals(
                        this.dataTransferMediumDetails, other.dataTransferMediumDetails)
                && java.util.Objects.equals(this.initialLoadSettings, other.initialLoadSettings)
                && java.util.Objects.equals(this.advisorSettings, other.advisorSettings)
                && java.util.Objects.equals(this.hubDetails, other.hubDetails)
                && java.util.Objects.equals(this.ggsDetails, other.ggsDetails)
                && java.util.Objects.equals(this.advancedParameters, other.advancedParameters)
                && java.util.Objects.equals(
                        this.sourceContainerDatabaseConnectionId,
                        other.sourceContainerDatabaseConnectionId)
                && java.util.Objects.equals(
                        this.sourceStandbyDatabaseConnectionId,
                        other.sourceStandbyDatabaseConnectionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.dataTransferMediumDetails == null
                                ? 43
                                : this.dataTransferMediumDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.initialLoadSettings == null
                                ? 43
                                : this.initialLoadSettings.hashCode());
        result =
                (result * PRIME)
                        + (this.advisorSettings == null ? 43 : this.advisorSettings.hashCode());
        result = (result * PRIME) + (this.hubDetails == null ? 43 : this.hubDetails.hashCode());
        result = (result * PRIME) + (this.ggsDetails == null ? 43 : this.ggsDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.advancedParameters == null
                                ? 43
                                : this.advancedParameters.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceContainerDatabaseConnectionId == null
                                ? 43
                                : this.sourceContainerDatabaseConnectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceStandbyDatabaseConnectionId == null
                                ? 43
                                : this.sourceStandbyDatabaseConnectionId.hashCode());
        return result;
    }
}

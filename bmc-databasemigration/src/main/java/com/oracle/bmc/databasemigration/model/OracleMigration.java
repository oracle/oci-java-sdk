/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Oracle Migration resource <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OracleMigration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "databaseCombination")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OracleMigration extends Migration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private MigrationTypes type;

        public Builder type(MigrationTypes type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("waitAfter")
        private OdmsJobPhases waitAfter;

        public Builder waitAfter(OdmsJobPhases waitAfter) {
            this.waitAfter = waitAfter;
            this.__explicitlySet__.add("waitAfter");
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

        @com.fasterxml.jackson.annotation.JsonProperty("executingJobId")
        private String executingJobId;

        public Builder executingJobId(String executingJobId) {
            this.executingJobId = executingJobId;
            this.__explicitlySet__.add("executingJobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastMigration")
        private java.util.Date timeLastMigration;

        public Builder timeLastMigration(java.util.Date timeLastMigration) {
            this.timeLastMigration = timeLastMigration;
            this.__explicitlySet__.add("timeLastMigration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MigrationLifecycleStates lifecycleState;

        public Builder lifecycleState(MigrationLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private MigrationStatus lifecycleDetails;

        public Builder lifecycleDetails(MigrationStatus lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataTransferMediumDetails")
        private OracleDataTransferMediumDetails dataTransferMediumDetails;

        public Builder dataTransferMediumDetails(
                OracleDataTransferMediumDetails dataTransferMediumDetails) {
            this.dataTransferMediumDetails = dataTransferMediumDetails;
            this.__explicitlySet__.add("dataTransferMediumDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialLoadSettings")
        private OracleInitialLoadSettings initialLoadSettings;

        public Builder initialLoadSettings(OracleInitialLoadSettings initialLoadSettings) {
            this.initialLoadSettings = initialLoadSettings;
            this.__explicitlySet__.add("initialLoadSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("advisorSettings")
        private OracleAdvisorSettings advisorSettings;

        public Builder advisorSettings(OracleAdvisorSettings advisorSettings) {
            this.advisorSettings = advisorSettings;
            this.__explicitlySet__.add("advisorSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hubDetails")
        private GoldenGateHubDetails hubDetails;

        public Builder hubDetails(GoldenGateHubDetails hubDetails) {
            this.hubDetails = hubDetails;
            this.__explicitlySet__.add("hubDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ggsDetails")
        private OracleGgsDeploymentDetails ggsDetails;

        public Builder ggsDetails(OracleGgsDeploymentDetails ggsDetails) {
            this.ggsDetails = ggsDetails;
            this.__explicitlySet__.add("ggsDetails");
            return this;
        }
        /** The OCID of the resource being referenced. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseConnectionId")
        private String sourceContainerDatabaseConnectionId;

        /**
         * The OCID of the resource being referenced.
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
        /** The OCID of the resource being referenced. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceStandbyDatabaseConnectionId")
        private String sourceStandbyDatabaseConnectionId;

        /**
         * The OCID of the resource being referenced.
         *
         * @param sourceStandbyDatabaseConnectionId the value to set
         * @return this builder
         */
        public Builder sourceStandbyDatabaseConnectionId(String sourceStandbyDatabaseConnectionId) {
            this.sourceStandbyDatabaseConnectionId = sourceStandbyDatabaseConnectionId;
            this.__explicitlySet__.add("sourceStandbyDatabaseConnectionId");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OracleMigration build() {
            OracleMigration model =
                    new OracleMigration(
                            this.id,
                            this.description,
                            this.displayName,
                            this.compartmentId,
                            this.type,
                            this.waitAfter,
                            this.sourceDatabaseConnectionId,
                            this.targetDatabaseConnectionId,
                            this.executingJobId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeLastMigration,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.dataTransferMediumDetails,
                            this.initialLoadSettings,
                            this.advisorSettings,
                            this.hubDetails,
                            this.ggsDetails,
                            this.sourceContainerDatabaseConnectionId,
                            this.sourceStandbyDatabaseConnectionId,
                            this.advancedParameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OracleMigration model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("waitAfter")) {
                this.waitAfter(model.getWaitAfter());
            }
            if (model.wasPropertyExplicitlySet("sourceDatabaseConnectionId")) {
                this.sourceDatabaseConnectionId(model.getSourceDatabaseConnectionId());
            }
            if (model.wasPropertyExplicitlySet("targetDatabaseConnectionId")) {
                this.targetDatabaseConnectionId(model.getTargetDatabaseConnectionId());
            }
            if (model.wasPropertyExplicitlySet("executingJobId")) {
                this.executingJobId(model.getExecutingJobId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeLastMigration")) {
                this.timeLastMigration(model.getTimeLastMigration());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
            if (model.wasPropertyExplicitlySet("sourceContainerDatabaseConnectionId")) {
                this.sourceContainerDatabaseConnectionId(
                        model.getSourceContainerDatabaseConnectionId());
            }
            if (model.wasPropertyExplicitlySet("sourceStandbyDatabaseConnectionId")) {
                this.sourceStandbyDatabaseConnectionId(
                        model.getSourceStandbyDatabaseConnectionId());
            }
            if (model.wasPropertyExplicitlySet("advancedParameters")) {
                this.advancedParameters(model.getAdvancedParameters());
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
    public OracleMigration(
            String id,
            String description,
            String displayName,
            String compartmentId,
            MigrationTypes type,
            OdmsJobPhases waitAfter,
            String sourceDatabaseConnectionId,
            String targetDatabaseConnectionId,
            String executingJobId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeLastMigration,
            MigrationLifecycleStates lifecycleState,
            MigrationStatus lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            OracleDataTransferMediumDetails dataTransferMediumDetails,
            OracleInitialLoadSettings initialLoadSettings,
            OracleAdvisorSettings advisorSettings,
            GoldenGateHubDetails hubDetails,
            OracleGgsDeploymentDetails ggsDetails,
            String sourceContainerDatabaseConnectionId,
            String sourceStandbyDatabaseConnectionId,
            java.util.List<MigrationParameterDetails> advancedParameters) {
        super(
                id,
                description,
                displayName,
                compartmentId,
                type,
                waitAfter,
                sourceDatabaseConnectionId,
                targetDatabaseConnectionId,
                executingJobId,
                timeCreated,
                timeUpdated,
                timeLastMigration,
                lifecycleState,
                lifecycleDetails,
                freeformTags,
                definedTags,
                systemTags);
        this.dataTransferMediumDetails = dataTransferMediumDetails;
        this.initialLoadSettings = initialLoadSettings;
        this.advisorSettings = advisorSettings;
        this.hubDetails = hubDetails;
        this.ggsDetails = ggsDetails;
        this.sourceContainerDatabaseConnectionId = sourceContainerDatabaseConnectionId;
        this.sourceStandbyDatabaseConnectionId = sourceStandbyDatabaseConnectionId;
        this.advancedParameters = advancedParameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataTransferMediumDetails")
    private final OracleDataTransferMediumDetails dataTransferMediumDetails;

    public OracleDataTransferMediumDetails getDataTransferMediumDetails() {
        return dataTransferMediumDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("initialLoadSettings")
    private final OracleInitialLoadSettings initialLoadSettings;

    public OracleInitialLoadSettings getInitialLoadSettings() {
        return initialLoadSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("advisorSettings")
    private final OracleAdvisorSettings advisorSettings;

    public OracleAdvisorSettings getAdvisorSettings() {
        return advisorSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("hubDetails")
    private final GoldenGateHubDetails hubDetails;

    public GoldenGateHubDetails getHubDetails() {
        return hubDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ggsDetails")
    private final OracleGgsDeploymentDetails ggsDetails;

    public OracleGgsDeploymentDetails getGgsDetails() {
        return ggsDetails;
    }

    /** The OCID of the resource being referenced. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseConnectionId")
    private final String sourceContainerDatabaseConnectionId;

    /**
     * The OCID of the resource being referenced.
     *
     * @return the value
     */
    public String getSourceContainerDatabaseConnectionId() {
        return sourceContainerDatabaseConnectionId;
    }

    /** The OCID of the resource being referenced. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceStandbyDatabaseConnectionId")
    private final String sourceStandbyDatabaseConnectionId;

    /**
     * The OCID of the resource being referenced.
     *
     * @return the value
     */
    public String getSourceStandbyDatabaseConnectionId() {
        return sourceStandbyDatabaseConnectionId;
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
        sb.append("OracleMigration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dataTransferMediumDetails=")
                .append(String.valueOf(this.dataTransferMediumDetails));
        sb.append(", initialLoadSettings=").append(String.valueOf(this.initialLoadSettings));
        sb.append(", advisorSettings=").append(String.valueOf(this.advisorSettings));
        sb.append(", hubDetails=").append(String.valueOf(this.hubDetails));
        sb.append(", ggsDetails=").append(String.valueOf(this.ggsDetails));
        sb.append(", sourceContainerDatabaseConnectionId=")
                .append(String.valueOf(this.sourceContainerDatabaseConnectionId));
        sb.append(", sourceStandbyDatabaseConnectionId=")
                .append(String.valueOf(this.sourceStandbyDatabaseConnectionId));
        sb.append(", advancedParameters=").append(String.valueOf(this.advancedParameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OracleMigration)) {
            return false;
        }

        OracleMigration other = (OracleMigration) o;
        return java.util.Objects.equals(
                        this.dataTransferMediumDetails, other.dataTransferMediumDetails)
                && java.util.Objects.equals(this.initialLoadSettings, other.initialLoadSettings)
                && java.util.Objects.equals(this.advisorSettings, other.advisorSettings)
                && java.util.Objects.equals(this.hubDetails, other.hubDetails)
                && java.util.Objects.equals(this.ggsDetails, other.ggsDetails)
                && java.util.Objects.equals(
                        this.sourceContainerDatabaseConnectionId,
                        other.sourceContainerDatabaseConnectionId)
                && java.util.Objects.equals(
                        this.sourceStandbyDatabaseConnectionId,
                        other.sourceStandbyDatabaseConnectionId)
                && java.util.Objects.equals(this.advancedParameters, other.advancedParameters)
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
                        + (this.sourceContainerDatabaseConnectionId == null
                                ? 43
                                : this.sourceContainerDatabaseConnectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceStandbyDatabaseConnectionId == null
                                ? 43
                                : this.sourceStandbyDatabaseConnectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.advancedParameters == null
                                ? 43
                                : this.advancedParameters.hashCode());
        return result;
    }
}

/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
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
        builder = CreateOracleMigrationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "databaseCombination")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOracleMigrationDetails extends CreateMigrationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        private CreateOracleDataTransferMediumDetails dataTransferMediumDetails;

        public Builder dataTransferMediumDetails(
                CreateOracleDataTransferMediumDetails dataTransferMediumDetails) {
            this.dataTransferMediumDetails = dataTransferMediumDetails;
            this.__explicitlySet__.add("dataTransferMediumDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialLoadSettings")
        private CreateOracleInitialLoadSettings initialLoadSettings;

        public Builder initialLoadSettings(CreateOracleInitialLoadSettings initialLoadSettings) {
            this.initialLoadSettings = initialLoadSettings;
            this.__explicitlySet__.add("initialLoadSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("advisorSettings")
        private CreateOracleAdvisorSettings advisorSettings;

        public Builder advisorSettings(CreateOracleAdvisorSettings advisorSettings) {
            this.advisorSettings = advisorSettings;
            this.__explicitlySet__.add("advisorSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hubDetails")
        private CreateGoldenGateHubDetails hubDetails;

        public Builder hubDetails(CreateGoldenGateHubDetails hubDetails) {
            this.hubDetails = hubDetails;
            this.__explicitlySet__.add("hubDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ggsDetails")
        private CreateOracleGgsDeploymentDetails ggsDetails;

        public Builder ggsDetails(CreateOracleGgsDeploymentDetails ggsDetails) {
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
        /**
         * Database objects to exclude from migration, cannot be specified alongside
         * 'includeObjects'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("excludeObjects")
        private java.util.List<OracleDatabaseObject> excludeObjects;

        /**
         * Database objects to exclude from migration, cannot be specified alongside
         * 'includeObjects'
         *
         * @param excludeObjects the value to set
         * @return this builder
         */
        public Builder excludeObjects(java.util.List<OracleDatabaseObject> excludeObjects) {
            this.excludeObjects = excludeObjects;
            this.__explicitlySet__.add("excludeObjects");
            return this;
        }
        /**
         * Database objects to include from migration, cannot be specified alongside
         * 'excludeObjects'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("includeObjects")
        private java.util.List<OracleDatabaseObject> includeObjects;

        /**
         * Database objects to include from migration, cannot be specified alongside
         * 'excludeObjects'
         *
         * @param includeObjects the value to set
         * @return this builder
         */
        public Builder includeObjects(java.util.List<OracleDatabaseObject> includeObjects) {
            this.includeObjects = includeObjects;
            this.__explicitlySet__.add("includeObjects");
            return this;
        }
        /**
         * Specifies the database objects to be excluded from the migration in bulk. The definition
         * accepts input in a CSV format, newline separated for each entry. More details can be
         * found in the documentation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bulkIncludeExcludeData")
        private String bulkIncludeExcludeData;

        /**
         * Specifies the database objects to be excluded from the migration in bulk. The definition
         * accepts input in a CSV format, newline separated for each entry. More details can be
         * found in the documentation.
         *
         * @param bulkIncludeExcludeData the value to set
         * @return this builder
         */
        public Builder bulkIncludeExcludeData(String bulkIncludeExcludeData) {
            this.bulkIncludeExcludeData = bulkIncludeExcludeData;
            this.__explicitlySet__.add("bulkIncludeExcludeData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOracleMigrationDetails build() {
            CreateOracleMigrationDetails model =
                    new CreateOracleMigrationDetails(
                            this.description,
                            this.compartmentId,
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
                            this.sourceStandbyDatabaseConnectionId,
                            this.excludeObjects,
                            this.includeObjects,
                            this.bulkIncludeExcludeData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOracleMigrationDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
            if (model.wasPropertyExplicitlySet("excludeObjects")) {
                this.excludeObjects(model.getExcludeObjects());
            }
            if (model.wasPropertyExplicitlySet("includeObjects")) {
                this.includeObjects(model.getIncludeObjects());
            }
            if (model.wasPropertyExplicitlySet("bulkIncludeExcludeData")) {
                this.bulkIncludeExcludeData(model.getBulkIncludeExcludeData());
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
    public CreateOracleMigrationDetails(
            String description,
            String compartmentId,
            MigrationTypes type,
            String displayName,
            String sourceDatabaseConnectionId,
            String targetDatabaseConnectionId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            CreateOracleDataTransferMediumDetails dataTransferMediumDetails,
            CreateOracleInitialLoadSettings initialLoadSettings,
            CreateOracleAdvisorSettings advisorSettings,
            CreateGoldenGateHubDetails hubDetails,
            CreateOracleGgsDeploymentDetails ggsDetails,
            java.util.List<MigrationParameterDetails> advancedParameters,
            String sourceContainerDatabaseConnectionId,
            String sourceStandbyDatabaseConnectionId,
            java.util.List<OracleDatabaseObject> excludeObjects,
            java.util.List<OracleDatabaseObject> includeObjects,
            String bulkIncludeExcludeData) {
        super(
                description,
                compartmentId,
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
        this.excludeObjects = excludeObjects;
        this.includeObjects = includeObjects;
        this.bulkIncludeExcludeData = bulkIncludeExcludeData;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataTransferMediumDetails")
    private final CreateOracleDataTransferMediumDetails dataTransferMediumDetails;

    public CreateOracleDataTransferMediumDetails getDataTransferMediumDetails() {
        return dataTransferMediumDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("initialLoadSettings")
    private final CreateOracleInitialLoadSettings initialLoadSettings;

    public CreateOracleInitialLoadSettings getInitialLoadSettings() {
        return initialLoadSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("advisorSettings")
    private final CreateOracleAdvisorSettings advisorSettings;

    public CreateOracleAdvisorSettings getAdvisorSettings() {
        return advisorSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("hubDetails")
    private final CreateGoldenGateHubDetails hubDetails;

    public CreateGoldenGateHubDetails getHubDetails() {
        return hubDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ggsDetails")
    private final CreateOracleGgsDeploymentDetails ggsDetails;

    public CreateOracleGgsDeploymentDetails getGgsDetails() {
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

    /**
     * Database objects to exclude from migration, cannot be specified alongside 'includeObjects'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("excludeObjects")
    private final java.util.List<OracleDatabaseObject> excludeObjects;

    /**
     * Database objects to exclude from migration, cannot be specified alongside 'includeObjects'
     *
     * @return the value
     */
    public java.util.List<OracleDatabaseObject> getExcludeObjects() {
        return excludeObjects;
    }

    /**
     * Database objects to include from migration, cannot be specified alongside 'excludeObjects'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("includeObjects")
    private final java.util.List<OracleDatabaseObject> includeObjects;

    /**
     * Database objects to include from migration, cannot be specified alongside 'excludeObjects'
     *
     * @return the value
     */
    public java.util.List<OracleDatabaseObject> getIncludeObjects() {
        return includeObjects;
    }

    /**
     * Specifies the database objects to be excluded from the migration in bulk. The definition
     * accepts input in a CSV format, newline separated for each entry. More details can be found in
     * the documentation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bulkIncludeExcludeData")
    private final String bulkIncludeExcludeData;

    /**
     * Specifies the database objects to be excluded from the migration in bulk. The definition
     * accepts input in a CSV format, newline separated for each entry. More details can be found in
     * the documentation.
     *
     * @return the value
     */
    public String getBulkIncludeExcludeData() {
        return bulkIncludeExcludeData;
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
        sb.append("CreateOracleMigrationDetails(");
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
        sb.append(", excludeObjects=").append(String.valueOf(this.excludeObjects));
        sb.append(", includeObjects=").append(String.valueOf(this.includeObjects));
        sb.append(", bulkIncludeExcludeData=").append(String.valueOf(this.bulkIncludeExcludeData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOracleMigrationDetails)) {
            return false;
        }

        CreateOracleMigrationDetails other = (CreateOracleMigrationDetails) o;
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
                && java.util.Objects.equals(this.excludeObjects, other.excludeObjects)
                && java.util.Objects.equals(this.includeObjects, other.includeObjects)
                && java.util.Objects.equals(
                        this.bulkIncludeExcludeData, other.bulkIncludeExcludeData)
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
        result =
                (result * PRIME)
                        + (this.excludeObjects == null ? 43 : this.excludeObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.includeObjects == null ? 43 : this.includeObjects.hashCode());
        result =
                (result * PRIME)
                        + (this.bulkIncludeExcludeData == null
                                ? 43
                                : this.bulkIncludeExcludeData.hashCode());
        return result;
    }
}

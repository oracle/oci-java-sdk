/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Oracle online logical migration settings.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OracleOnlineLogicalMigrationSettings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "migrationMethod"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OracleOnlineLogicalMigrationSettings extends OracleMigrationSettings {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

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
        /**
         * The OCID of the resource being referenced.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseConnectionId")
        private String sourceContainerDatabaseConnectionId;

        /**
         * The OCID of the resource being referenced.
         * @param sourceContainerDatabaseConnectionId the value to set
         * @return this builder
         **/
        public Builder sourceContainerDatabaseConnectionId(
                String sourceContainerDatabaseConnectionId) {
            this.sourceContainerDatabaseConnectionId = sourceContainerDatabaseConnectionId;
            this.__explicitlySet__.add("sourceContainerDatabaseConnectionId");
            return this;
        }
        /**
         * List of Migration Parameter objects.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("advancedParameters")
        private java.util.List<MigrationParameterDetails> advancedParameters;

        /**
         * List of Migration Parameter objects.
         * @param advancedParameters the value to set
         * @return this builder
         **/
        public Builder advancedParameters(
                java.util.List<MigrationParameterDetails> advancedParameters) {
            this.advancedParameters = advancedParameters;
            this.__explicitlySet__.add("advancedParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OracleOnlineLogicalMigrationSettings build() {
            OracleOnlineLogicalMigrationSettings model =
                    new OracleOnlineLogicalMigrationSettings(
                            this.dataTransferMediumDetails,
                            this.initialLoadSettings,
                            this.advisorSettings,
                            this.hubDetails,
                            this.ggsDetails,
                            this.sourceContainerDatabaseConnectionId,
                            this.advancedParameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OracleOnlineLogicalMigrationSettings model) {
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
            if (model.wasPropertyExplicitlySet("advancedParameters")) {
                this.advancedParameters(model.getAdvancedParameters());
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
    public OracleOnlineLogicalMigrationSettings(
            OracleDataTransferMediumDetails dataTransferMediumDetails,
            OracleInitialLoadSettings initialLoadSettings,
            OracleAdvisorSettings advisorSettings,
            GoldenGateHubDetails hubDetails,
            OracleGgsDeploymentDetails ggsDetails,
            String sourceContainerDatabaseConnectionId,
            java.util.List<MigrationParameterDetails> advancedParameters) {
        super();
        this.dataTransferMediumDetails = dataTransferMediumDetails;
        this.initialLoadSettings = initialLoadSettings;
        this.advisorSettings = advisorSettings;
        this.hubDetails = hubDetails;
        this.ggsDetails = ggsDetails;
        this.sourceContainerDatabaseConnectionId = sourceContainerDatabaseConnectionId;
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

    /**
     * The OCID of the resource being referenced.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceContainerDatabaseConnectionId")
    private final String sourceContainerDatabaseConnectionId;

    /**
     * The OCID of the resource being referenced.
     * @return the value
     **/
    public String getSourceContainerDatabaseConnectionId() {
        return sourceContainerDatabaseConnectionId;
    }

    /**
     * List of Migration Parameter objects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("advancedParameters")
    private final java.util.List<MigrationParameterDetails> advancedParameters;

    /**
     * List of Migration Parameter objects.
     * @return the value
     **/
    public java.util.List<MigrationParameterDetails> getAdvancedParameters() {
        return advancedParameters;
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
        sb.append("OracleOnlineLogicalMigrationSettings(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dataTransferMediumDetails=")
                .append(String.valueOf(this.dataTransferMediumDetails));
        sb.append(", initialLoadSettings=").append(String.valueOf(this.initialLoadSettings));
        sb.append(", advisorSettings=").append(String.valueOf(this.advisorSettings));
        sb.append(", hubDetails=").append(String.valueOf(this.hubDetails));
        sb.append(", ggsDetails=").append(String.valueOf(this.ggsDetails));
        sb.append(", sourceContainerDatabaseConnectionId=")
                .append(String.valueOf(this.sourceContainerDatabaseConnectionId));
        sb.append(", advancedParameters=").append(String.valueOf(this.advancedParameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OracleOnlineLogicalMigrationSettings)) {
            return false;
        }

        OracleOnlineLogicalMigrationSettings other = (OracleOnlineLogicalMigrationSettings) o;
        return java.util.Objects.equals(
                        this.dataTransferMediumDetails, other.dataTransferMediumDetails)
                && java.util.Objects.equals(this.initialLoadSettings, other.initialLoadSettings)
                && java.util.Objects.equals(this.advisorSettings, other.advisorSettings)
                && java.util.Objects.equals(this.hubDetails, other.hubDetails)
                && java.util.Objects.equals(this.ggsDetails, other.ggsDetails)
                && java.util.Objects.equals(
                        this.sourceContainerDatabaseConnectionId,
                        other.sourceContainerDatabaseConnectionId)
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
                        + (this.advancedParameters == null
                                ? 43
                                : this.advancedParameters.hashCode());
        return result;
    }
}

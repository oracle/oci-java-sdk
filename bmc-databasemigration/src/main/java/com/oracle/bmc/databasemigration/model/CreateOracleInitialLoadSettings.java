/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Optional settings for Data Pump Export and Import jobs
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
    builder = CreateOracleInitialLoadSettings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateOracleInitialLoadSettings
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dataPumpParameters",
        "tablespaceDetails",
        "exportDirectoryObject",
        "importDirectoryObject",
        "jobMode",
        "metadataRemaps"
    })
    public CreateOracleInitialLoadSettings(
            CreateDataPumpParameters dataPumpParameters,
            CreateTargetTypeTablespaceDetails tablespaceDetails,
            CreateDirectoryObject exportDirectoryObject,
            CreateDirectoryObject importDirectoryObject,
            JobModeOracle jobMode,
            java.util.List<MetadataRemap> metadataRemaps) {
        super();
        this.dataPumpParameters = dataPumpParameters;
        this.tablespaceDetails = tablespaceDetails;
        this.exportDirectoryObject = exportDirectoryObject;
        this.importDirectoryObject = importDirectoryObject;
        this.jobMode = jobMode;
        this.metadataRemaps = metadataRemaps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("dataPumpParameters")
        private CreateDataPumpParameters dataPumpParameters;

        public Builder dataPumpParameters(CreateDataPumpParameters dataPumpParameters) {
            this.dataPumpParameters = dataPumpParameters;
            this.__explicitlySet__.add("dataPumpParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tablespaceDetails")
        private CreateTargetTypeTablespaceDetails tablespaceDetails;

        public Builder tablespaceDetails(CreateTargetTypeTablespaceDetails tablespaceDetails) {
            this.tablespaceDetails = tablespaceDetails;
            this.__explicitlySet__.add("tablespaceDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exportDirectoryObject")
        private CreateDirectoryObject exportDirectoryObject;

        public Builder exportDirectoryObject(CreateDirectoryObject exportDirectoryObject) {
            this.exportDirectoryObject = exportDirectoryObject;
            this.__explicitlySet__.add("exportDirectoryObject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("importDirectoryObject")
        private CreateDirectoryObject importDirectoryObject;

        public Builder importDirectoryObject(CreateDirectoryObject importDirectoryObject) {
            this.importDirectoryObject = importDirectoryObject;
            this.__explicitlySet__.add("importDirectoryObject");
            return this;
        }
        /**
         * Oracle Job Mode
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobMode")
        private JobModeOracle jobMode;

        /**
         * Oracle Job Mode
         * @param jobMode the value to set
         * @return this builder
         **/
        public Builder jobMode(JobModeOracle jobMode) {
            this.jobMode = jobMode;
            this.__explicitlySet__.add("jobMode");
            return this;
        }
        /**
         * Defines remapping to be applied to objects as they are processed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadataRemaps")
        private java.util.List<MetadataRemap> metadataRemaps;

        /**
         * Defines remapping to be applied to objects as they are processed.
         *
         * @param metadataRemaps the value to set
         * @return this builder
         **/
        public Builder metadataRemaps(java.util.List<MetadataRemap> metadataRemaps) {
            this.metadataRemaps = metadataRemaps;
            this.__explicitlySet__.add("metadataRemaps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOracleInitialLoadSettings build() {
            CreateOracleInitialLoadSettings model =
                    new CreateOracleInitialLoadSettings(
                            this.dataPumpParameters,
                            this.tablespaceDetails,
                            this.exportDirectoryObject,
                            this.importDirectoryObject,
                            this.jobMode,
                            this.metadataRemaps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOracleInitialLoadSettings model) {
            if (model.wasPropertyExplicitlySet("dataPumpParameters")) {
                this.dataPumpParameters(model.getDataPumpParameters());
            }
            if (model.wasPropertyExplicitlySet("tablespaceDetails")) {
                this.tablespaceDetails(model.getTablespaceDetails());
            }
            if (model.wasPropertyExplicitlySet("exportDirectoryObject")) {
                this.exportDirectoryObject(model.getExportDirectoryObject());
            }
            if (model.wasPropertyExplicitlySet("importDirectoryObject")) {
                this.importDirectoryObject(model.getImportDirectoryObject());
            }
            if (model.wasPropertyExplicitlySet("jobMode")) {
                this.jobMode(model.getJobMode());
            }
            if (model.wasPropertyExplicitlySet("metadataRemaps")) {
                this.metadataRemaps(model.getMetadataRemaps());
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

    @com.fasterxml.jackson.annotation.JsonProperty("dataPumpParameters")
    private final CreateDataPumpParameters dataPumpParameters;

    public CreateDataPumpParameters getDataPumpParameters() {
        return dataPumpParameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tablespaceDetails")
    private final CreateTargetTypeTablespaceDetails tablespaceDetails;

    public CreateTargetTypeTablespaceDetails getTablespaceDetails() {
        return tablespaceDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("exportDirectoryObject")
    private final CreateDirectoryObject exportDirectoryObject;

    public CreateDirectoryObject getExportDirectoryObject() {
        return exportDirectoryObject;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("importDirectoryObject")
    private final CreateDirectoryObject importDirectoryObject;

    public CreateDirectoryObject getImportDirectoryObject() {
        return importDirectoryObject;
    }

    /**
     * Oracle Job Mode
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobMode")
    private final JobModeOracle jobMode;

    /**
     * Oracle Job Mode
     * @return the value
     **/
    public JobModeOracle getJobMode() {
        return jobMode;
    }

    /**
     * Defines remapping to be applied to objects as they are processed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadataRemaps")
    private final java.util.List<MetadataRemap> metadataRemaps;

    /**
     * Defines remapping to be applied to objects as they are processed.
     *
     * @return the value
     **/
    public java.util.List<MetadataRemap> getMetadataRemaps() {
        return metadataRemaps;
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
        sb.append("CreateOracleInitialLoadSettings(");
        sb.append("super=").append(super.toString());
        sb.append("dataPumpParameters=").append(String.valueOf(this.dataPumpParameters));
        sb.append(", tablespaceDetails=").append(String.valueOf(this.tablespaceDetails));
        sb.append(", exportDirectoryObject=").append(String.valueOf(this.exportDirectoryObject));
        sb.append(", importDirectoryObject=").append(String.valueOf(this.importDirectoryObject));
        sb.append(", jobMode=").append(String.valueOf(this.jobMode));
        sb.append(", metadataRemaps=").append(String.valueOf(this.metadataRemaps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOracleInitialLoadSettings)) {
            return false;
        }

        CreateOracleInitialLoadSettings other = (CreateOracleInitialLoadSettings) o;
        return java.util.Objects.equals(this.dataPumpParameters, other.dataPumpParameters)
                && java.util.Objects.equals(this.tablespaceDetails, other.tablespaceDetails)
                && java.util.Objects.equals(this.exportDirectoryObject, other.exportDirectoryObject)
                && java.util.Objects.equals(this.importDirectoryObject, other.importDirectoryObject)
                && java.util.Objects.equals(this.jobMode, other.jobMode)
                && java.util.Objects.equals(this.metadataRemaps, other.metadataRemaps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dataPumpParameters == null
                                ? 43
                                : this.dataPumpParameters.hashCode());
        result =
                (result * PRIME)
                        + (this.tablespaceDetails == null ? 43 : this.tablespaceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.exportDirectoryObject == null
                                ? 43
                                : this.exportDirectoryObject.hashCode());
        result =
                (result * PRIME)
                        + (this.importDirectoryObject == null
                                ? 43
                                : this.importDirectoryObject.hashCode());
        result = (result * PRIME) + (this.jobMode == null ? 43 : this.jobMode.hashCode());
        result =
                (result * PRIME)
                        + (this.metadataRemaps == null ? 43 : this.metadataRemaps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

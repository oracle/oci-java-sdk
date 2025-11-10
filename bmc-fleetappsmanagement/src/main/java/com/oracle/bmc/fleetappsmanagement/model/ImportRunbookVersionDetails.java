/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Request to Export Runbook Version. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ImportRunbookVersionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImportRunbookVersionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "contentSource",
        "contentDestination",
        "runbookId",
        "importOption",
        "version",
        "requiredValues"
    })
    public ImportRunbookVersionDetails(
            String compartmentId,
            TransferRunbookContentDetails contentSource,
            TransferRunbookContentDetails contentDestination,
            String runbookId,
            ImportRunbookDetails.ImportOption importOption,
            String version,
            java.util.List<RunbookImportRequiredValue> requiredValues) {
        super();
        this.compartmentId = compartmentId;
        this.contentSource = contentSource;
        this.contentDestination = contentDestination;
        this.runbookId = runbookId;
        this.importOption = importOption;
        this.version = version;
        this.requiredValues = requiredValues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the compartment to which the resource belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment to which the resource belongs to.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentSource")
        private TransferRunbookContentDetails contentSource;

        public Builder contentSource(TransferRunbookContentDetails contentSource) {
            this.contentSource = contentSource;
            this.__explicitlySet__.add("contentSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentDestination")
        private TransferRunbookContentDetails contentDestination;

        public Builder contentDestination(TransferRunbookContentDetails contentDestination) {
            this.contentDestination = contentDestination;
            this.__explicitlySet__.add("contentDestination");
            return this;
        }
        /** The OCID of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("runbookId")
        private String runbookId;

        /**
         * The OCID of the resource.
         *
         * @param runbookId the value to set
         * @return this builder
         */
        public Builder runbookId(String runbookId) {
            this.runbookId = runbookId;
            this.__explicitlySet__.add("runbookId");
            return this;
        }
        /** ImportOptions for Runbook. */
        @com.fasterxml.jackson.annotation.JsonProperty("importOption")
        private ImportRunbookDetails.ImportOption importOption;

        /**
         * ImportOptions for Runbook.
         *
         * @param importOption the value to set
         * @return this builder
         */
        public Builder importOption(ImportRunbookDetails.ImportOption importOption) {
            this.importOption = importOption;
            this.__explicitlySet__.add("importOption");
            return this;
        }
        /** Version number. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Version number.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** List of required values. */
        @com.fasterxml.jackson.annotation.JsonProperty("requiredValues")
        private java.util.List<RunbookImportRequiredValue> requiredValues;

        /**
         * List of required values.
         *
         * @param requiredValues the value to set
         * @return this builder
         */
        public Builder requiredValues(java.util.List<RunbookImportRequiredValue> requiredValues) {
            this.requiredValues = requiredValues;
            this.__explicitlySet__.add("requiredValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportRunbookVersionDetails build() {
            ImportRunbookVersionDetails model =
                    new ImportRunbookVersionDetails(
                            this.compartmentId,
                            this.contentSource,
                            this.contentDestination,
                            this.runbookId,
                            this.importOption,
                            this.version,
                            this.requiredValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportRunbookVersionDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("contentSource")) {
                this.contentSource(model.getContentSource());
            }
            if (model.wasPropertyExplicitlySet("contentDestination")) {
                this.contentDestination(model.getContentDestination());
            }
            if (model.wasPropertyExplicitlySet("runbookId")) {
                this.runbookId(model.getRunbookId());
            }
            if (model.wasPropertyExplicitlySet("importOption")) {
                this.importOption(model.getImportOption());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("requiredValues")) {
                this.requiredValues(model.getRequiredValues());
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

    /** OCID of the compartment to which the resource belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment to which the resource belongs to.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("contentSource")
    private final TransferRunbookContentDetails contentSource;

    public TransferRunbookContentDetails getContentSource() {
        return contentSource;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("contentDestination")
    private final TransferRunbookContentDetails contentDestination;

    public TransferRunbookContentDetails getContentDestination() {
        return contentDestination;
    }

    /** The OCID of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("runbookId")
    private final String runbookId;

    /**
     * The OCID of the resource.
     *
     * @return the value
     */
    public String getRunbookId() {
        return runbookId;
    }

    /** ImportOptions for Runbook. */
    @com.fasterxml.jackson.annotation.JsonProperty("importOption")
    private final ImportRunbookDetails.ImportOption importOption;

    /**
     * ImportOptions for Runbook.
     *
     * @return the value
     */
    public ImportRunbookDetails.ImportOption getImportOption() {
        return importOption;
    }

    /** Version number. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Version number.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** List of required values. */
    @com.fasterxml.jackson.annotation.JsonProperty("requiredValues")
    private final java.util.List<RunbookImportRequiredValue> requiredValues;

    /**
     * List of required values.
     *
     * @return the value
     */
    public java.util.List<RunbookImportRequiredValue> getRequiredValues() {
        return requiredValues;
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
        sb.append("ImportRunbookVersionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", contentSource=").append(String.valueOf(this.contentSource));
        sb.append(", contentDestination=").append(String.valueOf(this.contentDestination));
        sb.append(", runbookId=").append(String.valueOf(this.runbookId));
        sb.append(", importOption=").append(String.valueOf(this.importOption));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", requiredValues=").append(String.valueOf(this.requiredValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportRunbookVersionDetails)) {
            return false;
        }

        ImportRunbookVersionDetails other = (ImportRunbookVersionDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.contentSource, other.contentSource)
                && java.util.Objects.equals(this.contentDestination, other.contentDestination)
                && java.util.Objects.equals(this.runbookId, other.runbookId)
                && java.util.Objects.equals(this.importOption, other.importOption)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.requiredValues, other.requiredValues)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.contentSource == null ? 43 : this.contentSource.hashCode());
        result =
                (result * PRIME)
                        + (this.contentDestination == null
                                ? 43
                                : this.contentDestination.hashCode());
        result = (result * PRIME) + (this.runbookId == null ? 43 : this.runbookId.hashCode());
        result = (result * PRIME) + (this.importOption == null ? 43 : this.importOption.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.requiredValues == null ? 43 : this.requiredValues.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

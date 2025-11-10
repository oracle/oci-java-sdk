/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Request to Import Runbook. <br>
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
        builder = ImportRunbookDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImportRunbookDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "contentSource",
        "contentDestination",
        "runbookName",
        "importOption",
        "version",
        "requiredValues"
    })
    public ImportRunbookDetails(
            String compartmentId,
            TransferRunbookContentDetails contentSource,
            TransferRunbookContentDetails contentDestination,
            String runbookName,
            ImportOption importOption,
            String version,
            java.util.List<RunbookImportRequiredValue> requiredValues) {
        super();
        this.compartmentId = compartmentId;
        this.contentSource = contentSource;
        this.contentDestination = contentDestination;
        this.runbookName = runbookName;
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
        /** The name of the runbook. */
        @com.fasterxml.jackson.annotation.JsonProperty("runbookName")
        private String runbookName;

        /**
         * The name of the runbook.
         *
         * @param runbookName the value to set
         * @return this builder
         */
        public Builder runbookName(String runbookName) {
            this.runbookName = runbookName;
            this.__explicitlySet__.add("runbookName");
            return this;
        }
        /** ImportOptions for Runbook. */
        @com.fasterxml.jackson.annotation.JsonProperty("importOption")
        private ImportOption importOption;

        /**
         * ImportOptions for Runbook.
         *
         * @param importOption the value to set
         * @return this builder
         */
        public Builder importOption(ImportOption importOption) {
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

        public ImportRunbookDetails build() {
            ImportRunbookDetails model =
                    new ImportRunbookDetails(
                            this.compartmentId,
                            this.contentSource,
                            this.contentDestination,
                            this.runbookName,
                            this.importOption,
                            this.version,
                            this.requiredValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportRunbookDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("contentSource")) {
                this.contentSource(model.getContentSource());
            }
            if (model.wasPropertyExplicitlySet("contentDestination")) {
                this.contentDestination(model.getContentDestination());
            }
            if (model.wasPropertyExplicitlySet("runbookName")) {
                this.runbookName(model.getRunbookName());
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

    /** The name of the runbook. */
    @com.fasterxml.jackson.annotation.JsonProperty("runbookName")
    private final String runbookName;

    /**
     * The name of the runbook.
     *
     * @return the value
     */
    public String getRunbookName() {
        return runbookName;
    }

    /** ImportOptions for Runbook. */
    public enum ImportOption implements com.oracle.bmc.http.internal.BmcEnum {
        Retain("RETAIN"),
        Replace("REPLACE"),
        Increment("INCREMENT"),
        ;

        private final String value;
        private static java.util.Map<String, ImportOption> map;

        static {
            map = new java.util.HashMap<>();
            for (ImportOption v : ImportOption.values()) {
                map.put(v.getValue(), v);
            }
        }

        ImportOption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ImportOption create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ImportOption: " + key);
        }
    };
    /** ImportOptions for Runbook. */
    @com.fasterxml.jackson.annotation.JsonProperty("importOption")
    private final ImportOption importOption;

    /**
     * ImportOptions for Runbook.
     *
     * @return the value
     */
    public ImportOption getImportOption() {
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
        sb.append("ImportRunbookDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", contentSource=").append(String.valueOf(this.contentSource));
        sb.append(", contentDestination=").append(String.valueOf(this.contentDestination));
        sb.append(", runbookName=").append(String.valueOf(this.runbookName));
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
        if (!(o instanceof ImportRunbookDetails)) {
            return false;
        }

        ImportRunbookDetails other = (ImportRunbookDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.contentSource, other.contentSource)
                && java.util.Objects.equals(this.contentDestination, other.contentDestination)
                && java.util.Objects.equals(this.runbookName, other.runbookName)
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
        result = (result * PRIME) + (this.runbookName == null ? 43 : this.runbookName.hashCode());
        result = (result * PRIME) + (this.importOption == null ? 43 : this.importOption.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.requiredValues == null ? 43 : this.requiredValues.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

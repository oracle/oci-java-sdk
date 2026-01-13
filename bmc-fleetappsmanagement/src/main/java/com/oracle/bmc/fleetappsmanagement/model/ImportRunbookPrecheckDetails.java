/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Request for precheck of Runbook import. <br>
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
        builder = ImportRunbookPrecheckDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImportRunbookPrecheckDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "contentSource",
        "contentDestination",
        "importAs",
        "requiredValues"
    })
    public ImportRunbookPrecheckDetails(
            String compartmentId,
            TransferRunbookContentDetails contentSource,
            TransferRunbookContentDetails contentDestination,
            RunbookImportAs importAs,
            java.util.List<ImportRunbookPrecheckRequiredValue> requiredValues) {
        super();
        this.compartmentId = compartmentId;
        this.contentSource = contentSource;
        this.contentDestination = contentDestination;
        this.importAs = importAs;
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

        @com.fasterxml.jackson.annotation.JsonProperty("importAs")
        private RunbookImportAs importAs;

        public Builder importAs(RunbookImportAs importAs) {
            this.importAs = importAs;
            this.__explicitlySet__.add("importAs");
            return this;
        }
        /** List of required values. */
        @com.fasterxml.jackson.annotation.JsonProperty("requiredValues")
        private java.util.List<ImportRunbookPrecheckRequiredValue> requiredValues;

        /**
         * List of required values.
         *
         * @param requiredValues the value to set
         * @return this builder
         */
        public Builder requiredValues(
                java.util.List<ImportRunbookPrecheckRequiredValue> requiredValues) {
            this.requiredValues = requiredValues;
            this.__explicitlySet__.add("requiredValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportRunbookPrecheckDetails build() {
            ImportRunbookPrecheckDetails model =
                    new ImportRunbookPrecheckDetails(
                            this.compartmentId,
                            this.contentSource,
                            this.contentDestination,
                            this.importAs,
                            this.requiredValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportRunbookPrecheckDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("contentSource")) {
                this.contentSource(model.getContentSource());
            }
            if (model.wasPropertyExplicitlySet("contentDestination")) {
                this.contentDestination(model.getContentDestination());
            }
            if (model.wasPropertyExplicitlySet("importAs")) {
                this.importAs(model.getImportAs());
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

    @com.fasterxml.jackson.annotation.JsonProperty("importAs")
    private final RunbookImportAs importAs;

    public RunbookImportAs getImportAs() {
        return importAs;
    }

    /** List of required values. */
    @com.fasterxml.jackson.annotation.JsonProperty("requiredValues")
    private final java.util.List<ImportRunbookPrecheckRequiredValue> requiredValues;

    /**
     * List of required values.
     *
     * @return the value
     */
    public java.util.List<ImportRunbookPrecheckRequiredValue> getRequiredValues() {
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
        sb.append("ImportRunbookPrecheckDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", contentSource=").append(String.valueOf(this.contentSource));
        sb.append(", contentDestination=").append(String.valueOf(this.contentDestination));
        sb.append(", importAs=").append(String.valueOf(this.importAs));
        sb.append(", requiredValues=").append(String.valueOf(this.requiredValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportRunbookPrecheckDetails)) {
            return false;
        }

        ImportRunbookPrecheckDetails other = (ImportRunbookPrecheckDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.contentSource, other.contentSource)
                && java.util.Objects.equals(this.contentDestination, other.contentDestination)
                && java.util.Objects.equals(this.importAs, other.importAs)
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
        result = (result * PRIME) + (this.importAs == null ? 43 : this.importAs.hashCode());
        result =
                (result * PRIME)
                        + (this.requiredValues == null ? 43 : this.requiredValues.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

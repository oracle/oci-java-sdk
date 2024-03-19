/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * input documents configuration by default TXT files will be processed and this behaviour will not
 * change in future after adding new types <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InputConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InputConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"documentTypes", "configuration"})
    public InputConfiguration(
            java.util.List<String> documentTypes,
            java.util.Map<String, DocumentsConfiguration> configuration) {
        super();
        this.documentTypes = documentTypes;
        this.configuration = configuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of documents supported for this release only TXT,CSV and one element is allowed
         * here. for future scope this is marked as list
         */
        @com.fasterxml.jackson.annotation.JsonProperty("documentTypes")
        private java.util.List<String> documentTypes;

        /**
         * Type of documents supported for this release only TXT,CSV and one element is allowed
         * here. for future scope this is marked as list
         *
         * @param documentTypes the value to set
         * @return this builder
         */
        public Builder documentTypes(java.util.List<String> documentTypes) {
            this.documentTypes = documentTypes;
            this.__explicitlySet__.add("documentTypes");
            return this;
        }
        /**
         * meta data about documents For CSV valid JSON format is {"CSV" :{inputColumn:
         * "reviewDetails", rowId: "reviewId", copyColumnsToOutput: ["reviewId" "userId"] ,
         * delimiter: ","} Note: In future if new file types added we will update here in
         * documentation about input file meta data
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private java.util.Map<String, DocumentsConfiguration> configuration;

        /**
         * meta data about documents For CSV valid JSON format is {"CSV" :{inputColumn:
         * "reviewDetails", rowId: "reviewId", copyColumnsToOutput: ["reviewId" "userId"] ,
         * delimiter: ","} Note: In future if new file types added we will update here in
         * documentation about input file meta data
         *
         * @param configuration the value to set
         * @return this builder
         */
        public Builder configuration(java.util.Map<String, DocumentsConfiguration> configuration) {
            this.configuration = configuration;
            this.__explicitlySet__.add("configuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InputConfiguration build() {
            InputConfiguration model =
                    new InputConfiguration(this.documentTypes, this.configuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InputConfiguration model) {
            if (model.wasPropertyExplicitlySet("documentTypes")) {
                this.documentTypes(model.getDocumentTypes());
            }
            if (model.wasPropertyExplicitlySet("configuration")) {
                this.configuration(model.getConfiguration());
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

    /**
     * Type of documents supported for this release only TXT,CSV and one element is allowed here.
     * for future scope this is marked as list
     */
    @com.fasterxml.jackson.annotation.JsonProperty("documentTypes")
    private final java.util.List<String> documentTypes;

    /**
     * Type of documents supported for this release only TXT,CSV and one element is allowed here.
     * for future scope this is marked as list
     *
     * @return the value
     */
    public java.util.List<String> getDocumentTypes() {
        return documentTypes;
    }

    /**
     * meta data about documents For CSV valid JSON format is {"CSV" :{inputColumn: "reviewDetails",
     * rowId: "reviewId", copyColumnsToOutput: ["reviewId" "userId"] , delimiter: ","} Note: In
     * future if new file types added we will update here in documentation about input file meta
     * data
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    private final java.util.Map<String, DocumentsConfiguration> configuration;

    /**
     * meta data about documents For CSV valid JSON format is {"CSV" :{inputColumn: "reviewDetails",
     * rowId: "reviewId", copyColumnsToOutput: ["reviewId" "userId"] , delimiter: ","} Note: In
     * future if new file types added we will update here in documentation about input file meta
     * data
     *
     * @return the value
     */
    public java.util.Map<String, DocumentsConfiguration> getConfiguration() {
        return configuration;
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
        sb.append("InputConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("documentTypes=").append(String.valueOf(this.documentTypes));
        sb.append(", configuration=").append(String.valueOf(this.configuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InputConfiguration)) {
            return false;
        }

        InputConfiguration other = (InputConfiguration) o;
        return java.util.Objects.equals(this.documentTypes, other.documentTypes)
                && java.util.Objects.equals(this.configuration, other.configuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.documentTypes == null ? 43 : this.documentTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.configuration == null ? 43 : this.configuration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

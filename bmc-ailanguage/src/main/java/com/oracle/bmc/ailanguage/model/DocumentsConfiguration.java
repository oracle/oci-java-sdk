/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Input documents configuration <br>
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
        builder = DocumentsConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DocumentsConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"config"})
    public DocumentsConfiguration(java.util.Map<String, String> config) {
        super();
        this.config = config;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * meta data about documents For CSV valid JSON format is {"CSV" :{inputColumn:
         * "reviewDetails", rowId: "reviewId", copyColumnsToOutput: ["reviewId" "userId"] ,
         * delimiter: ","} Note: In future if new file types added we will update here in
         * documentation about input file meta data
         */
        @com.fasterxml.jackson.annotation.JsonProperty("config")
        private java.util.Map<String, String> config;

        /**
         * meta data about documents For CSV valid JSON format is {"CSV" :{inputColumn:
         * "reviewDetails", rowId: "reviewId", copyColumnsToOutput: ["reviewId" "userId"] ,
         * delimiter: ","} Note: In future if new file types added we will update here in
         * documentation about input file meta data
         *
         * @param config the value to set
         * @return this builder
         */
        public Builder config(java.util.Map<String, String> config) {
            this.config = config;
            this.__explicitlySet__.add("config");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DocumentsConfiguration build() {
            DocumentsConfiguration model = new DocumentsConfiguration(this.config);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DocumentsConfiguration model) {
            if (model.wasPropertyExplicitlySet("config")) {
                this.config(model.getConfig());
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
     * meta data about documents For CSV valid JSON format is {"CSV" :{inputColumn: "reviewDetails",
     * rowId: "reviewId", copyColumnsToOutput: ["reviewId" "userId"] , delimiter: ","} Note: In
     * future if new file types added we will update here in documentation about input file meta
     * data
     */
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    private final java.util.Map<String, String> config;

    /**
     * meta data about documents For CSV valid JSON format is {"CSV" :{inputColumn: "reviewDetails",
     * rowId: "reviewId", copyColumnsToOutput: ["reviewId" "userId"] , delimiter: ","} Note: In
     * future if new file types added we will update here in documentation about input file meta
     * data
     *
     * @return the value
     */
    public java.util.Map<String, String> getConfig() {
        return config;
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
        sb.append("DocumentsConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("config=").append(String.valueOf(this.config));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DocumentsConfiguration)) {
            return false;
        }

        DocumentsConfiguration other = (DocumentsConfiguration) o;
        return java.util.Objects.equals(this.config, other.config) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.config == null ? 43 : this.config.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

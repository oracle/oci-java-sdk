/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information to update a Nessie catalog used in the Iceberg connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateNessieIcebergCatalogDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "catalogType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateNessieIcebergCatalogDetails extends UpdateIcebergCatalogDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Nessie URI. e.g.: 'http://<nessie-server>.com:10001/api/v2' */
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * Nessie URI. e.g.: 'http://<nessie-server>.com:10001/api/v2'
         *
         * @param uri the value to set
         * @return this builder
         */
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }
        /**
         * The active branch of the Nessie catalog from which Iceberg reads and writes table
         * metadata.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("branch")
        private String branch;

        /**
         * The active branch of the Nessie catalog from which Iceberg reads and writes table
         * metadata.
         *
         * @param branch the value to set
         * @return this builder
         */
        public Builder branch(String branch) {
            this.branch = branch;
            this.__explicitlySet__.add("branch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateNessieIcebergCatalogDetails build() {
            UpdateNessieIcebergCatalogDetails model =
                    new UpdateNessieIcebergCatalogDetails(this.uri, this.branch);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateNessieIcebergCatalogDetails model) {
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
            }
            if (model.wasPropertyExplicitlySet("branch")) {
                this.branch(model.getBranch());
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
    public UpdateNessieIcebergCatalogDetails(String uri, String branch) {
        super();
        this.uri = uri;
        this.branch = branch;
    }

    /** Nessie URI. e.g.: 'http://<nessie-server>.com:10001/api/v2' */
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * Nessie URI. e.g.: 'http://<nessie-server>.com:10001/api/v2'
     *
     * @return the value
     */
    public String getUri() {
        return uri;
    }

    /**
     * The active branch of the Nessie catalog from which Iceberg reads and writes table metadata.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("branch")
    private final String branch;

    /**
     * The active branch of the Nessie catalog from which Iceberg reads and writes table metadata.
     *
     * @return the value
     */
    public String getBranch() {
        return branch;
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
        sb.append("UpdateNessieIcebergCatalogDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", branch=").append(String.valueOf(this.branch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateNessieIcebergCatalogDetails)) {
            return false;
        }

        UpdateNessieIcebergCatalogDetails other = (UpdateNessieIcebergCatalogDetails) o;
        return java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.branch, other.branch)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result = (result * PRIME) + (this.branch == null ? 43 : this.branch.hashCode());
        return result;
    }
}

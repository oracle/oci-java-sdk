/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information to update an OCI Object Storage location used to share Databricks application
 * artifacts. <br>
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
        builder = UpdateOciObjectStorageDatabricksEngineArtifactLocationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "locationType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateOciObjectStorageDatabricksEngineArtifactLocationDetails
        extends UpdateDatabricksEngineArtifactLocationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("shouldOverwriteExisting")
        private Boolean shouldOverwriteExisting;

        public Builder shouldOverwriteExisting(Boolean shouldOverwriteExisting) {
            this.shouldOverwriteExisting = shouldOverwriteExisting;
            this.__explicitlySet__.add("shouldOverwriteExisting");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private UpdateDatabricksEngineOciObjectStorageConfigDetails configuration;

        public Builder configuration(
                UpdateDatabricksEngineOciObjectStorageConfigDetails configuration) {
            this.configuration = configuration;
            this.__explicitlySet__.add("configuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOciObjectStorageDatabricksEngineArtifactLocationDetails build() {
            UpdateOciObjectStorageDatabricksEngineArtifactLocationDetails model =
                    new UpdateOciObjectStorageDatabricksEngineArtifactLocationDetails(
                            this.shouldOverwriteExisting, this.configuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOciObjectStorageDatabricksEngineArtifactLocationDetails model) {
            if (model.wasPropertyExplicitlySet("shouldOverwriteExisting")) {
                this.shouldOverwriteExisting(model.getShouldOverwriteExisting());
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

    @Deprecated
    public UpdateOciObjectStorageDatabricksEngineArtifactLocationDetails(
            Boolean shouldOverwriteExisting,
            UpdateDatabricksEngineOciObjectStorageConfigDetails configuration) {
        super(shouldOverwriteExisting);
        this.configuration = configuration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    private final UpdateDatabricksEngineOciObjectStorageConfigDetails configuration;

    public UpdateDatabricksEngineOciObjectStorageConfigDetails getConfiguration() {
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
        sb.append("UpdateOciObjectStorageDatabricksEngineArtifactLocationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", configuration=").append(String.valueOf(this.configuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOciObjectStorageDatabricksEngineArtifactLocationDetails)) {
            return false;
        }

        UpdateOciObjectStorageDatabricksEngineArtifactLocationDetails other =
                (UpdateOciObjectStorageDatabricksEngineArtifactLocationDetails) o;
        return java.util.Objects.equals(this.configuration, other.configuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.configuration == null ? 43 : this.configuration.hashCode());
        return result;
    }
}

/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information to update a Unity Catalog volume location used to share Databricks application
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
        builder = UpdateUcVolumeDatabricksEngineArtifactLocationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "locationType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateUcVolumeDatabricksEngineArtifactLocationDetails
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
        /** Unity Catalog volume artifact path. */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Unity Catalog volume artifact path.
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateUcVolumeDatabricksEngineArtifactLocationDetails build() {
            UpdateUcVolumeDatabricksEngineArtifactLocationDetails model =
                    new UpdateUcVolumeDatabricksEngineArtifactLocationDetails(
                            this.shouldOverwriteExisting, this.path);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateUcVolumeDatabricksEngineArtifactLocationDetails model) {
            if (model.wasPropertyExplicitlySet("shouldOverwriteExisting")) {
                this.shouldOverwriteExisting(model.getShouldOverwriteExisting());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
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
    public UpdateUcVolumeDatabricksEngineArtifactLocationDetails(
            Boolean shouldOverwriteExisting, String path) {
        super(shouldOverwriteExisting);
        this.path = path;
    }

    /** Unity Catalog volume artifact path. */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Unity Catalog volume artifact path.
     *
     * @return the value
     */
    public String getPath() {
        return path;
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
        sb.append("UpdateUcVolumeDatabricksEngineArtifactLocationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateUcVolumeDatabricksEngineArtifactLocationDetails)) {
            return false;
        }

        UpdateUcVolumeDatabricksEngineArtifactLocationDetails other =
                (UpdateUcVolumeDatabricksEngineArtifactLocationDetails) o;
        return java.util.Objects.equals(this.path, other.path) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        return result;
    }
}

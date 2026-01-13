/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms.model;

/**
 * The content of the middleware binaries included in a backup. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MiddlewareBinaryBackupContent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MiddlewareBinaryBackupContent
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"version", "patches"})
    public MiddlewareBinaryBackupContent(
            String version, java.util.List<MiddlewareBackupPatch> patches) {
        super();
        this.version = version;
        this.patches = patches;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The version of the middleware binaries included in the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of the middleware binaries included in the backup.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** The list of patches installed in the middleware included in the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("patches")
        private java.util.List<MiddlewareBackupPatch> patches;

        /**
         * The list of patches installed in the middleware included in the backup.
         *
         * @param patches the value to set
         * @return this builder
         */
        public Builder patches(java.util.List<MiddlewareBackupPatch> patches) {
            this.patches = patches;
            this.__explicitlySet__.add("patches");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MiddlewareBinaryBackupContent build() {
            MiddlewareBinaryBackupContent model =
                    new MiddlewareBinaryBackupContent(this.version, this.patches);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MiddlewareBinaryBackupContent model) {
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("patches")) {
                this.patches(model.getPatches());
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

    /** The version of the middleware binaries included in the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of the middleware binaries included in the backup.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** The list of patches installed in the middleware included in the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("patches")
    private final java.util.List<MiddlewareBackupPatch> patches;

    /**
     * The list of patches installed in the middleware included in the backup.
     *
     * @return the value
     */
    public java.util.List<MiddlewareBackupPatch> getPatches() {
        return patches;
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
        sb.append("MiddlewareBinaryBackupContent(");
        sb.append("super=").append(super.toString());
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", patches=").append(String.valueOf(this.patches));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MiddlewareBinaryBackupContent)) {
            return false;
        }

        MiddlewareBinaryBackupContent other = (MiddlewareBinaryBackupContent) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.patches, other.patches)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.patches == null ? 43 : this.patches.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

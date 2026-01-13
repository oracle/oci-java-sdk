/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A platform's pinned firmware versions. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PlatformVersions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PlatformVersions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"platform", "versions"})
    public PlatformVersions(String platform, java.util.List<ComponentVersion> versions) {
        super();
        this.platform = platform;
        this.versions = versions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the platform supported by this bundle. */
        @com.fasterxml.jackson.annotation.JsonProperty("platform")
        private String platform;

        /**
         * The name of the platform supported by this bundle.
         *
         * @param platform the value to set
         * @return this builder
         */
        public Builder platform(String platform) {
            this.platform = platform;
            this.__explicitlySet__.add("platform");
            return this;
        }
        /** An array of pinned components and their respective firmware versions. */
        @com.fasterxml.jackson.annotation.JsonProperty("versions")
        private java.util.List<ComponentVersion> versions;

        /**
         * An array of pinned components and their respective firmware versions.
         *
         * @param versions the value to set
         * @return this builder
         */
        public Builder versions(java.util.List<ComponentVersion> versions) {
            this.versions = versions;
            this.__explicitlySet__.add("versions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PlatformVersions build() {
            PlatformVersions model = new PlatformVersions(this.platform, this.versions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PlatformVersions model) {
            if (model.wasPropertyExplicitlySet("platform")) {
                this.platform(model.getPlatform());
            }
            if (model.wasPropertyExplicitlySet("versions")) {
                this.versions(model.getVersions());
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

    /** The name of the platform supported by this bundle. */
    @com.fasterxml.jackson.annotation.JsonProperty("platform")
    private final String platform;

    /**
     * The name of the platform supported by this bundle.
     *
     * @return the value
     */
    public String getPlatform() {
        return platform;
    }

    /** An array of pinned components and their respective firmware versions. */
    @com.fasterxml.jackson.annotation.JsonProperty("versions")
    private final java.util.List<ComponentVersion> versions;

    /**
     * An array of pinned components and their respective firmware versions.
     *
     * @return the value
     */
    public java.util.List<ComponentVersion> getVersions() {
        return versions;
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
        sb.append("PlatformVersions(");
        sb.append("super=").append(super.toString());
        sb.append("platform=").append(String.valueOf(this.platform));
        sb.append(", versions=").append(String.valueOf(this.versions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PlatformVersions)) {
            return false;
        }

        PlatformVersions other = (PlatformVersions) o;
        return java.util.Objects.equals(this.platform, other.platform)
                && java.util.Objects.equals(this.versions, other.versions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.platform == null ? 43 : this.platform.hashCode());
        result = (result * PRIME) + (this.versions == null ? 43 : this.versions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

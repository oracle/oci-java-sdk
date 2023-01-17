/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * A summary of the supported MySQL Versions families, and a list of their supported minor versions.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VersionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VersionSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"versionFamily", "versions"})
    public VersionSummary(String versionFamily, java.util.List<Version> versions) {
        super();
        this.versionFamily = versionFamily;
        this.versions = versions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A descriptive summary of a group of versions.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("versionFamily")
        private String versionFamily;

        /**
         * A descriptive summary of a group of versions.
         * @param versionFamily the value to set
         * @return this builder
         **/
        public Builder versionFamily(String versionFamily) {
            this.versionFamily = versionFamily;
            this.__explicitlySet__.add("versionFamily");
            return this;
        }
        /**
         * The list of supported MySQL Versions.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("versions")
        private java.util.List<Version> versions;

        /**
         * The list of supported MySQL Versions.
         * @param versions the value to set
         * @return this builder
         **/
        public Builder versions(java.util.List<Version> versions) {
            this.versions = versions;
            this.__explicitlySet__.add("versions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VersionSummary build() {
            VersionSummary model = new VersionSummary(this.versionFamily, this.versions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VersionSummary model) {
            if (model.wasPropertyExplicitlySet("versionFamily")) {
                this.versionFamily(model.getVersionFamily());
            }
            if (model.wasPropertyExplicitlySet("versions")) {
                this.versions(model.getVersions());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * A descriptive summary of a group of versions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionFamily")
    private final String versionFamily;

    /**
     * A descriptive summary of a group of versions.
     * @return the value
     **/
    public String getVersionFamily() {
        return versionFamily;
    }

    /**
     * The list of supported MySQL Versions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versions")
    private final java.util.List<Version> versions;

    /**
     * The list of supported MySQL Versions.
     * @return the value
     **/
    public java.util.List<Version> getVersions() {
        return versions;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("VersionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("versionFamily=").append(String.valueOf(this.versionFamily));
        sb.append(", versions=").append(String.valueOf(this.versions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VersionSummary)) {
            return false;
        }

        VersionSummary other = (VersionSummary) o;
        return java.util.Objects.equals(this.versionFamily, other.versionFamily)
                && java.util.Objects.equals(this.versions, other.versions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.versionFamily == null ? 43 : this.versionFamily.hashCode());
        result = (result * PRIME) + (this.versions == null ? 43 : this.versions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

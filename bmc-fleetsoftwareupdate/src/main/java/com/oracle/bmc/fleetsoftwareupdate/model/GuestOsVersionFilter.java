/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Exadata Image (Guest OS) versions to include when discovering Exadata VM Cluster targets for a
 * 'GUEST_OS' collection. Only versions related to the specified sourceMajorVersion are allowed. For
 * example, version "22.1.26.0.0.240801" can be specified for sourceMajorVersion "EXA_OL_7" (Oracle
 * Linux 7). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GuestOsVersionFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GuestOsVersionFilter extends GuestOsFleetDiscoveryFilter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private Mode mode;

        public Builder mode(Mode mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }
        /**
         * List of Exadata Image (Guest OS) version strings to include when discovering Exadata VM
         * Cluster targets for a 'GUEST_OS' collection.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("versions")
        private java.util.List<String> versions;

        /**
         * List of Exadata Image (Guest OS) version strings to include when discovering Exadata VM
         * Cluster targets for a 'GUEST_OS' collection.
         *
         * @param versions the value to set
         * @return this builder
         */
        public Builder versions(java.util.List<String> versions) {
            this.versions = versions;
            this.__explicitlySet__.add("versions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GuestOsVersionFilter build() {
            GuestOsVersionFilter model = new GuestOsVersionFilter(this.mode, this.versions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GuestOsVersionFilter model) {
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
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

    @Deprecated
    public GuestOsVersionFilter(Mode mode, java.util.List<String> versions) {
        super(mode);
        this.versions = versions;
    }

    /**
     * List of Exadata Image (Guest OS) version strings to include when discovering Exadata VM
     * Cluster targets for a 'GUEST_OS' collection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("versions")
    private final java.util.List<String> versions;

    /**
     * List of Exadata Image (Guest OS) version strings to include when discovering Exadata VM
     * Cluster targets for a 'GUEST_OS' collection.
     *
     * @return the value
     */
    public java.util.List<String> getVersions() {
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
        sb.append("GuestOsVersionFilter(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", versions=").append(String.valueOf(this.versions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GuestOsVersionFilter)) {
            return false;
        }

        GuestOsVersionFilter other = (GuestOsVersionFilter) o;
        return java.util.Objects.equals(this.versions, other.versions) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.versions == null ? 43 : this.versions.hashCode());
        return result;
    }
}

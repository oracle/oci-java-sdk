/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Exadata Release versions to include when discovering Exadata VM Cluster targets for a 'GUEST_OS'
 * collection. Only release versions related to the specified sourceMajorVersion are allowed. <br>
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
        builder = GuestOsExadataReleaseVersionFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GuestOsExadataReleaseVersionFilter extends GuestOsFleetDiscoveryFilter {
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
         * List of Exadata Release versions to include when discovering Exadata VM Cluster targets
         * for a 'GUEST_OS' collection.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataReleases")
        private java.util.List<ExadataReleaseVersions> exadataReleases;

        /**
         * List of Exadata Release versions to include when discovering Exadata VM Cluster targets
         * for a 'GUEST_OS' collection.
         *
         * @param exadataReleases the value to set
         * @return this builder
         */
        public Builder exadataReleases(java.util.List<ExadataReleaseVersions> exadataReleases) {
            this.exadataReleases = exadataReleases;
            this.__explicitlySet__.add("exadataReleases");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GuestOsExadataReleaseVersionFilter build() {
            GuestOsExadataReleaseVersionFilter model =
                    new GuestOsExadataReleaseVersionFilter(this.mode, this.exadataReleases);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GuestOsExadataReleaseVersionFilter model) {
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
            }
            if (model.wasPropertyExplicitlySet("exadataReleases")) {
                this.exadataReleases(model.getExadataReleases());
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
    public GuestOsExadataReleaseVersionFilter(
            Mode mode, java.util.List<ExadataReleaseVersions> exadataReleases) {
        super(mode);
        this.exadataReleases = exadataReleases;
    }

    /**
     * List of Exadata Release versions to include when discovering Exadata VM Cluster targets for a
     * 'GUEST_OS' collection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataReleases")
    private final java.util.List<ExadataReleaseVersions> exadataReleases;

    /**
     * List of Exadata Release versions to include when discovering Exadata VM Cluster targets for a
     * 'GUEST_OS' collection.
     *
     * @return the value
     */
    public java.util.List<ExadataReleaseVersions> getExadataReleases() {
        return exadataReleases;
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
        sb.append("GuestOsExadataReleaseVersionFilter(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", exadataReleases=").append(String.valueOf(this.exadataReleases));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GuestOsExadataReleaseVersionFilter)) {
            return false;
        }

        GuestOsExadataReleaseVersionFilter other = (GuestOsExadataReleaseVersionFilter) o;
        return java.util.Objects.equals(this.exadataReleases, other.exadataReleases)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.exadataReleases == null ? 43 : this.exadataReleases.hashCode());
        return result;
    }
}

/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Patch artifact description and content details which is platform specific. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PlatformSpecificArtifactDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "category")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PlatformSpecificArtifactDetails extends ArtifactDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Artifacts. */
        @com.fasterxml.jackson.annotation.JsonProperty("artifacts")
        private java.util.List<PlatformSpecificArtifact> artifacts;

        /**
         * Artifacts.
         *
         * @param artifacts the value to set
         * @return this builder
         */
        public Builder artifacts(java.util.List<PlatformSpecificArtifact> artifacts) {
            this.artifacts = artifacts;
            this.__explicitlySet__.add("artifacts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PlatformSpecificArtifactDetails build() {
            PlatformSpecificArtifactDetails model =
                    new PlatformSpecificArtifactDetails(this.artifacts);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PlatformSpecificArtifactDetails model) {
            if (model.wasPropertyExplicitlySet("artifacts")) {
                this.artifacts(model.getArtifacts());
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
    public PlatformSpecificArtifactDetails(java.util.List<PlatformSpecificArtifact> artifacts) {
        super();
        this.artifacts = artifacts;
    }

    /** Artifacts. */
    @com.fasterxml.jackson.annotation.JsonProperty("artifacts")
    private final java.util.List<PlatformSpecificArtifact> artifacts;

    /**
     * Artifacts.
     *
     * @return the value
     */
    public java.util.List<PlatformSpecificArtifact> getArtifacts() {
        return artifacts;
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
        sb.append("PlatformSpecificArtifactDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", artifacts=").append(String.valueOf(this.artifacts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PlatformSpecificArtifactDetails)) {
            return false;
        }

        PlatformSpecificArtifactDetails other = (PlatformSpecificArtifactDetails) o;
        return java.util.Objects.equals(this.artifacts, other.artifacts) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.artifacts == null ? 43 : this.artifacts.hashCode());
        return result;
    }
}

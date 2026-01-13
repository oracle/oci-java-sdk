/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Collection built from the results of a Succeeded Fleet Software Update Discovery resource. <br>
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
        builder = GiDiscoveryResults.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "strategy")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GiDiscoveryResults extends GiFleetDiscoveryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCIDs of Fleet Software Update Discovery. */
        @com.fasterxml.jackson.annotation.JsonProperty("fsuDiscoveryId")
        private String fsuDiscoveryId;

        /**
         * OCIDs of Fleet Software Update Discovery.
         *
         * @param fsuDiscoveryId the value to set
         * @return this builder
         */
        public Builder fsuDiscoveryId(String fsuDiscoveryId) {
            this.fsuDiscoveryId = fsuDiscoveryId;
            this.__explicitlySet__.add("fsuDiscoveryId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GiDiscoveryResults build() {
            GiDiscoveryResults model = new GiDiscoveryResults(this.fsuDiscoveryId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GiDiscoveryResults model) {
            if (model.wasPropertyExplicitlySet("fsuDiscoveryId")) {
                this.fsuDiscoveryId(model.getFsuDiscoveryId());
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
    public GiDiscoveryResults(String fsuDiscoveryId) {
        super();
        this.fsuDiscoveryId = fsuDiscoveryId;
    }

    /** OCIDs of Fleet Software Update Discovery. */
    @com.fasterxml.jackson.annotation.JsonProperty("fsuDiscoveryId")
    private final String fsuDiscoveryId;

    /**
     * OCIDs of Fleet Software Update Discovery.
     *
     * @return the value
     */
    public String getFsuDiscoveryId() {
        return fsuDiscoveryId;
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
        sb.append("GiDiscoveryResults(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", fsuDiscoveryId=").append(String.valueOf(this.fsuDiscoveryId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GiDiscoveryResults)) {
            return false;
        }

        GiDiscoveryResults other = (GiDiscoveryResults) o;
        return java.util.Objects.equals(this.fsuDiscoveryId, other.fsuDiscoveryId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.fsuDiscoveryId == null ? 43 : this.fsuDiscoveryId.hashCode());
        return result;
    }
}

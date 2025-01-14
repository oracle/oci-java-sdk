/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Product <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PatchProduct.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PatchProduct extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"platformConfigurationId", "version"})
    public PatchProduct(String platformConfigurationId, String version) {
        super();
        this.platformConfigurationId = platformConfigurationId;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** PlatformConfiguration Id corresponding to the Product */
        @com.fasterxml.jackson.annotation.JsonProperty("platformConfigurationId")
        private String platformConfigurationId;

        /**
         * PlatformConfiguration Id corresponding to the Product
         *
         * @param platformConfigurationId the value to set
         * @return this builder
         */
        public Builder platformConfigurationId(String platformConfigurationId) {
            this.platformConfigurationId = platformConfigurationId;
            this.__explicitlySet__.add("platformConfigurationId");
            return this;
        }
        /** product version. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * product version.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchProduct build() {
            PatchProduct model = new PatchProduct(this.platformConfigurationId, this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchProduct model) {
            if (model.wasPropertyExplicitlySet("platformConfigurationId")) {
                this.platformConfigurationId(model.getPlatformConfigurationId());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
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

    /** PlatformConfiguration Id corresponding to the Product */
    @com.fasterxml.jackson.annotation.JsonProperty("platformConfigurationId")
    private final String platformConfigurationId;

    /**
     * PlatformConfiguration Id corresponding to the Product
     *
     * @return the value
     */
    public String getPlatformConfigurationId() {
        return platformConfigurationId;
    }

    /** product version. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * product version.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
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
        sb.append("PatchProduct(");
        sb.append("super=").append(super.toString());
        sb.append("platformConfigurationId=").append(String.valueOf(this.platformConfigurationId));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchProduct)) {
            return false;
        }

        PatchProduct other = (PatchProduct) o;
        return java.util.Objects.equals(this.platformConfigurationId, other.platformConfigurationId)
                && java.util.Objects.equals(this.version, other.version)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.platformConfigurationId == null
                                ? 43
                                : this.platformConfigurationId.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

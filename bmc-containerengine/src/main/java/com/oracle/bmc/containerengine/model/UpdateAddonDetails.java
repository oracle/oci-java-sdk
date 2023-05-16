/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define to update addon details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateAddonDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateAddonDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"version", "configurations"})
    public UpdateAddonDetails(String version, java.util.List<AddonConfiguration> configurations) {
        super();
        this.version = version;
        this.configurations = configurations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The version of the installed addon. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of the installed addon.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** Addon configuration details. */
        @com.fasterxml.jackson.annotation.JsonProperty("configurations")
        private java.util.List<AddonConfiguration> configurations;

        /**
         * Addon configuration details.
         *
         * @param configurations the value to set
         * @return this builder
         */
        public Builder configurations(java.util.List<AddonConfiguration> configurations) {
            this.configurations = configurations;
            this.__explicitlySet__.add("configurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAddonDetails build() {
            UpdateAddonDetails model = new UpdateAddonDetails(this.version, this.configurations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAddonDetails model) {
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("configurations")) {
                this.configurations(model.getConfigurations());
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

    /** The version of the installed addon. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of the installed addon.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** Addon configuration details. */
    @com.fasterxml.jackson.annotation.JsonProperty("configurations")
    private final java.util.List<AddonConfiguration> configurations;

    /**
     * Addon configuration details.
     *
     * @return the value
     */
    public java.util.List<AddonConfiguration> getConfigurations() {
        return configurations;
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
        sb.append("UpdateAddonDetails(");
        sb.append("super=").append(super.toString());
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", configurations=").append(String.valueOf(this.configurations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAddonDetails)) {
            return false;
        }

        UpdateAddonDetails other = (UpdateAddonDetails) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.configurations, other.configurations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.configurations == null ? 43 : this.configurations.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

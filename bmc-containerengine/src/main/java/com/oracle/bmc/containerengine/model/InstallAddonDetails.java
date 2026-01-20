/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define to install/enable addon on a cluster <br>
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
        builder = InstallAddonDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstallAddonDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "addonName",
        "version",
        "configurations",
        "isOverrideExisting"
    })
    public InstallAddonDetails(
            String addonName,
            String version,
            java.util.List<AddonConfiguration> configurations,
            Boolean isOverrideExisting) {
        super();
        this.addonName = addonName;
        this.version = version;
        this.configurations = configurations;
        this.isOverrideExisting = isOverrideExisting;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the addon. */
        @com.fasterxml.jackson.annotation.JsonProperty("addonName")
        private String addonName;

        /**
         * The name of the addon.
         *
         * @param addonName the value to set
         * @return this builder
         */
        public Builder addonName(String addonName) {
            this.addonName = addonName;
            this.__explicitlySet__.add("addonName");
            return this;
        }
        /** The version of addon to be installed. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of addon to be installed.
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
        /**
         * Whether or not to override an existing addon installation. Defaults to false. If set to
         * true, any existing addon installation would be overridden as per new installation
         * details.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOverrideExisting")
        private Boolean isOverrideExisting;

        /**
         * Whether or not to override an existing addon installation. Defaults to false. If set to
         * true, any existing addon installation would be overridden as per new installation
         * details.
         *
         * @param isOverrideExisting the value to set
         * @return this builder
         */
        public Builder isOverrideExisting(Boolean isOverrideExisting) {
            this.isOverrideExisting = isOverrideExisting;
            this.__explicitlySet__.add("isOverrideExisting");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstallAddonDetails build() {
            InstallAddonDetails model =
                    new InstallAddonDetails(
                            this.addonName,
                            this.version,
                            this.configurations,
                            this.isOverrideExisting);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstallAddonDetails model) {
            if (model.wasPropertyExplicitlySet("addonName")) {
                this.addonName(model.getAddonName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("configurations")) {
                this.configurations(model.getConfigurations());
            }
            if (model.wasPropertyExplicitlySet("isOverrideExisting")) {
                this.isOverrideExisting(model.getIsOverrideExisting());
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

    /** The name of the addon. */
    @com.fasterxml.jackson.annotation.JsonProperty("addonName")
    private final String addonName;

    /**
     * The name of the addon.
     *
     * @return the value
     */
    public String getAddonName() {
        return addonName;
    }

    /** The version of addon to be installed. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of addon to be installed.
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

    /**
     * Whether or not to override an existing addon installation. Defaults to false. If set to true,
     * any existing addon installation would be overridden as per new installation details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOverrideExisting")
    private final Boolean isOverrideExisting;

    /**
     * Whether or not to override an existing addon installation. Defaults to false. If set to true,
     * any existing addon installation would be overridden as per new installation details.
     *
     * @return the value
     */
    public Boolean getIsOverrideExisting() {
        return isOverrideExisting;
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
        sb.append("InstallAddonDetails(");
        sb.append("super=").append(super.toString());
        sb.append("addonName=").append(String.valueOf(this.addonName));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", configurations=").append(String.valueOf(this.configurations));
        sb.append(", isOverrideExisting=").append(String.valueOf(this.isOverrideExisting));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstallAddonDetails)) {
            return false;
        }

        InstallAddonDetails other = (InstallAddonDetails) o;
        return java.util.Objects.equals(this.addonName, other.addonName)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.configurations, other.configurations)
                && java.util.Objects.equals(this.isOverrideExisting, other.isOverrideExisting)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.addonName == null ? 43 : this.addonName.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.configurations == null ? 43 : this.configurations.hashCode());
        result =
                (result * PRIME)
                        + (this.isOverrideExisting == null
                                ? 43
                                : this.isOverrideExisting.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

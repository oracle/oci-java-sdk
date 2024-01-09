/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define an addon. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Addon.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Addon extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "version",
        "currentInstalledVersion",
        "timeCreated",
        "lifecycleState",
        "configurations",
        "addonError"
    })
    public Addon(
            String name,
            String version,
            String currentInstalledVersion,
            java.util.Date timeCreated,
            AddonLifecycleState lifecycleState,
            java.util.List<AddonConfiguration> configurations,
            AddonError addonError) {
        super();
        this.name = name;
        this.version = version;
        this.currentInstalledVersion = currentInstalledVersion;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.configurations = configurations;
        this.addonError = addonError;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the addon. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the addon.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** selected addon version, or null indicates autoUpdate */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * selected addon version, or null indicates autoUpdate
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** current installed version of the addon */
        @com.fasterxml.jackson.annotation.JsonProperty("currentInstalledVersion")
        private String currentInstalledVersion;

        /**
         * current installed version of the addon
         *
         * @param currentInstalledVersion the value to set
         * @return this builder
         */
        public Builder currentInstalledVersion(String currentInstalledVersion) {
            this.currentInstalledVersion = currentInstalledVersion;
            this.__explicitlySet__.add("currentInstalledVersion");
            return this;
        }
        /** The time the cluster was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the cluster was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The state of the addon. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AddonLifecycleState lifecycleState;

        /**
         * The state of the addon.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(AddonLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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
        /** The error info of the addon. */
        @com.fasterxml.jackson.annotation.JsonProperty("addonError")
        private AddonError addonError;

        /**
         * The error info of the addon.
         *
         * @param addonError the value to set
         * @return this builder
         */
        public Builder addonError(AddonError addonError) {
            this.addonError = addonError;
            this.__explicitlySet__.add("addonError");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Addon build() {
            Addon model =
                    new Addon(
                            this.name,
                            this.version,
                            this.currentInstalledVersion,
                            this.timeCreated,
                            this.lifecycleState,
                            this.configurations,
                            this.addonError);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Addon model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("currentInstalledVersion")) {
                this.currentInstalledVersion(model.getCurrentInstalledVersion());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("configurations")) {
                this.configurations(model.getConfigurations());
            }
            if (model.wasPropertyExplicitlySet("addonError")) {
                this.addonError(model.getAddonError());
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
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the addon.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** selected addon version, or null indicates autoUpdate */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * selected addon version, or null indicates autoUpdate
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** current installed version of the addon */
    @com.fasterxml.jackson.annotation.JsonProperty("currentInstalledVersion")
    private final String currentInstalledVersion;

    /**
     * current installed version of the addon
     *
     * @return the value
     */
    public String getCurrentInstalledVersion() {
        return currentInstalledVersion;
    }

    /** The time the cluster was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the cluster was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The state of the addon. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AddonLifecycleState lifecycleState;

    /**
     * The state of the addon.
     *
     * @return the value
     */
    public AddonLifecycleState getLifecycleState() {
        return lifecycleState;
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

    /** The error info of the addon. */
    @com.fasterxml.jackson.annotation.JsonProperty("addonError")
    private final AddonError addonError;

    /**
     * The error info of the addon.
     *
     * @return the value
     */
    public AddonError getAddonError() {
        return addonError;
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
        sb.append("Addon(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", currentInstalledVersion=")
                .append(String.valueOf(this.currentInstalledVersion));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", configurations=").append(String.valueOf(this.configurations));
        sb.append(", addonError=").append(String.valueOf(this.addonError));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Addon)) {
            return false;
        }

        Addon other = (Addon) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(
                        this.currentInstalledVersion, other.currentInstalledVersion)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.configurations, other.configurations)
                && java.util.Objects.equals(this.addonError, other.addonError)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.currentInstalledVersion == null
                                ? 43
                                : this.currentInstalledVersion.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.configurations == null ? 43 : this.configurations.hashCode());
        result = (result * PRIME) + (this.addonError == null ? 43 : this.addonError.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * The information about the current management agent plugins that agent is having. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManagementAgentPluginDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ManagementAgentPluginDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "pluginId",
        "pluginName",
        "pluginDisplayName",
        "pluginVersion",
        "pluginStatus",
        "pluginStatusMessage",
        "isEnabled"
    })
    public ManagementAgentPluginDetails(
            String pluginId,
            String pluginName,
            String pluginDisplayName,
            String pluginVersion,
            PluginStatus pluginStatus,
            String pluginStatusMessage,
            Boolean isEnabled) {
        super();
        this.pluginId = pluginId;
        this.pluginName = pluginName;
        this.pluginDisplayName = pluginDisplayName;
        this.pluginVersion = pluginVersion;
        this.pluginStatus = pluginStatus;
        this.pluginStatusMessage = pluginStatusMessage;
        this.isEnabled = isEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Plugin Id */
        @com.fasterxml.jackson.annotation.JsonProperty("pluginId")
        private String pluginId;

        /**
         * Plugin Id
         *
         * @param pluginId the value to set
         * @return this builder
         */
        public Builder pluginId(String pluginId) {
            this.pluginId = pluginId;
            this.__explicitlySet__.add("pluginId");
            return this;
        }
        /** Management Agent Plugin Name */
        @com.fasterxml.jackson.annotation.JsonProperty("pluginName")
        private String pluginName;

        /**
         * Management Agent Plugin Name
         *
         * @param pluginName the value to set
         * @return this builder
         */
        public Builder pluginName(String pluginName) {
            this.pluginName = pluginName;
            this.__explicitlySet__.add("pluginName");
            return this;
        }
        /** Management Agent Plugin Identifier, can be renamed */
        @com.fasterxml.jackson.annotation.JsonProperty("pluginDisplayName")
        private String pluginDisplayName;

        /**
         * Management Agent Plugin Identifier, can be renamed
         *
         * @param pluginDisplayName the value to set
         * @return this builder
         */
        public Builder pluginDisplayName(String pluginDisplayName) {
            this.pluginDisplayName = pluginDisplayName;
            this.__explicitlySet__.add("pluginDisplayName");
            return this;
        }
        /** Plugin Version */
        @com.fasterxml.jackson.annotation.JsonProperty("pluginVersion")
        private String pluginVersion;

        /**
         * Plugin Version
         *
         * @param pluginVersion the value to set
         * @return this builder
         */
        public Builder pluginVersion(String pluginVersion) {
            this.pluginVersion = pluginVersion;
            this.__explicitlySet__.add("pluginVersion");
            return this;
        }
        /** Plugin Status */
        @com.fasterxml.jackson.annotation.JsonProperty("pluginStatus")
        private PluginStatus pluginStatus;

        /**
         * Plugin Status
         *
         * @param pluginStatus the value to set
         * @return this builder
         */
        public Builder pluginStatus(PluginStatus pluginStatus) {
            this.pluginStatus = pluginStatus;
            this.__explicitlySet__.add("pluginStatus");
            return this;
        }
        /** Status message of the Plugin */
        @com.fasterxml.jackson.annotation.JsonProperty("pluginStatusMessage")
        private String pluginStatusMessage;

        /**
         * Status message of the Plugin
         *
         * @param pluginStatusMessage the value to set
         * @return this builder
         */
        public Builder pluginStatusMessage(String pluginStatusMessage) {
            this.pluginStatusMessage = pluginStatusMessage;
            this.__explicitlySet__.add("pluginStatusMessage");
            return this;
        }
        /** flag indicating whether the plugin is in enabled mode or disabled mode. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * flag indicating whether the plugin is in enabled mode or disabled mode.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementAgentPluginDetails build() {
            ManagementAgentPluginDetails model =
                    new ManagementAgentPluginDetails(
                            this.pluginId,
                            this.pluginName,
                            this.pluginDisplayName,
                            this.pluginVersion,
                            this.pluginStatus,
                            this.pluginStatusMessage,
                            this.isEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementAgentPluginDetails model) {
            if (model.wasPropertyExplicitlySet("pluginId")) {
                this.pluginId(model.getPluginId());
            }
            if (model.wasPropertyExplicitlySet("pluginName")) {
                this.pluginName(model.getPluginName());
            }
            if (model.wasPropertyExplicitlySet("pluginDisplayName")) {
                this.pluginDisplayName(model.getPluginDisplayName());
            }
            if (model.wasPropertyExplicitlySet("pluginVersion")) {
                this.pluginVersion(model.getPluginVersion());
            }
            if (model.wasPropertyExplicitlySet("pluginStatus")) {
                this.pluginStatus(model.getPluginStatus());
            }
            if (model.wasPropertyExplicitlySet("pluginStatusMessage")) {
                this.pluginStatusMessage(model.getPluginStatusMessage());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
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

    /** Plugin Id */
    @com.fasterxml.jackson.annotation.JsonProperty("pluginId")
    private final String pluginId;

    /**
     * Plugin Id
     *
     * @return the value
     */
    public String getPluginId() {
        return pluginId;
    }

    /** Management Agent Plugin Name */
    @com.fasterxml.jackson.annotation.JsonProperty("pluginName")
    private final String pluginName;

    /**
     * Management Agent Plugin Name
     *
     * @return the value
     */
    public String getPluginName() {
        return pluginName;
    }

    /** Management Agent Plugin Identifier, can be renamed */
    @com.fasterxml.jackson.annotation.JsonProperty("pluginDisplayName")
    private final String pluginDisplayName;

    /**
     * Management Agent Plugin Identifier, can be renamed
     *
     * @return the value
     */
    public String getPluginDisplayName() {
        return pluginDisplayName;
    }

    /** Plugin Version */
    @com.fasterxml.jackson.annotation.JsonProperty("pluginVersion")
    private final String pluginVersion;

    /**
     * Plugin Version
     *
     * @return the value
     */
    public String getPluginVersion() {
        return pluginVersion;
    }

    /** Plugin Status */
    @com.fasterxml.jackson.annotation.JsonProperty("pluginStatus")
    private final PluginStatus pluginStatus;

    /**
     * Plugin Status
     *
     * @return the value
     */
    public PluginStatus getPluginStatus() {
        return pluginStatus;
    }

    /** Status message of the Plugin */
    @com.fasterxml.jackson.annotation.JsonProperty("pluginStatusMessage")
    private final String pluginStatusMessage;

    /**
     * Status message of the Plugin
     *
     * @return the value
     */
    public String getPluginStatusMessage() {
        return pluginStatusMessage;
    }

    /** flag indicating whether the plugin is in enabled mode or disabled mode. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * flag indicating whether the plugin is in enabled mode or disabled mode.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
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
        sb.append("ManagementAgentPluginDetails(");
        sb.append("super=").append(super.toString());
        sb.append("pluginId=").append(String.valueOf(this.pluginId));
        sb.append(", pluginName=").append(String.valueOf(this.pluginName));
        sb.append(", pluginDisplayName=").append(String.valueOf(this.pluginDisplayName));
        sb.append(", pluginVersion=").append(String.valueOf(this.pluginVersion));
        sb.append(", pluginStatus=").append(String.valueOf(this.pluginStatus));
        sb.append(", pluginStatusMessage=").append(String.valueOf(this.pluginStatusMessage));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementAgentPluginDetails)) {
            return false;
        }

        ManagementAgentPluginDetails other = (ManagementAgentPluginDetails) o;
        return java.util.Objects.equals(this.pluginId, other.pluginId)
                && java.util.Objects.equals(this.pluginName, other.pluginName)
                && java.util.Objects.equals(this.pluginDisplayName, other.pluginDisplayName)
                && java.util.Objects.equals(this.pluginVersion, other.pluginVersion)
                && java.util.Objects.equals(this.pluginStatus, other.pluginStatus)
                && java.util.Objects.equals(this.pluginStatusMessage, other.pluginStatusMessage)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pluginId == null ? 43 : this.pluginId.hashCode());
        result = (result * PRIME) + (this.pluginName == null ? 43 : this.pluginName.hashCode());
        result =
                (result * PRIME)
                        + (this.pluginDisplayName == null ? 43 : this.pluginDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.pluginVersion == null ? 43 : this.pluginVersion.hashCode());
        result = (result * PRIME) + (this.pluginStatus == null ? 43 : this.pluginStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.pluginStatusMessage == null
                                ? 43
                                : this.pluginStatusMessage.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms.model;

/**
 * The WebLogic domain configuration for update operation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateWlsDomainConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateWlsDomainConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isPatchEnabled",
        "isRollbackOnFailure",
        "serversShutdownTimeout",
        "adminServerControlMode",
        "managedServerControlMode",
        "adminServerStartScriptPath",
        "adminServerStopScriptPath",
        "managedServerStartScriptPath",
        "managedServerStopScriptPath"
    })
    public UpdateWlsDomainConfigurationDetails(
            Boolean isPatchEnabled,
            Boolean isRollbackOnFailure,
            Integer serversShutdownTimeout,
            ServerControlMode adminServerControlMode,
            ServerControlMode managedServerControlMode,
            String adminServerStartScriptPath,
            String adminServerStopScriptPath,
            String managedServerStartScriptPath,
            String managedServerStopScriptPath) {
        super();
        this.isPatchEnabled = isPatchEnabled;
        this.isRollbackOnFailure = isRollbackOnFailure;
        this.serversShutdownTimeout = serversShutdownTimeout;
        this.adminServerControlMode = adminServerControlMode;
        this.managedServerControlMode = managedServerControlMode;
        this.adminServerStartScriptPath = adminServerStartScriptPath;
        this.adminServerStopScriptPath = adminServerStopScriptPath;
        this.managedServerStartScriptPath = managedServerStartScriptPath;
        this.managedServerStopScriptPath = managedServerStopScriptPath;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Whether or not the WebLogic domain is enabled for patching. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPatchEnabled")
        private Boolean isPatchEnabled;

        /**
         * Whether or not the WebLogic domain is enabled for patching.
         *
         * @param isPatchEnabled the value to set
         * @return this builder
         */
        public Builder isPatchEnabled(Boolean isPatchEnabled) {
            this.isPatchEnabled = isPatchEnabled;
            this.__explicitlySet__.add("isPatchEnabled");
            return this;
        }
        /** Whether or not to rollback on failure during patching of WebLogic domain. */
        @com.fasterxml.jackson.annotation.JsonProperty("isRollbackOnFailure")
        private Boolean isRollbackOnFailure;

        /**
         * Whether or not to rollback on failure during patching of WebLogic domain.
         *
         * @param isRollbackOnFailure the value to set
         * @return this builder
         */
        public Builder isRollbackOnFailure(Boolean isRollbackOnFailure) {
            this.isRollbackOnFailure = isRollbackOnFailure;
            this.__explicitlySet__.add("isRollbackOnFailure");
            return this;
        }
        /**
         * Servers shutdown timeout in seconds. If set to 0 seconds, it means there is no timeout.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serversShutdownTimeout")
        private Integer serversShutdownTimeout;

        /**
         * Servers shutdown timeout in seconds. If set to 0 seconds, it means there is no timeout.
         *
         * @param serversShutdownTimeout the value to set
         * @return this builder
         */
        public Builder serversShutdownTimeout(Integer serversShutdownTimeout) {
            this.serversShutdownTimeout = serversShutdownTimeout;
            this.__explicitlySet__.add("serversShutdownTimeout");
            return this;
        }
        /** Whether to manage the admin server using Node Manager or scripts. */
        @com.fasterxml.jackson.annotation.JsonProperty("adminServerControlMode")
        private ServerControlMode adminServerControlMode;

        /**
         * Whether to manage the admin server using Node Manager or scripts.
         *
         * @param adminServerControlMode the value to set
         * @return this builder
         */
        public Builder adminServerControlMode(ServerControlMode adminServerControlMode) {
            this.adminServerControlMode = adminServerControlMode;
            this.__explicitlySet__.add("adminServerControlMode");
            return this;
        }
        /** Whether to manage the managed server using Node Manager or scripts. */
        @com.fasterxml.jackson.annotation.JsonProperty("managedServerControlMode")
        private ServerControlMode managedServerControlMode;

        /**
         * Whether to manage the managed server using Node Manager or scripts.
         *
         * @param managedServerControlMode the value to set
         * @return this builder
         */
        public Builder managedServerControlMode(ServerControlMode managedServerControlMode) {
            this.managedServerControlMode = managedServerControlMode;
            this.__explicitlySet__.add("managedServerControlMode");
            return this;
        }
        /** Path to admin server start script. */
        @com.fasterxml.jackson.annotation.JsonProperty("adminServerStartScriptPath")
        private String adminServerStartScriptPath;

        /**
         * Path to admin server start script.
         *
         * @param adminServerStartScriptPath the value to set
         * @return this builder
         */
        public Builder adminServerStartScriptPath(String adminServerStartScriptPath) {
            this.adminServerStartScriptPath = adminServerStartScriptPath;
            this.__explicitlySet__.add("adminServerStartScriptPath");
            return this;
        }
        /** Path to admin server stop script. */
        @com.fasterxml.jackson.annotation.JsonProperty("adminServerStopScriptPath")
        private String adminServerStopScriptPath;

        /**
         * Path to admin server stop script.
         *
         * @param adminServerStopScriptPath the value to set
         * @return this builder
         */
        public Builder adminServerStopScriptPath(String adminServerStopScriptPath) {
            this.adminServerStopScriptPath = adminServerStopScriptPath;
            this.__explicitlySet__.add("adminServerStopScriptPath");
            return this;
        }
        /** Path to managed server start script. */
        @com.fasterxml.jackson.annotation.JsonProperty("managedServerStartScriptPath")
        private String managedServerStartScriptPath;

        /**
         * Path to managed server start script.
         *
         * @param managedServerStartScriptPath the value to set
         * @return this builder
         */
        public Builder managedServerStartScriptPath(String managedServerStartScriptPath) {
            this.managedServerStartScriptPath = managedServerStartScriptPath;
            this.__explicitlySet__.add("managedServerStartScriptPath");
            return this;
        }
        /** Path to managed server stop script. */
        @com.fasterxml.jackson.annotation.JsonProperty("managedServerStopScriptPath")
        private String managedServerStopScriptPath;

        /**
         * Path to managed server stop script.
         *
         * @param managedServerStopScriptPath the value to set
         * @return this builder
         */
        public Builder managedServerStopScriptPath(String managedServerStopScriptPath) {
            this.managedServerStopScriptPath = managedServerStopScriptPath;
            this.__explicitlySet__.add("managedServerStopScriptPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateWlsDomainConfigurationDetails build() {
            UpdateWlsDomainConfigurationDetails model =
                    new UpdateWlsDomainConfigurationDetails(
                            this.isPatchEnabled,
                            this.isRollbackOnFailure,
                            this.serversShutdownTimeout,
                            this.adminServerControlMode,
                            this.managedServerControlMode,
                            this.adminServerStartScriptPath,
                            this.adminServerStopScriptPath,
                            this.managedServerStartScriptPath,
                            this.managedServerStopScriptPath);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateWlsDomainConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("isPatchEnabled")) {
                this.isPatchEnabled(model.getIsPatchEnabled());
            }
            if (model.wasPropertyExplicitlySet("isRollbackOnFailure")) {
                this.isRollbackOnFailure(model.getIsRollbackOnFailure());
            }
            if (model.wasPropertyExplicitlySet("serversShutdownTimeout")) {
                this.serversShutdownTimeout(model.getServersShutdownTimeout());
            }
            if (model.wasPropertyExplicitlySet("adminServerControlMode")) {
                this.adminServerControlMode(model.getAdminServerControlMode());
            }
            if (model.wasPropertyExplicitlySet("managedServerControlMode")) {
                this.managedServerControlMode(model.getManagedServerControlMode());
            }
            if (model.wasPropertyExplicitlySet("adminServerStartScriptPath")) {
                this.adminServerStartScriptPath(model.getAdminServerStartScriptPath());
            }
            if (model.wasPropertyExplicitlySet("adminServerStopScriptPath")) {
                this.adminServerStopScriptPath(model.getAdminServerStopScriptPath());
            }
            if (model.wasPropertyExplicitlySet("managedServerStartScriptPath")) {
                this.managedServerStartScriptPath(model.getManagedServerStartScriptPath());
            }
            if (model.wasPropertyExplicitlySet("managedServerStopScriptPath")) {
                this.managedServerStopScriptPath(model.getManagedServerStopScriptPath());
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

    /** Whether or not the WebLogic domain is enabled for patching. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPatchEnabled")
    private final Boolean isPatchEnabled;

    /**
     * Whether or not the WebLogic domain is enabled for patching.
     *
     * @return the value
     */
    public Boolean getIsPatchEnabled() {
        return isPatchEnabled;
    }

    /** Whether or not to rollback on failure during patching of WebLogic domain. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRollbackOnFailure")
    private final Boolean isRollbackOnFailure;

    /**
     * Whether or not to rollback on failure during patching of WebLogic domain.
     *
     * @return the value
     */
    public Boolean getIsRollbackOnFailure() {
        return isRollbackOnFailure;
    }

    /** Servers shutdown timeout in seconds. If set to 0 seconds, it means there is no timeout. */
    @com.fasterxml.jackson.annotation.JsonProperty("serversShutdownTimeout")
    private final Integer serversShutdownTimeout;

    /**
     * Servers shutdown timeout in seconds. If set to 0 seconds, it means there is no timeout.
     *
     * @return the value
     */
    public Integer getServersShutdownTimeout() {
        return serversShutdownTimeout;
    }

    /** Whether to manage the admin server using Node Manager or scripts. */
    @com.fasterxml.jackson.annotation.JsonProperty("adminServerControlMode")
    private final ServerControlMode adminServerControlMode;

    /**
     * Whether to manage the admin server using Node Manager or scripts.
     *
     * @return the value
     */
    public ServerControlMode getAdminServerControlMode() {
        return adminServerControlMode;
    }

    /** Whether to manage the managed server using Node Manager or scripts. */
    @com.fasterxml.jackson.annotation.JsonProperty("managedServerControlMode")
    private final ServerControlMode managedServerControlMode;

    /**
     * Whether to manage the managed server using Node Manager or scripts.
     *
     * @return the value
     */
    public ServerControlMode getManagedServerControlMode() {
        return managedServerControlMode;
    }

    /** Path to admin server start script. */
    @com.fasterxml.jackson.annotation.JsonProperty("adminServerStartScriptPath")
    private final String adminServerStartScriptPath;

    /**
     * Path to admin server start script.
     *
     * @return the value
     */
    public String getAdminServerStartScriptPath() {
        return adminServerStartScriptPath;
    }

    /** Path to admin server stop script. */
    @com.fasterxml.jackson.annotation.JsonProperty("adminServerStopScriptPath")
    private final String adminServerStopScriptPath;

    /**
     * Path to admin server stop script.
     *
     * @return the value
     */
    public String getAdminServerStopScriptPath() {
        return adminServerStopScriptPath;
    }

    /** Path to managed server start script. */
    @com.fasterxml.jackson.annotation.JsonProperty("managedServerStartScriptPath")
    private final String managedServerStartScriptPath;

    /**
     * Path to managed server start script.
     *
     * @return the value
     */
    public String getManagedServerStartScriptPath() {
        return managedServerStartScriptPath;
    }

    /** Path to managed server stop script. */
    @com.fasterxml.jackson.annotation.JsonProperty("managedServerStopScriptPath")
    private final String managedServerStopScriptPath;

    /**
     * Path to managed server stop script.
     *
     * @return the value
     */
    public String getManagedServerStopScriptPath() {
        return managedServerStopScriptPath;
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
        sb.append("UpdateWlsDomainConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isPatchEnabled=").append(String.valueOf(this.isPatchEnabled));
        sb.append(", isRollbackOnFailure=").append(String.valueOf(this.isRollbackOnFailure));
        sb.append(", serversShutdownTimeout=").append(String.valueOf(this.serversShutdownTimeout));
        sb.append(", adminServerControlMode=").append(String.valueOf(this.adminServerControlMode));
        sb.append(", managedServerControlMode=")
                .append(String.valueOf(this.managedServerControlMode));
        sb.append(", adminServerStartScriptPath=")
                .append(String.valueOf(this.adminServerStartScriptPath));
        sb.append(", adminServerStopScriptPath=")
                .append(String.valueOf(this.adminServerStopScriptPath));
        sb.append(", managedServerStartScriptPath=")
                .append(String.valueOf(this.managedServerStartScriptPath));
        sb.append(", managedServerStopScriptPath=")
                .append(String.valueOf(this.managedServerStopScriptPath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateWlsDomainConfigurationDetails)) {
            return false;
        }

        UpdateWlsDomainConfigurationDetails other = (UpdateWlsDomainConfigurationDetails) o;
        return java.util.Objects.equals(this.isPatchEnabled, other.isPatchEnabled)
                && java.util.Objects.equals(this.isRollbackOnFailure, other.isRollbackOnFailure)
                && java.util.Objects.equals(
                        this.serversShutdownTimeout, other.serversShutdownTimeout)
                && java.util.Objects.equals(
                        this.adminServerControlMode, other.adminServerControlMode)
                && java.util.Objects.equals(
                        this.managedServerControlMode, other.managedServerControlMode)
                && java.util.Objects.equals(
                        this.adminServerStartScriptPath, other.adminServerStartScriptPath)
                && java.util.Objects.equals(
                        this.adminServerStopScriptPath, other.adminServerStopScriptPath)
                && java.util.Objects.equals(
                        this.managedServerStartScriptPath, other.managedServerStartScriptPath)
                && java.util.Objects.equals(
                        this.managedServerStopScriptPath, other.managedServerStopScriptPath)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isPatchEnabled == null ? 43 : this.isPatchEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isRollbackOnFailure == null
                                ? 43
                                : this.isRollbackOnFailure.hashCode());
        result =
                (result * PRIME)
                        + (this.serversShutdownTimeout == null
                                ? 43
                                : this.serversShutdownTimeout.hashCode());
        result =
                (result * PRIME)
                        + (this.adminServerControlMode == null
                                ? 43
                                : this.adminServerControlMode.hashCode());
        result =
                (result * PRIME)
                        + (this.managedServerControlMode == null
                                ? 43
                                : this.managedServerControlMode.hashCode());
        result =
                (result * PRIME)
                        + (this.adminServerStartScriptPath == null
                                ? 43
                                : this.adminServerStartScriptPath.hashCode());
        result =
                (result * PRIME)
                        + (this.adminServerStopScriptPath == null
                                ? 43
                                : this.adminServerStopScriptPath.hashCode());
        result =
                (result * PRIME)
                        + (this.managedServerStartScriptPath == null
                                ? 43
                                : this.managedServerStartScriptPath.hashCode());
        result =
                (result * PRIME)
                        + (this.managedServerStopScriptPath == null
                                ? 43
                                : this.managedServerStopScriptPath.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

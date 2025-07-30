/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * An object that represents APM Agent provisioning via a Management Agent. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateMacsApmExtensionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMacsApmExtensionDetails extends CreateConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** The name by which a configuration entity is displayed to the end user. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name by which a configuration entity is displayed to the end user.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Management Agent that will provision the APM Agent.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
        private String managementAgentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Management Agent that will provision the APM Agent.
         *
         * @param managementAgentId the value to set
         * @return this builder
         */
        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            this.__explicitlySet__.add("managementAgentId");
            return this;
        }
        /**
         * Filter patterns used to discover active Java processes for provisioning the APM Agent.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("processFilter")
        private java.util.List<String> processFilter;

        /**
         * Filter patterns used to discover active Java processes for provisioning the APM Agent.
         *
         * @param processFilter the value to set
         * @return this builder
         */
        public Builder processFilter(java.util.List<String> processFilter) {
            this.processFilter = processFilter;
            this.__explicitlySet__.add("processFilter");
            return this;
        }
        /** The OS user that should be used to discover Java processes. */
        @com.fasterxml.jackson.annotation.JsonProperty("runAsUser")
        private String runAsUser;

        /**
         * The OS user that should be used to discover Java processes.
         *
         * @param runAsUser the value to set
         * @return this builder
         */
        public Builder runAsUser(String runAsUser) {
            this.runAsUser = runAsUser;
            this.__explicitlySet__.add("runAsUser");
            return this;
        }
        /**
         * The name of the service being monitored. This argument enables you to filter by service
         * and view traces and other signals in the APM Explorer user interface.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * The name of the service being monitored. This argument enables you to filter by service
         * and view traces and other signals in the APM Explorer user interface.
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /** The version of the referenced agent bundle. */
        @com.fasterxml.jackson.annotation.JsonProperty("agentVersion")
        private String agentVersion;

        /**
         * The version of the referenced agent bundle.
         *
         * @param agentVersion the value to set
         * @return this builder
         */
        public Builder agentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            this.__explicitlySet__.add("agentVersion");
            return this;
        }
        /** The directory owned by runAsUser. */
        @com.fasterxml.jackson.annotation.JsonProperty("attachInstallDir")
        private String attachInstallDir;

        /**
         * The directory owned by runAsUser.
         *
         * @param attachInstallDir the value to set
         * @return this builder
         */
        public Builder attachInstallDir(String attachInstallDir) {
            this.attachInstallDir = attachInstallDir;
            this.__explicitlySet__.add("attachInstallDir");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMacsApmExtensionDetails build() {
            CreateMacsApmExtensionDetails model =
                    new CreateMacsApmExtensionDetails(
                            this.freeformTags,
                            this.definedTags,
                            this.displayName,
                            this.managementAgentId,
                            this.processFilter,
                            this.runAsUser,
                            this.serviceName,
                            this.agentVersion,
                            this.attachInstallDir);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMacsApmExtensionDetails model) {
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("managementAgentId")) {
                this.managementAgentId(model.getManagementAgentId());
            }
            if (model.wasPropertyExplicitlySet("processFilter")) {
                this.processFilter(model.getProcessFilter());
            }
            if (model.wasPropertyExplicitlySet("runAsUser")) {
                this.runAsUser(model.getRunAsUser());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("agentVersion")) {
                this.agentVersion(model.getAgentVersion());
            }
            if (model.wasPropertyExplicitlySet("attachInstallDir")) {
                this.attachInstallDir(model.getAttachInstallDir());
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
    public CreateMacsApmExtensionDetails(
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            String managementAgentId,
            java.util.List<String> processFilter,
            String runAsUser,
            String serviceName,
            String agentVersion,
            String attachInstallDir) {
        super(freeformTags, definedTags);
        this.displayName = displayName;
        this.managementAgentId = managementAgentId;
        this.processFilter = processFilter;
        this.runAsUser = runAsUser;
        this.serviceName = serviceName;
        this.agentVersion = agentVersion;
        this.attachInstallDir = attachInstallDir;
    }

    /** The name by which a configuration entity is displayed to the end user. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name by which a configuration entity is displayed to the end user.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Management Agent that will provision the APM Agent.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    private final String managementAgentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Management Agent that will provision the APM Agent.
     *
     * @return the value
     */
    public String getManagementAgentId() {
        return managementAgentId;
    }

    /** Filter patterns used to discover active Java processes for provisioning the APM Agent. */
    @com.fasterxml.jackson.annotation.JsonProperty("processFilter")
    private final java.util.List<String> processFilter;

    /**
     * Filter patterns used to discover active Java processes for provisioning the APM Agent.
     *
     * @return the value
     */
    public java.util.List<String> getProcessFilter() {
        return processFilter;
    }

    /** The OS user that should be used to discover Java processes. */
    @com.fasterxml.jackson.annotation.JsonProperty("runAsUser")
    private final String runAsUser;

    /**
     * The OS user that should be used to discover Java processes.
     *
     * @return the value
     */
    public String getRunAsUser() {
        return runAsUser;
    }

    /**
     * The name of the service being monitored. This argument enables you to filter by service and
     * view traces and other signals in the APM Explorer user interface.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * The name of the service being monitored. This argument enables you to filter by service and
     * view traces and other signals in the APM Explorer user interface.
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** The version of the referenced agent bundle. */
    @com.fasterxml.jackson.annotation.JsonProperty("agentVersion")
    private final String agentVersion;

    /**
     * The version of the referenced agent bundle.
     *
     * @return the value
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    /** The directory owned by runAsUser. */
    @com.fasterxml.jackson.annotation.JsonProperty("attachInstallDir")
    private final String attachInstallDir;

    /**
     * The directory owned by runAsUser.
     *
     * @return the value
     */
    public String getAttachInstallDir() {
        return attachInstallDir;
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
        sb.append("CreateMacsApmExtensionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", managementAgentId=").append(String.valueOf(this.managementAgentId));
        sb.append(", processFilter=").append(String.valueOf(this.processFilter));
        sb.append(", runAsUser=").append(String.valueOf(this.runAsUser));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", agentVersion=").append(String.valueOf(this.agentVersion));
        sb.append(", attachInstallDir=").append(String.valueOf(this.attachInstallDir));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMacsApmExtensionDetails)) {
            return false;
        }

        CreateMacsApmExtensionDetails other = (CreateMacsApmExtensionDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.managementAgentId, other.managementAgentId)
                && java.util.Objects.equals(this.processFilter, other.processFilter)
                && java.util.Objects.equals(this.runAsUser, other.runAsUser)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.agentVersion, other.agentVersion)
                && java.util.Objects.equals(this.attachInstallDir, other.attachInstallDir)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.managementAgentId == null ? 43 : this.managementAgentId.hashCode());
        result =
                (result * PRIME)
                        + (this.processFilter == null ? 43 : this.processFilter.hashCode());
        result = (result * PRIME) + (this.runAsUser == null ? 43 : this.runAsUser.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.agentVersion == null ? 43 : this.agentVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.attachInstallDir == null ? 43 : this.attachInstallDir.hashCode());
        return result;
    }
}

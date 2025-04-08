/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The meta-data specific on particular deployment type represented by deploymentType field.
 *
 * <p>Deprecated properties: {@code sourceTechnologies} and {@code targetTechnologies} are not
 * populated. They will be removed after September 15 2025. The list of supported source and target
 * technologies can be accessed using the url provided in {@code supportedTechnologiesUrl} property.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DeploymentTypeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DeploymentTypeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "category",
        "displayName",
        "deploymentType",
        "connectionTypes",
        "sourceTechnologies",
        "targetTechnologies",
        "oggVersion",
        "supportedTechnologiesUrl",
        "defaultUsername",
        "supportedCapabilities"
    })
    public DeploymentTypeSummary(
            DeploymentCategory category,
            String displayName,
            DeploymentType deploymentType,
            java.util.List<ConnectionType> connectionTypes,
            java.util.List<String> sourceTechnologies,
            java.util.List<String> targetTechnologies,
            String oggVersion,
            String supportedTechnologiesUrl,
            String defaultUsername,
            java.util.List<SupportedCapabilities> supportedCapabilities) {
        super();
        this.category = category;
        this.displayName = displayName;
        this.deploymentType = deploymentType;
        this.connectionTypes = connectionTypes;
        this.sourceTechnologies = sourceTechnologies;
        this.targetTechnologies = targetTechnologies;
        this.oggVersion = oggVersion;
        this.supportedTechnologiesUrl = supportedTechnologiesUrl;
        this.defaultUsername = defaultUsername;
        this.supportedCapabilities = supportedCapabilities;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The deployment category defines the broad separation of the deployment type into three
         * categories. Currently the separation is 'DATA_REPLICATION', 'STREAM_ANALYTICS' and
         * 'DATA_TRANSFORMS'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private DeploymentCategory category;

        /**
         * The deployment category defines the broad separation of the deployment type into three
         * categories. Currently the separation is 'DATA_REPLICATION', 'STREAM_ANALYTICS' and
         * 'DATA_TRANSFORMS'.
         *
         * @param category the value to set
         * @return this builder
         */
        public Builder category(DeploymentCategory category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /** An object's Display Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * An object's Display Name.
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
         * The type of deployment, which can be any one of the Allowed values. NOTE: Use of the
         * value 'OGG' is maintained for backward compatibility purposes. Its use is discouraged in
         * favor of 'DATABASE_ORACLE'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private DeploymentType deploymentType;

        /**
         * The type of deployment, which can be any one of the Allowed values. NOTE: Use of the
         * value 'OGG' is maintained for backward compatibility purposes. Its use is discouraged in
         * favor of 'DATABASE_ORACLE'.
         *
         * @param deploymentType the value to set
         * @return this builder
         */
        public Builder deploymentType(DeploymentType deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
            return this;
        }
        /** An array of connectionTypes. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionTypes")
        private java.util.List<ConnectionType> connectionTypes;

        /**
         * An array of connectionTypes.
         *
         * @param connectionTypes the value to set
         * @return this builder
         */
        public Builder connectionTypes(java.util.List<ConnectionType> connectionTypes) {
            this.connectionTypes = connectionTypes;
            this.__explicitlySet__.add("connectionTypes");
            return this;
        }
        /**
         * List of the supported technologies generally. The value is a freeform text string
         * generally consisting of a description of the technology and optionally the speific
         * version(s) support. For example, [ "Oracle Database 19c", "Oracle Exadata", "OCI
         * Streaming" ]
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceTechnologies")
        private java.util.List<String> sourceTechnologies;

        /**
         * List of the supported technologies generally. The value is a freeform text string
         * generally consisting of a description of the technology and optionally the speific
         * version(s) support. For example, [ "Oracle Database 19c", "Oracle Exadata", "OCI
         * Streaming" ]
         *
         * @param sourceTechnologies the value to set
         * @return this builder
         */
        public Builder sourceTechnologies(java.util.List<String> sourceTechnologies) {
            this.sourceTechnologies = sourceTechnologies;
            this.__explicitlySet__.add("sourceTechnologies");
            return this;
        }
        /**
         * List of the supported technologies generally. The value is a freeform text string
         * generally consisting of a description of the technology and optionally the speific
         * version(s) support. For example, [ "Oracle Database 19c", "Oracle Exadata", "OCI
         * Streaming" ]
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetTechnologies")
        private java.util.List<String> targetTechnologies;

        /**
         * List of the supported technologies generally. The value is a freeform text string
         * generally consisting of a description of the technology and optionally the speific
         * version(s) support. For example, [ "Oracle Database 19c", "Oracle Exadata", "OCI
         * Streaming" ]
         *
         * @param targetTechnologies the value to set
         * @return this builder
         */
        public Builder targetTechnologies(java.util.List<String> targetTechnologies) {
            this.targetTechnologies = targetTechnologies;
            this.__explicitlySet__.add("targetTechnologies");
            return this;
        }
        /** Version of OGG */
        @com.fasterxml.jackson.annotation.JsonProperty("oggVersion")
        private String oggVersion;

        /**
         * Version of OGG
         *
         * @param oggVersion the value to set
         * @return this builder
         */
        public Builder oggVersion(String oggVersion) {
            this.oggVersion = oggVersion;
            this.__explicitlySet__.add("oggVersion");
            return this;
        }
        /** The URL to the webpage listing the supported technologies. */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedTechnologiesUrl")
        private String supportedTechnologiesUrl;

        /**
         * The URL to the webpage listing the supported technologies.
         *
         * @param supportedTechnologiesUrl the value to set
         * @return this builder
         */
        public Builder supportedTechnologiesUrl(String supportedTechnologiesUrl) {
            this.supportedTechnologiesUrl = supportedTechnologiesUrl;
            this.__explicitlySet__.add("supportedTechnologiesUrl");
            return this;
        }
        /** The default admin username used by deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultUsername")
        private String defaultUsername;

        /**
         * The default admin username used by deployment.
         *
         * @param defaultUsername the value to set
         * @return this builder
         */
        public Builder defaultUsername(String defaultUsername) {
            this.defaultUsername = defaultUsername;
            this.__explicitlySet__.add("defaultUsername");
            return this;
        }
        /** Specifies supported capabilities or features by a deployment type . */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedCapabilities")
        private java.util.List<SupportedCapabilities> supportedCapabilities;

        /**
         * Specifies supported capabilities or features by a deployment type .
         *
         * @param supportedCapabilities the value to set
         * @return this builder
         */
        public Builder supportedCapabilities(
                java.util.List<SupportedCapabilities> supportedCapabilities) {
            this.supportedCapabilities = supportedCapabilities;
            this.__explicitlySet__.add("supportedCapabilities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeploymentTypeSummary build() {
            DeploymentTypeSummary model =
                    new DeploymentTypeSummary(
                            this.category,
                            this.displayName,
                            this.deploymentType,
                            this.connectionTypes,
                            this.sourceTechnologies,
                            this.targetTechnologies,
                            this.oggVersion,
                            this.supportedTechnologiesUrl,
                            this.defaultUsername,
                            this.supportedCapabilities);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentTypeSummary model) {
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("deploymentType")) {
                this.deploymentType(model.getDeploymentType());
            }
            if (model.wasPropertyExplicitlySet("connectionTypes")) {
                this.connectionTypes(model.getConnectionTypes());
            }
            if (model.wasPropertyExplicitlySet("sourceTechnologies")) {
                this.sourceTechnologies(model.getSourceTechnologies());
            }
            if (model.wasPropertyExplicitlySet("targetTechnologies")) {
                this.targetTechnologies(model.getTargetTechnologies());
            }
            if (model.wasPropertyExplicitlySet("oggVersion")) {
                this.oggVersion(model.getOggVersion());
            }
            if (model.wasPropertyExplicitlySet("supportedTechnologiesUrl")) {
                this.supportedTechnologiesUrl(model.getSupportedTechnologiesUrl());
            }
            if (model.wasPropertyExplicitlySet("defaultUsername")) {
                this.defaultUsername(model.getDefaultUsername());
            }
            if (model.wasPropertyExplicitlySet("supportedCapabilities")) {
                this.supportedCapabilities(model.getSupportedCapabilities());
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

    /**
     * The deployment category defines the broad separation of the deployment type into three
     * categories. Currently the separation is 'DATA_REPLICATION', 'STREAM_ANALYTICS' and
     * 'DATA_TRANSFORMS'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final DeploymentCategory category;

    /**
     * The deployment category defines the broad separation of the deployment type into three
     * categories. Currently the separation is 'DATA_REPLICATION', 'STREAM_ANALYTICS' and
     * 'DATA_TRANSFORMS'.
     *
     * @return the value
     */
    public DeploymentCategory getCategory() {
        return category;
    }

    /** An object's Display Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * An object's Display Name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The type of deployment, which can be any one of the Allowed values. NOTE: Use of the value
     * 'OGG' is maintained for backward compatibility purposes. Its use is discouraged in favor of
     * 'DATABASE_ORACLE'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final DeploymentType deploymentType;

    /**
     * The type of deployment, which can be any one of the Allowed values. NOTE: Use of the value
     * 'OGG' is maintained for backward compatibility purposes. Its use is discouraged in favor of
     * 'DATABASE_ORACLE'.
     *
     * @return the value
     */
    public DeploymentType getDeploymentType() {
        return deploymentType;
    }

    /** An array of connectionTypes. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionTypes")
    private final java.util.List<ConnectionType> connectionTypes;

    /**
     * An array of connectionTypes.
     *
     * @return the value
     */
    public java.util.List<ConnectionType> getConnectionTypes() {
        return connectionTypes;
    }

    /**
     * List of the supported technologies generally. The value is a freeform text string generally
     * consisting of a description of the technology and optionally the speific version(s) support.
     * For example, [ "Oracle Database 19c", "Oracle Exadata", "OCI Streaming" ]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceTechnologies")
    private final java.util.List<String> sourceTechnologies;

    /**
     * List of the supported technologies generally. The value is a freeform text string generally
     * consisting of a description of the technology and optionally the speific version(s) support.
     * For example, [ "Oracle Database 19c", "Oracle Exadata", "OCI Streaming" ]
     *
     * @return the value
     */
    public java.util.List<String> getSourceTechnologies() {
        return sourceTechnologies;
    }

    /**
     * List of the supported technologies generally. The value is a freeform text string generally
     * consisting of a description of the technology and optionally the speific version(s) support.
     * For example, [ "Oracle Database 19c", "Oracle Exadata", "OCI Streaming" ]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetTechnologies")
    private final java.util.List<String> targetTechnologies;

    /**
     * List of the supported technologies generally. The value is a freeform text string generally
     * consisting of a description of the technology and optionally the speific version(s) support.
     * For example, [ "Oracle Database 19c", "Oracle Exadata", "OCI Streaming" ]
     *
     * @return the value
     */
    public java.util.List<String> getTargetTechnologies() {
        return targetTechnologies;
    }

    /** Version of OGG */
    @com.fasterxml.jackson.annotation.JsonProperty("oggVersion")
    private final String oggVersion;

    /**
     * Version of OGG
     *
     * @return the value
     */
    public String getOggVersion() {
        return oggVersion;
    }

    /** The URL to the webpage listing the supported technologies. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedTechnologiesUrl")
    private final String supportedTechnologiesUrl;

    /**
     * The URL to the webpage listing the supported technologies.
     *
     * @return the value
     */
    public String getSupportedTechnologiesUrl() {
        return supportedTechnologiesUrl;
    }

    /** The default admin username used by deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultUsername")
    private final String defaultUsername;

    /**
     * The default admin username used by deployment.
     *
     * @return the value
     */
    public String getDefaultUsername() {
        return defaultUsername;
    }

    /** Specifies supported capabilities or features by a deployment type . */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedCapabilities")
    private final java.util.List<SupportedCapabilities> supportedCapabilities;

    /**
     * Specifies supported capabilities or features by a deployment type .
     *
     * @return the value
     */
    public java.util.List<SupportedCapabilities> getSupportedCapabilities() {
        return supportedCapabilities;
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
        sb.append("DeploymentTypeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("category=").append(String.valueOf(this.category));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", connectionTypes=").append(String.valueOf(this.connectionTypes));
        sb.append(", sourceTechnologies=").append(String.valueOf(this.sourceTechnologies));
        sb.append(", targetTechnologies=").append(String.valueOf(this.targetTechnologies));
        sb.append(", oggVersion=").append(String.valueOf(this.oggVersion));
        sb.append(", supportedTechnologiesUrl=")
                .append(String.valueOf(this.supportedTechnologiesUrl));
        sb.append(", defaultUsername=").append(String.valueOf(this.defaultUsername));
        sb.append(", supportedCapabilities=").append(String.valueOf(this.supportedCapabilities));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentTypeSummary)) {
            return false;
        }

        DeploymentTypeSummary other = (DeploymentTypeSummary) o;
        return java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.deploymentType, other.deploymentType)
                && java.util.Objects.equals(this.connectionTypes, other.connectionTypes)
                && java.util.Objects.equals(this.sourceTechnologies, other.sourceTechnologies)
                && java.util.Objects.equals(this.targetTechnologies, other.targetTechnologies)
                && java.util.Objects.equals(this.oggVersion, other.oggVersion)
                && java.util.Objects.equals(
                        this.supportedTechnologiesUrl, other.supportedTechnologiesUrl)
                && java.util.Objects.equals(this.defaultUsername, other.defaultUsername)
                && java.util.Objects.equals(this.supportedCapabilities, other.supportedCapabilities)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionTypes == null ? 43 : this.connectionTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceTechnologies == null
                                ? 43
                                : this.sourceTechnologies.hashCode());
        result =
                (result * PRIME)
                        + (this.targetTechnologies == null
                                ? 43
                                : this.targetTechnologies.hashCode());
        result = (result * PRIME) + (this.oggVersion == null ? 43 : this.oggVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedTechnologiesUrl == null
                                ? 43
                                : this.supportedTechnologiesUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultUsername == null ? 43 : this.defaultUsername.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedCapabilities == null
                                ? 43
                                : this.supportedCapabilities.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

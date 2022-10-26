/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about the new cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateBdsInstanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateBdsInstanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "clusterVersion",
        "clusterPublicKey",
        "clusterAdminPassword",
        "isHighAvailability",
        "isSecure",
        "networkConfig",
        "bootstrapScriptUrl",
        "nodes",
        "kerberosRealmName",
        "freeformTags",
        "definedTags",
        "kmsKeyId"
    })
    public CreateBdsInstanceDetails(
            String compartmentId,
            String displayName,
            BdsInstance.ClusterVersion clusterVersion,
            String clusterPublicKey,
            String clusterAdminPassword,
            Boolean isHighAvailability,
            Boolean isSecure,
            NetworkConfig networkConfig,
            String bootstrapScriptUrl,
            java.util.List<CreateNodeDetails> nodes,
            String kerberosRealmName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String kmsKeyId) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.clusterVersion = clusterVersion;
        this.clusterPublicKey = clusterPublicKey;
        this.clusterAdminPassword = clusterAdminPassword;
        this.isHighAvailability = isHighAvailability;
        this.isSecure = isSecure;
        this.networkConfig = networkConfig;
        this.bootstrapScriptUrl = bootstrapScriptUrl;
        this.nodes = nodes;
        this.kerberosRealmName = kerberosRealmName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.kmsKeyId = kmsKeyId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Name of the Big Data Service cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Name of the Big Data Service cluster.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Version of the Hadoop distribution. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterVersion")
        private BdsInstance.ClusterVersion clusterVersion;

        /**
         * Version of the Hadoop distribution.
         *
         * @param clusterVersion the value to set
         * @return this builder
         */
        public Builder clusterVersion(BdsInstance.ClusterVersion clusterVersion) {
            this.clusterVersion = clusterVersion;
            this.__explicitlySet__.add("clusterVersion");
            return this;
        }
        /** The SSH public key used to authenticate the cluster connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterPublicKey")
        private String clusterPublicKey;

        /**
         * The SSH public key used to authenticate the cluster connection.
         *
         * @param clusterPublicKey the value to set
         * @return this builder
         */
        public Builder clusterPublicKey(String clusterPublicKey) {
            this.clusterPublicKey = clusterPublicKey;
            this.__explicitlySet__.add("clusterPublicKey");
            return this;
        }
        /** Base-64 encoded password for the cluster (and Cloudera Manager) admin user. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private String clusterAdminPassword;

        /**
         * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
         *
         * @param clusterAdminPassword the value to set
         * @return this builder
         */
        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }
        /** Boolean flag specifying whether or not the cluster is highly available (HA). */
        @com.fasterxml.jackson.annotation.JsonProperty("isHighAvailability")
        private Boolean isHighAvailability;

        /**
         * Boolean flag specifying whether or not the cluster is highly available (HA).
         *
         * @param isHighAvailability the value to set
         * @return this builder
         */
        public Builder isHighAvailability(Boolean isHighAvailability) {
            this.isHighAvailability = isHighAvailability;
            this.__explicitlySet__.add("isHighAvailability");
            return this;
        }
        /** Boolean flag specifying whether or not the cluster should be set up as secure. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSecure")
        private Boolean isSecure;

        /**
         * Boolean flag specifying whether or not the cluster should be set up as secure.
         *
         * @param isSecure the value to set
         * @return this builder
         */
        public Builder isSecure(Boolean isSecure) {
            this.isSecure = isSecure;
            this.__explicitlySet__.add("isSecure");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkConfig")
        private NetworkConfig networkConfig;

        public Builder networkConfig(NetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            this.__explicitlySet__.add("networkConfig");
            return this;
        }
        /** Pre-authenticated URL of the script in Object Store that is downloaded and executed. */
        @com.fasterxml.jackson.annotation.JsonProperty("bootstrapScriptUrl")
        private String bootstrapScriptUrl;

        /**
         * Pre-authenticated URL of the script in Object Store that is downloaded and executed.
         *
         * @param bootstrapScriptUrl the value to set
         * @return this builder
         */
        public Builder bootstrapScriptUrl(String bootstrapScriptUrl) {
            this.bootstrapScriptUrl = bootstrapScriptUrl;
            this.__explicitlySet__.add("bootstrapScriptUrl");
            return this;
        }
        /** The list of nodes in the Big Data Service cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodes")
        private java.util.List<CreateNodeDetails> nodes;

        /**
         * The list of nodes in the Big Data Service cluster.
         *
         * @param nodes the value to set
         * @return this builder
         */
        public Builder nodes(java.util.List<CreateNodeDetails> nodes) {
            this.nodes = nodes;
            this.__explicitlySet__.add("nodes");
            return this;
        }
        /** The user-defined kerberos realm name. */
        @com.fasterxml.jackson.annotation.JsonProperty("kerberosRealmName")
        private String kerberosRealmName;

        /**
         * The user-defined kerberos realm name.
         *
         * @param kerberosRealmName the value to set
         * @return this builder
         */
        public Builder kerberosRealmName(String kerberosRealmName) {
            this.kerberosRealmName = kerberosRealmName;
            this.__explicitlySet__.add("kerberosRealmName");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists
         * for cross-compatibility only. For example, {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists
         * for cross-compatibility only. For example, {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * example, {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * example, {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** The OCID of the Key Management master encryption key. */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the Key Management master encryption key.
         *
         * @param kmsKeyId the value to set
         * @return this builder
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBdsInstanceDetails build() {
            CreateBdsInstanceDetails model =
                    new CreateBdsInstanceDetails(
                            this.compartmentId,
                            this.displayName,
                            this.clusterVersion,
                            this.clusterPublicKey,
                            this.clusterAdminPassword,
                            this.isHighAvailability,
                            this.isSecure,
                            this.networkConfig,
                            this.bootstrapScriptUrl,
                            this.nodes,
                            this.kerberosRealmName,
                            this.freeformTags,
                            this.definedTags,
                            this.kmsKeyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBdsInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("clusterVersion")) {
                this.clusterVersion(model.getClusterVersion());
            }
            if (model.wasPropertyExplicitlySet("clusterPublicKey")) {
                this.clusterPublicKey(model.getClusterPublicKey());
            }
            if (model.wasPropertyExplicitlySet("clusterAdminPassword")) {
                this.clusterAdminPassword(model.getClusterAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("isHighAvailability")) {
                this.isHighAvailability(model.getIsHighAvailability());
            }
            if (model.wasPropertyExplicitlySet("isSecure")) {
                this.isSecure(model.getIsSecure());
            }
            if (model.wasPropertyExplicitlySet("networkConfig")) {
                this.networkConfig(model.getNetworkConfig());
            }
            if (model.wasPropertyExplicitlySet("bootstrapScriptUrl")) {
                this.bootstrapScriptUrl(model.getBootstrapScriptUrl());
            }
            if (model.wasPropertyExplicitlySet("nodes")) {
                this.nodes(model.getNodes());
            }
            if (model.wasPropertyExplicitlySet("kerberosRealmName")) {
                this.kerberosRealmName(model.getKerberosRealmName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
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

    /** The OCID of the compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Name of the Big Data Service cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Name of the Big Data Service cluster.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Version of the Hadoop distribution. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterVersion")
    private final BdsInstance.ClusterVersion clusterVersion;

    /**
     * Version of the Hadoop distribution.
     *
     * @return the value
     */
    public BdsInstance.ClusterVersion getClusterVersion() {
        return clusterVersion;
    }

    /** The SSH public key used to authenticate the cluster connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPublicKey")
    private final String clusterPublicKey;

    /**
     * The SSH public key used to authenticate the cluster connection.
     *
     * @return the value
     */
    public String getClusterPublicKey() {
        return clusterPublicKey;
    }

    /** Base-64 encoded password for the cluster (and Cloudera Manager) admin user. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    private final String clusterAdminPassword;

    /**
     * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
     *
     * @return the value
     */
    public String getClusterAdminPassword() {
        return clusterAdminPassword;
    }

    /** Boolean flag specifying whether or not the cluster is highly available (HA). */
    @com.fasterxml.jackson.annotation.JsonProperty("isHighAvailability")
    private final Boolean isHighAvailability;

    /**
     * Boolean flag specifying whether or not the cluster is highly available (HA).
     *
     * @return the value
     */
    public Boolean getIsHighAvailability() {
        return isHighAvailability;
    }

    /** Boolean flag specifying whether or not the cluster should be set up as secure. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSecure")
    private final Boolean isSecure;

    /**
     * Boolean flag specifying whether or not the cluster should be set up as secure.
     *
     * @return the value
     */
    public Boolean getIsSecure() {
        return isSecure;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkConfig")
    private final NetworkConfig networkConfig;

    public NetworkConfig getNetworkConfig() {
        return networkConfig;
    }

    /** Pre-authenticated URL of the script in Object Store that is downloaded and executed. */
    @com.fasterxml.jackson.annotation.JsonProperty("bootstrapScriptUrl")
    private final String bootstrapScriptUrl;

    /**
     * Pre-authenticated URL of the script in Object Store that is downloaded and executed.
     *
     * @return the value
     */
    public String getBootstrapScriptUrl() {
        return bootstrapScriptUrl;
    }

    /** The list of nodes in the Big Data Service cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodes")
    private final java.util.List<CreateNodeDetails> nodes;

    /**
     * The list of nodes in the Big Data Service cluster.
     *
     * @return the value
     */
    public java.util.List<CreateNodeDetails> getNodes() {
        return nodes;
    }

    /** The user-defined kerberos realm name. */
    @com.fasterxml.jackson.annotation.JsonProperty("kerberosRealmName")
    private final String kerberosRealmName;

    /**
     * The user-defined kerberos realm name.
     *
     * @return the value
     */
    public String getKerberosRealmName() {
        return kerberosRealmName;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for
     * cross-compatibility only. For example, {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for
     * cross-compatibility only. For example, {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
     * example, {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
     * example, {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** The OCID of the Key Management master encryption key. */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the Key Management master encryption key.
     *
     * @return the value
     */
    public String getKmsKeyId() {
        return kmsKeyId;
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
        sb.append("CreateBdsInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", clusterVersion=").append(String.valueOf(this.clusterVersion));
        sb.append(", clusterPublicKey=").append(String.valueOf(this.clusterPublicKey));
        sb.append(", clusterAdminPassword=").append("<redacted>");
        sb.append(", isHighAvailability=").append(String.valueOf(this.isHighAvailability));
        sb.append(", isSecure=").append(String.valueOf(this.isSecure));
        sb.append(", networkConfig=").append(String.valueOf(this.networkConfig));
        sb.append(", bootstrapScriptUrl=").append(String.valueOf(this.bootstrapScriptUrl));
        sb.append(", nodes=").append(String.valueOf(this.nodes));
        sb.append(", kerberosRealmName=").append(String.valueOf(this.kerberosRealmName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateBdsInstanceDetails)) {
            return false;
        }

        CreateBdsInstanceDetails other = (CreateBdsInstanceDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.clusterVersion, other.clusterVersion)
                && java.util.Objects.equals(this.clusterPublicKey, other.clusterPublicKey)
                && java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && java.util.Objects.equals(this.isHighAvailability, other.isHighAvailability)
                && java.util.Objects.equals(this.isSecure, other.isSecure)
                && java.util.Objects.equals(this.networkConfig, other.networkConfig)
                && java.util.Objects.equals(this.bootstrapScriptUrl, other.bootstrapScriptUrl)
                && java.util.Objects.equals(this.nodes, other.nodes)
                && java.util.Objects.equals(this.kerberosRealmName, other.kerberosRealmName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterVersion == null ? 43 : this.clusterVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterPublicKey == null ? 43 : this.clusterPublicKey.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterAdminPassword == null
                                ? 43
                                : this.clusterAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.isHighAvailability == null
                                ? 43
                                : this.isHighAvailability.hashCode());
        result = (result * PRIME) + (this.isSecure == null ? 43 : this.isSecure.hashCode());
        result =
                (result * PRIME)
                        + (this.networkConfig == null ? 43 : this.networkConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.bootstrapScriptUrl == null
                                ? 43
                                : this.bootstrapScriptUrl.hashCode());
        result = (result * PRIME) + (this.nodes == null ? 43 : this.nodes.hashCode());
        result =
                (result * PRIME)
                        + (this.kerberosRealmName == null ? 43 : this.kerberosRealmName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

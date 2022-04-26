/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about the new cluster.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateBdsInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateBdsInstanceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterVersion")
        private BdsInstance.ClusterVersion clusterVersion;

        public Builder clusterVersion(BdsInstance.ClusterVersion clusterVersion) {
            this.clusterVersion = clusterVersion;
            this.__explicitlySet__.add("clusterVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterPublicKey")
        private String clusterPublicKey;

        public Builder clusterPublicKey(String clusterPublicKey) {
            this.clusterPublicKey = clusterPublicKey;
            this.__explicitlySet__.add("clusterPublicKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private String clusterAdminPassword;

        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHighAvailability")
        private Boolean isHighAvailability;

        public Builder isHighAvailability(Boolean isHighAvailability) {
            this.isHighAvailability = isHighAvailability;
            this.__explicitlySet__.add("isHighAvailability");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSecure")
        private Boolean isSecure;

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

        @com.fasterxml.jackson.annotation.JsonProperty("bootstrapScriptUrl")
        private String bootstrapScriptUrl;

        public Builder bootstrapScriptUrl(String bootstrapScriptUrl) {
            this.bootstrapScriptUrl = bootstrapScriptUrl;
            this.__explicitlySet__.add("bootstrapScriptUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodes")
        private java.util.List<CreateNodeDetails> nodes;

        public Builder nodes(java.util.List<CreateNodeDetails> nodes) {
            this.nodes = nodes;
            this.__explicitlySet__.add("nodes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kerberosRealmName")
        private String kerberosRealmName;

        public Builder kerberosRealmName(String kerberosRealmName) {
            this.kerberosRealmName = kerberosRealmName;
            this.__explicitlySet__.add("kerberosRealmName");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBdsInstanceDetails build() {
            CreateBdsInstanceDetails __instance__ =
                    new CreateBdsInstanceDetails(
                            compartmentId,
                            displayName,
                            clusterVersion,
                            clusterPublicKey,
                            clusterAdminPassword,
                            isHighAvailability,
                            isSecure,
                            networkConfig,
                            bootstrapScriptUrl,
                            nodes,
                            kerberosRealmName,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBdsInstanceDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .clusterVersion(o.getClusterVersion())
                            .clusterPublicKey(o.getClusterPublicKey())
                            .clusterAdminPassword(o.getClusterAdminPassword())
                            .isHighAvailability(o.getIsHighAvailability())
                            .isSecure(o.getIsSecure())
                            .networkConfig(o.getNetworkConfig())
                            .bootstrapScriptUrl(o.getBootstrapScriptUrl())
                            .nodes(o.getNodes())
                            .kerberosRealmName(o.getKerberosRealmName())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Name of the Big Data Service cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Version of the Hadoop distribution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterVersion")
    BdsInstance.ClusterVersion clusterVersion;

    /**
     * The SSH public key used to authenticate the cluster connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPublicKey")
    String clusterPublicKey;

    /**
     * Base-64 encoded password for the cluster (and Cloudera Manager) admin user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    String clusterAdminPassword;

    /**
     * Boolean flag specifying whether or not the cluster is highly available (HA).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHighAvailability")
    Boolean isHighAvailability;

    /**
     * Boolean flag specifying whether or not the cluster should be set up as secure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSecure")
    Boolean isSecure;

    @com.fasterxml.jackson.annotation.JsonProperty("networkConfig")
    NetworkConfig networkConfig;

    /**
     * Pre-authenticated URL of the script in Object Store that is downloaded and executed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bootstrapScriptUrl")
    String bootstrapScriptUrl;

    /**
     * The list of nodes in the Big Data Service cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodes")
    java.util.List<CreateNodeDetails> nodes;

    /**
     * The user-defined kerberos realm name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kerberosRealmName")
    String kerberosRealmName;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Exists for cross-compatibility only. For example, {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For example, {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

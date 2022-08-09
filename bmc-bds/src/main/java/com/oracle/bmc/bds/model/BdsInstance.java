/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Description of the cluster.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BdsInstance.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BdsInstance extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "lifecycleState",
        "clusterVersion",
        "isHighAvailability",
        "isSecure",
        "isCloudSqlConfigured",
        "networkConfig",
        "clusterDetails",
        "nodes",
        "cloudSqlDetails",
        "createdBy",
        "timeCreated",
        "timeUpdated",
        "numberOfNodes",
        "bootstrapScriptUrl",
        "freeformTags",
        "definedTags",
        "kmsKeyId"
    })
    public BdsInstance(
            String id,
            String compartmentId,
            String displayName,
            LifecycleState lifecycleState,
            ClusterVersion clusterVersion,
            Boolean isHighAvailability,
            Boolean isSecure,
            Boolean isCloudSqlConfigured,
            NetworkConfig networkConfig,
            ClusterDetails clusterDetails,
            java.util.List<Node> nodes,
            CloudSqlDetails cloudSqlDetails,
            String createdBy,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Integer numberOfNodes,
            String bootstrapScriptUrl,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String kmsKeyId) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.clusterVersion = clusterVersion;
        this.isHighAvailability = isHighAvailability;
        this.isSecure = isSecure;
        this.isCloudSqlConfigured = isCloudSqlConfigured;
        this.networkConfig = networkConfig;
        this.clusterDetails = clusterDetails;
        this.nodes = nodes;
        this.cloudSqlDetails = cloudSqlDetails;
        this.createdBy = createdBy;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.numberOfNodes = numberOfNodes;
        this.bootstrapScriptUrl = bootstrapScriptUrl;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.kmsKeyId = kmsKeyId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the Big Data Service resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the Big Data Service resource.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The name of the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the cluster.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The state of the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The state of the cluster.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Version of the Hadoop distribution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterVersion")
        private ClusterVersion clusterVersion;

        /**
         * Version of the Hadoop distribution.
         * @param clusterVersion the value to set
         * @return this builder
         **/
        public Builder clusterVersion(ClusterVersion clusterVersion) {
            this.clusterVersion = clusterVersion;
            this.__explicitlySet__.add("clusterVersion");
            return this;
        }
        /**
         * Boolean flag specifying whether or not the cluster is highly available (HA)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHighAvailability")
        private Boolean isHighAvailability;

        /**
         * Boolean flag specifying whether or not the cluster is highly available (HA)
         * @param isHighAvailability the value to set
         * @return this builder
         **/
        public Builder isHighAvailability(Boolean isHighAvailability) {
            this.isHighAvailability = isHighAvailability;
            this.__explicitlySet__.add("isHighAvailability");
            return this;
        }
        /**
         * Boolean flag specifying whether or not the cluster should be set up as secure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSecure")
        private Boolean isSecure;

        /**
         * Boolean flag specifying whether or not the cluster should be set up as secure.
         * @param isSecure the value to set
         * @return this builder
         **/
        public Builder isSecure(Boolean isSecure) {
            this.isSecure = isSecure;
            this.__explicitlySet__.add("isSecure");
            return this;
        }
        /**
         * Boolean flag specifying whether or not Cloud SQL should be configured.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCloudSqlConfigured")
        private Boolean isCloudSqlConfigured;

        /**
         * Boolean flag specifying whether or not Cloud SQL should be configured.
         * @param isCloudSqlConfigured the value to set
         * @return this builder
         **/
        public Builder isCloudSqlConfigured(Boolean isCloudSqlConfigured) {
            this.isCloudSqlConfigured = isCloudSqlConfigured;
            this.__explicitlySet__.add("isCloudSqlConfigured");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkConfig")
        private NetworkConfig networkConfig;

        public Builder networkConfig(NetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            this.__explicitlySet__.add("networkConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterDetails")
        private ClusterDetails clusterDetails;

        public Builder clusterDetails(ClusterDetails clusterDetails) {
            this.clusterDetails = clusterDetails;
            this.__explicitlySet__.add("clusterDetails");
            return this;
        }
        /**
         * The list of nodes in the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodes")
        private java.util.List<Node> nodes;

        /**
         * The list of nodes in the cluster.
         * @param nodes the value to set
         * @return this builder
         **/
        public Builder nodes(java.util.List<Node> nodes) {
            this.nodes = nodes;
            this.__explicitlySet__.add("nodes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloudSqlDetails")
        private CloudSqlDetails cloudSqlDetails;

        public Builder cloudSqlDetails(CloudSqlDetails cloudSqlDetails) {
            this.cloudSqlDetails = cloudSqlDetails;
            this.__explicitlySet__.add("cloudSqlDetails");
            return this;
        }
        /**
         * The user who created the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * The user who created the cluster.
         * @param createdBy the value to set
         * @return this builder
         **/
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * The time the cluster was created, shown as an RFC 3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the cluster was created, shown as an RFC 3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the cluster was updated, shown as an RFC 3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the cluster was updated, shown as an RFC 3339 formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Number of nodes that forming the cluster
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfNodes")
        private Integer numberOfNodes;

        /**
         * Number of nodes that forming the cluster
         * @param numberOfNodes the value to set
         * @return this builder
         **/
        public Builder numberOfNodes(Integer numberOfNodes) {
            this.numberOfNodes = numberOfNodes;
            this.__explicitlySet__.add("numberOfNodes");
            return this;
        }
        /**
         * pre-authenticated URL of the bootstrap script in Object Store that can be downloaded and executed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bootstrapScriptUrl")
        private String bootstrapScriptUrl;

        /**
         * pre-authenticated URL of the bootstrap script in Object Store that can be downloaded and executed.
         * @param bootstrapScriptUrl the value to set
         * @return this builder
         **/
        public Builder bootstrapScriptUrl(String bootstrapScriptUrl) {
            this.bootstrapScriptUrl = bootstrapScriptUrl;
            this.__explicitlySet__.add("bootstrapScriptUrl");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope.
         * Exists for cross-compatibility only. For example, {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope.
         * Exists for cross-compatibility only. For example, {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For example, {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For example, {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The OCID of the Key Management master encryption key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the Key Management master encryption key.
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BdsInstance build() {
            BdsInstance model =
                    new BdsInstance(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.lifecycleState,
                            this.clusterVersion,
                            this.isHighAvailability,
                            this.isSecure,
                            this.isCloudSqlConfigured,
                            this.networkConfig,
                            this.clusterDetails,
                            this.nodes,
                            this.cloudSqlDetails,
                            this.createdBy,
                            this.timeCreated,
                            this.timeUpdated,
                            this.numberOfNodes,
                            this.bootstrapScriptUrl,
                            this.freeformTags,
                            this.definedTags,
                            this.kmsKeyId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BdsInstance model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("clusterVersion")) {
                this.clusterVersion(model.getClusterVersion());
            }
            if (model.wasPropertyExplicitlySet("isHighAvailability")) {
                this.isHighAvailability(model.getIsHighAvailability());
            }
            if (model.wasPropertyExplicitlySet("isSecure")) {
                this.isSecure(model.getIsSecure());
            }
            if (model.wasPropertyExplicitlySet("isCloudSqlConfigured")) {
                this.isCloudSqlConfigured(model.getIsCloudSqlConfigured());
            }
            if (model.wasPropertyExplicitlySet("networkConfig")) {
                this.networkConfig(model.getNetworkConfig());
            }
            if (model.wasPropertyExplicitlySet("clusterDetails")) {
                this.clusterDetails(model.getClusterDetails());
            }
            if (model.wasPropertyExplicitlySet("nodes")) {
                this.nodes(model.getNodes());
            }
            if (model.wasPropertyExplicitlySet("cloudSqlDetails")) {
                this.cloudSqlDetails(model.getCloudSqlDetails());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("numberOfNodes")) {
                this.numberOfNodes(model.getNumberOfNodes());
            }
            if (model.wasPropertyExplicitlySet("bootstrapScriptUrl")) {
                this.bootstrapScriptUrl(model.getBootstrapScriptUrl());
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

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of the Big Data Service resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the Big Data Service resource.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name of the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the cluster.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The state of the cluster.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        Suspending("SUSPENDING"),
        Suspended("SUSPENDED"),
        Resuming("RESUMING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The state of the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The state of the cluster.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Version of the Hadoop distribution.
     **/
    public enum ClusterVersion {
        Cdh5("CDH5"),
        Cdh6("CDH6"),
        Odh1("ODH1"),
        Odh09("ODH0_9"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ClusterVersion.class);

        private final String value;
        private static java.util.Map<String, ClusterVersion> map;

        static {
            map = new java.util.HashMap<>();
            for (ClusterVersion v : ClusterVersion.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ClusterVersion(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ClusterVersion create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ClusterVersion', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Version of the Hadoop distribution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterVersion")
    private final ClusterVersion clusterVersion;

    /**
     * Version of the Hadoop distribution.
     * @return the value
     **/
    public ClusterVersion getClusterVersion() {
        return clusterVersion;
    }

    /**
     * Boolean flag specifying whether or not the cluster is highly available (HA)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHighAvailability")
    private final Boolean isHighAvailability;

    /**
     * Boolean flag specifying whether or not the cluster is highly available (HA)
     * @return the value
     **/
    public Boolean getIsHighAvailability() {
        return isHighAvailability;
    }

    /**
     * Boolean flag specifying whether or not the cluster should be set up as secure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSecure")
    private final Boolean isSecure;

    /**
     * Boolean flag specifying whether or not the cluster should be set up as secure.
     * @return the value
     **/
    public Boolean getIsSecure() {
        return isSecure;
    }

    /**
     * Boolean flag specifying whether or not Cloud SQL should be configured.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCloudSqlConfigured")
    private final Boolean isCloudSqlConfigured;

    /**
     * Boolean flag specifying whether or not Cloud SQL should be configured.
     * @return the value
     **/
    public Boolean getIsCloudSqlConfigured() {
        return isCloudSqlConfigured;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkConfig")
    private final NetworkConfig networkConfig;

    public NetworkConfig getNetworkConfig() {
        return networkConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("clusterDetails")
    private final ClusterDetails clusterDetails;

    public ClusterDetails getClusterDetails() {
        return clusterDetails;
    }

    /**
     * The list of nodes in the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodes")
    private final java.util.List<Node> nodes;

    /**
     * The list of nodes in the cluster.
     * @return the value
     **/
    public java.util.List<Node> getNodes() {
        return nodes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cloudSqlDetails")
    private final CloudSqlDetails cloudSqlDetails;

    public CloudSqlDetails getCloudSqlDetails() {
        return cloudSqlDetails;
    }

    /**
     * The user who created the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * The user who created the cluster.
     * @return the value
     **/
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * The time the cluster was created, shown as an RFC 3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the cluster was created, shown as an RFC 3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the cluster was updated, shown as an RFC 3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the cluster was updated, shown as an RFC 3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Number of nodes that forming the cluster
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfNodes")
    private final Integer numberOfNodes;

    /**
     * Number of nodes that forming the cluster
     * @return the value
     **/
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }

    /**
     * pre-authenticated URL of the bootstrap script in Object Store that can be downloaded and executed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bootstrapScriptUrl")
    private final String bootstrapScriptUrl;

    /**
     * pre-authenticated URL of the bootstrap script in Object Store that can be downloaded and executed.
     * @return the value
     **/
    public String getBootstrapScriptUrl() {
        return bootstrapScriptUrl;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Exists for cross-compatibility only. For example, {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Exists for cross-compatibility only. For example, {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For example, {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For example, {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The OCID of the Key Management master encryption key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the Key Management master encryption key.
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BdsInstance(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", clusterVersion=").append(String.valueOf(this.clusterVersion));
        sb.append(", isHighAvailability=").append(String.valueOf(this.isHighAvailability));
        sb.append(", isSecure=").append(String.valueOf(this.isSecure));
        sb.append(", isCloudSqlConfigured=").append(String.valueOf(this.isCloudSqlConfigured));
        sb.append(", networkConfig=").append(String.valueOf(this.networkConfig));
        sb.append(", clusterDetails=").append(String.valueOf(this.clusterDetails));
        sb.append(", nodes=").append(String.valueOf(this.nodes));
        sb.append(", cloudSqlDetails=").append(String.valueOf(this.cloudSqlDetails));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", numberOfNodes=").append(String.valueOf(this.numberOfNodes));
        sb.append(", bootstrapScriptUrl=").append(String.valueOf(this.bootstrapScriptUrl));
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
        if (!(o instanceof BdsInstance)) {
            return false;
        }

        BdsInstance other = (BdsInstance) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.clusterVersion, other.clusterVersion)
                && java.util.Objects.equals(this.isHighAvailability, other.isHighAvailability)
                && java.util.Objects.equals(this.isSecure, other.isSecure)
                && java.util.Objects.equals(this.isCloudSqlConfigured, other.isCloudSqlConfigured)
                && java.util.Objects.equals(this.networkConfig, other.networkConfig)
                && java.util.Objects.equals(this.clusterDetails, other.clusterDetails)
                && java.util.Objects.equals(this.nodes, other.nodes)
                && java.util.Objects.equals(this.cloudSqlDetails, other.cloudSqlDetails)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.numberOfNodes, other.numberOfNodes)
                && java.util.Objects.equals(this.bootstrapScriptUrl, other.bootstrapScriptUrl)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterVersion == null ? 43 : this.clusterVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.isHighAvailability == null
                                ? 43
                                : this.isHighAvailability.hashCode());
        result = (result * PRIME) + (this.isSecure == null ? 43 : this.isSecure.hashCode());
        result =
                (result * PRIME)
                        + (this.isCloudSqlConfigured == null
                                ? 43
                                : this.isCloudSqlConfigured.hashCode());
        result =
                (result * PRIME)
                        + (this.networkConfig == null ? 43 : this.networkConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterDetails == null ? 43 : this.clusterDetails.hashCode());
        result = (result * PRIME) + (this.nodes == null ? 43 : this.nodes.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudSqlDetails == null ? 43 : this.cloudSqlDetails.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfNodes == null ? 43 : this.numberOfNodes.hashCode());
        result =
                (result * PRIME)
                        + (this.bootstrapScriptUrl == null
                                ? 43
                                : this.bootstrapScriptUrl.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

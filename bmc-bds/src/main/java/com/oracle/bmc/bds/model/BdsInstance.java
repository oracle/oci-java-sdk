/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Description of the BDS instance
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BdsInstance.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BdsInstance {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterVersion")
        private ClusterVersion clusterVersion;

        public Builder clusterVersion(ClusterVersion clusterVersion) {
            this.clusterVersion = clusterVersion;
            this.__explicitlySet__.add("clusterVersion");
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

        @com.fasterxml.jackson.annotation.JsonProperty("isCloudSqlConfigured")
        private Boolean isCloudSqlConfigured;

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

        @com.fasterxml.jackson.annotation.JsonProperty("nodes")
        private java.util.List<Node> nodes;

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

        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numberOfNodes")
        private Integer numberOfNodes;

        public Builder numberOfNodes(Integer numberOfNodes) {
            this.numberOfNodes = numberOfNodes;
            this.__explicitlySet__.add("numberOfNodes");
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

        public BdsInstance build() {
            BdsInstance __instance__ =
                    new BdsInstance(
                            id,
                            compartmentId,
                            displayName,
                            lifecycleState,
                            clusterVersion,
                            isHighAvailability,
                            isSecure,
                            isCloudSqlConfigured,
                            networkConfig,
                            clusterDetails,
                            nodes,
                            cloudSqlDetails,
                            createdBy,
                            timeCreated,
                            timeUpdated,
                            numberOfNodes,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BdsInstance o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .lifecycleState(o.getLifecycleState())
                            .clusterVersion(o.getClusterVersion())
                            .isHighAvailability(o.getIsHighAvailability())
                            .isSecure(o.getIsSecure())
                            .isCloudSqlConfigured(o.getIsCloudSqlConfigured())
                            .networkConfig(o.getNetworkConfig())
                            .clusterDetails(o.getClusterDetails())
                            .nodes(o.getNodes())
                            .cloudSqlDetails(o.getCloudSqlDetails())
                            .createdBy(o.getCreatedBy())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .numberOfNodes(o.getNumberOfNodes())
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
     * The OCID of the BDS resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the compartment
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Name of the BDS instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;
    /**
     * The state of the BDS instance
     **/
    @lombok.extern.slf4j.Slf4j
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
     * The state of the BDS instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;
    /**
     * Version of the Hadoop distribution
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ClusterVersion {
        Cdh5("CDH5"),
        Cdh6("CDH6"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * Version of the Hadoop distribution
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterVersion")
    ClusterVersion clusterVersion;

    /**
     * Boolean flag specifying whether or not the cluster is HA
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHighAvailability")
    Boolean isHighAvailability;

    /**
     * Boolean flag specifying whether or not the cluster should be setup as secure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSecure")
    Boolean isSecure;

    /**
     * Boolean flag specifying whether we configure Cloud SQL or not
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCloudSqlConfigured")
    Boolean isCloudSqlConfigured;

    /**
     * Additional configuration of customer's network.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkConfig")
    NetworkConfig networkConfig;

    /**
     * Specific info about a Hadoop cluster
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterDetails")
    ClusterDetails clusterDetails;

    /**
     * The list of nodes in the BDS instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodes")
    java.util.List<Node> nodes;

    /**
     * The information about added Cloud SQL capability
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudSqlDetails")
    CloudSqlDetails cloudSqlDetails;

    /**
     * The user who created the BDS instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    String createdBy;

    /**
     * The time the BDS instance was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time the BDS instance was updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * Number of nodes that forming the cluster
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfNodes")
    Integer numberOfNodes;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: `{\"bar-key\": \"value\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: `{\"foo-namespace\": {\"bar-key\": \"value\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Summary details of the Big Data Service cluster.
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
    builder = BdsInstanceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BdsInstanceSummary {
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
        private BdsInstance.LifecycleState lifecycleState;

        public Builder lifecycleState(BdsInstance.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numberOfNodes")
        private Integer numberOfNodes;

        public Builder numberOfNodes(Integer numberOfNodes) {
            this.numberOfNodes = numberOfNodes;
            this.__explicitlySet__.add("numberOfNodes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterVersion")
        private BdsInstance.ClusterVersion clusterVersion;

        public Builder clusterVersion(BdsInstance.ClusterVersion clusterVersion) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
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

        public BdsInstanceSummary build() {
            BdsInstanceSummary __instance__ =
                    new BdsInstanceSummary(
                            id,
                            compartmentId,
                            displayName,
                            lifecycleState,
                            numberOfNodes,
                            clusterVersion,
                            isHighAvailability,
                            isSecure,
                            isCloudSqlConfigured,
                            timeCreated,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BdsInstanceSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .lifecycleState(o.getLifecycleState())
                            .numberOfNodes(o.getNumberOfNodes())
                            .clusterVersion(o.getClusterVersion())
                            .isHighAvailability(o.getIsHighAvailability())
                            .isSecure(o.getIsSecure())
                            .isCloudSqlConfigured(o.getIsCloudSqlConfigured())
                            .timeCreated(o.getTimeCreated())
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
     * The OCID of the Big Data Service resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The name of the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The state of the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    BdsInstance.LifecycleState lifecycleState;

    /**
     * The number of nodes that form the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfNodes")
    Integer numberOfNodes;

    /**
     * Version of the Hadoop distribution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterVersion")
    BdsInstance.ClusterVersion clusterVersion;

    /**
     * Boolean flag specifying whether or not the cluster is highly available(HA).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHighAvailability")
    Boolean isHighAvailability;

    /**
     * Boolean flag specifying whether or not the cluster should be set up as secure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSecure")
    Boolean isSecure;

    /**
     * Boolean flag specifying whether Cloud SQL is configured or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCloudSqlConfigured")
    Boolean isCloudSqlConfigured;

    /**
     * The time the cluster was created, shown as an RFC 3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

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

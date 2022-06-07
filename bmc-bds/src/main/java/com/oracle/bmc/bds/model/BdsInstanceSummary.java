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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BdsInstanceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BdsInstanceSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "lifecycleState",
        "numberOfNodes",
        "clusterVersion",
        "isHighAvailability",
        "isSecure",
        "isCloudSqlConfigured",
        "timeCreated",
        "freeformTags",
        "definedTags"
    })
    public BdsInstanceSummary(
            String id,
            String compartmentId,
            String displayName,
            BdsInstance.LifecycleState lifecycleState,
            Integer numberOfNodes,
            BdsInstance.ClusterVersion clusterVersion,
            Boolean isHighAvailability,
            Boolean isSecure,
            Boolean isCloudSqlConfigured,
            java.util.Date timeCreated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.numberOfNodes = numberOfNodes;
        this.clusterVersion = clusterVersion;
        this.isHighAvailability = isHighAvailability;
        this.isSecure = isSecure;
        this.isCloudSqlConfigured = isCloudSqlConfigured;
        this.timeCreated = timeCreated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of the Big Data Service resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name of the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The state of the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final BdsInstance.LifecycleState lifecycleState;

    public BdsInstance.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The number of nodes that form the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfNodes")
    private final Integer numberOfNodes;

    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }

    /**
     * Version of the Hadoop distribution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterVersion")
    private final BdsInstance.ClusterVersion clusterVersion;

    public BdsInstance.ClusterVersion getClusterVersion() {
        return clusterVersion;
    }

    /**
     * Boolean flag specifying whether or not the cluster is highly available(HA).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHighAvailability")
    private final Boolean isHighAvailability;

    public Boolean getIsHighAvailability() {
        return isHighAvailability;
    }

    /**
     * Boolean flag specifying whether or not the cluster should be set up as secure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSecure")
    private final Boolean isSecure;

    public Boolean getIsSecure() {
        return isSecure;
    }

    /**
     * Boolean flag specifying whether Cloud SQL is configured or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCloudSqlConfigured")
    private final Boolean isCloudSqlConfigured;

    public Boolean getIsCloudSqlConfigured() {
        return isCloudSqlConfigured;
    }

    /**
     * The time the cluster was created, shown as an RFC 3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Exists for cross-compatibility only. For example, {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

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

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BdsInstanceSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", numberOfNodes=").append(String.valueOf(this.numberOfNodes));
        sb.append(", clusterVersion=").append(String.valueOf(this.clusterVersion));
        sb.append(", isHighAvailability=").append(String.valueOf(this.isHighAvailability));
        sb.append(", isSecure=").append(String.valueOf(this.isSecure));
        sb.append(", isCloudSqlConfigured=").append(String.valueOf(this.isCloudSqlConfigured));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BdsInstanceSummary)) {
            return false;
        }

        BdsInstanceSummary other = (BdsInstanceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.numberOfNodes, other.numberOfNodes)
                && java.util.Objects.equals(this.clusterVersion, other.clusterVersion)
                && java.util.Objects.equals(this.isHighAvailability, other.isHighAvailability)
                && java.util.Objects.equals(this.isSecure, other.isSecure)
                && java.util.Objects.equals(this.isCloudSqlConfigured, other.isCloudSqlConfigured)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
                        + (this.numberOfNodes == null ? 43 : this.numberOfNodes.hashCode());
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
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}

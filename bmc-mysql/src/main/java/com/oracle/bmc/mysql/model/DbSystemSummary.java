/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * A summary of a DB System.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbSystemSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DbSystemSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHighlyAvailable")
        private Boolean isHighlyAvailable;

        public Builder isHighlyAvailable(Boolean isHighlyAvailable) {
            this.isHighlyAvailable = isHighlyAvailable;
            this.__explicitlySet__.add("isHighlyAvailable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currentPlacement")
        private DbSystemPlacement currentPlacement;

        public Builder currentPlacement(DbSystemPlacement currentPlacement) {
            this.currentPlacement = currentPlacement;
            this.__explicitlySet__.add("currentPlacement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAnalyticsClusterAttached")
        private Boolean isAnalyticsClusterAttached;

        public Builder isAnalyticsClusterAttached(Boolean isAnalyticsClusterAttached) {
            this.isAnalyticsClusterAttached = isAnalyticsClusterAttached;
            this.__explicitlySet__.add("isAnalyticsClusterAttached");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("analyticsCluster")
        private AnalyticsClusterSummary analyticsCluster;

        public Builder analyticsCluster(AnalyticsClusterSummary analyticsCluster) {
            this.analyticsCluster = analyticsCluster;
            this.__explicitlySet__.add("analyticsCluster");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHeatWaveClusterAttached")
        private Boolean isHeatWaveClusterAttached;

        public Builder isHeatWaveClusterAttached(Boolean isHeatWaveClusterAttached) {
            this.isHeatWaveClusterAttached = isHeatWaveClusterAttached;
            this.__explicitlySet__.add("isHeatWaveClusterAttached");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("heatWaveCluster")
        private HeatWaveClusterSummary heatWaveCluster;

        public Builder heatWaveCluster(HeatWaveClusterSummary heatWaveCluster) {
            this.heatWaveCluster = heatWaveCluster;
            this.__explicitlySet__.add("heatWaveCluster");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
        private java.util.List<DbSystemEndpoint> endpoints;

        public Builder endpoints(java.util.List<DbSystemEndpoint> endpoints) {
            this.endpoints = endpoints;
            this.__explicitlySet__.add("endpoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private DbSystem.LifecycleState lifecycleState;

        public Builder lifecycleState(DbSystem.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
        private String mysqlVersion;

        public Builder mysqlVersion(String mysqlVersion) {
            this.mysqlVersion = mysqlVersion;
            this.__explicitlySet__.add("mysqlVersion");
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

        @com.fasterxml.jackson.annotation.JsonProperty("deletionPolicy")
        private DeletionPolicyDetails deletionPolicy;

        public Builder deletionPolicy(DeletionPolicyDetails deletionPolicy) {
            this.deletionPolicy = deletionPolicy;
            this.__explicitlySet__.add("deletionPolicy");
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

        @com.fasterxml.jackson.annotation.JsonProperty("crashRecovery")
        private CrashRecoveryStatus crashRecovery;

        public Builder crashRecovery(CrashRecoveryStatus crashRecovery) {
            this.crashRecovery = crashRecovery;
            this.__explicitlySet__.add("crashRecovery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbSystemSummary build() {
            DbSystemSummary __instance__ =
                    new DbSystemSummary(
                            id,
                            displayName,
                            description,
                            compartmentId,
                            isHighlyAvailable,
                            currentPlacement,
                            isAnalyticsClusterAttached,
                            analyticsCluster,
                            isHeatWaveClusterAttached,
                            heatWaveCluster,
                            availabilityDomain,
                            faultDomain,
                            endpoints,
                            lifecycleState,
                            mysqlVersion,
                            timeCreated,
                            timeUpdated,
                            deletionPolicy,
                            freeformTags,
                            definedTags,
                            crashRecovery);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystemSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .compartmentId(o.getCompartmentId())
                            .isHighlyAvailable(o.getIsHighlyAvailable())
                            .currentPlacement(o.getCurrentPlacement())
                            .isAnalyticsClusterAttached(o.getIsAnalyticsClusterAttached())
                            .analyticsCluster(o.getAnalyticsCluster())
                            .isHeatWaveClusterAttached(o.getIsHeatWaveClusterAttached())
                            .heatWaveCluster(o.getHeatWaveCluster())
                            .availabilityDomain(o.getAvailabilityDomain())
                            .faultDomain(o.getFaultDomain())
                            .endpoints(o.getEndpoints())
                            .lifecycleState(o.getLifecycleState())
                            .mysqlVersion(o.getMysqlVersion())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .deletionPolicy(o.getDeletionPolicy())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .crashRecovery(o.getCrashRecovery());

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
     * The OCID of the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The user-friendly name for the DB System. It does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * User-provided data about the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The OCID of the compartment the DB System belongs in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * If the policy is to enable high availability of the instance, by
     * maintaining secondary/failover capacity as necessary.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHighlyAvailable")
    Boolean isHighlyAvailable;

    @com.fasterxml.jackson.annotation.JsonProperty("currentPlacement")
    DbSystemPlacement currentPlacement;

    /**
     * DEPRECATED -- please use {@code isHeatWaveClusterAttached} instead.
     * If the DB System has an Analytics Cluster attached.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAnalyticsClusterAttached")
    Boolean isAnalyticsClusterAttached;

    @com.fasterxml.jackson.annotation.JsonProperty("analyticsCluster")
    AnalyticsClusterSummary analyticsCluster;

    /**
     * If the DB System has a HeatWave Cluster attached.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHeatWaveClusterAttached")
    Boolean isHeatWaveClusterAttached;

    @com.fasterxml.jackson.annotation.JsonProperty("heatWaveCluster")
    HeatWaveClusterSummary heatWaveCluster;

    /**
     * The availability domain on which to deploy the Read/Write endpoint. This defines the preferred primary instance.
     * <p>
     * In a failover scenario, the Read/Write endpoint is redirected to one of the other availability domains
     * and the MySQL instance in that domain is promoted to the primary instance.
     * This redirection does not affect the IP address of the DB System in any way.
     * <p>
     * For a standalone DB System, this defines the availability domain in which the DB System is placed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * The fault domain on which to deploy the Read/Write endpoint. This defines the preferred primary instance.
     * <p>
     * In a failover scenario, the Read/Write endpoint is redirected to one of the other fault domains
     * and the MySQL instance in that domain is promoted to the primary instance.
     * This redirection does not affect the IP address of the DB System in any way.
     * <p>
     * For a standalone DB System, this defines the fault domain in which the DB System is placed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    String faultDomain;

    /**
     * The network endpoints available for this DB System.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
    java.util.List<DbSystemEndpoint> endpoints;

    /**
     * The current state of the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    DbSystem.LifecycleState lifecycleState;

    /**
     * Name of the MySQL Version in use for the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
    String mysqlVersion;

    /**
     * The date and time the DB System was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time the DB System was last updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    @com.fasterxml.jackson.annotation.JsonProperty("deletionPolicy")
    DeletionPolicyDetails deletionPolicy;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Whether to run the DB System with InnoDB Redo Logs and the Double Write Buffer enabled or disabled,
     * and whether to enable or disable syncing of the Binary Logs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crashRecovery")
    CrashRecoveryStatus crashRecovery;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

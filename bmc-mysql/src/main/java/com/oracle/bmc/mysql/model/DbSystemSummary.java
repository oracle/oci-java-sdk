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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbSystemSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DbSystemSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "isHighlyAvailable",
        "currentPlacement",
        "isAnalyticsClusterAttached",
        "analyticsCluster",
        "isHeatWaveClusterAttached",
        "heatWaveCluster",
        "availabilityDomain",
        "faultDomain",
        "endpoints",
        "lifecycleState",
        "mysqlVersion",
        "timeCreated",
        "timeUpdated",
        "deletionPolicy",
        "freeformTags",
        "definedTags",
        "crashRecovery"
    })
    public DbSystemSummary(
            String id,
            String displayName,
            String description,
            String compartmentId,
            Boolean isHighlyAvailable,
            DbSystemPlacement currentPlacement,
            Boolean isAnalyticsClusterAttached,
            AnalyticsClusterSummary analyticsCluster,
            Boolean isHeatWaveClusterAttached,
            HeatWaveClusterSummary heatWaveCluster,
            String availabilityDomain,
            String faultDomain,
            java.util.List<DbSystemEndpoint> endpoints,
            DbSystem.LifecycleState lifecycleState,
            String mysqlVersion,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            DeletionPolicyDetails deletionPolicy,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            CrashRecoveryStatus crashRecovery) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.isHighlyAvailable = isHighlyAvailable;
        this.currentPlacement = currentPlacement;
        this.isAnalyticsClusterAttached = isAnalyticsClusterAttached;
        this.analyticsCluster = analyticsCluster;
        this.isHeatWaveClusterAttached = isHeatWaveClusterAttached;
        this.heatWaveCluster = heatWaveCluster;
        this.availabilityDomain = availabilityDomain;
        this.faultDomain = faultDomain;
        this.endpoints = endpoints;
        this.lifecycleState = lifecycleState;
        this.mysqlVersion = mysqlVersion;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.deletionPolicy = deletionPolicy;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.crashRecovery = crashRecovery;
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The user-friendly name for the DB System. It does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * User-provided data about the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * The OCID of the compartment the DB System belongs in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Specifies if the DB System is highly available.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHighlyAvailable")
    private final Boolean isHighlyAvailable;

    public Boolean getIsHighlyAvailable() {
        return isHighlyAvailable;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("currentPlacement")
    private final DbSystemPlacement currentPlacement;

    public DbSystemPlacement getCurrentPlacement() {
        return currentPlacement;
    }

    /**
     * DEPRECATED -- please use {@code isHeatWaveClusterAttached} instead.
     * If the DB System has an Analytics Cluster attached.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAnalyticsClusterAttached")
    private final Boolean isAnalyticsClusterAttached;

    public Boolean getIsAnalyticsClusterAttached() {
        return isAnalyticsClusterAttached;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("analyticsCluster")
    private final AnalyticsClusterSummary analyticsCluster;

    public AnalyticsClusterSummary getAnalyticsCluster() {
        return analyticsCluster;
    }

    /**
     * If the DB System has a HeatWave Cluster attached.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHeatWaveClusterAttached")
    private final Boolean isHeatWaveClusterAttached;

    public Boolean getIsHeatWaveClusterAttached() {
        return isHeatWaveClusterAttached;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("heatWaveCluster")
    private final HeatWaveClusterSummary heatWaveCluster;

    public HeatWaveClusterSummary getHeatWaveCluster() {
        return heatWaveCluster;
    }

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
    private final String availabilityDomain;

    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

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
    private final String faultDomain;

    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * The network endpoints available for this DB System.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
    private final java.util.List<DbSystemEndpoint> endpoints;

    public java.util.List<DbSystemEndpoint> getEndpoints() {
        return endpoints;
    }

    /**
     * The current state of the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final DbSystem.LifecycleState lifecycleState;

    public DbSystem.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Name of the MySQL Version in use for the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
    private final String mysqlVersion;

    public String getMysqlVersion() {
        return mysqlVersion;
    }

    /**
     * The date and time the DB System was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the DB System was last updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deletionPolicy")
    private final DeletionPolicyDetails deletionPolicy;

    public DeletionPolicyDetails getDeletionPolicy() {
        return deletionPolicy;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Whether to run the DB System with InnoDB Redo Logs and the Double Write Buffer enabled or disabled,
     * and whether to enable or disable syncing of the Binary Logs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crashRecovery")
    private final CrashRecoveryStatus crashRecovery;

    public CrashRecoveryStatus getCrashRecovery() {
        return crashRecovery;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DbSystemSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isHighlyAvailable=").append(String.valueOf(this.isHighlyAvailable));
        sb.append(", currentPlacement=").append(String.valueOf(this.currentPlacement));
        sb.append(", isAnalyticsClusterAttached=")
                .append(String.valueOf(this.isAnalyticsClusterAttached));
        sb.append(", analyticsCluster=").append(String.valueOf(this.analyticsCluster));
        sb.append(", isHeatWaveClusterAttached=")
                .append(String.valueOf(this.isHeatWaveClusterAttached));
        sb.append(", heatWaveCluster=").append(String.valueOf(this.heatWaveCluster));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", endpoints=").append(String.valueOf(this.endpoints));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", mysqlVersion=").append(String.valueOf(this.mysqlVersion));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", deletionPolicy=").append(String.valueOf(this.deletionPolicy));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", crashRecovery=").append(String.valueOf(this.crashRecovery));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbSystemSummary)) {
            return false;
        }

        DbSystemSummary other = (DbSystemSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isHighlyAvailable, other.isHighlyAvailable)
                && java.util.Objects.equals(this.currentPlacement, other.currentPlacement)
                && java.util.Objects.equals(
                        this.isAnalyticsClusterAttached, other.isAnalyticsClusterAttached)
                && java.util.Objects.equals(this.analyticsCluster, other.analyticsCluster)
                && java.util.Objects.equals(
                        this.isHeatWaveClusterAttached, other.isHeatWaveClusterAttached)
                && java.util.Objects.equals(this.heatWaveCluster, other.heatWaveCluster)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.endpoints, other.endpoints)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.mysqlVersion, other.mysqlVersion)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.deletionPolicy, other.deletionPolicy)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.crashRecovery, other.crashRecovery)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.isHighlyAvailable == null ? 43 : this.isHighlyAvailable.hashCode());
        result =
                (result * PRIME)
                        + (this.currentPlacement == null ? 43 : this.currentPlacement.hashCode());
        result =
                (result * PRIME)
                        + (this.isAnalyticsClusterAttached == null
                                ? 43
                                : this.isAnalyticsClusterAttached.hashCode());
        result =
                (result * PRIME)
                        + (this.analyticsCluster == null ? 43 : this.analyticsCluster.hashCode());
        result =
                (result * PRIME)
                        + (this.isHeatWaveClusterAttached == null
                                ? 43
                                : this.isHeatWaveClusterAttached.hashCode());
        result =
                (result * PRIME)
                        + (this.heatWaveCluster == null ? 43 : this.heatWaveCluster.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result = (result * PRIME) + (this.endpoints == null ? 43 : this.endpoints.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.mysqlVersion == null ? 43 : this.mysqlVersion.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.deletionPolicy == null ? 43 : this.deletionPolicy.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.crashRecovery == null ? 43 : this.crashRecovery.hashCode());
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

/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * DEPRECATED -- please use HeatWave API instead.
 * Analytics Cluster memory estimate
 * that can be used to determine a suitable Analytics Cluster size. For each MySQL user table the estimated memory
 * footprint when the table is loaded to the Analytics Cluster memory is returned.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AnalyticsClusterMemoryEstimate.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AnalyticsClusterMemoryEstimate {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dbSystemId",
        "status",
        "timeCreated",
        "timeUpdated",
        "tableSchemas"
    })
    public AnalyticsClusterMemoryEstimate(
            String dbSystemId,
            AnalyticsClusterMemoryEstimateStatus status,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.List<AnalyticsClusterSchemaMemoryEstimate> tableSchemas) {
        super();
        this.dbSystemId = dbSystemId;
        this.status = status;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.tableSchemas = tableSchemas;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private AnalyticsClusterMemoryEstimateStatus status;

        public Builder status(AnalyticsClusterMemoryEstimateStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
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

        @com.fasterxml.jackson.annotation.JsonProperty("tableSchemas")
        private java.util.List<AnalyticsClusterSchemaMemoryEstimate> tableSchemas;

        public Builder tableSchemas(
                java.util.List<AnalyticsClusterSchemaMemoryEstimate> tableSchemas) {
            this.tableSchemas = tableSchemas;
            this.__explicitlySet__.add("tableSchemas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnalyticsClusterMemoryEstimate build() {
            AnalyticsClusterMemoryEstimate __instance__ =
                    new AnalyticsClusterMemoryEstimate(
                            dbSystemId, status, timeCreated, timeUpdated, tableSchemas);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnalyticsClusterMemoryEstimate o) {
            Builder copiedBuilder =
                    dbSystemId(o.getDbSystemId())
                            .status(o.getStatus())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .tableSchemas(o.getTableSchemas());

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
     * The OCID of the DB System the Analytics Cluster memory estimate is associated with.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    public String getDbSystemId() {
        return dbSystemId;
    }

    /**
     * Current status of the Work Request generating the Analytics Cluster memory estimate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final AnalyticsClusterMemoryEstimateStatus status;

    public AnalyticsClusterMemoryEstimateStatus getStatus() {
        return status;
    }

    /**
     * The date and time that the Work Request to generate the Analytics Cluster memory estimate was issued, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc333).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time that the Analytics Cluster memory estimate was generated, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc333).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Collection of schemas with estimated memory footprints for MySQL user tables of each schema
     * when loaded to Analytics Cluster memory.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tableSchemas")
    private final java.util.List<AnalyticsClusterSchemaMemoryEstimate> tableSchemas;

    public java.util.List<AnalyticsClusterSchemaMemoryEstimate> getTableSchemas() {
        return tableSchemas;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AnalyticsClusterMemoryEstimate(");
        sb.append("dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", tableSchemas=").append(String.valueOf(this.tableSchemas));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnalyticsClusterMemoryEstimate)) {
            return false;
        }

        AnalyticsClusterMemoryEstimate other = (AnalyticsClusterMemoryEstimate) o;
        return java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.tableSchemas, other.tableSchemas)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.tableSchemas == null ? 43 : this.tableSchemas.hashCode());
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

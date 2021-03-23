/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * HeatWave cluster memory estimate
 * that can be used to determine a suitable HeatWave cluster size. For each MySQL user table the estimated memory
 * footprint when the table is loaded to the HeatWave cluster memory is returned.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HeatWaveClusterMemoryEstimate.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class HeatWaveClusterMemoryEstimate {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private HeatWaveClusterMemoryEstimateStatus status;

        public Builder status(HeatWaveClusterMemoryEstimateStatus status) {
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
        private java.util.List<HeatWaveClusterSchemaMemoryEstimate> tableSchemas;

        public Builder tableSchemas(
                java.util.List<HeatWaveClusterSchemaMemoryEstimate> tableSchemas) {
            this.tableSchemas = tableSchemas;
            this.__explicitlySet__.add("tableSchemas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HeatWaveClusterMemoryEstimate build() {
            HeatWaveClusterMemoryEstimate __instance__ =
                    new HeatWaveClusterMemoryEstimate(
                            dbSystemId, status, timeCreated, timeUpdated, tableSchemas);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HeatWaveClusterMemoryEstimate o) {
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

    /**
     * The OCID of the DB System the HeatWave cluster memory estimate is associated with.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    String dbSystemId;

    /**
     * Current status of the Work Request generating the HeatWave cluster memory estimate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    HeatWaveClusterMemoryEstimateStatus status;

    /**
     * The date and time that the Work Request to generate the HeatWave cluster memory estimate was issued, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc333).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time that the HeatWave cluster memory estimate was generated, as described by [RFC 3339](https://tools.ietf.org/rfc/rfc333).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * Collection of schemas with estimated memory footprints for MySQL user tables of each schema
     * when loaded to HeatWave cluster memory.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tableSchemas")
    java.util.List<HeatWaveClusterSchemaMemoryEstimate> tableSchemas;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

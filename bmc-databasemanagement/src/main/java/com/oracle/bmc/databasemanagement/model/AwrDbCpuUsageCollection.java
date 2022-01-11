/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The AWR CPU usage data.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AwrDbCpuUsageCollection.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "awrResultType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AwrDbCpuUsageCollection extends AwrQueryResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryKey")
        private String queryKey;

        public Builder queryKey(String queryKey) {
            this.queryKey = queryKey;
            this.__explicitlySet__.add("queryKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbQueryTimeInSecs")
        private Double dbQueryTimeInSecs;

        public Builder dbQueryTimeInSecs(Double dbQueryTimeInSecs) {
            this.dbQueryTimeInSecs = dbQueryTimeInSecs;
            this.__explicitlySet__.add("dbQueryTimeInSecs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numCpuCores")
        private Integer numCpuCores;

        public Builder numCpuCores(Integer numCpuCores) {
            this.numCpuCores = numCpuCores;
            this.__explicitlySet__.add("numCpuCores");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
        private Integer cpuCount;

        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            this.__explicitlySet__.add("cpuCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numCpus")
        private Double numCpus;

        public Builder numCpus(Double numCpus) {
            this.numCpus = numCpus;
            this.__explicitlySet__.add("numCpus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<AwrDbCpuUsageSummary> items;

        public Builder items(java.util.List<AwrDbCpuUsageSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDbCpuUsageCollection build() {
            AwrDbCpuUsageCollection __instance__ =
                    new AwrDbCpuUsageCollection(
                            name,
                            version,
                            queryKey,
                            dbQueryTimeInSecs,
                            numCpuCores,
                            cpuCount,
                            numCpus,
                            items);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDbCpuUsageCollection o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .version(o.getVersion())
                            .queryKey(o.getQueryKey())
                            .dbQueryTimeInSecs(o.getDbQueryTimeInSecs())
                            .numCpuCores(o.getNumCpuCores())
                            .cpuCount(o.getCpuCount())
                            .numCpus(o.getNumCpus())
                            .items(o.getItems());

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

    @Deprecated
    public AwrDbCpuUsageCollection(
            String name,
            String version,
            String queryKey,
            Double dbQueryTimeInSecs,
            Integer numCpuCores,
            Integer cpuCount,
            Double numCpus,
            java.util.List<AwrDbCpuUsageSummary> items) {
        super(name, version, queryKey, dbQueryTimeInSecs);
        this.numCpuCores = numCpuCores;
        this.cpuCount = cpuCount;
        this.numCpus = numCpus;
        this.items = items;
    }

    /**
     * The number of available CPU cores, which include subcores of multicore and single-core CPUs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numCpuCores")
    Integer numCpuCores;

    /**
     * The number of CPUs available for the database to use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
    Integer cpuCount;

    /**
     * The number of available CPUs or processors.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numCpus")
    Double numCpus;

    /**
     * A list of AWR CPU usage summary data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    java.util.List<AwrDbCpuUsageSummary> items;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

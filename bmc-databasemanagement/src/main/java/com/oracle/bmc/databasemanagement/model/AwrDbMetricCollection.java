/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The AWR metrics time series summary data.
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
    builder = AwrDbMetricCollection.Builder.class
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
public class AwrDbMetricCollection extends AwrQueryResult {
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

        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<AwrDbMetricSummary> items;

        public Builder items(java.util.List<AwrDbMetricSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDbMetricCollection build() {
            AwrDbMetricCollection __instance__ =
                    new AwrDbMetricCollection(name, version, queryKey, dbQueryTimeInSecs, items);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDbMetricCollection o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .version(o.getVersion())
                            .queryKey(o.getQueryKey())
                            .dbQueryTimeInSecs(o.getDbQueryTimeInSecs())
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
    public AwrDbMetricCollection(
            String name,
            String version,
            String queryKey,
            Double dbQueryTimeInSecs,
            java.util.List<AwrDbMetricSummary> items) {
        super(name, version, queryKey, dbQueryTimeInSecs);
        this.items = items;
    }

    /**
     * A list of AWR metric summary data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    java.util.List<AwrDbMetricSummary> items;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

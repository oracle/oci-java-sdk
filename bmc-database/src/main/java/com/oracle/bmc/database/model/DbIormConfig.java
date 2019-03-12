/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

/**
 * IORM Config setting response for this database
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbIormConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DbIormConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("share")
        private Integer share;

        public Builder share(Integer share) {
            this.share = share;
            this.__explicitlySet__.add("share");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("flashCacheLimit")
        private String flashCacheLimit;

        public Builder flashCacheLimit(String flashCacheLimit) {
            this.flashCacheLimit = flashCacheLimit;
            this.__explicitlySet__.add("flashCacheLimit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbIormConfig build() {
            DbIormConfig __instance__ = new DbIormConfig(dbName, share, flashCacheLimit);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbIormConfig o) {
            Builder copiedBuilder =
                    dbName(o.getDbName())
                            .share(o.getShare())
                            .flashCacheLimit(o.getFlashCacheLimit());

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
     * Database Name. For default DbPlan, the dbName will always be `default`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    String dbName;

    /**
     * Relative priority of a database
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("share")
    Integer share;

    /**
     * Flash Cache limit, internally configured based on shares
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("flashCacheLimit")
    String flashCacheLimit;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

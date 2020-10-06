/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The IORM configuration settings for the database.
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
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
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
     * The database name. For the default `DbPlan`, the `dbName` is `default`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    String dbName;

    /**
     * The relative priority of this database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("share")
    Integer share;

    /**
     * The flash cache limit for this database. This value is internally configured based on the share value assigned to the database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("flashCacheLimit")
    String flashCacheLimit;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

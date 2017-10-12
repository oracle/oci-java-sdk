/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

/**
 * The Oracle database software version.
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to an administrator. If you're an administrator who needs to write policies to give users access, see [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbVersionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DbVersionSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("supportsPdb")
        private Boolean supportsPdb;

        public Builder supportsPdb(Boolean supportsPdb) {
            this.supportsPdb = supportsPdb;
            this.__explicitlySet__.add("supportsPdb");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbVersionSummary build() {
            DbVersionSummary __instance__ = new DbVersionSummary(supportsPdb, version);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbVersionSummary o) {
            return supportsPdb(o.getSupportsPdb()).version(o.getVersion());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * True if this version of the Oracle database software supports pluggable dbs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportsPdb")
    Boolean supportsPdb;

    /**
     * A valid Oracle database version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

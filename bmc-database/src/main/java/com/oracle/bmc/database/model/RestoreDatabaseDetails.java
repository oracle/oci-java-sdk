/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RestoreDatabaseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class RestoreDatabaseDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSCN")
        private String databaseSCN;

        public Builder databaseSCN(String databaseSCN) {
            this.databaseSCN = databaseSCN;
            this.__explicitlySet__.add("databaseSCN");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("latest")
        private Boolean latest;

        public Builder latest(Boolean latest) {
            this.latest = latest;
            this.__explicitlySet__.add("latest");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RestoreDatabaseDetails build() {
            RestoreDatabaseDetails __instance__ =
                    new RestoreDatabaseDetails(databaseSCN, latest, timestamp);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RestoreDatabaseDetails o) {
            Builder copiedBuilder =
                    databaseSCN(o.getDatabaseSCN())
                            .latest(o.getLatest())
                            .timestamp(o.getTimestamp());

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
     * Restores using the backup with the System Change Number (SCN) specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSCN")
    String databaseSCN;

    /**
     * Restores to the last known good state with the least possible data loss.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("latest")
    Boolean latest;

    /**
     * Restores to the timestamp specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    java.util.Date timestamp;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

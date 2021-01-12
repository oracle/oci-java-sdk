/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to restore an Oracle Autonomous Database.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RestoreAutonomousDatabaseDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RestoreAutonomousDatabaseDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RestoreAutonomousDatabaseDetails build() {
            RestoreAutonomousDatabaseDetails __instance__ =
                    new RestoreAutonomousDatabaseDetails(timestamp, databaseSCN, latest);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RestoreAutonomousDatabaseDetails o) {
            Builder copiedBuilder =
                    timestamp(o.getTimestamp())
                            .databaseSCN(o.getDatabaseSCN())
                            .latest(o.getLatest());

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
     * The time to restore the database to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    java.util.Date timestamp;

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

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Connection strings to connect to an Oracle Autonomous Database.
 * <p>
 * Example output for connection strings. See {@link #databaseConnectionStringProfile(DatabaseConnectionStringProfileRequest) databaseConnectionStringProfile} for additional details:
 * <p>
 * \t\t"connectionStrings": {
 *         "allConnectionStrings": {
 *           "HIGH": "adb.region.oraclecloud.com:1522/unique_id_databasename_high.adwc.oraclecloud.com",
 *           "LOW": "adb.region.oraclecloud.com:1522/unique_id_databasename_low.adwc.oraclecloud.com",
 *           "MEDIUM": "adb.region.oraclecloud.com:1522/unique_id_databasename_medium.adwc.oraclecloud.com"
 *         },
 *         "profiles": [
 *           {
 *             "displayName": "databasename_high",
 *             "value": "(description= (retry_count=20)(retry_delay=3)(address=(protocol=tcps)(port=1522)(host=adb.region.oraclecloud.com))(connect_data=(service_name=unique_id_databasename_high.adwc.oraclecloud.com))(security=(ssl_server_cert_dn="CN=adwc.uscom-east-1.oraclecloud.com,OU=Oracle BMCS US,O=Oracle Corporation,L=Redwood City,ST=California,C=US")))",
 *             "consumerGroup": "HIGH",
 *             "protocol": "TCPS",
 *             "tlsAuthentication": "MUTUAL",
 *             "hostFormat": "FQDN",
 *             "sessionMode": "DIRECT",
 *             "syntaxFormat": "LONG"
 *           },
 *           {
 *             "displayName": "databasename_low",
 *             "value": "(description= (retry_count=20)(retry_delay=3)(address=(protocol=tcps)(port=1522)(host=adb.region.oraclecloud.com))(connect_data=(service_name=unique_id_databasename_low.adwc.oraclecloud.com))(security=(ssl_server_cert_dn="CN=adwc.uscom-east-1.oraclecloud.com,OU=Oracle BMCS US,O=Oracle Corporation,L=Redwood City,ST=California,C=US")))",
 *             "consumerGroup": "LOW",
 *             "protocol": "TCPS",
 *             "tlsAuthentication": "MUTUAL",
 *             "hostFormat": "FQDN",
 *             "sessionMode": "DIRECT",
 *             "syntaxFormat": "LONG"
 *           },
 *           {
 *             "displayName": "databasename_medium",
 *             "value": "(description= (retry_count=20)(retry_delay=3)(address=(protocol=tcps)(port=1522)(host=adb.region.oraclecloud.com))(connect_data=(service_name=unique_id_databasename_medium.adwc.oraclecloud.com))(security=(ssl_server_cert_dn="CN=adwc.uscom-east-1.oraclecloud.com,OU=Oracle BMCS US,O=Oracle Corporation,L=Redwood City,ST=California,C=US")))",
 *             "consumerGroup": "MEDIUM",
 *             "protocol": "TCPS",
 *             "tlsAuthentication": "MUTUAL",
 *             "hostFormat": "FQDN",
 *             "sessionMode": "DIRECT",
 *             "syntaxFormat": "LONG"
 *           }
 *         ],
 *         "dedicated": null,
 *         "high": "adb.region.oraclecloud.com:1522/unique_id_databasename_high.adwc.oraclecloud.com",
 *         "low": "adb.region.oraclecloud.com:1522/unique_id_databasename_low.adwc.oraclecloud.com",
 *         "medium": "adb.region.oraclecloud.com:1522/unique_id_databasename_medium.adwc.oraclecloud.com"
 *       }
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
    builder = AutonomousDatabaseConnectionStrings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AutonomousDatabaseConnectionStrings {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("high")
        private String high;

        public Builder high(String high) {
            this.high = high;
            this.__explicitlySet__.add("high");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("medium")
        private String medium;

        public Builder medium(String medium) {
            this.medium = medium;
            this.__explicitlySet__.add("medium");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("low")
        private String low;

        public Builder low(String low) {
            this.low = low;
            this.__explicitlySet__.add("low");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dedicated")
        private String dedicated;

        public Builder dedicated(String dedicated) {
            this.dedicated = dedicated;
            this.__explicitlySet__.add("dedicated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allConnectionStrings")
        private java.util.Map<String, String> allConnectionStrings;

        public Builder allConnectionStrings(java.util.Map<String, String> allConnectionStrings) {
            this.allConnectionStrings = allConnectionStrings;
            this.__explicitlySet__.add("allConnectionStrings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("profiles")
        private java.util.List<DatabaseConnectionStringProfile> profiles;

        public Builder profiles(java.util.List<DatabaseConnectionStringProfile> profiles) {
            this.profiles = profiles;
            this.__explicitlySet__.add("profiles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDatabaseConnectionStrings build() {
            AutonomousDatabaseConnectionStrings __instance__ =
                    new AutonomousDatabaseConnectionStrings(
                            high, medium, low, dedicated, allConnectionStrings, profiles);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabaseConnectionStrings o) {
            Builder copiedBuilder =
                    high(o.getHigh())
                            .medium(o.getMedium())
                            .low(o.getLow())
                            .dedicated(o.getDedicated())
                            .allConnectionStrings(o.getAllConnectionStrings())
                            .profiles(o.getProfiles());

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
     * The High database service provides the highest level of resources to each SQL statement resulting in the highest performance, but supports the fewest number of concurrent SQL statements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("high")
    String high;

    /**
     * The Medium database service provides a lower level of resources to each SQL statement potentially resulting a lower level of performance, but supports more concurrent SQL statements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("medium")
    String medium;

    /**
     * The Low database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("low")
    String low;

    /**
     * The database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dedicated")
    String dedicated;

    /**
     * Returns all connection strings that can be used to connect to the Autonomous Database.
     * For more information, please see [Predefined Database Service Names for Autonomous Transaction Processing](https://docs.oracle.com/en/cloud/paas/atp-cloud/atpug/connect-predefined.html#GUID-9747539B-FD46-44F1-8FF8-F5AC650F15BE)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allConnectionStrings")
    java.util.Map<String, String> allConnectionStrings;

    /**
     * A list of connection string profiles to allow clients to group, filter and select connection string values based on structured metadata.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("profiles")
    java.util.List<DatabaseConnectionStringProfile> profiles;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

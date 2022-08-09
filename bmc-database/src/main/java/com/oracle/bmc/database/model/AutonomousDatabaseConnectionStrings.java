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
 * \t"connectionStrings": {
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AutonomousDatabaseConnectionStrings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutonomousDatabaseConnectionStrings
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "high",
        "medium",
        "low",
        "dedicated",
        "allConnectionStrings",
        "profiles"
    })
    public AutonomousDatabaseConnectionStrings(
            String high,
            String medium,
            String low,
            String dedicated,
            java.util.Map<String, String> allConnectionStrings,
            java.util.List<DatabaseConnectionStringProfile> profiles) {
        super();
        this.high = high;
        this.medium = medium;
        this.low = low;
        this.dedicated = dedicated;
        this.allConnectionStrings = allConnectionStrings;
        this.profiles = profiles;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The High database service provides the highest level of resources to each SQL statement resulting in the highest performance, but supports the fewest number of concurrent SQL statements.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("high")
        private String high;

        /**
         * The High database service provides the highest level of resources to each SQL statement resulting in the highest performance, but supports the fewest number of concurrent SQL statements.
         * @param high the value to set
         * @return this builder
         **/
        public Builder high(String high) {
            this.high = high;
            this.__explicitlySet__.add("high");
            return this;
        }
        /**
         * The Medium database service provides a lower level of resources to each SQL statement potentially resulting a lower level of performance, but supports more concurrent SQL statements.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("medium")
        private String medium;

        /**
         * The Medium database service provides a lower level of resources to each SQL statement potentially resulting a lower level of performance, but supports more concurrent SQL statements.
         * @param medium the value to set
         * @return this builder
         **/
        public Builder medium(String medium) {
            this.medium = medium;
            this.__explicitlySet__.add("medium");
            return this;
        }
        /**
         * The Low database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("low")
        private String low;

        /**
         * The Low database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
         * @param low the value to set
         * @return this builder
         **/
        public Builder low(String low) {
            this.low = low;
            this.__explicitlySet__.add("low");
            return this;
        }
        /**
         * The database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dedicated")
        private String dedicated;

        /**
         * The database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
         * @param dedicated the value to set
         * @return this builder
         **/
        public Builder dedicated(String dedicated) {
            this.dedicated = dedicated;
            this.__explicitlySet__.add("dedicated");
            return this;
        }
        /**
         * Returns all connection strings that can be used to connect to the Autonomous Database.
         * For more information, please see [Predefined Database Service Names for Autonomous Transaction Processing](https://docs.oracle.com/en/cloud/paas/atp-cloud/atpug/connect-predefined.html#GUID-9747539B-FD46-44F1-8FF8-F5AC650F15BE)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allConnectionStrings")
        private java.util.Map<String, String> allConnectionStrings;

        /**
         * Returns all connection strings that can be used to connect to the Autonomous Database.
         * For more information, please see [Predefined Database Service Names for Autonomous Transaction Processing](https://docs.oracle.com/en/cloud/paas/atp-cloud/atpug/connect-predefined.html#GUID-9747539B-FD46-44F1-8FF8-F5AC650F15BE)
         *
         * @param allConnectionStrings the value to set
         * @return this builder
         **/
        public Builder allConnectionStrings(java.util.Map<String, String> allConnectionStrings) {
            this.allConnectionStrings = allConnectionStrings;
            this.__explicitlySet__.add("allConnectionStrings");
            return this;
        }
        /**
         * A list of connection string profiles to allow clients to group, filter and select connection string values based on structured metadata.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("profiles")
        private java.util.List<DatabaseConnectionStringProfile> profiles;

        /**
         * A list of connection string profiles to allow clients to group, filter and select connection string values based on structured metadata.
         *
         * @param profiles the value to set
         * @return this builder
         **/
        public Builder profiles(java.util.List<DatabaseConnectionStringProfile> profiles) {
            this.profiles = profiles;
            this.__explicitlySet__.add("profiles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDatabaseConnectionStrings build() {
            AutonomousDatabaseConnectionStrings model =
                    new AutonomousDatabaseConnectionStrings(
                            this.high,
                            this.medium,
                            this.low,
                            this.dedicated,
                            this.allConnectionStrings,
                            this.profiles);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabaseConnectionStrings model) {
            if (model.wasPropertyExplicitlySet("high")) {
                this.high(model.getHigh());
            }
            if (model.wasPropertyExplicitlySet("medium")) {
                this.medium(model.getMedium());
            }
            if (model.wasPropertyExplicitlySet("low")) {
                this.low(model.getLow());
            }
            if (model.wasPropertyExplicitlySet("dedicated")) {
                this.dedicated(model.getDedicated());
            }
            if (model.wasPropertyExplicitlySet("allConnectionStrings")) {
                this.allConnectionStrings(model.getAllConnectionStrings());
            }
            if (model.wasPropertyExplicitlySet("profiles")) {
                this.profiles(model.getProfiles());
            }
            return this;
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
     * The High database service provides the highest level of resources to each SQL statement resulting in the highest performance, but supports the fewest number of concurrent SQL statements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("high")
    private final String high;

    /**
     * The High database service provides the highest level of resources to each SQL statement resulting in the highest performance, but supports the fewest number of concurrent SQL statements.
     * @return the value
     **/
    public String getHigh() {
        return high;
    }

    /**
     * The Medium database service provides a lower level of resources to each SQL statement potentially resulting a lower level of performance, but supports more concurrent SQL statements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("medium")
    private final String medium;

    /**
     * The Medium database service provides a lower level of resources to each SQL statement potentially resulting a lower level of performance, but supports more concurrent SQL statements.
     * @return the value
     **/
    public String getMedium() {
        return medium;
    }

    /**
     * The Low database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("low")
    private final String low;

    /**
     * The Low database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
     * @return the value
     **/
    public String getLow() {
        return low;
    }

    /**
     * The database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dedicated")
    private final String dedicated;

    /**
     * The database service provides the least level of resources to each SQL statement, but supports the most number of concurrent SQL statements.
     * @return the value
     **/
    public String getDedicated() {
        return dedicated;
    }

    /**
     * Returns all connection strings that can be used to connect to the Autonomous Database.
     * For more information, please see [Predefined Database Service Names for Autonomous Transaction Processing](https://docs.oracle.com/en/cloud/paas/atp-cloud/atpug/connect-predefined.html#GUID-9747539B-FD46-44F1-8FF8-F5AC650F15BE)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allConnectionStrings")
    private final java.util.Map<String, String> allConnectionStrings;

    /**
     * Returns all connection strings that can be used to connect to the Autonomous Database.
     * For more information, please see [Predefined Database Service Names for Autonomous Transaction Processing](https://docs.oracle.com/en/cloud/paas/atp-cloud/atpug/connect-predefined.html#GUID-9747539B-FD46-44F1-8FF8-F5AC650F15BE)
     *
     * @return the value
     **/
    public java.util.Map<String, String> getAllConnectionStrings() {
        return allConnectionStrings;
    }

    /**
     * A list of connection string profiles to allow clients to group, filter and select connection string values based on structured metadata.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("profiles")
    private final java.util.List<DatabaseConnectionStringProfile> profiles;

    /**
     * A list of connection string profiles to allow clients to group, filter and select connection string values based on structured metadata.
     *
     * @return the value
     **/
    public java.util.List<DatabaseConnectionStringProfile> getProfiles() {
        return profiles;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AutonomousDatabaseConnectionStrings(");
        sb.append("super=").append(super.toString());
        sb.append("high=").append(String.valueOf(this.high));
        sb.append(", medium=").append(String.valueOf(this.medium));
        sb.append(", low=").append(String.valueOf(this.low));
        sb.append(", dedicated=").append(String.valueOf(this.dedicated));
        sb.append(", allConnectionStrings=").append(String.valueOf(this.allConnectionStrings));
        sb.append(", profiles=").append(String.valueOf(this.profiles));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousDatabaseConnectionStrings)) {
            return false;
        }

        AutonomousDatabaseConnectionStrings other = (AutonomousDatabaseConnectionStrings) o;
        return java.util.Objects.equals(this.high, other.high)
                && java.util.Objects.equals(this.medium, other.medium)
                && java.util.Objects.equals(this.low, other.low)
                && java.util.Objects.equals(this.dedicated, other.dedicated)
                && java.util.Objects.equals(this.allConnectionStrings, other.allConnectionStrings)
                && java.util.Objects.equals(this.profiles, other.profiles)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.high == null ? 43 : this.high.hashCode());
        result = (result * PRIME) + (this.medium == null ? 43 : this.medium.hashCode());
        result = (result * PRIME) + (this.low == null ? 43 : this.low.hashCode());
        result = (result * PRIME) + (this.dedicated == null ? 43 : this.dedicated.hashCode());
        result =
                (result * PRIME)
                        + (this.allConnectionStrings == null
                                ? 43
                                : this.allConnectionStrings.hashCode());
        result = (result * PRIME) + (this.profiles == null ? 43 : this.profiles.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

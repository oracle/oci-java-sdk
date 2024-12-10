/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Request configuration details for the SQL monitor type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlMonitorConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlMonitorConfiguration extends MonitorConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isFailureRetried")
        private Boolean isFailureRetried;

        public Builder isFailureRetried(Boolean isFailureRetried) {
            this.isFailureRetried = isFailureRetried;
            this.__explicitlySet__.add("isFailureRetried");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dnsConfiguration")
        private DnsConfiguration dnsConfiguration;

        public Builder dnsConfiguration(DnsConfiguration dnsConfiguration) {
            this.dnsConfiguration = dnsConfiguration;
            this.__explicitlySet__.add("dnsConfiguration");
            return this;
        }
        /**
         * Database type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private DatabaseType databaseType;

        /**
         * Database type.
         * @param databaseType the value to set
         * @return this builder
         **/
        public Builder databaseType(DatabaseType databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }
        /**
         * SQL query to be executed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        /**
         * SQL query to be executed.
         * @param query the value to set
         * @return this builder
         **/
        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseAuthenticationDetails")
        private BasicAuthenticationDetails databaseAuthenticationDetails;

        public Builder databaseAuthenticationDetails(
                BasicAuthenticationDetails databaseAuthenticationDetails) {
            this.databaseAuthenticationDetails = databaseAuthenticationDetails;
            this.__explicitlySet__.add("databaseAuthenticationDetails");
            return this;
        }
        /**
         * Database role.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseRole")
        private String databaseRole;

        /**
         * Database role.
         * @param databaseRole the value to set
         * @return this builder
         **/
        public Builder databaseRole(String databaseRole) {
            this.databaseRole = databaseRole;
            this.__explicitlySet__.add("databaseRole");
            return this;
        }
        /**
         * Database connection type. Only CUSTOM_JDBC is supported for MYSQL database type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseConnectionType")
        private DatabaseConnectionType databaseConnectionType;

        /**
         * Database connection type. Only CUSTOM_JDBC is supported for MYSQL database type.
         * @param databaseConnectionType the value to set
         * @return this builder
         **/
        public Builder databaseConnectionType(DatabaseConnectionType databaseConnectionType) {
            this.databaseConnectionType = databaseConnectionType;
            this.__explicitlySet__.add("databaseConnectionType");
            return this;
        }
        /**
         * Database connection string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
        private String connectionString;

        /**
         * Database connection string.
         * @param connectionString the value to set
         * @return this builder
         **/
        public Builder connectionString(String connectionString) {
            this.connectionString = connectionString;
            this.__explicitlySet__.add("connectionString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseWalletDetails")
        private DatabaseWalletDetails databaseWalletDetails;

        public Builder databaseWalletDetails(DatabaseWalletDetails databaseWalletDetails) {
            this.databaseWalletDetails = databaseWalletDetails;
            this.__explicitlySet__.add("databaseWalletDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlMonitorConfiguration build() {
            SqlMonitorConfiguration model =
                    new SqlMonitorConfiguration(
                            this.isFailureRetried,
                            this.dnsConfiguration,
                            this.databaseType,
                            this.query,
                            this.databaseAuthenticationDetails,
                            this.databaseRole,
                            this.databaseConnectionType,
                            this.connectionString,
                            this.databaseWalletDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlMonitorConfiguration model) {
            if (model.wasPropertyExplicitlySet("isFailureRetried")) {
                this.isFailureRetried(model.getIsFailureRetried());
            }
            if (model.wasPropertyExplicitlySet("dnsConfiguration")) {
                this.dnsConfiguration(model.getDnsConfiguration());
            }
            if (model.wasPropertyExplicitlySet("databaseType")) {
                this.databaseType(model.getDatabaseType());
            }
            if (model.wasPropertyExplicitlySet("query")) {
                this.query(model.getQuery());
            }
            if (model.wasPropertyExplicitlySet("databaseAuthenticationDetails")) {
                this.databaseAuthenticationDetails(model.getDatabaseAuthenticationDetails());
            }
            if (model.wasPropertyExplicitlySet("databaseRole")) {
                this.databaseRole(model.getDatabaseRole());
            }
            if (model.wasPropertyExplicitlySet("databaseConnectionType")) {
                this.databaseConnectionType(model.getDatabaseConnectionType());
            }
            if (model.wasPropertyExplicitlySet("connectionString")) {
                this.connectionString(model.getConnectionString());
            }
            if (model.wasPropertyExplicitlySet("databaseWalletDetails")) {
                this.databaseWalletDetails(model.getDatabaseWalletDetails());
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

    @Deprecated
    public SqlMonitorConfiguration(
            Boolean isFailureRetried,
            DnsConfiguration dnsConfiguration,
            DatabaseType databaseType,
            String query,
            BasicAuthenticationDetails databaseAuthenticationDetails,
            String databaseRole,
            DatabaseConnectionType databaseConnectionType,
            String connectionString,
            DatabaseWalletDetails databaseWalletDetails) {
        super(isFailureRetried, dnsConfiguration);
        this.databaseType = databaseType;
        this.query = query;
        this.databaseAuthenticationDetails = databaseAuthenticationDetails;
        this.databaseRole = databaseRole;
        this.databaseConnectionType = databaseConnectionType;
        this.connectionString = connectionString;
        this.databaseWalletDetails = databaseWalletDetails;
    }

    /**
     * Database type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    private final DatabaseType databaseType;

    /**
     * Database type.
     * @return the value
     **/
    public DatabaseType getDatabaseType() {
        return databaseType;
    }

    /**
     * SQL query to be executed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

    /**
     * SQL query to be executed.
     * @return the value
     **/
    public String getQuery() {
        return query;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseAuthenticationDetails")
    private final BasicAuthenticationDetails databaseAuthenticationDetails;

    public BasicAuthenticationDetails getDatabaseAuthenticationDetails() {
        return databaseAuthenticationDetails;
    }

    /**
     * Database role.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseRole")
    private final String databaseRole;

    /**
     * Database role.
     * @return the value
     **/
    public String getDatabaseRole() {
        return databaseRole;
    }

    /**
     * Database connection type. Only CUSTOM_JDBC is supported for MYSQL database type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseConnectionType")
    private final DatabaseConnectionType databaseConnectionType;

    /**
     * Database connection type. Only CUSTOM_JDBC is supported for MYSQL database type.
     * @return the value
     **/
    public DatabaseConnectionType getDatabaseConnectionType() {
        return databaseConnectionType;
    }

    /**
     * Database connection string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
    private final String connectionString;

    /**
     * Database connection string.
     * @return the value
     **/
    public String getConnectionString() {
        return connectionString;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseWalletDetails")
    private final DatabaseWalletDetails databaseWalletDetails;

    public DatabaseWalletDetails getDatabaseWalletDetails() {
        return databaseWalletDetails;
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
        sb.append("SqlMonitorConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", databaseType=").append(String.valueOf(this.databaseType));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(", databaseAuthenticationDetails=")
                .append(String.valueOf(this.databaseAuthenticationDetails));
        sb.append(", databaseRole=").append(String.valueOf(this.databaseRole));
        sb.append(", databaseConnectionType=").append(String.valueOf(this.databaseConnectionType));
        sb.append(", connectionString=").append(String.valueOf(this.connectionString));
        sb.append(", databaseWalletDetails=").append(String.valueOf(this.databaseWalletDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlMonitorConfiguration)) {
            return false;
        }

        SqlMonitorConfiguration other = (SqlMonitorConfiguration) o;
        return java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.query, other.query)
                && java.util.Objects.equals(
                        this.databaseAuthenticationDetails, other.databaseAuthenticationDetails)
                && java.util.Objects.equals(this.databaseRole, other.databaseRole)
                && java.util.Objects.equals(
                        this.databaseConnectionType, other.databaseConnectionType)
                && java.util.Objects.equals(this.connectionString, other.connectionString)
                && java.util.Objects.equals(this.databaseWalletDetails, other.databaseWalletDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseAuthenticationDetails == null
                                ? 43
                                : this.databaseAuthenticationDetails.hashCode());
        result = (result * PRIME) + (this.databaseRole == null ? 43 : this.databaseRole.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseConnectionType == null
                                ? 43
                                : this.databaseConnectionType.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionString == null ? 43 : this.connectionString.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseWalletDetails == null
                                ? 43
                                : this.databaseWalletDetails.hashCode());
        return result;
    }
}

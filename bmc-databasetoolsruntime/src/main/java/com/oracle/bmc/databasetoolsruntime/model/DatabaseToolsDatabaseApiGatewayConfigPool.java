/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * The content of a Database Tools database API gateway config pool sub resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = DatabaseToolsDatabaseApiGatewayConfigPool.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DatabaseToolsDatabaseApiGatewayConfigPoolDefault.class,
            name = "DEFAULT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class DatabaseToolsDatabaseApiGatewayConfigPool
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "poolRouteValue",
        "databaseToolsConnectionId",
        "maxPoolSize",
        "minPoolSize",
        "initialPoolSize",
        "jwtProfileJwkUrl",
        "jwtProfileIssuer",
        "jwtProfileAudience",
        "jwtProfileRoleClaimName",
        "databaseActionsStatus",
        "restEnabledSqlStatus",
        "advancedProperties",
        "timeCreated",
        "timeUpdated"
    })
    protected DatabaseToolsDatabaseApiGatewayConfigPool(
            String key,
            String displayName,
            String poolRouteValue,
            String databaseToolsConnectionId,
            Integer maxPoolSize,
            Integer minPoolSize,
            Integer initialPoolSize,
            String jwtProfileJwkUrl,
            String jwtProfileIssuer,
            String jwtProfileAudience,
            String jwtProfileRoleClaimName,
            DatabaseActionsStatus databaseActionsStatus,
            RestEnabledSqlStatus restEnabledSqlStatus,
            java.util.Map<String, String> advancedProperties,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.poolRouteValue = poolRouteValue;
        this.databaseToolsConnectionId = databaseToolsConnectionId;
        this.maxPoolSize = maxPoolSize;
        this.minPoolSize = minPoolSize;
        this.initialPoolSize = initialPoolSize;
        this.jwtProfileJwkUrl = jwtProfileJwkUrl;
        this.jwtProfileIssuer = jwtProfileIssuer;
        this.jwtProfileAudience = jwtProfileAudience;
        this.jwtProfileRoleClaimName = jwtProfileRoleClaimName;
        this.databaseActionsStatus = databaseActionsStatus;
        this.restEnabledSqlStatus = restEnabledSqlStatus;
        this.advancedProperties = advancedProperties;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    /** A system generated string that uniquely identifies a pool sub resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * A system generated string that uniquely identifies a pool sub resource.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it\u2019s changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it\u2019s changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The pool route value provided in requests to target this pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("poolRouteValue")
    private final String poolRouteValue;

    /**
     * The pool route value provided in requests to target this pool.
     *
     * @return the value
     */
    public String getPoolRouteValue() {
        return poolRouteValue;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * related Database Tools connection. Specifies the OCI database tools connection ocid to build
     * the connection pool from.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseToolsConnectionId")
    private final String databaseToolsConnectionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * related Database Tools connection. Specifies the OCI database tools connection ocid to build
     * the connection pool from.
     *
     * @return the value
     */
    public String getDatabaseToolsConnectionId() {
        return databaseToolsConnectionId;
    }

    /** Specifies the maximum number of database connections allowed for the pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxPoolSize")
    private final Integer maxPoolSize;

    /**
     * Specifies the maximum number of database connections allowed for the pool.
     *
     * @return the value
     */
    public Integer getMaxPoolSize() {
        return maxPoolSize;
    }

    /** Specifies the minimum number of database connections allowed for the pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("minPoolSize")
    private final Integer minPoolSize;

    /**
     * Specifies the minimum number of database connections allowed for the pool.
     *
     * @return the value
     */
    public Integer getMinPoolSize() {
        return minPoolSize;
    }

    /**
     * Specifies the initial size for the number of database connections that will be created for
     * the pool.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialPoolSize")
    private final Integer initialPoolSize;

    /**
     * Specifies the initial size for the number of database connections that will be created for
     * the pool.
     *
     * @return the value
     */
    public Integer getInitialPoolSize() {
        return initialPoolSize;
    }

    /**
     * Specifies the URL of the JSON Web Key (JWK) that is used to verify the signature of the JWT
     * token.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jwtProfileJwkUrl")
    private final String jwtProfileJwkUrl;

    /**
     * Specifies the URL of the JSON Web Key (JWK) that is used to verify the signature of the JWT
     * token.
     *
     * @return the value
     */
    public String getJwtProfileJwkUrl() {
        return jwtProfileJwkUrl;
    }

    /**
     * Specifies the issuer of the JWT token. This value is used to validate the iss claim in the
     * JWT token.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jwtProfileIssuer")
    private final String jwtProfileIssuer;

    /**
     * Specifies the issuer of the JWT token. This value is used to validate the iss claim in the
     * JWT token.
     *
     * @return the value
     */
    public String getJwtProfileIssuer() {
        return jwtProfileIssuer;
    }

    /**
     * Specifies the expected audience for the JWT token. This value is used to validate the aud
     * claim in the JWT token.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jwtProfileAudience")
    private final String jwtProfileAudience;

    /**
     * Specifies the expected audience for the JWT token. This value is used to validate the aud
     * claim in the JWT token.
     *
     * @return the value
     */
    public String getJwtProfileAudience() {
        return jwtProfileAudience;
    }

    /**
     * Specifies the JSON pointer to the claim in the JWT token that contains the roles of the
     * users.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jwtProfileRoleClaimName")
    private final String jwtProfileRoleClaimName;

    /**
     * Specifies the JSON pointer to the claim in the JWT token that contains the roles of the
     * users.
     *
     * @return the value
     */
    public String getJwtProfileRoleClaimName() {
        return jwtProfileRoleClaimName;
    }

    /** Specifies to enable the Database Actions feature. */
    public enum DatabaseActionsStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DatabaseActionsStatus.class);

        private final String value;
        private static java.util.Map<String, DatabaseActionsStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseActionsStatus v : DatabaseActionsStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DatabaseActionsStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseActionsStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DatabaseActionsStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Specifies to enable the Database Actions feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseActionsStatus")
    private final DatabaseActionsStatus databaseActionsStatus;

    /**
     * Specifies to enable the Database Actions feature.
     *
     * @return the value
     */
    public DatabaseActionsStatus getDatabaseActionsStatus() {
        return databaseActionsStatus;
    }

    /** Specifies whether the REST-Enabled SQL service is active. */
    public enum RestEnabledSqlStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RestEnabledSqlStatus.class);

        private final String value;
        private static java.util.Map<String, RestEnabledSqlStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (RestEnabledSqlStatus v : RestEnabledSqlStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RestEnabledSqlStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RestEnabledSqlStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RestEnabledSqlStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Specifies whether the REST-Enabled SQL service is active. */
    @com.fasterxml.jackson.annotation.JsonProperty("restEnabledSqlStatus")
    private final RestEnabledSqlStatus restEnabledSqlStatus;

    /**
     * Specifies whether the REST-Enabled SQL service is active.
     *
     * @return the value
     */
    public RestEnabledSqlStatus getRestEnabledSqlStatus() {
        return restEnabledSqlStatus;
    }

    /** Advanced pool properties. */
    @com.fasterxml.jackson.annotation.JsonProperty("advancedProperties")
    private final java.util.Map<String, String> advancedProperties;

    /**
     * Advanced pool properties.
     *
     * @return the value
     */
    public java.util.Map<String, String> getAdvancedProperties() {
        return advancedProperties;
    }

    /** The time the resource was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the resource was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the resource was updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the resource was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatabaseToolsDatabaseApiGatewayConfigPool(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", poolRouteValue=").append(String.valueOf(this.poolRouteValue));
        sb.append(", databaseToolsConnectionId=")
                .append(String.valueOf(this.databaseToolsConnectionId));
        sb.append(", maxPoolSize=").append(String.valueOf(this.maxPoolSize));
        sb.append(", minPoolSize=").append(String.valueOf(this.minPoolSize));
        sb.append(", initialPoolSize=").append(String.valueOf(this.initialPoolSize));
        sb.append(", jwtProfileJwkUrl=").append(String.valueOf(this.jwtProfileJwkUrl));
        sb.append(", jwtProfileIssuer=").append(String.valueOf(this.jwtProfileIssuer));
        sb.append(", jwtProfileAudience=").append(String.valueOf(this.jwtProfileAudience));
        sb.append(", jwtProfileRoleClaimName=")
                .append(String.valueOf(this.jwtProfileRoleClaimName));
        sb.append(", databaseActionsStatus=").append(String.valueOf(this.databaseActionsStatus));
        sb.append(", restEnabledSqlStatus=").append(String.valueOf(this.restEnabledSqlStatus));
        sb.append(", advancedProperties=").append(String.valueOf(this.advancedProperties));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsDatabaseApiGatewayConfigPool)) {
            return false;
        }

        DatabaseToolsDatabaseApiGatewayConfigPool other =
                (DatabaseToolsDatabaseApiGatewayConfigPool) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.poolRouteValue, other.poolRouteValue)
                && java.util.Objects.equals(
                        this.databaseToolsConnectionId, other.databaseToolsConnectionId)
                && java.util.Objects.equals(this.maxPoolSize, other.maxPoolSize)
                && java.util.Objects.equals(this.minPoolSize, other.minPoolSize)
                && java.util.Objects.equals(this.initialPoolSize, other.initialPoolSize)
                && java.util.Objects.equals(this.jwtProfileJwkUrl, other.jwtProfileJwkUrl)
                && java.util.Objects.equals(this.jwtProfileIssuer, other.jwtProfileIssuer)
                && java.util.Objects.equals(this.jwtProfileAudience, other.jwtProfileAudience)
                && java.util.Objects.equals(
                        this.jwtProfileRoleClaimName, other.jwtProfileRoleClaimName)
                && java.util.Objects.equals(this.databaseActionsStatus, other.databaseActionsStatus)
                && java.util.Objects.equals(this.restEnabledSqlStatus, other.restEnabledSqlStatus)
                && java.util.Objects.equals(this.advancedProperties, other.advancedProperties)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.poolRouteValue == null ? 43 : this.poolRouteValue.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseToolsConnectionId == null
                                ? 43
                                : this.databaseToolsConnectionId.hashCode());
        result = (result * PRIME) + (this.maxPoolSize == null ? 43 : this.maxPoolSize.hashCode());
        result = (result * PRIME) + (this.minPoolSize == null ? 43 : this.minPoolSize.hashCode());
        result =
                (result * PRIME)
                        + (this.initialPoolSize == null ? 43 : this.initialPoolSize.hashCode());
        result =
                (result * PRIME)
                        + (this.jwtProfileJwkUrl == null ? 43 : this.jwtProfileJwkUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.jwtProfileIssuer == null ? 43 : this.jwtProfileIssuer.hashCode());
        result =
                (result * PRIME)
                        + (this.jwtProfileAudience == null
                                ? 43
                                : this.jwtProfileAudience.hashCode());
        result =
                (result * PRIME)
                        + (this.jwtProfileRoleClaimName == null
                                ? 43
                                : this.jwtProfileRoleClaimName.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseActionsStatus == null
                                ? 43
                                : this.databaseActionsStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.restEnabledSqlStatus == null
                                ? 43
                                : this.restEnabledSqlStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.advancedProperties == null
                                ? 43
                                : this.advancedProperties.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

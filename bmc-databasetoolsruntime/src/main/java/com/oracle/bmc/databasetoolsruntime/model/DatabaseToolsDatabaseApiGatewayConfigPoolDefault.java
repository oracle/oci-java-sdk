/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * The content of a Database Tools database API gateway config pool sub resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseToolsDatabaseApiGatewayConfigPoolDefault.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseToolsDatabaseApiGatewayConfigPoolDefault
        extends DatabaseToolsDatabaseApiGatewayConfigPool {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("poolRouteValue")
        private String poolRouteValue;

        public Builder poolRouteValue(String poolRouteValue) {
            this.poolRouteValue = poolRouteValue;
            this.__explicitlySet__.add("poolRouteValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseToolsConnectionId")
        private String databaseToolsConnectionId;

        public Builder databaseToolsConnectionId(String databaseToolsConnectionId) {
            this.databaseToolsConnectionId = databaseToolsConnectionId;
            this.__explicitlySet__.add("databaseToolsConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxPoolSize")
        private Integer maxPoolSize;

        public Builder maxPoolSize(Integer maxPoolSize) {
            this.maxPoolSize = maxPoolSize;
            this.__explicitlySet__.add("maxPoolSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("minPoolSize")
        private Integer minPoolSize;

        public Builder minPoolSize(Integer minPoolSize) {
            this.minPoolSize = minPoolSize;
            this.__explicitlySet__.add("minPoolSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialPoolSize")
        private Integer initialPoolSize;

        public Builder initialPoolSize(Integer initialPoolSize) {
            this.initialPoolSize = initialPoolSize;
            this.__explicitlySet__.add("initialPoolSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jwtProfileJwkUrl")
        private String jwtProfileJwkUrl;

        public Builder jwtProfileJwkUrl(String jwtProfileJwkUrl) {
            this.jwtProfileJwkUrl = jwtProfileJwkUrl;
            this.__explicitlySet__.add("jwtProfileJwkUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jwtProfileIssuer")
        private String jwtProfileIssuer;

        public Builder jwtProfileIssuer(String jwtProfileIssuer) {
            this.jwtProfileIssuer = jwtProfileIssuer;
            this.__explicitlySet__.add("jwtProfileIssuer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jwtProfileAudience")
        private String jwtProfileAudience;

        public Builder jwtProfileAudience(String jwtProfileAudience) {
            this.jwtProfileAudience = jwtProfileAudience;
            this.__explicitlySet__.add("jwtProfileAudience");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jwtProfileRoleClaimName")
        private String jwtProfileRoleClaimName;

        public Builder jwtProfileRoleClaimName(String jwtProfileRoleClaimName) {
            this.jwtProfileRoleClaimName = jwtProfileRoleClaimName;
            this.__explicitlySet__.add("jwtProfileRoleClaimName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseActionsStatus")
        private DatabaseActionsStatus databaseActionsStatus;

        public Builder databaseActionsStatus(DatabaseActionsStatus databaseActionsStatus) {
            this.databaseActionsStatus = databaseActionsStatus;
            this.__explicitlySet__.add("databaseActionsStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("restEnabledSqlStatus")
        private RestEnabledSqlStatus restEnabledSqlStatus;

        public Builder restEnabledSqlStatus(RestEnabledSqlStatus restEnabledSqlStatus) {
            this.restEnabledSqlStatus = restEnabledSqlStatus;
            this.__explicitlySet__.add("restEnabledSqlStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("advancedProperties")
        private java.util.Map<String, String> advancedProperties;

        public Builder advancedProperties(java.util.Map<String, String> advancedProperties) {
            this.advancedProperties = advancedProperties;
            this.__explicitlySet__.add("advancedProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseToolsDatabaseApiGatewayConfigPoolDefault build() {
            DatabaseToolsDatabaseApiGatewayConfigPoolDefault model =
                    new DatabaseToolsDatabaseApiGatewayConfigPoolDefault(
                            this.key,
                            this.displayName,
                            this.poolRouteValue,
                            this.databaseToolsConnectionId,
                            this.maxPoolSize,
                            this.minPoolSize,
                            this.initialPoolSize,
                            this.jwtProfileJwkUrl,
                            this.jwtProfileIssuer,
                            this.jwtProfileAudience,
                            this.jwtProfileRoleClaimName,
                            this.databaseActionsStatus,
                            this.restEnabledSqlStatus,
                            this.advancedProperties,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsDatabaseApiGatewayConfigPoolDefault model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("poolRouteValue")) {
                this.poolRouteValue(model.getPoolRouteValue());
            }
            if (model.wasPropertyExplicitlySet("databaseToolsConnectionId")) {
                this.databaseToolsConnectionId(model.getDatabaseToolsConnectionId());
            }
            if (model.wasPropertyExplicitlySet("maxPoolSize")) {
                this.maxPoolSize(model.getMaxPoolSize());
            }
            if (model.wasPropertyExplicitlySet("minPoolSize")) {
                this.minPoolSize(model.getMinPoolSize());
            }
            if (model.wasPropertyExplicitlySet("initialPoolSize")) {
                this.initialPoolSize(model.getInitialPoolSize());
            }
            if (model.wasPropertyExplicitlySet("jwtProfileJwkUrl")) {
                this.jwtProfileJwkUrl(model.getJwtProfileJwkUrl());
            }
            if (model.wasPropertyExplicitlySet("jwtProfileIssuer")) {
                this.jwtProfileIssuer(model.getJwtProfileIssuer());
            }
            if (model.wasPropertyExplicitlySet("jwtProfileAudience")) {
                this.jwtProfileAudience(model.getJwtProfileAudience());
            }
            if (model.wasPropertyExplicitlySet("jwtProfileRoleClaimName")) {
                this.jwtProfileRoleClaimName(model.getJwtProfileRoleClaimName());
            }
            if (model.wasPropertyExplicitlySet("databaseActionsStatus")) {
                this.databaseActionsStatus(model.getDatabaseActionsStatus());
            }
            if (model.wasPropertyExplicitlySet("restEnabledSqlStatus")) {
                this.restEnabledSqlStatus(model.getRestEnabledSqlStatus());
            }
            if (model.wasPropertyExplicitlySet("advancedProperties")) {
                this.advancedProperties(model.getAdvancedProperties());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
    public DatabaseToolsDatabaseApiGatewayConfigPoolDefault(
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
        super(
                key,
                displayName,
                poolRouteValue,
                databaseToolsConnectionId,
                maxPoolSize,
                minPoolSize,
                initialPoolSize,
                jwtProfileJwkUrl,
                jwtProfileIssuer,
                jwtProfileAudience,
                jwtProfileRoleClaimName,
                databaseActionsStatus,
                restEnabledSqlStatus,
                advancedProperties,
                timeCreated,
                timeUpdated);
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
        sb.append("DatabaseToolsDatabaseApiGatewayConfigPoolDefault(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsDatabaseApiGatewayConfigPoolDefault)) {
            return false;
        }

        DatabaseToolsDatabaseApiGatewayConfigPoolDefault other =
                (DatabaseToolsDatabaseApiGatewayConfigPoolDefault) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }
}

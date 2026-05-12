/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * The content of a Database Tools database API gateway config pool sub resource to be created. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDatabaseToolsDatabaseApiGatewayConfigPoolDefaultDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDatabaseToolsDatabaseApiGatewayConfigPoolDefaultDetails
        extends CreateDatabaseToolsDatabaseApiGatewayConfigPoolDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDatabaseToolsDatabaseApiGatewayConfigPoolDefaultDetails build() {
            CreateDatabaseToolsDatabaseApiGatewayConfigPoolDefaultDetails model =
                    new CreateDatabaseToolsDatabaseApiGatewayConfigPoolDefaultDetails(
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
                            this.advancedProperties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDatabaseToolsDatabaseApiGatewayConfigPoolDefaultDetails model) {
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
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public CreateDatabaseToolsDatabaseApiGatewayConfigPoolDefaultDetails(
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
            java.util.Map<String, String> advancedProperties) {
        super(
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
                advancedProperties);
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
        sb.append("CreateDatabaseToolsDatabaseApiGatewayConfigPoolDefaultDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDatabaseToolsDatabaseApiGatewayConfigPoolDefaultDetails)) {
            return false;
        }

        CreateDatabaseToolsDatabaseApiGatewayConfigPoolDefaultDetails other =
                (CreateDatabaseToolsDatabaseApiGatewayConfigPoolDefaultDetails) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }
}

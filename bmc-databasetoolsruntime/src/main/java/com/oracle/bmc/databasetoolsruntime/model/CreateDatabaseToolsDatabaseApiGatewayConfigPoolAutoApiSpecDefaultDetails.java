/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * The content of a Database Tools database API gateway config auto API spec sub resource to be
 * created. <br>
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
        builder =
                CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDefaultDetails.Builder
                        .class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDefaultDetails
        extends CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseObjectName")
        private String databaseObjectName;

        public Builder databaseObjectName(String databaseObjectName) {
            this.databaseObjectName = databaseObjectName;
            this.__explicitlySet__.add("databaseObjectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseObjectType")
        private DatabaseObjectType databaseObjectType;

        public Builder databaseObjectType(DatabaseObjectType databaseObjectType) {
            this.databaseObjectType = databaseObjectType;
            this.__explicitlySet__.add("databaseObjectType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("alias")
        private String alias;

        public Builder alias(String alias) {
            this.alias = alias;
            this.__explicitlySet__.add("alias");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operations")
        private java.util.List<Operations> operations;

        public Builder operations(java.util.List<Operations> operations) {
            this.operations = operations;
            this.__explicitlySet__.add("operations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securitySchemes")
        private java.util.List<SecuritySchemes> securitySchemes;

        public Builder securitySchemes(java.util.List<SecuritySchemes> securitySchemes) {
            this.securitySchemes = securitySchemes;
            this.__explicitlySet__.add("securitySchemes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private String scope;

        public Builder scope(String scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("roles")
        private java.util.List<String> roles;

        public Builder roles(java.util.List<String> roles) {
            this.roles = roles;
            this.__explicitlySet__.add("roles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDefaultDetails build() {
            CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDefaultDetails model =
                    new CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDefaultDetails(
                            this.displayName,
                            this.databaseObjectName,
                            this.databaseObjectType,
                            this.description,
                            this.alias,
                            this.operations,
                            this.securitySchemes,
                            this.scope,
                            this.roles);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(
                CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDefaultDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("databaseObjectName")) {
                this.databaseObjectName(model.getDatabaseObjectName());
            }
            if (model.wasPropertyExplicitlySet("databaseObjectType")) {
                this.databaseObjectType(model.getDatabaseObjectType());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("alias")) {
                this.alias(model.getAlias());
            }
            if (model.wasPropertyExplicitlySet("operations")) {
                this.operations(model.getOperations());
            }
            if (model.wasPropertyExplicitlySet("securitySchemes")) {
                this.securitySchemes(model.getSecuritySchemes());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("roles")) {
                this.roles(model.getRoles());
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
    public CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDefaultDetails(
            String displayName,
            String databaseObjectName,
            DatabaseObjectType databaseObjectType,
            String description,
            String alias,
            java.util.List<Operations> operations,
            java.util.List<SecuritySchemes> securitySchemes,
            String scope,
            java.util.List<String> roles) {
        super(
                displayName,
                databaseObjectName,
                databaseObjectType,
                description,
                alias,
                operations,
                securitySchemes,
                scope,
                roles);
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
        sb.append("CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDefaultDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o
                instanceof
                CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDefaultDetails)) {
            return false;
        }

        CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDefaultDetails other =
                (CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDefaultDetails) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }
}

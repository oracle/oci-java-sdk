/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * The content of a Database Tools database API gateway config auto API spec sub resource to be
 * updated. <br>
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
        defaultImpl = UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDefaultDetails.class,
            name = "DEFAULT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "databaseObjectName",
        "databaseObjectType",
        "description",
        "alias",
        "operations",
        "securitySchemes",
        "scope",
        "roles"
    })
    protected UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails(
            String displayName,
            String databaseObjectName,
            DatabaseObjectType databaseObjectType,
            String description,
            String alias,
            java.util.List<Operations> operations,
            java.util.List<SecuritySchemes> securitySchemes,
            String scope,
            java.util.List<String> roles) {
        super();
        this.displayName = displayName;
        this.databaseObjectName = databaseObjectName;
        this.databaseObjectType = databaseObjectType;
        this.description = description;
        this.alias = alias;
        this.operations = operations;
        this.securitySchemes = securitySchemes;
        this.scope = scope;
        this.roles = roles;
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

    /** The name of the database object. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseObjectName")
    private final String databaseObjectName;

    /**
     * The name of the database object.
     *
     * @return the value
     */
    public String getDatabaseObjectName() {
        return databaseObjectName;
    }

    /** The type of the database object. */
    public enum DatabaseObjectType implements com.oracle.bmc.http.internal.BmcEnum {
        Function("FUNCTION"),
        Mview("MVIEW"),
        Package("PACKAGE"),
        Procedure("PROCEDURE"),
        Table("TABLE"),
        View("VIEW"),
        Dualityview("DUALITYVIEW"),
        ;

        private final String value;
        private static java.util.Map<String, DatabaseObjectType> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseObjectType v : DatabaseObjectType.values()) {
                map.put(v.getValue(), v);
            }
        }

        DatabaseObjectType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseObjectType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DatabaseObjectType: " + key);
        }
    };
    /** The type of the database object. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseObjectType")
    private final DatabaseObjectType databaseObjectType;

    /**
     * The type of the database object.
     *
     * @return the value
     */
    public DatabaseObjectType getDatabaseObjectType() {
        return databaseObjectType;
    }

    /** Description of the autoApiSpec. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the autoApiSpec.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Used as the URI path element for this object. When not specified the objectName lowercase is
     * the default value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    private final String alias;

    /**
     * Used as the URI path element for this object. When not specified the objectName lowercase is
     * the default value.
     *
     * @return the value
     */
    public String getAlias() {
        return alias;
    }

    /** */
    public enum Operations implements com.oracle.bmc.http.internal.BmcEnum {
        Read("READ"),
        Write("WRITE"),
        ;

        private final String value;
        private static java.util.Map<String, Operations> map;

        static {
            map = new java.util.HashMap<>();
            for (Operations v : Operations.values()) {
                map.put(v.getValue(), v);
            }
        }

        Operations(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Operations create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Operations: " + key);
        }
    };
    /**
     * The operations to limit access to this resource. If not specified then the default is
     * ["READ","WRITE"].
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operations")
    private final java.util.List<Operations> operations;

    /**
     * The operations to limit access to this resource. If not specified then the default is
     * ["READ","WRITE"].
     *
     * @return the value
     */
    public java.util.List<Operations> getOperations() {
        return operations;
    }

    /** */
    public enum SecuritySchemes implements com.oracle.bmc.http.internal.BmcEnum {
        Basic("BASIC"),
        Bearer("BEARER"),
        ;

        private final String value;
        private static java.util.Map<String, SecuritySchemes> map;

        static {
            map = new java.util.HashMap<>();
            for (SecuritySchemes v : SecuritySchemes.values()) {
                map.put(v.getValue(), v);
            }
        }

        SecuritySchemes(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SecuritySchemes create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SecuritySchemes: " + key);
        }
    };
    /**
     * The security schemes that can access this resource. If not specified then the resource is
     * public.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securitySchemes")
    private final java.util.List<SecuritySchemes> securitySchemes;

    /**
     * The security schemes that can access this resource. If not specified then the resource is
     * public.
     *
     * @return the value
     */
    public java.util.List<SecuritySchemes> getSecuritySchemes() {
        return securitySchemes;
    }

    /**
     * The name of the database API gateway config privilege protecting the resource. Only valid for
     * SCOPE JWT Profile pools and BEARER securitySchemes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final String scope;

    /**
     * The name of the database API gateway config privilege protecting the resource. Only valid for
     * SCOPE JWT Profile pools and BEARER securitySchemes.
     *
     * @return the value
     */
    public String getScope() {
        return scope;
    }

    /**
     * The name of the database API gateway config roles protecting the resource. Only valid for
     * RBAC JWT Profile pools and BEARER securitySchemes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("roles")
    private final java.util.List<String> roles;

    /**
     * The name of the database API gateway config roles protecting the resource. Only valid for
     * RBAC JWT Profile pools and BEARER securitySchemes.
     *
     * @return the value
     */
    public java.util.List<String> getRoles() {
        return roles;
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
        sb.append("UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", databaseObjectName=").append(String.valueOf(this.databaseObjectName));
        sb.append(", databaseObjectType=").append(String.valueOf(this.databaseObjectType));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", alias=").append(String.valueOf(this.alias));
        sb.append(", operations=").append(String.valueOf(this.operations));
        sb.append(", securitySchemes=").append(String.valueOf(this.securitySchemes));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", roles=").append(String.valueOf(this.roles));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails)) {
            return false;
        }

        UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails other =
                (UpdateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.databaseObjectName, other.databaseObjectName)
                && java.util.Objects.equals(this.databaseObjectType, other.databaseObjectType)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.alias, other.alias)
                && java.util.Objects.equals(this.operations, other.operations)
                && java.util.Objects.equals(this.securitySchemes, other.securitySchemes)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.roles, other.roles)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseObjectName == null
                                ? 43
                                : this.databaseObjectName.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseObjectType == null
                                ? 43
                                : this.databaseObjectType.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.alias == null ? 43 : this.alias.hashCode());
        result = (result * PRIME) + (this.operations == null ? 43 : this.operations.hashCode());
        result =
                (result * PRIME)
                        + (this.securitySchemes == null ? 43 : this.securitySchemes.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.roles == null ? 43 : this.roles.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

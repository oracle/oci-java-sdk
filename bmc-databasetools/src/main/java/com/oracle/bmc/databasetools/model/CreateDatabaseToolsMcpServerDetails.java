/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Details for the new Database Tools MCP server.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = CreateDatabaseToolsMcpServerDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateDatabaseToolsMcpServerDefaultDetails.class,
        name = "DEFAULT"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateDatabaseToolsMcpServerDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "customRoles",
        "displayName",
        "description",
        "databaseToolsConnectionId",
        "accessTokenExpiryInSeconds",
        "refreshTokenExpiryInSeconds",
        "definedTags",
        "freeformTags",
        "runtimeIdentity",
        "locks"
    })
    protected CreateDatabaseToolsMcpServerDetails(
            String compartmentId,
            java.util.List<DatabaseToolsMcpServerCustomRole> customRoles,
            String displayName,
            String description,
            String databaseToolsConnectionId,
            Integer accessTokenExpiryInSeconds,
            Integer refreshTokenExpiryInSeconds,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            DatabaseToolsMcpServerRuntimeIdentity runtimeIdentity,
            java.util.List<ResourceLock> locks) {
        super();
        this.compartmentId = compartmentId;
        this.customRoles = customRoles;
        this.displayName = displayName;
        this.description = description;
        this.databaseToolsConnectionId = databaseToolsConnectionId;
        this.accessTokenExpiryInSeconds = accessTokenExpiryInSeconds;
        this.refreshTokenExpiryInSeconds = refreshTokenExpiryInSeconds;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.runtimeIdentity = runtimeIdentity;
        this.locks = locks;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the Database Tools MCP server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the Database Tools MCP server.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Custom Roles associated with the MCP Server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customRoles")
    private final java.util.List<DatabaseToolsMcpServerCustomRole> customRoles;

    /**
     * Custom Roles associated with the MCP Server.
     * @return the value
     **/
    public java.util.List<DatabaseToolsMcpServerCustomRole> getCustomRoles() {
        return customRoles;
    }

    /**
     * A meaningful, human-readable label displayed to end users. Not required to be unique and can be changed after creation. Do not include confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A meaningful, human-readable label displayed to end users. Not required to be unique and can be changed after creation. Do not include confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A human-readable description of the Database Tools MCP server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A human-readable description of the Database Tools MCP server.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the related Database Tools connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseToolsConnectionId")
    private final String databaseToolsConnectionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the related Database Tools connection.
     * @return the value
     **/
    public String getDatabaseToolsConnectionId() {
        return databaseToolsConnectionId;
    }

    /**
     * Access token expiry in seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("accessTokenExpiryInSeconds")
    private final Integer accessTokenExpiryInSeconds;

    /**
     * Access token expiry in seconds
     * @return the value
     **/
    public Integer getAccessTokenExpiryInSeconds() {
        return accessTokenExpiryInSeconds;
    }

    /**
     * Refresh token expiry in seconds
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("refreshTokenExpiryInSeconds")
    private final Integer refreshTokenExpiryInSeconds;

    /**
     * Refresh token expiry in seconds
     * @return the value
     **/
    public Integer getRefreshTokenExpiryInSeconds() {
        return refreshTokenExpiryInSeconds;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Specifies the identity used when accessing OCI resources at runtime. AUTHENTICATED_PRINCIPAL to use the caller\u2019s identity (On-Behalf-Of token), or RESOURCE_PRINCIPAL to use the MCP Server\u2019s resource principal (RPST).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("runtimeIdentity")
    private final DatabaseToolsMcpServerRuntimeIdentity runtimeIdentity;

    /**
     * Specifies the identity used when accessing OCI resources at runtime. AUTHENTICATED_PRINCIPAL to use the caller\u2019s identity (On-Behalf-Of token), or RESOURCE_PRINCIPAL to use the MCP Server\u2019s resource principal (RPST).
     *
     * @return the value
     **/
    public DatabaseToolsMcpServerRuntimeIdentity getRuntimeIdentity() {
        return runtimeIdentity;
    }

    /**
     * Locks associated with this resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     * @return the value
     **/
    public java.util.List<ResourceLock> getLocks() {
        return locks;
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
        sb.append("CreateDatabaseToolsMcpServerDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", customRoles=").append(String.valueOf(this.customRoles));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", databaseToolsConnectionId=")
                .append(String.valueOf(this.databaseToolsConnectionId));
        sb.append(", accessTokenExpiryInSeconds=")
                .append(String.valueOf(this.accessTokenExpiryInSeconds));
        sb.append(", refreshTokenExpiryInSeconds=")
                .append(String.valueOf(this.refreshTokenExpiryInSeconds));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", runtimeIdentity=").append(String.valueOf(this.runtimeIdentity));
        sb.append(", locks=").append(String.valueOf(this.locks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDatabaseToolsMcpServerDetails)) {
            return false;
        }

        CreateDatabaseToolsMcpServerDetails other = (CreateDatabaseToolsMcpServerDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.customRoles, other.customRoles)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.databaseToolsConnectionId, other.databaseToolsConnectionId)
                && java.util.Objects.equals(
                        this.accessTokenExpiryInSeconds, other.accessTokenExpiryInSeconds)
                && java.util.Objects.equals(
                        this.refreshTokenExpiryInSeconds, other.refreshTokenExpiryInSeconds)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.runtimeIdentity, other.runtimeIdentity)
                && java.util.Objects.equals(this.locks, other.locks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.customRoles == null ? 43 : this.customRoles.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseToolsConnectionId == null
                                ? 43
                                : this.databaseToolsConnectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.accessTokenExpiryInSeconds == null
                                ? 43
                                : this.accessTokenExpiryInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.refreshTokenExpiryInSeconds == null
                                ? 43
                                : this.refreshTokenExpiryInSeconds.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.runtimeIdentity == null ? 43 : this.runtimeIdentity.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

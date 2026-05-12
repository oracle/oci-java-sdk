/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Summary of the Database Tools MCP server. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = DatabaseToolsMcpServerSummary.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DatabaseToolsMcpServerSummaryDefault.class,
            name = "DEFAULT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class DatabaseToolsMcpServerSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "databaseToolsConnectionId",
        "endpoints",
        "builtInRoles",
        "customRoles",
        "relatedResource",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "definedTags",
        "freeformTags",
        "systemTags",
        "runtimeIdentity",
        "locks"
    })
    protected DatabaseToolsMcpServerSummary(
            String id,
            String compartmentId,
            String displayName,
            String databaseToolsConnectionId,
            java.util.List<DatabaseToolsMcpServerEndpoint> endpoints,
            java.util.List<DatabaseToolsMcpServerBuiltInRole> builtInRoles,
            java.util.List<DatabaseToolsMcpServerCustomRole> customRoles,
            DatabaseToolsMcpServerRelatedResource relatedResource,
            DatabaseToolsMcpServerLifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            DatabaseToolsMcpServerRuntimeIdentity runtimeIdentity,
            java.util.List<ResourceLock> locks) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.databaseToolsConnectionId = databaseToolsConnectionId;
        this.endpoints = endpoints;
        this.builtInRoles = builtInRoles;
        this.customRoles = customRoles;
        this.relatedResource = relatedResource;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.systemTags = systemTags;
        this.runtimeIdentity = runtimeIdentity;
        this.locks = locks;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Database Tools MCP server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Database Tools MCP server.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the Database Tools MCP server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the Database Tools MCP server.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A meaningful, human-readable label displayed to end users. Not required to be unique and can
     * be changed after creation. Do not include confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A meaningful, human-readable label displayed to end users. Not required to be unique and can
     * be changed after creation. Do not include confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * related Database Tools connection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseToolsConnectionId")
    private final String databaseToolsConnectionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * related Database Tools connection.
     *
     * @return the value
     */
    public String getDatabaseToolsConnectionId() {
        return databaseToolsConnectionId;
    }

    /** Invoke endpoint of MCP server. */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
    private final java.util.List<DatabaseToolsMcpServerEndpoint> endpoints;

    /**
     * Invoke endpoint of MCP server.
     *
     * @return the value
     */
    public java.util.List<DatabaseToolsMcpServerEndpoint> getEndpoints() {
        return endpoints;
    }

    /** Built-in roles associated with the MCP Server. */
    @com.fasterxml.jackson.annotation.JsonProperty("builtInRoles")
    private final java.util.List<DatabaseToolsMcpServerBuiltInRole> builtInRoles;

    /**
     * Built-in roles associated with the MCP Server.
     *
     * @return the value
     */
    public java.util.List<DatabaseToolsMcpServerBuiltInRole> getBuiltInRoles() {
        return builtInRoles;
    }

    /** Custom roles associated with the MCP Server. */
    @com.fasterxml.jackson.annotation.JsonProperty("customRoles")
    private final java.util.List<DatabaseToolsMcpServerCustomRole> customRoles;

    /**
     * Custom roles associated with the MCP Server.
     *
     * @return the value
     */
    public java.util.List<DatabaseToolsMcpServerCustomRole> getCustomRoles() {
        return customRoles;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("relatedResource")
    private final DatabaseToolsMcpServerRelatedResource relatedResource;

    public DatabaseToolsMcpServerRelatedResource getRelatedResource() {
        return relatedResource;
    }

    /** The current state of the Database Tools MCP server. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final DatabaseToolsMcpServerLifecycleState lifecycleState;

    /**
     * The current state of the Database Tools MCP server.
     *
     * @return the value
     */
    public DatabaseToolsMcpServerLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, this message can be used
     * to provide actionable information for a resource in the Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, this message can be used
     * to provide actionable information for a resource in the Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The time the Database Tools MCP server was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the Database Tools MCP server was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the Database Tools MCP server was updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Database Tools MCP server was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * Specifies the identity used when accessing OCI resources at runtime. AUTHENTICATED_PRINCIPAL
     * to use the caller\u2019s identity (On-Behalf-Of token), or RESOURCE_PRINCIPAL to use the MCP
     * Server\u2019s resource principal (RPST).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("runtimeIdentity")
    private final DatabaseToolsMcpServerRuntimeIdentity runtimeIdentity;

    /**
     * Specifies the identity used when accessing OCI resources at runtime. AUTHENTICATED_PRINCIPAL
     * to use the caller\u2019s identity (On-Behalf-Of token), or RESOURCE_PRINCIPAL to use the MCP
     * Server\u2019s resource principal (RPST).
     *
     * @return the value
     */
    public DatabaseToolsMcpServerRuntimeIdentity getRuntimeIdentity() {
        return runtimeIdentity;
    }

    /** Locks associated with this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     *
     * @return the value
     */
    public java.util.List<ResourceLock> getLocks() {
        return locks;
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
        sb.append("DatabaseToolsMcpServerSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", databaseToolsConnectionId=")
                .append(String.valueOf(this.databaseToolsConnectionId));
        sb.append(", endpoints=").append(String.valueOf(this.endpoints));
        sb.append(", builtInRoles=").append(String.valueOf(this.builtInRoles));
        sb.append(", customRoles=").append(String.valueOf(this.customRoles));
        sb.append(", relatedResource=").append(String.valueOf(this.relatedResource));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
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
        if (!(o instanceof DatabaseToolsMcpServerSummary)) {
            return false;
        }

        DatabaseToolsMcpServerSummary other = (DatabaseToolsMcpServerSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.databaseToolsConnectionId, other.databaseToolsConnectionId)
                && java.util.Objects.equals(this.endpoints, other.endpoints)
                && java.util.Objects.equals(this.builtInRoles, other.builtInRoles)
                && java.util.Objects.equals(this.customRoles, other.customRoles)
                && java.util.Objects.equals(this.relatedResource, other.relatedResource)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.runtimeIdentity, other.runtimeIdentity)
                && java.util.Objects.equals(this.locks, other.locks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseToolsConnectionId == null
                                ? 43
                                : this.databaseToolsConnectionId.hashCode());
        result = (result * PRIME) + (this.endpoints == null ? 43 : this.endpoints.hashCode());
        result = (result * PRIME) + (this.builtInRoles == null ? 43 : this.builtInRoles.hashCode());
        result = (result * PRIME) + (this.customRoles == null ? 43 : this.customRoles.hashCode());
        result =
                (result * PRIME)
                        + (this.relatedResource == null ? 43 : this.relatedResource.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.runtimeIdentity == null ? 43 : this.runtimeIdentity.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

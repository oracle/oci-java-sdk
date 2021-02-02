/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for creating a resource used to connect to an external Oracle Database using
 * the [Management Agent cloud service (MACS)](https://docs.cloud.oracle.com/iaas/management-agents/index.html).
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateExternalMacsConnectorDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectorType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateExternalMacsConnectorDetails extends CreateExternalDatabaseConnectorDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalDatabaseId")
        private String externalDatabaseId;

        public Builder externalDatabaseId(String externalDatabaseId) {
            this.externalDatabaseId = externalDatabaseId;
            this.__explicitlySet__.add("externalDatabaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
        private DatabaseConnectionString connectionString;

        public Builder connectionString(DatabaseConnectionString connectionString) {
            this.connectionString = connectionString;
            this.__explicitlySet__.add("connectionString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionCredentials")
        private DatabaseConnectionCredentials connectionCredentials;

        public Builder connectionCredentials(DatabaseConnectionCredentials connectionCredentials) {
            this.connectionCredentials = connectionCredentials;
            this.__explicitlySet__.add("connectionCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectorAgentId")
        private String connectorAgentId;

        public Builder connectorAgentId(String connectorAgentId) {
            this.connectorAgentId = connectorAgentId;
            this.__explicitlySet__.add("connectorAgentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateExternalMacsConnectorDetails build() {
            CreateExternalMacsConnectorDetails __instance__ =
                    new CreateExternalMacsConnectorDetails(
                            freeformTags,
                            definedTags,
                            displayName,
                            externalDatabaseId,
                            connectionString,
                            connectionCredentials,
                            connectorAgentId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExternalMacsConnectorDetails o) {
            Builder copiedBuilder =
                    freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .externalDatabaseId(o.getExternalDatabaseId())
                            .connectionString(o.getConnectionString())
                            .connectionCredentials(o.getConnectionCredentials())
                            .connectorAgentId(o.getConnectorAgentId());

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

    @Deprecated
    public CreateExternalMacsConnectorDetails(
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            String externalDatabaseId,
            DatabaseConnectionString connectionString,
            DatabaseConnectionCredentials connectionCredentials,
            String connectorAgentId) {
        super(freeformTags, definedTags, displayName, externalDatabaseId);
        this.connectionString = connectionString;
        this.connectionCredentials = connectionCredentials;
        this.connectorAgentId = connectorAgentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionString")
    DatabaseConnectionString connectionString;

    @com.fasterxml.jackson.annotation.JsonProperty("connectionCredentials")
    DatabaseConnectionCredentials connectionCredentials;

    /**
     * The ID of the agent used for the
     * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest) createExternalDatabaseConnectorDetails}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectorAgentId")
    String connectorAgentId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

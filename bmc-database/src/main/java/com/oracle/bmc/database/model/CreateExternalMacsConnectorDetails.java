/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for creating a resource used to connect to an external Oracle Database using
 * the [Management Agent cloud service (MACS)](https://docs.oracle.com/iaas/management-agents/index.html).
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
    builder = CreateExternalMacsConnectorDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "connectorType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateExternalMacsConnectorDetails
        extends CreateExternalDatabaseConnectorDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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
        /**
         * The ID of the agent used for the
         * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest) createExternalDatabaseConnectorDetails}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectorAgentId")
        private String connectorAgentId;

        /**
         * The ID of the agent used for the
         * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest) createExternalDatabaseConnectorDetails}.
         *
         * @param connectorAgentId the value to set
         * @return this builder
         **/
        public Builder connectorAgentId(String connectorAgentId) {
            this.connectorAgentId = connectorAgentId;
            this.__explicitlySet__.add("connectorAgentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateExternalMacsConnectorDetails build() {
            CreateExternalMacsConnectorDetails model =
                    new CreateExternalMacsConnectorDetails(
                            this.freeformTags,
                            this.definedTags,
                            this.displayName,
                            this.externalDatabaseId,
                            this.connectionString,
                            this.connectionCredentials,
                            this.connectorAgentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExternalMacsConnectorDetails model) {
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("externalDatabaseId")) {
                this.externalDatabaseId(model.getExternalDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("connectionString")) {
                this.connectionString(model.getConnectionString());
            }
            if (model.wasPropertyExplicitlySet("connectionCredentials")) {
                this.connectionCredentials(model.getConnectionCredentials());
            }
            if (model.wasPropertyExplicitlySet("connectorAgentId")) {
                this.connectorAgentId(model.getConnectorAgentId());
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
    private final DatabaseConnectionString connectionString;

    public DatabaseConnectionString getConnectionString() {
        return connectionString;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionCredentials")
    private final DatabaseConnectionCredentials connectionCredentials;

    public DatabaseConnectionCredentials getConnectionCredentials() {
        return connectionCredentials;
    }

    /**
     * The ID of the agent used for the
     * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest) createExternalDatabaseConnectorDetails}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectorAgentId")
    private final String connectorAgentId;

    /**
     * The ID of the agent used for the
     * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest) createExternalDatabaseConnectorDetails}.
     *
     * @return the value
     **/
    public String getConnectorAgentId() {
        return connectorAgentId;
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
        sb.append("CreateExternalMacsConnectorDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", connectionString=").append(String.valueOf(this.connectionString));
        sb.append(", connectionCredentials=").append(String.valueOf(this.connectionCredentials));
        sb.append(", connectorAgentId=").append(String.valueOf(this.connectorAgentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateExternalMacsConnectorDetails)) {
            return false;
        }

        CreateExternalMacsConnectorDetails other = (CreateExternalMacsConnectorDetails) o;
        return java.util.Objects.equals(this.connectionString, other.connectionString)
                && java.util.Objects.equals(this.connectionCredentials, other.connectionCredentials)
                && java.util.Objects.equals(this.connectorAgentId, other.connectorAgentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.connectionString == null ? 43 : this.connectionString.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionCredentials == null
                                ? 43
                                : this.connectionCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.connectorAgentId == null ? 43 : this.connectorAgentId.hashCode());
        return result;
    }
}

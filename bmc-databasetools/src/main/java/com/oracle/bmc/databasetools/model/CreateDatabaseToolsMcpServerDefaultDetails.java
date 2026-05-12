/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Details for the new Database Tools MCP server. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDatabaseToolsMcpServerDefaultDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDatabaseToolsMcpServerDefaultDetails
        extends CreateDatabaseToolsMcpServerDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customRoles")
        private java.util.List<DatabaseToolsMcpServerCustomRole> customRoles;

        public Builder customRoles(java.util.List<DatabaseToolsMcpServerCustomRole> customRoles) {
            this.customRoles = customRoles;
            this.__explicitlySet__.add("customRoles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseToolsConnectionId")
        private String databaseToolsConnectionId;

        public Builder databaseToolsConnectionId(String databaseToolsConnectionId) {
            this.databaseToolsConnectionId = databaseToolsConnectionId;
            this.__explicitlySet__.add("databaseToolsConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("accessTokenExpiryInSeconds")
        private Integer accessTokenExpiryInSeconds;

        public Builder accessTokenExpiryInSeconds(Integer accessTokenExpiryInSeconds) {
            this.accessTokenExpiryInSeconds = accessTokenExpiryInSeconds;
            this.__explicitlySet__.add("accessTokenExpiryInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("refreshTokenExpiryInSeconds")
        private Integer refreshTokenExpiryInSeconds;

        public Builder refreshTokenExpiryInSeconds(Integer refreshTokenExpiryInSeconds) {
            this.refreshTokenExpiryInSeconds = refreshTokenExpiryInSeconds;
            this.__explicitlySet__.add("refreshTokenExpiryInSeconds");
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

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("runtimeIdentity")
        private DatabaseToolsMcpServerRuntimeIdentity runtimeIdentity;

        public Builder runtimeIdentity(DatabaseToolsMcpServerRuntimeIdentity runtimeIdentity) {
            this.runtimeIdentity = runtimeIdentity;
            this.__explicitlySet__.add("runtimeIdentity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * associated identity domain.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("domainId")
        private String domainId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * associated identity domain.
         *
         * @param domainId the value to set
         * @return this builder
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            this.__explicitlySet__.add("domainId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storage")
        private DatabaseToolsMcpServerStorage storage;

        public Builder storage(DatabaseToolsMcpServerStorage storage) {
            this.storage = storage;
            this.__explicitlySet__.add("storage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDatabaseToolsMcpServerDefaultDetails build() {
            CreateDatabaseToolsMcpServerDefaultDetails model =
                    new CreateDatabaseToolsMcpServerDefaultDetails(
                            this.compartmentId,
                            this.customRoles,
                            this.displayName,
                            this.description,
                            this.databaseToolsConnectionId,
                            this.accessTokenExpiryInSeconds,
                            this.refreshTokenExpiryInSeconds,
                            this.definedTags,
                            this.freeformTags,
                            this.runtimeIdentity,
                            this.locks,
                            this.domainId,
                            this.storage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDatabaseToolsMcpServerDefaultDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("customRoles")) {
                this.customRoles(model.getCustomRoles());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("databaseToolsConnectionId")) {
                this.databaseToolsConnectionId(model.getDatabaseToolsConnectionId());
            }
            if (model.wasPropertyExplicitlySet("accessTokenExpiryInSeconds")) {
                this.accessTokenExpiryInSeconds(model.getAccessTokenExpiryInSeconds());
            }
            if (model.wasPropertyExplicitlySet("refreshTokenExpiryInSeconds")) {
                this.refreshTokenExpiryInSeconds(model.getRefreshTokenExpiryInSeconds());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("runtimeIdentity")) {
                this.runtimeIdentity(model.getRuntimeIdentity());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
            }
            if (model.wasPropertyExplicitlySet("domainId")) {
                this.domainId(model.getDomainId());
            }
            if (model.wasPropertyExplicitlySet("storage")) {
                this.storage(model.getStorage());
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
    public CreateDatabaseToolsMcpServerDefaultDetails(
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
            java.util.List<ResourceLock> locks,
            String domainId,
            DatabaseToolsMcpServerStorage storage) {
        super(
                compartmentId,
                customRoles,
                displayName,
                description,
                databaseToolsConnectionId,
                accessTokenExpiryInSeconds,
                refreshTokenExpiryInSeconds,
                definedTags,
                freeformTags,
                runtimeIdentity,
                locks);
        this.domainId = domainId;
        this.storage = storage;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * associated identity domain.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domainId")
    private final String domainId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * associated identity domain.
     *
     * @return the value
     */
    public String getDomainId() {
        return domainId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("storage")
    private final DatabaseToolsMcpServerStorage storage;

    public DatabaseToolsMcpServerStorage getStorage() {
        return storage;
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
        sb.append("CreateDatabaseToolsMcpServerDefaultDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", domainId=").append(String.valueOf(this.domainId));
        sb.append(", storage=").append(String.valueOf(this.storage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDatabaseToolsMcpServerDefaultDetails)) {
            return false;
        }

        CreateDatabaseToolsMcpServerDefaultDetails other =
                (CreateDatabaseToolsMcpServerDefaultDetails) o;
        return java.util.Objects.equals(this.domainId, other.domainId)
                && java.util.Objects.equals(this.storage, other.storage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.domainId == null ? 43 : this.domainId.hashCode());
        result = (result * PRIME) + (this.storage == null ? 43 : this.storage.hashCode());
        return result;
    }
}

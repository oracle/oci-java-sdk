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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatabaseToolsMcpServerSummaryDefault.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseToolsMcpServerSummaryDefault extends DatabaseToolsMcpServerSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseToolsConnectionId")
        private String databaseToolsConnectionId;

        public Builder databaseToolsConnectionId(String databaseToolsConnectionId) {
            this.databaseToolsConnectionId = databaseToolsConnectionId;
            this.__explicitlySet__.add("databaseToolsConnectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endpoints")
        private java.util.List<DatabaseToolsMcpServerEndpoint> endpoints;

        public Builder endpoints(java.util.List<DatabaseToolsMcpServerEndpoint> endpoints) {
            this.endpoints = endpoints;
            this.__explicitlySet__.add("endpoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("builtInRoles")
        private java.util.List<DatabaseToolsMcpServerBuiltInRole> builtInRoles;

        public Builder builtInRoles(
                java.util.List<DatabaseToolsMcpServerBuiltInRole> builtInRoles) {
            this.builtInRoles = builtInRoles;
            this.__explicitlySet__.add("builtInRoles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customRoles")
        private java.util.List<DatabaseToolsMcpServerCustomRole> customRoles;

        public Builder customRoles(java.util.List<DatabaseToolsMcpServerCustomRole> customRoles) {
            this.customRoles = customRoles;
            this.__explicitlySet__.add("customRoles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("relatedResource")
        private DatabaseToolsMcpServerRelatedResource relatedResource;

        public Builder relatedResource(DatabaseToolsMcpServerRelatedResource relatedResource) {
            this.relatedResource = relatedResource;
            this.__explicitlySet__.add("relatedResource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private DatabaseToolsMcpServerLifecycleState lifecycleState;

        public Builder lifecycleState(DatabaseToolsMcpServerLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
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
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * associated domain application (Oracle Cloud Service).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("domainAppId")
        private String domainAppId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * associated domain application (Oracle Cloud Service).
         *
         * @param domainAppId the value to set
         * @return this builder
         */
        public Builder domainAppId(String domainAppId) {
            this.domainAppId = domainAppId;
            this.__explicitlySet__.add("domainAppId");
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

        public DatabaseToolsMcpServerSummaryDefault build() {
            DatabaseToolsMcpServerSummaryDefault model =
                    new DatabaseToolsMcpServerSummaryDefault(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.databaseToolsConnectionId,
                            this.endpoints,
                            this.builtInRoles,
                            this.customRoles,
                            this.relatedResource,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.definedTags,
                            this.freeformTags,
                            this.systemTags,
                            this.runtimeIdentity,
                            this.locks,
                            this.domainId,
                            this.domainAppId,
                            this.storage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsMcpServerSummaryDefault model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("databaseToolsConnectionId")) {
                this.databaseToolsConnectionId(model.getDatabaseToolsConnectionId());
            }
            if (model.wasPropertyExplicitlySet("endpoints")) {
                this.endpoints(model.getEndpoints());
            }
            if (model.wasPropertyExplicitlySet("builtInRoles")) {
                this.builtInRoles(model.getBuiltInRoles());
            }
            if (model.wasPropertyExplicitlySet("customRoles")) {
                this.customRoles(model.getCustomRoles());
            }
            if (model.wasPropertyExplicitlySet("relatedResource")) {
                this.relatedResource(model.getRelatedResource());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
            if (model.wasPropertyExplicitlySet("domainAppId")) {
                this.domainAppId(model.getDomainAppId());
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
    public DatabaseToolsMcpServerSummaryDefault(
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
            java.util.List<ResourceLock> locks,
            String domainId,
            String domainAppId,
            DatabaseToolsMcpServerStorage storage) {
        super(
                id,
                compartmentId,
                displayName,
                databaseToolsConnectionId,
                endpoints,
                builtInRoles,
                customRoles,
                relatedResource,
                lifecycleState,
                lifecycleDetails,
                timeCreated,
                timeUpdated,
                definedTags,
                freeformTags,
                systemTags,
                runtimeIdentity,
                locks);
        this.domainId = domainId;
        this.domainAppId = domainAppId;
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * associated domain application (Oracle Cloud Service).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domainAppId")
    private final String domainAppId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * associated domain application (Oracle Cloud Service).
     *
     * @return the value
     */
    public String getDomainAppId() {
        return domainAppId;
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
        sb.append("DatabaseToolsMcpServerSummaryDefault(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", domainId=").append(String.valueOf(this.domainId));
        sb.append(", domainAppId=").append(String.valueOf(this.domainAppId));
        sb.append(", storage=").append(String.valueOf(this.storage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsMcpServerSummaryDefault)) {
            return false;
        }

        DatabaseToolsMcpServerSummaryDefault other = (DatabaseToolsMcpServerSummaryDefault) o;
        return java.util.Objects.equals(this.domainId, other.domainId)
                && java.util.Objects.equals(this.domainAppId, other.domainAppId)
                && java.util.Objects.equals(this.storage, other.storage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.domainId == null ? 43 : this.domainId.hashCode());
        result = (result * PRIME) + (this.domainAppId == null ? 43 : this.domainAppId.hashCode());
        result = (result * PRIME) + (this.storage == null ? 43 : this.storage.hashCode());
        return result;
    }
}

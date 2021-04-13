/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Database Connection resource used for migrations.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200720")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Connection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Connection {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private DatabaseConnectionTypes databaseType;

        public Builder databaseType(DatabaseConnectionTypes databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectDescriptor")
        private ConnectDescriptor connectDescriptor;

        public Builder connectDescriptor(ConnectDescriptor connectDescriptor) {
            this.connectDescriptor = connectDescriptor;
            this.__explicitlySet__.add("connectDescriptor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentialsSecretId")
        private String credentialsSecretId;

        public Builder credentialsSecretId(String credentialsSecretId) {
            this.credentialsSecretId = credentialsSecretId;
            this.__explicitlySet__.add("credentialsSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateTdn")
        private String certificateTdn;

        public Builder certificateTdn(String certificateTdn) {
            this.certificateTdn = certificateTdn;
            this.__explicitlySet__.add("certificateTdn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sshDetails")
        private SshDetails sshDetails;

        public Builder sshDetails(SshDetails sshDetails) {
            this.sshDetails = sshDetails;
            this.__explicitlySet__.add("sshDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminCredentials")
        private AdminCredentials adminCredentials;

        public Builder adminCredentials(AdminCredentials adminCredentials) {
            this.adminCredentials = adminCredentials;
            this.__explicitlySet__.add("adminCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
        private PrivateEndpointDetails privateEndpoint;

        public Builder privateEndpoint(PrivateEndpointDetails privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            this.__explicitlySet__.add("privateEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vaultDetails")
        private VaultDetails vaultDetails;

        public Builder vaultDetails(VaultDetails vaultDetails) {
            this.vaultDetails = vaultDetails;
            this.__explicitlySet__.add("vaultDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        public Builder lifecycleState(LifecycleStates lifecycleState) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Connection build() {
            Connection __instance__ =
                    new Connection(
                            id,
                            compartmentId,
                            databaseType,
                            displayName,
                            databaseId,
                            connectDescriptor,
                            credentialsSecretId,
                            certificateTdn,
                            sshDetails,
                            adminCredentials,
                            privateEndpoint,
                            vaultDetails,
                            lifecycleState,
                            lifecycleDetails,
                            timeCreated,
                            timeUpdated,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Connection o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .databaseType(o.getDatabaseType())
                            .displayName(o.getDisplayName())
                            .databaseId(o.getDatabaseId())
                            .connectDescriptor(o.getConnectDescriptor())
                            .credentialsSecretId(o.getCredentialsSecretId())
                            .certificateTdn(o.getCertificateTdn())
                            .sshDetails(o.getSshDetails())
                            .adminCredentials(o.getAdminCredentials())
                            .privateEndpoint(o.getPrivateEndpoint())
                            .vaultDetails(o.getVaultDetails())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

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

    /**
     * The OCID of the resource
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * OCID of the compartment
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Database connection type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    DatabaseConnectionTypes databaseType;

    /**
     * Database Connection display name identifier.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The OCID of the cloud database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    String databaseId;

    @com.fasterxml.jackson.annotation.JsonProperty("connectDescriptor")
    ConnectDescriptor connectDescriptor;

    /**
     * OCID of the Secret in the OCI vault containing the Database Connection credentials.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("credentialsSecretId")
    String credentialsSecretId;

    /**
     * This name is the distinguished name used while creating the certificate on target database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateTdn")
    String certificateTdn;

    @com.fasterxml.jackson.annotation.JsonProperty("sshDetails")
    SshDetails sshDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("adminCredentials")
    AdminCredentials adminCredentials;

    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpoint")
    PrivateEndpointDetails privateEndpoint;

    @com.fasterxml.jackson.annotation.JsonProperty("vaultDetails")
    VaultDetails vaultDetails;

    /**
     * The current state of the Connection resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleStates lifecycleState;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information
     * for a resource in Failed state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The time the Connection resource was created. An RFC3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time of the last Connection resource details update. An RFC3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: `{\"bar-key\": \"value\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: `{\"foo-namespace\": {\"bar-key\": \"value\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: `{\"orcl-cloud\": {\"free-tier-retained\": \"true\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

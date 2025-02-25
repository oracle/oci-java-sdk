/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Database insight resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MacsManagedCloudDatabaseInsight.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entitySource"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MacsManagedCloudDatabaseInsight extends DatabaseInsight {
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

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ResourceStatus status;

        public Builder status(ResourceStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private String databaseType;

        public Builder databaseType(String databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("processorCount")
        private Integer processorCount;

        public Builder processorCount(Integer processorCount) {
            this.processorCount = processorCount;
            this.__explicitlySet__.add("processorCount");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("databaseConnectionStatusDetails")
        private String databaseConnectionStatusDetails;

        public Builder databaseConnectionStatusDetails(String databaseConnectionStatusDetails) {
            this.databaseConnectionStatusDetails = databaseConnectionStatusDetails;
            this.__explicitlySet__.add("databaseConnectionStatusDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Management Agent
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
        private String managementAgentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Management Agent
         * @param managementAgentId the value to set
         * @return this builder
         **/
        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            this.__explicitlySet__.add("managementAgentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionDetails")
        private ConnectionDetails connectionDetails;

        public Builder connectionDetails(ConnectionDetails connectionDetails) {
            this.connectionDetails = connectionDetails;
            this.__explicitlySet__.add("connectionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionCredentialDetails")
        private CredentialDetails connectionCredentialDetails;

        public Builder connectionCredentialDetails(CredentialDetails connectionCredentialDetails) {
            this.connectionCredentialDetails = connectionCredentialDetails;
            this.__explicitlySet__.add("connectionCredentialDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
         * @param databaseId the value to set
         * @return this builder
         **/
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /**
         * Name of database
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        /**
         * Name of database
         * @param databaseName the value to set
         * @return this builder
         **/
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }
        /**
         * Display name of database
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseDisplayName")
        private String databaseDisplayName;

        /**
         * Display name of database
         * @param databaseDisplayName the value to set
         * @return this builder
         **/
        public Builder databaseDisplayName(String databaseDisplayName) {
            this.databaseDisplayName = databaseDisplayName;
            this.__explicitlySet__.add("databaseDisplayName");
            return this;
        }
        /**
         * OCI database resource type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseResourceType")
        private String databaseResourceType;

        /**
         * OCI database resource type
         * @param databaseResourceType the value to set
         * @return this builder
         **/
        public Builder databaseResourceType(String databaseResourceType) {
            this.databaseResourceType = databaseResourceType;
            this.__explicitlySet__.add("databaseResourceType");
            return this;
        }
        /**
         * Additional details of a database in JSON format. For autonomous databases, this is the AutonomousDatabase object serialized as a JSON string as defined in https://docs.oracle.com/iaas/en-us/iaas/api/#/en/database/20160918/AutonomousDatabase/. For EM, pass in null or an empty string. Note that this string needs to be escaped when specified in the curl command.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbAdditionalDetails")
        private Object dbAdditionalDetails;

        /**
         * Additional details of a database in JSON format. For autonomous databases, this is the AutonomousDatabase object serialized as a JSON string as defined in https://docs.oracle.com/iaas/en-us/iaas/api/#/en/database/20160918/AutonomousDatabase/. For EM, pass in null or an empty string. Note that this string needs to be escaped when specified in the curl command.
         *
         * @param dbAdditionalDetails the value to set
         * @return this builder
         **/
        public Builder dbAdditionalDetails(Object dbAdditionalDetails) {
            this.dbAdditionalDetails = dbAdditionalDetails;
            this.__explicitlySet__.add("dbAdditionalDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM Cluster or DB System ID, depending on which configuration the resource belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentId")
        private String parentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM Cluster or DB System ID, depending on which configuration the resource belongs to.
         * @param parentId the value to set
         * @return this builder
         **/
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            this.__explicitlySet__.add("parentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata Infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rootId")
        private String rootId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata Infrastructure.
         * @param rootId the value to set
         * @return this builder
         **/
        public Builder rootId(String rootId) {
            this.rootId = rootId;
            this.__explicitlySet__.add("rootId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MacsManagedCloudDatabaseInsight build() {
            MacsManagedCloudDatabaseInsight model =
                    new MacsManagedCloudDatabaseInsight(
                            this.id,
                            this.compartmentId,
                            this.status,
                            this.databaseType,
                            this.databaseVersion,
                            this.processorCount,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.databaseConnectionStatusDetails,
                            this.managementAgentId,
                            this.connectionDetails,
                            this.connectionCredentialDetails,
                            this.databaseId,
                            this.databaseName,
                            this.databaseDisplayName,
                            this.databaseResourceType,
                            this.dbAdditionalDetails,
                            this.parentId,
                            this.rootId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MacsManagedCloudDatabaseInsight model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("databaseType")) {
                this.databaseType(model.getDatabaseType());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            if (model.wasPropertyExplicitlySet("processorCount")) {
                this.processorCount(model.getProcessorCount());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("databaseConnectionStatusDetails")) {
                this.databaseConnectionStatusDetails(model.getDatabaseConnectionStatusDetails());
            }
            if (model.wasPropertyExplicitlySet("managementAgentId")) {
                this.managementAgentId(model.getManagementAgentId());
            }
            if (model.wasPropertyExplicitlySet("connectionDetails")) {
                this.connectionDetails(model.getConnectionDetails());
            }
            if (model.wasPropertyExplicitlySet("connectionCredentialDetails")) {
                this.connectionCredentialDetails(model.getConnectionCredentialDetails());
            }
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("databaseName")) {
                this.databaseName(model.getDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("databaseDisplayName")) {
                this.databaseDisplayName(model.getDatabaseDisplayName());
            }
            if (model.wasPropertyExplicitlySet("databaseResourceType")) {
                this.databaseResourceType(model.getDatabaseResourceType());
            }
            if (model.wasPropertyExplicitlySet("dbAdditionalDetails")) {
                this.dbAdditionalDetails(model.getDbAdditionalDetails());
            }
            if (model.wasPropertyExplicitlySet("parentId")) {
                this.parentId(model.getParentId());
            }
            if (model.wasPropertyExplicitlySet("rootId")) {
                this.rootId(model.getRootId());
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
    public MacsManagedCloudDatabaseInsight(
            String id,
            String compartmentId,
            ResourceStatus status,
            String databaseType,
            String databaseVersion,
            Integer processorCount,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String databaseConnectionStatusDetails,
            String managementAgentId,
            ConnectionDetails connectionDetails,
            CredentialDetails connectionCredentialDetails,
            String databaseId,
            String databaseName,
            String databaseDisplayName,
            String databaseResourceType,
            Object dbAdditionalDetails,
            String parentId,
            String rootId) {
        super(
                id,
                compartmentId,
                status,
                databaseType,
                databaseVersion,
                processorCount,
                freeformTags,
                definedTags,
                systemTags,
                timeCreated,
                timeUpdated,
                lifecycleState,
                lifecycleDetails,
                databaseConnectionStatusDetails);
        this.managementAgentId = managementAgentId;
        this.connectionDetails = connectionDetails;
        this.connectionCredentialDetails = connectionCredentialDetails;
        this.databaseId = databaseId;
        this.databaseName = databaseName;
        this.databaseDisplayName = databaseDisplayName;
        this.databaseResourceType = databaseResourceType;
        this.dbAdditionalDetails = dbAdditionalDetails;
        this.parentId = parentId;
        this.rootId = rootId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Management Agent
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    private final String managementAgentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Management Agent
     * @return the value
     **/
    public String getManagementAgentId() {
        return managementAgentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionDetails")
    private final ConnectionDetails connectionDetails;

    public ConnectionDetails getConnectionDetails() {
        return connectionDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionCredentialDetails")
    private final CredentialDetails connectionCredentialDetails;

    public CredentialDetails getConnectionCredentialDetails() {
        return connectionCredentialDetails;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
     * @return the value
     **/
    public String getDatabaseId() {
        return databaseId;
    }

    /**
     * Name of database
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    /**
     * Name of database
     * @return the value
     **/
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Display name of database
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseDisplayName")
    private final String databaseDisplayName;

    /**
     * Display name of database
     * @return the value
     **/
    public String getDatabaseDisplayName() {
        return databaseDisplayName;
    }

    /**
     * OCI database resource type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseResourceType")
    private final String databaseResourceType;

    /**
     * OCI database resource type
     * @return the value
     **/
    public String getDatabaseResourceType() {
        return databaseResourceType;
    }

    /**
     * Additional details of a database in JSON format. For autonomous databases, this is the AutonomousDatabase object serialized as a JSON string as defined in https://docs.oracle.com/iaas/en-us/iaas/api/#/en/database/20160918/AutonomousDatabase/. For EM, pass in null or an empty string. Note that this string needs to be escaped when specified in the curl command.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbAdditionalDetails")
    private final Object dbAdditionalDetails;

    /**
     * Additional details of a database in JSON format. For autonomous databases, this is the AutonomousDatabase object serialized as a JSON string as defined in https://docs.oracle.com/iaas/en-us/iaas/api/#/en/database/20160918/AutonomousDatabase/. For EM, pass in null or an empty string. Note that this string needs to be escaped when specified in the curl command.
     *
     * @return the value
     **/
    public Object getDbAdditionalDetails() {
        return dbAdditionalDetails;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM Cluster or DB System ID, depending on which configuration the resource belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentId")
    private final String parentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM Cluster or DB System ID, depending on which configuration the resource belongs to.
     * @return the value
     **/
    public String getParentId() {
        return parentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rootId")
    private final String rootId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata Infrastructure.
     * @return the value
     **/
    public String getRootId() {
        return rootId;
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
        sb.append("MacsManagedCloudDatabaseInsight(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", managementAgentId=").append(String.valueOf(this.managementAgentId));
        sb.append(", connectionDetails=").append(String.valueOf(this.connectionDetails));
        sb.append(", connectionCredentialDetails=")
                .append(String.valueOf(this.connectionCredentialDetails));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", databaseDisplayName=").append(String.valueOf(this.databaseDisplayName));
        sb.append(", databaseResourceType=").append(String.valueOf(this.databaseResourceType));
        sb.append(", dbAdditionalDetails=").append(String.valueOf(this.dbAdditionalDetails));
        sb.append(", parentId=").append(String.valueOf(this.parentId));
        sb.append(", rootId=").append(String.valueOf(this.rootId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MacsManagedCloudDatabaseInsight)) {
            return false;
        }

        MacsManagedCloudDatabaseInsight other = (MacsManagedCloudDatabaseInsight) o;
        return java.util.Objects.equals(this.managementAgentId, other.managementAgentId)
                && java.util.Objects.equals(this.connectionDetails, other.connectionDetails)
                && java.util.Objects.equals(
                        this.connectionCredentialDetails, other.connectionCredentialDetails)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.databaseDisplayName, other.databaseDisplayName)
                && java.util.Objects.equals(this.databaseResourceType, other.databaseResourceType)
                && java.util.Objects.equals(this.dbAdditionalDetails, other.dbAdditionalDetails)
                && java.util.Objects.equals(this.parentId, other.parentId)
                && java.util.Objects.equals(this.rootId, other.rootId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managementAgentId == null ? 43 : this.managementAgentId.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionDetails == null ? 43 : this.connectionDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionCredentialDetails == null
                                ? 43
                                : this.connectionCredentialDetails.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseDisplayName == null
                                ? 43
                                : this.databaseDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseResourceType == null
                                ? 43
                                : this.databaseResourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.dbAdditionalDetails == null
                                ? 43
                                : this.dbAdditionalDetails.hashCode());
        result = (result * PRIME) + (this.parentId == null ? 43 : this.parentId.hashCode());
        result = (result * PRIME) + (this.rootId == null ? 43 : this.rootId.hashCode());
        return result;
    }
}

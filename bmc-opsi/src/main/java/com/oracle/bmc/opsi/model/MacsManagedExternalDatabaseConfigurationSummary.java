/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Configuration Summary of a Macs Managed External database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MacsManagedExternalDatabaseConfigurationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entitySource")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MacsManagedExternalDatabaseConfigurationSummary
        extends DatabaseConfigurationSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("databaseInsightId")
        private String databaseInsightId;

        public Builder databaseInsightId(String databaseInsightId) {
            this.databaseInsightId = databaseInsightId;
            this.__explicitlySet__.add("databaseInsightId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseDisplayName")
        private String databaseDisplayName;

        public Builder databaseDisplayName(String databaseDisplayName) {
            this.databaseDisplayName = databaseDisplayName;
            this.__explicitlySet__.add("databaseDisplayName");
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

        @com.fasterxml.jackson.annotation.JsonProperty("cdbName")
        private String cdbName;

        public Builder cdbName(String cdbName) {
            this.cdbName = cdbName;
            this.__explicitlySet__.add("cdbName");
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

        @com.fasterxml.jackson.annotation.JsonProperty("processorCount")
        private Integer processorCount;

        public Builder processorCount(Integer processorCount) {
            this.processorCount = processorCount;
            this.__explicitlySet__.add("processorCount");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * database.
         *
         * @param databaseId the value to set
         * @return this builder
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Management Agent
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
        private String managementAgentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Management Agent
         *
         * @param managementAgentId the value to set
         * @return this builder
         */
        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            this.__explicitlySet__.add("managementAgentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * External Database Connector
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
        private String connectorId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * External Database Connector
         *
         * @param connectorId the value to set
         * @return this builder
         */
        public Builder connectorId(String connectorId) {
            this.connectorId = connectorId;
            this.__explicitlySet__.add("connectorId");
            return this;
        }
        /** Array of hostname and instance name. */
        @com.fasterxml.jackson.annotation.JsonProperty("instances")
        private java.util.List<HostInstanceMap> instances;

        /**
         * Array of hostname and instance name.
         *
         * @param instances the value to set
         * @return this builder
         */
        public Builder instances(java.util.List<HostInstanceMap> instances) {
            this.instances = instances;
            this.__explicitlySet__.add("instances");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MacsManagedExternalDatabaseConfigurationSummary build() {
            MacsManagedExternalDatabaseConfigurationSummary model =
                    new MacsManagedExternalDatabaseConfigurationSummary(
                            this.databaseInsightId,
                            this.compartmentId,
                            this.databaseName,
                            this.databaseDisplayName,
                            this.databaseType,
                            this.databaseVersion,
                            this.cdbName,
                            this.definedTags,
                            this.freeformTags,
                            this.processorCount,
                            this.databaseId,
                            this.managementAgentId,
                            this.connectorId,
                            this.instances);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MacsManagedExternalDatabaseConfigurationSummary model) {
            if (model.wasPropertyExplicitlySet("databaseInsightId")) {
                this.databaseInsightId(model.getDatabaseInsightId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("databaseName")) {
                this.databaseName(model.getDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("databaseDisplayName")) {
                this.databaseDisplayName(model.getDatabaseDisplayName());
            }
            if (model.wasPropertyExplicitlySet("databaseType")) {
                this.databaseType(model.getDatabaseType());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            if (model.wasPropertyExplicitlySet("cdbName")) {
                this.cdbName(model.getCdbName());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("processorCount")) {
                this.processorCount(model.getProcessorCount());
            }
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("managementAgentId")) {
                this.managementAgentId(model.getManagementAgentId());
            }
            if (model.wasPropertyExplicitlySet("connectorId")) {
                this.connectorId(model.getConnectorId());
            }
            if (model.wasPropertyExplicitlySet("instances")) {
                this.instances(model.getInstances());
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
    public MacsManagedExternalDatabaseConfigurationSummary(
            String databaseInsightId,
            String compartmentId,
            String databaseName,
            String databaseDisplayName,
            String databaseType,
            String databaseVersion,
            String cdbName,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            Integer processorCount,
            String databaseId,
            String managementAgentId,
            String connectorId,
            java.util.List<HostInstanceMap> instances) {
        super(
                databaseInsightId,
                compartmentId,
                databaseName,
                databaseDisplayName,
                databaseType,
                databaseVersion,
                cdbName,
                definedTags,
                freeformTags,
                processorCount);
        this.databaseId = databaseId;
        this.managementAgentId = managementAgentId;
        this.connectorId = connectorId;
        this.instances = instances;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * database.
     *
     * @return the value
     */
    public String getDatabaseId() {
        return databaseId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Management Agent
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    private final String managementAgentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Management Agent
     *
     * @return the value
     */
    public String getManagementAgentId() {
        return managementAgentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of External
     * Database Connector
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
    private final String connectorId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of External
     * Database Connector
     *
     * @return the value
     */
    public String getConnectorId() {
        return connectorId;
    }

    /** Array of hostname and instance name. */
    @com.fasterxml.jackson.annotation.JsonProperty("instances")
    private final java.util.List<HostInstanceMap> instances;

    /**
     * Array of hostname and instance name.
     *
     * @return the value
     */
    public java.util.List<HostInstanceMap> getInstances() {
        return instances;
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
        sb.append("MacsManagedExternalDatabaseConfigurationSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", managementAgentId=").append(String.valueOf(this.managementAgentId));
        sb.append(", connectorId=").append(String.valueOf(this.connectorId));
        sb.append(", instances=").append(String.valueOf(this.instances));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MacsManagedExternalDatabaseConfigurationSummary)) {
            return false;
        }

        MacsManagedExternalDatabaseConfigurationSummary other =
                (MacsManagedExternalDatabaseConfigurationSummary) o;
        return java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.managementAgentId, other.managementAgentId)
                && java.util.Objects.equals(this.connectorId, other.connectorId)
                && java.util.Objects.equals(this.instances, other.instances)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.managementAgentId == null ? 43 : this.managementAgentId.hashCode());
        result = (result * PRIME) + (this.connectorId == null ? 43 : this.connectorId.hashCode());
        result = (result * PRIME) + (this.instances == null ? 43 : this.instances.hashCode());
        return result;
    }
}

/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * External database summary record. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalMySqlDatabaseSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalMySqlDatabaseSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "externalDatabaseId",
        "connectorId",
        "dbName",
        "deploymentType",
        "managementState",
        "lifecycleState",
        "systemTags"
    })
    public ExternalMySqlDatabaseSummary(
            String compartmentId,
            String externalDatabaseId,
            String connectorId,
            String dbName,
            MySqlDeploymentType deploymentType,
            ManagementState managementState,
            LifecycleStates lifecycleState,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.compartmentId = compartmentId;
        this.externalDatabaseId = externalDatabaseId;
        this.connectorId = connectorId;
        this.dbName = dbName;
        this.deploymentType = deploymentType;
        this.managementState = managementState;
        this.lifecycleState = lifecycleState;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of compartment for the External MySQL Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of compartment for the External MySQL Database.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** OCID of External MySQL Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("externalDatabaseId")
        private String externalDatabaseId;

        /**
         * OCID of External MySQL Database.
         *
         * @param externalDatabaseId the value to set
         * @return this builder
         */
        public Builder externalDatabaseId(String externalDatabaseId) {
            this.externalDatabaseId = externalDatabaseId;
            this.__explicitlySet__.add("externalDatabaseId");
            return this;
        }
        /** The OCID of the enabled MySQL Database Connector. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
        private String connectorId;

        /**
         * The OCID of the enabled MySQL Database Connector.
         *
         * @param connectorId the value to set
         * @return this builder
         */
        public Builder connectorId(String connectorId) {
            this.connectorId = connectorId;
            this.__explicitlySet__.add("connectorId");
            return this;
        }
        /** Display name of the External MySQL Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        /**
         * Display name of the External MySQL Database.
         *
         * @param dbName the value to set
         * @return this builder
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
            return this;
        }
        /** The deployment type of the Mysql Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private MySqlDeploymentType deploymentType;

        /**
         * The deployment type of the Mysql Database.
         *
         * @param deploymentType the value to set
         * @return this builder
         */
        public Builder deploymentType(MySqlDeploymentType deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
            return this;
        }
        /** Indicates database management state. */
        @com.fasterxml.jackson.annotation.JsonProperty("managementState")
        private ManagementState managementState;

        /**
         * Indicates database management state.
         *
         * @param managementState the value to set
         * @return this builder
         */
        public Builder managementState(ManagementState managementState) {
            this.managementState = managementState;
            this.__explicitlySet__.add("managementState");
            return this;
        }
        /** Indicates lifecycle state of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * Indicates lifecycle state of the resource.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalMySqlDatabaseSummary build() {
            ExternalMySqlDatabaseSummary model =
                    new ExternalMySqlDatabaseSummary(
                            this.compartmentId,
                            this.externalDatabaseId,
                            this.connectorId,
                            this.dbName,
                            this.deploymentType,
                            this.managementState,
                            this.lifecycleState,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalMySqlDatabaseSummary model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("externalDatabaseId")) {
                this.externalDatabaseId(model.getExternalDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("connectorId")) {
                this.connectorId(model.getConnectorId());
            }
            if (model.wasPropertyExplicitlySet("dbName")) {
                this.dbName(model.getDbName());
            }
            if (model.wasPropertyExplicitlySet("deploymentType")) {
                this.deploymentType(model.getDeploymentType());
            }
            if (model.wasPropertyExplicitlySet("managementState")) {
                this.managementState(model.getManagementState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** OCID of compartment for the External MySQL Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of compartment for the External MySQL Database.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** OCID of External MySQL Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalDatabaseId")
    private final String externalDatabaseId;

    /**
     * OCID of External MySQL Database.
     *
     * @return the value
     */
    public String getExternalDatabaseId() {
        return externalDatabaseId;
    }

    /** The OCID of the enabled MySQL Database Connector. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
    private final String connectorId;

    /**
     * The OCID of the enabled MySQL Database Connector.
     *
     * @return the value
     */
    public String getConnectorId() {
        return connectorId;
    }

    /** Display name of the External MySQL Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    private final String dbName;

    /**
     * Display name of the External MySQL Database.
     *
     * @return the value
     */
    public String getDbName() {
        return dbName;
    }

    /** The deployment type of the Mysql Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final MySqlDeploymentType deploymentType;

    /**
     * The deployment type of the Mysql Database.
     *
     * @return the value
     */
    public MySqlDeploymentType getDeploymentType() {
        return deploymentType;
    }

    /** Indicates database management state. */
    @com.fasterxml.jackson.annotation.JsonProperty("managementState")
    private final ManagementState managementState;

    /**
     * Indicates database management state.
     *
     * @return the value
     */
    public ManagementState getManagementState() {
        return managementState;
    }

    /** Indicates lifecycle state of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * Indicates lifecycle state of the resource.
     *
     * @return the value
     */
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("ExternalMySqlDatabaseSummary(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", externalDatabaseId=").append(String.valueOf(this.externalDatabaseId));
        sb.append(", connectorId=").append(String.valueOf(this.connectorId));
        sb.append(", dbName=").append(String.valueOf(this.dbName));
        sb.append(", deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", managementState=").append(String.valueOf(this.managementState));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalMySqlDatabaseSummary)) {
            return false;
        }

        ExternalMySqlDatabaseSummary other = (ExternalMySqlDatabaseSummary) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.externalDatabaseId, other.externalDatabaseId)
                && java.util.Objects.equals(this.connectorId, other.connectorId)
                && java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(this.deploymentType, other.deploymentType)
                && java.util.Objects.equals(this.managementState, other.managementState)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.externalDatabaseId == null
                                ? 43
                                : this.externalDatabaseId.hashCode());
        result = (result * PRIME) + (this.connectorId == null ? 43 : this.connectorId.hashCode());
        result = (result * PRIME) + (this.dbName == null ? 43 : this.dbName.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result =
                (result * PRIME)
                        + (this.managementState == null ? 43 : this.managementState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

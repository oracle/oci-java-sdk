/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the Managed MySQL Database. <br>
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
        builder = ManagedMySqlDatabaseSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedMySqlDatabaseSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "dbName",
        "dbVersion",
        "timeCreated",
        "name",
        "databaseType",
        "managementState",
        "lifecycleState",
        "heatWaveManagementType"
    })
    public ManagedMySqlDatabaseSummary(
            String id,
            String compartmentId,
            String dbName,
            String dbVersion,
            java.util.Date timeCreated,
            String name,
            MySqlType databaseType,
            ManagementState managementState,
            LifecycleStates lifecycleState,
            ManagedMySqlDatabase.HeatWaveManagementType heatWaveManagementType) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.dbName = dbName;
        this.dbVersion = dbVersion;
        this.timeCreated = timeCreated;
        this.name = name;
        this.databaseType = databaseType;
        this.managementState = managementState;
        this.lifecycleState = lifecycleState;
        this.heatWaveManagementType = heatWaveManagementType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the Managed MySQL Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the Managed MySQL Database.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The name of the MySQL Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        /**
         * The name of the MySQL Database.
         *
         * @param dbName the value to set
         * @return this builder
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
            return this;
        }
        /** The version of the MySQL Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * The version of the MySQL Database.
         *
         * @param dbVersion the value to set
         * @return this builder
         */
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }
        /** The date and time the Managed MySQL Database was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Managed MySQL Database was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The name of the Managed MySQL Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the Managed MySQL Database.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The type of the MySQL Database. Indicates whether the database is external or MDS. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private MySqlType databaseType;

        /**
         * The type of the MySQL Database. Indicates whether the database is external or MDS.
         *
         * @param databaseType the value to set
         * @return this builder
         */
        public Builder databaseType(MySqlType databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }
        /** Indicates database management status. */
        @com.fasterxml.jackson.annotation.JsonProperty("managementState")
        private ManagementState managementState;

        /**
         * Indicates database management status.
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
        /** The customer's selected type for HeatWave management. */
        @com.fasterxml.jackson.annotation.JsonProperty("heatWaveManagementType")
        private ManagedMySqlDatabase.HeatWaveManagementType heatWaveManagementType;

        /**
         * The customer's selected type for HeatWave management.
         *
         * @param heatWaveManagementType the value to set
         * @return this builder
         */
        public Builder heatWaveManagementType(
                ManagedMySqlDatabase.HeatWaveManagementType heatWaveManagementType) {
            this.heatWaveManagementType = heatWaveManagementType;
            this.__explicitlySet__.add("heatWaveManagementType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedMySqlDatabaseSummary build() {
            ManagedMySqlDatabaseSummary model =
                    new ManagedMySqlDatabaseSummary(
                            this.id,
                            this.compartmentId,
                            this.dbName,
                            this.dbVersion,
                            this.timeCreated,
                            this.name,
                            this.databaseType,
                            this.managementState,
                            this.lifecycleState,
                            this.heatWaveManagementType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedMySqlDatabaseSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dbName")) {
                this.dbName(model.getDbName());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("databaseType")) {
                this.databaseType(model.getDatabaseType());
            }
            if (model.wasPropertyExplicitlySet("managementState")) {
                this.managementState(model.getManagementState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("heatWaveManagementType")) {
                this.heatWaveManagementType(model.getHeatWaveManagementType());
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

    /** The OCID of the Managed MySQL Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the Managed MySQL Database.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The name of the MySQL Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    private final String dbName;

    /**
     * The name of the MySQL Database.
     *
     * @return the value
     */
    public String getDbName() {
        return dbName;
    }

    /** The version of the MySQL Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * The version of the MySQL Database.
     *
     * @return the value
     */
    public String getDbVersion() {
        return dbVersion;
    }

    /** The date and time the Managed MySQL Database was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Managed MySQL Database was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The name of the Managed MySQL Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the Managed MySQL Database.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The type of the MySQL Database. Indicates whether the database is external or MDS. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    private final MySqlType databaseType;

    /**
     * The type of the MySQL Database. Indicates whether the database is external or MDS.
     *
     * @return the value
     */
    public MySqlType getDatabaseType() {
        return databaseType;
    }

    /** Indicates database management status. */
    @com.fasterxml.jackson.annotation.JsonProperty("managementState")
    private final ManagementState managementState;

    /**
     * Indicates database management status.
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

    /** The customer's selected type for HeatWave management. */
    @com.fasterxml.jackson.annotation.JsonProperty("heatWaveManagementType")
    private final ManagedMySqlDatabase.HeatWaveManagementType heatWaveManagementType;

    /**
     * The customer's selected type for HeatWave management.
     *
     * @return the value
     */
    public ManagedMySqlDatabase.HeatWaveManagementType getHeatWaveManagementType() {
        return heatWaveManagementType;
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
        sb.append("ManagedMySqlDatabaseSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dbName=").append(String.valueOf(this.dbName));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", databaseType=").append(String.valueOf(this.databaseType));
        sb.append(", managementState=").append(String.valueOf(this.managementState));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", heatWaveManagementType=").append(String.valueOf(this.heatWaveManagementType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedMySqlDatabaseSummary)) {
            return false;
        }

        ManagedMySqlDatabaseSummary other = (ManagedMySqlDatabaseSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.managementState, other.managementState)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.heatWaveManagementType, other.heatWaveManagementType)
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
        result = (result * PRIME) + (this.dbName == null ? 43 : this.dbName.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.managementState == null ? 43 : this.managementState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.heatWaveManagementType == null
                                ? 43
                                : this.heatWaveManagementType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

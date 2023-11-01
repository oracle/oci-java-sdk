/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The list of aggregated metrics for Managed MySQL Databases in the fleet. <br>
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
        builder = MySqlDatabaseUsageMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlDatabaseUsageMetrics
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "databaseName",
        "databaseType",
        "mdsDeploymentType",
        "mdslifecycleState",
        "databaseVersion",
        "dbId",
        "databaseStatus",
        "metrics"
    })
    public MySqlDatabaseUsageMetrics(
            String compartmentId,
            String databaseName,
            String databaseType,
            String mdsDeploymentType,
            String mdslifecycleState,
            String databaseVersion,
            String dbId,
            MySqlDatabaseStatus databaseStatus,
            java.util.List<MySqlFleetMetricDefinition> metrics) {
        super();
        this.compartmentId = compartmentId;
        this.databaseName = databaseName;
        this.databaseType = databaseType;
        this.mdsDeploymentType = mdsDeploymentType;
        this.mdslifecycleState = mdslifecycleState;
        this.databaseVersion = databaseVersion;
        this.dbId = dbId;
        this.databaseStatus = databaseStatus;
        this.metrics = metrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment where the Managed MySQL Database resides. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the Managed MySQL Database resides.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The display name of the Managed MySQL Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        /**
         * The display name of the Managed MySQL Database.
         *
         * @param databaseName the value to set
         * @return this builder
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }
        /** Indicates MySQL Database type, ONPREMISE or MySQL Database System. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private String databaseType;

        /**
         * Indicates MySQL Database type, ONPREMISE or MySQL Database System.
         *
         * @param databaseType the value to set
         * @return this builder
         */
        public Builder databaseType(String databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }
        /** The type of MySQL Database System. */
        @com.fasterxml.jackson.annotation.JsonProperty("mdsDeploymentType")
        private String mdsDeploymentType;

        /**
         * The type of MySQL Database System.
         *
         * @param mdsDeploymentType the value to set
         * @return this builder
         */
        public Builder mdsDeploymentType(String mdsDeploymentType) {
            this.mdsDeploymentType = mdsDeploymentType;
            this.__explicitlySet__.add("mdsDeploymentType");
            return this;
        }
        /** The lifecycle state of the MySQL Database System. */
        @com.fasterxml.jackson.annotation.JsonProperty("mdslifecycleState")
        private String mdslifecycleState;

        /**
         * The lifecycle state of the MySQL Database System.
         *
         * @param mdslifecycleState the value to set
         * @return this builder
         */
        public Builder mdslifecycleState(String mdslifecycleState) {
            this.mdslifecycleState = mdslifecycleState;
            this.__explicitlySet__.add("mdslifecycleState");
            return this;
        }
        /** The version of the MySQL Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        /**
         * The version of the MySQL Database.
         *
         * @param databaseVersion the value to set
         * @return this builder
         */
        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }
        /** The OCID of the Managed MySQL Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbId")
        private String dbId;

        /**
         * The OCID of the Managed MySQL Database.
         *
         * @param dbId the value to set
         * @return this builder
         */
        public Builder dbId(String dbId) {
            this.dbId = dbId;
            this.__explicitlySet__.add("dbId");
            return this;
        }
        /**
         * The status of the MySQL Database. Indicates whether the status of the database is UP,
         * DOWN, or UNKNOWN at the current time.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseStatus")
        private MySqlDatabaseStatus databaseStatus;

        /**
         * The status of the MySQL Database. Indicates whether the status of the database is UP,
         * DOWN, or UNKNOWN at the current time.
         *
         * @param databaseStatus the value to set
         * @return this builder
         */
        public Builder databaseStatus(MySqlDatabaseStatus databaseStatus) {
            this.databaseStatus = databaseStatus;
            this.__explicitlySet__.add("databaseStatus");
            return this;
        }
        /** A list of the database health metrics like CPU, Storage, and Memory. */
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<MySqlFleetMetricDefinition> metrics;

        /**
         * A list of the database health metrics like CPU, Storage, and Memory.
         *
         * @param metrics the value to set
         * @return this builder
         */
        public Builder metrics(java.util.List<MySqlFleetMetricDefinition> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlDatabaseUsageMetrics build() {
            MySqlDatabaseUsageMetrics model =
                    new MySqlDatabaseUsageMetrics(
                            this.compartmentId,
                            this.databaseName,
                            this.databaseType,
                            this.mdsDeploymentType,
                            this.mdslifecycleState,
                            this.databaseVersion,
                            this.dbId,
                            this.databaseStatus,
                            this.metrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlDatabaseUsageMetrics model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("databaseName")) {
                this.databaseName(model.getDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("databaseType")) {
                this.databaseType(model.getDatabaseType());
            }
            if (model.wasPropertyExplicitlySet("mdsDeploymentType")) {
                this.mdsDeploymentType(model.getMdsDeploymentType());
            }
            if (model.wasPropertyExplicitlySet("mdslifecycleState")) {
                this.mdslifecycleState(model.getMdslifecycleState());
            }
            if (model.wasPropertyExplicitlySet("databaseVersion")) {
                this.databaseVersion(model.getDatabaseVersion());
            }
            if (model.wasPropertyExplicitlySet("dbId")) {
                this.dbId(model.getDbId());
            }
            if (model.wasPropertyExplicitlySet("databaseStatus")) {
                this.databaseStatus(model.getDatabaseStatus());
            }
            if (model.wasPropertyExplicitlySet("metrics")) {
                this.metrics(model.getMetrics());
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

    /** The OCID of the compartment where the Managed MySQL Database resides. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the Managed MySQL Database resides.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The display name of the Managed MySQL Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    /**
     * The display name of the Managed MySQL Database.
     *
     * @return the value
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /** Indicates MySQL Database type, ONPREMISE or MySQL Database System. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    private final String databaseType;

    /**
     * Indicates MySQL Database type, ONPREMISE or MySQL Database System.
     *
     * @return the value
     */
    public String getDatabaseType() {
        return databaseType;
    }

    /** The type of MySQL Database System. */
    @com.fasterxml.jackson.annotation.JsonProperty("mdsDeploymentType")
    private final String mdsDeploymentType;

    /**
     * The type of MySQL Database System.
     *
     * @return the value
     */
    public String getMdsDeploymentType() {
        return mdsDeploymentType;
    }

    /** The lifecycle state of the MySQL Database System. */
    @com.fasterxml.jackson.annotation.JsonProperty("mdslifecycleState")
    private final String mdslifecycleState;

    /**
     * The lifecycle state of the MySQL Database System.
     *
     * @return the value
     */
    public String getMdslifecycleState() {
        return mdslifecycleState;
    }

    /** The version of the MySQL Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    private final String databaseVersion;

    /**
     * The version of the MySQL Database.
     *
     * @return the value
     */
    public String getDatabaseVersion() {
        return databaseVersion;
    }

    /** The OCID of the Managed MySQL Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbId")
    private final String dbId;

    /**
     * The OCID of the Managed MySQL Database.
     *
     * @return the value
     */
    public String getDbId() {
        return dbId;
    }

    /**
     * The status of the MySQL Database. Indicates whether the status of the database is UP, DOWN,
     * or UNKNOWN at the current time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseStatus")
    private final MySqlDatabaseStatus databaseStatus;

    /**
     * The status of the MySQL Database. Indicates whether the status of the database is UP, DOWN,
     * or UNKNOWN at the current time.
     *
     * @return the value
     */
    public MySqlDatabaseStatus getDatabaseStatus() {
        return databaseStatus;
    }

    /** A list of the database health metrics like CPU, Storage, and Memory. */
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<MySqlFleetMetricDefinition> metrics;

    /**
     * A list of the database health metrics like CPU, Storage, and Memory.
     *
     * @return the value
     */
    public java.util.List<MySqlFleetMetricDefinition> getMetrics() {
        return metrics;
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
        sb.append("MySqlDatabaseUsageMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", databaseType=").append(String.valueOf(this.databaseType));
        sb.append(", mdsDeploymentType=").append(String.valueOf(this.mdsDeploymentType));
        sb.append(", mdslifecycleState=").append(String.valueOf(this.mdslifecycleState));
        sb.append(", databaseVersion=").append(String.valueOf(this.databaseVersion));
        sb.append(", dbId=").append(String.valueOf(this.dbId));
        sb.append(", databaseStatus=").append(String.valueOf(this.databaseStatus));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlDatabaseUsageMetrics)) {
            return false;
        }

        MySqlDatabaseUsageMetrics other = (MySqlDatabaseUsageMetrics) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.mdsDeploymentType, other.mdsDeploymentType)
                && java.util.Objects.equals(this.mdslifecycleState, other.mdslifecycleState)
                && java.util.Objects.equals(this.databaseVersion, other.databaseVersion)
                && java.util.Objects.equals(this.dbId, other.dbId)
                && java.util.Objects.equals(this.databaseStatus, other.databaseStatus)
                && java.util.Objects.equals(this.metrics, other.metrics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.mdsDeploymentType == null ? 43 : this.mdsDeploymentType.hashCode());
        result =
                (result * PRIME)
                        + (this.mdslifecycleState == null ? 43 : this.mdslifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseVersion == null ? 43 : this.databaseVersion.hashCode());
        result = (result * PRIME) + (this.dbId == null ? 43 : this.dbId.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseStatus == null ? 43 : this.databaseStatus.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

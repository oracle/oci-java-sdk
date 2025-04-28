/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The standby database details. <br>
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
        builder = StandByDatabaseDataguardMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class StandByDatabaseDataguardMetrics
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dbId",
        "compartmentId",
        "databaseId",
        "databaseName",
        "dbUniqueName",
        "dbRole",
        "metrics"
    })
    public StandByDatabaseDataguardMetrics(
            String dbId,
            String compartmentId,
            String databaseId,
            String databaseName,
            String dbUniqueName,
            DbRole dbRole,
            java.util.List<HaMetricDefinition> metrics) {
        super();
        this.dbId = dbId;
        this.compartmentId = compartmentId;
        this.databaseId = databaseId;
        this.databaseName = databaseName;
        this.dbUniqueName = dbUniqueName;
        this.dbRole = dbRole;
        this.metrics = metrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbId")
        private String dbId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment where the Managed Database resides.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment where the Managed Database resides.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The database ID of the Managed Database. Every database had its own ID and that value is
         * captured here.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The database ID of the Managed Database. Every database had its own ID and that value is
         * captured here.
         *
         * @param databaseId the value to set
         * @return this builder
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /** The display name of the Managed Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
        private String databaseName;

        /**
         * The display name of the Managed Database.
         *
         * @param databaseName the value to set
         * @return this builder
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            this.__explicitlySet__.add("databaseName");
            return this;
        }
        /** The database unique name of the Managed Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        /**
         * The database unique name of the Managed Database.
         *
         * @param dbUniqueName the value to set
         * @return this builder
         */
        public Builder dbUniqueName(String dbUniqueName) {
            this.dbUniqueName = dbUniqueName;
            this.__explicitlySet__.add("dbUniqueName");
            return this;
        }
        /** The database role of the Managed Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbRole")
        private DbRole dbRole;

        /**
         * The database role of the Managed Database.
         *
         * @param dbRole the value to set
         * @return this builder
         */
        public Builder dbRole(DbRole dbRole) {
            this.dbRole = dbRole;
            this.__explicitlySet__.add("dbRole");
            return this;
        }
        /**
         * A list of standby databases with latest values for metrics such as ApplyLag,
         * TransportLag, and RedoApplyRate.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<HaMetricDefinition> metrics;

        /**
         * A list of standby databases with latest values for metrics such as ApplyLag,
         * TransportLag, and RedoApplyRate.
         *
         * @param metrics the value to set
         * @return this builder
         */
        public Builder metrics(java.util.List<HaMetricDefinition> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StandByDatabaseDataguardMetrics build() {
            StandByDatabaseDataguardMetrics model =
                    new StandByDatabaseDataguardMetrics(
                            this.dbId,
                            this.compartmentId,
                            this.databaseId,
                            this.databaseName,
                            this.dbUniqueName,
                            this.dbRole,
                            this.metrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StandByDatabaseDataguardMetrics model) {
            if (model.wasPropertyExplicitlySet("dbId")) {
                this.dbId(model.getDbId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("databaseName")) {
                this.databaseName(model.getDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("dbUniqueName")) {
                this.dbUniqueName(model.getDbUniqueName());
            }
            if (model.wasPropertyExplicitlySet("dbRole")) {
                this.dbRole(model.getDbRole());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbId")
    private final String dbId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     *
     * @return the value
     */
    public String getDbId() {
        return dbId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where the Managed Database resides.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment where the Managed Database resides.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The database ID of the Managed Database. Every database had its own ID and that value is
     * captured here.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The database ID of the Managed Database. Every database had its own ID and that value is
     * captured here.
     *
     * @return the value
     */
    public String getDatabaseId() {
        return databaseId;
    }

    /** The display name of the Managed Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

    /**
     * The display name of the Managed Database.
     *
     * @return the value
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /** The database unique name of the Managed Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    private final String dbUniqueName;

    /**
     * The database unique name of the Managed Database.
     *
     * @return the value
     */
    public String getDbUniqueName() {
        return dbUniqueName;
    }

    /** The database role of the Managed Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbRole")
    private final DbRole dbRole;

    /**
     * The database role of the Managed Database.
     *
     * @return the value
     */
    public DbRole getDbRole() {
        return dbRole;
    }

    /**
     * A list of standby databases with latest values for metrics such as ApplyLag, TransportLag,
     * and RedoApplyRate.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<HaMetricDefinition> metrics;

    /**
     * A list of standby databases with latest values for metrics such as ApplyLag, TransportLag,
     * and RedoApplyRate.
     *
     * @return the value
     */
    public java.util.List<HaMetricDefinition> getMetrics() {
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
        sb.append("StandByDatabaseDataguardMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("dbId=").append(String.valueOf(this.dbId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", dbRole=").append(String.valueOf(this.dbRole));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StandByDatabaseDataguardMetrics)) {
            return false;
        }

        StandByDatabaseDataguardMetrics other = (StandByDatabaseDataguardMetrics) o;
        return java.util.Objects.equals(this.dbId, other.dbId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.databaseName, other.databaseName)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(this.dbRole, other.dbRole)
                && java.util.Objects.equals(this.metrics, other.metrics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dbId == null ? 43 : this.dbId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
        result = (result * PRIME) + (this.dbRole == null ? 43 : this.dbRole.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

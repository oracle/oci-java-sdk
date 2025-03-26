/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The list of Data Guard performance metrics for Managed Databases.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PerformanceMetricsData.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PerformanceMetricsData
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "resourceId",
        "primaryDbId",
        "primaryDbUniqueName",
        "databaseId",
        "dbUniqueName",
        "deploymentType",
        "resourceName",
        "dbRole",
        "metrics"
    })
    public PerformanceMetricsData(
            String compartmentId,
            String resourceId,
            String primaryDbId,
            String primaryDbUniqueName,
            String databaseId,
            String dbUniqueName,
            String deploymentType,
            String resourceName,
            DbRole dbRole,
            java.util.List<PerformanceMetrics> metrics) {
        super();
        this.compartmentId = compartmentId;
        this.resourceId = resourceId;
        this.primaryDbId = primaryDbId;
        this.primaryDbUniqueName = primaryDbUniqueName;
        this.databaseId = databaseId;
        this.dbUniqueName = dbUniqueName;
        this.deploymentType = deploymentType;
        this.resourceName = resourceName;
        this.dbRole = dbRole;
        this.metrics = metrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which the Managed Database resides.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which the Managed Database resides.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * The ID of the primary database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("primaryDbId")
        private String primaryDbId;

        /**
         * The ID of the primary database.
         * @param primaryDbId the value to set
         * @return this builder
         **/
        public Builder primaryDbId(String primaryDbId) {
            this.primaryDbId = primaryDbId;
            this.__explicitlySet__.add("primaryDbId");
            return this;
        }
        /**
         * The primary database unique name of the Managed Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("primaryDbUniqueName")
        private String primaryDbUniqueName;

        /**
         * The primary database unique name of the Managed Database.
         * @param primaryDbUniqueName the value to set
         * @return this builder
         **/
        public Builder primaryDbUniqueName(String primaryDbUniqueName) {
            this.primaryDbUniqueName = primaryDbUniqueName;
            this.__explicitlySet__.add("primaryDbUniqueName");
            return this;
        }
        /**
         * The database ID of the Managed Database. Every database had its own ID and that value is captured here.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The database ID of the Managed Database. Every database had its own ID and that value is captured here.
         * @param databaseId the value to set
         * @return this builder
         **/
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /**
         * The database unique name of the Managed Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        /**
         * The database unique name of the Managed Database.
         * @param dbUniqueName the value to set
         * @return this builder
         **/
        public Builder dbUniqueName(String dbUniqueName) {
            this.dbUniqueName = dbUniqueName;
            this.__explicitlySet__.add("dbUniqueName");
            return this;
        }
        /**
         * The deployment type of the Managed Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private String deploymentType;

        /**
         * The deployment type of the Managed Database.
         * @param deploymentType the value to set
         * @return this builder
         **/
        public Builder deploymentType(String deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
            return this;
        }
        /**
         * The resource name of the Managed Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The resource name of the Managed Database.
         * @param resourceName the value to set
         * @return this builder
         **/
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /**
         * The database role of the Managed Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbRole")
        private DbRole dbRole;

        /**
         * The database role of the Managed Database.
         * @param dbRole the value to set
         * @return this builder
         **/
        public Builder dbRole(DbRole dbRole) {
            this.dbRole = dbRole;
            this.__explicitlySet__.add("dbRole");
            return this;
        }
        /**
         * The list of Data Guard performance metrics such as ApplyLag, TransportLag and RedoApplyRate for the Managed Databases.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<PerformanceMetrics> metrics;

        /**
         * The list of Data Guard performance metrics such as ApplyLag, TransportLag and RedoApplyRate for the Managed Databases.
         * @param metrics the value to set
         * @return this builder
         **/
        public Builder metrics(java.util.List<PerformanceMetrics> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PerformanceMetricsData build() {
            PerformanceMetricsData model =
                    new PerformanceMetricsData(
                            this.compartmentId,
                            this.resourceId,
                            this.primaryDbId,
                            this.primaryDbUniqueName,
                            this.databaseId,
                            this.dbUniqueName,
                            this.deploymentType,
                            this.resourceName,
                            this.dbRole,
                            this.metrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PerformanceMetricsData model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("primaryDbId")) {
                this.primaryDbId(model.getPrimaryDbId());
            }
            if (model.wasPropertyExplicitlySet("primaryDbUniqueName")) {
                this.primaryDbUniqueName(model.getPrimaryDbUniqueName());
            }
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("dbUniqueName")) {
                this.dbUniqueName(model.getDbUniqueName());
            }
            if (model.wasPropertyExplicitlySet("deploymentType")) {
                this.deploymentType(model.getDeploymentType());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
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

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which the Managed Database resides.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which the Managed Database resides.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database.
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * The ID of the primary database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("primaryDbId")
    private final String primaryDbId;

    /**
     * The ID of the primary database.
     * @return the value
     **/
    public String getPrimaryDbId() {
        return primaryDbId;
    }

    /**
     * The primary database unique name of the Managed Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("primaryDbUniqueName")
    private final String primaryDbUniqueName;

    /**
     * The primary database unique name of the Managed Database.
     * @return the value
     **/
    public String getPrimaryDbUniqueName() {
        return primaryDbUniqueName;
    }

    /**
     * The database ID of the Managed Database. Every database had its own ID and that value is captured here.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The database ID of the Managed Database. Every database had its own ID and that value is captured here.
     * @return the value
     **/
    public String getDatabaseId() {
        return databaseId;
    }

    /**
     * The database unique name of the Managed Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    private final String dbUniqueName;

    /**
     * The database unique name of the Managed Database.
     * @return the value
     **/
    public String getDbUniqueName() {
        return dbUniqueName;
    }

    /**
     * The deployment type of the Managed Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final String deploymentType;

    /**
     * The deployment type of the Managed Database.
     * @return the value
     **/
    public String getDeploymentType() {
        return deploymentType;
    }

    /**
     * The resource name of the Managed Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The resource name of the Managed Database.
     * @return the value
     **/
    public String getResourceName() {
        return resourceName;
    }

    /**
     * The database role of the Managed Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbRole")
    private final DbRole dbRole;

    /**
     * The database role of the Managed Database.
     * @return the value
     **/
    public DbRole getDbRole() {
        return dbRole;
    }

    /**
     * The list of Data Guard performance metrics such as ApplyLag, TransportLag and RedoApplyRate for the Managed Databases.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<PerformanceMetrics> metrics;

    /**
     * The list of Data Guard performance metrics such as ApplyLag, TransportLag and RedoApplyRate for the Managed Databases.
     * @return the value
     **/
    public java.util.List<PerformanceMetrics> getMetrics() {
        return metrics;
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
        sb.append("PerformanceMetricsData(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", primaryDbId=").append(String.valueOf(this.primaryDbId));
        sb.append(", primaryDbUniqueName=").append(String.valueOf(this.primaryDbUniqueName));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
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
        if (!(o instanceof PerformanceMetricsData)) {
            return false;
        }

        PerformanceMetricsData other = (PerformanceMetricsData) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.primaryDbId, other.primaryDbId)
                && java.util.Objects.equals(this.primaryDbUniqueName, other.primaryDbUniqueName)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(this.deploymentType, other.deploymentType)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.dbRole, other.dbRole)
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
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.primaryDbId == null ? 43 : this.primaryDbId.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryDbUniqueName == null
                                ? 43
                                : this.primaryDbUniqueName.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.dbRole == null ? 43 : this.dbRole.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

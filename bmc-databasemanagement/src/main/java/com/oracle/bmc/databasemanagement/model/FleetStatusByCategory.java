/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The number of databases in the fleet, grouped by database type and sub type.
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
    builder = FleetStatusByCategory.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FleetStatusByCategory {
    @Deprecated
    @java.beans.ConstructorProperties({
        "databaseType",
        "databaseSubType",
        "deploymentType",
        "inventoryCount"
    })
    public FleetStatusByCategory(
            DatabaseType databaseType,
            DatabaseSubType databaseSubType,
            DeploymentType deploymentType,
            Integer inventoryCount) {
        super();
        this.databaseType = databaseType;
        this.databaseSubType = databaseSubType;
        this.deploymentType = deploymentType;
        this.inventoryCount = inventoryCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of Oracle Database installation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private DatabaseType databaseType;

        /**
         * The type of Oracle Database installation.
         * @param databaseType the value to set
         * @return this builder
         **/
        public Builder databaseType(DatabaseType databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }
        /**
         * The subtype of the Oracle Database. Indicates whether the database is a Container Database,
         * Pluggable Database, Non-container Database, Autonomous Database, or Autonomous Container Database.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
        private DatabaseSubType databaseSubType;

        /**
         * The subtype of the Oracle Database. Indicates whether the database is a Container Database,
         * Pluggable Database, Non-container Database, Autonomous Database, or Autonomous Container Database.
         *
         * @param databaseSubType the value to set
         * @return this builder
         **/
        public Builder databaseSubType(DatabaseSubType databaseSubType) {
            this.databaseSubType = databaseSubType;
            this.__explicitlySet__.add("databaseSubType");
            return this;
        }
        /**
         * The infrastructure used to deploy the Oracle Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private DeploymentType deploymentType;

        /**
         * The infrastructure used to deploy the Oracle Database.
         * @param deploymentType the value to set
         * @return this builder
         **/
        public Builder deploymentType(DeploymentType deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
            return this;
        }
        /**
         * The number of databases in the fleet.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inventoryCount")
        private Integer inventoryCount;

        /**
         * The number of databases in the fleet.
         * @param inventoryCount the value to set
         * @return this builder
         **/
        public Builder inventoryCount(Integer inventoryCount) {
            this.inventoryCount = inventoryCount;
            this.__explicitlySet__.add("inventoryCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FleetStatusByCategory build() {
            FleetStatusByCategory __instance__ =
                    new FleetStatusByCategory(
                            databaseType, databaseSubType, deploymentType, inventoryCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetStatusByCategory o) {
            Builder copiedBuilder =
                    databaseType(o.getDatabaseType())
                            .databaseSubType(o.getDatabaseSubType())
                            .deploymentType(o.getDeploymentType())
                            .inventoryCount(o.getInventoryCount());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The type of Oracle Database installation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    private final DatabaseType databaseType;

    /**
     * The type of Oracle Database installation.
     * @return the value
     **/
    public DatabaseType getDatabaseType() {
        return databaseType;
    }

    /**
     * The subtype of the Oracle Database. Indicates whether the database is a Container Database,
     * Pluggable Database, Non-container Database, Autonomous Database, or Autonomous Container Database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
    private final DatabaseSubType databaseSubType;

    /**
     * The subtype of the Oracle Database. Indicates whether the database is a Container Database,
     * Pluggable Database, Non-container Database, Autonomous Database, or Autonomous Container Database.
     *
     * @return the value
     **/
    public DatabaseSubType getDatabaseSubType() {
        return databaseSubType;
    }

    /**
     * The infrastructure used to deploy the Oracle Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final DeploymentType deploymentType;

    /**
     * The infrastructure used to deploy the Oracle Database.
     * @return the value
     **/
    public DeploymentType getDeploymentType() {
        return deploymentType;
    }

    /**
     * The number of databases in the fleet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inventoryCount")
    private final Integer inventoryCount;

    /**
     * The number of databases in the fleet.
     * @return the value
     **/
    public Integer getInventoryCount() {
        return inventoryCount;
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
        sb.append("FleetStatusByCategory(");
        sb.append("databaseType=").append(String.valueOf(this.databaseType));
        sb.append(", databaseSubType=").append(String.valueOf(this.databaseSubType));
        sb.append(", deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", inventoryCount=").append(String.valueOf(this.inventoryCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FleetStatusByCategory)) {
            return false;
        }

        FleetStatusByCategory other = (FleetStatusByCategory) o;
        return java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.databaseSubType, other.databaseSubType)
                && java.util.Objects.equals(this.deploymentType, other.deploymentType)
                && java.util.Objects.equals(this.inventoryCount, other.inventoryCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseSubType == null ? 43 : this.databaseSubType.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result =
                (result * PRIME)
                        + (this.inventoryCount == null ? 43 : this.inventoryCount.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}

/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The number of MySQL Databases in the fleet, grouped by database type and sub type. <br>
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
        builder = MySqlFleetByCategory.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlFleetByCategory
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"databaseType", "mdsDeploymentType", "inventoryCount"})
    public MySqlFleetByCategory(
            String databaseType, String mdsDeploymentType, Integer inventoryCount) {
        super();
        this.databaseType = databaseType;
        this.mdsDeploymentType = mdsDeploymentType;
        this.inventoryCount = inventoryCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of the MySQL Database. Indicates whether the database is on premises or Oracle
         * Cloud. Allowed values are: MDS and ONPREMISE
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
        private String databaseType;

        /**
         * The type of the MySQL Database. Indicates whether the database is on premises or Oracle
         * Cloud. Allowed values are: MDS and ONPREMISE
         *
         * @param databaseType the value to set
         * @return this builder
         */
        public Builder databaseType(String databaseType) {
            this.databaseType = databaseType;
            this.__explicitlySet__.add("databaseType");
            return this;
        }
        /**
         * The type of MySQL Database installation. Allowed values are: STANDALONE, HEATWAVE and HA
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mdsDeploymentType")
        private String mdsDeploymentType;

        /**
         * The type of MySQL Database installation. Allowed values are: STANDALONE, HEATWAVE and HA
         *
         * @param mdsDeploymentType the value to set
         * @return this builder
         */
        public Builder mdsDeploymentType(String mdsDeploymentType) {
            this.mdsDeploymentType = mdsDeploymentType;
            this.__explicitlySet__.add("mdsDeploymentType");
            return this;
        }
        /** The number of MySQL Databases. */
        @com.fasterxml.jackson.annotation.JsonProperty("inventoryCount")
        private Integer inventoryCount;

        /**
         * The number of MySQL Databases.
         *
         * @param inventoryCount the value to set
         * @return this builder
         */
        public Builder inventoryCount(Integer inventoryCount) {
            this.inventoryCount = inventoryCount;
            this.__explicitlySet__.add("inventoryCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlFleetByCategory build() {
            MySqlFleetByCategory model =
                    new MySqlFleetByCategory(
                            this.databaseType, this.mdsDeploymentType, this.inventoryCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlFleetByCategory model) {
            if (model.wasPropertyExplicitlySet("databaseType")) {
                this.databaseType(model.getDatabaseType());
            }
            if (model.wasPropertyExplicitlySet("mdsDeploymentType")) {
                this.mdsDeploymentType(model.getMdsDeploymentType());
            }
            if (model.wasPropertyExplicitlySet("inventoryCount")) {
                this.inventoryCount(model.getInventoryCount());
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
     * The type of the MySQL Database. Indicates whether the database is on premises or Oracle
     * Cloud. Allowed values are: MDS and ONPREMISE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseType")
    private final String databaseType;

    /**
     * The type of the MySQL Database. Indicates whether the database is on premises or Oracle
     * Cloud. Allowed values are: MDS and ONPREMISE
     *
     * @return the value
     */
    public String getDatabaseType() {
        return databaseType;
    }

    /** The type of MySQL Database installation. Allowed values are: STANDALONE, HEATWAVE and HA */
    @com.fasterxml.jackson.annotation.JsonProperty("mdsDeploymentType")
    private final String mdsDeploymentType;

    /**
     * The type of MySQL Database installation. Allowed values are: STANDALONE, HEATWAVE and HA
     *
     * @return the value
     */
    public String getMdsDeploymentType() {
        return mdsDeploymentType;
    }

    /** The number of MySQL Databases. */
    @com.fasterxml.jackson.annotation.JsonProperty("inventoryCount")
    private final Integer inventoryCount;

    /**
     * The number of MySQL Databases.
     *
     * @return the value
     */
    public Integer getInventoryCount() {
        return inventoryCount;
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
        sb.append("MySqlFleetByCategory(");
        sb.append("super=").append(super.toString());
        sb.append("databaseType=").append(String.valueOf(this.databaseType));
        sb.append(", mdsDeploymentType=").append(String.valueOf(this.mdsDeploymentType));
        sb.append(", inventoryCount=").append(String.valueOf(this.inventoryCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlFleetByCategory)) {
            return false;
        }

        MySqlFleetByCategory other = (MySqlFleetByCategory) o;
        return java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.mdsDeploymentType, other.mdsDeploymentType)
                && java.util.Objects.equals(this.inventoryCount, other.inventoryCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.mdsDeploymentType == null ? 43 : this.mdsDeploymentType.hashCode());
        result =
                (result * PRIME)
                        + (this.inventoryCount == null ? 43 : this.inventoryCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

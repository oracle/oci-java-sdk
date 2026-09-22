/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Target DB System details for a blue/green deployment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BlueGreenDeploymentTargetDbSystemDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BlueGreenDeploymentTargetDbSystemDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "mysqlVersion",
        "shapeName",
        "configurationId",
        "dataStorageSizeInGBs"
    })
    public BlueGreenDeploymentTargetDbSystemDetails(
            String mysqlVersion,
            String shapeName,
            String configurationId,
            Integer dataStorageSizeInGBs) {
        super();
        this.mysqlVersion = mysqlVersion;
        this.shapeName = shapeName;
        this.configurationId = configurationId;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Target MySQL engine version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
        private String mysqlVersion;

        /**
         * Target MySQL engine version.
         * @param mysqlVersion the value to set
         * @return this builder
         **/
        public Builder mysqlVersion(String mysqlVersion) {
            this.mysqlVersion = mysqlVersion;
            this.__explicitlySet__.add("mysqlVersion");
            return this;
        }
        /**
         * The shape of the target DB System. The shape determines resources
         * allocated to the DB System - CPU cores and memory for VM shapes;
         * CPU cores, memory and storage for non-VM (or bare metal) shapes.
         * To get a list of shapes, use the
         * {@link #listShapes(ListShapesRequest) listShapes} operation.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * The shape of the target DB System. The shape determines resources
         * allocated to the DB System - CPU cores and memory for VM shapes;
         * CPU cores, memory and storage for non-VM (or bare metal) shapes.
         * To get a list of shapes, use the
         * {@link #listShapes(ListShapesRequest) listShapes} operation.
         *
         * @param shapeName the value to set
         * @return this builder
         **/
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the configuration applied to the target DB System.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configurationId")
        private String configurationId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the configuration applied to the target DB System.
         * @param configurationId the value to set
         * @return this builder
         **/
        public Builder configurationId(String configurationId) {
            this.configurationId = configurationId;
            this.__explicitlySet__.add("configurationId");
            return this;
        }
        /**
         * Initial data storage size in GiBs for the target DB System.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        /**
         * Initial data storage size in GiBs for the target DB System.
         * @param dataStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder dataStorageSizeInGBs(Integer dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BlueGreenDeploymentTargetDbSystemDetails build() {
            BlueGreenDeploymentTargetDbSystemDetails model =
                    new BlueGreenDeploymentTargetDbSystemDetails(
                            this.mysqlVersion,
                            this.shapeName,
                            this.configurationId,
                            this.dataStorageSizeInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BlueGreenDeploymentTargetDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("mysqlVersion")) {
                this.mysqlVersion(model.getMysqlVersion());
            }
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
            }
            if (model.wasPropertyExplicitlySet("configurationId")) {
                this.configurationId(model.getConfigurationId());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGBs")) {
                this.dataStorageSizeInGBs(model.getDataStorageSizeInGBs());
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
     * Target MySQL engine version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
    private final String mysqlVersion;

    /**
     * Target MySQL engine version.
     * @return the value
     **/
    public String getMysqlVersion() {
        return mysqlVersion;
    }

    /**
     * The shape of the target DB System. The shape determines resources
     * allocated to the DB System - CPU cores and memory for VM shapes;
     * CPU cores, memory and storage for non-VM (or bare metal) shapes.
     * To get a list of shapes, use the
     * {@link #listShapes(ListShapesRequest) listShapes} operation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * The shape of the target DB System. The shape determines resources
     * allocated to the DB System - CPU cores and memory for VM shapes;
     * CPU cores, memory and storage for non-VM (or bare metal) shapes.
     * To get a list of shapes, use the
     * {@link #listShapes(ListShapesRequest) listShapes} operation.
     *
     * @return the value
     **/
    public String getShapeName() {
        return shapeName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the configuration applied to the target DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configurationId")
    private final String configurationId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the configuration applied to the target DB System.
     * @return the value
     **/
    public String getConfigurationId() {
        return configurationId;
    }

    /**
     * Initial data storage size in GiBs for the target DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Integer dataStorageSizeInGBs;

    /**
     * Initial data storage size in GiBs for the target DB System.
     * @return the value
     **/
    public Integer getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
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
        sb.append("BlueGreenDeploymentTargetDbSystemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("mysqlVersion=").append(String.valueOf(this.mysqlVersion));
        sb.append(", shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", configurationId=").append(String.valueOf(this.configurationId));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BlueGreenDeploymentTargetDbSystemDetails)) {
            return false;
        }

        BlueGreenDeploymentTargetDbSystemDetails other =
                (BlueGreenDeploymentTargetDbSystemDetails) o;
        return java.util.Objects.equals(this.mysqlVersion, other.mysqlVersion)
                && java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.configurationId, other.configurationId)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.mysqlVersion == null ? 43 : this.mysqlVersion.hashCode());
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationId == null ? 43 : this.configurationId.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

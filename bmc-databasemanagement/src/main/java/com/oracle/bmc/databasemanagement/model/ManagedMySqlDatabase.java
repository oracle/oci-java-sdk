/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of the Managed MySQL Database.
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
    builder = ManagedMySqlDatabase.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagedMySqlDatabase extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "dbName",
        "dbVersion",
        "timeCreated",
        "name",
        "heatWaveClusterDisplayName",
        "isHeatWaveEnabled",
        "isLakehouseEnabled",
        "heatWaveNodeShape",
        "heatWaveMemorySize",
        "heatWaveNodes",
        "isHeatWaveActive",
        "timeCreatedHeatWave"
    })
    public ManagedMySqlDatabase(
            String id,
            String compartmentId,
            String dbName,
            String dbVersion,
            java.util.Date timeCreated,
            String name,
            String heatWaveClusterDisplayName,
            Boolean isHeatWaveEnabled,
            Boolean isLakehouseEnabled,
            String heatWaveNodeShape,
            Integer heatWaveMemorySize,
            java.util.List<HeatWaveNode> heatWaveNodes,
            Boolean isHeatWaveActive,
            java.util.Date timeCreatedHeatWave) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.dbName = dbName;
        this.dbVersion = dbVersion;
        this.timeCreated = timeCreated;
        this.name = name;
        this.heatWaveClusterDisplayName = heatWaveClusterDisplayName;
        this.isHeatWaveEnabled = isHeatWaveEnabled;
        this.isLakehouseEnabled = isLakehouseEnabled;
        this.heatWaveNodeShape = heatWaveNodeShape;
        this.heatWaveMemorySize = heatWaveMemorySize;
        this.heatWaveNodes = heatWaveNodes;
        this.isHeatWaveActive = isHeatWaveActive;
        this.timeCreatedHeatWave = timeCreatedHeatWave;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the Managed MySQL Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the Managed MySQL Database.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The name of the MySQL Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        /**
         * The name of the MySQL Database.
         * @param dbName the value to set
         * @return this builder
         **/
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
            return this;
        }
        /**
         * The version of the MySQL Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * The version of the MySQL Database.
         * @param dbVersion the value to set
         * @return this builder
         **/
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }
        /**
         * The date and time the Managed MySQL Database was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Managed MySQL Database was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The name of the Managed MySQL Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the Managed MySQL Database.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The name of the HeatWave cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("heatWaveClusterDisplayName")
        private String heatWaveClusterDisplayName;

        /**
         * The name of the HeatWave cluster.
         * @param heatWaveClusterDisplayName the value to set
         * @return this builder
         **/
        public Builder heatWaveClusterDisplayName(String heatWaveClusterDisplayName) {
            this.heatWaveClusterDisplayName = heatWaveClusterDisplayName;
            this.__explicitlySet__.add("heatWaveClusterDisplayName");
            return this;
        }
        /**
         * Indicates whether HeatWave is enabled for the MySQL Database System or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHeatWaveEnabled")
        private Boolean isHeatWaveEnabled;

        /**
         * Indicates whether HeatWave is enabled for the MySQL Database System or not.
         * @param isHeatWaveEnabled the value to set
         * @return this builder
         **/
        public Builder isHeatWaveEnabled(Boolean isHeatWaveEnabled) {
            this.isHeatWaveEnabled = isHeatWaveEnabled;
            this.__explicitlySet__.add("isHeatWaveEnabled");
            return this;
        }
        /**
         * Indicates whether HeatWave Lakehouse is enabled for the MySQL Database System or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isLakehouseEnabled")
        private Boolean isLakehouseEnabled;

        /**
         * Indicates whether HeatWave Lakehouse is enabled for the MySQL Database System or not.
         * @param isLakehouseEnabled the value to set
         * @return this builder
         **/
        public Builder isLakehouseEnabled(Boolean isLakehouseEnabled) {
            this.isLakehouseEnabled = isLakehouseEnabled;
            this.__explicitlySet__.add("isLakehouseEnabled");
            return this;
        }
        /**
         * The shape of the nodes in the HeatWave cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("heatWaveNodeShape")
        private String heatWaveNodeShape;

        /**
         * The shape of the nodes in the HeatWave cluster.
         * @param heatWaveNodeShape the value to set
         * @return this builder
         **/
        public Builder heatWaveNodeShape(String heatWaveNodeShape) {
            this.heatWaveNodeShape = heatWaveNodeShape;
            this.__explicitlySet__.add("heatWaveNodeShape");
            return this;
        }
        /**
         * The total memory belonging to the HeatWave cluster in GBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("heatWaveMemorySize")
        private Integer heatWaveMemorySize;

        /**
         * The total memory belonging to the HeatWave cluster in GBs.
         * @param heatWaveMemorySize the value to set
         * @return this builder
         **/
        public Builder heatWaveMemorySize(Integer heatWaveMemorySize) {
            this.heatWaveMemorySize = heatWaveMemorySize;
            this.__explicitlySet__.add("heatWaveMemorySize");
            return this;
        }
        /**
         * The information about individual HeatWave nodes in the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("heatWaveNodes")
        private java.util.List<HeatWaveNode> heatWaveNodes;

        /**
         * The information about individual HeatWave nodes in the cluster.
         * @param heatWaveNodes the value to set
         * @return this builder
         **/
        public Builder heatWaveNodes(java.util.List<HeatWaveNode> heatWaveNodes) {
            this.heatWaveNodes = heatWaveNodes;
            this.__explicitlySet__.add("heatWaveNodes");
            return this;
        }
        /**
         * Indicates whether the HeatWave cluster is active or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHeatWaveActive")
        private Boolean isHeatWaveActive;

        /**
         * Indicates whether the HeatWave cluster is active or not.
         * @param isHeatWaveActive the value to set
         * @return this builder
         **/
        public Builder isHeatWaveActive(Boolean isHeatWaveActive) {
            this.isHeatWaveActive = isHeatWaveActive;
            this.__explicitlySet__.add("isHeatWaveActive");
            return this;
        }
        /**
         * The date and time the Managed MySQL Database was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreatedHeatWave")
        private java.util.Date timeCreatedHeatWave;

        /**
         * The date and time the Managed MySQL Database was created.
         * @param timeCreatedHeatWave the value to set
         * @return this builder
         **/
        public Builder timeCreatedHeatWave(java.util.Date timeCreatedHeatWave) {
            this.timeCreatedHeatWave = timeCreatedHeatWave;
            this.__explicitlySet__.add("timeCreatedHeatWave");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedMySqlDatabase build() {
            ManagedMySqlDatabase model =
                    new ManagedMySqlDatabase(
                            this.id,
                            this.compartmentId,
                            this.dbName,
                            this.dbVersion,
                            this.timeCreated,
                            this.name,
                            this.heatWaveClusterDisplayName,
                            this.isHeatWaveEnabled,
                            this.isLakehouseEnabled,
                            this.heatWaveNodeShape,
                            this.heatWaveMemorySize,
                            this.heatWaveNodes,
                            this.isHeatWaveActive,
                            this.timeCreatedHeatWave);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedMySqlDatabase model) {
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
            if (model.wasPropertyExplicitlySet("heatWaveClusterDisplayName")) {
                this.heatWaveClusterDisplayName(model.getHeatWaveClusterDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isHeatWaveEnabled")) {
                this.isHeatWaveEnabled(model.getIsHeatWaveEnabled());
            }
            if (model.wasPropertyExplicitlySet("isLakehouseEnabled")) {
                this.isLakehouseEnabled(model.getIsLakehouseEnabled());
            }
            if (model.wasPropertyExplicitlySet("heatWaveNodeShape")) {
                this.heatWaveNodeShape(model.getHeatWaveNodeShape());
            }
            if (model.wasPropertyExplicitlySet("heatWaveMemorySize")) {
                this.heatWaveMemorySize(model.getHeatWaveMemorySize());
            }
            if (model.wasPropertyExplicitlySet("heatWaveNodes")) {
                this.heatWaveNodes(model.getHeatWaveNodes());
            }
            if (model.wasPropertyExplicitlySet("isHeatWaveActive")) {
                this.isHeatWaveActive(model.getIsHeatWaveActive());
            }
            if (model.wasPropertyExplicitlySet("timeCreatedHeatWave")) {
                this.timeCreatedHeatWave(model.getTimeCreatedHeatWave());
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
     * The OCID of the Managed MySQL Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the Managed MySQL Database.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name of the MySQL Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    private final String dbName;

    /**
     * The name of the MySQL Database.
     * @return the value
     **/
    public String getDbName() {
        return dbName;
    }

    /**
     * The version of the MySQL Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * The version of the MySQL Database.
     * @return the value
     **/
    public String getDbVersion() {
        return dbVersion;
    }

    /**
     * The date and time the Managed MySQL Database was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Managed MySQL Database was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The name of the Managed MySQL Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the Managed MySQL Database.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The name of the HeatWave cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("heatWaveClusterDisplayName")
    private final String heatWaveClusterDisplayName;

    /**
     * The name of the HeatWave cluster.
     * @return the value
     **/
    public String getHeatWaveClusterDisplayName() {
        return heatWaveClusterDisplayName;
    }

    /**
     * Indicates whether HeatWave is enabled for the MySQL Database System or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHeatWaveEnabled")
    private final Boolean isHeatWaveEnabled;

    /**
     * Indicates whether HeatWave is enabled for the MySQL Database System or not.
     * @return the value
     **/
    public Boolean getIsHeatWaveEnabled() {
        return isHeatWaveEnabled;
    }

    /**
     * Indicates whether HeatWave Lakehouse is enabled for the MySQL Database System or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLakehouseEnabled")
    private final Boolean isLakehouseEnabled;

    /**
     * Indicates whether HeatWave Lakehouse is enabled for the MySQL Database System or not.
     * @return the value
     **/
    public Boolean getIsLakehouseEnabled() {
        return isLakehouseEnabled;
    }

    /**
     * The shape of the nodes in the HeatWave cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("heatWaveNodeShape")
    private final String heatWaveNodeShape;

    /**
     * The shape of the nodes in the HeatWave cluster.
     * @return the value
     **/
    public String getHeatWaveNodeShape() {
        return heatWaveNodeShape;
    }

    /**
     * The total memory belonging to the HeatWave cluster in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("heatWaveMemorySize")
    private final Integer heatWaveMemorySize;

    /**
     * The total memory belonging to the HeatWave cluster in GBs.
     * @return the value
     **/
    public Integer getHeatWaveMemorySize() {
        return heatWaveMemorySize;
    }

    /**
     * The information about individual HeatWave nodes in the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("heatWaveNodes")
    private final java.util.List<HeatWaveNode> heatWaveNodes;

    /**
     * The information about individual HeatWave nodes in the cluster.
     * @return the value
     **/
    public java.util.List<HeatWaveNode> getHeatWaveNodes() {
        return heatWaveNodes;
    }

    /**
     * Indicates whether the HeatWave cluster is active or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHeatWaveActive")
    private final Boolean isHeatWaveActive;

    /**
     * Indicates whether the HeatWave cluster is active or not.
     * @return the value
     **/
    public Boolean getIsHeatWaveActive() {
        return isHeatWaveActive;
    }

    /**
     * The date and time the Managed MySQL Database was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreatedHeatWave")
    private final java.util.Date timeCreatedHeatWave;

    /**
     * The date and time the Managed MySQL Database was created.
     * @return the value
     **/
    public java.util.Date getTimeCreatedHeatWave() {
        return timeCreatedHeatWave;
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
        sb.append("ManagedMySqlDatabase(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dbName=").append(String.valueOf(this.dbName));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", heatWaveClusterDisplayName=")
                .append(String.valueOf(this.heatWaveClusterDisplayName));
        sb.append(", isHeatWaveEnabled=").append(String.valueOf(this.isHeatWaveEnabled));
        sb.append(", isLakehouseEnabled=").append(String.valueOf(this.isLakehouseEnabled));
        sb.append(", heatWaveNodeShape=").append(String.valueOf(this.heatWaveNodeShape));
        sb.append(", heatWaveMemorySize=").append(String.valueOf(this.heatWaveMemorySize));
        sb.append(", heatWaveNodes=").append(String.valueOf(this.heatWaveNodes));
        sb.append(", isHeatWaveActive=").append(String.valueOf(this.isHeatWaveActive));
        sb.append(", timeCreatedHeatWave=").append(String.valueOf(this.timeCreatedHeatWave));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedMySqlDatabase)) {
            return false;
        }

        ManagedMySqlDatabase other = (ManagedMySqlDatabase) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(
                        this.heatWaveClusterDisplayName, other.heatWaveClusterDisplayName)
                && java.util.Objects.equals(this.isHeatWaveEnabled, other.isHeatWaveEnabled)
                && java.util.Objects.equals(this.isLakehouseEnabled, other.isLakehouseEnabled)
                && java.util.Objects.equals(this.heatWaveNodeShape, other.heatWaveNodeShape)
                && java.util.Objects.equals(this.heatWaveMemorySize, other.heatWaveMemorySize)
                && java.util.Objects.equals(this.heatWaveNodes, other.heatWaveNodes)
                && java.util.Objects.equals(this.isHeatWaveActive, other.isHeatWaveActive)
                && java.util.Objects.equals(this.timeCreatedHeatWave, other.timeCreatedHeatWave)
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
        result =
                (result * PRIME)
                        + (this.heatWaveClusterDisplayName == null
                                ? 43
                                : this.heatWaveClusterDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.isHeatWaveEnabled == null ? 43 : this.isHeatWaveEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isLakehouseEnabled == null
                                ? 43
                                : this.isLakehouseEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.heatWaveNodeShape == null ? 43 : this.heatWaveNodeShape.hashCode());
        result =
                (result * PRIME)
                        + (this.heatWaveMemorySize == null
                                ? 43
                                : this.heatWaveMemorySize.hashCode());
        result =
                (result * PRIME)
                        + (this.heatWaveNodes == null ? 43 : this.heatWaveNodes.hashCode());
        result =
                (result * PRIME)
                        + (this.isHeatWaveActive == null ? 43 : this.isHeatWaveActive.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedHeatWave == null
                                ? 43
                                : this.timeCreatedHeatWave.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

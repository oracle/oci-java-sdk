/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Configuration Summary of a MDS MYSQL database.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MdsMysqlDatabaseConfigurationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entitySource"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MdsMysqlDatabaseConfigurationSummary extends DatabaseConfigurationSummary {
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
         * @param databaseId the value to set
         * @return this builder
         **/
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /**
         * Specifies if MYSQL DB System has heatwave cluster attached.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHeatWaveClusterAttached")
        private Boolean isHeatWaveClusterAttached;

        /**
         * Specifies if MYSQL DB System has heatwave cluster attached.
         * @param isHeatWaveClusterAttached the value to set
         * @return this builder
         **/
        public Builder isHeatWaveClusterAttached(Boolean isHeatWaveClusterAttached) {
            this.isHeatWaveClusterAttached = isHeatWaveClusterAttached;
            this.__explicitlySet__.add("isHeatWaveClusterAttached");
            return this;
        }
        /**
         * Specifies if MYSQL DB System is highly available.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHighlyAvailable")
        private Boolean isHighlyAvailable;

        /**
         * Specifies if MYSQL DB System is highly available.
         * @param isHighlyAvailable the value to set
         * @return this builder
         **/
        public Builder isHighlyAvailable(Boolean isHighlyAvailable) {
            this.isHighlyAvailable = isHighlyAvailable;
            this.__explicitlySet__.add("isHighlyAvailable");
            return this;
        }
        /**
         * The shape of the primary instances of MYSQL DB system. The shape determines resources allocated to a DB System - CPU cores
         * and memory for VM shapes; CPU cores, memory and storage for non-VM shapes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * The shape of the primary instances of MYSQL DB system. The shape determines resources allocated to a DB System - CPU cores
         * and memory for VM shapes; CPU cores, memory and storage for non-VM shapes.
         *
         * @param shapeName the value to set
         * @return this builder
         **/
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MdsMysqlDatabaseConfigurationSummary build() {
            MdsMysqlDatabaseConfigurationSummary model =
                    new MdsMysqlDatabaseConfigurationSummary(
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
                            this.isHeatWaveClusterAttached,
                            this.isHighlyAvailable,
                            this.shapeName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MdsMysqlDatabaseConfigurationSummary model) {
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
            if (model.wasPropertyExplicitlySet("isHeatWaveClusterAttached")) {
                this.isHeatWaveClusterAttached(model.getIsHeatWaveClusterAttached());
            }
            if (model.wasPropertyExplicitlySet("isHighlyAvailable")) {
                this.isHighlyAvailable(model.getIsHighlyAvailable());
            }
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
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

    @Deprecated
    public MdsMysqlDatabaseConfigurationSummary(
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
            Boolean isHeatWaveClusterAttached,
            Boolean isHighlyAvailable,
            String shapeName) {
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
        this.isHeatWaveClusterAttached = isHeatWaveClusterAttached;
        this.isHighlyAvailable = isHighlyAvailable;
        this.shapeName = shapeName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
     * @return the value
     **/
    public String getDatabaseId() {
        return databaseId;
    }

    /**
     * Specifies if MYSQL DB System has heatwave cluster attached.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHeatWaveClusterAttached")
    private final Boolean isHeatWaveClusterAttached;

    /**
     * Specifies if MYSQL DB System has heatwave cluster attached.
     * @return the value
     **/
    public Boolean getIsHeatWaveClusterAttached() {
        return isHeatWaveClusterAttached;
    }

    /**
     * Specifies if MYSQL DB System is highly available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHighlyAvailable")
    private final Boolean isHighlyAvailable;

    /**
     * Specifies if MYSQL DB System is highly available.
     * @return the value
     **/
    public Boolean getIsHighlyAvailable() {
        return isHighlyAvailable;
    }

    /**
     * The shape of the primary instances of MYSQL DB system. The shape determines resources allocated to a DB System - CPU cores
     * and memory for VM shapes; CPU cores, memory and storage for non-VM shapes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * The shape of the primary instances of MYSQL DB system. The shape determines resources allocated to a DB System - CPU cores
     * and memory for VM shapes; CPU cores, memory and storage for non-VM shapes.
     *
     * @return the value
     **/
    public String getShapeName() {
        return shapeName;
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
        sb.append("MdsMysqlDatabaseConfigurationSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", isHeatWaveClusterAttached=")
                .append(String.valueOf(this.isHeatWaveClusterAttached));
        sb.append(", isHighlyAvailable=").append(String.valueOf(this.isHighlyAvailable));
        sb.append(", shapeName=").append(String.valueOf(this.shapeName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MdsMysqlDatabaseConfigurationSummary)) {
            return false;
        }

        MdsMysqlDatabaseConfigurationSummary other = (MdsMysqlDatabaseConfigurationSummary) o;
        return java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(
                        this.isHeatWaveClusterAttached, other.isHeatWaveClusterAttached)
                && java.util.Objects.equals(this.isHighlyAvailable, other.isHighlyAvailable)
                && java.util.Objects.equals(this.shapeName, other.shapeName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.isHeatWaveClusterAttached == null
                                ? 43
                                : this.isHeatWaveClusterAttached.hashCode());
        result =
                (result * PRIME)
                        + (this.isHighlyAvailable == null ? 43 : this.isHighlyAvailable.hashCode());
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        return result;
    }
}

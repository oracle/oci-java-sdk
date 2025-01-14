/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The list of aggregated metrics for a HeatWave cluster in the fleet. <br>
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
        builder = HeatWaveClusterUsageMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HeatWaveClusterUsageMetrics
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "status",
        "dbSystemId",
        "dbSystemName",
        "heatWaveClusterDisplayName",
        "nodeCount",
        "isLakehouseEnabled",
        "heatWaveNodeShape",
        "memorySize",
        "metrics"
    })
    public HeatWaveClusterUsageMetrics(
            HeatWaveClusterStatus status,
            String dbSystemId,
            String dbSystemName,
            String heatWaveClusterDisplayName,
            Integer nodeCount,
            Boolean isLakehouseEnabled,
            String heatWaveNodeShape,
            Integer memorySize,
            java.util.List<HeatWaveFleetMetricDefinition> metrics) {
        super();
        this.status = status;
        this.dbSystemId = dbSystemId;
        this.dbSystemName = dbSystemName;
        this.heatWaveClusterDisplayName = heatWaveClusterDisplayName;
        this.nodeCount = nodeCount;
        this.isLakehouseEnabled = isLakehouseEnabled;
        this.heatWaveNodeShape = heatWaveNodeShape;
        this.memorySize = memorySize;
        this.metrics = metrics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The status of the HeatWave cluster. Indicates whether the status of the cluster is UP,
         * DOWN, or UNKNOWN at the current time.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private HeatWaveClusterStatus status;

        /**
         * The status of the HeatWave cluster. Indicates whether the status of the cluster is UP,
         * DOWN, or UNKNOWN at the current time.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(HeatWaveClusterStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The OCID of the MySQL Database System associated with the HeatWave cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The OCID of the MySQL Database System associated with the HeatWave cluster.
         *
         * @param dbSystemId the value to set
         * @return this builder
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }
        /** The name of the MySQL Database System associated with the HeatWave cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemName")
        private String dbSystemName;

        /**
         * The name of the MySQL Database System associated with the HeatWave cluster.
         *
         * @param dbSystemName the value to set
         * @return this builder
         */
        public Builder dbSystemName(String dbSystemName) {
            this.dbSystemName = dbSystemName;
            this.__explicitlySet__.add("dbSystemName");
            return this;
        }
        /** The name of the HeatWave cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("heatWaveClusterDisplayName")
        private String heatWaveClusterDisplayName;

        /**
         * The name of the HeatWave cluster.
         *
         * @param heatWaveClusterDisplayName the value to set
         * @return this builder
         */
        public Builder heatWaveClusterDisplayName(String heatWaveClusterDisplayName) {
            this.heatWaveClusterDisplayName = heatWaveClusterDisplayName;
            this.__explicitlySet__.add("heatWaveClusterDisplayName");
            return this;
        }
        /** The number of nodes in the HeatWave cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        /**
         * The number of nodes in the HeatWave cluster.
         *
         * @param nodeCount the value to set
         * @return this builder
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }
        /** Indicates whether Lakehouse is enabled for the HeatWave cluster or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isLakehouseEnabled")
        private Boolean isLakehouseEnabled;

        /**
         * Indicates whether Lakehouse is enabled for the HeatWave cluster or not.
         *
         * @param isLakehouseEnabled the value to set
         * @return this builder
         */
        public Builder isLakehouseEnabled(Boolean isLakehouseEnabled) {
            this.isLakehouseEnabled = isLakehouseEnabled;
            this.__explicitlySet__.add("isLakehouseEnabled");
            return this;
        }
        /** The shape of the nodes in the HeatWave cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("heatWaveNodeShape")
        private String heatWaveNodeShape;

        /**
         * The shape of the nodes in the HeatWave cluster.
         *
         * @param heatWaveNodeShape the value to set
         * @return this builder
         */
        public Builder heatWaveNodeShape(String heatWaveNodeShape) {
            this.heatWaveNodeShape = heatWaveNodeShape;
            this.__explicitlySet__.add("heatWaveNodeShape");
            return this;
        }
        /** The total memory belonging to the HeatWave cluster in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("memorySize")
        private Integer memorySize;

        /**
         * The total memory belonging to the HeatWave cluster in GBs.
         *
         * @param memorySize the value to set
         * @return this builder
         */
        public Builder memorySize(Integer memorySize) {
            this.memorySize = memorySize;
            this.__explicitlySet__.add("memorySize");
            return this;
        }
        /** A list of the HeatWave cluster health metrics like CPU and Memory. */
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<HeatWaveFleetMetricDefinition> metrics;

        /**
         * A list of the HeatWave cluster health metrics like CPU and Memory.
         *
         * @param metrics the value to set
         * @return this builder
         */
        public Builder metrics(java.util.List<HeatWaveFleetMetricDefinition> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HeatWaveClusterUsageMetrics build() {
            HeatWaveClusterUsageMetrics model =
                    new HeatWaveClusterUsageMetrics(
                            this.status,
                            this.dbSystemId,
                            this.dbSystemName,
                            this.heatWaveClusterDisplayName,
                            this.nodeCount,
                            this.isLakehouseEnabled,
                            this.heatWaveNodeShape,
                            this.memorySize,
                            this.metrics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HeatWaveClusterUsageMetrics model) {
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("dbSystemName")) {
                this.dbSystemName(model.getDbSystemName());
            }
            if (model.wasPropertyExplicitlySet("heatWaveClusterDisplayName")) {
                this.heatWaveClusterDisplayName(model.getHeatWaveClusterDisplayName());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("isLakehouseEnabled")) {
                this.isLakehouseEnabled(model.getIsLakehouseEnabled());
            }
            if (model.wasPropertyExplicitlySet("heatWaveNodeShape")) {
                this.heatWaveNodeShape(model.getHeatWaveNodeShape());
            }
            if (model.wasPropertyExplicitlySet("memorySize")) {
                this.memorySize(model.getMemorySize());
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
     * The status of the HeatWave cluster. Indicates whether the status of the cluster is UP, DOWN,
     * or UNKNOWN at the current time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final HeatWaveClusterStatus status;

    /**
     * The status of the HeatWave cluster. Indicates whether the status of the cluster is UP, DOWN,
     * or UNKNOWN at the current time.
     *
     * @return the value
     */
    public HeatWaveClusterStatus getStatus() {
        return status;
    }

    /** The OCID of the MySQL Database System associated with the HeatWave cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The OCID of the MySQL Database System associated with the HeatWave cluster.
     *
     * @return the value
     */
    public String getDbSystemId() {
        return dbSystemId;
    }

    /** The name of the MySQL Database System associated with the HeatWave cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemName")
    private final String dbSystemName;

    /**
     * The name of the MySQL Database System associated with the HeatWave cluster.
     *
     * @return the value
     */
    public String getDbSystemName() {
        return dbSystemName;
    }

    /** The name of the HeatWave cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("heatWaveClusterDisplayName")
    private final String heatWaveClusterDisplayName;

    /**
     * The name of the HeatWave cluster.
     *
     * @return the value
     */
    public String getHeatWaveClusterDisplayName() {
        return heatWaveClusterDisplayName;
    }

    /** The number of nodes in the HeatWave cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * The number of nodes in the HeatWave cluster.
     *
     * @return the value
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /** Indicates whether Lakehouse is enabled for the HeatWave cluster or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isLakehouseEnabled")
    private final Boolean isLakehouseEnabled;

    /**
     * Indicates whether Lakehouse is enabled for the HeatWave cluster or not.
     *
     * @return the value
     */
    public Boolean getIsLakehouseEnabled() {
        return isLakehouseEnabled;
    }

    /** The shape of the nodes in the HeatWave cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("heatWaveNodeShape")
    private final String heatWaveNodeShape;

    /**
     * The shape of the nodes in the HeatWave cluster.
     *
     * @return the value
     */
    public String getHeatWaveNodeShape() {
        return heatWaveNodeShape;
    }

    /** The total memory belonging to the HeatWave cluster in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("memorySize")
    private final Integer memorySize;

    /**
     * The total memory belonging to the HeatWave cluster in GBs.
     *
     * @return the value
     */
    public Integer getMemorySize() {
        return memorySize;
    }

    /** A list of the HeatWave cluster health metrics like CPU and Memory. */
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<HeatWaveFleetMetricDefinition> metrics;

    /**
     * A list of the HeatWave cluster health metrics like CPU and Memory.
     *
     * @return the value
     */
    public java.util.List<HeatWaveFleetMetricDefinition> getMetrics() {
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
        sb.append("HeatWaveClusterUsageMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", dbSystemName=").append(String.valueOf(this.dbSystemName));
        sb.append(", heatWaveClusterDisplayName=")
                .append(String.valueOf(this.heatWaveClusterDisplayName));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", isLakehouseEnabled=").append(String.valueOf(this.isLakehouseEnabled));
        sb.append(", heatWaveNodeShape=").append(String.valueOf(this.heatWaveNodeShape));
        sb.append(", memorySize=").append(String.valueOf(this.memorySize));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HeatWaveClusterUsageMetrics)) {
            return false;
        }

        HeatWaveClusterUsageMetrics other = (HeatWaveClusterUsageMetrics) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.dbSystemName, other.dbSystemName)
                && java.util.Objects.equals(
                        this.heatWaveClusterDisplayName, other.heatWaveClusterDisplayName)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.isLakehouseEnabled, other.isLakehouseEnabled)
                && java.util.Objects.equals(this.heatWaveNodeShape, other.heatWaveNodeShape)
                && java.util.Objects.equals(this.memorySize, other.memorySize)
                && java.util.Objects.equals(this.metrics, other.metrics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result = (result * PRIME) + (this.dbSystemName == null ? 43 : this.dbSystemName.hashCode());
        result =
                (result * PRIME)
                        + (this.heatWaveClusterDisplayName == null
                                ? 43
                                : this.heatWaveClusterDisplayName.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.isLakehouseEnabled == null
                                ? 43
                                : this.isLakehouseEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.heatWaveNodeShape == null ? 43 : this.heatWaveNodeShape.hashCode());
        result = (result * PRIME) + (this.memorySize == null ? 43 : this.memorySize.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

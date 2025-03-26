/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * update cluster specs in Kiev.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateClusterSpecsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateClusterSpecsDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "clusterId",
        "masterNodeHostOcpuCount",
        "masterNodeHostMemoryGB",
        "dataNodeHostOcpuCount",
        "dataNodeHostMemoryGB",
        "softwareVersion",
        "dashboardSoftwareVersion",
        "clusterPrivateEndpoint"
    })
    public UpdateClusterSpecsDetails(
            String clusterId,
            Integer masterNodeHostOcpuCount,
            Integer masterNodeHostMemoryGB,
            Integer dataNodeHostOcpuCount,
            Integer dataNodeHostMemoryGB,
            String softwareVersion,
            String dashboardSoftwareVersion,
            String clusterPrivateEndpoint) {
        super();
        this.clusterId = clusterId;
        this.masterNodeHostOcpuCount = masterNodeHostOcpuCount;
        this.masterNodeHostMemoryGB = masterNodeHostMemoryGB;
        this.dataNodeHostOcpuCount = dataNodeHostOcpuCount;
        this.dataNodeHostMemoryGB = dataNodeHostMemoryGB;
        this.softwareVersion = softwareVersion;
        this.dashboardSoftwareVersion = dashboardSoftwareVersion;
        this.clusterPrivateEndpoint = clusterPrivateEndpoint;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID of the Opensearch Cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
        private String clusterId;

        /**
         * OCID of the Opensearch Cluster.
         * @param clusterId the value to set
         * @return this builder
         **/
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            this.__explicitlySet__.add("clusterId");
            return this;
        }
        /**
         * Updated value of OCPU's configured for master nodes of the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostOcpuCount")
        private Integer masterNodeHostOcpuCount;

        /**
         * Updated value of OCPU's configured for master nodes of the cluster.
         * @param masterNodeHostOcpuCount the value to set
         * @return this builder
         **/
        public Builder masterNodeHostOcpuCount(Integer masterNodeHostOcpuCount) {
            this.masterNodeHostOcpuCount = masterNodeHostOcpuCount;
            this.__explicitlySet__.add("masterNodeHostOcpuCount");
            return this;
        }
        /**
         * Updated value of memory for master nodes in the cluster (in GB).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostMemoryGB")
        private Integer masterNodeHostMemoryGB;

        /**
         * Updated value of memory for master nodes in the cluster (in GB).
         * @param masterNodeHostMemoryGB the value to set
         * @return this builder
         **/
        public Builder masterNodeHostMemoryGB(Integer masterNodeHostMemoryGB) {
            this.masterNodeHostMemoryGB = masterNodeHostMemoryGB;
            this.__explicitlySet__.add("masterNodeHostMemoryGB");
            return this;
        }
        /**
         * Updated value of OCPU's configured for data nodes of the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostOcpuCount")
        private Integer dataNodeHostOcpuCount;

        /**
         * Updated value of OCPU's configured for data nodes of the cluster.
         * @param dataNodeHostOcpuCount the value to set
         * @return this builder
         **/
        public Builder dataNodeHostOcpuCount(Integer dataNodeHostOcpuCount) {
            this.dataNodeHostOcpuCount = dataNodeHostOcpuCount;
            this.__explicitlySet__.add("dataNodeHostOcpuCount");
            return this;
        }
        /**
         * Updated value of memory for data nodes in the cluster (in GB).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostMemoryGB")
        private Integer dataNodeHostMemoryGB;

        /**
         * Updated value of memory for data nodes in the cluster (in GB).
         * @param dataNodeHostMemoryGB the value to set
         * @return this builder
         **/
        public Builder dataNodeHostMemoryGB(Integer dataNodeHostMemoryGB) {
            this.dataNodeHostMemoryGB = dataNodeHostMemoryGB;
            this.__explicitlySet__.add("dataNodeHostMemoryGB");
            return this;
        }
        /**
         * Updated version of the software the cluster is currently running.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareVersion")
        private String softwareVersion;

        /**
         * Updated version of the software the cluster is currently running.
         * @param softwareVersion the value to set
         * @return this builder
         **/
        public Builder softwareVersion(String softwareVersion) {
            this.softwareVersion = softwareVersion;
            this.__explicitlySet__.add("softwareVersion");
            return this;
        }
        /**
         * Updated version of the dashboard software the cluster is currently running.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dashboardSoftwareVersion")
        private String dashboardSoftwareVersion;

        /**
         * Updated version of the dashboard software the cluster is currently running.
         * @param dashboardSoftwareVersion the value to set
         * @return this builder
         **/
        public Builder dashboardSoftwareVersion(String dashboardSoftwareVersion) {
            this.dashboardSoftwareVersion = dashboardSoftwareVersion;
            this.__explicitlySet__.add("dashboardSoftwareVersion");
            return this;
        }
        /**
         * Updated Private endpoint of cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterPrivateEndpoint")
        private String clusterPrivateEndpoint;

        /**
         * Updated Private endpoint of cluster.
         * @param clusterPrivateEndpoint the value to set
         * @return this builder
         **/
        public Builder clusterPrivateEndpoint(String clusterPrivateEndpoint) {
            this.clusterPrivateEndpoint = clusterPrivateEndpoint;
            this.__explicitlySet__.add("clusterPrivateEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateClusterSpecsDetails build() {
            UpdateClusterSpecsDetails model =
                    new UpdateClusterSpecsDetails(
                            this.clusterId,
                            this.masterNodeHostOcpuCount,
                            this.masterNodeHostMemoryGB,
                            this.dataNodeHostOcpuCount,
                            this.dataNodeHostMemoryGB,
                            this.softwareVersion,
                            this.dashboardSoftwareVersion,
                            this.clusterPrivateEndpoint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateClusterSpecsDetails model) {
            if (model.wasPropertyExplicitlySet("clusterId")) {
                this.clusterId(model.getClusterId());
            }
            if (model.wasPropertyExplicitlySet("masterNodeHostOcpuCount")) {
                this.masterNodeHostOcpuCount(model.getMasterNodeHostOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("masterNodeHostMemoryGB")) {
                this.masterNodeHostMemoryGB(model.getMasterNodeHostMemoryGB());
            }
            if (model.wasPropertyExplicitlySet("dataNodeHostOcpuCount")) {
                this.dataNodeHostOcpuCount(model.getDataNodeHostOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("dataNodeHostMemoryGB")) {
                this.dataNodeHostMemoryGB(model.getDataNodeHostMemoryGB());
            }
            if (model.wasPropertyExplicitlySet("softwareVersion")) {
                this.softwareVersion(model.getSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("dashboardSoftwareVersion")) {
                this.dashboardSoftwareVersion(model.getDashboardSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("clusterPrivateEndpoint")) {
                this.clusterPrivateEndpoint(model.getClusterPrivateEndpoint());
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
     * OCID of the Opensearch Cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
    private final String clusterId;

    /**
     * OCID of the Opensearch Cluster.
     * @return the value
     **/
    public String getClusterId() {
        return clusterId;
    }

    /**
     * Updated value of OCPU's configured for master nodes of the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostOcpuCount")
    private final Integer masterNodeHostOcpuCount;

    /**
     * Updated value of OCPU's configured for master nodes of the cluster.
     * @return the value
     **/
    public Integer getMasterNodeHostOcpuCount() {
        return masterNodeHostOcpuCount;
    }

    /**
     * Updated value of memory for master nodes in the cluster (in GB).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostMemoryGB")
    private final Integer masterNodeHostMemoryGB;

    /**
     * Updated value of memory for master nodes in the cluster (in GB).
     * @return the value
     **/
    public Integer getMasterNodeHostMemoryGB() {
        return masterNodeHostMemoryGB;
    }

    /**
     * Updated value of OCPU's configured for data nodes of the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostOcpuCount")
    private final Integer dataNodeHostOcpuCount;

    /**
     * Updated value of OCPU's configured for data nodes of the cluster.
     * @return the value
     **/
    public Integer getDataNodeHostOcpuCount() {
        return dataNodeHostOcpuCount;
    }

    /**
     * Updated value of memory for data nodes in the cluster (in GB).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostMemoryGB")
    private final Integer dataNodeHostMemoryGB;

    /**
     * Updated value of memory for data nodes in the cluster (in GB).
     * @return the value
     **/
    public Integer getDataNodeHostMemoryGB() {
        return dataNodeHostMemoryGB;
    }

    /**
     * Updated version of the software the cluster is currently running.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareVersion")
    private final String softwareVersion;

    /**
     * Updated version of the software the cluster is currently running.
     * @return the value
     **/
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * Updated version of the dashboard software the cluster is currently running.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dashboardSoftwareVersion")
    private final String dashboardSoftwareVersion;

    /**
     * Updated version of the dashboard software the cluster is currently running.
     * @return the value
     **/
    public String getDashboardSoftwareVersion() {
        return dashboardSoftwareVersion;
    }

    /**
     * Updated Private endpoint of cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPrivateEndpoint")
    private final String clusterPrivateEndpoint;

    /**
     * Updated Private endpoint of cluster.
     * @return the value
     **/
    public String getClusterPrivateEndpoint() {
        return clusterPrivateEndpoint;
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
        sb.append("UpdateClusterSpecsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("clusterId=").append(String.valueOf(this.clusterId));
        sb.append(", masterNodeHostOcpuCount=")
                .append(String.valueOf(this.masterNodeHostOcpuCount));
        sb.append(", masterNodeHostMemoryGB=").append(String.valueOf(this.masterNodeHostMemoryGB));
        sb.append(", dataNodeHostOcpuCount=").append(String.valueOf(this.dataNodeHostOcpuCount));
        sb.append(", dataNodeHostMemoryGB=").append(String.valueOf(this.dataNodeHostMemoryGB));
        sb.append(", softwareVersion=").append(String.valueOf(this.softwareVersion));
        sb.append(", dashboardSoftwareVersion=")
                .append(String.valueOf(this.dashboardSoftwareVersion));
        sb.append(", clusterPrivateEndpoint=").append(String.valueOf(this.clusterPrivateEndpoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateClusterSpecsDetails)) {
            return false;
        }

        UpdateClusterSpecsDetails other = (UpdateClusterSpecsDetails) o;
        return java.util.Objects.equals(this.clusterId, other.clusterId)
                && java.util.Objects.equals(
                        this.masterNodeHostOcpuCount, other.masterNodeHostOcpuCount)
                && java.util.Objects.equals(
                        this.masterNodeHostMemoryGB, other.masterNodeHostMemoryGB)
                && java.util.Objects.equals(this.dataNodeHostOcpuCount, other.dataNodeHostOcpuCount)
                && java.util.Objects.equals(this.dataNodeHostMemoryGB, other.dataNodeHostMemoryGB)
                && java.util.Objects.equals(this.softwareVersion, other.softwareVersion)
                && java.util.Objects.equals(
                        this.dashboardSoftwareVersion, other.dashboardSoftwareVersion)
                && java.util.Objects.equals(
                        this.clusterPrivateEndpoint, other.clusterPrivateEndpoint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.clusterId == null ? 43 : this.clusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.masterNodeHostOcpuCount == null
                                ? 43
                                : this.masterNodeHostOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.masterNodeHostMemoryGB == null
                                ? 43
                                : this.masterNodeHostMemoryGB.hashCode());
        result =
                (result * PRIME)
                        + (this.dataNodeHostOcpuCount == null
                                ? 43
                                : this.dataNodeHostOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.dataNodeHostMemoryGB == null
                                ? 43
                                : this.dataNodeHostMemoryGB.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareVersion == null ? 43 : this.softwareVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.dashboardSoftwareVersion == null
                                ? 43
                                : this.dashboardSoftwareVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterPrivateEndpoint == null
                                ? 43
                                : this.clusterPrivateEndpoint.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

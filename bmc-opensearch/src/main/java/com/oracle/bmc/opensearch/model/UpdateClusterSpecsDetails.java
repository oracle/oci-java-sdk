/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * update cluster specs in Kiev. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateClusterSpecsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateClusterSpecsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "clusterId",
        "masterNodeHostOcpuCount",
        "masterNodeHostMemoryGB",
        "masterNodeHostShape",
        "dataNodeHostOcpuCount",
        "dataNodeHostMemoryGB",
        "dataNodeHostShape",
        "searchNodeHostShape",
        "searchNodeHostOcpuCount",
        "searchNodeHostMemoryGB",
        "coordinatorNodeHostShape",
        "coordinatorNodeHostOcpuCount",
        "coordinatorNodeHostMemoryGB",
        "coordinatorNodeCount",
        "mlNodeHostShape",
        "mlNodeHostOcpuCount",
        "mlNodeHostMemoryGB",
        "softwareVersion",
        "dashboardSoftwareVersion",
        "opendashboardNodeHostShape",
        "clusterPrivateEndpoint"
    })
    public UpdateClusterSpecsDetails(
            String clusterId,
            Integer masterNodeHostOcpuCount,
            Integer masterNodeHostMemoryGB,
            String masterNodeHostShape,
            Integer dataNodeHostOcpuCount,
            Integer dataNodeHostMemoryGB,
            String dataNodeHostShape,
            String searchNodeHostShape,
            Integer searchNodeHostOcpuCount,
            Integer searchNodeHostMemoryGB,
            String coordinatorNodeHostShape,
            Integer coordinatorNodeHostOcpuCount,
            Integer coordinatorNodeHostMemoryGB,
            Integer coordinatorNodeCount,
            String mlNodeHostShape,
            Integer mlNodeHostOcpuCount,
            Integer mlNodeHostMemoryGB,
            String softwareVersion,
            String dashboardSoftwareVersion,
            String opendashboardNodeHostShape,
            String clusterPrivateEndpoint) {
        super();
        this.clusterId = clusterId;
        this.masterNodeHostOcpuCount = masterNodeHostOcpuCount;
        this.masterNodeHostMemoryGB = masterNodeHostMemoryGB;
        this.masterNodeHostShape = masterNodeHostShape;
        this.dataNodeHostOcpuCount = dataNodeHostOcpuCount;
        this.dataNodeHostMemoryGB = dataNodeHostMemoryGB;
        this.dataNodeHostShape = dataNodeHostShape;
        this.searchNodeHostShape = searchNodeHostShape;
        this.searchNodeHostOcpuCount = searchNodeHostOcpuCount;
        this.searchNodeHostMemoryGB = searchNodeHostMemoryGB;
        this.coordinatorNodeHostShape = coordinatorNodeHostShape;
        this.coordinatorNodeHostOcpuCount = coordinatorNodeHostOcpuCount;
        this.coordinatorNodeHostMemoryGB = coordinatorNodeHostMemoryGB;
        this.coordinatorNodeCount = coordinatorNodeCount;
        this.mlNodeHostShape = mlNodeHostShape;
        this.mlNodeHostOcpuCount = mlNodeHostOcpuCount;
        this.mlNodeHostMemoryGB = mlNodeHostMemoryGB;
        this.softwareVersion = softwareVersion;
        this.dashboardSoftwareVersion = dashboardSoftwareVersion;
        this.opendashboardNodeHostShape = opendashboardNodeHostShape;
        this.clusterPrivateEndpoint = clusterPrivateEndpoint;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the Opensearch Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
        private String clusterId;

        /**
         * OCID of the Opensearch Cluster.
         *
         * @param clusterId the value to set
         * @return this builder
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            this.__explicitlySet__.add("clusterId");
            return this;
        }
        /** Updated value of OCPU's configured for master nodes of the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostOcpuCount")
        private Integer masterNodeHostOcpuCount;

        /**
         * Updated value of OCPU's configured for master nodes of the cluster.
         *
         * @param masterNodeHostOcpuCount the value to set
         * @return this builder
         */
        public Builder masterNodeHostOcpuCount(Integer masterNodeHostOcpuCount) {
            this.masterNodeHostOcpuCount = masterNodeHostOcpuCount;
            this.__explicitlySet__.add("masterNodeHostOcpuCount");
            return this;
        }
        /** Updated value of memory for master nodes in the cluster (in GB). */
        @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostMemoryGB")
        private Integer masterNodeHostMemoryGB;

        /**
         * Updated value of memory for master nodes in the cluster (in GB).
         *
         * @param masterNodeHostMemoryGB the value to set
         * @return this builder
         */
        public Builder masterNodeHostMemoryGB(Integer masterNodeHostMemoryGB) {
            this.masterNodeHostMemoryGB = masterNodeHostMemoryGB;
            this.__explicitlySet__.add("masterNodeHostMemoryGB");
            return this;
        }
        /** The node shape for the cluster's master nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostShape")
        private String masterNodeHostShape;

        /**
         * The node shape for the cluster's master nodes.
         *
         * @param masterNodeHostShape the value to set
         * @return this builder
         */
        public Builder masterNodeHostShape(String masterNodeHostShape) {
            this.masterNodeHostShape = masterNodeHostShape;
            this.__explicitlySet__.add("masterNodeHostShape");
            return this;
        }
        /** Updated value of OCPU's configured for data nodes of the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostOcpuCount")
        private Integer dataNodeHostOcpuCount;

        /**
         * Updated value of OCPU's configured for data nodes of the cluster.
         *
         * @param dataNodeHostOcpuCount the value to set
         * @return this builder
         */
        public Builder dataNodeHostOcpuCount(Integer dataNodeHostOcpuCount) {
            this.dataNodeHostOcpuCount = dataNodeHostOcpuCount;
            this.__explicitlySet__.add("dataNodeHostOcpuCount");
            return this;
        }
        /** Updated value of memory for data nodes in the cluster (in GB). */
        @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostMemoryGB")
        private Integer dataNodeHostMemoryGB;

        /**
         * Updated value of memory for data nodes in the cluster (in GB).
         *
         * @param dataNodeHostMemoryGB the value to set
         * @return this builder
         */
        public Builder dataNodeHostMemoryGB(Integer dataNodeHostMemoryGB) {
            this.dataNodeHostMemoryGB = dataNodeHostMemoryGB;
            this.__explicitlySet__.add("dataNodeHostMemoryGB");
            return this;
        }
        /** The node shape for the cluster's data nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostShape")
        private String dataNodeHostShape;

        /**
         * The node shape for the cluster's data nodes.
         *
         * @param dataNodeHostShape the value to set
         * @return this builder
         */
        public Builder dataNodeHostShape(String dataNodeHostShape) {
            this.dataNodeHostShape = dataNodeHostShape;
            this.__explicitlySet__.add("dataNodeHostShape");
            return this;
        }
        /** The node shape for the cluster's search nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("searchNodeHostShape")
        private String searchNodeHostShape;

        /**
         * The node shape for the cluster's search nodes.
         *
         * @param searchNodeHostShape the value to set
         * @return this builder
         */
        public Builder searchNodeHostShape(String searchNodeHostShape) {
            this.searchNodeHostShape = searchNodeHostShape;
            this.__explicitlySet__.add("searchNodeHostShape");
            return this;
        }
        /** The number of OCPUs configured for the cluster's search nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("searchNodeHostOcpuCount")
        private Integer searchNodeHostOcpuCount;

        /**
         * The number of OCPUs configured for the cluster's search nodes.
         *
         * @param searchNodeHostOcpuCount the value to set
         * @return this builder
         */
        public Builder searchNodeHostOcpuCount(Integer searchNodeHostOcpuCount) {
            this.searchNodeHostOcpuCount = searchNodeHostOcpuCount;
            this.__explicitlySet__.add("searchNodeHostOcpuCount");
            return this;
        }
        /** The amount of memory in GB, for the cluster's search nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("searchNodeHostMemoryGB")
        private Integer searchNodeHostMemoryGB;

        /**
         * The amount of memory in GB, for the cluster's search nodes.
         *
         * @param searchNodeHostMemoryGB the value to set
         * @return this builder
         */
        public Builder searchNodeHostMemoryGB(Integer searchNodeHostMemoryGB) {
            this.searchNodeHostMemoryGB = searchNodeHostMemoryGB;
            this.__explicitlySet__.add("searchNodeHostMemoryGB");
            return this;
        }
        /** The node shape for the cluster's coordinator nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("coordinatorNodeHostShape")
        private String coordinatorNodeHostShape;

        /**
         * The node shape for the cluster's coordinator nodes.
         *
         * @param coordinatorNodeHostShape the value to set
         * @return this builder
         */
        public Builder coordinatorNodeHostShape(String coordinatorNodeHostShape) {
            this.coordinatorNodeHostShape = coordinatorNodeHostShape;
            this.__explicitlySet__.add("coordinatorNodeHostShape");
            return this;
        }
        /** The number of OCPUs configured for the cluster's coordinator nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("coordinatorNodeHostOcpuCount")
        private Integer coordinatorNodeHostOcpuCount;

        /**
         * The number of OCPUs configured for the cluster's coordinator nodes.
         *
         * @param coordinatorNodeHostOcpuCount the value to set
         * @return this builder
         */
        public Builder coordinatorNodeHostOcpuCount(Integer coordinatorNodeHostOcpuCount) {
            this.coordinatorNodeHostOcpuCount = coordinatorNodeHostOcpuCount;
            this.__explicitlySet__.add("coordinatorNodeHostOcpuCount");
            return this;
        }
        /** The amount of memory in GB, for the cluster's coordinator nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("coordinatorNodeHostMemoryGB")
        private Integer coordinatorNodeHostMemoryGB;

        /**
         * The amount of memory in GB, for the cluster's coordinator nodes.
         *
         * @param coordinatorNodeHostMemoryGB the value to set
         * @return this builder
         */
        public Builder coordinatorNodeHostMemoryGB(Integer coordinatorNodeHostMemoryGB) {
            this.coordinatorNodeHostMemoryGB = coordinatorNodeHostMemoryGB;
            this.__explicitlySet__.add("coordinatorNodeHostMemoryGB");
            return this;
        }
        /** Updated value of number of coordinator nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("coordinatorNodeCount")
        private Integer coordinatorNodeCount;

        /**
         * Updated value of number of coordinator nodes.
         *
         * @param coordinatorNodeCount the value to set
         * @return this builder
         */
        public Builder coordinatorNodeCount(Integer coordinatorNodeCount) {
            this.coordinatorNodeCount = coordinatorNodeCount;
            this.__explicitlySet__.add("coordinatorNodeCount");
            return this;
        }
        /** The node shape for the cluster's ML nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("mlNodeHostShape")
        private String mlNodeHostShape;

        /**
         * The node shape for the cluster's ML nodes.
         *
         * @param mlNodeHostShape the value to set
         * @return this builder
         */
        public Builder mlNodeHostShape(String mlNodeHostShape) {
            this.mlNodeHostShape = mlNodeHostShape;
            this.__explicitlySet__.add("mlNodeHostShape");
            return this;
        }
        /** The number of OCPUs configured for the cluster's ML nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("mlNodeHostOcpuCount")
        private Integer mlNodeHostOcpuCount;

        /**
         * The number of OCPUs configured for the cluster's ML nodes.
         *
         * @param mlNodeHostOcpuCount the value to set
         * @return this builder
         */
        public Builder mlNodeHostOcpuCount(Integer mlNodeHostOcpuCount) {
            this.mlNodeHostOcpuCount = mlNodeHostOcpuCount;
            this.__explicitlySet__.add("mlNodeHostOcpuCount");
            return this;
        }
        /** The amount of memory in GB, for the cluster's ML nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("mlNodeHostMemoryGB")
        private Integer mlNodeHostMemoryGB;

        /**
         * The amount of memory in GB, for the cluster's ML nodes.
         *
         * @param mlNodeHostMemoryGB the value to set
         * @return this builder
         */
        public Builder mlNodeHostMemoryGB(Integer mlNodeHostMemoryGB) {
            this.mlNodeHostMemoryGB = mlNodeHostMemoryGB;
            this.__explicitlySet__.add("mlNodeHostMemoryGB");
            return this;
        }
        /** Updated version of the software the cluster is currently running. */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareVersion")
        private String softwareVersion;

        /**
         * Updated version of the software the cluster is currently running.
         *
         * @param softwareVersion the value to set
         * @return this builder
         */
        public Builder softwareVersion(String softwareVersion) {
            this.softwareVersion = softwareVersion;
            this.__explicitlySet__.add("softwareVersion");
            return this;
        }
        /** Updated version of the dashboard software the cluster is currently running. */
        @com.fasterxml.jackson.annotation.JsonProperty("dashboardSoftwareVersion")
        private String dashboardSoftwareVersion;

        /**
         * Updated version of the dashboard software the cluster is currently running.
         *
         * @param dashboardSoftwareVersion the value to set
         * @return this builder
         */
        public Builder dashboardSoftwareVersion(String dashboardSoftwareVersion) {
            this.dashboardSoftwareVersion = dashboardSoftwareVersion;
            this.__explicitlySet__.add("dashboardSoftwareVersion");
            return this;
        }
        /** The shape node for the cluster's OpenSearch Dashboard nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("opendashboardNodeHostShape")
        private String opendashboardNodeHostShape;

        /**
         * The shape node for the cluster's OpenSearch Dashboard nodes.
         *
         * @param opendashboardNodeHostShape the value to set
         * @return this builder
         */
        public Builder opendashboardNodeHostShape(String opendashboardNodeHostShape) {
            this.opendashboardNodeHostShape = opendashboardNodeHostShape;
            this.__explicitlySet__.add("opendashboardNodeHostShape");
            return this;
        }
        /** Updated Private endpoint of cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterPrivateEndpoint")
        private String clusterPrivateEndpoint;

        /**
         * Updated Private endpoint of cluster.
         *
         * @param clusterPrivateEndpoint the value to set
         * @return this builder
         */
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
                            this.masterNodeHostShape,
                            this.dataNodeHostOcpuCount,
                            this.dataNodeHostMemoryGB,
                            this.dataNodeHostShape,
                            this.searchNodeHostShape,
                            this.searchNodeHostOcpuCount,
                            this.searchNodeHostMemoryGB,
                            this.coordinatorNodeHostShape,
                            this.coordinatorNodeHostOcpuCount,
                            this.coordinatorNodeHostMemoryGB,
                            this.coordinatorNodeCount,
                            this.mlNodeHostShape,
                            this.mlNodeHostOcpuCount,
                            this.mlNodeHostMemoryGB,
                            this.softwareVersion,
                            this.dashboardSoftwareVersion,
                            this.opendashboardNodeHostShape,
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
            if (model.wasPropertyExplicitlySet("masterNodeHostShape")) {
                this.masterNodeHostShape(model.getMasterNodeHostShape());
            }
            if (model.wasPropertyExplicitlySet("dataNodeHostOcpuCount")) {
                this.dataNodeHostOcpuCount(model.getDataNodeHostOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("dataNodeHostMemoryGB")) {
                this.dataNodeHostMemoryGB(model.getDataNodeHostMemoryGB());
            }
            if (model.wasPropertyExplicitlySet("dataNodeHostShape")) {
                this.dataNodeHostShape(model.getDataNodeHostShape());
            }
            if (model.wasPropertyExplicitlySet("searchNodeHostShape")) {
                this.searchNodeHostShape(model.getSearchNodeHostShape());
            }
            if (model.wasPropertyExplicitlySet("searchNodeHostOcpuCount")) {
                this.searchNodeHostOcpuCount(model.getSearchNodeHostOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("searchNodeHostMemoryGB")) {
                this.searchNodeHostMemoryGB(model.getSearchNodeHostMemoryGB());
            }
            if (model.wasPropertyExplicitlySet("coordinatorNodeHostShape")) {
                this.coordinatorNodeHostShape(model.getCoordinatorNodeHostShape());
            }
            if (model.wasPropertyExplicitlySet("coordinatorNodeHostOcpuCount")) {
                this.coordinatorNodeHostOcpuCount(model.getCoordinatorNodeHostOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("coordinatorNodeHostMemoryGB")) {
                this.coordinatorNodeHostMemoryGB(model.getCoordinatorNodeHostMemoryGB());
            }
            if (model.wasPropertyExplicitlySet("coordinatorNodeCount")) {
                this.coordinatorNodeCount(model.getCoordinatorNodeCount());
            }
            if (model.wasPropertyExplicitlySet("mlNodeHostShape")) {
                this.mlNodeHostShape(model.getMlNodeHostShape());
            }
            if (model.wasPropertyExplicitlySet("mlNodeHostOcpuCount")) {
                this.mlNodeHostOcpuCount(model.getMlNodeHostOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("mlNodeHostMemoryGB")) {
                this.mlNodeHostMemoryGB(model.getMlNodeHostMemoryGB());
            }
            if (model.wasPropertyExplicitlySet("softwareVersion")) {
                this.softwareVersion(model.getSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("dashboardSoftwareVersion")) {
                this.dashboardSoftwareVersion(model.getDashboardSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("opendashboardNodeHostShape")) {
                this.opendashboardNodeHostShape(model.getOpendashboardNodeHostShape());
            }
            if (model.wasPropertyExplicitlySet("clusterPrivateEndpoint")) {
                this.clusterPrivateEndpoint(model.getClusterPrivateEndpoint());
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

    /** OCID of the Opensearch Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
    private final String clusterId;

    /**
     * OCID of the Opensearch Cluster.
     *
     * @return the value
     */
    public String getClusterId() {
        return clusterId;
    }

    /** Updated value of OCPU's configured for master nodes of the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostOcpuCount")
    private final Integer masterNodeHostOcpuCount;

    /**
     * Updated value of OCPU's configured for master nodes of the cluster.
     *
     * @return the value
     */
    public Integer getMasterNodeHostOcpuCount() {
        return masterNodeHostOcpuCount;
    }

    /** Updated value of memory for master nodes in the cluster (in GB). */
    @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostMemoryGB")
    private final Integer masterNodeHostMemoryGB;

    /**
     * Updated value of memory for master nodes in the cluster (in GB).
     *
     * @return the value
     */
    public Integer getMasterNodeHostMemoryGB() {
        return masterNodeHostMemoryGB;
    }

    /** The node shape for the cluster's master nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostShape")
    private final String masterNodeHostShape;

    /**
     * The node shape for the cluster's master nodes.
     *
     * @return the value
     */
    public String getMasterNodeHostShape() {
        return masterNodeHostShape;
    }

    /** Updated value of OCPU's configured for data nodes of the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostOcpuCount")
    private final Integer dataNodeHostOcpuCount;

    /**
     * Updated value of OCPU's configured for data nodes of the cluster.
     *
     * @return the value
     */
    public Integer getDataNodeHostOcpuCount() {
        return dataNodeHostOcpuCount;
    }

    /** Updated value of memory for data nodes in the cluster (in GB). */
    @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostMemoryGB")
    private final Integer dataNodeHostMemoryGB;

    /**
     * Updated value of memory for data nodes in the cluster (in GB).
     *
     * @return the value
     */
    public Integer getDataNodeHostMemoryGB() {
        return dataNodeHostMemoryGB;
    }

    /** The node shape for the cluster's data nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostShape")
    private final String dataNodeHostShape;

    /**
     * The node shape for the cluster's data nodes.
     *
     * @return the value
     */
    public String getDataNodeHostShape() {
        return dataNodeHostShape;
    }

    /** The node shape for the cluster's search nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("searchNodeHostShape")
    private final String searchNodeHostShape;

    /**
     * The node shape for the cluster's search nodes.
     *
     * @return the value
     */
    public String getSearchNodeHostShape() {
        return searchNodeHostShape;
    }

    /** The number of OCPUs configured for the cluster's search nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("searchNodeHostOcpuCount")
    private final Integer searchNodeHostOcpuCount;

    /**
     * The number of OCPUs configured for the cluster's search nodes.
     *
     * @return the value
     */
    public Integer getSearchNodeHostOcpuCount() {
        return searchNodeHostOcpuCount;
    }

    /** The amount of memory in GB, for the cluster's search nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("searchNodeHostMemoryGB")
    private final Integer searchNodeHostMemoryGB;

    /**
     * The amount of memory in GB, for the cluster's search nodes.
     *
     * @return the value
     */
    public Integer getSearchNodeHostMemoryGB() {
        return searchNodeHostMemoryGB;
    }

    /** The node shape for the cluster's coordinator nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("coordinatorNodeHostShape")
    private final String coordinatorNodeHostShape;

    /**
     * The node shape for the cluster's coordinator nodes.
     *
     * @return the value
     */
    public String getCoordinatorNodeHostShape() {
        return coordinatorNodeHostShape;
    }

    /** The number of OCPUs configured for the cluster's coordinator nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("coordinatorNodeHostOcpuCount")
    private final Integer coordinatorNodeHostOcpuCount;

    /**
     * The number of OCPUs configured for the cluster's coordinator nodes.
     *
     * @return the value
     */
    public Integer getCoordinatorNodeHostOcpuCount() {
        return coordinatorNodeHostOcpuCount;
    }

    /** The amount of memory in GB, for the cluster's coordinator nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("coordinatorNodeHostMemoryGB")
    private final Integer coordinatorNodeHostMemoryGB;

    /**
     * The amount of memory in GB, for the cluster's coordinator nodes.
     *
     * @return the value
     */
    public Integer getCoordinatorNodeHostMemoryGB() {
        return coordinatorNodeHostMemoryGB;
    }

    /** Updated value of number of coordinator nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("coordinatorNodeCount")
    private final Integer coordinatorNodeCount;

    /**
     * Updated value of number of coordinator nodes.
     *
     * @return the value
     */
    public Integer getCoordinatorNodeCount() {
        return coordinatorNodeCount;
    }

    /** The node shape for the cluster's ML nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("mlNodeHostShape")
    private final String mlNodeHostShape;

    /**
     * The node shape for the cluster's ML nodes.
     *
     * @return the value
     */
    public String getMlNodeHostShape() {
        return mlNodeHostShape;
    }

    /** The number of OCPUs configured for the cluster's ML nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("mlNodeHostOcpuCount")
    private final Integer mlNodeHostOcpuCount;

    /**
     * The number of OCPUs configured for the cluster's ML nodes.
     *
     * @return the value
     */
    public Integer getMlNodeHostOcpuCount() {
        return mlNodeHostOcpuCount;
    }

    /** The amount of memory in GB, for the cluster's ML nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("mlNodeHostMemoryGB")
    private final Integer mlNodeHostMemoryGB;

    /**
     * The amount of memory in GB, for the cluster's ML nodes.
     *
     * @return the value
     */
    public Integer getMlNodeHostMemoryGB() {
        return mlNodeHostMemoryGB;
    }

    /** Updated version of the software the cluster is currently running. */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareVersion")
    private final String softwareVersion;

    /**
     * Updated version of the software the cluster is currently running.
     *
     * @return the value
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /** Updated version of the dashboard software the cluster is currently running. */
    @com.fasterxml.jackson.annotation.JsonProperty("dashboardSoftwareVersion")
    private final String dashboardSoftwareVersion;

    /**
     * Updated version of the dashboard software the cluster is currently running.
     *
     * @return the value
     */
    public String getDashboardSoftwareVersion() {
        return dashboardSoftwareVersion;
    }

    /** The shape node for the cluster's OpenSearch Dashboard nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("opendashboardNodeHostShape")
    private final String opendashboardNodeHostShape;

    /**
     * The shape node for the cluster's OpenSearch Dashboard nodes.
     *
     * @return the value
     */
    public String getOpendashboardNodeHostShape() {
        return opendashboardNodeHostShape;
    }

    /** Updated Private endpoint of cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPrivateEndpoint")
    private final String clusterPrivateEndpoint;

    /**
     * Updated Private endpoint of cluster.
     *
     * @return the value
     */
    public String getClusterPrivateEndpoint() {
        return clusterPrivateEndpoint;
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
        sb.append("UpdateClusterSpecsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("clusterId=").append(String.valueOf(this.clusterId));
        sb.append(", masterNodeHostOcpuCount=")
                .append(String.valueOf(this.masterNodeHostOcpuCount));
        sb.append(", masterNodeHostMemoryGB=").append(String.valueOf(this.masterNodeHostMemoryGB));
        sb.append(", masterNodeHostShape=").append(String.valueOf(this.masterNodeHostShape));
        sb.append(", dataNodeHostOcpuCount=").append(String.valueOf(this.dataNodeHostOcpuCount));
        sb.append(", dataNodeHostMemoryGB=").append(String.valueOf(this.dataNodeHostMemoryGB));
        sb.append(", dataNodeHostShape=").append(String.valueOf(this.dataNodeHostShape));
        sb.append(", searchNodeHostShape=").append(String.valueOf(this.searchNodeHostShape));
        sb.append(", searchNodeHostOcpuCount=")
                .append(String.valueOf(this.searchNodeHostOcpuCount));
        sb.append(", searchNodeHostMemoryGB=").append(String.valueOf(this.searchNodeHostMemoryGB));
        sb.append(", coordinatorNodeHostShape=")
                .append(String.valueOf(this.coordinatorNodeHostShape));
        sb.append(", coordinatorNodeHostOcpuCount=")
                .append(String.valueOf(this.coordinatorNodeHostOcpuCount));
        sb.append(", coordinatorNodeHostMemoryGB=")
                .append(String.valueOf(this.coordinatorNodeHostMemoryGB));
        sb.append(", coordinatorNodeCount=").append(String.valueOf(this.coordinatorNodeCount));
        sb.append(", mlNodeHostShape=").append(String.valueOf(this.mlNodeHostShape));
        sb.append(", mlNodeHostOcpuCount=").append(String.valueOf(this.mlNodeHostOcpuCount));
        sb.append(", mlNodeHostMemoryGB=").append(String.valueOf(this.mlNodeHostMemoryGB));
        sb.append(", softwareVersion=").append(String.valueOf(this.softwareVersion));
        sb.append(", dashboardSoftwareVersion=")
                .append(String.valueOf(this.dashboardSoftwareVersion));
        sb.append(", opendashboardNodeHostShape=")
                .append(String.valueOf(this.opendashboardNodeHostShape));
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
                && java.util.Objects.equals(this.masterNodeHostShape, other.masterNodeHostShape)
                && java.util.Objects.equals(this.dataNodeHostOcpuCount, other.dataNodeHostOcpuCount)
                && java.util.Objects.equals(this.dataNodeHostMemoryGB, other.dataNodeHostMemoryGB)
                && java.util.Objects.equals(this.dataNodeHostShape, other.dataNodeHostShape)
                && java.util.Objects.equals(this.searchNodeHostShape, other.searchNodeHostShape)
                && java.util.Objects.equals(
                        this.searchNodeHostOcpuCount, other.searchNodeHostOcpuCount)
                && java.util.Objects.equals(
                        this.searchNodeHostMemoryGB, other.searchNodeHostMemoryGB)
                && java.util.Objects.equals(
                        this.coordinatorNodeHostShape, other.coordinatorNodeHostShape)
                && java.util.Objects.equals(
                        this.coordinatorNodeHostOcpuCount, other.coordinatorNodeHostOcpuCount)
                && java.util.Objects.equals(
                        this.coordinatorNodeHostMemoryGB, other.coordinatorNodeHostMemoryGB)
                && java.util.Objects.equals(this.coordinatorNodeCount, other.coordinatorNodeCount)
                && java.util.Objects.equals(this.mlNodeHostShape, other.mlNodeHostShape)
                && java.util.Objects.equals(this.mlNodeHostOcpuCount, other.mlNodeHostOcpuCount)
                && java.util.Objects.equals(this.mlNodeHostMemoryGB, other.mlNodeHostMemoryGB)
                && java.util.Objects.equals(this.softwareVersion, other.softwareVersion)
                && java.util.Objects.equals(
                        this.dashboardSoftwareVersion, other.dashboardSoftwareVersion)
                && java.util.Objects.equals(
                        this.opendashboardNodeHostShape, other.opendashboardNodeHostShape)
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
                        + (this.masterNodeHostShape == null
                                ? 43
                                : this.masterNodeHostShape.hashCode());
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
                        + (this.dataNodeHostShape == null ? 43 : this.dataNodeHostShape.hashCode());
        result =
                (result * PRIME)
                        + (this.searchNodeHostShape == null
                                ? 43
                                : this.searchNodeHostShape.hashCode());
        result =
                (result * PRIME)
                        + (this.searchNodeHostOcpuCount == null
                                ? 43
                                : this.searchNodeHostOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.searchNodeHostMemoryGB == null
                                ? 43
                                : this.searchNodeHostMemoryGB.hashCode());
        result =
                (result * PRIME)
                        + (this.coordinatorNodeHostShape == null
                                ? 43
                                : this.coordinatorNodeHostShape.hashCode());
        result =
                (result * PRIME)
                        + (this.coordinatorNodeHostOcpuCount == null
                                ? 43
                                : this.coordinatorNodeHostOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.coordinatorNodeHostMemoryGB == null
                                ? 43
                                : this.coordinatorNodeHostMemoryGB.hashCode());
        result =
                (result * PRIME)
                        + (this.coordinatorNodeCount == null
                                ? 43
                                : this.coordinatorNodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.mlNodeHostShape == null ? 43 : this.mlNodeHostShape.hashCode());
        result =
                (result * PRIME)
                        + (this.mlNodeHostOcpuCount == null
                                ? 43
                                : this.mlNodeHostOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.mlNodeHostMemoryGB == null
                                ? 43
                                : this.mlNodeHostMemoryGB.hashCode());
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
                        + (this.opendashboardNodeHostShape == null
                                ? 43
                                : this.opendashboardNodeHostShape.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterPrivateEndpoint == null
                                ? 43
                                : this.clusterPrivateEndpoint.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

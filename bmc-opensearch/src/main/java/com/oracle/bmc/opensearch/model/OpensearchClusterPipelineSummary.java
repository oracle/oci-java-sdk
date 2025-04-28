/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * The summary of information about an OpenSearch cluster Pipeline. <br>
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
        builder = OpensearchClusterPipelineSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OpensearchClusterPipelineSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "vcnId",
        "subnetId",
        "ocpuCount",
        "memoryGB",
        "nodeCount",
        "pipelineConfigurationBody",
        "dataPrepperConfigurationBody",
        "lifecycleState",
        "pipelineMode",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public OpensearchClusterPipelineSummary(
            String id,
            String displayName,
            String compartmentId,
            String vcnId,
            String subnetId,
            Integer ocpuCount,
            Integer memoryGB,
            Integer nodeCount,
            String pipelineConfigurationBody,
            String dataPrepperConfigurationBody,
            OpensearchClusterPipeline.LifecycleState lifecycleState,
            OpensearchClusterPipeline.PipelineMode pipelineMode,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.vcnId = vcnId;
        this.subnetId = subnetId;
        this.ocpuCount = ocpuCount;
        this.memoryGB = memoryGB;
        this.nodeCount = nodeCount;
        this.pipelineConfigurationBody = pipelineConfigurationBody;
        this.dataPrepperConfigurationBody = dataPrepperConfigurationBody;
        this.lifecycleState = lifecycleState;
        this.pipelineMode = pipelineMode;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the cluster pipeline. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the cluster pipeline.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The name of the cluster pipeline. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the cluster pipeline. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the compartment where the cluster pipeline is located. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the cluster pipeline is located.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The OCID of the pipeline's VCN. */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The OCID of the pipeline's VCN.
         *
         * @param vcnId the value to set
         * @return this builder
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /** The OCID of the pipeline's subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the pipeline's subnet.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /** The number of OCPUs configured for each pipeline node. */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
        private Integer ocpuCount;

        /**
         * The number of OCPUs configured for each pipeline node.
         *
         * @param ocpuCount the value to set
         * @return this builder
         */
        public Builder ocpuCount(Integer ocpuCount) {
            this.ocpuCount = ocpuCount;
            this.__explicitlySet__.add("ocpuCount");
            return this;
        }
        /** The amount of memory in GB, for each pipeline node. */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryGB")
        private Integer memoryGB;

        /**
         * The amount of memory in GB, for each pipeline node.
         *
         * @param memoryGB the value to set
         * @return this builder
         */
        public Builder memoryGB(Integer memoryGB) {
            this.memoryGB = memoryGB;
            this.__explicitlySet__.add("memoryGB");
            return this;
        }
        /** The number of nodes configured for the pipeline. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        /**
         * The number of nodes configured for the pipeline.
         *
         * @param nodeCount the value to set
         * @return this builder
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }
        /**
         * The pipeline configuration in YAML format. The command accepts the pipeline configuration
         * as a string or within a .yaml file. If you provide the configuration as a string, each
         * new line must be escaped with \\.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pipelineConfigurationBody")
        private String pipelineConfigurationBody;

        /**
         * The pipeline configuration in YAML format. The command accepts the pipeline configuration
         * as a string or within a .yaml file. If you provide the configuration as a string, each
         * new line must be escaped with \\.
         *
         * @param pipelineConfigurationBody the value to set
         * @return this builder
         */
        public Builder pipelineConfigurationBody(String pipelineConfigurationBody) {
            this.pipelineConfigurationBody = pipelineConfigurationBody;
            this.__explicitlySet__.add("pipelineConfigurationBody");
            return this;
        }
        /**
         * The data prepper config in YAML format. The command accepts the data prepper config as a
         * string or within a .yaml file. If you provide the configuration as a string, each new
         * line must be escaped with \\.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataPrepperConfigurationBody")
        private String dataPrepperConfigurationBody;

        /**
         * The data prepper config in YAML format. The command accepts the data prepper config as a
         * string or within a .yaml file. If you provide the configuration as a string, each new
         * line must be escaped with \\.
         *
         * @param dataPrepperConfigurationBody the value to set
         * @return this builder
         */
        public Builder dataPrepperConfigurationBody(String dataPrepperConfigurationBody) {
            this.dataPrepperConfigurationBody = dataPrepperConfigurationBody;
            this.__explicitlySet__.add("dataPrepperConfigurationBody");
            return this;
        }
        /** The current state of the cluster pipeline. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OpensearchClusterPipeline.LifecycleState lifecycleState;

        /**
         * The current state of the cluster pipeline.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(OpensearchClusterPipeline.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The current state of the pipeline. */
        @com.fasterxml.jackson.annotation.JsonProperty("pipelineMode")
        private OpensearchClusterPipeline.PipelineMode pipelineMode;

        /**
         * The current state of the pipeline.
         *
         * @param pipelineMode the value to set
         * @return this builder
         */
        public Builder pipelineMode(OpensearchClusterPipeline.PipelineMode pipelineMode) {
            this.pipelineMode = pipelineMode;
            this.__explicitlySet__.add("pipelineMode");
            return this;
        }
        /**
         * The date and time the cluster pipeline was created. Format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the cluster pipeline was created. Format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the cluster pipeline was updated. Format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the cluster pipeline was updated. Format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OpensearchClusterPipelineSummary build() {
            OpensearchClusterPipelineSummary model =
                    new OpensearchClusterPipelineSummary(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.vcnId,
                            this.subnetId,
                            this.ocpuCount,
                            this.memoryGB,
                            this.nodeCount,
                            this.pipelineConfigurationBody,
                            this.dataPrepperConfigurationBody,
                            this.lifecycleState,
                            this.pipelineMode,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OpensearchClusterPipelineSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("ocpuCount")) {
                this.ocpuCount(model.getOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("memoryGB")) {
                this.memoryGB(model.getMemoryGB());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("pipelineConfigurationBody")) {
                this.pipelineConfigurationBody(model.getPipelineConfigurationBody());
            }
            if (model.wasPropertyExplicitlySet("dataPrepperConfigurationBody")) {
                this.dataPrepperConfigurationBody(model.getDataPrepperConfigurationBody());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("pipelineMode")) {
                this.pipelineMode(model.getPipelineMode());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** The OCID of the cluster pipeline. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the cluster pipeline.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The name of the cluster pipeline. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the cluster pipeline. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the compartment where the cluster pipeline is located. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the cluster pipeline is located.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The OCID of the pipeline's VCN. */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The OCID of the pipeline's VCN.
     *
     * @return the value
     */
    public String getVcnId() {
        return vcnId;
    }

    /** The OCID of the pipeline's subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the pipeline's subnet.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /** The number of OCPUs configured for each pipeline node. */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
    private final Integer ocpuCount;

    /**
     * The number of OCPUs configured for each pipeline node.
     *
     * @return the value
     */
    public Integer getOcpuCount() {
        return ocpuCount;
    }

    /** The amount of memory in GB, for each pipeline node. */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryGB")
    private final Integer memoryGB;

    /**
     * The amount of memory in GB, for each pipeline node.
     *
     * @return the value
     */
    public Integer getMemoryGB() {
        return memoryGB;
    }

    /** The number of nodes configured for the pipeline. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * The number of nodes configured for the pipeline.
     *
     * @return the value
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /**
     * The pipeline configuration in YAML format. The command accepts the pipeline configuration as
     * a string or within a .yaml file. If you provide the configuration as a string, each new line
     * must be escaped with \\.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pipelineConfigurationBody")
    private final String pipelineConfigurationBody;

    /**
     * The pipeline configuration in YAML format. The command accepts the pipeline configuration as
     * a string or within a .yaml file. If you provide the configuration as a string, each new line
     * must be escaped with \\.
     *
     * @return the value
     */
    public String getPipelineConfigurationBody() {
        return pipelineConfigurationBody;
    }

    /**
     * The data prepper config in YAML format. The command accepts the data prepper config as a
     * string or within a .yaml file. If you provide the configuration as a string, each new line
     * must be escaped with \\.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataPrepperConfigurationBody")
    private final String dataPrepperConfigurationBody;

    /**
     * The data prepper config in YAML format. The command accepts the data prepper config as a
     * string or within a .yaml file. If you provide the configuration as a string, each new line
     * must be escaped with \\.
     *
     * @return the value
     */
    public String getDataPrepperConfigurationBody() {
        return dataPrepperConfigurationBody;
    }

    /** The current state of the cluster pipeline. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final OpensearchClusterPipeline.LifecycleState lifecycleState;

    /**
     * The current state of the cluster pipeline.
     *
     * @return the value
     */
    public OpensearchClusterPipeline.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The current state of the pipeline. */
    @com.fasterxml.jackson.annotation.JsonProperty("pipelineMode")
    private final OpensearchClusterPipeline.PipelineMode pipelineMode;

    /**
     * The current state of the pipeline.
     *
     * @return the value
     */
    public OpensearchClusterPipeline.PipelineMode getPipelineMode() {
        return pipelineMode;
    }

    /**
     * The date and time the cluster pipeline was created. Format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the cluster pipeline was created. Format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the cluster pipeline was updated. Format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the cluster pipeline was updated. Format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("OpensearchClusterPipelineSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", ocpuCount=").append(String.valueOf(this.ocpuCount));
        sb.append(", memoryGB=").append(String.valueOf(this.memoryGB));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", pipelineConfigurationBody=")
                .append(String.valueOf(this.pipelineConfigurationBody));
        sb.append(", dataPrepperConfigurationBody=")
                .append(String.valueOf(this.dataPrepperConfigurationBody));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", pipelineMode=").append(String.valueOf(this.pipelineMode));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpensearchClusterPipelineSummary)) {
            return false;
        }

        OpensearchClusterPipelineSummary other = (OpensearchClusterPipelineSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.ocpuCount, other.ocpuCount)
                && java.util.Objects.equals(this.memoryGB, other.memoryGB)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(
                        this.pipelineConfigurationBody, other.pipelineConfigurationBody)
                && java.util.Objects.equals(
                        this.dataPrepperConfigurationBody, other.dataPrepperConfigurationBody)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.pipelineMode, other.pipelineMode)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.ocpuCount == null ? 43 : this.ocpuCount.hashCode());
        result = (result * PRIME) + (this.memoryGB == null ? 43 : this.memoryGB.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.pipelineConfigurationBody == null
                                ? 43
                                : this.pipelineConfigurationBody.hashCode());
        result =
                (result * PRIME)
                        + (this.dataPrepperConfigurationBody == null
                                ? 43
                                : this.dataPrepperConfigurationBody.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.pipelineMode == null ? 43 : this.pipelineMode.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

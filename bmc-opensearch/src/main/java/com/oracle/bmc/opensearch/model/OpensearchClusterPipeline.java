/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * An OpenSearch cluster Pipeline resource. An cluster is set of instances that provide OpenSearch
 * functionality in OCI Search Service with OpenSearch. For more information, see [Cluster
 * Pipelines](https://docs.cloud.oracle.com/iaas/Content/search-opensearch/Concepts/ociopensearchpipeline.htm).
 * <br>
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
        builder = OpensearchClusterPipeline.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OpensearchClusterPipeline
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "vcnId",
        "subnetId",
        "vcnCompartmentId",
        "subnetCompartmentId",
        "maxOcpuCount",
        "minOcpuCount",
        "maxMemoryGB",
        "minMemoryGB",
        "pipelineConfigurationBody",
        "opensearchPipelineFqdn",
        "opensearchPipelinePrivateIp",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public OpensearchClusterPipeline(
            String id,
            String displayName,
            String compartmentId,
            String vcnId,
            String subnetId,
            String vcnCompartmentId,
            String subnetCompartmentId,
            Integer maxOcpuCount,
            Integer minOcpuCount,
            Integer maxMemoryGB,
            Integer minMemoryGB,
            String pipelineConfigurationBody,
            String opensearchPipelineFqdn,
            String opensearchPipelinePrivateIp,
            LifecycleState lifecycleState,
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
        this.vcnCompartmentId = vcnCompartmentId;
        this.subnetCompartmentId = subnetCompartmentId;
        this.maxOcpuCount = maxOcpuCount;
        this.minOcpuCount = minOcpuCount;
        this.maxMemoryGB = maxMemoryGB;
        this.minMemoryGB = minMemoryGB;
        this.pipelineConfigurationBody = pipelineConfigurationBody;
        this.opensearchPipelineFqdn = opensearchPipelineFqdn;
        this.opensearchPipelinePrivateIp = opensearchPipelinePrivateIp;
        this.lifecycleState = lifecycleState;
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
        /** The name of the pipeline. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the pipeline. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the compartment where the pipeline is located. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the pipeline is located.
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
        /** The OCID for the compartment where the pipeline's VCN is located. */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnCompartmentId")
        private String vcnCompartmentId;

        /**
         * The OCID for the compartment where the pipeline's VCN is located.
         *
         * @param vcnCompartmentId the value to set
         * @return this builder
         */
        public Builder vcnCompartmentId(String vcnCompartmentId) {
            this.vcnCompartmentId = vcnCompartmentId;
            this.__explicitlySet__.add("vcnCompartmentId");
            return this;
        }
        /** The OCID for the compartment where the pipwline's subnet is located. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetCompartmentId")
        private String subnetCompartmentId;

        /**
         * The OCID for the compartment where the pipwline's subnet is located.
         *
         * @param subnetCompartmentId the value to set
         * @return this builder
         */
        public Builder subnetCompartmentId(String subnetCompartmentId) {
            this.subnetCompartmentId = subnetCompartmentId;
            this.__explicitlySet__.add("subnetCompartmentId");
            return this;
        }
        /** The maximum pipeline capacity, in OCPUs. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxOcpuCount")
        private Integer maxOcpuCount;

        /**
         * The maximum pipeline capacity, in OCPUs.
         *
         * @param maxOcpuCount the value to set
         * @return this builder
         */
        public Builder maxOcpuCount(Integer maxOcpuCount) {
            this.maxOcpuCount = maxOcpuCount;
            this.__explicitlySet__.add("maxOcpuCount");
            return this;
        }
        /** The maximum pipeline capacity, in OCPUs. */
        @com.fasterxml.jackson.annotation.JsonProperty("minOcpuCount")
        private Integer minOcpuCount;

        /**
         * The maximum pipeline capacity, in OCPUs.
         *
         * @param minOcpuCount the value to set
         * @return this builder
         */
        public Builder minOcpuCount(Integer minOcpuCount) {
            this.minOcpuCount = minOcpuCount;
            this.__explicitlySet__.add("minOcpuCount");
            return this;
        }
        /** The maximum amount of memory in GB, for the pipeline. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryGB")
        private Integer maxMemoryGB;

        /**
         * The maximum amount of memory in GB, for the pipeline.
         *
         * @param maxMemoryGB the value to set
         * @return this builder
         */
        public Builder maxMemoryGB(Integer maxMemoryGB) {
            this.maxMemoryGB = maxMemoryGB;
            this.__explicitlySet__.add("maxMemoryGB");
            return this;
        }
        /** The minimum amount of memory in GB, for the pipeline. */
        @com.fasterxml.jackson.annotation.JsonProperty("minMemoryGB")
        private Integer minMemoryGB;

        /**
         * The minimum amount of memory in GB, for the pipeline.
         *
         * @param minMemoryGB the value to set
         * @return this builder
         */
        public Builder minMemoryGB(Integer minMemoryGB) {
            this.minMemoryGB = minMemoryGB;
            this.__explicitlySet__.add("minMemoryGB");
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
        /** The fully qualified domain name (FQDN) for the cluster's API endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("opensearchPipelineFqdn")
        private String opensearchPipelineFqdn;

        /**
         * The fully qualified domain name (FQDN) for the cluster's API endpoint.
         *
         * @param opensearchPipelineFqdn the value to set
         * @return this builder
         */
        public Builder opensearchPipelineFqdn(String opensearchPipelineFqdn) {
            this.opensearchPipelineFqdn = opensearchPipelineFqdn;
            this.__explicitlySet__.add("opensearchPipelineFqdn");
            return this;
        }
        /** The pipeline's private IP address. */
        @com.fasterxml.jackson.annotation.JsonProperty("opensearchPipelinePrivateIp")
        private String opensearchPipelinePrivateIp;

        /**
         * The pipeline's private IP address.
         *
         * @param opensearchPipelinePrivateIp the value to set
         * @return this builder
         */
        public Builder opensearchPipelinePrivateIp(String opensearchPipelinePrivateIp) {
            this.opensearchPipelinePrivateIp = opensearchPipelinePrivateIp;
            this.__explicitlySet__.add("opensearchPipelinePrivateIp");
            return this;
        }
        /** The current state of the cluster backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the cluster backup.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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
        /** The amount of time in milliseconds since the pipeline was updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The amount of time in milliseconds since the pipeline was updated.
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

        public OpensearchClusterPipeline build() {
            OpensearchClusterPipeline model =
                    new OpensearchClusterPipeline(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.vcnId,
                            this.subnetId,
                            this.vcnCompartmentId,
                            this.subnetCompartmentId,
                            this.maxOcpuCount,
                            this.minOcpuCount,
                            this.maxMemoryGB,
                            this.minMemoryGB,
                            this.pipelineConfigurationBody,
                            this.opensearchPipelineFqdn,
                            this.opensearchPipelinePrivateIp,
                            this.lifecycleState,
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
        public Builder copy(OpensearchClusterPipeline model) {
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
            if (model.wasPropertyExplicitlySet("vcnCompartmentId")) {
                this.vcnCompartmentId(model.getVcnCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("subnetCompartmentId")) {
                this.subnetCompartmentId(model.getSubnetCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("maxOcpuCount")) {
                this.maxOcpuCount(model.getMaxOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("minOcpuCount")) {
                this.minOcpuCount(model.getMinOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("maxMemoryGB")) {
                this.maxMemoryGB(model.getMaxMemoryGB());
            }
            if (model.wasPropertyExplicitlySet("minMemoryGB")) {
                this.minMemoryGB(model.getMinMemoryGB());
            }
            if (model.wasPropertyExplicitlySet("pipelineConfigurationBody")) {
                this.pipelineConfigurationBody(model.getPipelineConfigurationBody());
            }
            if (model.wasPropertyExplicitlySet("opensearchPipelineFqdn")) {
                this.opensearchPipelineFqdn(model.getOpensearchPipelineFqdn());
            }
            if (model.wasPropertyExplicitlySet("opensearchPipelinePrivateIp")) {
                this.opensearchPipelinePrivateIp(model.getOpensearchPipelinePrivateIp());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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

    /** The name of the pipeline. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the pipeline. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the compartment where the pipeline is located. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the pipeline is located.
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

    /** The OCID for the compartment where the pipeline's VCN is located. */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnCompartmentId")
    private final String vcnCompartmentId;

    /**
     * The OCID for the compartment where the pipeline's VCN is located.
     *
     * @return the value
     */
    public String getVcnCompartmentId() {
        return vcnCompartmentId;
    }

    /** The OCID for the compartment where the pipwline's subnet is located. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetCompartmentId")
    private final String subnetCompartmentId;

    /**
     * The OCID for the compartment where the pipwline's subnet is located.
     *
     * @return the value
     */
    public String getSubnetCompartmentId() {
        return subnetCompartmentId;
    }

    /** The maximum pipeline capacity, in OCPUs. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxOcpuCount")
    private final Integer maxOcpuCount;

    /**
     * The maximum pipeline capacity, in OCPUs.
     *
     * @return the value
     */
    public Integer getMaxOcpuCount() {
        return maxOcpuCount;
    }

    /** The maximum pipeline capacity, in OCPUs. */
    @com.fasterxml.jackson.annotation.JsonProperty("minOcpuCount")
    private final Integer minOcpuCount;

    /**
     * The maximum pipeline capacity, in OCPUs.
     *
     * @return the value
     */
    public Integer getMinOcpuCount() {
        return minOcpuCount;
    }

    /** The maximum amount of memory in GB, for the pipeline. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryGB")
    private final Integer maxMemoryGB;

    /**
     * The maximum amount of memory in GB, for the pipeline.
     *
     * @return the value
     */
    public Integer getMaxMemoryGB() {
        return maxMemoryGB;
    }

    /** The minimum amount of memory in GB, for the pipeline. */
    @com.fasterxml.jackson.annotation.JsonProperty("minMemoryGB")
    private final Integer minMemoryGB;

    /**
     * The minimum amount of memory in GB, for the pipeline.
     *
     * @return the value
     */
    public Integer getMinMemoryGB() {
        return minMemoryGB;
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

    /** The fully qualified domain name (FQDN) for the cluster's API endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("opensearchPipelineFqdn")
    private final String opensearchPipelineFqdn;

    /**
     * The fully qualified domain name (FQDN) for the cluster's API endpoint.
     *
     * @return the value
     */
    public String getOpensearchPipelineFqdn() {
        return opensearchPipelineFqdn;
    }

    /** The pipeline's private IP address. */
    @com.fasterxml.jackson.annotation.JsonProperty("opensearchPipelinePrivateIp")
    private final String opensearchPipelinePrivateIp;

    /**
     * The pipeline's private IP address.
     *
     * @return the value
     */
    public String getOpensearchPipelinePrivateIp() {
        return opensearchPipelinePrivateIp;
    }

    /** The current state of the cluster backup. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };
    /** The current state of the cluster backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the cluster backup.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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

    /** The amount of time in milliseconds since the pipeline was updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The amount of time in milliseconds since the pipeline was updated.
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
        sb.append("OpensearchClusterPipeline(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", vcnCompartmentId=").append(String.valueOf(this.vcnCompartmentId));
        sb.append(", subnetCompartmentId=").append(String.valueOf(this.subnetCompartmentId));
        sb.append(", maxOcpuCount=").append(String.valueOf(this.maxOcpuCount));
        sb.append(", minOcpuCount=").append(String.valueOf(this.minOcpuCount));
        sb.append(", maxMemoryGB=").append(String.valueOf(this.maxMemoryGB));
        sb.append(", minMemoryGB=").append(String.valueOf(this.minMemoryGB));
        sb.append(", pipelineConfigurationBody=")
                .append(String.valueOf(this.pipelineConfigurationBody));
        sb.append(", opensearchPipelineFqdn=").append(String.valueOf(this.opensearchPipelineFqdn));
        sb.append(", opensearchPipelinePrivateIp=")
                .append(String.valueOf(this.opensearchPipelinePrivateIp));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
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
        if (!(o instanceof OpensearchClusterPipeline)) {
            return false;
        }

        OpensearchClusterPipeline other = (OpensearchClusterPipeline) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.vcnCompartmentId, other.vcnCompartmentId)
                && java.util.Objects.equals(this.subnetCompartmentId, other.subnetCompartmentId)
                && java.util.Objects.equals(this.maxOcpuCount, other.maxOcpuCount)
                && java.util.Objects.equals(this.minOcpuCount, other.minOcpuCount)
                && java.util.Objects.equals(this.maxMemoryGB, other.maxMemoryGB)
                && java.util.Objects.equals(this.minMemoryGB, other.minMemoryGB)
                && java.util.Objects.equals(
                        this.pipelineConfigurationBody, other.pipelineConfigurationBody)
                && java.util.Objects.equals(
                        this.opensearchPipelineFqdn, other.opensearchPipelineFqdn)
                && java.util.Objects.equals(
                        this.opensearchPipelinePrivateIp, other.opensearchPipelinePrivateIp)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
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
        result =
                (result * PRIME)
                        + (this.vcnCompartmentId == null ? 43 : this.vcnCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.subnetCompartmentId == null
                                ? 43
                                : this.subnetCompartmentId.hashCode());
        result = (result * PRIME) + (this.maxOcpuCount == null ? 43 : this.maxOcpuCount.hashCode());
        result = (result * PRIME) + (this.minOcpuCount == null ? 43 : this.minOcpuCount.hashCode());
        result = (result * PRIME) + (this.maxMemoryGB == null ? 43 : this.maxMemoryGB.hashCode());
        result = (result * PRIME) + (this.minMemoryGB == null ? 43 : this.minMemoryGB.hashCode());
        result =
                (result * PRIME)
                        + (this.pipelineConfigurationBody == null
                                ? 43
                                : this.pipelineConfigurationBody.hashCode());
        result =
                (result * PRIME)
                        + (this.opensearchPipelineFqdn == null
                                ? 43
                                : this.opensearchPipelineFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.opensearchPipelinePrivateIp == null
                                ? 43
                                : this.opensearchPipelinePrivateIp.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

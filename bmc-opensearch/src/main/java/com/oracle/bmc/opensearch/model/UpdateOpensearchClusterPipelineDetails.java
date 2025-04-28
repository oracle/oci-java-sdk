/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * The configuration to update on an existing OpenSearch cluster pipeline. You can only edit
 * capacity limits and pipeline configurations. You can't edit its network settings. <br>
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
        builder = UpdateOpensearchClusterPipelineDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateOpensearchClusterPipelineDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "ocpuCount",
        "memoryGB",
        "nodeCount",
        "pipelineConfigurationBody",
        "dataPrepperConfigurationBody",
        "vcnId",
        "subnetId",
        "vcnCompartmentId",
        "subnetCompartmentId",
        "nsgId",
        "reverseConnectionEndpoints",
        "freeformTags",
        "definedTags"
    })
    public UpdateOpensearchClusterPipelineDetails(
            String displayName,
            Integer ocpuCount,
            Integer memoryGB,
            Integer nodeCount,
            String pipelineConfigurationBody,
            String dataPrepperConfigurationBody,
            String vcnId,
            String subnetId,
            String vcnCompartmentId,
            String subnetCompartmentId,
            String nsgId,
            java.util.List<OpensearchPipelineReverseConnectionEndpoint> reverseConnectionEndpoints,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.ocpuCount = ocpuCount;
        this.memoryGB = memoryGB;
        this.nodeCount = nodeCount;
        this.pipelineConfigurationBody = pipelineConfigurationBody;
        this.dataPrepperConfigurationBody = dataPrepperConfigurationBody;
        this.vcnId = vcnId;
        this.subnetId = subnetId;
        this.vcnCompartmentId = vcnCompartmentId;
        this.subnetCompartmentId = subnetCompartmentId;
        this.nsgId = nsgId;
        this.reverseConnectionEndpoints = reverseConnectionEndpoints;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** The OCID for the compartment where the pipeline's subnet is located. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetCompartmentId")
        private String subnetCompartmentId;

        /**
         * The OCID for the compartment where the pipeline's subnet is located.
         *
         * @param subnetCompartmentId the value to set
         * @return this builder
         */
        public Builder subnetCompartmentId(String subnetCompartmentId) {
            this.subnetCompartmentId = subnetCompartmentId;
            this.__explicitlySet__.add("subnetCompartmentId");
            return this;
        }
        /** The OCID of the NSG where the pipeline private endpoint vnic will be attached. */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgId")
        private String nsgId;

        /**
         * The OCID of the NSG where the pipeline private endpoint vnic will be attached.
         *
         * @param nsgId the value to set
         * @return this builder
         */
        public Builder nsgId(String nsgId) {
            this.nsgId = nsgId;
            this.__explicitlySet__.add("nsgId");
            return this;
        }
        /**
         * The customer IP and the corresponding fully qualified domain name that the pipeline will
         * connect to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("reverseConnectionEndpoints")
        private java.util.List<OpensearchPipelineReverseConnectionEndpoint>
                reverseConnectionEndpoints;

        /**
         * The customer IP and the corresponding fully qualified domain name that the pipeline will
         * connect to.
         *
         * @param reverseConnectionEndpoints the value to set
         * @return this builder
         */
        public Builder reverseConnectionEndpoints(
                java.util.List<OpensearchPipelineReverseConnectionEndpoint>
                        reverseConnectionEndpoints) {
            this.reverseConnectionEndpoints = reverseConnectionEndpoints;
            this.__explicitlySet__.add("reverseConnectionEndpoints");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOpensearchClusterPipelineDetails build() {
            UpdateOpensearchClusterPipelineDetails model =
                    new UpdateOpensearchClusterPipelineDetails(
                            this.displayName,
                            this.ocpuCount,
                            this.memoryGB,
                            this.nodeCount,
                            this.pipelineConfigurationBody,
                            this.dataPrepperConfigurationBody,
                            this.vcnId,
                            this.subnetId,
                            this.vcnCompartmentId,
                            this.subnetCompartmentId,
                            this.nsgId,
                            this.reverseConnectionEndpoints,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOpensearchClusterPipelineDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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
            if (model.wasPropertyExplicitlySet("nsgId")) {
                this.nsgId(model.getNsgId());
            }
            if (model.wasPropertyExplicitlySet("reverseConnectionEndpoints")) {
                this.reverseConnectionEndpoints(model.getReverseConnectionEndpoints());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** The OCID for the compartment where the pipeline's subnet is located. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetCompartmentId")
    private final String subnetCompartmentId;

    /**
     * The OCID for the compartment where the pipeline's subnet is located.
     *
     * @return the value
     */
    public String getSubnetCompartmentId() {
        return subnetCompartmentId;
    }

    /** The OCID of the NSG where the pipeline private endpoint vnic will be attached. */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgId")
    private final String nsgId;

    /**
     * The OCID of the NSG where the pipeline private endpoint vnic will be attached.
     *
     * @return the value
     */
    public String getNsgId() {
        return nsgId;
    }

    /**
     * The customer IP and the corresponding fully qualified domain name that the pipeline will
     * connect to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reverseConnectionEndpoints")
    private final java.util.List<OpensearchPipelineReverseConnectionEndpoint>
            reverseConnectionEndpoints;

    /**
     * The customer IP and the corresponding fully qualified domain name that the pipeline will
     * connect to.
     *
     * @return the value
     */
    public java.util.List<OpensearchPipelineReverseConnectionEndpoint>
            getReverseConnectionEndpoints() {
        return reverseConnectionEndpoints;
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
        sb.append("UpdateOpensearchClusterPipelineDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", ocpuCount=").append(String.valueOf(this.ocpuCount));
        sb.append(", memoryGB=").append(String.valueOf(this.memoryGB));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", pipelineConfigurationBody=")
                .append(String.valueOf(this.pipelineConfigurationBody));
        sb.append(", dataPrepperConfigurationBody=")
                .append(String.valueOf(this.dataPrepperConfigurationBody));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", vcnCompartmentId=").append(String.valueOf(this.vcnCompartmentId));
        sb.append(", subnetCompartmentId=").append(String.valueOf(this.subnetCompartmentId));
        sb.append(", nsgId=").append(String.valueOf(this.nsgId));
        sb.append(", reverseConnectionEndpoints=")
                .append(String.valueOf(this.reverseConnectionEndpoints));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOpensearchClusterPipelineDetails)) {
            return false;
        }

        UpdateOpensearchClusterPipelineDetails other = (UpdateOpensearchClusterPipelineDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.ocpuCount, other.ocpuCount)
                && java.util.Objects.equals(this.memoryGB, other.memoryGB)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(
                        this.pipelineConfigurationBody, other.pipelineConfigurationBody)
                && java.util.Objects.equals(
                        this.dataPrepperConfigurationBody, other.dataPrepperConfigurationBody)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.vcnCompartmentId, other.vcnCompartmentId)
                && java.util.Objects.equals(this.subnetCompartmentId, other.subnetCompartmentId)
                && java.util.Objects.equals(this.nsgId, other.nsgId)
                && java.util.Objects.equals(
                        this.reverseConnectionEndpoints, other.reverseConnectionEndpoints)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
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
        result = (result * PRIME) + (this.nsgId == null ? 43 : this.nsgId.hashCode());
        result =
                (result * PRIME)
                        + (this.reverseConnectionEndpoints == null
                                ? 43
                                : this.reverseConnectionEndpoints.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

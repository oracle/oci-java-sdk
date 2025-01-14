/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * The configuration to update on an existing OpenSearch cluster pipeline. You can only edit
 * capaccity limits and pipeline configuration. You can't edit its name or network settings. <br>
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
        "maxOcpuCount",
        "minOcpuCount",
        "maxMemoryGB",
        "minMemoryGB",
        "pipelineConfigurationBody"
    })
    public UpdateOpensearchClusterPipelineDetails(
            String displayName,
            Integer maxOcpuCount,
            Integer minOcpuCount,
            Integer maxMemoryGB,
            Integer minMemoryGB,
            String pipelineConfigurationBody) {
        super();
        this.displayName = displayName;
        this.maxOcpuCount = maxOcpuCount;
        this.minOcpuCount = minOcpuCount;
        this.maxMemoryGB = maxMemoryGB;
        this.minMemoryGB = minMemoryGB;
        this.pipelineConfigurationBody = pipelineConfigurationBody;
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
        /** The minimum pipeline capacity, in OCPUs. */
        @com.fasterxml.jackson.annotation.JsonProperty("minOcpuCount")
        private Integer minOcpuCount;

        /**
         * The minimum pipeline capacity, in OCPUs.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOpensearchClusterPipelineDetails build() {
            UpdateOpensearchClusterPipelineDetails model =
                    new UpdateOpensearchClusterPipelineDetails(
                            this.displayName,
                            this.maxOcpuCount,
                            this.minOcpuCount,
                            this.maxMemoryGB,
                            this.minMemoryGB,
                            this.pipelineConfigurationBody);
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

    /** The minimum pipeline capacity, in OCPUs. */
    @com.fasterxml.jackson.annotation.JsonProperty("minOcpuCount")
    private final Integer minOcpuCount;

    /**
     * The minimum pipeline capacity, in OCPUs.
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
        sb.append(", maxOcpuCount=").append(String.valueOf(this.maxOcpuCount));
        sb.append(", minOcpuCount=").append(String.valueOf(this.minOcpuCount));
        sb.append(", maxMemoryGB=").append(String.valueOf(this.maxMemoryGB));
        sb.append(", minMemoryGB=").append(String.valueOf(this.minMemoryGB));
        sb.append(", pipelineConfigurationBody=")
                .append(String.valueOf(this.pipelineConfigurationBody));
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
                && java.util.Objects.equals(this.maxOcpuCount, other.maxOcpuCount)
                && java.util.Objects.equals(this.minOcpuCount, other.minOcpuCount)
                && java.util.Objects.equals(this.maxMemoryGB, other.maxMemoryGB)
                && java.util.Objects.equals(this.minMemoryGB, other.minMemoryGB)
                && java.util.Objects.equals(
                        this.pipelineConfigurationBody, other.pipelineConfigurationBody)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.maxOcpuCount == null ? 43 : this.maxOcpuCount.hashCode());
        result = (result * PRIME) + (this.minOcpuCount == null ? 43 : this.minOcpuCount.hashCode());
        result = (result * PRIME) + (this.maxMemoryGB == null ? 43 : this.maxMemoryGB.hashCode());
        result = (result * PRIME) + (this.minMemoryGB == null ? 43 : this.minMemoryGB.hashCode());
        result =
                (result * PRIME)
                        + (this.pipelineConfigurationBody == null
                                ? 43
                                : this.pipelineConfigurationBody.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

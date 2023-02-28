/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * The OCPU and memory configuration to update on an existing OpenSearch cluster for [vertical
 * resizing](https://docs.cloud.oracle.com/iaas/Content/search-opensearch/Tasks/resizingacluster.htm#vertical).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResizeOpensearchClusterVerticalDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ResizeOpensearchClusterVerticalDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "masterNodeHostOcpuCount",
        "masterNodeHostMemoryGB",
        "dataNodeHostOcpuCount",
        "dataNodeHostMemoryGB",
        "dataNodeStorageGB",
        "opendashboardNodeHostOcpuCount",
        "opendashboardNodeHostMemoryGB",
        "freeformTags",
        "definedTags"
    })
    public ResizeOpensearchClusterVerticalDetails(
            Integer masterNodeHostOcpuCount,
            Integer masterNodeHostMemoryGB,
            Integer dataNodeHostOcpuCount,
            Integer dataNodeHostMemoryGB,
            Integer dataNodeStorageGB,
            Integer opendashboardNodeHostOcpuCount,
            Integer opendashboardNodeHostMemoryGB,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.masterNodeHostOcpuCount = masterNodeHostOcpuCount;
        this.masterNodeHostMemoryGB = masterNodeHostMemoryGB;
        this.dataNodeHostOcpuCount = dataNodeHostOcpuCount;
        this.dataNodeHostMemoryGB = dataNodeHostMemoryGB;
        this.dataNodeStorageGB = dataNodeStorageGB;
        this.opendashboardNodeHostOcpuCount = opendashboardNodeHostOcpuCount;
        this.opendashboardNodeHostMemoryGB = opendashboardNodeHostMemoryGB;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The number of OCPUs to configure for the cluster's master nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostOcpuCount")
        private Integer masterNodeHostOcpuCount;

        /**
         * The number of OCPUs to configure for the cluster's master nodes.
         *
         * @param masterNodeHostOcpuCount the value to set
         * @return this builder
         */
        public Builder masterNodeHostOcpuCount(Integer masterNodeHostOcpuCount) {
            this.masterNodeHostOcpuCount = masterNodeHostOcpuCount;
            this.__explicitlySet__.add("masterNodeHostOcpuCount");
            return this;
        }
        /** The amount of memory in GB, to configure for the cluster's master nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostMemoryGB")
        private Integer masterNodeHostMemoryGB;

        /**
         * The amount of memory in GB, to configure for the cluster's master nodes.
         *
         * @param masterNodeHostMemoryGB the value to set
         * @return this builder
         */
        public Builder masterNodeHostMemoryGB(Integer masterNodeHostMemoryGB) {
            this.masterNodeHostMemoryGB = masterNodeHostMemoryGB;
            this.__explicitlySet__.add("masterNodeHostMemoryGB");
            return this;
        }
        /** The number of OCPUs to configure for the cluster's data nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostOcpuCount")
        private Integer dataNodeHostOcpuCount;

        /**
         * The number of OCPUs to configure for the cluster's data nodes.
         *
         * @param dataNodeHostOcpuCount the value to set
         * @return this builder
         */
        public Builder dataNodeHostOcpuCount(Integer dataNodeHostOcpuCount) {
            this.dataNodeHostOcpuCount = dataNodeHostOcpuCount;
            this.__explicitlySet__.add("dataNodeHostOcpuCount");
            return this;
        }
        /** The amount of memory in GB, to configure for the cluster's data nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostMemoryGB")
        private Integer dataNodeHostMemoryGB;

        /**
         * The amount of memory in GB, to configure for the cluster's data nodes.
         *
         * @param dataNodeHostMemoryGB the value to set
         * @return this builder
         */
        public Builder dataNodeHostMemoryGB(Integer dataNodeHostMemoryGB) {
            this.dataNodeHostMemoryGB = dataNodeHostMemoryGB;
            this.__explicitlySet__.add("dataNodeHostMemoryGB");
            return this;
        }
        /** The amount of storage in GB, to configure per node for the cluster's data nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataNodeStorageGB")
        private Integer dataNodeStorageGB;

        /**
         * The amount of storage in GB, to configure per node for the cluster's data nodes.
         *
         * @param dataNodeStorageGB the value to set
         * @return this builder
         */
        public Builder dataNodeStorageGB(Integer dataNodeStorageGB) {
            this.dataNodeStorageGB = dataNodeStorageGB;
            this.__explicitlySet__.add("dataNodeStorageGB");
            return this;
        }
        /** The number of OCPUs to configure for the cluster's OpenSearch Dashboard nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("opendashboardNodeHostOcpuCount")
        private Integer opendashboardNodeHostOcpuCount;

        /**
         * The number of OCPUs to configure for the cluster's OpenSearch Dashboard nodes.
         *
         * @param opendashboardNodeHostOcpuCount the value to set
         * @return this builder
         */
        public Builder opendashboardNodeHostOcpuCount(Integer opendashboardNodeHostOcpuCount) {
            this.opendashboardNodeHostOcpuCount = opendashboardNodeHostOcpuCount;
            this.__explicitlySet__.add("opendashboardNodeHostOcpuCount");
            return this;
        }
        /**
         * The amount of memory in GB, to configure for the cluster's OpenSearch Dashboard nodes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("opendashboardNodeHostMemoryGB")
        private Integer opendashboardNodeHostMemoryGB;

        /**
         * The amount of memory in GB, to configure for the cluster's OpenSearch Dashboard nodes.
         *
         * @param opendashboardNodeHostMemoryGB the value to set
         * @return this builder
         */
        public Builder opendashboardNodeHostMemoryGB(Integer opendashboardNodeHostMemoryGB) {
            this.opendashboardNodeHostMemoryGB = opendashboardNodeHostMemoryGB;
            this.__explicitlySet__.add("opendashboardNodeHostMemoryGB");
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

        public ResizeOpensearchClusterVerticalDetails build() {
            ResizeOpensearchClusterVerticalDetails model =
                    new ResizeOpensearchClusterVerticalDetails(
                            this.masterNodeHostOcpuCount,
                            this.masterNodeHostMemoryGB,
                            this.dataNodeHostOcpuCount,
                            this.dataNodeHostMemoryGB,
                            this.dataNodeStorageGB,
                            this.opendashboardNodeHostOcpuCount,
                            this.opendashboardNodeHostMemoryGB,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResizeOpensearchClusterVerticalDetails model) {
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
            if (model.wasPropertyExplicitlySet("dataNodeStorageGB")) {
                this.dataNodeStorageGB(model.getDataNodeStorageGB());
            }
            if (model.wasPropertyExplicitlySet("opendashboardNodeHostOcpuCount")) {
                this.opendashboardNodeHostOcpuCount(model.getOpendashboardNodeHostOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("opendashboardNodeHostMemoryGB")) {
                this.opendashboardNodeHostMemoryGB(model.getOpendashboardNodeHostMemoryGB());
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

    /** The number of OCPUs to configure for the cluster's master nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostOcpuCount")
    private final Integer masterNodeHostOcpuCount;

    /**
     * The number of OCPUs to configure for the cluster's master nodes.
     *
     * @return the value
     */
    public Integer getMasterNodeHostOcpuCount() {
        return masterNodeHostOcpuCount;
    }

    /** The amount of memory in GB, to configure for the cluster's master nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostMemoryGB")
    private final Integer masterNodeHostMemoryGB;

    /**
     * The amount of memory in GB, to configure for the cluster's master nodes.
     *
     * @return the value
     */
    public Integer getMasterNodeHostMemoryGB() {
        return masterNodeHostMemoryGB;
    }

    /** The number of OCPUs to configure for the cluster's data nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostOcpuCount")
    private final Integer dataNodeHostOcpuCount;

    /**
     * The number of OCPUs to configure for the cluster's data nodes.
     *
     * @return the value
     */
    public Integer getDataNodeHostOcpuCount() {
        return dataNodeHostOcpuCount;
    }

    /** The amount of memory in GB, to configure for the cluster's data nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostMemoryGB")
    private final Integer dataNodeHostMemoryGB;

    /**
     * The amount of memory in GB, to configure for the cluster's data nodes.
     *
     * @return the value
     */
    public Integer getDataNodeHostMemoryGB() {
        return dataNodeHostMemoryGB;
    }

    /** The amount of storage in GB, to configure per node for the cluster's data nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataNodeStorageGB")
    private final Integer dataNodeStorageGB;

    /**
     * The amount of storage in GB, to configure per node for the cluster's data nodes.
     *
     * @return the value
     */
    public Integer getDataNodeStorageGB() {
        return dataNodeStorageGB;
    }

    /** The number of OCPUs to configure for the cluster's OpenSearch Dashboard nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("opendashboardNodeHostOcpuCount")
    private final Integer opendashboardNodeHostOcpuCount;

    /**
     * The number of OCPUs to configure for the cluster's OpenSearch Dashboard nodes.
     *
     * @return the value
     */
    public Integer getOpendashboardNodeHostOcpuCount() {
        return opendashboardNodeHostOcpuCount;
    }

    /** The amount of memory in GB, to configure for the cluster's OpenSearch Dashboard nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("opendashboardNodeHostMemoryGB")
    private final Integer opendashboardNodeHostMemoryGB;

    /**
     * The amount of memory in GB, to configure for the cluster's OpenSearch Dashboard nodes.
     *
     * @return the value
     */
    public Integer getOpendashboardNodeHostMemoryGB() {
        return opendashboardNodeHostMemoryGB;
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
        sb.append("ResizeOpensearchClusterVerticalDetails(");
        sb.append("super=").append(super.toString());
        sb.append("masterNodeHostOcpuCount=").append(String.valueOf(this.masterNodeHostOcpuCount));
        sb.append(", masterNodeHostMemoryGB=").append(String.valueOf(this.masterNodeHostMemoryGB));
        sb.append(", dataNodeHostOcpuCount=").append(String.valueOf(this.dataNodeHostOcpuCount));
        sb.append(", dataNodeHostMemoryGB=").append(String.valueOf(this.dataNodeHostMemoryGB));
        sb.append(", dataNodeStorageGB=").append(String.valueOf(this.dataNodeStorageGB));
        sb.append(", opendashboardNodeHostOcpuCount=")
                .append(String.valueOf(this.opendashboardNodeHostOcpuCount));
        sb.append(", opendashboardNodeHostMemoryGB=")
                .append(String.valueOf(this.opendashboardNodeHostMemoryGB));
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
        if (!(o instanceof ResizeOpensearchClusterVerticalDetails)) {
            return false;
        }

        ResizeOpensearchClusterVerticalDetails other = (ResizeOpensearchClusterVerticalDetails) o;
        return java.util.Objects.equals(this.masterNodeHostOcpuCount, other.masterNodeHostOcpuCount)
                && java.util.Objects.equals(
                        this.masterNodeHostMemoryGB, other.masterNodeHostMemoryGB)
                && java.util.Objects.equals(this.dataNodeHostOcpuCount, other.dataNodeHostOcpuCount)
                && java.util.Objects.equals(this.dataNodeHostMemoryGB, other.dataNodeHostMemoryGB)
                && java.util.Objects.equals(this.dataNodeStorageGB, other.dataNodeStorageGB)
                && java.util.Objects.equals(
                        this.opendashboardNodeHostOcpuCount, other.opendashboardNodeHostOcpuCount)
                && java.util.Objects.equals(
                        this.opendashboardNodeHostMemoryGB, other.opendashboardNodeHostMemoryGB)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
                        + (this.dataNodeStorageGB == null ? 43 : this.dataNodeStorageGB.hashCode());
        result =
                (result * PRIME)
                        + (this.opendashboardNodeHostOcpuCount == null
                                ? 43
                                : this.opendashboardNodeHostOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.opendashboardNodeHostMemoryGB == null
                                ? 43
                                : this.opendashboardNodeHostMemoryGB.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

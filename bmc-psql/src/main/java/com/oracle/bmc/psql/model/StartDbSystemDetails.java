/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * DB System start parameters to update ocpu, memory, shape and configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = StartDbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class StartDbSystemDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceOcpuCount",
        "instanceMemorySizeInGBs",
        "shape",
        "configId"
    })
    public StartDbSystemDetails(
            Integer instanceOcpuCount,
            Integer instanceMemorySizeInGBs,
            String shape,
            String configId) {
        super();
        this.instanceOcpuCount = instanceOcpuCount;
        this.instanceMemorySizeInGBs = instanceMemorySizeInGBs;
        this.shape = shape;
        this.configId = configId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The total number of OCPUs available to each database system node. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceOcpuCount")
        private Integer instanceOcpuCount;

        /**
         * The total number of OCPUs available to each database system node.
         *
         * @param instanceOcpuCount the value to set
         * @return this builder
         */
        public Builder instanceOcpuCount(Integer instanceOcpuCount) {
            this.instanceOcpuCount = instanceOcpuCount;
            this.__explicitlySet__.add("instanceOcpuCount");
            return this;
        }
        /** The total amount of memory available to each database system node, in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceMemorySizeInGBs")
        private Integer instanceMemorySizeInGBs;

        /**
         * The total amount of memory available to each database system node, in gigabytes.
         *
         * @param instanceMemorySizeInGBs the value to set
         * @return this builder
         */
        public Builder instanceMemorySizeInGBs(Integer instanceMemorySizeInGBs) {
            this.instanceMemorySizeInGBs = instanceMemorySizeInGBs;
            this.__explicitlySet__.add("instanceMemorySizeInGBs");
            return this;
        }
        /**
         * The name of the shape for the database system nodes. Example: {@code VM.Standard.E4.Flex}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The name of the shape for the database system nodes. Example: {@code VM.Standard.E4.Flex}
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The updated configId for the database system. */
        @com.fasterxml.jackson.annotation.JsonProperty("configId")
        private String configId;

        /**
         * The updated configId for the database system.
         *
         * @param configId the value to set
         * @return this builder
         */
        public Builder configId(String configId) {
            this.configId = configId;
            this.__explicitlySet__.add("configId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StartDbSystemDetails build() {
            StartDbSystemDetails model =
                    new StartDbSystemDetails(
                            this.instanceOcpuCount,
                            this.instanceMemorySizeInGBs,
                            this.shape,
                            this.configId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StartDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("instanceOcpuCount")) {
                this.instanceOcpuCount(model.getInstanceOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("instanceMemorySizeInGBs")) {
                this.instanceMemorySizeInGBs(model.getInstanceMemorySizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("configId")) {
                this.configId(model.getConfigId());
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

    /** The total number of OCPUs available to each database system node. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceOcpuCount")
    private final Integer instanceOcpuCount;

    /**
     * The total number of OCPUs available to each database system node.
     *
     * @return the value
     */
    public Integer getInstanceOcpuCount() {
        return instanceOcpuCount;
    }

    /** The total amount of memory available to each database system node, in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceMemorySizeInGBs")
    private final Integer instanceMemorySizeInGBs;

    /**
     * The total amount of memory available to each database system node, in gigabytes.
     *
     * @return the value
     */
    public Integer getInstanceMemorySizeInGBs() {
        return instanceMemorySizeInGBs;
    }

    /** The name of the shape for the database system nodes. Example: {@code VM.Standard.E4.Flex} */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The name of the shape for the database system nodes. Example: {@code VM.Standard.E4.Flex}
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** The updated configId for the database system. */
    @com.fasterxml.jackson.annotation.JsonProperty("configId")
    private final String configId;

    /**
     * The updated configId for the database system.
     *
     * @return the value
     */
    public String getConfigId() {
        return configId;
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
        sb.append("StartDbSystemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("instanceOcpuCount=").append(String.valueOf(this.instanceOcpuCount));
        sb.append(", instanceMemorySizeInGBs=")
                .append(String.valueOf(this.instanceMemorySizeInGBs));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", configId=").append(String.valueOf(this.configId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StartDbSystemDetails)) {
            return false;
        }

        StartDbSystemDetails other = (StartDbSystemDetails) o;
        return java.util.Objects.equals(this.instanceOcpuCount, other.instanceOcpuCount)
                && java.util.Objects.equals(
                        this.instanceMemorySizeInGBs, other.instanceMemorySizeInGBs)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.configId, other.configId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.instanceOcpuCount == null ? 43 : this.instanceOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceMemorySizeInGBs == null
                                ? 43
                                : this.instanceMemorySizeInGBs.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.configId == null ? 43 : this.configId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

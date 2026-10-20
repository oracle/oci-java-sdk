/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Read-only default warm-pool capacities for managed-runtime sandboxes. The reserved MANAGED
 * default entries exposed by the named warm-pool APIs project these same values. Project create and
 * update requests must not supply this configuration. Newly enabled projects start with zero
 * capacity for every shape. Change capacities through the named warm-pool APIs, which also manage
 * CUSTOM pools. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SandboxWarmPoolConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SandboxWarmPoolConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"smallCount", "mediumCount", "largeCount"})
    public SandboxWarmPoolConfig(Integer smallCount, Integer mediumCount, Integer largeCount) {
        super();
        this.smallCount = smallCount;
        this.mediumCount = mediumCount;
        this.largeCount = largeCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Desired number of ready SMALL managed-runtime sandboxes. Each sandbox has 1 CPU and 4 GiB
         * of memory.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("smallCount")
        private Integer smallCount;

        /**
         * Desired number of ready SMALL managed-runtime sandboxes. Each sandbox has 1 CPU and 4 GiB
         * of memory.
         *
         * @param smallCount the value to set
         * @return this builder
         */
        public Builder smallCount(Integer smallCount) {
            this.smallCount = smallCount;
            this.__explicitlySet__.add("smallCount");
            return this;
        }
        /**
         * Desired number of ready MEDIUM managed-runtime sandboxes. Each sandbox has 2 CPUs and 8
         * GiB of memory.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mediumCount")
        private Integer mediumCount;

        /**
         * Desired number of ready MEDIUM managed-runtime sandboxes. Each sandbox has 2 CPUs and 8
         * GiB of memory.
         *
         * @param mediumCount the value to set
         * @return this builder
         */
        public Builder mediumCount(Integer mediumCount) {
            this.mediumCount = mediumCount;
            this.__explicitlySet__.add("mediumCount");
            return this;
        }
        /**
         * Desired number of ready LARGE managed-runtime sandboxes. Each sandbox has 4 CPUs and 16
         * GiB of memory.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("largeCount")
        private Integer largeCount;

        /**
         * Desired number of ready LARGE managed-runtime sandboxes. Each sandbox has 4 CPUs and 16
         * GiB of memory.
         *
         * @param largeCount the value to set
         * @return this builder
         */
        public Builder largeCount(Integer largeCount) {
            this.largeCount = largeCount;
            this.__explicitlySet__.add("largeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SandboxWarmPoolConfig build() {
            SandboxWarmPoolConfig model =
                    new SandboxWarmPoolConfig(this.smallCount, this.mediumCount, this.largeCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SandboxWarmPoolConfig model) {
            if (model.wasPropertyExplicitlySet("smallCount")) {
                this.smallCount(model.getSmallCount());
            }
            if (model.wasPropertyExplicitlySet("mediumCount")) {
                this.mediumCount(model.getMediumCount());
            }
            if (model.wasPropertyExplicitlySet("largeCount")) {
                this.largeCount(model.getLargeCount());
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
     * Desired number of ready SMALL managed-runtime sandboxes. Each sandbox has 1 CPU and 4 GiB of
     * memory.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("smallCount")
    private final Integer smallCount;

    /**
     * Desired number of ready SMALL managed-runtime sandboxes. Each sandbox has 1 CPU and 4 GiB of
     * memory.
     *
     * @return the value
     */
    public Integer getSmallCount() {
        return smallCount;
    }

    /**
     * Desired number of ready MEDIUM managed-runtime sandboxes. Each sandbox has 2 CPUs and 8 GiB
     * of memory.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mediumCount")
    private final Integer mediumCount;

    /**
     * Desired number of ready MEDIUM managed-runtime sandboxes. Each sandbox has 2 CPUs and 8 GiB
     * of memory.
     *
     * @return the value
     */
    public Integer getMediumCount() {
        return mediumCount;
    }

    /**
     * Desired number of ready LARGE managed-runtime sandboxes. Each sandbox has 4 CPUs and 16 GiB
     * of memory.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("largeCount")
    private final Integer largeCount;

    /**
     * Desired number of ready LARGE managed-runtime sandboxes. Each sandbox has 4 CPUs and 16 GiB
     * of memory.
     *
     * @return the value
     */
    public Integer getLargeCount() {
        return largeCount;
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
        sb.append("SandboxWarmPoolConfig(");
        sb.append("super=").append(super.toString());
        sb.append("smallCount=").append(String.valueOf(this.smallCount));
        sb.append(", mediumCount=").append(String.valueOf(this.mediumCount));
        sb.append(", largeCount=").append(String.valueOf(this.largeCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SandboxWarmPoolConfig)) {
            return false;
        }

        SandboxWarmPoolConfig other = (SandboxWarmPoolConfig) o;
        return java.util.Objects.equals(this.smallCount, other.smallCount)
                && java.util.Objects.equals(this.mediumCount, other.mediumCount)
                && java.util.Objects.equals(this.largeCount, other.largeCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.smallCount == null ? 43 : this.smallCount.hashCode());
        result = (result * PRIME) + (this.mediumCount == null ? 43 : this.mediumCount.hashCode());
        result = (result * PRIME) + (this.largeCount == null ? 43 : this.largeCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

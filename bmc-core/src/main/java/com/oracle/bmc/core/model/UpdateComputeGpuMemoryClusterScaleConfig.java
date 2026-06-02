/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Configuration settings for GPU Memory Cluster scaling.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateComputeGpuMemoryClusterScaleConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateComputeGpuMemoryClusterScaleConfig
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isUpsizeEnabled", "isDownsizeEnabled", "targetSize"})
    public UpdateComputeGpuMemoryClusterScaleConfig(
            Boolean isUpsizeEnabled, Boolean isDownsizeEnabled, Long targetSize) {
        super();
        this.isUpsizeEnabled = isUpsizeEnabled;
        this.isDownsizeEnabled = isDownsizeEnabled;
        this.targetSize = targetSize;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Enables upsizing towards the target size.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUpsizeEnabled")
        private Boolean isUpsizeEnabled;

        /**
         * Enables upsizing towards the target size.
         *
         * @param isUpsizeEnabled the value to set
         * @return this builder
         **/
        public Builder isUpsizeEnabled(Boolean isUpsizeEnabled) {
            this.isUpsizeEnabled = isUpsizeEnabled;
            this.__explicitlySet__.add("isUpsizeEnabled");
            return this;
        }
        /**
         * Enables downsizing towards the target size.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDownsizeEnabled")
        private Boolean isDownsizeEnabled;

        /**
         * Enables downsizing towards the target size.
         *
         * @param isDownsizeEnabled the value to set
         * @return this builder
         **/
        public Builder isDownsizeEnabled(Boolean isDownsizeEnabled) {
            this.isDownsizeEnabled = isDownsizeEnabled;
            this.__explicitlySet__.add("isDownsizeEnabled");
            return this;
        }
        /**
         * The configured target size for the GPU Memory Cluster.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetSize")
        private Long targetSize;

        /**
         * The configured target size for the GPU Memory Cluster.
         *
         * @param targetSize the value to set
         * @return this builder
         **/
        public Builder targetSize(Long targetSize) {
            this.targetSize = targetSize;
            this.__explicitlySet__.add("targetSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateComputeGpuMemoryClusterScaleConfig build() {
            UpdateComputeGpuMemoryClusterScaleConfig model =
                    new UpdateComputeGpuMemoryClusterScaleConfig(
                            this.isUpsizeEnabled, this.isDownsizeEnabled, this.targetSize);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateComputeGpuMemoryClusterScaleConfig model) {
            if (model.wasPropertyExplicitlySet("isUpsizeEnabled")) {
                this.isUpsizeEnabled(model.getIsUpsizeEnabled());
            }
            if (model.wasPropertyExplicitlySet("isDownsizeEnabled")) {
                this.isDownsizeEnabled(model.getIsDownsizeEnabled());
            }
            if (model.wasPropertyExplicitlySet("targetSize")) {
                this.targetSize(model.getTargetSize());
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
     * Enables upsizing towards the target size.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUpsizeEnabled")
    private final Boolean isUpsizeEnabled;

    /**
     * Enables upsizing towards the target size.
     *
     * @return the value
     **/
    public Boolean getIsUpsizeEnabled() {
        return isUpsizeEnabled;
    }

    /**
     * Enables downsizing towards the target size.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDownsizeEnabled")
    private final Boolean isDownsizeEnabled;

    /**
     * Enables downsizing towards the target size.
     *
     * @return the value
     **/
    public Boolean getIsDownsizeEnabled() {
        return isDownsizeEnabled;
    }

    /**
     * The configured target size for the GPU Memory Cluster.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetSize")
    private final Long targetSize;

    /**
     * The configured target size for the GPU Memory Cluster.
     *
     * @return the value
     **/
    public Long getTargetSize() {
        return targetSize;
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
        sb.append("UpdateComputeGpuMemoryClusterScaleConfig(");
        sb.append("super=").append(super.toString());
        sb.append("isUpsizeEnabled=").append(String.valueOf(this.isUpsizeEnabled));
        sb.append(", isDownsizeEnabled=").append(String.valueOf(this.isDownsizeEnabled));
        sb.append(", targetSize=").append(String.valueOf(this.targetSize));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateComputeGpuMemoryClusterScaleConfig)) {
            return false;
        }

        UpdateComputeGpuMemoryClusterScaleConfig other =
                (UpdateComputeGpuMemoryClusterScaleConfig) o;
        return java.util.Objects.equals(this.isUpsizeEnabled, other.isUpsizeEnabled)
                && java.util.Objects.equals(this.isDownsizeEnabled, other.isDownsizeEnabled)
                && java.util.Objects.equals(this.targetSize, other.targetSize)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isUpsizeEnabled == null ? 43 : this.isUpsizeEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isDownsizeEnabled == null ? 43 : this.isDownsizeEnabled.hashCode());
        result = (result * PRIME) + (this.targetSize == null ? 43 : this.targetSize.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

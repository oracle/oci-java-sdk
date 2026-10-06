/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Shape-specific details for shapes that support remote NVMe volume attachments. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BsNvmeAttachmentsConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BsNvmeAttachmentsConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "vfEnableCount",
        "minCores",
        "maxRemoteNvmeVolumeAttachmentsPerCore",
        "maxTotalRemoteNvmeVolumeAttachments"
    })
    public BsNvmeAttachmentsConfig(
            Integer vfEnableCount,
            Integer minCores,
            Integer maxRemoteNvmeVolumeAttachmentsPerCore,
            Integer maxTotalRemoteNvmeVolumeAttachments) {
        super();
        this.vfEnableCount = vfEnableCount;
        this.minCores = minCores;
        this.maxRemoteNvmeVolumeAttachmentsPerCore = maxRemoteNvmeVolumeAttachmentsPerCore;
        this.maxTotalRemoteNvmeVolumeAttachments = maxTotalRemoteNvmeVolumeAttachments;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The number of virtual functions to enable on a hypervisor so that each sellable core has
         * one virtual function available. This value is {@code 0} for VM and bare metal instances.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vfEnableCount")
        private Integer vfEnableCount;

        /**
         * The number of virtual functions to enable on a hypervisor so that each sellable core has
         * one virtual function available. This value is {@code 0} for VM and bare metal instances.
         *
         * @param vfEnableCount the value to set
         * @return this builder
         */
        public Builder vfEnableCount(Integer vfEnableCount) {
            this.vfEnableCount = vfEnableCount;
            this.__explicitlySet__.add("vfEnableCount");
            return this;
        }
        /** The minimum number of cores required to support remote NVMe volume attachments. */
        @com.fasterxml.jackson.annotation.JsonProperty("minCores")
        private Integer minCores;

        /**
         * The minimum number of cores required to support remote NVMe volume attachments.
         *
         * @param minCores the value to set
         * @return this builder
         */
        public Builder minCores(Integer minCores) {
            this.minCores = minCores;
            this.__explicitlySet__.add("minCores");
            return this;
        }
        /** The maximum number of remote NVMe volume attachments supported per core. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxRemoteNvmeVolumeAttachmentsPerCore")
        private Integer maxRemoteNvmeVolumeAttachmentsPerCore;

        /**
         * The maximum number of remote NVMe volume attachments supported per core.
         *
         * @param maxRemoteNvmeVolumeAttachmentsPerCore the value to set
         * @return this builder
         */
        public Builder maxRemoteNvmeVolumeAttachmentsPerCore(
                Integer maxRemoteNvmeVolumeAttachmentsPerCore) {
            this.maxRemoteNvmeVolumeAttachmentsPerCore = maxRemoteNvmeVolumeAttachmentsPerCore;
            this.__explicitlySet__.add("maxRemoteNvmeVolumeAttachmentsPerCore");
            return this;
        }
        /** The maximum total number of remote NVMe volume attachments supported for the shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxTotalRemoteNvmeVolumeAttachments")
        private Integer maxTotalRemoteNvmeVolumeAttachments;

        /**
         * The maximum total number of remote NVMe volume attachments supported for the shape.
         *
         * @param maxTotalRemoteNvmeVolumeAttachments the value to set
         * @return this builder
         */
        public Builder maxTotalRemoteNvmeVolumeAttachments(
                Integer maxTotalRemoteNvmeVolumeAttachments) {
            this.maxTotalRemoteNvmeVolumeAttachments = maxTotalRemoteNvmeVolumeAttachments;
            this.__explicitlySet__.add("maxTotalRemoteNvmeVolumeAttachments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BsNvmeAttachmentsConfig build() {
            BsNvmeAttachmentsConfig model =
                    new BsNvmeAttachmentsConfig(
                            this.vfEnableCount,
                            this.minCores,
                            this.maxRemoteNvmeVolumeAttachmentsPerCore,
                            this.maxTotalRemoteNvmeVolumeAttachments);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BsNvmeAttachmentsConfig model) {
            if (model.wasPropertyExplicitlySet("vfEnableCount")) {
                this.vfEnableCount(model.getVfEnableCount());
            }
            if (model.wasPropertyExplicitlySet("minCores")) {
                this.minCores(model.getMinCores());
            }
            if (model.wasPropertyExplicitlySet("maxRemoteNvmeVolumeAttachmentsPerCore")) {
                this.maxRemoteNvmeVolumeAttachmentsPerCore(
                        model.getMaxRemoteNvmeVolumeAttachmentsPerCore());
            }
            if (model.wasPropertyExplicitlySet("maxTotalRemoteNvmeVolumeAttachments")) {
                this.maxTotalRemoteNvmeVolumeAttachments(
                        model.getMaxTotalRemoteNvmeVolumeAttachments());
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
     * The number of virtual functions to enable on a hypervisor so that each sellable core has one
     * virtual function available. This value is {@code 0} for VM and bare metal instances.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vfEnableCount")
    private final Integer vfEnableCount;

    /**
     * The number of virtual functions to enable on a hypervisor so that each sellable core has one
     * virtual function available. This value is {@code 0} for VM and bare metal instances.
     *
     * @return the value
     */
    public Integer getVfEnableCount() {
        return vfEnableCount;
    }

    /** The minimum number of cores required to support remote NVMe volume attachments. */
    @com.fasterxml.jackson.annotation.JsonProperty("minCores")
    private final Integer minCores;

    /**
     * The minimum number of cores required to support remote NVMe volume attachments.
     *
     * @return the value
     */
    public Integer getMinCores() {
        return minCores;
    }

    /** The maximum number of remote NVMe volume attachments supported per core. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxRemoteNvmeVolumeAttachmentsPerCore")
    private final Integer maxRemoteNvmeVolumeAttachmentsPerCore;

    /**
     * The maximum number of remote NVMe volume attachments supported per core.
     *
     * @return the value
     */
    public Integer getMaxRemoteNvmeVolumeAttachmentsPerCore() {
        return maxRemoteNvmeVolumeAttachmentsPerCore;
    }

    /** The maximum total number of remote NVMe volume attachments supported for the shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxTotalRemoteNvmeVolumeAttachments")
    private final Integer maxTotalRemoteNvmeVolumeAttachments;

    /**
     * The maximum total number of remote NVMe volume attachments supported for the shape.
     *
     * @return the value
     */
    public Integer getMaxTotalRemoteNvmeVolumeAttachments() {
        return maxTotalRemoteNvmeVolumeAttachments;
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
        sb.append("BsNvmeAttachmentsConfig(");
        sb.append("super=").append(super.toString());
        sb.append("vfEnableCount=").append(String.valueOf(this.vfEnableCount));
        sb.append(", minCores=").append(String.valueOf(this.minCores));
        sb.append(", maxRemoteNvmeVolumeAttachmentsPerCore=")
                .append(String.valueOf(this.maxRemoteNvmeVolumeAttachmentsPerCore));
        sb.append(", maxTotalRemoteNvmeVolumeAttachments=")
                .append(String.valueOf(this.maxTotalRemoteNvmeVolumeAttachments));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BsNvmeAttachmentsConfig)) {
            return false;
        }

        BsNvmeAttachmentsConfig other = (BsNvmeAttachmentsConfig) o;
        return java.util.Objects.equals(this.vfEnableCount, other.vfEnableCount)
                && java.util.Objects.equals(this.minCores, other.minCores)
                && java.util.Objects.equals(
                        this.maxRemoteNvmeVolumeAttachmentsPerCore,
                        other.maxRemoteNvmeVolumeAttachmentsPerCore)
                && java.util.Objects.equals(
                        this.maxTotalRemoteNvmeVolumeAttachments,
                        other.maxTotalRemoteNvmeVolumeAttachments)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.vfEnableCount == null ? 43 : this.vfEnableCount.hashCode());
        result = (result * PRIME) + (this.minCores == null ? 43 : this.minCores.hashCode());
        result =
                (result * PRIME)
                        + (this.maxRemoteNvmeVolumeAttachmentsPerCore == null
                                ? 43
                                : this.maxRemoteNvmeVolumeAttachmentsPerCore.hashCode());
        result =
                (result * PRIME)
                        + (this.maxTotalRemoteNvmeVolumeAttachments == null
                                ? 43
                                : this.maxTotalRemoteNvmeVolumeAttachments.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

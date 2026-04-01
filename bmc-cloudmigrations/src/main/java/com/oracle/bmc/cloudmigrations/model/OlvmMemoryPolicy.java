/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Logical grouping of memory-related properties of virtual machine-like entities.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OlvmMemoryPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OlvmMemoryPolicy extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isBallooning",
        "guaranteedMemoryInBytes",
        "maxMemoryInBytes",
        "memoryOverCommit",
        "transparentHugePages"
    })
    public OlvmMemoryPolicy(
            Boolean isBallooning,
            Long guaranteedMemoryInBytes,
            Long maxMemoryInBytes,
            MemoryOverCommit memoryOverCommit,
            TransparentHugePages transparentHugePages) {
        super();
        this.isBallooning = isBallooning;
        this.guaranteedMemoryInBytes = guaranteedMemoryInBytes;
        this.maxMemoryInBytes = maxMemoryInBytes;
        this.memoryOverCommit = memoryOverCommit;
        this.transparentHugePages = transparentHugePages;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates if ballooning is enabled
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isBallooning")
        private Boolean isBallooning;

        /**
         * Indicates if ballooning is enabled
         * @param isBallooning the value to set
         * @return this builder
         **/
        public Builder isBallooning(Boolean isBallooning) {
            this.isBallooning = isBallooning;
            this.__explicitlySet__.add("isBallooning");
            return this;
        }
        /**
         * The amount of memory, in bytes, that is guaranteed to not be drained by the balloon mechanism
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("guaranteedMemoryInBytes")
        private Long guaranteedMemoryInBytes;

        /**
         * The amount of memory, in bytes, that is guaranteed to not be drained by the balloon mechanism
         * @param guaranteedMemoryInBytes the value to set
         * @return this builder
         **/
        public Builder guaranteedMemoryInBytes(Long guaranteedMemoryInBytes) {
            this.guaranteedMemoryInBytes = guaranteedMemoryInBytes;
            this.__explicitlySet__.add("guaranteedMemoryInBytes");
            return this;
        }
        /**
         * Maximum virtual machine memory in Bytes
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryInBytes")
        private Long maxMemoryInBytes;

        /**
         * Maximum virtual machine memory in Bytes
         * @param maxMemoryInBytes the value to set
         * @return this builder
         **/
        public Builder maxMemoryInBytes(Long maxMemoryInBytes) {
            this.maxMemoryInBytes = maxMemoryInBytes;
            this.__explicitlySet__.add("maxMemoryInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryOverCommit")
        private MemoryOverCommit memoryOverCommit;

        public Builder memoryOverCommit(MemoryOverCommit memoryOverCommit) {
            this.memoryOverCommit = memoryOverCommit;
            this.__explicitlySet__.add("memoryOverCommit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("transparentHugePages")
        private TransparentHugePages transparentHugePages;

        public Builder transparentHugePages(TransparentHugePages transparentHugePages) {
            this.transparentHugePages = transparentHugePages;
            this.__explicitlySet__.add("transparentHugePages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmMemoryPolicy build() {
            OlvmMemoryPolicy model =
                    new OlvmMemoryPolicy(
                            this.isBallooning,
                            this.guaranteedMemoryInBytes,
                            this.maxMemoryInBytes,
                            this.memoryOverCommit,
                            this.transparentHugePages);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmMemoryPolicy model) {
            if (model.wasPropertyExplicitlySet("isBallooning")) {
                this.isBallooning(model.getIsBallooning());
            }
            if (model.wasPropertyExplicitlySet("guaranteedMemoryInBytes")) {
                this.guaranteedMemoryInBytes(model.getGuaranteedMemoryInBytes());
            }
            if (model.wasPropertyExplicitlySet("maxMemoryInBytes")) {
                this.maxMemoryInBytes(model.getMaxMemoryInBytes());
            }
            if (model.wasPropertyExplicitlySet("memoryOverCommit")) {
                this.memoryOverCommit(model.getMemoryOverCommit());
            }
            if (model.wasPropertyExplicitlySet("transparentHugePages")) {
                this.transparentHugePages(model.getTransparentHugePages());
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
     * Indicates if ballooning is enabled
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBallooning")
    private final Boolean isBallooning;

    /**
     * Indicates if ballooning is enabled
     * @return the value
     **/
    public Boolean getIsBallooning() {
        return isBallooning;
    }

    /**
     * The amount of memory, in bytes, that is guaranteed to not be drained by the balloon mechanism
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("guaranteedMemoryInBytes")
    private final Long guaranteedMemoryInBytes;

    /**
     * The amount of memory, in bytes, that is guaranteed to not be drained by the balloon mechanism
     * @return the value
     **/
    public Long getGuaranteedMemoryInBytes() {
        return guaranteedMemoryInBytes;
    }

    /**
     * Maximum virtual machine memory in Bytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryInBytes")
    private final Long maxMemoryInBytes;

    /**
     * Maximum virtual machine memory in Bytes
     * @return the value
     **/
    public Long getMaxMemoryInBytes() {
        return maxMemoryInBytes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("memoryOverCommit")
    private final MemoryOverCommit memoryOverCommit;

    public MemoryOverCommit getMemoryOverCommit() {
        return memoryOverCommit;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("transparentHugePages")
    private final TransparentHugePages transparentHugePages;

    public TransparentHugePages getTransparentHugePages() {
        return transparentHugePages;
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
        sb.append("OlvmMemoryPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("isBallooning=").append(String.valueOf(this.isBallooning));
        sb.append(", guaranteedMemoryInBytes=")
                .append(String.valueOf(this.guaranteedMemoryInBytes));
        sb.append(", maxMemoryInBytes=").append(String.valueOf(this.maxMemoryInBytes));
        sb.append(", memoryOverCommit=").append(String.valueOf(this.memoryOverCommit));
        sb.append(", transparentHugePages=").append(String.valueOf(this.transparentHugePages));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmMemoryPolicy)) {
            return false;
        }

        OlvmMemoryPolicy other = (OlvmMemoryPolicy) o;
        return java.util.Objects.equals(this.isBallooning, other.isBallooning)
                && java.util.Objects.equals(
                        this.guaranteedMemoryInBytes, other.guaranteedMemoryInBytes)
                && java.util.Objects.equals(this.maxMemoryInBytes, other.maxMemoryInBytes)
                && java.util.Objects.equals(this.memoryOverCommit, other.memoryOverCommit)
                && java.util.Objects.equals(this.transparentHugePages, other.transparentHugePages)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isBallooning == null ? 43 : this.isBallooning.hashCode());
        result =
                (result * PRIME)
                        + (this.guaranteedMemoryInBytes == null
                                ? 43
                                : this.guaranteedMemoryInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.maxMemoryInBytes == null ? 43 : this.maxMemoryInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryOverCommit == null ? 43 : this.memoryOverCommit.hashCode());
        result =
                (result * PRIME)
                        + (this.transparentHugePages == null
                                ? 43
                                : this.transparentHugePages.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

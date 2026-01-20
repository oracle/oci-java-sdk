/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The configuration details for resource pool <br>
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
        builder = ResourcePoolSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourcePoolSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "poolSize",
        "poolStorageSizeInTBs",
        "availableStorageCapacityInTBs",
        "totalComputeCapacity",
        "availableComputeCapacity",
        "isDisabled"
    })
    public ResourcePoolSummary(
            Integer poolSize,
            Integer poolStorageSizeInTBs,
            Double availableStorageCapacityInTBs,
            Integer totalComputeCapacity,
            Integer availableComputeCapacity,
            Boolean isDisabled) {
        super();
        this.poolSize = poolSize;
        this.poolStorageSizeInTBs = poolStorageSizeInTBs;
        this.availableStorageCapacityInTBs = availableStorageCapacityInTBs;
        this.totalComputeCapacity = totalComputeCapacity;
        this.availableComputeCapacity = availableComputeCapacity;
        this.isDisabled = isDisabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Resource pool size. */
        @com.fasterxml.jackson.annotation.JsonProperty("poolSize")
        private Integer poolSize;

        /**
         * Resource pool size.
         *
         * @param poolSize the value to set
         * @return this builder
         */
        public Builder poolSize(Integer poolSize) {
            this.poolSize = poolSize;
            this.__explicitlySet__.add("poolSize");
            return this;
        }
        /** Resource pool storage size in TBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("poolStorageSizeInTBs")
        private Integer poolStorageSizeInTBs;

        /**
         * Resource pool storage size in TBs.
         *
         * @param poolStorageSizeInTBs the value to set
         * @return this builder
         */
        public Builder poolStorageSizeInTBs(Integer poolStorageSizeInTBs) {
            this.poolStorageSizeInTBs = poolStorageSizeInTBs;
            this.__explicitlySet__.add("poolStorageSizeInTBs");
            return this;
        }
        /**
         * Available storage capacity (in TB) that can be used for adding new members or scaling
         * existing members in a dedicated elastic pool.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableStorageCapacityInTBs")
        private Double availableStorageCapacityInTBs;

        /**
         * Available storage capacity (in TB) that can be used for adding new members or scaling
         * existing members in a dedicated elastic pool.
         *
         * @param availableStorageCapacityInTBs the value to set
         * @return this builder
         */
        public Builder availableStorageCapacityInTBs(Double availableStorageCapacityInTBs) {
            this.availableStorageCapacityInTBs = availableStorageCapacityInTBs;
            this.__explicitlySet__.add("availableStorageCapacityInTBs");
            return this;
        }
        /** Resource Pool total capacity, it's currently 4x of pool size */
        @com.fasterxml.jackson.annotation.JsonProperty("totalComputeCapacity")
        private Integer totalComputeCapacity;

        /**
         * Resource Pool total capacity, it's currently 4x of pool size
         *
         * @param totalComputeCapacity the value to set
         * @return this builder
         */
        public Builder totalComputeCapacity(Integer totalComputeCapacity) {
            this.totalComputeCapacity = totalComputeCapacity;
            this.__explicitlySet__.add("totalComputeCapacity");
            return this;
        }
        /** Available capacity left for new elastic pool members provision */
        @com.fasterxml.jackson.annotation.JsonProperty("availableComputeCapacity")
        private Integer availableComputeCapacity;

        /**
         * Available capacity left for new elastic pool members provision
         *
         * @param availableComputeCapacity the value to set
         * @return this builder
         */
        public Builder availableComputeCapacity(Integer availableComputeCapacity) {
            this.availableComputeCapacity = availableComputeCapacity;
            this.__explicitlySet__.add("availableComputeCapacity");
            return this;
        }
        /** Indicates if the resource pool should be deleted for the Autonomous AI Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDisabled")
        private Boolean isDisabled;

        /**
         * Indicates if the resource pool should be deleted for the Autonomous AI Database.
         *
         * @param isDisabled the value to set
         * @return this builder
         */
        public Builder isDisabled(Boolean isDisabled) {
            this.isDisabled = isDisabled;
            this.__explicitlySet__.add("isDisabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourcePoolSummary build() {
            ResourcePoolSummary model =
                    new ResourcePoolSummary(
                            this.poolSize,
                            this.poolStorageSizeInTBs,
                            this.availableStorageCapacityInTBs,
                            this.totalComputeCapacity,
                            this.availableComputeCapacity,
                            this.isDisabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourcePoolSummary model) {
            if (model.wasPropertyExplicitlySet("poolSize")) {
                this.poolSize(model.getPoolSize());
            }
            if (model.wasPropertyExplicitlySet("poolStorageSizeInTBs")) {
                this.poolStorageSizeInTBs(model.getPoolStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("availableStorageCapacityInTBs")) {
                this.availableStorageCapacityInTBs(model.getAvailableStorageCapacityInTBs());
            }
            if (model.wasPropertyExplicitlySet("totalComputeCapacity")) {
                this.totalComputeCapacity(model.getTotalComputeCapacity());
            }
            if (model.wasPropertyExplicitlySet("availableComputeCapacity")) {
                this.availableComputeCapacity(model.getAvailableComputeCapacity());
            }
            if (model.wasPropertyExplicitlySet("isDisabled")) {
                this.isDisabled(model.getIsDisabled());
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

    /** Resource pool size. */
    @com.fasterxml.jackson.annotation.JsonProperty("poolSize")
    private final Integer poolSize;

    /**
     * Resource pool size.
     *
     * @return the value
     */
    public Integer getPoolSize() {
        return poolSize;
    }

    /** Resource pool storage size in TBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("poolStorageSizeInTBs")
    private final Integer poolStorageSizeInTBs;

    /**
     * Resource pool storage size in TBs.
     *
     * @return the value
     */
    public Integer getPoolStorageSizeInTBs() {
        return poolStorageSizeInTBs;
    }

    /**
     * Available storage capacity (in TB) that can be used for adding new members or scaling
     * existing members in a dedicated elastic pool.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableStorageCapacityInTBs")
    private final Double availableStorageCapacityInTBs;

    /**
     * Available storage capacity (in TB) that can be used for adding new members or scaling
     * existing members in a dedicated elastic pool.
     *
     * @return the value
     */
    public Double getAvailableStorageCapacityInTBs() {
        return availableStorageCapacityInTBs;
    }

    /** Resource Pool total capacity, it's currently 4x of pool size */
    @com.fasterxml.jackson.annotation.JsonProperty("totalComputeCapacity")
    private final Integer totalComputeCapacity;

    /**
     * Resource Pool total capacity, it's currently 4x of pool size
     *
     * @return the value
     */
    public Integer getTotalComputeCapacity() {
        return totalComputeCapacity;
    }

    /** Available capacity left for new elastic pool members provision */
    @com.fasterxml.jackson.annotation.JsonProperty("availableComputeCapacity")
    private final Integer availableComputeCapacity;

    /**
     * Available capacity left for new elastic pool members provision
     *
     * @return the value
     */
    public Integer getAvailableComputeCapacity() {
        return availableComputeCapacity;
    }

    /** Indicates if the resource pool should be deleted for the Autonomous AI Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDisabled")
    private final Boolean isDisabled;

    /**
     * Indicates if the resource pool should be deleted for the Autonomous AI Database.
     *
     * @return the value
     */
    public Boolean getIsDisabled() {
        return isDisabled;
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
        sb.append("ResourcePoolSummary(");
        sb.append("super=").append(super.toString());
        sb.append("poolSize=").append(String.valueOf(this.poolSize));
        sb.append(", poolStorageSizeInTBs=").append(String.valueOf(this.poolStorageSizeInTBs));
        sb.append(", availableStorageCapacityInTBs=")
                .append(String.valueOf(this.availableStorageCapacityInTBs));
        sb.append(", totalComputeCapacity=").append(String.valueOf(this.totalComputeCapacity));
        sb.append(", availableComputeCapacity=")
                .append(String.valueOf(this.availableComputeCapacity));
        sb.append(", isDisabled=").append(String.valueOf(this.isDisabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourcePoolSummary)) {
            return false;
        }

        ResourcePoolSummary other = (ResourcePoolSummary) o;
        return java.util.Objects.equals(this.poolSize, other.poolSize)
                && java.util.Objects.equals(this.poolStorageSizeInTBs, other.poolStorageSizeInTBs)
                && java.util.Objects.equals(
                        this.availableStorageCapacityInTBs, other.availableStorageCapacityInTBs)
                && java.util.Objects.equals(this.totalComputeCapacity, other.totalComputeCapacity)
                && java.util.Objects.equals(
                        this.availableComputeCapacity, other.availableComputeCapacity)
                && java.util.Objects.equals(this.isDisabled, other.isDisabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.poolSize == null ? 43 : this.poolSize.hashCode());
        result =
                (result * PRIME)
                        + (this.poolStorageSizeInTBs == null
                                ? 43
                                : this.poolStorageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.availableStorageCapacityInTBs == null
                                ? 43
                                : this.availableStorageCapacityInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.totalComputeCapacity == null
                                ? 43
                                : this.totalComputeCapacity.hashCode());
        result =
                (result * PRIME)
                        + (this.availableComputeCapacity == null
                                ? 43
                                : this.availableComputeCapacity.hashCode());
        result = (result * PRIME) + (this.isDisabled == null ? 43 : this.isDisabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

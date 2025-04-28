/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Representation of storage performance detail parameters. <br>
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
        builder = StoragePerformanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class StoragePerformanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sizeInGBs",
        "balancedDiskPerformance",
        "highDiskPerformance"
    })
    public StoragePerformanceDetails(
            Integer sizeInGBs,
            DiskPerformanceDetails balancedDiskPerformance,
            DiskPerformanceDetails highDiskPerformance) {
        super();
        this.sizeInGBs = sizeInGBs;
        this.balancedDiskPerformance = balancedDiskPerformance;
        this.highDiskPerformance = highDiskPerformance;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Size in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
        private Integer sizeInGBs;

        /**
         * Size in GBs.
         *
         * @param sizeInGBs the value to set
         * @return this builder
         */
        public Builder sizeInGBs(Integer sizeInGBs) {
            this.sizeInGBs = sizeInGBs;
            this.__explicitlySet__.add("sizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("balancedDiskPerformance")
        private DiskPerformanceDetails balancedDiskPerformance;

        public Builder balancedDiskPerformance(DiskPerformanceDetails balancedDiskPerformance) {
            this.balancedDiskPerformance = balancedDiskPerformance;
            this.__explicitlySet__.add("balancedDiskPerformance");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("highDiskPerformance")
        private DiskPerformanceDetails highDiskPerformance;

        public Builder highDiskPerformance(DiskPerformanceDetails highDiskPerformance) {
            this.highDiskPerformance = highDiskPerformance;
            this.__explicitlySet__.add("highDiskPerformance");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StoragePerformanceDetails build() {
            StoragePerformanceDetails model =
                    new StoragePerformanceDetails(
                            this.sizeInGBs, this.balancedDiskPerformance, this.highDiskPerformance);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StoragePerformanceDetails model) {
            if (model.wasPropertyExplicitlySet("sizeInGBs")) {
                this.sizeInGBs(model.getSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("balancedDiskPerformance")) {
                this.balancedDiskPerformance(model.getBalancedDiskPerformance());
            }
            if (model.wasPropertyExplicitlySet("highDiskPerformance")) {
                this.highDiskPerformance(model.getHighDiskPerformance());
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

    /** Size in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInGBs")
    private final Integer sizeInGBs;

    /**
     * Size in GBs.
     *
     * @return the value
     */
    public Integer getSizeInGBs() {
        return sizeInGBs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("balancedDiskPerformance")
    private final DiskPerformanceDetails balancedDiskPerformance;

    public DiskPerformanceDetails getBalancedDiskPerformance() {
        return balancedDiskPerformance;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("highDiskPerformance")
    private final DiskPerformanceDetails highDiskPerformance;

    public DiskPerformanceDetails getHighDiskPerformance() {
        return highDiskPerformance;
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
        sb.append("StoragePerformanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sizeInGBs=").append(String.valueOf(this.sizeInGBs));
        sb.append(", balancedDiskPerformance=")
                .append(String.valueOf(this.balancedDiskPerformance));
        sb.append(", highDiskPerformance=").append(String.valueOf(this.highDiskPerformance));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StoragePerformanceDetails)) {
            return false;
        }

        StoragePerformanceDetails other = (StoragePerformanceDetails) o;
        return java.util.Objects.equals(this.sizeInGBs, other.sizeInGBs)
                && java.util.Objects.equals(
                        this.balancedDiskPerformance, other.balancedDiskPerformance)
                && java.util.Objects.equals(this.highDiskPerformance, other.highDiskPerformance)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sizeInGBs == null ? 43 : this.sizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.balancedDiskPerformance == null
                                ? 43
                                : this.balancedDiskPerformance.hashCode());
        result =
                (result * PRIME)
                        + (this.highDiskPerformance == null
                                ? 43
                                : this.highDiskPerformance.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

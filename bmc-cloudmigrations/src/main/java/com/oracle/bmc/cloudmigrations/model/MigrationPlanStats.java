/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Status of the migration plan. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MigrationPlanStats.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MigrationPlanStats
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"totalEstimatedCost", "timeUpdated", "vmCount"})
    public MigrationPlanStats(
            CostEstimation totalEstimatedCost, java.util.Date timeUpdated, Integer vmCount) {
        super();
        this.totalEstimatedCost = totalEstimatedCost;
        this.timeUpdated = timeUpdated;
        this.vmCount = vmCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("totalEstimatedCost")
        private CostEstimation totalEstimatedCost;

        public Builder totalEstimatedCost(CostEstimation totalEstimatedCost) {
            this.totalEstimatedCost = totalEstimatedCost;
            this.__explicitlySet__.add("totalEstimatedCost");
            return this;
        }
        /**
         * The time when the migration plan was calculated. An RFC3339 formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time when the migration plan was calculated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The total count of VMs in migration */
        @com.fasterxml.jackson.annotation.JsonProperty("vmCount")
        private Integer vmCount;

        /**
         * The total count of VMs in migration
         *
         * @param vmCount the value to set
         * @return this builder
         */
        public Builder vmCount(Integer vmCount) {
            this.vmCount = vmCount;
            this.__explicitlySet__.add("vmCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MigrationPlanStats build() {
            MigrationPlanStats model =
                    new MigrationPlanStats(this.totalEstimatedCost, this.timeUpdated, this.vmCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MigrationPlanStats model) {
            if (model.wasPropertyExplicitlySet("totalEstimatedCost")) {
                this.totalEstimatedCost(model.getTotalEstimatedCost());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("vmCount")) {
                this.vmCount(model.getVmCount());
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

    @com.fasterxml.jackson.annotation.JsonProperty("totalEstimatedCost")
    private final CostEstimation totalEstimatedCost;

    public CostEstimation getTotalEstimatedCost() {
        return totalEstimatedCost;
    }

    /** The time when the migration plan was calculated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time when the migration plan was calculated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The total count of VMs in migration */
    @com.fasterxml.jackson.annotation.JsonProperty("vmCount")
    private final Integer vmCount;

    /**
     * The total count of VMs in migration
     *
     * @return the value
     */
    public Integer getVmCount() {
        return vmCount;
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
        sb.append("MigrationPlanStats(");
        sb.append("super=").append(super.toString());
        sb.append("totalEstimatedCost=").append(String.valueOf(this.totalEstimatedCost));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", vmCount=").append(String.valueOf(this.vmCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MigrationPlanStats)) {
            return false;
        }

        MigrationPlanStats other = (MigrationPlanStats) o;
        return java.util.Objects.equals(this.totalEstimatedCost, other.totalEstimatedCost)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.vmCount, other.vmCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.totalEstimatedCost == null
                                ? 43
                                : this.totalEstimatedCost.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.vmCount == null ? 43 : this.vmCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

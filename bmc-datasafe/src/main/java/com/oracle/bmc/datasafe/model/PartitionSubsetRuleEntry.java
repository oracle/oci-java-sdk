/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Defines a subsetting rule based on partitions and sub-partitions to filter rows <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PartitionSubsetRuleEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "ruleType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PartitionSubsetRuleEntry extends SubsetRuleEntry {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A list of partition names which are to be part of the subset data */
        @com.fasterxml.jackson.annotation.JsonProperty("partitionsList")
        private java.util.List<String> partitionsList;

        /**
         * A list of partition names which are to be part of the subset data
         *
         * @param partitionsList the value to set
         * @return this builder
         */
        public Builder partitionsList(java.util.List<String> partitionsList) {
            this.partitionsList = partitionsList;
            this.__explicitlySet__.add("partitionsList");
            return this;
        }
        /**
         * A list of sub-partition names which are to be part of the subset data. The sub-partition
         * names should have the partition name also, separated by a dot
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subPartitionsList")
        private java.util.List<String> subPartitionsList;

        /**
         * A list of sub-partition names which are to be part of the subset data. The sub-partition
         * names should have the partition name also, separated by a dot
         *
         * @param subPartitionsList the value to set
         * @return this builder
         */
        public Builder subPartitionsList(java.util.List<String> subPartitionsList) {
            this.subPartitionsList = subPartitionsList;
            this.__explicitlySet__.add("subPartitionsList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PartitionSubsetRuleEntry build() {
            PartitionSubsetRuleEntry model =
                    new PartitionSubsetRuleEntry(this.partitionsList, this.subPartitionsList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PartitionSubsetRuleEntry model) {
            if (model.wasPropertyExplicitlySet("partitionsList")) {
                this.partitionsList(model.getPartitionsList());
            }
            if (model.wasPropertyExplicitlySet("subPartitionsList")) {
                this.subPartitionsList(model.getSubPartitionsList());
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

    @Deprecated
    public PartitionSubsetRuleEntry(
            java.util.List<String> partitionsList, java.util.List<String> subPartitionsList) {
        super();
        this.partitionsList = partitionsList;
        this.subPartitionsList = subPartitionsList;
    }

    /** A list of partition names which are to be part of the subset data */
    @com.fasterxml.jackson.annotation.JsonProperty("partitionsList")
    private final java.util.List<String> partitionsList;

    /**
     * A list of partition names which are to be part of the subset data
     *
     * @return the value
     */
    public java.util.List<String> getPartitionsList() {
        return partitionsList;
    }

    /**
     * A list of sub-partition names which are to be part of the subset data. The sub-partition
     * names should have the partition name also, separated by a dot
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subPartitionsList")
    private final java.util.List<String> subPartitionsList;

    /**
     * A list of sub-partition names which are to be part of the subset data. The sub-partition
     * names should have the partition name also, separated by a dot
     *
     * @return the value
     */
    public java.util.List<String> getSubPartitionsList() {
        return subPartitionsList;
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
        sb.append("PartitionSubsetRuleEntry(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", partitionsList=").append(String.valueOf(this.partitionsList));
        sb.append(", subPartitionsList=").append(String.valueOf(this.subPartitionsList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PartitionSubsetRuleEntry)) {
            return false;
        }

        PartitionSubsetRuleEntry other = (PartitionSubsetRuleEntry) o;
        return java.util.Objects.equals(this.partitionsList, other.partitionsList)
                && java.util.Objects.equals(this.subPartitionsList, other.subPartitionsList)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.partitionsList == null ? 43 : this.partitionsList.hashCode());
        result =
                (result * PRIME)
                        + (this.subPartitionsList == null ? 43 : this.subPartitionsList.hashCode());
        return result;
    }
}

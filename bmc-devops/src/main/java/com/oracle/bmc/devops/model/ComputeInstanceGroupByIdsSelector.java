/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the Compute instance group environment by listing the OCIDs of the compute instances.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ComputeInstanceGroupByIdsSelector.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "selectorType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ComputeInstanceGroupByIdsSelector extends ComputeInstanceGroupSelector {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Compute instance OCID identifiers that are members of this group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeInstanceIds")
        private java.util.List<String> computeInstanceIds;

        /**
         * Compute instance OCID identifiers that are members of this group.
         * @param computeInstanceIds the value to set
         * @return this builder
         **/
        public Builder computeInstanceIds(java.util.List<String> computeInstanceIds) {
            this.computeInstanceIds = computeInstanceIds;
            this.__explicitlySet__.add("computeInstanceIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeInstanceGroupByIdsSelector build() {
            ComputeInstanceGroupByIdsSelector model =
                    new ComputeInstanceGroupByIdsSelector(this.computeInstanceIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeInstanceGroupByIdsSelector model) {
            if (model.wasPropertyExplicitlySet("computeInstanceIds")) {
                this.computeInstanceIds(model.getComputeInstanceIds());
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

    @Deprecated
    public ComputeInstanceGroupByIdsSelector(java.util.List<String> computeInstanceIds) {
        super();
        this.computeInstanceIds = computeInstanceIds;
    }

    /**
     * Compute instance OCID identifiers that are members of this group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeInstanceIds")
    private final java.util.List<String> computeInstanceIds;

    /**
     * Compute instance OCID identifiers that are members of this group.
     * @return the value
     **/
    public java.util.List<String> getComputeInstanceIds() {
        return computeInstanceIds;
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
        sb.append("ComputeInstanceGroupByIdsSelector(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", computeInstanceIds=").append(String.valueOf(this.computeInstanceIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeInstanceGroupByIdsSelector)) {
            return false;
        }

        ComputeInstanceGroupByIdsSelector other = (ComputeInstanceGroupByIdsSelector) o;
        return java.util.Objects.equals(this.computeInstanceIds, other.computeInstanceIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.computeInstanceIds == null
                                ? 43
                                : this.computeInstanceIds.hashCode());
        return result;
    }
}

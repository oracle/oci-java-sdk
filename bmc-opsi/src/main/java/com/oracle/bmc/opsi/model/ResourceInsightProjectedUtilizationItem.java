/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Projected utilization object containing dbid and daysToReach value <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResourceInsightProjectedUtilizationItem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ResourceInsightProjectedUtilizationItem
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "daysToReach"})
    public ResourceInsightProjectedUtilizationItem(String id, Integer daysToReach) {
        super();
        this.id = id;
        this.daysToReach = daysToReach;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Db id */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Db id
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Days to reach projected utilization */
        @com.fasterxml.jackson.annotation.JsonProperty("daysToReach")
        private Integer daysToReach;

        /**
         * Days to reach projected utilization
         *
         * @param daysToReach the value to set
         * @return this builder
         */
        public Builder daysToReach(Integer daysToReach) {
            this.daysToReach = daysToReach;
            this.__explicitlySet__.add("daysToReach");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceInsightProjectedUtilizationItem build() {
            ResourceInsightProjectedUtilizationItem model =
                    new ResourceInsightProjectedUtilizationItem(this.id, this.daysToReach);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceInsightProjectedUtilizationItem model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("daysToReach")) {
                this.daysToReach(model.getDaysToReach());
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

    /** Db id */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Db id
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Days to reach projected utilization */
    @com.fasterxml.jackson.annotation.JsonProperty("daysToReach")
    private final Integer daysToReach;

    /**
     * Days to reach projected utilization
     *
     * @return the value
     */
    public Integer getDaysToReach() {
        return daysToReach;
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
        sb.append("ResourceInsightProjectedUtilizationItem(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", daysToReach=").append(String.valueOf(this.daysToReach));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceInsightProjectedUtilizationItem)) {
            return false;
        }

        ResourceInsightProjectedUtilizationItem other = (ResourceInsightProjectedUtilizationItem) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.daysToReach, other.daysToReach)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.daysToReach == null ? 43 : this.daysToReach.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

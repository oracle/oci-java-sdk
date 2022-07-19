/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Defines the {@code AssociatedWith} relationship between virtual network topology entities. An {@code AssociatedWith} relationship
 * is defined when there is no obvious {@code contains} relationship but entities are still related.
 * For example, a DRG is associated with a VCN because a DRG is not managed by VCN but can be
 * attached to a VCN.
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
    builder = TopologyAssociatedWithEntityRelationship.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TopologyAssociatedWithEntityRelationship extends TopologyEntityRelationship {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id1")
        private String id1;

        public Builder id1(String id1) {
            this.id1 = id1;
            this.__explicitlySet__.add("id1");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id2")
        private String id2;

        public Builder id2(String id2) {
            this.id2 = id2;
            this.__explicitlySet__.add("id2");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("associatedWithDetails")
        private TopologyAssociatedWithRelationshipDetails associatedWithDetails;

        public Builder associatedWithDetails(
                TopologyAssociatedWithRelationshipDetails associatedWithDetails) {
            this.associatedWithDetails = associatedWithDetails;
            this.__explicitlySet__.add("associatedWithDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TopologyAssociatedWithEntityRelationship build() {
            TopologyAssociatedWithEntityRelationship __instance__ =
                    new TopologyAssociatedWithEntityRelationship(id1, id2, associatedWithDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TopologyAssociatedWithEntityRelationship o) {
            Builder copiedBuilder =
                    id1(o.getId1())
                            .id2(o.getId2())
                            .associatedWithDetails(o.getAssociatedWithDetails());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
    public TopologyAssociatedWithEntityRelationship(
            String id1,
            String id2,
            TopologyAssociatedWithRelationshipDetails associatedWithDetails) {
        super(id1, id2);
        this.associatedWithDetails = associatedWithDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("associatedWithDetails")
    private final TopologyAssociatedWithRelationshipDetails associatedWithDetails;

    public TopologyAssociatedWithRelationshipDetails getAssociatedWithDetails() {
        return associatedWithDetails;
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
        sb.append("TopologyAssociatedWithEntityRelationship(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", associatedWithDetails=").append(String.valueOf(this.associatedWithDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TopologyAssociatedWithEntityRelationship)) {
            return false;
        }

        TopologyAssociatedWithEntityRelationship other =
                (TopologyAssociatedWithEntityRelationship) o;
        return java.util.Objects.equals(this.associatedWithDetails, other.associatedWithDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.associatedWithDetails == null
                                ? 43
                                : this.associatedWithDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}

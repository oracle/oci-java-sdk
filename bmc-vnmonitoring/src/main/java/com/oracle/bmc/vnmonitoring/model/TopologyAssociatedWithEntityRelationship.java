/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the {@code AssociatedWith} relationship between virtual network topology entities. An
 * {@code AssociatedWith} relationship is defined when there is no obvious {@code contains}
 * relationship but entities are still related. For example, a DRG is associated with a VCN because
 * a DRG is not managed by VCN but can be attached to a VCN. <br>
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
        builder = TopologyAssociatedWithEntityRelationship.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
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
            TopologyAssociatedWithEntityRelationship model =
                    new TopologyAssociatedWithEntityRelationship(
                            this.id1, this.id2, this.associatedWithDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TopologyAssociatedWithEntityRelationship model) {
            if (model.wasPropertyExplicitlySet("id1")) {
                this.id1(model.getId1());
            }
            if (model.wasPropertyExplicitlySet("id2")) {
                this.id2(model.getId2());
            }
            if (model.wasPropertyExplicitlySet("associatedWithDetails")) {
                this.associatedWithDetails(model.getAssociatedWithDetails());
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
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TopologyAssociatedWithEntityRelationship(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", associatedWithDetails=").append(String.valueOf(this.associatedWithDetails));
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
                && super.equals(other);
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
        return result;
    }
}

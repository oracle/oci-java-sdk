/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines association details for an {@code associatedWith} relationship.
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
    builder = TopologyAssociatedWithRelationshipDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TopologyAssociatedWithRelationshipDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"via"})
    public TopologyAssociatedWithRelationshipDetails(java.util.List<String> via) {
        super();
        this.via = via;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the entities via which the relationship is created. For example an instance is associated with a network security group via the VNIC attachment and the VNIC.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("via")
        private java.util.List<String> via;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the entities via which the relationship is created. For example an instance is associated with a network security group via the VNIC attachment and the VNIC.
         * @param via the value to set
         * @return this builder
         **/
        public Builder via(java.util.List<String> via) {
            this.via = via;
            this.__explicitlySet__.add("via");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TopologyAssociatedWithRelationshipDetails build() {
            TopologyAssociatedWithRelationshipDetails __instance__ =
                    new TopologyAssociatedWithRelationshipDetails(via);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TopologyAssociatedWithRelationshipDetails o) {
            Builder copiedBuilder = via(o.getVia());

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

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the entities via which the relationship is created. For example an instance is associated with a network security group via the VNIC attachment and the VNIC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("via")
    private final java.util.List<String> via;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the entities via which the relationship is created. For example an instance is associated with a network security group via the VNIC attachment and the VNIC.
     * @return the value
     **/
    public java.util.List<String> getVia() {
        return via;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TopologyAssociatedWithRelationshipDetails(");
        sb.append("via=").append(String.valueOf(this.via));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TopologyAssociatedWithRelationshipDetails)) {
            return false;
        }

        TopologyAssociatedWithRelationshipDetails other =
                (TopologyAssociatedWithRelationshipDetails) o;
        return java.util.Objects.equals(this.via, other.via)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.via == null ? 43 : this.via.hashCode());
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

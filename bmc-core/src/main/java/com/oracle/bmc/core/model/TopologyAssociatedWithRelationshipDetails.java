/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Defines association details for an {@code associatedWith} relationship. <br>
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
        builder = TopologyAssociatedWithRelationshipDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TopologyAssociatedWithRelationshipDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"via"})
    public TopologyAssociatedWithRelationshipDetails(java.util.List<String> via) {
        super();
        this.via = via;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the entities via which the relationship is created. For example an instance is
         * associated with a network security group via the VNIC attachment and the VNIC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("via")
        private java.util.List<String> via;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the entities via which the relationship is created. For example an instance is
         * associated with a network security group via the VNIC attachment and the VNIC.
         *
         * @param via the value to set
         * @return this builder
         */
        public Builder via(java.util.List<String> via) {
            this.via = via;
            this.__explicitlySet__.add("via");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TopologyAssociatedWithRelationshipDetails build() {
            TopologyAssociatedWithRelationshipDetails model =
                    new TopologyAssociatedWithRelationshipDetails(this.via);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TopologyAssociatedWithRelationshipDetails model) {
            if (model.wasPropertyExplicitlySet("via")) {
                this.via(model.getVia());
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the entities via which the relationship is created. For example an instance is associated
     * with a network security group via the VNIC attachment and the VNIC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("via")
    private final java.util.List<String> via;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the entities via which the relationship is created. For example an instance is associated
     * with a network security group via the VNIC attachment and the VNIC.
     *
     * @return the value
     */
    public java.util.List<String> getVia() {
        return via;
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
        sb.append("TopologyAssociatedWithRelationshipDetails(");
        sb.append("super=").append(super.toString());
        sb.append("via=").append(String.valueOf(this.via));
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
        return java.util.Objects.equals(this.via, other.via) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.via == null ? 43 : this.via.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

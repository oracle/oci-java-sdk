/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * Specifies the Virtual Cloud Network (VCN) and the list of associated Network Security Group (NSG) OCIDs.
 * <p>
 * This model is shared across create (POST), update (PUT/PATCH), and retrieve (GET) operations.
 * <p>
 * - During create, {@code nsgIds} (if provided) specifies the NSGs to associate with the new resource.
 * - During update or patch, {@code nsgIds} modifies the associations: provide an empty array ({@code []}) to clear all NSGs, or provide a new list to replace them.
 * - GET responses return the current associations (which may be empty).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VcnNsgIdsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VcnNsgIdsDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vcnId", "nsgIds"})
    public VcnNsgIdsDetails(String vcnId, java.util.List<String> nsgIds) {
        super();
        this.vcnId = vcnId;
        this.nsgIds = nsgIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the customer Virtual Cloud Network.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the customer Virtual Cloud Network.
         * @param vcnId the value to set
         * @return this builder
         **/
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /**
         * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) associated with resources in this VCN.
         * For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) associated with resources in this VCN.
         * For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
         *
         * @param nsgIds the value to set
         * @return this builder
         **/
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VcnNsgIdsDetails build() {
            VcnNsgIdsDetails model = new VcnNsgIdsDetails(this.vcnId, this.nsgIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VcnNsgIdsDetails model) {
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the customer Virtual Cloud Network.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the customer Virtual Cloud Network.
     * @return the value
     **/
    public String getVcnId() {
        return vcnId;
    }

    /**
     * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) associated with resources in this VCN.
     * For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the network security groups (NSGs) associated with resources in this VCN.
     * For more information about NSGs, see [Security Rules](https://docs.oracle.com/iaas/Content/Network/Concepts/securityrules.htm).
     *
     * @return the value
     **/
    public java.util.List<String> getNsgIds() {
        return nsgIds;
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
        sb.append("VcnNsgIdsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VcnNsgIdsDetails)) {
            return false;
        }

        VcnNsgIdsDetails other = (VcnNsgIdsDetails) o;
        return java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

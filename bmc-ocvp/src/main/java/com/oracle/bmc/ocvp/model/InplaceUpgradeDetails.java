/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * The details for upgrading ESXi host.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InplaceUpgradeDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InplaceUpgradeDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vcfByolAllocationId"})
    public InplaceUpgradeDetails(String vcfByolAllocationId) {
        super();
        this.vcfByolAllocationId = vcfByolAllocationId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Byol Allocation for VCF (VMware Cloud Foundation) deployment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcfByolAllocationId")
        private String vcfByolAllocationId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Byol Allocation for VCF (VMware Cloud Foundation) deployment.
         *
         * @param vcfByolAllocationId the value to set
         * @return this builder
         **/
        public Builder vcfByolAllocationId(String vcfByolAllocationId) {
            this.vcfByolAllocationId = vcfByolAllocationId;
            this.__explicitlySet__.add("vcfByolAllocationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InplaceUpgradeDetails build() {
            InplaceUpgradeDetails model = new InplaceUpgradeDetails(this.vcfByolAllocationId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InplaceUpgradeDetails model) {
            if (model.wasPropertyExplicitlySet("vcfByolAllocationId")) {
                this.vcfByolAllocationId(model.getVcfByolAllocationId());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Byol Allocation for VCF (VMware Cloud Foundation) deployment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcfByolAllocationId")
    private final String vcfByolAllocationId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Byol Allocation for VCF (VMware Cloud Foundation) deployment.
     *
     * @return the value
     **/
    public String getVcfByolAllocationId() {
        return vcfByolAllocationId;
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
        sb.append("InplaceUpgradeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vcfByolAllocationId=").append(String.valueOf(this.vcfByolAllocationId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InplaceUpgradeDetails)) {
            return false;
        }

        InplaceUpgradeDetails other = (InplaceUpgradeDetails) o;
        return java.util.Objects.equals(this.vcfByolAllocationId, other.vcfByolAllocationId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.vcfByolAllocationId == null
                                ? 43
                                : this.vcfByolAllocationId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Lists the compartment to find VCN overlap. <br>
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
        builder = GetIpInventoryVcnOverlapDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GetIpInventoryVcnOverlapDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"regionList", "compartmentList"})
    public GetIpInventoryVcnOverlapDetails(
            java.util.List<String> regionList, java.util.List<String> compartmentList) {
        super();
        this.regionList = regionList;
        this.compartmentList = compartmentList;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Lists the selected regions. */
        @com.fasterxml.jackson.annotation.JsonProperty("regionList")
        private java.util.List<String> regionList;

        /**
         * Lists the selected regions.
         *
         * @param regionList the value to set
         * @return this builder
         */
        public Builder regionList(java.util.List<String> regionList) {
            this.regionList = regionList;
            this.__explicitlySet__.add("regionList");
            return this;
        }
        /**
         * The list of [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartments.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentList")
        private java.util.List<String> compartmentList;

        /**
         * The list of [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartments.
         *
         * @param compartmentList the value to set
         * @return this builder
         */
        public Builder compartmentList(java.util.List<String> compartmentList) {
            this.compartmentList = compartmentList;
            this.__explicitlySet__.add("compartmentList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GetIpInventoryVcnOverlapDetails build() {
            GetIpInventoryVcnOverlapDetails model =
                    new GetIpInventoryVcnOverlapDetails(this.regionList, this.compartmentList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GetIpInventoryVcnOverlapDetails model) {
            if (model.wasPropertyExplicitlySet("regionList")) {
                this.regionList(model.getRegionList());
            }
            if (model.wasPropertyExplicitlySet("compartmentList")) {
                this.compartmentList(model.getCompartmentList());
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

    /** Lists the selected regions. */
    @com.fasterxml.jackson.annotation.JsonProperty("regionList")
    private final java.util.List<String> regionList;

    /**
     * Lists the selected regions.
     *
     * @return the value
     */
    public java.util.List<String> getRegionList() {
        return regionList;
    }

    /**
     * The list of [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartments.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentList")
    private final java.util.List<String> compartmentList;

    /**
     * The list of [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartments.
     *
     * @return the value
     */
    public java.util.List<String> getCompartmentList() {
        return compartmentList;
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
        sb.append("GetIpInventoryVcnOverlapDetails(");
        sb.append("super=").append(super.toString());
        sb.append("regionList=").append(String.valueOf(this.regionList));
        sb.append(", compartmentList=").append(String.valueOf(this.compartmentList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetIpInventoryVcnOverlapDetails)) {
            return false;
        }

        GetIpInventoryVcnOverlapDetails other = (GetIpInventoryVcnOverlapDetails) o;
        return java.util.Objects.equals(this.regionList, other.regionList)
                && java.util.Objects.equals(this.compartmentList, other.compartmentList)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.regionList == null ? 43 : this.regionList.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentList == null ? 43 : this.compartmentList.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

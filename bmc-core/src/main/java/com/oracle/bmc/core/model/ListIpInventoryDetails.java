/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Required input parameters for retrieving IP Inventory data within the specified compartments of a
 * region. <br>
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
        builder = ListIpInventoryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ListIpInventoryDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "regionList",
        "compartmentList",
        "overrideFilters",
        "utilization",
        "overlappingVcnsOnly",
        "addressTypeList",
        "resourceTypeList",
        "searchKeyword",
        "sortBy",
        "sortOrder",
        "paginationOffset",
        "paginationLimit"
    })
    public ListIpInventoryDetails(
            java.util.List<String> regionList,
            java.util.List<String> compartmentList,
            Boolean overrideFilters,
            Float utilization,
            Boolean overlappingVcnsOnly,
            java.util.List<AddressType> addressTypeList,
            java.util.List<ResourceTypeList> resourceTypeList,
            String searchKeyword,
            SortBy sortBy,
            SortOrder sortOrder,
            Integer paginationOffset,
            Integer paginationLimit) {
        super();
        this.regionList = regionList;
        this.compartmentList = compartmentList;
        this.overrideFilters = overrideFilters;
        this.utilization = utilization;
        this.overlappingVcnsOnly = overlappingVcnsOnly;
        this.addressTypeList = addressTypeList;
        this.resourceTypeList = resourceTypeList;
        this.searchKeyword = searchKeyword;
        this.sortBy = sortBy;
        this.sortOrder = sortOrder;
        this.paginationOffset = paginationOffset;
        this.paginationLimit = paginationLimit;
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
         * List the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the compartments.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentList")
        private java.util.List<String> compartmentList;

        /**
         * List the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the compartments.
         *
         * @param compartmentList the value to set
         * @return this builder
         */
        public Builder compartmentList(java.util.List<String> compartmentList) {
            this.compartmentList = compartmentList;
            this.__explicitlySet__.add("compartmentList");
            return this;
        }
        /** List of selected filters. */
        @com.fasterxml.jackson.annotation.JsonProperty("overrideFilters")
        private Boolean overrideFilters;

        /**
         * List of selected filters.
         *
         * @param overrideFilters the value to set
         * @return this builder
         */
        public Builder overrideFilters(Boolean overrideFilters) {
            this.overrideFilters = overrideFilters;
            this.__explicitlySet__.add("overrideFilters");
            return this;
        }
        /** The CIDR utilization of a VCN. */
        @com.fasterxml.jackson.annotation.JsonProperty("utilization")
        private Float utilization;

        /**
         * The CIDR utilization of a VCN.
         *
         * @param utilization the value to set
         * @return this builder
         */
        public Builder utilization(Float utilization) {
            this.utilization = utilization;
            this.__explicitlySet__.add("utilization");
            return this;
        }
        /** List of overlapping VCNs. */
        @com.fasterxml.jackson.annotation.JsonProperty("overlappingVcnsOnly")
        private Boolean overlappingVcnsOnly;

        /**
         * List of overlapping VCNs.
         *
         * @param overlappingVcnsOnly the value to set
         * @return this builder
         */
        public Builder overlappingVcnsOnly(Boolean overlappingVcnsOnly) {
            this.overlappingVcnsOnly = overlappingVcnsOnly;
            this.__explicitlySet__.add("overlappingVcnsOnly");
            return this;
        }
        /** List of IP address types used. */
        @com.fasterxml.jackson.annotation.JsonProperty("addressTypeList")
        private java.util.List<AddressType> addressTypeList;

        /**
         * List of IP address types used.
         *
         * @param addressTypeList the value to set
         * @return this builder
         */
        public Builder addressTypeList(java.util.List<AddressType> addressTypeList) {
            this.addressTypeList = addressTypeList;
            this.__explicitlySet__.add("addressTypeList");
            return this;
        }
        /** List of VCN resource types. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceTypeList")
        private java.util.List<ResourceTypeList> resourceTypeList;

        /**
         * List of VCN resource types.
         *
         * @param resourceTypeList the value to set
         * @return this builder
         */
        public Builder resourceTypeList(java.util.List<ResourceTypeList> resourceTypeList) {
            this.resourceTypeList = resourceTypeList;
            this.__explicitlySet__.add("resourceTypeList");
            return this;
        }
        /** Filters the results for the specified string. */
        @com.fasterxml.jackson.annotation.JsonProperty("searchKeyword")
        private String searchKeyword;

        /**
         * Filters the results for the specified string.
         *
         * @param searchKeyword the value to set
         * @return this builder
         */
        public Builder searchKeyword(String searchKeyword) {
            this.searchKeyword = searchKeyword;
            this.__explicitlySet__.add("searchKeyword");
            return this;
        }
        /**
         * Provide the sort order ({@code sortOrder}) to sort the fields such as TIMECREATED in
         * descending or descending order, and DISPLAYNAME in case sensitive.
         *
         * <p>*Note:** For some "List" operations (for example, {@code ListInstances}), sort
         * resources by an availability domain when the resources belong to a single availability
         * domain. If you sort the "List" operations without specifying an availability domain, the
         * resources are grouped by availability domains and then sorted.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
        private SortBy sortBy;

        /**
         * Provide the sort order ({@code sortOrder}) to sort the fields such as TIMECREATED in
         * descending or descending order, and DISPLAYNAME in case sensitive.
         *
         * <p>*Note:** For some "List" operations (for example, {@code ListInstances}), sort
         * resources by an availability domain when the resources belong to a single availability
         * domain. If you sort the "List" operations without specifying an availability domain, the
         * resources are grouped by availability domains and then sorted.
         *
         * @param sortBy the value to set
         * @return this builder
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            this.__explicitlySet__.add("sortBy");
            return this;
        }
        /**
         * Specifies the sort order to use. Select either ascending ({@code ASC}) or descending
         * ({@code DESC}) order. The DISPLAYNAME sort order is case sensitive.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
        private SortOrder sortOrder;

        /**
         * Specifies the sort order to use. Select either ascending ({@code ASC}) or descending
         * ({@code DESC}) order. The DISPLAYNAME sort order is case sensitive.
         *
         * @param sortOrder the value to set
         * @return this builder
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            this.__explicitlySet__.add("sortOrder");
            return this;
        }
        /**
         * Most List operations paginate results. Results are paginated for the ListInstances
         * operations. When you call a paginated List operation, the response indicates more pages
         * of results by including the opc-next-page header. For more information, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("paginationOffset")
        private Integer paginationOffset;

        /**
         * Most List operations paginate results. Results are paginated for the ListInstances
         * operations. When you call a paginated List operation, the response indicates more pages
         * of results by including the opc-next-page header. For more information, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param paginationOffset the value to set
         * @return this builder
         */
        public Builder paginationOffset(Integer paginationOffset) {
            this.paginationOffset = paginationOffset;
            this.__explicitlySet__.add("paginationOffset");
            return this;
        }
        /**
         * Specifies the maximum number of results displayed per page for a paginated "List" call.
         * For more information, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("paginationLimit")
        private Integer paginationLimit;

        /**
         * Specifies the maximum number of results displayed per page for a paginated "List" call.
         * For more information, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         *
         * @param paginationLimit the value to set
         * @return this builder
         */
        public Builder paginationLimit(Integer paginationLimit) {
            this.paginationLimit = paginationLimit;
            this.__explicitlySet__.add("paginationLimit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ListIpInventoryDetails build() {
            ListIpInventoryDetails model =
                    new ListIpInventoryDetails(
                            this.regionList,
                            this.compartmentList,
                            this.overrideFilters,
                            this.utilization,
                            this.overlappingVcnsOnly,
                            this.addressTypeList,
                            this.resourceTypeList,
                            this.searchKeyword,
                            this.sortBy,
                            this.sortOrder,
                            this.paginationOffset,
                            this.paginationLimit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListIpInventoryDetails model) {
            if (model.wasPropertyExplicitlySet("regionList")) {
                this.regionList(model.getRegionList());
            }
            if (model.wasPropertyExplicitlySet("compartmentList")) {
                this.compartmentList(model.getCompartmentList());
            }
            if (model.wasPropertyExplicitlySet("overrideFilters")) {
                this.overrideFilters(model.getOverrideFilters());
            }
            if (model.wasPropertyExplicitlySet("utilization")) {
                this.utilization(model.getUtilization());
            }
            if (model.wasPropertyExplicitlySet("overlappingVcnsOnly")) {
                this.overlappingVcnsOnly(model.getOverlappingVcnsOnly());
            }
            if (model.wasPropertyExplicitlySet("addressTypeList")) {
                this.addressTypeList(model.getAddressTypeList());
            }
            if (model.wasPropertyExplicitlySet("resourceTypeList")) {
                this.resourceTypeList(model.getResourceTypeList());
            }
            if (model.wasPropertyExplicitlySet("searchKeyword")) {
                this.searchKeyword(model.getSearchKeyword());
            }
            if (model.wasPropertyExplicitlySet("sortBy")) {
                this.sortBy(model.getSortBy());
            }
            if (model.wasPropertyExplicitlySet("sortOrder")) {
                this.sortOrder(model.getSortOrder());
            }
            if (model.wasPropertyExplicitlySet("paginationOffset")) {
                this.paginationOffset(model.getPaginationOffset());
            }
            if (model.wasPropertyExplicitlySet("paginationLimit")) {
                this.paginationLimit(model.getPaginationLimit());
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
     * List the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartments.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentList")
    private final java.util.List<String> compartmentList;

    /**
     * List the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartments.
     *
     * @return the value
     */
    public java.util.List<String> getCompartmentList() {
        return compartmentList;
    }

    /** List of selected filters. */
    @com.fasterxml.jackson.annotation.JsonProperty("overrideFilters")
    private final Boolean overrideFilters;

    /**
     * List of selected filters.
     *
     * @return the value
     */
    public Boolean getOverrideFilters() {
        return overrideFilters;
    }

    /** The CIDR utilization of a VCN. */
    @com.fasterxml.jackson.annotation.JsonProperty("utilization")
    private final Float utilization;

    /**
     * The CIDR utilization of a VCN.
     *
     * @return the value
     */
    public Float getUtilization() {
        return utilization;
    }

    /** List of overlapping VCNs. */
    @com.fasterxml.jackson.annotation.JsonProperty("overlappingVcnsOnly")
    private final Boolean overlappingVcnsOnly;

    /**
     * List of overlapping VCNs.
     *
     * @return the value
     */
    public Boolean getOverlappingVcnsOnly() {
        return overlappingVcnsOnly;
    }

    /** List of IP address types used. */
    @com.fasterxml.jackson.annotation.JsonProperty("addressTypeList")
    private final java.util.List<AddressType> addressTypeList;

    /**
     * List of IP address types used.
     *
     * @return the value
     */
    public java.util.List<AddressType> getAddressTypeList() {
        return addressTypeList;
    }

    /** */
    public enum ResourceTypeList implements com.oracle.bmc.http.internal.BmcEnum {
        Resource("Resource"),
        ;

        private final String value;
        private static java.util.Map<String, ResourceTypeList> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourceTypeList v : ResourceTypeList.values()) {
                map.put(v.getValue(), v);
            }
        }

        ResourceTypeList(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourceTypeList create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ResourceTypeList: " + key);
        }
    };
    /** List of VCN resource types. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTypeList")
    private final java.util.List<ResourceTypeList> resourceTypeList;

    /**
     * List of VCN resource types.
     *
     * @return the value
     */
    public java.util.List<ResourceTypeList> getResourceTypeList() {
        return resourceTypeList;
    }

    /** Filters the results for the specified string. */
    @com.fasterxml.jackson.annotation.JsonProperty("searchKeyword")
    private final String searchKeyword;

    /**
     * Filters the results for the specified string.
     *
     * @return the value
     */
    public String getSearchKeyword() {
        return searchKeyword;
    }

    /**
     * Provide the sort order ({@code sortOrder}) to sort the fields such as TIMECREATED in
     * descending or descending order, and DISPLAYNAME in case sensitive.
     *
     * <p>*Note:** For some "List" operations (for example, {@code ListInstances}), sort resources
     * by an availability domain when the resources belong to a single availability domain. If you
     * sort the "List" operations without specifying an availability domain, the resources are
     * grouped by availability domains and then sorted.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Displayname("DISPLAYNAME"),
        Utilization("UTILIZATION"),
        DnsHostname("DNS_HOSTNAME"),
        Region("REGION"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };
    /**
     * Provide the sort order ({@code sortOrder}) to sort the fields such as TIMECREATED in
     * descending or descending order, and DISPLAYNAME in case sensitive.
     *
     * <p>*Note:** For some "List" operations (for example, {@code ListInstances}), sort resources
     * by an availability domain when the resources belong to a single availability domain. If you
     * sort the "List" operations without specifying an availability domain, the resources are
     * grouped by availability domains and then sorted.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
    private final SortBy sortBy;

    /**
     * Provide the sort order ({@code sortOrder}) to sort the fields such as TIMECREATED in
     * descending or descending order, and DISPLAYNAME in case sensitive.
     *
     * <p>*Note:** For some "List" operations (for example, {@code ListInstances}), sort resources
     * by an availability domain when the resources belong to a single availability domain. If you
     * sort the "List" operations without specifying an availability domain, the resources are
     * grouped by availability domains and then sorted.
     *
     * @return the value
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    /**
     * Specifies the sort order to use. Select either ascending ({@code ASC}) or descending ({@code
     * DESC}) order. The DISPLAYNAME sort order is case sensitive.
     */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };
    /**
     * Specifies the sort order to use. Select either ascending ({@code ASC}) or descending ({@code
     * DESC}) order. The DISPLAYNAME sort order is case sensitive.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    private final SortOrder sortOrder;

    /**
     * Specifies the sort order to use. Select either ascending ({@code ASC}) or descending ({@code
     * DESC}) order. The DISPLAYNAME sort order is case sensitive.
     *
     * @return the value
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    /**
     * Most List operations paginate results. Results are paginated for the ListInstances
     * operations. When you call a paginated List operation, the response indicates more pages of
     * results by including the opc-next-page header. For more information, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("paginationOffset")
    private final Integer paginationOffset;

    /**
     * Most List operations paginate results. Results are paginated for the ListInstances
     * operations. When you call a paginated List operation, the response indicates more pages of
     * results by including the opc-next-page header. For more information, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public Integer getPaginationOffset() {
        return paginationOffset;
    }

    /**
     * Specifies the maximum number of results displayed per page for a paginated "List" call. For
     * more information, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine). Example:
     * {@code 50}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("paginationLimit")
    private final Integer paginationLimit;

    /**
     * Specifies the maximum number of results displayed per page for a paginated "List" call. For
     * more information, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine). Example:
     * {@code 50}
     *
     * @return the value
     */
    public Integer getPaginationLimit() {
        return paginationLimit;
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
        sb.append("ListIpInventoryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("regionList=").append(String.valueOf(this.regionList));
        sb.append(", compartmentList=").append(String.valueOf(this.compartmentList));
        sb.append(", overrideFilters=").append(String.valueOf(this.overrideFilters));
        sb.append(", utilization=").append(String.valueOf(this.utilization));
        sb.append(", overlappingVcnsOnly=").append(String.valueOf(this.overlappingVcnsOnly));
        sb.append(", addressTypeList=").append(String.valueOf(this.addressTypeList));
        sb.append(", resourceTypeList=").append(String.valueOf(this.resourceTypeList));
        sb.append(", searchKeyword=").append(String.valueOf(this.searchKeyword));
        sb.append(", sortBy=").append(String.valueOf(this.sortBy));
        sb.append(", sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(", paginationOffset=").append(String.valueOf(this.paginationOffset));
        sb.append(", paginationLimit=").append(String.valueOf(this.paginationLimit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListIpInventoryDetails)) {
            return false;
        }

        ListIpInventoryDetails other = (ListIpInventoryDetails) o;
        return java.util.Objects.equals(this.regionList, other.regionList)
                && java.util.Objects.equals(this.compartmentList, other.compartmentList)
                && java.util.Objects.equals(this.overrideFilters, other.overrideFilters)
                && java.util.Objects.equals(this.utilization, other.utilization)
                && java.util.Objects.equals(this.overlappingVcnsOnly, other.overlappingVcnsOnly)
                && java.util.Objects.equals(this.addressTypeList, other.addressTypeList)
                && java.util.Objects.equals(this.resourceTypeList, other.resourceTypeList)
                && java.util.Objects.equals(this.searchKeyword, other.searchKeyword)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.paginationOffset, other.paginationOffset)
                && java.util.Objects.equals(this.paginationLimit, other.paginationLimit)
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
        result =
                (result * PRIME)
                        + (this.overrideFilters == null ? 43 : this.overrideFilters.hashCode());
        result = (result * PRIME) + (this.utilization == null ? 43 : this.utilization.hashCode());
        result =
                (result * PRIME)
                        + (this.overlappingVcnsOnly == null
                                ? 43
                                : this.overlappingVcnsOnly.hashCode());
        result =
                (result * PRIME)
                        + (this.addressTypeList == null ? 43 : this.addressTypeList.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTypeList == null ? 43 : this.resourceTypeList.hashCode());
        result =
                (result * PRIME)
                        + (this.searchKeyword == null ? 43 : this.searchKeyword.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.paginationOffset == null ? 43 : this.paginationOffset.hashCode());
        result =
                (result * PRIME)
                        + (this.paginationLimit == null ? 43 : this.paginationLimit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

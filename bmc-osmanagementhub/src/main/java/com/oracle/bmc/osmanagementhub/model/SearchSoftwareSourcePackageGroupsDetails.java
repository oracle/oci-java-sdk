/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the software sources and search parameters to get a list of associated package groups.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SearchSoftwareSourcePackageGroupsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SearchSoftwareSourcePackageGroupsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "softwareSourceIds",
        "sortOrder",
        "sortBy",
        "nameContains",
        "groupType"
    })
    public SearchSoftwareSourcePackageGroupsDetails(
            java.util.List<String> softwareSourceIds,
            SortOrder sortOrder,
            SortBy sortBy,
            String nameContains,
            PackageGroup.GroupType groupType) {
        super();
        this.softwareSourceIds = softwareSourceIds;
        this.sortOrder = sortOrder;
        this.sortBy = sortBy;
        this.nameContains = nameContains;
        this.groupType = groupType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of software source
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceIds")
        private java.util.List<String> softwareSourceIds;

        /**
         * List of software source
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param softwareSourceIds the value to set
         * @return this builder
         */
        public Builder softwareSourceIds(java.util.List<String> softwareSourceIds) {
            this.softwareSourceIds = softwareSourceIds;
            this.__explicitlySet__.add("softwareSourceIds");
            return this;
        }
        /** The sort order. */
        @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
        private SortOrder sortOrder;

        /**
         * The sort order.
         *
         * @param sortOrder the value to set
         * @return this builder
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            this.__explicitlySet__.add("sortOrder");
            return this;
        }
        /** The field to sort by. */
        @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
        private SortBy sortBy;

        /**
         * The field to sort by.
         *
         * @param sortBy the value to set
         * @return this builder
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            this.__explicitlySet__.add("sortBy");
            return this;
        }
        /** A filter that returns package groups with a name that contains the given string. */
        @com.fasterxml.jackson.annotation.JsonProperty("nameContains")
        private String nameContains;

        /**
         * A filter that returns package groups with a name that contains the given string.
         *
         * @param nameContains the value to set
         * @return this builder
         */
        public Builder nameContains(String nameContains) {
            this.nameContains = nameContains;
            this.__explicitlySet__.add("nameContains");
            return this;
        }
        /** Indicates if this is a group, category or environment. */
        @com.fasterxml.jackson.annotation.JsonProperty("groupType")
        private PackageGroup.GroupType groupType;

        /**
         * Indicates if this is a group, category or environment.
         *
         * @param groupType the value to set
         * @return this builder
         */
        public Builder groupType(PackageGroup.GroupType groupType) {
            this.groupType = groupType;
            this.__explicitlySet__.add("groupType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchSoftwareSourcePackageGroupsDetails build() {
            SearchSoftwareSourcePackageGroupsDetails model =
                    new SearchSoftwareSourcePackageGroupsDetails(
                            this.softwareSourceIds,
                            this.sortOrder,
                            this.sortBy,
                            this.nameContains,
                            this.groupType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchSoftwareSourcePackageGroupsDetails model) {
            if (model.wasPropertyExplicitlySet("softwareSourceIds")) {
                this.softwareSourceIds(model.getSoftwareSourceIds());
            }
            if (model.wasPropertyExplicitlySet("sortOrder")) {
                this.sortOrder(model.getSortOrder());
            }
            if (model.wasPropertyExplicitlySet("sortBy")) {
                this.sortBy(model.getSortBy());
            }
            if (model.wasPropertyExplicitlySet("nameContains")) {
                this.nameContains(model.getNameContains());
            }
            if (model.wasPropertyExplicitlySet("groupType")) {
                this.groupType(model.getGroupType());
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
     * List of software source
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceIds")
    private final java.util.List<String> softwareSourceIds;

    /**
     * List of software source
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public java.util.List<String> getSoftwareSourceIds() {
        return softwareSourceIds;
    }

    /** The sort order. */
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
    /** The sort order. */
    @com.fasterxml.jackson.annotation.JsonProperty("sortOrder")
    private final SortOrder sortOrder;

    /**
     * The sort order.
     *
     * @return the value
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    /** The field to sort by. */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Name("NAME"),
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
    /** The field to sort by. */
    @com.fasterxml.jackson.annotation.JsonProperty("sortBy")
    private final SortBy sortBy;

    /**
     * The field to sort by.
     *
     * @return the value
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    /** A filter that returns package groups with a name that contains the given string. */
    @com.fasterxml.jackson.annotation.JsonProperty("nameContains")
    private final String nameContains;

    /**
     * A filter that returns package groups with a name that contains the given string.
     *
     * @return the value
     */
    public String getNameContains() {
        return nameContains;
    }

    /** Indicates if this is a group, category or environment. */
    @com.fasterxml.jackson.annotation.JsonProperty("groupType")
    private final PackageGroup.GroupType groupType;

    /**
     * Indicates if this is a group, category or environment.
     *
     * @return the value
     */
    public PackageGroup.GroupType getGroupType() {
        return groupType;
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
        sb.append("SearchSoftwareSourcePackageGroupsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("softwareSourceIds=").append(String.valueOf(this.softwareSourceIds));
        sb.append(", sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(", sortBy=").append(String.valueOf(this.sortBy));
        sb.append(", nameContains=").append(String.valueOf(this.nameContains));
        sb.append(", groupType=").append(String.valueOf(this.groupType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchSoftwareSourcePackageGroupsDetails)) {
            return false;
        }

        SearchSoftwareSourcePackageGroupsDetails other =
                (SearchSoftwareSourcePackageGroupsDetails) o;
        return java.util.Objects.equals(this.softwareSourceIds, other.softwareSourceIds)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.nameContains, other.nameContains)
                && java.util.Objects.equals(this.groupType, other.groupType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.softwareSourceIds == null ? 43 : this.softwareSourceIds.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.nameContains == null ? 43 : this.nameContains.hashCode());
        result = (result * PRIME) + (this.groupType == null ? 43 : this.groupType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

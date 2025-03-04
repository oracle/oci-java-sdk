/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the information used to search for a set of modules from a list software sources. <br>
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
        builder = SearchSoftwareSourceModulesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SearchSoftwareSourceModulesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "softwareSourceIds",
        "sortOrder",
        "name",
        "nameContains",
        "sortBy"
    })
    public SearchSoftwareSourceModulesDetails(
            java.util.List<String> softwareSourceIds,
            SortOrder sortOrder,
            String name,
            String nameContains,
            SortBy sortBy) {
        super();
        this.softwareSourceIds = softwareSourceIds;
        this.sortOrder = sortOrder;
        this.name = name;
        this.nameContains = nameContains;
        this.sortBy = sortBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of sofware source
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceIds")
        private java.util.List<String> softwareSourceIds;

        /**
         * List of sofware source
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
        /** The name of a module. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of a module.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** A filter to return modules with a name that contains the given string. */
        @com.fasterxml.jackson.annotation.JsonProperty("nameContains")
        private String nameContains;

        /**
         * A filter to return modules with a name that contains the given string.
         *
         * @param nameContains the value to set
         * @return this builder
         */
        public Builder nameContains(String nameContains) {
            this.nameContains = nameContains;
            this.__explicitlySet__.add("nameContains");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SearchSoftwareSourceModulesDetails build() {
            SearchSoftwareSourceModulesDetails model =
                    new SearchSoftwareSourceModulesDetails(
                            this.softwareSourceIds,
                            this.sortOrder,
                            this.name,
                            this.nameContains,
                            this.sortBy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SearchSoftwareSourceModulesDetails model) {
            if (model.wasPropertyExplicitlySet("softwareSourceIds")) {
                this.softwareSourceIds(model.getSoftwareSourceIds());
            }
            if (model.wasPropertyExplicitlySet("sortOrder")) {
                this.sortOrder(model.getSortOrder());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("nameContains")) {
                this.nameContains(model.getNameContains());
            }
            if (model.wasPropertyExplicitlySet("sortBy")) {
                this.sortBy(model.getSortBy());
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
     * List of sofware source
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceIds")
    private final java.util.List<String> softwareSourceIds;

    /**
     * List of sofware source
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

    /** The name of a module. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of a module.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** A filter to return modules with a name that contains the given string. */
    @com.fasterxml.jackson.annotation.JsonProperty("nameContains")
    private final String nameContains;

    /**
     * A filter to return modules with a name that contains the given string.
     *
     * @return the value
     */
    public String getNameContains() {
        return nameContains;
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
        sb.append("SearchSoftwareSourceModulesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("softwareSourceIds=").append(String.valueOf(this.softwareSourceIds));
        sb.append(", sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", nameContains=").append(String.valueOf(this.nameContains));
        sb.append(", sortBy=").append(String.valueOf(this.sortBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchSoftwareSourceModulesDetails)) {
            return false;
        }

        SearchSoftwareSourceModulesDetails other = (SearchSoftwareSourceModulesDetails) o;
        return java.util.Objects.equals(this.softwareSourceIds, other.softwareSourceIds)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.nameContains, other.nameContains)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
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
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.nameContains == null ? 43 : this.nameContains.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

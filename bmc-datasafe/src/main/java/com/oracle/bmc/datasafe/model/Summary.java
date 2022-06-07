/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of the audit report.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Summary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Summary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "isHidden",
        "displayOrder",
        "groupByFieldName",
        "countOf",
        "scimFilter"
    })
    public Summary(
            String name,
            Boolean isHidden,
            Integer displayOrder,
            String groupByFieldName,
            String countOf,
            String scimFilter) {
        super();
        this.name = name;
        this.isHidden = isHidden;
        this.displayOrder = displayOrder;
        this.groupByFieldName = groupByFieldName;
        this.countOf = countOf;
        this.scimFilter = scimFilter;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
        private Boolean isHidden;

        public Builder isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            this.__explicitlySet__.add("isHidden");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayOrder")
        private Integer displayOrder;

        public Builder displayOrder(Integer displayOrder) {
            this.displayOrder = displayOrder;
            this.__explicitlySet__.add("displayOrder");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupByFieldName")
        private String groupByFieldName;

        public Builder groupByFieldName(String groupByFieldName) {
            this.groupByFieldName = groupByFieldName;
            this.__explicitlySet__.add("groupByFieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("countOf")
        private String countOf;

        public Builder countOf(String countOf) {
            this.countOf = countOf;
            this.__explicitlySet__.add("countOf");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scimFilter")
        private String scimFilter;

        public Builder scimFilter(String scimFilter) {
            this.scimFilter = scimFilter;
            this.__explicitlySet__.add("scimFilter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Summary build() {
            Summary __instance__ =
                    new Summary(
                            name, isHidden, displayOrder, groupByFieldName, countOf, scimFilter);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Summary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .isHidden(o.getIsHidden())
                            .displayOrder(o.getDisplayOrder())
                            .groupByFieldName(o.getGroupByFieldName())
                            .countOf(o.getCountOf())
                            .scimFilter(o.getScimFilter());

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
     * Name of the report summary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * Indicates if the summary is hidden. Values can either be 'true' or 'false'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
    private final Boolean isHidden;

    public Boolean getIsHidden() {
        return isHidden;
    }

    /**
     * Specifies the order in which the summary must be displayed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayOrder")
    private final Integer displayOrder;

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * A comma-delimited string that specifies the names of the fields by which the records must be aggregated to get the summary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupByFieldName")
    private final String groupByFieldName;

    public String getGroupByFieldName() {
        return groupByFieldName;
    }

    /**
     * Name of the key or count of object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countOf")
    private final String countOf;

    public String getCountOf() {
        return countOf;
    }

    /**
     * Additional scim filters used to get the specific summary.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scimFilter")
    private final String scimFilter;

    public String getScimFilter() {
        return scimFilter;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Summary(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", isHidden=").append(String.valueOf(this.isHidden));
        sb.append(", displayOrder=").append(String.valueOf(this.displayOrder));
        sb.append(", groupByFieldName=").append(String.valueOf(this.groupByFieldName));
        sb.append(", countOf=").append(String.valueOf(this.countOf));
        sb.append(", scimFilter=").append(String.valueOf(this.scimFilter));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Summary)) {
            return false;
        }

        Summary other = (Summary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.isHidden, other.isHidden)
                && java.util.Objects.equals(this.displayOrder, other.displayOrder)
                && java.util.Objects.equals(this.groupByFieldName, other.groupByFieldName)
                && java.util.Objects.equals(this.countOf, other.countOf)
                && java.util.Objects.equals(this.scimFilter, other.scimFilter)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isHidden == null ? 43 : this.isHidden.hashCode());
        result = (result * PRIME) + (this.displayOrder == null ? 43 : this.displayOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.groupByFieldName == null ? 43 : this.groupByFieldName.hashCode());
        result = (result * PRIME) + (this.countOf == null ? 43 : this.countOf.hashCode());
        result = (result * PRIME) + (this.scimFilter == null ? 43 : this.scimFilter.hashCode());
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

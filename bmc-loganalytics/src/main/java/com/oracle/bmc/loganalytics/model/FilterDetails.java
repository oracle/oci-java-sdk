/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Query builder edit request details.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FilterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FilterDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"queryString", "subSystem", "filters"})
    public FilterDetails(
            String queryString, SubSystemName subSystem, java.util.List<Filter> filters) {
        super();
        this.queryString = queryString;
        this.subSystem = subSystem;
        this.filters = filters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Query to apply edits to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("queryString")
        private String queryString;

        /**
         * Query to apply edits to.
         * @param queryString the value to set
         * @return this builder
         **/
        public Builder queryString(String queryString) {
            this.queryString = queryString;
            this.__explicitlySet__.add("queryString");
            return this;
        }
        /**
         * Default subsystem to qualify fields with in the queryString if not specified.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subSystem")
        private SubSystemName subSystem;

        /**
         * Default subsystem to qualify fields with in the queryString if not specified.
         *
         * @param subSystem the value to set
         * @return this builder
         **/
        public Builder subSystem(SubSystemName subSystem) {
            this.subSystem = subSystem;
            this.__explicitlySet__.add("subSystem");
            return this;
        }
        /**
         * List of edit operations to be applied in the specified order to the specified queryString.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("filters")
        private java.util.List<Filter> filters;

        /**
         * List of edit operations to be applied in the specified order to the specified queryString.
         *
         * @param filters the value to set
         * @return this builder
         **/
        public Builder filters(java.util.List<Filter> filters) {
            this.filters = filters;
            this.__explicitlySet__.add("filters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FilterDetails build() {
            FilterDetails model = new FilterDetails(this.queryString, this.subSystem, this.filters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FilterDetails model) {
            if (model.wasPropertyExplicitlySet("queryString")) {
                this.queryString(model.getQueryString());
            }
            if (model.wasPropertyExplicitlySet("subSystem")) {
                this.subSystem(model.getSubSystem());
            }
            if (model.wasPropertyExplicitlySet("filters")) {
                this.filters(model.getFilters());
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
     * Query to apply edits to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryString")
    private final String queryString;

    /**
     * Query to apply edits to.
     * @return the value
     **/
    public String getQueryString() {
        return queryString;
    }

    /**
     * Default subsystem to qualify fields with in the queryString if not specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subSystem")
    private final SubSystemName subSystem;

    /**
     * Default subsystem to qualify fields with in the queryString if not specified.
     *
     * @return the value
     **/
    public SubSystemName getSubSystem() {
        return subSystem;
    }

    /**
     * List of edit operations to be applied in the specified order to the specified queryString.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    private final java.util.List<Filter> filters;

    /**
     * List of edit operations to be applied in the specified order to the specified queryString.
     *
     * @return the value
     **/
    public java.util.List<Filter> getFilters() {
        return filters;
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
        sb.append("FilterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("queryString=").append(String.valueOf(this.queryString));
        sb.append(", subSystem=").append(String.valueOf(this.subSystem));
        sb.append(", filters=").append(String.valueOf(this.filters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FilterDetails)) {
            return false;
        }

        FilterDetails other = (FilterDetails) o;
        return java.util.Objects.equals(this.queryString, other.queryString)
                && java.util.Objects.equals(this.subSystem, other.subSystem)
                && java.util.Objects.equals(this.filters, other.filters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.queryString == null ? 43 : this.queryString.hashCode());
        result = (result * PRIME) + (this.subSystem == null ? 43 : this.subSystem.hashCode());
        result = (result * PRIME) + (this.filters == null ? 43 : this.filters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * Result set generated from the query.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExecuteSqlResponseItemResultSet.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExecuteSqlResponseItemResultSet
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"metadata", "items", "hasMore", "count", "offset", "limit"})
    public ExecuteSqlResponseItemResultSet(
            java.util.List<ExecuteSqlResponseItemResultSetMetadata> metadata,
            java.util.List<java.util.Map<String, Object>> items,
            Boolean hasMore,
            Integer count,
            Integer offset,
            Integer limit) {
        super();
        this.metadata = metadata;
        this.items = items;
        this.hasMore = hasMore;
        this.count = count;
        this.offset = offset;
        this.limit = limit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Metadata of the column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.List<ExecuteSqlResponseItemResultSetMetadata> metadata;

        /**
         * Metadata of the column.
         * @param metadata the value to set
         * @return this builder
         **/
        public Builder metadata(java.util.List<ExecuteSqlResponseItemResultSetMetadata> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * All rows in the result set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<java.util.Map<String, Object>> items;

        /**
         * All rows in the result set.
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<java.util.Map<String, Object>> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }
        /**
         * Specifies whether the result set has more rows.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hasMore")
        private Boolean hasMore;

        /**
         * Specifies whether the result set has more rows.
         * @param hasMore the value to set
         * @return this builder
         **/
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            this.__explicitlySet__.add("hasMore");
            return this;
        }
        /**
         * The number of rows returned.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * The number of rows returned.
         * @param count the value to set
         * @return this builder
         **/
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }
        /**
         * The first row returned in the result set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("offset")
        private Integer offset;

        /**
         * The first row returned in the result set.
         * @param offset the value to set
         * @return this builder
         **/
        public Builder offset(Integer offset) {
            this.offset = offset;
            this.__explicitlySet__.add("offset");
            return this;
        }
        /**
         * Maximum number of rows returned from the query.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("limit")
        private Integer limit;

        /**
         * Maximum number of rows returned from the query.
         * @param limit the value to set
         * @return this builder
         **/
        public Builder limit(Integer limit) {
            this.limit = limit;
            this.__explicitlySet__.add("limit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecuteSqlResponseItemResultSet build() {
            ExecuteSqlResponseItemResultSet model =
                    new ExecuteSqlResponseItemResultSet(
                            this.metadata,
                            this.items,
                            this.hasMore,
                            this.count,
                            this.offset,
                            this.limit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecuteSqlResponseItemResultSet model) {
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
            }
            if (model.wasPropertyExplicitlySet("hasMore")) {
                this.hasMore(model.getHasMore());
            }
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
            }
            if (model.wasPropertyExplicitlySet("offset")) {
                this.offset(model.getOffset());
            }
            if (model.wasPropertyExplicitlySet("limit")) {
                this.limit(model.getLimit());
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
     * Metadata of the column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.List<ExecuteSqlResponseItemResultSetMetadata> metadata;

    /**
     * Metadata of the column.
     * @return the value
     **/
    public java.util.List<ExecuteSqlResponseItemResultSetMetadata> getMetadata() {
        return metadata;
    }

    /**
     * All rows in the result set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<java.util.Map<String, Object>> items;

    /**
     * All rows in the result set.
     * @return the value
     **/
    public java.util.List<java.util.Map<String, Object>> getItems() {
        return items;
    }

    /**
     * Specifies whether the result set has more rows.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hasMore")
    private final Boolean hasMore;

    /**
     * Specifies whether the result set has more rows.
     * @return the value
     **/
    public Boolean getHasMore() {
        return hasMore;
    }

    /**
     * The number of rows returned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * The number of rows returned.
     * @return the value
     **/
    public Integer getCount() {
        return count;
    }

    /**
     * The first row returned in the result set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    private final Integer offset;

    /**
     * The first row returned in the result set.
     * @return the value
     **/
    public Integer getOffset() {
        return offset;
    }

    /**
     * Maximum number of rows returned from the query.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("limit")
    private final Integer limit;

    /**
     * Maximum number of rows returned from the query.
     * @return the value
     **/
    public Integer getLimit() {
        return limit;
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
        sb.append("ExecuteSqlResponseItemResultSet(");
        sb.append("super=").append(super.toString());
        sb.append("metadata=").append(String.valueOf(this.metadata));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(", hasMore=").append(String.valueOf(this.hasMore));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append(", offset=").append(String.valueOf(this.offset));
        sb.append(", limit=").append(String.valueOf(this.limit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteSqlResponseItemResultSet)) {
            return false;
        }

        ExecuteSqlResponseItemResultSet other = (ExecuteSqlResponseItemResultSet) o;
        return java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.hasMore, other.hasMore)
                && java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.offset, other.offset)
                && java.util.Objects.equals(this.limit, other.limit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + (this.hasMore == null ? 43 : this.hasMore.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + (this.offset == null ? 43 : this.offset.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

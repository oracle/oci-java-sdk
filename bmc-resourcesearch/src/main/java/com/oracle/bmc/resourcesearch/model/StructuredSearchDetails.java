/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcesearch.model;

/**
 * A request that uses Search's structured query language to specify filter conditions to apply to search results.
 * For more information about writing queries, see [Search Language Syntax](https://docs.cloud.oracle.com/en-us/iaas/Content/Search/Concepts/querysyntax.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180409")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StructuredSearchDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StructuredSearchDetails extends SearchDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("matchingContextType")
        private MatchingContextType matchingContextType;

        public Builder matchingContextType(MatchingContextType matchingContextType) {
            this.matchingContextType = matchingContextType;
            this.__explicitlySet__.add("matchingContextType");
            return this;
        }
        /**
         * The structured query describing which resources to search for.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        /**
         * The structured query describing which resources to search for.
         * @param query the value to set
         * @return this builder
         **/
        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StructuredSearchDetails build() {
            StructuredSearchDetails model =
                    new StructuredSearchDetails(this.matchingContextType, this.query);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StructuredSearchDetails model) {
            if (model.wasPropertyExplicitlySet("matchingContextType")) {
                this.matchingContextType(model.getMatchingContextType());
            }
            if (model.wasPropertyExplicitlySet("query")) {
                this.query(model.getQuery());
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

    @Deprecated
    public StructuredSearchDetails(MatchingContextType matchingContextType, String query) {
        super(matchingContextType);
        this.query = query;
    }

    /**
     * The structured query describing which resources to search for.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

    /**
     * The structured query describing which resources to search for.
     * @return the value
     **/
    public String getQuery() {
        return query;
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
        sb.append("StructuredSearchDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StructuredSearchDetails)) {
            return false;
        }

        StructuredSearchDetails other = (StructuredSearchDetails) o;
        return java.util.Objects.equals(this.query, other.query) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        return result;
    }
}

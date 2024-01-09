/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * The SCIM protocol defines a standard set of query parameters that can be used to filter, sort,
 * and paginate to return zero or more resources in a query response. Queries MAY be made against a
 * single resource or a resource type endpoint (e.g., /Users), or the service provider Base URI.
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MySupportAccounts.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySupportAccounts
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "schemas",
        "totalResults",
        "resources",
        "startIndex",
        "itemsPerPage"
    })
    public MySupportAccounts(
            java.util.List<String> schemas,
            Integer totalResults,
            java.util.List<MySupportAccount> resources,
            Integer startIndex,
            Integer itemsPerPage) {
        super();
        this.schemas = schemas;
        this.totalResults = totalResults;
        this.resources = resources;
        this.startIndex = startIndex;
        this.itemsPerPage = itemsPerPage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The schemas attribute is an array of Strings which allows introspection of the supported
         * schema version for a SCIM representation as well any schema extensions supported by that
         * representation. Each String value must be a unique URI. All representations of SCIM
         * schema MUST include a non-zero value array with value(s) of the URIs supported by that
         * representation. Duplicate values MUST NOT be included. Value order is not specified and
         * MUST not impact behavior. REQUIRED.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schemas")
        private java.util.List<String> schemas;

        /**
         * The schemas attribute is an array of Strings which allows introspection of the supported
         * schema version for a SCIM representation as well any schema extensions supported by that
         * representation. Each String value must be a unique URI. All representations of SCIM
         * schema MUST include a non-zero value array with value(s) of the URIs supported by that
         * representation. Duplicate values MUST NOT be included. Value order is not specified and
         * MUST not impact behavior. REQUIRED.
         *
         * @param schemas the value to set
         * @return this builder
         */
        public Builder schemas(java.util.List<String> schemas) {
            this.schemas = schemas;
            this.__explicitlySet__.add("schemas");
            return this;
        }
        /**
         * The total number of results returned by the list or query operation. The value may be
         * larger than the number of resources returned such as when returning a single page of
         * results where multiple pages are available. REQUIRED.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("totalResults")
        private Integer totalResults;

        /**
         * The total number of results returned by the list or query operation. The value may be
         * larger than the number of resources returned such as when returning a single page of
         * results where multiple pages are available. REQUIRED.
         *
         * @param totalResults the value to set
         * @return this builder
         */
        public Builder totalResults(Integer totalResults) {
            this.totalResults = totalResults;
            this.__explicitlySet__.add("totalResults");
            return this;
        }
        /**
         * A multi-valued list of complex objects containing the requested resources. This MAY be a
         * subset of the full set of resources if pagination is requested. REQUIRED if
         * "totalResults" is non-zero.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("Resources")
        private java.util.List<MySupportAccount> resources;

        /**
         * A multi-valued list of complex objects containing the requested resources. This MAY be a
         * subset of the full set of resources if pagination is requested. REQUIRED if
         * "totalResults" is non-zero.
         *
         * @param resources the value to set
         * @return this builder
         */
        public Builder resources(java.util.List<MySupportAccount> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }
        /**
         * The 1-based index of the first result in the current set of list results. REQUIRED when
         * partial results returned due to pagination.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("startIndex")
        private Integer startIndex;

        /**
         * The 1-based index of the first result in the current set of list results. REQUIRED when
         * partial results returned due to pagination.
         *
         * @param startIndex the value to set
         * @return this builder
         */
        public Builder startIndex(Integer startIndex) {
            this.startIndex = startIndex;
            this.__explicitlySet__.add("startIndex");
            return this;
        }
        /**
         * The number of resources returned in a list response page. REQUIRED when partial results
         * returned due to pagination.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("itemsPerPage")
        private Integer itemsPerPage;

        /**
         * The number of resources returned in a list response page. REQUIRED when partial results
         * returned due to pagination.
         *
         * @param itemsPerPage the value to set
         * @return this builder
         */
        public Builder itemsPerPage(Integer itemsPerPage) {
            this.itemsPerPage = itemsPerPage;
            this.__explicitlySet__.add("itemsPerPage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySupportAccounts build() {
            MySupportAccounts model =
                    new MySupportAccounts(
                            this.schemas,
                            this.totalResults,
                            this.resources,
                            this.startIndex,
                            this.itemsPerPage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySupportAccounts model) {
            if (model.wasPropertyExplicitlySet("schemas")) {
                this.schemas(model.getSchemas());
            }
            if (model.wasPropertyExplicitlySet("totalResults")) {
                this.totalResults(model.getTotalResults());
            }
            if (model.wasPropertyExplicitlySet("resources")) {
                this.resources(model.getResources());
            }
            if (model.wasPropertyExplicitlySet("startIndex")) {
                this.startIndex(model.getStartIndex());
            }
            if (model.wasPropertyExplicitlySet("itemsPerPage")) {
                this.itemsPerPage(model.getItemsPerPage());
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
     * The schemas attribute is an array of Strings which allows introspection of the supported
     * schema version for a SCIM representation as well any schema extensions supported by that
     * representation. Each String value must be a unique URI. All representations of SCIM schema
     * MUST include a non-zero value array with value(s) of the URIs supported by that
     * representation. Duplicate values MUST NOT be included. Value order is not specified and MUST
     * not impact behavior. REQUIRED.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schemas")
    private final java.util.List<String> schemas;

    /**
     * The schemas attribute is an array of Strings which allows introspection of the supported
     * schema version for a SCIM representation as well any schema extensions supported by that
     * representation. Each String value must be a unique URI. All representations of SCIM schema
     * MUST include a non-zero value array with value(s) of the URIs supported by that
     * representation. Duplicate values MUST NOT be included. Value order is not specified and MUST
     * not impact behavior. REQUIRED.
     *
     * @return the value
     */
    public java.util.List<String> getSchemas() {
        return schemas;
    }

    /**
     * The total number of results returned by the list or query operation. The value may be larger
     * than the number of resources returned such as when returning a single page of results where
     * multiple pages are available. REQUIRED.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalResults")
    private final Integer totalResults;

    /**
     * The total number of results returned by the list or query operation. The value may be larger
     * than the number of resources returned such as when returning a single page of results where
     * multiple pages are available. REQUIRED.
     *
     * @return the value
     */
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * A multi-valued list of complex objects containing the requested resources. This MAY be a
     * subset of the full set of resources if pagination is requested. REQUIRED if "totalResults" is
     * non-zero.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("Resources")
    private final java.util.List<MySupportAccount> resources;

    /**
     * A multi-valued list of complex objects containing the requested resources. This MAY be a
     * subset of the full set of resources if pagination is requested. REQUIRED if "totalResults" is
     * non-zero.
     *
     * @return the value
     */
    public java.util.List<MySupportAccount> getResources() {
        return resources;
    }

    /**
     * The 1-based index of the first result in the current set of list results. REQUIRED when
     * partial results returned due to pagination.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startIndex")
    private final Integer startIndex;

    /**
     * The 1-based index of the first result in the current set of list results. REQUIRED when
     * partial results returned due to pagination.
     *
     * @return the value
     */
    public Integer getStartIndex() {
        return startIndex;
    }

    /**
     * The number of resources returned in a list response page. REQUIRED when partial results
     * returned due to pagination.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("itemsPerPage")
    private final Integer itemsPerPage;

    /**
     * The number of resources returned in a list response page. REQUIRED when partial results
     * returned due to pagination.
     *
     * @return the value
     */
    public Integer getItemsPerPage() {
        return itemsPerPage;
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
        sb.append("MySupportAccounts(");
        sb.append("super=").append(super.toString());
        sb.append("schemas=").append(String.valueOf(this.schemas));
        sb.append(", totalResults=").append(String.valueOf(this.totalResults));
        sb.append(", resources=").append(String.valueOf(this.resources));
        sb.append(", startIndex=").append(String.valueOf(this.startIndex));
        sb.append(", itemsPerPage=").append(String.valueOf(this.itemsPerPage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySupportAccounts)) {
            return false;
        }

        MySupportAccounts other = (MySupportAccounts) o;
        return java.util.Objects.equals(this.schemas, other.schemas)
                && java.util.Objects.equals(this.totalResults, other.totalResults)
                && java.util.Objects.equals(this.resources, other.resources)
                && java.util.Objects.equals(this.startIndex, other.startIndex)
                && java.util.Objects.equals(this.itemsPerPage, other.itemsPerPage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.schemas == null ? 43 : this.schemas.hashCode());
        result = (result * PRIME) + (this.totalResults == null ? 43 : this.totalResults.hashCode());
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        result = (result * PRIME) + (this.startIndex == null ? 43 : this.startIndex.hashCode());
        result = (result * PRIME) + (this.itemsPerPage == null ? 43 : this.itemsPerPage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details about the service limit increase request. Avoid entering confidential information. For
 * information about {@code LIMIT} support requests, see [Creating a Service Limit Increase
 * Request](https://docs.oracle.com/iaas/Content/GSG/support/create-incident-limit.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateLimitItemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateLimitItemDetails extends CreateItemDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private CreateCategoryDetails category;

        public Builder category(CreateCategoryDetails category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subCategory")
        private CreateSubCategoryDetails subCategory;

        public Builder subCategory(CreateSubCategoryDetails subCategory) {
            this.subCategory = subCategory;
            this.__explicitlySet__.add("subCategory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("issueType")
        private CreateIssueTypeDetails issueType;

        public Builder issueType(CreateIssueTypeDetails issueType) {
            this.issueType = issueType;
            this.__explicitlySet__.add("issueType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The limit of the resource currently available. */
        @com.fasterxml.jackson.annotation.JsonProperty("currentLimit")
        private Integer currentLimit;

        /**
         * The limit of the resource currently available.
         *
         * @param currentLimit the value to set
         * @return this builder
         */
        public Builder currentLimit(Integer currentLimit) {
            this.currentLimit = currentLimit;
            this.__explicitlySet__.add("currentLimit");
            return this;
        }
        /** The current usage of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("currentUsage")
        private Integer currentUsage;

        /**
         * The current usage of the resource.
         *
         * @param currentUsage the value to set
         * @return this builder
         */
        public Builder currentUsage(Integer currentUsage) {
            this.currentUsage = currentUsage;
            this.__explicitlySet__.add("currentUsage");
            return this;
        }
        /** The new service limit being requested. */
        @com.fasterxml.jackson.annotation.JsonProperty("requestedLimit")
        private Integer requestedLimit;

        /**
         * The new service limit being requested.
         *
         * @param requestedLimit the value to set
         * @return this builder
         */
        public Builder requestedLimit(Integer requestedLimit) {
            this.requestedLimit = requestedLimit;
            this.__explicitlySet__.add("requestedLimit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateLimitItemDetails build() {
            CreateLimitItemDetails model =
                    new CreateLimitItemDetails(
                            this.category,
                            this.subCategory,
                            this.issueType,
                            this.name,
                            this.currentLimit,
                            this.currentUsage,
                            this.requestedLimit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateLimitItemDetails model) {
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("subCategory")) {
                this.subCategory(model.getSubCategory());
            }
            if (model.wasPropertyExplicitlySet("issueType")) {
                this.issueType(model.getIssueType());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("currentLimit")) {
                this.currentLimit(model.getCurrentLimit());
            }
            if (model.wasPropertyExplicitlySet("currentUsage")) {
                this.currentUsage(model.getCurrentUsage());
            }
            if (model.wasPropertyExplicitlySet("requestedLimit")) {
                this.requestedLimit(model.getRequestedLimit());
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

    @Deprecated
    public CreateLimitItemDetails(
            CreateCategoryDetails category,
            CreateSubCategoryDetails subCategory,
            CreateIssueTypeDetails issueType,
            String name,
            Integer currentLimit,
            Integer currentUsage,
            Integer requestedLimit) {
        super(category, subCategory, issueType, name);
        this.currentLimit = currentLimit;
        this.currentUsage = currentUsage;
        this.requestedLimit = requestedLimit;
    }

    /** The limit of the resource currently available. */
    @com.fasterxml.jackson.annotation.JsonProperty("currentLimit")
    private final Integer currentLimit;

    /**
     * The limit of the resource currently available.
     *
     * @return the value
     */
    public Integer getCurrentLimit() {
        return currentLimit;
    }

    /** The current usage of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("currentUsage")
    private final Integer currentUsage;

    /**
     * The current usage of the resource.
     *
     * @return the value
     */
    public Integer getCurrentUsage() {
        return currentUsage;
    }

    /** The new service limit being requested. */
    @com.fasterxml.jackson.annotation.JsonProperty("requestedLimit")
    private final Integer requestedLimit;

    /**
     * The new service limit being requested.
     *
     * @return the value
     */
    public Integer getRequestedLimit() {
        return requestedLimit;
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
        sb.append("CreateLimitItemDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", currentLimit=").append(String.valueOf(this.currentLimit));
        sb.append(", currentUsage=").append(String.valueOf(this.currentUsage));
        sb.append(", requestedLimit=").append(String.valueOf(this.requestedLimit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateLimitItemDetails)) {
            return false;
        }

        CreateLimitItemDetails other = (CreateLimitItemDetails) o;
        return java.util.Objects.equals(this.currentLimit, other.currentLimit)
                && java.util.Objects.equals(this.currentUsage, other.currentUsage)
                && java.util.Objects.equals(this.requestedLimit, other.requestedLimit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.currentLimit == null ? 43 : this.currentLimit.hashCode());
        result = (result * PRIME) + (this.currentUsage == null ? 43 : this.currentUsage.hashCode());
        result =
                (result * PRIME)
                        + (this.requestedLimit == null ? 43 : this.requestedLimit.hashCode());
        return result;
    }
}

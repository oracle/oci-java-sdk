/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * List of Service Categories of a Service for MOS Taxonomy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ServiceCategories.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ServiceCategories extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"serviceCategory", "schema", "issueType"})
    public ServiceCategories(
            java.util.Map<String, String> serviceCategory,
            String schema,
            java.util.Map<String, String> issueType) {
        super();
        this.serviceCategory = serviceCategory;
        this.schema = schema;
        this.issueType = issueType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Service Category list.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceCategory")
        private java.util.Map<String, String> serviceCategory;

        /**
         * Service Category list.
         * @param serviceCategory the value to set
         * @return this builder
         **/
        public Builder serviceCategory(java.util.Map<String, String> serviceCategory) {
            this.serviceCategory = serviceCategory;
            this.__explicitlySet__.add("serviceCategory");
            return this;
        }
        /**
         * Schema of a Service Category.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private String schema;

        /**
         * Schema of a Service Category.
         * @param schema the value to set
         * @return this builder
         **/
        public Builder schema(String schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
            return this;
        }
        /**
         * Issue type list.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("issueType")
        private java.util.Map<String, String> issueType;

        /**
         * Issue type list.
         * @param issueType the value to set
         * @return this builder
         **/
        public Builder issueType(java.util.Map<String, String> issueType) {
            this.issueType = issueType;
            this.__explicitlySet__.add("issueType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceCategories build() {
            ServiceCategories model =
                    new ServiceCategories(this.serviceCategory, this.schema, this.issueType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceCategories model) {
            if (model.wasPropertyExplicitlySet("serviceCategory")) {
                this.serviceCategory(model.getServiceCategory());
            }
            if (model.wasPropertyExplicitlySet("schema")) {
                this.schema(model.getSchema());
            }
            if (model.wasPropertyExplicitlySet("issueType")) {
                this.issueType(model.getIssueType());
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
     * Service Category list.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceCategory")
    private final java.util.Map<String, String> serviceCategory;

    /**
     * Service Category list.
     * @return the value
     **/
    public java.util.Map<String, String> getServiceCategory() {
        return serviceCategory;
    }

    /**
     * Schema of a Service Category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final String schema;

    /**
     * Schema of a Service Category.
     * @return the value
     **/
    public String getSchema() {
        return schema;
    }

    /**
     * Issue type list.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issueType")
    private final java.util.Map<String, String> issueType;

    /**
     * Issue type list.
     * @return the value
     **/
    public java.util.Map<String, String> getIssueType() {
        return issueType;
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
        sb.append("ServiceCategories(");
        sb.append("super=").append(super.toString());
        sb.append("serviceCategory=").append(String.valueOf(this.serviceCategory));
        sb.append(", schema=").append(String.valueOf(this.schema));
        sb.append(", issueType=").append(String.valueOf(this.issueType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceCategories)) {
            return false;
        }

        ServiceCategories other = (ServiceCategories) o;
        return java.util.Objects.equals(this.serviceCategory, other.serviceCategory)
                && java.util.Objects.equals(this.schema, other.schema)
                && java.util.Objects.equals(this.issueType, other.issueType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.serviceCategory == null ? 43 : this.serviceCategory.hashCode());
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        result = (result * PRIME) + (this.issueType == null ? 43 : this.issueType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

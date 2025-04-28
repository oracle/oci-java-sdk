/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * List of Service Categories of a Service for MOS Taxonomy. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Services.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Services extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"service", "schema", "serviceCategories"})
    public Services(
            java.util.Map<String, String> service,
            String schema,
            java.util.List<SubCategories> serviceCategories) {
        super();
        this.service = service;
        this.schema = schema;
        this.serviceCategories = serviceCategories;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Service Category list. */
        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private java.util.Map<String, String> service;

        /**
         * Service Category list.
         *
         * @param service the value to set
         * @return this builder
         */
        public Builder service(java.util.Map<String, String> service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }
        /** Schema of a Service Category. */
        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private String schema;

        /**
         * Schema of a Service Category.
         *
         * @param schema the value to set
         * @return this builder
         */
        public Builder schema(String schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
            return this;
        }
        /** The service categories list for MOS Taxonomy. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceCategories")
        private java.util.List<SubCategories> serviceCategories;

        /**
         * The service categories list for MOS Taxonomy.
         *
         * @param serviceCategories the value to set
         * @return this builder
         */
        public Builder serviceCategories(java.util.List<SubCategories> serviceCategories) {
            this.serviceCategories = serviceCategories;
            this.__explicitlySet__.add("serviceCategories");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Services build() {
            Services model = new Services(this.service, this.schema, this.serviceCategories);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Services model) {
            if (model.wasPropertyExplicitlySet("service")) {
                this.service(model.getService());
            }
            if (model.wasPropertyExplicitlySet("schema")) {
                this.schema(model.getSchema());
            }
            if (model.wasPropertyExplicitlySet("serviceCategories")) {
                this.serviceCategories(model.getServiceCategories());
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

    /** Service Category list. */
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final java.util.Map<String, String> service;

    /**
     * Service Category list.
     *
     * @return the value
     */
    public java.util.Map<String, String> getService() {
        return service;
    }

    /** Schema of a Service Category. */
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final String schema;

    /**
     * Schema of a Service Category.
     *
     * @return the value
     */
    public String getSchema() {
        return schema;
    }

    /** The service categories list for MOS Taxonomy. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceCategories")
    private final java.util.List<SubCategories> serviceCategories;

    /**
     * The service categories list for MOS Taxonomy.
     *
     * @return the value
     */
    public java.util.List<SubCategories> getServiceCategories() {
        return serviceCategories;
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
        sb.append("Services(");
        sb.append("super=").append(super.toString());
        sb.append("service=").append(String.valueOf(this.service));
        sb.append(", schema=").append(String.valueOf(this.schema));
        sb.append(", serviceCategories=").append(String.valueOf(this.serviceCategories));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Services)) {
            return false;
        }

        Services other = (Services) o;
        return java.util.Objects.equals(this.service, other.service)
                && java.util.Objects.equals(this.schema, other.schema)
                && java.util.Objects.equals(this.serviceCategories, other.serviceCategories)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceCategories == null ? 43 : this.serviceCategories.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

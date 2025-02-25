/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * OCI service logging configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OciService.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OciService extends Source {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Service generating log.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private String service;

        /**
         * Service generating log.
         * @param service the value to set
         * @return this builder
         **/
        public Builder service(String service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }
        /**
         * The unique identifier of the resource emitting the log.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resource")
        private String resource;

        /**
         * The unique identifier of the resource emitting the log.
         * @param resource the value to set
         * @return this builder
         **/
        public Builder resource(String resource) {
            this.resource = resource;
            this.__explicitlySet__.add("resource");
            return this;
        }
        /**
         * Log object category.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        /**
         * Log object category.
         * @param category the value to set
         * @return this builder
         **/
        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /**
         * Log category parameters are stored here.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.Map<String, String> parameters;

        /**
         * Log category parameters are stored here.
         * @param parameters the value to set
         * @return this builder
         **/
        public Builder parameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciService build() {
            OciService model =
                    new OciService(this.service, this.resource, this.category, this.parameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciService model) {
            if (model.wasPropertyExplicitlySet("service")) {
                this.service(model.getService());
            }
            if (model.wasPropertyExplicitlySet("resource")) {
                this.resource(model.getResource());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
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
    public OciService(
            String service,
            String resource,
            String category,
            java.util.Map<String, String> parameters) {
        super();
        this.service = service;
        this.resource = resource;
        this.category = category;
        this.parameters = parameters;
    }

    /**
     * Service generating log.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final String service;

    /**
     * Service generating log.
     * @return the value
     **/
    public String getService() {
        return service;
    }

    /**
     * The unique identifier of the resource emitting the log.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    private final String resource;

    /**
     * The unique identifier of the resource emitting the log.
     * @return the value
     **/
    public String getResource() {
        return resource;
    }

    /**
     * Log object category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final String category;

    /**
     * Log object category.
     * @return the value
     **/
    public String getCategory() {
        return category;
    }

    /**
     * Log category parameters are stored here.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.Map<String, String> parameters;

    /**
     * Log category parameters are stored here.
     * @return the value
     **/
    public java.util.Map<String, String> getParameters() {
        return parameters;
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
        sb.append("OciService(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", service=").append(String.valueOf(this.service));
        sb.append(", resource=").append(String.valueOf(this.resource));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciService)) {
            return false;
        }

        OciService other = (OciService) o;
        return java.util.Objects.equals(this.service, other.service)
                && java.util.Objects.equals(this.resource, other.resource)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result = (result * PRIME) + (this.resource == null ? 43 : this.resource.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        return result;
    }
}

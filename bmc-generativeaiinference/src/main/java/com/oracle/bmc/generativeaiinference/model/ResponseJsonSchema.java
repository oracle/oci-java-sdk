/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * The JSON schema definition to be used in JSON_SCHEMA response format. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResponseJsonSchema.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResponseJsonSchema
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "description", "schema", "isStrict"})
    public ResponseJsonSchema(String name, String description, Object schema, Boolean isStrict) {
        super();
        this.name = name;
        this.description = description;
        this.schema = schema;
        this.isStrict = isStrict;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and
         * dashes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and
         * dashes.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A description of what the response format is for, used by the model to determine how to
         * respond in the format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of what the response format is for, used by the model to determine how to
         * respond in the format.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The schema used by the structured output, described as a JSON Schema object. */
        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private Object schema;

        /**
         * The schema used by the structured output, described as a JSON Schema object.
         *
         * @param schema the value to set
         * @return this builder
         */
        public Builder schema(Object schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
            return this;
        }
        /**
         * Whether to enable strict schema adherence when generating the output. If set to true, the
         * model will always follow the exact schema defined in the schema field. Only a subset of
         * JSON Schema is supported when strict is true.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isStrict")
        private Boolean isStrict;

        /**
         * Whether to enable strict schema adherence when generating the output. If set to true, the
         * model will always follow the exact schema defined in the schema field. Only a subset of
         * JSON Schema is supported when strict is true.
         *
         * @param isStrict the value to set
         * @return this builder
         */
        public Builder isStrict(Boolean isStrict) {
            this.isStrict = isStrict;
            this.__explicitlySet__.add("isStrict");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResponseJsonSchema build() {
            ResponseJsonSchema model =
                    new ResponseJsonSchema(this.name, this.description, this.schema, this.isStrict);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResponseJsonSchema model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("schema")) {
                this.schema(model.getSchema());
            }
            if (model.wasPropertyExplicitlySet("isStrict")) {
                this.isStrict(model.getIsStrict());
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
     * The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * A description of what the response format is for, used by the model to determine how to
     * respond in the format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of what the response format is for, used by the model to determine how to
     * respond in the format.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The schema used by the structured output, described as a JSON Schema object. */
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final Object schema;

    /**
     * The schema used by the structured output, described as a JSON Schema object.
     *
     * @return the value
     */
    public Object getSchema() {
        return schema;
    }

    /**
     * Whether to enable strict schema adherence when generating the output. If set to true, the
     * model will always follow the exact schema defined in the schema field. Only a subset of JSON
     * Schema is supported when strict is true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isStrict")
    private final Boolean isStrict;

    /**
     * Whether to enable strict schema adherence when generating the output. If set to true, the
     * model will always follow the exact schema defined in the schema field. Only a subset of JSON
     * Schema is supported when strict is true.
     *
     * @return the value
     */
    public Boolean getIsStrict() {
        return isStrict;
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
        sb.append("ResponseJsonSchema(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", schema=").append(String.valueOf(this.schema));
        sb.append(", isStrict=").append(String.valueOf(this.isStrict));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResponseJsonSchema)) {
            return false;
        }

        ResponseJsonSchema other = (ResponseJsonSchema) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.schema, other.schema)
                && java.util.Objects.equals(this.isStrict, other.isStrict)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        result = (result * PRIME) + (this.isStrict == null ? 43 : this.isStrict.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

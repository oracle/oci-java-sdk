/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * The json object format for the model structured output
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CohereResponseJsonFormat.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CohereResponseJsonFormat extends CohereResponseFormat {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The schema used by the structured output, described as a JSON Schema object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private Object schema;

        /**
         * The schema used by the structured output, described as a JSON Schema object.
         * @param schema the value to set
         * @return this builder
         **/
        public Builder schema(Object schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CohereResponseJsonFormat build() {
            CohereResponseJsonFormat model = new CohereResponseJsonFormat(this.schema);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CohereResponseJsonFormat model) {
            if (model.wasPropertyExplicitlySet("schema")) {
                this.schema(model.getSchema());
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
    public CohereResponseJsonFormat(Object schema) {
        super();
        this.schema = schema;
    }

    /**
     * The schema used by the structured output, described as a JSON Schema object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final Object schema;

    /**
     * The schema used by the structured output, described as a JSON Schema object.
     * @return the value
     **/
    public Object getSchema() {
        return schema;
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
        sb.append("CohereResponseJsonFormat(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", schema=").append(String.valueOf(this.schema));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CohereResponseJsonFormat)) {
            return false;
        }

        CohereResponseJsonFormat other = (CohereResponseJsonFormat) o;
        return java.util.Objects.equals(this.schema, other.schema) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        return result;
    }
}

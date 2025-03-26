/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Resolved entity.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ResolvedEntity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResolvedEntity extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "offset", "length", "text", "type", "value"})
    public ResolvedEntity(
            String id,
            Integer offset,
            Integer length,
            String text,
            String type,
            java.util.Map<String, String> value) {
        super();
        this.id = id;
        this.offset = offset;
        this.length = length;
        this.text = text;
        this.type = type;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * id of the resolved entity in input
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * id of the resolved entity in input
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * offset of resolved entity in input
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("offset")
        private Integer offset;

        /**
         * offset of resolved entity in input
         * @param offset the value to set
         * @return this builder
         **/
        public Builder offset(Integer offset) {
            this.offset = offset;
            this.__explicitlySet__.add("offset");
            return this;
        }
        /**
         * length of resolved entity in input
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private Integer length;

        /**
         * length of resolved entity in input
         * @param length the value to set
         * @return this builder
         **/
        public Builder length(Integer length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }
        /**
         * Entity text like name of person, location, and so on.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * Entity text like name of person, location, and so on.
         * @param text the value to set
         * @return this builder
         **/
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /**
         * Type of entity text like PER, LOC.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Type of entity text like PER, LOC.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * key and value pair for resolved entities. keys can be specific for each type of resolved entity. Values can be instances of resolvedEntity, arrays of resolvedEntities, primitives, or custom JSON.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private java.util.Map<String, String> value;

        /**
         * key and value pair for resolved entities. keys can be specific for each type of resolved entity. Values can be instances of resolvedEntity, arrays of resolvedEntities, primitives, or custom JSON.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(java.util.Map<String, String> value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResolvedEntity build() {
            ResolvedEntity model =
                    new ResolvedEntity(
                            this.id, this.offset, this.length, this.text, this.type, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResolvedEntity model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("offset")) {
                this.offset(model.getOffset());
            }
            if (model.wasPropertyExplicitlySet("length")) {
                this.length(model.getLength());
            }
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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
     * id of the resolved entity in input
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * id of the resolved entity in input
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * offset of resolved entity in input
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    private final Integer offset;

    /**
     * offset of resolved entity in input
     * @return the value
     **/
    public Integer getOffset() {
        return offset;
    }

    /**
     * length of resolved entity in input
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    private final Integer length;

    /**
     * length of resolved entity in input
     * @return the value
     **/
    public Integer getLength() {
        return length;
    }

    /**
     * Entity text like name of person, location, and so on.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * Entity text like name of person, location, and so on.
     * @return the value
     **/
    public String getText() {
        return text;
    }

    /**
     * Type of entity text like PER, LOC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Type of entity text like PER, LOC.
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * key and value pair for resolved entities. keys can be specific for each type of resolved entity. Values can be instances of resolvedEntity, arrays of resolvedEntities, primitives, or custom JSON.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final java.util.Map<String, String> value;

    /**
     * key and value pair for resolved entities. keys can be specific for each type of resolved entity. Values can be instances of resolvedEntity, arrays of resolvedEntities, primitives, or custom JSON.
     * @return the value
     **/
    public java.util.Map<String, String> getValue() {
        return value;
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
        sb.append("ResolvedEntity(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", offset=").append(String.valueOf(this.offset));
        sb.append(", length=").append(String.valueOf(this.length));
        sb.append(", text=").append(String.valueOf(this.text));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResolvedEntity)) {
            return false;
        }

        ResolvedEntity other = (ResolvedEntity) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.offset, other.offset)
                && java.util.Objects.equals(this.length, other.length)
                && java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.value, other.value)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.offset == null ? 43 : this.offset.hashCode());
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

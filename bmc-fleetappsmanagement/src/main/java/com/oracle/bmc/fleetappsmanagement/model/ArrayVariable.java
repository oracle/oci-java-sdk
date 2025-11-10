/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Array variable. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ArrayVariable.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ArrayVariable extends BaseVariable {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
        private Boolean isRequired;

        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            this.__explicitlySet__.add("isRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("visible")
        private String visible;

        public Builder visible(String visible) {
            this.visible = visible;
            this.__explicitlySet__.add("visible");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private BaseVariable items;

        public Builder items(BaseVariable items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }
        /** Maximum allowed items in the array. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxItems")
        private Integer maxItems;

        /**
         * Maximum allowed items in the array.
         *
         * @param maxItems the value to set
         * @return this builder
         */
        public Builder maxItems(Integer maxItems) {
            this.maxItems = maxItems;
            this.__explicitlySet__.add("maxItems");
            return this;
        }
        /** Minimum allowed items in the array. */
        @com.fasterxml.jackson.annotation.JsonProperty("minItems")
        private Integer minItems;

        /**
         * Minimum allowed items in the array.
         *
         * @param minItems the value to set
         * @return this builder
         */
        public Builder minItems(Integer minItems) {
            this.minItems = minItems;
            this.__explicitlySet__.add("minItems");
            return this;
        }
        /** If true, array entries will be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("areUniqueItems")
        private Boolean areUniqueItems;

        /**
         * If true, array entries will be unique.
         *
         * @param areUniqueItems the value to set
         * @return this builder
         */
        public Builder areUniqueItems(Boolean areUniqueItems) {
            this.areUniqueItems = areUniqueItems;
            this.__explicitlySet__.add("areUniqueItems");
            return this;
        }
        /** The default value for this variable. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private Object defaultValue;

        /**
         * The default value for this variable.
         *
         * @param defaultValue the value to set
         * @return this builder
         */
        public Builder defaultValue(Object defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contains")
        private BaseVariable contains;

        public Builder contains(BaseVariable contains) {
            this.contains = contains;
            this.__explicitlySet__.add("contains");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ArrayVariable build() {
            ArrayVariable model =
                    new ArrayVariable(
                            this.title,
                            this.description,
                            this.isRequired,
                            this.visible,
                            this.items,
                            this.maxItems,
                            this.minItems,
                            this.areUniqueItems,
                            this.defaultValue,
                            this.contains);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ArrayVariable model) {
            if (model.wasPropertyExplicitlySet("title")) {
                this.title(model.getTitle());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isRequired")) {
                this.isRequired(model.getIsRequired());
            }
            if (model.wasPropertyExplicitlySet("visible")) {
                this.visible(model.getVisible());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
            }
            if (model.wasPropertyExplicitlySet("maxItems")) {
                this.maxItems(model.getMaxItems());
            }
            if (model.wasPropertyExplicitlySet("minItems")) {
                this.minItems(model.getMinItems());
            }
            if (model.wasPropertyExplicitlySet("areUniqueItems")) {
                this.areUniqueItems(model.getAreUniqueItems());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("contains")) {
                this.contains(model.getContains());
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
    public ArrayVariable(
            String title,
            String description,
            Boolean isRequired,
            String visible,
            BaseVariable items,
            Integer maxItems,
            Integer minItems,
            Boolean areUniqueItems,
            Object defaultValue,
            BaseVariable contains) {
        super(title, description, isRequired, visible);
        this.items = items;
        this.maxItems = maxItems;
        this.minItems = minItems;
        this.areUniqueItems = areUniqueItems;
        this.defaultValue = defaultValue;
        this.contains = contains;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final BaseVariable items;

    public BaseVariable getItems() {
        return items;
    }

    /** Maximum allowed items in the array. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxItems")
    private final Integer maxItems;

    /**
     * Maximum allowed items in the array.
     *
     * @return the value
     */
    public Integer getMaxItems() {
        return maxItems;
    }

    /** Minimum allowed items in the array. */
    @com.fasterxml.jackson.annotation.JsonProperty("minItems")
    private final Integer minItems;

    /**
     * Minimum allowed items in the array.
     *
     * @return the value
     */
    public Integer getMinItems() {
        return minItems;
    }

    /** If true, array entries will be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("areUniqueItems")
    private final Boolean areUniqueItems;

    /**
     * If true, array entries will be unique.
     *
     * @return the value
     */
    public Boolean getAreUniqueItems() {
        return areUniqueItems;
    }

    /** The default value for this variable. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final Object defaultValue;

    /**
     * The default value for this variable.
     *
     * @return the value
     */
    public Object getDefaultValue() {
        return defaultValue;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("contains")
    private final BaseVariable contains;

    public BaseVariable getContains() {
        return contains;
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
        sb.append("ArrayVariable(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(", maxItems=").append(String.valueOf(this.maxItems));
        sb.append(", minItems=").append(String.valueOf(this.minItems));
        sb.append(", areUniqueItems=").append(String.valueOf(this.areUniqueItems));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", contains=").append(String.valueOf(this.contains));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ArrayVariable)) {
            return false;
        }

        ArrayVariable other = (ArrayVariable) o;
        return java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.maxItems, other.maxItems)
                && java.util.Objects.equals(this.minItems, other.minItems)
                && java.util.Objects.equals(this.areUniqueItems, other.areUniqueItems)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.contains, other.contains)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + (this.maxItems == null ? 43 : this.maxItems.hashCode());
        result = (result * PRIME) + (this.minItems == null ? 43 : this.minItems.hashCode());
        result =
                (result * PRIME)
                        + (this.areUniqueItems == null ? 43 : this.areUniqueItems.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result = (result * PRIME) + (this.contains == null ? 43 : this.contains.hashCode());
        return result;
    }
}

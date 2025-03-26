/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Command descriptor for querylanguage HIGHLIGHT command.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HighlightCommandDescriptor.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "name"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class HighlightCommandDescriptor extends AbstractCommandDescriptor {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayQueryString")
        private String displayQueryString;

        public Builder displayQueryString(String displayQueryString) {
            this.displayQueryString = displayQueryString;
            this.__explicitlySet__.add("displayQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalQueryString")
        private String internalQueryString;

        public Builder internalQueryString(String internalQueryString) {
            this.internalQueryString = internalQueryString;
            this.__explicitlySet__.add("internalQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referencedFields")
        private java.util.List<AbstractField> referencedFields;

        public Builder referencedFields(java.util.List<AbstractField> referencedFields) {
            this.referencedFields = referencedFields;
            this.__explicitlySet__.add("referencedFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("declaredFields")
        private java.util.List<AbstractField> declaredFields;

        public Builder declaredFields(java.util.List<AbstractField> declaredFields) {
            this.declaredFields = declaredFields;
            this.__explicitlySet__.add("declaredFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
        private Boolean isHidden;

        public Builder isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            this.__explicitlySet__.add("isHidden");
            return this;
        }
        /**
         * User specified color to highlight matches with if found.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("color")
        private String color;

        /**
         * User specified color to highlight matches with if found.
         *
         * @param color the value to set
         * @return this builder
         **/
        public Builder color(String color) {
            this.color = color;
            this.__explicitlySet__.add("color");
            return this;
        }
        /**
         * List of fields specified to highlight with the same color if matches found.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.List<String> fields;

        /**
         * List of fields specified to highlight with the same color if matches found.
         *
         * @param fields the value to set
         * @return this builder
         **/
        public Builder fields(java.util.List<String> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }
        /**
         * List of terms or phrases to highlight if found.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keywords")
        private java.util.List<String> keywords;

        /**
         * List of terms or phrases to highlight if found.
         *
         * @param keywords the value to set
         * @return this builder
         **/
        public Builder keywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            this.__explicitlySet__.add("keywords");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HighlightCommandDescriptor build() {
            HighlightCommandDescriptor model =
                    new HighlightCommandDescriptor(
                            this.displayQueryString,
                            this.internalQueryString,
                            this.category,
                            this.referencedFields,
                            this.declaredFields,
                            this.isHidden,
                            this.color,
                            this.fields,
                            this.keywords);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HighlightCommandDescriptor model) {
            if (model.wasPropertyExplicitlySet("displayQueryString")) {
                this.displayQueryString(model.getDisplayQueryString());
            }
            if (model.wasPropertyExplicitlySet("internalQueryString")) {
                this.internalQueryString(model.getInternalQueryString());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("referencedFields")) {
                this.referencedFields(model.getReferencedFields());
            }
            if (model.wasPropertyExplicitlySet("declaredFields")) {
                this.declaredFields(model.getDeclaredFields());
            }
            if (model.wasPropertyExplicitlySet("isHidden")) {
                this.isHidden(model.getIsHidden());
            }
            if (model.wasPropertyExplicitlySet("color")) {
                this.color(model.getColor());
            }
            if (model.wasPropertyExplicitlySet("fields")) {
                this.fields(model.getFields());
            }
            if (model.wasPropertyExplicitlySet("keywords")) {
                this.keywords(model.getKeywords());
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
    public HighlightCommandDescriptor(
            String displayQueryString,
            String internalQueryString,
            String category,
            java.util.List<AbstractField> referencedFields,
            java.util.List<AbstractField> declaredFields,
            Boolean isHidden,
            String color,
            java.util.List<String> fields,
            java.util.List<String> keywords) {
        super(
                displayQueryString,
                internalQueryString,
                category,
                referencedFields,
                declaredFields,
                isHidden);
        this.color = color;
        this.fields = fields;
        this.keywords = keywords;
    }

    /**
     * User specified color to highlight matches with if found.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("color")
    private final String color;

    /**
     * User specified color to highlight matches with if found.
     *
     * @return the value
     **/
    public String getColor() {
        return color;
    }

    /**
     * List of fields specified to highlight with the same color if matches found.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    private final java.util.List<String> fields;

    /**
     * List of fields specified to highlight with the same color if matches found.
     *
     * @return the value
     **/
    public java.util.List<String> getFields() {
        return fields;
    }

    /**
     * List of terms or phrases to highlight if found.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keywords")
    private final java.util.List<String> keywords;

    /**
     * List of terms or phrases to highlight if found.
     *
     * @return the value
     **/
    public java.util.List<String> getKeywords() {
        return keywords;
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
        sb.append("HighlightCommandDescriptor(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", color=").append(String.valueOf(this.color));
        sb.append(", fields=").append(String.valueOf(this.fields));
        sb.append(", keywords=").append(String.valueOf(this.keywords));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HighlightCommandDescriptor)) {
            return false;
        }

        HighlightCommandDescriptor other = (HighlightCommandDescriptor) o;
        return java.util.Objects.equals(this.color, other.color)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.keywords, other.keywords)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.color == null ? 43 : this.color.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.keywords == null ? 43 : this.keywords.hashCode());
        return result;
    }
}

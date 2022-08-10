/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * This lets the labeler highlight text, by specifying an offset and a length, and apply labels to it.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TextSelectionEntity.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entityType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TextSelectionEntity extends Entity {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A collection of label entities.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<Label> labels;

        /**
         * A collection of label entities.
         * @param labels the value to set
         * @return this builder
         **/
        public Builder labels(java.util.List<Label> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("textSpan")
        private TextSpan textSpan;

        public Builder textSpan(TextSpan textSpan) {
            this.textSpan = textSpan;
            this.__explicitlySet__.add("textSpan");
            return this;
        }
        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. It exists for cross-compatibility only.
         * For example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
        private java.util.Map<String, String> extendedMetadata;

        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. It exists for cross-compatibility only.
         * For example: {@code {"bar-key": "value"}}
         *
         * @param extendedMetadata the value to set
         * @return this builder
         **/
        public Builder extendedMetadata(java.util.Map<String, String> extendedMetadata) {
            this.extendedMetadata = extendedMetadata;
            this.__explicitlySet__.add("extendedMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TextSelectionEntity build() {
            TextSelectionEntity model =
                    new TextSelectionEntity(this.labels, this.textSpan, this.extendedMetadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TextSelectionEntity model) {
            if (model.wasPropertyExplicitlySet("labels")) {
                this.labels(model.getLabels());
            }
            if (model.wasPropertyExplicitlySet("textSpan")) {
                this.textSpan(model.getTextSpan());
            }
            if (model.wasPropertyExplicitlySet("extendedMetadata")) {
                this.extendedMetadata(model.getExtendedMetadata());
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
    public TextSelectionEntity(
            java.util.List<Label> labels,
            TextSpan textSpan,
            java.util.Map<String, String> extendedMetadata) {
        super();
        this.labels = labels;
        this.textSpan = textSpan;
        this.extendedMetadata = extendedMetadata;
    }

    /**
     * A collection of label entities.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<Label> labels;

    /**
     * A collection of label entities.
     * @return the value
     **/
    public java.util.List<Label> getLabels() {
        return labels;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("textSpan")
    private final TextSpan textSpan;

    public TextSpan getTextSpan() {
        return textSpan;
    }

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. It exists for cross-compatibility only.
     * For example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extendedMetadata")
    private final java.util.Map<String, String> extendedMetadata;

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. It exists for cross-compatibility only.
     * For example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getExtendedMetadata() {
        return extendedMetadata;
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
        sb.append("TextSelectionEntity(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append(", textSpan=").append(String.valueOf(this.textSpan));
        sb.append(", extendedMetadata=").append(String.valueOf(this.extendedMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TextSelectionEntity)) {
            return false;
        }

        TextSelectionEntity other = (TextSelectionEntity) o;
        return java.util.Objects.equals(this.labels, other.labels)
                && java.util.Objects.equals(this.textSpan, other.textSpan)
                && java.util.Objects.equals(this.extendedMetadata, other.extendedMetadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
        result = (result * PRIME) + (this.textSpan == null ? 43 : this.textSpan.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedMetadata == null ? 43 : this.extendedMetadata.hashCode());
        return result;
    }
}

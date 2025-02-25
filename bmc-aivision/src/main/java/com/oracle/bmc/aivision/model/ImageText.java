/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The detected text.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ImageText.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ImageText extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"words", "lines"})
    public ImageText(java.util.List<Word> words, java.util.List<Line> lines) {
        super();
        this.words = words;
        this.lines = lines;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The words recognized in an image.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("words")
        private java.util.List<Word> words;

        /**
         * The words recognized in an image.
         * @param words the value to set
         * @return this builder
         **/
        public Builder words(java.util.List<Word> words) {
            this.words = words;
            this.__explicitlySet__.add("words");
            return this;
        }
        /**
         * The lines of text recognized in an image.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lines")
        private java.util.List<Line> lines;

        /**
         * The lines of text recognized in an image.
         * @param lines the value to set
         * @return this builder
         **/
        public Builder lines(java.util.List<Line> lines) {
            this.lines = lines;
            this.__explicitlySet__.add("lines");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImageText build() {
            ImageText model = new ImageText(this.words, this.lines);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImageText model) {
            if (model.wasPropertyExplicitlySet("words")) {
                this.words(model.getWords());
            }
            if (model.wasPropertyExplicitlySet("lines")) {
                this.lines(model.getLines());
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
     * The words recognized in an image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("words")
    private final java.util.List<Word> words;

    /**
     * The words recognized in an image.
     * @return the value
     **/
    public java.util.List<Word> getWords() {
        return words;
    }

    /**
     * The lines of text recognized in an image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lines")
    private final java.util.List<Line> lines;

    /**
     * The lines of text recognized in an image.
     * @return the value
     **/
    public java.util.List<Line> getLines() {
        return lines;
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
        sb.append("ImageText(");
        sb.append("super=").append(super.toString());
        sb.append("words=").append(String.valueOf(this.words));
        sb.append(", lines=").append(String.valueOf(this.lines));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImageText)) {
            return false;
        }

        ImageText other = (ImageText) o;
        return java.util.Objects.equals(this.words, other.words)
                && java.util.Objects.equals(this.lines, other.lines)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.words == null ? 43 : this.words.hashCode());
        result = (result * PRIME) + (this.lines == null ? 43 : this.lines.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

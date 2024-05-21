/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Attributes to the detected language. Contains Language Name , Code, and Confidence Score.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DetectedLanguage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DetectedLanguage extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "code", "score"})
    public DetectedLanguage(String name, String code, Double score) {
        super();
        this.name = name;
        this.code = code;
        this.score = score;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Full language name.
         * Example: {@code English, Hindi, and so on}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Full language name.
         * Example: {@code English, Hindi, and so on}
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Detected language code as per [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) standard.
         * Example: {@code en, fr, hi etc}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private String code;

        /**
         * Detected language code as per [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) standard.
         * Example: {@code en, fr, hi etc}.
         *
         * @param code the value to set
         * @return this builder
         **/
        public Builder code(String code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }
        /**
         * Score or confidence of detected language code.
         * Example: {@code 0.9999856066867399}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("score")
        private Double score;

        /**
         * Score or confidence of detected language code.
         * Example: {@code 0.9999856066867399}
         *
         * @param score the value to set
         * @return this builder
         **/
        public Builder score(Double score) {
            this.score = score;
            this.__explicitlySet__.add("score");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetectedLanguage build() {
            DetectedLanguage model = new DetectedLanguage(this.name, this.code, this.score);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetectedLanguage model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("code")) {
                this.code(model.getCode());
            }
            if (model.wasPropertyExplicitlySet("score")) {
                this.score(model.getScore());
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
     * Full language name.
     * Example: {@code English, Hindi, and so on}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Full language name.
     * Example: {@code English, Hindi, and so on}
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Detected language code as per [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) standard.
     * Example: {@code en, fr, hi etc}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final String code;

    /**
     * Detected language code as per [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) standard.
     * Example: {@code en, fr, hi etc}.
     *
     * @return the value
     **/
    public String getCode() {
        return code;
    }

    /**
     * Score or confidence of detected language code.
     * Example: {@code 0.9999856066867399}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("score")
    private final Double score;

    /**
     * Score or confidence of detected language code.
     * Example: {@code 0.9999856066867399}
     *
     * @return the value
     **/
    public Double getScore() {
        return score;
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
        sb.append("DetectedLanguage(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", code=").append(String.valueOf(this.code));
        sb.append(", score=").append(String.valueOf(this.score));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectedLanguage)) {
            return false;
        }

        DetectedLanguage other = (DetectedLanguage) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.code, other.code)
                && java.util.Objects.equals(this.score, other.score)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.score == null ? 43 : this.score.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

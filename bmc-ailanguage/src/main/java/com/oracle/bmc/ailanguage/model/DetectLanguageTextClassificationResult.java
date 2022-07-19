/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Result of text classification detect call.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DetectLanguageTextClassificationResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DetectLanguageTextClassificationResult {
    @Deprecated
    @java.beans.ConstructorProperties({"textClassification"})
    public DetectLanguageTextClassificationResult(
            java.util.List<TextClassification> textClassification) {
        super();
        this.textClassification = textClassification;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of detected text classes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("textClassification")
        private java.util.List<TextClassification> textClassification;

        /**
         * List of detected text classes.
         * @param textClassification the value to set
         * @return this builder
         **/
        public Builder textClassification(java.util.List<TextClassification> textClassification) {
            this.textClassification = textClassification;
            this.__explicitlySet__.add("textClassification");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetectLanguageTextClassificationResult build() {
            DetectLanguageTextClassificationResult __instance__ =
                    new DetectLanguageTextClassificationResult(textClassification);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetectLanguageTextClassificationResult o) {
            Builder copiedBuilder = textClassification(o.getTextClassification());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * List of detected text classes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("textClassification")
    private final java.util.List<TextClassification> textClassification;

    /**
     * List of detected text classes.
     * @return the value
     **/
    public java.util.List<TextClassification> getTextClassification() {
        return textClassification;
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
        sb.append("DetectLanguageTextClassificationResult(");
        sb.append("textClassification=").append(String.valueOf(this.textClassification));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectLanguageTextClassificationResult)) {
            return false;
        }

        DetectLanguageTextClassificationResult other = (DetectLanguageTextClassificationResult) o;
        return java.util.Objects.equals(this.textClassification, other.textClassification)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.textClassification == null
                                ? 43
                                : this.textClassification.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}

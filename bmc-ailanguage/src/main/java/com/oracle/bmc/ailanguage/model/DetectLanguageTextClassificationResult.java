/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Result of text classification detect call. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DetectLanguageTextClassificationResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DetectLanguageTextClassificationResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"textClassification"})
    public DetectLanguageTextClassificationResult(
            java.util.List<TextClassification> textClassification) {
        super();
        this.textClassification = textClassification;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of detected text classes. */
        @com.fasterxml.jackson.annotation.JsonProperty("textClassification")
        private java.util.List<TextClassification> textClassification;

        /**
         * List of detected text classes.
         *
         * @param textClassification the value to set
         * @return this builder
         */
        public Builder textClassification(java.util.List<TextClassification> textClassification) {
            this.textClassification = textClassification;
            this.__explicitlySet__.add("textClassification");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetectLanguageTextClassificationResult build() {
            DetectLanguageTextClassificationResult model =
                    new DetectLanguageTextClassificationResult(this.textClassification);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetectLanguageTextClassificationResult model) {
            if (model.wasPropertyExplicitlySet("textClassification")) {
                this.textClassification(model.getTextClassification());
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

    /** List of detected text classes. */
    @com.fasterxml.jackson.annotation.JsonProperty("textClassification")
    private final java.util.List<TextClassification> textClassification;

    /**
     * List of detected text classes.
     *
     * @return the value
     */
    public java.util.List<TextClassification> getTextClassification() {
        return textClassification;
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
        sb.append("DetectLanguageTextClassificationResult(");
        sb.append("super=").append(super.toString());
        sb.append("textClassification=").append(String.valueOf(this.textClassification));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

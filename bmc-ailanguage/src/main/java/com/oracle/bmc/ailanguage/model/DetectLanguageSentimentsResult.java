/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Result of sentiments detect call. <br>
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
        builder = DetectLanguageSentimentsResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DetectLanguageSentimentsResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"aspects"})
    public DetectLanguageSentimentsResult(java.util.List<SentimentAspect> aspects) {
        super();
        this.aspects = aspects;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of detected aspects. */
        @com.fasterxml.jackson.annotation.JsonProperty("aspects")
        private java.util.List<SentimentAspect> aspects;

        /**
         * List of detected aspects.
         *
         * @param aspects the value to set
         * @return this builder
         */
        public Builder aspects(java.util.List<SentimentAspect> aspects) {
            this.aspects = aspects;
            this.__explicitlySet__.add("aspects");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetectLanguageSentimentsResult build() {
            DetectLanguageSentimentsResult model = new DetectLanguageSentimentsResult(this.aspects);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetectLanguageSentimentsResult model) {
            if (model.wasPropertyExplicitlySet("aspects")) {
                this.aspects(model.getAspects());
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

    /** List of detected aspects. */
    @com.fasterxml.jackson.annotation.JsonProperty("aspects")
    private final java.util.List<SentimentAspect> aspects;

    /**
     * List of detected aspects.
     *
     * @return the value
     */
    public java.util.List<SentimentAspect> getAspects() {
        return aspects;
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
        sb.append("DetectLanguageSentimentsResult(");
        sb.append("super=").append(super.toString());
        sb.append("aspects=").append(String.valueOf(this.aspects));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectLanguageSentimentsResult)) {
            return false;
        }

        DetectLanguageSentimentsResult other = (DetectLanguageSentimentsResult) o;
        return java.util.Objects.equals(this.aspects, other.aspects) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.aspects == null ? 43 : this.aspects.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

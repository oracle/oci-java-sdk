/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Result of a language keyPhrases detect call. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DetectLanguageKeyPhrasesResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DetectLanguageKeyPhrasesResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"keyPhrases"})
    public DetectLanguageKeyPhrasesResult(java.util.List<KeyPhrase> keyPhrases) {
        super();
        this.keyPhrases = keyPhrases;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of detected keyPhrases. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyPhrases")
        private java.util.List<KeyPhrase> keyPhrases;

        /**
         * List of detected keyPhrases.
         *
         * @param keyPhrases the value to set
         * @return this builder
         */
        public Builder keyPhrases(java.util.List<KeyPhrase> keyPhrases) {
            this.keyPhrases = keyPhrases;
            this.__explicitlySet__.add("keyPhrases");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetectLanguageKeyPhrasesResult build() {
            DetectLanguageKeyPhrasesResult model =
                    new DetectLanguageKeyPhrasesResult(this.keyPhrases);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetectLanguageKeyPhrasesResult model) {
            if (model.wasPropertyExplicitlySet("keyPhrases")) {
                this.keyPhrases(model.getKeyPhrases());
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

    /** List of detected keyPhrases. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyPhrases")
    private final java.util.List<KeyPhrase> keyPhrases;

    /**
     * List of detected keyPhrases.
     *
     * @return the value
     */
    public java.util.List<KeyPhrase> getKeyPhrases() {
        return keyPhrases;
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
        sb.append("DetectLanguageKeyPhrasesResult(");
        sb.append("super=").append(super.toString());
        sb.append("keyPhrases=").append(String.valueOf(this.keyPhrases));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectLanguageKeyPhrasesResult)) {
            return false;
        }

        DetectLanguageKeyPhrasesResult other = (DetectLanguageKeyPhrasesResult) o;
        return java.util.Objects.equals(this.keyPhrases, other.keyPhrases) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.keyPhrases == null ? 43 : this.keyPhrases.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

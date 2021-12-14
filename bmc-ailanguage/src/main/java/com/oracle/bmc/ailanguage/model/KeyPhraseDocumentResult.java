/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * The document response for keyPhrases detect call.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = KeyPhraseDocumentResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class KeyPhraseDocumentResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyPhrases")
        private java.util.List<KeyPhrase> keyPhrases;

        public Builder keyPhrases(java.util.List<KeyPhrase> keyPhrases) {
            this.keyPhrases = keyPhrases;
            this.__explicitlySet__.add("keyPhrases");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
        private String languageCode;

        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            this.__explicitlySet__.add("languageCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KeyPhraseDocumentResult build() {
            KeyPhraseDocumentResult __instance__ =
                    new KeyPhraseDocumentResult(key, keyPhrases, languageCode);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyPhraseDocumentResult o) {
            Builder copiedBuilder =
                    key(o.getKey()).keyPhrases(o.getKeyPhrases()).languageCode(o.getLanguageCode());

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

    /**
     * Document Unique Identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * List of detected keyPhrases.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyPhrases")
    java.util.List<KeyPhrase> keyPhrases;

    /**
     * Language code as per [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) standard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    String languageCode;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

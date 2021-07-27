/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GeneratedKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class GeneratedKey {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("ciphertext")
        private String ciphertext;

        public Builder ciphertext(String ciphertext) {
            this.ciphertext = ciphertext;
            this.__explicitlySet__.add("ciphertext");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("plaintext")
        private String plaintext;

        public Builder plaintext(String plaintext) {
            this.plaintext = plaintext;
            this.__explicitlySet__.add("plaintext");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("plaintextChecksum")
        private String plaintextChecksum;

        public Builder plaintextChecksum(String plaintextChecksum) {
            this.plaintextChecksum = plaintextChecksum;
            this.__explicitlySet__.add("plaintextChecksum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GeneratedKey build() {
            GeneratedKey __instance__ = new GeneratedKey(ciphertext, plaintext, plaintextChecksum);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GeneratedKey o) {
            Builder copiedBuilder =
                    ciphertext(o.getCiphertext())
                            .plaintext(o.getPlaintext())
                            .plaintextChecksum(o.getPlaintextChecksum());

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
     * The encrypted data encryption key generated from a master encryption key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ciphertext")
    String ciphertext;

    /**
     * The plaintext data encryption key, a base64-encoded sequence of random bytes, which is
     * included if the [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey)
     * request includes the {@code includePlaintextKey} parameter and sets its value to "true".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("plaintext")
    String plaintext;

    /**
     * The checksum of the plaintext data encryption key, which is included if the
     * [GenerateDataEncryptionKey](https://docs.cloud.oracle.com/api/#/en/key/latest/GeneratedKey/GenerateDataEncryptionKey)
     * request includes the {@code includePlaintextKey} parameter and sets its value to "true".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("plaintextChecksum")
    String plaintextChecksum;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

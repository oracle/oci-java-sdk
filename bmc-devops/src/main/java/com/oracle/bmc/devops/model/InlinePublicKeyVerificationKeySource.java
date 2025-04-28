/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the Inline public key verification source details <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InlinePublicKeyVerificationKeySource.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "verificationKeySourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InlinePublicKeyVerificationKeySource extends VerificationKeySource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Current version of Base64 encoding of the public key which is in binary GPG exported
         * format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("currentPublicKey")
        private String currentPublicKey;

        /**
         * Current version of Base64 encoding of the public key which is in binary GPG exported
         * format.
         *
         * @param currentPublicKey the value to set
         * @return this builder
         */
        public Builder currentPublicKey(String currentPublicKey) {
            this.currentPublicKey = currentPublicKey;
            this.__explicitlySet__.add("currentPublicKey");
            return this;
        }
        /**
         * Previous version of Base64 encoding of the public key which is in binary GPG exported
         * format. This would be used for key rotation scenarios.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("previousPublicKey")
        private String previousPublicKey;

        /**
         * Previous version of Base64 encoding of the public key which is in binary GPG exported
         * format. This would be used for key rotation scenarios.
         *
         * @param previousPublicKey the value to set
         * @return this builder
         */
        public Builder previousPublicKey(String previousPublicKey) {
            this.previousPublicKey = previousPublicKey;
            this.__explicitlySet__.add("previousPublicKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InlinePublicKeyVerificationKeySource build() {
            InlinePublicKeyVerificationKeySource model =
                    new InlinePublicKeyVerificationKeySource(
                            this.currentPublicKey, this.previousPublicKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InlinePublicKeyVerificationKeySource model) {
            if (model.wasPropertyExplicitlySet("currentPublicKey")) {
                this.currentPublicKey(model.getCurrentPublicKey());
            }
            if (model.wasPropertyExplicitlySet("previousPublicKey")) {
                this.previousPublicKey(model.getPreviousPublicKey());
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

    @Deprecated
    public InlinePublicKeyVerificationKeySource(String currentPublicKey, String previousPublicKey) {
        super();
        this.currentPublicKey = currentPublicKey;
        this.previousPublicKey = previousPublicKey;
    }

    /**
     * Current version of Base64 encoding of the public key which is in binary GPG exported format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currentPublicKey")
    private final String currentPublicKey;

    /**
     * Current version of Base64 encoding of the public key which is in binary GPG exported format.
     *
     * @return the value
     */
    public String getCurrentPublicKey() {
        return currentPublicKey;
    }

    /**
     * Previous version of Base64 encoding of the public key which is in binary GPG exported format.
     * This would be used for key rotation scenarios.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("previousPublicKey")
    private final String previousPublicKey;

    /**
     * Previous version of Base64 encoding of the public key which is in binary GPG exported format.
     * This would be used for key rotation scenarios.
     *
     * @return the value
     */
    public String getPreviousPublicKey() {
        return previousPublicKey;
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
        sb.append("InlinePublicKeyVerificationKeySource(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", currentPublicKey=").append(String.valueOf(this.currentPublicKey));
        sb.append(", previousPublicKey=").append(String.valueOf(this.previousPublicKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InlinePublicKeyVerificationKeySource)) {
            return false;
        }

        InlinePublicKeyVerificationKeySource other = (InlinePublicKeyVerificationKeySource) o;
        return java.util.Objects.equals(this.currentPublicKey, other.currentPublicKey)
                && java.util.Objects.equals(this.previousPublicKey, other.previousPublicKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.currentPublicKey == null ? 43 : this.currentPublicKey.hashCode());
        result =
                (result * PRIME)
                        + (this.previousPublicKey == null ? 43 : this.previousPublicKey.hashCode());
        return result;
    }
}

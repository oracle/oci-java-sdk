/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Encrypt data details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EncryptDataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EncryptDataDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"keyId", "keyGenerationType"})
    public EncryptDataDetails(String keyId, KeyGenerationType keyGenerationType) {
        super();
        this.keyId = keyId;
        this.keyGenerationType = keyGenerationType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the key to use. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * The OCID of the key to use.
         *
         * @param keyId the value to set
         * @return this builder
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }
        /** Select whether to use Oracle-managed key (SYSTEM) or your own key (BYOK). */
        @com.fasterxml.jackson.annotation.JsonProperty("keyGenerationType")
        private KeyGenerationType keyGenerationType;

        /**
         * Select whether to use Oracle-managed key (SYSTEM) or your own key (BYOK).
         *
         * @param keyGenerationType the value to set
         * @return this builder
         */
        public Builder keyGenerationType(KeyGenerationType keyGenerationType) {
            this.keyGenerationType = keyGenerationType;
            this.__explicitlySet__.add("keyGenerationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EncryptDataDetails build() {
            EncryptDataDetails model = new EncryptDataDetails(this.keyId, this.keyGenerationType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EncryptDataDetails model) {
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("keyGenerationType")) {
                this.keyGenerationType(model.getKeyGenerationType());
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

    /** The OCID of the key to use. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * The OCID of the key to use.
     *
     * @return the value
     */
    public String getKeyId() {
        return keyId;
    }

    /** Select whether to use Oracle-managed key (SYSTEM) or your own key (BYOK). */
    @com.fasterxml.jackson.annotation.JsonProperty("keyGenerationType")
    private final KeyGenerationType keyGenerationType;

    /**
     * Select whether to use Oracle-managed key (SYSTEM) or your own key (BYOK).
     *
     * @return the value
     */
    public KeyGenerationType getKeyGenerationType() {
        return keyGenerationType;
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
        sb.append("EncryptDataDetails(");
        sb.append("super=").append(super.toString());
        sb.append("keyId=").append(String.valueOf(this.keyId));
        sb.append(", keyGenerationType=").append(String.valueOf(this.keyGenerationType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EncryptDataDetails)) {
            return false;
        }

        EncryptDataDetails other = (EncryptDataDetails) o;
        return java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.keyGenerationType, other.keyGenerationType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result =
                (result * PRIME)
                        + (this.keyGenerationType == null ? 43 : this.keyGenerationType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

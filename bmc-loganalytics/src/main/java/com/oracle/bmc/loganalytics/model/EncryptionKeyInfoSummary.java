/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the summary of an encryption key. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EncryptionKeyInfoSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EncryptionKeyInfoSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"keySource", "keyId", "keyType"})
    public EncryptionKeyInfoSummary(
            EncryptionKeySource keySource, String keyId, EncryptionKeyType keyType) {
        super();
        this.keySource = keySource;
        this.keyId = keyId;
        this.keyType = keyType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** This is the source of the encryption key. */
        @com.fasterxml.jackson.annotation.JsonProperty("keySource")
        private EncryptionKeySource keySource;

        /**
         * This is the source of the encryption key.
         *
         * @param keySource the value to set
         * @return this builder
         */
        public Builder keySource(EncryptionKeySource keySource) {
            this.keySource = keySource;
            this.__explicitlySet__.add("keySource");
            return this;
        }
        /** This is the key OCID of the encryption key (null if Oracle-managed). */
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * This is the key OCID of the encryption key (null if Oracle-managed).
         *
         * @param keyId the value to set
         * @return this builder
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }
        /** This is the type of data to be encrypted. It can be either active or archival. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyType")
        private EncryptionKeyType keyType;

        /**
         * This is the type of data to be encrypted. It can be either active or archival.
         *
         * @param keyType the value to set
         * @return this builder
         */
        public Builder keyType(EncryptionKeyType keyType) {
            this.keyType = keyType;
            this.__explicitlySet__.add("keyType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EncryptionKeyInfoSummary build() {
            EncryptionKeyInfoSummary model =
                    new EncryptionKeyInfoSummary(this.keySource, this.keyId, this.keyType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EncryptionKeyInfoSummary model) {
            if (model.wasPropertyExplicitlySet("keySource")) {
                this.keySource(model.getKeySource());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("keyType")) {
                this.keyType(model.getKeyType());
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

    /** This is the source of the encryption key. */
    @com.fasterxml.jackson.annotation.JsonProperty("keySource")
    private final EncryptionKeySource keySource;

    /**
     * This is the source of the encryption key.
     *
     * @return the value
     */
    public EncryptionKeySource getKeySource() {
        return keySource;
    }

    /** This is the key OCID of the encryption key (null if Oracle-managed). */
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * This is the key OCID of the encryption key (null if Oracle-managed).
     *
     * @return the value
     */
    public String getKeyId() {
        return keyId;
    }

    /** This is the type of data to be encrypted. It can be either active or archival. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyType")
    private final EncryptionKeyType keyType;

    /**
     * This is the type of data to be encrypted. It can be either active or archival.
     *
     * @return the value
     */
    public EncryptionKeyType getKeyType() {
        return keyType;
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
        sb.append("EncryptionKeyInfoSummary(");
        sb.append("super=").append(super.toString());
        sb.append("keySource=").append(String.valueOf(this.keySource));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(", keyType=").append(String.valueOf(this.keyType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EncryptionKeyInfoSummary)) {
            return false;
        }

        EncryptionKeyInfoSummary other = (EncryptionKeyInfoSummary) o;
        return java.util.Objects.equals(this.keySource, other.keySource)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.keyType, other.keyType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.keySource == null ? 43 : this.keySource.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result = (result * PRIME) + (this.keyType == null ? 43 : this.keyType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * The details used to re-encrypt the data encryption keys associated with an object. You can only
 * specify either a kmsKeyId or an sseCustomerKey in the request payload, not both. If the request
 * payload is empty, the object is encrypted using the encryption key assigned to the bucket. The
 * bucket encryption mechanism can either be a master encryption key managed by Oracle or the Vault
 * service.
 *
 * <p>- The sseCustomerKey field specifies the customer-provided encryption key (SSE-C) that will be
 * used to re-encrypt the data encryption keys of the object and its chunks.
 *
 * <p>- The sourceSSECustomerKey field specifies information about the customer-provided encryption
 * key that is currently associated with the object source. Specify a value for the
 * sourceSSECustomerKey only if the object is encrypted with a customer-provided encryption key.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ReencryptObjectDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ReencryptObjectDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"kmsKeyId", "sseCustomerKey", "sourceSseCustomerKey"})
    public ReencryptObjectDetails(
            String kmsKeyId,
            SSECustomerKeyDetails sseCustomerKey,
            SSECustomerKeyDetails sourceSseCustomerKey) {
        super();
        this.kmsKeyId = kmsKeyId;
        this.sseCustomerKey = sseCustomerKey;
        this.sourceSseCustomerKey = sourceSseCustomerKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * master encryption key used to call the Vault service to re-encrypt the data encryption
         * keys associated with the object and its chunks. If the kmsKeyId value is empty, whether
         * null or an empty string, the API will perform re-encryption by using the kmsKeyId
         * associated with the bucket or the master encryption key managed by Oracle, depending on
         * the bucket encryption mechanism.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * master encryption key used to call the Vault service to re-encrypt the data encryption
         * keys associated with the object and its chunks. If the kmsKeyId value is empty, whether
         * null or an empty string, the API will perform re-encryption by using the kmsKeyId
         * associated with the bucket or the master encryption key managed by Oracle, depending on
         * the bucket encryption mechanism.
         *
         * @param kmsKeyId the value to set
         * @return this builder
         */
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sseCustomerKey")
        private SSECustomerKeyDetails sseCustomerKey;

        public Builder sseCustomerKey(SSECustomerKeyDetails sseCustomerKey) {
            this.sseCustomerKey = sseCustomerKey;
            this.__explicitlySet__.add("sseCustomerKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceSseCustomerKey")
        private SSECustomerKeyDetails sourceSseCustomerKey;

        public Builder sourceSseCustomerKey(SSECustomerKeyDetails sourceSseCustomerKey) {
            this.sourceSseCustomerKey = sourceSseCustomerKey;
            this.__explicitlySet__.add("sourceSseCustomerKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReencryptObjectDetails build() {
            ReencryptObjectDetails model =
                    new ReencryptObjectDetails(
                            this.kmsKeyId, this.sseCustomerKey, this.sourceSseCustomerKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReencryptObjectDetails model) {
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("sseCustomerKey")) {
                this.sseCustomerKey(model.getSseCustomerKey());
            }
            if (model.wasPropertyExplicitlySet("sourceSseCustomerKey")) {
                this.sourceSseCustomerKey(model.getSourceSseCustomerKey());
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * master encryption key used to call the Vault service to re-encrypt the data encryption keys
     * associated with the object and its chunks. If the kmsKeyId value is empty, whether null or an
     * empty string, the API will perform re-encryption by using the kmsKeyId associated with the
     * bucket or the master encryption key managed by Oracle, depending on the bucket encryption
     * mechanism.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * master encryption key used to call the Vault service to re-encrypt the data encryption keys
     * associated with the object and its chunks. If the kmsKeyId value is empty, whether null or an
     * empty string, the API will perform re-encryption by using the kmsKeyId associated with the
     * bucket or the master encryption key managed by Oracle, depending on the bucket encryption
     * mechanism.
     *
     * @return the value
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sseCustomerKey")
    private final SSECustomerKeyDetails sseCustomerKey;

    public SSECustomerKeyDetails getSseCustomerKey() {
        return sseCustomerKey;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceSseCustomerKey")
    private final SSECustomerKeyDetails sourceSseCustomerKey;

    public SSECustomerKeyDetails getSourceSseCustomerKey() {
        return sourceSseCustomerKey;
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
        sb.append("ReencryptObjectDetails(");
        sb.append("super=").append(super.toString());
        sb.append("kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", sseCustomerKey=").append(String.valueOf(this.sseCustomerKey));
        sb.append(", sourceSseCustomerKey=").append(String.valueOf(this.sourceSseCustomerKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReencryptObjectDetails)) {
            return false;
        }

        ReencryptObjectDetails other = (ReencryptObjectDetails) o;
        return java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.sseCustomerKey, other.sseCustomerKey)
                && java.util.Objects.equals(this.sourceSseCustomerKey, other.sourceSseCustomerKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.sseCustomerKey == null ? 43 : this.sseCustomerKey.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceSseCustomerKey == null
                                ? 43
                                : this.sourceSseCustomerKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

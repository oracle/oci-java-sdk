/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * The details used to re-encrypt the data encryption keys associated with an object.
 * You can only specify either a kmsKeyId or an sseCustomerKey in the request payload, not both.
 * If the request payload is empty, the object is encrypted using the encryption key assigned to the
 * bucket. The bucket encryption mechanism can either be a master encryption key managed by Oracle or the Vault service.
 * <p>
 * - The sseCustomerKey field specifies the customer-provided encryption key (SSE-C) that will be used to re-encrypt the data encryption keys of the
 *   object and its chunks.
 * <p>
 * - The sourceSSECustomerKey field specifies information about the customer-provided encryption key that is currently
 *   associated with the object source. Specify a value for the sourceSSECustomerKey only if the object
 *   is encrypted with a customer-provided encryption key.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ReencryptObjectDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ReencryptObjectDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

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
            ReencryptObjectDetails __instance__ =
                    new ReencryptObjectDetails(kmsKeyId, sseCustomerKey, sourceSseCustomerKey);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReencryptObjectDetails o) {
            Builder copiedBuilder =
                    kmsKeyId(o.getKmsKeyId())
                            .sseCustomerKey(o.getSseCustomerKey())
                            .sourceSseCustomerKey(o.getSourceSseCustomerKey());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the master encryption key used to call the Vault
     * service to re-encrypt the data encryption keys associated with the object and its chunks. If the kmsKeyId value is
     * empty, whether null or an empty string, the API will perform re-encryption by using the kmsKeyId associated with the
     * bucket or the master encryption key managed by Oracle, depending on the bucket encryption mechanism.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    String kmsKeyId;

    @com.fasterxml.jackson.annotation.JsonProperty("sseCustomerKey")
    SSECustomerKeyDetails sseCustomerKey;

    @com.fasterxml.jackson.annotation.JsonProperty("sourceSseCustomerKey")
    SSECustomerKeyDetails sourceSseCustomerKey;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

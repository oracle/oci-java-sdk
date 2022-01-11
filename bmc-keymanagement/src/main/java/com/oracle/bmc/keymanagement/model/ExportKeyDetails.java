/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * The details of the key that you want to wrap and export.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExportKeyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ExportKeyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
        private String keyVersionId;

        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            this.__explicitlySet__.add("keyVersionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
        private Algorithm algorithm;

        public Builder algorithm(Algorithm algorithm) {
            this.algorithm = algorithm;
            this.__explicitlySet__.add("algorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
        private String publicKey;

        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            this.__explicitlySet__.add("publicKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("loggingContext")
        private java.util.Map<String, String> loggingContext;

        public Builder loggingContext(java.util.Map<String, String> loggingContext) {
            this.loggingContext = loggingContext;
            this.__explicitlySet__.add("loggingContext");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportKeyDetails build() {
            ExportKeyDetails __instance__ =
                    new ExportKeyDetails(keyId, keyVersionId, algorithm, publicKey, loggingContext);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportKeyDetails o) {
            Builder copiedBuilder =
                    keyId(o.getKeyId())
                            .keyVersionId(o.getKeyVersionId())
                            .algorithm(o.getAlgorithm())
                            .publicKey(o.getPublicKey())
                            .loggingContext(o.getLoggingContext());

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
     * The OCID of the master encryption key associated with the key version you want to export.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    String keyId;

    /**
     * The OCID of the specific key version to export. If not specified, the service exports the current key version.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyVersionId")
    String keyVersionId;
    /**
     * The encryption algorithm to use to encrypt exportable key material from a software-backed key. Specifying {@code RSA_OAEP_AES_SHA256}
     * invokes the RSA AES key wrap mechanism, which generates a temporary AES key. The temporary AES key is wrapped by the RSA public
     * wrapping key provided along with the request, creating a wrapped temporary AES key. The temporary AES key is also used to wrap
     * the exportable key material. The wrapped temporary AES key and the wrapped exportable key material are concatenated, producing
     * concatenated blob output that jointly represents them. Specifying {@code RSA_OAEP_SHA256} means that the software key is wrapped by
     * the RSA public wrapping key provided along with the request.
     *
     **/
    public enum Algorithm {
        RsaOaepAesSha256("RSA_OAEP_AES_SHA256"),
        RsaOaepSha256("RSA_OAEP_SHA256"),
        ;

        private final String value;
        private static java.util.Map<String, Algorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (Algorithm v : Algorithm.values()) {
                map.put(v.getValue(), v);
            }
        }

        Algorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Algorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Algorithm: " + key);
        }
    };
    /**
     * The encryption algorithm to use to encrypt exportable key material from a software-backed key. Specifying {@code RSA_OAEP_AES_SHA256}
     * invokes the RSA AES key wrap mechanism, which generates a temporary AES key. The temporary AES key is wrapped by the RSA public
     * wrapping key provided along with the request, creating a wrapped temporary AES key. The temporary AES key is also used to wrap
     * the exportable key material. The wrapped temporary AES key and the wrapped exportable key material are concatenated, producing
     * concatenated blob output that jointly represents them. Specifying {@code RSA_OAEP_SHA256} means that the software key is wrapped by
     * the RSA public wrapping key provided along with the request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
    Algorithm algorithm;

    /**
     * The PEM format of the 2048-bit, 3072-bit, or 4096-bit RSA wrapping key in your possession that you want to use to encrypt the key.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
    String publicKey;

    /**
     * Information that provides context for audit logging. You can provide this additional
     * data as key-value pairs to include in the audit logs when audit logging is enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loggingContext")
    java.util.Map<String, String> loggingContext;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

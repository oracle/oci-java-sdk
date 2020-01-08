/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GenerateKeyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class GenerateKeyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("associatedData")
        private java.util.Map<String, String> associatedData;

        public Builder associatedData(java.util.Map<String, String> associatedData) {
            this.associatedData = associatedData;
            this.__explicitlySet__.add("associatedData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("includePlaintextKey")
        private Boolean includePlaintextKey;

        public Builder includePlaintextKey(Boolean includePlaintextKey) {
            this.includePlaintextKey = includePlaintextKey;
            this.__explicitlySet__.add("includePlaintextKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyShape")
        private KeyShape keyShape;

        public Builder keyShape(KeyShape keyShape) {
            this.keyShape = keyShape;
            this.__explicitlySet__.add("keyShape");
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

        public GenerateKeyDetails build() {
            GenerateKeyDetails __instance__ =
                    new GenerateKeyDetails(
                            associatedData, includePlaintextKey, keyId, keyShape, loggingContext);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateKeyDetails o) {
            Builder copiedBuilder =
                    associatedData(o.getAssociatedData())
                            .includePlaintextKey(o.getIncludePlaintextKey())
                            .keyId(o.getKeyId())
                            .keyShape(o.getKeyShape())
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
     * Information that can be used to provide an encryption context for the encrypted data.
     * The length of the string representation of the associated data must be fewer than 4096
     * characters.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associatedData")
    java.util.Map<String, String> associatedData;

    /**
     * If true, the generated key is also returned unencrypted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("includePlaintextKey")
    Boolean includePlaintextKey;

    /**
     * The OCID of the master encryption key to encrypt the generated data encryption key with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    String keyId;

    @com.fasterxml.jackson.annotation.JsonProperty("keyShape")
    KeyShape keyShape;

    /**
     * Information that provides context for audit logging. You can provide this additional
     * data by formatting it as key-value pairs to include in audit logs when audit logging is enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loggingContext")
    java.util.Map<String, String> loggingContext;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WrappedImportKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class WrappedImportKey {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("keyMaterial")
        private String keyMaterial;

        public Builder keyMaterial(String keyMaterial) {
            this.keyMaterial = keyMaterial;
            this.__explicitlySet__.add("keyMaterial");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("wrappingAlgorithm")
        private WrappingAlgorithm wrappingAlgorithm;

        public Builder wrappingAlgorithm(WrappingAlgorithm wrappingAlgorithm) {
            this.wrappingAlgorithm = wrappingAlgorithm;
            this.__explicitlySet__.add("wrappingAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WrappedImportKey build() {
            WrappedImportKey __instance__ = new WrappedImportKey(keyMaterial, wrappingAlgorithm);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WrappedImportKey o) {
            Builder copiedBuilder =
                    keyMaterial(o.getKeyMaterial()).wrappingAlgorithm(o.getWrappingAlgorithm());

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
     * The wrapped/encrypted key material to import. It is encrypted using RSA wrapped key and Base64 encoded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyMaterial")
    String keyMaterial;
    /**
     * The wrapping mechanism to be used during key import
     **/
    public enum WrappingAlgorithm {
        RsaOaepSha256("RSA_OAEP_SHA256"),
        ;

        private final String value;
        private static java.util.Map<String, WrappingAlgorithm> map;

        static {
            map = new java.util.HashMap<>();
            for (WrappingAlgorithm v : WrappingAlgorithm.values()) {
                map.put(v.getValue(), v);
            }
        }

        WrappingAlgorithm(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static WrappingAlgorithm create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid WrappingAlgorithm: " + key);
        }
    };
    /**
     * The wrapping mechanism to be used during key import
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wrappingAlgorithm")
    WrappingAlgorithm wrappingAlgorithm;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

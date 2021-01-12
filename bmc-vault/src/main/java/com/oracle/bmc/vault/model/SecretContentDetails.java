/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault.model;

/**
 * The content of the secret and metadata to help identify it.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "contentType",
    defaultImpl = SecretContentDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = Base64SecretContentDetails.class,
        name = "BASE64"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class SecretContentDetails {

    /**
     * Names should be unique within a secret. Valid characters are uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;
    /**
     * The rotation state of the secret content. The default is `CURRENT`, meaning that the secret is currently in use. A secret version
     * that you mark as `PENDING` is staged and available for use, but you don't yet want to rotate it into current, active use. For example,
     * you might create or update a secret and mark its rotation state as `PENDING` if you haven't yet updated the secret on the target system.
     * When creating a secret, only the value `CURRENT` is applicable, although the value `LATEST` is also automatically applied. When updating
     * a secret, you can specify a version's rotation state as either `CURRENT` or `PENDING`.
     *
     **/
    public enum Stage {
        Current("CURRENT"),
        Pending("PENDING"),
        ;

        private final String value;
        private static java.util.Map<String, Stage> map;

        static {
            map = new java.util.HashMap<>();
            for (Stage v : Stage.values()) {
                map.put(v.getValue(), v);
            }
        }

        Stage(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Stage create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Stage: " + key);
        }
    };
    /**
     * The rotation state of the secret content. The default is `CURRENT`, meaning that the secret is currently in use. A secret version
     * that you mark as `PENDING` is staged and available for use, but you don't yet want to rotate it into current, active use. For example,
     * you might create or update a secret and mark its rotation state as `PENDING` if you haven't yet updated the secret on the target system.
     * When creating a secret, only the value `CURRENT` is applicable, although the value `LATEST` is also automatically applied. When updating
     * a secret, you can specify a version's rotation state as either `CURRENT` or `PENDING`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stage")
    Stage stage;

    /**
     * The base64-encoded content of the secret.
     **/
    public enum ContentType {
        Base64("BASE64"),
        ;

        private final String value;
        private static java.util.Map<String, ContentType> map;

        static {
            map = new java.util.HashMap<>();
            for (ContentType v : ContentType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ContentType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ContentType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ContentType: " + key);
        }
    };
}

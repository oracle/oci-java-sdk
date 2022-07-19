/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
    @Deprecated
    @java.beans.ConstructorProperties({"name", "stage"})
    protected SecretContentDetails(String name, Stage stage) {
        super();
        this.name = name;
        this.stage = stage;
    }

    /**
     * Names should be unique within a secret. Valid characters are uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Names should be unique within a secret. Valid characters are uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The rotation state of the secret content. The default is {@code CURRENT}, meaning that the secret is currently in use. A secret version
     * that you mark as {@code PENDING} is staged and available for use, but you don't yet want to rotate it into current, active use. For example,
     * you might create or update a secret and mark its rotation state as {@code PENDING} if you haven't yet updated the secret on the target system.
     * When creating a secret, only the value {@code CURRENT} is applicable, although the value {@code LATEST} is also automatically applied. When updating
     * a secret, you can specify a version's rotation state as either {@code CURRENT} or {@code PENDING}.
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
     * The rotation state of the secret content. The default is {@code CURRENT}, meaning that the secret is currently in use. A secret version
     * that you mark as {@code PENDING} is staged and available for use, but you don't yet want to rotate it into current, active use. For example,
     * you might create or update a secret and mark its rotation state as {@code PENDING} if you haven't yet updated the secret on the target system.
     * When creating a secret, only the value {@code CURRENT} is applicable, although the value {@code LATEST} is also automatically applied. When updating
     * a secret, you can specify a version's rotation state as either {@code CURRENT} or {@code PENDING}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stage")
    private final Stage stage;

    /**
     * The rotation state of the secret content. The default is {@code CURRENT}, meaning that the secret is currently in use. A secret version
     * that you mark as {@code PENDING} is staged and available for use, but you don't yet want to rotate it into current, active use. For example,
     * you might create or update a secret and mark its rotation state as {@code PENDING} if you haven't yet updated the secret on the target system.
     * When creating a secret, only the value {@code CURRENT} is applicable, although the value {@code LATEST} is also automatically applied. When updating
     * a secret, you can specify a version's rotation state as either {@code CURRENT} or {@code PENDING}.
     *
     * @return the value
     **/
    public Stage getStage() {
        return stage;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SecretContentDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", stage=").append(String.valueOf(this.stage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecretContentDetails)) {
            return false;
        }

        SecretContentDetails other = (SecretContentDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.stage, other.stage);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.stage == null ? 43 : this.stage.hashCode());
        return result;
    }

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

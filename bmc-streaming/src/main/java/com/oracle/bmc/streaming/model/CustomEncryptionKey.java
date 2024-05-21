/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.model;

/**
 * Custom Encryption Key which will be used for encryption by all the streams in the pool.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CustomEncryptionKey.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CustomEncryptionKey extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"kmsKeyId", "keyState"})
    public CustomEncryptionKey(String kmsKeyId, KeyState keyState) {
        super();
        this.kmsKeyId = kmsKeyId;
        this.keyState = keyState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Custom Encryption Key (Master Key) ocid.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * Custom Encryption Key (Master Key) ocid.
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * Life cycle State of the custom key
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyState")
        private KeyState keyState;

        /**
         * Life cycle State of the custom key
         * @param keyState the value to set
         * @return this builder
         **/
        public Builder keyState(KeyState keyState) {
            this.keyState = keyState;
            this.__explicitlySet__.add("keyState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomEncryptionKey build() {
            CustomEncryptionKey model = new CustomEncryptionKey(this.kmsKeyId, this.keyState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomEncryptionKey model) {
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("keyState")) {
                this.keyState(model.getKeyState());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Custom Encryption Key (Master Key) ocid.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * Custom Encryption Key (Master Key) ocid.
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * Life cycle State of the custom key
     **/
    public enum KeyState {
        Active("ACTIVE"),
        Creating("CREATING"),
        Deleting("DELETING"),
        None("NONE"),
        Failed("FAILED"),
        Updating("UPDATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(KeyState.class);

        private final String value;
        private static java.util.Map<String, KeyState> map;

        static {
            map = new java.util.HashMap<>();
            for (KeyState v : KeyState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        KeyState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static KeyState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'KeyState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Life cycle State of the custom key
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyState")
    private final KeyState keyState;

    /**
     * Life cycle State of the custom key
     * @return the value
     **/
    public KeyState getKeyState() {
        return keyState;
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
        sb.append("CustomEncryptionKey(");
        sb.append("super=").append(super.toString());
        sb.append("kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", keyState=").append(String.valueOf(this.keyState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomEncryptionKey)) {
            return false;
        }

        CustomEncryptionKey other = (CustomEncryptionKey) o;
        return java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.keyState, other.keyState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result = (result * PRIME) + (this.keyState == null ? 43 : this.keyState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

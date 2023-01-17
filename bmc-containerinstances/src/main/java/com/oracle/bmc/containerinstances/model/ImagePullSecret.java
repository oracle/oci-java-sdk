/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * The image pull secrets for accessing private registry to pull images for containers
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "secretType",
    defaultImpl = ImagePullSecret.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = VaultImagePullSecret.class,
        name = "VAULT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = BasicImagePullSecret.class,
        name = "BASIC"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ImagePullSecret extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"registryEndpoint"})
    protected ImagePullSecret(String registryEndpoint) {
        super();
        this.registryEndpoint = registryEndpoint;
    }

    /**
     * The registry endpoint of the container image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("registryEndpoint")
    private final String registryEndpoint;

    /**
     * The registry endpoint of the container image.
     * @return the value
     **/
    public String getRegistryEndpoint() {
        return registryEndpoint;
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
        sb.append("ImagePullSecret(");
        sb.append("super=").append(super.toString());
        sb.append("registryEndpoint=").append(String.valueOf(this.registryEndpoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImagePullSecret)) {
            return false;
        }

        ImagePullSecret other = (ImagePullSecret) o;
        return java.util.Objects.equals(this.registryEndpoint, other.registryEndpoint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.registryEndpoint == null ? 43 : this.registryEndpoint.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The type of ImagePullSecret.
     **/
    public enum SecretType {
        Basic("BASIC"),
        Vault("VAULT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SecretType.class);

        private final String value;
        private static java.util.Map<String, SecretType> map;

        static {
            map = new java.util.HashMap<>();
            for (SecretType v : SecretType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SecretType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SecretType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SecretType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}

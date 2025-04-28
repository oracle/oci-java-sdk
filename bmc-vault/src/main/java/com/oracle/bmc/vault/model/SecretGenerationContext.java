/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault.model;

/**
 * Captures a configurable set of secret generation rules such as length, base characters,
 * additional characters, and so on. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "generationType",
        defaultImpl = SecretGenerationContext.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PassphraseGenerationContext.class,
            name = "PASSPHRASE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SshKeyGenerationContext.class,
            name = "SSH_KEY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = BytesGenerationContext.class,
            name = "BYTES")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class SecretGenerationContext
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"secretTemplate"})
    protected SecretGenerationContext(String secretTemplate) {
        super();
        this.secretTemplate = secretTemplate;
    }

    /**
     * SecretTemplate captures structure in which customer wants to store secrets. This is optional
     * and a default structure is available for each secret type. The template can have any
     * structure with static values that are not generated. Within the template, you can insert
     * predefined placeholders to store secrets. These placeholders are later replaced with the
     * generated content and saved as a Base64 encoded content.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretTemplate")
    private final String secretTemplate;

    /**
     * SecretTemplate captures structure in which customer wants to store secrets. This is optional
     * and a default structure is available for each secret type. The template can have any
     * structure with static values that are not generated. Within the template, you can insert
     * predefined placeholders to store secrets. These placeholders are later replaced with the
     * generated content and saved as a Base64 encoded content.
     *
     * @return the value
     */
    public String getSecretTemplate() {
        return secretTemplate;
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
        sb.append("SecretGenerationContext(");
        sb.append("super=").append(super.toString());
        sb.append("secretTemplate=").append(String.valueOf(this.secretTemplate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecretGenerationContext)) {
            return false;
        }

        SecretGenerationContext other = (SecretGenerationContext) o;
        return java.util.Objects.equals(this.secretTemplate, other.secretTemplate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.secretTemplate == null ? 43 : this.secretTemplate.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Name of the predefined secret generation type. */
    public enum GenerationType implements com.oracle.bmc.http.internal.BmcEnum {
        Passphrase("PASSPHRASE"),
        SshKey("SSH_KEY"),
        Bytes("BYTES"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(GenerationType.class);

        private final String value;
        private static java.util.Map<String, GenerationType> map;

        static {
            map = new java.util.HashMap<>();
            for (GenerationType v : GenerationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        GenerationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GenerationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'GenerationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}

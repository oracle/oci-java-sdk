/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault.model;

/**
 * Generates ssh keys. By default, the keys are stored as - {"publicKey": "%GENERATED_PUBLIC_KEY%", "privateKey": "%GENERATED_PRIVATE_KEY%"} in PEM format.
 * The SecretTemplate must have both %GENERATED_PUBLIC_KEY% and %GENERATED_PRIVATE_KEY% keywords which is later replaced with the respective keys, if provided.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SshKeyGenerationContext.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "generationType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SshKeyGenerationContext extends SecretGenerationContext {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("secretTemplate")
        private String secretTemplate;

        public Builder secretTemplate(String secretTemplate) {
            this.secretTemplate = secretTemplate;
            this.__explicitlySet__.add("secretTemplate");
            return this;
        }
        /**
         * Name of SSH key generation template to generate SSH key type secret.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("generationTemplate")
        private GenerationTemplate generationTemplate;

        /**
         * Name of SSH key generation template to generate SSH key type secret.
         * @param generationTemplate the value to set
         * @return this builder
         **/
        public Builder generationTemplate(GenerationTemplate generationTemplate) {
            this.generationTemplate = generationTemplate;
            this.__explicitlySet__.add("generationTemplate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SshKeyGenerationContext build() {
            SshKeyGenerationContext model =
                    new SshKeyGenerationContext(this.secretTemplate, this.generationTemplate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SshKeyGenerationContext model) {
            if (model.wasPropertyExplicitlySet("secretTemplate")) {
                this.secretTemplate(model.getSecretTemplate());
            }
            if (model.wasPropertyExplicitlySet("generationTemplate")) {
                this.generationTemplate(model.getGenerationTemplate());
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

    @Deprecated
    public SshKeyGenerationContext(String secretTemplate, GenerationTemplate generationTemplate) {
        super(secretTemplate);
        this.generationTemplate = generationTemplate;
    }

    /**
     * Name of SSH key generation template to generate SSH key type secret.
     **/
    public enum GenerationTemplate {
        Rsa2048("RSA_2048"),
        Rsa3072("RSA_3072"),
        Rsa4096("RSA_4096"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(GenerationTemplate.class);

        private final String value;
        private static java.util.Map<String, GenerationTemplate> map;

        static {
            map = new java.util.HashMap<>();
            for (GenerationTemplate v : GenerationTemplate.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        GenerationTemplate(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GenerationTemplate create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'GenerationTemplate', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Name of SSH key generation template to generate SSH key type secret.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("generationTemplate")
    private final GenerationTemplate generationTemplate;

    /**
     * Name of SSH key generation template to generate SSH key type secret.
     * @return the value
     **/
    public GenerationTemplate getGenerationTemplate() {
        return generationTemplate;
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
        sb.append("SshKeyGenerationContext(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", generationTemplate=").append(String.valueOf(this.generationTemplate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SshKeyGenerationContext)) {
            return false;
        }

        SshKeyGenerationContext other = (SshKeyGenerationContext) o;
        return java.util.Objects.equals(this.generationTemplate, other.generationTemplate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.generationTemplate == null
                                ? 43
                                : this.generationTemplate.hashCode());
        return result;
    }
}

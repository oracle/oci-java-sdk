/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault.model;

/**
 * Generates Passphrase type secrets. By default, passphrase type secrets have no structure. The
 * generated content is stored in Base64 format. The SecretTemplate must have the
 * %GENERATED_PASSPHRASE% keyword, which is later replaced with the generated content, if provided.
 * <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PassphraseGenerationContext.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "generationType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PassphraseGenerationContext extends SecretGenerationContext {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("secretTemplate")
        private String secretTemplate;

        public Builder secretTemplate(String secretTemplate) {
            this.secretTemplate = secretTemplate;
            this.__explicitlySet__.add("secretTemplate");
            return this;
        }
        /** Name of passphrase generation template to generate passphrase type secret. */
        @com.fasterxml.jackson.annotation.JsonProperty("generationTemplate")
        private GenerationTemplate generationTemplate;

        /**
         * Name of passphrase generation template to generate passphrase type secret.
         *
         * @param generationTemplate the value to set
         * @return this builder
         */
        public Builder generationTemplate(GenerationTemplate generationTemplate) {
            this.generationTemplate = generationTemplate;
            this.__explicitlySet__.add("generationTemplate");
            return this;
        }
        /** Length of the passphrase to be generated */
        @com.fasterxml.jackson.annotation.JsonProperty("passphraseLength")
        private Integer passphraseLength;

        /**
         * Length of the passphrase to be generated
         *
         * @param passphraseLength the value to set
         * @return this builder
         */
        public Builder passphraseLength(Integer passphraseLength) {
            this.passphraseLength = passphraseLength;
            this.__explicitlySet__.add("passphraseLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PassphraseGenerationContext build() {
            PassphraseGenerationContext model =
                    new PassphraseGenerationContext(
                            this.secretTemplate, this.generationTemplate, this.passphraseLength);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PassphraseGenerationContext model) {
            if (model.wasPropertyExplicitlySet("secretTemplate")) {
                this.secretTemplate(model.getSecretTemplate());
            }
            if (model.wasPropertyExplicitlySet("generationTemplate")) {
                this.generationTemplate(model.getGenerationTemplate());
            }
            if (model.wasPropertyExplicitlySet("passphraseLength")) {
                this.passphraseLength(model.getPassphraseLength());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public PassphraseGenerationContext(
            String secretTemplate,
            GenerationTemplate generationTemplate,
            Integer passphraseLength) {
        super(secretTemplate);
        this.generationTemplate = generationTemplate;
        this.passphraseLength = passphraseLength;
    }

    /** Name of passphrase generation template to generate passphrase type secret. */
    public enum GenerationTemplate implements com.oracle.bmc.http.internal.BmcEnum {
        SecretsDefaultPassword("SECRETS_DEFAULT_PASSWORD"),
        DbaasDefaultPassword("DBAAS_DEFAULT_PASSWORD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** Name of passphrase generation template to generate passphrase type secret. */
    @com.fasterxml.jackson.annotation.JsonProperty("generationTemplate")
    private final GenerationTemplate generationTemplate;

    /**
     * Name of passphrase generation template to generate passphrase type secret.
     *
     * @return the value
     */
    public GenerationTemplate getGenerationTemplate() {
        return generationTemplate;
    }

    /** Length of the passphrase to be generated */
    @com.fasterxml.jackson.annotation.JsonProperty("passphraseLength")
    private final Integer passphraseLength;

    /**
     * Length of the passphrase to be generated
     *
     * @return the value
     */
    public Integer getPassphraseLength() {
        return passphraseLength;
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
        sb.append("PassphraseGenerationContext(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", generationTemplate=").append(String.valueOf(this.generationTemplate));
        sb.append(", passphraseLength=").append(String.valueOf(this.passphraseLength));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PassphraseGenerationContext)) {
            return false;
        }

        PassphraseGenerationContext other = (PassphraseGenerationContext) o;
        return java.util.Objects.equals(this.generationTemplate, other.generationTemplate)
                && java.util.Objects.equals(this.passphraseLength, other.passphraseLength)
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
        result =
                (result * PRIME)
                        + (this.passphraseLength == null ? 43 : this.passphraseLength.hashCode());
        return result;
    }
}

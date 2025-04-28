/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The configuration details about whether to apply the guardrail checks to input and output. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GuardrailConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GuardrailConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "contentModerationConfig",
        "promptInjectionConfig",
        "personallyIdentifiableInformationConfig"
    })
    public GuardrailConfig(
            ContentModerationGuardrailConfig contentModerationConfig,
            PromptInjectionGuardrailConfig promptInjectionConfig,
            PersonallyIdentifiableInformationGuardrailConfig
                    personallyIdentifiableInformationConfig) {
        super();
        this.contentModerationConfig = contentModerationConfig;
        this.promptInjectionConfig = promptInjectionConfig;
        this.personallyIdentifiableInformationConfig = personallyIdentifiableInformationConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("contentModerationConfig")
        private ContentModerationGuardrailConfig contentModerationConfig;

        public Builder contentModerationConfig(
                ContentModerationGuardrailConfig contentModerationConfig) {
            this.contentModerationConfig = contentModerationConfig;
            this.__explicitlySet__.add("contentModerationConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("promptInjectionConfig")
        private PromptInjectionGuardrailConfig promptInjectionConfig;

        public Builder promptInjectionConfig(PromptInjectionGuardrailConfig promptInjectionConfig) {
            this.promptInjectionConfig = promptInjectionConfig;
            this.__explicitlySet__.add("promptInjectionConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("personallyIdentifiableInformationConfig")
        private PersonallyIdentifiableInformationGuardrailConfig
                personallyIdentifiableInformationConfig;

        public Builder personallyIdentifiableInformationConfig(
                PersonallyIdentifiableInformationGuardrailConfig
                        personallyIdentifiableInformationConfig) {
            this.personallyIdentifiableInformationConfig = personallyIdentifiableInformationConfig;
            this.__explicitlySet__.add("personallyIdentifiableInformationConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GuardrailConfig build() {
            GuardrailConfig model =
                    new GuardrailConfig(
                            this.contentModerationConfig,
                            this.promptInjectionConfig,
                            this.personallyIdentifiableInformationConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GuardrailConfig model) {
            if (model.wasPropertyExplicitlySet("contentModerationConfig")) {
                this.contentModerationConfig(model.getContentModerationConfig());
            }
            if (model.wasPropertyExplicitlySet("promptInjectionConfig")) {
                this.promptInjectionConfig(model.getPromptInjectionConfig());
            }
            if (model.wasPropertyExplicitlySet("personallyIdentifiableInformationConfig")) {
                this.personallyIdentifiableInformationConfig(
                        model.getPersonallyIdentifiableInformationConfig());
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

    @com.fasterxml.jackson.annotation.JsonProperty("contentModerationConfig")
    private final ContentModerationGuardrailConfig contentModerationConfig;

    public ContentModerationGuardrailConfig getContentModerationConfig() {
        return contentModerationConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("promptInjectionConfig")
    private final PromptInjectionGuardrailConfig promptInjectionConfig;

    public PromptInjectionGuardrailConfig getPromptInjectionConfig() {
        return promptInjectionConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("personallyIdentifiableInformationConfig")
    private final PersonallyIdentifiableInformationGuardrailConfig
            personallyIdentifiableInformationConfig;

    public PersonallyIdentifiableInformationGuardrailConfig
            getPersonallyIdentifiableInformationConfig() {
        return personallyIdentifiableInformationConfig;
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
        sb.append("GuardrailConfig(");
        sb.append("super=").append(super.toString());
        sb.append("contentModerationConfig=").append(String.valueOf(this.contentModerationConfig));
        sb.append(", promptInjectionConfig=").append(String.valueOf(this.promptInjectionConfig));
        sb.append(", personallyIdentifiableInformationConfig=")
                .append(String.valueOf(this.personallyIdentifiableInformationConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GuardrailConfig)) {
            return false;
        }

        GuardrailConfig other = (GuardrailConfig) o;
        return java.util.Objects.equals(this.contentModerationConfig, other.contentModerationConfig)
                && java.util.Objects.equals(this.promptInjectionConfig, other.promptInjectionConfig)
                && java.util.Objects.equals(
                        this.personallyIdentifiableInformationConfig,
                        other.personallyIdentifiableInformationConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.contentModerationConfig == null
                                ? 43
                                : this.contentModerationConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.promptInjectionConfig == null
                                ? 43
                                : this.promptInjectionConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.personallyIdentifiableInformationConfig == null
                                ? 43
                                : this.personallyIdentifiableInformationConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

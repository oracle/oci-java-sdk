/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Additional configuration for each guardrail. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GuardrailConfigs.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GuardrailConfigs
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "contentModerationConfig",
        "personallyIdentifiableInformationConfig",
        "promptInjectionConfig"
    })
    public GuardrailConfigs(
            ContentModerationConfiguration contentModerationConfig,
            PersonallyIdentifiableInformationConfiguration personallyIdentifiableInformationConfig,
            PromptInjectionConfiguration promptInjectionConfig) {
        super();
        this.contentModerationConfig = contentModerationConfig;
        this.personallyIdentifiableInformationConfig = personallyIdentifiableInformationConfig;
        this.promptInjectionConfig = promptInjectionConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("contentModerationConfig")
        private ContentModerationConfiguration contentModerationConfig;

        public Builder contentModerationConfig(
                ContentModerationConfiguration contentModerationConfig) {
            this.contentModerationConfig = contentModerationConfig;
            this.__explicitlySet__.add("contentModerationConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("personallyIdentifiableInformationConfig")
        private PersonallyIdentifiableInformationConfiguration
                personallyIdentifiableInformationConfig;

        public Builder personallyIdentifiableInformationConfig(
                PersonallyIdentifiableInformationConfiguration
                        personallyIdentifiableInformationConfig) {
            this.personallyIdentifiableInformationConfig = personallyIdentifiableInformationConfig;
            this.__explicitlySet__.add("personallyIdentifiableInformationConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("promptInjectionConfig")
        private PromptInjectionConfiguration promptInjectionConfig;

        public Builder promptInjectionConfig(PromptInjectionConfiguration promptInjectionConfig) {
            this.promptInjectionConfig = promptInjectionConfig;
            this.__explicitlySet__.add("promptInjectionConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GuardrailConfigs build() {
            GuardrailConfigs model =
                    new GuardrailConfigs(
                            this.contentModerationConfig,
                            this.personallyIdentifiableInformationConfig,
                            this.promptInjectionConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GuardrailConfigs model) {
            if (model.wasPropertyExplicitlySet("contentModerationConfig")) {
                this.contentModerationConfig(model.getContentModerationConfig());
            }
            if (model.wasPropertyExplicitlySet("personallyIdentifiableInformationConfig")) {
                this.personallyIdentifiableInformationConfig(
                        model.getPersonallyIdentifiableInformationConfig());
            }
            if (model.wasPropertyExplicitlySet("promptInjectionConfig")) {
                this.promptInjectionConfig(model.getPromptInjectionConfig());
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
    private final ContentModerationConfiguration contentModerationConfig;

    public ContentModerationConfiguration getContentModerationConfig() {
        return contentModerationConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("personallyIdentifiableInformationConfig")
    private final PersonallyIdentifiableInformationConfiguration
            personallyIdentifiableInformationConfig;

    public PersonallyIdentifiableInformationConfiguration
            getPersonallyIdentifiableInformationConfig() {
        return personallyIdentifiableInformationConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("promptInjectionConfig")
    private final PromptInjectionConfiguration promptInjectionConfig;

    public PromptInjectionConfiguration getPromptInjectionConfig() {
        return promptInjectionConfig;
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
        sb.append("GuardrailConfigs(");
        sb.append("super=").append(super.toString());
        sb.append("contentModerationConfig=").append(String.valueOf(this.contentModerationConfig));
        sb.append(", personallyIdentifiableInformationConfig=")
                .append(String.valueOf(this.personallyIdentifiableInformationConfig));
        sb.append(", promptInjectionConfig=").append(String.valueOf(this.promptInjectionConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GuardrailConfigs)) {
            return false;
        }

        GuardrailConfigs other = (GuardrailConfigs) o;
        return java.util.Objects.equals(this.contentModerationConfig, other.contentModerationConfig)
                && java.util.Objects.equals(
                        this.personallyIdentifiableInformationConfig,
                        other.personallyIdentifiableInformationConfig)
                && java.util.Objects.equals(this.promptInjectionConfig, other.promptInjectionConfig)
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
                        + (this.personallyIdentifiableInformationConfig == null
                                ? 43
                                : this.personallyIdentifiableInformationConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.promptInjectionConfig == null
                                ? 43
                                : this.promptInjectionConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

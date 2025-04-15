/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * The results of applying each guardrail. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GuardrailsResults.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GuardrailsResults
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "contentModeration",
        "personallyIdentifiableInformation",
        "promptInjection"
    })
    public GuardrailsResults(
            ContentModerationResult contentModeration,
            java.util.List<PersonallyIdentifiableInformationResult>
                    personallyIdentifiableInformation,
            PromptInjectionProtectionResult promptInjection) {
        super();
        this.contentModeration = contentModeration;
        this.personallyIdentifiableInformation = personallyIdentifiableInformation;
        this.promptInjection = promptInjection;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("contentModeration")
        private ContentModerationResult contentModeration;

        public Builder contentModeration(ContentModerationResult contentModeration) {
            this.contentModeration = contentModeration;
            this.__explicitlySet__.add("contentModeration");
            return this;
        }
        /** The result of PII detection */
        @com.fasterxml.jackson.annotation.JsonProperty("personallyIdentifiableInformation")
        private java.util.List<PersonallyIdentifiableInformationResult>
                personallyIdentifiableInformation;

        /**
         * The result of PII detection
         *
         * @param personallyIdentifiableInformation the value to set
         * @return this builder
         */
        public Builder personallyIdentifiableInformation(
                java.util.List<PersonallyIdentifiableInformationResult>
                        personallyIdentifiableInformation) {
            this.personallyIdentifiableInformation = personallyIdentifiableInformation;
            this.__explicitlySet__.add("personallyIdentifiableInformation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("promptInjection")
        private PromptInjectionProtectionResult promptInjection;

        public Builder promptInjection(PromptInjectionProtectionResult promptInjection) {
            this.promptInjection = promptInjection;
            this.__explicitlySet__.add("promptInjection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GuardrailsResults build() {
            GuardrailsResults model =
                    new GuardrailsResults(
                            this.contentModeration,
                            this.personallyIdentifiableInformation,
                            this.promptInjection);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GuardrailsResults model) {
            if (model.wasPropertyExplicitlySet("contentModeration")) {
                this.contentModeration(model.getContentModeration());
            }
            if (model.wasPropertyExplicitlySet("personallyIdentifiableInformation")) {
                this.personallyIdentifiableInformation(
                        model.getPersonallyIdentifiableInformation());
            }
            if (model.wasPropertyExplicitlySet("promptInjection")) {
                this.promptInjection(model.getPromptInjection());
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

    @com.fasterxml.jackson.annotation.JsonProperty("contentModeration")
    private final ContentModerationResult contentModeration;

    public ContentModerationResult getContentModeration() {
        return contentModeration;
    }

    /** The result of PII detection */
    @com.fasterxml.jackson.annotation.JsonProperty("personallyIdentifiableInformation")
    private final java.util.List<PersonallyIdentifiableInformationResult>
            personallyIdentifiableInformation;

    /**
     * The result of PII detection
     *
     * @return the value
     */
    public java.util.List<PersonallyIdentifiableInformationResult>
            getPersonallyIdentifiableInformation() {
        return personallyIdentifiableInformation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("promptInjection")
    private final PromptInjectionProtectionResult promptInjection;

    public PromptInjectionProtectionResult getPromptInjection() {
        return promptInjection;
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
        sb.append("GuardrailsResults(");
        sb.append("super=").append(super.toString());
        sb.append("contentModeration=").append(String.valueOf(this.contentModeration));
        sb.append(", personallyIdentifiableInformation=")
                .append(String.valueOf(this.personallyIdentifiableInformation));
        sb.append(", promptInjection=").append(String.valueOf(this.promptInjection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GuardrailsResults)) {
            return false;
        }

        GuardrailsResults other = (GuardrailsResults) o;
        return java.util.Objects.equals(this.contentModeration, other.contentModeration)
                && java.util.Objects.equals(
                        this.personallyIdentifiableInformation,
                        other.personallyIdentifiableInformation)
                && java.util.Objects.equals(this.promptInjection, other.promptInjection)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.contentModeration == null ? 43 : this.contentModeration.hashCode());
        result =
                (result * PRIME)
                        + (this.personallyIdentifiableInformation == null
                                ? 43
                                : this.personallyIdentifiableInformation.hashCode());
        result =
                (result * PRIME)
                        + (this.promptInjection == null ? 43 : this.promptInjection.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * The response for a chat conversation. <br>
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
        builder = GenericChatResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "apiFormat")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GenericChatResponse extends BaseChatResponse {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Unix timestamp (in seconds) of when the response text was generated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The Unix timestamp (in seconds) of when the response text was generated.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** A list of generated texts. Can be more than one if n is greater than 1. */
        @com.fasterxml.jackson.annotation.JsonProperty("choices")
        private java.util.List<ChatChoice> choices;

        /**
         * A list of generated texts. Can be more than one if n is greater than 1.
         *
         * @param choices the value to set
         * @return this builder
         */
        public Builder choices(java.util.List<ChatChoice> choices) {
            this.choices = choices;
            this.__explicitlySet__.add("choices");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private Usage usage;

        public Builder usage(Usage usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }
        /** Specifies the processing type used for serving the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceTier")
        private String serviceTier;

        /**
         * Specifies the processing type used for serving the request.
         *
         * @param serviceTier the value to set
         * @return this builder
         */
        public Builder serviceTier(String serviceTier) {
            this.serviceTier = serviceTier;
            this.__explicitlySet__.add("serviceTier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenericChatResponse build() {
            GenericChatResponse model =
                    new GenericChatResponse(
                            this.timeCreated, this.choices, this.usage, this.serviceTier);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenericChatResponse model) {
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("choices")) {
                this.choices(model.getChoices());
            }
            if (model.wasPropertyExplicitlySet("usage")) {
                this.usage(model.getUsage());
            }
            if (model.wasPropertyExplicitlySet("serviceTier")) {
                this.serviceTier(model.getServiceTier());
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
    public GenericChatResponse(
            java.util.Date timeCreated,
            java.util.List<ChatChoice> choices,
            Usage usage,
            String serviceTier) {
        super();
        this.timeCreated = timeCreated;
        this.choices = choices;
        this.usage = usage;
        this.serviceTier = serviceTier;
    }

    /** The Unix timestamp (in seconds) of when the response text was generated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The Unix timestamp (in seconds) of when the response text was generated.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** A list of generated texts. Can be more than one if n is greater than 1. */
    @com.fasterxml.jackson.annotation.JsonProperty("choices")
    private final java.util.List<ChatChoice> choices;

    /**
     * A list of generated texts. Can be more than one if n is greater than 1.
     *
     * @return the value
     */
    public java.util.List<ChatChoice> getChoices() {
        return choices;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    private final Usage usage;

    public Usage getUsage() {
        return usage;
    }

    /** Specifies the processing type used for serving the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceTier")
    private final String serviceTier;

    /**
     * Specifies the processing type used for serving the request.
     *
     * @return the value
     */
    public String getServiceTier() {
        return serviceTier;
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
        sb.append("GenericChatResponse(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", choices=").append(String.valueOf(this.choices));
        sb.append(", usage=").append(String.valueOf(this.usage));
        sb.append(", serviceTier=").append(String.valueOf(this.serviceTier));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenericChatResponse)) {
            return false;
        }

        GenericChatResponse other = (GenericChatResponse) o;
        return java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.choices, other.choices)
                && java.util.Objects.equals(this.usage, other.usage)
                && java.util.Objects.equals(this.serviceTier, other.serviceTier)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.choices == null ? 43 : this.choices.hashCode());
        result = (result * PRIME) + (this.usage == null ? 43 : this.usage.hashCode());
        result = (result * PRIME) + (this.serviceTier == null ? 43 : this.serviceTier.hashCode());
        return result;
    }
}

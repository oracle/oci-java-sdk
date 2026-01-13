/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The configuration details about whether to apply the content moderation feature to input and
 * output. Content moderation removes toxic and biased content from responses. It is recommended to
 * use content moderation. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ContentModerationConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ContentModerationConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"shouldEnableOnInput", "shouldEnableOnOutput"})
    public ContentModerationConfig(Boolean shouldEnableOnInput, Boolean shouldEnableOnOutput) {
        super();
        this.shouldEnableOnInput = shouldEnableOnInput;
        this.shouldEnableOnOutput = shouldEnableOnOutput;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A flag to enable or disable content moderation on input. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableOnInput")
        private Boolean shouldEnableOnInput;

        /**
         * A flag to enable or disable content moderation on input.
         *
         * @param shouldEnableOnInput the value to set
         * @return this builder
         */
        public Builder shouldEnableOnInput(Boolean shouldEnableOnInput) {
            this.shouldEnableOnInput = shouldEnableOnInput;
            this.__explicitlySet__.add("shouldEnableOnInput");
            return this;
        }
        /** A flag to enable or disable content moderation on output. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableOnOutput")
        private Boolean shouldEnableOnOutput;

        /**
         * A flag to enable or disable content moderation on output.
         *
         * @param shouldEnableOnOutput the value to set
         * @return this builder
         */
        public Builder shouldEnableOnOutput(Boolean shouldEnableOnOutput) {
            this.shouldEnableOnOutput = shouldEnableOnOutput;
            this.__explicitlySet__.add("shouldEnableOnOutput");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContentModerationConfig build() {
            ContentModerationConfig model =
                    new ContentModerationConfig(
                            this.shouldEnableOnInput, this.shouldEnableOnOutput);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContentModerationConfig model) {
            if (model.wasPropertyExplicitlySet("shouldEnableOnInput")) {
                this.shouldEnableOnInput(model.getShouldEnableOnInput());
            }
            if (model.wasPropertyExplicitlySet("shouldEnableOnOutput")) {
                this.shouldEnableOnOutput(model.getShouldEnableOnOutput());
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

    /** A flag to enable or disable content moderation on input. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableOnInput")
    private final Boolean shouldEnableOnInput;

    /**
     * A flag to enable or disable content moderation on input.
     *
     * @return the value
     */
    public Boolean getShouldEnableOnInput() {
        return shouldEnableOnInput;
    }

    /** A flag to enable or disable content moderation on output. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableOnOutput")
    private final Boolean shouldEnableOnOutput;

    /**
     * A flag to enable or disable content moderation on output.
     *
     * @return the value
     */
    public Boolean getShouldEnableOnOutput() {
        return shouldEnableOnOutput;
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
        sb.append("ContentModerationConfig(");
        sb.append("super=").append(super.toString());
        sb.append("shouldEnableOnInput=").append(String.valueOf(this.shouldEnableOnInput));
        sb.append(", shouldEnableOnOutput=").append(String.valueOf(this.shouldEnableOnOutput));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContentModerationConfig)) {
            return false;
        }

        ContentModerationConfig other = (ContentModerationConfig) o;
        return java.util.Objects.equals(this.shouldEnableOnInput, other.shouldEnableOnInput)
                && java.util.Objects.equals(this.shouldEnableOnOutput, other.shouldEnableOnOutput)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.shouldEnableOnInput == null
                                ? 43
                                : this.shouldEnableOnInput.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldEnableOnOutput == null
                                ? 43
                                : this.shouldEnableOnOutput.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

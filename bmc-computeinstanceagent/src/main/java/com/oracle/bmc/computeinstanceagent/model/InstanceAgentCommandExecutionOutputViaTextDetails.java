/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.model;

/**
 * The execution output from a command when returned in plain text. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstanceAgentCommandExecutionOutputViaTextDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "outputType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class InstanceAgentCommandExecutionOutputViaTextDetails
        extends InstanceAgentCommandExecutionOutputContent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("exitCode")
        private Integer exitCode;

        public Builder exitCode(Integer exitCode) {
            this.exitCode = exitCode;
            this.__explicitlySet__.add("exitCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** The command output. */
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * The command output.
         *
         * @param text the value to set
         * @return this builder
         */
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /** SHA-256 checksum value of the text content. */
        @com.fasterxml.jackson.annotation.JsonProperty("textSha256")
        private String textSha256;

        /**
         * SHA-256 checksum value of the text content.
         *
         * @param textSha256 the value to set
         * @return this builder
         */
        public Builder textSha256(String textSha256) {
            this.textSha256 = textSha256;
            this.__explicitlySet__.add("textSha256");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceAgentCommandExecutionOutputViaTextDetails build() {
            InstanceAgentCommandExecutionOutputViaTextDetails model =
                    new InstanceAgentCommandExecutionOutputViaTextDetails(
                            this.exitCode, this.message, this.text, this.textSha256);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceAgentCommandExecutionOutputViaTextDetails model) {
            if (model.wasPropertyExplicitlySet("exitCode")) {
                this.exitCode(model.getExitCode());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("textSha256")) {
                this.textSha256(model.getTextSha256());
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
    public InstanceAgentCommandExecutionOutputViaTextDetails(
            Integer exitCode, String message, String text, String textSha256) {
        super(exitCode, message);
        this.text = text;
        this.textSha256 = textSha256;
    }

    /** The command output. */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * The command output.
     *
     * @return the value
     */
    public String getText() {
        return text;
    }

    /** SHA-256 checksum value of the text content. */
    @com.fasterxml.jackson.annotation.JsonProperty("textSha256")
    private final String textSha256;

    /**
     * SHA-256 checksum value of the text content.
     *
     * @return the value
     */
    public String getTextSha256() {
        return textSha256;
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
        sb.append("InstanceAgentCommandExecutionOutputViaTextDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", text=").append(String.valueOf(this.text));
        sb.append(", textSha256=").append(String.valueOf(this.textSha256));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceAgentCommandExecutionOutputViaTextDetails)) {
            return false;
        }

        InstanceAgentCommandExecutionOutputViaTextDetails other =
                (InstanceAgentCommandExecutionOutputViaTextDetails) o;
        return java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.textSha256, other.textSha256)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.textSha256 == null ? 43 : this.textSha256.hashCode());
        return result;
    }
}

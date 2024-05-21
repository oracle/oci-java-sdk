/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.model;

/**
 * The source of the command when provided using plain text.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstanceAgentCommandSourceViaTextDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InstanceAgentCommandSourceViaTextDetails
        extends InstanceAgentCommandSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The plain text command.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * The plain text command.
         * @param text the value to set
         * @return this builder
         **/
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /**
         * SHA-256 checksum value of the text content.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("textSha256")
        private String textSha256;

        /**
         * SHA-256 checksum value of the text content.
         * @param textSha256 the value to set
         * @return this builder
         **/
        public Builder textSha256(String textSha256) {
            this.textSha256 = textSha256;
            this.__explicitlySet__.add("textSha256");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceAgentCommandSourceViaTextDetails build() {
            InstanceAgentCommandSourceViaTextDetails model =
                    new InstanceAgentCommandSourceViaTextDetails(this.text, this.textSha256);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceAgentCommandSourceViaTextDetails model) {
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("textSha256")) {
                this.textSha256(model.getTextSha256());
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
    public InstanceAgentCommandSourceViaTextDetails(String text, String textSha256) {
        super();
        this.text = text;
        this.textSha256 = textSha256;
    }

    /**
     * The plain text command.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * The plain text command.
     * @return the value
     **/
    public String getText() {
        return text;
    }

    /**
     * SHA-256 checksum value of the text content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("textSha256")
    private final String textSha256;

    /**
     * SHA-256 checksum value of the text content.
     * @return the value
     **/
    public String getTextSha256() {
        return textSha256;
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
        sb.append("InstanceAgentCommandSourceViaTextDetails(");
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
        if (!(o instanceof InstanceAgentCommandSourceViaTextDetails)) {
            return false;
        }

        InstanceAgentCommandSourceViaTextDetails other =
                (InstanceAgentCommandSourceViaTextDetails) o;
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

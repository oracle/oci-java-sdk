/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplaceprivateoffer.model;

/**
 * The details for creating a new offer quote attachment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateQuoteAttachmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateQuoteAttachmentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"fileBase64Encoded", "displayName", "type", "recipient"})
    public CreateQuoteAttachmentDetails(
            byte[] fileBase64Encoded,
            String displayName,
            QuoteAttachment.Type type,
            QuoteAttachment.Recipient recipient) {
        super();
        this.fileBase64Encoded = fileBase64Encoded;
        this.displayName = displayName;
        this.type = type;
        this.recipient = recipient;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Base64-encoded file to attach to the offer quote. */
        @com.fasterxml.jackson.annotation.JsonProperty("fileBase64Encoded")
        private byte[] fileBase64Encoded;

        /**
         * Base64-encoded file to attach to the offer quote.
         *
         * @param fileBase64Encoded the value to set
         * @return this builder
         */
        public Builder fileBase64Encoded(byte[] fileBase64Encoded) {
            this.fileBase64Encoded = fileBase64Encoded;
            this.__explicitlySet__.add("fileBase64Encoded");
            return this;
        }
        /** The name used to refer to the uploaded data. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name used to refer to the uploaded data.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The type of offer quote attachment. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private QuoteAttachment.Type type;

        /**
         * The type of offer quote attachment.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(QuoteAttachment.Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The recipient of the offer quote attachment. */
        @com.fasterxml.jackson.annotation.JsonProperty("recipient")
        private QuoteAttachment.Recipient recipient;

        /**
         * The recipient of the offer quote attachment.
         *
         * @param recipient the value to set
         * @return this builder
         */
        public Builder recipient(QuoteAttachment.Recipient recipient) {
            this.recipient = recipient;
            this.__explicitlySet__.add("recipient");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateQuoteAttachmentDetails build() {
            CreateQuoteAttachmentDetails model =
                    new CreateQuoteAttachmentDetails(
                            this.fileBase64Encoded, this.displayName, this.type, this.recipient);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateQuoteAttachmentDetails model) {
            if (model.wasPropertyExplicitlySet("fileBase64Encoded")) {
                this.fileBase64Encoded(model.getFileBase64Encoded());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("recipient")) {
                this.recipient(model.getRecipient());
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

    /** Base64-encoded file to attach to the offer quote. */
    @com.fasterxml.jackson.annotation.JsonProperty("fileBase64Encoded")
    private final byte[] fileBase64Encoded;

    /**
     * Base64-encoded file to attach to the offer quote.
     *
     * @return the value
     */
    public byte[] getFileBase64Encoded() {
        return fileBase64Encoded;
    }

    /** The name used to refer to the uploaded data. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name used to refer to the uploaded data.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The type of offer quote attachment. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final QuoteAttachment.Type type;

    /**
     * The type of offer quote attachment.
     *
     * @return the value
     */
    public QuoteAttachment.Type getType() {
        return type;
    }

    /** The recipient of the offer quote attachment. */
    @com.fasterxml.jackson.annotation.JsonProperty("recipient")
    private final QuoteAttachment.Recipient recipient;

    /**
     * The recipient of the offer quote attachment.
     *
     * @return the value
     */
    public QuoteAttachment.Recipient getRecipient() {
        return recipient;
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
        sb.append("CreateQuoteAttachmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("fileBase64Encoded=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.fileBase64Encoded)
                                : (String.valueOf(this.fileBase64Encoded)
                                        + (this.fileBase64Encoded != null
                                                ? " (byte[" + this.fileBase64Encoded.length + "])"
                                                : ""))));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", recipient=").append(String.valueOf(this.recipient));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateQuoteAttachmentDetails)) {
            return false;
        }

        CreateQuoteAttachmentDetails other = (CreateQuoteAttachmentDetails) o;
        return java.util.Arrays.equals(this.fileBase64Encoded, other.fileBase64Encoded)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.recipient, other.recipient)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + java.util.Arrays.hashCode(this.fileBase64Encoded);
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.recipient == null ? 43 : this.recipient.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

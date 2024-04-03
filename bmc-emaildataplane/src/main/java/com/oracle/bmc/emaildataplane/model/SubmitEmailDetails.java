/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.emaildataplane.model;

/**
 * Details that are required by the sender to submit a request to send email. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220926")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SubmitEmailDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SubmitEmailDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "messageId",
        "sender",
        "recipients",
        "subject",
        "bodyHtml",
        "bodyText",
        "replyTo",
        "headerFields"
    })
    public SubmitEmailDetails(
            String messageId,
            Sender sender,
            Recipients recipients,
            String subject,
            String bodyHtml,
            String bodyText,
            java.util.List<EmailAddress> replyTo,
            java.util.Map<String, String> headerFields) {
        super();
        this.messageId = messageId;
        this.sender = sender;
        this.recipients = recipients;
        this.subject = subject;
        this.bodyHtml = bodyHtml;
        this.bodyText = bodyText;
        this.replyTo = replyTo;
        this.headerFields = headerFields;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique ID for the email's Message-ID header used for service log correlation. The
         * submission will return an error if the syntax is not a valid [RFC
         * 5322](https://www.rfc-editor.org/rfc/rfc5322) Message-ID. This will be generated if not
         * provided. Example: sdiofu234qwermls24fd@mail.example.com
         */
        @com.fasterxml.jackson.annotation.JsonProperty("messageId")
        private String messageId;

        /**
         * The unique ID for the email's Message-ID header used for service log correlation. The
         * submission will return an error if the syntax is not a valid [RFC
         * 5322](https://www.rfc-editor.org/rfc/rfc5322) Message-ID. This will be generated if not
         * provided. Example: sdiofu234qwermls24fd@mail.example.com
         *
         * @param messageId the value to set
         * @return this builder
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            this.__explicitlySet__.add("messageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sender")
        private Sender sender;

        public Builder sender(Sender sender) {
            this.sender = sender;
            this.__explicitlySet__.add("sender");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recipients")
        private Recipients recipients;

        public Builder recipients(Recipients recipients) {
            this.recipients = recipients;
            this.__explicitlySet__.add("recipients");
            return this;
        }
        /**
         * A short summary of the content, which will appear in the recipient's inbox. UTF-8
         * supported [RFC 2047](https://www.rfc-editor.org/rfc/rfc2047).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subject")
        private String subject;

        /**
         * A short summary of the content, which will appear in the recipient's inbox. UTF-8
         * supported [RFC 2047](https://www.rfc-editor.org/rfc/rfc2047).
         *
         * @param subject the value to set
         * @return this builder
         */
        public Builder subject(String subject) {
            this.subject = subject;
            this.__explicitlySet__.add("subject");
            return this;
        }
        /**
         * HTML body content in UTF-8. NOTE: Even though bodytext and bodyhtml are both optional, at
         * least one of them must be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bodyHtml")
        private String bodyHtml;

        /**
         * HTML body content in UTF-8. NOTE: Even though bodytext and bodyhtml are both optional, at
         * least one of them must be provided.
         *
         * @param bodyHtml the value to set
         * @return this builder
         */
        public Builder bodyHtml(String bodyHtml) {
            this.bodyHtml = bodyHtml;
            this.__explicitlySet__.add("bodyHtml");
            return this;
        }
        /**
         * Text body content. NOTE: Even though bodytext and bodyhtml are both optional, at least
         * one of them must be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bodyText")
        private String bodyText;

        /**
         * Text body content. NOTE: Even though bodytext and bodyhtml are both optional, at least
         * one of them must be provided.
         *
         * @param bodyText the value to set
         * @return this builder
         */
        public Builder bodyText(String bodyText) {
            this.bodyText = bodyText;
            this.__explicitlySet__.add("bodyText");
            return this;
        }
        /**
         * The email address for the recipient to reply to. If left blank, defaults to the sender
         * address.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replyTo")
        private java.util.List<EmailAddress> replyTo;

        /**
         * The email address for the recipient to reply to. If left blank, defaults to the sender
         * address.
         *
         * @param replyTo the value to set
         * @return this builder
         */
        public Builder replyTo(java.util.List<EmailAddress> replyTo) {
            this.replyTo = replyTo;
            this.__explicitlySet__.add("replyTo");
            return this;
        }
        /**
         * The header used by the customer for the email sent. Reserved headers are not allowed e.g
         * "subject", "from", and "to" etc. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("headerFields")
        private java.util.Map<String, String> headerFields;

        /**
         * The header used by the customer for the email sent. Reserved headers are not allowed e.g
         * "subject", "from", and "to" etc. Example: {@code {"bar-key": "value"}}
         *
         * @param headerFields the value to set
         * @return this builder
         */
        public Builder headerFields(java.util.Map<String, String> headerFields) {
            this.headerFields = headerFields;
            this.__explicitlySet__.add("headerFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubmitEmailDetails build() {
            SubmitEmailDetails model =
                    new SubmitEmailDetails(
                            this.messageId,
                            this.sender,
                            this.recipients,
                            this.subject,
                            this.bodyHtml,
                            this.bodyText,
                            this.replyTo,
                            this.headerFields);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubmitEmailDetails model) {
            if (model.wasPropertyExplicitlySet("messageId")) {
                this.messageId(model.getMessageId());
            }
            if (model.wasPropertyExplicitlySet("sender")) {
                this.sender(model.getSender());
            }
            if (model.wasPropertyExplicitlySet("recipients")) {
                this.recipients(model.getRecipients());
            }
            if (model.wasPropertyExplicitlySet("subject")) {
                this.subject(model.getSubject());
            }
            if (model.wasPropertyExplicitlySet("bodyHtml")) {
                this.bodyHtml(model.getBodyHtml());
            }
            if (model.wasPropertyExplicitlySet("bodyText")) {
                this.bodyText(model.getBodyText());
            }
            if (model.wasPropertyExplicitlySet("replyTo")) {
                this.replyTo(model.getReplyTo());
            }
            if (model.wasPropertyExplicitlySet("headerFields")) {
                this.headerFields(model.getHeaderFields());
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

    /**
     * The unique ID for the email's Message-ID header used for service log correlation. The
     * submission will return an error if the syntax is not a valid [RFC
     * 5322](https://www.rfc-editor.org/rfc/rfc5322) Message-ID. This will be generated if not
     * provided. Example: sdiofu234qwermls24fd@mail.example.com
     */
    @com.fasterxml.jackson.annotation.JsonProperty("messageId")
    private final String messageId;

    /**
     * The unique ID for the email's Message-ID header used for service log correlation. The
     * submission will return an error if the syntax is not a valid [RFC
     * 5322](https://www.rfc-editor.org/rfc/rfc5322) Message-ID. This will be generated if not
     * provided. Example: sdiofu234qwermls24fd@mail.example.com
     *
     * @return the value
     */
    public String getMessageId() {
        return messageId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sender")
    private final Sender sender;

    public Sender getSender() {
        return sender;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("recipients")
    private final Recipients recipients;

    public Recipients getRecipients() {
        return recipients;
    }

    /**
     * A short summary of the content, which will appear in the recipient's inbox. UTF-8 supported
     * [RFC 2047](https://www.rfc-editor.org/rfc/rfc2047).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    private final String subject;

    /**
     * A short summary of the content, which will appear in the recipient's inbox. UTF-8 supported
     * [RFC 2047](https://www.rfc-editor.org/rfc/rfc2047).
     *
     * @return the value
     */
    public String getSubject() {
        return subject;
    }

    /**
     * HTML body content in UTF-8. NOTE: Even though bodytext and bodyhtml are both optional, at
     * least one of them must be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bodyHtml")
    private final String bodyHtml;

    /**
     * HTML body content in UTF-8. NOTE: Even though bodytext and bodyhtml are both optional, at
     * least one of them must be provided.
     *
     * @return the value
     */
    public String getBodyHtml() {
        return bodyHtml;
    }

    /**
     * Text body content. NOTE: Even though bodytext and bodyhtml are both optional, at least one of
     * them must be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bodyText")
    private final String bodyText;

    /**
     * Text body content. NOTE: Even though bodytext and bodyhtml are both optional, at least one of
     * them must be provided.
     *
     * @return the value
     */
    public String getBodyText() {
        return bodyText;
    }

    /**
     * The email address for the recipient to reply to. If left blank, defaults to the sender
     * address.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replyTo")
    private final java.util.List<EmailAddress> replyTo;

    /**
     * The email address for the recipient to reply to. If left blank, defaults to the sender
     * address.
     *
     * @return the value
     */
    public java.util.List<EmailAddress> getReplyTo() {
        return replyTo;
    }

    /**
     * The header used by the customer for the email sent. Reserved headers are not allowed e.g
     * "subject", "from", and "to" etc. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("headerFields")
    private final java.util.Map<String, String> headerFields;

    /**
     * The header used by the customer for the email sent. Reserved headers are not allowed e.g
     * "subject", "from", and "to" etc. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getHeaderFields() {
        return headerFields;
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
        sb.append("SubmitEmailDetails(");
        sb.append("super=").append(super.toString());
        sb.append("messageId=").append(String.valueOf(this.messageId));
        sb.append(", sender=").append(String.valueOf(this.sender));
        sb.append(", recipients=").append(String.valueOf(this.recipients));
        sb.append(", subject=").append(String.valueOf(this.subject));
        sb.append(", bodyHtml=").append(String.valueOf(this.bodyHtml));
        sb.append(", bodyText=").append(String.valueOf(this.bodyText));
        sb.append(", replyTo=").append(String.valueOf(this.replyTo));
        sb.append(", headerFields=").append(String.valueOf(this.headerFields));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubmitEmailDetails)) {
            return false;
        }

        SubmitEmailDetails other = (SubmitEmailDetails) o;
        return java.util.Objects.equals(this.messageId, other.messageId)
                && java.util.Objects.equals(this.sender, other.sender)
                && java.util.Objects.equals(this.recipients, other.recipients)
                && java.util.Objects.equals(this.subject, other.subject)
                && java.util.Objects.equals(this.bodyHtml, other.bodyHtml)
                && java.util.Objects.equals(this.bodyText, other.bodyText)
                && java.util.Objects.equals(this.replyTo, other.replyTo)
                && java.util.Objects.equals(this.headerFields, other.headerFields)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.messageId == null ? 43 : this.messageId.hashCode());
        result = (result * PRIME) + (this.sender == null ? 43 : this.sender.hashCode());
        result = (result * PRIME) + (this.recipients == null ? 43 : this.recipients.hashCode());
        result = (result * PRIME) + (this.subject == null ? 43 : this.subject.hashCode());
        result = (result * PRIME) + (this.bodyHtml == null ? 43 : this.bodyHtml.hashCode());
        result = (result * PRIME) + (this.bodyText == null ? 43 : this.bodyText.hashCode());
        result = (result * PRIME) + (this.replyTo == null ? 43 : this.replyTo.hashCode());
        result = (result * PRIME) + (this.headerFields == null ? 43 : this.headerFields.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

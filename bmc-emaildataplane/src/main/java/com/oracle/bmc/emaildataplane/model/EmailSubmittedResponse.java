/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.emaildataplane.model;

/**
 * Response object that is returned to sender upon successfully submitting the email request. <br>
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
        builder = EmailSubmittedResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EmailSubmittedResponse
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"messageId", "envelopeId", "suppressedRecipients"})
    public EmailSubmittedResponse(
            String messageId,
            String envelopeId,
            java.util.List<EmailAddress> suppressedRecipients) {
        super();
        this.messageId = messageId;
        this.envelopeId = envelopeId;
        this.suppressedRecipients = suppressedRecipients;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique ID for the email's Message-ID header used for service log correlation.
         * Example: sdiofu234qwermls24fd@mail.example.com
         */
        @com.fasterxml.jackson.annotation.JsonProperty("messageId")
        private String messageId;

        /**
         * The unique ID for the email's Message-ID header used for service log correlation.
         * Example: sdiofu234qwermls24fd@mail.example.com
         *
         * @param messageId the value to set
         * @return this builder
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            this.__explicitlySet__.add("messageId");
            return this;
        }
        /**
         * Email Delivery generated unique Envelope ID of the email submission. If you need to
         * contact Email Delivery about a particular request, please provide the Envelope ID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("envelopeId")
        private String envelopeId;

        /**
         * Email Delivery generated unique Envelope ID of the email submission. If you need to
         * contact Email Delivery about a particular request, please provide the Envelope ID.
         *
         * @param envelopeId the value to set
         * @return this builder
         */
        public Builder envelopeId(String envelopeId) {
            this.envelopeId = envelopeId;
            this.__explicitlySet__.add("envelopeId");
            return this;
        }
        /** Return list of suppressed email addresses. */
        @com.fasterxml.jackson.annotation.JsonProperty("suppressedRecipients")
        private java.util.List<EmailAddress> suppressedRecipients;

        /**
         * Return list of suppressed email addresses.
         *
         * @param suppressedRecipients the value to set
         * @return this builder
         */
        public Builder suppressedRecipients(java.util.List<EmailAddress> suppressedRecipients) {
            this.suppressedRecipients = suppressedRecipients;
            this.__explicitlySet__.add("suppressedRecipients");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmailSubmittedResponse build() {
            EmailSubmittedResponse model =
                    new EmailSubmittedResponse(
                            this.messageId, this.envelopeId, this.suppressedRecipients);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmailSubmittedResponse model) {
            if (model.wasPropertyExplicitlySet("messageId")) {
                this.messageId(model.getMessageId());
            }
            if (model.wasPropertyExplicitlySet("envelopeId")) {
                this.envelopeId(model.getEnvelopeId());
            }
            if (model.wasPropertyExplicitlySet("suppressedRecipients")) {
                this.suppressedRecipients(model.getSuppressedRecipients());
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
     * The unique ID for the email's Message-ID header used for service log correlation. Example:
     * sdiofu234qwermls24fd@mail.example.com
     */
    @com.fasterxml.jackson.annotation.JsonProperty("messageId")
    private final String messageId;

    /**
     * The unique ID for the email's Message-ID header used for service log correlation. Example:
     * sdiofu234qwermls24fd@mail.example.com
     *
     * @return the value
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Email Delivery generated unique Envelope ID of the email submission. If you need to contact
     * Email Delivery about a particular request, please provide the Envelope ID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("envelopeId")
    private final String envelopeId;

    /**
     * Email Delivery generated unique Envelope ID of the email submission. If you need to contact
     * Email Delivery about a particular request, please provide the Envelope ID.
     *
     * @return the value
     */
    public String getEnvelopeId() {
        return envelopeId;
    }

    /** Return list of suppressed email addresses. */
    @com.fasterxml.jackson.annotation.JsonProperty("suppressedRecipients")
    private final java.util.List<EmailAddress> suppressedRecipients;

    /**
     * Return list of suppressed email addresses.
     *
     * @return the value
     */
    public java.util.List<EmailAddress> getSuppressedRecipients() {
        return suppressedRecipients;
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
        sb.append("EmailSubmittedResponse(");
        sb.append("super=").append(super.toString());
        sb.append("messageId=").append(String.valueOf(this.messageId));
        sb.append(", envelopeId=").append(String.valueOf(this.envelopeId));
        sb.append(", suppressedRecipients=").append(String.valueOf(this.suppressedRecipients));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmailSubmittedResponse)) {
            return false;
        }

        EmailSubmittedResponse other = (EmailSubmittedResponse) o;
        return java.util.Objects.equals(this.messageId, other.messageId)
                && java.util.Objects.equals(this.envelopeId, other.envelopeId)
                && java.util.Objects.equals(this.suppressedRecipients, other.suppressedRecipients)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.messageId == null ? 43 : this.messageId.hashCode());
        result = (result * PRIME) + (this.envelopeId == null ? 43 : this.envelopeId.hashCode());
        result =
                (result * PRIME)
                        + (this.suppressedRecipients == null
                                ? 43
                                : this.suppressedRecipients.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.emaildataplane.requests;

import com.oracle.bmc.emaildataplane.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/emaildataplane/SubmitRawEmailExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use SubmitRawEmailRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220926")
public class SubmitRawEmailRequest extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream>
        implements com.oracle.bmc.requests.HasContentLength {

    /** The media type of the body. */
    private ContentType contentType;

    /** The media type of the body. */
    public enum ContentType implements com.oracle.bmc.http.internal.BmcEnum {
        MessageRfc822("message/rfc822"),
        MessageGlobal("message/global"),
        ;

        private final String value;
        private static java.util.Map<String, ContentType> map;

        static {
            map = new java.util.HashMap<>();
            for (ContentType v : ContentType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ContentType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ContentType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ContentType: " + key);
        }
    };

    /** The media type of the body. */
    public ContentType getContentType() {
        return contentType;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the approved sender resource.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the approved sender resource.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The envelope and the header from email address, that is sending the email. Email address must
     * be an approved sender.
     */
    private String sender;

    /**
     * The envelope and the header from email address, that is sending the email. Email address must
     * be an approved sender.
     */
    public String getSender() {
        return sender;
    }
    /** The destination for the email, all recipients including to, cc and bcc addresses. */
    private java.util.List<String> recipients;

    /** The destination for the email, all recipients including to, cc and bcc addresses. */
    public java.util.List<String> getRecipients() {
        return recipients;
    }
    /**
     * This should be formatted in valid MIME format. Message can include attachments. MIME
     * libraries should be used to convert the content into the appropriate format.
     */
    private java.io.InputStream rawMessage;

    /**
     * This should be formatted in valid MIME format. Message can include attachments. MIME
     * libraries should be used to convert the content into the appropriate format.
     */
    public java.io.InputStream getRawMessage() {
        return rawMessage;
    }
    /** The request ID for tracing from the system */
    private String opcRequestId;

    /** The request ID for tracing from the system */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The content length of the body. */
    private Long contentLength;

    /** The content length of the body. */
    public Long getContentLength() {
        return contentLength;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return rawMessage;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SubmitRawEmailRequest, java.io.InputStream> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The media type of the body. */
        private ContentType contentType = null;

        /**
         * The media type of the body.
         *
         * @param contentType the value to set
         * @return this builder instance
         */
        public Builder contentType(ContentType contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the approved sender resource.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the approved sender resource.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The envelope and the header from email address, that is sending the email. Email address
         * must be an approved sender.
         */
        private String sender = null;

        /**
         * The envelope and the header from email address, that is sending the email. Email address
         * must be an approved sender.
         *
         * @param sender the value to set
         * @return this builder instance
         */
        public Builder sender(String sender) {
            this.sender = sender;
            return this;
        }

        /** The destination for the email, all recipients including to, cc and bcc addresses. */
        private java.util.List<String> recipients = null;

        /**
         * The destination for the email, all recipients including to, cc and bcc addresses.
         *
         * @param recipients the value to set
         * @return this builder instance
         */
        public Builder recipients(java.util.List<String> recipients) {
            this.recipients = recipients;
            return this;
        }

        /**
         * Singular setter. The destination for the email, all recipients including to, cc and bcc
         * addresses.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder recipients(String singularValue) {
            return this.recipients(java.util.Arrays.asList(singularValue));
        }

        /**
         * This should be formatted in valid MIME format. Message can include attachments. MIME
         * libraries should be used to convert the content into the appropriate format.
         */
        private java.io.InputStream rawMessage = null;

        /**
         * This should be formatted in valid MIME format. Message can include attachments. MIME
         * libraries should be used to convert the content into the appropriate format.
         *
         * @param rawMessage the value to set
         * @return this builder instance
         */
        public Builder rawMessage(java.io.InputStream rawMessage) {
            this.rawMessage = rawMessage;
            return this;
        }

        /** The request ID for tracing from the system */
        private String opcRequestId = null;

        /**
         * The request ID for tracing from the system
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The content length of the body. */
        private Long contentLength = null;

        /**
         * The content length of the body.
         *
         * @param contentLength the value to set
         * @return this builder instance
         */
        public Builder contentLength(Long contentLength) {
            this.contentLength = contentLength;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(SubmitRawEmailRequest o) {
            contentType(o.getContentType());
            compartmentId(o.getCompartmentId());
            sender(o.getSender());
            recipients(o.getRecipients());
            rawMessage(o.getRawMessage());
            opcRequestId(o.getOpcRequestId());
            contentLength(o.getContentLength());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SubmitRawEmailRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SubmitRawEmailRequest
         */
        public SubmitRawEmailRequest build() {
            SubmitRawEmailRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(java.io.InputStream body) {
            rawMessage(body);
            return this;
        }

        /**
         * Build the instance of SubmitRawEmailRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SubmitRawEmailRequest
         */
        public SubmitRawEmailRequest buildWithoutInvocationCallback() {
            SubmitRawEmailRequest request = new SubmitRawEmailRequest();
            request.contentType = contentType;
            request.compartmentId = compartmentId;
            request.sender = sender;
            request.recipients = recipients;
            request.rawMessage = rawMessage;
            request.opcRequestId = opcRequestId;
            request.contentLength = contentLength;
            return request;
            // new SubmitRawEmailRequest(contentType, compartmentId, sender, recipients, rawMessage,
            // opcRequestId, contentLength);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .contentType(contentType)
                .compartmentId(compartmentId)
                .sender(sender)
                .recipients(recipients)
                .rawMessage(rawMessage)
                .opcRequestId(opcRequestId)
                .contentLength(contentLength);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",contentType=").append(String.valueOf(this.contentType));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",sender=").append(String.valueOf(this.sender));
        sb.append(",recipients=").append(String.valueOf(this.recipients));
        sb.append(",rawMessage=").append(String.valueOf(this.rawMessage));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",contentLength=").append(String.valueOf(this.contentLength));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubmitRawEmailRequest)) {
            return false;
        }

        SubmitRawEmailRequest other = (SubmitRawEmailRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.sender, other.sender)
                && java.util.Objects.equals(this.recipients, other.recipients)
                && java.util.Objects.equals(this.rawMessage, other.rawMessage)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.contentLength, other.contentLength);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.sender == null ? 43 : this.sender.hashCode());
        result = (result * PRIME) + (this.recipients == null ? 43 : this.recipients.hashCode());
        result = (result * PRIME) + (this.rawMessage == null ? 43 : this.rawMessage.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLength == null ? 43 : this.contentLength.hashCode());
        return result;
    }
}

/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import com.oracle.bmc.InternalSdk;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * A {@code BmcException} exception is thrown in response to failures from a REST endpoint. It
 * contains the status code of the HTTP response as well as an application code and message
 * describing the problem.
 */
public class ResponseHelper {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ResponseHelper.class);
    private static final int MAX_RESPONSE_BUFFER_BYTES = 4096;
    private static final String OPC_REQUEST_ID_HEADER = "opc-request-id";
    @InternalSdk public static final Map<Integer, String> DEFAULT_ERROR_MESSAGES = new HashMap<>();

    // mostly here for HEAD requests which wouldn't have a body to parse a nice message from.
    static {
        DEFAULT_ERROR_MESSAGES.put(
                404, "The resource does not exist or the request was not authorized");
        DEFAULT_ERROR_MESSAGES.put(412, "Precondition failed");
    }

    public static final class ErrorCodeAndMessage {
        private final String code;
        private final String message;
        private final String originalMessage;
        private final String originalMessageTemplate;
        private final Map<String, String> messageArguments;

        public static class Builder {
            private String code;
            private String message;
            private String originalMessage;
            private String originalMessageTemplate;
            private Map<String, String> messageArguments;

            Builder() {}

            /** @return {@code this}. */
            public ResponseHelper.ErrorCodeAndMessage.Builder code(final String code) {
                this.code = code;
                return this;
            }

            /** @return {@code this}. */
            public ResponseHelper.ErrorCodeAndMessage.Builder message(final String message) {
                this.message = message;
                return this;
            }

            public ResponseHelper.ErrorCodeAndMessage.Builder originalMessage(
                    final String originalMessage) {
                this.originalMessage = originalMessage;
                return this;
            }

            public ResponseHelper.ErrorCodeAndMessage.Builder originalMessageTemplate(
                    final String originalMessageTemplate) {
                this.originalMessageTemplate = originalMessageTemplate;
                return this;
            }

            public ResponseHelper.ErrorCodeAndMessage.Builder messageArguments(
                    final Map<String, String> messageArguments) {
                this.messageArguments = messageArguments;
                return this;
            }

            public ResponseHelper.ErrorCodeAndMessage build() {
                return new ResponseHelper.ErrorCodeAndMessage(
                        this.code,
                        this.message,
                        this.originalMessage,
                        this.originalMessageTemplate,
                        this.messageArguments);
            }

            @java.lang.Override
            public java.lang.String toString() {
                return "ResponseHelper.ErrorCodeAndMessage.Builder(code="
                        + this.code
                        + ", message="
                        + this.message
                        + ")";
            }
        }

        @java.beans.ConstructorProperties({
            "code",
            "message",
            "originalMessage",
            "originalMessageTemplate",
            "messageArguments"
        })
        ErrorCodeAndMessage(
                final String code,
                final String message,
                final String originalMessage,
                final String originalMessageTemplate,
                final Map<String, String> messageArguments) {
            this.code = code;
            this.message = message;
            this.originalMessage = originalMessage;
            this.originalMessageTemplate = originalMessageTemplate;
            this.messageArguments = messageArguments;
        }

        public static ResponseHelper.ErrorCodeAndMessage.Builder builder() {
            return new ResponseHelper.ErrorCodeAndMessage.Builder();
        }

        public String getCode() {
            return this.code;
        }

        public String getMessage() {
            return this.message;
        }

        public String getOriginalMessage() {
            return this.originalMessage;
        }

        public String getOriginalMessageTemplate() {
            return this.originalMessageTemplate;
        }

        public Map<String, String> getMessageArguments() {
            return this.messageArguments;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object o) {
            if (o == this) return true;
            if (!(o instanceof ResponseHelper.ErrorCodeAndMessage)) return false;
            final ResponseHelper.ErrorCodeAndMessage other = (ResponseHelper.ErrorCodeAndMessage) o;
            final java.lang.Object this$code = this.getCode();
            final java.lang.Object other$code = other.getCode();
            if (!Objects.equals(this$code, other$code)) {
                return false;
            }
            final java.lang.Object this$message = this.getMessage();
            final java.lang.Object other$message = other.getMessage();
            if (!Objects.equals(this$message, other$message)) return false;
            final java.lang.Object this$originalMessage = this.getOriginalMessage();
            final java.lang.Object other$originalMessage = other.getOriginalMessage();
            if (!Objects.equals(this$originalMessage, other$originalMessage)) return false;
            final java.lang.Object this$originalMessageTemplate = this.getOriginalMessageTemplate();
            final java.lang.Object other$originalMessageTemplate =
                    other.getOriginalMessageTemplate();
            if (!Objects.equals(this$originalMessageTemplate, other$originalMessageTemplate))
                return false;
            final java.lang.Object this$messageArguments = this.getMessageArguments();
            final java.lang.Object other$messageArguments = other.getMessageArguments();
            if (!Objects.equals(this$messageArguments, other$messageArguments)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            final java.lang.Object $code = this.getCode();
            result = result * PRIME + ($code == null ? 43 : $code.hashCode());
            final java.lang.Object $message = this.getMessage();
            result = result * PRIME + ($message == null ? 43 : $message.hashCode());
            final java.lang.Object $originalMessage = this.getOriginalMessage();
            result = result * PRIME + ($originalMessage == null ? 43 : $originalMessage.hashCode());
            final java.lang.Object $originalMessageTemplate = this.getOriginalMessageTemplate();
            result =
                    result * PRIME
                            + ($originalMessageTemplate == null
                                    ? 43
                                    : $originalMessageTemplate.hashCode());
            final java.lang.Object $messageArguments = this.getMessageArguments();
            result =
                    result * PRIME
                            + ($messageArguments == null ? 43 : $messageArguments.hashCode());
            return result;
        }

        @java.lang.Override
        public java.lang.String toString() {
            return "ResponseHelper.ErrorCodeAndMessage(code="
                    + this.getCode()
                    + ", message="
                    + this.getMessage()
                    + ", originalMessage="
                    + this.getOriginalMessage()
                    + ", originalMessageTemplate="
                    + this.getOriginalMessageTemplate()
                    + ", messageArguments="
                    + this.getMessageArguments()
                    + ")";
        }
    }
}

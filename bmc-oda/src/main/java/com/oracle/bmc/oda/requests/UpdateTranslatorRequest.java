/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/UpdateTranslatorExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateTranslatorRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class UpdateTranslatorRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.oda.model.UpdateTranslatorDetails> {

    /** Unique Digital Assistant instance identifier. */
    private String odaInstanceId;

    /** Unique Digital Assistant instance identifier. */
    public String getOdaInstanceId() {
        return odaInstanceId;
    }
    /** Unique Translator identifier. */
    private String translatorId;

    /** Unique Translator identifier. */
    public String getTranslatorId() {
        return translatorId;
    }
    /** Property values to update the Translator. */
    private com.oracle.bmc.oda.model.UpdateTranslatorDetails updateTranslatorDetails;

    /** Property values to update the Translator. */
    public com.oracle.bmc.oda.model.UpdateTranslatorDetails getUpdateTranslatorDetails() {
        return updateTranslatorDetails;
    }
    /**
     * For optimistic concurrency control in a PUT or DELETE call for a Digital Assistant instance,
     * set the {@code if-match} query parameter to the value of the {@code ETAG} header from a
     * previous GET or POST response for that instance. The service updates or deletes the instance
     * only if the etag that you provide matches the instance's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control in a PUT or DELETE call for a Digital Assistant instance,
     * set the {@code if-match} query parameter to the value of the {@code ETAG} header from a
     * previous GET or POST response for that instance. The service updates or deletes the instance
     * only if the etag that you provide matches the instance's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The client request ID for tracing. This value is included in the opc-request-id response
     * header.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. This value is included in the opc-request-id response
     * header.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.oda.model.UpdateTranslatorDetails getBody$() {
        return updateTranslatorDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateTranslatorRequest, com.oracle.bmc.oda.model.UpdateTranslatorDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Digital Assistant instance identifier. */
        private String odaInstanceId = null;

        /**
         * Unique Digital Assistant instance identifier.
         *
         * @param odaInstanceId the value to set
         * @return this builder instance
         */
        public Builder odaInstanceId(String odaInstanceId) {
            this.odaInstanceId = odaInstanceId;
            return this;
        }

        /** Unique Translator identifier. */
        private String translatorId = null;

        /**
         * Unique Translator identifier.
         *
         * @param translatorId the value to set
         * @return this builder instance
         */
        public Builder translatorId(String translatorId) {
            this.translatorId = translatorId;
            return this;
        }

        /** Property values to update the Translator. */
        private com.oracle.bmc.oda.model.UpdateTranslatorDetails updateTranslatorDetails = null;

        /**
         * Property values to update the Translator.
         *
         * @param updateTranslatorDetails the value to set
         * @return this builder instance
         */
        public Builder updateTranslatorDetails(
                com.oracle.bmc.oda.model.UpdateTranslatorDetails updateTranslatorDetails) {
            this.updateTranslatorDetails = updateTranslatorDetails;
            return this;
        }

        /**
         * For optimistic concurrency control in a PUT or DELETE call for a Digital Assistant
         * instance, set the {@code if-match} query parameter to the value of the {@code ETAG}
         * header from a previous GET or POST response for that instance. The service updates or
         * deletes the instance only if the etag that you provide matches the instance's current
         * etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control in a PUT or DELETE call for a Digital Assistant
         * instance, set the {@code if-match} query parameter to the value of the {@code ETAG}
         * header from a previous GET or POST response for that instance. The service updates or
         * deletes the instance only if the etag that you provide matches the instance's current
         * etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response
         * header.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response
         * header.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(UpdateTranslatorRequest o) {
            odaInstanceId(o.getOdaInstanceId());
            translatorId(o.getTranslatorId());
            updateTranslatorDetails(o.getUpdateTranslatorDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateTranslatorRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateTranslatorRequest
         */
        public UpdateTranslatorRequest build() {
            UpdateTranslatorRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.oda.model.UpdateTranslatorDetails body) {
            updateTranslatorDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateTranslatorRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateTranslatorRequest
         */
        public UpdateTranslatorRequest buildWithoutInvocationCallback() {
            UpdateTranslatorRequest request = new UpdateTranslatorRequest();
            request.odaInstanceId = odaInstanceId;
            request.translatorId = translatorId;
            request.updateTranslatorDetails = updateTranslatorDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateTranslatorRequest(odaInstanceId, translatorId, updateTranslatorDetails,
            // ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .odaInstanceId(odaInstanceId)
                .translatorId(translatorId)
                .updateTranslatorDetails(updateTranslatorDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",odaInstanceId=").append(String.valueOf(this.odaInstanceId));
        sb.append(",translatorId=").append(String.valueOf(this.translatorId));
        sb.append(",updateTranslatorDetails=").append(String.valueOf(this.updateTranslatorDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTranslatorRequest)) {
            return false;
        }

        UpdateTranslatorRequest other = (UpdateTranslatorRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.odaInstanceId, other.odaInstanceId)
                && java.util.Objects.equals(this.translatorId, other.translatorId)
                && java.util.Objects.equals(
                        this.updateTranslatorDetails, other.updateTranslatorDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.odaInstanceId == null ? 43 : this.odaInstanceId.hashCode());
        result = (result * PRIME) + (this.translatorId == null ? 43 : this.translatorId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateTranslatorDetails == null
                                ? 43
                                : this.updateTranslatorDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

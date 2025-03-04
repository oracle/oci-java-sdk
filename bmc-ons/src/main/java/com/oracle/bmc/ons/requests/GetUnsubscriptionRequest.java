/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ons.requests;

import com.oracle.bmc.ons.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ons/GetUnsubscriptionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetUnsubscriptionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GetUnsubscriptionRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subscription to unsubscribe from.
     */
    private String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subscription to unsubscribe from.
     */
    public String getId() {
        return id;
    }
    /** The subscription confirmation token. */
    private String token;

    /** The subscription confirmation token. */
    public String getToken() {
        return token;
    }
    /**
     * The protocol used for the subscription.
     *
     * <p>Allowed values: * {@code CUSTOM_HTTPS} * {@code EMAIL} * {@code HTTPS} (deprecated; for
     * PagerDuty endpoints, use {@code PAGERDUTY}) * {@code ORACLE_FUNCTIONS} * {@code PAGERDUTY} *
     * {@code SLACK} * {@code SMS}
     *
     * <p>For information about subscription protocols, see [To create a
     * subscription](https://docs.oracle.com/iaas/Content/Notification/Tasks/managingtopicsandsubscriptions.htm#createSub).
     */
    private String protocol;

    /**
     * The protocol used for the subscription.
     *
     * <p>Allowed values: * {@code CUSTOM_HTTPS} * {@code EMAIL} * {@code HTTPS} (deprecated; for
     * PagerDuty endpoints, use {@code PAGERDUTY}) * {@code ORACLE_FUNCTIONS} * {@code PAGERDUTY} *
     * {@code SLACK} * {@code SMS}
     *
     * <p>For information about subscription protocols, see [To create a
     * subscription](https://docs.oracle.com/iaas/Content/Notification/Tasks/managingtopicsandsubscriptions.htm#createSub).
     */
    public String getProtocol() {
        return protocol;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetUnsubscriptionRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subscription to unsubscribe from.
         */
        private String id = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subscription to unsubscribe from.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /** The subscription confirmation token. */
        private String token = null;

        /**
         * The subscription confirmation token.
         *
         * @param token the value to set
         * @return this builder instance
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * The protocol used for the subscription.
         *
         * <p>Allowed values: * {@code CUSTOM_HTTPS} * {@code EMAIL} * {@code HTTPS} (deprecated;
         * for PagerDuty endpoints, use {@code PAGERDUTY}) * {@code ORACLE_FUNCTIONS} * {@code
         * PAGERDUTY} * {@code SLACK} * {@code SMS}
         *
         * <p>For information about subscription protocols, see [To create a
         * subscription](https://docs.oracle.com/iaas/Content/Notification/Tasks/managingtopicsandsubscriptions.htm#createSub).
         */
        private String protocol = null;

        /**
         * The protocol used for the subscription.
         *
         * <p>Allowed values: * {@code CUSTOM_HTTPS} * {@code EMAIL} * {@code HTTPS} (deprecated;
         * for PagerDuty endpoints, use {@code PAGERDUTY}) * {@code ORACLE_FUNCTIONS} * {@code
         * PAGERDUTY} * {@code SLACK} * {@code SMS}
         *
         * <p>For information about subscription protocols, see [To create a
         * subscription](https://docs.oracle.com/iaas/Content/Notification/Tasks/managingtopicsandsubscriptions.htm#createSub).
         *
         * @param protocol the value to set
         * @return this builder instance
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
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
        public Builder copy(GetUnsubscriptionRequest o) {
            id(o.getId());
            token(o.getToken());
            protocol(o.getProtocol());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetUnsubscriptionRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetUnsubscriptionRequest
         */
        public GetUnsubscriptionRequest build() {
            GetUnsubscriptionRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetUnsubscriptionRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetUnsubscriptionRequest
         */
        public GetUnsubscriptionRequest buildWithoutInvocationCallback() {
            GetUnsubscriptionRequest request = new GetUnsubscriptionRequest();
            request.id = id;
            request.token = token;
            request.protocol = protocol;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetUnsubscriptionRequest(id, token, protocol, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().id(id).token(token).protocol(protocol).opcRequestId(opcRequestId);
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
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",token=").append(String.valueOf(this.token));
        sb.append(",protocol=").append(String.valueOf(this.protocol));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetUnsubscriptionRequest)) {
            return false;
        }

        GetUnsubscriptionRequest other = (GetUnsubscriptionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.token, other.token)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.token == null ? 43 : this.token.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

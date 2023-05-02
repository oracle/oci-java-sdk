/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.requests;

import com.oracle.bmc.stackmonitoring.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/stackmonitoring/CreateMonitoredResourceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateMonitoredResourceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class CreateMonitoredResourceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.stackmonitoring.model.CreateMonitoredResourceDetails> {

    /**
     * Details for the new monitored resource.
     *
     */
    private com.oracle.bmc.stackmonitoring.model.CreateMonitoredResourceDetails
            createMonitoredResourceDetails;

    /**
     * Details for the new monitored resource.
     *
     */
    public com.oracle.bmc.stackmonitoring.model.CreateMonitoredResourceDetails
            getCreateMonitoredResourceDetails() {
        return createMonitoredResourceDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Generally used by DBaaS to send the Database OCID stored on the DBaaS.
     * The same will be passed to resource service to enable Stack Monitoring Service on DBM.
     * This will be stored in Stack Monitoring Resource Service data store as identifier for monitored resource.
     * If this header is not set as part of the request, then an id will be generated and stored for the resource.
     *
     */
    private String externalResourceId;

    /**
     * Generally used by DBaaS to send the Database OCID stored on the DBaaS.
     * The same will be passed to resource service to enable Stack Monitoring Service on DBM.
     * This will be stored in Stack Monitoring Resource Service data store as identifier for monitored resource.
     * If this header is not set as part of the request, then an id will be generated and stored for the resource.
     *
     */
    public String getExternalResourceId() {
        return externalResourceId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.stackmonitoring.model.CreateMonitoredResourceDetails getBody$() {
        return createMonitoredResourceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateMonitoredResourceRequest,
                    com.oracle.bmc.stackmonitoring.model.CreateMonitoredResourceDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Details for the new monitored resource.
         *
         */
        private com.oracle.bmc.stackmonitoring.model.CreateMonitoredResourceDetails
                createMonitoredResourceDetails = null;

        /**
         * Details for the new monitored resource.
         *
         * @param createMonitoredResourceDetails the value to set
         * @return this builder instance
         */
        public Builder createMonitoredResourceDetails(
                com.oracle.bmc.stackmonitoring.model.CreateMonitoredResourceDetails
                        createMonitoredResourceDetails) {
            this.createMonitoredResourceDetails = createMonitoredResourceDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Generally used by DBaaS to send the Database OCID stored on the DBaaS.
         * The same will be passed to resource service to enable Stack Monitoring Service on DBM.
         * This will be stored in Stack Monitoring Resource Service data store as identifier for monitored resource.
         * If this header is not set as part of the request, then an id will be generated and stored for the resource.
         *
         */
        private String externalResourceId = null;

        /**
         * Generally used by DBaaS to send the Database OCID stored on the DBaaS.
         * The same will be passed to resource service to enable Stack Monitoring Service on DBM.
         * This will be stored in Stack Monitoring Resource Service data store as identifier for monitored resource.
         * If this header is not set as part of the request, then an id will be generated and stored for the resource.
         *
         * @param externalResourceId the value to set
         * @return this builder instance
         */
        public Builder externalResourceId(String externalResourceId) {
            this.externalResourceId = externalResourceId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * @return this builder instance
         */
        public Builder copy(CreateMonitoredResourceRequest o) {
            createMonitoredResourceDetails(o.getCreateMonitoredResourceDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            externalResourceId(o.getExternalResourceId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateMonitoredResourceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateMonitoredResourceRequest
         */
        public CreateMonitoredResourceRequest build() {
            CreateMonitoredResourceRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.stackmonitoring.model.CreateMonitoredResourceDetails body) {
            createMonitoredResourceDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateMonitoredResourceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateMonitoredResourceRequest
         */
        public CreateMonitoredResourceRequest buildWithoutInvocationCallback() {
            CreateMonitoredResourceRequest request = new CreateMonitoredResourceRequest();
            request.createMonitoredResourceDetails = createMonitoredResourceDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.externalResourceId = externalResourceId;
            return request;
            // new CreateMonitoredResourceRequest(createMonitoredResourceDetails, opcRetryToken, opcRequestId, externalResourceId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createMonitoredResourceDetails(createMonitoredResourceDetails)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .externalResourceId(externalResourceId);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",createMonitoredResourceDetails=")
                .append(String.valueOf(this.createMonitoredResourceDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",externalResourceId=").append(String.valueOf(this.externalResourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMonitoredResourceRequest)) {
            return false;
        }

        CreateMonitoredResourceRequest other = (CreateMonitoredResourceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createMonitoredResourceDetails, other.createMonitoredResourceDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.externalResourceId, other.externalResourceId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createMonitoredResourceDetails == null
                                ? 43
                                : this.createMonitoredResourceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.externalResourceId == null
                                ? 43
                                : this.externalResourceId.hashCode());
        return result;
    }
}

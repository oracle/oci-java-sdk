/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/CreateLogAnalyticsObjectCollectionRuleExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateLogAnalyticsObjectCollectionRuleRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class CreateLogAnalyticsObjectCollectionRuleRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.loganalytics.model.CreateLogAnalyticsObjectCollectionRuleDetails> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /** Details of the rule to be created. */
    private com.oracle.bmc.loganalytics.model.CreateLogAnalyticsObjectCollectionRuleDetails
            createLogAnalyticsObjectCollectionRuleDetails;

    /** Details of the rule to be created. */
    public com.oracle.bmc.loganalytics.model.CreateLogAnalyticsObjectCollectionRuleDetails
            getCreateLogAnalyticsObjectCollectionRuleDetails() {
        return createLogAnalyticsObjectCollectionRuleDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
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
    public com.oracle.bmc.loganalytics.model.CreateLogAnalyticsObjectCollectionRuleDetails
            getBody$() {
        return createLogAnalyticsObjectCollectionRuleDetails;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateLogAnalyticsObjectCollectionRuleRequest,
                    com.oracle.bmc.loganalytics.model
                            .CreateLogAnalyticsObjectCollectionRuleDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Logging Analytics namespace used for the request. */
        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /** Details of the rule to be created. */
        private com.oracle.bmc.loganalytics.model.CreateLogAnalyticsObjectCollectionRuleDetails
                createLogAnalyticsObjectCollectionRuleDetails = null;

        /**
         * Details of the rule to be created.
         *
         * @param createLogAnalyticsObjectCollectionRuleDetails the value to set
         * @return this builder instance
         */
        public Builder createLogAnalyticsObjectCollectionRuleDetails(
                com.oracle.bmc.loganalytics.model.CreateLogAnalyticsObjectCollectionRuleDetails
                        createLogAnalyticsObjectCollectionRuleDetails) {
            this.createLogAnalyticsObjectCollectionRuleDetails =
                    createLogAnalyticsObjectCollectionRuleDetails;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(CreateLogAnalyticsObjectCollectionRuleRequest o) {
            namespaceName(o.getNamespaceName());
            createLogAnalyticsObjectCollectionRuleDetails(
                    o.getCreateLogAnalyticsObjectCollectionRuleDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateLogAnalyticsObjectCollectionRuleRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateLogAnalyticsObjectCollectionRuleRequest
         */
        public CreateLogAnalyticsObjectCollectionRuleRequest build() {
            CreateLogAnalyticsObjectCollectionRuleRequest request =
                    buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.loganalytics.model.CreateLogAnalyticsObjectCollectionRuleDetails
                        body) {
            createLogAnalyticsObjectCollectionRuleDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateLogAnalyticsObjectCollectionRuleRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateLogAnalyticsObjectCollectionRuleRequest
         */
        public CreateLogAnalyticsObjectCollectionRuleRequest buildWithoutInvocationCallback() {
            CreateLogAnalyticsObjectCollectionRuleRequest request =
                    new CreateLogAnalyticsObjectCollectionRuleRequest();
            request.namespaceName = namespaceName;
            request.createLogAnalyticsObjectCollectionRuleDetails =
                    createLogAnalyticsObjectCollectionRuleDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateLogAnalyticsObjectCollectionRuleRequest(namespaceName,
            // createLogAnalyticsObjectCollectionRuleDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .createLogAnalyticsObjectCollectionRuleDetails(
                        createLogAnalyticsObjectCollectionRuleDetails)
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",createLogAnalyticsObjectCollectionRuleDetails=")
                .append(String.valueOf(this.createLogAnalyticsObjectCollectionRuleDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateLogAnalyticsObjectCollectionRuleRequest)) {
            return false;
        }

        CreateLogAnalyticsObjectCollectionRuleRequest other =
                (CreateLogAnalyticsObjectCollectionRuleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(
                        this.createLogAnalyticsObjectCollectionRuleDetails,
                        other.createLogAnalyticsObjectCollectionRuleDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.createLogAnalyticsObjectCollectionRuleDetails == null
                                ? 43
                                : this.createLogAnalyticsObjectCollectionRuleDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

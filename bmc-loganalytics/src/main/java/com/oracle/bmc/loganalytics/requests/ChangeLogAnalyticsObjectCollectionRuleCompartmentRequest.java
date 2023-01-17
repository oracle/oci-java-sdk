/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ChangeLogAnalyticsObjectCollectionRuleCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.loganalytics.model
                        .ChangeLogAnalyticsObjectCollectionRuleCompartmentDetails> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * The Logging Analytics Object Collection Rule
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String logAnalyticsObjectCollectionRuleId;

    /**
     * The Logging Analytics Object Collection Rule
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getLogAnalyticsObjectCollectionRuleId() {
        return logAnalyticsObjectCollectionRuleId;
    }
    /** The new compartment this Object Collection Rule will be moved to. */
    private com.oracle.bmc.loganalytics.model
                    .ChangeLogAnalyticsObjectCollectionRuleCompartmentDetails
            changeLogAnalyticsObjectCollectionRuleCompartmentDetails;

    /** The new compartment this Object Collection Rule will be moved to. */
    public com.oracle.bmc.loganalytics.model
                    .ChangeLogAnalyticsObjectCollectionRuleCompartmentDetails
            getChangeLogAnalyticsObjectCollectionRuleCompartmentDetails() {
        return changeLogAnalyticsObjectCollectionRuleCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
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
    public com.oracle.bmc.loganalytics.model
                    .ChangeLogAnalyticsObjectCollectionRuleCompartmentDetails
            getBody$() {
        return changeLogAnalyticsObjectCollectionRuleCompartmentDetails;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest,
                    com.oracle.bmc.loganalytics.model
                            .ChangeLogAnalyticsObjectCollectionRuleCompartmentDetails> {
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

        /**
         * The Logging Analytics Object Collection Rule
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String logAnalyticsObjectCollectionRuleId = null;

        /**
         * The Logging Analytics Object Collection Rule
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param logAnalyticsObjectCollectionRuleId the value to set
         * @return this builder instance
         */
        public Builder logAnalyticsObjectCollectionRuleId(
                String logAnalyticsObjectCollectionRuleId) {
            this.logAnalyticsObjectCollectionRuleId = logAnalyticsObjectCollectionRuleId;
            return this;
        }

        /** The new compartment this Object Collection Rule will be moved to. */
        private com.oracle.bmc.loganalytics.model
                        .ChangeLogAnalyticsObjectCollectionRuleCompartmentDetails
                changeLogAnalyticsObjectCollectionRuleCompartmentDetails = null;

        /**
         * The new compartment this Object Collection Rule will be moved to.
         *
         * @param changeLogAnalyticsObjectCollectionRuleCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeLogAnalyticsObjectCollectionRuleCompartmentDetails(
                com.oracle.bmc.loganalytics.model
                                .ChangeLogAnalyticsObjectCollectionRuleCompartmentDetails
                        changeLogAnalyticsObjectCollectionRuleCompartmentDetails) {
            this.changeLogAnalyticsObjectCollectionRuleCompartmentDetails =
                    changeLogAnalyticsObjectCollectionRuleCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest o) {
            namespaceName(o.getNamespaceName());
            logAnalyticsObjectCollectionRuleId(o.getLogAnalyticsObjectCollectionRuleId());
            changeLogAnalyticsObjectCollectionRuleCompartmentDetails(
                    o.getChangeLogAnalyticsObjectCollectionRuleCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest as
         * configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest
         */
        public ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest build() {
            ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest request =
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
                com.oracle.bmc.loganalytics.model
                                .ChangeLogAnalyticsObjectCollectionRuleCompartmentDetails
                        body) {
            changeLogAnalyticsObjectCollectionRuleCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest as
         * configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest
         */
        public ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest
                buildWithoutInvocationCallback() {
            ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest request =
                    new ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest();
            request.namespaceName = namespaceName;
            request.logAnalyticsObjectCollectionRuleId = logAnalyticsObjectCollectionRuleId;
            request.changeLogAnalyticsObjectCollectionRuleCompartmentDetails =
                    changeLogAnalyticsObjectCollectionRuleCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest(namespaceName,
            // logAnalyticsObjectCollectionRuleId,
            // changeLogAnalyticsObjectCollectionRuleCompartmentDetails, ifMatch, opcRequestId);
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
                .logAnalyticsObjectCollectionRuleId(logAnalyticsObjectCollectionRuleId)
                .changeLogAnalyticsObjectCollectionRuleCompartmentDetails(
                        changeLogAnalyticsObjectCollectionRuleCompartmentDetails)
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",logAnalyticsObjectCollectionRuleId=")
                .append(String.valueOf(this.logAnalyticsObjectCollectionRuleId));
        sb.append(",changeLogAnalyticsObjectCollectionRuleCompartmentDetails=")
                .append(
                        String.valueOf(
                                this.changeLogAnalyticsObjectCollectionRuleCompartmentDetails));
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
        if (!(o instanceof ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest)) {
            return false;
        }

        ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest other =
                (ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(
                        this.logAnalyticsObjectCollectionRuleId,
                        other.logAnalyticsObjectCollectionRuleId)
                && java.util.Objects.equals(
                        this.changeLogAnalyticsObjectCollectionRuleCompartmentDetails,
                        other.changeLogAnalyticsObjectCollectionRuleCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
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
                        + (this.logAnalyticsObjectCollectionRuleId == null
                                ? 43
                                : this.logAnalyticsObjectCollectionRuleId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeLogAnalyticsObjectCollectionRuleCompartmentDetails == null
                                ? 43
                                : this.changeLogAnalyticsObjectCollectionRuleCompartmentDetails
                                        .hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

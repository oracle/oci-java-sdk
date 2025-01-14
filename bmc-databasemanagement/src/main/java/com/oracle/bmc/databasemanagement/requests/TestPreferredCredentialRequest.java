/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/TestPreferredCredentialExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * TestPreferredCredentialRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class TestPreferredCredentialRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model.TestPreferredCredentialDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     */
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }
    /** The name of the preferred credential. */
    private String credentialName;

    /** The name of the preferred credential. */
    public String getCredentialName() {
        return credentialName;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The details required to test preferred credential. */
    private com.oracle.bmc.databasemanagement.model.TestPreferredCredentialDetails
            testPreferredCredentialDetails;

    /** The details required to test preferred credential. */
    public com.oracle.bmc.databasemanagement.model.TestPreferredCredentialDetails
            getTestPreferredCredentialDetails() {
        return testPreferredCredentialDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.databasemanagement.model.TestPreferredCredentialDetails getBody$() {
        return testPreferredCredentialDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    TestPreferredCredentialRequest,
                    com.oracle.bmc.databasemanagement.model.TestPreferredCredentialDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         */
        private String managedDatabaseId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         *
         * @param managedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /** The name of the preferred credential. */
        private String credentialName = null;

        /**
         * The name of the preferred credential.
         *
         * @param credentialName the value to set
         * @return this builder instance
         */
        public Builder credentialName(String credentialName) {
            this.credentialName = credentialName;
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

        /** The details required to test preferred credential. */
        private com.oracle.bmc.databasemanagement.model.TestPreferredCredentialDetails
                testPreferredCredentialDetails = null;

        /**
         * The details required to test preferred credential.
         *
         * @param testPreferredCredentialDetails the value to set
         * @return this builder instance
         */
        public Builder testPreferredCredentialDetails(
                com.oracle.bmc.databasemanagement.model.TestPreferredCredentialDetails
                        testPreferredCredentialDetails) {
            this.testPreferredCredentialDetails = testPreferredCredentialDetails;
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
        public Builder copy(TestPreferredCredentialRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            credentialName(o.getCredentialName());
            opcRequestId(o.getOpcRequestId());
            testPreferredCredentialDetails(o.getTestPreferredCredentialDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of TestPreferredCredentialRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of TestPreferredCredentialRequest
         */
        public TestPreferredCredentialRequest build() {
            TestPreferredCredentialRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasemanagement.model.TestPreferredCredentialDetails body) {
            testPreferredCredentialDetails(body);
            return this;
        }

        /**
         * Build the instance of TestPreferredCredentialRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of TestPreferredCredentialRequest
         */
        public TestPreferredCredentialRequest buildWithoutInvocationCallback() {
            TestPreferredCredentialRequest request = new TestPreferredCredentialRequest();
            request.managedDatabaseId = managedDatabaseId;
            request.credentialName = credentialName;
            request.opcRequestId = opcRequestId;
            request.testPreferredCredentialDetails = testPreferredCredentialDetails;
            return request;
            // new TestPreferredCredentialRequest(managedDatabaseId, credentialName, opcRequestId,
            // testPreferredCredentialDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedDatabaseId(managedDatabaseId)
                .credentialName(credentialName)
                .opcRequestId(opcRequestId)
                .testPreferredCredentialDetails(testPreferredCredentialDetails);
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
        sb.append(",managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(",credentialName=").append(String.valueOf(this.credentialName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",testPreferredCredentialDetails=")
                .append(String.valueOf(this.testPreferredCredentialDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestPreferredCredentialRequest)) {
            return false;
        }

        TestPreferredCredentialRequest other = (TestPreferredCredentialRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(this.credentialName, other.credentialName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.testPreferredCredentialDetails, other.testPreferredCredentialDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedDatabaseId == null ? 43 : this.managedDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialName == null ? 43 : this.credentialName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.testPreferredCredentialDetails == null
                                ? 43
                                : this.testPreferredCredentialDetails.hashCode());
        return result;
    }
}

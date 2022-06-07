/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UpdateLookupDataExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateLookupDataRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class UpdateLookupDataRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * The name of the lookup to operate on.
     */
    private String lookupName;

    public String getLookupName() {
        return lookupName;
    }
    /**
     * The file to use for the lookup update.
     */
    private java.io.InputStream updateLookupFileBody;

    public java.io.InputStream getUpdateLookupFileBody() {
        return updateLookupFileBody;
    }
    /**
     * is force
     */
    private Boolean isForce;

    public Boolean getIsForce() {
        return isForce;
    }
    /**
     * The character encoding of the uploaded file.
     */
    private String charEncoding;

    public String getCharEncoding() {
        return charEncoding;
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

    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * A value of {@code 100-continue} requests preliminary verification of the request method, path, and headers before the request body is sent.
     * If no error results from such verification, the server will send a 100 (Continue) interim response to indicate readiness for the request body.
     * The only allowed value for this parameter is "100-Continue" (case-insensitive).
     *
     */
    private String expect;

    public String getExpect() {
        return expect;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return updateLookupFileBody;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateLookupDataRequest, java.io.InputStream> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        private String lookupName = null;

        /**
         * The name of the lookup to operate on.
         * @return this builder instance
         */
        public Builder lookupName(String lookupName) {
            this.lookupName = lookupName;
            return this;
        }

        private java.io.InputStream updateLookupFileBody = null;

        /**
         * The file to use for the lookup update.
         * @return this builder instance
         */
        public Builder updateLookupFileBody(java.io.InputStream updateLookupFileBody) {
            this.updateLookupFileBody = updateLookupFileBody;
            return this;
        }

        private Boolean isForce = null;

        /**
         * is force
         * @return this builder instance
         */
        public Builder isForce(Boolean isForce) {
            this.isForce = isForce;
            return this;
        }

        private String charEncoding = null;

        /**
         * The character encoding of the uploaded file.
         * @return this builder instance
         */
        public Builder charEncoding(String charEncoding) {
            this.charEncoding = charEncoding;
            return this;
        }

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String expect = null;

        /**
         * A value of {@code 100-continue} requests preliminary verification of the request method, path, and headers before the request body is sent.
         * If no error results from such verification, the server will send a 100 (Continue) interim response to indicate readiness for the request body.
         * The only allowed value for this parameter is "100-Continue" (case-insensitive).
         *
         * @return this builder instance
         */
        public Builder expect(String expect) {
            this.expect = expect;
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
        public Builder copy(UpdateLookupDataRequest o) {
            namespaceName(o.getNamespaceName());
            lookupName(o.getLookupName());
            updateLookupFileBody(o.getUpdateLookupFileBody());
            isForce(o.getIsForce());
            charEncoding(o.getCharEncoding());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            expect(o.getExpect());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateLookupDataRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateLookupDataRequest
         */
        public UpdateLookupDataRequest build() {
            UpdateLookupDataRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(java.io.InputStream body) {
            updateLookupFileBody(body);
            return this;
        }

        /**
         * Build the instance of UpdateLookupDataRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateLookupDataRequest
         */
        public UpdateLookupDataRequest buildWithoutInvocationCallback() {
            UpdateLookupDataRequest request = new UpdateLookupDataRequest();
            request.namespaceName = namespaceName;
            request.lookupName = lookupName;
            request.updateLookupFileBody = updateLookupFileBody;
            request.isForce = isForce;
            request.charEncoding = charEncoding;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.expect = expect;
            return request;
            // new UpdateLookupDataRequest(namespaceName, lookupName, updateLookupFileBody, isForce, charEncoding, opcRetryToken, opcRequestId, ifMatch, expect);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .lookupName(lookupName)
                .updateLookupFileBody(updateLookupFileBody)
                .isForce(isForce)
                .charEncoding(charEncoding)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
                .expect(expect);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",lookupName=").append(String.valueOf(this.lookupName));
        sb.append(",updateLookupFileBody=").append(String.valueOf(this.updateLookupFileBody));
        sb.append(",isForce=").append(String.valueOf(this.isForce));
        sb.append(",charEncoding=").append(String.valueOf(this.charEncoding));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",expect=").append(String.valueOf(this.expect));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateLookupDataRequest)) {
            return false;
        }

        UpdateLookupDataRequest other = (UpdateLookupDataRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.lookupName, other.lookupName)
                && java.util.Objects.equals(this.updateLookupFileBody, other.updateLookupFileBody)
                && java.util.Objects.equals(this.isForce, other.isForce)
                && java.util.Objects.equals(this.charEncoding, other.charEncoding)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.expect, other.expect);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.lookupName == null ? 43 : this.lookupName.hashCode());
        result =
                (result * PRIME)
                        + (this.updateLookupFileBody == null
                                ? 43
                                : this.updateLookupFileBody.hashCode());
        result = (result * PRIME) + (this.isForce == null ? 43 : this.isForce.hashCode());
        result = (result * PRIME) + (this.charEncoding == null ? 43 : this.charEncoding.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.expect == null ? 43 : this.expect.hashCode());
        return result;
    }
}

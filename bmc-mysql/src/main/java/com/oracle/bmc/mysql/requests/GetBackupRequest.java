/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.requests;

import com.oracle.bmc.mysql.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/GetBackupExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetBackupRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class GetBackupRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the Backup
     */
    private String backupId;

    /**
     * The OCID of the Backup
     */
    public String getBackupId() {
        return backupId;
    }
    /**
     * Customer-defined unique identifier for the request. If you need to
     * contact Oracle about a specific request, please provide the request
     * ID that you supplied in this header with the request.
     *
     */
    private String opcRequestId;

    /**
     * Customer-defined unique identifier for the request. If you need to
     * contact Oracle about a specific request, please provide the request
     * ID that you supplied in this header with the request.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For conditional requests. In the GET call for a resource, set the
     * {@code If-None-Match} header to the value of the ETag from a previous GET (or
     * POST or PUT) response for that resource. The server will return with
     * either a 304 Not Modified response if the resource has not changed, or a
     * 200 OK response with the updated representation.
     *
     */
    private String ifNoneMatch;

    /**
     * For conditional requests. In the GET call for a resource, set the
     * {@code If-None-Match} header to the value of the ETag from a previous GET (or
     * POST or PUT) response for that resource. The server will return with
     * either a 304 Not Modified response if the resource has not changed, or a
     * 200 OK response with the updated representation.
     *
     */
    public String getIfNoneMatch() {
        return ifNoneMatch;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetBackupRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the Backup
         */
        private String backupId = null;

        /**
         * The OCID of the Backup
         * @param backupId the value to set
         * @return this builder instance
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            return this;
        }

        /**
         * Customer-defined unique identifier for the request. If you need to
         * contact Oracle about a specific request, please provide the request
         * ID that you supplied in this header with the request.
         *
         */
        private String opcRequestId = null;

        /**
         * Customer-defined unique identifier for the request. If you need to
         * contact Oracle about a specific request, please provide the request
         * ID that you supplied in this header with the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For conditional requests. In the GET call for a resource, set the
         * {@code If-None-Match} header to the value of the ETag from a previous GET (or
         * POST or PUT) response for that resource. The server will return with
         * either a 304 Not Modified response if the resource has not changed, or a
         * 200 OK response with the updated representation.
         *
         */
        private String ifNoneMatch = null;

        /**
         * For conditional requests. In the GET call for a resource, set the
         * {@code If-None-Match} header to the value of the ETag from a previous GET (or
         * POST or PUT) response for that resource. The server will return with
         * either a 304 Not Modified response if the resource has not changed, or a
         * 200 OK response with the updated representation.
         *
         * @param ifNoneMatch the value to set
         * @return this builder instance
         */
        public Builder ifNoneMatch(String ifNoneMatch) {
            this.ifNoneMatch = ifNoneMatch;
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
        public Builder copy(GetBackupRequest o) {
            backupId(o.getBackupId());
            opcRequestId(o.getOpcRequestId());
            ifNoneMatch(o.getIfNoneMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetBackupRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetBackupRequest
         */
        public GetBackupRequest build() {
            GetBackupRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetBackupRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetBackupRequest
         */
        public GetBackupRequest buildWithoutInvocationCallback() {
            GetBackupRequest request = new GetBackupRequest();
            request.backupId = backupId;
            request.opcRequestId = opcRequestId;
            request.ifNoneMatch = ifNoneMatch;
            return request;
            // new GetBackupRequest(backupId, opcRequestId, ifNoneMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().backupId(backupId).opcRequestId(opcRequestId).ifNoneMatch(ifNoneMatch);
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
        sb.append(",backupId=").append(String.valueOf(this.backupId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetBackupRequest)) {
            return false;
        }

        GetBackupRequest other = (GetBackupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.backupId, other.backupId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.backupId == null ? 43 : this.backupId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifNoneMatch == null ? 43 : this.ifNoneMatch.hashCode());
        return result;
    }
}

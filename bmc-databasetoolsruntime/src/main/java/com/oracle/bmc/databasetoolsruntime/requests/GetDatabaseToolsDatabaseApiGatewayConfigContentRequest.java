/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.requests;

import com.oracle.bmc.databasetoolsruntime.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/GetDatabaseToolsDatabaseApiGatewayConfigContentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetDatabaseToolsDatabaseApiGatewayConfigContentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
public class GetDatabaseToolsDatabaseApiGatewayConfigContentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Database Tools database API gateway config.
     */
    private String databaseToolsDatabaseApiGatewayConfigId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Database Tools database API gateway config.
     */
    public String getDatabaseToolsDatabaseApiGatewayConfigId() {
        return databaseToolsDatabaseApiGatewayConfigId;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * If-Match is most often used with state-changing methods (e.g., POST, PUT, DELETE) to prevent
     * accidental overwrites when multiple user agentss might be acting in parallel on the same
     * resource (i.e., to prevent the "lost update" problem). In general, it can be used with any
     * method that involves the selection or modification of a representation to abort the request
     * if the selected representation's current entity tag is not a member within the If-Match field value.
     * When specified on an action-specific subresource, the ETag value of the resource on which the
     * action is requested should be provided.
     *
     */
    private String ifMatch;

    /**
     * If-Match is most often used with state-changing methods (e.g., POST, PUT, DELETE) to prevent
     * accidental overwrites when multiple user agentss might be acting in parallel on the same
     * resource (i.e., to prevent the "lost update" problem). In general, it can be used with any
     * method that involves the selection or modification of a representation to abort the request
     * if the selected representation's current entity tag is not a member within the If-Match field value.
     * When specified on an action-specific subresource, the ETag value of the resource on which the
     * action is requested should be provided.
     *
     */
    public String getIfMatch() {
        return ifMatch;
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
                    GetDatabaseToolsDatabaseApiGatewayConfigContentRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Database Tools database API gateway config.
         */
        private String databaseToolsDatabaseApiGatewayConfigId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Database Tools database API gateway config.
         * @param databaseToolsDatabaseApiGatewayConfigId the value to set
         * @return this builder instance
         */
        public Builder databaseToolsDatabaseApiGatewayConfigId(
                String databaseToolsDatabaseApiGatewayConfigId) {
            this.databaseToolsDatabaseApiGatewayConfigId = databaseToolsDatabaseApiGatewayConfigId;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * If-Match is most often used with state-changing methods (e.g., POST, PUT, DELETE) to prevent
         * accidental overwrites when multiple user agentss might be acting in parallel on the same
         * resource (i.e., to prevent the "lost update" problem). In general, it can be used with any
         * method that involves the selection or modification of a representation to abort the request
         * if the selected representation's current entity tag is not a member within the If-Match field value.
         * When specified on an action-specific subresource, the ETag value of the resource on which the
         * action is requested should be provided.
         *
         */
        private String ifMatch = null;

        /**
         * If-Match is most often used with state-changing methods (e.g., POST, PUT, DELETE) to prevent
         * accidental overwrites when multiple user agentss might be acting in parallel on the same
         * resource (i.e., to prevent the "lost update" problem). In general, it can be used with any
         * method that involves the selection or modification of a representation to abort the request
         * if the selected representation's current entity tag is not a member within the If-Match field value.
         * When specified on an action-specific subresource, the ETag value of the resource on which the
         * action is requested should be provided.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(GetDatabaseToolsDatabaseApiGatewayConfigContentRequest o) {
            databaseToolsDatabaseApiGatewayConfigId(o.getDatabaseToolsDatabaseApiGatewayConfigId());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            ifNoneMatch(o.getIfNoneMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDatabaseToolsDatabaseApiGatewayConfigContentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetDatabaseToolsDatabaseApiGatewayConfigContentRequest
         */
        public GetDatabaseToolsDatabaseApiGatewayConfigContentRequest build() {
            GetDatabaseToolsDatabaseApiGatewayConfigContentRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDatabaseToolsDatabaseApiGatewayConfigContentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDatabaseToolsDatabaseApiGatewayConfigContentRequest
         */
        public GetDatabaseToolsDatabaseApiGatewayConfigContentRequest
                buildWithoutInvocationCallback() {
            GetDatabaseToolsDatabaseApiGatewayConfigContentRequest request =
                    new GetDatabaseToolsDatabaseApiGatewayConfigContentRequest();
            request.databaseToolsDatabaseApiGatewayConfigId =
                    databaseToolsDatabaseApiGatewayConfigId;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.ifNoneMatch = ifNoneMatch;
            return request;
            // new GetDatabaseToolsDatabaseApiGatewayConfigContentRequest(databaseToolsDatabaseApiGatewayConfigId, opcRequestId, ifMatch, ifNoneMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .databaseToolsDatabaseApiGatewayConfigId(databaseToolsDatabaseApiGatewayConfigId)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
                .ifNoneMatch(ifNoneMatch);
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
        sb.append(",databaseToolsDatabaseApiGatewayConfigId=")
                .append(String.valueOf(this.databaseToolsDatabaseApiGatewayConfigId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDatabaseToolsDatabaseApiGatewayConfigContentRequest)) {
            return false;
        }

        GetDatabaseToolsDatabaseApiGatewayConfigContentRequest other =
                (GetDatabaseToolsDatabaseApiGatewayConfigContentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.databaseToolsDatabaseApiGatewayConfigId,
                        other.databaseToolsDatabaseApiGatewayConfigId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.databaseToolsDatabaseApiGatewayConfigId == null
                                ? 43
                                : this.databaseToolsDatabaseApiGatewayConfigId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.ifNoneMatch == null ? 43 : this.ifNoneMatch.hashCode());
        return result;
    }
}

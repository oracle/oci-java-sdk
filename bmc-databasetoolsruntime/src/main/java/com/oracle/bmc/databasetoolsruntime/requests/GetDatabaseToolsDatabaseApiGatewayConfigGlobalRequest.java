/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.requests;

import com.oracle.bmc.databasetoolsruntime.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/GetDatabaseToolsDatabaseApiGatewayConfigGlobalExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
public class GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * Database Tools database API gateway config.
     */
    private String databaseToolsDatabaseApiGatewayConfigId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * Database Tools database API gateway config.
     */
    public String getDatabaseToolsDatabaseApiGatewayConfigId() {
        return databaseToolsDatabaseApiGatewayConfigId;
    }
    /** The key of the global config. */
    private com.oracle.bmc.databasetoolsruntime.model.DatabaseApiGatewayConfigGlobalKey globalKey;

    /** The key of the global config. */
    public com.oracle.bmc.databasetoolsruntime.model.DatabaseApiGatewayConfigGlobalKey
            getGlobalKey() {
        return globalKey;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * If-Match is most often used with state-changing methods (e.g., POST, PUT, DELETE) to prevent
     * accidental overwrites when multiple user agentss might be acting in parallel on the same
     * resource (i.e., to prevent the "lost update" problem). In general, it can be used with any
     * method that involves the selection or modification of a representation to abort the request
     * if the selected representation's current entity tag is not a member within the If-Match field
     * value. When specified on an action-specific subresource, the ETag value of the resource on
     * which the action is requested should be provided.
     */
    private String ifMatch;

    /**
     * If-Match is most often used with state-changing methods (e.g., POST, PUT, DELETE) to prevent
     * accidental overwrites when multiple user agentss might be acting in parallel on the same
     * resource (i.e., to prevent the "lost update" problem). In general, it can be used with any
     * method that involves the selection or modification of a representation to abort the request
     * if the selected representation's current entity tag is not a member within the If-Match field
     * value. When specified on an action-specific subresource, the ETag value of the resource on
     * which the action is requested should be provided.
     */
    public String getIfMatch() {
        return ifMatch;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * Database Tools database API gateway config.
         */
        private String databaseToolsDatabaseApiGatewayConfigId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * Database Tools database API gateway config.
         *
         * @param databaseToolsDatabaseApiGatewayConfigId the value to set
         * @return this builder instance
         */
        public Builder databaseToolsDatabaseApiGatewayConfigId(
                String databaseToolsDatabaseApiGatewayConfigId) {
            this.databaseToolsDatabaseApiGatewayConfigId = databaseToolsDatabaseApiGatewayConfigId;
            return this;
        }

        /** The key of the global config. */
        private com.oracle.bmc.databasetoolsruntime.model.DatabaseApiGatewayConfigGlobalKey
                globalKey = null;

        /**
         * The key of the global config.
         *
         * @param globalKey the value to set
         * @return this builder instance
         */
        public Builder globalKey(
                com.oracle.bmc.databasetoolsruntime.model.DatabaseApiGatewayConfigGlobalKey
                        globalKey) {
            this.globalKey = globalKey;
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
         * If-Match is most often used with state-changing methods (e.g., POST, PUT, DELETE) to
         * prevent accidental overwrites when multiple user agentss might be acting in parallel on
         * the same resource (i.e., to prevent the "lost update" problem). In general, it can be
         * used with any method that involves the selection or modification of a representation to
         * abort the request if the selected representation's current entity tag is not a member
         * within the If-Match field value. When specified on an action-specific subresource, the
         * ETag value of the resource on which the action is requested should be provided.
         */
        private String ifMatch = null;

        /**
         * If-Match is most often used with state-changing methods (e.g., POST, PUT, DELETE) to
         * prevent accidental overwrites when multiple user agentss might be acting in parallel on
         * the same resource (i.e., to prevent the "lost update" problem). In general, it can be
         * used with any method that involves the selection or modification of a representation to
         * abort the request if the selected representation's current entity tag is not a member
         * within the If-Match field value. When specified on an action-specific subresource, the
         * ETag value of the resource on which the action is requested should be provided.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest o) {
            databaseToolsDatabaseApiGatewayConfigId(o.getDatabaseToolsDatabaseApiGatewayConfigId());
            globalKey(o.getGlobalKey());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest as configured
         * by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest
         */
        public GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest build() {
            GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest as configured
         * by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest
         */
        public GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest
                buildWithoutInvocationCallback() {
            GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest request =
                    new GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest();
            request.databaseToolsDatabaseApiGatewayConfigId =
                    databaseToolsDatabaseApiGatewayConfigId;
            request.globalKey = globalKey;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new
            // GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest(databaseToolsDatabaseApiGatewayConfigId, globalKey, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .databaseToolsDatabaseApiGatewayConfigId(databaseToolsDatabaseApiGatewayConfigId)
                .globalKey(globalKey)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",databaseToolsDatabaseApiGatewayConfigId=")
                .append(String.valueOf(this.databaseToolsDatabaseApiGatewayConfigId));
        sb.append(",globalKey=").append(String.valueOf(this.globalKey));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest)) {
            return false;
        }

        GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest other =
                (GetDatabaseToolsDatabaseApiGatewayConfigGlobalRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.databaseToolsDatabaseApiGatewayConfigId,
                        other.databaseToolsDatabaseApiGatewayConfigId)
                && java.util.Objects.equals(this.globalKey, other.globalKey)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
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
        result = (result * PRIME) + (this.globalKey == null ? 43 : this.globalKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}

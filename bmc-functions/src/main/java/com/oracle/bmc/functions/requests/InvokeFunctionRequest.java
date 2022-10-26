/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.requests;

import com.oracle.bmc.functions.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/functions/InvokeFunctionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use InvokeFunctionRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class InvokeFunctionRequest extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * this function.
     */
    private String functionId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * this function.
     */
    public String getFunctionId() {
        return functionId;
    }
    /**
     * The body of the function invocation. Note: The maximum size of the request is limited. This
     * limit is currently 6MB and the endpoint will not accept requests that are bigger than this
     * limit.
     */
    private java.io.InputStream invokeFunctionBody;

    /**
     * The body of the function invocation. Note: The maximum size of the request is limited. This
     * limit is currently 6MB and the endpoint will not accept requests that are bigger than this
     * limit.
     */
    public java.io.InputStream getInvokeFunctionBody() {
        return invokeFunctionBody;
    }
    /**
     * An optional intent header that indicates to the FDK the way the event should be interpreted.
     * E.g. 'httprequest', 'cloudevent'.
     */
    private FnIntent fnIntent;

    /**
     * An optional intent header that indicates to the FDK the way the event should be interpreted.
     * E.g. 'httprequest', 'cloudevent'.
     */
    public enum FnIntent implements com.oracle.bmc.http.internal.BmcEnum {
        Httprequest("httprequest"),
        Cloudevent("cloudevent"),
        ;

        private final String value;
        private static java.util.Map<String, FnIntent> map;

        static {
            map = new java.util.HashMap<>();
            for (FnIntent v : FnIntent.values()) {
                map.put(v.getValue(), v);
            }
        }

        FnIntent(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FnIntent create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid FnIntent: " + key);
        }
    };

    /**
     * An optional intent header that indicates to the FDK the way the event should be interpreted.
     * E.g. 'httprequest', 'cloudevent'.
     */
    public FnIntent getFnIntent() {
        return fnIntent;
    }
    /**
     * Indicates whether Oracle Functions should execute the request and return the result ('sync')
     * of the execution, or whether Oracle Functions should return as soon as processing has begun
     * ('detached') and leave result handling to the function.
     */
    private FnInvokeType fnInvokeType;

    /**
     * Indicates whether Oracle Functions should execute the request and return the result ('sync')
     * of the execution, or whether Oracle Functions should return as soon as processing has begun
     * ('detached') and leave result handling to the function.
     */
    public enum FnInvokeType implements com.oracle.bmc.http.internal.BmcEnum {
        Detached("detached"),
        Sync("sync"),
        ;

        private final String value;
        private static java.util.Map<String, FnInvokeType> map;

        static {
            map = new java.util.HashMap<>();
            for (FnInvokeType v : FnInvokeType.values()) {
                map.put(v.getValue(), v);
            }
        }

        FnInvokeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FnInvokeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid FnInvokeType: " + key);
        }
    };

    /**
     * Indicates whether Oracle Functions should execute the request and return the result ('sync')
     * of the execution, or whether Oracle Functions should return as soon as processing has begun
     * ('detached') and leave result handling to the function.
     */
    public FnInvokeType getFnInvokeType() {
        return fnInvokeType;
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return invokeFunctionBody;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    InvokeFunctionRequest, java.io.InputStream> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of this function.
         */
        private String functionId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of this function.
         *
         * @param functionId the value to set
         * @return this builder instance
         */
        public Builder functionId(String functionId) {
            this.functionId = functionId;
            return this;
        }

        /**
         * The body of the function invocation. Note: The maximum size of the request is limited.
         * This limit is currently 6MB and the endpoint will not accept requests that are bigger
         * than this limit.
         */
        private java.io.InputStream invokeFunctionBody = null;

        /**
         * The body of the function invocation. Note: The maximum size of the request is limited.
         * This limit is currently 6MB and the endpoint will not accept requests that are bigger
         * than this limit.
         *
         * @param invokeFunctionBody the value to set
         * @return this builder instance
         */
        public Builder invokeFunctionBody(java.io.InputStream invokeFunctionBody) {
            this.invokeFunctionBody = invokeFunctionBody;
            return this;
        }

        /**
         * An optional intent header that indicates to the FDK the way the event should be
         * interpreted. E.g. 'httprequest', 'cloudevent'.
         */
        private FnIntent fnIntent = null;

        /**
         * An optional intent header that indicates to the FDK the way the event should be
         * interpreted. E.g. 'httprequest', 'cloudevent'.
         *
         * @param fnIntent the value to set
         * @return this builder instance
         */
        public Builder fnIntent(FnIntent fnIntent) {
            this.fnIntent = fnIntent;
            return this;
        }

        /**
         * Indicates whether Oracle Functions should execute the request and return the result
         * ('sync') of the execution, or whether Oracle Functions should return as soon as
         * processing has begun ('detached') and leave result handling to the function.
         */
        private FnInvokeType fnInvokeType = null;

        /**
         * Indicates whether Oracle Functions should execute the request and return the result
         * ('sync') of the execution, or whether Oracle Functions should return as soon as
         * processing has begun ('detached') and leave result handling to the function.
         *
         * @param fnInvokeType the value to set
         * @return this builder instance
         */
        public Builder fnInvokeType(FnInvokeType fnInvokeType) {
            this.fnInvokeType = fnInvokeType;
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
        public Builder copy(InvokeFunctionRequest o) {
            functionId(o.getFunctionId());
            invokeFunctionBody(o.getInvokeFunctionBody());
            fnIntent(o.getFnIntent());
            fnInvokeType(o.getFnInvokeType());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of InvokeFunctionRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of InvokeFunctionRequest
         */
        public InvokeFunctionRequest build() {
            InvokeFunctionRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(java.io.InputStream body) {
            invokeFunctionBody(body);
            return this;
        }

        /**
         * Build the instance of InvokeFunctionRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of InvokeFunctionRequest
         */
        public InvokeFunctionRequest buildWithoutInvocationCallback() {
            InvokeFunctionRequest request = new InvokeFunctionRequest();
            request.functionId = functionId;
            request.invokeFunctionBody = invokeFunctionBody;
            request.fnIntent = fnIntent;
            request.fnInvokeType = fnInvokeType;
            request.opcRequestId = opcRequestId;
            return request;
            // new InvokeFunctionRequest(functionId, invokeFunctionBody, fnIntent, fnInvokeType,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .functionId(functionId)
                .invokeFunctionBody(invokeFunctionBody)
                .fnIntent(fnIntent)
                .fnInvokeType(fnInvokeType)
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
        sb.append(",functionId=").append(String.valueOf(this.functionId));
        sb.append(",invokeFunctionBody=").append(String.valueOf(this.invokeFunctionBody));
        sb.append(",fnIntent=").append(String.valueOf(this.fnIntent));
        sb.append(",fnInvokeType=").append(String.valueOf(this.fnInvokeType));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InvokeFunctionRequest)) {
            return false;
        }

        InvokeFunctionRequest other = (InvokeFunctionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.functionId, other.functionId)
                && java.util.Objects.equals(this.invokeFunctionBody, other.invokeFunctionBody)
                && java.util.Objects.equals(this.fnIntent, other.fnIntent)
                && java.util.Objects.equals(this.fnInvokeType, other.fnInvokeType)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.functionId == null ? 43 : this.functionId.hashCode());
        result =
                (result * PRIME)
                        + (this.invokeFunctionBody == null
                                ? 43
                                : this.invokeFunctionBody.hashCode());
        result = (result * PRIME) + (this.fnIntent == null ? 43 : this.fnIntent.hashCode());
        result = (result * PRIME) + (this.fnInvokeType == null ? 43 : this.fnInvokeType.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

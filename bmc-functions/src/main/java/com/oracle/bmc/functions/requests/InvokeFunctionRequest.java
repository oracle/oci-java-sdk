/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.requests;

import com.oracle.bmc.functions.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/functions/InvokeFunctionExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use InvokeFunctionRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class InvokeFunctionRequest extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of this function.
     *
     */
    private String functionId;

    /**
     * The body of the function invocation.
     * Note: The maximum size of the request is limited. This limit is currently 6MB and the endpoint will not accept requests that are bigger than this limit.
     *
     */
    private java.io.InputStream invokeFunctionBody;

    /**
     * An optional intent header that indicates to the FDK the way the event should be interpreted. E.g. 'httprequest', 'cloudevent'.
     *
     */
    private FnIntent fnIntent;

    /**
     * An optional intent header that indicates to the FDK the way the event should be interpreted. E.g. 'httprequest', 'cloudevent'.
     *
     **/
    public enum FnIntent {
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
     * Indicates whether the functions platform should execute the request directly and return the result ('sync') or
     * whether the platform should enqueue the request for later processing and acknowledge that it has been processed ('detached').
     *
     */
    private FnInvokeType fnInvokeType;

    /**
     * Indicates whether the functions platform should execute the request directly and return the result ('sync') or
     * whether the platform should enqueue the request for later processing and acknowledge that it has been processed ('detached').
     *
     **/
    public enum FnInvokeType {
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
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Alternative accessor for the body parameter.
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
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
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
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(java.io.InputStream body) {
            invokeFunctionBody(body);
            return this;
        }
    }
}

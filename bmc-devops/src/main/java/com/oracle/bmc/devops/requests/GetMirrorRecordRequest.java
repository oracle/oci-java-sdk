/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/GetMirrorRecordExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetMirrorRecordRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetMirrorRecordRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique repository identifier.
     */
    private String repositoryId;

    /**
     * The field of mirror record type. Only one mirror record type can be provided:
     * current - The current mirror record.
     * lastSuccessful - The last successful mirror record.
     *
     */
    private MirrorRecordType mirrorRecordType;

    /**
     * The field of mirror record type. Only one mirror record type can be provided:
     * current - The current mirror record.
     * lastSuccessful - The last successful mirror record.
     *
     **/
    public enum MirrorRecordType {
        Current("current"),
        LastSuccessful("lastSuccessful"),
        ;

        private final String value;
        private static java.util.Map<String, MirrorRecordType> map;

        static {
            map = new java.util.HashMap<>();
            for (MirrorRecordType v : MirrorRecordType.values()) {
                map.put(v.getValue(), v);
            }
        }

        MirrorRecordType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MirrorRecordType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid MirrorRecordType: " + key);
        }
    };
    /**
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetMirrorRecordRequest, java.lang.Void> {
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
        public Builder copy(GetMirrorRecordRequest o) {
            repositoryId(o.getRepositoryId());
            mirrorRecordType(o.getMirrorRecordType());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetMirrorRecordRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetMirrorRecordRequest
         */
        public GetMirrorRecordRequest build() {
            GetMirrorRecordRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}

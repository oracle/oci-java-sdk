/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/GetMirrorRecordExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetMirrorRecordRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class GetMirrorRecordRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique repository identifier.
     */
    private String repositoryId;

    public String getRepositoryId() {
        return repositoryId;
    }
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

    public MirrorRecordType getMirrorRecordType() {
        return mirrorRecordType;
    }
    /**
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetMirrorRecordRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String repositoryId = null;

        /**
         * Unique repository identifier.
         * @return this builder instance
         */
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }

        private MirrorRecordType mirrorRecordType = null;

        /**
         * The field of mirror record type. Only one mirror record type can be provided:
         * current - The current mirror record.
         * lastSuccessful - The last successful mirror record.
         *
         * @return this builder instance
         */
        public Builder mirrorRecordType(MirrorRecordType mirrorRecordType) {
            this.mirrorRecordType = mirrorRecordType;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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

        /**
         * Build the instance of GetMirrorRecordRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetMirrorRecordRequest
         */
        public GetMirrorRecordRequest buildWithoutInvocationCallback() {
            GetMirrorRecordRequest request = new GetMirrorRecordRequest();
            request.repositoryId = repositoryId;
            request.mirrorRecordType = mirrorRecordType;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetMirrorRecordRequest(repositoryId, mirrorRecordType, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .repositoryId(repositoryId)
                .mirrorRecordType(mirrorRecordType)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",repositoryId=").append(String.valueOf(this.repositoryId));
        sb.append(",mirrorRecordType=").append(String.valueOf(this.mirrorRecordType));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetMirrorRecordRequest)) {
            return false;
        }

        GetMirrorRecordRequest other = (GetMirrorRecordRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.mirrorRecordType, other.mirrorRecordType)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
        result =
                (result * PRIME)
                        + (this.mirrorRecordType == null ? 43 : this.mirrorRecordType.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

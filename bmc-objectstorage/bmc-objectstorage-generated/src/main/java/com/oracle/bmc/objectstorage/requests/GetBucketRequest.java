/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/GetBucketExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetBucketRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetBucketRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The Object Storage namespace used for the request. */
    private String namespaceName;

    /** The Object Storage namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * The name of the bucket. Avoid entering confidential information. Example: {@code
     * my-new-bucket1}
     */
    private String bucketName;

    /**
     * The name of the bucket. Avoid entering confidential information. Example: {@code
     * my-new-bucket1}
     */
    public String getBucketName() {
        return bucketName;
    }
    /**
     * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag
     * matches the ETag of the existing resource, GET and HEAD requests will return the resource and
     * PUT and POST requests will upload the resource.
     */
    private String ifMatch;

    /**
     * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag
     * matches the ETag of the existing resource, GET and HEAD requests will return the resource and
     * PUT and POST requests will upload the resource.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The entity tag (ETag) to avoid matching. Wildcards ('*') are not allowed. If the specified
     * ETag does not match the ETag of the existing resource, the request returns the expected
     * response. If the ETag matches the ETag of the existing resource, the request returns an HTTP
     * 304 status without a response body.
     */
    private String ifNoneMatch;

    /**
     * The entity tag (ETag) to avoid matching. Wildcards ('*') are not allowed. If the specified
     * ETag does not match the ETag of the existing resource, the request returns the expected
     * response. If the ETag matches the ETag of the existing resource, the request returns an HTTP
     * 304 status without a response body.
     */
    public String getIfNoneMatch() {
        return ifNoneMatch;
    }
    /** The client request ID for tracing. */
    private String opcClientRequestId;

    /** The client request ID for tracing. */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }
    /**
     * Bucket summary includes the 'namespace', 'name', 'compartmentId', 'createdBy', 'timeCreated',
     * and 'etag' fields. This parameter can also include 'approximateCount' (approximate number of
     * objects), 'approximateSize' (total approximate size in bytes of all objects) and
     * 'autoTiering' (state of auto tiering on the bucket). For example
     * 'approximateCount,approximateSize,autoTiering'.
     */
    private java.util.List<Fields> fields;

    /**
     * Bucket summary includes the 'namespace', 'name', 'compartmentId', 'createdBy', 'timeCreated',
     * and 'etag' fields. This parameter can also include 'approximateCount' (approximate number of
     * objects), 'approximateSize' (total approximate size in bytes of all objects) and
     * 'autoTiering' (state of auto tiering on the bucket). For example
     * 'approximateCount,approximateSize,autoTiering'.
     */
    public enum Fields implements com.oracle.bmc.http.internal.BmcEnum {
        ApproximateCount("approximateCount"),
        ApproximateSize("approximateSize"),
        AutoTiering("autoTiering"),
        ;

        private final String value;
        private static java.util.Map<String, Fields> map;

        static {
            map = new java.util.HashMap<>();
            for (Fields v : Fields.values()) {
                map.put(v.getValue(), v);
            }
        }

        Fields(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Fields create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Fields: " + key);
        }
    };

    /**
     * Bucket summary includes the 'namespace', 'name', 'compartmentId', 'createdBy', 'timeCreated',
     * and 'etag' fields. This parameter can also include 'approximateCount' (approximate number of
     * objects), 'approximateSize' (total approximate size in bytes of all objects) and
     * 'autoTiering' (state of auto tiering on the bucket). For example
     * 'approximateCount,approximateSize,autoTiering'.
     */
    public java.util.List<Fields> getFields() {
        return fields;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetBucketRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Object Storage namespace used for the request. */
        private String namespaceName = null;

        /**
         * The Object Storage namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * The name of the bucket. Avoid entering confidential information. Example: {@code
         * my-new-bucket1}
         */
        private String bucketName = null;

        /**
         * The name of the bucket. Avoid entering confidential information. Example: {@code
         * my-new-bucket1}
         *
         * @param bucketName the value to set
         * @return this builder instance
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * The entity tag (ETag) to match with the ETag of an existing resource. If the specified
         * ETag matches the ETag of the existing resource, GET and HEAD requests will return the
         * resource and PUT and POST requests will upload the resource.
         */
        private String ifMatch = null;

        /**
         * The entity tag (ETag) to match with the ETag of an existing resource. If the specified
         * ETag matches the ETag of the existing resource, GET and HEAD requests will return the
         * resource and PUT and POST requests will upload the resource.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The entity tag (ETag) to avoid matching. Wildcards ('*') are not allowed. If the
         * specified ETag does not match the ETag of the existing resource, the request returns the
         * expected response. If the ETag matches the ETag of the existing resource, the request
         * returns an HTTP 304 status without a response body.
         */
        private String ifNoneMatch = null;

        /**
         * The entity tag (ETag) to avoid matching. Wildcards ('*') are not allowed. If the
         * specified ETag does not match the ETag of the existing resource, the request returns the
         * expected response. If the ETag matches the ETag of the existing resource, the request
         * returns an HTTP 304 status without a response body.
         *
         * @param ifNoneMatch the value to set
         * @return this builder instance
         */
        public Builder ifNoneMatch(String ifNoneMatch) {
            this.ifNoneMatch = ifNoneMatch;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcClientRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcClientRequestId the value to set
         * @return this builder instance
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        /**
         * Bucket summary includes the 'namespace', 'name', 'compartmentId', 'createdBy',
         * 'timeCreated', and 'etag' fields. This parameter can also include 'approximateCount'
         * (approximate number of objects), 'approximateSize' (total approximate size in bytes of
         * all objects) and 'autoTiering' (state of auto tiering on the bucket). For example
         * 'approximateCount,approximateSize,autoTiering'.
         */
        private java.util.List<Fields> fields = null;

        /**
         * Bucket summary includes the 'namespace', 'name', 'compartmentId', 'createdBy',
         * 'timeCreated', and 'etag' fields. This parameter can also include 'approximateCount'
         * (approximate number of objects), 'approximateSize' (total approximate size in bytes of
         * all objects) and 'autoTiering' (state of auto tiering on the bucket). For example
         * 'approximateCount,approximateSize,autoTiering'.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Bucket summary includes the 'namespace', 'name', 'compartmentId',
         * 'createdBy', 'timeCreated', and 'etag' fields. This parameter can also include
         * 'approximateCount' (approximate number of objects), 'approximateSize' (total approximate
         * size in bytes of all objects) and 'autoTiering' (state of auto tiering on the bucket).
         * For example 'approximateCount,approximateSize,autoTiering'.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fields(Fields singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
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
        public Builder copy(GetBucketRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            ifMatch(o.getIfMatch());
            ifNoneMatch(o.getIfNoneMatch());
            opcClientRequestId(o.getOpcClientRequestId());
            fields(o.getFields());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetBucketRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetBucketRequest
         */
        public GetBucketRequest build() {
            GetBucketRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetBucketRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetBucketRequest
         */
        public GetBucketRequest buildWithoutInvocationCallback() {
            GetBucketRequest request = new GetBucketRequest();
            request.namespaceName = namespaceName;
            request.bucketName = bucketName;
            request.ifMatch = ifMatch;
            request.ifNoneMatch = ifNoneMatch;
            request.opcClientRequestId = opcClientRequestId;
            request.fields = fields;
            return request;
            // new GetBucketRequest(namespaceName, bucketName, ifMatch, ifNoneMatch,
            // opcClientRequestId, fields);
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
                .bucketName(bucketName)
                .ifMatch(ifMatch)
                .ifNoneMatch(ifNoneMatch)
                .opcClientRequestId(opcClientRequestId)
                .fields(fields);
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
        sb.append(",bucketName=").append(String.valueOf(this.bucketName));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetBucketRequest)) {
            return false;
        }

        GetBucketRequest other = (GetBucketRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.fields, other.fields);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.ifNoneMatch == null ? 43 : this.ifNoneMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        return result;
    }
}

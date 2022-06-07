/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/ListObjectsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListObjectsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListObjectsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Object Storage namespace used for the request.
     */
    private String namespaceName;

    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * The name of the bucket. Avoid entering confidential information.
     * Example: {@code my-new-bucket1}
     *
     */
    private String bucketName;

    public String getBucketName() {
        return bucketName;
    }
    /**
     * The string to use for matching against the start of object names in a list query.
     */
    private String prefix;

    public String getPrefix() {
        return prefix;
    }
    /**
     * Object names returned by a list query must be greater or equal to this parameter.
     */
    private String start;

    public String getStart() {
        return start;
    }
    /**
     * Object names returned by a list query must be strictly less than this parameter.
     */
    private String end;

    public String getEnd() {
        return end;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated
     * "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * When this parameter is set, only objects whose names do not contain the delimiter character
     * (after an optionally specified prefix) are returned in the objects key of the response body.
     * Scanned objects whose names contain the delimiter have the part of their name up to the first
     * occurrence of the delimiter (including the optional prefix) returned as a set of prefixes.
     * Note that only '/' is a supported delimiter character at this time.
     *
     */
    private String delimiter;

    public String getDelimiter() {
        return delimiter;
    }
    /**
     * Object summary by default includes only the 'name' field. Use this parameter to also
     * include 'size' (object size in bytes), 'etag', 'md5', 'timeCreated' (object creation date and time),
     * 'timeModified' (object modification date and time), 'storageTier' and 'archivalState' fields.
     * Specify the value of this parameter as a comma-separated, case-insensitive list of those field names.
     * For example 'name,etag,timeCreated,md5,timeModified,storageTier,archivalState'.
     *
     */
    private String fields;

    public String getFields() {
        return fields;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcClientRequestId;

    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }
    /**
     * Object names returned by a list query must be greater than this parameter.
     */
    private String startAfter;

    public String getStartAfter() {
        return startAfter;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListObjectsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String namespaceName = null;

        /**
         * The Object Storage namespace used for the request.
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        private String bucketName = null;

        /**
         * The name of the bucket. Avoid entering confidential information.
         * Example: {@code my-new-bucket1}
         *
         * @return this builder instance
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        private String prefix = null;

        /**
         * The string to use for matching against the start of object names in a list query.
         * @return this builder instance
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        private String start = null;

        /**
         * Object names returned by a list query must be greater or equal to this parameter.
         * @return this builder instance
         */
        public Builder start(String start) {
            this.start = start;
            return this;
        }

        private String end = null;

        /**
         * Object names returned by a list query must be strictly less than this parameter.
         * @return this builder instance
         */
        public Builder end(String end) {
            this.end = end;
            return this;
        }

        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated
         * "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private String delimiter = null;

        /**
         * When this parameter is set, only objects whose names do not contain the delimiter character
         * (after an optionally specified prefix) are returned in the objects key of the response body.
         * Scanned objects whose names contain the delimiter have the part of their name up to the first
         * occurrence of the delimiter (including the optional prefix) returned as a set of prefixes.
         * Note that only '/' is a supported delimiter character at this time.
         *
         * @return this builder instance
         */
        public Builder delimiter(String delimiter) {
            this.delimiter = delimiter;
            return this;
        }

        private String fields = null;

        /**
         * Object summary by default includes only the 'name' field. Use this parameter to also
         * include 'size' (object size in bytes), 'etag', 'md5', 'timeCreated' (object creation date and time),
         * 'timeModified' (object modification date and time), 'storageTier' and 'archivalState' fields.
         * Specify the value of this parameter as a comma-separated, case-insensitive list of those field names.
         * For example 'name,etag,timeCreated,md5,timeModified,storageTier,archivalState'.
         *
         * @return this builder instance
         */
        public Builder fields(String fields) {
            this.fields = fields;
            return this;
        }

        private String opcClientRequestId = null;

        /**
         * The client request ID for tracing.
         * @return this builder instance
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        private String startAfter = null;

        /**
         * Object names returned by a list query must be greater than this parameter.
         * @return this builder instance
         */
        public Builder startAfter(String startAfter) {
            this.startAfter = startAfter;
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
        public Builder copy(ListObjectsRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            prefix(o.getPrefix());
            start(o.getStart());
            end(o.getEnd());
            limit(o.getLimit());
            delimiter(o.getDelimiter());
            fields(o.getFields());
            opcClientRequestId(o.getOpcClientRequestId());
            startAfter(o.getStartAfter());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListObjectsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListObjectsRequest
         */
        public ListObjectsRequest build() {
            ListObjectsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListObjectsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListObjectsRequest
         */
        public ListObjectsRequest buildWithoutInvocationCallback() {
            ListObjectsRequest request = new ListObjectsRequest();
            request.namespaceName = namespaceName;
            request.bucketName = bucketName;
            request.prefix = prefix;
            request.start = start;
            request.end = end;
            request.limit = limit;
            request.delimiter = delimiter;
            request.fields = fields;
            request.opcClientRequestId = opcClientRequestId;
            request.startAfter = startAfter;
            return request;
            // new ListObjectsRequest(namespaceName, bucketName, prefix, start, end, limit, delimiter, fields, opcClientRequestId, startAfter);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .bucketName(bucketName)
                .prefix(prefix)
                .start(start)
                .end(end)
                .limit(limit)
                .delimiter(delimiter)
                .fields(fields)
                .opcClientRequestId(opcClientRequestId)
                .startAfter(startAfter);
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
        sb.append(",bucketName=").append(String.valueOf(this.bucketName));
        sb.append(",prefix=").append(String.valueOf(this.prefix));
        sb.append(",start=").append(String.valueOf(this.start));
        sb.append(",end=").append(String.valueOf(this.end));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",delimiter=").append(String.valueOf(this.delimiter));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(",startAfter=").append(String.valueOf(this.startAfter));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListObjectsRequest)) {
            return false;
        }

        ListObjectsRequest other = (ListObjectsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.start, other.start)
                && java.util.Objects.equals(this.end, other.end)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.delimiter, other.delimiter)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.startAfter, other.startAfter);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result = (result * PRIME) + (this.start == null ? 43 : this.start.hashCode());
        result = (result * PRIME) + (this.end == null ? 43 : this.end.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.delimiter == null ? 43 : this.delimiter.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.startAfter == null ? 43 : this.startAfter.hashCode());
        return result;
    }
}

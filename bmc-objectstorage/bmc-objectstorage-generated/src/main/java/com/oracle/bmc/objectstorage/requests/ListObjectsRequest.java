/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ListObjectsRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The top-level namespace used for the request.
     */
    private String namespaceName;

    /**
     * The name of the bucket. Avoid entering confidential information.
     * Example: `my-new-bucket1`
     *
     */
    private String bucketName;

    /**
     * The string to use for matching against the start of object names in a list query.
     */
    private String prefix;

    /**
     * Object names returned by a list query must be greater or equal to this parameter.
     */
    private String start;

    /**
     * Object names returned by a list query must be strictly less than this parameter.
     */
    private String end;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * When this parameter is set, only objects whose names do not contain the delimiter character
     * (after an optionally specified prefix) are returned in the objects key of the response body.
     * Scanned objects whose names contain the delimiter have the part of their name up to the first
     * occurrence of the delimiter (including the optional prefix) returned as a set of prefixes.
     * Note that only '/' is a supported delimiter character at this time.
     *
     */
    private String delimiter;

    /**
     * Object summary in list of objects includes the 'name' field. This parameter can also include 'size'
     * (object size in bytes), 'md5', and 'timeCreated' (object creation date and time) fields.
     * Value of this parameter should be a comma-separated, case-insensitive list of those field names.
     * For example 'name,timeCreated,md5'.
     *
     */
    private String fields;

    /**
     * The client request ID for tracing.
     */
    private String opcClientRequestId;

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;

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
            return request;
        }
    }
}

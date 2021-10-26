/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/ListCommitsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListCommitsRequest.
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
public class ListCommitsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * unique Repository identifier.
     */
    private String repositoryId;

    /**
     * A filter to return only resources that match the given Ref name.
     */
    private String refName;

    /**
     * A filter to exclude commits that match the given Ref name.
     */
    private String excludeRefName;

    /**
     * A filter to return only commits that affect any of the specified paths.
     */
    private String filePath;

    /**
     * A filter to return commits only created after the specified timestamp value.
     */
    private java.util.Date timestampGreaterThanOrEqualTo;

    /**
     * A filter to return commits only created before the specified timestamp value.
     */
    private java.util.Date timestampLessThanOrEqualTo;

    /**
     * A filter to return any commits that contains the given message.
     */
    private String commitMessage;

    /**
     * A filter to return any commits that are pushed by the requested author.
     */
    private String authorName;

    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCommitsRequest, java.lang.Void> {
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
        public Builder copy(ListCommitsRequest o) {
            repositoryId(o.getRepositoryId());
            refName(o.getRefName());
            excludeRefName(o.getExcludeRefName());
            filePath(o.getFilePath());
            timestampGreaterThanOrEqualTo(o.getTimestampGreaterThanOrEqualTo());
            timestampLessThanOrEqualTo(o.getTimestampLessThanOrEqualTo());
            commitMessage(o.getCommitMessage());
            authorName(o.getAuthorName());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCommitsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListCommitsRequest
         */
        public ListCommitsRequest build() {
            ListCommitsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}

/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UploadLogEventsFileExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UploadLogEventsFileRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class UploadLogEventsFileRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    /**
     * The log group OCID that gets mapped to the uploaded logs.
     *
     */
    private String logGroupId;

    /**
     * Log events data to be uploaded. The data could be uploaded with or without logSet information depending on whether logSet is enabled for the tenancy or not. Supported formats include
     * 1. json file : logSet (if needed) should be sent as \"logSet\" query parameter
     * 2. gzip file : logSet (if needed) should be sent as \"logSet\" query parameter
     * 3. zip file : containing multiple json files. LogSet information (if needed) should be appended to every filename in the zip.
     *    Supported filename format with logSet detail is &lt;filename&gt;_logSet=&lt;logset&gt;.json
     *
     */
    private java.io.InputStream uploadLogEventsFileDetails;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The log set that gets associated with the uploaded logs.
     *
     */
    private String logSet;

    /**
     * Identifies the type of request payload.
     *
     */
    private com.oracle.bmc.loganalytics.model.PayloadType payloadType;

    /**
     * The content type of the log data.
     */
    private String contentType;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return uploadLogEventsFileDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UploadLogEventsFileRequest, java.io.InputStream> {
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
        public Builder copy(UploadLogEventsFileRequest o) {
            namespaceName(o.getNamespaceName());
            logGroupId(o.getLogGroupId());
            uploadLogEventsFileDetails(o.getUploadLogEventsFileDetails());
            opcRequestId(o.getOpcRequestId());
            logSet(o.getLogSet());
            payloadType(o.getPayloadType());
            contentType(o.getContentType());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UploadLogEventsFileRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UploadLogEventsFileRequest
         */
        public UploadLogEventsFileRequest build() {
            UploadLogEventsFileRequest request = buildWithoutInvocationCallback();
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
            uploadLogEventsFileDetails(body);
            return this;
        }
    }
}

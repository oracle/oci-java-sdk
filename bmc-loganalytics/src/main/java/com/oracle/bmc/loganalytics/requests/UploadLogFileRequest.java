/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UploadLogFileExample.java.html">here</a> to see how to use UploadLogFileRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class UploadLogFileRequest extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    /**
     * The name of the upload. This can be considered as a container name where different kind of logs will be collected and searched together. This upload name/id can further be used for retrieving the details of the upload, including its status or deleting the upload.
     *
     */
    private String uploadName;

    /**
     * Name of the log source that will be used to process the files being uploaded.
     *
     */
    private String logSourceName;

    /**
     * The name of the file being uploaded. The extension of the filename part will be used to detect the type of file (like zip, tar).
     *
     */
    private String filename;

    /**
     * The log group OCID to which the log data in this upload will be mapped to.
     *
     */
    private String opcMetaLoggrpid;

    /**
     * Log data
     */
    private java.io.InputStream uploadLogFileBody;

    /**
     * The entity OCID.
     *
     */
    private String entityId;

    /**
     * Timezone to be used when processing log entries whose timestamps do not include an explicit timezone. When this property is not specified, the timezone of the entity specified is used. If the entity is also not specified or do not have a valid timezone then UTC is used
     *
     */
    private String timezone;

    /**
     * Character Encoding
     */
    private String charEncoding;

    /**
     * This property is used to specify the format of the date. This is to be used for ambiguous dates like 12/11/10. This property can take any of the following values -  MONTH_DAY_YEAR, DAY_MONTH_YEAR, YEAR_MONTH_DAY, MONTH_DAY, DAY_MONTH.
     *
     */
    private String dateFormat;

    /**
     * Used to indicate the year where the log entries timestamp do not mention year (Ex: Nov  8 20:45:56).
     *
     */
    private String dateYear;

    /**
     * This property can be used to reset configuration cache in case of an issue with the upload.
     */
    private Boolean invalidateCache;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The base-64 encoded MD5 hash of the body. If the Content-MD5 header is present, Logging Analytics performs an integrity check
     * on the body of the HTTP request by computing the MD5 hash for the body and comparing it to the MD5 hash supplied in the header.
     * If the two hashes do not match, the log data is rejected and an HTTP-400 Unmatched Content MD5 error is returned with the message:
     * <p>
     * \"The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5 header (HEADER_MD5)\"
     *
     */
    private String contentMd5;

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
        return uploadLogFileBody;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UploadLogFileRequest, java.io.InputStream> {
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
        public Builder copy(UploadLogFileRequest o) {
            namespaceName(o.getNamespaceName());
            uploadName(o.getUploadName());
            logSourceName(o.getLogSourceName());
            filename(o.getFilename());
            opcMetaLoggrpid(o.getOpcMetaLoggrpid());
            uploadLogFileBody(o.getUploadLogFileBody());
            entityId(o.getEntityId());
            timezone(o.getTimezone());
            charEncoding(o.getCharEncoding());
            dateFormat(o.getDateFormat());
            dateYear(o.getDateYear());
            invalidateCache(o.getInvalidateCache());
            opcRequestId(o.getOpcRequestId());
            contentMd5(o.getContentMd5());
            contentType(o.getContentType());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UploadLogFileRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UploadLogFileRequest
         */
        public UploadLogFileRequest build() {
            UploadLogFileRequest request = buildWithoutInvocationCallback();
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
            uploadLogFileBody(body);
            return this;
        }
    }
}

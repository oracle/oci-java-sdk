/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UploadLogFileExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UploadLogFileRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class UploadLogFileRequest extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * The name of the upload. This can be considered as a container name where different kind of
     * logs will be collected and searched together. This upload name/id can further be used for
     * retrieving the details of the upload, including its status or deleting the upload.
     */
    private String uploadName;

    /**
     * The name of the upload. This can be considered as a container name where different kind of
     * logs will be collected and searched together. This upload name/id can further be used for
     * retrieving the details of the upload, including its status or deleting the upload.
     */
    public String getUploadName() {
        return uploadName;
    }
    /** Name of the log source that will be used to process the files being uploaded. */
    private String logSourceName;

    /** Name of the log source that will be used to process the files being uploaded. */
    public String getLogSourceName() {
        return logSourceName;
    }
    /**
     * The name of the file being uploaded. The extension of the filename part will be used to
     * detect the type of file (like zip, tar).
     */
    private String filename;

    /**
     * The name of the file being uploaded. The extension of the filename part will be used to
     * detect the type of file (like zip, tar).
     */
    public String getFilename() {
        return filename;
    }
    /** The log group OCID to which the log data in this upload will be mapped to. */
    private String opcMetaLoggrpid;

    /** The log group OCID to which the log data in this upload will be mapped to. */
    public String getOpcMetaLoggrpid() {
        return opcMetaLoggrpid;
    }
    /** Log data */
    private java.io.InputStream uploadLogFileBody;

    /** Log data */
    public java.io.InputStream getUploadLogFileBody() {
        return uploadLogFileBody;
    }
    /** The entity OCID. */
    private String entityId;

    /** The entity OCID. */
    public String getEntityId() {
        return entityId;
    }
    /**
     * Timezone to be used when processing log entries whose timestamps do not include an explicit
     * timezone. When this property is not specified, the timezone of the entity specified is used.
     * If the entity is also not specified or do not have a valid timezone then UTC is used
     */
    private String timezone;

    /**
     * Timezone to be used when processing log entries whose timestamps do not include an explicit
     * timezone. When this property is not specified, the timezone of the entity specified is used.
     * If the entity is also not specified or do not have a valid timezone then UTC is used
     */
    public String getTimezone() {
        return timezone;
    }
    /**
     * Character encoding to be used to detect the encoding type of file(s) being uploaded. When
     * this property is not specified, system detected character encoding will be used.
     */
    private String charEncoding;

    /**
     * Character encoding to be used to detect the encoding type of file(s) being uploaded. When
     * this property is not specified, system detected character encoding will be used.
     */
    public String getCharEncoding() {
        return charEncoding;
    }
    /**
     * This property is used to specify the format of the date. This is to be used for ambiguous
     * dates like 12/11/10. This property can take any of the following values - MONTH_DAY_YEAR,
     * DAY_MONTH_YEAR, YEAR_MONTH_DAY, MONTH_DAY, DAY_MONTH.
     */
    private String dateFormat;

    /**
     * This property is used to specify the format of the date. This is to be used for ambiguous
     * dates like 12/11/10. This property can take any of the following values - MONTH_DAY_YEAR,
     * DAY_MONTH_YEAR, YEAR_MONTH_DAY, MONTH_DAY, DAY_MONTH.
     */
    public String getDateFormat() {
        return dateFormat;
    }
    /**
     * Used to indicate the year where the log entries timestamp do not mention year (Ex: Nov 8
     * 20:45:56).
     */
    private String dateYear;

    /**
     * Used to indicate the year where the log entries timestamp do not mention year (Ex: Nov 8
     * 20:45:56).
     */
    public String getDateYear() {
        return dateYear;
    }
    /**
     * This property can be used to reset configuration cache in case of an issue with the upload.
     */
    private Boolean invalidateCache;

    /**
     * This property can be used to reset configuration cache in case of an issue with the upload.
     */
    public Boolean getInvalidateCache() {
        return invalidateCache;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The base-64 encoded MD5 hash of the body. If the Content-MD5 header is present, Logging
     * Analytics performs an integrity check on the body of the HTTP request by computing the MD5
     * hash for the body and comparing it to the MD5 hash supplied in the header. If the two hashes
     * do not match, the log data is rejected and an HTTP-400 Unmatched Content MD5 error is
     * returned with the message:
     *
     * <p>"The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5 header
     * (HEADER_MD5)"
     */
    private String contentMd5;

    /**
     * The base-64 encoded MD5 hash of the body. If the Content-MD5 header is present, Logging
     * Analytics performs an integrity check on the body of the HTTP request by computing the MD5
     * hash for the body and comparing it to the MD5 hash supplied in the header. If the two hashes
     * do not match, the log data is rejected and an HTTP-400 Unmatched Content MD5 error is
     * returned with the message:
     *
     * <p>"The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5 header
     * (HEADER_MD5)"
     */
    public String getContentMd5() {
        return contentMd5;
    }
    /** The content type of the log data. */
    private String contentType;

    /** The content type of the log data. */
    public String getContentType() {
        return contentType;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /** The log set that gets associated with the uploaded logs. */
    private String logSet;

    /** The log set that gets associated with the uploaded logs. */
    public String getLogSet() {
        return logSet;
    }
    /**
     * A value of {@code 100-continue} requests preliminary verification of the request method,
     * path, and headers before the request body is sent. If no error results from such
     * verification, the server will send a 100 (Continue) interim response to indicate readiness
     * for the request body. The only allowed value for this parameter is "100-Continue"
     * (case-insensitive).
     */
    private String expect;

    /**
     * A value of {@code 100-continue} requests preliminary verification of the request method,
     * path, and headers before the request body is sent. If no error results from such
     * verification, the server will send a 100 (Continue) interim response to indicate readiness
     * for the request body. The only allowed value for this parameter is "100-Continue"
     * (case-insensitive).
     */
    public String getExpect() {
        return expect;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return uploadLogFileBody;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UploadLogFileRequest, java.io.InputStream> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Logging Analytics namespace used for the request. */
        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * The name of the upload. This can be considered as a container name where different kind
         * of logs will be collected and searched together. This upload name/id can further be used
         * for retrieving the details of the upload, including its status or deleting the upload.
         */
        private String uploadName = null;

        /**
         * The name of the upload. This can be considered as a container name where different kind
         * of logs will be collected and searched together. This upload name/id can further be used
         * for retrieving the details of the upload, including its status or deleting the upload.
         *
         * @param uploadName the value to set
         * @return this builder instance
         */
        public Builder uploadName(String uploadName) {
            this.uploadName = uploadName;
            return this;
        }

        /** Name of the log source that will be used to process the files being uploaded. */
        private String logSourceName = null;

        /**
         * Name of the log source that will be used to process the files being uploaded.
         *
         * @param logSourceName the value to set
         * @return this builder instance
         */
        public Builder logSourceName(String logSourceName) {
            this.logSourceName = logSourceName;
            return this;
        }

        /**
         * The name of the file being uploaded. The extension of the filename part will be used to
         * detect the type of file (like zip, tar).
         */
        private String filename = null;

        /**
         * The name of the file being uploaded. The extension of the filename part will be used to
         * detect the type of file (like zip, tar).
         *
         * @param filename the value to set
         * @return this builder instance
         */
        public Builder filename(String filename) {
            this.filename = filename;
            return this;
        }

        /** The log group OCID to which the log data in this upload will be mapped to. */
        private String opcMetaLoggrpid = null;

        /**
         * The log group OCID to which the log data in this upload will be mapped to.
         *
         * @param opcMetaLoggrpid the value to set
         * @return this builder instance
         */
        public Builder opcMetaLoggrpid(String opcMetaLoggrpid) {
            this.opcMetaLoggrpid = opcMetaLoggrpid;
            return this;
        }

        /** Log data */
        private java.io.InputStream uploadLogFileBody = null;

        /**
         * Log data
         *
         * @param uploadLogFileBody the value to set
         * @return this builder instance
         */
        public Builder uploadLogFileBody(java.io.InputStream uploadLogFileBody) {
            this.uploadLogFileBody = uploadLogFileBody;
            return this;
        }

        /** The entity OCID. */
        private String entityId = null;

        /**
         * The entity OCID.
         *
         * @param entityId the value to set
         * @return this builder instance
         */
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            return this;
        }

        /**
         * Timezone to be used when processing log entries whose timestamps do not include an
         * explicit timezone. When this property is not specified, the timezone of the entity
         * specified is used. If the entity is also not specified or do not have a valid timezone
         * then UTC is used
         */
        private String timezone = null;

        /**
         * Timezone to be used when processing log entries whose timestamps do not include an
         * explicit timezone. When this property is not specified, the timezone of the entity
         * specified is used. If the entity is also not specified or do not have a valid timezone
         * then UTC is used
         *
         * @param timezone the value to set
         * @return this builder instance
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }

        /**
         * Character encoding to be used to detect the encoding type of file(s) being uploaded. When
         * this property is not specified, system detected character encoding will be used.
         */
        private String charEncoding = null;

        /**
         * Character encoding to be used to detect the encoding type of file(s) being uploaded. When
         * this property is not specified, system detected character encoding will be used.
         *
         * @param charEncoding the value to set
         * @return this builder instance
         */
        public Builder charEncoding(String charEncoding) {
            this.charEncoding = charEncoding;
            return this;
        }

        /**
         * This property is used to specify the format of the date. This is to be used for ambiguous
         * dates like 12/11/10. This property can take any of the following values - MONTH_DAY_YEAR,
         * DAY_MONTH_YEAR, YEAR_MONTH_DAY, MONTH_DAY, DAY_MONTH.
         */
        private String dateFormat = null;

        /**
         * This property is used to specify the format of the date. This is to be used for ambiguous
         * dates like 12/11/10. This property can take any of the following values - MONTH_DAY_YEAR,
         * DAY_MONTH_YEAR, YEAR_MONTH_DAY, MONTH_DAY, DAY_MONTH.
         *
         * @param dateFormat the value to set
         * @return this builder instance
         */
        public Builder dateFormat(String dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }

        /**
         * Used to indicate the year where the log entries timestamp do not mention year (Ex: Nov 8
         * 20:45:56).
         */
        private String dateYear = null;

        /**
         * Used to indicate the year where the log entries timestamp do not mention year (Ex: Nov 8
         * 20:45:56).
         *
         * @param dateYear the value to set
         * @return this builder instance
         */
        public Builder dateYear(String dateYear) {
            this.dateYear = dateYear;
            return this;
        }

        /**
         * This property can be used to reset configuration cache in case of an issue with the
         * upload.
         */
        private Boolean invalidateCache = null;

        /**
         * This property can be used to reset configuration cache in case of an issue with the
         * upload.
         *
         * @param invalidateCache the value to set
         * @return this builder instance
         */
        public Builder invalidateCache(Boolean invalidateCache) {
            this.invalidateCache = invalidateCache;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The base-64 encoded MD5 hash of the body. If the Content-MD5 header is present, Logging
         * Analytics performs an integrity check on the body of the HTTP request by computing the
         * MD5 hash for the body and comparing it to the MD5 hash supplied in the header. If the two
         * hashes do not match, the log data is rejected and an HTTP-400 Unmatched Content MD5 error
         * is returned with the message:
         *
         * <p>"The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5
         * header (HEADER_MD5)"
         */
        private String contentMd5 = null;

        /**
         * The base-64 encoded MD5 hash of the body. If the Content-MD5 header is present, Logging
         * Analytics performs an integrity check on the body of the HTTP request by computing the
         * MD5 hash for the body and comparing it to the MD5 hash supplied in the header. If the two
         * hashes do not match, the log data is rejected and an HTTP-400 Unmatched Content MD5 error
         * is returned with the message:
         *
         * <p>"The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5
         * header (HEADER_MD5)"
         *
         * @param contentMd5 the value to set
         * @return this builder instance
         */
        public Builder contentMd5(String contentMd5) {
            this.contentMd5 = contentMd5;
            return this;
        }

        /** The content type of the log data. */
        private String contentType = null;

        /**
         * The content type of the log data.
         *
         * @param contentType the value to set
         * @return this builder instance
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /** The log set that gets associated with the uploaded logs. */
        private String logSet = null;

        /**
         * The log set that gets associated with the uploaded logs.
         *
         * @param logSet the value to set
         * @return this builder instance
         */
        public Builder logSet(String logSet) {
            this.logSet = logSet;
            return this;
        }

        /**
         * A value of {@code 100-continue} requests preliminary verification of the request method,
         * path, and headers before the request body is sent. If no error results from such
         * verification, the server will send a 100 (Continue) interim response to indicate
         * readiness for the request body. The only allowed value for this parameter is
         * "100-Continue" (case-insensitive).
         */
        private String expect = null;

        /**
         * A value of {@code 100-continue} requests preliminary verification of the request method,
         * path, and headers before the request body is sent. If no error results from such
         * verification, the server will send a 100 (Continue) interim response to indicate
         * readiness for the request body. The only allowed value for this parameter is
         * "100-Continue" (case-insensitive).
         *
         * @param expect the value to set
         * @return this builder instance
         */
        public Builder expect(String expect) {
            this.expect = expect;
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
            logSet(o.getLogSet());
            expect(o.getExpect());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UploadLogFileRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
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
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(java.io.InputStream body) {
            uploadLogFileBody(body);
            return this;
        }

        /**
         * Build the instance of UploadLogFileRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UploadLogFileRequest
         */
        public UploadLogFileRequest buildWithoutInvocationCallback() {
            UploadLogFileRequest request = new UploadLogFileRequest();
            request.namespaceName = namespaceName;
            request.uploadName = uploadName;
            request.logSourceName = logSourceName;
            request.filename = filename;
            request.opcMetaLoggrpid = opcMetaLoggrpid;
            request.uploadLogFileBody = uploadLogFileBody;
            request.entityId = entityId;
            request.timezone = timezone;
            request.charEncoding = charEncoding;
            request.dateFormat = dateFormat;
            request.dateYear = dateYear;
            request.invalidateCache = invalidateCache;
            request.opcRequestId = opcRequestId;
            request.contentMd5 = contentMd5;
            request.contentType = contentType;
            request.opcRetryToken = opcRetryToken;
            request.logSet = logSet;
            request.expect = expect;
            return request;
            // new UploadLogFileRequest(namespaceName, uploadName, logSourceName, filename,
            // opcMetaLoggrpid, uploadLogFileBody, entityId, timezone, charEncoding, dateFormat,
            // dateYear, invalidateCache, opcRequestId, contentMd5, contentType, opcRetryToken,
            // logSet, expect);
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
                .uploadName(uploadName)
                .logSourceName(logSourceName)
                .filename(filename)
                .opcMetaLoggrpid(opcMetaLoggrpid)
                .uploadLogFileBody(uploadLogFileBody)
                .entityId(entityId)
                .timezone(timezone)
                .charEncoding(charEncoding)
                .dateFormat(dateFormat)
                .dateYear(dateYear)
                .invalidateCache(invalidateCache)
                .opcRequestId(opcRequestId)
                .contentMd5(contentMd5)
                .contentType(contentType)
                .opcRetryToken(opcRetryToken)
                .logSet(logSet)
                .expect(expect);
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
        sb.append(",uploadName=").append(String.valueOf(this.uploadName));
        sb.append(",logSourceName=").append(String.valueOf(this.logSourceName));
        sb.append(",filename=").append(String.valueOf(this.filename));
        sb.append(",opcMetaLoggrpid=").append(String.valueOf(this.opcMetaLoggrpid));
        sb.append(",uploadLogFileBody=").append(String.valueOf(this.uploadLogFileBody));
        sb.append(",entityId=").append(String.valueOf(this.entityId));
        sb.append(",timezone=").append(String.valueOf(this.timezone));
        sb.append(",charEncoding=").append(String.valueOf(this.charEncoding));
        sb.append(",dateFormat=").append(String.valueOf(this.dateFormat));
        sb.append(",dateYear=").append(String.valueOf(this.dateYear));
        sb.append(",invalidateCache=").append(String.valueOf(this.invalidateCache));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",contentMd5=").append(String.valueOf(this.contentMd5));
        sb.append(",contentType=").append(String.valueOf(this.contentType));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",logSet=").append(String.valueOf(this.logSet));
        sb.append(",expect=").append(String.valueOf(this.expect));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadLogFileRequest)) {
            return false;
        }

        UploadLogFileRequest other = (UploadLogFileRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.uploadName, other.uploadName)
                && java.util.Objects.equals(this.logSourceName, other.logSourceName)
                && java.util.Objects.equals(this.filename, other.filename)
                && java.util.Objects.equals(this.opcMetaLoggrpid, other.opcMetaLoggrpid)
                && java.util.Objects.equals(this.uploadLogFileBody, other.uploadLogFileBody)
                && java.util.Objects.equals(this.entityId, other.entityId)
                && java.util.Objects.equals(this.timezone, other.timezone)
                && java.util.Objects.equals(this.charEncoding, other.charEncoding)
                && java.util.Objects.equals(this.dateFormat, other.dateFormat)
                && java.util.Objects.equals(this.dateYear, other.dateYear)
                && java.util.Objects.equals(this.invalidateCache, other.invalidateCache)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.contentMd5, other.contentMd5)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.logSet, other.logSet)
                && java.util.Objects.equals(this.expect, other.expect);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.uploadName == null ? 43 : this.uploadName.hashCode());
        result =
                (result * PRIME)
                        + (this.logSourceName == null ? 43 : this.logSourceName.hashCode());
        result = (result * PRIME) + (this.filename == null ? 43 : this.filename.hashCode());
        result =
                (result * PRIME)
                        + (this.opcMetaLoggrpid == null ? 43 : this.opcMetaLoggrpid.hashCode());
        result =
                (result * PRIME)
                        + (this.uploadLogFileBody == null ? 43 : this.uploadLogFileBody.hashCode());
        result = (result * PRIME) + (this.entityId == null ? 43 : this.entityId.hashCode());
        result = (result * PRIME) + (this.timezone == null ? 43 : this.timezone.hashCode());
        result = (result * PRIME) + (this.charEncoding == null ? 43 : this.charEncoding.hashCode());
        result = (result * PRIME) + (this.dateFormat == null ? 43 : this.dateFormat.hashCode());
        result = (result * PRIME) + (this.dateYear == null ? 43 : this.dateYear.hashCode());
        result =
                (result * PRIME)
                        + (this.invalidateCache == null ? 43 : this.invalidateCache.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.contentMd5 == null ? 43 : this.contentMd5.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.logSet == null ? 43 : this.logSet.hashCode());
        result = (result * PRIME) + (this.expect == null ? 43 : this.expect.hashCode());
        return result;
    }
}

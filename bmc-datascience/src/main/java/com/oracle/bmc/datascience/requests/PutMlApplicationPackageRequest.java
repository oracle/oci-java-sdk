/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/PutMlApplicationPackageExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * PutMlApplicationPackageRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class PutMlApplicationPackageRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream>
        implements com.oracle.bmc.requests.HasContentLength {

    /** unique MlApplicationImplementation identifier */
    private String mlApplicationImplementationId;

    /** unique MlApplicationImplementation identifier */
    public String getMlApplicationImplementationId() {
        return mlApplicationImplementationId;
    }
    /** ML Application Package to upload */
    private java.io.InputStream putMlApplicationPackage;

    /** ML Application Package to upload */
    public java.io.InputStream getPutMlApplicationPackage() {
        return putMlApplicationPackage;
    }
    /** The content length of the body. */
    private Long contentLength;

    /** The content length of the body. */
    public Long getContentLength() {
        return contentLength;
    }
    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
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
    /**
     * This header allows you to specify a filename during upload. This file name is used to dispose
     * of the file contents while downloading the file. If this optional field is not populated in
     * the request, then the OCID of the model is used for the file name when downloading. Example:
     * {@code {"Content-Disposition": "attachment" "filename"="model.tar.gz" "Content-Length":
     * "2347" "Content-Type": "application/gzip"}}
     */
    private String contentDisposition;

    /**
     * This header allows you to specify a filename during upload. This file name is used to dispose
     * of the file contents while downloading the file. If this optional field is not populated in
     * the request, then the OCID of the model is used for the file name when downloading. Example:
     * {@code {"Content-Disposition": "attachment" "filename"="model.tar.gz" "Content-Length":
     * "2347" "Content-Type": "application/gzip"}}
     */
    public String getContentDisposition() {
        return contentDisposition;
    }
    /**
     * List of arguments (Json map - argument name to argument value) for ML Application package
     * (available arguments are in ML Application package descriptor). E.g. {"vcnId":
     * "ocid1.vcn.oc1.iad.abcd...", "logId":"ocid1.log.oc1.iad.abcd..."}
     */
    private String opcMlAppPackageArgs;

    /**
     * List of arguments (Json map - argument name to argument value) for ML Application package
     * (available arguments are in ML Application package descriptor). E.g. {"vcnId":
     * "ocid1.vcn.oc1.iad.abcd...", "logId":"ocid1.log.oc1.iad.abcd..."}
     */
    public String getOpcMlAppPackageArgs() {
        return opcMlAppPackageArgs;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return putMlApplicationPackage;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PutMlApplicationPackageRequest, java.io.InputStream> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** unique MlApplicationImplementation identifier */
        private String mlApplicationImplementationId = null;

        /**
         * unique MlApplicationImplementation identifier
         *
         * @param mlApplicationImplementationId the value to set
         * @return this builder instance
         */
        public Builder mlApplicationImplementationId(String mlApplicationImplementationId) {
            this.mlApplicationImplementationId = mlApplicationImplementationId;
            return this;
        }

        /** ML Application Package to upload */
        private java.io.InputStream putMlApplicationPackage = null;

        /**
         * ML Application Package to upload
         *
         * @param putMlApplicationPackage the value to set
         * @return this builder instance
         */
        public Builder putMlApplicationPackage(java.io.InputStream putMlApplicationPackage) {
            this.putMlApplicationPackage = putMlApplicationPackage;
            return this;
        }

        /** The content length of the body. */
        private Long contentLength = null;

        /**
         * The content length of the body.
         *
         * @param contentLength the value to set
         * @return this builder instance
         */
        public Builder contentLength(Long contentLength) {
            this.contentLength = contentLength;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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

        /**
         * This header allows you to specify a filename during upload. This file name is used to
         * dispose of the file contents while downloading the file. If this optional field is not
         * populated in the request, then the OCID of the model is used for the file name when
         * downloading. Example: {@code {"Content-Disposition": "attachment"
         * "filename"="model.tar.gz" "Content-Length": "2347" "Content-Type": "application/gzip"}}
         */
        private String contentDisposition = null;

        /**
         * This header allows you to specify a filename during upload. This file name is used to
         * dispose of the file contents while downloading the file. If this optional field is not
         * populated in the request, then the OCID of the model is used for the file name when
         * downloading. Example: {@code {"Content-Disposition": "attachment"
         * "filename"="model.tar.gz" "Content-Length": "2347" "Content-Type": "application/gzip"}}
         *
         * @param contentDisposition the value to set
         * @return this builder instance
         */
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * List of arguments (Json map - argument name to argument value) for ML Application package
         * (available arguments are in ML Application package descriptor). E.g. {"vcnId":
         * "ocid1.vcn.oc1.iad.abcd...", "logId":"ocid1.log.oc1.iad.abcd..."}
         */
        private String opcMlAppPackageArgs = null;

        /**
         * List of arguments (Json map - argument name to argument value) for ML Application package
         * (available arguments are in ML Application package descriptor). E.g. {"vcnId":
         * "ocid1.vcn.oc1.iad.abcd...", "logId":"ocid1.log.oc1.iad.abcd..."}
         *
         * @param opcMlAppPackageArgs the value to set
         * @return this builder instance
         */
        public Builder opcMlAppPackageArgs(String opcMlAppPackageArgs) {
            this.opcMlAppPackageArgs = opcMlAppPackageArgs;
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
        public Builder copy(PutMlApplicationPackageRequest o) {
            mlApplicationImplementationId(o.getMlApplicationImplementationId());
            putMlApplicationPackage(o.getPutMlApplicationPackage());
            contentLength(o.getContentLength());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            contentDisposition(o.getContentDisposition());
            opcMlAppPackageArgs(o.getOpcMlAppPackageArgs());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PutMlApplicationPackageRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of PutMlApplicationPackageRequest
         */
        public PutMlApplicationPackageRequest build() {
            PutMlApplicationPackageRequest request = buildWithoutInvocationCallback();
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
            putMlApplicationPackage(body);
            return this;
        }

        /**
         * Build the instance of PutMlApplicationPackageRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PutMlApplicationPackageRequest
         */
        public PutMlApplicationPackageRequest buildWithoutInvocationCallback() {
            PutMlApplicationPackageRequest request = new PutMlApplicationPackageRequest();
            request.mlApplicationImplementationId = mlApplicationImplementationId;
            request.putMlApplicationPackage = putMlApplicationPackage;
            request.contentLength = contentLength;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.contentDisposition = contentDisposition;
            request.opcMlAppPackageArgs = opcMlAppPackageArgs;
            return request;
            // new PutMlApplicationPackageRequest(mlApplicationImplementationId,
            // putMlApplicationPackage, contentLength, opcRequestId, opcRetryToken,
            // contentDisposition, opcMlAppPackageArgs);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .mlApplicationImplementationId(mlApplicationImplementationId)
                .putMlApplicationPackage(putMlApplicationPackage)
                .contentLength(contentLength)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .contentDisposition(contentDisposition)
                .opcMlAppPackageArgs(opcMlAppPackageArgs);
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
        sb.append(",mlApplicationImplementationId=")
                .append(String.valueOf(this.mlApplicationImplementationId));
        sb.append(",putMlApplicationPackage=").append(String.valueOf(this.putMlApplicationPackage));
        sb.append(",contentLength=").append(String.valueOf(this.contentLength));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",contentDisposition=").append(String.valueOf(this.contentDisposition));
        sb.append(",opcMlAppPackageArgs=").append(String.valueOf(this.opcMlAppPackageArgs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PutMlApplicationPackageRequest)) {
            return false;
        }

        PutMlApplicationPackageRequest other = (PutMlApplicationPackageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.mlApplicationImplementationId, other.mlApplicationImplementationId)
                && java.util.Objects.equals(
                        this.putMlApplicationPackage, other.putMlApplicationPackage)
                && java.util.Objects.equals(this.contentLength, other.contentLength)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.contentDisposition, other.contentDisposition)
                && java.util.Objects.equals(this.opcMlAppPackageArgs, other.opcMlAppPackageArgs);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.mlApplicationImplementationId == null
                                ? 43
                                : this.mlApplicationImplementationId.hashCode());
        result =
                (result * PRIME)
                        + (this.putMlApplicationPackage == null
                                ? 43
                                : this.putMlApplicationPackage.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLength == null ? 43 : this.contentLength.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result =
                (result * PRIME)
                        + (this.contentDisposition == null
                                ? 43
                                : this.contentDisposition.hashCode());
        result =
                (result * PRIME)
                        + (this.opcMlAppPackageArgs == null
                                ? 43
                                : this.opcMlAppPackageArgs.hashCode());
        return result;
    }
}

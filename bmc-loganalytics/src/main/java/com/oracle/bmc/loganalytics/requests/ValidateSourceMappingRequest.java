/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ValidateSourceMappingExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ValidateSourceMappingRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ValidateSourceMappingRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /** Location of the log file. */
    private String objectLocation;

    /** Location of the log file. */
    public String getObjectLocation() {
        return objectLocation;
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
    /** Name of the log source that will be used to process the files being uploaded. */
    private String logSourceName;

    /** Name of the log source that will be used to process the files being uploaded. */
    public String getLogSourceName() {
        return logSourceName;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ValidateSourceMappingRequest, java.lang.Void> {
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

        /** Location of the log file. */
        private String objectLocation = null;

        /**
         * Location of the log file.
         *
         * @param objectLocation the value to set
         * @return this builder instance
         */
        public Builder objectLocation(String objectLocation) {
            this.objectLocation = objectLocation;
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
        public Builder copy(ValidateSourceMappingRequest o) {
            namespaceName(o.getNamespaceName());
            objectLocation(o.getObjectLocation());
            filename(o.getFilename());
            logSourceName(o.getLogSourceName());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ValidateSourceMappingRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ValidateSourceMappingRequest
         */
        public ValidateSourceMappingRequest build() {
            ValidateSourceMappingRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ValidateSourceMappingRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ValidateSourceMappingRequest
         */
        public ValidateSourceMappingRequest buildWithoutInvocationCallback() {
            ValidateSourceMappingRequest request = new ValidateSourceMappingRequest();
            request.namespaceName = namespaceName;
            request.objectLocation = objectLocation;
            request.filename = filename;
            request.logSourceName = logSourceName;
            request.opcRequestId = opcRequestId;
            return request;
            // new ValidateSourceMappingRequest(namespaceName, objectLocation, filename,
            // logSourceName, opcRequestId);
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
                .objectLocation(objectLocation)
                .filename(filename)
                .logSourceName(logSourceName)
                .opcRequestId(opcRequestId);
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
        sb.append(",objectLocation=").append(String.valueOf(this.objectLocation));
        sb.append(",filename=").append(String.valueOf(this.filename));
        sb.append(",logSourceName=").append(String.valueOf(this.logSourceName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateSourceMappingRequest)) {
            return false;
        }

        ValidateSourceMappingRequest other = (ValidateSourceMappingRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.objectLocation, other.objectLocation)
                && java.util.Objects.equals(this.filename, other.filename)
                && java.util.Objects.equals(this.logSourceName, other.logSourceName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.objectLocation == null ? 43 : this.objectLocation.hashCode());
        result = (result * PRIME) + (this.filename == null ? 43 : this.filename.hashCode());
        result =
                (result * PRIME)
                        + (this.logSourceName == null ? 43 : this.logSourceName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

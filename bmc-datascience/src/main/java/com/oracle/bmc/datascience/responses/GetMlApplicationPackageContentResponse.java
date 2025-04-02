/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.responses;

import com.oracle.bmc.datascience.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class GetMlApplicationPackageContentResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
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
     *
     * @return the value
     */
    public String getOpcMlAppPackageArgs() {
        return opcMlAppPackageArgs;
    }

    /** The returned {@code java.io.InputStream} instance. */
    private java.io.InputStream inputStream;

    /**
     * The returned {@code java.io.InputStream} instance.
     *
     * @return the value
     */
    public java.io.InputStream getInputStream() {
        return inputStream;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcMlAppPackageArgs",
        "inputStream"
    })
    private GetMlApplicationPackageContentResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcMlAppPackageArgs,
            java.io.InputStream inputStream) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcMlAppPackageArgs = opcMlAppPackageArgs;
        this.inputStream = inputStream;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    GetMlApplicationPackageContentResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
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
         *
         * @param opcMlAppPackageArgs the value to set
         * @return this builder
         */
        public Builder opcMlAppPackageArgs(String opcMlAppPackageArgs) {
            this.opcMlAppPackageArgs = opcMlAppPackageArgs;
            return this;
        }

        /** The returned {@code java.io.InputStream} instance. */
        private java.io.InputStream inputStream;

        /**
         * The returned {@code java.io.InputStream} instance.
         *
         * @param inputStream the value to set
         * @return this builder
         */
        public Builder inputStream(java.io.InputStream inputStream) {
            this.inputStream = inputStream;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetMlApplicationPackageContentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcMlAppPackageArgs(o.getOpcMlAppPackageArgs());
            inputStream(o.getInputStream());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetMlApplicationPackageContentResponse build() {
            return new GetMlApplicationPackageContentResponse(
                    __httpStatusCode__, headers, opcRequestId, opcMlAppPackageArgs, inputStream);
        }
    }

    /**
     * Return a new builder for this response object.
     *
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcMlAppPackageArgs=").append(String.valueOf(opcMlAppPackageArgs));
        sb.append(",inputStream=").append(String.valueOf(inputStream));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetMlApplicationPackageContentResponse)) {
            return false;
        }

        GetMlApplicationPackageContentResponse other = (GetMlApplicationPackageContentResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcMlAppPackageArgs, other.opcMlAppPackageArgs)
                && java.util.Objects.equals(this.inputStream, other.inputStream);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcMlAppPackageArgs == null
                                ? 43
                                : this.opcMlAppPackageArgs.hashCode());
        result = (result * PRIME) + (this.inputStream == null ? 43 : this.inputStream.hashCode());
        return result;
    }
}

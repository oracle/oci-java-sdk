/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.zpr.responses;

import com.oracle.bmc.zpr.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240301")
public class CreateZprPolicyResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * URL of the ZprPolicy resource. The zprPolicy OCID is generated after this request is sent.
     */
    private String location;

    /**
     * URL of the ZprPolicy resource. The zprPolicy OCID is generated after this request is sent.
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /**
     * Same as location.
     */
    private String contentLocation;

    /**
     * Same as location.
     * @return the value
     */
    public String getContentLocation() {
        return contentLocation;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /**
     * The returned ZprPolicy instance.
     */
    private com.oracle.bmc.zpr.model.ZprPolicy zprPolicy;

    /**
     * The returned ZprPolicy instance.
     * @return the value
     */
    public com.oracle.bmc.zpr.model.ZprPolicy getZprPolicy() {
        return zprPolicy;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "location",
        "contentLocation",
        "opcRequestId",
        "opcWorkRequestId",
        "zprPolicy"
    })
    private CreateZprPolicyResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String location,
            String contentLocation,
            String opcRequestId,
            String opcWorkRequestId,
            com.oracle.bmc.zpr.model.ZprPolicy zprPolicy) {
        super(__httpStatusCode__, headers);
        this.location = location;
        this.contentLocation = contentLocation;
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.zprPolicy = zprPolicy;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private javax.ws.rs.core.MultivaluedMap<String, String> headers;

        public Builder headers(javax.ws.rs.core.MultivaluedMap<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * URL of the ZprPolicy resource. The zprPolicy OCID is generated after this request is sent.
         */
        private String location;

        /**
         * URL of the ZprPolicy resource. The zprPolicy OCID is generated after this request is sent.
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * Same as location.
         */
        private String contentLocation;

        /**
         * Same as location.
         * @param contentLocation the value to set
         * @return this builder
         */
        public Builder contentLocation(String contentLocation) {
            this.contentLocation = contentLocation;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
         *
         */
        private String opcWorkRequestId;

        /**
         * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /**
         * The returned ZprPolicy instance.
         */
        private com.oracle.bmc.zpr.model.ZprPolicy zprPolicy;

        /**
         * The returned ZprPolicy instance.
         * @param zprPolicy the value to set
         * @return this builder
         */
        public Builder zprPolicy(com.oracle.bmc.zpr.model.ZprPolicy zprPolicy) {
            this.zprPolicy = zprPolicy;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateZprPolicyResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            location(o.getLocation());
            contentLocation(o.getContentLocation());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            zprPolicy(o.getZprPolicy());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public CreateZprPolicyResponse build() {
            return new CreateZprPolicyResponse(
                    __httpStatusCode__,
                    headers,
                    location,
                    contentLocation,
                    opcRequestId,
                    opcWorkRequestId,
                    zprPolicy);
        }
    }

    /**
     * Return a new builder for this response object.
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
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",contentLocation=").append(String.valueOf(contentLocation));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",zprPolicy=").append(String.valueOf(zprPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateZprPolicyResponse)) {
            return false;
        }

        CreateZprPolicyResponse other = (CreateZprPolicyResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.contentLocation, other.contentLocation)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.zprPolicy, other.zprPolicy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLocation == null ? 43 : this.contentLocation.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.zprPolicy == null ? 43 : this.zprPolicy.hashCode());
        return result;
    }
}

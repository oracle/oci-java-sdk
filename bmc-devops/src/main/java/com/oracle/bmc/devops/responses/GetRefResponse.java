/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.responses;

import com.oracle.bmc.devops.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class GetRefResponse extends com.oracle.bmc.responses.BmcResponse {
    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * This API will be deprecated on Wed, 12 June 2024 01:00:00 GMT as it does not get recognized
     * when refName has '/'. This will be replaced by "/repositories/{repositoryId}/refs".
     */
    private String sunset;

    /**
     * This API will be deprecated on Wed, 12 June 2024 01:00:00 GMT as it does not get recognized
     * when refName has '/'. This will be replaced by "/repositories/{repositoryId}/refs".
     *
     * @return the value
     */
    public String getSunset() {
        return sunset;
    }

    /** The returned {@code RepositoryRef} instance. */
    private com.oracle.bmc.devops.model.RepositoryRef repositoryRef;

    /**
     * The returned {@code RepositoryRef} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.devops.model.RepositoryRef getRepositoryRef() {
        return repositoryRef;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "sunset",
        "repositoryRef"
    })
    private GetRefResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            String sunset,
            com.oracle.bmc.devops.model.RepositoryRef repositoryRef) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.sunset = sunset;
        this.repositoryRef = repositoryRef;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetRefResponse> {
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

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * This API will be deprecated on Wed, 12 June 2024 01:00:00 GMT as it does not get
         * recognized when refName has '/'. This will be replaced by
         * "/repositories/{repositoryId}/refs".
         */
        private String sunset;

        /**
         * This API will be deprecated on Wed, 12 June 2024 01:00:00 GMT as it does not get
         * recognized when refName has '/'. This will be replaced by
         * "/repositories/{repositoryId}/refs".
         *
         * @param sunset the value to set
         * @return this builder
         */
        public Builder sunset(String sunset) {
            this.sunset = sunset;
            return this;
        }

        /** The returned {@code RepositoryRef} instance. */
        private com.oracle.bmc.devops.model.RepositoryRef repositoryRef;

        /**
         * The returned {@code RepositoryRef} instance.
         *
         * @param repositoryRef the value to set
         * @return this builder
         */
        public Builder repositoryRef(com.oracle.bmc.devops.model.RepositoryRef repositoryRef) {
            this.repositoryRef = repositoryRef;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetRefResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            sunset(o.getSunset());
            repositoryRef(o.getRepositoryRef());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetRefResponse build() {
            return new GetRefResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, sunset, repositoryRef);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",sunset=").append(String.valueOf(sunset));
        sb.append(",repositoryRef=").append(String.valueOf(repositoryRef));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetRefResponse)) {
            return false;
        }

        GetRefResponse other = (GetRefResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.sunset, other.sunset)
                && java.util.Objects.equals(this.repositoryRef, other.repositoryRef);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.sunset == null ? 43 : this.sunset.hashCode());
        result =
                (result * PRIME)
                        + (this.repositoryRef == null ? 43 : this.repositoryRef.hashCode());
        return result;
    }
}

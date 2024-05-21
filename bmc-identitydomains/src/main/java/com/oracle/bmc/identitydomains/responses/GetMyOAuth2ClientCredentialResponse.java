/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.responses;

import com.oracle.bmc.identitydomains.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
public class GetMyOAuth2ClientCredentialResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned MyOAuth2ClientCredential instance.
     */
    private com.oracle.bmc.identitydomains.model.MyOAuth2ClientCredential myOAuth2ClientCredential;

    /**
     * The returned MyOAuth2ClientCredential instance.
     * @return the value
     */
    public com.oracle.bmc.identitydomains.model.MyOAuth2ClientCredential
            getMyOAuth2ClientCredential() {
        return myOAuth2ClientCredential;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "myOAuth2ClientCredential"
    })
    private GetMyOAuth2ClientCredentialResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.identitydomains.model.MyOAuth2ClientCredential
                    myOAuth2ClientCredential) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.myOAuth2ClientCredential = myOAuth2ClientCredential;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned MyOAuth2ClientCredential instance.
         */
        private com.oracle.bmc.identitydomains.model.MyOAuth2ClientCredential
                myOAuth2ClientCredential;

        /**
         * The returned MyOAuth2ClientCredential instance.
         * @param myOAuth2ClientCredential the value to set
         * @return this builder
         */
        public Builder myOAuth2ClientCredential(
                com.oracle.bmc.identitydomains.model.MyOAuth2ClientCredential
                        myOAuth2ClientCredential) {
            this.myOAuth2ClientCredential = myOAuth2ClientCredential;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetMyOAuth2ClientCredentialResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            myOAuth2ClientCredential(o.getMyOAuth2ClientCredential());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetMyOAuth2ClientCredentialResponse build() {
            return new GetMyOAuth2ClientCredentialResponse(
                    __httpStatusCode__, headers, opcRequestId, myOAuth2ClientCredential);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",myOAuth2ClientCredential=").append(String.valueOf(myOAuth2ClientCredential));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetMyOAuth2ClientCredentialResponse)) {
            return false;
        }

        GetMyOAuth2ClientCredentialResponse other = (GetMyOAuth2ClientCredentialResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.myOAuth2ClientCredential, other.myOAuth2ClientCredential);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.myOAuth2ClientCredential == null
                                ? 43
                                : this.myOAuth2ClientCredential.hashCode());
        return result;
    }
}

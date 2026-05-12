/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.responses;

import com.oracle.bmc.databasetoolsruntime.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
public class CreateCredentialPublicSynonymResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** URI of the new resource which was created by the request. */
    private String location;

    /**
     * URI of the new resource which was created by the request.
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /** The returned {@code CredentialPublicSynonym} instance. */
    private com.oracle.bmc.databasetoolsruntime.model.CredentialPublicSynonym
            credentialPublicSynonym;

    /**
     * The returned {@code CredentialPublicSynonym} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.databasetoolsruntime.model.CredentialPublicSynonym
            getCredentialPublicSynonym() {
        return credentialPublicSynonym;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "location",
        "credentialPublicSynonym"
    })
    private CreateCredentialPublicSynonymResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String location,
            com.oracle.bmc.databasetoolsruntime.model.CredentialPublicSynonym
                    credentialPublicSynonym) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.location = location;
        this.credentialPublicSynonym = credentialPublicSynonym;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    CreateCredentialPublicSynonymResponse> {
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** URI of the new resource which was created by the request. */
        private String location;

        /**
         * URI of the new resource which was created by the request.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /** The returned {@code CredentialPublicSynonym} instance. */
        private com.oracle.bmc.databasetoolsruntime.model.CredentialPublicSynonym
                credentialPublicSynonym;

        /**
         * The returned {@code CredentialPublicSynonym} instance.
         *
         * @param credentialPublicSynonym the value to set
         * @return this builder
         */
        public Builder credentialPublicSynonym(
                com.oracle.bmc.databasetoolsruntime.model.CredentialPublicSynonym
                        credentialPublicSynonym) {
            this.credentialPublicSynonym = credentialPublicSynonym;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateCredentialPublicSynonymResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            credentialPublicSynonym(o.getCredentialPublicSynonym());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateCredentialPublicSynonymResponse build() {
            return new CreateCredentialPublicSynonymResponse(
                    __httpStatusCode__, headers, opcRequestId, location, credentialPublicSynonym);
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
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",credentialPublicSynonym=").append(String.valueOf(credentialPublicSynonym));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCredentialPublicSynonymResponse)) {
            return false;
        }

        CreateCredentialPublicSynonymResponse other = (CreateCredentialPublicSynonymResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(
                        this.credentialPublicSynonym, other.credentialPublicSynonym);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialPublicSynonym == null
                                ? 43
                                : this.credentialPublicSynonym.hashCode());
        return result;
    }
}

/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.responses;

import com.oracle.bmc.oda.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class CreateSkillParameterResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Fully qualified URL for the newly created resource.
     */
    private String location;

    /**
     * Fully qualified URL for the newly created resource.
     * @return the value
     */
    public String getLocation() {
        return location;
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
     * For use in a PUT or DELETE {@code if-match} query parameter for optimistic concurrency control.
     */
    private String etag;

    /**
     * For use in a PUT or DELETE {@code if-match} query parameter for optimistic concurrency control.
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * The returned SkillParameter instance.
     */
    private com.oracle.bmc.oda.model.SkillParameter skillParameter;

    /**
     * The returned SkillParameter instance.
     * @return the value
     */
    public com.oracle.bmc.oda.model.SkillParameter getSkillParameter() {
        return skillParameter;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "location",
        "opcRequestId",
        "etag",
        "skillParameter"
    })
    private CreateSkillParameterResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String location,
            String opcRequestId,
            String etag,
            com.oracle.bmc.oda.model.SkillParameter skillParameter) {
        super(__httpStatusCode__, headers);
        this.location = location;
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.skillParameter = skillParameter;
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
         * Fully qualified URL for the newly created resource.
         */
        private String location;

        /**
         * Fully qualified URL for the newly created resource.
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
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
         * For use in a PUT or DELETE {@code if-match} query parameter for optimistic concurrency control.
         */
        private String etag;

        /**
         * For use in a PUT or DELETE {@code if-match} query parameter for optimistic concurrency control.
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * The returned SkillParameter instance.
         */
        private com.oracle.bmc.oda.model.SkillParameter skillParameter;

        /**
         * The returned SkillParameter instance.
         * @param skillParameter the value to set
         * @return this builder
         */
        public Builder skillParameter(com.oracle.bmc.oda.model.SkillParameter skillParameter) {
            this.skillParameter = skillParameter;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateSkillParameterResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            location(o.getLocation());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            skillParameter(o.getSkillParameter());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public CreateSkillParameterResponse build() {
            return new CreateSkillParameterResponse(
                    __httpStatusCode__, headers, location, opcRequestId, etag, skillParameter);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",skillParameter=").append(String.valueOf(skillParameter));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSkillParameterResponse)) {
            return false;
        }

        CreateSkillParameterResponse other = (CreateSkillParameterResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.skillParameter, other.skillParameter);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.skillParameter == null ? 43 : this.skillParameter.hashCode());
        return result;
    }
}

/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.responses;

import com.oracle.bmc.identitydomains.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
public class GetUserAttributesSettingResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned UserAttributesSetting instance.
     */
    private com.oracle.bmc.identitydomains.model.UserAttributesSetting userAttributesSetting;

    /**
     * The returned UserAttributesSetting instance.
     * @return the value
     */
    public com.oracle.bmc.identitydomains.model.UserAttributesSetting getUserAttributesSetting() {
        return userAttributesSetting;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "userAttributesSetting"
    })
    private GetUserAttributesSettingResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.identitydomains.model.UserAttributesSetting userAttributesSetting) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.userAttributesSetting = userAttributesSetting;
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
         * The returned UserAttributesSetting instance.
         */
        private com.oracle.bmc.identitydomains.model.UserAttributesSetting userAttributesSetting;

        /**
         * The returned UserAttributesSetting instance.
         * @param userAttributesSetting the value to set
         * @return this builder
         */
        public Builder userAttributesSetting(
                com.oracle.bmc.identitydomains.model.UserAttributesSetting userAttributesSetting) {
            this.userAttributesSetting = userAttributesSetting;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetUserAttributesSettingResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            userAttributesSetting(o.getUserAttributesSetting());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetUserAttributesSettingResponse build() {
            return new GetUserAttributesSettingResponse(
                    __httpStatusCode__, headers, opcRequestId, userAttributesSetting);
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
        sb.append(",userAttributesSetting=").append(String.valueOf(userAttributesSetting));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetUserAttributesSettingResponse)) {
            return false;
        }

        GetUserAttributesSettingResponse other = (GetUserAttributesSettingResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.userAttributesSetting, other.userAttributesSetting);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.userAttributesSetting == null
                                ? 43
                                : this.userAttributesSetting.hashCode());
        return result;
    }
}

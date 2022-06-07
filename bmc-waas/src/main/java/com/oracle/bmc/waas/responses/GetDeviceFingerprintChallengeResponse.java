/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.responses;

import com.oracle.bmc.waas.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public class GetDeviceFingerprintChallengeResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned DeviceFingerprintChallenge instance.
     */
    private com.oracle.bmc.waas.model.DeviceFingerprintChallenge deviceFingerprintChallenge;

    public com.oracle.bmc.waas.model.DeviceFingerprintChallenge getDeviceFingerprintChallenge() {
        return deviceFingerprintChallenge;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "deviceFingerprintChallenge"
    })
    private GetDeviceFingerprintChallengeResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            com.oracle.bmc.waas.model.DeviceFingerprintChallenge deviceFingerprintChallenge) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.deviceFingerprintChallenge = deviceFingerprintChallenge;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private com.oracle.bmc.waas.model.DeviceFingerprintChallenge deviceFingerprintChallenge;

        public Builder deviceFingerprintChallenge(
                com.oracle.bmc.waas.model.DeviceFingerprintChallenge deviceFingerprintChallenge) {
            this.deviceFingerprintChallenge = deviceFingerprintChallenge;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetDeviceFingerprintChallengeResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            deviceFingerprintChallenge(o.getDeviceFingerprintChallenge());

            return this;
        }

        public GetDeviceFingerprintChallengeResponse build() {
            return new GetDeviceFingerprintChallengeResponse(
                    __httpStatusCode__, etag, opcRequestId, deviceFingerprintChallenge);
        }
    }

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
        sb.append(",deviceFingerprintChallenge=")
                .append(String.valueOf(deviceFingerprintChallenge));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDeviceFingerprintChallengeResponse)) {
            return false;
        }

        GetDeviceFingerprintChallengeResponse other = (GetDeviceFingerprintChallengeResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.deviceFingerprintChallenge, other.deviceFingerprintChallenge);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.deviceFingerprintChallenge == null
                                ? 43
                                : this.deviceFingerprintChallenge.hashCode());
        return result;
    }
}

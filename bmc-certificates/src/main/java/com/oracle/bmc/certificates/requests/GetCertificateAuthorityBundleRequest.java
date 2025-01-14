/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificates.requests;

import com.oracle.bmc.certificates.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/certificates/GetCertificateAuthorityBundleExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetCertificateAuthorityBundleRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public class GetCertificateAuthorityBundleRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the certificate authority (CA). */
    private String certificateAuthorityId;

    /** The OCID of the certificate authority (CA). */
    public String getCertificateAuthorityId() {
        return certificateAuthorityId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The version number of the certificate authority (CA). */
    private Long versionNumber;

    /** The version number of the certificate authority (CA). */
    public Long getVersionNumber() {
        return versionNumber;
    }
    /**
     * The name of the certificate authority (CA). (This might be referred to as the name of the CA
     * version, as every CA consists of at least one version.) Names are unique across versions of a
     * given CA.
     */
    private String certificateAuthorityVersionName;

    /**
     * The name of the certificate authority (CA). (This might be referred to as the name of the CA
     * version, as every CA consists of at least one version.) Names are unique across versions of a
     * given CA.
     */
    public String getCertificateAuthorityVersionName() {
        return certificateAuthorityVersionName;
    }
    /** The rotation state of the certificate version. */
    private Stage stage;

    /** The rotation state of the certificate version. */
    public enum Stage implements com.oracle.bmc.http.internal.BmcEnum {
        Current("CURRENT"),
        Pending("PENDING"),
        Latest("LATEST"),
        Previous("PREVIOUS"),
        Deprecated("DEPRECATED"),
        ;

        private final String value;
        private static java.util.Map<String, Stage> map;

        static {
            map = new java.util.HashMap<>();
            for (Stage v : Stage.values()) {
                map.put(v.getValue(), v);
            }
        }

        Stage(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Stage create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Stage: " + key);
        }
    };

    /** The rotation state of the certificate version. */
    public Stage getStage() {
        return stage;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetCertificateAuthorityBundleRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the certificate authority (CA). */
        private String certificateAuthorityId = null;

        /**
         * The OCID of the certificate authority (CA).
         *
         * @param certificateAuthorityId the value to set
         * @return this builder instance
         */
        public Builder certificateAuthorityId(String certificateAuthorityId) {
            this.certificateAuthorityId = certificateAuthorityId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The version number of the certificate authority (CA). */
        private Long versionNumber = null;

        /**
         * The version number of the certificate authority (CA).
         *
         * @param versionNumber the value to set
         * @return this builder instance
         */
        public Builder versionNumber(Long versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }

        /**
         * The name of the certificate authority (CA). (This might be referred to as the name of the
         * CA version, as every CA consists of at least one version.) Names are unique across
         * versions of a given CA.
         */
        private String certificateAuthorityVersionName = null;

        /**
         * The name of the certificate authority (CA). (This might be referred to as the name of the
         * CA version, as every CA consists of at least one version.) Names are unique across
         * versions of a given CA.
         *
         * @param certificateAuthorityVersionName the value to set
         * @return this builder instance
         */
        public Builder certificateAuthorityVersionName(String certificateAuthorityVersionName) {
            this.certificateAuthorityVersionName = certificateAuthorityVersionName;
            return this;
        }

        /** The rotation state of the certificate version. */
        private Stage stage = null;

        /**
         * The rotation state of the certificate version.
         *
         * @param stage the value to set
         * @return this builder instance
         */
        public Builder stage(Stage stage) {
            this.stage = stage;
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
        public Builder copy(GetCertificateAuthorityBundleRequest o) {
            certificateAuthorityId(o.getCertificateAuthorityId());
            opcRequestId(o.getOpcRequestId());
            versionNumber(o.getVersionNumber());
            certificateAuthorityVersionName(o.getCertificateAuthorityVersionName());
            stage(o.getStage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetCertificateAuthorityBundleRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetCertificateAuthorityBundleRequest
         */
        public GetCertificateAuthorityBundleRequest build() {
            GetCertificateAuthorityBundleRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetCertificateAuthorityBundleRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetCertificateAuthorityBundleRequest
         */
        public GetCertificateAuthorityBundleRequest buildWithoutInvocationCallback() {
            GetCertificateAuthorityBundleRequest request =
                    new GetCertificateAuthorityBundleRequest();
            request.certificateAuthorityId = certificateAuthorityId;
            request.opcRequestId = opcRequestId;
            request.versionNumber = versionNumber;
            request.certificateAuthorityVersionName = certificateAuthorityVersionName;
            request.stage = stage;
            return request;
            // new GetCertificateAuthorityBundleRequest(certificateAuthorityId, opcRequestId,
            // versionNumber, certificateAuthorityVersionName, stage);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .certificateAuthorityId(certificateAuthorityId)
                .opcRequestId(opcRequestId)
                .versionNumber(versionNumber)
                .certificateAuthorityVersionName(certificateAuthorityVersionName)
                .stage(stage);
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
        sb.append(",certificateAuthorityId=").append(String.valueOf(this.certificateAuthorityId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",versionNumber=").append(String.valueOf(this.versionNumber));
        sb.append(",certificateAuthorityVersionName=")
                .append(String.valueOf(this.certificateAuthorityVersionName));
        sb.append(",stage=").append(String.valueOf(this.stage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetCertificateAuthorityBundleRequest)) {
            return false;
        }

        GetCertificateAuthorityBundleRequest other = (GetCertificateAuthorityBundleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.certificateAuthorityId, other.certificateAuthorityId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.versionNumber, other.versionNumber)
                && java.util.Objects.equals(
                        this.certificateAuthorityVersionName, other.certificateAuthorityVersionName)
                && java.util.Objects.equals(this.stage, other.stage);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.certificateAuthorityId == null
                                ? 43
                                : this.certificateAuthorityId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.versionNumber == null ? 43 : this.versionNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateAuthorityVersionName == null
                                ? 43
                                : this.certificateAuthorityVersionName.hashCode());
        result = (result * PRIME) + (this.stage == null ? 43 : this.stage.hashCode());
        return result;
    }
}

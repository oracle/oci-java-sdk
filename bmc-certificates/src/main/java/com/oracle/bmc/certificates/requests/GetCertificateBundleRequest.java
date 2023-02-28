/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificates.requests;

import com.oracle.bmc.certificates.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/certificates/GetCertificateBundleExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetCertificateBundleRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public class GetCertificateBundleRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the certificate. */
    private String certificateId;

    /** The OCID of the certificate. */
    public String getCertificateId() {
        return certificateId;
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
    /**
     * The version number of the certificate. The default value is 0, which means that this query
     * parameter is ignored.
     */
    private Long versionNumber;

    /**
     * The version number of the certificate. The default value is 0, which means that this query
     * parameter is ignored.
     */
    public Long getVersionNumber() {
        return versionNumber;
    }
    /**
     * The name of the certificate. (This might be referred to as the name of the certificate
     * version, as every certificate consists of at least one version.) Names are unique across
     * versions of a given certificate.
     */
    private String certificateVersionName;

    /**
     * The name of the certificate. (This might be referred to as the name of the certificate
     * version, as every certificate consists of at least one version.) Names are unique across
     * versions of a given certificate.
     */
    public String getCertificateVersionName() {
        return certificateVersionName;
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
    /**
     * The type of certificate bundle. By default, the private key fields are not returned. When
     * querying for certificate bundles, to return results with certificate contents, the private
     * key in PEM format, and the private key passphrase, specify the value of this parameter as
     * {@code CERTIFICATE_CONTENT_WITH_PRIVATE_KEY}.
     */
    private CertificateBundleType certificateBundleType;

    /**
     * The type of certificate bundle. By default, the private key fields are not returned. When
     * querying for certificate bundles, to return results with certificate contents, the private
     * key in PEM format, and the private key passphrase, specify the value of this parameter as
     * {@code CERTIFICATE_CONTENT_WITH_PRIVATE_KEY}.
     */
    public enum CertificateBundleType implements com.oracle.bmc.http.internal.BmcEnum {
        CertificateContentPublicOnly("CERTIFICATE_CONTENT_PUBLIC_ONLY"),
        CertificateContentWithPrivateKey("CERTIFICATE_CONTENT_WITH_PRIVATE_KEY"),
        ;

        private final String value;
        private static java.util.Map<String, CertificateBundleType> map;

        static {
            map = new java.util.HashMap<>();
            for (CertificateBundleType v : CertificateBundleType.values()) {
                map.put(v.getValue(), v);
            }
        }

        CertificateBundleType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CertificateBundleType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CertificateBundleType: " + key);
        }
    };

    /**
     * The type of certificate bundle. By default, the private key fields are not returned. When
     * querying for certificate bundles, to return results with certificate contents, the private
     * key in PEM format, and the private key passphrase, specify the value of this parameter as
     * {@code CERTIFICATE_CONTENT_WITH_PRIVATE_KEY}.
     */
    public CertificateBundleType getCertificateBundleType() {
        return certificateBundleType;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetCertificateBundleRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the certificate. */
        private String certificateId = null;

        /**
         * The OCID of the certificate.
         *
         * @param certificateId the value to set
         * @return this builder instance
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
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

        /**
         * The version number of the certificate. The default value is 0, which means that this
         * query parameter is ignored.
         */
        private Long versionNumber = null;

        /**
         * The version number of the certificate. The default value is 0, which means that this
         * query parameter is ignored.
         *
         * @param versionNumber the value to set
         * @return this builder instance
         */
        public Builder versionNumber(Long versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }

        /**
         * The name of the certificate. (This might be referred to as the name of the certificate
         * version, as every certificate consists of at least one version.) Names are unique across
         * versions of a given certificate.
         */
        private String certificateVersionName = null;

        /**
         * The name of the certificate. (This might be referred to as the name of the certificate
         * version, as every certificate consists of at least one version.) Names are unique across
         * versions of a given certificate.
         *
         * @param certificateVersionName the value to set
         * @return this builder instance
         */
        public Builder certificateVersionName(String certificateVersionName) {
            this.certificateVersionName = certificateVersionName;
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
         * The type of certificate bundle. By default, the private key fields are not returned. When
         * querying for certificate bundles, to return results with certificate contents, the
         * private key in PEM format, and the private key passphrase, specify the value of this
         * parameter as {@code CERTIFICATE_CONTENT_WITH_PRIVATE_KEY}.
         */
        private CertificateBundleType certificateBundleType = null;

        /**
         * The type of certificate bundle. By default, the private key fields are not returned. When
         * querying for certificate bundles, to return results with certificate contents, the
         * private key in PEM format, and the private key passphrase, specify the value of this
         * parameter as {@code CERTIFICATE_CONTENT_WITH_PRIVATE_KEY}.
         *
         * @param certificateBundleType the value to set
         * @return this builder instance
         */
        public Builder certificateBundleType(CertificateBundleType certificateBundleType) {
            this.certificateBundleType = certificateBundleType;
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
        public Builder copy(GetCertificateBundleRequest o) {
            certificateId(o.getCertificateId());
            opcRequestId(o.getOpcRequestId());
            versionNumber(o.getVersionNumber());
            certificateVersionName(o.getCertificateVersionName());
            stage(o.getStage());
            certificateBundleType(o.getCertificateBundleType());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetCertificateBundleRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetCertificateBundleRequest
         */
        public GetCertificateBundleRequest build() {
            GetCertificateBundleRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetCertificateBundleRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetCertificateBundleRequest
         */
        public GetCertificateBundleRequest buildWithoutInvocationCallback() {
            GetCertificateBundleRequest request = new GetCertificateBundleRequest();
            request.certificateId = certificateId;
            request.opcRequestId = opcRequestId;
            request.versionNumber = versionNumber;
            request.certificateVersionName = certificateVersionName;
            request.stage = stage;
            request.certificateBundleType = certificateBundleType;
            return request;
            // new GetCertificateBundleRequest(certificateId, opcRequestId, versionNumber,
            // certificateVersionName, stage, certificateBundleType);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .certificateId(certificateId)
                .opcRequestId(opcRequestId)
                .versionNumber(versionNumber)
                .certificateVersionName(certificateVersionName)
                .stage(stage)
                .certificateBundleType(certificateBundleType);
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
        sb.append(",certificateId=").append(String.valueOf(this.certificateId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",versionNumber=").append(String.valueOf(this.versionNumber));
        sb.append(",certificateVersionName=").append(String.valueOf(this.certificateVersionName));
        sb.append(",stage=").append(String.valueOf(this.stage));
        sb.append(",certificateBundleType=").append(String.valueOf(this.certificateBundleType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetCertificateBundleRequest)) {
            return false;
        }

        GetCertificateBundleRequest other = (GetCertificateBundleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.certificateId, other.certificateId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.versionNumber, other.versionNumber)
                && java.util.Objects.equals(
                        this.certificateVersionName, other.certificateVersionName)
                && java.util.Objects.equals(this.stage, other.stage)
                && java.util.Objects.equals(
                        this.certificateBundleType, other.certificateBundleType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.certificateId == null ? 43 : this.certificateId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.versionNumber == null ? 43 : this.versionNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateVersionName == null
                                ? 43
                                : this.certificateVersionName.hashCode());
        result = (result * PRIME) + (this.stage == null ? 43 : this.stage.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateBundleType == null
                                ? 43
                                : this.certificateBundleType.hashCode());
        return result;
    }
}

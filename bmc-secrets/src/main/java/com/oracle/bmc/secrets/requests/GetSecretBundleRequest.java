/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.secrets.requests;

import com.oracle.bmc.secrets.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/secrets/GetSecretBundleExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetSecretBundleRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190301")
public class GetSecretBundleRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the secret. */
    private String secretId;

    /** The OCID of the secret. */
    public String getSecretId() {
        return secretId;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The version number of the secret. */
    private Long versionNumber;

    /** The version number of the secret. */
    public Long getVersionNumber() {
        return versionNumber;
    }
    /**
     * The name of the secret. (This might be referred to as the name of the secret version. Names
     * are unique across the different versions of a secret.)
     */
    private String secretVersionName;

    /**
     * The name of the secret. (This might be referred to as the name of the secret version. Names
     * are unique across the different versions of a secret.)
     */
    public String getSecretVersionName() {
        return secretVersionName;
    }
    /** The rotation state of the secret version. */
    private Stage stage;

    /** The rotation state of the secret version. */
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

    /** The rotation state of the secret version. */
    public Stage getStage() {
        return stage;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetSecretBundleRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the secret. */
        private String secretId = null;

        /**
         * The OCID of the secret.
         *
         * @param secretId the value to set
         * @return this builder instance
         */
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The version number of the secret. */
        private Long versionNumber = null;

        /**
         * The version number of the secret.
         *
         * @param versionNumber the value to set
         * @return this builder instance
         */
        public Builder versionNumber(Long versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }

        /**
         * The name of the secret. (This might be referred to as the name of the secret version.
         * Names are unique across the different versions of a secret.)
         */
        private String secretVersionName = null;

        /**
         * The name of the secret. (This might be referred to as the name of the secret version.
         * Names are unique across the different versions of a secret.)
         *
         * @param secretVersionName the value to set
         * @return this builder instance
         */
        public Builder secretVersionName(String secretVersionName) {
            this.secretVersionName = secretVersionName;
            return this;
        }

        /** The rotation state of the secret version. */
        private Stage stage = null;

        /**
         * The rotation state of the secret version.
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
        public Builder copy(GetSecretBundleRequest o) {
            secretId(o.getSecretId());
            opcRequestId(o.getOpcRequestId());
            versionNumber(o.getVersionNumber());
            secretVersionName(o.getSecretVersionName());
            stage(o.getStage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetSecretBundleRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetSecretBundleRequest
         */
        public GetSecretBundleRequest build() {
            GetSecretBundleRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetSecretBundleRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetSecretBundleRequest
         */
        public GetSecretBundleRequest buildWithoutInvocationCallback() {
            GetSecretBundleRequest request = new GetSecretBundleRequest();
            request.secretId = secretId;
            request.opcRequestId = opcRequestId;
            request.versionNumber = versionNumber;
            request.secretVersionName = secretVersionName;
            request.stage = stage;
            return request;
            // new GetSecretBundleRequest(secretId, opcRequestId, versionNumber, secretVersionName,
            // stage);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .secretId(secretId)
                .opcRequestId(opcRequestId)
                .versionNumber(versionNumber)
                .secretVersionName(secretVersionName)
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
        sb.append(",secretId=").append(String.valueOf(this.secretId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",versionNumber=").append(String.valueOf(this.versionNumber));
        sb.append(",secretVersionName=").append(String.valueOf(this.secretVersionName));
        sb.append(",stage=").append(String.valueOf(this.stage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetSecretBundleRequest)) {
            return false;
        }

        GetSecretBundleRequest other = (GetSecretBundleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.versionNumber, other.versionNumber)
                && java.util.Objects.equals(this.secretVersionName, other.secretVersionName)
                && java.util.Objects.equals(this.stage, other.stage);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.versionNumber == null ? 43 : this.versionNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.secretVersionName == null ? 43 : this.secretVersionName.hashCode());
        result = (result * PRIME) + (this.stage == null ? 43 : this.stage.hashCode());
        return result;
    }
}

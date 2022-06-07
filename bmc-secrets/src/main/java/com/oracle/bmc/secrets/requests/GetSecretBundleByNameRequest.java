/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.secrets.requests;

import com.oracle.bmc.secrets.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/secrets/GetSecretBundleByNameExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetSecretBundleByNameRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190301")
public class GetSecretBundleByNameRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * A user-friendly name for the secret. Secret names are unique within a vault. Secret names are case-sensitive.
     */
    private String secretName;

    public String getSecretName() {
        return secretName;
    }
    /**
     * The OCID of the vault that contains the secret.
     */
    private String vaultId;

    public String getVaultId() {
        return vaultId;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The version number of the secret.
     */
    private Long versionNumber;

    public Long getVersionNumber() {
        return versionNumber;
    }
    /**
     * The name of the secret. (This might be referred to as the name of the secret version. Names are unique across the different versions of a secret.)
     */
    private String secretVersionName;

    public String getSecretVersionName() {
        return secretVersionName;
    }
    /**
     * The rotation state of the secret version.
     */
    private Stage stage;

    /**
     * The rotation state of the secret version.
     **/
    public enum Stage {
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

    public Stage getStage() {
        return stage;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetSecretBundleByNameRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String secretName = null;

        /**
         * A user-friendly name for the secret. Secret names are unique within a vault. Secret names are case-sensitive.
         * @return this builder instance
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            return this;
        }

        private String vaultId = null;

        /**
         * The OCID of the vault that contains the secret.
         * @return this builder instance
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private Long versionNumber = null;

        /**
         * The version number of the secret.
         * @return this builder instance
         */
        public Builder versionNumber(Long versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }

        private String secretVersionName = null;

        /**
         * The name of the secret. (This might be referred to as the name of the secret version. Names are unique across the different versions of a secret.)
         * @return this builder instance
         */
        public Builder secretVersionName(String secretVersionName) {
            this.secretVersionName = secretVersionName;
            return this;
        }

        private Stage stage = null;

        /**
         * The rotation state of the secret version.
         * @return this builder instance
         */
        public Builder stage(Stage stage) {
            this.stage = stage;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * @return this builder instance
         */
        public Builder copy(GetSecretBundleByNameRequest o) {
            secretName(o.getSecretName());
            vaultId(o.getVaultId());
            opcRequestId(o.getOpcRequestId());
            versionNumber(o.getVersionNumber());
            secretVersionName(o.getSecretVersionName());
            stage(o.getStage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetSecretBundleByNameRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetSecretBundleByNameRequest
         */
        public GetSecretBundleByNameRequest build() {
            GetSecretBundleByNameRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetSecretBundleByNameRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetSecretBundleByNameRequest
         */
        public GetSecretBundleByNameRequest buildWithoutInvocationCallback() {
            GetSecretBundleByNameRequest request = new GetSecretBundleByNameRequest();
            request.secretName = secretName;
            request.vaultId = vaultId;
            request.opcRequestId = opcRequestId;
            request.versionNumber = versionNumber;
            request.secretVersionName = secretVersionName;
            request.stage = stage;
            return request;
            // new GetSecretBundleByNameRequest(secretName, vaultId, opcRequestId, versionNumber, secretVersionName, stage);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .secretName(secretName)
                .vaultId(vaultId)
                .opcRequestId(opcRequestId)
                .versionNumber(versionNumber)
                .secretVersionName(secretVersionName)
                .stage(stage);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",secretName=").append(String.valueOf(this.secretName));
        sb.append(",vaultId=").append(String.valueOf(this.vaultId));
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
        if (!(o instanceof GetSecretBundleByNameRequest)) {
            return false;
        }

        GetSecretBundleByNameRequest other = (GetSecretBundleByNameRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.secretName, other.secretName)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.versionNumber, other.versionNumber)
                && java.util.Objects.equals(this.secretVersionName, other.secretVersionName)
                && java.util.Objects.equals(this.stage, other.stage);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.secretName == null ? 43 : this.secretName.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
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

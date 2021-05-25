/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.secrets.requests;

import com.oracle.bmc.secrets.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/secrets/GetSecretBundleByNameExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetSecretBundleByNameRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190301")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetSecretBundleByNameRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * A user-friendly name for the secret. Secret names are unique within a vault. Secret names are case-sensitive.
     */
    private String secretName;

    /**
     * The OCID of the vault that contains the secret.
     */
    private String vaultId;

    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * The version number of the secret.
     */
    private Long versionNumber;

    /**
     * The name of the secret. (This might be referred to as the name of the secret version. Names are unique across the different versions of a secret.)
     */
    private String secretVersionName;

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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetSecretBundleByNameRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
    }
}

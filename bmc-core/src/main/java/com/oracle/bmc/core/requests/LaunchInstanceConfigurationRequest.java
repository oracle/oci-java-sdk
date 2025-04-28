/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/LaunchInstanceConfigurationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * LaunchInstanceConfigurationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class LaunchInstanceConfigurationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.InstanceConfigurationInstanceDetails> {

    /** The OCID of the instance configuration. */
    private String instanceConfigurationId;

    /** The OCID of the instance configuration. */
    public String getInstanceConfigurationId() {
        return instanceConfigurationId;
    }
    /** Instance configuration Instance Details */
    private com.oracle.bmc.core.model.InstanceConfigurationInstanceDetails instanceConfiguration;

    /** Instance configuration Instance Details */
    public com.oracle.bmc.core.model.InstanceConfigurationInstanceDetails
            getInstanceConfiguration() {
        return instanceConfiguration;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.InstanceConfigurationInstanceDetails getBody$() {
        return instanceConfiguration;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    LaunchInstanceConfigurationRequest,
                    com.oracle.bmc.core.model.InstanceConfigurationInstanceDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the instance configuration. */
        private String instanceConfigurationId = null;

        /**
         * The OCID of the instance configuration.
         *
         * @param instanceConfigurationId the value to set
         * @return this builder instance
         */
        public Builder instanceConfigurationId(String instanceConfigurationId) {
            this.instanceConfigurationId = instanceConfigurationId;
            return this;
        }

        /** Instance configuration Instance Details */
        private com.oracle.bmc.core.model.InstanceConfigurationInstanceDetails
                instanceConfiguration = null;

        /**
         * Instance configuration Instance Details
         *
         * @param instanceConfiguration the value to set
         * @return this builder instance
         */
        public Builder instanceConfiguration(
                com.oracle.bmc.core.model.InstanceConfigurationInstanceDetails
                        instanceConfiguration) {
            this.instanceConfiguration = instanceConfiguration;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(LaunchInstanceConfigurationRequest o) {
            instanceConfigurationId(o.getInstanceConfigurationId());
            instanceConfiguration(o.getInstanceConfiguration());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of LaunchInstanceConfigurationRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of LaunchInstanceConfigurationRequest
         */
        public LaunchInstanceConfigurationRequest build() {
            LaunchInstanceConfigurationRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.core.model.InstanceConfigurationInstanceDetails body) {
            instanceConfiguration(body);
            return this;
        }

        /**
         * Build the instance of LaunchInstanceConfigurationRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of LaunchInstanceConfigurationRequest
         */
        public LaunchInstanceConfigurationRequest buildWithoutInvocationCallback() {
            LaunchInstanceConfigurationRequest request = new LaunchInstanceConfigurationRequest();
            request.instanceConfigurationId = instanceConfigurationId;
            request.instanceConfiguration = instanceConfiguration;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new LaunchInstanceConfigurationRequest(instanceConfigurationId,
            // instanceConfiguration, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .instanceConfigurationId(instanceConfigurationId)
                .instanceConfiguration(instanceConfiguration)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",instanceConfigurationId=").append(String.valueOf(this.instanceConfigurationId));
        sb.append(",instanceConfiguration=").append(String.valueOf(this.instanceConfiguration));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LaunchInstanceConfigurationRequest)) {
            return false;
        }

        LaunchInstanceConfigurationRequest other = (LaunchInstanceConfigurationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.instanceConfigurationId, other.instanceConfigurationId)
                && java.util.Objects.equals(this.instanceConfiguration, other.instanceConfiguration)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.instanceConfigurationId == null
                                ? 43
                                : this.instanceConfigurationId.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceConfiguration == null
                                ? 43
                                : this.instanceConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}

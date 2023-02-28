/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/LaunchDbSystemExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use LaunchDbSystemRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class LaunchDbSystemRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.LaunchDbSystemBase> {

    /**
     * Request to launch a DB system.
     *
     * <p>*Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model
     * APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model)
     * instead.
     *
     * <p>For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See
     * [Switching an Exadata DB System to the New Resource Model and
     * APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm)
     * for details on converting existing Exadata DB systems to the new resource model.
     */
    private com.oracle.bmc.database.model.LaunchDbSystemBase launchDbSystemDetails;

    /**
     * Request to launch a DB system.
     *
     * <p>*Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model
     * APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model)
     * instead.
     *
     * <p>For Exadata Cloud Service instances, support for this API will end on May 15th, 2021. See
     * [Switching an Exadata DB System to the New Resource Model and
     * APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm)
     * for details on converting existing Exadata DB systems to the new resource model.
     */
    public com.oracle.bmc.database.model.LaunchDbSystemBase getLaunchDbSystemDetails() {
        return launchDbSystemDetails;
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
    public com.oracle.bmc.database.model.LaunchDbSystemBase getBody$() {
        return launchDbSystemDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    LaunchDbSystemRequest, com.oracle.bmc.database.model.LaunchDbSystemBase> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Request to launch a DB system.
         *
         * <p>*Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model
         * APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model)
         * instead.
         *
         * <p>For Exadata Cloud Service instances, support for this API will end on May 15th, 2021.
         * See [Switching an Exadata DB System to the New Resource Model and
         * APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm)
         * for details on converting existing Exadata DB systems to the new resource model.
         */
        private com.oracle.bmc.database.model.LaunchDbSystemBase launchDbSystemDetails = null;

        /**
         * Request to launch a DB system.
         *
         * <p>*Note:** Deprecated for Exadata Cloud Service systems. Use the [new resource model
         * APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem.htm#exaflexsystem_topic-resource_model)
         * instead.
         *
         * <p>For Exadata Cloud Service instances, support for this API will end on May 15th, 2021.
         * See [Switching an Exadata DB System to the New Resource Model and
         * APIs](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/exaflexsystem_topic-resource_model_conversion.htm)
         * for details on converting existing Exadata DB systems to the new resource model.
         *
         * @param launchDbSystemDetails the value to set
         * @return this builder instance
         */
        public Builder launchDbSystemDetails(
                com.oracle.bmc.database.model.LaunchDbSystemBase launchDbSystemDetails) {
            this.launchDbSystemDetails = launchDbSystemDetails;
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
        public Builder copy(LaunchDbSystemRequest o) {
            launchDbSystemDetails(o.getLaunchDbSystemDetails());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of LaunchDbSystemRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of LaunchDbSystemRequest
         */
        public LaunchDbSystemRequest build() {
            LaunchDbSystemRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.database.model.LaunchDbSystemBase body) {
            launchDbSystemDetails(body);
            return this;
        }

        /**
         * Build the instance of LaunchDbSystemRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of LaunchDbSystemRequest
         */
        public LaunchDbSystemRequest buildWithoutInvocationCallback() {
            LaunchDbSystemRequest request = new LaunchDbSystemRequest();
            request.launchDbSystemDetails = launchDbSystemDetails;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new LaunchDbSystemRequest(launchDbSystemDetails, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .launchDbSystemDetails(launchDbSystemDetails)
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
        sb.append(",launchDbSystemDetails=").append(String.valueOf(this.launchDbSystemDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LaunchDbSystemRequest)) {
            return false;
        }

        LaunchDbSystemRequest other = (LaunchDbSystemRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.launchDbSystemDetails, other.launchDbSystemDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.launchDbSystemDetails == null
                                ? 43
                                : this.launchDbSystemDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}

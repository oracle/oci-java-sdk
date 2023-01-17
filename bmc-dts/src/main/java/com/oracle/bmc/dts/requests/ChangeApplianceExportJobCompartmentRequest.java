/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.requests;

import com.oracle.bmc.dts.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/ChangeApplianceExportJobCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeApplianceExportJobCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
public class ChangeApplianceExportJobCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dts.model.ChangeApplianceExportJobCompartmentDetails> {

    /**
     * ID of the Appliance Export Job
     */
    private String applianceExportJobId;

    /**
     * ID of the Appliance Export Job
     */
    public String getApplianceExportJobId() {
        return applianceExportJobId;
    }
    /**
     * CompartmentId of the destination compartment
     */
    private com.oracle.bmc.dts.model.ChangeApplianceExportJobCompartmentDetails
            changeApplianceExportJobCompartmentDetails;

    /**
     * CompartmentId of the destination compartment
     */
    public com.oracle.bmc.dts.model.ChangeApplianceExportJobCompartmentDetails
            getChangeApplianceExportJobCompartmentDetails() {
        return changeApplianceExportJobCompartmentDetails;
    }
    /**
     * The entity tag to match. Optional, if set, the update will be successful only if the
     * object's tag matches the tag specified in the request.
     *
     */
    private String ifMatch;

    /**
     * The entity tag to match. Optional, if set, the update will be successful only if the
     * object's tag matches the tag specified in the request.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dts.model.ChangeApplianceExportJobCompartmentDetails getBody$() {
        return changeApplianceExportJobCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeApplianceExportJobCompartmentRequest,
                    com.oracle.bmc.dts.model.ChangeApplianceExportJobCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * ID of the Appliance Export Job
         */
        private String applianceExportJobId = null;

        /**
         * ID of the Appliance Export Job
         * @param applianceExportJobId the value to set
         * @return this builder instance
         */
        public Builder applianceExportJobId(String applianceExportJobId) {
            this.applianceExportJobId = applianceExportJobId;
            return this;
        }

        /**
         * CompartmentId of the destination compartment
         */
        private com.oracle.bmc.dts.model.ChangeApplianceExportJobCompartmentDetails
                changeApplianceExportJobCompartmentDetails = null;

        /**
         * CompartmentId of the destination compartment
         * @param changeApplianceExportJobCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeApplianceExportJobCompartmentDetails(
                com.oracle.bmc.dts.model.ChangeApplianceExportJobCompartmentDetails
                        changeApplianceExportJobCompartmentDetails) {
            this.changeApplianceExportJobCompartmentDetails =
                    changeApplianceExportJobCompartmentDetails;
            return this;
        }

        /**
         * The entity tag to match. Optional, if set, the update will be successful only if the
         * object's tag matches the tag specified in the request.
         *
         */
        private String ifMatch = null;

        /**
         * The entity tag to match. Optional, if set, the update will be successful only if the
         * object's tag matches the tag specified in the request.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
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
        public Builder copy(ChangeApplianceExportJobCompartmentRequest o) {
            applianceExportJobId(o.getApplianceExportJobId());
            changeApplianceExportJobCompartmentDetails(
                    o.getChangeApplianceExportJobCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeApplianceExportJobCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeApplianceExportJobCompartmentRequest
         */
        public ChangeApplianceExportJobCompartmentRequest build() {
            ChangeApplianceExportJobCompartmentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.dts.model.ChangeApplianceExportJobCompartmentDetails body) {
            changeApplianceExportJobCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeApplianceExportJobCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeApplianceExportJobCompartmentRequest
         */
        public ChangeApplianceExportJobCompartmentRequest buildWithoutInvocationCallback() {
            ChangeApplianceExportJobCompartmentRequest request =
                    new ChangeApplianceExportJobCompartmentRequest();
            request.applianceExportJobId = applianceExportJobId;
            request.changeApplianceExportJobCompartmentDetails =
                    changeApplianceExportJobCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeApplianceExportJobCompartmentRequest(applianceExportJobId, changeApplianceExportJobCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .applianceExportJobId(applianceExportJobId)
                .changeApplianceExportJobCompartmentDetails(
                        changeApplianceExportJobCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",applianceExportJobId=").append(String.valueOf(this.applianceExportJobId));
        sb.append(",changeApplianceExportJobCompartmentDetails=")
                .append(String.valueOf(this.changeApplianceExportJobCompartmentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeApplianceExportJobCompartmentRequest)) {
            return false;
        }

        ChangeApplianceExportJobCompartmentRequest other =
                (ChangeApplianceExportJobCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.applianceExportJobId, other.applianceExportJobId)
                && java.util.Objects.equals(
                        this.changeApplianceExportJobCompartmentDetails,
                        other.changeApplianceExportJobCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.applianceExportJobId == null
                                ? 43
                                : this.applianceExportJobId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeApplianceExportJobCompartmentDetails == null
                                ? 43
                                : this.changeApplianceExportJobCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}

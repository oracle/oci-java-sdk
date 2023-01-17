/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/SwitchoverDataGuardAssociationExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use SwitchoverDataGuardAssociationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class SwitchoverDataGuardAssociationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.SwitchoverDataGuardAssociationDetails> {

    /**
     * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String databaseId;

    /**
     * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getDatabaseId() {
        return databaseId;
    }
    /**
     * The Data Guard association's [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String dataGuardAssociationId;

    /**
     * The Data Guard association's [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getDataGuardAssociationId() {
        return dataGuardAssociationId;
    }
    /**
     * Request to swtichover a primary to a standby.
     */
    private com.oracle.bmc.database.model.SwitchoverDataGuardAssociationDetails
            switchoverDataGuardAssociationDetails;

    /**
     * Request to swtichover a primary to a standby.
     */
    public com.oracle.bmc.database.model.SwitchoverDataGuardAssociationDetails
            getSwitchoverDataGuardAssociationDetails() {
        return switchoverDataGuardAssociationDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.database.model.SwitchoverDataGuardAssociationDetails getBody$() {
        return switchoverDataGuardAssociationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SwitchoverDataGuardAssociationRequest,
                    com.oracle.bmc.database.model.SwitchoverDataGuardAssociationDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String databaseId = null;

        /**
         * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param databaseId the value to set
         * @return this builder instance
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        /**
         * The Data Guard association's [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String dataGuardAssociationId = null;

        /**
         * The Data Guard association's [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param dataGuardAssociationId the value to set
         * @return this builder instance
         */
        public Builder dataGuardAssociationId(String dataGuardAssociationId) {
            this.dataGuardAssociationId = dataGuardAssociationId;
            return this;
        }

        /**
         * Request to swtichover a primary to a standby.
         */
        private com.oracle.bmc.database.model.SwitchoverDataGuardAssociationDetails
                switchoverDataGuardAssociationDetails = null;

        /**
         * Request to swtichover a primary to a standby.
         * @param switchoverDataGuardAssociationDetails the value to set
         * @return this builder instance
         */
        public Builder switchoverDataGuardAssociationDetails(
                com.oracle.bmc.database.model.SwitchoverDataGuardAssociationDetails
                        switchoverDataGuardAssociationDetails) {
            this.switchoverDataGuardAssociationDetails = switchoverDataGuardAssociationDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(SwitchoverDataGuardAssociationRequest o) {
            databaseId(o.getDatabaseId());
            dataGuardAssociationId(o.getDataGuardAssociationId());
            switchoverDataGuardAssociationDetails(o.getSwitchoverDataGuardAssociationDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SwitchoverDataGuardAssociationRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of SwitchoverDataGuardAssociationRequest
         */
        public SwitchoverDataGuardAssociationRequest build() {
            SwitchoverDataGuardAssociationRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.database.model.SwitchoverDataGuardAssociationDetails body) {
            switchoverDataGuardAssociationDetails(body);
            return this;
        }

        /**
         * Build the instance of SwitchoverDataGuardAssociationRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SwitchoverDataGuardAssociationRequest
         */
        public SwitchoverDataGuardAssociationRequest buildWithoutInvocationCallback() {
            SwitchoverDataGuardAssociationRequest request =
                    new SwitchoverDataGuardAssociationRequest();
            request.databaseId = databaseId;
            request.dataGuardAssociationId = dataGuardAssociationId;
            request.switchoverDataGuardAssociationDetails = switchoverDataGuardAssociationDetails;
            request.ifMatch = ifMatch;
            return request;
            // new SwitchoverDataGuardAssociationRequest(databaseId, dataGuardAssociationId, switchoverDataGuardAssociationDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .databaseId(databaseId)
                .dataGuardAssociationId(dataGuardAssociationId)
                .switchoverDataGuardAssociationDetails(switchoverDataGuardAssociationDetails)
                .ifMatch(ifMatch);
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
        sb.append(",databaseId=").append(String.valueOf(this.databaseId));
        sb.append(",dataGuardAssociationId=").append(String.valueOf(this.dataGuardAssociationId));
        sb.append(",switchoverDataGuardAssociationDetails=")
                .append(String.valueOf(this.switchoverDataGuardAssociationDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SwitchoverDataGuardAssociationRequest)) {
            return false;
        }

        SwitchoverDataGuardAssociationRequest other = (SwitchoverDataGuardAssociationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(
                        this.dataGuardAssociationId, other.dataGuardAssociationId)
                && java.util.Objects.equals(
                        this.switchoverDataGuardAssociationDetails,
                        other.switchoverDataGuardAssociationDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.dataGuardAssociationId == null
                                ? 43
                                : this.dataGuardAssociationId.hashCode());
        result =
                (result * PRIME)
                        + (this.switchoverDataGuardAssociationDetails == null
                                ? 43
                                : this.switchoverDataGuardAssociationDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}

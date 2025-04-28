/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.requests;

import com.oracle.bmc.stackmonitoring.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/stackmonitoring/UpdateAlarmConditionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateAlarmConditionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class UpdateAlarmConditionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.stackmonitoring.model.UpdateAlarmConditionDetails> {

    /** Details required for updating a new alarm condition */
    private com.oracle.bmc.stackmonitoring.model.UpdateAlarmConditionDetails
            updateAlarmConditionDetails;

    /** Details required for updating a new alarm condition */
    public com.oracle.bmc.stackmonitoring.model.UpdateAlarmConditionDetails
            getUpdateAlarmConditionDetails() {
        return updateAlarmConditionDetails;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * alarm condition.
     */
    private String alarmConditionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * alarm condition.
     */
    public String getAlarmConditionId() {
        return alarmConditionId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * monitoring template.
     */
    private String monitoringTemplateId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * monitoring template.
     */
    public String getMonitoringTemplateId() {
        return monitoringTemplateId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
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
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.stackmonitoring.model.UpdateAlarmConditionDetails getBody$() {
        return updateAlarmConditionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAlarmConditionRequest,
                    com.oracle.bmc.stackmonitoring.model.UpdateAlarmConditionDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details required for updating a new alarm condition */
        private com.oracle.bmc.stackmonitoring.model.UpdateAlarmConditionDetails
                updateAlarmConditionDetails = null;

        /**
         * Details required for updating a new alarm condition
         *
         * @param updateAlarmConditionDetails the value to set
         * @return this builder instance
         */
        public Builder updateAlarmConditionDetails(
                com.oracle.bmc.stackmonitoring.model.UpdateAlarmConditionDetails
                        updateAlarmConditionDetails) {
            this.updateAlarmConditionDetails = updateAlarmConditionDetails;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * alarm condition.
         */
        private String alarmConditionId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * alarm condition.
         *
         * @param alarmConditionId the value to set
         * @return this builder instance
         */
        public Builder alarmConditionId(String alarmConditionId) {
            this.alarmConditionId = alarmConditionId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * monitoring template.
         */
        private String monitoringTemplateId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * monitoring template.
         *
         * @param monitoringTemplateId the value to set
         * @return this builder instance
         */
        public Builder monitoringTemplateId(String monitoringTemplateId) {
            this.monitoringTemplateId = monitoringTemplateId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateAlarmConditionRequest o) {
            updateAlarmConditionDetails(o.getUpdateAlarmConditionDetails());
            alarmConditionId(o.getAlarmConditionId());
            monitoringTemplateId(o.getMonitoringTemplateId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAlarmConditionRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateAlarmConditionRequest
         */
        public UpdateAlarmConditionRequest build() {
            UpdateAlarmConditionRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.stackmonitoring.model.UpdateAlarmConditionDetails body) {
            updateAlarmConditionDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAlarmConditionRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAlarmConditionRequest
         */
        public UpdateAlarmConditionRequest buildWithoutInvocationCallback() {
            UpdateAlarmConditionRequest request = new UpdateAlarmConditionRequest();
            request.updateAlarmConditionDetails = updateAlarmConditionDetails;
            request.alarmConditionId = alarmConditionId;
            request.monitoringTemplateId = monitoringTemplateId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateAlarmConditionRequest(updateAlarmConditionDetails, alarmConditionId,
            // monitoringTemplateId, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .updateAlarmConditionDetails(updateAlarmConditionDetails)
                .alarmConditionId(alarmConditionId)
                .monitoringTemplateId(monitoringTemplateId)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",updateAlarmConditionDetails=")
                .append(String.valueOf(this.updateAlarmConditionDetails));
        sb.append(",alarmConditionId=").append(String.valueOf(this.alarmConditionId));
        sb.append(",monitoringTemplateId=").append(String.valueOf(this.monitoringTemplateId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAlarmConditionRequest)) {
            return false;
        }

        UpdateAlarmConditionRequest other = (UpdateAlarmConditionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.updateAlarmConditionDetails, other.updateAlarmConditionDetails)
                && java.util.Objects.equals(this.alarmConditionId, other.alarmConditionId)
                && java.util.Objects.equals(this.monitoringTemplateId, other.monitoringTemplateId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updateAlarmConditionDetails == null
                                ? 43
                                : this.updateAlarmConditionDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.alarmConditionId == null ? 43 : this.alarmConditionId.hashCode());
        result =
                (result * PRIME)
                        + (this.monitoringTemplateId == null
                                ? 43
                                : this.monitoringTemplateId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

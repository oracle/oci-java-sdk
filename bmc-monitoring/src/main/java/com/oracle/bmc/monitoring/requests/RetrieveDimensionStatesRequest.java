/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.requests;

import com.oracle.bmc.monitoring.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/RetrieveDimensionStatesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use RetrieveDimensionStatesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
public class RetrieveDimensionStatesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.monitoring.model.RetrieveDimensionStatesDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an alarm.
     *
     */
    private String alarmId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an alarm.
     *
     */
    public String getAlarmId() {
        return alarmId;
    }
    /**
     * Customer part of the request identifier token. If you need to contact Oracle about a particular
     * request, please provide the complete request ID.
     *
     */
    private String opcRequestId;

    /**
     * Customer part of the request identifier token. If you need to contact Oracle about a particular
     * request, please provide the complete request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Default: 1000
     * <p>
     * Example: 500
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Default: 1000
     * <p>
     * Example: 500
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The configuration details for retrieving the current alarm status of each metric stream.
     *
     */
    private com.oracle.bmc.monitoring.model.RetrieveDimensionStatesDetails
            retrieveDimensionStatesDetails;

    /**
     * The configuration details for retrieving the current alarm status of each metric stream.
     *
     */
    public com.oracle.bmc.monitoring.model.RetrieveDimensionStatesDetails
            getRetrieveDimensionStatesDetails() {
        return retrieveDimensionStatesDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.monitoring.model.RetrieveDimensionStatesDetails getBody$() {
        return retrieveDimensionStatesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RetrieveDimensionStatesRequest,
                    com.oracle.bmc.monitoring.model.RetrieveDimensionStatesDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an alarm.
         *
         */
        private String alarmId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of an alarm.
         *
         * @param alarmId the value to set
         * @return this builder instance
         */
        public Builder alarmId(String alarmId) {
            this.alarmId = alarmId;
            return this;
        }

        /**
         * Customer part of the request identifier token. If you need to contact Oracle about a particular
         * request, please provide the complete request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Customer part of the request identifier token. If you need to contact Oracle about a particular
         * request, please provide the complete request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
         * For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
         * For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
         * For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Default: 1000
         * <p>
         * Example: 500
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
         * For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Default: 1000
         * <p>
         * Example: 500
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The configuration details for retrieving the current alarm status of each metric stream.
         *
         */
        private com.oracle.bmc.monitoring.model.RetrieveDimensionStatesDetails
                retrieveDimensionStatesDetails = null;

        /**
         * The configuration details for retrieving the current alarm status of each metric stream.
         *
         * @param retrieveDimensionStatesDetails the value to set
         * @return this builder instance
         */
        public Builder retrieveDimensionStatesDetails(
                com.oracle.bmc.monitoring.model.RetrieveDimensionStatesDetails
                        retrieveDimensionStatesDetails) {
            this.retrieveDimensionStatesDetails = retrieveDimensionStatesDetails;
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
        public Builder copy(RetrieveDimensionStatesRequest o) {
            alarmId(o.getAlarmId());
            opcRequestId(o.getOpcRequestId());
            page(o.getPage());
            limit(o.getLimit());
            retrieveDimensionStatesDetails(o.getRetrieveDimensionStatesDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RetrieveDimensionStatesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of RetrieveDimensionStatesRequest
         */
        public RetrieveDimensionStatesRequest build() {
            RetrieveDimensionStatesRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.monitoring.model.RetrieveDimensionStatesDetails body) {
            retrieveDimensionStatesDetails(body);
            return this;
        }

        /**
         * Build the instance of RetrieveDimensionStatesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RetrieveDimensionStatesRequest
         */
        public RetrieveDimensionStatesRequest buildWithoutInvocationCallback() {
            RetrieveDimensionStatesRequest request = new RetrieveDimensionStatesRequest();
            request.alarmId = alarmId;
            request.opcRequestId = opcRequestId;
            request.page = page;
            request.limit = limit;
            request.retrieveDimensionStatesDetails = retrieveDimensionStatesDetails;
            return request;
            // new RetrieveDimensionStatesRequest(alarmId, opcRequestId, page, limit, retrieveDimensionStatesDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .alarmId(alarmId)
                .opcRequestId(opcRequestId)
                .page(page)
                .limit(limit)
                .retrieveDimensionStatesDetails(retrieveDimensionStatesDetails);
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
        sb.append(",alarmId=").append(String.valueOf(this.alarmId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",retrieveDimensionStatesDetails=")
                .append(String.valueOf(this.retrieveDimensionStatesDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RetrieveDimensionStatesRequest)) {
            return false;
        }

        RetrieveDimensionStatesRequest other = (RetrieveDimensionStatesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.alarmId, other.alarmId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(
                        this.retrieveDimensionStatesDetails, other.retrieveDimensionStatesDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.alarmId == null ? 43 : this.alarmId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result =
                (result * PRIME)
                        + (this.retrieveDimensionStatesDetails == null
                                ? 43
                                : this.retrieveDimensionStatesDetails.hashCode());
        return result;
    }
}

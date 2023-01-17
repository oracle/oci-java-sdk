/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GenerateReportExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GenerateReportRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GenerateReportRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.GenerateReportDetails> {

    /**
     * Unique report definition identifier
     */
    private String reportDefinitionId;

    /**
     * Unique report definition identifier
     */
    public String getReportDefinitionId() {
        return reportDefinitionId;
    }
    /**
     * Details for report generation. It contains details such as PDF/XLS and filter parameters like audit event time limits, number of rows and target databases etc
     */
    private com.oracle.bmc.datasafe.model.GenerateReportDetails generateReportDetails;

    /**
     * Details for report generation. It contains details such as PDF/XLS and filter parameters like audit event time limits, number of rows and target databases etc
     */
    public com.oracle.bmc.datasafe.model.GenerateReportDetails getGenerateReportDetails() {
        return generateReportDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * The scimQuery query parameter accepts filter expressions that use the syntax described in Section 3.2.2.2
     * of the System for Cross-Domain Identity Management (SCIM) specification, which is available
     * at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In SCIM filtering expressions,
     * text, date, and time values must be enclosed in quotation marks, with date and time values using ISO-8601 format.
     * (Numeric and boolean values should not be quoted.)
     * <p>
     **Example:** query=(dateGenerated ge '2021-12-18T01-00-26') and (ilmTarget eq 'dscs-target')
     *
     */
    private String scimQuery;

    /**
     * The scimQuery query parameter accepts filter expressions that use the syntax described in Section 3.2.2.2
     * of the System for Cross-Domain Identity Management (SCIM) specification, which is available
     * at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In SCIM filtering expressions,
     * text, date, and time values must be enclosed in quotation marks, with date and time values using ISO-8601 format.
     * (Numeric and boolean values should not be quoted.)
     * <p>
     **Example:** query=(dateGenerated ge '2021-12-18T01-00-26') and (ilmTarget eq 'dscs-target')
     *
     */
    public String getScimQuery() {
        return scimQuery;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datasafe.model.GenerateReportDetails getBody$() {
        return generateReportDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GenerateReportRequest, com.oracle.bmc.datasafe.model.GenerateReportDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique report definition identifier
         */
        private String reportDefinitionId = null;

        /**
         * Unique report definition identifier
         * @param reportDefinitionId the value to set
         * @return this builder instance
         */
        public Builder reportDefinitionId(String reportDefinitionId) {
            this.reportDefinitionId = reportDefinitionId;
            return this;
        }

        /**
         * Details for report generation. It contains details such as PDF/XLS and filter parameters like audit event time limits, number of rows and target databases etc
         */
        private com.oracle.bmc.datasafe.model.GenerateReportDetails generateReportDetails = null;

        /**
         * Details for report generation. It contains details such as PDF/XLS and filter parameters like audit event time limits, number of rows and target databases etc
         * @param generateReportDetails the value to set
         * @return this builder instance
         */
        public Builder generateReportDetails(
                com.oracle.bmc.datasafe.model.GenerateReportDetails generateReportDetails) {
            this.generateReportDetails = generateReportDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * The scimQuery query parameter accepts filter expressions that use the syntax described in Section 3.2.2.2
         * of the System for Cross-Domain Identity Management (SCIM) specification, which is available
         * at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In SCIM filtering expressions,
         * text, date, and time values must be enclosed in quotation marks, with date and time values using ISO-8601 format.
         * (Numeric and boolean values should not be quoted.)
         * <p>
         **Example:** query=(dateGenerated ge '2021-12-18T01-00-26') and (ilmTarget eq 'dscs-target')
         *
         */
        private String scimQuery = null;

        /**
         * The scimQuery query parameter accepts filter expressions that use the syntax described in Section 3.2.2.2
         * of the System for Cross-Domain Identity Management (SCIM) specification, which is available
         * at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In SCIM filtering expressions,
         * text, date, and time values must be enclosed in quotation marks, with date and time values using ISO-8601 format.
         * (Numeric and boolean values should not be quoted.)
         * <p>
         **Example:** query=(dateGenerated ge '2021-12-18T01-00-26') and (ilmTarget eq 'dscs-target')
         *
         * @param scimQuery the value to set
         * @return this builder instance
         */
        public Builder scimQuery(String scimQuery) {
            this.scimQuery = scimQuery;
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
        public Builder copy(GenerateReportRequest o) {
            reportDefinitionId(o.getReportDefinitionId());
            generateReportDetails(o.getGenerateReportDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            scimQuery(o.getScimQuery());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GenerateReportRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GenerateReportRequest
         */
        public GenerateReportRequest build() {
            GenerateReportRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datasafe.model.GenerateReportDetails body) {
            generateReportDetails(body);
            return this;
        }

        /**
         * Build the instance of GenerateReportRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GenerateReportRequest
         */
        public GenerateReportRequest buildWithoutInvocationCallback() {
            GenerateReportRequest request = new GenerateReportRequest();
            request.reportDefinitionId = reportDefinitionId;
            request.generateReportDetails = generateReportDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.scimQuery = scimQuery;
            return request;
            // new GenerateReportRequest(reportDefinitionId, generateReportDetails, ifMatch, opcRequestId, opcRetryToken, scimQuery);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .reportDefinitionId(reportDefinitionId)
                .generateReportDetails(generateReportDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .scimQuery(scimQuery);
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
        sb.append(",reportDefinitionId=").append(String.valueOf(this.reportDefinitionId));
        sb.append(",generateReportDetails=").append(String.valueOf(this.generateReportDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",scimQuery=").append(String.valueOf(this.scimQuery));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateReportRequest)) {
            return false;
        }

        GenerateReportRequest other = (GenerateReportRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.reportDefinitionId, other.reportDefinitionId)
                && java.util.Objects.equals(this.generateReportDetails, other.generateReportDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.scimQuery, other.scimQuery);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.reportDefinitionId == null
                                ? 43
                                : this.reportDefinitionId.hashCode());
        result =
                (result * PRIME)
                        + (this.generateReportDetails == null
                                ? 43
                                : this.generateReportDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.scimQuery == null ? 43 : this.scimQuery.hashCode());
        return result;
    }
}

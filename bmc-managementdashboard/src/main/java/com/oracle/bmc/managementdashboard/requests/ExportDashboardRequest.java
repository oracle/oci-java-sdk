/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard.requests;

import com.oracle.bmc.managementdashboard.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementdashboard/ExportDashboardExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ExportDashboardRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200901")
public class ExportDashboardRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * List of dashboardIds in plain text. The syntax is '{"dashboardIds":["dashboardId1",
     * "dashboardId2", ...]}'. Escaping is needed when using in OCI CLI. For example,
     * "{\\"dashboardIds\\":[\\"ocid1.managementdashboard.oc1..dashboardId1\\"]}" .
     */
    private String exportDashboardId;

    /**
     * List of dashboardIds in plain text. The syntax is '{"dashboardIds":["dashboardId1",
     * "dashboardId2", ...]}'. Escaping is needed when using in OCI CLI. For example,
     * "{\\"dashboardIds\\":[\\"ocid1.managementdashboard.oc1..dashboardId1\\"]}" .
     */
    public String getExportDashboardId() {
        return exportDashboardId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Indicates whether tags must be included when exporting dashboards and saved searches. If this
     * attribute is set to true, then both defined and free-form tags are included in the response.
     * The default is false and tag fields are empty objects in the response. If set to true,
     * NotAuthorizedException is returned if you do not have the permission to access tags, even if
     * you have the permission to access dashboards and saved searches.
     */
    private String exportTags;

    /**
     * Indicates whether tags must be included when exporting dashboards and saved searches. If this
     * attribute is set to true, then both defined and free-form tags are included in the response.
     * The default is false and tag fields are empty objects in the response. If set to true,
     * NotAuthorizedException is returned if you do not have the permission to access tags, even if
     * you have the permission to access dashboards and saved searches.
     */
    public String getExportTags() {
        return exportTags;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ExportDashboardRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * List of dashboardIds in plain text. The syntax is '{"dashboardIds":["dashboardId1",
         * "dashboardId2", ...]}'. Escaping is needed when using in OCI CLI. For example,
         * "{\\"dashboardIds\\":[\\"ocid1.managementdashboard.oc1..dashboardId1\\"]}" .
         */
        private String exportDashboardId = null;

        /**
         * List of dashboardIds in plain text. The syntax is '{"dashboardIds":["dashboardId1",
         * "dashboardId2", ...]}'. Escaping is needed when using in OCI CLI. For example,
         * "{\\"dashboardIds\\":[\\"ocid1.managementdashboard.oc1..dashboardId1\\"]}" .
         *
         * @param exportDashboardId the value to set
         * @return this builder instance
         */
        public Builder exportDashboardId(String exportDashboardId) {
            this.exportDashboardId = exportDashboardId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Indicates whether tags must be included when exporting dashboards and saved searches. If
         * this attribute is set to true, then both defined and free-form tags are included in the
         * response. The default is false and tag fields are empty objects in the response. If set
         * to true, NotAuthorizedException is returned if you do not have the permission to access
         * tags, even if you have the permission to access dashboards and saved searches.
         */
        private String exportTags = null;

        /**
         * Indicates whether tags must be included when exporting dashboards and saved searches. If
         * this attribute is set to true, then both defined and free-form tags are included in the
         * response. The default is false and tag fields are empty objects in the response. If set
         * to true, NotAuthorizedException is returned if you do not have the permission to access
         * tags, even if you have the permission to access dashboards and saved searches.
         *
         * @param exportTags the value to set
         * @return this builder instance
         */
        public Builder exportTags(String exportTags) {
            this.exportTags = exportTags;
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
        public Builder copy(ExportDashboardRequest o) {
            exportDashboardId(o.getExportDashboardId());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            exportTags(o.getExportTags());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ExportDashboardRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ExportDashboardRequest
         */
        public ExportDashboardRequest build() {
            ExportDashboardRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ExportDashboardRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ExportDashboardRequest
         */
        public ExportDashboardRequest buildWithoutInvocationCallback() {
            ExportDashboardRequest request = new ExportDashboardRequest();
            request.exportDashboardId = exportDashboardId;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.exportTags = exportTags;
            return request;
            // new ExportDashboardRequest(exportDashboardId, opcRetryToken, opcRequestId,
            // exportTags);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .exportDashboardId(exportDashboardId)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .exportTags(exportTags);
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
        sb.append(",exportDashboardId=").append(String.valueOf(this.exportDashboardId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",exportTags=").append(String.valueOf(this.exportTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportDashboardRequest)) {
            return false;
        }

        ExportDashboardRequest other = (ExportDashboardRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.exportDashboardId, other.exportDashboardId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.exportTags, other.exportTags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.exportDashboardId == null ? 43 : this.exportDashboardId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.exportTags == null ? 43 : this.exportTags.hashCode());
        return result;
    }
}

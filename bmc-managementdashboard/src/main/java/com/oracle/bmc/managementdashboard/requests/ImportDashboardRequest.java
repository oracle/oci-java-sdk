/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard.requests;

import com.oracle.bmc.managementdashboard.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementdashboard/ImportDashboardExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ImportDashboardRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200901")
public class ImportDashboardRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.managementdashboard.model.ManagementDashboardImportDetails> {

    /** JSON metadata for importing dashboards and their saved searches. */
    private com.oracle.bmc.managementdashboard.model.ManagementDashboardImportDetails
            managementDashboardImportDetails;

    /** JSON metadata for importing dashboards and their saved searches. */
    public com.oracle.bmc.managementdashboard.model.ManagementDashboardImportDetails
            getManagementDashboardImportDetails() {
        return managementDashboardImportDetails;
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
     * By default, if a resource with the same OCID exists in the target compartment, it is updated
     * during the import process, otherwise, a new resource is created. However, if this attribute
     * is set to true, then during the import process if a resource with the same displayName exists
     * in the compartment, then it is updated even if the OCIDs are different. This is useful when
     * importing the same resource multiple times. If the compartment and displayName remain the
     * same, the resource is only updated and multiple copies of a resource are not created.
     */
    private String overrideSameName;

    /**
     * By default, if a resource with the same OCID exists in the target compartment, it is updated
     * during the import process, otherwise, a new resource is created. However, if this attribute
     * is set to true, then during the import process if a resource with the same displayName exists
     * in the compartment, then it is updated even if the OCIDs are different. This is useful when
     * importing the same resource multiple times. If the compartment and displayName remain the
     * same, the resource is only updated and multiple copies of a resource are not created.
     */
    public String getOverrideSameName() {
        return overrideSameName;
    }
    /**
     * If this attribute is set, the dashboard resources are created or updated in the compartment
     * specified by OCID. If this attribute is not set, the compartment specified in the JSON
     * metadata is used.
     */
    private String overrideDashboardCompartmentOcid;

    /**
     * If this attribute is set, the dashboard resources are created or updated in the compartment
     * specified by OCID. If this attribute is not set, the compartment specified in the JSON
     * metadata is used.
     */
    public String getOverrideDashboardCompartmentOcid() {
        return overrideDashboardCompartmentOcid;
    }
    /**
     * If this attribute is set, the saved search resources are created or updated in the
     * compartment specified by OCID. If this attribute is not set, the compartment specified in the
     * JSON metadata is used.
     */
    private String overrideSavedSearchCompartmentOcid;

    /**
     * If this attribute is set, the saved search resources are created or updated in the
     * compartment specified by OCID. If this attribute is not set, the compartment specified in the
     * JSON metadata is used.
     */
    public String getOverrideSavedSearchCompartmentOcid() {
        return overrideSavedSearchCompartmentOcid;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.managementdashboard.model.ManagementDashboardImportDetails getBody$() {
        return managementDashboardImportDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ImportDashboardRequest,
                    com.oracle.bmc.managementdashboard.model.ManagementDashboardImportDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** JSON metadata for importing dashboards and their saved searches. */
        private com.oracle.bmc.managementdashboard.model.ManagementDashboardImportDetails
                managementDashboardImportDetails = null;

        /**
         * JSON metadata for importing dashboards and their saved searches.
         *
         * @param managementDashboardImportDetails the value to set
         * @return this builder instance
         */
        public Builder managementDashboardImportDetails(
                com.oracle.bmc.managementdashboard.model.ManagementDashboardImportDetails
                        managementDashboardImportDetails) {
            this.managementDashboardImportDetails = managementDashboardImportDetails;
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
         * By default, if a resource with the same OCID exists in the target compartment, it is
         * updated during the import process, otherwise, a new resource is created. However, if this
         * attribute is set to true, then during the import process if a resource with the same
         * displayName exists in the compartment, then it is updated even if the OCIDs are
         * different. This is useful when importing the same resource multiple times. If the
         * compartment and displayName remain the same, the resource is only updated and multiple
         * copies of a resource are not created.
         */
        private String overrideSameName = null;

        /**
         * By default, if a resource with the same OCID exists in the target compartment, it is
         * updated during the import process, otherwise, a new resource is created. However, if this
         * attribute is set to true, then during the import process if a resource with the same
         * displayName exists in the compartment, then it is updated even if the OCIDs are
         * different. This is useful when importing the same resource multiple times. If the
         * compartment and displayName remain the same, the resource is only updated and multiple
         * copies of a resource are not created.
         *
         * @param overrideSameName the value to set
         * @return this builder instance
         */
        public Builder overrideSameName(String overrideSameName) {
            this.overrideSameName = overrideSameName;
            return this;
        }

        /**
         * If this attribute is set, the dashboard resources are created or updated in the
         * compartment specified by OCID. If this attribute is not set, the compartment specified in
         * the JSON metadata is used.
         */
        private String overrideDashboardCompartmentOcid = null;

        /**
         * If this attribute is set, the dashboard resources are created or updated in the
         * compartment specified by OCID. If this attribute is not set, the compartment specified in
         * the JSON metadata is used.
         *
         * @param overrideDashboardCompartmentOcid the value to set
         * @return this builder instance
         */
        public Builder overrideDashboardCompartmentOcid(String overrideDashboardCompartmentOcid) {
            this.overrideDashboardCompartmentOcid = overrideDashboardCompartmentOcid;
            return this;
        }

        /**
         * If this attribute is set, the saved search resources are created or updated in the
         * compartment specified by OCID. If this attribute is not set, the compartment specified in
         * the JSON metadata is used.
         */
        private String overrideSavedSearchCompartmentOcid = null;

        /**
         * If this attribute is set, the saved search resources are created or updated in the
         * compartment specified by OCID. If this attribute is not set, the compartment specified in
         * the JSON metadata is used.
         *
         * @param overrideSavedSearchCompartmentOcid the value to set
         * @return this builder instance
         */
        public Builder overrideSavedSearchCompartmentOcid(
                String overrideSavedSearchCompartmentOcid) {
            this.overrideSavedSearchCompartmentOcid = overrideSavedSearchCompartmentOcid;
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
        public Builder copy(ImportDashboardRequest o) {
            managementDashboardImportDetails(o.getManagementDashboardImportDetails());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            overrideSameName(o.getOverrideSameName());
            overrideDashboardCompartmentOcid(o.getOverrideDashboardCompartmentOcid());
            overrideSavedSearchCompartmentOcid(o.getOverrideSavedSearchCompartmentOcid());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ImportDashboardRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ImportDashboardRequest
         */
        public ImportDashboardRequest build() {
            ImportDashboardRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.managementdashboard.model.ManagementDashboardImportDetails body) {
            managementDashboardImportDetails(body);
            return this;
        }

        /**
         * Build the instance of ImportDashboardRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ImportDashboardRequest
         */
        public ImportDashboardRequest buildWithoutInvocationCallback() {
            ImportDashboardRequest request = new ImportDashboardRequest();
            request.managementDashboardImportDetails = managementDashboardImportDetails;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.overrideSameName = overrideSameName;
            request.overrideDashboardCompartmentOcid = overrideDashboardCompartmentOcid;
            request.overrideSavedSearchCompartmentOcid = overrideSavedSearchCompartmentOcid;
            return request;
            // new ImportDashboardRequest(managementDashboardImportDetails, ifMatch, opcRetryToken,
            // opcRequestId, overrideSameName, overrideDashboardCompartmentOcid,
            // overrideSavedSearchCompartmentOcid);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managementDashboardImportDetails(managementDashboardImportDetails)
                .ifMatch(ifMatch)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .overrideSameName(overrideSameName)
                .overrideDashboardCompartmentOcid(overrideDashboardCompartmentOcid)
                .overrideSavedSearchCompartmentOcid(overrideSavedSearchCompartmentOcid);
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
        sb.append(",managementDashboardImportDetails=")
                .append(String.valueOf(this.managementDashboardImportDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",overrideSameName=").append(String.valueOf(this.overrideSameName));
        sb.append(",overrideDashboardCompartmentOcid=")
                .append(String.valueOf(this.overrideDashboardCompartmentOcid));
        sb.append(",overrideSavedSearchCompartmentOcid=")
                .append(String.valueOf(this.overrideSavedSearchCompartmentOcid));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportDashboardRequest)) {
            return false;
        }

        ImportDashboardRequest other = (ImportDashboardRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.managementDashboardImportDetails,
                        other.managementDashboardImportDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.overrideSameName, other.overrideSameName)
                && java.util.Objects.equals(
                        this.overrideDashboardCompartmentOcid,
                        other.overrideDashboardCompartmentOcid)
                && java.util.Objects.equals(
                        this.overrideSavedSearchCompartmentOcid,
                        other.overrideSavedSearchCompartmentOcid);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managementDashboardImportDetails == null
                                ? 43
                                : this.managementDashboardImportDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.overrideSameName == null ? 43 : this.overrideSameName.hashCode());
        result =
                (result * PRIME)
                        + (this.overrideDashboardCompartmentOcid == null
                                ? 43
                                : this.overrideDashboardCompartmentOcid.hashCode());
        result =
                (result * PRIME)
                        + (this.overrideSavedSearchCompartmentOcid == null
                                ? 43
                                : this.overrideSavedSearchCompartmentOcid.hashCode());
        return result;
    }
}

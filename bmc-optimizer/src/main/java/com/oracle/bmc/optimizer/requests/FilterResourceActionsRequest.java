/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.requests;

import com.oracle.bmc.optimizer.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/optimizer/FilterResourceActionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * FilterResourceActionsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
public class FilterResourceActionsRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.optimizer.model.QueryDetails> {

    /** The OCID of the compartment. */
    private String compartmentId;

    /** The OCID of the compartment. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * When set to true, the hierarchy of compartments is traversed and all compartments and
     * subcompartments in the tenancy are returned depending on the the setting of {@code
     * accessLevel}.
     *
     * <p>Can only be set to true when performing ListCompartments on the tenancy (root
     * compartment).
     */
    private Boolean compartmentIdInSubtree;

    /**
     * When set to true, the hierarchy of compartments is traversed and all compartments and
     * subcompartments in the tenancy are returned depending on the the setting of {@code
     * accessLevel}.
     *
     * <p>Can only be set to true when performing ListCompartments on the tenancy (root
     * compartment).
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /** The request parameters that describe the query criteria. */
    private com.oracle.bmc.optimizer.model.QueryDetails queryDetails;

    /** The request parameters that describe the query criteria. */
    public com.oracle.bmc.optimizer.model.QueryDetails getQueryDetails() {
        return queryDetails;
    }
    /** The unique OCID associated with the recommendation. */
    private String recommendationId;

    /** The unique OCID associated with the recommendation. */
    public String getRecommendationId() {
        return recommendationId;
    }
    /** Optional. A filter that returns results that match the recommendation name specified. */
    private String recommendationName;

    /** Optional. A filter that returns results that match the recommendation name specified. */
    public String getRecommendationName() {
        return recommendationName;
    }
    /**
     * A list of child tenancies for which the respective data will be returned. Please note that
     * the parent tenancy id can also be included in this list. For example, if there is a parent P
     * with two children A and B, to return results of only parent P and child A, this list should
     * be populated with tenancy id of parent P and child A.
     *
     * <p>If this list contains a tenancy id that isn't part of the organization of parent P, the
     * request will fail. That is, let's say there is an organization with parent P with children A
     * and B, and also one other tenant T that isn't part of the organization. If T is included in
     * the list of childTenancyIds, the request will fail.
     *
     * <p>It is important to note that if you are setting the includeOrganization parameter value as
     * true and also populating the childTenancyIds parameter with a list of child tenancies, the
     * request will fail. The childTenancyIds and includeOrganization should be used exclusively.
     *
     * <p>When using this parameter, please make sure to set the compartmentId with the parent
     * tenancy ID.
     */
    private java.util.List<String> childTenancyIds;

    /**
     * A list of child tenancies for which the respective data will be returned. Please note that
     * the parent tenancy id can also be included in this list. For example, if there is a parent P
     * with two children A and B, to return results of only parent P and child A, this list should
     * be populated with tenancy id of parent P and child A.
     *
     * <p>If this list contains a tenancy id that isn't part of the organization of parent P, the
     * request will fail. That is, let's say there is an organization with parent P with children A
     * and B, and also one other tenant T that isn't part of the organization. If T is included in
     * the list of childTenancyIds, the request will fail.
     *
     * <p>It is important to note that if you are setting the includeOrganization parameter value as
     * true and also populating the childTenancyIds parameter with a list of child tenancies, the
     * request will fail. The childTenancyIds and includeOrganization should be used exclusively.
     *
     * <p>When using this parameter, please make sure to set the compartmentId with the parent
     * tenancy ID.
     */
    public java.util.List<String> getChildTenancyIds() {
        return childTenancyIds;
    }
    /**
     * When set to true, the data for all child tenancies including the parent is returned. That is,
     * if there is an organization with parent P and children A and B, to return the data for the
     * parent P, child A and child B, this parameter value should be set to true.
     *
     * <p>Please note that this parameter shouldn't be used along with childTenancyIds parameter. If
     * you would like to get results specifically for parent P and only child A, use the
     * childTenancyIds parameter and populate the list with tenancy id of P and A.
     *
     * <p>When using this parameter, please make sure to set the compartmentId with the parent
     * tenancy ID.
     */
    private Boolean includeOrganization;

    /**
     * When set to true, the data for all child tenancies including the parent is returned. That is,
     * if there is an organization with parent P and children A and B, to return the data for the
     * parent P, child A and child B, this parameter value should be set to true.
     *
     * <p>Please note that this parameter shouldn't be used along with childTenancyIds parameter. If
     * you would like to get results specifically for parent P and only child A, use the
     * childTenancyIds parameter and populate the list with tenancy id of P and A.
     *
     * <p>When using this parameter, please make sure to set the compartmentId with the parent
     * tenancy ID.
     */
    public Boolean getIncludeOrganization() {
        return includeOrganization;
    }
    /** The maximum number of items to return in a paginated "List" call. */
    private Integer limit;

    /** The maximum number of items to return in a paginated "List" call. */
    public Integer getLimit() {
        return limit;
    }
    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    private String page;

    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    public String getPage() {
        return page;
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
    public com.oracle.bmc.optimizer.model.QueryDetails getBody$() {
        return queryDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    FilterResourceActionsRequest, com.oracle.bmc.optimizer.model.QueryDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the compartment. */
        private String compartmentId = null;

        /**
         * The OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * When set to true, the hierarchy of compartments is traversed and all compartments and
         * subcompartments in the tenancy are returned depending on the the setting of {@code
         * accessLevel}.
         *
         * <p>Can only be set to true when performing ListCompartments on the tenancy (root
         * compartment).
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * When set to true, the hierarchy of compartments is traversed and all compartments and
         * subcompartments in the tenancy are returned depending on the the setting of {@code
         * accessLevel}.
         *
         * <p>Can only be set to true when performing ListCompartments on the tenancy (root
         * compartment).
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /** The request parameters that describe the query criteria. */
        private com.oracle.bmc.optimizer.model.QueryDetails queryDetails = null;

        /**
         * The request parameters that describe the query criteria.
         *
         * @param queryDetails the value to set
         * @return this builder instance
         */
        public Builder queryDetails(com.oracle.bmc.optimizer.model.QueryDetails queryDetails) {
            this.queryDetails = queryDetails;
            return this;
        }

        /** The unique OCID associated with the recommendation. */
        private String recommendationId = null;

        /**
         * The unique OCID associated with the recommendation.
         *
         * @param recommendationId the value to set
         * @return this builder instance
         */
        public Builder recommendationId(String recommendationId) {
            this.recommendationId = recommendationId;
            return this;
        }

        /** Optional. A filter that returns results that match the recommendation name specified. */
        private String recommendationName = null;

        /**
         * Optional. A filter that returns results that match the recommendation name specified.
         *
         * @param recommendationName the value to set
         * @return this builder instance
         */
        public Builder recommendationName(String recommendationName) {
            this.recommendationName = recommendationName;
            return this;
        }

        /**
         * A list of child tenancies for which the respective data will be returned. Please note
         * that the parent tenancy id can also be included in this list. For example, if there is a
         * parent P with two children A and B, to return results of only parent P and child A, this
         * list should be populated with tenancy id of parent P and child A.
         *
         * <p>If this list contains a tenancy id that isn't part of the organization of parent P,
         * the request will fail. That is, let's say there is an organization with parent P with
         * children A and B, and also one other tenant T that isn't part of the organization. If T
         * is included in the list of childTenancyIds, the request will fail.
         *
         * <p>It is important to note that if you are setting the includeOrganization parameter
         * value as true and also populating the childTenancyIds parameter with a list of child
         * tenancies, the request will fail. The childTenancyIds and includeOrganization should be
         * used exclusively.
         *
         * <p>When using this parameter, please make sure to set the compartmentId with the parent
         * tenancy ID.
         */
        private java.util.List<String> childTenancyIds = null;

        /**
         * A list of child tenancies for which the respective data will be returned. Please note
         * that the parent tenancy id can also be included in this list. For example, if there is a
         * parent P with two children A and B, to return results of only parent P and child A, this
         * list should be populated with tenancy id of parent P and child A.
         *
         * <p>If this list contains a tenancy id that isn't part of the organization of parent P,
         * the request will fail. That is, let's say there is an organization with parent P with
         * children A and B, and also one other tenant T that isn't part of the organization. If T
         * is included in the list of childTenancyIds, the request will fail.
         *
         * <p>It is important to note that if you are setting the includeOrganization parameter
         * value as true and also populating the childTenancyIds parameter with a list of child
         * tenancies, the request will fail. The childTenancyIds and includeOrganization should be
         * used exclusively.
         *
         * <p>When using this parameter, please make sure to set the compartmentId with the parent
         * tenancy ID.
         *
         * @param childTenancyIds the value to set
         * @return this builder instance
         */
        public Builder childTenancyIds(java.util.List<String> childTenancyIds) {
            this.childTenancyIds = childTenancyIds;
            return this;
        }

        /**
         * Singular setter. A list of child tenancies for which the respective data will be
         * returned. Please note that the parent tenancy id can also be included in this list. For
         * example, if there is a parent P with two children A and B, to return results of only
         * parent P and child A, this list should be populated with tenancy id of parent P and child
         * A.
         *
         * <p>If this list contains a tenancy id that isn't part of the organization of parent P,
         * the request will fail. That is, let's say there is an organization with parent P with
         * children A and B, and also one other tenant T that isn't part of the organization. If T
         * is included in the list of childTenancyIds, the request will fail.
         *
         * <p>It is important to note that if you are setting the includeOrganization parameter
         * value as true and also populating the childTenancyIds parameter with a list of child
         * tenancies, the request will fail. The childTenancyIds and includeOrganization should be
         * used exclusively.
         *
         * <p>When using this parameter, please make sure to set the compartmentId with the parent
         * tenancy ID.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder childTenancyIds(String singularValue) {
            return this.childTenancyIds(java.util.Arrays.asList(singularValue));
        }

        /**
         * When set to true, the data for all child tenancies including the parent is returned. That
         * is, if there is an organization with parent P and children A and B, to return the data
         * for the parent P, child A and child B, this parameter value should be set to true.
         *
         * <p>Please note that this parameter shouldn't be used along with childTenancyIds
         * parameter. If you would like to get results specifically for parent P and only child A,
         * use the childTenancyIds parameter and populate the list with tenancy id of P and A.
         *
         * <p>When using this parameter, please make sure to set the compartmentId with the parent
         * tenancy ID.
         */
        private Boolean includeOrganization = null;

        /**
         * When set to true, the data for all child tenancies including the parent is returned. That
         * is, if there is an organization with parent P and children A and B, to return the data
         * for the parent P, child A and child B, this parameter value should be set to true.
         *
         * <p>Please note that this parameter shouldn't be used along with childTenancyIds
         * parameter. If you would like to get results specifically for parent P and only child A,
         * use the childTenancyIds parameter and populate the list with tenancy id of P and A.
         *
         * <p>When using this parameter, please make sure to set the compartmentId with the parent
         * tenancy ID.
         *
         * @param includeOrganization the value to set
         * @return this builder instance
         */
        public Builder includeOrganization(Boolean includeOrganization) {
            this.includeOrganization = includeOrganization;
            return this;
        }

        /** The maximum number of items to return in a paginated "List" call. */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated "List" call.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The value of the {@code opc-next-page} response header from the previous "List" call. */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(FilterResourceActionsRequest o) {
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            queryDetails(o.getQueryDetails());
            recommendationId(o.getRecommendationId());
            recommendationName(o.getRecommendationName());
            childTenancyIds(o.getChildTenancyIds());
            includeOrganization(o.getIncludeOrganization());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of FilterResourceActionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of FilterResourceActionsRequest
         */
        public FilterResourceActionsRequest build() {
            FilterResourceActionsRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.optimizer.model.QueryDetails body) {
            queryDetails(body);
            return this;
        }

        /**
         * Build the instance of FilterResourceActionsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of FilterResourceActionsRequest
         */
        public FilterResourceActionsRequest buildWithoutInvocationCallback() {
            FilterResourceActionsRequest request = new FilterResourceActionsRequest();
            request.compartmentId = compartmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.queryDetails = queryDetails;
            request.recommendationId = recommendationId;
            request.recommendationName = recommendationName;
            request.childTenancyIds = childTenancyIds;
            request.includeOrganization = includeOrganization;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new FilterResourceActionsRequest(compartmentId, compartmentIdInSubtree, queryDetails,
            // recommendationId, recommendationName, childTenancyIds, includeOrganization, limit,
            // page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .queryDetails(queryDetails)
                .recommendationId(recommendationId)
                .recommendationName(recommendationName)
                .childTenancyIds(childTenancyIds)
                .includeOrganization(includeOrganization)
                .limit(limit)
                .page(page)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",queryDetails=").append(String.valueOf(this.queryDetails));
        sb.append(",recommendationId=").append(String.valueOf(this.recommendationId));
        sb.append(",recommendationName=").append(String.valueOf(this.recommendationName));
        sb.append(",childTenancyIds=").append(String.valueOf(this.childTenancyIds));
        sb.append(",includeOrganization=").append(String.valueOf(this.includeOrganization));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FilterResourceActionsRequest)) {
            return false;
        }

        FilterResourceActionsRequest other = (FilterResourceActionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.queryDetails, other.queryDetails)
                && java.util.Objects.equals(this.recommendationId, other.recommendationId)
                && java.util.Objects.equals(this.recommendationName, other.recommendationName)
                && java.util.Objects.equals(this.childTenancyIds, other.childTenancyIds)
                && java.util.Objects.equals(this.includeOrganization, other.includeOrganization)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.queryDetails == null ? 43 : this.queryDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendationId == null ? 43 : this.recommendationId.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendationName == null
                                ? 43
                                : this.recommendationName.hashCode());
        result =
                (result * PRIME)
                        + (this.childTenancyIds == null ? 43 : this.childTenancyIds.hashCode());
        result =
                (result * PRIME)
                        + (this.includeOrganization == null
                                ? 43
                                : this.includeOrganization.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

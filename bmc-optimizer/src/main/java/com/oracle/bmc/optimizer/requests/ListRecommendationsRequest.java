/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.requests;

import com.oracle.bmc.optimizer.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/optimizer/ListRecommendationsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListRecommendationsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
public class ListRecommendationsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned depending on the the setting of {@code accessLevel}.
     * <p>
     * Can only be set to true when performing ListCompartments on the tenancy (root compartment).
     *
     */
    private Boolean compartmentIdInSubtree;

    /**
     * When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned depending on the the setting of {@code accessLevel}.
     * <p>
     * Can only be set to true when performing ListCompartments on the tenancy (root compartment).
     *
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /**
     * The unique OCID associated with the category.
     */
    private String categoryId;

    /**
     * The unique OCID associated with the category.
     */
    public String getCategoryId() {
        return categoryId;
    }
    /**
     * Optional. A filter that returns results that match the category name specified.
     */
    private String categoryName;

    /**
     * Optional. A filter that returns results that match the category name specified.
     */
    public String getCategoryName() {
        return categoryName;
    }
    /**
     * A list of child tenancies for which the respective data will be returned. Please note that
     * the parent tenancy id can also be included in this list. For example, if there is a parent P with two
     * children A and B, to return results of only parent P and child A, this list should be populated with
     * tenancy id of parent P and child A.
     * <p>
     * If this list contains a tenancy id that isn't part of the organization of parent P, the request will
     * fail. That is, let's say there is an organization with parent P with children A and B, and also one
     * other tenant T that isn't part of the organization. If T is included in the list of
     * childTenancyIds, the request will fail.
     * <p>
     * It is important to note that if you are setting the includeOrganization parameter value as true and
     * also populating the childTenancyIds parameter with a list of child tenancies, the request will fail.
     * The childTenancyIds and includeOrganization should be used exclusively.
     * <p>
     * When using this parameter, please make sure to set the compartmentId with the parent tenancy ID.
     *
     */
    private java.util.List<String> childTenancyIds;

    /**
     * A list of child tenancies for which the respective data will be returned. Please note that
     * the parent tenancy id can also be included in this list. For example, if there is a parent P with two
     * children A and B, to return results of only parent P and child A, this list should be populated with
     * tenancy id of parent P and child A.
     * <p>
     * If this list contains a tenancy id that isn't part of the organization of parent P, the request will
     * fail. That is, let's say there is an organization with parent P with children A and B, and also one
     * other tenant T that isn't part of the organization. If T is included in the list of
     * childTenancyIds, the request will fail.
     * <p>
     * It is important to note that if you are setting the includeOrganization parameter value as true and
     * also populating the childTenancyIds parameter with a list of child tenancies, the request will fail.
     * The childTenancyIds and includeOrganization should be used exclusively.
     * <p>
     * When using this parameter, please make sure to set the compartmentId with the parent tenancy ID.
     *
     */
    public java.util.List<String> getChildTenancyIds() {
        return childTenancyIds;
    }
    /**
     * When set to true, the data for all child tenancies including the parent is returned. That is, if
     * there is an organization with parent P and children A and B, to return the data for the parent P, child
     * A and child B, this parameter value should be set to true.
     * <p>
     * Please note that this parameter shouldn't be used along with childTenancyIds parameter. If you would like
     * to get results specifically for parent P and only child A, use the childTenancyIds parameter and populate
     * the list with tenancy id of P and A.
     * <p>
     * When using this parameter, please make sure to set the compartmentId with the parent tenancy ID.
     *
     */
    private Boolean includeOrganization;

    /**
     * When set to true, the data for all child tenancies including the parent is returned. That is, if
     * there is an organization with parent P and children A and B, to return the data for the parent P, child
     * A and child B, this parameter value should be set to true.
     * <p>
     * Please note that this parameter shouldn't be used along with childTenancyIds parameter. If you would like
     * to get results specifically for parent P and only child A, use the childTenancyIds parameter and populate
     * the list with tenancy id of P and A.
     * <p>
     * When using this parameter, please make sure to set the compartmentId with the parent tenancy ID.
     *
     */
    public Boolean getIncludeOrganization() {
        return includeOrganization;
    }
    /**
     * Optional. A filter that returns results that match the name specified.
     */
    private String name;

    /**
     * Optional. A filter that returns results that match the name specified.
     */
    public String getName() {
        return name;
    }
    /**
     * The maximum number of items to return in a paginated "List" call.
     */
    private Integer limit;

    /**
     * The maximum number of items to return in a paginated "List" call.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     *
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     */
    private com.oracle.bmc.optimizer.model.SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     */
    public com.oracle.bmc.optimizer.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for TIMECREATED is descending. Default order for NAME is ascending. The NAME sort order is case sensitive.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for TIMECREATED is descending. Default order for NAME is ascending. The NAME sort order is case sensitive.
     *
     **/
    public enum SortBy {
        Name("NAME"),
        Timecreated("TIMECREATED"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for TIMECREATED is descending. Default order for NAME is ascending. The NAME sort order is case sensitive.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * A filter that returns results that match the lifecycle state specified.
     *
     */
    private com.oracle.bmc.optimizer.model.LifecycleState lifecycleState;

    /**
     * A filter that returns results that match the lifecycle state specified.
     *
     */
    public com.oracle.bmc.optimizer.model.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter that returns recommendations that match the status specified.
     *
     */
    private com.oracle.bmc.optimizer.model.Status status;

    /**
     * A filter that returns recommendations that match the status specified.
     *
     */
    public com.oracle.bmc.optimizer.model.Status getStatus() {
        return status;
    }
    /**
     * Unique Oracle-assigned identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListRecommendationsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned depending on the the setting of {@code accessLevel}.
         * <p>
         * Can only be set to true when performing ListCompartments on the tenancy (root compartment).
         *
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned depending on the the setting of {@code accessLevel}.
         * <p>
         * Can only be set to true when performing ListCompartments on the tenancy (root compartment).
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * The unique OCID associated with the category.
         */
        private String categoryId = null;

        /**
         * The unique OCID associated with the category.
         * @param categoryId the value to set
         * @return this builder instance
         */
        public Builder categoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        /**
         * Optional. A filter that returns results that match the category name specified.
         */
        private String categoryName = null;

        /**
         * Optional. A filter that returns results that match the category name specified.
         * @param categoryName the value to set
         * @return this builder instance
         */
        public Builder categoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }

        /**
         * A list of child tenancies for which the respective data will be returned. Please note that
         * the parent tenancy id can also be included in this list. For example, if there is a parent P with two
         * children A and B, to return results of only parent P and child A, this list should be populated with
         * tenancy id of parent P and child A.
         * <p>
         * If this list contains a tenancy id that isn't part of the organization of parent P, the request will
         * fail. That is, let's say there is an organization with parent P with children A and B, and also one
         * other tenant T that isn't part of the organization. If T is included in the list of
         * childTenancyIds, the request will fail.
         * <p>
         * It is important to note that if you are setting the includeOrganization parameter value as true and
         * also populating the childTenancyIds parameter with a list of child tenancies, the request will fail.
         * The childTenancyIds and includeOrganization should be used exclusively.
         * <p>
         * When using this parameter, please make sure to set the compartmentId with the parent tenancy ID.
         *
         */
        private java.util.List<String> childTenancyIds = null;

        /**
         * A list of child tenancies for which the respective data will be returned. Please note that
         * the parent tenancy id can also be included in this list. For example, if there is a parent P with two
         * children A and B, to return results of only parent P and child A, this list should be populated with
         * tenancy id of parent P and child A.
         * <p>
         * If this list contains a tenancy id that isn't part of the organization of parent P, the request will
         * fail. That is, let's say there is an organization with parent P with children A and B, and also one
         * other tenant T that isn't part of the organization. If T is included in the list of
         * childTenancyIds, the request will fail.
         * <p>
         * It is important to note that if you are setting the includeOrganization parameter value as true and
         * also populating the childTenancyIds parameter with a list of child tenancies, the request will fail.
         * The childTenancyIds and includeOrganization should be used exclusively.
         * <p>
         * When using this parameter, please make sure to set the compartmentId with the parent tenancy ID.
         *
         * @param childTenancyIds the value to set
         * @return this builder instance
         */
        public Builder childTenancyIds(java.util.List<String> childTenancyIds) {
            this.childTenancyIds = childTenancyIds;
            return this;
        }

        /**
         * Singular setter. A list of child tenancies for which the respective data will be returned. Please note that
         * the parent tenancy id can also be included in this list. For example, if there is a parent P with two
         * children A and B, to return results of only parent P and child A, this list should be populated with
         * tenancy id of parent P and child A.
         * <p>
         * If this list contains a tenancy id that isn't part of the organization of parent P, the request will
         * fail. That is, let's say there is an organization with parent P with children A and B, and also one
         * other tenant T that isn't part of the organization. If T is included in the list of
         * childTenancyIds, the request will fail.
         * <p>
         * It is important to note that if you are setting the includeOrganization parameter value as true and
         * also populating the childTenancyIds parameter with a list of child tenancies, the request will fail.
         * The childTenancyIds and includeOrganization should be used exclusively.
         * <p>
         * When using this parameter, please make sure to set the compartmentId with the parent tenancy ID.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder childTenancyIds(String singularValue) {
            return this.childTenancyIds(java.util.Arrays.asList(singularValue));
        }

        /**
         * When set to true, the data for all child tenancies including the parent is returned. That is, if
         * there is an organization with parent P and children A and B, to return the data for the parent P, child
         * A and child B, this parameter value should be set to true.
         * <p>
         * Please note that this parameter shouldn't be used along with childTenancyIds parameter. If you would like
         * to get results specifically for parent P and only child A, use the childTenancyIds parameter and populate
         * the list with tenancy id of P and A.
         * <p>
         * When using this parameter, please make sure to set the compartmentId with the parent tenancy ID.
         *
         */
        private Boolean includeOrganization = null;

        /**
         * When set to true, the data for all child tenancies including the parent is returned. That is, if
         * there is an organization with parent P and children A and B, to return the data for the parent P, child
         * A and child B, this parameter value should be set to true.
         * <p>
         * Please note that this parameter shouldn't be used along with childTenancyIds parameter. If you would like
         * to get results specifically for parent P and only child A, use the childTenancyIds parameter and populate
         * the list with tenancy id of P and A.
         * <p>
         * When using this parameter, please make sure to set the compartmentId with the parent tenancy ID.
         *
         * @param includeOrganization the value to set
         * @return this builder instance
         */
        public Builder includeOrganization(Boolean includeOrganization) {
            this.includeOrganization = includeOrganization;
            return this;
        }

        /**
         * Optional. A filter that returns results that match the name specified.
         */
        private String name = null;

        /**
         * Optional. A filter that returns results that match the name specified.
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The maximum number of items to return in a paginated "List" call.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated "List" call.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         *
         */
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
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         */
        private com.oracle.bmc.optimizer.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.optimizer.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for TIMECREATED is descending. Default order for NAME is ascending. The NAME sort order is case sensitive.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for TIMECREATED is descending. Default order for NAME is ascending. The NAME sort order is case sensitive.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * A filter that returns results that match the lifecycle state specified.
         *
         */
        private com.oracle.bmc.optimizer.model.LifecycleState lifecycleState = null;

        /**
         * A filter that returns results that match the lifecycle state specified.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.optimizer.model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * A filter that returns recommendations that match the status specified.
         *
         */
        private com.oracle.bmc.optimizer.model.Status status = null;

        /**
         * A filter that returns recommendations that match the status specified.
         *
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(com.oracle.bmc.optimizer.model.Status status) {
            this.status = status;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
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
        public Builder copy(ListRecommendationsRequest o) {
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            categoryId(o.getCategoryId());
            categoryName(o.getCategoryName());
            childTenancyIds(o.getChildTenancyIds());
            includeOrganization(o.getIncludeOrganization());
            name(o.getName());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            lifecycleState(o.getLifecycleState());
            status(o.getStatus());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListRecommendationsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListRecommendationsRequest
         */
        public ListRecommendationsRequest build() {
            ListRecommendationsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListRecommendationsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListRecommendationsRequest
         */
        public ListRecommendationsRequest buildWithoutInvocationCallback() {
            ListRecommendationsRequest request = new ListRecommendationsRequest();
            request.compartmentId = compartmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.categoryId = categoryId;
            request.categoryName = categoryName;
            request.childTenancyIds = childTenancyIds;
            request.includeOrganization = includeOrganization;
            request.name = name;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.lifecycleState = lifecycleState;
            request.status = status;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListRecommendationsRequest(compartmentId, compartmentIdInSubtree, categoryId, categoryName, childTenancyIds, includeOrganization, name, limit, page, sortOrder, sortBy, lifecycleState, status, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .categoryId(categoryId)
                .categoryName(categoryName)
                .childTenancyIds(childTenancyIds)
                .includeOrganization(includeOrganization)
                .name(name)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .lifecycleState(lifecycleState)
                .status(status)
                .opcRequestId(opcRequestId);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",categoryId=").append(String.valueOf(this.categoryId));
        sb.append(",categoryName=").append(String.valueOf(this.categoryName));
        sb.append(",childTenancyIds=").append(String.valueOf(this.childTenancyIds));
        sb.append(",includeOrganization=").append(String.valueOf(this.includeOrganization));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListRecommendationsRequest)) {
            return false;
        }

        ListRecommendationsRequest other = (ListRecommendationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.categoryId, other.categoryId)
                && java.util.Objects.equals(this.categoryName, other.categoryName)
                && java.util.Objects.equals(this.childTenancyIds, other.childTenancyIds)
                && java.util.Objects.equals(this.includeOrganization, other.includeOrganization)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.status, other.status)
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
        result = (result * PRIME) + (this.categoryId == null ? 43 : this.categoryId.hashCode());
        result = (result * PRIME) + (this.categoryName == null ? 43 : this.categoryName.hashCode());
        result =
                (result * PRIME)
                        + (this.childTenancyIds == null ? 43 : this.childTenancyIds.hashCode());
        result =
                (result * PRIME)
                        + (this.includeOrganization == null
                                ? 43
                                : this.includeOrganization.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

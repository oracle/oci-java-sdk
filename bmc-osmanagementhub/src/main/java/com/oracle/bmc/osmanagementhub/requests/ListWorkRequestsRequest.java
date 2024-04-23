/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListWorkRequestsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListWorkRequestsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ListWorkRequestsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment that contains the resources to list. This filter returns only
     * resources contained within the specified compartment.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment that contains the resources to list. This filter returns only
     * resources contained within the specified compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the work request.
     */
    private String workRequestId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the work request.
     */
    public String getWorkRequestId() {
        return workRequestId;
    }
    /** A filter to return work requests that match the given status. */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.OperationStatus> status;

    /** A filter to return work requests that match the given status. */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.OperationStatus> getStatus() {
        return status;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the resource. This filter returns resources associated with the specified resource.
     */
    private String resourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the resource. This filter returns resources associated with the specified resource.
     */
    public String getResourceId() {
        return resourceId;
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
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 3}
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 3}
     */
    public String getPage() {
        return page;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    public Integer getLimit() {
        return limit;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.osmanagementhub.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the schedule job that initiated the work request.
     */
    private String initiatorId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the schedule job that initiated the work request.
     */
    public String getInitiatorId() {
        return initiatorId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the parent work request.
     */
    private String parentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the parent work request.
     */
    public String getParentId() {
        return parentId;
    }
    /**
     * A filter to return the resources whose parent resources are not the same as the given
     * resource
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private java.util.List<String> parentResourcesNotEqualTo;

    /**
     * A filter to return the resources whose parent resources are not the same as the given
     * resource
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public java.util.List<String> getParentResourcesNotEqualTo() {
        return parentResourcesNotEqualTo;
    }
    /**
     * The asynchronous operation tracked by this work request. The filter returns only resources
     * that match the given OperationType.
     */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.WorkRequestOperationType>
            operationType;

    /**
     * The asynchronous operation tracked by this work request. The filter returns only resources
     * that match the given OperationType.
     */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.WorkRequestOperationType>
            getOperationType() {
        return operationType;
    }
    /** A filter to return resources that may partially match the given display name. */
    private String displayNameContains;

    /** A filter to return resources that may partially match the given display name. */
    public String getDisplayNameContains() {
        return displayNameContains;
    }
    /**
     * A filter to return the work requests that are a retry of the given work request
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String retryOfId;

    /**
     * A filter to return the work requests that are a retry of the given work request
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getRetryOfId() {
        return retryOfId;
    }
    /**
     * A filter to return work requests that were created before the date provided (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format). Example: '2023-08-25T21:10:29.600Z'
     */
    private java.util.Date timeCreatedLessThan;

    /**
     * A filter to return work requests that were created before the date provided (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format). Example: '2023-08-25T21:10:29.600Z'
     */
    public java.util.Date getTimeCreatedLessThan() {
        return timeCreatedLessThan;
    }
    /**
     * A filter to return work requests that were created on or after the date provided (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format). Example: '2023-08-25T21:10:29.600Z'
     */
    private java.util.Date timeCreatedGreaterThanOrEqualTo;

    /**
     * A filter to return work requests that were created on or after the date provided (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format). Example: '2023-08-25T21:10:29.600Z'
     */
    public java.util.Date getTimeCreatedGreaterThanOrEqualTo() {
        return timeCreatedGreaterThanOrEqualTo;
    }
    /** Indicates whether to list only resources managed by the Autonomous Linux service. */
    private Boolean isManagedByAutonomousLinux;

    /** Indicates whether to list only resources managed by the Autonomous Linux service. */
    public Boolean getIsManagedByAutonomousLinux() {
        return isManagedByAutonomousLinux;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListWorkRequestsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment that contains the resources to list. This filter returns only
         * resources contained within the specified compartment.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment that contains the resources to list. This filter returns only
         * resources contained within the specified compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the work request.
         */
        private String workRequestId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the work request.
         *
         * @param workRequestId the value to set
         * @return this builder instance
         */
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            return this;
        }

        /** A filter to return work requests that match the given status. */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.OperationStatus> status = null;

        /**
         * A filter to return work requests that match the given status.
         *
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(
                java.util.List<com.oracle.bmc.osmanagementhub.model.OperationStatus> status) {
            this.status = status;
            return this;
        }

        /**
         * Singular setter. A filter to return work requests that match the given status.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder status(OperationStatus singularValue) {
            return this.status(java.util.Arrays.asList(singularValue));
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the resource. This filter returns resources associated with the specified resource.
         */
        private String resourceId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the resource. This filter returns resources associated with the specified resource.
         *
         * @param resourceId the value to set
         * @return this builder instance
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
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
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 3}
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 3}
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 50}
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 50}
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the schedule job that initiated the work request.
         */
        private String initiatorId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the schedule job that initiated the work request.
         *
         * @param initiatorId the value to set
         * @return this builder instance
         */
        public Builder initiatorId(String initiatorId) {
            this.initiatorId = initiatorId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the parent work request.
         */
        private String parentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the parent work request.
         *
         * @param parentId the value to set
         * @return this builder instance
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * A filter to return the resources whose parent resources are not the same as the given
         * resource
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private java.util.List<String> parentResourcesNotEqualTo = null;

        /**
         * A filter to return the resources whose parent resources are not the same as the given
         * resource
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param parentResourcesNotEqualTo the value to set
         * @return this builder instance
         */
        public Builder parentResourcesNotEqualTo(java.util.List<String> parentResourcesNotEqualTo) {
            this.parentResourcesNotEqualTo = parentResourcesNotEqualTo;
            return this;
        }

        /**
         * Singular setter. A filter to return the resources whose parent resources are not the same
         * as the given resource
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder parentResourcesNotEqualTo(String singularValue) {
            return this.parentResourcesNotEqualTo(java.util.Arrays.asList(singularValue));
        }

        /**
         * The asynchronous operation tracked by this work request. The filter returns only
         * resources that match the given OperationType.
         */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.WorkRequestOperationType>
                operationType = null;

        /**
         * The asynchronous operation tracked by this work request. The filter returns only
         * resources that match the given OperationType.
         *
         * @param operationType the value to set
         * @return this builder instance
         */
        public Builder operationType(
                java.util.List<com.oracle.bmc.osmanagementhub.model.WorkRequestOperationType>
                        operationType) {
            this.operationType = operationType;
            return this;
        }

        /**
         * Singular setter. The asynchronous operation tracked by this work request. The filter
         * returns only resources that match the given OperationType.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder operationType(WorkRequestOperationType singularValue) {
            return this.operationType(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return resources that may partially match the given display name. */
        private String displayNameContains = null;

        /**
         * A filter to return resources that may partially match the given display name.
         *
         * @param displayNameContains the value to set
         * @return this builder instance
         */
        public Builder displayNameContains(String displayNameContains) {
            this.displayNameContains = displayNameContains;
            return this;
        }

        /**
         * A filter to return the work requests that are a retry of the given work request
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String retryOfId = null;

        /**
         * A filter to return the work requests that are a retry of the given work request
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param retryOfId the value to set
         * @return this builder instance
         */
        public Builder retryOfId(String retryOfId) {
            this.retryOfId = retryOfId;
            return this;
        }

        /**
         * A filter to return work requests that were created before the date provided (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format). Example: '2023-08-25T21:10:29.600Z'
         */
        private java.util.Date timeCreatedLessThan = null;

        /**
         * A filter to return work requests that were created before the date provided (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format). Example: '2023-08-25T21:10:29.600Z'
         *
         * @param timeCreatedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeCreatedLessThan(java.util.Date timeCreatedLessThan) {
            this.timeCreatedLessThan = timeCreatedLessThan;
            return this;
        }

        /**
         * A filter to return work requests that were created on or after the date provided (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format). Example: '2023-08-25T21:10:29.600Z'
         */
        private java.util.Date timeCreatedGreaterThanOrEqualTo = null;

        /**
         * A filter to return work requests that were created on or after the date provided (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format). Example: '2023-08-25T21:10:29.600Z'
         *
         * @param timeCreatedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeCreatedGreaterThanOrEqualTo(
                java.util.Date timeCreatedGreaterThanOrEqualTo) {
            this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            return this;
        }

        /** Indicates whether to list only resources managed by the Autonomous Linux service. */
        private Boolean isManagedByAutonomousLinux = null;

        /**
         * Indicates whether to list only resources managed by the Autonomous Linux service.
         *
         * @param isManagedByAutonomousLinux the value to set
         * @return this builder instance
         */
        public Builder isManagedByAutonomousLinux(Boolean isManagedByAutonomousLinux) {
            this.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
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
        public Builder copy(ListWorkRequestsRequest o) {
            compartmentId(o.getCompartmentId());
            workRequestId(o.getWorkRequestId());
            status(o.getStatus());
            resourceId(o.getResourceId());
            opcRequestId(o.getOpcRequestId());
            page(o.getPage());
            limit(o.getLimit());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            initiatorId(o.getInitiatorId());
            parentId(o.getParentId());
            parentResourcesNotEqualTo(o.getParentResourcesNotEqualTo());
            operationType(o.getOperationType());
            displayNameContains(o.getDisplayNameContains());
            retryOfId(o.getRetryOfId());
            timeCreatedLessThan(o.getTimeCreatedLessThan());
            timeCreatedGreaterThanOrEqualTo(o.getTimeCreatedGreaterThanOrEqualTo());
            isManagedByAutonomousLinux(o.getIsManagedByAutonomousLinux());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListWorkRequestsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListWorkRequestsRequest
         */
        public ListWorkRequestsRequest build() {
            ListWorkRequestsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListWorkRequestsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListWorkRequestsRequest
         */
        public ListWorkRequestsRequest buildWithoutInvocationCallback() {
            ListWorkRequestsRequest request = new ListWorkRequestsRequest();
            request.compartmentId = compartmentId;
            request.workRequestId = workRequestId;
            request.status = status;
            request.resourceId = resourceId;
            request.opcRequestId = opcRequestId;
            request.page = page;
            request.limit = limit;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.initiatorId = initiatorId;
            request.parentId = parentId;
            request.parentResourcesNotEqualTo = parentResourcesNotEqualTo;
            request.operationType = operationType;
            request.displayNameContains = displayNameContains;
            request.retryOfId = retryOfId;
            request.timeCreatedLessThan = timeCreatedLessThan;
            request.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            request.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
            return request;
            // new ListWorkRequestsRequest(compartmentId, workRequestId, status, resourceId,
            // opcRequestId, page, limit, sortOrder, sortBy, initiatorId, parentId,
            // parentResourcesNotEqualTo, operationType, displayNameContains, retryOfId,
            // timeCreatedLessThan, timeCreatedGreaterThanOrEqualTo, isManagedByAutonomousLinux);
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
                .workRequestId(workRequestId)
                .status(status)
                .resourceId(resourceId)
                .opcRequestId(opcRequestId)
                .page(page)
                .limit(limit)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .initiatorId(initiatorId)
                .parentId(parentId)
                .parentResourcesNotEqualTo(parentResourcesNotEqualTo)
                .operationType(operationType)
                .displayNameContains(displayNameContains)
                .retryOfId(retryOfId)
                .timeCreatedLessThan(timeCreatedLessThan)
                .timeCreatedGreaterThanOrEqualTo(timeCreatedGreaterThanOrEqualTo)
                .isManagedByAutonomousLinux(isManagedByAutonomousLinux);
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
        sb.append(",workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",resourceId=").append(String.valueOf(this.resourceId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",initiatorId=").append(String.valueOf(this.initiatorId));
        sb.append(",parentId=").append(String.valueOf(this.parentId));
        sb.append(",parentResourcesNotEqualTo=")
                .append(String.valueOf(this.parentResourcesNotEqualTo));
        sb.append(",operationType=").append(String.valueOf(this.operationType));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",retryOfId=").append(String.valueOf(this.retryOfId));
        sb.append(",timeCreatedLessThan=").append(String.valueOf(this.timeCreatedLessThan));
        sb.append(",timeCreatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeCreatedGreaterThanOrEqualTo));
        sb.append(",isManagedByAutonomousLinux=")
                .append(String.valueOf(this.isManagedByAutonomousLinux));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListWorkRequestsRequest)) {
            return false;
        }

        ListWorkRequestsRequest other = (ListWorkRequestsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.initiatorId, other.initiatorId)
                && java.util.Objects.equals(this.parentId, other.parentId)
                && java.util.Objects.equals(
                        this.parentResourcesNotEqualTo, other.parentResourcesNotEqualTo)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
                && java.util.Objects.equals(this.retryOfId, other.retryOfId)
                && java.util.Objects.equals(this.timeCreatedLessThan, other.timeCreatedLessThan)
                && java.util.Objects.equals(
                        this.timeCreatedGreaterThanOrEqualTo, other.timeCreatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.isManagedByAutonomousLinux, other.isManagedByAutonomousLinux);
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
                        + (this.workRequestId == null ? 43 : this.workRequestId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.initiatorId == null ? 43 : this.initiatorId.hashCode());
        result = (result * PRIME) + (this.parentId == null ? 43 : this.parentId.hashCode());
        result =
                (result * PRIME)
                        + (this.parentResourcesNotEqualTo == null
                                ? 43
                                : this.parentResourcesNotEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result =
                (result * PRIME)
                        + (this.displayNameContains == null
                                ? 43
                                : this.displayNameContains.hashCode());
        result = (result * PRIME) + (this.retryOfId == null ? 43 : this.retryOfId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedLessThan == null
                                ? 43
                                : this.timeCreatedLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeCreatedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.isManagedByAutonomousLinux == null
                                ? 43
                                : this.isManagedByAutonomousLinux.hashCode());
        return result;
    }
}

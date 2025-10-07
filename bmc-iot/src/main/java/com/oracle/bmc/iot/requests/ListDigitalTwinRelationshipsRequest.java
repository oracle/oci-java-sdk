/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.requests;

import com.oracle.bmc.iot.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/iot/ListDigitalTwinRelationshipsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListDigitalTwinRelationshipsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
public class ListDigitalTwinRelationshipsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IoT
     * domain in which to list digital twin resources.
     */
    private String iotDomainId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IoT
     * domain in which to list digital twin resources.
     */
    public String getIotDomainId() {
        return iotDomainId;
    }
    /** Filter resources whose display name matches the specified value. */
    private String displayName;

    /** Filter resources whose display name matches the specified value. */
    public String getDisplayName() {
        return displayName;
    }
    /** Filters resources that match the content path of the digital twin relationship. */
    private String contentPath;

    /** Filters resources that match the content path of the digital twin relationship. */
    public String getContentPath() {
        return contentPath;
    }
    /**
     * Filter resources that match the specified
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of source
     * digital twin instance.
     */
    private String sourceDigitalTwinInstanceId;

    /**
     * Filter resources that match the specified
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of source
     * digital twin instance.
     */
    public String getSourceDigitalTwinInstanceId() {
        return sourceDigitalTwinInstanceId;
    }
    /**
     * Filter resources that match the specified
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of target
     * digital twin instance.
     */
    private String targetDigitalTwinInstanceId;

    /**
     * Filter resources that match the specified
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of target
     * digital twin instance.
     */
    public String getTargetDigitalTwinInstanceId() {
        return targetDigitalTwinInstanceId;
    }
    /** Filter resources whose lifecycleState matches the specified value. */
    private com.oracle.bmc.iot.model.LifecycleState lifecycleState;

    /** Filter resources whose lifecycleState matches the specified value. */
    public com.oracle.bmc.iot.model.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /** Page representing the requested page of items. */
    private String page;

    /** Page representing the requested page of items. */
    public String getPage() {
        return page;
    }
    /** Specifies sort order to use, either ASC (ascending) or DESC (descending). */
    private SortOrder sortOrder;

    /** Specifies sort order to use, either ASC (ascending) or DESC (descending). */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /** Specifies sort order to use, either ASC (ascending) or DESC (descending). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
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
     * descending. Default order for displayName is ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Filter resources by
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Must be a
     * valid OCID of the resource type.
     */
    private String id;

    /**
     * Filter resources by
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Must be a
     * valid OCID of the resource type.
     */
    public String getId() {
        return id;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDigitalTwinRelationshipsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * IoT domain in which to list digital twin resources.
         */
        private String iotDomainId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * IoT domain in which to list digital twin resources.
         *
         * @param iotDomainId the value to set
         * @return this builder instance
         */
        public Builder iotDomainId(String iotDomainId) {
            this.iotDomainId = iotDomainId;
            return this;
        }

        /** Filter resources whose display name matches the specified value. */
        private String displayName = null;

        /**
         * Filter resources whose display name matches the specified value.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** Filters resources that match the content path of the digital twin relationship. */
        private String contentPath = null;

        /**
         * Filters resources that match the content path of the digital twin relationship.
         *
         * @param contentPath the value to set
         * @return this builder instance
         */
        public Builder contentPath(String contentPath) {
            this.contentPath = contentPath;
            return this;
        }

        /**
         * Filter resources that match the specified
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of source
         * digital twin instance.
         */
        private String sourceDigitalTwinInstanceId = null;

        /**
         * Filter resources that match the specified
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of source
         * digital twin instance.
         *
         * @param sourceDigitalTwinInstanceId the value to set
         * @return this builder instance
         */
        public Builder sourceDigitalTwinInstanceId(String sourceDigitalTwinInstanceId) {
            this.sourceDigitalTwinInstanceId = sourceDigitalTwinInstanceId;
            return this;
        }

        /**
         * Filter resources that match the specified
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of target
         * digital twin instance.
         */
        private String targetDigitalTwinInstanceId = null;

        /**
         * Filter resources that match the specified
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of target
         * digital twin instance.
         *
         * @param targetDigitalTwinInstanceId the value to set
         * @return this builder instance
         */
        public Builder targetDigitalTwinInstanceId(String targetDigitalTwinInstanceId) {
            this.targetDigitalTwinInstanceId = targetDigitalTwinInstanceId;
            return this;
        }

        /** Filter resources whose lifecycleState matches the specified value. */
        private com.oracle.bmc.iot.model.LifecycleState lifecycleState = null;

        /**
         * Filter resources whose lifecycleState matches the specified value.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(com.oracle.bmc.iot.model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** Page representing the requested page of items. */
        private String page = null;

        /**
         * Page representing the requested page of items.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** Specifies sort order to use, either ASC (ascending) or DESC (descending). */
        private SortOrder sortOrder = null;

        /**
         * Specifies sort order to use, either ASC (ascending) or DESC (descending).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Filter resources by
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Must be a
         * valid OCID of the resource type.
         */
        private String id = null;

        /**
         * Filter resources by
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). Must be a
         * valid OCID of the resource type.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
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
        public Builder copy(ListDigitalTwinRelationshipsRequest o) {
            iotDomainId(o.getIotDomainId());
            displayName(o.getDisplayName());
            contentPath(o.getContentPath());
            sourceDigitalTwinInstanceId(o.getSourceDigitalTwinInstanceId());
            targetDigitalTwinInstanceId(o.getTargetDigitalTwinInstanceId());
            lifecycleState(o.getLifecycleState());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            id(o.getId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDigitalTwinRelationshipsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListDigitalTwinRelationshipsRequest
         */
        public ListDigitalTwinRelationshipsRequest build() {
            ListDigitalTwinRelationshipsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDigitalTwinRelationshipsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDigitalTwinRelationshipsRequest
         */
        public ListDigitalTwinRelationshipsRequest buildWithoutInvocationCallback() {
            ListDigitalTwinRelationshipsRequest request = new ListDigitalTwinRelationshipsRequest();
            request.iotDomainId = iotDomainId;
            request.displayName = displayName;
            request.contentPath = contentPath;
            request.sourceDigitalTwinInstanceId = sourceDigitalTwinInstanceId;
            request.targetDigitalTwinInstanceId = targetDigitalTwinInstanceId;
            request.lifecycleState = lifecycleState;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.id = id;
            return request;
            // new ListDigitalTwinRelationshipsRequest(iotDomainId, displayName, contentPath,
            // sourceDigitalTwinInstanceId, targetDigitalTwinInstanceId, lifecycleState, limit,
            // page, sortOrder, sortBy, opcRequestId, id);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .iotDomainId(iotDomainId)
                .displayName(displayName)
                .contentPath(contentPath)
                .sourceDigitalTwinInstanceId(sourceDigitalTwinInstanceId)
                .targetDigitalTwinInstanceId(targetDigitalTwinInstanceId)
                .lifecycleState(lifecycleState)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId)
                .id(id);
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
        sb.append(",iotDomainId=").append(String.valueOf(this.iotDomainId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",contentPath=").append(String.valueOf(this.contentPath));
        sb.append(",sourceDigitalTwinInstanceId=")
                .append(String.valueOf(this.sourceDigitalTwinInstanceId));
        sb.append(",targetDigitalTwinInstanceId=")
                .append(String.valueOf(this.targetDigitalTwinInstanceId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDigitalTwinRelationshipsRequest)) {
            return false;
        }

        ListDigitalTwinRelationshipsRequest other = (ListDigitalTwinRelationshipsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.iotDomainId, other.iotDomainId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.contentPath, other.contentPath)
                && java.util.Objects.equals(
                        this.sourceDigitalTwinInstanceId, other.sourceDigitalTwinInstanceId)
                && java.util.Objects.equals(
                        this.targetDigitalTwinInstanceId, other.targetDigitalTwinInstanceId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.id, other.id);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.iotDomainId == null ? 43 : this.iotDomainId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.contentPath == null ? 43 : this.contentPath.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDigitalTwinInstanceId == null
                                ? 43
                                : this.sourceDigitalTwinInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDigitalTwinInstanceId == null
                                ? 43
                                : this.targetDigitalTwinInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        return result;
    }
}

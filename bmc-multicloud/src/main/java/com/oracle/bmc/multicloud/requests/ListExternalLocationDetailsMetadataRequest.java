/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.requests;

import com.oracle.bmc.multicloud.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/multicloud/ListExternalLocationDetailsMetadataExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListExternalLocationDetailsMetadataRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public class ListExternalLocationDetailsMetadataRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Multicloud subscription in which to list resources.
     */
    private String subscriptionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Multicloud subscription in which to list resources.
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }
    /** The subscription service name of the Cloud Service Provider. */
    private com.oracle.bmc.multicloud.model.SubscriptionType subscriptionServiceName;

    /** The subscription service name of the Cloud Service Provider. */
    public com.oracle.bmc.multicloud.model.SubscriptionType getSubscriptionServiceName() {
        return subscriptionServiceName;
    }
    /** The resource type query (i.e. dbsystem, instance etc.) */
    private EntityType entityType;

    /** The resource type query (i.e. dbsystem, instance etc.) */
    public enum EntityType implements com.oracle.bmc.http.internal.BmcEnum {
        Dbsystem("dbsystem"),
        ;

        private final String value;
        private static java.util.Map<String, EntityType> map;

        static {
            map = new java.util.HashMap<>();
            for (EntityType v : EntityType.values()) {
                map.put(v.getValue(), v);
            }
        }

        EntityType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EntityType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid EntityType: " + key);
        }
    };

    /** The resource type query (i.e. dbsystem, instance etc.) */
    public EntityType getEntityType() {
        return entityType;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Multicloud base compartment in which to list resources. A Multicloud base compartment is an
     * OCI compartment that maps to a subscription in a Cloud Service Provider (such as Azure, AWS,
     * or Google Cloud).
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Multicloud base compartment in which to list resources. A Multicloud base compartment is an
     * OCI compartment that maps to a subscription in a Cloud Service Provider (such as Azure, AWS,
     * or Google Cloud).
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment linked to the resource.
     */
    private String linkedCompartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment linked to the resource.
     */
    public String getLinkedCompartmentId() {
        return linkedCompartmentId;
    }
    /** The Cloud Service Provider region. */
    private String externalLocation;

    /** The Cloud Service Provider region. */
    public String getExternalLocation() {
        return externalLocation;
    }
    /** OCI Logical AD to filter the response. */
    private String logicalZone;

    /** OCI Logical AD to filter the response. */
    public String getLogicalZone() {
        return logicalZone;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Cluster Placement Group.
     */
    private String clusterPlacementGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Cluster Placement Group.
     */
    public String getClusterPlacementGroupId() {
        return clusterPlacementGroupId;
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
    /**
     * For list pagination. The value of the opc-next-page response header from the previous "List"
     * call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the opc-next-page response header from the previous "List"
     * call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    private com.oracle.bmc.multicloud.model.SortOrder sortOrder;

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public com.oracle.bmc.multicloud.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. You can provide only one sort order. Default order for {@code
     * timeCreated} is descending. Default order for {@code displayName} is ascending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide only one sort order. Default order for {@code
     * timeCreated} is descending. Default order for {@code displayName} is ascending.
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
     * The field to sort by. You can provide only one sort order. Default order for {@code
     * timeCreated} is descending. Default order for {@code displayName} is ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListExternalLocationDetailsMetadataRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Multicloud subscription in which to list resources.
         */
        private String subscriptionId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Multicloud subscription in which to list resources.
         *
         * @param subscriptionId the value to set
         * @return this builder instance
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /** The subscription service name of the Cloud Service Provider. */
        private com.oracle.bmc.multicloud.model.SubscriptionType subscriptionServiceName = null;

        /**
         * The subscription service name of the Cloud Service Provider.
         *
         * @param subscriptionServiceName the value to set
         * @return this builder instance
         */
        public Builder subscriptionServiceName(
                com.oracle.bmc.multicloud.model.SubscriptionType subscriptionServiceName) {
            this.subscriptionServiceName = subscriptionServiceName;
            return this;
        }

        /** The resource type query (i.e. dbsystem, instance etc.) */
        private EntityType entityType = null;

        /**
         * The resource type query (i.e. dbsystem, instance etc.)
         *
         * @param entityType the value to set
         * @return this builder instance
         */
        public Builder entityType(EntityType entityType) {
            this.entityType = entityType;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Multicloud base compartment in which to list resources. A Multicloud base compartment is
         * an OCI compartment that maps to a subscription in a Cloud Service Provider (such as
         * Azure, AWS, or Google Cloud).
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Multicloud base compartment in which to list resources. A Multicloud base compartment is
         * an OCI compartment that maps to a subscription in a Cloud Service Provider (such as
         * Azure, AWS, or Google Cloud).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment linked to the resource.
         */
        private String linkedCompartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment linked to the resource.
         *
         * @param linkedCompartmentId the value to set
         * @return this builder instance
         */
        public Builder linkedCompartmentId(String linkedCompartmentId) {
            this.linkedCompartmentId = linkedCompartmentId;
            return this;
        }

        /** The Cloud Service Provider region. */
        private String externalLocation = null;

        /**
         * The Cloud Service Provider region.
         *
         * @param externalLocation the value to set
         * @return this builder instance
         */
        public Builder externalLocation(String externalLocation) {
            this.externalLocation = externalLocation;
            return this;
        }

        /** OCI Logical AD to filter the response. */
        private String logicalZone = null;

        /**
         * OCI Logical AD to filter the response.
         *
         * @param logicalZone the value to set
         * @return this builder instance
         */
        public Builder logicalZone(String logicalZone) {
            this.logicalZone = logicalZone;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Cluster Placement Group.
         */
        private String clusterPlacementGroupId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Cluster Placement Group.
         *
         * @param clusterPlacementGroupId the value to set
         * @return this builder instance
         */
        public Builder clusterPlacementGroupId(String clusterPlacementGroupId) {
            this.clusterPlacementGroupId = clusterPlacementGroupId;
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

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
         * "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
         * "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
        private com.oracle.bmc.multicloud.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.multicloud.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. You can provide only one sort order. Default order for {@code
         * timeCreated} is descending. Default order for {@code displayName} is ascending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide only one sort order. Default order for {@code
         * timeCreated} is descending. Default order for {@code displayName} is ascending.
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
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
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
        public Builder copy(ListExternalLocationDetailsMetadataRequest o) {
            subscriptionId(o.getSubscriptionId());
            subscriptionServiceName(o.getSubscriptionServiceName());
            entityType(o.getEntityType());
            compartmentId(o.getCompartmentId());
            linkedCompartmentId(o.getLinkedCompartmentId());
            externalLocation(o.getExternalLocation());
            logicalZone(o.getLogicalZone());
            clusterPlacementGroupId(o.getClusterPlacementGroupId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListExternalLocationDetailsMetadataRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListExternalLocationDetailsMetadataRequest
         */
        public ListExternalLocationDetailsMetadataRequest build() {
            ListExternalLocationDetailsMetadataRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListExternalLocationDetailsMetadataRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListExternalLocationDetailsMetadataRequest
         */
        public ListExternalLocationDetailsMetadataRequest buildWithoutInvocationCallback() {
            ListExternalLocationDetailsMetadataRequest request =
                    new ListExternalLocationDetailsMetadataRequest();
            request.subscriptionId = subscriptionId;
            request.subscriptionServiceName = subscriptionServiceName;
            request.entityType = entityType;
            request.compartmentId = compartmentId;
            request.linkedCompartmentId = linkedCompartmentId;
            request.externalLocation = externalLocation;
            request.logicalZone = logicalZone;
            request.clusterPlacementGroupId = clusterPlacementGroupId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListExternalLocationDetailsMetadataRequest(subscriptionId,
            // subscriptionServiceName, entityType, compartmentId, linkedCompartmentId,
            // externalLocation, logicalZone, clusterPlacementGroupId, limit, page, sortOrder,
            // sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .subscriptionId(subscriptionId)
                .subscriptionServiceName(subscriptionServiceName)
                .entityType(entityType)
                .compartmentId(compartmentId)
                .linkedCompartmentId(linkedCompartmentId)
                .externalLocation(externalLocation)
                .logicalZone(logicalZone)
                .clusterPlacementGroupId(clusterPlacementGroupId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(",subscriptionServiceName=").append(String.valueOf(this.subscriptionServiceName));
        sb.append(",entityType=").append(String.valueOf(this.entityType));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",linkedCompartmentId=").append(String.valueOf(this.linkedCompartmentId));
        sb.append(",externalLocation=").append(String.valueOf(this.externalLocation));
        sb.append(",logicalZone=").append(String.valueOf(this.logicalZone));
        sb.append(",clusterPlacementGroupId=").append(String.valueOf(this.clusterPlacementGroupId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListExternalLocationDetailsMetadataRequest)) {
            return false;
        }

        ListExternalLocationDetailsMetadataRequest other =
                (ListExternalLocationDetailsMetadataRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(
                        this.subscriptionServiceName, other.subscriptionServiceName)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.linkedCompartmentId, other.linkedCompartmentId)
                && java.util.Objects.equals(this.externalLocation, other.externalLocation)
                && java.util.Objects.equals(this.logicalZone, other.logicalZone)
                && java.util.Objects.equals(
                        this.clusterPlacementGroupId, other.clusterPlacementGroupId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionServiceName == null
                                ? 43
                                : this.subscriptionServiceName.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.linkedCompartmentId == null
                                ? 43
                                : this.linkedCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.externalLocation == null ? 43 : this.externalLocation.hashCode());
        result = (result * PRIME) + (this.logicalZone == null ? 43 : this.logicalZone.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterPlacementGroupId == null
                                ? 43
                                : this.clusterPlacementGroupId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

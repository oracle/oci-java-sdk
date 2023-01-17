/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListMaintenanceRunHistoryExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListMaintenanceRunHistoryRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListMaintenanceRunHistoryRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The compartment
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String compartmentId;

    /**
     * The compartment
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The target resource ID. */
    private String targetResourceId;

    /** The target resource ID. */
    public String getTargetResourceId() {
        return targetResourceId;
    }
    /** The type of the target resource. */
    private com.oracle.bmc.database.model.MaintenanceRunSummary.TargetResourceType
            targetResourceType;

    /** The type of the target resource. */
    public com.oracle.bmc.database.model.MaintenanceRunSummary.TargetResourceType
            getTargetResourceType() {
        return targetResourceType;
    }
    /** The maintenance type. */
    private com.oracle.bmc.database.model.MaintenanceRunSummary.MaintenanceType maintenanceType;

    /** The maintenance type. */
    public com.oracle.bmc.database.model.MaintenanceRunSummary.MaintenanceType
            getMaintenanceType() {
        return maintenanceType;
    }
    /** The maximum number of items to return per page. */
    private Integer limit;

    /** The maximum number of items to return per page. */
    public Integer getLimit() {
        return limit;
    }
    /** The pagination token to continue listing from. */
    private String page;

    /** The pagination token to continue listing from. */
    public String getPage() {
        return page;
    }
    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIME_SCHEDULED and TIME_ENDED is descending. Default order for DISPLAYNAME is ascending. The
     * DISPLAYNAME sort order is case sensitive.
     *
     * <p>*Note:** If you do not include the availability domain filter, the resources are grouped
     * by availability domain, then sorted.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIME_SCHEDULED and TIME_ENDED is descending. Default order for DISPLAYNAME is ascending. The
     * DISPLAYNAME sort order is case sensitive.
     *
     * <p>*Note:** If you do not include the availability domain filter, the resources are grouped
     * by availability domain, then sorted.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeScheduled("TIME_SCHEDULED"),
        TimeEnded("TIME_ENDED"),
        Displayname("DISPLAYNAME"),
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
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIME_SCHEDULED and TIME_ENDED is descending. Default order for DISPLAYNAME is ascending. The
     * DISPLAYNAME sort order is case sensitive.
     *
     * <p>*Note:** If you do not include the availability domain filter, the resources are grouped
     * by availability domain, then sorted.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    private SortOrder sortOrder;

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
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

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /** The state of the maintenance run history. */
    private com.oracle.bmc.database.model.MaintenanceRunSummary.LifecycleState lifecycleState;

    /** The state of the maintenance run history. */
    public com.oracle.bmc.database.model.MaintenanceRunSummary.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** A filter to return only resources that match the given availability domain exactly. */
    private String availabilityDomain;

    /** A filter to return only resources that match the given availability domain exactly. */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }
    /** The sub-type of the maintenance run. */
    private com.oracle.bmc.database.model.MaintenanceRunSummary.MaintenanceSubtype
            maintenanceSubtype;

    /** The sub-type of the maintenance run. */
    public com.oracle.bmc.database.model.MaintenanceRunSummary.MaintenanceSubtype
            getMaintenanceSubtype() {
        return maintenanceSubtype;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListMaintenanceRunHistoryRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The compartment
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String compartmentId = null;

        /**
         * The compartment
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The target resource ID. */
        private String targetResourceId = null;

        /**
         * The target resource ID.
         *
         * @param targetResourceId the value to set
         * @return this builder instance
         */
        public Builder targetResourceId(String targetResourceId) {
            this.targetResourceId = targetResourceId;
            return this;
        }

        /** The type of the target resource. */
        private com.oracle.bmc.database.model.MaintenanceRunSummary.TargetResourceType
                targetResourceType = null;

        /**
         * The type of the target resource.
         *
         * @param targetResourceType the value to set
         * @return this builder instance
         */
        public Builder targetResourceType(
                com.oracle.bmc.database.model.MaintenanceRunSummary.TargetResourceType
                        targetResourceType) {
            this.targetResourceType = targetResourceType;
            return this;
        }

        /** The maintenance type. */
        private com.oracle.bmc.database.model.MaintenanceRunSummary.MaintenanceType
                maintenanceType = null;

        /**
         * The maintenance type.
         *
         * @param maintenanceType the value to set
         * @return this builder instance
         */
        public Builder maintenanceType(
                com.oracle.bmc.database.model.MaintenanceRunSummary.MaintenanceType
                        maintenanceType) {
            this.maintenanceType = maintenanceType;
            return this;
        }

        /** The maximum number of items to return per page. */
        private Integer limit = null;

        /**
         * The maximum number of items to return per page.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The pagination token to continue listing from. */
        private String page = null;

        /**
         * The pagination token to continue listing from.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order
         * for TIME_SCHEDULED and TIME_ENDED is descending. Default order for DISPLAYNAME is
         * ascending. The DISPLAYNAME sort order is case sensitive.
         *
         * <p>*Note:** If you do not include the availability domain filter, the resources are
         * grouped by availability domain, then sorted.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order
         * for TIME_SCHEDULED and TIME_ENDED is descending. Default order for DISPLAYNAME is
         * ascending. The DISPLAYNAME sort order is case sensitive.
         *
         * <p>*Note:** If you do not include the availability domain filter, the resources are
         * grouped by availability domain, then sorted.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** The state of the maintenance run history. */
        private com.oracle.bmc.database.model.MaintenanceRunSummary.LifecycleState lifecycleState =
                null;

        /**
         * The state of the maintenance run history.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.database.model.MaintenanceRunSummary.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** A filter to return only resources that match the given availability domain exactly. */
        private String availabilityDomain = null;

        /**
         * A filter to return only resources that match the given availability domain exactly.
         *
         * @param availabilityDomain the value to set
         * @return this builder instance
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            return this;
        }

        /** The sub-type of the maintenance run. */
        private com.oracle.bmc.database.model.MaintenanceRunSummary.MaintenanceSubtype
                maintenanceSubtype = null;

        /**
         * The sub-type of the maintenance run.
         *
         * @param maintenanceSubtype the value to set
         * @return this builder instance
         */
        public Builder maintenanceSubtype(
                com.oracle.bmc.database.model.MaintenanceRunSummary.MaintenanceSubtype
                        maintenanceSubtype) {
            this.maintenanceSubtype = maintenanceSubtype;
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
        public Builder copy(ListMaintenanceRunHistoryRequest o) {
            compartmentId(o.getCompartmentId());
            targetResourceId(o.getTargetResourceId());
            targetResourceType(o.getTargetResourceType());
            maintenanceType(o.getMaintenanceType());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            lifecycleState(o.getLifecycleState());
            availabilityDomain(o.getAvailabilityDomain());
            maintenanceSubtype(o.getMaintenanceSubtype());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListMaintenanceRunHistoryRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListMaintenanceRunHistoryRequest
         */
        public ListMaintenanceRunHistoryRequest build() {
            ListMaintenanceRunHistoryRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListMaintenanceRunHistoryRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListMaintenanceRunHistoryRequest
         */
        public ListMaintenanceRunHistoryRequest buildWithoutInvocationCallback() {
            ListMaintenanceRunHistoryRequest request = new ListMaintenanceRunHistoryRequest();
            request.compartmentId = compartmentId;
            request.targetResourceId = targetResourceId;
            request.targetResourceType = targetResourceType;
            request.maintenanceType = maintenanceType;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.lifecycleState = lifecycleState;
            request.availabilityDomain = availabilityDomain;
            request.maintenanceSubtype = maintenanceSubtype;
            return request;
            // new ListMaintenanceRunHistoryRequest(compartmentId, targetResourceId,
            // targetResourceType, maintenanceType, limit, page, sortBy, sortOrder, lifecycleState,
            // availabilityDomain, maintenanceSubtype);
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
                .targetResourceId(targetResourceId)
                .targetResourceType(targetResourceType)
                .maintenanceType(maintenanceType)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .lifecycleState(lifecycleState)
                .availabilityDomain(availabilityDomain)
                .maintenanceSubtype(maintenanceSubtype);
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
        sb.append(",targetResourceId=").append(String.valueOf(this.targetResourceId));
        sb.append(",targetResourceType=").append(String.valueOf(this.targetResourceType));
        sb.append(",maintenanceType=").append(String.valueOf(this.maintenanceType));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(",maintenanceSubtype=").append(String.valueOf(this.maintenanceSubtype));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListMaintenanceRunHistoryRequest)) {
            return false;
        }

        ListMaintenanceRunHistoryRequest other = (ListMaintenanceRunHistoryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targetResourceId, other.targetResourceId)
                && java.util.Objects.equals(this.targetResourceType, other.targetResourceType)
                && java.util.Objects.equals(this.maintenanceType, other.maintenanceType)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.maintenanceSubtype, other.maintenanceSubtype);
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
                        + (this.targetResourceId == null ? 43 : this.targetResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourceType == null
                                ? 43
                                : this.targetResourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceType == null ? 43 : this.maintenanceType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceSubtype == null
                                ? 43
                                : this.maintenanceSubtype.hashCode());
        return result;
    }
}

/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.requests;

import com.oracle.bmc.datacc.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacc/ListMaintenanceExecutionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListMaintenanceExecutionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class ListMaintenanceExecutionsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment. For list operations, you may provide the tenant [OCID] in this field. When a
     * tenant OCID is provided, it will be validated against the caller's tenant and then treated as
     * tenant scope (compartmentId filtering is not applied).
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment. For list operations, you may provide the tenant [OCID] in this field. When a
     * tenant OCID is provided, it will be validated against the caller's tenant and then treated as
     * tenant scope (compartmentId filtering is not applied).
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return resources that match the entire display name given. The match is case
     * sensitive.
     */
    private String displayName;

    /**
     * A filter to return resources that match the entire display name given. The match is case
     * sensitive.
     */
    public String getDisplayName() {
        return displayName;
    }
    /** The Database Infrastructure ID. */
    private String infrastructureId;

    /** The Database Infrastructure ID. */
    public String getInfrastructureId() {
        return infrastructureId;
    }
    /** The type of the target resource. */
    private com.oracle.bmc.datacc.model.TargetResourceTypeEnum targetResourceType;

    /** The type of the target resource. */
    public com.oracle.bmc.datacc.model.TargetResourceTypeEnum getTargetResourceType() {
        return targetResourceType;
    }
    /** The maintenance type. */
    private com.oracle.bmc.datacc.model.MaintenanceTypeEnum maintenanceType;

    /** The maintenance type. */
    public com.oracle.bmc.datacc.model.MaintenanceTypeEnum getMaintenanceType() {
        return maintenanceType;
    }
    /** The maintenance run OCID. */
    private String maintenanceRunId;

    /** The maintenance run OCID. */
    public String getMaintenanceRunId() {
        return maintenanceRunId;
    }
    /** A filter to return only resources that match the given lifecycle state exactly. */
    private com.oracle.bmc.datacc.model.MaintenanceRunLifecycleState lifecycleState;

    /** A filter to return only resources that match the given lifecycle state exactly. */
    public com.oracle.bmc.datacc.model.MaintenanceRunLifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** The sub-type of the maintenance run. */
    private com.oracle.bmc.datacc.model.MaintenanceSubtypeEnum maintenanceSubtype;

    /** The sub-type of the maintenance run. */
    public com.oracle.bmc.datacc.model.MaintenanceSubtypeEnum getMaintenanceSubtype() {
        return maintenanceSubtype;
    }
    /** Filter maintenance run for before given time. */
    private java.util.Date timeAcceptedLessThanOrEqualTo;

    /** Filter maintenance run for before given time. */
    public java.util.Date getTimeAcceptedLessThanOrEqualTo() {
        return timeAcceptedLessThanOrEqualTo;
    }
    /** Filter maintenance run for after given time. */
    private java.util.Date timeAcceptedGreaterThanOrEqualTo;

    /** Filter maintenance run for after given time. */
    public java.util.Date getTimeAcceptedGreaterThanOrEqualTo() {
        return timeAcceptedGreaterThanOrEqualTo;
    }
    /** The maintenance execution type. */
    private com.oracle.bmc.datacc.model.TypeEnum type;

    /** The maintenance execution type. */
    public com.oracle.bmc.datacc.model.TypeEnum getType() {
        return type;
    }
    /** The maximum number of items to return in a page. */
    private Integer limit;

    /** The maximum number of items to return in a page. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which you want to start retrieving results. This
     * token is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which you want to start retrieving results. This
     * token is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The field by which you want to sort. You can provide only one type of sort order. The default
     * order for {@code timeCreated} is descending. The default order for {@code displayName} is
     * ascending. If no value is specified, then {@code timeCreated} is the default. When listing
     * software images within the same {@code version}, using {@code sortBy=buildIdentifier} is
     * recommended. {@code buildIdentifier} is a monotonically increasing, time-ordered string
     * marker (yyyy-mm-dd-hh:mm:ss) stored with the image.
     */
    private SortBy sortBy;

    /**
     * The field by which you want to sort. You can provide only one type of sort order. The default
     * order for {@code timeCreated} is descending. The default order for {@code displayName} is
     * ascending. If no value is specified, then {@code timeCreated} is the default. When listing
     * software images within the same {@code version}, using {@code sortBy=buildIdentifier} is
     * recommended. {@code buildIdentifier} is a monotonically increasing, time-ordered string
     * marker (yyyy-mm-dd-hh:mm:ss) stored with the image.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
        BuildIdentifier("buildIdentifier"),
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
     * The field by which you want to sort. You can provide only one type of sort order. The default
     * order for {@code timeCreated} is descending. The default order for {@code displayName} is
     * ascending. If no value is specified, then {@code timeCreated} is the default. When listing
     * software images within the same {@code version}, using {@code sortBy=buildIdentifier} is
     * recommended. {@code buildIdentifier} is a monotonically increasing, time-ordered string
     * marker (yyyy-mm-dd-hh:mm:ss) stored with the image.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order that you want to use, which is either {@code ASC} or {@code DESC}. */
    private com.oracle.bmc.datacc.model.SortOrder sortOrder;

    /** The sort order that you want to use, which is either {@code ASC} or {@code DESC}. */
    public com.oracle.bmc.datacc.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /** The client request identifier. */
    private String opcRequestId;

    /** The client request identifier. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListMaintenanceExecutionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment. For list operations, you may provide the tenant [OCID] in this field. When a
         * tenant OCID is provided, it will be validated against the caller's tenant and then
         * treated as tenant scope (compartmentId filtering is not applied).
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment. For list operations, you may provide the tenant [OCID] in this field. When a
         * tenant OCID is provided, it will be validated against the caller's tenant and then
         * treated as tenant scope (compartmentId filtering is not applied).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return resources that match the entire display name given. The match is case
         * sensitive.
         */
        private String displayName = null;

        /**
         * A filter to return resources that match the entire display name given. The match is case
         * sensitive.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** The Database Infrastructure ID. */
        private String infrastructureId = null;

        /**
         * The Database Infrastructure ID.
         *
         * @param infrastructureId the value to set
         * @return this builder instance
         */
        public Builder infrastructureId(String infrastructureId) {
            this.infrastructureId = infrastructureId;
            return this;
        }

        /** The type of the target resource. */
        private com.oracle.bmc.datacc.model.TargetResourceTypeEnum targetResourceType = null;

        /**
         * The type of the target resource.
         *
         * @param targetResourceType the value to set
         * @return this builder instance
         */
        public Builder targetResourceType(
                com.oracle.bmc.datacc.model.TargetResourceTypeEnum targetResourceType) {
            this.targetResourceType = targetResourceType;
            return this;
        }

        /** The maintenance type. */
        private com.oracle.bmc.datacc.model.MaintenanceTypeEnum maintenanceType = null;

        /**
         * The maintenance type.
         *
         * @param maintenanceType the value to set
         * @return this builder instance
         */
        public Builder maintenanceType(
                com.oracle.bmc.datacc.model.MaintenanceTypeEnum maintenanceType) {
            this.maintenanceType = maintenanceType;
            return this;
        }

        /** The maintenance run OCID. */
        private String maintenanceRunId = null;

        /**
         * The maintenance run OCID.
         *
         * @param maintenanceRunId the value to set
         * @return this builder instance
         */
        public Builder maintenanceRunId(String maintenanceRunId) {
            this.maintenanceRunId = maintenanceRunId;
            return this;
        }

        /** A filter to return only resources that match the given lifecycle state exactly. */
        private com.oracle.bmc.datacc.model.MaintenanceRunLifecycleState lifecycleState = null;

        /**
         * A filter to return only resources that match the given lifecycle state exactly.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.datacc.model.MaintenanceRunLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** The sub-type of the maintenance run. */
        private com.oracle.bmc.datacc.model.MaintenanceSubtypeEnum maintenanceSubtype = null;

        /**
         * The sub-type of the maintenance run.
         *
         * @param maintenanceSubtype the value to set
         * @return this builder instance
         */
        public Builder maintenanceSubtype(
                com.oracle.bmc.datacc.model.MaintenanceSubtypeEnum maintenanceSubtype) {
            this.maintenanceSubtype = maintenanceSubtype;
            return this;
        }

        /** Filter maintenance run for before given time. */
        private java.util.Date timeAcceptedLessThanOrEqualTo = null;

        /**
         * Filter maintenance run for before given time.
         *
         * @param timeAcceptedLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeAcceptedLessThanOrEqualTo(java.util.Date timeAcceptedLessThanOrEqualTo) {
            this.timeAcceptedLessThanOrEqualTo = timeAcceptedLessThanOrEqualTo;
            return this;
        }

        /** Filter maintenance run for after given time. */
        private java.util.Date timeAcceptedGreaterThanOrEqualTo = null;

        /**
         * Filter maintenance run for after given time.
         *
         * @param timeAcceptedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeAcceptedGreaterThanOrEqualTo(
                java.util.Date timeAcceptedGreaterThanOrEqualTo) {
            this.timeAcceptedGreaterThanOrEqualTo = timeAcceptedGreaterThanOrEqualTo;
            return this;
        }

        /** The maintenance execution type. */
        private com.oracle.bmc.datacc.model.TypeEnum type = null;

        /**
         * The maintenance execution type.
         *
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(com.oracle.bmc.datacc.model.TypeEnum type) {
            this.type = type;
            return this;
        }

        /** The maximum number of items to return in a page. */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a page.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which you want to start retrieving results. This
         * token is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which you want to start retrieving results. This
         * token is usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The field by which you want to sort. You can provide only one type of sort order. The
         * default order for {@code timeCreated} is descending. The default order for {@code
         * displayName} is ascending. If no value is specified, then {@code timeCreated} is the
         * default. When listing software images within the same {@code version}, using {@code
         * sortBy=buildIdentifier} is recommended. {@code buildIdentifier} is a monotonically
         * increasing, time-ordered string marker (yyyy-mm-dd-hh:mm:ss) stored with the image.
         */
        private SortBy sortBy = null;

        /**
         * The field by which you want to sort. You can provide only one type of sort order. The
         * default order for {@code timeCreated} is descending. The default order for {@code
         * displayName} is ascending. If no value is specified, then {@code timeCreated} is the
         * default. When listing software images within the same {@code version}, using {@code
         * sortBy=buildIdentifier} is recommended. {@code buildIdentifier} is a monotonically
         * increasing, time-ordered string marker (yyyy-mm-dd-hh:mm:ss) stored with the image.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order that you want to use, which is either {@code ASC} or {@code DESC}. */
        private com.oracle.bmc.datacc.model.SortOrder sortOrder = null;

        /**
         * The sort order that you want to use, which is either {@code ASC} or {@code DESC}.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.datacc.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** The client request identifier. */
        private String opcRequestId = null;

        /**
         * The client request identifier.
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
        public Builder copy(ListMaintenanceExecutionsRequest o) {
            compartmentId(o.getCompartmentId());
            displayName(o.getDisplayName());
            infrastructureId(o.getInfrastructureId());
            targetResourceType(o.getTargetResourceType());
            maintenanceType(o.getMaintenanceType());
            maintenanceRunId(o.getMaintenanceRunId());
            lifecycleState(o.getLifecycleState());
            maintenanceSubtype(o.getMaintenanceSubtype());
            timeAcceptedLessThanOrEqualTo(o.getTimeAcceptedLessThanOrEqualTo());
            timeAcceptedGreaterThanOrEqualTo(o.getTimeAcceptedGreaterThanOrEqualTo());
            type(o.getType());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListMaintenanceExecutionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListMaintenanceExecutionsRequest
         */
        public ListMaintenanceExecutionsRequest build() {
            ListMaintenanceExecutionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListMaintenanceExecutionsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListMaintenanceExecutionsRequest
         */
        public ListMaintenanceExecutionsRequest buildWithoutInvocationCallback() {
            ListMaintenanceExecutionsRequest request = new ListMaintenanceExecutionsRequest();
            request.compartmentId = compartmentId;
            request.displayName = displayName;
            request.infrastructureId = infrastructureId;
            request.targetResourceType = targetResourceType;
            request.maintenanceType = maintenanceType;
            request.maintenanceRunId = maintenanceRunId;
            request.lifecycleState = lifecycleState;
            request.maintenanceSubtype = maintenanceSubtype;
            request.timeAcceptedLessThanOrEqualTo = timeAcceptedLessThanOrEqualTo;
            request.timeAcceptedGreaterThanOrEqualTo = timeAcceptedGreaterThanOrEqualTo;
            request.type = type;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListMaintenanceExecutionsRequest(compartmentId, displayName, infrastructureId,
            // targetResourceType, maintenanceType, maintenanceRunId, lifecycleState,
            // maintenanceSubtype, timeAcceptedLessThanOrEqualTo, timeAcceptedGreaterThanOrEqualTo,
            // type, limit, page, sortBy, sortOrder, opcRequestId);
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
                .displayName(displayName)
                .infrastructureId(infrastructureId)
                .targetResourceType(targetResourceType)
                .maintenanceType(maintenanceType)
                .maintenanceRunId(maintenanceRunId)
                .lifecycleState(lifecycleState)
                .maintenanceSubtype(maintenanceSubtype)
                .timeAcceptedLessThanOrEqualTo(timeAcceptedLessThanOrEqualTo)
                .timeAcceptedGreaterThanOrEqualTo(timeAcceptedGreaterThanOrEqualTo)
                .type(type)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
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
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",infrastructureId=").append(String.valueOf(this.infrastructureId));
        sb.append(",targetResourceType=").append(String.valueOf(this.targetResourceType));
        sb.append(",maintenanceType=").append(String.valueOf(this.maintenanceType));
        sb.append(",maintenanceRunId=").append(String.valueOf(this.maintenanceRunId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",maintenanceSubtype=").append(String.valueOf(this.maintenanceSubtype));
        sb.append(",timeAcceptedLessThanOrEqualTo=")
                .append(String.valueOf(this.timeAcceptedLessThanOrEqualTo));
        sb.append(",timeAcceptedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeAcceptedGreaterThanOrEqualTo));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListMaintenanceExecutionsRequest)) {
            return false;
        }

        ListMaintenanceExecutionsRequest other = (ListMaintenanceExecutionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.infrastructureId, other.infrastructureId)
                && java.util.Objects.equals(this.targetResourceType, other.targetResourceType)
                && java.util.Objects.equals(this.maintenanceType, other.maintenanceType)
                && java.util.Objects.equals(this.maintenanceRunId, other.maintenanceRunId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.maintenanceSubtype, other.maintenanceSubtype)
                && java.util.Objects.equals(
                        this.timeAcceptedLessThanOrEqualTo, other.timeAcceptedLessThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeAcceptedGreaterThanOrEqualTo,
                        other.timeAcceptedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureId == null ? 43 : this.infrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourceType == null
                                ? 43
                                : this.targetResourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceType == null ? 43 : this.maintenanceType.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceRunId == null ? 43 : this.maintenanceRunId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceSubtype == null
                                ? 43
                                : this.maintenanceSubtype.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAcceptedLessThanOrEqualTo == null
                                ? 43
                                : this.timeAcceptedLessThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAcceptedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeAcceptedGreaterThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

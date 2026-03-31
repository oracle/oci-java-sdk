/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.requests;

import com.oracle.bmc.mysql.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/ListMaintenanceEventsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListMaintenanceEventsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class ListMaintenanceEventsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The DB System [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String dbSystemId;

    /**
     * The DB System [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getDbSystemId() {
        return dbSystemId;
    }
    /**
     * Customer-defined unique identifier for the request. If you need to
     * contact Oracle about a specific request, please provide the request
     * ID that you supplied in this header with the request.
     *
     */
    private String opcRequestId;

    /**
     * Customer-defined unique identifier for the request. If you need to
     * contact Oracle about a specific request, please provide the request
     * ID that you supplied in this header with the request.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The MySQL version before the maintenance event.
     */
    private String mysqlVersionBeforeMaintenance;

    /**
     * The MySQL version before the maintenance event.
     */
    public String getMysqlVersionBeforeMaintenance() {
        return mysqlVersionBeforeMaintenance;
    }
    /**
     * The MySQL version after the maintenance event.
     */
    private String mysqlVersionAfterMaintenance;

    /**
     * The MySQL version after the maintenance event.
     */
    public String getMysqlVersionAfterMaintenance() {
        return mysqlVersionAfterMaintenance;
    }
    /**
     * How the maintenance event was triggered.
     */
    private com.oracle.bmc.mysql.model.MaintenanceType maintenanceType;

    /**
     * How the maintenance event was triggered.
     */
    public com.oracle.bmc.mysql.model.MaintenanceType getMaintenanceType() {
        return maintenanceType;
    }
    /**
     * The nature of the maintenance event.
     */
    private com.oracle.bmc.mysql.model.MaintenanceAction maintenanceAction;

    /**
     * The nature of the maintenance event.
     */
    public com.oracle.bmc.mysql.model.MaintenanceAction getMaintenanceAction() {
        return maintenanceAction;
    }
    /**
     * The last status of the maintenance event.
     */
    private com.oracle.bmc.mysql.model.MaintenanceEvent.MaintenanceStatus maintenanceStatus;

    /**
     * The last status of the maintenance event.
     */
    public com.oracle.bmc.mysql.model.MaintenanceEvent.MaintenanceStatus getMaintenanceStatus() {
        return maintenanceStatus;
    }
    /**
     * The maximum number of items to return in a paginated list call. For information about pagination, see
     * [List Pagination](https://docs.oracle.com/iaas/#API/Concepts/usingapi.htm#List_Pagination).
     *
     */
    private Integer limit;

    /**
     * The maximum number of items to return in a paginated list call. For information about pagination, see
     * [List Pagination](https://docs.oracle.com/iaas/#API/Concepts/usingapi.htm#List_Pagination).
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} or {@code opc-prev-page} response header from
     * the previous list call. For information about pagination, see [List
     * Pagination](https://docs.oracle.com/iaas/#API/Concepts/usingapi.htm#List_Pagination).
     *
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} or {@code opc-prev-page} response header from
     * the previous list call. For information about pagination, see [List
     * Pagination](https://docs.oracle.com/iaas/#API/Concepts/usingapi.htm#List_Pagination).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The field to sort by. Only one sort order may be provided.
     * Time fields are default ordered as descending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided.
     * Time fields are default ordered as descending.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        TimeScheduled("timeScheduled"),
        TimeStarted("timeStarted"),
        TimeEnded("timeEnded"),
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
     * The field to sort by. Only one sort order may be provided.
     * Time fields are default ordered as descending.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use (ASC or DESC).
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use (ASC or DESC).
     **/
    public enum SortOrder {
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

    /**
     * The sort order to use (ASC or DESC).
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListMaintenanceEventsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The DB System [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String dbSystemId = null;

        /**
         * The DB System [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param dbSystemId the value to set
         * @return this builder instance
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            return this;
        }

        /**
         * Customer-defined unique identifier for the request. If you need to
         * contact Oracle about a specific request, please provide the request
         * ID that you supplied in this header with the request.
         *
         */
        private String opcRequestId = null;

        /**
         * Customer-defined unique identifier for the request. If you need to
         * contact Oracle about a specific request, please provide the request
         * ID that you supplied in this header with the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The MySQL version before the maintenance event.
         */
        private String mysqlVersionBeforeMaintenance = null;

        /**
         * The MySQL version before the maintenance event.
         * @param mysqlVersionBeforeMaintenance the value to set
         * @return this builder instance
         */
        public Builder mysqlVersionBeforeMaintenance(String mysqlVersionBeforeMaintenance) {
            this.mysqlVersionBeforeMaintenance = mysqlVersionBeforeMaintenance;
            return this;
        }

        /**
         * The MySQL version after the maintenance event.
         */
        private String mysqlVersionAfterMaintenance = null;

        /**
         * The MySQL version after the maintenance event.
         * @param mysqlVersionAfterMaintenance the value to set
         * @return this builder instance
         */
        public Builder mysqlVersionAfterMaintenance(String mysqlVersionAfterMaintenance) {
            this.mysqlVersionAfterMaintenance = mysqlVersionAfterMaintenance;
            return this;
        }

        /**
         * How the maintenance event was triggered.
         */
        private com.oracle.bmc.mysql.model.MaintenanceType maintenanceType = null;

        /**
         * How the maintenance event was triggered.
         * @param maintenanceType the value to set
         * @return this builder instance
         */
        public Builder maintenanceType(com.oracle.bmc.mysql.model.MaintenanceType maintenanceType) {
            this.maintenanceType = maintenanceType;
            return this;
        }

        /**
         * The nature of the maintenance event.
         */
        private com.oracle.bmc.mysql.model.MaintenanceAction maintenanceAction = null;

        /**
         * The nature of the maintenance event.
         * @param maintenanceAction the value to set
         * @return this builder instance
         */
        public Builder maintenanceAction(
                com.oracle.bmc.mysql.model.MaintenanceAction maintenanceAction) {
            this.maintenanceAction = maintenanceAction;
            return this;
        }

        /**
         * The last status of the maintenance event.
         */
        private com.oracle.bmc.mysql.model.MaintenanceEvent.MaintenanceStatus maintenanceStatus =
                null;

        /**
         * The last status of the maintenance event.
         * @param maintenanceStatus the value to set
         * @return this builder instance
         */
        public Builder maintenanceStatus(
                com.oracle.bmc.mysql.model.MaintenanceEvent.MaintenanceStatus maintenanceStatus) {
            this.maintenanceStatus = maintenanceStatus;
            return this;
        }

        /**
         * The maximum number of items to return in a paginated list call. For information about pagination, see
         * [List Pagination](https://docs.oracle.com/iaas/#API/Concepts/usingapi.htm#List_Pagination).
         *
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated list call. For information about pagination, see
         * [List Pagination](https://docs.oracle.com/iaas/#API/Concepts/usingapi.htm#List_Pagination).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} or {@code opc-prev-page} response header from
         * the previous list call. For information about pagination, see [List
         * Pagination](https://docs.oracle.com/iaas/#API/Concepts/usingapi.htm#List_Pagination).
         *
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} or {@code opc-prev-page} response header from
         * the previous list call. For information about pagination, see [List
         * Pagination](https://docs.oracle.com/iaas/#API/Concepts/usingapi.htm#List_Pagination).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided.
         * Time fields are default ordered as descending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided.
         * Time fields are default ordered as descending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use (ASC or DESC).
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use (ASC or DESC).
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
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
        public Builder copy(ListMaintenanceEventsRequest o) {
            dbSystemId(o.getDbSystemId());
            opcRequestId(o.getOpcRequestId());
            mysqlVersionBeforeMaintenance(o.getMysqlVersionBeforeMaintenance());
            mysqlVersionAfterMaintenance(o.getMysqlVersionAfterMaintenance());
            maintenanceType(o.getMaintenanceType());
            maintenanceAction(o.getMaintenanceAction());
            maintenanceStatus(o.getMaintenanceStatus());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListMaintenanceEventsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListMaintenanceEventsRequest
         */
        public ListMaintenanceEventsRequest build() {
            ListMaintenanceEventsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListMaintenanceEventsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListMaintenanceEventsRequest
         */
        public ListMaintenanceEventsRequest buildWithoutInvocationCallback() {
            ListMaintenanceEventsRequest request = new ListMaintenanceEventsRequest();
            request.dbSystemId = dbSystemId;
            request.opcRequestId = opcRequestId;
            request.mysqlVersionBeforeMaintenance = mysqlVersionBeforeMaintenance;
            request.mysqlVersionAfterMaintenance = mysqlVersionAfterMaintenance;
            request.maintenanceType = maintenanceType;
            request.maintenanceAction = maintenanceAction;
            request.maintenanceStatus = maintenanceStatus;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            return request;
            // new ListMaintenanceEventsRequest(dbSystemId, opcRequestId, mysqlVersionBeforeMaintenance, mysqlVersionAfterMaintenance, maintenanceType, maintenanceAction, maintenanceStatus, limit, page, sortBy, sortOrder);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .dbSystemId(dbSystemId)
                .opcRequestId(opcRequestId)
                .mysqlVersionBeforeMaintenance(mysqlVersionBeforeMaintenance)
                .mysqlVersionAfterMaintenance(mysqlVersionAfterMaintenance)
                .maintenanceType(maintenanceType)
                .maintenanceAction(maintenanceAction)
                .maintenanceStatus(maintenanceStatus)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder);
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
        sb.append(",dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",mysqlVersionBeforeMaintenance=")
                .append(String.valueOf(this.mysqlVersionBeforeMaintenance));
        sb.append(",mysqlVersionAfterMaintenance=")
                .append(String.valueOf(this.mysqlVersionAfterMaintenance));
        sb.append(",maintenanceType=").append(String.valueOf(this.maintenanceType));
        sb.append(",maintenanceAction=").append(String.valueOf(this.maintenanceAction));
        sb.append(",maintenanceStatus=").append(String.valueOf(this.maintenanceStatus));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListMaintenanceEventsRequest)) {
            return false;
        }

        ListMaintenanceEventsRequest other = (ListMaintenanceEventsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.mysqlVersionBeforeMaintenance, other.mysqlVersionBeforeMaintenance)
                && java.util.Objects.equals(
                        this.mysqlVersionAfterMaintenance, other.mysqlVersionAfterMaintenance)
                && java.util.Objects.equals(this.maintenanceType, other.maintenanceType)
                && java.util.Objects.equals(this.maintenanceAction, other.maintenanceAction)
                && java.util.Objects.equals(this.maintenanceStatus, other.maintenanceStatus)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlVersionBeforeMaintenance == null
                                ? 43
                                : this.mysqlVersionBeforeMaintenance.hashCode());
        result =
                (result * PRIME)
                        + (this.mysqlVersionAfterMaintenance == null
                                ? 43
                                : this.mysqlVersionAfterMaintenance.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceType == null ? 43 : this.maintenanceType.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceAction == null ? 43 : this.maintenanceAction.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceStatus == null ? 43 : this.maintenanceStatus.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }
}

/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.requests;

import com.oracle.bmc.mysql.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mysql/ListBackupsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListBackupsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class ListBackupsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The compartment
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String compartmentId;

    /**
     * The compartment
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Customer-defined unique identifier for the request. If you need to contact Oracle about a
     * specific request, please provide the request ID that you supplied in this header with the
     * request.
     */
    private String opcRequestId;

    /**
     * Customer-defined unique identifier for the request. If you need to contact Oracle about a
     * specific request, please provide the request ID that you supplied in this header with the
     * request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** Backup OCID */
    private String backupId;

    /** Backup OCID */
    public String getBackupId() {
        return backupId;
    }
    /** Backup Lifecycle State */
    private com.oracle.bmc.mysql.model.Backup.LifecycleState lifecycleState;

    /** Backup Lifecycle State */
    public com.oracle.bmc.mysql.model.Backup.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
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
    /** A filter to return only the resource matching the given display name exactly. */
    private String displayName;

    /** A filter to return only the resource matching the given display name exactly. */
    public String getDisplayName() {
        return displayName;
    }
    /** Backup Soft Delete */
    private com.oracle.bmc.mysql.model.SoftDelete softDelete;

    /** Backup Soft Delete */
    public com.oracle.bmc.mysql.model.SoftDelete getSoftDelete() {
        return softDelete;
    }
    /** Backup creationType */
    private com.oracle.bmc.mysql.model.Backup.CreationType creationType;

    /** Backup creationType */
    public com.oracle.bmc.mysql.model.Backup.CreationType getCreationType() {
        return creationType;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Time fields are default ordered as
     * descending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Time fields are default ordered as
     * descending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
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
     * The field to sort by. Only one sort order may be provided. Time fields are default ordered as
     * descending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use (ASC or DESC). */
    private SortOrder sortOrder;

    /** The sort order to use (ASC or DESC). */
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

    /** The sort order to use (ASC or DESC). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The maximum number of items to return in a paginated list call. For information about
     * pagination, see [List
     * Pagination](https://docs.oracle.com/iaas/#API/Concepts/usingapi.htm#List_Pagination).
     */
    private Integer limit;

    /**
     * The maximum number of items to return in a paginated list call. For information about
     * pagination, see [List
     * Pagination](https://docs.oracle.com/iaas/#API/Concepts/usingapi.htm#List_Pagination).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} or {@code opc-prev-page} response header from the
     * previous list call. For information about pagination, see [List
     * Pagination](https://docs.oracle.com/iaas/#API/Concepts/usingapi.htm#List_Pagination).
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} or {@code opc-prev-page} response header from the
     * previous list call. For information about pagination, see [List
     * Pagination](https://docs.oracle.com/iaas/#API/Concepts/usingapi.htm#List_Pagination).
     */
    public String getPage() {
        return page;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListBackupsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The compartment
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String compartmentId = null;

        /**
         * The compartment
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Customer-defined unique identifier for the request. If you need to contact Oracle about a
         * specific request, please provide the request ID that you supplied in this header with the
         * request.
         */
        private String opcRequestId = null;

        /**
         * Customer-defined unique identifier for the request. If you need to contact Oracle about a
         * specific request, please provide the request ID that you supplied in this header with the
         * request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** Backup OCID */
        private String backupId = null;

        /**
         * Backup OCID
         *
         * @param backupId the value to set
         * @return this builder instance
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            return this;
        }

        /** Backup Lifecycle State */
        private com.oracle.bmc.mysql.model.Backup.LifecycleState lifecycleState = null;

        /**
         * Backup Lifecycle State
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.mysql.model.Backup.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The DB System
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String dbSystemId = null;

        /**
         * The DB System
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param dbSystemId the value to set
         * @return this builder instance
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            return this;
        }

        /** A filter to return only the resource matching the given display name exactly. */
        private String displayName = null;

        /**
         * A filter to return only the resource matching the given display name exactly.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** Backup Soft Delete */
        private com.oracle.bmc.mysql.model.SoftDelete softDelete = null;

        /**
         * Backup Soft Delete
         *
         * @param softDelete the value to set
         * @return this builder instance
         */
        public Builder softDelete(com.oracle.bmc.mysql.model.SoftDelete softDelete) {
            this.softDelete = softDelete;
            return this;
        }

        /** Backup creationType */
        private com.oracle.bmc.mysql.model.Backup.CreationType creationType = null;

        /**
         * Backup creationType
         *
         * @param creationType the value to set
         * @return this builder instance
         */
        public Builder creationType(com.oracle.bmc.mysql.model.Backup.CreationType creationType) {
            this.creationType = creationType;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Time fields are default
         * ordered as descending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Time fields are default
         * ordered as descending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use (ASC or DESC). */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use (ASC or DESC).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The maximum number of items to return in a paginated list call. For information about
         * pagination, see [List
         * Pagination](https://docs.oracle.com/iaas/#API/Concepts/usingapi.htm#List_Pagination).
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated list call. For information about
         * pagination, see [List
         * Pagination](https://docs.oracle.com/iaas/#API/Concepts/usingapi.htm#List_Pagination).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} or {@code opc-prev-page} response header from the
         * previous list call. For information about pagination, see [List
         * Pagination](https://docs.oracle.com/iaas/#API/Concepts/usingapi.htm#List_Pagination).
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} or {@code opc-prev-page} response header from the
         * previous list call. For information about pagination, see [List
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
        public Builder copy(ListBackupsRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            backupId(o.getBackupId());
            lifecycleState(o.getLifecycleState());
            dbSystemId(o.getDbSystemId());
            displayName(o.getDisplayName());
            softDelete(o.getSoftDelete());
            creationType(o.getCreationType());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListBackupsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListBackupsRequest
         */
        public ListBackupsRequest build() {
            ListBackupsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListBackupsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListBackupsRequest
         */
        public ListBackupsRequest buildWithoutInvocationCallback() {
            ListBackupsRequest request = new ListBackupsRequest();
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.backupId = backupId;
            request.lifecycleState = lifecycleState;
            request.dbSystemId = dbSystemId;
            request.displayName = displayName;
            request.softDelete = softDelete;
            request.creationType = creationType;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.limit = limit;
            request.page = page;
            return request;
            // new ListBackupsRequest(compartmentId, opcRequestId, backupId, lifecycleState,
            // dbSystemId, displayName, softDelete, creationType, sortBy, sortOrder, limit, page);
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
                .opcRequestId(opcRequestId)
                .backupId(backupId)
                .lifecycleState(lifecycleState)
                .dbSystemId(dbSystemId)
                .displayName(displayName)
                .softDelete(softDelete)
                .creationType(creationType)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .limit(limit)
                .page(page);
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
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",backupId=").append(String.valueOf(this.backupId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",softDelete=").append(String.valueOf(this.softDelete));
        sb.append(",creationType=").append(String.valueOf(this.creationType));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListBackupsRequest)) {
            return false;
        }

        ListBackupsRequest other = (ListBackupsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.backupId, other.backupId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.softDelete, other.softDelete)
                && java.util.Objects.equals(this.creationType, other.creationType)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.backupId == null ? 43 : this.backupId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.softDelete == null ? 43 : this.softDelete.hashCode());
        result = (result * PRIME) + (this.creationType == null ? 43 : this.creationType.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}

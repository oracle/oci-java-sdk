/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListAutonomousDatabasesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListAutonomousDatabasesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListAutonomousDatabasesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * The Autonomous Container Database
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String autonomousContainerDatabaseId;

    /**
     * The Autonomous Container Database
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getAutonomousContainerDatabaseId() {
        return autonomousContainerDatabaseId;
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
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The DISPLAYNAME sort
     * order is case sensitive.
     *
     * <p>*Note:** If you do not include the availability domain filter, the resources are grouped
     * by availability domain, then sorted.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The DISPLAYNAME sort
     * order is case sensitive.
     *
     * <p>*Note:** If you do not include the availability domain filter, the resources are grouped
     * by availability domain, then sorted.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Timecreated("TIMECREATED"),
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
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The DISPLAYNAME sort
     * order is case sensitive.
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
    /** A filter to return only resources that match the given Infrastructure Type. */
    private com.oracle.bmc.database.model.AutonomousDatabaseSummary.InfrastructureType
            infrastructureType;

    /** A filter to return only resources that match the given Infrastructure Type. */
    public com.oracle.bmc.database.model.AutonomousDatabaseSummary.InfrastructureType
            getInfrastructureType() {
        return infrastructureType;
    }
    /** A filter to return only resources that match the given lifecycle state exactly. */
    private com.oracle.bmc.database.model.AutonomousDatabaseSummary.LifecycleState lifecycleState;

    /** A filter to return only resources that match the given lifecycle state exactly. */
    public com.oracle.bmc.database.model.AutonomousDatabaseSummary.LifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /** A filter to return only resources that not match the given lifecycle state. */
    private com.oracle.bmc.database.model.AutonomousDatabaseSummary.LifecycleState
            lifecycleStateNotEqualTo;

    /** A filter to return only resources that not match the given lifecycle state. */
    public com.oracle.bmc.database.model.AutonomousDatabaseSummary.LifecycleState
            getLifecycleStateNotEqualTo() {
        return lifecycleStateNotEqualTo;
    }
    /**
     * A filter to return only Autonomous AI Database resources that match the specified workload
     * type.
     */
    private com.oracle.bmc.database.model.AutonomousDatabaseSummary.DbWorkload dbWorkload;

    /**
     * A filter to return only Autonomous AI Database resources that match the specified workload
     * type.
     */
    public com.oracle.bmc.database.model.AutonomousDatabaseSummary.DbWorkload getDbWorkload() {
        return dbWorkload;
    }
    /**
     * A filter to return only Autonomous AI Database resources that match the specified dbVersion.
     */
    private String dbVersion;

    /**
     * A filter to return only Autonomous AI Database resources that match the specified dbVersion.
     */
    public String getDbVersion() {
        return dbVersion;
    }
    /**
     * Filter on the value of the resource's 'isFreeTier' property. A value of {@code true} returns
     * only Always Free resources. A value of {@code false} excludes Always Free resources from the
     * returned results. Omitting this parameter returns both Always Free and paid resources.
     */
    private Boolean isFreeTier;

    /**
     * Filter on the value of the resource's 'isFreeTier' property. A value of {@code true} returns
     * only Always Free resources. A value of {@code false} excludes Always Free resources from the
     * returned results. Omitting this parameter returns both Always Free and paid resources.
     */
    public Boolean getIsFreeTier() {
        return isFreeTier;
    }
    /**
     * A filter to return only resources that match the entire display name given. The match is not
     * case sensitive.
     */
    private String displayName;

    /**
     * A filter to return only resources that match the entire display name given. The match is not
     * case sensitive.
     */
    public String getDisplayName() {
        return displayName;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Filter on the value of the resource's 'isRefreshableClone' property. A value of {@code true}
     * returns only refreshable clones. A value of {@code false} excludes refreshable clones from
     * the returned results. Omitting this parameter returns both refreshable clones and databases
     * that are not refreshable clones.
     */
    private Boolean isRefreshableClone;

    /**
     * Filter on the value of the resource's 'isRefreshableClone' property. A value of {@code true}
     * returns only refreshable clones. A value of {@code false} excludes refreshable clones from
     * the returned results. Omitting this parameter returns both refreshable clones and databases
     * that are not refreshable clones.
     */
    public Boolean getIsRefreshableClone() {
        return isRefreshableClone;
    }
    /** A filter to return only resources that have Data Guard enabled. */
    private Boolean isDataGuardEnabled;

    /** A filter to return only resources that have Data Guard enabled. */
    public Boolean getIsDataGuardEnabled() {
        return isDataGuardEnabled;
    }
    /**
     * Filter if the resource is the resource pool leader. A value of {@code true} returns only
     * resource pool leader.
     */
    private Boolean isResourcePoolLeader;

    /**
     * Filter if the resource is the resource pool leader. A value of {@code true} returns only
     * resource pool leader.
     */
    public Boolean getIsResourcePoolLeader() {
        return isResourcePoolLeader;
    }
    /**
     * The database [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the resourcepool Leader Autonomous AI Database.
     */
    private String resourcePoolLeaderId;

    /**
     * The database [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the resourcepool Leader Autonomous AI Database.
     */
    public String getResourcePoolLeaderId() {
        return resourcePoolLeaderId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListAutonomousDatabasesRequest, java.lang.Void> {
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
         * The Autonomous Container Database
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String autonomousContainerDatabaseId = null;

        /**
         * The Autonomous Container Database
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param autonomousContainerDatabaseId the value to set
         * @return this builder instance
         */
        public Builder autonomousContainerDatabaseId(String autonomousContainerDatabaseId) {
            this.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
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
         * for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The
         * DISPLAYNAME sort order is case sensitive.
         *
         * <p>*Note:** If you do not include the availability domain filter, the resources are
         * grouped by availability domain, then sorted.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order
         * for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The
         * DISPLAYNAME sort order is case sensitive.
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

        /** A filter to return only resources that match the given Infrastructure Type. */
        private com.oracle.bmc.database.model.AutonomousDatabaseSummary.InfrastructureType
                infrastructureType = null;

        /**
         * A filter to return only resources that match the given Infrastructure Type.
         *
         * @param infrastructureType the value to set
         * @return this builder instance
         */
        public Builder infrastructureType(
                com.oracle.bmc.database.model.AutonomousDatabaseSummary.InfrastructureType
                        infrastructureType) {
            this.infrastructureType = infrastructureType;
            return this;
        }

        /** A filter to return only resources that match the given lifecycle state exactly. */
        private com.oracle.bmc.database.model.AutonomousDatabaseSummary.LifecycleState
                lifecycleState = null;

        /**
         * A filter to return only resources that match the given lifecycle state exactly.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.database.model.AutonomousDatabaseSummary.LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** A filter to return only resources that not match the given lifecycle state. */
        private com.oracle.bmc.database.model.AutonomousDatabaseSummary.LifecycleState
                lifecycleStateNotEqualTo = null;

        /**
         * A filter to return only resources that not match the given lifecycle state.
         *
         * @param lifecycleStateNotEqualTo the value to set
         * @return this builder instance
         */
        public Builder lifecycleStateNotEqualTo(
                com.oracle.bmc.database.model.AutonomousDatabaseSummary.LifecycleState
                        lifecycleStateNotEqualTo) {
            this.lifecycleStateNotEqualTo = lifecycleStateNotEqualTo;
            return this;
        }

        /**
         * A filter to return only Autonomous AI Database resources that match the specified
         * workload type.
         */
        private com.oracle.bmc.database.model.AutonomousDatabaseSummary.DbWorkload dbWorkload =
                null;

        /**
         * A filter to return only Autonomous AI Database resources that match the specified
         * workload type.
         *
         * @param dbWorkload the value to set
         * @return this builder instance
         */
        public Builder dbWorkload(
                com.oracle.bmc.database.model.AutonomousDatabaseSummary.DbWorkload dbWorkload) {
            this.dbWorkload = dbWorkload;
            return this;
        }

        /**
         * A filter to return only Autonomous AI Database resources that match the specified
         * dbVersion.
         */
        private String dbVersion = null;

        /**
         * A filter to return only Autonomous AI Database resources that match the specified
         * dbVersion.
         *
         * @param dbVersion the value to set
         * @return this builder instance
         */
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            return this;
        }

        /**
         * Filter on the value of the resource's 'isFreeTier' property. A value of {@code true}
         * returns only Always Free resources. A value of {@code false} excludes Always Free
         * resources from the returned results. Omitting this parameter returns both Always Free and
         * paid resources.
         */
        private Boolean isFreeTier = null;

        /**
         * Filter on the value of the resource's 'isFreeTier' property. A value of {@code true}
         * returns only Always Free resources. A value of {@code false} excludes Always Free
         * resources from the returned results. Omitting this parameter returns both Always Free and
         * paid resources.
         *
         * @param isFreeTier the value to set
         * @return this builder instance
         */
        public Builder isFreeTier(Boolean isFreeTier) {
            this.isFreeTier = isFreeTier;
            return this;
        }

        /**
         * A filter to return only resources that match the entire display name given. The match is
         * not case sensitive.
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given. The match is
         * not case sensitive.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Filter on the value of the resource's 'isRefreshableClone' property. A value of {@code
         * true} returns only refreshable clones. A value of {@code false} excludes refreshable
         * clones from the returned results. Omitting this parameter returns both refreshable clones
         * and databases that are not refreshable clones.
         */
        private Boolean isRefreshableClone = null;

        /**
         * Filter on the value of the resource's 'isRefreshableClone' property. A value of {@code
         * true} returns only refreshable clones. A value of {@code false} excludes refreshable
         * clones from the returned results. Omitting this parameter returns both refreshable clones
         * and databases that are not refreshable clones.
         *
         * @param isRefreshableClone the value to set
         * @return this builder instance
         */
        public Builder isRefreshableClone(Boolean isRefreshableClone) {
            this.isRefreshableClone = isRefreshableClone;
            return this;
        }

        /** A filter to return only resources that have Data Guard enabled. */
        private Boolean isDataGuardEnabled = null;

        /**
         * A filter to return only resources that have Data Guard enabled.
         *
         * @param isDataGuardEnabled the value to set
         * @return this builder instance
         */
        public Builder isDataGuardEnabled(Boolean isDataGuardEnabled) {
            this.isDataGuardEnabled = isDataGuardEnabled;
            return this;
        }

        /**
         * Filter if the resource is the resource pool leader. A value of {@code true} returns only
         * resource pool leader.
         */
        private Boolean isResourcePoolLeader = null;

        /**
         * Filter if the resource is the resource pool leader. A value of {@code true} returns only
         * resource pool leader.
         *
         * @param isResourcePoolLeader the value to set
         * @return this builder instance
         */
        public Builder isResourcePoolLeader(Boolean isResourcePoolLeader) {
            this.isResourcePoolLeader = isResourcePoolLeader;
            return this;
        }

        /**
         * The database
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * resourcepool Leader Autonomous AI Database.
         */
        private String resourcePoolLeaderId = null;

        /**
         * The database
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * resourcepool Leader Autonomous AI Database.
         *
         * @param resourcePoolLeaderId the value to set
         * @return this builder instance
         */
        public Builder resourcePoolLeaderId(String resourcePoolLeaderId) {
            this.resourcePoolLeaderId = resourcePoolLeaderId;
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
        public Builder copy(ListAutonomousDatabasesRequest o) {
            compartmentId(o.getCompartmentId());
            autonomousContainerDatabaseId(o.getAutonomousContainerDatabaseId());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            infrastructureType(o.getInfrastructureType());
            lifecycleState(o.getLifecycleState());
            lifecycleStateNotEqualTo(o.getLifecycleStateNotEqualTo());
            dbWorkload(o.getDbWorkload());
            dbVersion(o.getDbVersion());
            isFreeTier(o.getIsFreeTier());
            displayName(o.getDisplayName());
            opcRequestId(o.getOpcRequestId());
            isRefreshableClone(o.getIsRefreshableClone());
            isDataGuardEnabled(o.getIsDataGuardEnabled());
            isResourcePoolLeader(o.getIsResourcePoolLeader());
            resourcePoolLeaderId(o.getResourcePoolLeaderId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAutonomousDatabasesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListAutonomousDatabasesRequest
         */
        public ListAutonomousDatabasesRequest build() {
            ListAutonomousDatabasesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAutonomousDatabasesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAutonomousDatabasesRequest
         */
        public ListAutonomousDatabasesRequest buildWithoutInvocationCallback() {
            ListAutonomousDatabasesRequest request = new ListAutonomousDatabasesRequest();
            request.compartmentId = compartmentId;
            request.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.infrastructureType = infrastructureType;
            request.lifecycleState = lifecycleState;
            request.lifecycleStateNotEqualTo = lifecycleStateNotEqualTo;
            request.dbWorkload = dbWorkload;
            request.dbVersion = dbVersion;
            request.isFreeTier = isFreeTier;
            request.displayName = displayName;
            request.opcRequestId = opcRequestId;
            request.isRefreshableClone = isRefreshableClone;
            request.isDataGuardEnabled = isDataGuardEnabled;
            request.isResourcePoolLeader = isResourcePoolLeader;
            request.resourcePoolLeaderId = resourcePoolLeaderId;
            return request;
            // new ListAutonomousDatabasesRequest(compartmentId, autonomousContainerDatabaseId,
            // limit, page, sortBy, sortOrder, infrastructureType, lifecycleState,
            // lifecycleStateNotEqualTo, dbWorkload, dbVersion, isFreeTier, displayName,
            // opcRequestId, isRefreshableClone, isDataGuardEnabled, isResourcePoolLeader,
            // resourcePoolLeaderId);
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
                .autonomousContainerDatabaseId(autonomousContainerDatabaseId)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .infrastructureType(infrastructureType)
                .lifecycleState(lifecycleState)
                .lifecycleStateNotEqualTo(lifecycleStateNotEqualTo)
                .dbWorkload(dbWorkload)
                .dbVersion(dbVersion)
                .isFreeTier(isFreeTier)
                .displayName(displayName)
                .opcRequestId(opcRequestId)
                .isRefreshableClone(isRefreshableClone)
                .isDataGuardEnabled(isDataGuardEnabled)
                .isResourcePoolLeader(isResourcePoolLeader)
                .resourcePoolLeaderId(resourcePoolLeaderId);
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
        sb.append(",autonomousContainerDatabaseId=")
                .append(String.valueOf(this.autonomousContainerDatabaseId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",infrastructureType=").append(String.valueOf(this.infrastructureType));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",lifecycleStateNotEqualTo=")
                .append(String.valueOf(this.lifecycleStateNotEqualTo));
        sb.append(",dbWorkload=").append(String.valueOf(this.dbWorkload));
        sb.append(",dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(",isFreeTier=").append(String.valueOf(this.isFreeTier));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isRefreshableClone=").append(String.valueOf(this.isRefreshableClone));
        sb.append(",isDataGuardEnabled=").append(String.valueOf(this.isDataGuardEnabled));
        sb.append(",isResourcePoolLeader=").append(String.valueOf(this.isResourcePoolLeader));
        sb.append(",resourcePoolLeaderId=").append(String.valueOf(this.resourcePoolLeaderId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAutonomousDatabasesRequest)) {
            return false;
        }

        ListAutonomousDatabasesRequest other = (ListAutonomousDatabasesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseId, other.autonomousContainerDatabaseId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.infrastructureType, other.infrastructureType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.lifecycleStateNotEqualTo, other.lifecycleStateNotEqualTo)
                && java.util.Objects.equals(this.dbWorkload, other.dbWorkload)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.isFreeTier, other.isFreeTier)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.isRefreshableClone, other.isRefreshableClone)
                && java.util.Objects.equals(this.isDataGuardEnabled, other.isDataGuardEnabled)
                && java.util.Objects.equals(this.isResourcePoolLeader, other.isResourcePoolLeader)
                && java.util.Objects.equals(this.resourcePoolLeaderId, other.resourcePoolLeaderId);
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
                        + (this.autonomousContainerDatabaseId == null
                                ? 43
                                : this.autonomousContainerDatabaseId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureType == null
                                ? 43
                                : this.infrastructureType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStateNotEqualTo == null
                                ? 43
                                : this.lifecycleStateNotEqualTo.hashCode());
        result = (result * PRIME) + (this.dbWorkload == null ? 43 : this.dbWorkload.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result = (result * PRIME) + (this.isFreeTier == null ? 43 : this.isFreeTier.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.isRefreshableClone == null
                                ? 43
                                : this.isRefreshableClone.hashCode());
        result =
                (result * PRIME)
                        + (this.isDataGuardEnabled == null
                                ? 43
                                : this.isDataGuardEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isResourcePoolLeader == null
                                ? 43
                                : this.isResourcePoolLeader.hashCode());
        result =
                (result * PRIME)
                        + (this.resourcePoolLeaderId == null
                                ? 43
                                : this.resourcePoolLeaderId.hashCode());
        return result;
    }
}

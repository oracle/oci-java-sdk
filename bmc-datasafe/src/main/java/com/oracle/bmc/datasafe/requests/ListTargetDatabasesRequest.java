/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListTargetDatabasesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListTargetDatabasesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListTargetDatabasesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * A filter to return only resources that match the specified compartment OCID.
     */
    private String compartmentId;

    /**
     * A filter to return only resources that match the specified compartment OCID.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return the target databases that are associated to the resource id passed in as a parameter value.
     */
    private String associatedResourceId;

    /**
     * A filter to return the target databases that are associated to the resource id passed in as a parameter value.
     */
    public String getAssociatedResourceId() {
        return associatedResourceId;
    }
    /**
     * A filter to return the target database that matches the specified OCID.
     */
    private String targetDatabaseId;

    /**
     * A filter to return the target database that matches the specified OCID.
     */
    public String getTargetDatabaseId() {
        return targetDatabaseId;
    }
    /**
     * A filter to return only resources that match the specified display name.
     *
     */
    private String displayName;

    /**
     * A filter to return only resources that match the specified display name.
     *
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * A filter to return only target databases that match the specified lifecycle state.
     */
    private com.oracle.bmc.datasafe.model.TargetDatabaseLifecycleState lifecycleState;

    /**
     * A filter to return only target databases that match the specified lifecycle state.
     */
    public com.oracle.bmc.datasafe.model.TargetDatabaseLifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return only target databases that match the specified database type.
     */
    private com.oracle.bmc.datasafe.model.DatabaseType databaseType;

    /**
     * A filter to return only target databases that match the specified database type.
     */
    public com.oracle.bmc.datasafe.model.DatabaseType getDatabaseType() {
        return databaseType;
    }
    /**
     * A filter to return only target databases that match the specified infrastructure type.
     */
    private com.oracle.bmc.datasafe.model.InfrastructureType infrastructureType;

    /**
     * A filter to return only target databases that match the specified infrastructure type.
     */
    public com.oracle.bmc.datasafe.model.InfrastructureType getInfrastructureType() {
        return infrastructureType;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * Default is false.
     * When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel' setting.
     *
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Default is false.
     * When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel' setting.
     *
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED.
     * Setting this to ACCESSIBLE returns only those compartments for which the
     * user has INSPECT permissions directly or indirectly (permissions can be on a
     * resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
     *
     */
    private AccessLevel accessLevel;

    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED.
     * Setting this to ACCESSIBLE returns only those compartments for which the
     * user has INSPECT permissions directly or indirectly (permissions can be on a
     * resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
     *
     **/
    public enum AccessLevel {
        Restricted("RESTRICTED"),
        Accessible("ACCESSIBLE"),
        ;

        private final String value;
        private static java.util.Map<String, AccessLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessLevel v : AccessLevel.values()) {
                map.put(v.getValue(), v);
            }
        }

        AccessLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AccessLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AccessLevel: " + key);
        }
    };

    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED.
     * Setting this to ACCESSIBLE returns only those compartments for which the
     * user has INSPECT permissions directly or indirectly (permissions can be on a
     * resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
     *
     */
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
    /**
     * The sort order to use, either ascending (ASC) or descending (DESC).
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending (ASC) or descending (DESC).
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
     * The sort order to use, either ascending (ASC) or descending (DESC).
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field used for sorting. Only one sorting order (sortOrder) can be specified.
     * The default order for TIMECREATED is descending. The default order for DISPLAYNAME is ascending.
     * The DISPLAYNAME sort order is case sensitive.
     *
     */
    private SortBy sortBy;

    /**
     * The field used for sorting. Only one sorting order (sortOrder) can be specified.
     * The default order for TIMECREATED is descending. The default order for DISPLAYNAME is ascending.
     * The DISPLAYNAME sort order is case sensitive.
     *
     **/
    public enum SortBy {
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
     * The field used for sorting. Only one sorting order (sortOrder) can be specified.
     * The default order for TIMECREATED is descending. The default order for DISPLAYNAME is ascending.
     * The DISPLAYNAME sort order is case sensitive.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListTargetDatabasesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * A filter to return only resources that match the specified compartment OCID.
         */
        private String compartmentId = null;

        /**
         * A filter to return only resources that match the specified compartment OCID.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return the target databases that are associated to the resource id passed in as a parameter value.
         */
        private String associatedResourceId = null;

        /**
         * A filter to return the target databases that are associated to the resource id passed in as a parameter value.
         * @param associatedResourceId the value to set
         * @return this builder instance
         */
        public Builder associatedResourceId(String associatedResourceId) {
            this.associatedResourceId = associatedResourceId;
            return this;
        }

        /**
         * A filter to return the target database that matches the specified OCID.
         */
        private String targetDatabaseId = null;

        /**
         * A filter to return the target database that matches the specified OCID.
         * @param targetDatabaseId the value to set
         * @return this builder instance
         */
        public Builder targetDatabaseId(String targetDatabaseId) {
            this.targetDatabaseId = targetDatabaseId;
            return this;
        }

        /**
         * A filter to return only resources that match the specified display name.
         *
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the specified display name.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * A filter to return only target databases that match the specified lifecycle state.
         */
        private com.oracle.bmc.datasafe.model.TargetDatabaseLifecycleState lifecycleState = null;

        /**
         * A filter to return only target databases that match the specified lifecycle state.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.datasafe.model.TargetDatabaseLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * A filter to return only target databases that match the specified database type.
         */
        private com.oracle.bmc.datasafe.model.DatabaseType databaseType = null;

        /**
         * A filter to return only target databases that match the specified database type.
         * @param databaseType the value to set
         * @return this builder instance
         */
        public Builder databaseType(com.oracle.bmc.datasafe.model.DatabaseType databaseType) {
            this.databaseType = databaseType;
            return this;
        }

        /**
         * A filter to return only target databases that match the specified infrastructure type.
         */
        private com.oracle.bmc.datasafe.model.InfrastructureType infrastructureType = null;

        /**
         * A filter to return only target databases that match the specified infrastructure type.
         * @param infrastructureType the value to set
         * @return this builder instance
         */
        public Builder infrastructureType(
                com.oracle.bmc.datasafe.model.InfrastructureType infrastructureType) {
            this.infrastructureType = infrastructureType;
            return this;
        }

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Default is false.
         * When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel' setting.
         *
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * Default is false.
         * When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel' setting.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED.
         * Setting this to ACCESSIBLE returns only those compartments for which the
         * user has INSPECT permissions directly or indirectly (permissions can be on a
         * resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
         *
         */
        private AccessLevel accessLevel = null;

        /**
         * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED.
         * Setting this to ACCESSIBLE returns only those compartments for which the
         * user has INSPECT permissions directly or indirectly (permissions can be on a
         * resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
         *
         * @param accessLevel the value to set
         * @return this builder instance
         */
        public Builder accessLevel(AccessLevel accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        /**
         * The sort order to use, either ascending (ASC) or descending (DESC).
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending (ASC) or descending (DESC).
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field used for sorting. Only one sorting order (sortOrder) can be specified.
         * The default order for TIMECREATED is descending. The default order for DISPLAYNAME is ascending.
         * The DISPLAYNAME sort order is case sensitive.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field used for sorting. Only one sorting order (sortOrder) can be specified.
         * The default order for TIMECREATED is descending. The default order for DISPLAYNAME is ascending.
         * The DISPLAYNAME sort order is case sensitive.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(ListTargetDatabasesRequest o) {
            compartmentId(o.getCompartmentId());
            associatedResourceId(o.getAssociatedResourceId());
            targetDatabaseId(o.getTargetDatabaseId());
            displayName(o.getDisplayName());
            lifecycleState(o.getLifecycleState());
            databaseType(o.getDatabaseType());
            infrastructureType(o.getInfrastructureType());
            limit(o.getLimit());
            page(o.getPage());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListTargetDatabasesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListTargetDatabasesRequest
         */
        public ListTargetDatabasesRequest build() {
            ListTargetDatabasesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListTargetDatabasesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListTargetDatabasesRequest
         */
        public ListTargetDatabasesRequest buildWithoutInvocationCallback() {
            ListTargetDatabasesRequest request = new ListTargetDatabasesRequest();
            request.compartmentId = compartmentId;
            request.associatedResourceId = associatedResourceId;
            request.targetDatabaseId = targetDatabaseId;
            request.displayName = displayName;
            request.lifecycleState = lifecycleState;
            request.databaseType = databaseType;
            request.infrastructureType = infrastructureType;
            request.limit = limit;
            request.page = page;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListTargetDatabasesRequest(compartmentId, associatedResourceId, targetDatabaseId, displayName, lifecycleState, databaseType, infrastructureType, limit, page, compartmentIdInSubtree, accessLevel, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .associatedResourceId(associatedResourceId)
                .targetDatabaseId(targetDatabaseId)
                .displayName(displayName)
                .lifecycleState(lifecycleState)
                .databaseType(databaseType)
                .infrastructureType(infrastructureType)
                .limit(limit)
                .page(page)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",associatedResourceId=").append(String.valueOf(this.associatedResourceId));
        sb.append(",targetDatabaseId=").append(String.valueOf(this.targetDatabaseId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",databaseType=").append(String.valueOf(this.databaseType));
        sb.append(",infrastructureType=").append(String.valueOf(this.infrastructureType));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
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
        if (!(o instanceof ListTargetDatabasesRequest)) {
            return false;
        }

        ListTargetDatabasesRequest other = (ListTargetDatabasesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.associatedResourceId, other.associatedResourceId)
                && java.util.Objects.equals(this.targetDatabaseId, other.targetDatabaseId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.infrastructureType, other.infrastructureType)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedResourceId == null
                                ? 43
                                : this.associatedResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDatabaseId == null ? 43 : this.targetDatabaseId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureType == null
                                ? 43
                                : this.infrastructureType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

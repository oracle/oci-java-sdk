/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListDataSafePrivateEndpointsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDataSafePrivateEndpointsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListDataSafePrivateEndpointsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * A filter to return only resources that match the specified VCN OCID.
     */
    private String vcnId;

    /**
     * A filter to return only resources that match the specified VCN OCID.
     */
    public String getVcnId() {
        return vcnId;
    }
    /**
     * A filter to return only resources that match the specified lifecycle state.
     */
    private com.oracle.bmc.datasafe.model.LifecycleState lifecycleState;

    /**
     * A filter to return only resources that match the specified lifecycle state.
     */
    public com.oracle.bmc.datasafe.model.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDataSafePrivateEndpointsRequest, java.lang.Void> {
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
         * A filter to return only resources that match the specified VCN OCID.
         */
        private String vcnId = null;

        /**
         * A filter to return only resources that match the specified VCN OCID.
         * @param vcnId the value to set
         * @return this builder instance
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            return this;
        }

        /**
         * A filter to return only resources that match the specified lifecycle state.
         */
        private com.oracle.bmc.datasafe.model.LifecycleState lifecycleState = null;

        /**
         * A filter to return only resources that match the specified lifecycle state.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(com.oracle.bmc.datasafe.model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(ListDataSafePrivateEndpointsRequest o) {
            compartmentId(o.getCompartmentId());
            displayName(o.getDisplayName());
            vcnId(o.getVcnId());
            lifecycleState(o.getLifecycleState());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDataSafePrivateEndpointsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListDataSafePrivateEndpointsRequest
         */
        public ListDataSafePrivateEndpointsRequest build() {
            ListDataSafePrivateEndpointsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDataSafePrivateEndpointsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDataSafePrivateEndpointsRequest
         */
        public ListDataSafePrivateEndpointsRequest buildWithoutInvocationCallback() {
            ListDataSafePrivateEndpointsRequest request = new ListDataSafePrivateEndpointsRequest();
            request.compartmentId = compartmentId;
            request.displayName = displayName;
            request.vcnId = vcnId;
            request.lifecycleState = lifecycleState;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            return request;
            // new ListDataSafePrivateEndpointsRequest(compartmentId, displayName, vcnId, lifecycleState, limit, page, sortOrder, sortBy, opcRequestId, compartmentIdInSubtree, accessLevel);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .displayName(displayName)
                .vcnId(vcnId)
                .lifecycleState(lifecycleState)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel);
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
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",vcnId=").append(String.valueOf(this.vcnId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDataSafePrivateEndpointsRequest)) {
            return false;
        }

        ListDataSafePrivateEndpointsRequest other = (ListDataSafePrivateEndpointsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        return result;
    }
}

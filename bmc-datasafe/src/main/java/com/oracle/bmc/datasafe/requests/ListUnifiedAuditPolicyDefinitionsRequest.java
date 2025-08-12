/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListUnifiedAuditPolicyDefinitionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListUnifiedAuditPolicyDefinitionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListUnifiedAuditPolicyDefinitionsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** A filter to return only resources that match the specified compartment OCID. */
    private String compartmentId;

    /** A filter to return only resources that match the specified compartment OCID. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The current state of the unified audit policy definition. */
    private com.oracle.bmc.datasafe.model.UnifiedAuditPolicyDefinitionLifecycleState lifecycleState;

    /** The current state of the unified audit policy definition. */
    public com.oracle.bmc.datasafe.model.UnifiedAuditPolicyDefinitionLifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /**
     * An optional filter to return only resources that match the specified OCID of the unified
     * audit policy definition resource.
     */
    private String unifiedAuditPolicyDefinitionId;

    /**
     * An optional filter to return only resources that match the specified OCID of the unified
     * audit policy definition resource.
     */
    public String getUnifiedAuditPolicyDefinitionId() {
        return unifiedAuditPolicyDefinitionId;
    }
    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE
     * returns only those compartments for which the user has INSPECT permissions directly or
     * indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED
     * permissions are checked and no partial results are displayed.
     */
    private AccessLevel accessLevel;

    /**
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE
     * returns only those compartments for which the user has INSPECT permissions directly or
     * indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED
     * permissions are checked and no partial results are displayed.
     */
    public enum AccessLevel implements com.oracle.bmc.http.internal.BmcEnum {
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
     * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to ACCESSIBLE
     * returns only those compartments for which the user has INSPECT permissions directly or
     * indirectly (permissions can be on a resource in a subcompartment). When set to RESTRICTED
     * permissions are checked and no partial results are displayed.
     */
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
    /** A filter to return only resources that match the specified display name. */
    private String displayName;

    /** A filter to return only resources that match the specified display name. */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * A boolean flag indicating to list seeded unified audit policy definitions. Set this parameter
     * to get list of seeded unified audit policy definitions.
     */
    private Boolean isSeeded;

    /**
     * A boolean flag indicating to list seeded unified audit policy definitions. Set this parameter
     * to get list of seeded unified audit policy definitions.
     */
    public Boolean getIsSeeded() {
        return isSeeded;
    }
    /** The category to which the unified audit policy definition belongs to. */
    private com.oracle.bmc.datasafe.model.UnifiedAuditPolicyDefinition.AuditPolicyCategory
            unifiedAuditPolicyCategory;

    /** The category to which the unified audit policy definition belongs to. */
    public com.oracle.bmc.datasafe.model.UnifiedAuditPolicyDefinition.AuditPolicyCategory
            getUnifiedAuditPolicyCategory() {
        return unifiedAuditPolicyCategory;
    }
    /** The name of the unified audit policy. */
    private String unifiedAuditPolicyName;

    /** The name of the unified audit policy. */
    public String getUnifiedAuditPolicyName() {
        return unifiedAuditPolicyName;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all
     * compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel'
     * setting.
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all
     * compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel'
     * setting.
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /** The sort order to use, either ascending (ASC) or descending (DESC). */
    private SortOrder sortOrder;

    /** The sort order to use, either ascending (ASC) or descending (DESC). */
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

    /** The sort order to use, either ascending (ASC) or descending (DESC). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field used for sorting. Only one sorting order (sortOrder) can be specified. The default
     * order for TIMECREATED is descending. The default order for DISPLAYNAME is ascending. The
     * DISPLAYNAME sort order is case sensitive.
     */
    private SortBy sortBy;

    /**
     * The field used for sorting. Only one sorting order (sortOrder) can be specified. The default
     * order for TIMECREATED is descending. The default order for DISPLAYNAME is ascending. The
     * DISPLAYNAME sort order is case sensitive.
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
     * The field used for sorting. Only one sorting order (sortOrder) can be specified. The default
     * order for TIMECREATED is descending. The default order for DISPLAYNAME is ascending. The
     * DISPLAYNAME sort order is case sensitive.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListUnifiedAuditPolicyDefinitionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** A filter to return only resources that match the specified compartment OCID. */
        private String compartmentId = null;

        /**
         * A filter to return only resources that match the specified compartment OCID.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The current state of the unified audit policy definition. */
        private com.oracle.bmc.datasafe.model.UnifiedAuditPolicyDefinitionLifecycleState
                lifecycleState = null;

        /**
         * The current state of the unified audit policy definition.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.datasafe.model.UnifiedAuditPolicyDefinitionLifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * An optional filter to return only resources that match the specified OCID of the unified
         * audit policy definition resource.
         */
        private String unifiedAuditPolicyDefinitionId = null;

        /**
         * An optional filter to return only resources that match the specified OCID of the unified
         * audit policy definition resource.
         *
         * @param unifiedAuditPolicyDefinitionId the value to set
         * @return this builder instance
         */
        public Builder unifiedAuditPolicyDefinitionId(String unifiedAuditPolicyDefinitionId) {
            this.unifiedAuditPolicyDefinitionId = unifiedAuditPolicyDefinitionId;
            return this;
        }

        /**
         * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to
         * ACCESSIBLE returns only those compartments for which the user has INSPECT permissions
         * directly or indirectly (permissions can be on a resource in a subcompartment). When set
         * to RESTRICTED permissions are checked and no partial results are displayed.
         */
        private AccessLevel accessLevel = null;

        /**
         * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED. Setting this to
         * ACCESSIBLE returns only those compartments for which the user has INSPECT permissions
         * directly or indirectly (permissions can be on a resource in a subcompartment). When set
         * to RESTRICTED permissions are checked and no partial results are displayed.
         *
         * @param accessLevel the value to set
         * @return this builder instance
         */
        public Builder accessLevel(AccessLevel accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        /** A filter to return only resources that match the specified display name. */
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
         * A boolean flag indicating to list seeded unified audit policy definitions. Set this
         * parameter to get list of seeded unified audit policy definitions.
         */
        private Boolean isSeeded = null;

        /**
         * A boolean flag indicating to list seeded unified audit policy definitions. Set this
         * parameter to get list of seeded unified audit policy definitions.
         *
         * @param isSeeded the value to set
         * @return this builder instance
         */
        public Builder isSeeded(Boolean isSeeded) {
            this.isSeeded = isSeeded;
            return this;
        }

        /** The category to which the unified audit policy definition belongs to. */
        private com.oracle.bmc.datasafe.model.UnifiedAuditPolicyDefinition.AuditPolicyCategory
                unifiedAuditPolicyCategory = null;

        /**
         * The category to which the unified audit policy definition belongs to.
         *
         * @param unifiedAuditPolicyCategory the value to set
         * @return this builder instance
         */
        public Builder unifiedAuditPolicyCategory(
                com.oracle.bmc.datasafe.model.UnifiedAuditPolicyDefinition.AuditPolicyCategory
                        unifiedAuditPolicyCategory) {
            this.unifiedAuditPolicyCategory = unifiedAuditPolicyCategory;
            return this;
        }

        /** The name of the unified audit policy. */
        private String unifiedAuditPolicyName = null;

        /**
         * The name of the unified audit policy.
         *
         * @param unifiedAuditPolicyName the value to set
         * @return this builder instance
         */
        public Builder unifiedAuditPolicyName(String unifiedAuditPolicyName) {
            this.unifiedAuditPolicyName = unifiedAuditPolicyName;
            return this;
        }

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The page token representing the page at which to start retrieving
         * results. It is usually retrieved from a previous "List" call. For details about how
         * pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving
         * results. It is usually retrieved from a previous "List" call. For details about how
         * pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Default is false. When set to true, the hierarchy of compartments is traversed and all
         * compartments and subcompartments in the tenancy are returned. Depends on the
         * 'accessLevel' setting.
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * Default is false. When set to true, the hierarchy of compartments is traversed and all
         * compartments and subcompartments in the tenancy are returned. Depends on the
         * 'accessLevel' setting.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /** The sort order to use, either ascending (ASC) or descending (DESC). */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending (ASC) or descending (DESC).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field used for sorting. Only one sorting order (sortOrder) can be specified. The
         * default order for TIMECREATED is descending. The default order for DISPLAYNAME is
         * ascending. The DISPLAYNAME sort order is case sensitive.
         */
        private SortBy sortBy = null;

        /**
         * The field used for sorting. Only one sorting order (sortOrder) can be specified. The
         * default order for TIMECREATED is descending. The default order for DISPLAYNAME is
         * ascending. The DISPLAYNAME sort order is case sensitive.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListUnifiedAuditPolicyDefinitionsRequest o) {
            compartmentId(o.getCompartmentId());
            lifecycleState(o.getLifecycleState());
            unifiedAuditPolicyDefinitionId(o.getUnifiedAuditPolicyDefinitionId());
            accessLevel(o.getAccessLevel());
            displayName(o.getDisplayName());
            isSeeded(o.getIsSeeded());
            unifiedAuditPolicyCategory(o.getUnifiedAuditPolicyCategory());
            unifiedAuditPolicyName(o.getUnifiedAuditPolicyName());
            limit(o.getLimit());
            page(o.getPage());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListUnifiedAuditPolicyDefinitionsRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListUnifiedAuditPolicyDefinitionsRequest
         */
        public ListUnifiedAuditPolicyDefinitionsRequest build() {
            ListUnifiedAuditPolicyDefinitionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListUnifiedAuditPolicyDefinitionsRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListUnifiedAuditPolicyDefinitionsRequest
         */
        public ListUnifiedAuditPolicyDefinitionsRequest buildWithoutInvocationCallback() {
            ListUnifiedAuditPolicyDefinitionsRequest request =
                    new ListUnifiedAuditPolicyDefinitionsRequest();
            request.compartmentId = compartmentId;
            request.lifecycleState = lifecycleState;
            request.unifiedAuditPolicyDefinitionId = unifiedAuditPolicyDefinitionId;
            request.accessLevel = accessLevel;
            request.displayName = displayName;
            request.isSeeded = isSeeded;
            request.unifiedAuditPolicyCategory = unifiedAuditPolicyCategory;
            request.unifiedAuditPolicyName = unifiedAuditPolicyName;
            request.limit = limit;
            request.page = page;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListUnifiedAuditPolicyDefinitionsRequest(compartmentId, lifecycleState,
            // unifiedAuditPolicyDefinitionId, accessLevel, displayName, isSeeded,
            // unifiedAuditPolicyCategory, unifiedAuditPolicyName, limit, page,
            // compartmentIdInSubtree, sortOrder, sortBy, opcRequestId);
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
                .lifecycleState(lifecycleState)
                .unifiedAuditPolicyDefinitionId(unifiedAuditPolicyDefinitionId)
                .accessLevel(accessLevel)
                .displayName(displayName)
                .isSeeded(isSeeded)
                .unifiedAuditPolicyCategory(unifiedAuditPolicyCategory)
                .unifiedAuditPolicyName(unifiedAuditPolicyName)
                .limit(limit)
                .page(page)
                .compartmentIdInSubtree(compartmentIdInSubtree)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",unifiedAuditPolicyDefinitionId=")
                .append(String.valueOf(this.unifiedAuditPolicyDefinitionId));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",isSeeded=").append(String.valueOf(this.isSeeded));
        sb.append(",unifiedAuditPolicyCategory=")
                .append(String.valueOf(this.unifiedAuditPolicyCategory));
        sb.append(",unifiedAuditPolicyName=").append(String.valueOf(this.unifiedAuditPolicyName));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
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
        if (!(o instanceof ListUnifiedAuditPolicyDefinitionsRequest)) {
            return false;
        }

        ListUnifiedAuditPolicyDefinitionsRequest other =
                (ListUnifiedAuditPolicyDefinitionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.unifiedAuditPolicyDefinitionId, other.unifiedAuditPolicyDefinitionId)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isSeeded, other.isSeeded)
                && java.util.Objects.equals(
                        this.unifiedAuditPolicyCategory, other.unifiedAuditPolicyCategory)
                && java.util.Objects.equals(
                        this.unifiedAuditPolicyName, other.unifiedAuditPolicyName)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
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
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.unifiedAuditPolicyDefinitionId == null
                                ? 43
                                : this.unifiedAuditPolicyDefinitionId.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.isSeeded == null ? 43 : this.isSeeded.hashCode());
        result =
                (result * PRIME)
                        + (this.unifiedAuditPolicyCategory == null
                                ? 43
                                : this.unifiedAuditPolicyCategory.hashCode());
        result =
                (result * PRIME)
                        + (this.unifiedAuditPolicyName == null
                                ? 43
                                : this.unifiedAuditPolicyName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

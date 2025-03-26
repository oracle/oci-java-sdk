/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListAuditProfilesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListAuditProfilesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListAuditProfilesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * A optional filter to return only resources that match the specified id.
     */
    private String auditProfileId;

    /**
     * A optional filter to return only resources that match the specified id.
     */
    public String getAuditProfileId() {
        return auditProfileId;
    }
    /**
     * A filter to return only items related to a specific target OCID.
     */
    private String targetId;

    /**
     * A filter to return only items related to a specific target OCID.
     */
    public String getTargetId() {
        return targetId;
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
     * A optional filter to return only resources that match the specified lifecycle state.
     */
    private com.oracle.bmc.datasafe.model.AuditProfileLifecycleState lifecycleState;

    /**
     * A optional filter to return only resources that match the specified lifecycle state.
     */
    public com.oracle.bmc.datasafe.model.AuditProfileLifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A optional filter to return only resources that match the specified retention configured value.
     */
    private Boolean isOverrideGlobalRetentionSetting;

    /**
     * A optional filter to return only resources that match the specified retention configured value.
     */
    public Boolean getIsOverrideGlobalRetentionSetting() {
        return isOverrideGlobalRetentionSetting;
    }
    /**
     * Indicates if you want to continue audit record collection beyond the free limit
     * of one million audit records per month per target database, incurring additional charges.
     * The default value is inherited from the global settings. You can change at the global level
     * or at the target level.
     *
     */
    private Boolean isPaidUsageEnabled;

    /**
     * Indicates if you want to continue audit record collection beyond the free limit
     * of one million audit records per month per target database, incurring additional charges.
     * The default value is inherited from the global settings. You can change at the global level
     * or at the target level.
     *
     */
    public Boolean getIsPaidUsageEnabled() {
        return isPaidUsageEnabled;
    }
    /**
     * A filter to return only items that have count of audit records collected greater than or equal to the specified value.
     */
    private Long auditCollectedVolumeGreaterThanOrEqualTo;

    /**
     * A filter to return only items that have count of audit records collected greater than or equal to the specified value.
     */
    public Long getAuditCollectedVolumeGreaterThanOrEqualTo() {
        return auditCollectedVolumeGreaterThanOrEqualTo;
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
                    ListAuditProfilesRequest, java.lang.Void> {
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
         * A optional filter to return only resources that match the specified id.
         */
        private String auditProfileId = null;

        /**
         * A optional filter to return only resources that match the specified id.
         * @param auditProfileId the value to set
         * @return this builder instance
         */
        public Builder auditProfileId(String auditProfileId) {
            this.auditProfileId = auditProfileId;
            return this;
        }

        /**
         * A filter to return only items related to a specific target OCID.
         */
        private String targetId = null;

        /**
         * A filter to return only items related to a specific target OCID.
         * @param targetId the value to set
         * @return this builder instance
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
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
         * A optional filter to return only resources that match the specified lifecycle state.
         */
        private com.oracle.bmc.datasafe.model.AuditProfileLifecycleState lifecycleState = null;

        /**
         * A optional filter to return only resources that match the specified lifecycle state.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.datasafe.model.AuditProfileLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * A optional filter to return only resources that match the specified retention configured value.
         */
        private Boolean isOverrideGlobalRetentionSetting = null;

        /**
         * A optional filter to return only resources that match the specified retention configured value.
         * @param isOverrideGlobalRetentionSetting the value to set
         * @return this builder instance
         */
        public Builder isOverrideGlobalRetentionSetting(Boolean isOverrideGlobalRetentionSetting) {
            this.isOverrideGlobalRetentionSetting = isOverrideGlobalRetentionSetting;
            return this;
        }

        /**
         * Indicates if you want to continue audit record collection beyond the free limit
         * of one million audit records per month per target database, incurring additional charges.
         * The default value is inherited from the global settings. You can change at the global level
         * or at the target level.
         *
         */
        private Boolean isPaidUsageEnabled = null;

        /**
         * Indicates if you want to continue audit record collection beyond the free limit
         * of one million audit records per month per target database, incurring additional charges.
         * The default value is inherited from the global settings. You can change at the global level
         * or at the target level.
         *
         * @param isPaidUsageEnabled the value to set
         * @return this builder instance
         */
        public Builder isPaidUsageEnabled(Boolean isPaidUsageEnabled) {
            this.isPaidUsageEnabled = isPaidUsageEnabled;
            return this;
        }

        /**
         * A filter to return only items that have count of audit records collected greater than or equal to the specified value.
         */
        private Long auditCollectedVolumeGreaterThanOrEqualTo = null;

        /**
         * A filter to return only items that have count of audit records collected greater than or equal to the specified value.
         * @param auditCollectedVolumeGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder auditCollectedVolumeGreaterThanOrEqualTo(
                Long auditCollectedVolumeGreaterThanOrEqualTo) {
            this.auditCollectedVolumeGreaterThanOrEqualTo =
                    auditCollectedVolumeGreaterThanOrEqualTo;
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
        public Builder copy(ListAuditProfilesRequest o) {
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            auditProfileId(o.getAuditProfileId());
            targetId(o.getTargetId());
            displayName(o.getDisplayName());
            limit(o.getLimit());
            page(o.getPage());
            lifecycleState(o.getLifecycleState());
            isOverrideGlobalRetentionSetting(o.getIsOverrideGlobalRetentionSetting());
            isPaidUsageEnabled(o.getIsPaidUsageEnabled());
            auditCollectedVolumeGreaterThanOrEqualTo(
                    o.getAuditCollectedVolumeGreaterThanOrEqualTo());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAuditProfilesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListAuditProfilesRequest
         */
        public ListAuditProfilesRequest build() {
            ListAuditProfilesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAuditProfilesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAuditProfilesRequest
         */
        public ListAuditProfilesRequest buildWithoutInvocationCallback() {
            ListAuditProfilesRequest request = new ListAuditProfilesRequest();
            request.compartmentId = compartmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.auditProfileId = auditProfileId;
            request.targetId = targetId;
            request.displayName = displayName;
            request.limit = limit;
            request.page = page;
            request.lifecycleState = lifecycleState;
            request.isOverrideGlobalRetentionSetting = isOverrideGlobalRetentionSetting;
            request.isPaidUsageEnabled = isPaidUsageEnabled;
            request.auditCollectedVolumeGreaterThanOrEqualTo =
                    auditCollectedVolumeGreaterThanOrEqualTo;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListAuditProfilesRequest(compartmentId, compartmentIdInSubtree, accessLevel, auditProfileId, targetId, displayName, limit, page, lifecycleState, isOverrideGlobalRetentionSetting, isPaidUsageEnabled, auditCollectedVolumeGreaterThanOrEqualTo, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel)
                .auditProfileId(auditProfileId)
                .targetId(targetId)
                .displayName(displayName)
                .limit(limit)
                .page(page)
                .lifecycleState(lifecycleState)
                .isOverrideGlobalRetentionSetting(isOverrideGlobalRetentionSetting)
                .isPaidUsageEnabled(isPaidUsageEnabled)
                .auditCollectedVolumeGreaterThanOrEqualTo(auditCollectedVolumeGreaterThanOrEqualTo)
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
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(",auditProfileId=").append(String.valueOf(this.auditProfileId));
        sb.append(",targetId=").append(String.valueOf(this.targetId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",isOverrideGlobalRetentionSetting=")
                .append(String.valueOf(this.isOverrideGlobalRetentionSetting));
        sb.append(",isPaidUsageEnabled=").append(String.valueOf(this.isPaidUsageEnabled));
        sb.append(",auditCollectedVolumeGreaterThanOrEqualTo=")
                .append(String.valueOf(this.auditCollectedVolumeGreaterThanOrEqualTo));
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
        if (!(o instanceof ListAuditProfilesRequest)) {
            return false;
        }

        ListAuditProfilesRequest other = (ListAuditProfilesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(this.auditProfileId, other.auditProfileId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.isOverrideGlobalRetentionSetting,
                        other.isOverrideGlobalRetentionSetting)
                && java.util.Objects.equals(this.isPaidUsageEnabled, other.isPaidUsageEnabled)
                && java.util.Objects.equals(
                        this.auditCollectedVolumeGreaterThanOrEqualTo,
                        other.auditCollectedVolumeGreaterThanOrEqualTo)
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
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.auditProfileId == null ? 43 : this.auditProfileId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.isOverrideGlobalRetentionSetting == null
                                ? 43
                                : this.isOverrideGlobalRetentionSetting.hashCode());
        result =
                (result * PRIME)
                        + (this.isPaidUsageEnabled == null
                                ? 43
                                : this.isPaidUsageEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.auditCollectedVolumeGreaterThanOrEqualTo == null
                                ? 43
                                : this.auditCollectedVolumeGreaterThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

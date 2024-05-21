/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListGrantsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListGrantsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListGrantsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the user assessment.
     */
    private String userAssessmentId;

    /**
     * The OCID of the user assessment.
     */
    public String getUserAssessmentId() {
        return userAssessmentId;
    }
    /**
     * The unique user key. This is a system-generated identifier. ListUsers gets the user key for a user.
     */
    private String userKey;

    /**
     * The unique user key. This is a system-generated identifier. ListUsers gets the user key for a user.
     */
    public String getUserKey() {
        return userKey;
    }
    /**
     * A filter to return only items that match the specified user grant key.
     */
    private String grantKey;

    /**
     * A filter to return only items that match the specified user grant key.
     */
    public String getGrantKey() {
        return grantKey;
    }
    /**
     * A filter to return only items that match the specified user grant name.
     */
    private String grantName;

    /**
     * A filter to return only items that match the specified user grant name.
     */
    public String getGrantName() {
        return grantName;
    }
    /**
     * A filter to return only items that match the specified privilege grant type.
     */
    private String privilegeType;

    /**
     * A filter to return only items that match the specified privilege grant type.
     */
    public String getPrivilegeType() {
        return privilegeType;
    }
    /**
     * A filter to return only items that match the specified user privilege category.
     */
    private String privilegeCategory;

    /**
     * A filter to return only items that match the specified user privilege category.
     */
    public String getPrivilegeCategory() {
        return privilegeCategory;
    }
    /**
     * A filter to return only items that match the specified user grant depth level.
     */
    private Integer depthLevel;

    /**
     * A filter to return only items that match the specified user grant depth level.
     */
    public Integer getDepthLevel() {
        return depthLevel;
    }
    /**
     * A filter to return only items that are at a level greater than or equal to the specified user grant depth level.
     */
    private Integer depthLevelGreaterThanOrEqualTo;

    /**
     * A filter to return only items that are at a level greater than or equal to the specified user grant depth level.
     */
    public Integer getDepthLevelGreaterThanOrEqualTo() {
        return depthLevelGreaterThanOrEqualTo;
    }
    /**
     * A filter to return only items that are at a level less than the specified user grant depth level.
     */
    private Integer depthLevelLessThan;

    /**
     * A filter to return only items that are at a level less than the specified user grant depth level.
     */
    public Integer getDepthLevelLessThan() {
        return depthLevelLessThan;
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
     * The field to sort by. You can specify only one sort order (sortOrder). The default order for grantName is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sort order (sortOrder). The default order for grantName is ascending.
     *
     **/
    public enum SortBy {
        GrantName("grantName"),
        GrantType("grantType"),
        PrivilegeCategory("privilegeCategory"),
        DepthLevel("depthLevel"),
        Key("key"),
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
     * The field to sort by. You can specify only one sort order (sortOrder). The default order for grantName is ascending.
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
                    ListGrantsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the user assessment.
         */
        private String userAssessmentId = null;

        /**
         * The OCID of the user assessment.
         * @param userAssessmentId the value to set
         * @return this builder instance
         */
        public Builder userAssessmentId(String userAssessmentId) {
            this.userAssessmentId = userAssessmentId;
            return this;
        }

        /**
         * The unique user key. This is a system-generated identifier. ListUsers gets the user key for a user.
         */
        private String userKey = null;

        /**
         * The unique user key. This is a system-generated identifier. ListUsers gets the user key for a user.
         * @param userKey the value to set
         * @return this builder instance
         */
        public Builder userKey(String userKey) {
            this.userKey = userKey;
            return this;
        }

        /**
         * A filter to return only items that match the specified user grant key.
         */
        private String grantKey = null;

        /**
         * A filter to return only items that match the specified user grant key.
         * @param grantKey the value to set
         * @return this builder instance
         */
        public Builder grantKey(String grantKey) {
            this.grantKey = grantKey;
            return this;
        }

        /**
         * A filter to return only items that match the specified user grant name.
         */
        private String grantName = null;

        /**
         * A filter to return only items that match the specified user grant name.
         * @param grantName the value to set
         * @return this builder instance
         */
        public Builder grantName(String grantName) {
            this.grantName = grantName;
            return this;
        }

        /**
         * A filter to return only items that match the specified privilege grant type.
         */
        private String privilegeType = null;

        /**
         * A filter to return only items that match the specified privilege grant type.
         * @param privilegeType the value to set
         * @return this builder instance
         */
        public Builder privilegeType(String privilegeType) {
            this.privilegeType = privilegeType;
            return this;
        }

        /**
         * A filter to return only items that match the specified user privilege category.
         */
        private String privilegeCategory = null;

        /**
         * A filter to return only items that match the specified user privilege category.
         * @param privilegeCategory the value to set
         * @return this builder instance
         */
        public Builder privilegeCategory(String privilegeCategory) {
            this.privilegeCategory = privilegeCategory;
            return this;
        }

        /**
         * A filter to return only items that match the specified user grant depth level.
         */
        private Integer depthLevel = null;

        /**
         * A filter to return only items that match the specified user grant depth level.
         * @param depthLevel the value to set
         * @return this builder instance
         */
        public Builder depthLevel(Integer depthLevel) {
            this.depthLevel = depthLevel;
            return this;
        }

        /**
         * A filter to return only items that are at a level greater than or equal to the specified user grant depth level.
         */
        private Integer depthLevelGreaterThanOrEqualTo = null;

        /**
         * A filter to return only items that are at a level greater than or equal to the specified user grant depth level.
         * @param depthLevelGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder depthLevelGreaterThanOrEqualTo(Integer depthLevelGreaterThanOrEqualTo) {
            this.depthLevelGreaterThanOrEqualTo = depthLevelGreaterThanOrEqualTo;
            return this;
        }

        /**
         * A filter to return only items that are at a level less than the specified user grant depth level.
         */
        private Integer depthLevelLessThan = null;

        /**
         * A filter to return only items that are at a level less than the specified user grant depth level.
         * @param depthLevelLessThan the value to set
         * @return this builder instance
         */
        public Builder depthLevelLessThan(Integer depthLevelLessThan) {
            this.depthLevelLessThan = depthLevelLessThan;
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
         * The field to sort by. You can specify only one sort order (sortOrder). The default order for grantName is ascending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can specify only one sort order (sortOrder). The default order for grantName is ascending.
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
        public Builder copy(ListGrantsRequest o) {
            userAssessmentId(o.getUserAssessmentId());
            userKey(o.getUserKey());
            grantKey(o.getGrantKey());
            grantName(o.getGrantName());
            privilegeType(o.getPrivilegeType());
            privilegeCategory(o.getPrivilegeCategory());
            depthLevel(o.getDepthLevel());
            depthLevelGreaterThanOrEqualTo(o.getDepthLevelGreaterThanOrEqualTo());
            depthLevelLessThan(o.getDepthLevelLessThan());
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
         * Build the instance of ListGrantsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListGrantsRequest
         */
        public ListGrantsRequest build() {
            ListGrantsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListGrantsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListGrantsRequest
         */
        public ListGrantsRequest buildWithoutInvocationCallback() {
            ListGrantsRequest request = new ListGrantsRequest();
            request.userAssessmentId = userAssessmentId;
            request.userKey = userKey;
            request.grantKey = grantKey;
            request.grantName = grantName;
            request.privilegeType = privilegeType;
            request.privilegeCategory = privilegeCategory;
            request.depthLevel = depthLevel;
            request.depthLevelGreaterThanOrEqualTo = depthLevelGreaterThanOrEqualTo;
            request.depthLevelLessThan = depthLevelLessThan;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListGrantsRequest(userAssessmentId, userKey, grantKey, grantName, privilegeType, privilegeCategory, depthLevel, depthLevelGreaterThanOrEqualTo, depthLevelLessThan, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .userAssessmentId(userAssessmentId)
                .userKey(userKey)
                .grantKey(grantKey)
                .grantName(grantName)
                .privilegeType(privilegeType)
                .privilegeCategory(privilegeCategory)
                .depthLevel(depthLevel)
                .depthLevelGreaterThanOrEqualTo(depthLevelGreaterThanOrEqualTo)
                .depthLevelLessThan(depthLevelLessThan)
                .limit(limit)
                .page(page)
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
        sb.append(",userAssessmentId=").append(String.valueOf(this.userAssessmentId));
        sb.append(",userKey=").append(String.valueOf(this.userKey));
        sb.append(",grantKey=").append(String.valueOf(this.grantKey));
        sb.append(",grantName=").append(String.valueOf(this.grantName));
        sb.append(",privilegeType=").append(String.valueOf(this.privilegeType));
        sb.append(",privilegeCategory=").append(String.valueOf(this.privilegeCategory));
        sb.append(",depthLevel=").append(String.valueOf(this.depthLevel));
        sb.append(",depthLevelGreaterThanOrEqualTo=")
                .append(String.valueOf(this.depthLevelGreaterThanOrEqualTo));
        sb.append(",depthLevelLessThan=").append(String.valueOf(this.depthLevelLessThan));
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
        if (!(o instanceof ListGrantsRequest)) {
            return false;
        }

        ListGrantsRequest other = (ListGrantsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.userAssessmentId, other.userAssessmentId)
                && java.util.Objects.equals(this.userKey, other.userKey)
                && java.util.Objects.equals(this.grantKey, other.grantKey)
                && java.util.Objects.equals(this.grantName, other.grantName)
                && java.util.Objects.equals(this.privilegeType, other.privilegeType)
                && java.util.Objects.equals(this.privilegeCategory, other.privilegeCategory)
                && java.util.Objects.equals(this.depthLevel, other.depthLevel)
                && java.util.Objects.equals(
                        this.depthLevelGreaterThanOrEqualTo, other.depthLevelGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.depthLevelLessThan, other.depthLevelLessThan)
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
                        + (this.userAssessmentId == null ? 43 : this.userAssessmentId.hashCode());
        result = (result * PRIME) + (this.userKey == null ? 43 : this.userKey.hashCode());
        result = (result * PRIME) + (this.grantKey == null ? 43 : this.grantKey.hashCode());
        result = (result * PRIME) + (this.grantName == null ? 43 : this.grantName.hashCode());
        result =
                (result * PRIME)
                        + (this.privilegeType == null ? 43 : this.privilegeType.hashCode());
        result =
                (result * PRIME)
                        + (this.privilegeCategory == null ? 43 : this.privilegeCategory.hashCode());
        result = (result * PRIME) + (this.depthLevel == null ? 43 : this.depthLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.depthLevelGreaterThanOrEqualTo == null
                                ? 43
                                : this.depthLevelGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.depthLevelLessThan == null
                                ? 43
                                : this.depthLevelLessThan.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

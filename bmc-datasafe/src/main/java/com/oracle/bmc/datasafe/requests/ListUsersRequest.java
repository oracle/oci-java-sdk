/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListUsersExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListUsersRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListUsersRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the user assessment.
     */
    private String userAssessmentId;

    public String getUserAssessmentId() {
        return userAssessmentId;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * Default is false.
     * When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel' setting.
     *
     */
    private Boolean compartmentIdInSubtree;

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

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
    /**
     * A filter to return only items that match the specified user category.
     */
    private String userCategory;

    public String getUserCategory() {
        return userCategory;
    }
    /**
     * A filter to return only items that match the specified user key.
     */
    private String userKey;

    public String getUserKey() {
        return userKey;
    }
    /**
     * A filter to return only items that match the specified account status.
     */
    private String accountStatus;

    public String getAccountStatus() {
        return accountStatus;
    }
    /**
     * A filter to return only items that match the specified authentication type.
     */
    private String authenticationType;

    public String getAuthenticationType() {
        return authenticationType;
    }
    /**
     * A filter to return only items that match the specified user name.
     */
    private String userName;

    public String getUserName() {
        return userName;
    }
    /**
     * A filter to return only items related to a specific target OCID.
     */
    private String targetId;

    public String getTargetId() {
        return targetId;
    }
    /**
     * A filter to return users whose last login time in the database is greater than or equal to the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     **Example:** 2016-12-19T16:39:57.600Z
     *
     */
    private java.util.Date timeLastLoginGreaterThanOrEqualTo;

    public java.util.Date getTimeLastLoginGreaterThanOrEqualTo() {
        return timeLastLoginGreaterThanOrEqualTo;
    }
    /**
     * A filter to return users whose last login time in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * **Example:** 2016-12-19T16:39:57.600Z
     *
     */
    private java.util.Date timeLastLoginLessThan;

    public java.util.Date getTimeLastLoginLessThan() {
        return timeLastLoginLessThan;
    }
    /**
     * A filter to return users whose creation time in the database is greater than or equal to the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * **Example:** 2016-12-19T16:39:57.600Z
     *
     */
    private java.util.Date timeUserCreatedGreaterThanOrEqualTo;

    public java.util.Date getTimeUserCreatedGreaterThanOrEqualTo() {
        return timeUserCreatedGreaterThanOrEqualTo;
    }
    /**
     * A filter to return users whose creation time in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * **Example:** 2016-12-19T16:39:57.600Z
     *
     */
    private java.util.Date timeUserCreatedLessThan;

    public java.util.Date getTimeUserCreatedLessThan() {
        return timeUserCreatedLessThan;
    }
    /**
     * A filter to return users whose last password change in the database is greater than or equal to the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     **Example:** 2016-12-19T16:39:57.600Z
     *
     */
    private java.util.Date timePasswordLastChangedGreaterThanOrEqualTo;

    public java.util.Date getTimePasswordLastChangedGreaterThanOrEqualTo() {
        return timePasswordLastChangedGreaterThanOrEqualTo;
    }
    /**
     * A filter to return users whose last password change in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     **Example:** 2016-12-19T16:39:57.600Z
     *
     */
    private java.util.Date timePasswordLastChangedLessThan;

    public java.util.Date getTimePasswordLastChangedLessThan() {
        return timePasswordLastChangedLessThan;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

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

    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. You can specify only one sort order (sortOrder). The default order for userName is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sort order (sortOrder). The default order for userName is ascending.
     *
     **/
    public enum SortBy {
        UserName("userName"),
        UserCategory("userCategory"),
        AccountStatus("accountStatus"),
        TimeLastLogin("timeLastLogin"),
        TargetId("targetId"),
        TimeUserCreated("timeUserCreated"),
        AuthenticationType("authenticationType"),
        TimePasswordChanged("timePasswordChanged"),
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

    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListUsersRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String userAssessmentId = null;

        /**
         * The OCID of the user assessment.
         * @return this builder instance
         */
        public Builder userAssessmentId(String userAssessmentId) {
            this.userAssessmentId = userAssessmentId;
            return this;
        }

        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private Boolean compartmentIdInSubtree = null;

        /**
         * Default is false.
         * When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel' setting.
         *
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        private AccessLevel accessLevel = null;

        /**
         * Valid values are RESTRICTED and ACCESSIBLE. Default is RESTRICTED.
         * Setting this to ACCESSIBLE returns only those compartments for which the
         * user has INSPECT permissions directly or indirectly (permissions can be on a
         * resource in a subcompartment). When set to RESTRICTED permissions are checked and no partial results are displayed.
         *
         * @return this builder instance
         */
        public Builder accessLevel(AccessLevel accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        private String userCategory = null;

        /**
         * A filter to return only items that match the specified user category.
         * @return this builder instance
         */
        public Builder userCategory(String userCategory) {
            this.userCategory = userCategory;
            return this;
        }

        private String userKey = null;

        /**
         * A filter to return only items that match the specified user key.
         * @return this builder instance
         */
        public Builder userKey(String userKey) {
            this.userKey = userKey;
            return this;
        }

        private String accountStatus = null;

        /**
         * A filter to return only items that match the specified account status.
         * @return this builder instance
         */
        public Builder accountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }

        private String authenticationType = null;

        /**
         * A filter to return only items that match the specified authentication type.
         * @return this builder instance
         */
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        private String userName = null;

        /**
         * A filter to return only items that match the specified user name.
         * @return this builder instance
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        private String targetId = null;

        /**
         * A filter to return only items related to a specific target OCID.
         * @return this builder instance
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        private java.util.Date timeLastLoginGreaterThanOrEqualTo = null;

        /**
         * A filter to return users whose last login time in the database is greater than or equal to the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         **Example:** 2016-12-19T16:39:57.600Z
         *
         * @return this builder instance
         */
        public Builder timeLastLoginGreaterThanOrEqualTo(
                java.util.Date timeLastLoginGreaterThanOrEqualTo) {
            this.timeLastLoginGreaterThanOrEqualTo = timeLastLoginGreaterThanOrEqualTo;
            return this;
        }

        private java.util.Date timeLastLoginLessThan = null;

        /**
         * A filter to return users whose last login time in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * **Example:** 2016-12-19T16:39:57.600Z
         *
         * @return this builder instance
         */
        public Builder timeLastLoginLessThan(java.util.Date timeLastLoginLessThan) {
            this.timeLastLoginLessThan = timeLastLoginLessThan;
            return this;
        }

        private java.util.Date timeUserCreatedGreaterThanOrEqualTo = null;

        /**
         * A filter to return users whose creation time in the database is greater than or equal to the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * **Example:** 2016-12-19T16:39:57.600Z
         *
         * @return this builder instance
         */
        public Builder timeUserCreatedGreaterThanOrEqualTo(
                java.util.Date timeUserCreatedGreaterThanOrEqualTo) {
            this.timeUserCreatedGreaterThanOrEqualTo = timeUserCreatedGreaterThanOrEqualTo;
            return this;
        }

        private java.util.Date timeUserCreatedLessThan = null;

        /**
         * A filter to return users whose creation time in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * **Example:** 2016-12-19T16:39:57.600Z
         *
         * @return this builder instance
         */
        public Builder timeUserCreatedLessThan(java.util.Date timeUserCreatedLessThan) {
            this.timeUserCreatedLessThan = timeUserCreatedLessThan;
            return this;
        }

        private java.util.Date timePasswordLastChangedGreaterThanOrEqualTo = null;

        /**
         * A filter to return users whose last password change in the database is greater than or equal to the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         **Example:** 2016-12-19T16:39:57.600Z
         *
         * @return this builder instance
         */
        public Builder timePasswordLastChangedGreaterThanOrEqualTo(
                java.util.Date timePasswordLastChangedGreaterThanOrEqualTo) {
            this.timePasswordLastChangedGreaterThanOrEqualTo =
                    timePasswordLastChangedGreaterThanOrEqualTo;
            return this;
        }

        private java.util.Date timePasswordLastChangedLessThan = null;

        /**
         * A filter to return users whose last password change in the database is less than the date and time specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * <p>
         **Example:** 2016-12-19T16:39:57.600Z
         *
         * @return this builder instance
         */
        public Builder timePasswordLastChangedLessThan(
                java.util.Date timePasswordLastChangedLessThan) {
            this.timePasswordLastChangedLessThan = timePasswordLastChangedLessThan;
            return this;
        }

        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending (ASC) or descending (DESC).
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        private SortBy sortBy = null;

        /**
         * The field to sort by. You can specify only one sort order (sortOrder). The default order for userName is ascending.
         *
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(ListUsersRequest o) {
            userAssessmentId(o.getUserAssessmentId());
            limit(o.getLimit());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            userCategory(o.getUserCategory());
            userKey(o.getUserKey());
            accountStatus(o.getAccountStatus());
            authenticationType(o.getAuthenticationType());
            userName(o.getUserName());
            targetId(o.getTargetId());
            timeLastLoginGreaterThanOrEqualTo(o.getTimeLastLoginGreaterThanOrEqualTo());
            timeLastLoginLessThan(o.getTimeLastLoginLessThan());
            timeUserCreatedGreaterThanOrEqualTo(o.getTimeUserCreatedGreaterThanOrEqualTo());
            timeUserCreatedLessThan(o.getTimeUserCreatedLessThan());
            timePasswordLastChangedGreaterThanOrEqualTo(
                    o.getTimePasswordLastChangedGreaterThanOrEqualTo());
            timePasswordLastChangedLessThan(o.getTimePasswordLastChangedLessThan());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListUsersRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListUsersRequest
         */
        public ListUsersRequest build() {
            ListUsersRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListUsersRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListUsersRequest
         */
        public ListUsersRequest buildWithoutInvocationCallback() {
            ListUsersRequest request = new ListUsersRequest();
            request.userAssessmentId = userAssessmentId;
            request.limit = limit;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.userCategory = userCategory;
            request.userKey = userKey;
            request.accountStatus = accountStatus;
            request.authenticationType = authenticationType;
            request.userName = userName;
            request.targetId = targetId;
            request.timeLastLoginGreaterThanOrEqualTo = timeLastLoginGreaterThanOrEqualTo;
            request.timeLastLoginLessThan = timeLastLoginLessThan;
            request.timeUserCreatedGreaterThanOrEqualTo = timeUserCreatedGreaterThanOrEqualTo;
            request.timeUserCreatedLessThan = timeUserCreatedLessThan;
            request.timePasswordLastChangedGreaterThanOrEqualTo =
                    timePasswordLastChangedGreaterThanOrEqualTo;
            request.timePasswordLastChangedLessThan = timePasswordLastChangedLessThan;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListUsersRequest(userAssessmentId, limit, compartmentIdInSubtree, accessLevel, userCategory, userKey, accountStatus, authenticationType, userName, targetId, timeLastLoginGreaterThanOrEqualTo, timeLastLoginLessThan, timeUserCreatedGreaterThanOrEqualTo, timeUserCreatedLessThan, timePasswordLastChangedGreaterThanOrEqualTo, timePasswordLastChangedLessThan, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .userAssessmentId(userAssessmentId)
                .limit(limit)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel)
                .userCategory(userCategory)
                .userKey(userKey)
                .accountStatus(accountStatus)
                .authenticationType(authenticationType)
                .userName(userName)
                .targetId(targetId)
                .timeLastLoginGreaterThanOrEqualTo(timeLastLoginGreaterThanOrEqualTo)
                .timeLastLoginLessThan(timeLastLoginLessThan)
                .timeUserCreatedGreaterThanOrEqualTo(timeUserCreatedGreaterThanOrEqualTo)
                .timeUserCreatedLessThan(timeUserCreatedLessThan)
                .timePasswordLastChangedGreaterThanOrEqualTo(
                        timePasswordLastChangedGreaterThanOrEqualTo)
                .timePasswordLastChangedLessThan(timePasswordLastChangedLessThan)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",userAssessmentId=").append(String.valueOf(this.userAssessmentId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(",userCategory=").append(String.valueOf(this.userCategory));
        sb.append(",userKey=").append(String.valueOf(this.userKey));
        sb.append(",accountStatus=").append(String.valueOf(this.accountStatus));
        sb.append(",authenticationType=").append(String.valueOf(this.authenticationType));
        sb.append(",userName=").append(String.valueOf(this.userName));
        sb.append(",targetId=").append(String.valueOf(this.targetId));
        sb.append(",timeLastLoginGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeLastLoginGreaterThanOrEqualTo));
        sb.append(",timeLastLoginLessThan=").append(String.valueOf(this.timeLastLoginLessThan));
        sb.append(",timeUserCreatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeUserCreatedGreaterThanOrEqualTo));
        sb.append(",timeUserCreatedLessThan=").append(String.valueOf(this.timeUserCreatedLessThan));
        sb.append(",timePasswordLastChangedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timePasswordLastChangedGreaterThanOrEqualTo));
        sb.append(",timePasswordLastChangedLessThan=")
                .append(String.valueOf(this.timePasswordLastChangedLessThan));
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
        if (!(o instanceof ListUsersRequest)) {
            return false;
        }

        ListUsersRequest other = (ListUsersRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.userAssessmentId, other.userAssessmentId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(this.userCategory, other.userCategory)
                && java.util.Objects.equals(this.userKey, other.userKey)
                && java.util.Objects.equals(this.accountStatus, other.accountStatus)
                && java.util.Objects.equals(this.authenticationType, other.authenticationType)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(
                        this.timeLastLoginGreaterThanOrEqualTo,
                        other.timeLastLoginGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeLastLoginLessThan, other.timeLastLoginLessThan)
                && java.util.Objects.equals(
                        this.timeUserCreatedGreaterThanOrEqualTo,
                        other.timeUserCreatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeUserCreatedLessThan, other.timeUserCreatedLessThan)
                && java.util.Objects.equals(
                        this.timePasswordLastChangedGreaterThanOrEqualTo,
                        other.timePasswordLastChangedGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timePasswordLastChangedLessThan, other.timePasswordLastChangedLessThan)
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
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result = (result * PRIME) + (this.userCategory == null ? 43 : this.userCategory.hashCode());
        result = (result * PRIME) + (this.userKey == null ? 43 : this.userKey.hashCode());
        result =
                (result * PRIME)
                        + (this.accountStatus == null ? 43 : this.accountStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationType == null
                                ? 43
                                : this.authenticationType.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastLoginGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeLastLoginGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastLoginLessThan == null
                                ? 43
                                : this.timeLastLoginLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUserCreatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeUserCreatedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUserCreatedLessThan == null
                                ? 43
                                : this.timeUserCreatedLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.timePasswordLastChangedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timePasswordLastChangedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timePasswordLastChangedLessThan == null
                                ? 43
                                : this.timePasswordLastChangedLessThan.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

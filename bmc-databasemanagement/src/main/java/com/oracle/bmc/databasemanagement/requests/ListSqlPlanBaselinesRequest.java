/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListSqlPlanBaselinesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSqlPlanBaselinesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class ListSqlPlanBaselinesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     */
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }
    /** A filter to return only SQL plan baselines that match the plan name. */
    private String planName;

    /** A filter to return only SQL plan baselines that match the plan name. */
    public String getPlanName() {
        return planName;
    }
    /** A filter to return all the SQL plan baselines for the specified SQL handle. */
    private String sqlHandle;

    /** A filter to return all the SQL plan baselines for the specified SQL handle. */
    public String getSqlHandle() {
        return sqlHandle;
    }
    /**
     * A filter to return all the SQL plan baselines that match the SQL text. By default, the search
     * is case insensitive. To run an exact or case-sensitive search, double-quote the search
     * string. You may also use the '%' symbol as a wildcard.
     */
    private String sqlText;

    /**
     * A filter to return all the SQL plan baselines that match the SQL text. By default, the search
     * is case insensitive. To run an exact or case-sensitive search, double-quote the search
     * string. You may also use the '%' symbol as a wildcard.
     */
    public String getSqlText() {
        return sqlText;
    }
    /**
     * A filter to return only SQL plan baselines that are either enabled or not enabled. By
     * default, all SQL plan baselines are returned.
     */
    private Boolean isEnabled;

    /**
     * A filter to return only SQL plan baselines that are either enabled or not enabled. By
     * default, all SQL plan baselines are returned.
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }
    /**
     * A filter to return only SQL plan baselines that are either accepted or not accepted. By
     * default, all SQL plan baselines are returned.
     */
    private Boolean isAccepted;

    /**
     * A filter to return only SQL plan baselines that are either accepted or not accepted. By
     * default, all SQL plan baselines are returned.
     */
    public Boolean getIsAccepted() {
        return isAccepted;
    }
    /**
     * A filter to return only SQL plan baselines that were either reproduced or not reproduced by
     * the optimizer. By default, all SQL plan baselines are returned.
     */
    private Boolean isReproduced;

    /**
     * A filter to return only SQL plan baselines that were either reproduced or not reproduced by
     * the optimizer. By default, all SQL plan baselines are returned.
     */
    public Boolean getIsReproduced() {
        return isReproduced;
    }
    /**
     * A filter to return only SQL plan baselines that are either fixed or not fixed. By default,
     * all SQL plan baselines are returned.
     */
    private Boolean isFixed;

    /**
     * A filter to return only SQL plan baselines that are either fixed or not fixed. By default,
     * all SQL plan baselines are returned.
     */
    public Boolean getIsFixed() {
        return isFixed;
    }
    /**
     * A filter to return only SQL plan baselines that are either adaptive or not adaptive. By
     * default, all SQL plan baselines are returned.
     */
    private Boolean isAdaptive;

    /**
     * A filter to return only SQL plan baselines that are either adaptive or not adaptive. By
     * default, all SQL plan baselines are returned.
     */
    public Boolean getIsAdaptive() {
        return isAdaptive;
    }
    /** A filter to return all the SQL plan baselines that match the origin. */
    private com.oracle.bmc.databasemanagement.model.SqlPlanBaselineOrigin origin;

    /** A filter to return all the SQL plan baselines that match the origin. */
    public com.oracle.bmc.databasemanagement.model.SqlPlanBaselineOrigin getOrigin() {
        return origin;
    }
    /**
     * The page token representing the page from where the next set of paginated results are
     * retrieved. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page from where the next set of paginated results are
     * retrieved. This is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The maximum number of records returned in the paginated response. */
    private Integer limit;

    /** The maximum number of records returned in the paginated response. */
    public Integer getLimit() {
        return limit;
    }
    /** The option to sort the SQL plan baseline summary data. */
    private SortBy sortBy;

    /** The option to sort the SQL plan baseline summary data. */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        TimeLastModified("timeLastModified"),
        TimeLastExecuted("timeLastExecuted"),
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

    /** The option to sort the SQL plan baseline summary data. */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending
     * (\u2018DESC\u2019) order. Descending order is the default order.
     */
    private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder;

    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending
     * (\u2018DESC\u2019) order. Descending order is the default order.
     */
    public com.oracle.bmc.databasemanagement.model.SortOrders getSortOrder() {
        return sortOrder;
    }
    /**
     * A filter to return only SQL plan baselines that are either auto-purged or not auto-purged. By
     * default, all SQL plan baselines are returned.
     */
    private Boolean isAutoPurged;

    /**
     * A filter to return only SQL plan baselines that are either auto-purged or not auto-purged. By
     * default, all SQL plan baselines are returned.
     */
    public Boolean getIsAutoPurged() {
        return isAutoPurged;
    }
    /**
     * A filter to return only SQL plan baselines whose last execution time is after the specified
     * value. By default, all SQL plan baselines are returned.
     */
    private java.util.Date timeLastExecutedGreaterThan;

    /**
     * A filter to return only SQL plan baselines whose last execution time is after the specified
     * value. By default, all SQL plan baselines are returned.
     */
    public java.util.Date getTimeLastExecutedGreaterThan() {
        return timeLastExecutedGreaterThan;
    }
    /**
     * A filter to return only SQL plan baselines whose last execution time is before the specified
     * value. By default, all SQL plan baselines are returned.
     */
    private java.util.Date timeLastExecutedLessThan;

    /**
     * A filter to return only SQL plan baselines whose last execution time is before the specified
     * value. By default, all SQL plan baselines are returned.
     */
    public java.util.Date getTimeLastExecutedLessThan() {
        return timeLastExecutedLessThan;
    }
    /**
     * A filter to return only SQL plan baselines that are not executed till now. By default, all
     * SQL plan baselines are returned.
     */
    private Boolean isNeverExecuted;

    /**
     * A filter to return only SQL plan baselines that are not executed till now. By default, all
     * SQL plan baselines are returned.
     */
    public Boolean getIsNeverExecuted() {
        return isNeverExecuted;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The OCID of the Named Credential. */
    private String opcNamedCredentialId;

    /** The OCID of the Named Credential. */
    public String getOpcNamedCredentialId() {
        return opcNamedCredentialId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSqlPlanBaselinesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         */
        private String managedDatabaseId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         *
         * @param managedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /** A filter to return only SQL plan baselines that match the plan name. */
        private String planName = null;

        /**
         * A filter to return only SQL plan baselines that match the plan name.
         *
         * @param planName the value to set
         * @return this builder instance
         */
        public Builder planName(String planName) {
            this.planName = planName;
            return this;
        }

        /** A filter to return all the SQL plan baselines for the specified SQL handle. */
        private String sqlHandle = null;

        /**
         * A filter to return all the SQL plan baselines for the specified SQL handle.
         *
         * @param sqlHandle the value to set
         * @return this builder instance
         */
        public Builder sqlHandle(String sqlHandle) {
            this.sqlHandle = sqlHandle;
            return this;
        }

        /**
         * A filter to return all the SQL plan baselines that match the SQL text. By default, the
         * search is case insensitive. To run an exact or case-sensitive search, double-quote the
         * search string. You may also use the '%' symbol as a wildcard.
         */
        private String sqlText = null;

        /**
         * A filter to return all the SQL plan baselines that match the SQL text. By default, the
         * search is case insensitive. To run an exact or case-sensitive search, double-quote the
         * search string. You may also use the '%' symbol as a wildcard.
         *
         * @param sqlText the value to set
         * @return this builder instance
         */
        public Builder sqlText(String sqlText) {
            this.sqlText = sqlText;
            return this;
        }

        /**
         * A filter to return only SQL plan baselines that are either enabled or not enabled. By
         * default, all SQL plan baselines are returned.
         */
        private Boolean isEnabled = null;

        /**
         * A filter to return only SQL plan baselines that are either enabled or not enabled. By
         * default, all SQL plan baselines are returned.
         *
         * @param isEnabled the value to set
         * @return this builder instance
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        /**
         * A filter to return only SQL plan baselines that are either accepted or not accepted. By
         * default, all SQL plan baselines are returned.
         */
        private Boolean isAccepted = null;

        /**
         * A filter to return only SQL plan baselines that are either accepted or not accepted. By
         * default, all SQL plan baselines are returned.
         *
         * @param isAccepted the value to set
         * @return this builder instance
         */
        public Builder isAccepted(Boolean isAccepted) {
            this.isAccepted = isAccepted;
            return this;
        }

        /**
         * A filter to return only SQL plan baselines that were either reproduced or not reproduced
         * by the optimizer. By default, all SQL plan baselines are returned.
         */
        private Boolean isReproduced = null;

        /**
         * A filter to return only SQL plan baselines that were either reproduced or not reproduced
         * by the optimizer. By default, all SQL plan baselines are returned.
         *
         * @param isReproduced the value to set
         * @return this builder instance
         */
        public Builder isReproduced(Boolean isReproduced) {
            this.isReproduced = isReproduced;
            return this;
        }

        /**
         * A filter to return only SQL plan baselines that are either fixed or not fixed. By
         * default, all SQL plan baselines are returned.
         */
        private Boolean isFixed = null;

        /**
         * A filter to return only SQL plan baselines that are either fixed or not fixed. By
         * default, all SQL plan baselines are returned.
         *
         * @param isFixed the value to set
         * @return this builder instance
         */
        public Builder isFixed(Boolean isFixed) {
            this.isFixed = isFixed;
            return this;
        }

        /**
         * A filter to return only SQL plan baselines that are either adaptive or not adaptive. By
         * default, all SQL plan baselines are returned.
         */
        private Boolean isAdaptive = null;

        /**
         * A filter to return only SQL plan baselines that are either adaptive or not adaptive. By
         * default, all SQL plan baselines are returned.
         *
         * @param isAdaptive the value to set
         * @return this builder instance
         */
        public Builder isAdaptive(Boolean isAdaptive) {
            this.isAdaptive = isAdaptive;
            return this;
        }

        /** A filter to return all the SQL plan baselines that match the origin. */
        private com.oracle.bmc.databasemanagement.model.SqlPlanBaselineOrigin origin = null;

        /**
         * A filter to return all the SQL plan baselines that match the origin.
         *
         * @param origin the value to set
         * @return this builder instance
         */
        public Builder origin(
                com.oracle.bmc.databasemanagement.model.SqlPlanBaselineOrigin origin) {
            this.origin = origin;
            return this;
        }

        /**
         * The page token representing the page from where the next set of paginated results are
         * retrieved. This is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page from where the next set of paginated results are
         * retrieved. This is usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The maximum number of records returned in the paginated response. */
        private Integer limit = null;

        /**
         * The maximum number of records returned in the paginated response.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The option to sort the SQL plan baseline summary data. */
        private SortBy sortBy = null;

        /**
         * The option to sort the SQL plan baseline summary data.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The option to sort information in ascending (\u2018ASC\u2019) or descending
         * (\u2018DESC\u2019) order. Descending order is the default order.
         */
        private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder = null;

        /**
         * The option to sort information in ascending (\u2018ASC\u2019) or descending
         * (\u2018DESC\u2019) order. Descending order is the default order.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.databasemanagement.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * A filter to return only SQL plan baselines that are either auto-purged or not
         * auto-purged. By default, all SQL plan baselines are returned.
         */
        private Boolean isAutoPurged = null;

        /**
         * A filter to return only SQL plan baselines that are either auto-purged or not
         * auto-purged. By default, all SQL plan baselines are returned.
         *
         * @param isAutoPurged the value to set
         * @return this builder instance
         */
        public Builder isAutoPurged(Boolean isAutoPurged) {
            this.isAutoPurged = isAutoPurged;
            return this;
        }

        /**
         * A filter to return only SQL plan baselines whose last execution time is after the
         * specified value. By default, all SQL plan baselines are returned.
         */
        private java.util.Date timeLastExecutedGreaterThan = null;

        /**
         * A filter to return only SQL plan baselines whose last execution time is after the
         * specified value. By default, all SQL plan baselines are returned.
         *
         * @param timeLastExecutedGreaterThan the value to set
         * @return this builder instance
         */
        public Builder timeLastExecutedGreaterThan(java.util.Date timeLastExecutedGreaterThan) {
            this.timeLastExecutedGreaterThan = timeLastExecutedGreaterThan;
            return this;
        }

        /**
         * A filter to return only SQL plan baselines whose last execution time is before the
         * specified value. By default, all SQL plan baselines are returned.
         */
        private java.util.Date timeLastExecutedLessThan = null;

        /**
         * A filter to return only SQL plan baselines whose last execution time is before the
         * specified value. By default, all SQL plan baselines are returned.
         *
         * @param timeLastExecutedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeLastExecutedLessThan(java.util.Date timeLastExecutedLessThan) {
            this.timeLastExecutedLessThan = timeLastExecutedLessThan;
            return this;
        }

        /**
         * A filter to return only SQL plan baselines that are not executed till now. By default,
         * all SQL plan baselines are returned.
         */
        private Boolean isNeverExecuted = null;

        /**
         * A filter to return only SQL plan baselines that are not executed till now. By default,
         * all SQL plan baselines are returned.
         *
         * @param isNeverExecuted the value to set
         * @return this builder instance
         */
        public Builder isNeverExecuted(Boolean isNeverExecuted) {
            this.isNeverExecuted = isNeverExecuted;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The OCID of the Named Credential. */
        private String opcNamedCredentialId = null;

        /**
         * The OCID of the Named Credential.
         *
         * @param opcNamedCredentialId the value to set
         * @return this builder instance
         */
        public Builder opcNamedCredentialId(String opcNamedCredentialId) {
            this.opcNamedCredentialId = opcNamedCredentialId;
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
        public Builder copy(ListSqlPlanBaselinesRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            planName(o.getPlanName());
            sqlHandle(o.getSqlHandle());
            sqlText(o.getSqlText());
            isEnabled(o.getIsEnabled());
            isAccepted(o.getIsAccepted());
            isReproduced(o.getIsReproduced());
            isFixed(o.getIsFixed());
            isAdaptive(o.getIsAdaptive());
            origin(o.getOrigin());
            page(o.getPage());
            limit(o.getLimit());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            isAutoPurged(o.getIsAutoPurged());
            timeLastExecutedGreaterThan(o.getTimeLastExecutedGreaterThan());
            timeLastExecutedLessThan(o.getTimeLastExecutedLessThan());
            isNeverExecuted(o.getIsNeverExecuted());
            opcRequestId(o.getOpcRequestId());
            opcNamedCredentialId(o.getOpcNamedCredentialId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSqlPlanBaselinesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListSqlPlanBaselinesRequest
         */
        public ListSqlPlanBaselinesRequest build() {
            ListSqlPlanBaselinesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSqlPlanBaselinesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSqlPlanBaselinesRequest
         */
        public ListSqlPlanBaselinesRequest buildWithoutInvocationCallback() {
            ListSqlPlanBaselinesRequest request = new ListSqlPlanBaselinesRequest();
            request.managedDatabaseId = managedDatabaseId;
            request.planName = planName;
            request.sqlHandle = sqlHandle;
            request.sqlText = sqlText;
            request.isEnabled = isEnabled;
            request.isAccepted = isAccepted;
            request.isReproduced = isReproduced;
            request.isFixed = isFixed;
            request.isAdaptive = isAdaptive;
            request.origin = origin;
            request.page = page;
            request.limit = limit;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.isAutoPurged = isAutoPurged;
            request.timeLastExecutedGreaterThan = timeLastExecutedGreaterThan;
            request.timeLastExecutedLessThan = timeLastExecutedLessThan;
            request.isNeverExecuted = isNeverExecuted;
            request.opcRequestId = opcRequestId;
            request.opcNamedCredentialId = opcNamedCredentialId;
            return request;
            // new ListSqlPlanBaselinesRequest(managedDatabaseId, planName, sqlHandle, sqlText,
            // isEnabled, isAccepted, isReproduced, isFixed, isAdaptive, origin, page, limit,
            // sortBy, sortOrder, isAutoPurged, timeLastExecutedGreaterThan,
            // timeLastExecutedLessThan, isNeverExecuted, opcRequestId, opcNamedCredentialId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedDatabaseId(managedDatabaseId)
                .planName(planName)
                .sqlHandle(sqlHandle)
                .sqlText(sqlText)
                .isEnabled(isEnabled)
                .isAccepted(isAccepted)
                .isReproduced(isReproduced)
                .isFixed(isFixed)
                .isAdaptive(isAdaptive)
                .origin(origin)
                .page(page)
                .limit(limit)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .isAutoPurged(isAutoPurged)
                .timeLastExecutedGreaterThan(timeLastExecutedGreaterThan)
                .timeLastExecutedLessThan(timeLastExecutedLessThan)
                .isNeverExecuted(isNeverExecuted)
                .opcRequestId(opcRequestId)
                .opcNamedCredentialId(opcNamedCredentialId);
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
        sb.append(",managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(",planName=").append(String.valueOf(this.planName));
        sb.append(",sqlHandle=").append(String.valueOf(this.sqlHandle));
        sb.append(",sqlText=").append(String.valueOf(this.sqlText));
        sb.append(",isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(",isAccepted=").append(String.valueOf(this.isAccepted));
        sb.append(",isReproduced=").append(String.valueOf(this.isReproduced));
        sb.append(",isFixed=").append(String.valueOf(this.isFixed));
        sb.append(",isAdaptive=").append(String.valueOf(this.isAdaptive));
        sb.append(",origin=").append(String.valueOf(this.origin));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",isAutoPurged=").append(String.valueOf(this.isAutoPurged));
        sb.append(",timeLastExecutedGreaterThan=")
                .append(String.valueOf(this.timeLastExecutedGreaterThan));
        sb.append(",timeLastExecutedLessThan=")
                .append(String.valueOf(this.timeLastExecutedLessThan));
        sb.append(",isNeverExecuted=").append(String.valueOf(this.isNeverExecuted));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcNamedCredentialId=").append(String.valueOf(this.opcNamedCredentialId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSqlPlanBaselinesRequest)) {
            return false;
        }

        ListSqlPlanBaselinesRequest other = (ListSqlPlanBaselinesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(this.planName, other.planName)
                && java.util.Objects.equals(this.sqlHandle, other.sqlHandle)
                && java.util.Objects.equals(this.sqlText, other.sqlText)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.isAccepted, other.isAccepted)
                && java.util.Objects.equals(this.isReproduced, other.isReproduced)
                && java.util.Objects.equals(this.isFixed, other.isFixed)
                && java.util.Objects.equals(this.isAdaptive, other.isAdaptive)
                && java.util.Objects.equals(this.origin, other.origin)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.isAutoPurged, other.isAutoPurged)
                && java.util.Objects.equals(
                        this.timeLastExecutedGreaterThan, other.timeLastExecutedGreaterThan)
                && java.util.Objects.equals(
                        this.timeLastExecutedLessThan, other.timeLastExecutedLessThan)
                && java.util.Objects.equals(this.isNeverExecuted, other.isNeverExecuted)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNamedCredentialId, other.opcNamedCredentialId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedDatabaseId == null ? 43 : this.managedDatabaseId.hashCode());
        result = (result * PRIME) + (this.planName == null ? 43 : this.planName.hashCode());
        result = (result * PRIME) + (this.sqlHandle == null ? 43 : this.sqlHandle.hashCode());
        result = (result * PRIME) + (this.sqlText == null ? 43 : this.sqlText.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.isAccepted == null ? 43 : this.isAccepted.hashCode());
        result = (result * PRIME) + (this.isReproduced == null ? 43 : this.isReproduced.hashCode());
        result = (result * PRIME) + (this.isFixed == null ? 43 : this.isFixed.hashCode());
        result = (result * PRIME) + (this.isAdaptive == null ? 43 : this.isAdaptive.hashCode());
        result = (result * PRIME) + (this.origin == null ? 43 : this.origin.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.isAutoPurged == null ? 43 : this.isAutoPurged.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastExecutedGreaterThan == null
                                ? 43
                                : this.timeLastExecutedGreaterThan.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastExecutedLessThan == null
                                ? 43
                                : this.timeLastExecutedLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.isNeverExecuted == null ? 43 : this.isNeverExecuted.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcNamedCredentialId == null
                                ? 43
                                : this.opcNamedCredentialId.hashCode());
        return result;
    }
}

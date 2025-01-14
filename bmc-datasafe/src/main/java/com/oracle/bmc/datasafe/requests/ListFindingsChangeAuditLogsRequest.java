/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListFindingsChangeAuditLogsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListFindingsChangeAuditLogsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListFindingsChangeAuditLogsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the security assessment. */
    private String securityAssessmentId;

    /** The OCID of the security assessment. */
    public String getSecurityAssessmentId() {
        return securityAssessmentId;
    }
    /** A filter to return only findings of a particular risk level. */
    private Severity severity;

    /** A filter to return only findings of a particular risk level. */
    public enum Severity implements com.oracle.bmc.http.internal.BmcEnum {
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW"),
        Evaluate("EVALUATE"),
        Advisory("ADVISORY"),
        Pass("PASS"),
        Deferred("DEFERRED"),
        ;

        private final String value;
        private static java.util.Map<String, Severity> map;

        static {
            map = new java.util.HashMap<>();
            for (Severity v : Severity.values()) {
                map.put(v.getValue(), v);
            }
        }

        Severity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Severity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Severity: " + key);
        }
    };

    /** A filter to return only findings of a particular risk level. */
    public Severity getSeverity() {
        return severity;
    }
    /**
     * The unique key that identifies the finding. It is a string and unique within a security
     * assessment.
     */
    private String findingKey;

    /**
     * The unique key that identifies the finding. It is a string and unique within a security
     * assessment.
     */
    public String getFindingKey() {
        return findingKey;
    }
    /**
     * The unique title that identifies the finding. It is a string and unique within a security
     * assessment.
     */
    private String findingTitle;

    /**
     * The unique title that identifies the finding. It is a string and unique within a security
     * assessment.
     */
    public String getFindingTitle() {
        return findingTitle;
    }
    /** A filter to check findings whose risks were deferred by the user. */
    private Boolean isRiskDeferred;

    /** A filter to check findings whose risks were deferred by the user. */
    public Boolean getIsRiskDeferred() {
        return isRiskDeferred;
    }
    /** A filter to check which user modified the risk level of the finding. */
    private String modifiedBy;

    /** A filter to check which user modified the risk level of the finding. */
    public String getModifiedBy() {
        return modifiedBy;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
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
     * The field to sort by. You can specify only one sort order(sortOrder). The default order for
     * timeUpdated is descending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sort order(sortOrder). The default order for
     * timeUpdated is descending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeUpdated("timeUpdated"),
        ModifiedBy("modifiedBy"),
        IsRiskDeferred("isRiskDeferred"),
        TimeValidUntil("timeValidUntil"),
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
     * The field to sort by. You can specify only one sort order(sortOrder). The default order for
     * timeUpdated is descending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Specifying {@code TimeValidUntilGreaterThanOrEqualToQueryParam} parameter will retrieve all
     * items for which the risk level modification by user will no longer be valid greater than the
     * date and time specified, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>*Example:** 2016-12-19T00:00:00.000Z
     */
    private java.util.Date timeValidUntilGreaterThanOrEqualTo;

    /**
     * Specifying {@code TimeValidUntilGreaterThanOrEqualToQueryParam} parameter will retrieve all
     * items for which the risk level modification by user will no longer be valid greater than the
     * date and time specified, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>*Example:** 2016-12-19T00:00:00.000Z
     */
    public java.util.Date getTimeValidUntilGreaterThanOrEqualTo() {
        return timeValidUntilGreaterThanOrEqualTo;
    }
    /**
     * Specifying {@code TimeValidUntilLessThanQueryParam} parameter will retrieve all items for
     * which the risk level modification by user will be valid until less than the date and time
     * specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>*Example:** 2016-12-19T00:00:00.000Z
     */
    private java.util.Date timeValidUntilLessThan;

    /**
     * Specifying {@code TimeValidUntilLessThanQueryParam} parameter will retrieve all items for
     * which the risk level modification by user will be valid until less than the date and time
     * specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>*Example:** 2016-12-19T00:00:00.000Z
     */
    public java.util.Date getTimeValidUntilLessThan() {
        return timeValidUntilLessThan;
    }
    /**
     * Search for resources that were updated after a specific date. Specifying this parameter
     * corresponding {@code timeUpdatedGreaterThanOrEqualTo} parameter will retrieve all resources
     * updated after the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
     * defined by RFC 3339.
     */
    private java.util.Date timeUpdatedGreaterThanOrEqualTo;

    /**
     * Search for resources that were updated after a specific date. Specifying this parameter
     * corresponding {@code timeUpdatedGreaterThanOrEqualTo} parameter will retrieve all resources
     * updated after the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
     * defined by RFC 3339.
     */
    public java.util.Date getTimeUpdatedGreaterThanOrEqualTo() {
        return timeUpdatedGreaterThanOrEqualTo;
    }
    /**
     * Search for resources that were updated before a specific date. Specifying this parameter
     * corresponding {@code timeUpdatedLessThan} parameter will retrieve all resources updated
     * before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined
     * by RFC 3339.
     */
    private java.util.Date timeUpdatedLessThan;

    /**
     * Search for resources that were updated before a specific date. Specifying this parameter
     * corresponding {@code timeUpdatedLessThan} parameter will retrieve all resources updated
     * before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined
     * by RFC 3339.
     */
    public java.util.Date getTimeUpdatedLessThan() {
        return timeUpdatedLessThan;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListFindingsChangeAuditLogsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the security assessment. */
        private String securityAssessmentId = null;

        /**
         * The OCID of the security assessment.
         *
         * @param securityAssessmentId the value to set
         * @return this builder instance
         */
        public Builder securityAssessmentId(String securityAssessmentId) {
            this.securityAssessmentId = securityAssessmentId;
            return this;
        }

        /** A filter to return only findings of a particular risk level. */
        private Severity severity = null;

        /**
         * A filter to return only findings of a particular risk level.
         *
         * @param severity the value to set
         * @return this builder instance
         */
        public Builder severity(Severity severity) {
            this.severity = severity;
            return this;
        }

        /**
         * The unique key that identifies the finding. It is a string and unique within a security
         * assessment.
         */
        private String findingKey = null;

        /**
         * The unique key that identifies the finding. It is a string and unique within a security
         * assessment.
         *
         * @param findingKey the value to set
         * @return this builder instance
         */
        public Builder findingKey(String findingKey) {
            this.findingKey = findingKey;
            return this;
        }

        /**
         * The unique title that identifies the finding. It is a string and unique within a security
         * assessment.
         */
        private String findingTitle = null;

        /**
         * The unique title that identifies the finding. It is a string and unique within a security
         * assessment.
         *
         * @param findingTitle the value to set
         * @return this builder instance
         */
        public Builder findingTitle(String findingTitle) {
            this.findingTitle = findingTitle;
            return this;
        }

        /** A filter to check findings whose risks were deferred by the user. */
        private Boolean isRiskDeferred = null;

        /**
         * A filter to check findings whose risks were deferred by the user.
         *
         * @param isRiskDeferred the value to set
         * @return this builder instance
         */
        public Builder isRiskDeferred(Boolean isRiskDeferred) {
            this.isRiskDeferred = isRiskDeferred;
            return this;
        }

        /** A filter to check which user modified the risk level of the finding. */
        private String modifiedBy = null;

        /**
         * A filter to check which user modified the risk level of the finding.
         *
         * @param modifiedBy the value to set
         * @return this builder instance
         */
        public Builder modifiedBy(String modifiedBy) {
            this.modifiedBy = modifiedBy;
            return this;
        }

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
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
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving
         * results. It is usually retrieved from a previous "List" call. For details about how
         * pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
         * The field to sort by. You can specify only one sort order(sortOrder). The default order
         * for timeUpdated is descending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can specify only one sort order(sortOrder). The default order
         * for timeUpdated is descending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Specifying {@code TimeValidUntilGreaterThanOrEqualToQueryParam} parameter will retrieve
         * all items for which the risk level modification by user will no longer be valid greater
         * than the date and time specified, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>*Example:** 2016-12-19T00:00:00.000Z
         */
        private java.util.Date timeValidUntilGreaterThanOrEqualTo = null;

        /**
         * Specifying {@code TimeValidUntilGreaterThanOrEqualToQueryParam} parameter will retrieve
         * all items for which the risk level modification by user will no longer be valid greater
         * than the date and time specified, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>*Example:** 2016-12-19T00:00:00.000Z
         *
         * @param timeValidUntilGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeValidUntilGreaterThanOrEqualTo(
                java.util.Date timeValidUntilGreaterThanOrEqualTo) {
            this.timeValidUntilGreaterThanOrEqualTo = timeValidUntilGreaterThanOrEqualTo;
            return this;
        }

        /**
         * Specifying {@code TimeValidUntilLessThanQueryParam} parameter will retrieve all items for
         * which the risk level modification by user will be valid until less than the date and time
         * specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>*Example:** 2016-12-19T00:00:00.000Z
         */
        private java.util.Date timeValidUntilLessThan = null;

        /**
         * Specifying {@code TimeValidUntilLessThanQueryParam} parameter will retrieve all items for
         * which the risk level modification by user will be valid until less than the date and time
         * specified, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>*Example:** 2016-12-19T00:00:00.000Z
         *
         * @param timeValidUntilLessThan the value to set
         * @return this builder instance
         */
        public Builder timeValidUntilLessThan(java.util.Date timeValidUntilLessThan) {
            this.timeValidUntilLessThan = timeValidUntilLessThan;
            return this;
        }

        /**
         * Search for resources that were updated after a specific date. Specifying this parameter
         * corresponding {@code timeUpdatedGreaterThanOrEqualTo} parameter will retrieve all
         * resources updated after the specified created date, in "YYYY-MM-ddThh:mmZ" format with a
         * Z offset, as defined by RFC 3339.
         */
        private java.util.Date timeUpdatedGreaterThanOrEqualTo = null;

        /**
         * Search for resources that were updated after a specific date. Specifying this parameter
         * corresponding {@code timeUpdatedGreaterThanOrEqualTo} parameter will retrieve all
         * resources updated after the specified created date, in "YYYY-MM-ddThh:mmZ" format with a
         * Z offset, as defined by RFC 3339.
         *
         * @param timeUpdatedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeUpdatedGreaterThanOrEqualTo(
                java.util.Date timeUpdatedGreaterThanOrEqualTo) {
            this.timeUpdatedGreaterThanOrEqualTo = timeUpdatedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * Search for resources that were updated before a specific date. Specifying this parameter
         * corresponding {@code timeUpdatedLessThan} parameter will retrieve all resources updated
         * before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
         * defined by RFC 3339.
         */
        private java.util.Date timeUpdatedLessThan = null;

        /**
         * Search for resources that were updated before a specific date. Specifying this parameter
         * corresponding {@code timeUpdatedLessThan} parameter will retrieve all resources updated
         * before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
         * defined by RFC 3339.
         *
         * @param timeUpdatedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeUpdatedLessThan(java.util.Date timeUpdatedLessThan) {
            this.timeUpdatedLessThan = timeUpdatedLessThan;
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
        public Builder copy(ListFindingsChangeAuditLogsRequest o) {
            securityAssessmentId(o.getSecurityAssessmentId());
            severity(o.getSeverity());
            findingKey(o.getFindingKey());
            findingTitle(o.getFindingTitle());
            isRiskDeferred(o.getIsRiskDeferred());
            modifiedBy(o.getModifiedBy());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            timeValidUntilGreaterThanOrEqualTo(o.getTimeValidUntilGreaterThanOrEqualTo());
            timeValidUntilLessThan(o.getTimeValidUntilLessThan());
            timeUpdatedGreaterThanOrEqualTo(o.getTimeUpdatedGreaterThanOrEqualTo());
            timeUpdatedLessThan(o.getTimeUpdatedLessThan());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListFindingsChangeAuditLogsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListFindingsChangeAuditLogsRequest
         */
        public ListFindingsChangeAuditLogsRequest build() {
            ListFindingsChangeAuditLogsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListFindingsChangeAuditLogsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListFindingsChangeAuditLogsRequest
         */
        public ListFindingsChangeAuditLogsRequest buildWithoutInvocationCallback() {
            ListFindingsChangeAuditLogsRequest request = new ListFindingsChangeAuditLogsRequest();
            request.securityAssessmentId = securityAssessmentId;
            request.severity = severity;
            request.findingKey = findingKey;
            request.findingTitle = findingTitle;
            request.isRiskDeferred = isRiskDeferred;
            request.modifiedBy = modifiedBy;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.timeValidUntilGreaterThanOrEqualTo = timeValidUntilGreaterThanOrEqualTo;
            request.timeValidUntilLessThan = timeValidUntilLessThan;
            request.timeUpdatedGreaterThanOrEqualTo = timeUpdatedGreaterThanOrEqualTo;
            request.timeUpdatedLessThan = timeUpdatedLessThan;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListFindingsChangeAuditLogsRequest(securityAssessmentId, severity, findingKey,
            // findingTitle, isRiskDeferred, modifiedBy, limit, page, sortOrder, sortBy,
            // timeValidUntilGreaterThanOrEqualTo, timeValidUntilLessThan,
            // timeUpdatedGreaterThanOrEqualTo, timeUpdatedLessThan, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .securityAssessmentId(securityAssessmentId)
                .severity(severity)
                .findingKey(findingKey)
                .findingTitle(findingTitle)
                .isRiskDeferred(isRiskDeferred)
                .modifiedBy(modifiedBy)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .timeValidUntilGreaterThanOrEqualTo(timeValidUntilGreaterThanOrEqualTo)
                .timeValidUntilLessThan(timeValidUntilLessThan)
                .timeUpdatedGreaterThanOrEqualTo(timeUpdatedGreaterThanOrEqualTo)
                .timeUpdatedLessThan(timeUpdatedLessThan)
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
        sb.append(",securityAssessmentId=").append(String.valueOf(this.securityAssessmentId));
        sb.append(",severity=").append(String.valueOf(this.severity));
        sb.append(",findingKey=").append(String.valueOf(this.findingKey));
        sb.append(",findingTitle=").append(String.valueOf(this.findingTitle));
        sb.append(",isRiskDeferred=").append(String.valueOf(this.isRiskDeferred));
        sb.append(",modifiedBy=").append(String.valueOf(this.modifiedBy));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",timeValidUntilGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeValidUntilGreaterThanOrEqualTo));
        sb.append(",timeValidUntilLessThan=").append(String.valueOf(this.timeValidUntilLessThan));
        sb.append(",timeUpdatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeUpdatedGreaterThanOrEqualTo));
        sb.append(",timeUpdatedLessThan=").append(String.valueOf(this.timeUpdatedLessThan));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListFindingsChangeAuditLogsRequest)) {
            return false;
        }

        ListFindingsChangeAuditLogsRequest other = (ListFindingsChangeAuditLogsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.securityAssessmentId, other.securityAssessmentId)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.findingKey, other.findingKey)
                && java.util.Objects.equals(this.findingTitle, other.findingTitle)
                && java.util.Objects.equals(this.isRiskDeferred, other.isRiskDeferred)
                && java.util.Objects.equals(this.modifiedBy, other.modifiedBy)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(
                        this.timeValidUntilGreaterThanOrEqualTo,
                        other.timeValidUntilGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeValidUntilLessThan, other.timeValidUntilLessThan)
                && java.util.Objects.equals(
                        this.timeUpdatedGreaterThanOrEqualTo, other.timeUpdatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeUpdatedLessThan, other.timeUpdatedLessThan)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.securityAssessmentId == null
                                ? 43
                                : this.securityAssessmentId.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.findingKey == null ? 43 : this.findingKey.hashCode());
        result = (result * PRIME) + (this.findingTitle == null ? 43 : this.findingTitle.hashCode());
        result =
                (result * PRIME)
                        + (this.isRiskDeferred == null ? 43 : this.isRiskDeferred.hashCode());
        result = (result * PRIME) + (this.modifiedBy == null ? 43 : this.modifiedBy.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.timeValidUntilGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeValidUntilGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeValidUntilLessThan == null
                                ? 43
                                : this.timeValidUntilLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUpdatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeUpdatedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUpdatedLessThan == null
                                ? 43
                                : this.timeUpdatedLessThan.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

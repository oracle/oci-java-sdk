/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListSqlFirewallViolationAnalyticsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListSqlFirewallViolationAnalyticsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListSqlFirewallViolationAnalyticsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** A filter to return only resources that match the specified compartment OCID. */
    private String compartmentId;

    /** A filter to return only resources that match the specified compartment OCID. */
    public String getCompartmentId() {
        return compartmentId;
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
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * An optional filter to return audit events whose creation time in the database is greater than
     * and equal to the date-time specified, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    private java.util.Date timeStarted;

    /**
     * An optional filter to return audit events whose creation time in the database is greater than
     * and equal to the date-time specified, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }
    /**
     * An optional filter to return audit events whose creation time in the database is less than
     * and equal to the date-time specified, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    private java.util.Date timeEnded;

    /**
     * An optional filter to return audit events whose creation time in the database is less than
     * and equal to the date-time specified, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }
    /**
     * Default time zone is UTC if no time zone provided. The date-time considerations of the
     * resource will be in accordance with the specified time zone.
     */
    private String queryTimeZone;

    /**
     * Default time zone is UTC if no time zone provided. The date-time considerations of the
     * resource will be in accordance with the specified time zone.
     */
    public String getQueryTimeZone() {
        return queryTimeZone;
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
    /** If this query parameter is specified, the result is sorted by this query parameter value. */
    private SortBy sortBy;

    /** If this query parameter is specified, the result is sorted by this query parameter value. */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        DbUserName("dbUserName"),
        TargetId("targetId"),
        TargetName("targetName"),
        OperationTime("operationTime"),
        TimeCollected("timeCollected"),
        ClientOsUserName("clientOsUserName"),
        Operation("operation"),
        CurrentDbUserName("currentDbUserName"),
        SqlLevel("sqlLevel"),
        ClientIp("clientIp"),
        ClientProgram("clientProgram"),
        ViolationCause("violationCause"),
        ViolationAction("violationAction"),
        ViolationCount("violationCount"),
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

    /** If this query parameter is specified, the result is sorted by this query parameter value. */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The scimQuery query parameter accepts filter expressions that use the syntax described in
     * Section 3.2.2.2 of the System for Cross-Domain Identity Management (SCIM) specification,
     * which is available at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In SCIM
     * filtering expressions, text, date, and time values must be enclosed in quotation marks, with
     * date and time values using ISO-8601 format. (Numeric and boolean values should not be
     * quoted.)
     *
     * <p>*Example:** query=(operationTime ge '2021-06-04T01-00-26') and (violationAction eq
     * 'BLOCKED')
     */
    private String scimQuery;

    /**
     * The scimQuery query parameter accepts filter expressions that use the syntax described in
     * Section 3.2.2.2 of the System for Cross-Domain Identity Management (SCIM) specification,
     * which is available at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In SCIM
     * filtering expressions, text, date, and time values must be enclosed in quotation marks, with
     * date and time values using ISO-8601 format. (Numeric and boolean values should not be
     * quoted.)
     *
     * <p>*Example:** query=(operationTime ge '2021-06-04T01-00-26') and (violationAction eq
     * 'BLOCKED')
     */
    public String getScimQuery() {
        return scimQuery;
    }
    /** Specifies a subset of summarized fields to be returned in the response. */
    private java.util.List<SummaryField> summaryField;

    /** Specifies a subset of summarized fields to be returned in the response. */
    public enum SummaryField implements com.oracle.bmc.http.internal.BmcEnum {
        DbUserName("dbUserName"),
        TargetName("targetName"),
        ClientOsUserName("clientOsUserName"),
        Operation("operation"),
        SqlText("sqlText"),
        CurrentDbUserName("currentDbUserName"),
        SqlLevel("sqlLevel"),
        ClientIp("clientIp"),
        ClientProgram("clientProgram"),
        ViolationCause("violationCause"),
        ViolationAction("violationAction"),
        Selects("selects"),
        Creates("creates"),
        Alters("alters"),
        Drops("drops"),
        Grants("grants"),
        Revokes("revokes"),
        ;

        private final String value;
        private static java.util.Map<String, SummaryField> map;

        static {
            map = new java.util.HashMap<>();
            for (SummaryField v : SummaryField.values()) {
                map.put(v.getValue(), v);
            }
        }

        SummaryField(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SummaryField create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SummaryField: " + key);
        }
    };

    /** Specifies a subset of summarized fields to be returned in the response. */
    public java.util.List<SummaryField> getSummaryField() {
        return summaryField;
    }
    /**
     * A groupBy can only be used in combination with summaryField parameter. A groupBy value has to
     * be a subset of the values mentioned in summaryField parameter.
     */
    private java.util.List<GroupBy> groupBy;

    /**
     * A groupBy can only be used in combination with summaryField parameter. A groupBy value has to
     * be a subset of the values mentioned in summaryField parameter.
     */
    public enum GroupBy implements com.oracle.bmc.http.internal.BmcEnum {
        DbUserName("dbUserName"),
        TargetName("targetName"),
        OperationTime("operationTime"),
        TimeCollected("timeCollected"),
        ClientOsUserName("clientOsUserName"),
        Operation("operation"),
        SqlText("sqlText"),
        CurrentDbUserName("currentDbUserName"),
        SqlLevel("sqlLevel"),
        ClientIp("clientIp"),
        ClientProgram("clientProgram"),
        ViolationCause("violationCause"),
        ViolationAction("violationAction"),
        ;

        private final String value;
        private static java.util.Map<String, GroupBy> map;

        static {
            map = new java.util.HashMap<>();
            for (GroupBy v : GroupBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        GroupBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GroupBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid GroupBy: " + key);
        }
    };

    /**
     * A groupBy can only be used in combination with summaryField parameter. A groupBy value has to
     * be a subset of the values mentioned in summaryField parameter.
     */
    public java.util.List<GroupBy> getGroupBy() {
        return groupBy;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSqlFirewallViolationAnalyticsRequest, java.lang.Void> {
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
         * An optional filter to return audit events whose creation time in the database is greater
         * than and equal to the date-time specified, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        private java.util.Date timeStarted = null;

        /**
         * An optional filter to return audit events whose creation time in the database is greater
         * than and equal to the date-time specified, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeStarted the value to set
         * @return this builder instance
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            return this;
        }

        /**
         * An optional filter to return audit events whose creation time in the database is less
         * than and equal to the date-time specified, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        private java.util.Date timeEnded = null;

        /**
         * An optional filter to return audit events whose creation time in the database is less
         * than and equal to the date-time specified, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeEnded the value to set
         * @return this builder instance
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            return this;
        }

        /**
         * Default time zone is UTC if no time zone provided. The date-time considerations of the
         * resource will be in accordance with the specified time zone.
         */
        private String queryTimeZone = null;

        /**
         * Default time zone is UTC if no time zone provided. The date-time considerations of the
         * resource will be in accordance with the specified time zone.
         *
         * @param queryTimeZone the value to set
         * @return this builder instance
         */
        public Builder queryTimeZone(String queryTimeZone) {
            this.queryTimeZone = queryTimeZone;
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
         * If this query parameter is specified, the result is sorted by this query parameter value.
         */
        private SortBy sortBy = null;

        /**
         * If this query parameter is specified, the result is sorted by this query parameter value.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The scimQuery query parameter accepts filter expressions that use the syntax described in
         * Section 3.2.2.2 of the System for Cross-Domain Identity Management (SCIM) specification,
         * which is available at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In
         * SCIM filtering expressions, text, date, and time values must be enclosed in quotation
         * marks, with date and time values using ISO-8601 format. (Numeric and boolean values
         * should not be quoted.)
         *
         * <p>*Example:** query=(operationTime ge '2021-06-04T01-00-26') and (violationAction eq
         * 'BLOCKED')
         */
        private String scimQuery = null;

        /**
         * The scimQuery query parameter accepts filter expressions that use the syntax described in
         * Section 3.2.2.2 of the System for Cross-Domain Identity Management (SCIM) specification,
         * which is available at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In
         * SCIM filtering expressions, text, date, and time values must be enclosed in quotation
         * marks, with date and time values using ISO-8601 format. (Numeric and boolean values
         * should not be quoted.)
         *
         * <p>*Example:** query=(operationTime ge '2021-06-04T01-00-26') and (violationAction eq
         * 'BLOCKED')
         *
         * @param scimQuery the value to set
         * @return this builder instance
         */
        public Builder scimQuery(String scimQuery) {
            this.scimQuery = scimQuery;
            return this;
        }

        /** Specifies a subset of summarized fields to be returned in the response. */
        private java.util.List<SummaryField> summaryField = null;

        /**
         * Specifies a subset of summarized fields to be returned in the response.
         *
         * @param summaryField the value to set
         * @return this builder instance
         */
        public Builder summaryField(java.util.List<SummaryField> summaryField) {
            this.summaryField = summaryField;
            return this;
        }

        /**
         * Singular setter. Specifies a subset of summarized fields to be returned in the response.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder summaryField(SummaryField singularValue) {
            return this.summaryField(java.util.Arrays.asList(singularValue));
        }

        /**
         * A groupBy can only be used in combination with summaryField parameter. A groupBy value
         * has to be a subset of the values mentioned in summaryField parameter.
         */
        private java.util.List<GroupBy> groupBy = null;

        /**
         * A groupBy can only be used in combination with summaryField parameter. A groupBy value
         * has to be a subset of the values mentioned in summaryField parameter.
         *
         * @param groupBy the value to set
         * @return this builder instance
         */
        public Builder groupBy(java.util.List<GroupBy> groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        /**
         * Singular setter. A groupBy can only be used in combination with summaryField parameter. A
         * groupBy value has to be a subset of the values mentioned in summaryField parameter.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder groupBy(GroupBy singularValue) {
            return this.groupBy(java.util.Arrays.asList(singularValue));
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(ListSqlFirewallViolationAnalyticsRequest o) {
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            timeStarted(o.getTimeStarted());
            timeEnded(o.getTimeEnded());
            queryTimeZone(o.getQueryTimeZone());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            scimQuery(o.getScimQuery());
            summaryField(o.getSummaryField());
            groupBy(o.getGroupBy());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSqlFirewallViolationAnalyticsRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListSqlFirewallViolationAnalyticsRequest
         */
        public ListSqlFirewallViolationAnalyticsRequest build() {
            ListSqlFirewallViolationAnalyticsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSqlFirewallViolationAnalyticsRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSqlFirewallViolationAnalyticsRequest
         */
        public ListSqlFirewallViolationAnalyticsRequest buildWithoutInvocationCallback() {
            ListSqlFirewallViolationAnalyticsRequest request =
                    new ListSqlFirewallViolationAnalyticsRequest();
            request.compartmentId = compartmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.timeStarted = timeStarted;
            request.timeEnded = timeEnded;
            request.queryTimeZone = queryTimeZone;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.scimQuery = scimQuery;
            request.summaryField = summaryField;
            request.groupBy = groupBy;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ListSqlFirewallViolationAnalyticsRequest(compartmentId, compartmentIdInSubtree,
            // accessLevel, limit, page, opcRequestId, timeStarted, timeEnded, queryTimeZone,
            // sortOrder, sortBy, scimQuery, summaryField, groupBy, opcRetryToken);
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
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .timeStarted(timeStarted)
                .timeEnded(timeEnded)
                .queryTimeZone(queryTimeZone)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .scimQuery(scimQuery)
                .summaryField(summaryField)
                .groupBy(groupBy)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(",timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(",queryTimeZone=").append(String.valueOf(this.queryTimeZone));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",scimQuery=").append(String.valueOf(this.scimQuery));
        sb.append(",summaryField=").append(String.valueOf(this.summaryField));
        sb.append(",groupBy=").append(String.valueOf(this.groupBy));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSqlFirewallViolationAnalyticsRequest)) {
            return false;
        }

        ListSqlFirewallViolationAnalyticsRequest other =
                (ListSqlFirewallViolationAnalyticsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.queryTimeZone, other.queryTimeZone)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.scimQuery, other.scimQuery)
                && java.util.Objects.equals(this.summaryField, other.summaryField)
                && java.util.Objects.equals(this.groupBy, other.groupBy)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
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
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.queryTimeZone == null ? 43 : this.queryTimeZone.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.scimQuery == null ? 43 : this.scimQuery.hashCode());
        result = (result * PRIME) + (this.summaryField == null ? 43 : this.summaryField.hashCode());
        result = (result * PRIME) + (this.groupBy == null ? 43 : this.groupBy.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}

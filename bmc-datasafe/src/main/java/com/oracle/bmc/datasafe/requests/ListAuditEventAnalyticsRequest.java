/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListAuditEventAnalyticsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListAuditEventAnalyticsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListAuditEventAnalyticsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * A filter to return only resources that match the specified compartment OCID.
     */
    private String compartmentId;

    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private Integer limit;

    /**
     * It is usually retrieved from a previous "List" call. For details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * Default is false.
     * When set to true, the hierarchy of compartments is traversed and all compartments and subcompartments in the tenancy are returned. Depends on the 'accessLevel' setting.
     *
     */
    private Boolean compartmentIdInSubtree;

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
     * The scimQuery query parameter accepts filter expressions that use the syntax described in Section 3.2.2.2
     * of the System for Cross-Domain Identity Management (SCIM) specification, which is available
     * at [RFC3339](https://tools.ietf.org/html/draft-ietf-scim-api-12). In SCIM filtering expressions,
     * text, date, and time values must be enclosed in quotation marks, with date and time values using ISO-8601 format.
     * (Numeric and boolean values should not be quoted.)
     * <p>
     **Example:** query=(operationTime ge '2021-06-04T01-00-26') and (eventName eq 'LOGON')
     *
     */
    private String scimQuery;

    /**
     * Specifies a subset of summarized fields to be returned in the response.
     */
    private java.util.List<SummaryField> summaryField;

    /**
     * Specifies a subset of summarized fields to be returned in the response.
     **/
    public enum SummaryField {
        AuditEventTime("auditEventTime"),
        DbUserName("dbUserName"),
        TargetId("targetId"),
        TargetName("targetName"),
        TargetClass("targetClass"),
        ObjectType("objectType"),
        ClientHostname("clientHostname"),
        ClientProgram("clientProgram"),
        ClientId("clientId"),
        AuditType("auditType"),
        EventName("eventName"),
        AllRecord("allRecord"),
        AuditSettingsChange("auditSettingsChange"),
        DbSchemaChange("dbSchemaChange"),
        EntitlementChange("entitlementChange"),
        LoginFailure("loginFailure"),
        LoginSuccess("loginSuccess"),
        AllViolations("allViolations"),
        RealmViolations("realmViolations"),
        RuleViolations("ruleViolations"),
        DvconfigActivities("dvconfigActivities"),
        Ddls("ddls"),
        Dmls("dmls"),
        PrivilegeChanges("privilegeChanges"),
        AuditSettingsEnables("auditSettingsEnables"),
        AuditSettingsDisables("auditSettingsDisables"),
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
    /**
     * An optional filter to return audit events whose creation time in the database is greater than and equal to the date-time specified,
     * in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     */
    private java.util.Date timeStarted;

    /**
     * An optional filter to return audit events whose creation time in the database is less than and equal to the date-time specified,
     * in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     */
    private java.util.Date timeEnded;

    /**
     * Default time zone is UTC if no time zone provided. The date-time considerations of the resource will be in accordance with the specified time zone.
     *
     */
    private String queryTimeZone;

    /**
     * A groupBy can only be used in combination with summaryField parameter.
     * A groupBy value has to be a subset of the values mentioned in summaryField parameter.
     *
     */
    private java.util.List<GroupBy> groupBy;

    /**
     * A groupBy can only be used in combination with summaryField parameter.
     * A groupBy value has to be a subset of the values mentioned in summaryField parameter.
     *
     **/
    public enum GroupBy {
        AuditEventTime("auditEventTime"),
        DbUserName("dbUserName"),
        TargetId("targetId"),
        TargetName("targetName"),
        TargetClass("targetClass"),
        ObjectType("objectType"),
        ClientHostname("clientHostname"),
        ClientProgram("clientProgram"),
        ClientId("clientId"),
        AuditType("auditType"),
        EventName("eventName"),
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
     *
     */
    private String opcRetryToken;

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
     * If this query parameter is specified, the result is ordered based on this query parameter value.
     */
    private SortBy sortBy;

    /**
     * If this query parameter is specified, the result is ordered based on this query parameter value.
     **/
    public enum SortBy {
        TargetId("targetId"),
        TargetClass("targetClass"),
        TargetName("targetName"),
        ObjectType("objectType"),
        DbUserName("dbUserName"),
        EventName("eventName"),
        AuditEventTime("auditEventTime"),
        ClientHostname("clientHostname"),
        ClientProgram("clientProgram"),
        ClientId("clientId"),
        AuditType("auditType"),
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListAuditEventAnalyticsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<SummaryField> summaryField = null;

        /**
         * Specifies a subset of summarized fields to be returned in the response.
         * @return this builder instance
         */
        public Builder summaryField(java.util.List<SummaryField> summaryField) {
            this.summaryField = summaryField;
            return this;
        }

        /**
         * Singular setter. Specifies a subset of summarized fields to be returned in the response.
         * @return this builder instance
         */
        public Builder summaryField(SummaryField singularValue) {
            return this.summaryField(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<GroupBy> groupBy = null;

        /**
         * A groupBy can only be used in combination with summaryField parameter.
         * A groupBy value has to be a subset of the values mentioned in summaryField parameter.
         *
         * @return this builder instance
         */
        public Builder groupBy(java.util.List<GroupBy> groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        /**
         * Singular setter. A groupBy can only be used in combination with summaryField parameter.
         * A groupBy value has to be a subset of the values mentioned in summaryField parameter.
         *
         * @return this builder instance
         */
        public Builder groupBy(GroupBy singularValue) {
            return this.groupBy(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListAuditEventAnalyticsRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            limit(o.getLimit());
            page(o.getPage());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            scimQuery(o.getScimQuery());
            summaryField(o.getSummaryField());
            timeStarted(o.getTimeStarted());
            timeEnded(o.getTimeEnded());
            queryTimeZone(o.getQueryTimeZone());
            groupBy(o.getGroupBy());
            opcRetryToken(o.getOpcRetryToken());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAuditEventAnalyticsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListAuditEventAnalyticsRequest
         */
        public ListAuditEventAnalyticsRequest build() {
            ListAuditEventAnalyticsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}

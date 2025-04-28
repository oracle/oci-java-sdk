/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAttentionLogCountsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * SummarizeAttentionLogCountsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class SummarizeAttentionLogCountsRequest
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
    /** The optional greater than or equal to timestamp to filter the logs. */
    private java.util.Date timeGreaterThanOrEqualTo;

    /** The optional greater than or equal to timestamp to filter the logs. */
    public java.util.Date getTimeGreaterThanOrEqualTo() {
        return timeGreaterThanOrEqualTo;
    }
    /** The optional less than or equal to timestamp to filter the logs. */
    private java.util.Date timeLessThanOrEqualTo;

    /** The optional less than or equal to timestamp to filter the logs. */
    public java.util.Date getTimeLessThanOrEqualTo() {
        return timeLessThanOrEqualTo;
    }
    /** The optional parameter to filter the attention logs by urgency. */
    private UrgencyFilter urgencyFilter;

    /** The optional parameter to filter the attention logs by urgency. */
    public enum UrgencyFilter implements com.oracle.bmc.http.internal.BmcEnum {
        Immediate("IMMEDIATE"),
        Soon("SOON"),
        Deferrable("DEFERRABLE"),
        Info("INFO"),
        All("ALL"),
        ;

        private final String value;
        private static java.util.Map<String, UrgencyFilter> map;

        static {
            map = new java.util.HashMap<>();
            for (UrgencyFilter v : UrgencyFilter.values()) {
                map.put(v.getValue(), v);
            }
        }

        UrgencyFilter(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UrgencyFilter create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid UrgencyFilter: " + key);
        }
    };

    /** The optional parameter to filter the attention logs by urgency. */
    public UrgencyFilter getUrgencyFilter() {
        return urgencyFilter;
    }
    /** The optional parameter used to group different attention logs. */
    private GroupBy groupBy;

    /** The optional parameter used to group different attention logs. */
    public enum GroupBy implements com.oracle.bmc.http.internal.BmcEnum {
        Urgency("URGENCY"),
        Type("TYPE"),
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

    /** The optional parameter used to group different attention logs. */
    public GroupBy getGroupBy() {
        return groupBy;
    }
    /** The optional parameter to filter the attention or alert logs by type. */
    private TypeFilter typeFilter;

    /** The optional parameter to filter the attention or alert logs by type. */
    public enum TypeFilter implements com.oracle.bmc.http.internal.BmcEnum {
        Unknown("UNKNOWN"),
        IncidentError("INCIDENT_ERROR"),
        Error("ERROR"),
        Warning("WARNING"),
        Notification("NOTIFICATION"),
        Trace("TRACE"),
        All("ALL"),
        ;

        private final String value;
        private static java.util.Map<String, TypeFilter> map;

        static {
            map = new java.util.HashMap<>();
            for (TypeFilter v : TypeFilter.values()) {
                map.put(v.getValue(), v);
            }
        }

        TypeFilter(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TypeFilter create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TypeFilter: " + key);
        }
    };

    /** The optional parameter to filter the attention or alert logs by type. */
    public TypeFilter getTypeFilter() {
        return typeFilter;
    }
    /** The optional query parameter to filter the attention or alert logs by search text. */
    private String logSearchText;

    /** The optional query parameter to filter the attention or alert logs by search text. */
    public String getLogSearchText() {
        return logSearchText;
    }
    /** The flag to indicate whether the search text is regular expression or not. */
    private Boolean isRegularExpression;

    /** The flag to indicate whether the search text is regular expression or not. */
    public Boolean getIsRegularExpression() {
        return isRegularExpression;
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
                    SummarizeAttentionLogCountsRequest, java.lang.Void> {
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

        /** The optional greater than or equal to timestamp to filter the logs. */
        private java.util.Date timeGreaterThanOrEqualTo = null;

        /**
         * The optional greater than or equal to timestamp to filter the logs.
         *
         * @param timeGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeGreaterThanOrEqualTo(java.util.Date timeGreaterThanOrEqualTo) {
            this.timeGreaterThanOrEqualTo = timeGreaterThanOrEqualTo;
            return this;
        }

        /** The optional less than or equal to timestamp to filter the logs. */
        private java.util.Date timeLessThanOrEqualTo = null;

        /**
         * The optional less than or equal to timestamp to filter the logs.
         *
         * @param timeLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeLessThanOrEqualTo(java.util.Date timeLessThanOrEqualTo) {
            this.timeLessThanOrEqualTo = timeLessThanOrEqualTo;
            return this;
        }

        /** The optional parameter to filter the attention logs by urgency. */
        private UrgencyFilter urgencyFilter = null;

        /**
         * The optional parameter to filter the attention logs by urgency.
         *
         * @param urgencyFilter the value to set
         * @return this builder instance
         */
        public Builder urgencyFilter(UrgencyFilter urgencyFilter) {
            this.urgencyFilter = urgencyFilter;
            return this;
        }

        /** The optional parameter used to group different attention logs. */
        private GroupBy groupBy = null;

        /**
         * The optional parameter used to group different attention logs.
         *
         * @param groupBy the value to set
         * @return this builder instance
         */
        public Builder groupBy(GroupBy groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        /** The optional parameter to filter the attention or alert logs by type. */
        private TypeFilter typeFilter = null;

        /**
         * The optional parameter to filter the attention or alert logs by type.
         *
         * @param typeFilter the value to set
         * @return this builder instance
         */
        public Builder typeFilter(TypeFilter typeFilter) {
            this.typeFilter = typeFilter;
            return this;
        }

        /** The optional query parameter to filter the attention or alert logs by search text. */
        private String logSearchText = null;

        /**
         * The optional query parameter to filter the attention or alert logs by search text.
         *
         * @param logSearchText the value to set
         * @return this builder instance
         */
        public Builder logSearchText(String logSearchText) {
            this.logSearchText = logSearchText;
            return this;
        }

        /** The flag to indicate whether the search text is regular expression or not. */
        private Boolean isRegularExpression = null;

        /**
         * The flag to indicate whether the search text is regular expression or not.
         *
         * @param isRegularExpression the value to set
         * @return this builder instance
         */
        public Builder isRegularExpression(Boolean isRegularExpression) {
            this.isRegularExpression = isRegularExpression;
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
        public Builder copy(SummarizeAttentionLogCountsRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            timeGreaterThanOrEqualTo(o.getTimeGreaterThanOrEqualTo());
            timeLessThanOrEqualTo(o.getTimeLessThanOrEqualTo());
            urgencyFilter(o.getUrgencyFilter());
            groupBy(o.getGroupBy());
            typeFilter(o.getTypeFilter());
            logSearchText(o.getLogSearchText());
            isRegularExpression(o.getIsRegularExpression());
            page(o.getPage());
            limit(o.getLimit());
            opcRequestId(o.getOpcRequestId());
            opcNamedCredentialId(o.getOpcNamedCredentialId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeAttentionLogCountsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SummarizeAttentionLogCountsRequest
         */
        public SummarizeAttentionLogCountsRequest build() {
            SummarizeAttentionLogCountsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SummarizeAttentionLogCountsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeAttentionLogCountsRequest
         */
        public SummarizeAttentionLogCountsRequest buildWithoutInvocationCallback() {
            SummarizeAttentionLogCountsRequest request = new SummarizeAttentionLogCountsRequest();
            request.managedDatabaseId = managedDatabaseId;
            request.timeGreaterThanOrEqualTo = timeGreaterThanOrEqualTo;
            request.timeLessThanOrEqualTo = timeLessThanOrEqualTo;
            request.urgencyFilter = urgencyFilter;
            request.groupBy = groupBy;
            request.typeFilter = typeFilter;
            request.logSearchText = logSearchText;
            request.isRegularExpression = isRegularExpression;
            request.page = page;
            request.limit = limit;
            request.opcRequestId = opcRequestId;
            request.opcNamedCredentialId = opcNamedCredentialId;
            return request;
            // new SummarizeAttentionLogCountsRequest(managedDatabaseId, timeGreaterThanOrEqualTo,
            // timeLessThanOrEqualTo, urgencyFilter, groupBy, typeFilter, logSearchText,
            // isRegularExpression, page, limit, opcRequestId, opcNamedCredentialId);
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
                .timeGreaterThanOrEqualTo(timeGreaterThanOrEqualTo)
                .timeLessThanOrEqualTo(timeLessThanOrEqualTo)
                .urgencyFilter(urgencyFilter)
                .groupBy(groupBy)
                .typeFilter(typeFilter)
                .logSearchText(logSearchText)
                .isRegularExpression(isRegularExpression)
                .page(page)
                .limit(limit)
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
        sb.append(",timeGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeGreaterThanOrEqualTo));
        sb.append(",timeLessThanOrEqualTo=").append(String.valueOf(this.timeLessThanOrEqualTo));
        sb.append(",urgencyFilter=").append(String.valueOf(this.urgencyFilter));
        sb.append(",groupBy=").append(String.valueOf(this.groupBy));
        sb.append(",typeFilter=").append(String.valueOf(this.typeFilter));
        sb.append(",logSearchText=").append(String.valueOf(this.logSearchText));
        sb.append(",isRegularExpression=").append(String.valueOf(this.isRegularExpression));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
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
        if (!(o instanceof SummarizeAttentionLogCountsRequest)) {
            return false;
        }

        SummarizeAttentionLogCountsRequest other = (SummarizeAttentionLogCountsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(
                        this.timeGreaterThanOrEqualTo, other.timeGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeLessThanOrEqualTo, other.timeLessThanOrEqualTo)
                && java.util.Objects.equals(this.urgencyFilter, other.urgencyFilter)
                && java.util.Objects.equals(this.groupBy, other.groupBy)
                && java.util.Objects.equals(this.typeFilter, other.typeFilter)
                && java.util.Objects.equals(this.logSearchText, other.logSearchText)
                && java.util.Objects.equals(this.isRegularExpression, other.isRegularExpression)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
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
        result =
                (result * PRIME)
                        + (this.timeGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLessThanOrEqualTo == null
                                ? 43
                                : this.timeLessThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.urgencyFilter == null ? 43 : this.urgencyFilter.hashCode());
        result = (result * PRIME) + (this.groupBy == null ? 43 : this.groupBy.hashCode());
        result = (result * PRIME) + (this.typeFilter == null ? 43 : this.typeFilter.hashCode());
        result =
                (result * PRIME)
                        + (this.logSearchText == null ? 43 : this.logSearchText.hashCode());
        result =
                (result * PRIME)
                        + (this.isRegularExpression == null
                                ? 43
                                : this.isRegularExpression.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcNamedCredentialId == null
                                ? 43
                                : this.opcNamedCredentialId.hashCode());
        return result;
    }
}

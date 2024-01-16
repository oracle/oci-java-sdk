/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListFindingAnalyticsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListFindingAnalyticsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListFindingAnalyticsRequest
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
    /** A filter to return only the findings that are marked as top findings. */
    private Boolean isTopFinding;

    /** A filter to return only the findings that are marked as top findings. */
    public Boolean getIsTopFinding() {
        return isTopFinding;
    }
    /** Attribute by which the finding analytics data should be grouped. */
    private GroupBy groupBy;

    /** Attribute by which the finding analytics data should be grouped. */
    public enum GroupBy implements com.oracle.bmc.http.internal.BmcEnum {
        FindingKeyAndTopFindingStatus("findingKeyAndTopFindingStatus"),
        FindingKeyAndSeverity("findingKeyAndSeverity"),
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

    /** Attribute by which the finding analytics data should be grouped. */
    public GroupBy getGroupBy() {
        return groupBy;
    }
    /** An optional filter to return only the top finding that match the specified status. */
    private com.oracle.bmc.datasafe.model.FindingAnalyticsDimensions.TopFindingStatus
            topFindingStatus;

    /** An optional filter to return only the top finding that match the specified status. */
    public com.oracle.bmc.datasafe.model.FindingAnalyticsDimensions.TopFindingStatus
            getTopFindingStatus() {
        return topFindingStatus;
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
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListFindingAnalyticsRequest, java.lang.Void> {
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

        /** A filter to return only the findings that are marked as top findings. */
        private Boolean isTopFinding = null;

        /**
         * A filter to return only the findings that are marked as top findings.
         *
         * @param isTopFinding the value to set
         * @return this builder instance
         */
        public Builder isTopFinding(Boolean isTopFinding) {
            this.isTopFinding = isTopFinding;
            return this;
        }

        /** Attribute by which the finding analytics data should be grouped. */
        private GroupBy groupBy = null;

        /**
         * Attribute by which the finding analytics data should be grouped.
         *
         * @param groupBy the value to set
         * @return this builder instance
         */
        public Builder groupBy(GroupBy groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        /** An optional filter to return only the top finding that match the specified status. */
        private com.oracle.bmc.datasafe.model.FindingAnalyticsDimensions.TopFindingStatus
                topFindingStatus = null;

        /**
         * An optional filter to return only the top finding that match the specified status.
         *
         * @param topFindingStatus the value to set
         * @return this builder instance
         */
        public Builder topFindingStatus(
                com.oracle.bmc.datasafe.model.FindingAnalyticsDimensions.TopFindingStatus
                        topFindingStatus) {
            this.topFindingStatus = topFindingStatus;
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
        public Builder copy(ListFindingAnalyticsRequest o) {
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            isTopFinding(o.getIsTopFinding());
            groupBy(o.getGroupBy());
            topFindingStatus(o.getTopFindingStatus());
            severity(o.getSeverity());
            findingKey(o.getFindingKey());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListFindingAnalyticsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListFindingAnalyticsRequest
         */
        public ListFindingAnalyticsRequest build() {
            ListFindingAnalyticsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListFindingAnalyticsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListFindingAnalyticsRequest
         */
        public ListFindingAnalyticsRequest buildWithoutInvocationCallback() {
            ListFindingAnalyticsRequest request = new ListFindingAnalyticsRequest();
            request.compartmentId = compartmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.isTopFinding = isTopFinding;
            request.groupBy = groupBy;
            request.topFindingStatus = topFindingStatus;
            request.severity = severity;
            request.findingKey = findingKey;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            return request;
            // new ListFindingAnalyticsRequest(compartmentId, compartmentIdInSubtree, accessLevel,
            // isTopFinding, groupBy, topFindingStatus, severity, findingKey, opcRequestId, limit,
            // page);
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
                .isTopFinding(isTopFinding)
                .groupBy(groupBy)
                .topFindingStatus(topFindingStatus)
                .severity(severity)
                .findingKey(findingKey)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page);
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
        sb.append(",isTopFinding=").append(String.valueOf(this.isTopFinding));
        sb.append(",groupBy=").append(String.valueOf(this.groupBy));
        sb.append(",topFindingStatus=").append(String.valueOf(this.topFindingStatus));
        sb.append(",severity=").append(String.valueOf(this.severity));
        sb.append(",findingKey=").append(String.valueOf(this.findingKey));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListFindingAnalyticsRequest)) {
            return false;
        }

        ListFindingAnalyticsRequest other = (ListFindingAnalyticsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(this.isTopFinding, other.isTopFinding)
                && java.util.Objects.equals(this.groupBy, other.groupBy)
                && java.util.Objects.equals(this.topFindingStatus, other.topFindingStatus)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.findingKey, other.findingKey)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
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
        result = (result * PRIME) + (this.isTopFinding == null ? 43 : this.isTopFinding.hashCode());
        result = (result * PRIME) + (this.groupBy == null ? 43 : this.groupBy.hashCode());
        result =
                (result * PRIME)
                        + (this.topFindingStatus == null ? 43 : this.topFindingStatus.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.findingKey == null ? 43 : this.findingKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}

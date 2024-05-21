/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListDiscoveryAnalyticsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDiscoveryAnalyticsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListDiscoveryAnalyticsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * Attribute by which the discovery analytics data should be grouped.
     */
    private GroupBy groupBy;

    /**
     * Attribute by which the discovery analytics data should be grouped.
     **/
    public enum GroupBy {
        TargetId("targetId"),
        SensitiveDataModelId("sensitiveDataModelId"),
        SensitiveTypeId("sensitiveTypeId"),
        TargetIdAndSensitiveDataModelId("targetIdAndSensitiveDataModelId"),
        SensitiveTypeIdAndTargetId("sensitiveTypeIdAndTargetId"),
        SensitiveTypeIdAndSensitiveDataModelId("sensitiveTypeIdAndSensitiveDataModelId"),
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
     * Attribute by which the discovery analytics data should be grouped.
     */
    public GroupBy getGroupBy() {
        return groupBy;
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
     * A filter to return only the resources that match the specified sensitive data model OCID.
     */
    private String sensitiveDataModelId;

    /**
     * A filter to return only the resources that match the specified sensitive data model OCID.
     */
    public String getSensitiveDataModelId() {
        return sensitiveDataModelId;
    }
    /**
     * A filter to return only items related to a specific sensitive type OCID.
     */
    private String sensitiveTypeId;

    /**
     * A filter to return only items related to a specific sensitive type OCID.
     */
    public String getSensitiveTypeId() {
        return sensitiveTypeId;
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
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A filter to return only the common sensitive type resources. Common sensitive types belong to
     * library sensitive types which are frequently used to perform sensitive data discovery.
     *
     */
    private Boolean isCommon;

    /**
     * A filter to return only the common sensitive type resources. Common sensitive types belong to
     * library sensitive types which are frequently used to perform sensitive data discovery.
     *
     */
    public Boolean getIsCommon() {
        return isCommon;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDiscoveryAnalyticsRequest, java.lang.Void> {
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
         * Attribute by which the discovery analytics data should be grouped.
         */
        private GroupBy groupBy = null;

        /**
         * Attribute by which the discovery analytics data should be grouped.
         * @param groupBy the value to set
         * @return this builder instance
         */
        public Builder groupBy(GroupBy groupBy) {
            this.groupBy = groupBy;
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
         * A filter to return only the resources that match the specified sensitive data model OCID.
         */
        private String sensitiveDataModelId = null;

        /**
         * A filter to return only the resources that match the specified sensitive data model OCID.
         * @param sensitiveDataModelId the value to set
         * @return this builder instance
         */
        public Builder sensitiveDataModelId(String sensitiveDataModelId) {
            this.sensitiveDataModelId = sensitiveDataModelId;
            return this;
        }

        /**
         * A filter to return only items related to a specific sensitive type OCID.
         */
        private String sensitiveTypeId = null;

        /**
         * A filter to return only items related to a specific sensitive type OCID.
         * @param sensitiveTypeId the value to set
         * @return this builder instance
         */
        public Builder sensitiveTypeId(String sensitiveTypeId) {
            this.sensitiveTypeId = sensitiveTypeId;
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
         * A filter to return only the common sensitive type resources. Common sensitive types belong to
         * library sensitive types which are frequently used to perform sensitive data discovery.
         *
         */
        private Boolean isCommon = null;

        /**
         * A filter to return only the common sensitive type resources. Common sensitive types belong to
         * library sensitive types which are frequently used to perform sensitive data discovery.
         *
         * @param isCommon the value to set
         * @return this builder instance
         */
        public Builder isCommon(Boolean isCommon) {
            this.isCommon = isCommon;
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
        public Builder copy(ListDiscoveryAnalyticsRequest o) {
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            groupBy(o.getGroupBy());
            targetId(o.getTargetId());
            sensitiveDataModelId(o.getSensitiveDataModelId());
            sensitiveTypeId(o.getSensitiveTypeId());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            isCommon(o.getIsCommon());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDiscoveryAnalyticsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListDiscoveryAnalyticsRequest
         */
        public ListDiscoveryAnalyticsRequest build() {
            ListDiscoveryAnalyticsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDiscoveryAnalyticsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDiscoveryAnalyticsRequest
         */
        public ListDiscoveryAnalyticsRequest buildWithoutInvocationCallback() {
            ListDiscoveryAnalyticsRequest request = new ListDiscoveryAnalyticsRequest();
            request.compartmentId = compartmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.groupBy = groupBy;
            request.targetId = targetId;
            request.sensitiveDataModelId = sensitiveDataModelId;
            request.sensitiveTypeId = sensitiveTypeId;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.isCommon = isCommon;
            return request;
            // new ListDiscoveryAnalyticsRequest(compartmentId, compartmentIdInSubtree, groupBy, targetId, sensitiveDataModelId, sensitiveTypeId, limit, page, opcRequestId, isCommon);
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
                .groupBy(groupBy)
                .targetId(targetId)
                .sensitiveDataModelId(sensitiveDataModelId)
                .sensitiveTypeId(sensitiveTypeId)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .isCommon(isCommon);
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
        sb.append(",groupBy=").append(String.valueOf(this.groupBy));
        sb.append(",targetId=").append(String.valueOf(this.targetId));
        sb.append(",sensitiveDataModelId=").append(String.valueOf(this.sensitiveDataModelId));
        sb.append(",sensitiveTypeId=").append(String.valueOf(this.sensitiveTypeId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isCommon=").append(String.valueOf(this.isCommon));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDiscoveryAnalyticsRequest)) {
            return false;
        }

        ListDiscoveryAnalyticsRequest other = (ListDiscoveryAnalyticsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.groupBy, other.groupBy)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.sensitiveDataModelId, other.sensitiveDataModelId)
                && java.util.Objects.equals(this.sensitiveTypeId, other.sensitiveTypeId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.isCommon, other.isCommon);
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
        result = (result * PRIME) + (this.groupBy == null ? 43 : this.groupBy.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveDataModelId == null
                                ? 43
                                : this.sensitiveDataModelId.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveTypeId == null ? 43 : this.sensitiveTypeId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.isCommon == null ? 43 : this.isCommon.hashCode());
        return result;
    }
}

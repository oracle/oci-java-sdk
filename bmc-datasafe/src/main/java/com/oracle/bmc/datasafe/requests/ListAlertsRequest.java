/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListAlertsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListAlertsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListAlertsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** A filter to return only resources that match the specified compartment OCID. */
    private String compartmentId;

    /** A filter to return only resources that match the specified compartment OCID. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** A filter to return alert by it's OCID. */
    private String id;

    /** A filter to return alert by it's OCID. */
    public String getId() {
        return id;
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
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. If no value is specified timeCreated is default.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. If no value is specified timeCreated is default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        DisplayName("displayName"),
        TimeCreated("timeCreated"),
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. If no value is specified timeCreated is default.
     */
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
     * <p>*Example:** | query=(timeCreated ge '2021-06-04T01-00-26') and (targetNames eq 'target_1')
     * query=(featureDetails.userName eq "user") and (targetNames eq "target_1") Supported fields:
     * severity status alertType targetIds targetNames operationTime lifecycleState displayName
     * timeCreated timeUpdated featureDetails.* (* can be any field in nestedStrMap in Feature
     * Attributes in Alert Summary. For example -
     * userName,object,clientHostname,osUserName,clientIPs,clientId,commandText,commandParam,clientProgram,objectType,targetOwner)
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
     * <p>*Example:** | query=(timeCreated ge '2021-06-04T01-00-26') and (targetNames eq 'target_1')
     * query=(featureDetails.userName eq "user") and (targetNames eq "target_1") Supported fields:
     * severity status alertType targetIds targetNames operationTime lifecycleState displayName
     * timeCreated timeUpdated featureDetails.* (* can be any field in nestedStrMap in Feature
     * Attributes in Alert Summary. For example -
     * userName,object,clientHostname,osUserName,clientIPs,clientId,commandText,commandParam,clientProgram,objectType,targetOwner)
     */
    public String getScimQuery() {
        return scimQuery;
    }
    /** Specifies a subset of fields to be returned in the response. */
    private java.util.List<Field> field;

    /** Specifies a subset of fields to be returned in the response. */
    public enum Field implements com.oracle.bmc.http.internal.BmcEnum {
        Id("id"),
        DisplayName("displayName"),
        AlertType("alertType"),
        TargetIds("targetIds"),
        TargetNames("targetNames"),
        Severity("severity"),
        Status("status"),
        OperationTime("operationTime"),
        Operation("operation"),
        OperationStatus("operationStatus"),
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
        PolicyId("policyId"),
        LifecycleState("lifecycleState"),
        ;

        private final String value;
        private static java.util.Map<String, Field> map;

        static {
            map = new java.util.HashMap<>();
            for (Field v : Field.values()) {
                map.put(v.getValue(), v);
            }
        }

        Field(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Field create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Field: " + key);
        }
    };

    /** Specifies a subset of fields to be returned in the response. */
    public java.util.List<Field> getField() {
        return field;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListAlertsRequest, java.lang.Void> {
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

        /** A filter to return alert by it's OCID. */
        private String id = null;

        /**
         * A filter to return alert by it's OCID.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
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
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. If no value is specified timeCreated is default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. If no value is specified timeCreated is default.
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
         * <p>*Example:** | query=(timeCreated ge '2021-06-04T01-00-26') and (targetNames eq
         * 'target_1') query=(featureDetails.userName eq "user") and (targetNames eq "target_1")
         * Supported fields: severity status alertType targetIds targetNames operationTime
         * lifecycleState displayName timeCreated timeUpdated featureDetails.* (* can be any field
         * in nestedStrMap in Feature Attributes in Alert Summary. For example -
         * userName,object,clientHostname,osUserName,clientIPs,clientId,commandText,commandParam,clientProgram,objectType,targetOwner)
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
         * <p>*Example:** | query=(timeCreated ge '2021-06-04T01-00-26') and (targetNames eq
         * 'target_1') query=(featureDetails.userName eq "user") and (targetNames eq "target_1")
         * Supported fields: severity status alertType targetIds targetNames operationTime
         * lifecycleState displayName timeCreated timeUpdated featureDetails.* (* can be any field
         * in nestedStrMap in Feature Attributes in Alert Summary. For example -
         * userName,object,clientHostname,osUserName,clientIPs,clientId,commandText,commandParam,clientProgram,objectType,targetOwner)
         *
         * @param scimQuery the value to set
         * @return this builder instance
         */
        public Builder scimQuery(String scimQuery) {
            this.scimQuery = scimQuery;
            return this;
        }

        /** Specifies a subset of fields to be returned in the response. */
        private java.util.List<Field> field = null;

        /**
         * Specifies a subset of fields to be returned in the response.
         *
         * @param field the value to set
         * @return this builder instance
         */
        public Builder field(java.util.List<Field> field) {
            this.field = field;
            return this;
        }

        /**
         * Singular setter. Specifies a subset of fields to be returned in the response.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder field(Field singularValue) {
            return this.field(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListAlertsRequest o) {
            compartmentId(o.getCompartmentId());
            id(o.getId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            accessLevel(o.getAccessLevel());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            scimQuery(o.getScimQuery());
            field(o.getField());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAlertsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListAlertsRequest
         */
        public ListAlertsRequest build() {
            ListAlertsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAlertsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAlertsRequest
         */
        public ListAlertsRequest buildWithoutInvocationCallback() {
            ListAlertsRequest request = new ListAlertsRequest();
            request.compartmentId = compartmentId;
            request.id = id;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.accessLevel = accessLevel;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.scimQuery = scimQuery;
            request.field = field;
            return request;
            // new ListAlertsRequest(compartmentId, id, compartmentIdInSubtree, limit, page,
            // opcRequestId, accessLevel, sortOrder, sortBy, scimQuery, field);
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
                .id(id)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .accessLevel(accessLevel)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .scimQuery(scimQuery)
                .field(field);
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
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",scimQuery=").append(String.valueOf(this.scimQuery));
        sb.append(",field=").append(String.valueOf(this.field));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAlertsRequest)) {
            return false;
        }

        ListAlertsRequest other = (ListAlertsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.scimQuery, other.scimQuery)
                && java.util.Objects.equals(this.field, other.field);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.scimQuery == null ? 43 : this.scimQuery.hashCode());
        result = (result * PRIME) + (this.field == null ? 43 : this.field.hashCode());
        return result;
    }
}

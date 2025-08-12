/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListChecksExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListChecksRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListChecksRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the security assessment. */
    private String securityAssessmentId;

    /** The OCID of the security assessment. */
    public String getSecurityAssessmentId() {
        return securityAssessmentId;
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
     * title is ascending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sort order(sortOrder). The default order for
     * title is ascending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Title("title"),
        Category("category"),
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
     * title is ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** A filter to return only checks of a particular risk level. */
    private SuggestedSeverity suggestedSeverity;

    /** A filter to return only checks of a particular risk level. */
    public enum SuggestedSeverity implements com.oracle.bmc.http.internal.BmcEnum {
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW"),
        Evaluate("EVALUATE"),
        Advisory("ADVISORY"),
        Pass("PASS"),
        Deferred("DEFERRED"),
        ;

        private final String value;
        private static java.util.Map<String, SuggestedSeverity> map;

        static {
            map = new java.util.HashMap<>();
            for (SuggestedSeverity v : SuggestedSeverity.values()) {
                map.put(v.getValue(), v);
            }
        }

        SuggestedSeverity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SuggestedSeverity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SuggestedSeverity: " + key);
        }
    };

    /** A filter to return only checks of a particular risk level. */
    public SuggestedSeverity getSuggestedSeverity() {
        return suggestedSeverity;
    }
    /**
     * A filter to return only findings that match the specified risk level(s). Use containsSeverity
     * parameter if need to filter by multiple risk levels.
     */
    private java.util.List<ContainsSeverity> containsSeverity;

    /**
     * A filter to return only findings that match the specified risk level(s). Use containsSeverity
     * parameter if need to filter by multiple risk levels.
     */
    public enum ContainsSeverity implements com.oracle.bmc.http.internal.BmcEnum {
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW"),
        Evaluate("EVALUATE"),
        Advisory("ADVISORY"),
        Pass("PASS"),
        Deferred("DEFERRED"),
        ;

        private final String value;
        private static java.util.Map<String, ContainsSeverity> map;

        static {
            map = new java.util.HashMap<>();
            for (ContainsSeverity v : ContainsSeverity.values()) {
                map.put(v.getValue(), v);
            }
        }

        ContainsSeverity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ContainsSeverity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ContainsSeverity: " + key);
        }
    };

    /**
     * A filter to return only findings that match the specified risk level(s). Use containsSeverity
     * parameter if need to filter by multiple risk levels.
     */
    public java.util.List<ContainsSeverity> getContainsSeverity() {
        return containsSeverity;
    }
    /**
     * An optional filter to return only findings that match the specified references. Use
     * containsReferences param if need to filter by multiple references.
     */
    private java.util.List<com.oracle.bmc.datasafe.model.SecurityAssessmentReferences>
            containsReferences;

    /**
     * An optional filter to return only findings that match the specified references. Use
     * containsReferences param if need to filter by multiple references.
     */
    public java.util.List<com.oracle.bmc.datasafe.model.SecurityAssessmentReferences>
            getContainsReferences() {
        return containsReferences;
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
     * Each check in security assessment has an associated key (think of key as a check's name). For
     * a given check, the key will be the same across targets. The user can use these keys to filter
     * the checks.
     */
    private String key;

    /**
     * Each check in security assessment has an associated key (think of key as a check's name). For
     * a given check, the key will be the same across targets. The user can use these keys to filter
     * the checks.
     */
    public String getKey() {
        return key;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListChecksRequest, java.lang.Void> {
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
         * for title is ascending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can specify only one sort order(sortOrder). The default order
         * for title is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** A filter to return only checks of a particular risk level. */
        private SuggestedSeverity suggestedSeverity = null;

        /**
         * A filter to return only checks of a particular risk level.
         *
         * @param suggestedSeverity the value to set
         * @return this builder instance
         */
        public Builder suggestedSeverity(SuggestedSeverity suggestedSeverity) {
            this.suggestedSeverity = suggestedSeverity;
            return this;
        }

        /**
         * A filter to return only findings that match the specified risk level(s). Use
         * containsSeverity parameter if need to filter by multiple risk levels.
         */
        private java.util.List<ContainsSeverity> containsSeverity = null;

        /**
         * A filter to return only findings that match the specified risk level(s). Use
         * containsSeverity parameter if need to filter by multiple risk levels.
         *
         * @param containsSeverity the value to set
         * @return this builder instance
         */
        public Builder containsSeverity(java.util.List<ContainsSeverity> containsSeverity) {
            this.containsSeverity = containsSeverity;
            return this;
        }

        /**
         * Singular setter. A filter to return only findings that match the specified risk level(s).
         * Use containsSeverity parameter if need to filter by multiple risk levels.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder containsSeverity(ContainsSeverity singularValue) {
            return this.containsSeverity(java.util.Arrays.asList(singularValue));
        }

        /**
         * An optional filter to return only findings that match the specified references. Use
         * containsReferences param if need to filter by multiple references.
         */
        private java.util.List<com.oracle.bmc.datasafe.model.SecurityAssessmentReferences>
                containsReferences = null;

        /**
         * An optional filter to return only findings that match the specified references. Use
         * containsReferences param if need to filter by multiple references.
         *
         * @param containsReferences the value to set
         * @return this builder instance
         */
        public Builder containsReferences(
                java.util.List<com.oracle.bmc.datasafe.model.SecurityAssessmentReferences>
                        containsReferences) {
            this.containsReferences = containsReferences;
            return this;
        }

        /**
         * Singular setter. An optional filter to return only findings that match the specified
         * references. Use containsReferences param if need to filter by multiple references.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder containsReferences(SecurityAssessmentReferences singularValue) {
            return this.containsReferences(java.util.Arrays.asList(singularValue));
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
         * Each check in security assessment has an associated key (think of key as a check's name).
         * For a given check, the key will be the same across targets. The user can use these keys
         * to filter the checks.
         */
        private String key = null;

        /**
         * Each check in security assessment has an associated key (think of key as a check's name).
         * For a given check, the key will be the same across targets. The user can use these keys
         * to filter the checks.
         *
         * @param key the value to set
         * @return this builder instance
         */
        public Builder key(String key) {
            this.key = key;
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
        public Builder copy(ListChecksRequest o) {
            securityAssessmentId(o.getSecurityAssessmentId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            suggestedSeverity(o.getSuggestedSeverity());
            containsSeverity(o.getContainsSeverity());
            containsReferences(o.getContainsReferences());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            key(o.getKey());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListChecksRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListChecksRequest
         */
        public ListChecksRequest build() {
            ListChecksRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListChecksRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListChecksRequest
         */
        public ListChecksRequest buildWithoutInvocationCallback() {
            ListChecksRequest request = new ListChecksRequest();
            request.securityAssessmentId = securityAssessmentId;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.suggestedSeverity = suggestedSeverity;
            request.containsSeverity = containsSeverity;
            request.containsReferences = containsReferences;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.key = key;
            return request;
            // new ListChecksRequest(securityAssessmentId, opcRequestId, limit, page, sortOrder,
            // sortBy, suggestedSeverity, containsSeverity, containsReferences,
            // compartmentIdInSubtree, accessLevel, key);
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
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .suggestedSeverity(suggestedSeverity)
                .containsSeverity(containsSeverity)
                .containsReferences(containsReferences)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel)
                .key(key);
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
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",suggestedSeverity=").append(String.valueOf(this.suggestedSeverity));
        sb.append(",containsSeverity=").append(String.valueOf(this.containsSeverity));
        sb.append(",containsReferences=").append(String.valueOf(this.containsReferences));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
        sb.append(",key=").append(String.valueOf(this.key));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListChecksRequest)) {
            return false;
        }

        ListChecksRequest other = (ListChecksRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.securityAssessmentId, other.securityAssessmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.suggestedSeverity, other.suggestedSeverity)
                && java.util.Objects.equals(this.containsSeverity, other.containsSeverity)
                && java.util.Objects.equals(this.containsReferences, other.containsReferences)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
                && java.util.Objects.equals(this.key, other.key);
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
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.suggestedSeverity == null ? 43 : this.suggestedSeverity.hashCode());
        result =
                (result * PRIME)
                        + (this.containsSeverity == null ? 43 : this.containsSeverity.hashCode());
        result =
                (result * PRIME)
                        + (this.containsReferences == null
                                ? 43
                                : this.containsReferences.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        return result;
    }
}

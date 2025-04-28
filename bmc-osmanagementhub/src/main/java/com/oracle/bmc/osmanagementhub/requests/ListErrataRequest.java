/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListErrataExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListErrataRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ListErrataRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment. This parameter is required and returns only resources contained within the
     * specified compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment. This parameter is required and returns only resources contained within the
     * specified compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The assigned erratum name. It's unique and not changeable.
     *
     * <p>Example: {@code ELSA-2020-5804}
     */
    private java.util.List<String> name;

    /**
     * The assigned erratum name. It's unique and not changeable.
     *
     * <p>Example: {@code ELSA-2020-5804}
     */
    public java.util.List<String> getName() {
        return name;
    }
    /** A filter to return resources that may partially match the erratum name given. */
    private String nameContains;

    /** A filter to return resources that may partially match the erratum name given. */
    public String getNameContains() {
        return nameContains;
    }
    /** A filter to return only packages that match the given update classification type. */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.ClassificationTypes>
            classificationType;

    /** A filter to return only packages that match the given update classification type. */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.ClassificationTypes>
            getClassificationType() {
        return classificationType;
    }
    /** A filter to return only errata that match the given advisory types. */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.AdvisoryTypes> advisoryType;

    /** A filter to return only errata that match the given advisory types. */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.AdvisoryTypes> getAdvisoryType() {
        return advisoryType;
    }
    /** A filter to return only resources that match the given operating system family. */
    private com.oracle.bmc.osmanagementhub.model.OsFamily osFamily;

    /** A filter to return only resources that match the given operating system family. */
    public com.oracle.bmc.osmanagementhub.model.OsFamily getOsFamily() {
        return osFamily;
    }
    /** The advisory severity. */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.AdvisorySeverity> advisorySeverity;

    /** The advisory severity. */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.AdvisorySeverity>
            getAdvisorySeverity() {
        return advisorySeverity;
    }
    /**
     * The issue date after which to list all errata, in ISO 8601 format
     *
     * <p>Example: 2017-07-14T02:40:00.000Z
     */
    private java.util.Date timeIssueDateStart;

    /**
     * The issue date after which to list all errata, in ISO 8601 format
     *
     * <p>Example: 2017-07-14T02:40:00.000Z
     */
    public java.util.Date getTimeIssueDateStart() {
        return timeIssueDateStart;
    }
    /**
     * The issue date before which to list all errata, in ISO 8601 format
     *
     * <p>Example: 2017-07-14T02:40:00.000Z
     */
    private java.util.Date timeIssueDateEnd;

    /**
     * The issue date before which to list all errata, in ISO 8601 format
     *
     * <p>Example: 2017-07-14T02:40:00.000Z
     */
    public java.util.Date getTimeIssueDateEnd() {
        return timeIssueDateEnd;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 3}
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 3}
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.osmanagementhub.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort errata by. Only one sort order may be provided. Default order for
     * timeIssued is descending. Default order for name is ascending. If no value is specified
     * timeIssued is default.
     */
    private SortBy sortBy;

    /**
     * The field to sort errata by. Only one sort order may be provided. Default order for
     * timeIssued is descending. Default order for name is ascending. If no value is specified
     * timeIssued is default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeIssued("timeIssued"),
        Name("name"),
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
     * The field to sort errata by. Only one sort order may be provided. Default order for
     * timeIssued is descending. Default order for name is ascending. If no value is specified
     * timeIssued is default.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListErrataRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment. This parameter is required and returns only resources contained within the
         * specified compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment. This parameter is required and returns only resources contained within the
         * specified compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The assigned erratum name. It's unique and not changeable.
         *
         * <p>Example: {@code ELSA-2020-5804}
         */
        private java.util.List<String> name = null;

        /**
         * The assigned erratum name. It's unique and not changeable.
         *
         * <p>Example: {@code ELSA-2020-5804}
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(java.util.List<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Singular setter. The assigned erratum name. It's unique and not changeable.
         *
         * <p>Example: {@code ELSA-2020-5804}
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder name(String singularValue) {
            return this.name(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return resources that may partially match the erratum name given. */
        private String nameContains = null;

        /**
         * A filter to return resources that may partially match the erratum name given.
         *
         * @param nameContains the value to set
         * @return this builder instance
         */
        public Builder nameContains(String nameContains) {
            this.nameContains = nameContains;
            return this;
        }

        /** A filter to return only packages that match the given update classification type. */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.ClassificationTypes>
                classificationType = null;

        /**
         * A filter to return only packages that match the given update classification type.
         *
         * @param classificationType the value to set
         * @return this builder instance
         */
        public Builder classificationType(
                java.util.List<com.oracle.bmc.osmanagementhub.model.ClassificationTypes>
                        classificationType) {
            this.classificationType = classificationType;
            return this;
        }

        /**
         * Singular setter. A filter to return only packages that match the given update
         * classification type.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder classificationType(ClassificationTypes singularValue) {
            return this.classificationType(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only errata that match the given advisory types. */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.AdvisoryTypes> advisoryType =
                null;

        /**
         * A filter to return only errata that match the given advisory types.
         *
         * @param advisoryType the value to set
         * @return this builder instance
         */
        public Builder advisoryType(
                java.util.List<com.oracle.bmc.osmanagementhub.model.AdvisoryTypes> advisoryType) {
            this.advisoryType = advisoryType;
            return this;
        }

        /**
         * Singular setter. A filter to return only errata that match the given advisory types.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder advisoryType(AdvisoryTypes singularValue) {
            return this.advisoryType(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only resources that match the given operating system family. */
        private com.oracle.bmc.osmanagementhub.model.OsFamily osFamily = null;

        /**
         * A filter to return only resources that match the given operating system family.
         *
         * @param osFamily the value to set
         * @return this builder instance
         */
        public Builder osFamily(com.oracle.bmc.osmanagementhub.model.OsFamily osFamily) {
            this.osFamily = osFamily;
            return this;
        }

        /** The advisory severity. */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.AdvisorySeverity>
                advisorySeverity = null;

        /**
         * The advisory severity.
         *
         * @param advisorySeverity the value to set
         * @return this builder instance
         */
        public Builder advisorySeverity(
                java.util.List<com.oracle.bmc.osmanagementhub.model.AdvisorySeverity>
                        advisorySeverity) {
            this.advisorySeverity = advisorySeverity;
            return this;
        }

        /**
         * Singular setter. The advisory severity.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder advisorySeverity(AdvisorySeverity singularValue) {
            return this.advisorySeverity(java.util.Arrays.asList(singularValue));
        }

        /**
         * The issue date after which to list all errata, in ISO 8601 format
         *
         * <p>Example: 2017-07-14T02:40:00.000Z
         */
        private java.util.Date timeIssueDateStart = null;

        /**
         * The issue date after which to list all errata, in ISO 8601 format
         *
         * <p>Example: 2017-07-14T02:40:00.000Z
         *
         * @param timeIssueDateStart the value to set
         * @return this builder instance
         */
        public Builder timeIssueDateStart(java.util.Date timeIssueDateStart) {
            this.timeIssueDateStart = timeIssueDateStart;
            return this;
        }

        /**
         * The issue date before which to list all errata, in ISO 8601 format
         *
         * <p>Example: 2017-07-14T02:40:00.000Z
         */
        private java.util.Date timeIssueDateEnd = null;

        /**
         * The issue date before which to list all errata, in ISO 8601 format
         *
         * <p>Example: 2017-07-14T02:40:00.000Z
         *
         * @param timeIssueDateEnd the value to set
         * @return this builder instance
         */
        public Builder timeIssueDateEnd(java.util.Date timeIssueDateEnd) {
            this.timeIssueDateEnd = timeIssueDateEnd;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 50}
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 50}
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 3}
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 3}
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort errata by. Only one sort order may be provided. Default order for
         * timeIssued is descending. Default order for name is ascending. If no value is specified
         * timeIssued is default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort errata by. Only one sort order may be provided. Default order for
         * timeIssued is descending. Default order for name is ascending. If no value is specified
         * timeIssued is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(ListErrataRequest o) {
            compartmentId(o.getCompartmentId());
            name(o.getName());
            nameContains(o.getNameContains());
            classificationType(o.getClassificationType());
            advisoryType(o.getAdvisoryType());
            osFamily(o.getOsFamily());
            advisorySeverity(o.getAdvisorySeverity());
            timeIssueDateStart(o.getTimeIssueDateStart());
            timeIssueDateEnd(o.getTimeIssueDateEnd());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListErrataRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListErrataRequest
         */
        public ListErrataRequest build() {
            ListErrataRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListErrataRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListErrataRequest
         */
        public ListErrataRequest buildWithoutInvocationCallback() {
            ListErrataRequest request = new ListErrataRequest();
            request.compartmentId = compartmentId;
            request.name = name;
            request.nameContains = nameContains;
            request.classificationType = classificationType;
            request.advisoryType = advisoryType;
            request.osFamily = osFamily;
            request.advisorySeverity = advisorySeverity;
            request.timeIssueDateStart = timeIssueDateStart;
            request.timeIssueDateEnd = timeIssueDateEnd;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListErrataRequest(compartmentId, name, nameContains, classificationType,
            // advisoryType, osFamily, advisorySeverity, timeIssueDateStart, timeIssueDateEnd,
            // limit, page, sortOrder, sortBy, opcRequestId);
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
                .name(name)
                .nameContains(nameContains)
                .classificationType(classificationType)
                .advisoryType(advisoryType)
                .osFamily(osFamily)
                .advisorySeverity(advisorySeverity)
                .timeIssueDateStart(timeIssueDateStart)
                .timeIssueDateEnd(timeIssueDateEnd)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",nameContains=").append(String.valueOf(this.nameContains));
        sb.append(",classificationType=").append(String.valueOf(this.classificationType));
        sb.append(",advisoryType=").append(String.valueOf(this.advisoryType));
        sb.append(",osFamily=").append(String.valueOf(this.osFamily));
        sb.append(",advisorySeverity=").append(String.valueOf(this.advisorySeverity));
        sb.append(",timeIssueDateStart=").append(String.valueOf(this.timeIssueDateStart));
        sb.append(",timeIssueDateEnd=").append(String.valueOf(this.timeIssueDateEnd));
        sb.append(",limit=").append(String.valueOf(this.limit));
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
        if (!(o instanceof ListErrataRequest)) {
            return false;
        }

        ListErrataRequest other = (ListErrataRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.nameContains, other.nameContains)
                && java.util.Objects.equals(this.classificationType, other.classificationType)
                && java.util.Objects.equals(this.advisoryType, other.advisoryType)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.advisorySeverity, other.advisorySeverity)
                && java.util.Objects.equals(this.timeIssueDateStart, other.timeIssueDateStart)
                && java.util.Objects.equals(this.timeIssueDateEnd, other.timeIssueDateEnd)
                && java.util.Objects.equals(this.limit, other.limit)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.nameContains == null ? 43 : this.nameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.classificationType == null
                                ? 43
                                : this.classificationType.hashCode());
        result = (result * PRIME) + (this.advisoryType == null ? 43 : this.advisoryType.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result =
                (result * PRIME)
                        + (this.advisorySeverity == null ? 43 : this.advisorySeverity.hashCode());
        result =
                (result * PRIME)
                        + (this.timeIssueDateStart == null
                                ? 43
                                : this.timeIssueDateStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeIssueDateEnd == null ? 43 : this.timeIssueDateEnd.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

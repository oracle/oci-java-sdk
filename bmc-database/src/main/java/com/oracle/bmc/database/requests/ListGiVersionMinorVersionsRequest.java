/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListGiVersionMinorVersionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListGiVersionMinorVersionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListGiVersionMinorVersionsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The Oracle Grid Infrastructure major version. */
    private String version;

    /** The Oracle Grid Infrastructure major version. */
    public String getVersion() {
        return version;
    }
    /** The target availability domain. Only passed if the limit is AD-specific. */
    private String availabilityDomain;

    /** The target availability domain. Only passed if the limit is AD-specific. */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }
    /**
     * The compartment
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String compartmentId;

    /**
     * The compartment
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * If provided, filters the results to the set of database versions which are supported for the
     * given shape family.
     */
    private ShapeFamily shapeFamily;

    /**
     * If provided, filters the results to the set of database versions which are supported for the
     * given shape family.
     */
    public enum ShapeFamily implements com.oracle.bmc.http.internal.BmcEnum {
        Singlenode("SINGLENODE"),
        Yoda("YODA"),
        Virtualmachine("VIRTUALMACHINE"),
        Exadata("EXADATA"),
        Exacc("EXACC"),
        ExadbXs("EXADB_XS"),
        ;

        private final String value;
        private static java.util.Map<String, ShapeFamily> map;

        static {
            map = new java.util.HashMap<>();
            for (ShapeFamily v : ShapeFamily.values()) {
                map.put(v.getValue(), v);
            }
        }

        ShapeFamily(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ShapeFamily create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ShapeFamily: " + key);
        }
    };

    /**
     * If provided, filters the results to the set of database versions which are supported for the
     * given shape family.
     */
    public ShapeFamily getShapeFamily() {
        return shapeFamily;
    }
    /**
     * If true, returns the Grid Infrastructure versions that can be used for provisioning a cluster
     */
    private Boolean isGiVersionForProvisioning;

    /**
     * If true, returns the Grid Infrastructure versions that can be used for provisioning a cluster
     */
    public Boolean getIsGiVersionForProvisioning() {
        return isGiVersionForProvisioning;
    }
    /** If provided, filters the results for the given shape. */
    private String shape;

    /** If provided, filters the results for the given shape. */
    public String getShape() {
        return shape;
    }
    /** Sort by VERSION. Default order for VERSION is descending. */
    private SortBy sortBy;

    /** Sort by VERSION. Default order for VERSION is descending. */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Version("VERSION"),
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

    /** Sort by VERSION. Default order for VERSION is descending. */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    private SortOrder sortOrder;

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
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

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /** The maximum number of items to return per page. */
    private Integer limit;

    /** The maximum number of items to return per page. */
    public Integer getLimit() {
        return limit;
    }
    /** The pagination token to continue listing from. */
    private String page;

    /** The pagination token to continue listing from. */
    public String getPage() {
        return page;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListGiVersionMinorVersionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Oracle Grid Infrastructure major version. */
        private String version = null;

        /**
         * The Oracle Grid Infrastructure major version.
         *
         * @param version the value to set
         * @return this builder instance
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /** The target availability domain. Only passed if the limit is AD-specific. */
        private String availabilityDomain = null;

        /**
         * The target availability domain. Only passed if the limit is AD-specific.
         *
         * @param availabilityDomain the value to set
         * @return this builder instance
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            return this;
        }

        /**
         * The compartment
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String compartmentId = null;

        /**
         * The compartment
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
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
         * If provided, filters the results to the set of database versions which are supported for
         * the given shape family.
         */
        private ShapeFamily shapeFamily = null;

        /**
         * If provided, filters the results to the set of database versions which are supported for
         * the given shape family.
         *
         * @param shapeFamily the value to set
         * @return this builder instance
         */
        public Builder shapeFamily(ShapeFamily shapeFamily) {
            this.shapeFamily = shapeFamily;
            return this;
        }

        /**
         * If true, returns the Grid Infrastructure versions that can be used for provisioning a
         * cluster
         */
        private Boolean isGiVersionForProvisioning = null;

        /**
         * If true, returns the Grid Infrastructure versions that can be used for provisioning a
         * cluster
         *
         * @param isGiVersionForProvisioning the value to set
         * @return this builder instance
         */
        public Builder isGiVersionForProvisioning(Boolean isGiVersionForProvisioning) {
            this.isGiVersionForProvisioning = isGiVersionForProvisioning;
            return this;
        }

        /** If provided, filters the results for the given shape. */
        private String shape = null;

        /**
         * If provided, filters the results for the given shape.
         *
         * @param shape the value to set
         * @return this builder instance
         */
        public Builder shape(String shape) {
            this.shape = shape;
            return this;
        }

        /** Sort by VERSION. Default order for VERSION is descending. */
        private SortBy sortBy = null;

        /**
         * Sort by VERSION. Default order for VERSION is descending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** The maximum number of items to return per page. */
        private Integer limit = null;

        /**
         * The maximum number of items to return per page.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The pagination token to continue listing from. */
        private String page = null;

        /**
         * The pagination token to continue listing from.
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
        public Builder copy(ListGiVersionMinorVersionsRequest o) {
            version(o.getVersion());
            availabilityDomain(o.getAvailabilityDomain());
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            shapeFamily(o.getShapeFamily());
            isGiVersionForProvisioning(o.getIsGiVersionForProvisioning());
            shape(o.getShape());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListGiVersionMinorVersionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListGiVersionMinorVersionsRequest
         */
        public ListGiVersionMinorVersionsRequest build() {
            ListGiVersionMinorVersionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListGiVersionMinorVersionsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListGiVersionMinorVersionsRequest
         */
        public ListGiVersionMinorVersionsRequest buildWithoutInvocationCallback() {
            ListGiVersionMinorVersionsRequest request = new ListGiVersionMinorVersionsRequest();
            request.version = version;
            request.availabilityDomain = availabilityDomain;
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.shapeFamily = shapeFamily;
            request.isGiVersionForProvisioning = isGiVersionForProvisioning;
            request.shape = shape;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.limit = limit;
            request.page = page;
            return request;
            // new ListGiVersionMinorVersionsRequest(version, availabilityDomain, compartmentId,
            // opcRequestId, shapeFamily, isGiVersionForProvisioning, shape, sortBy, sortOrder,
            // limit, page);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .version(version)
                .availabilityDomain(availabilityDomain)
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .shapeFamily(shapeFamily)
                .isGiVersionForProvisioning(isGiVersionForProvisioning)
                .shape(shape)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
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
        sb.append(",version=").append(String.valueOf(this.version));
        sb.append(",availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",shapeFamily=").append(String.valueOf(this.shapeFamily));
        sb.append(",isGiVersionForProvisioning=")
                .append(String.valueOf(this.isGiVersionForProvisioning));
        sb.append(",shape=").append(String.valueOf(this.shape));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
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
        if (!(o instanceof ListGiVersionMinorVersionsRequest)) {
            return false;
        }

        ListGiVersionMinorVersionsRequest other = (ListGiVersionMinorVersionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.shapeFamily, other.shapeFamily)
                && java.util.Objects.equals(
                        this.isGiVersionForProvisioning, other.isGiVersionForProvisioning)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.shapeFamily == null ? 43 : this.shapeFamily.hashCode());
        result =
                (result * PRIME)
                        + (this.isGiVersionForProvisioning == null
                                ? 43
                                : this.isGiVersionForProvisioning.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}

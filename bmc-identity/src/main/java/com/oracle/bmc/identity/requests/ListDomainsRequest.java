/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/ListDomainsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDomainsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListDomainsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment (remember that the tenancy is simply the root compartment).
     *
     */
    private String compartmentId;

    /**
     * The OCID of the compartment (remember that the tenancy is simply the root compartment).
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The mutable display name of the identity domain.
     */
    private String displayName;

    /**
     * The mutable display name of the identity domain.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The region-agnostic identity domain URL.
     */
    private String url;

    /**
     * The region-agnostic identity domain URL.
     */
    public String getUrl() {
        return url;
    }
    /**
     * The region-specific identity domain URL.
     */
    private String homeRegionUrl;

    /**
     * The region-specific identity domain URL.
     */
    public String getHomeRegionUrl() {
        return homeRegionUrl;
    }
    /**
     * The identity domain type.
     */
    private String type;

    /**
     * The identity domain type.
     */
    public String getType() {
        return type;
    }
    /**
     * The license type of the identity domain.
     */
    private String licenseType;

    /**
     * The license type of the identity domain.
     */
    public String getLicenseType() {
        return licenseType;
    }
    /**
     * Indicates whether or not the identity domain is visible at the sign-in screen.
     */
    private Boolean isHiddenOnLogin;

    /**
     * Indicates whether or not the identity domain is visible at the sign-in screen.
     */
    public Boolean getIsHiddenOnLogin() {
        return isHiddenOnLogin;
    }
    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     *
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The maximum number of items to return in a paginated "List" call.
     *
     */
    private Integer limit;

    /**
     * The maximum number of items to return in a paginated "List" call.
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A filter to only return resources that match the given name exactly.
     *
     */
    private String name;

    /**
     * A filter to only return resources that match the given name exactly.
     *
     */
    public String getName() {
        return name;
    }
    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for NAME is ascending. The NAME
     * sort order is case sensitive.
     * <p>
     **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by Availability Domain if the scope of the resource type is within a
     * single Availability Domain. If you call one of these "List" operations without specifying
     * an Availability Domain, the resources are grouped by Availability Domain, then sorted.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for NAME is ascending. The NAME
     * sort order is case sensitive.
     * <p>
     **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by Availability Domain if the scope of the resource type is within a
     * single Availability Domain. If you call one of these "List" operations without specifying
     * an Availability Domain, the resources are grouped by Availability Domain, then sorted.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
        Name("NAME"),
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
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for NAME is ascending. The NAME
     * sort order is case sensitive.
     * <p>
     **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by Availability Domain if the scope of the resource type is within a
     * single Availability Domain. If you call one of these "List" operations without specifying
     * an Availability Domain, the resources are grouped by Availability Domain, then sorted.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The NAME sort order
     * is case sensitive.
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The NAME sort order
     * is case sensitive.
     *
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
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The NAME sort order
     * is case sensitive.
     *
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A filter to only return resources that match the given lifecycle state. The state value is case-insensitive.
     *
     */
    private com.oracle.bmc.identity.model.Domain.LifecycleState lifecycleState;

    /**
     * A filter to only return resources that match the given lifecycle state. The state value is case-insensitive.
     *
     */
    public com.oracle.bmc.identity.model.Domain.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDomainsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment (remember that the tenancy is simply the root compartment).
         *
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment (remember that the tenancy is simply the root compartment).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The mutable display name of the identity domain.
         */
        private String displayName = null;

        /**
         * The mutable display name of the identity domain.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The region-agnostic identity domain URL.
         */
        private String url = null;

        /**
         * The region-agnostic identity domain URL.
         * @param url the value to set
         * @return this builder instance
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * The region-specific identity domain URL.
         */
        private String homeRegionUrl = null;

        /**
         * The region-specific identity domain URL.
         * @param homeRegionUrl the value to set
         * @return this builder instance
         */
        public Builder homeRegionUrl(String homeRegionUrl) {
            this.homeRegionUrl = homeRegionUrl;
            return this;
        }

        /**
         * The identity domain type.
         */
        private String type = null;

        /**
         * The identity domain type.
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * The license type of the identity domain.
         */
        private String licenseType = null;

        /**
         * The license type of the identity domain.
         * @param licenseType the value to set
         * @return this builder instance
         */
        public Builder licenseType(String licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        /**
         * Indicates whether or not the identity domain is visible at the sign-in screen.
         */
        private Boolean isHiddenOnLogin = null;

        /**
         * Indicates whether or not the identity domain is visible at the sign-in screen.
         * @param isHiddenOnLogin the value to set
         * @return this builder instance
         */
        public Builder isHiddenOnLogin(Boolean isHiddenOnLogin) {
            this.isHiddenOnLogin = isHiddenOnLogin;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         *
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The maximum number of items to return in a paginated "List" call.
         *
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated "List" call.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * A filter to only return resources that match the given name exactly.
         *
         */
        private String name = null;

        /**
         * A filter to only return resources that match the given name exactly.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
         * TIMECREATED is descending. Default order for NAME is ascending. The NAME
         * sort order is case sensitive.
         * <p>
         **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
         * optionally filter by Availability Domain if the scope of the resource type is within a
         * single Availability Domain. If you call one of these "List" operations without specifying
         * an Availability Domain, the resources are grouped by Availability Domain, then sorted.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
         * TIMECREATED is descending. Default order for NAME is ascending. The NAME
         * sort order is case sensitive.
         * <p>
         **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
         * optionally filter by Availability Domain if the scope of the resource type is within a
         * single Availability Domain. If you call one of these "List" operations without specifying
         * an Availability Domain, the resources are grouped by Availability Domain, then sorted.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The NAME sort order
         * is case sensitive.
         *
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The NAME sort order
         * is case sensitive.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
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
         * A filter to only return resources that match the given lifecycle state. The state value is case-insensitive.
         *
         */
        private com.oracle.bmc.identity.model.Domain.LifecycleState lifecycleState = null;

        /**
         * A filter to only return resources that match the given lifecycle state. The state value is case-insensitive.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.identity.model.Domain.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
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
        public Builder copy(ListDomainsRequest o) {
            compartmentId(o.getCompartmentId());
            displayName(o.getDisplayName());
            url(o.getUrl());
            homeRegionUrl(o.getHomeRegionUrl());
            type(o.getType());
            licenseType(o.getLicenseType());
            isHiddenOnLogin(o.getIsHiddenOnLogin());
            page(o.getPage());
            limit(o.getLimit());
            name(o.getName());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            lifecycleState(o.getLifecycleState());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDomainsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListDomainsRequest
         */
        public ListDomainsRequest build() {
            ListDomainsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDomainsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDomainsRequest
         */
        public ListDomainsRequest buildWithoutInvocationCallback() {
            ListDomainsRequest request = new ListDomainsRequest();
            request.compartmentId = compartmentId;
            request.displayName = displayName;
            request.url = url;
            request.homeRegionUrl = homeRegionUrl;
            request.type = type;
            request.licenseType = licenseType;
            request.isHiddenOnLogin = isHiddenOnLogin;
            request.page = page;
            request.limit = limit;
            request.name = name;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            request.lifecycleState = lifecycleState;
            return request;
            // new ListDomainsRequest(compartmentId, displayName, url, homeRegionUrl, type, licenseType, isHiddenOnLogin, page, limit, name, sortBy, sortOrder, opcRequestId, lifecycleState);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .displayName(displayName)
                .url(url)
                .homeRegionUrl(homeRegionUrl)
                .type(type)
                .licenseType(licenseType)
                .isHiddenOnLogin(isHiddenOnLogin)
                .page(page)
                .limit(limit)
                .name(name)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .opcRequestId(opcRequestId)
                .lifecycleState(lifecycleState);
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
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",url=").append(String.valueOf(this.url));
        sb.append(",homeRegionUrl=").append(String.valueOf(this.homeRegionUrl));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",licenseType=").append(String.valueOf(this.licenseType));
        sb.append(",isHiddenOnLogin=").append(String.valueOf(this.isHiddenOnLogin));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDomainsRequest)) {
            return false;
        }

        ListDomainsRequest other = (ListDomainsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.homeRegionUrl, other.homeRegionUrl)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.licenseType, other.licenseType)
                && java.util.Objects.equals(this.isHiddenOnLogin, other.isHiddenOnLogin)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result =
                (result * PRIME)
                        + (this.homeRegionUrl == null ? 43 : this.homeRegionUrl.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.licenseType == null ? 43 : this.licenseType.hashCode());
        result =
                (result * PRIME)
                        + (this.isHiddenOnLogin == null ? 43 : this.isHiddenOnLogin.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        return result;
    }
}

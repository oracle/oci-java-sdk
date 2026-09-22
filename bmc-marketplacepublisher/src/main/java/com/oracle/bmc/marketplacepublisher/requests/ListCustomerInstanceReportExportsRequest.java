/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.requests;

import com.oracle.bmc.marketplacepublisher.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplacepublisher/ListCustomerInstanceReportExportsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListCustomerInstanceReportExportsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
public class ListCustomerInstanceReportExportsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID of the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * The ID of the compartment in which to list resources.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The maximum number of items to return.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private com.oracle.bmc.marketplacepublisher.model.SortOrder sortOrder;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    public com.oracle.bmc.marketplacepublisher.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for fileName is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for fileName is ascending.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        FileName("fileName"),
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for fileName is ascending.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * A filter to return only resources that match the entire name given.
     */
    private String name;

    /**
     * A filter to return only resources that match the entire name given.
     */
    public String getName() {
        return name;
    }
    /**
     * Listing OCID to query resource against.
     */
    private String listingId;

    /**
     * Listing OCID to query resource against.
     */
    public String getListingId() {
        return listingId;
    }
    /**
     * A filter to return only report records that match the instance status.
     */
    private Status status;

    /**
     * A filter to return only report records that match the instance status.
     **/
    public enum Status {
        Provisioning("PROVISIONING"),
        Running("RUNNING"),
        Stopped("STOPPED"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Disabled("DISABLED"),
        Starting("STARTING"),
        Stopping("STOPPING"),
        Snapshotting("SNAPSHOTTING"),
        ;

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                map.put(v.getValue(), v);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Status: " + key);
        }
    };

    /**
     * A filter to return only report records that match the instance status.
     */
    public Status getStatus() {
        return status;
    }
    /**
     * A filter to return only report records that match the instance shape.
     */
    private String shape;

    /**
     * A filter to return only report records that match the instance shape.
     */
    public String getShape() {
        return shape;
    }
    /**
     * A filter to return only report records that match the instance region.
     */
    private String region;

    /**
     * A filter to return only report records that match the instance region.
     */
    public String getRegion() {
        return region;
    }
    /**
     * A filter to return only report records that match the instance realm.
     */
    private String realm;

    /**
     * A filter to return only report records that match the instance realm.
     */
    public String getRealm() {
        return realm;
    }
    /**
     * A filter to return only report records that match the tenant administrator domain.
     */
    private String tenantAdminDomain;

    /**
     * A filter to return only report records that match the tenant administrator domain.
     */
    public String getTenantAdminDomain() {
        return tenantAdminDomain;
    }
    /**
     * A filter to return only report records that match the package version.
     */
    private String packageVersion;

    /**
     * A filter to return only report records that match the package version.
     */
    public String getPackageVersion() {
        return packageVersion;
    }
    /**
     * A filter to return only report records that match the instance OCID.
     */
    private String instanceOcid;

    /**
     * A filter to return only report records that match the instance OCID.
     */
    public String getInstanceOcid() {
        return instanceOcid;
    }
    /**
     * The inclusive earliest instance creation time, in RFC 3339 format.
     */
    private java.util.Date timeInstanceCreationFromDate;

    /**
     * The inclusive earliest instance creation time, in RFC 3339 format.
     */
    public java.util.Date getTimeInstanceCreationFromDate() {
        return timeInstanceCreationFromDate;
    }
    /**
     * The inclusive latest instance creation time, in RFC 3339 format.
     */
    private java.util.Date timeInstanceCreationToDate;

    /**
     * The inclusive latest instance creation time, in RFC 3339 format.
     */
    public java.util.Date getTimeInstanceCreationToDate() {
        return timeInstanceCreationToDate;
    }
    /**
     * The inclusive earliest instance termination time, in RFC 3339 format.
     */
    private java.util.Date timeInstanceTerminationFromDate;

    /**
     * The inclusive earliest instance termination time, in RFC 3339 format.
     */
    public java.util.Date getTimeInstanceTerminationFromDate() {
        return timeInstanceTerminationFromDate;
    }
    /**
     * The inclusive latest instance termination time, in RFC 3339 format.
     */
    private java.util.Date timeInstanceTerminationToDate;

    /**
     * The inclusive latest instance termination time, in RFC 3339 format.
     */
    public java.util.Date getTimeInstanceTerminationToDate() {
        return timeInstanceTerminationToDate;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCustomerInstanceReportExportsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ID of the compartment in which to list resources.
         */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The maximum number of items to return.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of a previous response.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         */
        private com.oracle.bmc.marketplacepublisher.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.marketplacepublisher.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for fileName is ascending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for fileName is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * A filter to return only resources that match the entire name given.
         */
        private String name = null;

        /**
         * A filter to return only resources that match the entire name given.
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Listing OCID to query resource against.
         */
        private String listingId = null;

        /**
         * Listing OCID to query resource against.
         * @param listingId the value to set
         * @return this builder instance
         */
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            return this;
        }

        /**
         * A filter to return only report records that match the instance status.
         */
        private Status status = null;

        /**
         * A filter to return only report records that match the instance status.
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(Status status) {
            this.status = status;
            return this;
        }

        /**
         * A filter to return only report records that match the instance shape.
         */
        private String shape = null;

        /**
         * A filter to return only report records that match the instance shape.
         * @param shape the value to set
         * @return this builder instance
         */
        public Builder shape(String shape) {
            this.shape = shape;
            return this;
        }

        /**
         * A filter to return only report records that match the instance region.
         */
        private String region = null;

        /**
         * A filter to return only report records that match the instance region.
         * @param region the value to set
         * @return this builder instance
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * A filter to return only report records that match the instance realm.
         */
        private String realm = null;

        /**
         * A filter to return only report records that match the instance realm.
         * @param realm the value to set
         * @return this builder instance
         */
        public Builder realm(String realm) {
            this.realm = realm;
            return this;
        }

        /**
         * A filter to return only report records that match the tenant administrator domain.
         */
        private String tenantAdminDomain = null;

        /**
         * A filter to return only report records that match the tenant administrator domain.
         * @param tenantAdminDomain the value to set
         * @return this builder instance
         */
        public Builder tenantAdminDomain(String tenantAdminDomain) {
            this.tenantAdminDomain = tenantAdminDomain;
            return this;
        }

        /**
         * A filter to return only report records that match the package version.
         */
        private String packageVersion = null;

        /**
         * A filter to return only report records that match the package version.
         * @param packageVersion the value to set
         * @return this builder instance
         */
        public Builder packageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }

        /**
         * A filter to return only report records that match the instance OCID.
         */
        private String instanceOcid = null;

        /**
         * A filter to return only report records that match the instance OCID.
         * @param instanceOcid the value to set
         * @return this builder instance
         */
        public Builder instanceOcid(String instanceOcid) {
            this.instanceOcid = instanceOcid;
            return this;
        }

        /**
         * The inclusive earliest instance creation time, in RFC 3339 format.
         */
        private java.util.Date timeInstanceCreationFromDate = null;

        /**
         * The inclusive earliest instance creation time, in RFC 3339 format.
         * @param timeInstanceCreationFromDate the value to set
         * @return this builder instance
         */
        public Builder timeInstanceCreationFromDate(java.util.Date timeInstanceCreationFromDate) {
            this.timeInstanceCreationFromDate = timeInstanceCreationFromDate;
            return this;
        }

        /**
         * The inclusive latest instance creation time, in RFC 3339 format.
         */
        private java.util.Date timeInstanceCreationToDate = null;

        /**
         * The inclusive latest instance creation time, in RFC 3339 format.
         * @param timeInstanceCreationToDate the value to set
         * @return this builder instance
         */
        public Builder timeInstanceCreationToDate(java.util.Date timeInstanceCreationToDate) {
            this.timeInstanceCreationToDate = timeInstanceCreationToDate;
            return this;
        }

        /**
         * The inclusive earliest instance termination time, in RFC 3339 format.
         */
        private java.util.Date timeInstanceTerminationFromDate = null;

        /**
         * The inclusive earliest instance termination time, in RFC 3339 format.
         * @param timeInstanceTerminationFromDate the value to set
         * @return this builder instance
         */
        public Builder timeInstanceTerminationFromDate(
                java.util.Date timeInstanceTerminationFromDate) {
            this.timeInstanceTerminationFromDate = timeInstanceTerminationFromDate;
            return this;
        }

        /**
         * The inclusive latest instance termination time, in RFC 3339 format.
         */
        private java.util.Date timeInstanceTerminationToDate = null;

        /**
         * The inclusive latest instance termination time, in RFC 3339 format.
         * @param timeInstanceTerminationToDate the value to set
         * @return this builder instance
         */
        public Builder timeInstanceTerminationToDate(java.util.Date timeInstanceTerminationToDate) {
            this.timeInstanceTerminationToDate = timeInstanceTerminationToDate;
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
        public Builder copy(ListCustomerInstanceReportExportsRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            name(o.getName());
            listingId(o.getListingId());
            status(o.getStatus());
            shape(o.getShape());
            region(o.getRegion());
            realm(o.getRealm());
            tenantAdminDomain(o.getTenantAdminDomain());
            packageVersion(o.getPackageVersion());
            instanceOcid(o.getInstanceOcid());
            timeInstanceCreationFromDate(o.getTimeInstanceCreationFromDate());
            timeInstanceCreationToDate(o.getTimeInstanceCreationToDate());
            timeInstanceTerminationFromDate(o.getTimeInstanceTerminationFromDate());
            timeInstanceTerminationToDate(o.getTimeInstanceTerminationToDate());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCustomerInstanceReportExportsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListCustomerInstanceReportExportsRequest
         */
        public ListCustomerInstanceReportExportsRequest build() {
            ListCustomerInstanceReportExportsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCustomerInstanceReportExportsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCustomerInstanceReportExportsRequest
         */
        public ListCustomerInstanceReportExportsRequest buildWithoutInvocationCallback() {
            ListCustomerInstanceReportExportsRequest request =
                    new ListCustomerInstanceReportExportsRequest();
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.name = name;
            request.listingId = listingId;
            request.status = status;
            request.shape = shape;
            request.region = region;
            request.realm = realm;
            request.tenantAdminDomain = tenantAdminDomain;
            request.packageVersion = packageVersion;
            request.instanceOcid = instanceOcid;
            request.timeInstanceCreationFromDate = timeInstanceCreationFromDate;
            request.timeInstanceCreationToDate = timeInstanceCreationToDate;
            request.timeInstanceTerminationFromDate = timeInstanceTerminationFromDate;
            request.timeInstanceTerminationToDate = timeInstanceTerminationToDate;
            return request;
            // new ListCustomerInstanceReportExportsRequest(compartmentId, opcRequestId, limit, page, sortOrder, sortBy, name, listingId, status, shape, region, realm, tenantAdminDomain, packageVersion, instanceOcid, timeInstanceCreationFromDate, timeInstanceCreationToDate, timeInstanceTerminationFromDate, timeInstanceTerminationToDate);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .name(name)
                .listingId(listingId)
                .status(status)
                .shape(shape)
                .region(region)
                .realm(realm)
                .tenantAdminDomain(tenantAdminDomain)
                .packageVersion(packageVersion)
                .instanceOcid(instanceOcid)
                .timeInstanceCreationFromDate(timeInstanceCreationFromDate)
                .timeInstanceCreationToDate(timeInstanceCreationToDate)
                .timeInstanceTerminationFromDate(timeInstanceTerminationFromDate)
                .timeInstanceTerminationToDate(timeInstanceTerminationToDate);
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
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",listingId=").append(String.valueOf(this.listingId));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",shape=").append(String.valueOf(this.shape));
        sb.append(",region=").append(String.valueOf(this.region));
        sb.append(",realm=").append(String.valueOf(this.realm));
        sb.append(",tenantAdminDomain=").append(String.valueOf(this.tenantAdminDomain));
        sb.append(",packageVersion=").append(String.valueOf(this.packageVersion));
        sb.append(",instanceOcid=").append(String.valueOf(this.instanceOcid));
        sb.append(",timeInstanceCreationFromDate=")
                .append(String.valueOf(this.timeInstanceCreationFromDate));
        sb.append(",timeInstanceCreationToDate=")
                .append(String.valueOf(this.timeInstanceCreationToDate));
        sb.append(",timeInstanceTerminationFromDate=")
                .append(String.valueOf(this.timeInstanceTerminationFromDate));
        sb.append(",timeInstanceTerminationToDate=")
                .append(String.valueOf(this.timeInstanceTerminationToDate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListCustomerInstanceReportExportsRequest)) {
            return false;
        }

        ListCustomerInstanceReportExportsRequest other =
                (ListCustomerInstanceReportExportsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.realm, other.realm)
                && java.util.Objects.equals(this.tenantAdminDomain, other.tenantAdminDomain)
                && java.util.Objects.equals(this.packageVersion, other.packageVersion)
                && java.util.Objects.equals(this.instanceOcid, other.instanceOcid)
                && java.util.Objects.equals(
                        this.timeInstanceCreationFromDate, other.timeInstanceCreationFromDate)
                && java.util.Objects.equals(
                        this.timeInstanceCreationToDate, other.timeInstanceCreationToDate)
                && java.util.Objects.equals(
                        this.timeInstanceTerminationFromDate, other.timeInstanceTerminationFromDate)
                && java.util.Objects.equals(
                        this.timeInstanceTerminationToDate, other.timeInstanceTerminationToDate);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.realm == null ? 43 : this.realm.hashCode());
        result =
                (result * PRIME)
                        + (this.tenantAdminDomain == null ? 43 : this.tenantAdminDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.packageVersion == null ? 43 : this.packageVersion.hashCode());
        result = (result * PRIME) + (this.instanceOcid == null ? 43 : this.instanceOcid.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInstanceCreationFromDate == null
                                ? 43
                                : this.timeInstanceCreationFromDate.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInstanceCreationToDate == null
                                ? 43
                                : this.timeInstanceCreationToDate.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInstanceTerminationFromDate == null
                                ? 43
                                : this.timeInstanceTerminationFromDate.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInstanceTerminationToDate == null
                                ? 43
                                : this.timeInstanceTerminationToDate.hashCode());
        return result;
    }
}

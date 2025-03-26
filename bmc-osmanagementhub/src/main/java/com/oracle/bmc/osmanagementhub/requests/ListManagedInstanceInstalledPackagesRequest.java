/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagedInstanceInstalledPackagesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListManagedInstanceInstalledPackagesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ListManagedInstanceInstalledPackagesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance.
     */
    private String managedInstanceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance.
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }
    /**
     * A filter to return resources that match the given display names.
     */
    private java.util.List<String> displayName;

    /**
     * A filter to return resources that match the given display names.
     */
    public java.util.List<String> getDisplayName() {
        return displayName;
    }
    /**
     * A filter to return resources that may partially match the given display name.
     */
    private String displayNameContains;

    /**
     * A filter to return resources that may partially match the given display name.
     */
    public String getDisplayNameContains() {
        return displayNameContains;
    }
    /**
     * The install date after which to list all packages, in ISO 8601 format
     * <p>
     * Example: 2017-07-14T02:40:00.000Z
     *
     */
    private java.util.Date timeInstallDateStart;

    /**
     * The install date after which to list all packages, in ISO 8601 format
     * <p>
     * Example: 2017-07-14T02:40:00.000Z
     *
     */
    public java.util.Date getTimeInstallDateStart() {
        return timeInstallDateStart;
    }
    /**
     * A filter to return only packages that were installed on or before the date provided, in ISO 8601 format.
     * <p>
     * Example: 2017-07-14T02:40:00.000Z
     *
     */
    private java.util.Date timeInstallDateEnd;

    /**
     * A filter to return only packages that were installed on or before the date provided, in ISO 8601 format.
     * <p>
     * Example: 2017-07-14T02:40:00.000Z
     *
     */
    public java.util.Date getTimeInstallDateEnd() {
        return timeInstallDateEnd;
    }
    /**
     * The OCID of the compartment that contains the resources to list. This filter returns only resources contained within the specified compartment.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment that contains the resources to list. This filter returns only resources contained within the specified compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 50}
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 50}
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 3}
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 3}
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    public com.oracle.bmc.osmanagementhub.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeInstalled is descending. Default order for displayName is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeInstalled is descending. Default order for displayName is ascending.
     *
     **/
    public enum SortBy {
        TimeInstalled("timeInstalled"),
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
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
     * The field to sort by. Only one sort order may be provided. Default order for timeInstalled is descending. Default order for displayName is ascending.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListManagedInstanceInstalledPackagesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance.
         */
        private String managedInstanceId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance.
         * @param managedInstanceId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            return this;
        }

        /**
         * A filter to return resources that match the given display names.
         */
        private java.util.List<String> displayName = null;

        /**
         * A filter to return resources that match the given display names.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(java.util.List<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Singular setter. A filter to return resources that match the given display names.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder displayName(String singularValue) {
            return this.displayName(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return resources that may partially match the given display name.
         */
        private String displayNameContains = null;

        /**
         * A filter to return resources that may partially match the given display name.
         * @param displayNameContains the value to set
         * @return this builder instance
         */
        public Builder displayNameContains(String displayNameContains) {
            this.displayNameContains = displayNameContains;
            return this;
        }

        /**
         * The install date after which to list all packages, in ISO 8601 format
         * <p>
         * Example: 2017-07-14T02:40:00.000Z
         *
         */
        private java.util.Date timeInstallDateStart = null;

        /**
         * The install date after which to list all packages, in ISO 8601 format
         * <p>
         * Example: 2017-07-14T02:40:00.000Z
         *
         * @param timeInstallDateStart the value to set
         * @return this builder instance
         */
        public Builder timeInstallDateStart(java.util.Date timeInstallDateStart) {
            this.timeInstallDateStart = timeInstallDateStart;
            return this;
        }

        /**
         * A filter to return only packages that were installed on or before the date provided, in ISO 8601 format.
         * <p>
         * Example: 2017-07-14T02:40:00.000Z
         *
         */
        private java.util.Date timeInstallDateEnd = null;

        /**
         * A filter to return only packages that were installed on or before the date provided, in ISO 8601 format.
         * <p>
         * Example: 2017-07-14T02:40:00.000Z
         *
         * @param timeInstallDateEnd the value to set
         * @return this builder instance
         */
        public Builder timeInstallDateEnd(java.util.Date timeInstallDateEnd) {
            this.timeInstallDateEnd = timeInstallDateEnd;
            return this;
        }

        /**
         * The OCID of the compartment that contains the resources to list. This filter returns only resources contained within the specified compartment.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment that contains the resources to list. This filter returns only resources contained within the specified compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 50}
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 50}
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 3}
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 3}
         *
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
        private com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeInstalled is descending. Default order for displayName is ascending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeInstalled is descending. Default order for displayName is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(ListManagedInstanceInstalledPackagesRequest o) {
            managedInstanceId(o.getManagedInstanceId());
            displayName(o.getDisplayName());
            displayNameContains(o.getDisplayNameContains());
            timeInstallDateStart(o.getTimeInstallDateStart());
            timeInstallDateEnd(o.getTimeInstallDateEnd());
            compartmentId(o.getCompartmentId());
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
         * Build the instance of ListManagedInstanceInstalledPackagesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListManagedInstanceInstalledPackagesRequest
         */
        public ListManagedInstanceInstalledPackagesRequest build() {
            ListManagedInstanceInstalledPackagesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListManagedInstanceInstalledPackagesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListManagedInstanceInstalledPackagesRequest
         */
        public ListManagedInstanceInstalledPackagesRequest buildWithoutInvocationCallback() {
            ListManagedInstanceInstalledPackagesRequest request =
                    new ListManagedInstanceInstalledPackagesRequest();
            request.managedInstanceId = managedInstanceId;
            request.displayName = displayName;
            request.displayNameContains = displayNameContains;
            request.timeInstallDateStart = timeInstallDateStart;
            request.timeInstallDateEnd = timeInstallDateEnd;
            request.compartmentId = compartmentId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListManagedInstanceInstalledPackagesRequest(managedInstanceId, displayName, displayNameContains, timeInstallDateStart, timeInstallDateEnd, compartmentId, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedInstanceId(managedInstanceId)
                .displayName(displayName)
                .displayNameContains(displayNameContains)
                .timeInstallDateStart(timeInstallDateStart)
                .timeInstallDateEnd(timeInstallDateEnd)
                .compartmentId(compartmentId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId);
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
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",timeInstallDateStart=").append(String.valueOf(this.timeInstallDateStart));
        sb.append(",timeInstallDateEnd=").append(String.valueOf(this.timeInstallDateEnd));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
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
        if (!(o instanceof ListManagedInstanceInstalledPackagesRequest)) {
            return false;
        }

        ListManagedInstanceInstalledPackagesRequest other =
                (ListManagedInstanceInstalledPackagesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
                && java.util.Objects.equals(this.timeInstallDateStart, other.timeInstallDateStart)
                && java.util.Objects.equals(this.timeInstallDateEnd, other.timeInstallDateEnd)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
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
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.displayNameContains == null
                                ? 43
                                : this.displayNameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInstallDateStart == null
                                ? 43
                                : this.timeInstallDateStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInstallDateEnd == null
                                ? 43
                                : this.timeInstallDateEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

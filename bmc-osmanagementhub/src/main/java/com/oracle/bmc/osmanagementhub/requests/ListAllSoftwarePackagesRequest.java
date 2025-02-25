/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListAllSoftwarePackagesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListAllSoftwarePackagesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ListAllSoftwarePackagesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * A filter to return resources that match the given user-friendly name.
     */
    private String displayName;

    /**
     * A filter to return resources that match the given user-friendly name.
     */
    public String getDisplayName() {
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
     * A filter to return software packages that match the given version.
     */
    private String version;

    /**
     * A filter to return software packages that match the given version.
     */
    public String getVersion() {
        return version;
    }
    /**
     * A filter to return software packages that match the given architecture.
     */
    private com.oracle.bmc.osmanagementhub.model.SoftwarePackageArchitecture architecture;

    /**
     * A filter to return software packages that match the given architecture.
     */
    public com.oracle.bmc.osmanagementhub.model.SoftwarePackageArchitecture getArchitecture() {
        return architecture;
    }
    /**
     * Indicates whether to list only the latest versions of packages, module streams, and stream profiles.
     */
    private Boolean isLatest;

    /**
     * Indicates whether to list only the latest versions of packages, module streams, and stream profiles.
     */
    public Boolean getIsLatest() {
        return isLatest;
    }
    /**
     * A filter to return only resources that match the given operating system family.
     */
    private com.oracle.bmc.osmanagementhub.model.OsFamily osFamily;

    /**
     * A filter to return only resources that match the given operating system family.
     */
    public com.oracle.bmc.osmanagementhub.model.OsFamily getOsFamily() {
        return osFamily;
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
     * The field to sort packages by. Only one sort order may be provided. Default order for displayName is ascending. If no value is specified displayName is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort packages by. Only one sort order may be provided. Default order for displayName is ascending. If no value is specified displayName is default.
     *
     **/
    public enum SortBy {
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
     * The field to sort packages by. Only one sort order may be provided. Default order for displayName is ascending. If no value is specified displayName is default.
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
                    ListAllSoftwarePackagesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * A filter to return resources that match the given user-friendly name.
         */
        private String displayName = null;

        /**
         * A filter to return resources that match the given user-friendly name.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
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
         * A filter to return software packages that match the given version.
         */
        private String version = null;

        /**
         * A filter to return software packages that match the given version.
         * @param version the value to set
         * @return this builder instance
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * A filter to return software packages that match the given architecture.
         */
        private com.oracle.bmc.osmanagementhub.model.SoftwarePackageArchitecture architecture =
                null;

        /**
         * A filter to return software packages that match the given architecture.
         * @param architecture the value to set
         * @return this builder instance
         */
        public Builder architecture(
                com.oracle.bmc.osmanagementhub.model.SoftwarePackageArchitecture architecture) {
            this.architecture = architecture;
            return this;
        }

        /**
         * Indicates whether to list only the latest versions of packages, module streams, and stream profiles.
         */
        private Boolean isLatest = null;

        /**
         * Indicates whether to list only the latest versions of packages, module streams, and stream profiles.
         * @param isLatest the value to set
         * @return this builder instance
         */
        public Builder isLatest(Boolean isLatest) {
            this.isLatest = isLatest;
            return this;
        }

        /**
         * A filter to return only resources that match the given operating system family.
         */
        private com.oracle.bmc.osmanagementhub.model.OsFamily osFamily = null;

        /**
         * A filter to return only resources that match the given operating system family.
         * @param osFamily the value to set
         * @return this builder instance
         */
        public Builder osFamily(com.oracle.bmc.osmanagementhub.model.OsFamily osFamily) {
            this.osFamily = osFamily;
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
         * The field to sort packages by. Only one sort order may be provided. Default order for displayName is ascending. If no value is specified displayName is default.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort packages by. Only one sort order may be provided. Default order for displayName is ascending. If no value is specified displayName is default.
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
        public Builder copy(ListAllSoftwarePackagesRequest o) {
            displayName(o.getDisplayName());
            displayNameContains(o.getDisplayNameContains());
            version(o.getVersion());
            architecture(o.getArchitecture());
            isLatest(o.getIsLatest());
            osFamily(o.getOsFamily());
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
         * Build the instance of ListAllSoftwarePackagesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListAllSoftwarePackagesRequest
         */
        public ListAllSoftwarePackagesRequest build() {
            ListAllSoftwarePackagesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAllSoftwarePackagesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAllSoftwarePackagesRequest
         */
        public ListAllSoftwarePackagesRequest buildWithoutInvocationCallback() {
            ListAllSoftwarePackagesRequest request = new ListAllSoftwarePackagesRequest();
            request.displayName = displayName;
            request.displayNameContains = displayNameContains;
            request.version = version;
            request.architecture = architecture;
            request.isLatest = isLatest;
            request.osFamily = osFamily;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListAllSoftwarePackagesRequest(displayName, displayNameContains, version, architecture, isLatest, osFamily, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .displayName(displayName)
                .displayNameContains(displayNameContains)
                .version(version)
                .architecture(architecture)
                .isLatest(isLatest)
                .osFamily(osFamily)
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
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",version=").append(String.valueOf(this.version));
        sb.append(",architecture=").append(String.valueOf(this.architecture));
        sb.append(",isLatest=").append(String.valueOf(this.isLatest));
        sb.append(",osFamily=").append(String.valueOf(this.osFamily));
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
        if (!(o instanceof ListAllSoftwarePackagesRequest)) {
            return false;
        }

        ListAllSoftwarePackagesRequest other = (ListAllSoftwarePackagesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(this.isLatest, other.isLatest)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.displayNameContains == null
                                ? 43
                                : this.displayNameContains.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        result = (result * PRIME) + (this.isLatest == null ? 43 : this.isLatest.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

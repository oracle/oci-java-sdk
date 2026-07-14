/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.requests;

import com.oracle.bmc.datacc.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacc/ListVmClusterNetworksExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListVmClusterNetworksRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class ListVmClusterNetworksRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment. For list operations, you may provide the tenant [OCID] in this field. When a
     * tenant OCID is provided, it will be validated against the caller's tenant and then treated as
     * tenant scope (compartmentId filtering is not applied).
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment. For list operations, you may provide the tenant [OCID] in this field. When a
     * tenant OCID is provided, it will be validated against the caller's tenant and then treated as
     * tenant scope (compartmentId filtering is not applied).
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return resources that match the entire display name given. The match is case
     * sensitive.
     */
    private String displayName;

    /**
     * A filter to return resources that match the entire display name given. The match is case
     * sensitive.
     */
    public String getDisplayName() {
        return displayName;
    }
    /** A filter to return resources that match the specified lifecycle state. */
    private java.util.List<com.oracle.bmc.datacc.model.VmClusterNetworkLifecycleState>
            lifecycleState;

    /** A filter to return resources that match the specified lifecycle state. */
    public java.util.List<com.oracle.bmc.datacc.model.VmClusterNetworkLifecycleState>
            getLifecycleState() {
        return lifecycleState;
    }
    /** A filter to return VM cluster network resources that matches the specified value. */
    private Boolean isScanEnabled;

    /** A filter to return VM cluster network resources that matches the specified value. */
    public Boolean getIsScanEnabled() {
        return isScanEnabled;
    }
    /** The maximum number of items to return in a page. */
    private Integer limit;

    /** The maximum number of items to return in a page. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which you want to start retrieving results. This
     * token is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which you want to start retrieving results. This
     * token is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The sort order that you want to use, which is either {@code ASC} or {@code DESC}. */
    private com.oracle.bmc.datacc.model.SortOrder sortOrder;

    /** The sort order that you want to use, which is either {@code ASC} or {@code DESC}. */
    public com.oracle.bmc.datacc.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field by which you want to sort. You can provide only one type of sort order. The default
     * order for {@code timeCreated} is descending. The default order for {@code displayName} is
     * ascending. If no value is specified, then {@code timeCreated} is the default. When listing
     * software images within the same {@code version}, using {@code sortBy=buildIdentifier} is
     * recommended. {@code buildIdentifier} is a monotonically increasing, time-ordered string
     * marker (yyyy-mm-dd-hh:mm:ss) stored with the image.
     */
    private SortBy sortBy;

    /**
     * The field by which you want to sort. You can provide only one type of sort order. The default
     * order for {@code timeCreated} is descending. The default order for {@code displayName} is
     * ascending. If no value is specified, then {@code timeCreated} is the default. When listing
     * software images within the same {@code version}, using {@code sortBy=buildIdentifier} is
     * recommended. {@code buildIdentifier} is a monotonically increasing, time-ordered string
     * marker (yyyy-mm-dd-hh:mm:ss) stored with the image.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
        BuildIdentifier("buildIdentifier"),
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
     * The field by which you want to sort. You can provide only one type of sort order. The default
     * order for {@code timeCreated} is descending. The default order for {@code displayName} is
     * ascending. If no value is specified, then {@code timeCreated} is the default. When listing
     * software images within the same {@code version}, using {@code sortBy=buildIdentifier} is
     * recommended. {@code buildIdentifier} is a monotonically increasing, time-ordered string
     * marker (yyyy-mm-dd-hh:mm:ss) stored with the image.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The client request identifier. */
    private String opcRequestId;

    /** The client request identifier. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Database Infrastructure.
     */
    private String infrastructureId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Database Infrastructure.
     */
    public String getInfrastructureId() {
        return infrastructureId;
    }
    /** Count of virtual machines in this VM cluster. */
    private Integer nodeCount;

    /** Count of virtual machines in this VM cluster. */
    public Integer getNodeCount() {
        return nodeCount;
    }
    /** VM network consumer type. */
    private com.oracle.bmc.datacc.model.VmNetworkConsumerType vmNetworkConsumerType;

    /** VM network consumer type. */
    public com.oracle.bmc.datacc.model.VmNetworkConsumerType getVmNetworkConsumerType() {
        return vmNetworkConsumerType;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListVmClusterNetworksRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment. For list operations, you may provide the tenant [OCID] in this field. When a
         * tenant OCID is provided, it will be validated against the caller's tenant and then
         * treated as tenant scope (compartmentId filtering is not applied).
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment. For list operations, you may provide the tenant [OCID] in this field. When a
         * tenant OCID is provided, it will be validated against the caller's tenant and then
         * treated as tenant scope (compartmentId filtering is not applied).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return resources that match the entire display name given. The match is case
         * sensitive.
         */
        private String displayName = null;

        /**
         * A filter to return resources that match the entire display name given. The match is case
         * sensitive.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** A filter to return resources that match the specified lifecycle state. */
        private java.util.List<com.oracle.bmc.datacc.model.VmClusterNetworkLifecycleState>
                lifecycleState = null;

        /**
         * A filter to return resources that match the specified lifecycle state.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                java.util.List<com.oracle.bmc.datacc.model.VmClusterNetworkLifecycleState>
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Singular setter. A filter to return resources that match the specified lifecycle state.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder lifecycleState(VmClusterNetworkLifecycleState singularValue) {
            return this.lifecycleState(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return VM cluster network resources that matches the specified value. */
        private Boolean isScanEnabled = null;

        /**
         * A filter to return VM cluster network resources that matches the specified value.
         *
         * @param isScanEnabled the value to set
         * @return this builder instance
         */
        public Builder isScanEnabled(Boolean isScanEnabled) {
            this.isScanEnabled = isScanEnabled;
            return this;
        }

        /** The maximum number of items to return in a page. */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a page.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which you want to start retrieving results. This
         * token is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which you want to start retrieving results. This
         * token is usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order that you want to use, which is either {@code ASC} or {@code DESC}. */
        private com.oracle.bmc.datacc.model.SortOrder sortOrder = null;

        /**
         * The sort order that you want to use, which is either {@code ASC} or {@code DESC}.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.datacc.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field by which you want to sort. You can provide only one type of sort order. The
         * default order for {@code timeCreated} is descending. The default order for {@code
         * displayName} is ascending. If no value is specified, then {@code timeCreated} is the
         * default. When listing software images within the same {@code version}, using {@code
         * sortBy=buildIdentifier} is recommended. {@code buildIdentifier} is a monotonically
         * increasing, time-ordered string marker (yyyy-mm-dd-hh:mm:ss) stored with the image.
         */
        private SortBy sortBy = null;

        /**
         * The field by which you want to sort. You can provide only one type of sort order. The
         * default order for {@code timeCreated} is descending. The default order for {@code
         * displayName} is ascending. If no value is specified, then {@code timeCreated} is the
         * default. When listing software images within the same {@code version}, using {@code
         * sortBy=buildIdentifier} is recommended. {@code buildIdentifier} is a monotonically
         * increasing, time-ordered string marker (yyyy-mm-dd-hh:mm:ss) stored with the image.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The client request identifier. */
        private String opcRequestId = null;

        /**
         * The client request identifier.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Database Infrastructure.
         */
        private String infrastructureId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Database Infrastructure.
         *
         * @param infrastructureId the value to set
         * @return this builder instance
         */
        public Builder infrastructureId(String infrastructureId) {
            this.infrastructureId = infrastructureId;
            return this;
        }

        /** Count of virtual machines in this VM cluster. */
        private Integer nodeCount = null;

        /**
         * Count of virtual machines in this VM cluster.
         *
         * @param nodeCount the value to set
         * @return this builder instance
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        /** VM network consumer type. */
        private com.oracle.bmc.datacc.model.VmNetworkConsumerType vmNetworkConsumerType = null;

        /**
         * VM network consumer type.
         *
         * @param vmNetworkConsumerType the value to set
         * @return this builder instance
         */
        public Builder vmNetworkConsumerType(
                com.oracle.bmc.datacc.model.VmNetworkConsumerType vmNetworkConsumerType) {
            this.vmNetworkConsumerType = vmNetworkConsumerType;
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
        public Builder copy(ListVmClusterNetworksRequest o) {
            compartmentId(o.getCompartmentId());
            displayName(o.getDisplayName());
            lifecycleState(o.getLifecycleState());
            isScanEnabled(o.getIsScanEnabled());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            infrastructureId(o.getInfrastructureId());
            nodeCount(o.getNodeCount());
            vmNetworkConsumerType(o.getVmNetworkConsumerType());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListVmClusterNetworksRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListVmClusterNetworksRequest
         */
        public ListVmClusterNetworksRequest build() {
            ListVmClusterNetworksRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListVmClusterNetworksRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListVmClusterNetworksRequest
         */
        public ListVmClusterNetworksRequest buildWithoutInvocationCallback() {
            ListVmClusterNetworksRequest request = new ListVmClusterNetworksRequest();
            request.compartmentId = compartmentId;
            request.displayName = displayName;
            request.lifecycleState = lifecycleState;
            request.isScanEnabled = isScanEnabled;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.infrastructureId = infrastructureId;
            request.nodeCount = nodeCount;
            request.vmNetworkConsumerType = vmNetworkConsumerType;
            return request;
            // new ListVmClusterNetworksRequest(compartmentId, displayName, lifecycleState,
            // isScanEnabled, limit, page, sortOrder, sortBy, opcRequestId, infrastructureId,
            // nodeCount, vmNetworkConsumerType);
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
                .displayName(displayName)
                .lifecycleState(lifecycleState)
                .isScanEnabled(isScanEnabled)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId)
                .infrastructureId(infrastructureId)
                .nodeCount(nodeCount)
                .vmNetworkConsumerType(vmNetworkConsumerType);
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
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",isScanEnabled=").append(String.valueOf(this.isScanEnabled));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",infrastructureId=").append(String.valueOf(this.infrastructureId));
        sb.append(",nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(",vmNetworkConsumerType=").append(String.valueOf(this.vmNetworkConsumerType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListVmClusterNetworksRequest)) {
            return false;
        }

        ListVmClusterNetworksRequest other = (ListVmClusterNetworksRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.isScanEnabled, other.isScanEnabled)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.infrastructureId, other.infrastructureId)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(
                        this.vmNetworkConsumerType, other.vmNetworkConsumerType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.isScanEnabled == null ? 43 : this.isScanEnabled.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureId == null ? 43 : this.infrastructureId.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.vmNetworkConsumerType == null
                                ? 43
                                : this.vmNetworkConsumerType.hashCode());
        return result;
    }
}

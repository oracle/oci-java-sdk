/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.requests;

import com.oracle.bmc.fleetappsmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListPatchesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListPatchesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class ListPatchesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The ID of the compartment in which to list resources. */
    private String compartmentId;

    /** The ID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** Product platformConfigurationId associated with the Patch. */
    private String productId;

    /** Product platformConfigurationId associated with the Patch. */
    public String getProductId() {
        return productId;
    }
    /** Product version */
    private String version;

    /** Product version */
    public String getVersion() {
        return version;
    }
    /** DefinedBy type. */
    private com.oracle.bmc.fleetappsmanagement.model.Patch.Type type;

    /** DefinedBy type. */
    public com.oracle.bmc.fleetappsmanagement.model.Patch.Type getType() {
        return type;
    }
    /** Patch Type platformConfigurationId associated with the Patch. */
    private String patchTypeId;

    /** Patch Type platformConfigurationId associated with the Patch. */
    public String getPatchTypeId() {
        return patchTypeId;
    }
    /** A filter to return only resources that match the entire name given. */
    private String name;

    /** A filter to return only resources that match the entire name given. */
    public String getName() {
        return name;
    }
    /** unique Patch identifier */
    private String id;

    /** unique Patch identifier */
    public String getId() {
        return id;
    }
    /** Patch Released Date */
    private java.util.Date timeReleasedGreaterThanOrEqualTo;

    /** Patch Released Date */
    public java.util.Date getTimeReleasedGreaterThanOrEqualTo() {
        return timeReleasedGreaterThanOrEqualTo;
    }
    /** Patch Released Date */
    private java.util.Date timeReleasedLessThan;

    /** Patch Released Date */
    public java.util.Date getTimeReleasedLessThan() {
        return timeReleasedLessThan;
    }
    /** Filter patch based on compliance policy rules for the Product */
    private Boolean shouldCompliancePolicyRulesBeApplied;

    /** Filter patch based on compliance policy rules for the Product */
    public Boolean getShouldCompliancePolicyRulesBeApplied() {
        return shouldCompliancePolicyRulesBeApplied;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /** The current state of the Patch. */
    private com.oracle.bmc.fleetappsmanagement.model.Patch.LifecycleState lifecycleState;

    /** The current state of the Patch. */
    public com.oracle.bmc.fleetappsmanagement.model.Patch.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.fleetappsmanagement.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListPatchesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The ID of the compartment in which to list resources. */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** Product platformConfigurationId associated with the Patch. */
        private String productId = null;

        /**
         * Product platformConfigurationId associated with the Patch.
         *
         * @param productId the value to set
         * @return this builder instance
         */
        public Builder productId(String productId) {
            this.productId = productId;
            return this;
        }

        /** Product version */
        private String version = null;

        /**
         * Product version
         *
         * @param version the value to set
         * @return this builder instance
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /** DefinedBy type. */
        private com.oracle.bmc.fleetappsmanagement.model.Patch.Type type = null;

        /**
         * DefinedBy type.
         *
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(com.oracle.bmc.fleetappsmanagement.model.Patch.Type type) {
            this.type = type;
            return this;
        }

        /** Patch Type platformConfigurationId associated with the Patch. */
        private String patchTypeId = null;

        /**
         * Patch Type platformConfigurationId associated with the Patch.
         *
         * @param patchTypeId the value to set
         * @return this builder instance
         */
        public Builder patchTypeId(String patchTypeId) {
            this.patchTypeId = patchTypeId;
            return this;
        }

        /** A filter to return only resources that match the entire name given. */
        private String name = null;

        /**
         * A filter to return only resources that match the entire name given.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /** unique Patch identifier */
        private String id = null;

        /**
         * unique Patch identifier
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /** Patch Released Date */
        private java.util.Date timeReleasedGreaterThanOrEqualTo = null;

        /**
         * Patch Released Date
         *
         * @param timeReleasedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeReleasedGreaterThanOrEqualTo(
                java.util.Date timeReleasedGreaterThanOrEqualTo) {
            this.timeReleasedGreaterThanOrEqualTo = timeReleasedGreaterThanOrEqualTo;
            return this;
        }

        /** Patch Released Date */
        private java.util.Date timeReleasedLessThan = null;

        /**
         * Patch Released Date
         *
         * @param timeReleasedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeReleasedLessThan(java.util.Date timeReleasedLessThan) {
            this.timeReleasedLessThan = timeReleasedLessThan;
            return this;
        }

        /** Filter patch based on compliance policy rules for the Product */
        private Boolean shouldCompliancePolicyRulesBeApplied = null;

        /**
         * Filter patch based on compliance policy rules for the Product
         *
         * @param shouldCompliancePolicyRulesBeApplied the value to set
         * @return this builder instance
         */
        public Builder shouldCompliancePolicyRulesBeApplied(
                Boolean shouldCompliancePolicyRulesBeApplied) {
            this.shouldCompliancePolicyRulesBeApplied = shouldCompliancePolicyRulesBeApplied;
            return this;
        }

        /** The maximum number of items to return. */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The current state of the Patch. */
        private com.oracle.bmc.fleetappsmanagement.model.Patch.LifecycleState lifecycleState = null;

        /**
         * The current state of the Patch.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.fleetappsmanagement.model.Patch.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(ListPatchesRequest o) {
            compartmentId(o.getCompartmentId());
            productId(o.getProductId());
            version(o.getVersion());
            type(o.getType());
            patchTypeId(o.getPatchTypeId());
            name(o.getName());
            id(o.getId());
            timeReleasedGreaterThanOrEqualTo(o.getTimeReleasedGreaterThanOrEqualTo());
            timeReleasedLessThan(o.getTimeReleasedLessThan());
            shouldCompliancePolicyRulesBeApplied(o.getShouldCompliancePolicyRulesBeApplied());
            limit(o.getLimit());
            page(o.getPage());
            lifecycleState(o.getLifecycleState());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListPatchesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListPatchesRequest
         */
        public ListPatchesRequest build() {
            ListPatchesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListPatchesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListPatchesRequest
         */
        public ListPatchesRequest buildWithoutInvocationCallback() {
            ListPatchesRequest request = new ListPatchesRequest();
            request.compartmentId = compartmentId;
            request.productId = productId;
            request.version = version;
            request.type = type;
            request.patchTypeId = patchTypeId;
            request.name = name;
            request.id = id;
            request.timeReleasedGreaterThanOrEqualTo = timeReleasedGreaterThanOrEqualTo;
            request.timeReleasedLessThan = timeReleasedLessThan;
            request.shouldCompliancePolicyRulesBeApplied = shouldCompliancePolicyRulesBeApplied;
            request.limit = limit;
            request.page = page;
            request.lifecycleState = lifecycleState;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListPatchesRequest(compartmentId, productId, version, type, patchTypeId, name,
            // id, timeReleasedGreaterThanOrEqualTo, timeReleasedLessThan,
            // shouldCompliancePolicyRulesBeApplied, limit, page, lifecycleState, sortBy, sortOrder,
            // opcRequestId);
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
                .productId(productId)
                .version(version)
                .type(type)
                .patchTypeId(patchTypeId)
                .name(name)
                .id(id)
                .timeReleasedGreaterThanOrEqualTo(timeReleasedGreaterThanOrEqualTo)
                .timeReleasedLessThan(timeReleasedLessThan)
                .shouldCompliancePolicyRulesBeApplied(shouldCompliancePolicyRulesBeApplied)
                .limit(limit)
                .page(page)
                .lifecycleState(lifecycleState)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
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
        sb.append(",productId=").append(String.valueOf(this.productId));
        sb.append(",version=").append(String.valueOf(this.version));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",patchTypeId=").append(String.valueOf(this.patchTypeId));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",timeReleasedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeReleasedGreaterThanOrEqualTo));
        sb.append(",timeReleasedLessThan=").append(String.valueOf(this.timeReleasedLessThan));
        sb.append(",shouldCompliancePolicyRulesBeApplied=")
                .append(String.valueOf(this.shouldCompliancePolicyRulesBeApplied));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListPatchesRequest)) {
            return false;
        }

        ListPatchesRequest other = (ListPatchesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.productId, other.productId)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.patchTypeId, other.patchTypeId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.timeReleasedGreaterThanOrEqualTo,
                        other.timeReleasedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeReleasedLessThan, other.timeReleasedLessThan)
                && java.util.Objects.equals(
                        this.shouldCompliancePolicyRulesBeApplied,
                        other.shouldCompliancePolicyRulesBeApplied)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.productId == null ? 43 : this.productId.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.patchTypeId == null ? 43 : this.patchTypeId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.timeReleasedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeReleasedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeReleasedLessThan == null
                                ? 43
                                : this.timeReleasedLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldCompliancePolicyRulesBeApplied == null
                                ? 43
                                : this.shouldCompliancePolicyRulesBeApplied.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

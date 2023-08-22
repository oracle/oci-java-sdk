/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/QueryWarehouseDataObjectDataExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * QueryWarehouseDataObjectDataRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class QueryWarehouseDataObjectDataRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.opsi.model.QueryWarehouseDataObjectDataDetails> {

    /** Type of the Warehouse. */
    private WarehouseType warehouseType;

    /** Type of the Warehouse. */
    public enum WarehouseType implements com.oracle.bmc.http.internal.BmcEnum {
        AwrHubs("awrHubs"),
        ;

        private final String value;
        private static java.util.Map<String, WarehouseType> map;

        static {
            map = new java.util.HashMap<>();
            for (WarehouseType v : WarehouseType.values()) {
                map.put(v.getValue(), v);
            }
        }

        WarehouseType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static WarehouseType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid WarehouseType: " + key);
        }
    };

    /** Type of the Warehouse. */
    public WarehouseType getWarehouseType() {
        return warehouseType;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * Warehouse.
     */
    private String warehouseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * Warehouse.
     */
    public String getWarehouseId() {
        return warehouseId;
    }
    /** The information to be used for querying a Warehouse. */
    private com.oracle.bmc.opsi.model.QueryWarehouseDataObjectDataDetails
            queryWarehouseDataObjectDataDetails;

    /** The information to be used for querying a Warehouse. */
    public com.oracle.bmc.opsi.model.QueryWarehouseDataObjectDataDetails
            getQueryWarehouseDataObjectDataDetails() {
        return queryWarehouseDataObjectDataDetails;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine). Example:
     * {@code 50}
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine). Example:
     * {@code 50}
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.opsi.model.QueryWarehouseDataObjectDataDetails getBody$() {
        return queryWarehouseDataObjectDataDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    QueryWarehouseDataObjectDataRequest,
                    com.oracle.bmc.opsi.model.QueryWarehouseDataObjectDataDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Type of the Warehouse. */
        private WarehouseType warehouseType = null;

        /**
         * Type of the Warehouse.
         *
         * @param warehouseType the value to set
         * @return this builder instance
         */
        public Builder warehouseType(WarehouseType warehouseType) {
            this.warehouseType = warehouseType;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of a Warehouse.
         */
        private String warehouseId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of a Warehouse.
         *
         * @param warehouseId the value to set
         * @return this builder instance
         */
        public Builder warehouseId(String warehouseId) {
            this.warehouseId = warehouseId;
            return this;
        }

        /** The information to be used for querying a Warehouse. */
        private com.oracle.bmc.opsi.model.QueryWarehouseDataObjectDataDetails
                queryWarehouseDataObjectDataDetails = null;

        /**
         * The information to be used for querying a Warehouse.
         *
         * @param queryWarehouseDataObjectDataDetails the value to set
         * @return this builder instance
         */
        public Builder queryWarehouseDataObjectDataDetails(
                com.oracle.bmc.opsi.model.QueryWarehouseDataObjectDataDetails
                        queryWarehouseDataObjectDataDetails) {
            this.queryWarehouseDataObjectDataDetails = queryWarehouseDataObjectDataDetails;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
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
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(QueryWarehouseDataObjectDataRequest o) {
            warehouseType(o.getWarehouseType());
            warehouseId(o.getWarehouseId());
            queryWarehouseDataObjectDataDetails(o.getQueryWarehouseDataObjectDataDetails());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of QueryWarehouseDataObjectDataRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of QueryWarehouseDataObjectDataRequest
         */
        public QueryWarehouseDataObjectDataRequest build() {
            QueryWarehouseDataObjectDataRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.opsi.model.QueryWarehouseDataObjectDataDetails body) {
            queryWarehouseDataObjectDataDetails(body);
            return this;
        }

        /**
         * Build the instance of QueryWarehouseDataObjectDataRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of QueryWarehouseDataObjectDataRequest
         */
        public QueryWarehouseDataObjectDataRequest buildWithoutInvocationCallback() {
            QueryWarehouseDataObjectDataRequest request = new QueryWarehouseDataObjectDataRequest();
            request.warehouseType = warehouseType;
            request.warehouseId = warehouseId;
            request.queryWarehouseDataObjectDataDetails = queryWarehouseDataObjectDataDetails;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new QueryWarehouseDataObjectDataRequest(warehouseType, warehouseId,
            // queryWarehouseDataObjectDataDetails, limit, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .warehouseType(warehouseType)
                .warehouseId(warehouseId)
                .queryWarehouseDataObjectDataDetails(queryWarehouseDataObjectDataDetails)
                .limit(limit)
                .page(page)
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
        sb.append(",warehouseType=").append(String.valueOf(this.warehouseType));
        sb.append(",warehouseId=").append(String.valueOf(this.warehouseId));
        sb.append(",queryWarehouseDataObjectDataDetails=")
                .append(String.valueOf(this.queryWarehouseDataObjectDataDetails));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryWarehouseDataObjectDataRequest)) {
            return false;
        }

        QueryWarehouseDataObjectDataRequest other = (QueryWarehouseDataObjectDataRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.warehouseType, other.warehouseType)
                && java.util.Objects.equals(this.warehouseId, other.warehouseId)
                && java.util.Objects.equals(
                        this.queryWarehouseDataObjectDataDetails,
                        other.queryWarehouseDataObjectDataDetails)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.warehouseType == null ? 43 : this.warehouseType.hashCode());
        result = (result * PRIME) + (this.warehouseId == null ? 43 : this.warehouseId.hashCode());
        result =
                (result * PRIME)
                        + (this.queryWarehouseDataObjectDataDetails == null
                                ? 43
                                : this.queryWarehouseDataObjectDataDetails.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

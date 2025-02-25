/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListCloudVmClusterUpdateHistoryEntriesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListCloudVmClusterUpdateHistoryEntriesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListCloudVmClusterUpdateHistoryEntriesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The cloud VM cluster [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String cloudVmClusterId;

    /**
     * The cloud VM cluster [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getCloudVmClusterId() {
        return cloudVmClusterId;
    }
    /**
     * A filter to return only resources that match the given update type exactly.
     */
    private UpdateType updateType;

    /**
     * A filter to return only resources that match the given update type exactly.
     **/
    public enum UpdateType {
        GiUpgrade("GI_UPGRADE"),
        GiPatch("GI_PATCH"),
        OsUpdate("OS_UPDATE"),
        ;

        private final String value;
        private static java.util.Map<String, UpdateType> map;

        static {
            map = new java.util.HashMap<>();
            for (UpdateType v : UpdateType.values()) {
                map.put(v.getValue(), v);
            }
        }

        UpdateType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpdateType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid UpdateType: " + key);
        }
    };

    /**
     * A filter to return only resources that match the given update type exactly.
     */
    public UpdateType getUpdateType() {
        return updateType;
    }
    /**
     * The maximum number of items to return per page.
     */
    private Integer limit;

    /**
     * The maximum number of items to return per page.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The pagination token to continue listing from.
     */
    private String page;

    /**
     * The pagination token to continue listing from.
     */
    public String getPage() {
        return page;
    }
    /**
     * Unique identifier for the request.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCloudVmClusterUpdateHistoryEntriesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The cloud VM cluster [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String cloudVmClusterId = null;

        /**
         * The cloud VM cluster [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param cloudVmClusterId the value to set
         * @return this builder instance
         */
        public Builder cloudVmClusterId(String cloudVmClusterId) {
            this.cloudVmClusterId = cloudVmClusterId;
            return this;
        }

        /**
         * A filter to return only resources that match the given update type exactly.
         */
        private UpdateType updateType = null;

        /**
         * A filter to return only resources that match the given update type exactly.
         * @param updateType the value to set
         * @return this builder instance
         */
        public Builder updateType(UpdateType updateType) {
            this.updateType = updateType;
            return this;
        }

        /**
         * The maximum number of items to return per page.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return per page.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The pagination token to continue listing from.
         */
        private String page = null;

        /**
         * The pagination token to continue listing from.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Unique identifier for the request.
         *
         */
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
        public Builder copy(ListCloudVmClusterUpdateHistoryEntriesRequest o) {
            cloudVmClusterId(o.getCloudVmClusterId());
            updateType(o.getUpdateType());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCloudVmClusterUpdateHistoryEntriesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListCloudVmClusterUpdateHistoryEntriesRequest
         */
        public ListCloudVmClusterUpdateHistoryEntriesRequest build() {
            ListCloudVmClusterUpdateHistoryEntriesRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCloudVmClusterUpdateHistoryEntriesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCloudVmClusterUpdateHistoryEntriesRequest
         */
        public ListCloudVmClusterUpdateHistoryEntriesRequest buildWithoutInvocationCallback() {
            ListCloudVmClusterUpdateHistoryEntriesRequest request =
                    new ListCloudVmClusterUpdateHistoryEntriesRequest();
            request.cloudVmClusterId = cloudVmClusterId;
            request.updateType = updateType;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListCloudVmClusterUpdateHistoryEntriesRequest(cloudVmClusterId, updateType, limit, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .cloudVmClusterId(cloudVmClusterId)
                .updateType(updateType)
                .limit(limit)
                .page(page)
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
        sb.append(",cloudVmClusterId=").append(String.valueOf(this.cloudVmClusterId));
        sb.append(",updateType=").append(String.valueOf(this.updateType));
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
        if (!(o instanceof ListCloudVmClusterUpdateHistoryEntriesRequest)) {
            return false;
        }

        ListCloudVmClusterUpdateHistoryEntriesRequest other =
                (ListCloudVmClusterUpdateHistoryEntriesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.cloudVmClusterId, other.cloudVmClusterId)
                && java.util.Objects.equals(this.updateType, other.updateType)
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
                        + (this.cloudVmClusterId == null ? 43 : this.cloudVmClusterId.hashCode());
        result = (result * PRIME) + (this.updateType == null ? 43 : this.updateType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

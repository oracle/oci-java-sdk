/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/ListContainersExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListContainersRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class ListContainersRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** if true, this returns latest version of container. */
    private Boolean isLatest;

    /** if true, this returns latest version of container. */
    public Boolean getIsLatest() {
        return isLatest;
    }
    /** <b>Filter</b> results by its user-friendly name. */
    private String displayName;

    /** <b>Filter</b> results by its user-friendly name. */
    public String getDisplayName() {
        return displayName;
    }
    /** <b>Filter</b> results by the container name. */
    private String containerName;

    /** <b>Filter</b> results by the container name. */
    public String getContainerName() {
        return containerName;
    }
    /**
     * <b>Filter</b> results by the specified lifecycle state. Must be a valid state for the
     * resource type.
     */
    private com.oracle.bmc.datascience.model.ContainerVersionLifecycleState lifecycleState;

    /**
     * <b>Filter</b> results by the specified lifecycle state. Must be a valid state for the
     * resource type.
     */
    public com.oracle.bmc.datascience.model.ContainerVersionLifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** <b>Filter</b> results by the target workload. */
    private com.oracle.bmc.datascience.model.ContainerTargetWorkload targetWorkload;

    /** <b>Filter</b> results by the target workload. */
    public com.oracle.bmc.datascience.model.ContainerTargetWorkload getTargetWorkload() {
        return targetWorkload;
    }
    /** <b>Filter</b> results by the usage. */
    private com.oracle.bmc.datascience.model.ContainerUsage usageQueryParam;

    /** <b>Filter</b> results by the usage. */
    public com.oracle.bmc.datascience.model.ContainerUsage getUsageQueryParam() {
        return usageQueryParam;
    }
    /** <b>Filter</b> results by the container version tag. */
    private String tagQueryParam;

    /** <b>Filter</b> results by the container version tag. */
    public String getTagQueryParam() {
        return tagQueryParam;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. 1 is the minimum, 100 is the maximum. See [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. 1 is the minimum, 100 is the maximum. See [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call.
     *
     * <p>See [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call.
     *
     * <p>See [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListContainersRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** if true, this returns latest version of container. */
        private Boolean isLatest = null;

        /**
         * if true, this returns latest version of container.
         *
         * @param isLatest the value to set
         * @return this builder instance
         */
        public Builder isLatest(Boolean isLatest) {
            this.isLatest = isLatest;
            return this;
        }

        /** <b>Filter</b> results by its user-friendly name. */
        private String displayName = null;

        /**
         * <b>Filter</b> results by its user-friendly name.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** <b>Filter</b> results by the container name. */
        private String containerName = null;

        /**
         * <b>Filter</b> results by the container name.
         *
         * @param containerName the value to set
         * @return this builder instance
         */
        public Builder containerName(String containerName) {
            this.containerName = containerName;
            return this;
        }

        /**
         * <b>Filter</b> results by the specified lifecycle state. Must be a valid state for the
         * resource type.
         */
        private com.oracle.bmc.datascience.model.ContainerVersionLifecycleState lifecycleState =
                null;

        /**
         * <b>Filter</b> results by the specified lifecycle state. Must be a valid state for the
         * resource type.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.datascience.model.ContainerVersionLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** <b>Filter</b> results by the target workload. */
        private com.oracle.bmc.datascience.model.ContainerTargetWorkload targetWorkload = null;

        /**
         * <b>Filter</b> results by the target workload.
         *
         * @param targetWorkload the value to set
         * @return this builder instance
         */
        public Builder targetWorkload(
                com.oracle.bmc.datascience.model.ContainerTargetWorkload targetWorkload) {
            this.targetWorkload = targetWorkload;
            return this;
        }

        /** <b>Filter</b> results by the usage. */
        private com.oracle.bmc.datascience.model.ContainerUsage usageQueryParam = null;

        /**
         * <b>Filter</b> results by the usage.
         *
         * @param usageQueryParam the value to set
         * @return this builder instance
         */
        public Builder usageQueryParam(
                com.oracle.bmc.datascience.model.ContainerUsage usageQueryParam) {
            this.usageQueryParam = usageQueryParam;
            return this;
        }

        /** <b>Filter</b> results by the container version tag. */
        private String tagQueryParam = null;

        /**
         * <b>Filter</b> results by the container version tag.
         *
         * @param tagQueryParam the value to set
         * @return this builder instance
         */
        public Builder tagQueryParam(String tagQueryParam) {
            this.tagQueryParam = tagQueryParam;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. 1 is the minimum, 100 is the maximum. See [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 50}
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. 1 is the minimum, 100 is the maximum. See [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/usingapi.htm#nine).
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
         * previous "List" call.
         *
         * <p>See [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call.
         *
         * <p>See [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/usingapi.htm#nine).
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
        public Builder copy(ListContainersRequest o) {
            opcRequestId(o.getOpcRequestId());
            isLatest(o.getIsLatest());
            displayName(o.getDisplayName());
            containerName(o.getContainerName());
            lifecycleState(o.getLifecycleState());
            targetWorkload(o.getTargetWorkload());
            usageQueryParam(o.getUsageQueryParam());
            tagQueryParam(o.getTagQueryParam());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListContainersRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListContainersRequest
         */
        public ListContainersRequest build() {
            ListContainersRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListContainersRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListContainersRequest
         */
        public ListContainersRequest buildWithoutInvocationCallback() {
            ListContainersRequest request = new ListContainersRequest();
            request.opcRequestId = opcRequestId;
            request.isLatest = isLatest;
            request.displayName = displayName;
            request.containerName = containerName;
            request.lifecycleState = lifecycleState;
            request.targetWorkload = targetWorkload;
            request.usageQueryParam = usageQueryParam;
            request.tagQueryParam = tagQueryParam;
            request.limit = limit;
            request.page = page;
            return request;
            // new ListContainersRequest(opcRequestId, isLatest, displayName, containerName,
            // lifecycleState, targetWorkload, usageQueryParam, tagQueryParam, limit, page);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .opcRequestId(opcRequestId)
                .isLatest(isLatest)
                .displayName(displayName)
                .containerName(containerName)
                .lifecycleState(lifecycleState)
                .targetWorkload(targetWorkload)
                .usageQueryParam(usageQueryParam)
                .tagQueryParam(tagQueryParam)
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
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isLatest=").append(String.valueOf(this.isLatest));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",containerName=").append(String.valueOf(this.containerName));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",targetWorkload=").append(String.valueOf(this.targetWorkload));
        sb.append(",usageQueryParam=").append(String.valueOf(this.usageQueryParam));
        sb.append(",tagQueryParam=").append(String.valueOf(this.tagQueryParam));
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
        if (!(o instanceof ListContainersRequest)) {
            return false;
        }

        ListContainersRequest other = (ListContainersRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.isLatest, other.isLatest)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.containerName, other.containerName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.targetWorkload, other.targetWorkload)
                && java.util.Objects.equals(this.usageQueryParam, other.usageQueryParam)
                && java.util.Objects.equals(this.tagQueryParam, other.tagQueryParam)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.isLatest == null ? 43 : this.isLatest.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.containerName == null ? 43 : this.containerName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.targetWorkload == null ? 43 : this.targetWorkload.hashCode());
        result =
                (result * PRIME)
                        + (this.usageQueryParam == null ? 43 : this.usageQueryParam.hashCode());
        result =
                (result * PRIME)
                        + (this.tagQueryParam == null ? 43 : this.tagQueryParam.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}

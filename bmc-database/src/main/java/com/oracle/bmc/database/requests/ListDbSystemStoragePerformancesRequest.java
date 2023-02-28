/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbSystemStoragePerformancesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListDbSystemStoragePerformancesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListDbSystemStoragePerformancesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The DB system storage management option. Used to list database versions available for that
     * storage manager. Valid values are {@code ASM} and {@code LVM}. * ASM specifies Oracle
     * Automatic Storage Management * LVM specifies logical volume manager, sometimes called logical
     * disk manager.
     */
    private com.oracle.bmc.database.model.DbSystemOptions.StorageManagement storageManagement;

    /**
     * The DB system storage management option. Used to list database versions available for that
     * storage manager. Valid values are {@code ASM} and {@code LVM}. * ASM specifies Oracle
     * Automatic Storage Management * LVM specifies logical volume manager, sometimes called logical
     * disk manager.
     */
    public com.oracle.bmc.database.model.DbSystemOptions.StorageManagement getStorageManagement() {
        return storageManagement;
    }
    /** Optional. Filters the performance results by shape type. */
    private String shapeType;

    /** Optional. Filters the performance results by shape type. */
    public String getShapeType() {
        return shapeType;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDbSystemStoragePerformancesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The DB system storage management option. Used to list database versions available for
         * that storage manager. Valid values are {@code ASM} and {@code LVM}. * ASM specifies
         * Oracle Automatic Storage Management * LVM specifies logical volume manager, sometimes
         * called logical disk manager.
         */
        private com.oracle.bmc.database.model.DbSystemOptions.StorageManagement storageManagement =
                null;

        /**
         * The DB system storage management option. Used to list database versions available for
         * that storage manager. Valid values are {@code ASM} and {@code LVM}. * ASM specifies
         * Oracle Automatic Storage Management * LVM specifies logical volume manager, sometimes
         * called logical disk manager.
         *
         * @param storageManagement the value to set
         * @return this builder instance
         */
        public Builder storageManagement(
                com.oracle.bmc.database.model.DbSystemOptions.StorageManagement storageManagement) {
            this.storageManagement = storageManagement;
            return this;
        }

        /** Optional. Filters the performance results by shape type. */
        private String shapeType = null;

        /**
         * Optional. Filters the performance results by shape type.
         *
         * @param shapeType the value to set
         * @return this builder instance
         */
        public Builder shapeType(String shapeType) {
            this.shapeType = shapeType;
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
        public Builder copy(ListDbSystemStoragePerformancesRequest o) {
            storageManagement(o.getStorageManagement());
            shapeType(o.getShapeType());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDbSystemStoragePerformancesRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListDbSystemStoragePerformancesRequest
         */
        public ListDbSystemStoragePerformancesRequest build() {
            ListDbSystemStoragePerformancesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDbSystemStoragePerformancesRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDbSystemStoragePerformancesRequest
         */
        public ListDbSystemStoragePerformancesRequest buildWithoutInvocationCallback() {
            ListDbSystemStoragePerformancesRequest request =
                    new ListDbSystemStoragePerformancesRequest();
            request.storageManagement = storageManagement;
            request.shapeType = shapeType;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListDbSystemStoragePerformancesRequest(storageManagement, shapeType,
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
                .storageManagement(storageManagement)
                .shapeType(shapeType)
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
        sb.append(",storageManagement=").append(String.valueOf(this.storageManagement));
        sb.append(",shapeType=").append(String.valueOf(this.shapeType));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDbSystemStoragePerformancesRequest)) {
            return false;
        }

        ListDbSystemStoragePerformancesRequest other = (ListDbSystemStoragePerformancesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.storageManagement, other.storageManagement)
                && java.util.Objects.equals(this.shapeType, other.shapeType)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.storageManagement == null ? 43 : this.storageManagement.hashCode());
        result = (result * PRIME) + (this.shapeType == null ? 43 : this.shapeType.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbVersionsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDbVersionsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListDbVersionsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The maximum number of items to return per page.
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * The pagination token to continue listing from.
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * If provided, filters the results to the set of database versions which are supported for the given shape.
     */
    private String dbSystemShape;

    public String getDbSystemShape() {
        return dbSystemShape;
    }
    /**
     * The DB system [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm). If provided, filters the results to the set of database versions which are supported for the DB system.
     */
    private String dbSystemId;

    public String getDbSystemId() {
        return dbSystemId;
    }
    /**
     * The DB system storage management option. Used to list database versions available for that storage manager. Valid values are {@code ASM} and {@code LVM}.
     * * ASM specifies Oracle Automatic Storage Management
     * * LVM specifies logical volume manager, sometimes called logical disk manager.
     *
     */
    private com.oracle.bmc.database.model.DbSystemOptions.StorageManagement storageManagement;

    public com.oracle.bmc.database.model.DbSystemOptions.StorageManagement getStorageManagement() {
        return storageManagement;
    }
    /**
     * If provided, filters the results to the set of database versions which are supported for Upgrade.
     */
    private Boolean isUpgradeSupported;

    public Boolean getIsUpgradeSupported() {
        return isUpgradeSupported;
    }
    /**
     * If true, filters the results to the set of Oracle Database versions that are supported for OCI database software images.
     */
    private Boolean isDatabaseSoftwareImageSupported;

    public Boolean getIsDatabaseSoftwareImageSupported() {
        return isDatabaseSoftwareImageSupported;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDbVersionsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String compartmentId = null;

        /**
         * The compartment [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        private Integer limit = null;

        /**
         * The maximum number of items to return per page.
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private String page = null;

        /**
         * The pagination token to continue listing from.
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private String dbSystemShape = null;

        /**
         * If provided, filters the results to the set of database versions which are supported for the given shape.
         * @return this builder instance
         */
        public Builder dbSystemShape(String dbSystemShape) {
            this.dbSystemShape = dbSystemShape;
            return this;
        }

        private String dbSystemId = null;

        /**
         * The DB system [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm). If provided, filters the results to the set of database versions which are supported for the DB system.
         * @return this builder instance
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            return this;
        }

        private com.oracle.bmc.database.model.DbSystemOptions.StorageManagement storageManagement =
                null;

        /**
         * The DB system storage management option. Used to list database versions available for that storage manager. Valid values are {@code ASM} and {@code LVM}.
         * * ASM specifies Oracle Automatic Storage Management
         * * LVM specifies logical volume manager, sometimes called logical disk manager.
         *
         * @return this builder instance
         */
        public Builder storageManagement(
                com.oracle.bmc.database.model.DbSystemOptions.StorageManagement storageManagement) {
            this.storageManagement = storageManagement;
            return this;
        }

        private Boolean isUpgradeSupported = null;

        /**
         * If provided, filters the results to the set of database versions which are supported for Upgrade.
         * @return this builder instance
         */
        public Builder isUpgradeSupported(Boolean isUpgradeSupported) {
            this.isUpgradeSupported = isUpgradeSupported;
            return this;
        }

        private Boolean isDatabaseSoftwareImageSupported = null;

        /**
         * If true, filters the results to the set of Oracle Database versions that are supported for OCI database software images.
         * @return this builder instance
         */
        public Builder isDatabaseSoftwareImageSupported(Boolean isDatabaseSoftwareImageSupported) {
            this.isDatabaseSoftwareImageSupported = isDatabaseSoftwareImageSupported;
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
        public Builder copy(ListDbVersionsRequest o) {
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            dbSystemShape(o.getDbSystemShape());
            dbSystemId(o.getDbSystemId());
            storageManagement(o.getStorageManagement());
            isUpgradeSupported(o.getIsUpgradeSupported());
            isDatabaseSoftwareImageSupported(o.getIsDatabaseSoftwareImageSupported());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDbVersionsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListDbVersionsRequest
         */
        public ListDbVersionsRequest build() {
            ListDbVersionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDbVersionsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDbVersionsRequest
         */
        public ListDbVersionsRequest buildWithoutInvocationCallback() {
            ListDbVersionsRequest request = new ListDbVersionsRequest();
            request.compartmentId = compartmentId;
            request.limit = limit;
            request.page = page;
            request.dbSystemShape = dbSystemShape;
            request.dbSystemId = dbSystemId;
            request.storageManagement = storageManagement;
            request.isUpgradeSupported = isUpgradeSupported;
            request.isDatabaseSoftwareImageSupported = isDatabaseSoftwareImageSupported;
            return request;
            // new ListDbVersionsRequest(compartmentId, limit, page, dbSystemShape, dbSystemId, storageManagement, isUpgradeSupported, isDatabaseSoftwareImageSupported);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .limit(limit)
                .page(page)
                .dbSystemShape(dbSystemShape)
                .dbSystemId(dbSystemId)
                .storageManagement(storageManagement)
                .isUpgradeSupported(isUpgradeSupported)
                .isDatabaseSoftwareImageSupported(isDatabaseSoftwareImageSupported);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",dbSystemShape=").append(String.valueOf(this.dbSystemShape));
        sb.append(",dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(",storageManagement=").append(String.valueOf(this.storageManagement));
        sb.append(",isUpgradeSupported=").append(String.valueOf(this.isUpgradeSupported));
        sb.append(",isDatabaseSoftwareImageSupported=")
                .append(String.valueOf(this.isDatabaseSoftwareImageSupported));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDbVersionsRequest)) {
            return false;
        }

        ListDbVersionsRequest other = (ListDbVersionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.dbSystemShape, other.dbSystemShape)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.storageManagement, other.storageManagement)
                && java.util.Objects.equals(this.isUpgradeSupported, other.isUpgradeSupported)
                && java.util.Objects.equals(
                        this.isDatabaseSoftwareImageSupported,
                        other.isDatabaseSoftwareImageSupported);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.dbSystemShape == null ? 43 : this.dbSystemShape.hashCode());
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.storageManagement == null ? 43 : this.storageManagement.hashCode());
        result =
                (result * PRIME)
                        + (this.isUpgradeSupported == null
                                ? 43
                                : this.isUpgradeSupported.hashCode());
        result =
                (result * PRIME)
                        + (this.isDatabaseSoftwareImageSupported == null
                                ? 43
                                : this.isDatabaseSoftwareImageSupported.hashCode());
        return result;
    }
}

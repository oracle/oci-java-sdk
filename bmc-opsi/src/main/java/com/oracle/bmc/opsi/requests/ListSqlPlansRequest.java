/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListSqlPlansExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSqlPlansRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ListSqlPlansRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Unique SQL_ID for a SQL Statement.
     * Example: {@code 6rgjh9bjmy2s7}
     *
     */
    private String sqlIdentifier;

    /**
     * Unique SQL_ID for a SQL Statement.
     * Example: {@code 6rgjh9bjmy2s7}
     *
     */
    public String getSqlIdentifier() {
        return sqlIdentifier;
    }
    /**
     * Unique plan hash for a SQL Plan of a particular SQL Statement.
     * Example: {@code 9820154385}
     *
     */
    private java.util.List<Long> planHash;

    /**
     * Unique plan hash for a SQL Plan of a particular SQL Statement.
     * Example: {@code 9820154385}
     *
     */
    public java.util.List<Long> getPlanHash() {
        return planHash;
    }
    /**
     * Optional [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
     *
     */
    private String databaseId;

    /**
     * Optional [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
     *
     */
    public String getDatabaseId() {
        return databaseId;
    }
    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database insight resource.
     *
     */
    private String id;

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database insight resource.
     *
     */
    public String getId() {
        return id;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSqlPlansRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Unique SQL_ID for a SQL Statement.
         * Example: {@code 6rgjh9bjmy2s7}
         *
         */
        private String sqlIdentifier = null;

        /**
         * Unique SQL_ID for a SQL Statement.
         * Example: {@code 6rgjh9bjmy2s7}
         *
         * @param sqlIdentifier the value to set
         * @return this builder instance
         */
        public Builder sqlIdentifier(String sqlIdentifier) {
            this.sqlIdentifier = sqlIdentifier;
            return this;
        }

        /**
         * Unique plan hash for a SQL Plan of a particular SQL Statement.
         * Example: {@code 9820154385}
         *
         */
        private java.util.List<Long> planHash = null;

        /**
         * Unique plan hash for a SQL Plan of a particular SQL Statement.
         * Example: {@code 9820154385}
         *
         * @param planHash the value to set
         * @return this builder instance
         */
        public Builder planHash(java.util.List<Long> planHash) {
            this.planHash = planHash;
            return this;
        }

        /**
         * Singular setter. Unique plan hash for a SQL Plan of a particular SQL Statement.
         * Example: {@code 9820154385}
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder planHash(Long singularValue) {
            return this.planHash(java.util.Arrays.asList(singularValue));
        }

        /**
         * Optional [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
         *
         */
        private String databaseId = null;

        /**
         * Optional [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
         *
         * @param databaseId the value to set
         * @return this builder instance
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database insight resource.
         *
         */
        private String id = null;

        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database insight resource.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from
         * the previous "List" call. For important details about how pagination works,
         * see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from
         * the previous "List" call. For important details about how pagination works,
         * see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
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
        public Builder copy(ListSqlPlansRequest o) {
            compartmentId(o.getCompartmentId());
            sqlIdentifier(o.getSqlIdentifier());
            planHash(o.getPlanHash());
            databaseId(o.getDatabaseId());
            id(o.getId());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSqlPlansRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListSqlPlansRequest
         */
        public ListSqlPlansRequest build() {
            ListSqlPlansRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSqlPlansRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSqlPlansRequest
         */
        public ListSqlPlansRequest buildWithoutInvocationCallback() {
            ListSqlPlansRequest request = new ListSqlPlansRequest();
            request.compartmentId = compartmentId;
            request.sqlIdentifier = sqlIdentifier;
            request.planHash = planHash;
            request.databaseId = databaseId;
            request.id = id;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListSqlPlansRequest(compartmentId, sqlIdentifier, planHash, databaseId, id, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .sqlIdentifier(sqlIdentifier)
                .planHash(planHash)
                .databaseId(databaseId)
                .id(id)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",sqlIdentifier=").append(String.valueOf(this.sqlIdentifier));
        sb.append(",planHash=").append(String.valueOf(this.planHash));
        sb.append(",databaseId=").append(String.valueOf(this.databaseId));
        sb.append(",id=").append(String.valueOf(this.id));
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
        if (!(o instanceof ListSqlPlansRequest)) {
            return false;
        }

        ListSqlPlansRequest other = (ListSqlPlansRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.sqlIdentifier, other.sqlIdentifier)
                && java.util.Objects.equals(this.planHash, other.planHash)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlIdentifier == null ? 43 : this.sqlIdentifier.hashCode());
        result = (result * PRIME) + (this.planHash == null ? 43 : this.planHash.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

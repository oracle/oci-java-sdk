/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListImportableEnterpriseManagerEntitiesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListImportableEnterpriseManagerEntitiesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListImportableEnterpriseManagerEntitiesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique Enterprise Manager bridge identifier
     */
    private String enterpriseManagerBridgeId;

    /**
     * For list pagination. The maximum number of results per page, or items to
     * return in a paginated "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     * Example: {@code 50}
     *
     */
    private Integer limit;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * Filter by one or more Enterprise Manager entity types. Currently, the supported types are "oracle_pdb", "oracle_database", "host", "oracle_dbmachine", "oracle_exa_cloud_service", and "oracle_oci_exadata_cloud_service". If this parameter is not specified, targets of all supported entity types are returned by default.
     *
     */
    private java.util.List<String> enterpriseManagerEntityType;

    /**
     * Used in combination with enterpriseManagerParentEntityIdentifier to return the members of a particular Enterprise Manager parent entity. Both enterpriseManagerIdentifier and enterpriseManagerParentEntityIdentifier must be specified to identify a particular Enterprise Manager parent entity.
     *
     */
    private String enterpriseManagerIdentifier;

    /**
     * Used in combination with enterpriseManagerIdentifier to return the members of a particular Enterprise Manager parent entity. Both enterpriseManagerIdentifier and enterpriseManagerParentEntityIdentifier must be specified to identify a particular  Enterprise Manager parent entity.
     *
     */
    private String enterpriseManagerParentEntityIdentifier;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListImportableEnterpriseManagerEntitiesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<String> enterpriseManagerEntityType = null;

        /**
         * Filter by one or more Enterprise Manager entity types. Currently, the supported types are "oracle_pdb", "oracle_database", "host", "oracle_dbmachine", "oracle_exa_cloud_service", and "oracle_oci_exadata_cloud_service". If this parameter is not specified, targets of all supported entity types are returned by default.
         *
         * @return this builder instance
         */
        public Builder enterpriseManagerEntityType(
                java.util.List<String> enterpriseManagerEntityType) {
            this.enterpriseManagerEntityType = enterpriseManagerEntityType;
            return this;
        }

        /**
         * Singular setter. Filter by one or more Enterprise Manager entity types. Currently, the supported types are "oracle_pdb", "oracle_database", "host", "oracle_dbmachine", "oracle_exa_cloud_service", and "oracle_oci_exadata_cloud_service". If this parameter is not specified, targets of all supported entity types are returned by default.
         *
         * @return this builder instance
         */
        public Builder enterpriseManagerEntityType(String singularValue) {
            return this.enterpriseManagerEntityType(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListImportableEnterpriseManagerEntitiesRequest o) {
            enterpriseManagerBridgeId(o.getEnterpriseManagerBridgeId());
            limit(o.getLimit());
            page(o.getPage());
            enterpriseManagerEntityType(o.getEnterpriseManagerEntityType());
            enterpriseManagerIdentifier(o.getEnterpriseManagerIdentifier());
            enterpriseManagerParentEntityIdentifier(o.getEnterpriseManagerParentEntityIdentifier());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListImportableEnterpriseManagerEntitiesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListImportableEnterpriseManagerEntitiesRequest
         */
        public ListImportableEnterpriseManagerEntitiesRequest build() {
            ListImportableEnterpriseManagerEntitiesRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}

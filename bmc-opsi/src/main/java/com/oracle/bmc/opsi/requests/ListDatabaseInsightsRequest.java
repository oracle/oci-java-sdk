/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ListDatabaseInsightsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDatabaseInsightsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ListDatabaseInsightsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Unique Enterprise Manager bridge identifier
     */
    private String enterpriseManagerBridgeId;

    /**
     * Unique Enterprise Manager bridge identifier
     */
    public String getEnterpriseManagerBridgeId() {
        return enterpriseManagerBridgeId;
    }
    /**
     * Optional list of database insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    private java.util.List<String> id;

    /**
     * Optional list of database insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    public java.util.List<String> getId() {
        return id;
    }
    /**
     * Resource Status
     */
    private java.util.List<com.oracle.bmc.opsi.model.ResourceStatus> status;

    /**
     * Resource Status
     */
    public java.util.List<com.oracle.bmc.opsi.model.ResourceStatus> getStatus() {
        return status;
    }
    /**
     * Lifecycle states
     */
    private java.util.List<com.oracle.bmc.opsi.model.LifecycleState> lifecycleState;

    /**
     * Lifecycle states
     */
    public java.util.List<com.oracle.bmc.opsi.model.LifecycleState> getLifecycleState() {
        return lifecycleState;
    }
    /**
     * Filter by one or more database type.
     * Possible values are ADW-S, ATP-S, ADW-D, ATP-D, EXTERNAL-PDB, EXTERNAL-NONCDB.
     *
     */
    private java.util.List<DatabaseType> databaseType;

    /**
     * Filter by one or more database type.
     * Possible values are ADW-S, ATP-S, ADW-D, ATP-D, EXTERNAL-PDB, EXTERNAL-NONCDB.
     *
     **/
    public enum DatabaseType {
        AdwS("ADW-S"),
        AtpS("ATP-S"),
        AdwD("ADW-D"),
        AtpD("ATP-D"),
        ExternalPdb("EXTERNAL-PDB"),
        ExternalNoncdb("EXTERNAL-NONCDB"),
        ComanagedVmCdb("COMANAGED-VM-CDB"),
        ComanagedVmPdb("COMANAGED-VM-PDB"),
        ComanagedVmNoncdb("COMANAGED-VM-NONCDB"),
        ComanagedBmCdb("COMANAGED-BM-CDB"),
        ComanagedBmPdb("COMANAGED-BM-PDB"),
        ComanagedBmNoncdb("COMANAGED-BM-NONCDB"),
        ComanagedExacsCdb("COMANAGED-EXACS-CDB"),
        ComanagedExacsPdb("COMANAGED-EXACS-PDB"),
        ComanagedExacsNoncdb("COMANAGED-EXACS-NONCDB"),
        ;

        private final String value;
        private static java.util.Map<String, DatabaseType> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseType v : DatabaseType.values()) {
                map.put(v.getValue(), v);
            }
        }

        DatabaseType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DatabaseType: " + key);
        }
    };

    /**
     * Filter by one or more database type.
     * Possible values are ADW-S, ATP-S, ADW-D, ATP-D, EXTERNAL-PDB, EXTERNAL-NONCDB.
     *
     */
    public java.util.List<DatabaseType> getDatabaseType() {
        return databaseType;
    }
    /**
     * Optional list of database [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
     *
     */
    private java.util.List<String> databaseId;

    /**
     * Optional list of database [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
     *
     */
    public java.util.List<String> getDatabaseId() {
        return databaseId;
    }
    /**
     * Specifies the fields to return in a database summary response. By default all fields are returned if omitted.
     *
     */
    private java.util.List<Fields> fields;

    /**
     * Specifies the fields to return in a database summary response. By default all fields are returned if omitted.
     *
     **/
    public enum Fields {
        CompartmentId("compartmentId"),
        DatabaseName("databaseName"),
        DatabaseDisplayName("databaseDisplayName"),
        DatabaseType("databaseType"),
        DatabaseVersion("databaseVersion"),
        DatabaseHostNames("databaseHostNames"),
        FreeformTags("freeformTags"),
        DefinedTags("definedTags"),
        ;

        private final String value;
        private static java.util.Map<String, Fields> map;

        static {
            map = new java.util.HashMap<>();
            for (Fields v : Fields.values()) {
                map.put(v.getValue(), v);
            }
        }

        Fields(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Fields create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Fields: " + key);
        }
    };

    /**
     * Specifies the fields to return in a database summary response. By default all fields are returned if omitted.
     *
     */
    public java.util.List<Fields> getFields() {
        return fields;
    }
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
     * For list pagination. The maximum number of results per page, or items to
     * return in a paginated "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     * Example: {@code 50}
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    private com.oracle.bmc.opsi.model.SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    public com.oracle.bmc.opsi.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Database insight list sort options. If {@code fields} parameter is selected, the {@code sortBy} parameter must be one of the fields specified.
     *
     */
    private SortBy sortBy;

    /**
     * Database insight list sort options. If {@code fields} parameter is selected, the {@code sortBy} parameter must be one of the fields specified.
     *
     **/
    public enum SortBy {
        DatabaseName("databaseName"),
        DatabaseDisplayName("databaseDisplayName"),
        DatabaseType("databaseType"),
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
     * Database insight list sort options. If {@code fields} parameter is selected, the {@code sortBy} parameter must be one of the fields specified.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of exadata insight resource.
     *
     */
    private String exadataInsightId;

    /**
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of exadata insight resource.
     *
     */
    public String getExadataInsightId() {
        return exadataInsightId;
    }
    /**
     * A flag to search all resources within a given compartment and all sub-compartments.
     *
     */
    private Boolean compartmentIdInSubtree;

    /**
     * A flag to search all resources within a given compartment and all sub-compartments.
     *
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /**
     * Unique Operations Insights PrivateEndpoint identifier
     */
    private String opsiPrivateEndpointId;

    /**
     * Unique Operations Insights PrivateEndpoint identifier
     */
    public String getOpsiPrivateEndpointId() {
        return opsiPrivateEndpointId;
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
                    ListDatabaseInsightsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Unique Enterprise Manager bridge identifier
         */
        private String enterpriseManagerBridgeId = null;

        /**
         * Unique Enterprise Manager bridge identifier
         * @param enterpriseManagerBridgeId the value to set
         * @return this builder instance
         */
        public Builder enterpriseManagerBridgeId(String enterpriseManagerBridgeId) {
            this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
            return this;
        }

        /**
         * Optional list of database insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         */
        private java.util.List<String> id = null;

        /**
         * Optional list of database insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(java.util.List<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Singular setter. Optional list of database insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder id(String singularValue) {
            return this.id(java.util.Arrays.asList(singularValue));
        }

        /**
         * Resource Status
         */
        private java.util.List<com.oracle.bmc.opsi.model.ResourceStatus> status = null;

        /**
         * Resource Status
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(java.util.List<com.oracle.bmc.opsi.model.ResourceStatus> status) {
            this.status = status;
            return this;
        }

        /**
         * Singular setter. Resource Status
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder status(ResourceStatus singularValue) {
            return this.status(java.util.Arrays.asList(singularValue));
        }

        /**
         * Lifecycle states
         */
        private java.util.List<com.oracle.bmc.opsi.model.LifecycleState> lifecycleState = null;

        /**
         * Lifecycle states
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                java.util.List<com.oracle.bmc.opsi.model.LifecycleState> lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Singular setter. Lifecycle states
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder lifecycleState(LifecycleState singularValue) {
            return this.lifecycleState(java.util.Arrays.asList(singularValue));
        }

        /**
         * Filter by one or more database type.
         * Possible values are ADW-S, ATP-S, ADW-D, ATP-D, EXTERNAL-PDB, EXTERNAL-NONCDB.
         *
         */
        private java.util.List<DatabaseType> databaseType = null;

        /**
         * Filter by one or more database type.
         * Possible values are ADW-S, ATP-S, ADW-D, ATP-D, EXTERNAL-PDB, EXTERNAL-NONCDB.
         *
         * @param databaseType the value to set
         * @return this builder instance
         */
        public Builder databaseType(java.util.List<DatabaseType> databaseType) {
            this.databaseType = databaseType;
            return this;
        }

        /**
         * Singular setter. Filter by one or more database type.
         * Possible values are ADW-S, ATP-S, ADW-D, ATP-D, EXTERNAL-PDB, EXTERNAL-NONCDB.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder databaseType(DatabaseType singularValue) {
            return this.databaseType(java.util.Arrays.asList(singularValue));
        }

        /**
         * Optional list of database [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
         *
         */
        private java.util.List<String> databaseId = null;

        /**
         * Optional list of database [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
         *
         * @param databaseId the value to set
         * @return this builder instance
         */
        public Builder databaseId(java.util.List<String> databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        /**
         * Singular setter. Optional list of database [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder databaseId(String singularValue) {
            return this.databaseId(java.util.Arrays.asList(singularValue));
        }

        /**
         * Specifies the fields to return in a database summary response. By default all fields are returned if omitted.
         *
         */
        private java.util.List<Fields> fields = null;

        /**
         * Specifies the fields to return in a database summary response. By default all fields are returned if omitted.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to return in a database summary response. By default all fields are returned if omitted.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fields(Fields singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        /**
         * For list pagination. The maximum number of results per page, or items to
         * return in a paginated "List" call.
         * For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to
         * return in a paginated "List" call.
         * For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
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
         * For list pagination. The value of the {@code opc-next-page} response header from
         * the previous "List" call. For important details about how pagination works,
         * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from
         * the previous "List" call. For important details about how pagination works,
         * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         */
        private com.oracle.bmc.opsi.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.opsi.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Database insight list sort options. If {@code fields} parameter is selected, the {@code sortBy} parameter must be one of the fields specified.
         *
         */
        private SortBy sortBy = null;

        /**
         * Database insight list sort options. If {@code fields} parameter is selected, the {@code sortBy} parameter must be one of the fields specified.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of exadata insight resource.
         *
         */
        private String exadataInsightId = null;

        /**
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of exadata insight resource.
         *
         * @param exadataInsightId the value to set
         * @return this builder instance
         */
        public Builder exadataInsightId(String exadataInsightId) {
            this.exadataInsightId = exadataInsightId;
            return this;
        }

        /**
         * A flag to search all resources within a given compartment and all sub-compartments.
         *
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * A flag to search all resources within a given compartment and all sub-compartments.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * Unique Operations Insights PrivateEndpoint identifier
         */
        private String opsiPrivateEndpointId = null;

        /**
         * Unique Operations Insights PrivateEndpoint identifier
         * @param opsiPrivateEndpointId the value to set
         * @return this builder instance
         */
        public Builder opsiPrivateEndpointId(String opsiPrivateEndpointId) {
            this.opsiPrivateEndpointId = opsiPrivateEndpointId;
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
        public Builder copy(ListDatabaseInsightsRequest o) {
            compartmentId(o.getCompartmentId());
            enterpriseManagerBridgeId(o.getEnterpriseManagerBridgeId());
            id(o.getId());
            status(o.getStatus());
            lifecycleState(o.getLifecycleState());
            databaseType(o.getDatabaseType());
            databaseId(o.getDatabaseId());
            fields(o.getFields());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            exadataInsightId(o.getExadataInsightId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            opsiPrivateEndpointId(o.getOpsiPrivateEndpointId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDatabaseInsightsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListDatabaseInsightsRequest
         */
        public ListDatabaseInsightsRequest build() {
            ListDatabaseInsightsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDatabaseInsightsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDatabaseInsightsRequest
         */
        public ListDatabaseInsightsRequest buildWithoutInvocationCallback() {
            ListDatabaseInsightsRequest request = new ListDatabaseInsightsRequest();
            request.compartmentId = compartmentId;
            request.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
            request.id = id;
            request.status = status;
            request.lifecycleState = lifecycleState;
            request.databaseType = databaseType;
            request.databaseId = databaseId;
            request.fields = fields;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.exadataInsightId = exadataInsightId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.opsiPrivateEndpointId = opsiPrivateEndpointId;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListDatabaseInsightsRequest(compartmentId, enterpriseManagerBridgeId, id, status, lifecycleState, databaseType, databaseId, fields, limit, page, sortOrder, sortBy, exadataInsightId, compartmentIdInSubtree, opsiPrivateEndpointId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .enterpriseManagerBridgeId(enterpriseManagerBridgeId)
                .id(id)
                .status(status)
                .lifecycleState(lifecycleState)
                .databaseType(databaseType)
                .databaseId(databaseId)
                .fields(fields)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .exadataInsightId(exadataInsightId)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .opsiPrivateEndpointId(opsiPrivateEndpointId)
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
        sb.append(",enterpriseManagerBridgeId=")
                .append(String.valueOf(this.enterpriseManagerBridgeId));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",databaseType=").append(String.valueOf(this.databaseType));
        sb.append(",databaseId=").append(String.valueOf(this.databaseId));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",exadataInsightId=").append(String.valueOf(this.exadataInsightId));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",opsiPrivateEndpointId=").append(String.valueOf(this.opsiPrivateEndpointId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDatabaseInsightsRequest)) {
            return false;
        }

        ListDatabaseInsightsRequest other = (ListDatabaseInsightsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.enterpriseManagerBridgeId, other.enterpriseManagerBridgeId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.exadataInsightId, other.exadataInsightId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.opsiPrivateEndpointId, other.opsiPrivateEndpointId)
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
                        + (this.enterpriseManagerBridgeId == null
                                ? 43
                                : this.enterpriseManagerBridgeId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataInsightId == null ? 43 : this.exadataInsightId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result =
                (result * PRIME)
                        + (this.opsiPrivateEndpointId == null
                                ? 43
                                : this.opsiPrivateEndpointId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

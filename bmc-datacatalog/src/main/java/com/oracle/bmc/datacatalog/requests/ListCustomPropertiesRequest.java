/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListCustomPropertiesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListCustomPropertiesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class ListCustomPropertiesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique catalog identifier. */
    private String catalogId;

    /** Unique catalog identifier. */
    public String getCatalogId() {
        return catalogId;
    }
    /** Unique namespace identifier. */
    private String namespaceId;

    /** Unique namespace identifier. */
    public String getNamespaceId() {
        return namespaceId;
    }
    /**
     * A filter to return only resources that match the entire display name given. The match is not
     * case sensitive.
     */
    private String displayName;

    /**
     * A filter to return only resources that match the entire display name given. The match is not
     * case sensitive.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * A filter to return only resources that match display name pattern given. The match is not
     * case sensitive. For Example : /folders?displayNameContains=Cu.* The above would match all
     * folders with display name that starts with "Cu" or has the pattern "Cu" anywhere in between.
     */
    private String displayNameContains;

    /**
     * A filter to return only resources that match display name pattern given. The match is not
     * case sensitive. For Example : /folders?displayNameContains=Cu.* The above would match all
     * folders with display name that starts with "Cu" or has the pattern "Cu" anywhere in between.
     */
    public String getDisplayNameContains() {
        return displayNameContains;
    }
    /** Return the custom properties which has specified data types */
    private java.util.List<com.oracle.bmc.datacatalog.model.CustomPropertyDataType> dataTypes;

    /** Return the custom properties which has specified data types */
    public java.util.List<com.oracle.bmc.datacatalog.model.CustomPropertyDataType> getDataTypes() {
        return dataTypes;
    }
    /**
     * A filter to return only resources that match the entire type name given. The match is not
     * case sensitive
     */
    private java.util.List<TypeName> typeName;

    /**
     * A filter to return only resources that match the entire type name given. The match is not
     * case sensitive
     */
    public enum TypeName implements com.oracle.bmc.http.internal.BmcEnum {
        DataAsset("DATA_ASSET"),
        AutonomousDataWarehouse("AUTONOMOUS_DATA_WAREHOUSE"),
        Hive("HIVE"),
        Kafka("KAFKA"),
        Mysql("MYSQL"),
        OracleObjectStorage("ORACLE_OBJECT_STORAGE"),
        AutonomousTransactionProcessing("AUTONOMOUS_TRANSACTION_PROCESSING"),
        Oracle("ORACLE"),
        Postgresql("POSTGRESQL"),
        MicrosoftAzureSqlDatabase("MICROSOFT_AZURE_SQL_DATABASE"),
        MicrosoftSqlServer("MICROSOFT_SQL_SERVER"),
        IbmDb2("IBM_DB2"),
        DataEntity("DATA_ENTITY"),
        LogicalEntity("LOGICAL_ENTITY"),
        Table("TABLE"),
        View("VIEW"),
        Attribute("ATTRIBUTE"),
        Folder("FOLDER"),
        OracleAnalyticsSubjectAreaColumn("ORACLE_ANALYTICS_SUBJECT_AREA_COLUMN"),
        OracleAnalyticsLogicalColumn("ORACLE_ANALYTICS_LOGICAL_COLUMN"),
        OracleAnalyticsPhysicalColumn("ORACLE_ANALYTICS_PHYSICAL_COLUMN"),
        OracleAnalyticsAnalysisColumn("ORACLE_ANALYTICS_ANALYSIS_COLUMN"),
        OracleAnalyticsServer("ORACLE_ANALYTICS_SERVER"),
        OracleAnalyticsCloud("ORACLE_ANALYTICS_CLOUD"),
        OracleAnalyticsSubjectArea("ORACLE_ANALYTICS_SUBJECT_AREA"),
        OracleAnalyticsDashboard("ORACLE_ANALYTICS_DASHBOARD"),
        OracleAnalyticsBusinessModel("ORACLE_ANALYTICS_BUSINESS_MODEL"),
        OracleAnalyticsPhysicalDatabase("ORACLE_ANALYTICS_PHYSICAL_DATABASE"),
        OracleAnalyticsPhysicalSchema("ORACLE_ANALYTICS_PHYSICAL_SCHEMA"),
        OracleAnalyticsPresentationTable("ORACLE_ANALYTICS_PRESENTATION_TABLE"),
        OracleAnalyticsLogicalTable("ORACLE_ANALYTICS_LOGICAL_TABLE"),
        OracleAnalyticsPhysicalTable("ORACLE_ANALYTICS_PHYSICAL_TABLE"),
        OracleAnalyticsAnalysis("ORACLE_ANALYTICS_ANALYSIS"),
        DatabaseSchema("DATABASE_SCHEMA"),
        Topic("TOPIC"),
        Connection("CONNECTION"),
        Glossary("GLOSSARY"),
        Term("TERM"),
        Category("CATEGORY"),
        File("FILE"),
        Bucket("BUCKET"),
        Message("MESSAGE"),
        UnrecognizedFile("UNRECOGNIZED_FILE"),
        ;

        private final String value;
        private static java.util.Map<String, TypeName> map;

        static {
            map = new java.util.HashMap<>();
            for (TypeName v : TypeName.values()) {
                map.put(v.getValue(), v);
            }
        }

        TypeName(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TypeName create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TypeName: " + key);
        }
    };

    /**
     * A filter to return only resources that match the entire type name given. The match is not
     * case sensitive
     */
    public java.util.List<TypeName> getTypeName() {
        return typeName;
    }
    /**
     * A filter to return only resources that match the specified lifecycle state. The value is case
     * insensitive.
     */
    private com.oracle.bmc.datacatalog.model.LifecycleState lifecycleState;

    /**
     * A filter to return only resources that match the specified lifecycle state. The value is case
     * insensitive.
     */
    public com.oracle.bmc.datacatalog.model.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339)
     * formatted datetime string.
     */
    private java.util.Date timeCreated;

    /**
     * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339)
     * formatted datetime string.
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }
    /**
     * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339)
     * formatted datetime string.
     */
    private java.util.Date timeUpdated;

    /**
     * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339)
     * formatted datetime string.
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }
    /** OCID of the user who created the resource. */
    private String createdById;

    /** OCID of the user who created the resource. */
    public String getCreatedById() {
        return createdById;
    }
    /** OCID of the user who updated the resource. */
    private String updatedById;

    /** OCID of the user who updated the resource. */
    public String getUpdatedById() {
        return updatedById;
    }
    /** Specifies the fields to return in a custom property summary response. */
    private java.util.List<Fields> fields;

    /** Specifies the fields to return in a custom property summary response. */
    public enum Fields implements com.oracle.bmc.http.internal.BmcEnum {
        Key("key"),
        DisplayName("displayName"),
        Description("description"),
        DataType("dataType"),
        NamespaceName("namespaceName"),
        LifecycleState("lifecycleState"),
        TimeCreated("timeCreated"),
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

    /** Specifies the fields to return in a custom property summary response. */
    public java.util.List<Fields> getFields() {
        return fields;
    }
    /** The sort order to use, either 'asc' or 'desc'. */
    private SortOrder sortOrder;

    /** The sort order to use, either 'asc' or 'desc'. */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /** The sort order to use, either 'asc' or 'desc'. */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for USAGECOUNT and
     * DISPLAYNAME is Ascending
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for USAGECOUNT and
     * DISPLAYNAME is Ascending
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Displayname("DISPLAYNAME"),
        Usagecount("USAGECOUNT"),
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
     * The field to sort by. Only one sort order may be provided. Default order for USAGECOUNT and
     * DISPLAYNAME is Ascending
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCustomPropertiesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique catalog identifier. */
        private String catalogId = null;

        /**
         * Unique catalog identifier.
         *
         * @param catalogId the value to set
         * @return this builder instance
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /** Unique namespace identifier. */
        private String namespaceId = null;

        /**
         * Unique namespace identifier.
         *
         * @param namespaceId the value to set
         * @return this builder instance
         */
        public Builder namespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * A filter to return only resources that match the entire display name given. The match is
         * not case sensitive.
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given. The match is
         * not case sensitive.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * A filter to return only resources that match display name pattern given. The match is not
         * case sensitive. For Example : /folders?displayNameContains=Cu.* The above would match all
         * folders with display name that starts with "Cu" or has the pattern "Cu" anywhere in
         * between.
         */
        private String displayNameContains = null;

        /**
         * A filter to return only resources that match display name pattern given. The match is not
         * case sensitive. For Example : /folders?displayNameContains=Cu.* The above would match all
         * folders with display name that starts with "Cu" or has the pattern "Cu" anywhere in
         * between.
         *
         * @param displayNameContains the value to set
         * @return this builder instance
         */
        public Builder displayNameContains(String displayNameContains) {
            this.displayNameContains = displayNameContains;
            return this;
        }

        /** Return the custom properties which has specified data types */
        private java.util.List<com.oracle.bmc.datacatalog.model.CustomPropertyDataType> dataTypes =
                null;

        /**
         * Return the custom properties which has specified data types
         *
         * @param dataTypes the value to set
         * @return this builder instance
         */
        public Builder dataTypes(
                java.util.List<com.oracle.bmc.datacatalog.model.CustomPropertyDataType> dataTypes) {
            this.dataTypes = dataTypes;
            return this;
        }

        /**
         * Singular setter. Return the custom properties which has specified data types
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder dataTypes(CustomPropertyDataType singularValue) {
            return this.dataTypes(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only resources that match the entire type name given. The match is not
         * case sensitive
         */
        private java.util.List<TypeName> typeName = null;

        /**
         * A filter to return only resources that match the entire type name given. The match is not
         * case sensitive
         *
         * @param typeName the value to set
         * @return this builder instance
         */
        public Builder typeName(java.util.List<TypeName> typeName) {
            this.typeName = typeName;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that match the entire type name given.
         * The match is not case sensitive
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder typeName(TypeName singularValue) {
            return this.typeName(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only resources that match the specified lifecycle state. The value is
         * case insensitive.
         */
        private com.oracle.bmc.datacatalog.model.LifecycleState lifecycleState = null;

        /**
         * A filter to return only resources that match the specified lifecycle state. The value is
         * case insensitive.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.datacatalog.model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339)
         * formatted datetime string.
         */
        private java.util.Date timeCreated = null;

        /**
         * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339)
         * formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder instance
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            return this;
        }

        /**
         * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339)
         * formatted datetime string.
         */
        private java.util.Date timeUpdated = null;

        /**
         * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339)
         * formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder instance
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            return this;
        }

        /** OCID of the user who created the resource. */
        private String createdById = null;

        /**
         * OCID of the user who created the resource.
         *
         * @param createdById the value to set
         * @return this builder instance
         */
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            return this;
        }

        /** OCID of the user who updated the resource. */
        private String updatedById = null;

        /**
         * OCID of the user who updated the resource.
         *
         * @param updatedById the value to set
         * @return this builder instance
         */
        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            return this;
        }

        /** Specifies the fields to return in a custom property summary response. */
        private java.util.List<Fields> fields = null;

        /**
         * Specifies the fields to return in a custom property summary response.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to return in a custom property summary response.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fields(Fields singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        /** The sort order to use, either 'asc' or 'desc'. */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for USAGECOUNT
         * and DISPLAYNAME is Ascending
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for USAGECOUNT
         * and DISPLAYNAME is Ascending
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(ListCustomPropertiesRequest o) {
            catalogId(o.getCatalogId());
            namespaceId(o.getNamespaceId());
            displayName(o.getDisplayName());
            displayNameContains(o.getDisplayNameContains());
            dataTypes(o.getDataTypes());
            typeName(o.getTypeName());
            lifecycleState(o.getLifecycleState());
            timeCreated(o.getTimeCreated());
            timeUpdated(o.getTimeUpdated());
            createdById(o.getCreatedById());
            updatedById(o.getUpdatedById());
            fields(o.getFields());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCustomPropertiesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListCustomPropertiesRequest
         */
        public ListCustomPropertiesRequest build() {
            ListCustomPropertiesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCustomPropertiesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCustomPropertiesRequest
         */
        public ListCustomPropertiesRequest buildWithoutInvocationCallback() {
            ListCustomPropertiesRequest request = new ListCustomPropertiesRequest();
            request.catalogId = catalogId;
            request.namespaceId = namespaceId;
            request.displayName = displayName;
            request.displayNameContains = displayNameContains;
            request.dataTypes = dataTypes;
            request.typeName = typeName;
            request.lifecycleState = lifecycleState;
            request.timeCreated = timeCreated;
            request.timeUpdated = timeUpdated;
            request.createdById = createdById;
            request.updatedById = updatedById;
            request.fields = fields;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListCustomPropertiesRequest(catalogId, namespaceId, displayName,
            // displayNameContains, dataTypes, typeName, lifecycleState, timeCreated, timeUpdated,
            // createdById, updatedById, fields, sortOrder, sortBy, limit, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .catalogId(catalogId)
                .namespaceId(namespaceId)
                .displayName(displayName)
                .displayNameContains(displayNameContains)
                .dataTypes(dataTypes)
                .typeName(typeName)
                .lifecycleState(lifecycleState)
                .timeCreated(timeCreated)
                .timeUpdated(timeUpdated)
                .createdById(createdById)
                .updatedById(updatedById)
                .fields(fields)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",catalogId=").append(String.valueOf(this.catalogId));
        sb.append(",namespaceId=").append(String.valueOf(this.namespaceId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",dataTypes=").append(String.valueOf(this.dataTypes));
        sb.append(",typeName=").append(String.valueOf(this.typeName));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(",timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(",createdById=").append(String.valueOf(this.createdById));
        sb.append(",updatedById=").append(String.valueOf(this.updatedById));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
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
        if (!(o instanceof ListCustomPropertiesRequest)) {
            return false;
        }

        ListCustomPropertiesRequest other = (ListCustomPropertiesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.namespaceId, other.namespaceId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
                && java.util.Objects.equals(this.dataTypes, other.dataTypes)
                && java.util.Objects.equals(this.typeName, other.typeName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.namespaceId == null ? 43 : this.namespaceId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.displayNameContains == null
                                ? 43
                                : this.displayNameContains.hashCode());
        result = (result * PRIME) + (this.dataTypes == null ? 43 : this.dataTypes.hashCode());
        result = (result * PRIME) + (this.typeName == null ? 43 : this.typeName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.updatedById == null ? 43 : this.updatedById.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

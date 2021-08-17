/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListCustomPropertiesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListCustomPropertiesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListCustomPropertiesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique catalog identifier.
     */
    private String catalogId;

    /**
     * Unique namespace identifier.
     */
    private String namespaceId;

    /**
     * A filter to return only resources that match the entire display name given. The match is not case sensitive.
     */
    private String displayName;

    /**
     * A filter to return only resources that match display name pattern given. The match is not case sensitive.
     * For Example : /folders?displayNameContains=Cu.*
     * The above would match all folders with display name that starts with "Cu".
     *
     */
    private String displayNameContains;

    /**
     * Return the custom properties which has specified data types
     *
     */
    private java.util.List<com.oracle.bmc.datacatalog.model.CustomPropertyDataType> dataTypes;

    /**
     * A filter to return only resources that match the entire type name given. The match is not case sensitive
     */
    private java.util.List<TypeName> typeName;

    /**
     * A filter to return only resources that match the entire type name given. The match is not case sensitive
     **/
    public enum TypeName {
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
     * A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
     */
    private com.oracle.bmc.datacatalog.model.LifecycleState lifecycleState;

    /**
     * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeCreated;

    /**
     * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeUpdated;

    /**
     * OCID of the user who created the resource.
     */
    private String createdById;

    /**
     * OCID of the user who updated the resource.
     */
    private String updatedById;

    /**
     * Specifies the fields to return in a custom property summary response.
     *
     */
    private java.util.List<Fields> fields;

    /**
     * Specifies the fields to return in a custom property summary response.
     *
     **/
    public enum Fields {
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
    /**
     * The sort order to use, either 'asc' or 'desc'.
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
     **/
    public enum SortOrder {
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
    /**
     * The field to sort by. Only one sort order may be provided. Default order for USAGECOUNT and DISPLAYNAME is Ascending
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for USAGECOUNT and DISPLAYNAME is Ascending
     *
     **/
    public enum SortBy {
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
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCustomPropertiesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<com.oracle.bmc.datacatalog.model.CustomPropertyDataType> dataTypes =
                null;

        /**
         * Return the custom properties which has specified data types
         *
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
         * @return this builder instance
         */
        public Builder dataTypes(CustomPropertyDataType singularValue) {
            return this.dataTypes(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<TypeName> typeName = null;

        /**
         * A filter to return only resources that match the entire type name given. The match is not case sensitive
         * @return this builder instance
         */
        public Builder typeName(java.util.List<TypeName> typeName) {
            this.typeName = typeName;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that match the entire type name given. The match is not case sensitive
         * @return this builder instance
         */
        public Builder typeName(TypeName singularValue) {
            return this.typeName(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<Fields> fields = null;

        /**
         * Specifies the fields to return in a custom property summary response.
         *
         * @return this builder instance
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to return in a custom property summary response.
         *
         * @return this builder instance
         */
        public Builder fields(Fields singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
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
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListCustomPropertiesRequest
         */
        public ListCustomPropertiesRequest build() {
            ListCustomPropertiesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}

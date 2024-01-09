/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListAttributesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListAttributesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class ListAttributesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique catalog identifier. */
    private String catalogId;

    /** Unique catalog identifier. */
    public String getCatalogId() {
        return catalogId;
    }
    /** Unique data asset key. */
    private String dataAssetKey;

    /** Unique data asset key. */
    public String getDataAssetKey() {
        return dataAssetKey;
    }
    /** Unique entity key. */
    private String entityKey;

    /** Unique entity key. */
    public String getEntityKey() {
        return entityKey;
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
     * A filter to return only resources that match the entire business name given. The match is not
     * case sensitive.
     */
    private String businessName;

    /**
     * A filter to return only resources that match the entire business name given. The match is not
     * case sensitive.
     */
    public String getBusinessName() {
        return businessName;
    }
    /**
     * A filter to return only resources that match display name or business name pattern given. The
     * match is not case sensitive. For Example : /folders?displayOrBusinessNameContains=Cu.* The
     * above would match all folders with display name or business name that starts with "Cu" or has
     * the pattern "Cu" anywhere in between.
     */
    private String displayOrBusinessNameContains;

    /**
     * A filter to return only resources that match display name or business name pattern given. The
     * match is not case sensitive. For Example : /folders?displayOrBusinessNameContains=Cu.* The
     * above would match all folders with display name or business name that starts with "Cu" or has
     * the pattern "Cu" anywhere in between.
     */
    public String getDisplayOrBusinessNameContains() {
        return displayOrBusinessNameContains;
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
    /** Unique external identifier of this resource in the external source system. */
    private String externalKey;

    /** Unique external identifier of this resource in the external source system. */
    public String getExternalKey() {
        return externalKey;
    }
    /** Last modified timestamp of this object in the external system. */
    private java.util.Date timeExternal;

    /** Last modified timestamp of this object in the external system. */
    public java.util.Date getTimeExternal() {
        return timeExternal;
    }
    /** Data type as defined in an external system. */
    private String externalTypeName;

    /** Data type as defined in an external system. */
    public String getExternalTypeName() {
        return externalTypeName;
    }
    /** Identifies whether this attribute can be used as a watermark to extract incremental data. */
    private Boolean isIncrementalData;

    /** Identifies whether this attribute can be used as a watermark to extract incremental data. */
    public Boolean getIsIncrementalData() {
        return isIncrementalData;
    }
    /** Identifies whether this attribute can be assigned null value. */
    private Boolean isNullable;

    /** Identifies whether this attribute can be assigned null value. */
    public Boolean getIsNullable() {
        return isNullable;
    }
    /** Max allowed length of the attribute value. */
    private Long length;

    /** Max allowed length of the attribute value. */
    public Long getLength() {
        return length;
    }
    /** Position of the attribute in the record definition. */
    private Integer position;

    /** Position of the attribute in the record definition. */
    public Integer getPosition() {
        return position;
    }
    /** Precision of the attribute value usually applies to float data type. */
    private Integer precision;

    /** Precision of the attribute value usually applies to float data type. */
    public Integer getPrecision() {
        return precision;
    }
    /** Scale of the attribute value usually applies to float data type. */
    private Integer scale;

    /** Scale of the attribute value usually applies to float data type. */
    public Integer getScale() {
        return scale;
    }
    /** Specifies the fields to return in an entity attribute summary response. */
    private java.util.List<Fields> fields;

    /** Specifies the fields to return in an entity attribute summary response. */
    public enum Fields implements com.oracle.bmc.http.internal.BmcEnum {
        Key("key"),
        DisplayName("displayName"),
        Description("description"),
        EntityKey("entityKey"),
        LifecycleState("lifecycleState"),
        TimeCreated("timeCreated"),
        ExternalDataType("externalDataType"),
        ExternalKey("externalKey"),
        Length("length"),
        Precision("precision"),
        Scale("scale"),
        IsNullable("isNullable"),
        Uri("uri"),
        Path("path"),
        MinCollectionCount("minCollectionCount"),
        MaxCollectionCount("maxCollectionCount"),
        DatatypeEntityKey("datatypeEntityKey"),
        ExternalDatatypeEntityKey("externalDatatypeEntityKey"),
        ParentAttributeKey("parentAttributeKey"),
        ExternalParentAttributeKey("externalParentAttributeKey"),
        Position("position"),
        TypeKey("typeKey"),
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

    /** Specifies the fields to return in an entity attribute summary response. */
    public java.util.List<Fields> getFields() {
        return fields;
    }
    /**
     * The field to sort by. Only one sort order may be provided. DISPLAYORBUSINESSNAME considers
     * businessName of a given object if set, else its displayName is used. Default sort order for
     * TIMECREATED is descending and default sort order for DISPLAYNAME, POSITION and
     * DISPLAYORBUSINESSNAME is ascending. If no order is specified, POSITION is the default.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. DISPLAYORBUSINESSNAME considers
     * businessName of a given object if set, else its displayName is used. Default sort order for
     * TIMECREATED is descending and default sort order for DISPLAYNAME, POSITION and
     * DISPLAYORBUSINESSNAME is ascending. If no order is specified, POSITION is the default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
        Position("POSITION"),
        Displayorbusinessname("DISPLAYORBUSINESSNAME"),
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
     * The field to sort by. Only one sort order may be provided. DISPLAYORBUSINESSNAME considers
     * businessName of a given object if set, else its displayName is used. Default sort order for
     * TIMECREATED is descending and default sort order for DISPLAYNAME, POSITION and
     * DISPLAYORBUSINESSNAME is ascending. If no order is specified, POSITION is the default.
     */
    public SortBy getSortBy() {
        return sortBy;
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
                    ListAttributesRequest, java.lang.Void> {
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

        /** Unique data asset key. */
        private String dataAssetKey = null;

        /**
         * Unique data asset key.
         *
         * @param dataAssetKey the value to set
         * @return this builder instance
         */
        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            return this;
        }

        /** Unique entity key. */
        private String entityKey = null;

        /**
         * Unique entity key.
         *
         * @param entityKey the value to set
         * @return this builder instance
         */
        public Builder entityKey(String entityKey) {
            this.entityKey = entityKey;
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
         * A filter to return only resources that match the entire business name given. The match is
         * not case sensitive.
         */
        private String businessName = null;

        /**
         * A filter to return only resources that match the entire business name given. The match is
         * not case sensitive.
         *
         * @param businessName the value to set
         * @return this builder instance
         */
        public Builder businessName(String businessName) {
            this.businessName = businessName;
            return this;
        }

        /**
         * A filter to return only resources that match display name or business name pattern given.
         * The match is not case sensitive. For Example :
         * /folders?displayOrBusinessNameContains=Cu.* The above would match all folders with
         * display name or business name that starts with "Cu" or has the pattern "Cu" anywhere in
         * between.
         */
        private String displayOrBusinessNameContains = null;

        /**
         * A filter to return only resources that match display name or business name pattern given.
         * The match is not case sensitive. For Example :
         * /folders?displayOrBusinessNameContains=Cu.* The above would match all folders with
         * display name or business name that starts with "Cu" or has the pattern "Cu" anywhere in
         * between.
         *
         * @param displayOrBusinessNameContains the value to set
         * @return this builder instance
         */
        public Builder displayOrBusinessNameContains(String displayOrBusinessNameContains) {
            this.displayOrBusinessNameContains = displayOrBusinessNameContains;
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

        /** Unique external identifier of this resource in the external source system. */
        private String externalKey = null;

        /**
         * Unique external identifier of this resource in the external source system.
         *
         * @param externalKey the value to set
         * @return this builder instance
         */
        public Builder externalKey(String externalKey) {
            this.externalKey = externalKey;
            return this;
        }

        /** Last modified timestamp of this object in the external system. */
        private java.util.Date timeExternal = null;

        /**
         * Last modified timestamp of this object in the external system.
         *
         * @param timeExternal the value to set
         * @return this builder instance
         */
        public Builder timeExternal(java.util.Date timeExternal) {
            this.timeExternal = timeExternal;
            return this;
        }

        /** Data type as defined in an external system. */
        private String externalTypeName = null;

        /**
         * Data type as defined in an external system.
         *
         * @param externalTypeName the value to set
         * @return this builder instance
         */
        public Builder externalTypeName(String externalTypeName) {
            this.externalTypeName = externalTypeName;
            return this;
        }

        /**
         * Identifies whether this attribute can be used as a watermark to extract incremental data.
         */
        private Boolean isIncrementalData = null;

        /**
         * Identifies whether this attribute can be used as a watermark to extract incremental data.
         *
         * @param isIncrementalData the value to set
         * @return this builder instance
         */
        public Builder isIncrementalData(Boolean isIncrementalData) {
            this.isIncrementalData = isIncrementalData;
            return this;
        }

        /** Identifies whether this attribute can be assigned null value. */
        private Boolean isNullable = null;

        /**
         * Identifies whether this attribute can be assigned null value.
         *
         * @param isNullable the value to set
         * @return this builder instance
         */
        public Builder isNullable(Boolean isNullable) {
            this.isNullable = isNullable;
            return this;
        }

        /** Max allowed length of the attribute value. */
        private Long length = null;

        /**
         * Max allowed length of the attribute value.
         *
         * @param length the value to set
         * @return this builder instance
         */
        public Builder length(Long length) {
            this.length = length;
            return this;
        }

        /** Position of the attribute in the record definition. */
        private Integer position = null;

        /**
         * Position of the attribute in the record definition.
         *
         * @param position the value to set
         * @return this builder instance
         */
        public Builder position(Integer position) {
            this.position = position;
            return this;
        }

        /** Precision of the attribute value usually applies to float data type. */
        private Integer precision = null;

        /**
         * Precision of the attribute value usually applies to float data type.
         *
         * @param precision the value to set
         * @return this builder instance
         */
        public Builder precision(Integer precision) {
            this.precision = precision;
            return this;
        }

        /** Scale of the attribute value usually applies to float data type. */
        private Integer scale = null;

        /**
         * Scale of the attribute value usually applies to float data type.
         *
         * @param scale the value to set
         * @return this builder instance
         */
        public Builder scale(Integer scale) {
            this.scale = scale;
            return this;
        }

        /** Specifies the fields to return in an entity attribute summary response. */
        private java.util.List<Fields> fields = null;

        /**
         * Specifies the fields to return in an entity attribute summary response.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to return in an entity attribute summary response.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fields(Fields singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        /**
         * The field to sort by. Only one sort order may be provided. DISPLAYORBUSINESSNAME
         * considers businessName of a given object if set, else its displayName is used. Default
         * sort order for TIMECREATED is descending and default sort order for DISPLAYNAME, POSITION
         * and DISPLAYORBUSINESSNAME is ascending. If no order is specified, POSITION is the
         * default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. DISPLAYORBUSINESSNAME
         * considers businessName of a given object if set, else its displayName is used. Default
         * sort order for TIMECREATED is descending and default sort order for DISPLAYNAME, POSITION
         * and DISPLAYORBUSINESSNAME is ascending. If no order is specified, POSITION is the
         * default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
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
        public Builder copy(ListAttributesRequest o) {
            catalogId(o.getCatalogId());
            dataAssetKey(o.getDataAssetKey());
            entityKey(o.getEntityKey());
            displayName(o.getDisplayName());
            businessName(o.getBusinessName());
            displayOrBusinessNameContains(o.getDisplayOrBusinessNameContains());
            displayNameContains(o.getDisplayNameContains());
            lifecycleState(o.getLifecycleState());
            timeCreated(o.getTimeCreated());
            timeUpdated(o.getTimeUpdated());
            createdById(o.getCreatedById());
            updatedById(o.getUpdatedById());
            externalKey(o.getExternalKey());
            timeExternal(o.getTimeExternal());
            externalTypeName(o.getExternalTypeName());
            isIncrementalData(o.getIsIncrementalData());
            isNullable(o.getIsNullable());
            length(o.getLength());
            position(o.getPosition());
            precision(o.getPrecision());
            scale(o.getScale());
            fields(o.getFields());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAttributesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListAttributesRequest
         */
        public ListAttributesRequest build() {
            ListAttributesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAttributesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAttributesRequest
         */
        public ListAttributesRequest buildWithoutInvocationCallback() {
            ListAttributesRequest request = new ListAttributesRequest();
            request.catalogId = catalogId;
            request.dataAssetKey = dataAssetKey;
            request.entityKey = entityKey;
            request.displayName = displayName;
            request.businessName = businessName;
            request.displayOrBusinessNameContains = displayOrBusinessNameContains;
            request.displayNameContains = displayNameContains;
            request.lifecycleState = lifecycleState;
            request.timeCreated = timeCreated;
            request.timeUpdated = timeUpdated;
            request.createdById = createdById;
            request.updatedById = updatedById;
            request.externalKey = externalKey;
            request.timeExternal = timeExternal;
            request.externalTypeName = externalTypeName;
            request.isIncrementalData = isIncrementalData;
            request.isNullable = isNullable;
            request.length = length;
            request.position = position;
            request.precision = precision;
            request.scale = scale;
            request.fields = fields;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListAttributesRequest(catalogId, dataAssetKey, entityKey, displayName,
            // businessName, displayOrBusinessNameContains, displayNameContains, lifecycleState,
            // timeCreated, timeUpdated, createdById, updatedById, externalKey, timeExternal,
            // externalTypeName, isIncrementalData, isNullable, length, position, precision, scale,
            // fields, sortBy, sortOrder, limit, page, opcRequestId);
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
                .dataAssetKey(dataAssetKey)
                .entityKey(entityKey)
                .displayName(displayName)
                .businessName(businessName)
                .displayOrBusinessNameContains(displayOrBusinessNameContains)
                .displayNameContains(displayNameContains)
                .lifecycleState(lifecycleState)
                .timeCreated(timeCreated)
                .timeUpdated(timeUpdated)
                .createdById(createdById)
                .updatedById(updatedById)
                .externalKey(externalKey)
                .timeExternal(timeExternal)
                .externalTypeName(externalTypeName)
                .isIncrementalData(isIncrementalData)
                .isNullable(isNullable)
                .length(length)
                .position(position)
                .precision(precision)
                .scale(scale)
                .fields(fields)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
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
        sb.append(",dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(",entityKey=").append(String.valueOf(this.entityKey));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",businessName=").append(String.valueOf(this.businessName));
        sb.append(",displayOrBusinessNameContains=")
                .append(String.valueOf(this.displayOrBusinessNameContains));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(",timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(",createdById=").append(String.valueOf(this.createdById));
        sb.append(",updatedById=").append(String.valueOf(this.updatedById));
        sb.append(",externalKey=").append(String.valueOf(this.externalKey));
        sb.append(",timeExternal=").append(String.valueOf(this.timeExternal));
        sb.append(",externalTypeName=").append(String.valueOf(this.externalTypeName));
        sb.append(",isIncrementalData=").append(String.valueOf(this.isIncrementalData));
        sb.append(",isNullable=").append(String.valueOf(this.isNullable));
        sb.append(",length=").append(String.valueOf(this.length));
        sb.append(",position=").append(String.valueOf(this.position));
        sb.append(",precision=").append(String.valueOf(this.precision));
        sb.append(",scale=").append(String.valueOf(this.scale));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
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
        if (!(o instanceof ListAttributesRequest)) {
            return false;
        }

        ListAttributesRequest other = (ListAttributesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(this.entityKey, other.entityKey)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.businessName, other.businessName)
                && java.util.Objects.equals(
                        this.displayOrBusinessNameContains, other.displayOrBusinessNameContains)
                && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && java.util.Objects.equals(this.externalKey, other.externalKey)
                && java.util.Objects.equals(this.timeExternal, other.timeExternal)
                && java.util.Objects.equals(this.externalTypeName, other.externalTypeName)
                && java.util.Objects.equals(this.isIncrementalData, other.isIncrementalData)
                && java.util.Objects.equals(this.isNullable, other.isNullable)
                && java.util.Objects.equals(this.length, other.length)
                && java.util.Objects.equals(this.position, other.position)
                && java.util.Objects.equals(this.precision, other.precision)
                && java.util.Objects.equals(this.scale, other.scale)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result = (result * PRIME) + (this.entityKey == null ? 43 : this.entityKey.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.businessName == null ? 43 : this.businessName.hashCode());
        result =
                (result * PRIME)
                        + (this.displayOrBusinessNameContains == null
                                ? 43
                                : this.displayOrBusinessNameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.displayNameContains == null
                                ? 43
                                : this.displayNameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.updatedById == null ? 43 : this.updatedById.hashCode());
        result = (result * PRIME) + (this.externalKey == null ? 43 : this.externalKey.hashCode());
        result = (result * PRIME) + (this.timeExternal == null ? 43 : this.timeExternal.hashCode());
        result =
                (result * PRIME)
                        + (this.externalTypeName == null ? 43 : this.externalTypeName.hashCode());
        result =
                (result * PRIME)
                        + (this.isIncrementalData == null ? 43 : this.isIncrementalData.hashCode());
        result = (result * PRIME) + (this.isNullable == null ? 43 : this.isNullable.hashCode());
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        result = (result * PRIME) + (this.position == null ? 43 : this.position.hashCode());
        result = (result * PRIME) + (this.precision == null ? 43 : this.precision.hashCode());
        result = (result * PRIME) + (this.scale == null ? 43 : this.scale.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}

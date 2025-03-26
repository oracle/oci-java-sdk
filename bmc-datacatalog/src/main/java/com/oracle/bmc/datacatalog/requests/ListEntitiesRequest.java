/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/ListEntitiesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListEntitiesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class ListEntitiesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique catalog identifier.
     */
    private String catalogId;

    /**
     * Unique catalog identifier.
     */
    public String getCatalogId() {
        return catalogId;
    }
    /**
     * Unique data asset key.
     */
    private String dataAssetKey;

    /**
     * Unique data asset key.
     */
    public String getDataAssetKey() {
        return dataAssetKey;
    }
    /**
     * A filter to return only resources that match the entire display name given. The match is not case sensitive.
     */
    private String displayName;

    /**
     * A filter to return only resources that match the entire display name given. The match is not case sensitive.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * A filter to return only resources that match the entire business name given. The match is not case sensitive.
     */
    private String businessName;

    /**
     * A filter to return only resources that match the entire business name given. The match is not case sensitive.
     */
    public String getBusinessName() {
        return businessName;
    }
    /**
     * A filter to return only resources that match display name or business name pattern given. The match is not case sensitive.
     * For Example : /folders?displayOrBusinessNameContains=Cu.*
     * The above would match all folders with display name or business name that starts with "Cu" or has the pattern "Cu" anywhere in between.
     *
     */
    private String displayOrBusinessNameContains;

    /**
     * A filter to return only resources that match display name or business name pattern given. The match is not case sensitive.
     * For Example : /folders?displayOrBusinessNameContains=Cu.*
     * The above would match all folders with display name or business name that starts with "Cu" or has the pattern "Cu" anywhere in between.
     *
     */
    public String getDisplayOrBusinessNameContains() {
        return displayOrBusinessNameContains;
    }
    /**
     * The key of the object type.
     */
    private String typeKey;

    /**
     * The key of the object type.
     */
    public String getTypeKey() {
        return typeKey;
    }
    /**
     * A filter to return only resources that match display name pattern given. The match is not case sensitive.
     * For Example : /folders?displayNameContains=Cu.*
     * The above would match all folders with display name that starts with "Cu" or has the pattern "Cu" anywhere in between.
     *
     */
    private String displayNameContains;

    /**
     * A filter to return only resources that match display name pattern given. The match is not case sensitive.
     * For Example : /folders?displayNameContains=Cu.*
     * The above would match all folders with display name that starts with "Cu" or has the pattern "Cu" anywhere in between.
     *
     */
    public String getDisplayNameContains() {
        return displayNameContains;
    }
    /**
     * A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
     */
    private com.oracle.bmc.datacatalog.model.LifecycleState lifecycleState;

    /**
     * A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
     */
    public com.oracle.bmc.datacatalog.model.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeCreated;

    /**
     * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }
    /**
     * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeUpdated;

    /**
     * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }
    /**
     * OCID of the user who created the resource.
     */
    private String createdById;

    /**
     * OCID of the user who created the resource.
     */
    public String getCreatedById() {
        return createdById;
    }
    /**
     * OCID of the user who updated the resource.
     */
    private String updatedById;

    /**
     * OCID of the user who updated the resource.
     */
    public String getUpdatedById() {
        return updatedById;
    }
    /**
     * Unique external identifier of this resource in the external source system.
     */
    private String externalKey;

    /**
     * Unique external identifier of this resource in the external source system.
     */
    public String getExternalKey() {
        return externalKey;
    }
    /**
     * Unique pattern key.
     */
    private String patternKey;

    /**
     * Unique pattern key.
     */
    public String getPatternKey() {
        return patternKey;
    }
    /**
     * Last modified timestamp of this object in the external system.
     */
    private java.util.Date timeExternal;

    /**
     * Last modified timestamp of this object in the external system.
     */
    public java.util.Date getTimeExternal() {
        return timeExternal;
    }
    /**
     * Time that the resource's status was last updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    private java.util.Date timeStatusUpdated;

    /**
     * Time that the resource's status was last updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    public java.util.Date getTimeStatusUpdated() {
        return timeStatusUpdated;
    }
    /**
     * Identifies if the object is a physical object (materialized) or virtual/logical object defined on other objects.
     *
     */
    private Boolean isLogical;

    /**
     * Identifies if the object is a physical object (materialized) or virtual/logical object defined on other objects.
     *
     */
    public Boolean getIsLogical() {
        return isLogical;
    }
    /**
     * Identifies if an object is a sub object (partition) of a physical or materialized parent object.
     */
    private Boolean isPartition;

    /**
     * Identifies if an object is a sub object (partition) of a physical or materialized parent object.
     */
    public Boolean getIsPartition() {
        return isPartition;
    }
    /**
     * Key of the associated folder.
     */
    private String folderKey;

    /**
     * Key of the associated folder.
     */
    public String getFolderKey() {
        return folderKey;
    }
    /**
     * Full path of the resource for resources that support paths.
     */
    private String path;

    /**
     * Full path of the resource for resources that support paths.
     */
    public String getPath() {
        return path;
    }
    /**
     * Harvest status of the harvestable resource as updated by the harvest process.
     */
    private com.oracle.bmc.datacatalog.model.HarvestStatus harvestStatus;

    /**
     * Harvest status of the harvestable resource as updated by the harvest process.
     */
    public com.oracle.bmc.datacatalog.model.HarvestStatus getHarvestStatus() {
        return harvestStatus;
    }
    /**
     * Key of the last harvest process to update this resource.
     */
    private String lastJobKey;

    /**
     * Key of the last harvest process to update this resource.
     */
    public String getLastJobKey() {
        return lastJobKey;
    }
    /**
     * Specifies the fields to return in an entity summary response.
     *
     */
    private java.util.List<Fields> fields;

    /**
     * Specifies the fields to return in an entity summary response.
     *
     **/
    public enum Fields {
        Key("key"),
        DisplayName("displayName"),
        Description("description"),
        DataAssetKey("dataAssetKey"),
        TimeCreated("timeCreated"),
        TimeUpdated("timeUpdated"),
        UpdatedById("updatedById"),
        LifecycleState("lifecycleState"),
        FolderKey("folderKey"),
        FolderName("folderName"),
        ExternalKey("externalKey"),
        Path("path"),
        Uri("uri"),
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
     * Specifies the fields to return in an entity summary response.
     *
     */
    public java.util.List<Fields> getFields() {
        return fields;
    }
    /**
     * The field to sort by. Only one sort order may be provided. DISPLAYORBUSINESSNAME considers businessName of a given object if set, else its displayName is used.
     * Default sort order for TIMECREATED is descending and default sort order for DISPLAYNAME and DISPLAYORBUSINESSNAME is ascending. If no order is specified, TIMECREATED is the default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. DISPLAYORBUSINESSNAME considers businessName of a given object if set, else its displayName is used.
     * Default sort order for TIMECREATED is descending and default sort order for DISPLAYNAME and DISPLAYORBUSINESSNAME is ascending. If no order is specified, TIMECREATED is the default.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
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
     * The field to sort by. Only one sort order may be provided. DISPLAYORBUSINESSNAME considers businessName of a given object if set, else its displayName is used.
     * Default sort order for TIMECREATED is descending and default sort order for DISPLAYNAME and DISPLAYORBUSINESSNAME is ascending. If no order is specified, TIMECREATED is the default.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
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
     * The sort order to use, either 'asc' or 'desc'.
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The maximum number of items to return.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A filter to return only process entities.
     */
    private Boolean isProcess;

    /**
     * A filter to return only process entities.
     */
    public Boolean getIsProcess() {
        return isProcess;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListEntitiesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique catalog identifier.
         */
        private String catalogId = null;

        /**
         * Unique catalog identifier.
         * @param catalogId the value to set
         * @return this builder instance
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * Unique data asset key.
         */
        private String dataAssetKey = null;

        /**
         * Unique data asset key.
         * @param dataAssetKey the value to set
         * @return this builder instance
         */
        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            return this;
        }

        /**
         * A filter to return only resources that match the entire display name given. The match is not case sensitive.
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given. The match is not case sensitive.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * A filter to return only resources that match the entire business name given. The match is not case sensitive.
         */
        private String businessName = null;

        /**
         * A filter to return only resources that match the entire business name given. The match is not case sensitive.
         * @param businessName the value to set
         * @return this builder instance
         */
        public Builder businessName(String businessName) {
            this.businessName = businessName;
            return this;
        }

        /**
         * A filter to return only resources that match display name or business name pattern given. The match is not case sensitive.
         * For Example : /folders?displayOrBusinessNameContains=Cu.*
         * The above would match all folders with display name or business name that starts with "Cu" or has the pattern "Cu" anywhere in between.
         *
         */
        private String displayOrBusinessNameContains = null;

        /**
         * A filter to return only resources that match display name or business name pattern given. The match is not case sensitive.
         * For Example : /folders?displayOrBusinessNameContains=Cu.*
         * The above would match all folders with display name or business name that starts with "Cu" or has the pattern "Cu" anywhere in between.
         *
         * @param displayOrBusinessNameContains the value to set
         * @return this builder instance
         */
        public Builder displayOrBusinessNameContains(String displayOrBusinessNameContains) {
            this.displayOrBusinessNameContains = displayOrBusinessNameContains;
            return this;
        }

        /**
         * The key of the object type.
         */
        private String typeKey = null;

        /**
         * The key of the object type.
         * @param typeKey the value to set
         * @return this builder instance
         */
        public Builder typeKey(String typeKey) {
            this.typeKey = typeKey;
            return this;
        }

        /**
         * A filter to return only resources that match display name pattern given. The match is not case sensitive.
         * For Example : /folders?displayNameContains=Cu.*
         * The above would match all folders with display name that starts with "Cu" or has the pattern "Cu" anywhere in between.
         *
         */
        private String displayNameContains = null;

        /**
         * A filter to return only resources that match display name pattern given. The match is not case sensitive.
         * For Example : /folders?displayNameContains=Cu.*
         * The above would match all folders with display name that starts with "Cu" or has the pattern "Cu" anywhere in between.
         *
         * @param displayNameContains the value to set
         * @return this builder instance
         */
        public Builder displayNameContains(String displayNameContains) {
            this.displayNameContains = displayNameContains;
            return this;
        }

        /**
         * A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
         */
        private com.oracle.bmc.datacatalog.model.LifecycleState lifecycleState = null;

        /**
         * A filter to return only resources that match the specified lifecycle state. The value is case insensitive.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.datacatalog.model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         */
        private java.util.Date timeCreated = null;

        /**
         * Time that the resource was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder instance
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            return this;
        }

        /**
         * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         */
        private java.util.Date timeUpdated = null;

        /**
         * Time that the resource was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder instance
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            return this;
        }

        /**
         * OCID of the user who created the resource.
         */
        private String createdById = null;

        /**
         * OCID of the user who created the resource.
         * @param createdById the value to set
         * @return this builder instance
         */
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            return this;
        }

        /**
         * OCID of the user who updated the resource.
         */
        private String updatedById = null;

        /**
         * OCID of the user who updated the resource.
         * @param updatedById the value to set
         * @return this builder instance
         */
        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            return this;
        }

        /**
         * Unique external identifier of this resource in the external source system.
         */
        private String externalKey = null;

        /**
         * Unique external identifier of this resource in the external source system.
         * @param externalKey the value to set
         * @return this builder instance
         */
        public Builder externalKey(String externalKey) {
            this.externalKey = externalKey;
            return this;
        }

        /**
         * Unique pattern key.
         */
        private String patternKey = null;

        /**
         * Unique pattern key.
         * @param patternKey the value to set
         * @return this builder instance
         */
        public Builder patternKey(String patternKey) {
            this.patternKey = patternKey;
            return this;
        }

        /**
         * Last modified timestamp of this object in the external system.
         */
        private java.util.Date timeExternal = null;

        /**
         * Last modified timestamp of this object in the external system.
         * @param timeExternal the value to set
         * @return this builder instance
         */
        public Builder timeExternal(java.util.Date timeExternal) {
            this.timeExternal = timeExternal;
            return this;
        }

        /**
         * Time that the resource's status was last updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         */
        private java.util.Date timeStatusUpdated = null;

        /**
         * Time that the resource's status was last updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         * @param timeStatusUpdated the value to set
         * @return this builder instance
         */
        public Builder timeStatusUpdated(java.util.Date timeStatusUpdated) {
            this.timeStatusUpdated = timeStatusUpdated;
            return this;
        }

        /**
         * Identifies if the object is a physical object (materialized) or virtual/logical object defined on other objects.
         *
         */
        private Boolean isLogical = null;

        /**
         * Identifies if the object is a physical object (materialized) or virtual/logical object defined on other objects.
         *
         * @param isLogical the value to set
         * @return this builder instance
         */
        public Builder isLogical(Boolean isLogical) {
            this.isLogical = isLogical;
            return this;
        }

        /**
         * Identifies if an object is a sub object (partition) of a physical or materialized parent object.
         */
        private Boolean isPartition = null;

        /**
         * Identifies if an object is a sub object (partition) of a physical or materialized parent object.
         * @param isPartition the value to set
         * @return this builder instance
         */
        public Builder isPartition(Boolean isPartition) {
            this.isPartition = isPartition;
            return this;
        }

        /**
         * Key of the associated folder.
         */
        private String folderKey = null;

        /**
         * Key of the associated folder.
         * @param folderKey the value to set
         * @return this builder instance
         */
        public Builder folderKey(String folderKey) {
            this.folderKey = folderKey;
            return this;
        }

        /**
         * Full path of the resource for resources that support paths.
         */
        private String path = null;

        /**
         * Full path of the resource for resources that support paths.
         * @param path the value to set
         * @return this builder instance
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * Harvest status of the harvestable resource as updated by the harvest process.
         */
        private com.oracle.bmc.datacatalog.model.HarvestStatus harvestStatus = null;

        /**
         * Harvest status of the harvestable resource as updated by the harvest process.
         * @param harvestStatus the value to set
         * @return this builder instance
         */
        public Builder harvestStatus(com.oracle.bmc.datacatalog.model.HarvestStatus harvestStatus) {
            this.harvestStatus = harvestStatus;
            return this;
        }

        /**
         * Key of the last harvest process to update this resource.
         */
        private String lastJobKey = null;

        /**
         * Key of the last harvest process to update this resource.
         * @param lastJobKey the value to set
         * @return this builder instance
         */
        public Builder lastJobKey(String lastJobKey) {
            this.lastJobKey = lastJobKey;
            return this;
        }

        /**
         * Specifies the fields to return in an entity summary response.
         *
         */
        private java.util.List<Fields> fields = null;

        /**
         * Specifies the fields to return in an entity summary response.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to return in an entity summary response.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fields(Fields singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        /**
         * The field to sort by. Only one sort order may be provided. DISPLAYORBUSINESSNAME considers businessName of a given object if set, else its displayName is used.
         * Default sort order for TIMECREATED is descending and default sort order for DISPLAYNAME and DISPLAYORBUSINESSNAME is ascending. If no order is specified, TIMECREATED is the default.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. DISPLAYORBUSINESSNAME considers businessName of a given object if set, else its displayName is used.
         * Default sort order for TIMECREATED is descending and default sort order for DISPLAYNAME and DISPLAYORBUSINESSNAME is ascending. If no order is specified, TIMECREATED is the default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use, either 'asc' or 'desc'.
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The maximum number of items to return.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A filter to return only process entities.
         */
        private Boolean isProcess = null;

        /**
         * A filter to return only process entities.
         * @param isProcess the value to set
         * @return this builder instance
         */
        public Builder isProcess(Boolean isProcess) {
            this.isProcess = isProcess;
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
        public Builder copy(ListEntitiesRequest o) {
            catalogId(o.getCatalogId());
            dataAssetKey(o.getDataAssetKey());
            displayName(o.getDisplayName());
            businessName(o.getBusinessName());
            displayOrBusinessNameContains(o.getDisplayOrBusinessNameContains());
            typeKey(o.getTypeKey());
            displayNameContains(o.getDisplayNameContains());
            lifecycleState(o.getLifecycleState());
            timeCreated(o.getTimeCreated());
            timeUpdated(o.getTimeUpdated());
            createdById(o.getCreatedById());
            updatedById(o.getUpdatedById());
            externalKey(o.getExternalKey());
            patternKey(o.getPatternKey());
            timeExternal(o.getTimeExternal());
            timeStatusUpdated(o.getTimeStatusUpdated());
            isLogical(o.getIsLogical());
            isPartition(o.getIsPartition());
            folderKey(o.getFolderKey());
            path(o.getPath());
            harvestStatus(o.getHarvestStatus());
            lastJobKey(o.getLastJobKey());
            fields(o.getFields());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            isProcess(o.getIsProcess());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListEntitiesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListEntitiesRequest
         */
        public ListEntitiesRequest build() {
            ListEntitiesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListEntitiesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListEntitiesRequest
         */
        public ListEntitiesRequest buildWithoutInvocationCallback() {
            ListEntitiesRequest request = new ListEntitiesRequest();
            request.catalogId = catalogId;
            request.dataAssetKey = dataAssetKey;
            request.displayName = displayName;
            request.businessName = businessName;
            request.displayOrBusinessNameContains = displayOrBusinessNameContains;
            request.typeKey = typeKey;
            request.displayNameContains = displayNameContains;
            request.lifecycleState = lifecycleState;
            request.timeCreated = timeCreated;
            request.timeUpdated = timeUpdated;
            request.createdById = createdById;
            request.updatedById = updatedById;
            request.externalKey = externalKey;
            request.patternKey = patternKey;
            request.timeExternal = timeExternal;
            request.timeStatusUpdated = timeStatusUpdated;
            request.isLogical = isLogical;
            request.isPartition = isPartition;
            request.folderKey = folderKey;
            request.path = path;
            request.harvestStatus = harvestStatus;
            request.lastJobKey = lastJobKey;
            request.fields = fields;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.isProcess = isProcess;
            return request;
            // new ListEntitiesRequest(catalogId, dataAssetKey, displayName, businessName, displayOrBusinessNameContains, typeKey, displayNameContains, lifecycleState, timeCreated, timeUpdated, createdById, updatedById, externalKey, patternKey, timeExternal, timeStatusUpdated, isLogical, isPartition, folderKey, path, harvestStatus, lastJobKey, fields, sortBy, sortOrder, limit, page, opcRequestId, isProcess);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .catalogId(catalogId)
                .dataAssetKey(dataAssetKey)
                .displayName(displayName)
                .businessName(businessName)
                .displayOrBusinessNameContains(displayOrBusinessNameContains)
                .typeKey(typeKey)
                .displayNameContains(displayNameContains)
                .lifecycleState(lifecycleState)
                .timeCreated(timeCreated)
                .timeUpdated(timeUpdated)
                .createdById(createdById)
                .updatedById(updatedById)
                .externalKey(externalKey)
                .patternKey(patternKey)
                .timeExternal(timeExternal)
                .timeStatusUpdated(timeStatusUpdated)
                .isLogical(isLogical)
                .isPartition(isPartition)
                .folderKey(folderKey)
                .path(path)
                .harvestStatus(harvestStatus)
                .lastJobKey(lastJobKey)
                .fields(fields)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .isProcess(isProcess);
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
        sb.append(",catalogId=").append(String.valueOf(this.catalogId));
        sb.append(",dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",businessName=").append(String.valueOf(this.businessName));
        sb.append(",displayOrBusinessNameContains=")
                .append(String.valueOf(this.displayOrBusinessNameContains));
        sb.append(",typeKey=").append(String.valueOf(this.typeKey));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(",timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(",createdById=").append(String.valueOf(this.createdById));
        sb.append(",updatedById=").append(String.valueOf(this.updatedById));
        sb.append(",externalKey=").append(String.valueOf(this.externalKey));
        sb.append(",patternKey=").append(String.valueOf(this.patternKey));
        sb.append(",timeExternal=").append(String.valueOf(this.timeExternal));
        sb.append(",timeStatusUpdated=").append(String.valueOf(this.timeStatusUpdated));
        sb.append(",isLogical=").append(String.valueOf(this.isLogical));
        sb.append(",isPartition=").append(String.valueOf(this.isPartition));
        sb.append(",folderKey=").append(String.valueOf(this.folderKey));
        sb.append(",path=").append(String.valueOf(this.path));
        sb.append(",harvestStatus=").append(String.valueOf(this.harvestStatus));
        sb.append(",lastJobKey=").append(String.valueOf(this.lastJobKey));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isProcess=").append(String.valueOf(this.isProcess));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListEntitiesRequest)) {
            return false;
        }

        ListEntitiesRequest other = (ListEntitiesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.businessName, other.businessName)
                && java.util.Objects.equals(
                        this.displayOrBusinessNameContains, other.displayOrBusinessNameContains)
                && java.util.Objects.equals(this.typeKey, other.typeKey)
                && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && java.util.Objects.equals(this.externalKey, other.externalKey)
                && java.util.Objects.equals(this.patternKey, other.patternKey)
                && java.util.Objects.equals(this.timeExternal, other.timeExternal)
                && java.util.Objects.equals(this.timeStatusUpdated, other.timeStatusUpdated)
                && java.util.Objects.equals(this.isLogical, other.isLogical)
                && java.util.Objects.equals(this.isPartition, other.isPartition)
                && java.util.Objects.equals(this.folderKey, other.folderKey)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.harvestStatus, other.harvestStatus)
                && java.util.Objects.equals(this.lastJobKey, other.lastJobKey)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.isProcess, other.isProcess);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.businessName == null ? 43 : this.businessName.hashCode());
        result =
                (result * PRIME)
                        + (this.displayOrBusinessNameContains == null
                                ? 43
                                : this.displayOrBusinessNameContains.hashCode());
        result = (result * PRIME) + (this.typeKey == null ? 43 : this.typeKey.hashCode());
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
        result = (result * PRIME) + (this.patternKey == null ? 43 : this.patternKey.hashCode());
        result = (result * PRIME) + (this.timeExternal == null ? 43 : this.timeExternal.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStatusUpdated == null ? 43 : this.timeStatusUpdated.hashCode());
        result = (result * PRIME) + (this.isLogical == null ? 43 : this.isLogical.hashCode());
        result = (result * PRIME) + (this.isPartition == null ? 43 : this.isPartition.hashCode());
        result = (result * PRIME) + (this.folderKey == null ? 43 : this.folderKey.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result =
                (result * PRIME)
                        + (this.harvestStatus == null ? 43 : this.harvestStatus.hashCode());
        result = (result * PRIME) + (this.lastJobKey == null ? 43 : this.lastJobKey.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.isProcess == null ? 43 : this.isProcess.hashCode());
        return result;
    }
}

/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard.model;

/**
 * Properties for a dashboard, including dashboard id.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200901")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManagementDashboard.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ManagementDashboard {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dashboardId")
        private String dashboardId;

        public Builder dashboardId(String dashboardId) {
            this.dashboardId = dashboardId;
            this.__explicitlySet__.add("dashboardId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("providerId")
        private String providerId;

        public Builder providerId(String providerId) {
            this.providerId = providerId;
            this.__explicitlySet__.add("providerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("providerName")
        private String providerName;

        public Builder providerName(String providerName) {
            this.providerName = providerName;
            this.__explicitlySet__.add("providerName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("providerVersion")
        private String providerVersion;

        public Builder providerVersion(String providerVersion) {
            this.providerVersion = providerVersion;
            this.__explicitlySet__.add("providerVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tiles")
        private java.util.List<ManagementDashboardTileDetails> tiles;

        public Builder tiles(java.util.List<ManagementDashboardTileDetails> tiles) {
            this.tiles = tiles;
            this.__explicitlySet__.add("tiles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOobDashboard")
        private Boolean isOobDashboard;

        public Builder isOobDashboard(Boolean isOobDashboard) {
            this.isOobDashboard = isOobDashboard;
            this.__explicitlySet__.add("isOobDashboard");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isShowInHome")
        private Boolean isShowInHome;

        public Builder isShowInHome(Boolean isShowInHome) {
            this.isShowInHome = isShowInHome;
            this.__explicitlySet__.add("isShowInHome");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            this.__explicitlySet__.add("updatedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadataVersion")
        private String metadataVersion;

        public Builder metadataVersion(String metadataVersion) {
            this.metadataVersion = metadataVersion;
            this.__explicitlySet__.add("metadataVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isShowDescription")
        private Boolean isShowDescription;

        public Builder isShowDescription(Boolean isShowDescription) {
            this.isShowDescription = isShowDescription;
            this.__explicitlySet__.add("isShowDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("screenImage")
        private String screenImage;

        public Builder screenImage(String screenImage) {
            this.screenImage = screenImage;
            this.__explicitlySet__.add("screenImage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nls")
        private Object nls;

        public Builder nls(Object nls) {
            this.nls = nls;
            this.__explicitlySet__.add("nls");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uiConfig")
        private Object uiConfig;

        public Builder uiConfig(Object uiConfig) {
            this.uiConfig = uiConfig;
            this.__explicitlySet__.add("uiConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataConfig")
        private java.util.List<Object> dataConfig;

        public Builder dataConfig(java.util.List<Object> dataConfig) {
            this.dataConfig = dataConfig;
            this.__explicitlySet__.add("dataConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFavorite")
        private Boolean isFavorite;

        public Builder isFavorite(Boolean isFavorite) {
            this.isFavorite = isFavorite;
            this.__explicitlySet__.add("isFavorite");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("savedSearches")
        private java.util.List<ManagementSavedSearch> savedSearches;

        public Builder savedSearches(java.util.List<ManagementSavedSearch> savedSearches) {
            this.savedSearches = savedSearches;
            this.__explicitlySet__.add("savedSearches");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementDashboard build() {
            ManagementDashboard __instance__ =
                    new ManagementDashboard(
                            dashboardId,
                            providerId,
                            providerName,
                            providerVersion,
                            tiles,
                            displayName,
                            description,
                            compartmentId,
                            isOobDashboard,
                            isShowInHome,
                            createdBy,
                            timeCreated,
                            updatedBy,
                            timeUpdated,
                            metadataVersion,
                            isShowDescription,
                            screenImage,
                            nls,
                            uiConfig,
                            dataConfig,
                            type,
                            isFavorite,
                            savedSearches,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementDashboard o) {
            Builder copiedBuilder =
                    dashboardId(o.getDashboardId())
                            .providerId(o.getProviderId())
                            .providerName(o.getProviderName())
                            .providerVersion(o.getProviderVersion())
                            .tiles(o.getTiles())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .compartmentId(o.getCompartmentId())
                            .isOobDashboard(o.getIsOobDashboard())
                            .isShowInHome(o.getIsShowInHome())
                            .createdBy(o.getCreatedBy())
                            .timeCreated(o.getTimeCreated())
                            .updatedBy(o.getUpdatedBy())
                            .timeUpdated(o.getTimeUpdated())
                            .metadataVersion(o.getMetadataVersion())
                            .isShowDescription(o.getIsShowDescription())
                            .screenImage(o.getScreenImage())
                            .nls(o.getNls())
                            .uiConfig(o.getUiConfig())
                            .dataConfig(o.getDataConfig())
                            .type(o.getType())
                            .isFavorite(o.getIsFavorite())
                            .savedSearches(o.getSavedSearches())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Dashboard Id. Must be providied if OOB, otherwise must not be provided.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dashboardId")
    String dashboardId;

    /**
     * Provider Id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerId")
    String providerId;

    /**
     * Provider name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    String providerName;

    /**
     * Provider version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerVersion")
    String providerVersion;

    /**
     * Dashboard tiles array
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tiles")
    java.util.List<ManagementDashboardTileDetails> tiles;

    /**
     * Display name for dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Dashboard's description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The ocid of the compartment that owns the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * String boolean (\"true\" or \"false\"). OOB (Out of the Box) dashboards are only provided by Oracle.  They cannot be modified by non-Oracle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOobDashboard")
    Boolean isOobDashboard;

    /**
     * String boolean (\"true\" or \"false\").  When false, dashboard is not shown in dashboard home.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isShowInHome")
    Boolean isShowInHome;

    /**
     * Created by which user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    String createdBy;

    /**
     * Time created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * Updated by which user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    String updatedBy;

    /**
     * Time updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * Version of the metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadataVersion")
    String metadataVersion;

    /**
     * String boolean (\"true\" or \"false\").  When false, dashboard is not automatically refreshed in intervals.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isShowDescription")
    Boolean isShowDescription;

    /**
     * screen image.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("screenImage")
    String screenImage;

    /**
     * Json for internationalization.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nls")
    Object nls;

    /**
     * Json to contain options for UI.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uiConfig")
    Object uiConfig;

    /**
     * Array of Json to contain options for source of data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataConfig")
    java.util.List<Object> dataConfig;

    /**
     * NORMAL means single dashboard, SET means dashboard set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    String type;

    /**
     * String boolean (\"true\" or \"false\").
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFavorite")
    Boolean isFavorite;

    /**
     * Array of saved searches.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("savedSearches")
    java.util.List<ManagementSavedSearch> savedSearches;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: `{\"bar-key\": \"value\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: `{\"foo-namespace\": {\"bar-key\": \"value\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

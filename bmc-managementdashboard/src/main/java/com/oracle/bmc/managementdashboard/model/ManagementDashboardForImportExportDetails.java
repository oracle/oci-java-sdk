/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard.model;

/**
 * Properties of a dashboard, including dashboard ID and saved searches, for import purposes.
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
    builder = ManagementDashboardForImportExportDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ManagementDashboardForImportExportDetails {
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
        private java.util.List<ManagementSavedSearchForImportDetails> savedSearches;

        public Builder savedSearches(
                java.util.List<ManagementSavedSearchForImportDetails> savedSearches) {
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

        public ManagementDashboardForImportExportDetails build() {
            ManagementDashboardForImportExportDetails __instance__ =
                    new ManagementDashboardForImportExportDetails(
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
        public Builder copy(ManagementDashboardForImportExportDetails o) {
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
     * ID of the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dashboardId")
    String dashboardId;

    /**
     * ID of the service (for example log-analytics) that owns the dashboard. Each service has a unique ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerId")
    String providerId;

    /**
     * Name of the service (for example, Logging Analytics) that owns the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    String providerName;

    /**
     * Version of the service that owns the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerVersion")
    String providerVersion;

    /**
     * Array of dashboard tiles.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tiles")
    java.util.List<ManagementDashboardTileDetails> tiles;

    /**
     * Display name of the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Description of the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * OCID of the compartment in which the dashboard resides.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Determines whether the dashboard is an Out-of-the-Box (OOB) dashboard. Note that OOB dashboards are only provided by Oracle and cannot be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOobDashboard")
    Boolean isOobDashboard;

    /**
     * Determines whether the dashboard will be displayed in Dashboard Home.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isShowInHome")
    Boolean isShowInHome;

    /**
     * Version of the metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadataVersion")
    String metadataVersion;

    /**
     * Determines whether the description of the dashboard is displayed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isShowDescription")
    Boolean isShowDescription;

    /**
     * Screen image of the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("screenImage")
    String screenImage;

    /**
     * JSON that contains internationalization options.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nls")
    Object nls;

    /**
     * JSON that contains user interface options.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uiConfig")
    Object uiConfig;

    /**
     * Array of JSON that contain data source options.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataConfig")
    java.util.List<Object> dataConfig;

    /**
     * Type of dashboard. NORMAL denotes a single dashboard and SET denotes a dashboard set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    String type;

    /**
     * Determines whether the dashboard is set as favorite.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFavorite")
    Boolean isFavorite;

    /**
     * Array of saved searches in the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("savedSearches")
    java.util.List<ManagementSavedSearchForImportDetails> savedSearches;

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

/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManagementDashboardForImportExportDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagementDashboardForImportExportDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dashboardId",
        "providerId",
        "providerName",
        "providerVersion",
        "tiles",
        "displayName",
        "description",
        "compartmentId",
        "isOobDashboard",
        "isShowInHome",
        "metadataVersion",
        "isShowDescription",
        "screenImage",
        "nls",
        "uiConfig",
        "dataConfig",
        "type",
        "isFavorite",
        "savedSearches",
        "parametersConfig",
        "drilldownConfig",
        "freeformTags",
        "definedTags"
    })
    public ManagementDashboardForImportExportDetails(
            String dashboardId,
            String providerId,
            String providerName,
            String providerVersion,
            java.util.List<ManagementDashboardTileDetails> tiles,
            String displayName,
            String description,
            String compartmentId,
            Boolean isOobDashboard,
            Boolean isShowInHome,
            String metadataVersion,
            Boolean isShowDescription,
            String screenImage,
            Object nls,
            Object uiConfig,
            java.util.List<Object> dataConfig,
            String type,
            Boolean isFavorite,
            java.util.List<ManagementSavedSearchForImportDetails> savedSearches,
            java.util.List<Object> parametersConfig,
            java.util.List<Object> drilldownConfig,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.dashboardId = dashboardId;
        this.providerId = providerId;
        this.providerName = providerName;
        this.providerVersion = providerVersion;
        this.tiles = tiles;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.isOobDashboard = isOobDashboard;
        this.isShowInHome = isShowInHome;
        this.metadataVersion = metadataVersion;
        this.isShowDescription = isShowDescription;
        this.screenImage = screenImage;
        this.nls = nls;
        this.uiConfig = uiConfig;
        this.dataConfig = dataConfig;
        this.type = type;
        this.isFavorite = isFavorite;
        this.savedSearches = savedSearches;
        this.parametersConfig = parametersConfig;
        this.drilldownConfig = drilldownConfig;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        @com.fasterxml.jackson.annotation.JsonProperty("parametersConfig")
        private java.util.List<Object> parametersConfig;

        public Builder parametersConfig(java.util.List<Object> parametersConfig) {
            this.parametersConfig = parametersConfig;
            this.__explicitlySet__.add("parametersConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("drilldownConfig")
        private java.util.List<Object> drilldownConfig;

        public Builder drilldownConfig(java.util.List<Object> drilldownConfig) {
            this.drilldownConfig = drilldownConfig;
            this.__explicitlySet__.add("drilldownConfig");
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
                            parametersConfig,
                            drilldownConfig,
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
                            .parametersConfig(o.getParametersConfig())
                            .drilldownConfig(o.getDrilldownConfig())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * ID of the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dashboardId")
    private final String dashboardId;

    public String getDashboardId() {
        return dashboardId;
    }

    /**
     * ID of the service (for example log-analytics) that owns the dashboard. Each service has a unique ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerId")
    private final String providerId;

    public String getProviderId() {
        return providerId;
    }

    /**
     * Name of the service (for example, Logging Analytics) that owns the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    private final String providerName;

    public String getProviderName() {
        return providerName;
    }

    /**
     * Version of the service that owns the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerVersion")
    private final String providerVersion;

    public String getProviderVersion() {
        return providerVersion;
    }

    /**
     * Array of dashboard tiles.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tiles")
    private final java.util.List<ManagementDashboardTileDetails> tiles;

    public java.util.List<ManagementDashboardTileDetails> getTiles() {
        return tiles;
    }

    /**
     * Display name of the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Description of the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * OCID of the compartment in which the dashboard resides.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Determines whether the dashboard is an Out-of-the-Box (OOB) dashboard. Note that OOB dashboards are only provided by Oracle and cannot be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOobDashboard")
    private final Boolean isOobDashboard;

    public Boolean getIsOobDashboard() {
        return isOobDashboard;
    }

    /**
     * Determines whether the dashboard will be displayed in Dashboard Home.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isShowInHome")
    private final Boolean isShowInHome;

    public Boolean getIsShowInHome() {
        return isShowInHome;
    }

    /**
     * Version of the metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadataVersion")
    private final String metadataVersion;

    public String getMetadataVersion() {
        return metadataVersion;
    }

    /**
     * Determines whether the description of the dashboard is displayed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isShowDescription")
    private final Boolean isShowDescription;

    public Boolean getIsShowDescription() {
        return isShowDescription;
    }

    /**
     * Screen image of the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("screenImage")
    private final String screenImage;

    public String getScreenImage() {
        return screenImage;
    }

    /**
     * JSON that contains internationalization options.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nls")
    private final Object nls;

    public Object getNls() {
        return nls;
    }

    /**
     * JSON that contains user interface options.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uiConfig")
    private final Object uiConfig;

    public Object getUiConfig() {
        return uiConfig;
    }

    /**
     * Array of JSON that contain data source options.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataConfig")
    private final java.util.List<Object> dataConfig;

    public java.util.List<Object> getDataConfig() {
        return dataConfig;
    }

    /**
     * Type of dashboard. NORMAL denotes a single dashboard and SET denotes a dashboard set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    public String getType() {
        return type;
    }

    /**
     * Determines whether the dashboard is set as favorite.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFavorite")
    private final Boolean isFavorite;

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    /**
     * Array of saved searches in the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("savedSearches")
    private final java.util.List<ManagementSavedSearchForImportDetails> savedSearches;

    public java.util.List<ManagementSavedSearchForImportDetails> getSavedSearches() {
        return savedSearches;
    }

    /**
     * Defines parameters for the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parametersConfig")
    private final java.util.List<Object> parametersConfig;

    public java.util.List<Object> getParametersConfig() {
        return parametersConfig;
    }

    /**
     * Drill-down configuration to define the destination of a drill-down action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drilldownConfig")
    private final java.util.List<Object> drilldownConfig;

    public java.util.List<Object> getDrilldownConfig() {
        return drilldownConfig;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ManagementDashboardForImportExportDetails(");
        sb.append("dashboardId=").append(String.valueOf(this.dashboardId));
        sb.append(", providerId=").append(String.valueOf(this.providerId));
        sb.append(", providerName=").append(String.valueOf(this.providerName));
        sb.append(", providerVersion=").append(String.valueOf(this.providerVersion));
        sb.append(", tiles=").append(String.valueOf(this.tiles));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isOobDashboard=").append(String.valueOf(this.isOobDashboard));
        sb.append(", isShowInHome=").append(String.valueOf(this.isShowInHome));
        sb.append(", metadataVersion=").append(String.valueOf(this.metadataVersion));
        sb.append(", isShowDescription=").append(String.valueOf(this.isShowDescription));
        sb.append(", screenImage=").append(String.valueOf(this.screenImage));
        sb.append(", nls=").append(String.valueOf(this.nls));
        sb.append(", uiConfig=").append(String.valueOf(this.uiConfig));
        sb.append(", dataConfig=").append(String.valueOf(this.dataConfig));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", isFavorite=").append(String.valueOf(this.isFavorite));
        sb.append(", savedSearches=").append(String.valueOf(this.savedSearches));
        sb.append(", parametersConfig=").append(String.valueOf(this.parametersConfig));
        sb.append(", drilldownConfig=").append(String.valueOf(this.drilldownConfig));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementDashboardForImportExportDetails)) {
            return false;
        }

        ManagementDashboardForImportExportDetails other =
                (ManagementDashboardForImportExportDetails) o;
        return java.util.Objects.equals(this.dashboardId, other.dashboardId)
                && java.util.Objects.equals(this.providerId, other.providerId)
                && java.util.Objects.equals(this.providerName, other.providerName)
                && java.util.Objects.equals(this.providerVersion, other.providerVersion)
                && java.util.Objects.equals(this.tiles, other.tiles)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isOobDashboard, other.isOobDashboard)
                && java.util.Objects.equals(this.isShowInHome, other.isShowInHome)
                && java.util.Objects.equals(this.metadataVersion, other.metadataVersion)
                && java.util.Objects.equals(this.isShowDescription, other.isShowDescription)
                && java.util.Objects.equals(this.screenImage, other.screenImage)
                && java.util.Objects.equals(this.nls, other.nls)
                && java.util.Objects.equals(this.uiConfig, other.uiConfig)
                && java.util.Objects.equals(this.dataConfig, other.dataConfig)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.isFavorite, other.isFavorite)
                && java.util.Objects.equals(this.savedSearches, other.savedSearches)
                && java.util.Objects.equals(this.parametersConfig, other.parametersConfig)
                && java.util.Objects.equals(this.drilldownConfig, other.drilldownConfig)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dashboardId == null ? 43 : this.dashboardId.hashCode());
        result = (result * PRIME) + (this.providerId == null ? 43 : this.providerId.hashCode());
        result = (result * PRIME) + (this.providerName == null ? 43 : this.providerName.hashCode());
        result =
                (result * PRIME)
                        + (this.providerVersion == null ? 43 : this.providerVersion.hashCode());
        result = (result * PRIME) + (this.tiles == null ? 43 : this.tiles.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.isOobDashboard == null ? 43 : this.isOobDashboard.hashCode());
        result = (result * PRIME) + (this.isShowInHome == null ? 43 : this.isShowInHome.hashCode());
        result =
                (result * PRIME)
                        + (this.metadataVersion == null ? 43 : this.metadataVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.isShowDescription == null ? 43 : this.isShowDescription.hashCode());
        result = (result * PRIME) + (this.screenImage == null ? 43 : this.screenImage.hashCode());
        result = (result * PRIME) + (this.nls == null ? 43 : this.nls.hashCode());
        result = (result * PRIME) + (this.uiConfig == null ? 43 : this.uiConfig.hashCode());
        result = (result * PRIME) + (this.dataConfig == null ? 43 : this.dataConfig.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.isFavorite == null ? 43 : this.isFavorite.hashCode());
        result =
                (result * PRIME)
                        + (this.savedSearches == null ? 43 : this.savedSearches.hashCode());
        result =
                (result * PRIME)
                        + (this.parametersConfig == null ? 43 : this.parametersConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.drilldownConfig == null ? 43 : this.drilldownConfig.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}

/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard.model;

/**
 * Properties of a dashboard.  ID of the dashboard must only be provided for Out-of-the-Box (OOB) dashboards.
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
    builder = CreateManagementDashboardDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateManagementDashboardDetails {
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
        "parametersConfig",
        "drilldownConfig",
        "freeformTags",
        "definedTags"
    })
    public CreateManagementDashboardDetails(
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
        this.parametersConfig = parametersConfig;
        this.drilldownConfig = drilldownConfig;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * ID of the dashboard, which must only be provided for Out-of-the-Box (OOB) dashboards.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dashboardId")
        private String dashboardId;

        /**
         * ID of the dashboard, which must only be provided for Out-of-the-Box (OOB) dashboards.
         * @param dashboardId the value to set
         * @return this builder
         **/
        public Builder dashboardId(String dashboardId) {
            this.dashboardId = dashboardId;
            this.__explicitlySet__.add("dashboardId");
            return this;
        }
        /**
         * ID of the service (for example, log-analytics) that owns the dashboard. Each service has a unique ID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("providerId")
        private String providerId;

        /**
         * ID of the service (for example, log-analytics) that owns the dashboard. Each service has a unique ID.
         * @param providerId the value to set
         * @return this builder
         **/
        public Builder providerId(String providerId) {
            this.providerId = providerId;
            this.__explicitlySet__.add("providerId");
            return this;
        }
        /**
         * Name of the service (for example, Logging Analytics) that owns the dashboard.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("providerName")
        private String providerName;

        /**
         * Name of the service (for example, Logging Analytics) that owns the dashboard.
         * @param providerName the value to set
         * @return this builder
         **/
        public Builder providerName(String providerName) {
            this.providerName = providerName;
            this.__explicitlySet__.add("providerName");
            return this;
        }
        /**
         * Version of the service that owns the dashboard.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("providerVersion")
        private String providerVersion;

        /**
         * Version of the service that owns the dashboard.
         * @param providerVersion the value to set
         * @return this builder
         **/
        public Builder providerVersion(String providerVersion) {
            this.providerVersion = providerVersion;
            this.__explicitlySet__.add("providerVersion");
            return this;
        }
        /**
         * Array of dashboard tiles.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tiles")
        private java.util.List<ManagementDashboardTileDetails> tiles;

        /**
         * Array of dashboard tiles.
         * @param tiles the value to set
         * @return this builder
         **/
        public Builder tiles(java.util.List<ManagementDashboardTileDetails> tiles) {
            this.tiles = tiles;
            this.__explicitlySet__.add("tiles");
            return this;
        }
        /**
         * Display name of the dashboard.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the dashboard.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Description of the dashboard.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the dashboard.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * OCID of the compartment in which the dashboard resides.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment in which the dashboard resides.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Determines whether the dashboard is an Out-of-the-Box (OOB) dashboard. Note that OOB dashboards are only provided by Oracle and cannot be modified.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOobDashboard")
        private Boolean isOobDashboard;

        /**
         * Determines whether the dashboard is an Out-of-the-Box (OOB) dashboard. Note that OOB dashboards are only provided by Oracle and cannot be modified.
         * @param isOobDashboard the value to set
         * @return this builder
         **/
        public Builder isOobDashboard(Boolean isOobDashboard) {
            this.isOobDashboard = isOobDashboard;
            this.__explicitlySet__.add("isOobDashboard");
            return this;
        }
        /**
         * Determines whether the dashboard will be displayed in Dashboard Home.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isShowInHome")
        private Boolean isShowInHome;

        /**
         * Determines whether the dashboard will be displayed in Dashboard Home.
         * @param isShowInHome the value to set
         * @return this builder
         **/
        public Builder isShowInHome(Boolean isShowInHome) {
            this.isShowInHome = isShowInHome;
            this.__explicitlySet__.add("isShowInHome");
            return this;
        }
        /**
         * Version of the metadata.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadataVersion")
        private String metadataVersion;

        /**
         * Version of the metadata.
         * @param metadataVersion the value to set
         * @return this builder
         **/
        public Builder metadataVersion(String metadataVersion) {
            this.metadataVersion = metadataVersion;
            this.__explicitlySet__.add("metadataVersion");
            return this;
        }
        /**
         * Determines whether the description of the dashboard is displayed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isShowDescription")
        private Boolean isShowDescription;

        /**
         * Determines whether the description of the dashboard is displayed.
         * @param isShowDescription the value to set
         * @return this builder
         **/
        public Builder isShowDescription(Boolean isShowDescription) {
            this.isShowDescription = isShowDescription;
            this.__explicitlySet__.add("isShowDescription");
            return this;
        }
        /**
         * Screen image of the dashboard.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("screenImage")
        private String screenImage;

        /**
         * Screen image of the dashboard.
         * @param screenImage the value to set
         * @return this builder
         **/
        public Builder screenImage(String screenImage) {
            this.screenImage = screenImage;
            this.__explicitlySet__.add("screenImage");
            return this;
        }
        /**
         * JSON that contains internationalization options.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nls")
        private Object nls;

        /**
         * JSON that contains internationalization options.
         * @param nls the value to set
         * @return this builder
         **/
        public Builder nls(Object nls) {
            this.nls = nls;
            this.__explicitlySet__.add("nls");
            return this;
        }
        /**
         * JSON that contains user interface options.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uiConfig")
        private Object uiConfig;

        /**
         * JSON that contains user interface options.
         * @param uiConfig the value to set
         * @return this builder
         **/
        public Builder uiConfig(Object uiConfig) {
            this.uiConfig = uiConfig;
            this.__explicitlySet__.add("uiConfig");
            return this;
        }
        /**
         * Array of JSON that contain data source options.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataConfig")
        private java.util.List<Object> dataConfig;

        /**
         * Array of JSON that contain data source options.
         * @param dataConfig the value to set
         * @return this builder
         **/
        public Builder dataConfig(java.util.List<Object> dataConfig) {
            this.dataConfig = dataConfig;
            this.__explicitlySet__.add("dataConfig");
            return this;
        }
        /**
         * Type of dashboard. NORMAL denotes a single dashboard and SET denotes a dashboard set.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Type of dashboard. NORMAL denotes a single dashboard and SET denotes a dashboard set.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Determines whether the dashboard is set as favorite.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFavorite")
        private Boolean isFavorite;

        /**
         * Determines whether the dashboard is set as favorite.
         * @param isFavorite the value to set
         * @return this builder
         **/
        public Builder isFavorite(Boolean isFavorite) {
            this.isFavorite = isFavorite;
            this.__explicitlySet__.add("isFavorite");
            return this;
        }
        /**
         * Defines parameters for the dashboard.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parametersConfig")
        private java.util.List<Object> parametersConfig;

        /**
         * Defines parameters for the dashboard.
         * @param parametersConfig the value to set
         * @return this builder
         **/
        public Builder parametersConfig(java.util.List<Object> parametersConfig) {
            this.parametersConfig = parametersConfig;
            this.__explicitlySet__.add("parametersConfig");
            return this;
        }
        /**
         * Drill-down configuration to define the destination of a drill-down action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("drilldownConfig")
        private java.util.List<Object> drilldownConfig;

        /**
         * Drill-down configuration to define the destination of a drill-down action.
         * @param drilldownConfig the value to set
         * @return this builder
         **/
        public Builder drilldownConfig(java.util.List<Object> drilldownConfig) {
            this.drilldownConfig = drilldownConfig;
            this.__explicitlySet__.add("drilldownConfig");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateManagementDashboardDetails build() {
            CreateManagementDashboardDetails __instance__ =
                    new CreateManagementDashboardDetails(
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
                            parametersConfig,
                            drilldownConfig,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateManagementDashboardDetails o) {
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
     * ID of the dashboard, which must only be provided for Out-of-the-Box (OOB) dashboards.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dashboardId")
    private final String dashboardId;

    /**
     * ID of the dashboard, which must only be provided for Out-of-the-Box (OOB) dashboards.
     * @return the value
     **/
    public String getDashboardId() {
        return dashboardId;
    }

    /**
     * ID of the service (for example, log-analytics) that owns the dashboard. Each service has a unique ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerId")
    private final String providerId;

    /**
     * ID of the service (for example, log-analytics) that owns the dashboard. Each service has a unique ID.
     * @return the value
     **/
    public String getProviderId() {
        return providerId;
    }

    /**
     * Name of the service (for example, Logging Analytics) that owns the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    private final String providerName;

    /**
     * Name of the service (for example, Logging Analytics) that owns the dashboard.
     * @return the value
     **/
    public String getProviderName() {
        return providerName;
    }

    /**
     * Version of the service that owns the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerVersion")
    private final String providerVersion;

    /**
     * Version of the service that owns the dashboard.
     * @return the value
     **/
    public String getProviderVersion() {
        return providerVersion;
    }

    /**
     * Array of dashboard tiles.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tiles")
    private final java.util.List<ManagementDashboardTileDetails> tiles;

    /**
     * Array of dashboard tiles.
     * @return the value
     **/
    public java.util.List<ManagementDashboardTileDetails> getTiles() {
        return tiles;
    }

    /**
     * Display name of the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the dashboard.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Description of the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the dashboard.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * OCID of the compartment in which the dashboard resides.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment in which the dashboard resides.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Determines whether the dashboard is an Out-of-the-Box (OOB) dashboard. Note that OOB dashboards are only provided by Oracle and cannot be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOobDashboard")
    private final Boolean isOobDashboard;

    /**
     * Determines whether the dashboard is an Out-of-the-Box (OOB) dashboard. Note that OOB dashboards are only provided by Oracle and cannot be modified.
     * @return the value
     **/
    public Boolean getIsOobDashboard() {
        return isOobDashboard;
    }

    /**
     * Determines whether the dashboard will be displayed in Dashboard Home.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isShowInHome")
    private final Boolean isShowInHome;

    /**
     * Determines whether the dashboard will be displayed in Dashboard Home.
     * @return the value
     **/
    public Boolean getIsShowInHome() {
        return isShowInHome;
    }

    /**
     * Version of the metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadataVersion")
    private final String metadataVersion;

    /**
     * Version of the metadata.
     * @return the value
     **/
    public String getMetadataVersion() {
        return metadataVersion;
    }

    /**
     * Determines whether the description of the dashboard is displayed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isShowDescription")
    private final Boolean isShowDescription;

    /**
     * Determines whether the description of the dashboard is displayed.
     * @return the value
     **/
    public Boolean getIsShowDescription() {
        return isShowDescription;
    }

    /**
     * Screen image of the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("screenImage")
    private final String screenImage;

    /**
     * Screen image of the dashboard.
     * @return the value
     **/
    public String getScreenImage() {
        return screenImage;
    }

    /**
     * JSON that contains internationalization options.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nls")
    private final Object nls;

    /**
     * JSON that contains internationalization options.
     * @return the value
     **/
    public Object getNls() {
        return nls;
    }

    /**
     * JSON that contains user interface options.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uiConfig")
    private final Object uiConfig;

    /**
     * JSON that contains user interface options.
     * @return the value
     **/
    public Object getUiConfig() {
        return uiConfig;
    }

    /**
     * Array of JSON that contain data source options.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataConfig")
    private final java.util.List<Object> dataConfig;

    /**
     * Array of JSON that contain data source options.
     * @return the value
     **/
    public java.util.List<Object> getDataConfig() {
        return dataConfig;
    }

    /**
     * Type of dashboard. NORMAL denotes a single dashboard and SET denotes a dashboard set.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Type of dashboard. NORMAL denotes a single dashboard and SET denotes a dashboard set.
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * Determines whether the dashboard is set as favorite.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFavorite")
    private final Boolean isFavorite;

    /**
     * Determines whether the dashboard is set as favorite.
     * @return the value
     **/
    public Boolean getIsFavorite() {
        return isFavorite;
    }

    /**
     * Defines parameters for the dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parametersConfig")
    private final java.util.List<Object> parametersConfig;

    /**
     * Defines parameters for the dashboard.
     * @return the value
     **/
    public java.util.List<Object> getParametersConfig() {
        return parametersConfig;
    }

    /**
     * Drill-down configuration to define the destination of a drill-down action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drilldownConfig")
    private final java.util.List<Object> drilldownConfig;

    /**
     * Drill-down configuration to define the destination of a drill-down action.
     * @return the value
     **/
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

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
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

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateManagementDashboardDetails(");
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
        if (!(o instanceof CreateManagementDashboardDetails)) {
            return false;
        }

        CreateManagementDashboardDetails other = (CreateManagementDashboardDetails) o;
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

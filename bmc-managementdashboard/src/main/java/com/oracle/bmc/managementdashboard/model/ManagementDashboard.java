/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard.model;

/**
 * Properties of a dashboard, including dashboard ID. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManagementDashboard.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ManagementDashboard
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dashboardId",
        "id",
        "providerId",
        "providerName",
        "providerVersion",
        "tiles",
        "displayName",
        "description",
        "compartmentId",
        "isOobDashboard",
        "isShowInHome",
        "createdBy",
        "timeCreated",
        "updatedBy",
        "timeUpdated",
        "metadataVersion",
        "isShowDescription",
        "screenImage",
        "nls",
        "uiConfig",
        "dataConfig",
        "type",
        "isFavorite",
        "savedSearches",
        "lifecycleState",
        "parametersConfig",
        "drilldownConfig",
        "freeformTags",
        "definedTags"
    })
    public ManagementDashboard(
            String dashboardId,
            String id,
            String providerId,
            String providerName,
            String providerVersion,
            java.util.List<ManagementDashboardTileDetails> tiles,
            String displayName,
            String description,
            String compartmentId,
            Boolean isOobDashboard,
            Boolean isShowInHome,
            String createdBy,
            java.util.Date timeCreated,
            String updatedBy,
            java.util.Date timeUpdated,
            String metadataVersion,
            Boolean isShowDescription,
            String screenImage,
            Object nls,
            Object uiConfig,
            java.util.List<Object> dataConfig,
            String type,
            Boolean isFavorite,
            java.util.List<ManagementSavedSearch> savedSearches,
            LifecycleStates lifecycleState,
            java.util.List<Object> parametersConfig,
            java.util.List<Object> drilldownConfig,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.dashboardId = dashboardId;
        this.id = id;
        this.providerId = providerId;
        this.providerName = providerName;
        this.providerVersion = providerVersion;
        this.tiles = tiles;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.isOobDashboard = isOobDashboard;
        this.isShowInHome = isShowInHome;
        this.createdBy = createdBy;
        this.timeCreated = timeCreated;
        this.updatedBy = updatedBy;
        this.timeUpdated = timeUpdated;
        this.metadataVersion = metadataVersion;
        this.isShowDescription = isShowDescription;
        this.screenImage = screenImage;
        this.nls = nls;
        this.uiConfig = uiConfig;
        this.dataConfig = dataConfig;
        this.type = type;
        this.isFavorite = isFavorite;
        this.savedSearches = savedSearches;
        this.lifecycleState = lifecycleState;
        this.parametersConfig = parametersConfig;
        this.drilldownConfig = drilldownConfig;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** ID of the dashboard. Same as id. */
        @com.fasterxml.jackson.annotation.JsonProperty("dashboardId")
        private String dashboardId;

        /**
         * ID of the dashboard. Same as id.
         *
         * @param dashboardId the value to set
         * @return this builder
         */
        public Builder dashboardId(String dashboardId) {
            this.dashboardId = dashboardId;
            this.__explicitlySet__.add("dashboardId");
            return this;
        }
        /** ID of the dashboard. Same as dashboardId. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * ID of the dashboard. Same as dashboardId.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * ID of the service (for example, log-analytics) that owns the dashboard. Each service has
         * a unique ID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("providerId")
        private String providerId;

        /**
         * ID of the service (for example, log-analytics) that owns the dashboard. Each service has
         * a unique ID.
         *
         * @param providerId the value to set
         * @return this builder
         */
        public Builder providerId(String providerId) {
            this.providerId = providerId;
            this.__explicitlySet__.add("providerId");
            return this;
        }
        /** Name of the service (for example, Logging Analytics) that owns the dashboard. */
        @com.fasterxml.jackson.annotation.JsonProperty("providerName")
        private String providerName;

        /**
         * Name of the service (for example, Logging Analytics) that owns the dashboard.
         *
         * @param providerName the value to set
         * @return this builder
         */
        public Builder providerName(String providerName) {
            this.providerName = providerName;
            this.__explicitlySet__.add("providerName");
            return this;
        }
        /** Version of the service that owns the dashboard. */
        @com.fasterxml.jackson.annotation.JsonProperty("providerVersion")
        private String providerVersion;

        /**
         * Version of the service that owns the dashboard.
         *
         * @param providerVersion the value to set
         * @return this builder
         */
        public Builder providerVersion(String providerVersion) {
            this.providerVersion = providerVersion;
            this.__explicitlySet__.add("providerVersion");
            return this;
        }
        /** Array of dashboard tiles. */
        @com.fasterxml.jackson.annotation.JsonProperty("tiles")
        private java.util.List<ManagementDashboardTileDetails> tiles;

        /**
         * Array of dashboard tiles.
         *
         * @param tiles the value to set
         * @return this builder
         */
        public Builder tiles(java.util.List<ManagementDashboardTileDetails> tiles) {
            this.tiles = tiles;
            this.__explicitlySet__.add("tiles");
            return this;
        }
        /** Display name of the dashboard. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the dashboard.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the dashboard. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the dashboard.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** OCID of the compartment in which the dashboard resides. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment in which the dashboard resides.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Determines whether the dashboard is an Out-of-the-Box (OOB) dashboard. Note that OOB
         * dashboards are only provided by Oracle and cannot be modified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOobDashboard")
        private Boolean isOobDashboard;

        /**
         * Determines whether the dashboard is an Out-of-the-Box (OOB) dashboard. Note that OOB
         * dashboards are only provided by Oracle and cannot be modified.
         *
         * @param isOobDashboard the value to set
         * @return this builder
         */
        public Builder isOobDashboard(Boolean isOobDashboard) {
            this.isOobDashboard = isOobDashboard;
            this.__explicitlySet__.add("isOobDashboard");
            return this;
        }
        /** Determines whether the dashboard will be displayed in Dashboard Home. */
        @com.fasterxml.jackson.annotation.JsonProperty("isShowInHome")
        private Boolean isShowInHome;

        /**
         * Determines whether the dashboard will be displayed in Dashboard Home.
         *
         * @param isShowInHome the value to set
         * @return this builder
         */
        public Builder isShowInHome(Boolean isShowInHome) {
            this.isShowInHome = isShowInHome;
            this.__explicitlySet__.add("isShowInHome");
            return this;
        }
        /** User who created the dashboard. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * User who created the dashboard.
         *
         * @param createdBy the value to set
         * @return this builder
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /** Date and time the dashboard was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time the dashboard was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** User who updated the dashboard. */
        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

        /**
         * User who updated the dashboard.
         *
         * @param updatedBy the value to set
         * @return this builder
         */
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            this.__explicitlySet__.add("updatedBy");
            return this;
        }
        /** Date and time the dashboard was updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Date and time the dashboard was updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Version of the metadata. */
        @com.fasterxml.jackson.annotation.JsonProperty("metadataVersion")
        private String metadataVersion;

        /**
         * Version of the metadata.
         *
         * @param metadataVersion the value to set
         * @return this builder
         */
        public Builder metadataVersion(String metadataVersion) {
            this.metadataVersion = metadataVersion;
            this.__explicitlySet__.add("metadataVersion");
            return this;
        }
        /** Determines whether the description of the dashboard is displayed. */
        @com.fasterxml.jackson.annotation.JsonProperty("isShowDescription")
        private Boolean isShowDescription;

        /**
         * Determines whether the description of the dashboard is displayed.
         *
         * @param isShowDescription the value to set
         * @return this builder
         */
        public Builder isShowDescription(Boolean isShowDescription) {
            this.isShowDescription = isShowDescription;
            this.__explicitlySet__.add("isShowDescription");
            return this;
        }
        /** Screen image of the dashboard. */
        @com.fasterxml.jackson.annotation.JsonProperty("screenImage")
        private String screenImage;

        /**
         * Screen image of the dashboard.
         *
         * @param screenImage the value to set
         * @return this builder
         */
        public Builder screenImage(String screenImage) {
            this.screenImage = screenImage;
            this.__explicitlySet__.add("screenImage");
            return this;
        }
        /** JSON that contains internationalization options. */
        @com.fasterxml.jackson.annotation.JsonProperty("nls")
        private Object nls;

        /**
         * JSON that contains internationalization options.
         *
         * @param nls the value to set
         * @return this builder
         */
        public Builder nls(Object nls) {
            this.nls = nls;
            this.__explicitlySet__.add("nls");
            return this;
        }
        /** JSON that contains user interface options. */
        @com.fasterxml.jackson.annotation.JsonProperty("uiConfig")
        private Object uiConfig;

        /**
         * JSON that contains user interface options.
         *
         * @param uiConfig the value to set
         * @return this builder
         */
        public Builder uiConfig(Object uiConfig) {
            this.uiConfig = uiConfig;
            this.__explicitlySet__.add("uiConfig");
            return this;
        }
        /** Array of JSON that contain data source options. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataConfig")
        private java.util.List<Object> dataConfig;

        /**
         * Array of JSON that contain data source options.
         *
         * @param dataConfig the value to set
         * @return this builder
         */
        public Builder dataConfig(java.util.List<Object> dataConfig) {
            this.dataConfig = dataConfig;
            this.__explicitlySet__.add("dataConfig");
            return this;
        }
        /** Type of dashboard. NORMAL denotes a single dashboard and SET denotes a dashboard set. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Type of dashboard. NORMAL denotes a single dashboard and SET denotes a dashboard set.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Determines whether the dashboard is set as favorite. */
        @com.fasterxml.jackson.annotation.JsonProperty("isFavorite")
        private Boolean isFavorite;

        /**
         * Determines whether the dashboard is set as favorite.
         *
         * @param isFavorite the value to set
         * @return this builder
         */
        public Builder isFavorite(Boolean isFavorite) {
            this.isFavorite = isFavorite;
            this.__explicitlySet__.add("isFavorite");
            return this;
        }
        /** Array of saved searches in the dashboard. */
        @com.fasterxml.jackson.annotation.JsonProperty("savedSearches")
        private java.util.List<ManagementSavedSearch> savedSearches;

        /**
         * Array of saved searches in the dashboard.
         *
         * @param savedSearches the value to set
         * @return this builder
         */
        public Builder savedSearches(java.util.List<ManagementSavedSearch> savedSearches) {
            this.savedSearches = savedSearches;
            this.__explicitlySet__.add("savedSearches");
            return this;
        }
        /** State of dashboard. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * State of dashboard.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Defines parameters for the dashboard. */
        @com.fasterxml.jackson.annotation.JsonProperty("parametersConfig")
        private java.util.List<Object> parametersConfig;

        /**
         * Defines parameters for the dashboard.
         *
         * @param parametersConfig the value to set
         * @return this builder
         */
        public Builder parametersConfig(java.util.List<Object> parametersConfig) {
            this.parametersConfig = parametersConfig;
            this.__explicitlySet__.add("parametersConfig");
            return this;
        }
        /** Drill-down configuration to define the destination of a drill-down action. */
        @com.fasterxml.jackson.annotation.JsonProperty("drilldownConfig")
        private java.util.List<Object> drilldownConfig;

        /**
         * Drill-down configuration to define the destination of a drill-down action.
         *
         * @param drilldownConfig the value to set
         * @return this builder
         */
        public Builder drilldownConfig(java.util.List<Object> drilldownConfig) {
            this.drilldownConfig = drilldownConfig;
            this.__explicitlySet__.add("drilldownConfig");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementDashboard build() {
            ManagementDashboard model =
                    new ManagementDashboard(
                            this.dashboardId,
                            this.id,
                            this.providerId,
                            this.providerName,
                            this.providerVersion,
                            this.tiles,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.isOobDashboard,
                            this.isShowInHome,
                            this.createdBy,
                            this.timeCreated,
                            this.updatedBy,
                            this.timeUpdated,
                            this.metadataVersion,
                            this.isShowDescription,
                            this.screenImage,
                            this.nls,
                            this.uiConfig,
                            this.dataConfig,
                            this.type,
                            this.isFavorite,
                            this.savedSearches,
                            this.lifecycleState,
                            this.parametersConfig,
                            this.drilldownConfig,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementDashboard model) {
            if (model.wasPropertyExplicitlySet("dashboardId")) {
                this.dashboardId(model.getDashboardId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("providerId")) {
                this.providerId(model.getProviderId());
            }
            if (model.wasPropertyExplicitlySet("providerName")) {
                this.providerName(model.getProviderName());
            }
            if (model.wasPropertyExplicitlySet("providerVersion")) {
                this.providerVersion(model.getProviderVersion());
            }
            if (model.wasPropertyExplicitlySet("tiles")) {
                this.tiles(model.getTiles());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("isOobDashboard")) {
                this.isOobDashboard(model.getIsOobDashboard());
            }
            if (model.wasPropertyExplicitlySet("isShowInHome")) {
                this.isShowInHome(model.getIsShowInHome());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("updatedBy")) {
                this.updatedBy(model.getUpdatedBy());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("metadataVersion")) {
                this.metadataVersion(model.getMetadataVersion());
            }
            if (model.wasPropertyExplicitlySet("isShowDescription")) {
                this.isShowDescription(model.getIsShowDescription());
            }
            if (model.wasPropertyExplicitlySet("screenImage")) {
                this.screenImage(model.getScreenImage());
            }
            if (model.wasPropertyExplicitlySet("nls")) {
                this.nls(model.getNls());
            }
            if (model.wasPropertyExplicitlySet("uiConfig")) {
                this.uiConfig(model.getUiConfig());
            }
            if (model.wasPropertyExplicitlySet("dataConfig")) {
                this.dataConfig(model.getDataConfig());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("isFavorite")) {
                this.isFavorite(model.getIsFavorite());
            }
            if (model.wasPropertyExplicitlySet("savedSearches")) {
                this.savedSearches(model.getSavedSearches());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("parametersConfig")) {
                this.parametersConfig(model.getParametersConfig());
            }
            if (model.wasPropertyExplicitlySet("drilldownConfig")) {
                this.drilldownConfig(model.getDrilldownConfig());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** ID of the dashboard. Same as id. */
    @com.fasterxml.jackson.annotation.JsonProperty("dashboardId")
    private final String dashboardId;

    /**
     * ID of the dashboard. Same as id.
     *
     * @return the value
     */
    public String getDashboardId() {
        return dashboardId;
    }

    /** ID of the dashboard. Same as dashboardId. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * ID of the dashboard. Same as dashboardId.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * ID of the service (for example, log-analytics) that owns the dashboard. Each service has a
     * unique ID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("providerId")
    private final String providerId;

    /**
     * ID of the service (for example, log-analytics) that owns the dashboard. Each service has a
     * unique ID.
     *
     * @return the value
     */
    public String getProviderId() {
        return providerId;
    }

    /** Name of the service (for example, Logging Analytics) that owns the dashboard. */
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    private final String providerName;

    /**
     * Name of the service (for example, Logging Analytics) that owns the dashboard.
     *
     * @return the value
     */
    public String getProviderName() {
        return providerName;
    }

    /** Version of the service that owns the dashboard. */
    @com.fasterxml.jackson.annotation.JsonProperty("providerVersion")
    private final String providerVersion;

    /**
     * Version of the service that owns the dashboard.
     *
     * @return the value
     */
    public String getProviderVersion() {
        return providerVersion;
    }

    /** Array of dashboard tiles. */
    @com.fasterxml.jackson.annotation.JsonProperty("tiles")
    private final java.util.List<ManagementDashboardTileDetails> tiles;

    /**
     * Array of dashboard tiles.
     *
     * @return the value
     */
    public java.util.List<ManagementDashboardTileDetails> getTiles() {
        return tiles;
    }

    /** Display name of the dashboard. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the dashboard.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the dashboard. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the dashboard.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** OCID of the compartment in which the dashboard resides. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment in which the dashboard resides.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Determines whether the dashboard is an Out-of-the-Box (OOB) dashboard. Note that OOB
     * dashboards are only provided by Oracle and cannot be modified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOobDashboard")
    private final Boolean isOobDashboard;

    /**
     * Determines whether the dashboard is an Out-of-the-Box (OOB) dashboard. Note that OOB
     * dashboards are only provided by Oracle and cannot be modified.
     *
     * @return the value
     */
    public Boolean getIsOobDashboard() {
        return isOobDashboard;
    }

    /** Determines whether the dashboard will be displayed in Dashboard Home. */
    @com.fasterxml.jackson.annotation.JsonProperty("isShowInHome")
    private final Boolean isShowInHome;

    /**
     * Determines whether the dashboard will be displayed in Dashboard Home.
     *
     * @return the value
     */
    public Boolean getIsShowInHome() {
        return isShowInHome;
    }

    /** User who created the dashboard. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * User who created the dashboard.
     *
     * @return the value
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /** Date and time the dashboard was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time the dashboard was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** User who updated the dashboard. */
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

    /**
     * User who updated the dashboard.
     *
     * @return the value
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /** Date and time the dashboard was updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Date and time the dashboard was updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Version of the metadata. */
    @com.fasterxml.jackson.annotation.JsonProperty("metadataVersion")
    private final String metadataVersion;

    /**
     * Version of the metadata.
     *
     * @return the value
     */
    public String getMetadataVersion() {
        return metadataVersion;
    }

    /** Determines whether the description of the dashboard is displayed. */
    @com.fasterxml.jackson.annotation.JsonProperty("isShowDescription")
    private final Boolean isShowDescription;

    /**
     * Determines whether the description of the dashboard is displayed.
     *
     * @return the value
     */
    public Boolean getIsShowDescription() {
        return isShowDescription;
    }

    /** Screen image of the dashboard. */
    @com.fasterxml.jackson.annotation.JsonProperty("screenImage")
    private final String screenImage;

    /**
     * Screen image of the dashboard.
     *
     * @return the value
     */
    public String getScreenImage() {
        return screenImage;
    }

    /** JSON that contains internationalization options. */
    @com.fasterxml.jackson.annotation.JsonProperty("nls")
    private final Object nls;

    /**
     * JSON that contains internationalization options.
     *
     * @return the value
     */
    public Object getNls() {
        return nls;
    }

    /** JSON that contains user interface options. */
    @com.fasterxml.jackson.annotation.JsonProperty("uiConfig")
    private final Object uiConfig;

    /**
     * JSON that contains user interface options.
     *
     * @return the value
     */
    public Object getUiConfig() {
        return uiConfig;
    }

    /** Array of JSON that contain data source options. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataConfig")
    private final java.util.List<Object> dataConfig;

    /**
     * Array of JSON that contain data source options.
     *
     * @return the value
     */
    public java.util.List<Object> getDataConfig() {
        return dataConfig;
    }

    /** Type of dashboard. NORMAL denotes a single dashboard and SET denotes a dashboard set. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Type of dashboard. NORMAL denotes a single dashboard and SET denotes a dashboard set.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** Determines whether the dashboard is set as favorite. */
    @com.fasterxml.jackson.annotation.JsonProperty("isFavorite")
    private final Boolean isFavorite;

    /**
     * Determines whether the dashboard is set as favorite.
     *
     * @return the value
     */
    public Boolean getIsFavorite() {
        return isFavorite;
    }

    /** Array of saved searches in the dashboard. */
    @com.fasterxml.jackson.annotation.JsonProperty("savedSearches")
    private final java.util.List<ManagementSavedSearch> savedSearches;

    /**
     * Array of saved searches in the dashboard.
     *
     * @return the value
     */
    public java.util.List<ManagementSavedSearch> getSavedSearches() {
        return savedSearches;
    }

    /** State of dashboard. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * State of dashboard.
     *
     * @return the value
     */
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /** Defines parameters for the dashboard. */
    @com.fasterxml.jackson.annotation.JsonProperty("parametersConfig")
    private final java.util.List<Object> parametersConfig;

    /**
     * Defines parameters for the dashboard.
     *
     * @return the value
     */
    public java.util.List<Object> getParametersConfig() {
        return parametersConfig;
    }

    /** Drill-down configuration to define the destination of a drill-down action. */
    @com.fasterxml.jackson.annotation.JsonProperty("drilldownConfig")
    private final java.util.List<Object> drilldownConfig;

    /**
     * Drill-down configuration to define the destination of a drill-down action.
     *
     * @return the value
     */
    public java.util.List<Object> getDrilldownConfig() {
        return drilldownConfig;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ManagementDashboard(");
        sb.append("super=").append(super.toString());
        sb.append("dashboardId=").append(String.valueOf(this.dashboardId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", providerId=").append(String.valueOf(this.providerId));
        sb.append(", providerName=").append(String.valueOf(this.providerName));
        sb.append(", providerVersion=").append(String.valueOf(this.providerVersion));
        sb.append(", tiles=").append(String.valueOf(this.tiles));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isOobDashboard=").append(String.valueOf(this.isOobDashboard));
        sb.append(", isShowInHome=").append(String.valueOf(this.isShowInHome));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", metadataVersion=").append(String.valueOf(this.metadataVersion));
        sb.append(", isShowDescription=").append(String.valueOf(this.isShowDescription));
        sb.append(", screenImage=").append(String.valueOf(this.screenImage));
        sb.append(", nls=").append(String.valueOf(this.nls));
        sb.append(", uiConfig=").append(String.valueOf(this.uiConfig));
        sb.append(", dataConfig=").append(String.valueOf(this.dataConfig));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", isFavorite=").append(String.valueOf(this.isFavorite));
        sb.append(", savedSearches=").append(String.valueOf(this.savedSearches));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", parametersConfig=").append(String.valueOf(this.parametersConfig));
        sb.append(", drilldownConfig=").append(String.valueOf(this.drilldownConfig));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementDashboard)) {
            return false;
        }

        ManagementDashboard other = (ManagementDashboard) o;
        return java.util.Objects.equals(this.dashboardId, other.dashboardId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.providerId, other.providerId)
                && java.util.Objects.equals(this.providerName, other.providerName)
                && java.util.Objects.equals(this.providerVersion, other.providerVersion)
                && java.util.Objects.equals(this.tiles, other.tiles)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isOobDashboard, other.isOobDashboard)
                && java.util.Objects.equals(this.isShowInHome, other.isShowInHome)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.updatedBy, other.updatedBy)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.metadataVersion, other.metadataVersion)
                && java.util.Objects.equals(this.isShowDescription, other.isShowDescription)
                && java.util.Objects.equals(this.screenImage, other.screenImage)
                && java.util.Objects.equals(this.nls, other.nls)
                && java.util.Objects.equals(this.uiConfig, other.uiConfig)
                && java.util.Objects.equals(this.dataConfig, other.dataConfig)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.isFavorite, other.isFavorite)
                && java.util.Objects.equals(this.savedSearches, other.savedSearches)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.parametersConfig, other.parametersConfig)
                && java.util.Objects.equals(this.drilldownConfig, other.drilldownConfig)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dashboardId == null ? 43 : this.dashboardId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
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
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
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
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.parametersConfig == null ? 43 : this.parametersConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.drilldownConfig == null ? 43 : this.drilldownConfig.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard.model;

/**
 * Summary of the properties of a saved search. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManagementSavedSearchSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagementSavedSearchSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "isOobSavedSearch",
        "compartmentId",
        "providerId",
        "providerVersion",
        "providerName",
        "description",
        "nls",
        "type",
        "uiConfig",
        "dataConfig",
        "createdBy",
        "updatedBy",
        "timeCreated",
        "timeUpdated",
        "screenImage",
        "metadataVersion",
        "widgetTemplate",
        "widgetVM",
        "lifecycleState",
        "parametersConfig",
        "featuresConfig",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ManagementSavedSearchSummary(
            String id,
            String displayName,
            Boolean isOobSavedSearch,
            String compartmentId,
            String providerId,
            String providerVersion,
            String providerName,
            String description,
            Object nls,
            SavedSearchTypes type,
            Object uiConfig,
            java.util.List<Object> dataConfig,
            String createdBy,
            String updatedBy,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String screenImage,
            String metadataVersion,
            String widgetTemplate,
            String widgetVM,
            LifecycleStates lifecycleState,
            java.util.List<Object> parametersConfig,
            Object featuresConfig,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.isOobSavedSearch = isOobSavedSearch;
        this.compartmentId = compartmentId;
        this.providerId = providerId;
        this.providerVersion = providerVersion;
        this.providerName = providerName;
        this.description = description;
        this.nls = nls;
        this.type = type;
        this.uiConfig = uiConfig;
        this.dataConfig = dataConfig;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.screenImage = screenImage;
        this.metadataVersion = metadataVersion;
        this.widgetTemplate = widgetTemplate;
        this.widgetVM = widgetVM;
        this.lifecycleState = lifecycleState;
        this.parametersConfig = parametersConfig;
        this.featuresConfig = featuresConfig;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** ID of the saved search. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * ID of the saved search.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Display name of the saved search. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the saved search.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Determines whether the saved search is an Out-of-the-Box (OOB) saved search. Note that
         * OOB saved searches are only provided by Oracle and cannot be modified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOobSavedSearch")
        private Boolean isOobSavedSearch;

        /**
         * Determines whether the saved search is an Out-of-the-Box (OOB) saved search. Note that
         * OOB saved searches are only provided by Oracle and cannot be modified.
         *
         * @param isOobSavedSearch the value to set
         * @return this builder
         */
        public Builder isOobSavedSearch(Boolean isOobSavedSearch) {
            this.isOobSavedSearch = isOobSavedSearch;
            this.__explicitlySet__.add("isOobSavedSearch");
            return this;
        }
        /** OCID of the compartment in which the saved search resides. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment in which the saved search resides.
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
         * ID of the service (for example log-analytics) that owns the saved search. Each service
         * has a unique ID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("providerId")
        private String providerId;

        /**
         * ID of the service (for example log-analytics) that owns the saved search. Each service
         * has a unique ID.
         *
         * @param providerId the value to set
         * @return this builder
         */
        public Builder providerId(String providerId) {
            this.providerId = providerId;
            this.__explicitlySet__.add("providerId");
            return this;
        }
        /**
         * The version of the metadata of the provider. This is useful for provider to version its
         * features and metadata. Any newly created saved search (or dashboard) should use
         * providerVersion 3.0.0.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("providerVersion")
        private String providerVersion;

        /**
         * The version of the metadata of the provider. This is useful for provider to version its
         * features and metadata. Any newly created saved search (or dashboard) should use
         * providerVersion 3.0.0.
         *
         * @param providerVersion the value to set
         * @return this builder
         */
        public Builder providerVersion(String providerVersion) {
            this.providerVersion = providerVersion;
            this.__explicitlySet__.add("providerVersion");
            return this;
        }
        /**
         * The user friendly name of the service (for example, Logging Analytics) that owns the
         * saved search.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("providerName")
        private String providerName;

        /**
         * The user friendly name of the service (for example, Logging Analytics) that owns the
         * saved search.
         *
         * @param providerName the value to set
         * @return this builder
         */
        public Builder providerName(String providerName) {
            this.providerName = providerName;
            this.__explicitlySet__.add("providerName");
            return this;
        }
        /** Description of the saved search. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the saved search.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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
        /** Determines how the saved search is displayed in a dashboard. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private SavedSearchTypes type;

        /**
         * Determines how the saved search is displayed in a dashboard.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(SavedSearchTypes type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * It defines the visualization type of the widget saved search, the UI options of that
         * visualization type, the binding of data to the visualization.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("uiConfig")
        private Object uiConfig;

        /**
         * It defines the visualization type of the widget saved search, the UI options of that
         * visualization type, the binding of data to the visualization.
         *
         * @param uiConfig the value to set
         * @return this builder
         */
        public Builder uiConfig(Object uiConfig) {
            this.uiConfig = uiConfig;
            this.__explicitlySet__.add("uiConfig");
            return this;
        }
        /**
         * It defines how data is fetched. A functional saved search needs a valid dataConfig. See
         * examples on how it can be constructed for various data sources.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataConfig")
        private java.util.List<Object> dataConfig;

        /**
         * It defines how data is fetched. A functional saved search needs a valid dataConfig. See
         * examples on how it can be constructed for various data sources.
         *
         * @param dataConfig the value to set
         * @return this builder
         */
        public Builder dataConfig(java.util.List<Object> dataConfig) {
            this.dataConfig = dataConfig;
            this.__explicitlySet__.add("dataConfig");
            return this;
        }
        /**
         * The principle id of the user that created this saved search. This is automatically
         * managed by the system. In OCI the value is ignored. In EM it can skipped or otherwise it
         * is ignored in both create and update API and system automatically sets its value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * The principle id of the user that created this saved search. This is automatically
         * managed by the system. In OCI the value is ignored. In EM it can skipped or otherwise it
         * is ignored in both create and update API and system automatically sets its value.
         *
         * @param createdBy the value to set
         * @return this builder
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /** The principle id of the user that updated this saved search */
        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

        /**
         * The principle id of the user that updated this saved search
         *
         * @param updatedBy the value to set
         * @return this builder
         */
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            this.__explicitlySet__.add("updatedBy");
            return this;
        }
        /** Date and time the saved search was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time the saved search was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Date and time the saved search was updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Date and time the saved search was updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Screen image of the saved search. */
        @com.fasterxml.jackson.annotation.JsonProperty("screenImage")
        private String screenImage;

        /**
         * Screen image of the saved search.
         *
         * @param screenImage the value to set
         * @return this builder
         */
        public Builder screenImage(String screenImage) {
            this.screenImage = screenImage;
            this.__explicitlySet__.add("screenImage");
            return this;
        }
        /**
         * The version of the metadata defined in the API. This is maintained and enforced by
         * dashboard server. Currently it is 2.0.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metadataVersion")
        private String metadataVersion;

        /**
         * The version of the metadata defined in the API. This is maintained and enforced by
         * dashboard server. Currently it is 2.0.
         *
         * @param metadataVersion the value to set
         * @return this builder
         */
        public Builder metadataVersion(String metadataVersion) {
            this.metadataVersion = metadataVersion;
            this.__explicitlySet__.add("metadataVersion");
            return this;
        }
        /** The UI template that the saved search uses to render itself. */
        @com.fasterxml.jackson.annotation.JsonProperty("widgetTemplate")
        private String widgetTemplate;

        /**
         * The UI template that the saved search uses to render itself.
         *
         * @param widgetTemplate the value to set
         * @return this builder
         */
        public Builder widgetTemplate(String widgetTemplate) {
            this.widgetTemplate = widgetTemplate;
            this.__explicitlySet__.add("widgetTemplate");
            return this;
        }
        /** The View Model that the saved search uses to render itself. */
        @com.fasterxml.jackson.annotation.JsonProperty("widgetVM")
        private String widgetVM;

        /**
         * The View Model that the saved search uses to render itself.
         *
         * @param widgetVM the value to set
         * @return this builder
         */
        public Builder widgetVM(String widgetVM) {
            this.widgetVM = widgetVM;
            this.__explicitlySet__.add("widgetVM");
            return this;
        }
        /** OCI lifecycle status. This is automatically managed by the system. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * OCI lifecycle status. This is automatically managed by the system.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Defines parameters for the saved search. */
        @com.fasterxml.jackson.annotation.JsonProperty("parametersConfig")
        private java.util.List<Object> parametersConfig;

        /**
         * Defines parameters for the saved search.
         *
         * @param parametersConfig the value to set
         * @return this builder
         */
        public Builder parametersConfig(java.util.List<Object> parametersConfig) {
            this.parametersConfig = parametersConfig;
            this.__explicitlySet__.add("parametersConfig");
            return this;
        }
        /** Contains configuration for enabling features. */
        @com.fasterxml.jackson.annotation.JsonProperty("featuresConfig")
        private Object featuresConfig;

        /**
         * Contains configuration for enabling features.
         *
         * @param featuresConfig the value to set
         * @return this builder
         */
        public Builder featuresConfig(Object featuresConfig) {
            this.featuresConfig = featuresConfig;
            this.__explicitlySet__.add("featuresConfig");
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
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementSavedSearchSummary build() {
            ManagementSavedSearchSummary model =
                    new ManagementSavedSearchSummary(
                            this.id,
                            this.displayName,
                            this.isOobSavedSearch,
                            this.compartmentId,
                            this.providerId,
                            this.providerVersion,
                            this.providerName,
                            this.description,
                            this.nls,
                            this.type,
                            this.uiConfig,
                            this.dataConfig,
                            this.createdBy,
                            this.updatedBy,
                            this.timeCreated,
                            this.timeUpdated,
                            this.screenImage,
                            this.metadataVersion,
                            this.widgetTemplate,
                            this.widgetVM,
                            this.lifecycleState,
                            this.parametersConfig,
                            this.featuresConfig,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementSavedSearchSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isOobSavedSearch")) {
                this.isOobSavedSearch(model.getIsOobSavedSearch());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("providerId")) {
                this.providerId(model.getProviderId());
            }
            if (model.wasPropertyExplicitlySet("providerVersion")) {
                this.providerVersion(model.getProviderVersion());
            }
            if (model.wasPropertyExplicitlySet("providerName")) {
                this.providerName(model.getProviderName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("nls")) {
                this.nls(model.getNls());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("uiConfig")) {
                this.uiConfig(model.getUiConfig());
            }
            if (model.wasPropertyExplicitlySet("dataConfig")) {
                this.dataConfig(model.getDataConfig());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("updatedBy")) {
                this.updatedBy(model.getUpdatedBy());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("screenImage")) {
                this.screenImage(model.getScreenImage());
            }
            if (model.wasPropertyExplicitlySet("metadataVersion")) {
                this.metadataVersion(model.getMetadataVersion());
            }
            if (model.wasPropertyExplicitlySet("widgetTemplate")) {
                this.widgetTemplate(model.getWidgetTemplate());
            }
            if (model.wasPropertyExplicitlySet("widgetVM")) {
                this.widgetVM(model.getWidgetVM());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("parametersConfig")) {
                this.parametersConfig(model.getParametersConfig());
            }
            if (model.wasPropertyExplicitlySet("featuresConfig")) {
                this.featuresConfig(model.getFeaturesConfig());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** ID of the saved search. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * ID of the saved search.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Display name of the saved search. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the saved search.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Determines whether the saved search is an Out-of-the-Box (OOB) saved search. Note that OOB
     * saved searches are only provided by Oracle and cannot be modified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOobSavedSearch")
    private final Boolean isOobSavedSearch;

    /**
     * Determines whether the saved search is an Out-of-the-Box (OOB) saved search. Note that OOB
     * saved searches are only provided by Oracle and cannot be modified.
     *
     * @return the value
     */
    public Boolean getIsOobSavedSearch() {
        return isOobSavedSearch;
    }

    /** OCID of the compartment in which the saved search resides. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment in which the saved search resides.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * ID of the service (for example log-analytics) that owns the saved search. Each service has a
     * unique ID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("providerId")
    private final String providerId;

    /**
     * ID of the service (for example log-analytics) that owns the saved search. Each service has a
     * unique ID.
     *
     * @return the value
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * The version of the metadata of the provider. This is useful for provider to version its
     * features and metadata. Any newly created saved search (or dashboard) should use
     * providerVersion 3.0.0.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("providerVersion")
    private final String providerVersion;

    /**
     * The version of the metadata of the provider. This is useful for provider to version its
     * features and metadata. Any newly created saved search (or dashboard) should use
     * providerVersion 3.0.0.
     *
     * @return the value
     */
    public String getProviderVersion() {
        return providerVersion;
    }

    /**
     * The user friendly name of the service (for example, Logging Analytics) that owns the saved
     * search.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    private final String providerName;

    /**
     * The user friendly name of the service (for example, Logging Analytics) that owns the saved
     * search.
     *
     * @return the value
     */
    public String getProviderName() {
        return providerName;
    }

    /** Description of the saved search. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the saved search.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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

    /** Determines how the saved search is displayed in a dashboard. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final SavedSearchTypes type;

    /**
     * Determines how the saved search is displayed in a dashboard.
     *
     * @return the value
     */
    public SavedSearchTypes getType() {
        return type;
    }

    /**
     * It defines the visualization type of the widget saved search, the UI options of that
     * visualization type, the binding of data to the visualization.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uiConfig")
    private final Object uiConfig;

    /**
     * It defines the visualization type of the widget saved search, the UI options of that
     * visualization type, the binding of data to the visualization.
     *
     * @return the value
     */
    public Object getUiConfig() {
        return uiConfig;
    }

    /**
     * It defines how data is fetched. A functional saved search needs a valid dataConfig. See
     * examples on how it can be constructed for various data sources.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataConfig")
    private final java.util.List<Object> dataConfig;

    /**
     * It defines how data is fetched. A functional saved search needs a valid dataConfig. See
     * examples on how it can be constructed for various data sources.
     *
     * @return the value
     */
    public java.util.List<Object> getDataConfig() {
        return dataConfig;
    }

    /**
     * The principle id of the user that created this saved search. This is automatically managed by
     * the system. In OCI the value is ignored. In EM it can skipped or otherwise it is ignored in
     * both create and update API and system automatically sets its value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * The principle id of the user that created this saved search. This is automatically managed by
     * the system. In OCI the value is ignored. In EM it can skipped or otherwise it is ignored in
     * both create and update API and system automatically sets its value.
     *
     * @return the value
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /** The principle id of the user that updated this saved search */
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

    /**
     * The principle id of the user that updated this saved search
     *
     * @return the value
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /** Date and time the saved search was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time the saved search was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Date and time the saved search was updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Date and time the saved search was updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Screen image of the saved search. */
    @com.fasterxml.jackson.annotation.JsonProperty("screenImage")
    private final String screenImage;

    /**
     * Screen image of the saved search.
     *
     * @return the value
     */
    public String getScreenImage() {
        return screenImage;
    }

    /**
     * The version of the metadata defined in the API. This is maintained and enforced by dashboard
     * server. Currently it is 2.0.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadataVersion")
    private final String metadataVersion;

    /**
     * The version of the metadata defined in the API. This is maintained and enforced by dashboard
     * server. Currently it is 2.0.
     *
     * @return the value
     */
    public String getMetadataVersion() {
        return metadataVersion;
    }

    /** The UI template that the saved search uses to render itself. */
    @com.fasterxml.jackson.annotation.JsonProperty("widgetTemplate")
    private final String widgetTemplate;

    /**
     * The UI template that the saved search uses to render itself.
     *
     * @return the value
     */
    public String getWidgetTemplate() {
        return widgetTemplate;
    }

    /** The View Model that the saved search uses to render itself. */
    @com.fasterxml.jackson.annotation.JsonProperty("widgetVM")
    private final String widgetVM;

    /**
     * The View Model that the saved search uses to render itself.
     *
     * @return the value
     */
    public String getWidgetVM() {
        return widgetVM;
    }

    /** OCI lifecycle status. This is automatically managed by the system. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * OCI lifecycle status. This is automatically managed by the system.
     *
     * @return the value
     */
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /** Defines parameters for the saved search. */
    @com.fasterxml.jackson.annotation.JsonProperty("parametersConfig")
    private final java.util.List<Object> parametersConfig;

    /**
     * Defines parameters for the saved search.
     *
     * @return the value
     */
    public java.util.List<Object> getParametersConfig() {
        return parametersConfig;
    }

    /** Contains configuration for enabling features. */
    @com.fasterxml.jackson.annotation.JsonProperty("featuresConfig")
    private final Object featuresConfig;

    /**
     * Contains configuration for enabling features.
     *
     * @return the value
     */
    public Object getFeaturesConfig() {
        return featuresConfig;
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

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("ManagementSavedSearchSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", isOobSavedSearch=").append(String.valueOf(this.isOobSavedSearch));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", providerId=").append(String.valueOf(this.providerId));
        sb.append(", providerVersion=").append(String.valueOf(this.providerVersion));
        sb.append(", providerName=").append(String.valueOf(this.providerName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", nls=").append(String.valueOf(this.nls));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", uiConfig=").append(String.valueOf(this.uiConfig));
        sb.append(", dataConfig=").append(String.valueOf(this.dataConfig));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", screenImage=").append(String.valueOf(this.screenImage));
        sb.append(", metadataVersion=").append(String.valueOf(this.metadataVersion));
        sb.append(", widgetTemplate=").append(String.valueOf(this.widgetTemplate));
        sb.append(", widgetVM=").append(String.valueOf(this.widgetVM));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", parametersConfig=").append(String.valueOf(this.parametersConfig));
        sb.append(", featuresConfig=").append(String.valueOf(this.featuresConfig));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementSavedSearchSummary)) {
            return false;
        }

        ManagementSavedSearchSummary other = (ManagementSavedSearchSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isOobSavedSearch, other.isOobSavedSearch)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.providerId, other.providerId)
                && java.util.Objects.equals(this.providerVersion, other.providerVersion)
                && java.util.Objects.equals(this.providerName, other.providerName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.nls, other.nls)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.uiConfig, other.uiConfig)
                && java.util.Objects.equals(this.dataConfig, other.dataConfig)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.updatedBy, other.updatedBy)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.screenImage, other.screenImage)
                && java.util.Objects.equals(this.metadataVersion, other.metadataVersion)
                && java.util.Objects.equals(this.widgetTemplate, other.widgetTemplate)
                && java.util.Objects.equals(this.widgetVM, other.widgetVM)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.parametersConfig, other.parametersConfig)
                && java.util.Objects.equals(this.featuresConfig, other.featuresConfig)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.isOobSavedSearch == null ? 43 : this.isOobSavedSearch.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.providerId == null ? 43 : this.providerId.hashCode());
        result =
                (result * PRIME)
                        + (this.providerVersion == null ? 43 : this.providerVersion.hashCode());
        result = (result * PRIME) + (this.providerName == null ? 43 : this.providerName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.nls == null ? 43 : this.nls.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.uiConfig == null ? 43 : this.uiConfig.hashCode());
        result = (result * PRIME) + (this.dataConfig == null ? 43 : this.dataConfig.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.screenImage == null ? 43 : this.screenImage.hashCode());
        result =
                (result * PRIME)
                        + (this.metadataVersion == null ? 43 : this.metadataVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.widgetTemplate == null ? 43 : this.widgetTemplate.hashCode());
        result = (result * PRIME) + (this.widgetVM == null ? 43 : this.widgetVM.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.parametersConfig == null ? 43 : this.parametersConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.featuresConfig == null ? 43 : this.featuresConfig.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

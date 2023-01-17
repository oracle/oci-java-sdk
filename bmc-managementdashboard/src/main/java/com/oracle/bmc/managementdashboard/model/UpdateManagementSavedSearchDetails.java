/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard.model;

/**
 * Properties of a saved search. Saved search ID must not be provided. <br>
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
        builder = UpdateManagementSavedSearchDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateManagementSavedSearchDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "providerId",
        "providerVersion",
        "providerName",
        "compartmentId",
        "isOobSavedSearch",
        "description",
        "nls",
        "type",
        "uiConfig",
        "dataConfig",
        "screenImage",
        "metadataVersion",
        "widgetTemplate",
        "widgetVM",
        "parametersConfig",
        "drilldownConfig",
        "freeformTags",
        "definedTags"
    })
    public UpdateManagementSavedSearchDetails(
            String displayName,
            String providerId,
            String providerVersion,
            String providerName,
            String compartmentId,
            Boolean isOobSavedSearch,
            String description,
            Object nls,
            SavedSearchTypes type,
            Object uiConfig,
            java.util.List<Object> dataConfig,
            String screenImage,
            String metadataVersion,
            String widgetTemplate,
            String widgetVM,
            java.util.List<Object> parametersConfig,
            java.util.List<Object> drilldownConfig,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.providerId = providerId;
        this.providerVersion = providerVersion;
        this.providerName = providerName;
        this.compartmentId = compartmentId;
        this.isOobSavedSearch = isOobSavedSearch;
        this.description = description;
        this.nls = nls;
        this.type = type;
        this.uiConfig = uiConfig;
        this.dataConfig = dataConfig;
        this.screenImage = screenImage;
        this.metadataVersion = metadataVersion;
        this.widgetTemplate = widgetTemplate;
        this.widgetVM = widgetVM;
        this.parametersConfig = parametersConfig;
        this.drilldownConfig = drilldownConfig;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** Version of the service that owns this saved search. */
        @com.fasterxml.jackson.annotation.JsonProperty("providerVersion")
        private String providerVersion;

        /**
         * Version of the service that owns this saved search.
         *
         * @param providerVersion the value to set
         * @return this builder
         */
        public Builder providerVersion(String providerVersion) {
            this.providerVersion = providerVersion;
            this.__explicitlySet__.add("providerVersion");
            return this;
        }
        /** Name of the service (for example, Logging Analytics) that owns the saved search. */
        @com.fasterxml.jackson.annotation.JsonProperty("providerName")
        private String providerName;

        /**
         * Name of the service (for example, Logging Analytics) that owns the saved search.
         *
         * @param providerName the value to set
         * @return this builder
         */
        public Builder providerName(String providerName) {
            this.providerName = providerName;
            this.__explicitlySet__.add("providerName");
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
        /** Reference to the HTML file of the widget. */
        @com.fasterxml.jackson.annotation.JsonProperty("widgetTemplate")
        private String widgetTemplate;

        /**
         * Reference to the HTML file of the widget.
         *
         * @param widgetTemplate the value to set
         * @return this builder
         */
        public Builder widgetTemplate(String widgetTemplate) {
            this.widgetTemplate = widgetTemplate;
            this.__explicitlySet__.add("widgetTemplate");
            return this;
        }
        /** Reference to the view model of the widget. */
        @com.fasterxml.jackson.annotation.JsonProperty("widgetVM")
        private String widgetVM;

        /**
         * Reference to the view model of the widget.
         *
         * @param widgetVM the value to set
         * @return this builder
         */
        public Builder widgetVM(String widgetVM) {
            this.widgetVM = widgetVM;
            this.__explicitlySet__.add("widgetVM");
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

        public UpdateManagementSavedSearchDetails build() {
            UpdateManagementSavedSearchDetails model =
                    new UpdateManagementSavedSearchDetails(
                            this.displayName,
                            this.providerId,
                            this.providerVersion,
                            this.providerName,
                            this.compartmentId,
                            this.isOobSavedSearch,
                            this.description,
                            this.nls,
                            this.type,
                            this.uiConfig,
                            this.dataConfig,
                            this.screenImage,
                            this.metadataVersion,
                            this.widgetTemplate,
                            this.widgetVM,
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
        public Builder copy(UpdateManagementSavedSearchDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("isOobSavedSearch")) {
                this.isOobSavedSearch(model.getIsOobSavedSearch());
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

    /** Version of the service that owns this saved search. */
    @com.fasterxml.jackson.annotation.JsonProperty("providerVersion")
    private final String providerVersion;

    /**
     * Version of the service that owns this saved search.
     *
     * @return the value
     */
    public String getProviderVersion() {
        return providerVersion;
    }

    /** Name of the service (for example, Logging Analytics) that owns the saved search. */
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    private final String providerName;

    /**
     * Name of the service (for example, Logging Analytics) that owns the saved search.
     *
     * @return the value
     */
    public String getProviderName() {
        return providerName;
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

    /** Reference to the HTML file of the widget. */
    @com.fasterxml.jackson.annotation.JsonProperty("widgetTemplate")
    private final String widgetTemplate;

    /**
     * Reference to the HTML file of the widget.
     *
     * @return the value
     */
    public String getWidgetTemplate() {
        return widgetTemplate;
    }

    /** Reference to the view model of the widget. */
    @com.fasterxml.jackson.annotation.JsonProperty("widgetVM")
    private final String widgetVM;

    /**
     * Reference to the view model of the widget.
     *
     * @return the value
     */
    public String getWidgetVM() {
        return widgetVM;
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
        sb.append("UpdateManagementSavedSearchDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", providerId=").append(String.valueOf(this.providerId));
        sb.append(", providerVersion=").append(String.valueOf(this.providerVersion));
        sb.append(", providerName=").append(String.valueOf(this.providerName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isOobSavedSearch=").append(String.valueOf(this.isOobSavedSearch));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", nls=").append(String.valueOf(this.nls));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", uiConfig=").append(String.valueOf(this.uiConfig));
        sb.append(", dataConfig=").append(String.valueOf(this.dataConfig));
        sb.append(", screenImage=").append(String.valueOf(this.screenImage));
        sb.append(", metadataVersion=").append(String.valueOf(this.metadataVersion));
        sb.append(", widgetTemplate=").append(String.valueOf(this.widgetTemplate));
        sb.append(", widgetVM=").append(String.valueOf(this.widgetVM));
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
        if (!(o instanceof UpdateManagementSavedSearchDetails)) {
            return false;
        }

        UpdateManagementSavedSearchDetails other = (UpdateManagementSavedSearchDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.providerId, other.providerId)
                && java.util.Objects.equals(this.providerVersion, other.providerVersion)
                && java.util.Objects.equals(this.providerName, other.providerName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isOobSavedSearch, other.isOobSavedSearch)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.nls, other.nls)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.uiConfig, other.uiConfig)
                && java.util.Objects.equals(this.dataConfig, other.dataConfig)
                && java.util.Objects.equals(this.screenImage, other.screenImage)
                && java.util.Objects.equals(this.metadataVersion, other.metadataVersion)
                && java.util.Objects.equals(this.widgetTemplate, other.widgetTemplate)
                && java.util.Objects.equals(this.widgetVM, other.widgetVM)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.providerId == null ? 43 : this.providerId.hashCode());
        result =
                (result * PRIME)
                        + (this.providerVersion == null ? 43 : this.providerVersion.hashCode());
        result = (result * PRIME) + (this.providerName == null ? 43 : this.providerName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.isOobSavedSearch == null ? 43 : this.isOobSavedSearch.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.nls == null ? 43 : this.nls.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.uiConfig == null ? 43 : this.uiConfig.hashCode());
        result = (result * PRIME) + (this.dataConfig == null ? 43 : this.dataConfig.hashCode());
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

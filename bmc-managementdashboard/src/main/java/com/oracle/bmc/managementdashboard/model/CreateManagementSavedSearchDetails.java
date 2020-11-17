/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard.model;

/**
 * Properties of a saved search.
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
    builder = CreateManagementSavedSearchDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateManagementSavedSearchDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("providerId")
        private String providerId;

        public Builder providerId(String providerId) {
            this.providerId = providerId;
            this.__explicitlySet__.add("providerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("providerVersion")
        private String providerVersion;

        public Builder providerVersion(String providerVersion) {
            this.providerVersion = providerVersion;
            this.__explicitlySet__.add("providerVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("providerName")
        private String providerName;

        public Builder providerName(String providerName) {
            this.providerName = providerName;
            this.__explicitlySet__.add("providerName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOobSavedSearch")
        private Boolean isOobSavedSearch;

        public Builder isOobSavedSearch(Boolean isOobSavedSearch) {
            this.isOobSavedSearch = isOobSavedSearch;
            this.__explicitlySet__.add("isOobSavedSearch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nls")
        private Object nls;

        public Builder nls(Object nls) {
            this.nls = nls;
            this.__explicitlySet__.add("nls");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private SavedSearchTypes type;

        public Builder type(SavedSearchTypes type) {
            this.type = type;
            this.__explicitlySet__.add("type");
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

        @com.fasterxml.jackson.annotation.JsonProperty("screenImage")
        private String screenImage;

        public Builder screenImage(String screenImage) {
            this.screenImage = screenImage;
            this.__explicitlySet__.add("screenImage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadataVersion")
        private String metadataVersion;

        public Builder metadataVersion(String metadataVersion) {
            this.metadataVersion = metadataVersion;
            this.__explicitlySet__.add("metadataVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("widgetTemplate")
        private String widgetTemplate;

        public Builder widgetTemplate(String widgetTemplate) {
            this.widgetTemplate = widgetTemplate;
            this.__explicitlySet__.add("widgetTemplate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("widgetVM")
        private String widgetVM;

        public Builder widgetVM(String widgetVM) {
            this.widgetVM = widgetVM;
            this.__explicitlySet__.add("widgetVM");
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

        public CreateManagementSavedSearchDetails build() {
            CreateManagementSavedSearchDetails __instance__ =
                    new CreateManagementSavedSearchDetails(
                            id,
                            displayName,
                            providerId,
                            providerVersion,
                            providerName,
                            compartmentId,
                            isOobSavedSearch,
                            description,
                            nls,
                            type,
                            uiConfig,
                            dataConfig,
                            screenImage,
                            metadataVersion,
                            widgetTemplate,
                            widgetVM,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateManagementSavedSearchDetails o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .providerId(o.getProviderId())
                            .providerVersion(o.getProviderVersion())
                            .providerName(o.getProviderName())
                            .compartmentId(o.getCompartmentId())
                            .isOobSavedSearch(o.getIsOobSavedSearch())
                            .description(o.getDescription())
                            .nls(o.getNls())
                            .type(o.getType())
                            .uiConfig(o.getUiConfig())
                            .dataConfig(o.getDataConfig())
                            .screenImage(o.getScreenImage())
                            .metadataVersion(o.getMetadataVersion())
                            .widgetTemplate(o.getWidgetTemplate())
                            .widgetVM(o.getWidgetVM())
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
     * ID of the saved search, which must only be provided for Out-of-the-Box (OOB) saved search.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Display name of the saved search.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * ID of the service (for example log-analytics) that owns the saved search. Each service has a unique ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerId")
    String providerId;

    /**
     * Version of the service that owns this saved search.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerVersion")
    String providerVersion;

    /**
     * Name of the service (for example, Logging Analytics) that owns the saved search.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    String providerName;

    /**
     * OCID of the compartment in which the saved search resides.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Determines whether the saved search is an Out-of-the-Box (OOB) saved search. Note that OOB saved searches are only provided by Oracle and cannot be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOobSavedSearch")
    Boolean isOobSavedSearch;

    /**
     * Description of the saved search.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * JSON that contains internationalization options.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nls")
    Object nls;

    /**
     * Determines how the saved search is displayed in a dashboard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    SavedSearchTypes type;

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
     * Screen image of the saved search.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("screenImage")
    String screenImage;

    /**
     * Version of the metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadataVersion")
    String metadataVersion;

    /**
     * Reference to the HTML file of the widget.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("widgetTemplate")
    String widgetTemplate;

    /**
     * Reference to the view model of the widget.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("widgetVM")
    String widgetVM;

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

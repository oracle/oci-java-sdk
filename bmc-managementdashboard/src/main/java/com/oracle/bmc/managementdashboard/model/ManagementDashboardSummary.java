/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard.model;

/**
 * Summary of the properties of a dashboard. <br>
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
        builder = ManagementDashboardSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagementDashboardSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dashboardId",
        "id",
        "displayName",
        "description",
        "compartmentId",
        "providerId",
        "providerName",
        "providerVersion",
        "isOobDashboard",
        "createdBy",
        "timeCreated",
        "updatedBy",
        "timeUpdated",
        "metadataVersion",
        "screenImage",
        "nls",
        "type",
        "featuresConfig",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ManagementDashboardSummary(
            String dashboardId,
            String id,
            String displayName,
            String description,
            String compartmentId,
            String providerId,
            String providerName,
            String providerVersion,
            Boolean isOobDashboard,
            String createdBy,
            java.util.Date timeCreated,
            String updatedBy,
            java.util.Date timeUpdated,
            String metadataVersion,
            String screenImage,
            Object nls,
            String type,
            Object featuresConfig,
            LifecycleStates lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.dashboardId = dashboardId;
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.providerId = providerId;
        this.providerName = providerName;
        this.providerVersion = providerVersion;
        this.isOobDashboard = isOobDashboard;
        this.createdBy = createdBy;
        this.timeCreated = timeCreated;
        this.updatedBy = updatedBy;
        this.timeUpdated = timeUpdated;
        this.metadataVersion = metadataVersion;
        this.screenImage = screenImage;
        this.nls = nls;
        this.type = type;
        this.featuresConfig = featuresConfig;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
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
        /**
         * The user friendly name of the service (for example, Logging Analytics) that owns the
         * dashboard.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("providerName")
        private String providerName;

        /**
         * The user friendly name of the service (for example, Logging Analytics) that owns the
         * dashboard.
         *
         * @param providerName the value to set
         * @return this builder
         */
        public Builder providerName(String providerName) {
            this.providerName = providerName;
            this.__explicitlySet__.add("providerName");
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
        /** Current lifecycle state of the dashboard. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * Current lifecycle state of the dashboard.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        public ManagementDashboardSummary build() {
            ManagementDashboardSummary model =
                    new ManagementDashboardSummary(
                            this.dashboardId,
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.providerId,
                            this.providerName,
                            this.providerVersion,
                            this.isOobDashboard,
                            this.createdBy,
                            this.timeCreated,
                            this.updatedBy,
                            this.timeUpdated,
                            this.metadataVersion,
                            this.screenImage,
                            this.nls,
                            this.type,
                            this.featuresConfig,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementDashboardSummary model) {
            if (model.wasPropertyExplicitlySet("dashboardId")) {
                this.dashboardId(model.getDashboardId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
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
            if (model.wasPropertyExplicitlySet("providerId")) {
                this.providerId(model.getProviderId());
            }
            if (model.wasPropertyExplicitlySet("providerName")) {
                this.providerName(model.getProviderName());
            }
            if (model.wasPropertyExplicitlySet("providerVersion")) {
                this.providerVersion(model.getProviderVersion());
            }
            if (model.wasPropertyExplicitlySet("isOobDashboard")) {
                this.isOobDashboard(model.getIsOobDashboard());
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
            if (model.wasPropertyExplicitlySet("screenImage")) {
                this.screenImage(model.getScreenImage());
            }
            if (model.wasPropertyExplicitlySet("nls")) {
                this.nls(model.getNls());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("featuresConfig")) {
                this.featuresConfig(model.getFeaturesConfig());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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

    /**
     * The user friendly name of the service (for example, Logging Analytics) that owns the
     * dashboard.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    private final String providerName;

    /**
     * The user friendly name of the service (for example, Logging Analytics) that owns the
     * dashboard.
     *
     * @return the value
     */
    public String getProviderName() {
        return providerName;
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

    /** Current lifecycle state of the dashboard. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * Current lifecycle state of the dashboard.
     *
     * @return the value
     */
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
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
        sb.append("ManagementDashboardSummary(");
        sb.append("super=").append(super.toString());
        sb.append("dashboardId=").append(String.valueOf(this.dashboardId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", providerId=").append(String.valueOf(this.providerId));
        sb.append(", providerName=").append(String.valueOf(this.providerName));
        sb.append(", providerVersion=").append(String.valueOf(this.providerVersion));
        sb.append(", isOobDashboard=").append(String.valueOf(this.isOobDashboard));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", metadataVersion=").append(String.valueOf(this.metadataVersion));
        sb.append(", screenImage=").append(String.valueOf(this.screenImage));
        sb.append(", nls=").append(String.valueOf(this.nls));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", featuresConfig=").append(String.valueOf(this.featuresConfig));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
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
        if (!(o instanceof ManagementDashboardSummary)) {
            return false;
        }

        ManagementDashboardSummary other = (ManagementDashboardSummary) o;
        return java.util.Objects.equals(this.dashboardId, other.dashboardId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.providerId, other.providerId)
                && java.util.Objects.equals(this.providerName, other.providerName)
                && java.util.Objects.equals(this.providerVersion, other.providerVersion)
                && java.util.Objects.equals(this.isOobDashboard, other.isOobDashboard)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.updatedBy, other.updatedBy)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.metadataVersion, other.metadataVersion)
                && java.util.Objects.equals(this.screenImage, other.screenImage)
                && java.util.Objects.equals(this.nls, other.nls)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.featuresConfig, other.featuresConfig)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dashboardId == null ? 43 : this.dashboardId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.providerId == null ? 43 : this.providerId.hashCode());
        result = (result * PRIME) + (this.providerName == null ? 43 : this.providerName.hashCode());
        result =
                (result * PRIME)
                        + (this.providerVersion == null ? 43 : this.providerVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.isOobDashboard == null ? 43 : this.isOobDashboard.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.metadataVersion == null ? 43 : this.metadataVersion.hashCode());
        result = (result * PRIME) + (this.screenImage == null ? 43 : this.screenImage.hashCode());
        result = (result * PRIME) + (this.nls == null ? 43 : this.nls.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.featuresConfig == null ? 43 : this.featuresConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

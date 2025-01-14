/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The summary of the Fleet. A Fleet is the primary collection with which users interact when using
 * Java Management Service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FleetSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FleetSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "approximateJreCount",
        "approximateInstallationCount",
        "approximateApplicationCount",
        "approximateManagedInstanceCount",
        "approximateJavaServerCount",
        "inventoryLog",
        "operationLog",
        "isAdvancedFeaturesEnabled",
        "isExportSettingEnabled",
        "timeCreated",
        "lifecycleState",
        "definedTags",
        "freeformTags",
        "systemTags"
    })
    public FleetSummary(
            String id,
            String displayName,
            String description,
            String compartmentId,
            Integer approximateJreCount,
            Integer approximateInstallationCount,
            Integer approximateApplicationCount,
            Integer approximateManagedInstanceCount,
            Integer approximateJavaServerCount,
            CustomLog inventoryLog,
            CustomLog operationLog,
            Boolean isAdvancedFeaturesEnabled,
            Boolean isExportSettingEnabled,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.approximateJreCount = approximateJreCount;
        this.approximateInstallationCount = approximateInstallationCount;
        this.approximateApplicationCount = approximateApplicationCount;
        this.approximateManagedInstanceCount = approximateManagedInstanceCount;
        this.approximateJavaServerCount = approximateJavaServerCount;
        this.inventoryLog = inventoryLog;
        this.operationLog = operationLog;
        this.isAdvancedFeaturesEnabled = isAdvancedFeaturesEnabled;
        this.isExportSettingEnabled = isExportSettingEnabled;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
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
         * The name of the Fleet. The displayName must be unique for Fleets in the same compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the Fleet. The displayName must be unique for Fleets in the same compartment.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The Fleet's description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The Fleet's description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment of the Fleet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment of the Fleet.
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
         * The approximate count of all unique Java Runtimes in the Fleet in the past seven days.
         * This metric is provided on a best-effort manner, and isn't taken into account when
         * computing the resource ETag.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateJreCount")
        private Integer approximateJreCount;

        /**
         * The approximate count of all unique Java Runtimes in the Fleet in the past seven days.
         * This metric is provided on a best-effort manner, and isn't taken into account when
         * computing the resource ETag.
         *
         * @param approximateJreCount the value to set
         * @return this builder
         */
        public Builder approximateJreCount(Integer approximateJreCount) {
            this.approximateJreCount = approximateJreCount;
            this.__explicitlySet__.add("approximateJreCount");
            return this;
        }
        /**
         * The approximate count of all unique Java Installations in the Fleet in the past seven
         * days. This metric is provided on a best-effort manner, and isn't taken into account when
         * computing the resource ETag.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateInstallationCount")
        private Integer approximateInstallationCount;

        /**
         * The approximate count of all unique Java Installations in the Fleet in the past seven
         * days. This metric is provided on a best-effort manner, and isn't taken into account when
         * computing the resource ETag.
         *
         * @param approximateInstallationCount the value to set
         * @return this builder
         */
        public Builder approximateInstallationCount(Integer approximateInstallationCount) {
            this.approximateInstallationCount = approximateInstallationCount;
            this.__explicitlySet__.add("approximateInstallationCount");
            return this;
        }
        /**
         * The approximate count of all unique applications in the Fleet in the past seven days.
         * This metric is provided on a best-effort manner, and isn't taken into account when
         * computing the resource ETag.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateApplicationCount")
        private Integer approximateApplicationCount;

        /**
         * The approximate count of all unique applications in the Fleet in the past seven days.
         * This metric is provided on a best-effort manner, and isn't taken into account when
         * computing the resource ETag.
         *
         * @param approximateApplicationCount the value to set
         * @return this builder
         */
        public Builder approximateApplicationCount(Integer approximateApplicationCount) {
            this.approximateApplicationCount = approximateApplicationCount;
            this.__explicitlySet__.add("approximateApplicationCount");
            return this;
        }
        /**
         * The approximate count of all unique managed instances in the Fleet in the past seven
         * days. This metric is provided on a best-effort manner, and isn't taken into account when
         * computing the resource ETag.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateManagedInstanceCount")
        private Integer approximateManagedInstanceCount;

        /**
         * The approximate count of all unique managed instances in the Fleet in the past seven
         * days. This metric is provided on a best-effort manner, and isn't taken into account when
         * computing the resource ETag.
         *
         * @param approximateManagedInstanceCount the value to set
         * @return this builder
         */
        public Builder approximateManagedInstanceCount(Integer approximateManagedInstanceCount) {
            this.approximateManagedInstanceCount = approximateManagedInstanceCount;
            this.__explicitlySet__.add("approximateManagedInstanceCount");
            return this;
        }
        /**
         * The approximate count of all unique Java servers in the Fleet in the past seven days.
         * This metric is provided on a best-effort manner, and isn't taken into account when
         * computing the resource ETag.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateJavaServerCount")
        private Integer approximateJavaServerCount;

        /**
         * The approximate count of all unique Java servers in the Fleet in the past seven days.
         * This metric is provided on a best-effort manner, and isn't taken into account when
         * computing the resource ETag.
         *
         * @param approximateJavaServerCount the value to set
         * @return this builder
         */
        public Builder approximateJavaServerCount(Integer approximateJavaServerCount) {
            this.approximateJavaServerCount = approximateJavaServerCount;
            this.__explicitlySet__.add("approximateJavaServerCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inventoryLog")
        private CustomLog inventoryLog;

        public Builder inventoryLog(CustomLog inventoryLog) {
            this.inventoryLog = inventoryLog;
            this.__explicitlySet__.add("inventoryLog");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationLog")
        private CustomLog operationLog;

        public Builder operationLog(CustomLog operationLog) {
            this.operationLog = operationLog;
            this.__explicitlySet__.add("operationLog");
            return this;
        }
        /**
         * Whether or not advanced features are enabled in this Fleet. This flag is true if any one
         * of the advanced features is turned on.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAdvancedFeaturesEnabled")
        private Boolean isAdvancedFeaturesEnabled;

        /**
         * Whether or not advanced features are enabled in this Fleet. This flag is true if any one
         * of the advanced features is turned on.
         *
         * @param isAdvancedFeaturesEnabled the value to set
         * @return this builder
         */
        public Builder isAdvancedFeaturesEnabled(Boolean isAdvancedFeaturesEnabled) {
            this.isAdvancedFeaturesEnabled = isAdvancedFeaturesEnabled;
            this.__explicitlySet__.add("isAdvancedFeaturesEnabled");
            return this;
        }
        /** Whether or not export setting is enabled in this Fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("isExportSettingEnabled")
        private Boolean isExportSettingEnabled;

        /**
         * Whether or not export setting is enabled in this Fleet.
         *
         * @param isExportSettingEnabled the value to set
         * @return this builder
         */
        public Builder isExportSettingEnabled(Boolean isExportSettingEnabled) {
            this.isExportSettingEnabled = isExportSettingEnabled;
            this.__explicitlySet__.add("isExportSettingEnabled");
            return this;
        }
        /**
         * The creation date and time of the Fleet (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The creation date and time of the Fleet (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The lifecycle state of the Fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The lifecycle state of the Fleet.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form
         * Tags](https://docs.cloud.oracle.com/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form
         * Tags](https://docs.cloud.oracle.com/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
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
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}. (See [Managing Tags
         * and Tag
         * Namespaces](https://docs.cloud.oracle.com/Content/Tagging/Concepts/understandingfreeformtags.htm).)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}. (See [Managing Tags
         * and Tag
         * Namespaces](https://docs.cloud.oracle.com/Content/Tagging/Concepts/understandingfreeformtags.htm).)
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
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
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

        public FleetSummary build() {
            FleetSummary model =
                    new FleetSummary(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.approximateJreCount,
                            this.approximateInstallationCount,
                            this.approximateApplicationCount,
                            this.approximateManagedInstanceCount,
                            this.approximateJavaServerCount,
                            this.inventoryLog,
                            this.operationLog,
                            this.isAdvancedFeaturesEnabled,
                            this.isExportSettingEnabled,
                            this.timeCreated,
                            this.lifecycleState,
                            this.definedTags,
                            this.freeformTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetSummary model) {
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
            if (model.wasPropertyExplicitlySet("approximateJreCount")) {
                this.approximateJreCount(model.getApproximateJreCount());
            }
            if (model.wasPropertyExplicitlySet("approximateInstallationCount")) {
                this.approximateInstallationCount(model.getApproximateInstallationCount());
            }
            if (model.wasPropertyExplicitlySet("approximateApplicationCount")) {
                this.approximateApplicationCount(model.getApproximateApplicationCount());
            }
            if (model.wasPropertyExplicitlySet("approximateManagedInstanceCount")) {
                this.approximateManagedInstanceCount(model.getApproximateManagedInstanceCount());
            }
            if (model.wasPropertyExplicitlySet("approximateJavaServerCount")) {
                this.approximateJavaServerCount(model.getApproximateJavaServerCount());
            }
            if (model.wasPropertyExplicitlySet("inventoryLog")) {
                this.inventoryLog(model.getInventoryLog());
            }
            if (model.wasPropertyExplicitlySet("operationLog")) {
                this.operationLog(model.getOperationLog());
            }
            if (model.wasPropertyExplicitlySet("isAdvancedFeaturesEnabled")) {
                this.isAdvancedFeaturesEnabled(model.getIsAdvancedFeaturesEnabled());
            }
            if (model.wasPropertyExplicitlySet("isExportSettingEnabled")) {
                this.isExportSettingEnabled(model.getIsExportSettingEnabled());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Fleet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Fleet.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The name of the Fleet. The displayName must be unique for Fleets in the same compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the Fleet. The displayName must be unique for Fleets in the same compartment.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The Fleet's description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The Fleet's description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment of the Fleet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment of the Fleet.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The approximate count of all unique Java Runtimes in the Fleet in the past seven days. This
     * metric is provided on a best-effort manner, and isn't taken into account when computing the
     * resource ETag.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateJreCount")
    private final Integer approximateJreCount;

    /**
     * The approximate count of all unique Java Runtimes in the Fleet in the past seven days. This
     * metric is provided on a best-effort manner, and isn't taken into account when computing the
     * resource ETag.
     *
     * @return the value
     */
    public Integer getApproximateJreCount() {
        return approximateJreCount;
    }

    /**
     * The approximate count of all unique Java Installations in the Fleet in the past seven days.
     * This metric is provided on a best-effort manner, and isn't taken into account when computing
     * the resource ETag.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateInstallationCount")
    private final Integer approximateInstallationCount;

    /**
     * The approximate count of all unique Java Installations in the Fleet in the past seven days.
     * This metric is provided on a best-effort manner, and isn't taken into account when computing
     * the resource ETag.
     *
     * @return the value
     */
    public Integer getApproximateInstallationCount() {
        return approximateInstallationCount;
    }

    /**
     * The approximate count of all unique applications in the Fleet in the past seven days. This
     * metric is provided on a best-effort manner, and isn't taken into account when computing the
     * resource ETag.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateApplicationCount")
    private final Integer approximateApplicationCount;

    /**
     * The approximate count of all unique applications in the Fleet in the past seven days. This
     * metric is provided on a best-effort manner, and isn't taken into account when computing the
     * resource ETag.
     *
     * @return the value
     */
    public Integer getApproximateApplicationCount() {
        return approximateApplicationCount;
    }

    /**
     * The approximate count of all unique managed instances in the Fleet in the past seven days.
     * This metric is provided on a best-effort manner, and isn't taken into account when computing
     * the resource ETag.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateManagedInstanceCount")
    private final Integer approximateManagedInstanceCount;

    /**
     * The approximate count of all unique managed instances in the Fleet in the past seven days.
     * This metric is provided on a best-effort manner, and isn't taken into account when computing
     * the resource ETag.
     *
     * @return the value
     */
    public Integer getApproximateManagedInstanceCount() {
        return approximateManagedInstanceCount;
    }

    /**
     * The approximate count of all unique Java servers in the Fleet in the past seven days. This
     * metric is provided on a best-effort manner, and isn't taken into account when computing the
     * resource ETag.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateJavaServerCount")
    private final Integer approximateJavaServerCount;

    /**
     * The approximate count of all unique Java servers in the Fleet in the past seven days. This
     * metric is provided on a best-effort manner, and isn't taken into account when computing the
     * resource ETag.
     *
     * @return the value
     */
    public Integer getApproximateJavaServerCount() {
        return approximateJavaServerCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("inventoryLog")
    private final CustomLog inventoryLog;

    public CustomLog getInventoryLog() {
        return inventoryLog;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("operationLog")
    private final CustomLog operationLog;

    public CustomLog getOperationLog() {
        return operationLog;
    }

    /**
     * Whether or not advanced features are enabled in this Fleet. This flag is true if any one of
     * the advanced features is turned on.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAdvancedFeaturesEnabled")
    private final Boolean isAdvancedFeaturesEnabled;

    /**
     * Whether or not advanced features are enabled in this Fleet. This flag is true if any one of
     * the advanced features is turned on.
     *
     * @return the value
     */
    public Boolean getIsAdvancedFeaturesEnabled() {
        return isAdvancedFeaturesEnabled;
    }

    /** Whether or not export setting is enabled in this Fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("isExportSettingEnabled")
    private final Boolean isExportSettingEnabled;

    /**
     * Whether or not export setting is enabled in this Fleet.
     *
     * @return the value
     */
    public Boolean getIsExportSettingEnabled() {
        return isExportSettingEnabled;
    }

    /**
     * The creation date and time of the Fleet (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The creation date and time of the Fleet (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The lifecycle state of the Fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The lifecycle state of the Fleet.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form
     * Tags](https://docs.cloud.oracle.com/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form
     * Tags](https://docs.cloud.oracle.com/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}. (See [Managing Tags and Tag
     * Namespaces](https://docs.cloud.oracle.com/Content/Tagging/Concepts/understandingfreeformtags.htm).)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}. (See [Managing Tags and Tag
     * Namespaces](https://docs.cloud.oracle.com/Content/Tagging/Concepts/understandingfreeformtags.htm).)
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
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
        sb.append("FleetSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", approximateJreCount=").append(String.valueOf(this.approximateJreCount));
        sb.append(", approximateInstallationCount=")
                .append(String.valueOf(this.approximateInstallationCount));
        sb.append(", approximateApplicationCount=")
                .append(String.valueOf(this.approximateApplicationCount));
        sb.append(", approximateManagedInstanceCount=")
                .append(String.valueOf(this.approximateManagedInstanceCount));
        sb.append(", approximateJavaServerCount=")
                .append(String.valueOf(this.approximateJavaServerCount));
        sb.append(", inventoryLog=").append(String.valueOf(this.inventoryLog));
        sb.append(", operationLog=").append(String.valueOf(this.operationLog));
        sb.append(", isAdvancedFeaturesEnabled=")
                .append(String.valueOf(this.isAdvancedFeaturesEnabled));
        sb.append(", isExportSettingEnabled=").append(String.valueOf(this.isExportSettingEnabled));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FleetSummary)) {
            return false;
        }

        FleetSummary other = (FleetSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.approximateJreCount, other.approximateJreCount)
                && java.util.Objects.equals(
                        this.approximateInstallationCount, other.approximateInstallationCount)
                && java.util.Objects.equals(
                        this.approximateApplicationCount, other.approximateApplicationCount)
                && java.util.Objects.equals(
                        this.approximateManagedInstanceCount, other.approximateManagedInstanceCount)
                && java.util.Objects.equals(
                        this.approximateJavaServerCount, other.approximateJavaServerCount)
                && java.util.Objects.equals(this.inventoryLog, other.inventoryLog)
                && java.util.Objects.equals(this.operationLog, other.operationLog)
                && java.util.Objects.equals(
                        this.isAdvancedFeaturesEnabled, other.isAdvancedFeaturesEnabled)
                && java.util.Objects.equals(
                        this.isExportSettingEnabled, other.isExportSettingEnabled)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateJreCount == null
                                ? 43
                                : this.approximateJreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateInstallationCount == null
                                ? 43
                                : this.approximateInstallationCount.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateApplicationCount == null
                                ? 43
                                : this.approximateApplicationCount.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateManagedInstanceCount == null
                                ? 43
                                : this.approximateManagedInstanceCount.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateJavaServerCount == null
                                ? 43
                                : this.approximateJavaServerCount.hashCode());
        result = (result * PRIME) + (this.inventoryLog == null ? 43 : this.inventoryLog.hashCode());
        result = (result * PRIME) + (this.operationLog == null ? 43 : this.operationLog.hashCode());
        result =
                (result * PRIME)
                        + (this.isAdvancedFeaturesEnabled == null
                                ? 43
                                : this.isAdvancedFeaturesEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isExportSettingEnabled == null
                                ? 43
                                : this.isExportSettingEnabled.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Read-only fully managed snapshot of MlApplicationImplementation taken when
 * MlApplicationImplementation was updated with new ML Application package. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MlApplicationImplementationVersion.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MlApplicationImplementationVersion
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "mlApplicationImplementationId",
        "name",
        "description",
        "mlApplicationId",
        "mlApplicationName",
        "packageVersion",
        "applicationComponents",
        "configurationSchema",
        "mlApplicationPackageArguments",
        "allowedMigrationDestinations",
        "timeCreated",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public MlApplicationImplementationVersion(
            String id,
            String mlApplicationImplementationId,
            String name,
            String description,
            String mlApplicationId,
            String mlApplicationName,
            String packageVersion,
            java.util.List<ApplicationComponent> applicationComponents,
            java.util.List<ConfigurationPropertySchema> configurationSchema,
            MlApplicationPackageArguments mlApplicationPackageArguments,
            java.util.List<String> allowedMigrationDestinations,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.mlApplicationImplementationId = mlApplicationImplementationId;
        this.name = name;
        this.description = description;
        this.mlApplicationId = mlApplicationId;
        this.mlApplicationName = mlApplicationName;
        this.packageVersion = packageVersion;
        this.applicationComponents = applicationComponents;
        this.configurationSchema = configurationSchema;
        this.mlApplicationPackageArguments = mlApplicationPackageArguments;
        this.allowedMigrationDestinations = allowedMigrationDestinations;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the MlApplicationImplementationVersion. Unique identifier that is immutable
         * after creation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the MlApplicationImplementationVersion. Unique identifier that is immutable
         * after creation.
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
         * The OCID of the MlApplicationImplementation for which this resource keeps the historical
         * state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationImplementationId")
        private String mlApplicationImplementationId;

        /**
         * The OCID of the MlApplicationImplementation for which this resource keeps the historical
         * state.
         *
         * @param mlApplicationImplementationId the value to set
         * @return this builder
         */
        public Builder mlApplicationImplementationId(String mlApplicationImplementationId) {
            this.mlApplicationImplementationId = mlApplicationImplementationId;
            this.__explicitlySet__.add("mlApplicationImplementationId");
            return this;
        }
        /** ML Application Implementation name which is unique for given ML Application. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * ML Application Implementation name which is unique for given ML Application.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Description of ML Application Implementation defined in ML Application package descriptor
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of ML Application Implementation defined in ML Application package descriptor
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The OCID of the ML Application implemented by this ML Application Implementation. */
        @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationId")
        private String mlApplicationId;

        /**
         * The OCID of the ML Application implemented by this ML Application Implementation.
         *
         * @param mlApplicationId the value to set
         * @return this builder
         */
        public Builder mlApplicationId(String mlApplicationId) {
            this.mlApplicationId = mlApplicationId;
            this.__explicitlySet__.add("mlApplicationId");
            return this;
        }
        /** The name of ML Application (based on mlApplicationId) */
        @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationName")
        private String mlApplicationName;

        /**
         * The name of ML Application (based on mlApplicationId)
         *
         * @param mlApplicationName the value to set
         * @return this builder
         */
        public Builder mlApplicationName(String mlApplicationName) {
            this.mlApplicationName = mlApplicationName;
            this.__explicitlySet__.add("mlApplicationName");
            return this;
        }
        /**
         * The version of ML Application Package (e.g. "1.2" or "2.0.4") defined in ML Application
         * package descriptor. Value is not mandatory only for CREATING state otherwise it must be
         * always presented.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
        private String packageVersion;

        /**
         * The version of ML Application Package (e.g. "1.2" or "2.0.4") defined in ML Application
         * package descriptor. Value is not mandatory only for CREATING state otherwise it must be
         * always presented.
         *
         * @param packageVersion the value to set
         * @return this builder
         */
        public Builder packageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            this.__explicitlySet__.add("packageVersion");
            return this;
        }
        /**
         * List of application components (OCI resources shared for all MlApplicationInstances).
         * These have been created automatically based on their definitions in the ML Application
         * package.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationComponents")
        private java.util.List<ApplicationComponent> applicationComponents;

        /**
         * List of application components (OCI resources shared for all MlApplicationInstances).
         * These have been created automatically based on their definitions in the ML Application
         * package.
         *
         * @param applicationComponents the value to set
         * @return this builder
         */
        public Builder applicationComponents(
                java.util.List<ApplicationComponent> applicationComponents) {
            this.applicationComponents = applicationComponents;
            this.__explicitlySet__.add("applicationComponents");
            return this;
        }
        /**
         * Schema of configuration which needs to be provided for each ML Application Instance. It
         * is defined in the ML Application package descriptor.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configurationSchema")
        private java.util.List<ConfigurationPropertySchema> configurationSchema;

        /**
         * Schema of configuration which needs to be provided for each ML Application Instance. It
         * is defined in the ML Application package descriptor.
         *
         * @param configurationSchema the value to set
         * @return this builder
         */
        public Builder configurationSchema(
                java.util.List<ConfigurationPropertySchema> configurationSchema) {
            this.configurationSchema = configurationSchema;
            this.__explicitlySet__.add("configurationSchema");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationPackageArguments")
        private MlApplicationPackageArguments mlApplicationPackageArguments;

        public Builder mlApplicationPackageArguments(
                MlApplicationPackageArguments mlApplicationPackageArguments) {
            this.mlApplicationPackageArguments = mlApplicationPackageArguments;
            this.__explicitlySet__.add("mlApplicationPackageArguments");
            return this;
        }
        /**
         * List of ML Application Implementation OCIDs for which migration from this implementation
         * is allowed. Migration means that if consumers change implementation for their instances
         * to implementation with OCID from this list, instance components will be updated in place
         * otherwise new instance components are created based on the new implementation and old
         * instance components are removed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedMigrationDestinations")
        private java.util.List<String> allowedMigrationDestinations;

        /**
         * List of ML Application Implementation OCIDs for which migration from this implementation
         * is allowed. Migration means that if consumers change implementation for their instances
         * to implementation with OCID from this list, instance components will be updated in place
         * otherwise new instance components are created based on the new implementation and old
         * instance components are removed.
         *
         * @param allowedMigrationDestinations the value to set
         * @return this builder
         */
        public Builder allowedMigrationDestinations(
                java.util.List<String> allowedMigrationDestinations) {
            this.allowedMigrationDestinations = allowedMigrationDestinations;
            this.__explicitlySet__.add("allowedMigrationDestinations");
            return this;
        }
        /**
         * Creation time of MlApplicationImplementationVersion in the format defined by RFC 3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Creation time of MlApplicationImplementationVersion in the format defined by RFC 3339.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The current state of the MlApplicationImplementationVersion. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the MlApplicationImplementationVersion.
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
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. See [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
         * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        public MlApplicationImplementationVersion build() {
            MlApplicationImplementationVersion model =
                    new MlApplicationImplementationVersion(
                            this.id,
                            this.mlApplicationImplementationId,
                            this.name,
                            this.description,
                            this.mlApplicationId,
                            this.mlApplicationName,
                            this.packageVersion,
                            this.applicationComponents,
                            this.configurationSchema,
                            this.mlApplicationPackageArguments,
                            this.allowedMigrationDestinations,
                            this.timeCreated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MlApplicationImplementationVersion model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("mlApplicationImplementationId")) {
                this.mlApplicationImplementationId(model.getMlApplicationImplementationId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("mlApplicationId")) {
                this.mlApplicationId(model.getMlApplicationId());
            }
            if (model.wasPropertyExplicitlySet("mlApplicationName")) {
                this.mlApplicationName(model.getMlApplicationName());
            }
            if (model.wasPropertyExplicitlySet("packageVersion")) {
                this.packageVersion(model.getPackageVersion());
            }
            if (model.wasPropertyExplicitlySet("applicationComponents")) {
                this.applicationComponents(model.getApplicationComponents());
            }
            if (model.wasPropertyExplicitlySet("configurationSchema")) {
                this.configurationSchema(model.getConfigurationSchema());
            }
            if (model.wasPropertyExplicitlySet("mlApplicationPackageArguments")) {
                this.mlApplicationPackageArguments(model.getMlApplicationPackageArguments());
            }
            if (model.wasPropertyExplicitlySet("allowedMigrationDestinations")) {
                this.allowedMigrationDestinations(model.getAllowedMigrationDestinations());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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

    /**
     * The OCID of the MlApplicationImplementationVersion. Unique identifier that is immutable after
     * creation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the MlApplicationImplementationVersion. Unique identifier that is immutable after
     * creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The OCID of the MlApplicationImplementation for which this resource keeps the historical
     * state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationImplementationId")
    private final String mlApplicationImplementationId;

    /**
     * The OCID of the MlApplicationImplementation for which this resource keeps the historical
     * state.
     *
     * @return the value
     */
    public String getMlApplicationImplementationId() {
        return mlApplicationImplementationId;
    }

    /** ML Application Implementation name which is unique for given ML Application. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * ML Application Implementation name which is unique for given ML Application.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Description of ML Application Implementation defined in ML Application package descriptor */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of ML Application Implementation defined in ML Application package descriptor
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The OCID of the ML Application implemented by this ML Application Implementation. */
    @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationId")
    private final String mlApplicationId;

    /**
     * The OCID of the ML Application implemented by this ML Application Implementation.
     *
     * @return the value
     */
    public String getMlApplicationId() {
        return mlApplicationId;
    }

    /** The name of ML Application (based on mlApplicationId) */
    @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationName")
    private final String mlApplicationName;

    /**
     * The name of ML Application (based on mlApplicationId)
     *
     * @return the value
     */
    public String getMlApplicationName() {
        return mlApplicationName;
    }

    /**
     * The version of ML Application Package (e.g. "1.2" or "2.0.4") defined in ML Application
     * package descriptor. Value is not mandatory only for CREATING state otherwise it must be
     * always presented.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
    private final String packageVersion;

    /**
     * The version of ML Application Package (e.g. "1.2" or "2.0.4") defined in ML Application
     * package descriptor. Value is not mandatory only for CREATING state otherwise it must be
     * always presented.
     *
     * @return the value
     */
    public String getPackageVersion() {
        return packageVersion;
    }

    /**
     * List of application components (OCI resources shared for all MlApplicationInstances). These
     * have been created automatically based on their definitions in the ML Application package.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationComponents")
    private final java.util.List<ApplicationComponent> applicationComponents;

    /**
     * List of application components (OCI resources shared for all MlApplicationInstances). These
     * have been created automatically based on their definitions in the ML Application package.
     *
     * @return the value
     */
    public java.util.List<ApplicationComponent> getApplicationComponents() {
        return applicationComponents;
    }

    /**
     * Schema of configuration which needs to be provided for each ML Application Instance. It is
     * defined in the ML Application package descriptor.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configurationSchema")
    private final java.util.List<ConfigurationPropertySchema> configurationSchema;

    /**
     * Schema of configuration which needs to be provided for each ML Application Instance. It is
     * defined in the ML Application package descriptor.
     *
     * @return the value
     */
    public java.util.List<ConfigurationPropertySchema> getConfigurationSchema() {
        return configurationSchema;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("mlApplicationPackageArguments")
    private final MlApplicationPackageArguments mlApplicationPackageArguments;

    public MlApplicationPackageArguments getMlApplicationPackageArguments() {
        return mlApplicationPackageArguments;
    }

    /**
     * List of ML Application Implementation OCIDs for which migration from this implementation is
     * allowed. Migration means that if consumers change implementation for their instances to
     * implementation with OCID from this list, instance components will be updated in place
     * otherwise new instance components are created based on the new implementation and old
     * instance components are removed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedMigrationDestinations")
    private final java.util.List<String> allowedMigrationDestinations;

    /**
     * List of ML Application Implementation OCIDs for which migration from this implementation is
     * allowed. Migration means that if consumers change implementation for their instances to
     * implementation with OCID from this list, instance components will be updated in place
     * otherwise new instance components are created based on the new implementation and old
     * instance components are removed.
     *
     * @return the value
     */
    public java.util.List<String> getAllowedMigrationDestinations() {
        return allowedMigrationDestinations;
    }

    /** Creation time of MlApplicationImplementationVersion in the format defined by RFC 3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Creation time of MlApplicationImplementationVersion in the format defined by RFC 3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The current state of the MlApplicationImplementationVersion. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Failed("FAILED"),
        Deleting("DELETING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the MlApplicationImplementationVersion. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the MlApplicationImplementationVersion.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. See [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See
     * [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("MlApplicationImplementationVersion(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", mlApplicationImplementationId=")
                .append(String.valueOf(this.mlApplicationImplementationId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", mlApplicationId=").append(String.valueOf(this.mlApplicationId));
        sb.append(", mlApplicationName=").append(String.valueOf(this.mlApplicationName));
        sb.append(", packageVersion=").append(String.valueOf(this.packageVersion));
        sb.append(", applicationComponents=").append(String.valueOf(this.applicationComponents));
        sb.append(", configurationSchema=").append(String.valueOf(this.configurationSchema));
        sb.append(", mlApplicationPackageArguments=")
                .append(String.valueOf(this.mlApplicationPackageArguments));
        sb.append(", allowedMigrationDestinations=")
                .append(String.valueOf(this.allowedMigrationDestinations));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
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
        if (!(o instanceof MlApplicationImplementationVersion)) {
            return false;
        }

        MlApplicationImplementationVersion other = (MlApplicationImplementationVersion) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.mlApplicationImplementationId, other.mlApplicationImplementationId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.mlApplicationId, other.mlApplicationId)
                && java.util.Objects.equals(this.mlApplicationName, other.mlApplicationName)
                && java.util.Objects.equals(this.packageVersion, other.packageVersion)
                && java.util.Objects.equals(this.applicationComponents, other.applicationComponents)
                && java.util.Objects.equals(this.configurationSchema, other.configurationSchema)
                && java.util.Objects.equals(
                        this.mlApplicationPackageArguments, other.mlApplicationPackageArguments)
                && java.util.Objects.equals(
                        this.allowedMigrationDestinations, other.allowedMigrationDestinations)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
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
        result =
                (result * PRIME)
                        + (this.mlApplicationImplementationId == null
                                ? 43
                                : this.mlApplicationImplementationId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.mlApplicationId == null ? 43 : this.mlApplicationId.hashCode());
        result =
                (result * PRIME)
                        + (this.mlApplicationName == null ? 43 : this.mlApplicationName.hashCode());
        result =
                (result * PRIME)
                        + (this.packageVersion == null ? 43 : this.packageVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationComponents == null
                                ? 43
                                : this.applicationComponents.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationSchema == null
                                ? 43
                                : this.configurationSchema.hashCode());
        result =
                (result * PRIME)
                        + (this.mlApplicationPackageArguments == null
                                ? 43
                                : this.mlApplicationPackageArguments.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedMigrationDestinations == null
                                ? 43
                                : this.allowedMigrationDestinations.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

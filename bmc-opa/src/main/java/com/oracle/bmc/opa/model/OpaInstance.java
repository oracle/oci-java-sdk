/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opa.model;

/**
 * Description of OpaInstance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210621")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OpaInstance.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OpaInstance extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "instanceUrl",
        "consumptionModel",
        "shapeName",
        "meteringType",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "identityAppGuid",
        "identityAppDisplayName",
        "identityDomainUrl",
        "identityAppOpcServiceInstanceGuid",
        "isBreakglassEnabled",
        "freeformTags",
        "definedTags",
        "systemTags",
        "attachments"
    })
    public OpaInstance(
            String id,
            String displayName,
            String description,
            String compartmentId,
            String instanceUrl,
            ConsumptionModel consumptionModel,
            ShapeName shapeName,
            MeteringType meteringType,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String identityAppGuid,
            String identityAppDisplayName,
            String identityDomainUrl,
            String identityAppOpcServiceInstanceGuid,
            Boolean isBreakglassEnabled,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<AttachmentDetails> attachments) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.instanceUrl = instanceUrl;
        this.consumptionModel = consumptionModel;
        this.shapeName = shapeName;
        this.meteringType = meteringType;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.identityAppGuid = identityAppGuid;
        this.identityAppDisplayName = identityAppDisplayName;
        this.identityDomainUrl = identityDomainUrl;
        this.identityAppOpcServiceInstanceGuid = identityAppOpcServiceInstanceGuid;
        this.isBreakglassEnabled = isBreakglassEnabled;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.attachments = attachments;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that is immutable on creation */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** OpaInstance Identifier, can be renamed */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * OpaInstance Identifier, can be renamed
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the Process Automation instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the Process Automation instance.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Compartment Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** OPA Instance URL */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceUrl")
        private String instanceUrl;

        /**
         * OPA Instance URL
         *
         * @param instanceUrl the value to set
         * @return this builder
         */
        public Builder instanceUrl(String instanceUrl) {
            this.instanceUrl = instanceUrl;
            this.__explicitlySet__.add("instanceUrl");
            return this;
        }
        /** The entitlement used for billing purposes */
        @com.fasterxml.jackson.annotation.JsonProperty("consumptionModel")
        private ConsumptionModel consumptionModel;

        /**
         * The entitlement used for billing purposes
         *
         * @param consumptionModel the value to set
         * @return this builder
         */
        public Builder consumptionModel(ConsumptionModel consumptionModel) {
            this.consumptionModel = consumptionModel;
            this.__explicitlySet__.add("consumptionModel");
            return this;
        }
        /** Shape of the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private ShapeName shapeName;

        /**
         * Shape of the instance.
         *
         * @param shapeName the value to set
         * @return this builder
         */
        public Builder shapeName(ShapeName shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }
        /** MeteringType Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("meteringType")
        private MeteringType meteringType;

        /**
         * MeteringType Identifier
         *
         * @param meteringType the value to set
         * @return this builder
         */
        public Builder meteringType(MeteringType meteringType) {
            this.meteringType = meteringType;
            this.__explicitlySet__.add("meteringType");
            return this;
        }
        /** The time when OpaInstance was created. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when OpaInstance was created. An RFC3339 formatted datetime string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the OpaInstance was updated. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the OpaInstance was updated. An RFC3339 formatted datetime string
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the OpaInstance. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the OpaInstance.
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
         * This property specifies the GUID of the Identity Application instance OPA has created
         * inside the user-specified identity domain. This identity application instance may be used
         * to host user role mappings to grant access to this OPA instance for users within the
         * identity domain.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identityAppGuid")
        private String identityAppGuid;

        /**
         * This property specifies the GUID of the Identity Application instance OPA has created
         * inside the user-specified identity domain. This identity application instance may be used
         * to host user role mappings to grant access to this OPA instance for users within the
         * identity domain.
         *
         * @param identityAppGuid the value to set
         * @return this builder
         */
        public Builder identityAppGuid(String identityAppGuid) {
            this.identityAppGuid = identityAppGuid;
            this.__explicitlySet__.add("identityAppGuid");
            return this;
        }
        /**
         * This property specifies the name of the Identity Application instance OPA has created
         * inside the user-specified identity domain. This identity application instance may be used
         * to host user roll mappings to grant access to this OPA instance for users within the
         * identity domain.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identityAppDisplayName")
        private String identityAppDisplayName;

        /**
         * This property specifies the name of the Identity Application instance OPA has created
         * inside the user-specified identity domain. This identity application instance may be used
         * to host user roll mappings to grant access to this OPA instance for users within the
         * identity domain.
         *
         * @param identityAppDisplayName the value to set
         * @return this builder
         */
        public Builder identityAppDisplayName(String identityAppDisplayName) {
            this.identityAppDisplayName = identityAppDisplayName;
            this.__explicitlySet__.add("identityAppDisplayName");
            return this;
        }
        /**
         * This property specifies the domain url of the Identity Application instance OPA has
         * created inside the user-specified identity domain. This identity application instance may
         * be used to host user roll mappings to grant access to this OPA instance for users within
         * the identity domain.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identityDomainUrl")
        private String identityDomainUrl;

        /**
         * This property specifies the domain url of the Identity Application instance OPA has
         * created inside the user-specified identity domain. This identity application instance may
         * be used to host user roll mappings to grant access to this OPA instance for users within
         * the identity domain.
         *
         * @param identityDomainUrl the value to set
         * @return this builder
         */
        public Builder identityDomainUrl(String identityDomainUrl) {
            this.identityDomainUrl = identityDomainUrl;
            this.__explicitlySet__.add("identityDomainUrl");
            return this;
        }
        /**
         * This property specifies the OPC Service Instance GUID of the Identity Application
         * instance OPA has created inside the user-specified identity domain. This identity
         * application instance may be used to host user roll mappings to grant access to this OPA
         * instance for users within the identity domain.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identityAppOpcServiceInstanceGuid")
        private String identityAppOpcServiceInstanceGuid;

        /**
         * This property specifies the OPC Service Instance GUID of the Identity Application
         * instance OPA has created inside the user-specified identity domain. This identity
         * application instance may be used to host user roll mappings to grant access to this OPA
         * instance for users within the identity domain.
         *
         * @param identityAppOpcServiceInstanceGuid the value to set
         * @return this builder
         */
        public Builder identityAppOpcServiceInstanceGuid(String identityAppOpcServiceInstanceGuid) {
            this.identityAppOpcServiceInstanceGuid = identityAppOpcServiceInstanceGuid;
            this.__explicitlySet__.add("identityAppOpcServiceInstanceGuid");
            return this;
        }
        /** indicates if breakGlass is enabled for the opa instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("isBreakglassEnabled")
        private Boolean isBreakglassEnabled;

        /**
         * indicates if breakGlass is enabled for the opa instance.
         *
         * @param isBreakglassEnabled the value to set
         * @return this builder
         */
        public Builder isBreakglassEnabled(Boolean isBreakglassEnabled) {
            this.isBreakglassEnabled = isBreakglassEnabled;
            this.__explicitlySet__.add("isBreakglassEnabled");
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
        /** A list of associated attachments to other services */
        @com.fasterxml.jackson.annotation.JsonProperty("attachments")
        private java.util.List<AttachmentDetails> attachments;

        /**
         * A list of associated attachments to other services
         *
         * @param attachments the value to set
         * @return this builder
         */
        public Builder attachments(java.util.List<AttachmentDetails> attachments) {
            this.attachments = attachments;
            this.__explicitlySet__.add("attachments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OpaInstance build() {
            OpaInstance model =
                    new OpaInstance(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.instanceUrl,
                            this.consumptionModel,
                            this.shapeName,
                            this.meteringType,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.identityAppGuid,
                            this.identityAppDisplayName,
                            this.identityDomainUrl,
                            this.identityAppOpcServiceInstanceGuid,
                            this.isBreakglassEnabled,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.attachments);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OpaInstance model) {
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
            if (model.wasPropertyExplicitlySet("instanceUrl")) {
                this.instanceUrl(model.getInstanceUrl());
            }
            if (model.wasPropertyExplicitlySet("consumptionModel")) {
                this.consumptionModel(model.getConsumptionModel());
            }
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
            }
            if (model.wasPropertyExplicitlySet("meteringType")) {
                this.meteringType(model.getMeteringType());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("identityAppGuid")) {
                this.identityAppGuid(model.getIdentityAppGuid());
            }
            if (model.wasPropertyExplicitlySet("identityAppDisplayName")) {
                this.identityAppDisplayName(model.getIdentityAppDisplayName());
            }
            if (model.wasPropertyExplicitlySet("identityDomainUrl")) {
                this.identityDomainUrl(model.getIdentityDomainUrl());
            }
            if (model.wasPropertyExplicitlySet("identityAppOpcServiceInstanceGuid")) {
                this.identityAppOpcServiceInstanceGuid(
                        model.getIdentityAppOpcServiceInstanceGuid());
            }
            if (model.wasPropertyExplicitlySet("isBreakglassEnabled")) {
                this.isBreakglassEnabled(model.getIsBreakglassEnabled());
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
            if (model.wasPropertyExplicitlySet("attachments")) {
                this.attachments(model.getAttachments());
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

    /** Unique identifier that is immutable on creation */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** OpaInstance Identifier, can be renamed */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * OpaInstance Identifier, can be renamed
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the Process Automation instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the Process Automation instance.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Compartment Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** OPA Instance URL */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceUrl")
    private final String instanceUrl;

    /**
     * OPA Instance URL
     *
     * @return the value
     */
    public String getInstanceUrl() {
        return instanceUrl;
    }

    /** The entitlement used for billing purposes */
    public enum ConsumptionModel implements com.oracle.bmc.http.internal.BmcEnum {
        Ucm("UCM"),
        Gov("GOV"),
        Saas("SAAS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ConsumptionModel.class);

        private final String value;
        private static java.util.Map<String, ConsumptionModel> map;

        static {
            map = new java.util.HashMap<>();
            for (ConsumptionModel v : ConsumptionModel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConsumptionModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConsumptionModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConsumptionModel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The entitlement used for billing purposes */
    @com.fasterxml.jackson.annotation.JsonProperty("consumptionModel")
    private final ConsumptionModel consumptionModel;

    /**
     * The entitlement used for billing purposes
     *
     * @return the value
     */
    public ConsumptionModel getConsumptionModel() {
        return consumptionModel;
    }

    /** Shape of the instance. */
    public enum ShapeName implements com.oracle.bmc.http.internal.BmcEnum {
        Development("DEVELOPMENT"),
        Production("PRODUCTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ShapeName.class);

        private final String value;
        private static java.util.Map<String, ShapeName> map;

        static {
            map = new java.util.HashMap<>();
            for (ShapeName v : ShapeName.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ShapeName(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ShapeName create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ShapeName', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Shape of the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final ShapeName shapeName;

    /**
     * Shape of the instance.
     *
     * @return the value
     */
    public ShapeName getShapeName() {
        return shapeName;
    }

    /** MeteringType Identifier */
    public enum MeteringType implements com.oracle.bmc.http.internal.BmcEnum {
        ExecutionPack("EXECUTION_PACK"),
        Users("USERS"),
        Employee("EMPLOYEE"),
        NamedUser("NAMED_USER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MeteringType.class);

        private final String value;
        private static java.util.Map<String, MeteringType> map;

        static {
            map = new java.util.HashMap<>();
            for (MeteringType v : MeteringType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MeteringType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MeteringType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MeteringType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** MeteringType Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("meteringType")
    private final MeteringType meteringType;

    /**
     * MeteringType Identifier
     *
     * @return the value
     */
    public MeteringType getMeteringType() {
        return meteringType;
    }

    /** The time when OpaInstance was created. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when OpaInstance was created. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the OpaInstance was updated. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the OpaInstance was updated. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the OpaInstance. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

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
    /** The current state of the OpaInstance. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the OpaInstance.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * This property specifies the GUID of the Identity Application instance OPA has created inside
     * the user-specified identity domain. This identity application instance may be used to host
     * user role mappings to grant access to this OPA instance for users within the identity domain.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identityAppGuid")
    private final String identityAppGuid;

    /**
     * This property specifies the GUID of the Identity Application instance OPA has created inside
     * the user-specified identity domain. This identity application instance may be used to host
     * user role mappings to grant access to this OPA instance for users within the identity domain.
     *
     * @return the value
     */
    public String getIdentityAppGuid() {
        return identityAppGuid;
    }

    /**
     * This property specifies the name of the Identity Application instance OPA has created inside
     * the user-specified identity domain. This identity application instance may be used to host
     * user roll mappings to grant access to this OPA instance for users within the identity domain.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identityAppDisplayName")
    private final String identityAppDisplayName;

    /**
     * This property specifies the name of the Identity Application instance OPA has created inside
     * the user-specified identity domain. This identity application instance may be used to host
     * user roll mappings to grant access to this OPA instance for users within the identity domain.
     *
     * @return the value
     */
    public String getIdentityAppDisplayName() {
        return identityAppDisplayName;
    }

    /**
     * This property specifies the domain url of the Identity Application instance OPA has created
     * inside the user-specified identity domain. This identity application instance may be used to
     * host user roll mappings to grant access to this OPA instance for users within the identity
     * domain.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identityDomainUrl")
    private final String identityDomainUrl;

    /**
     * This property specifies the domain url of the Identity Application instance OPA has created
     * inside the user-specified identity domain. This identity application instance may be used to
     * host user roll mappings to grant access to this OPA instance for users within the identity
     * domain.
     *
     * @return the value
     */
    public String getIdentityDomainUrl() {
        return identityDomainUrl;
    }

    /**
     * This property specifies the OPC Service Instance GUID of the Identity Application instance
     * OPA has created inside the user-specified identity domain. This identity application instance
     * may be used to host user roll mappings to grant access to this OPA instance for users within
     * the identity domain.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identityAppOpcServiceInstanceGuid")
    private final String identityAppOpcServiceInstanceGuid;

    /**
     * This property specifies the OPC Service Instance GUID of the Identity Application instance
     * OPA has created inside the user-specified identity domain. This identity application instance
     * may be used to host user roll mappings to grant access to this OPA instance for users within
     * the identity domain.
     *
     * @return the value
     */
    public String getIdentityAppOpcServiceInstanceGuid() {
        return identityAppOpcServiceInstanceGuid;
    }

    /** indicates if breakGlass is enabled for the opa instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("isBreakglassEnabled")
    private final Boolean isBreakglassEnabled;

    /**
     * indicates if breakGlass is enabled for the opa instance.
     *
     * @return the value
     */
    public Boolean getIsBreakglassEnabled() {
        return isBreakglassEnabled;
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

    /** A list of associated attachments to other services */
    @com.fasterxml.jackson.annotation.JsonProperty("attachments")
    private final java.util.List<AttachmentDetails> attachments;

    /**
     * A list of associated attachments to other services
     *
     * @return the value
     */
    public java.util.List<AttachmentDetails> getAttachments() {
        return attachments;
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
        sb.append("OpaInstance(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", instanceUrl=").append(String.valueOf(this.instanceUrl));
        sb.append(", consumptionModel=").append(String.valueOf(this.consumptionModel));
        sb.append(", shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", meteringType=").append(String.valueOf(this.meteringType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", identityAppGuid=").append(String.valueOf(this.identityAppGuid));
        sb.append(", identityAppDisplayName=").append(String.valueOf(this.identityAppDisplayName));
        sb.append(", identityDomainUrl=").append(String.valueOf(this.identityDomainUrl));
        sb.append(", identityAppOpcServiceInstanceGuid=")
                .append(String.valueOf(this.identityAppOpcServiceInstanceGuid));
        sb.append(", isBreakglassEnabled=").append(String.valueOf(this.isBreakglassEnabled));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", attachments=").append(String.valueOf(this.attachments));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpaInstance)) {
            return false;
        }

        OpaInstance other = (OpaInstance) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.instanceUrl, other.instanceUrl)
                && java.util.Objects.equals(this.consumptionModel, other.consumptionModel)
                && java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.meteringType, other.meteringType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.identityAppGuid, other.identityAppGuid)
                && java.util.Objects.equals(
                        this.identityAppDisplayName, other.identityAppDisplayName)
                && java.util.Objects.equals(this.identityDomainUrl, other.identityDomainUrl)
                && java.util.Objects.equals(
                        this.identityAppOpcServiceInstanceGuid,
                        other.identityAppOpcServiceInstanceGuid)
                && java.util.Objects.equals(this.isBreakglassEnabled, other.isBreakglassEnabled)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.attachments, other.attachments)
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
        result = (result * PRIME) + (this.instanceUrl == null ? 43 : this.instanceUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.consumptionModel == null ? 43 : this.consumptionModel.hashCode());
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result = (result * PRIME) + (this.meteringType == null ? 43 : this.meteringType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.identityAppGuid == null ? 43 : this.identityAppGuid.hashCode());
        result =
                (result * PRIME)
                        + (this.identityAppDisplayName == null
                                ? 43
                                : this.identityAppDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.identityDomainUrl == null ? 43 : this.identityDomainUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.identityAppOpcServiceInstanceGuid == null
                                ? 43
                                : this.identityAppOpcServiceInstanceGuid.hashCode());
        result =
                (result * PRIME)
                        + (this.isBreakglassEnabled == null
                                ? 43
                                : this.isBreakglassEnabled.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.attachments == null ? 43 : this.attachments.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

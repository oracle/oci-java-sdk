/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.model;

/**
 * Description of Integration Instance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IntegrationInstance.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IntegrationInstance
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "integrationInstanceType",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "stateMessage",
        "freeformTags",
        "definedTags",
        "systemTags",
        "isByol",
        "instanceUrl",
        "instanceDesignTimeUrl",
        "messagePacks",
        "isFileServerEnabled",
        "isVisualBuilderEnabled",
        "customEndpoint",
        "alternateCustomEndpoints",
        "consumptionModel",
        "networkEndpointDetails",
        "idcsInfo",
        "attachments",
        "shape",
        "privateEndpointOutboundConnection",
        "isDisasterRecoveryEnabled",
        "disasterRecoveryDetails",
        "dataRetentionPeriod"
    })
    public IntegrationInstance(
            String id,
            String displayName,
            String compartmentId,
            IntegrationInstanceType integrationInstanceType,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String stateMessage,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            Boolean isByol,
            String instanceUrl,
            String instanceDesignTimeUrl,
            Integer messagePacks,
            Boolean isFileServerEnabled,
            Boolean isVisualBuilderEnabled,
            CustomEndpointDetails customEndpoint,
            java.util.List<CustomEndpointDetails> alternateCustomEndpoints,
            ConsumptionModel consumptionModel,
            NetworkEndpointDetails networkEndpointDetails,
            IdcsInfoDetails idcsInfo,
            java.util.List<AttachmentDetails> attachments,
            Shape shape,
            OutboundConnection privateEndpointOutboundConnection,
            Boolean isDisasterRecoveryEnabled,
            DisasterRecoveryDetails disasterRecoveryDetails,
            DataRetentionPeriod dataRetentionPeriod) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.integrationInstanceType = integrationInstanceType;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.stateMessage = stateMessage;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.isByol = isByol;
        this.instanceUrl = instanceUrl;
        this.instanceDesignTimeUrl = instanceDesignTimeUrl;
        this.messagePacks = messagePacks;
        this.isFileServerEnabled = isFileServerEnabled;
        this.isVisualBuilderEnabled = isVisualBuilderEnabled;
        this.customEndpoint = customEndpoint;
        this.alternateCustomEndpoints = alternateCustomEndpoints;
        this.consumptionModel = consumptionModel;
        this.networkEndpointDetails = networkEndpointDetails;
        this.idcsInfo = idcsInfo;
        this.attachments = attachments;
        this.shape = shape;
        this.privateEndpointOutboundConnection = privateEndpointOutboundConnection;
        this.isDisasterRecoveryEnabled = isDisasterRecoveryEnabled;
        this.disasterRecoveryDetails = disasterRecoveryDetails;
        this.dataRetentionPeriod = dataRetentionPeriod;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that is immutable on creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Integration Instance Identifier, can be renamed. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Integration Instance Identifier, can be renamed.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Compartment Identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier.
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
         * Standard or Enterprise type, Oracle Integration Generation 2 uses ENTERPRISE and
         * STANDARD, Oracle Integration 3 uses ENTERPRISEX and STANDARDX
         */
        @com.fasterxml.jackson.annotation.JsonProperty("integrationInstanceType")
        private IntegrationInstanceType integrationInstanceType;

        /**
         * Standard or Enterprise type, Oracle Integration Generation 2 uses ENTERPRISE and
         * STANDARD, Oracle Integration 3 uses ENTERPRISEX and STANDARDX
         *
         * @param integrationInstanceType the value to set
         * @return this builder
         */
        public Builder integrationInstanceType(IntegrationInstanceType integrationInstanceType) {
            this.integrationInstanceType = integrationInstanceType;
            this.__explicitlySet__.add("integrationInstanceType");
            return this;
        }
        /**
         * The time the the IntegrationInstance was created. An RFC3339 formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the IntegrationInstance was created. An RFC3339 formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the IntegrationInstance was updated. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the IntegrationInstance was updated. An RFC3339 formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the integration instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the integration instance.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Additional details of lifecycleState or substates */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional details of lifecycleState or substates
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
         * An message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
        private String stateMessage;

        /**
         * An message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param stateMessage the value to set
         * @return this builder
         */
        public Builder stateMessage(String stateMessage) {
            this.stateMessage = stateMessage;
            this.__explicitlySet__.add("stateMessage");
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
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example:
         * {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example:
         * {@code {"foo-namespace": {"bar-key": "value"}}}
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
        /** Bring your own license. */
        @com.fasterxml.jackson.annotation.JsonProperty("isByol")
        private Boolean isByol;

        /**
         * Bring your own license.
         *
         * @param isByol the value to set
         * @return this builder
         */
        public Builder isByol(Boolean isByol) {
            this.isByol = isByol;
            this.__explicitlySet__.add("isByol");
            return this;
        }
        /** The Integration Instance URL. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceUrl")
        private String instanceUrl;

        /**
         * The Integration Instance URL.
         *
         * @param instanceUrl the value to set
         * @return this builder
         */
        public Builder instanceUrl(String instanceUrl) {
            this.instanceUrl = instanceUrl;
            this.__explicitlySet__.add("instanceUrl");
            return this;
        }
        /** The Integration Instance Design Time URL */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceDesignTimeUrl")
        private String instanceDesignTimeUrl;

        /**
         * The Integration Instance Design Time URL
         *
         * @param instanceDesignTimeUrl the value to set
         * @return this builder
         */
        public Builder instanceDesignTimeUrl(String instanceDesignTimeUrl) {
            this.instanceDesignTimeUrl = instanceDesignTimeUrl;
            this.__explicitlySet__.add("instanceDesignTimeUrl");
            return this;
        }
        /** The number of configured message packs (if any) */
        @com.fasterxml.jackson.annotation.JsonProperty("messagePacks")
        private Integer messagePacks;

        /**
         * The number of configured message packs (if any)
         *
         * @param messagePacks the value to set
         * @return this builder
         */
        public Builder messagePacks(Integer messagePacks) {
            this.messagePacks = messagePacks;
            this.__explicitlySet__.add("messagePacks");
            return this;
        }
        /** The file server is enabled or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isFileServerEnabled")
        private Boolean isFileServerEnabled;

        /**
         * The file server is enabled or not.
         *
         * @param isFileServerEnabled the value to set
         * @return this builder
         */
        public Builder isFileServerEnabled(Boolean isFileServerEnabled) {
            this.isFileServerEnabled = isFileServerEnabled;
            this.__explicitlySet__.add("isFileServerEnabled");
            return this;
        }
        /** VisualBuilder is enabled or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isVisualBuilderEnabled")
        private Boolean isVisualBuilderEnabled;

        /**
         * VisualBuilder is enabled or not.
         *
         * @param isVisualBuilderEnabled the value to set
         * @return this builder
         */
        public Builder isVisualBuilderEnabled(Boolean isVisualBuilderEnabled) {
            this.isVisualBuilderEnabled = isVisualBuilderEnabled;
            this.__explicitlySet__.add("isVisualBuilderEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customEndpoint")
        private CustomEndpointDetails customEndpoint;

        public Builder customEndpoint(CustomEndpointDetails customEndpoint) {
            this.customEndpoint = customEndpoint;
            this.__explicitlySet__.add("customEndpoint");
            return this;
        }
        /** A list of alternate custom endpoints used for the integration instance URL. */
        @com.fasterxml.jackson.annotation.JsonProperty("alternateCustomEndpoints")
        private java.util.List<CustomEndpointDetails> alternateCustomEndpoints;

        /**
         * A list of alternate custom endpoints used for the integration instance URL.
         *
         * @param alternateCustomEndpoints the value to set
         * @return this builder
         */
        public Builder alternateCustomEndpoints(
                java.util.List<CustomEndpointDetails> alternateCustomEndpoints) {
            this.alternateCustomEndpoints = alternateCustomEndpoints;
            this.__explicitlySet__.add("alternateCustomEndpoints");
            return this;
        }
        /** The entitlement used for billing purposes. */
        @com.fasterxml.jackson.annotation.JsonProperty("consumptionModel")
        private ConsumptionModel consumptionModel;

        /**
         * The entitlement used for billing purposes.
         *
         * @param consumptionModel the value to set
         * @return this builder
         */
        public Builder consumptionModel(ConsumptionModel consumptionModel) {
            this.consumptionModel = consumptionModel;
            this.__explicitlySet__.add("consumptionModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkEndpointDetails")
        private NetworkEndpointDetails networkEndpointDetails;

        public Builder networkEndpointDetails(NetworkEndpointDetails networkEndpointDetails) {
            this.networkEndpointDetails = networkEndpointDetails;
            this.__explicitlySet__.add("networkEndpointDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("idcsInfo")
        private IdcsInfoDetails idcsInfo;

        public Builder idcsInfo(IdcsInfoDetails idcsInfo) {
            this.idcsInfo = idcsInfo;
            this.__explicitlySet__.add("idcsInfo");
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
        /** Shape */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private Shape shape;

        /**
         * Shape
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(Shape shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointOutboundConnection")
        private OutboundConnection privateEndpointOutboundConnection;

        public Builder privateEndpointOutboundConnection(
                OutboundConnection privateEndpointOutboundConnection) {
            this.privateEndpointOutboundConnection = privateEndpointOutboundConnection;
            this.__explicitlySet__.add("privateEndpointOutboundConnection");
            return this;
        }
        /** Is Disaster Recovery enabled for the integrationInstance */
        @com.fasterxml.jackson.annotation.JsonProperty("isDisasterRecoveryEnabled")
        private Boolean isDisasterRecoveryEnabled;

        /**
         * Is Disaster Recovery enabled for the integrationInstance
         *
         * @param isDisasterRecoveryEnabled the value to set
         * @return this builder
         */
        public Builder isDisasterRecoveryEnabled(Boolean isDisasterRecoveryEnabled) {
            this.isDisasterRecoveryEnabled = isDisasterRecoveryEnabled;
            this.__explicitlySet__.add("isDisasterRecoveryEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("disasterRecoveryDetails")
        private DisasterRecoveryDetails disasterRecoveryDetails;

        public Builder disasterRecoveryDetails(DisasterRecoveryDetails disasterRecoveryDetails) {
            this.disasterRecoveryDetails = disasterRecoveryDetails;
            this.__explicitlySet__.add("disasterRecoveryDetails");
            return this;
        }
        /** Data retention period set for given integration instance */
        @com.fasterxml.jackson.annotation.JsonProperty("dataRetentionPeriod")
        private DataRetentionPeriod dataRetentionPeriod;

        /**
         * Data retention period set for given integration instance
         *
         * @param dataRetentionPeriod the value to set
         * @return this builder
         */
        public Builder dataRetentionPeriod(DataRetentionPeriod dataRetentionPeriod) {
            this.dataRetentionPeriod = dataRetentionPeriod;
            this.__explicitlySet__.add("dataRetentionPeriod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IntegrationInstance build() {
            IntegrationInstance model =
                    new IntegrationInstance(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.integrationInstanceType,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.stateMessage,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.isByol,
                            this.instanceUrl,
                            this.instanceDesignTimeUrl,
                            this.messagePacks,
                            this.isFileServerEnabled,
                            this.isVisualBuilderEnabled,
                            this.customEndpoint,
                            this.alternateCustomEndpoints,
                            this.consumptionModel,
                            this.networkEndpointDetails,
                            this.idcsInfo,
                            this.attachments,
                            this.shape,
                            this.privateEndpointOutboundConnection,
                            this.isDisasterRecoveryEnabled,
                            this.disasterRecoveryDetails,
                            this.dataRetentionPeriod);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IntegrationInstance model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("integrationInstanceType")) {
                this.integrationInstanceType(model.getIntegrationInstanceType());
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
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("stateMessage")) {
                this.stateMessage(model.getStateMessage());
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
            if (model.wasPropertyExplicitlySet("isByol")) {
                this.isByol(model.getIsByol());
            }
            if (model.wasPropertyExplicitlySet("instanceUrl")) {
                this.instanceUrl(model.getInstanceUrl());
            }
            if (model.wasPropertyExplicitlySet("instanceDesignTimeUrl")) {
                this.instanceDesignTimeUrl(model.getInstanceDesignTimeUrl());
            }
            if (model.wasPropertyExplicitlySet("messagePacks")) {
                this.messagePacks(model.getMessagePacks());
            }
            if (model.wasPropertyExplicitlySet("isFileServerEnabled")) {
                this.isFileServerEnabled(model.getIsFileServerEnabled());
            }
            if (model.wasPropertyExplicitlySet("isVisualBuilderEnabled")) {
                this.isVisualBuilderEnabled(model.getIsVisualBuilderEnabled());
            }
            if (model.wasPropertyExplicitlySet("customEndpoint")) {
                this.customEndpoint(model.getCustomEndpoint());
            }
            if (model.wasPropertyExplicitlySet("alternateCustomEndpoints")) {
                this.alternateCustomEndpoints(model.getAlternateCustomEndpoints());
            }
            if (model.wasPropertyExplicitlySet("consumptionModel")) {
                this.consumptionModel(model.getConsumptionModel());
            }
            if (model.wasPropertyExplicitlySet("networkEndpointDetails")) {
                this.networkEndpointDetails(model.getNetworkEndpointDetails());
            }
            if (model.wasPropertyExplicitlySet("idcsInfo")) {
                this.idcsInfo(model.getIdcsInfo());
            }
            if (model.wasPropertyExplicitlySet("attachments")) {
                this.attachments(model.getAttachments());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointOutboundConnection")) {
                this.privateEndpointOutboundConnection(
                        model.getPrivateEndpointOutboundConnection());
            }
            if (model.wasPropertyExplicitlySet("isDisasterRecoveryEnabled")) {
                this.isDisasterRecoveryEnabled(model.getIsDisasterRecoveryEnabled());
            }
            if (model.wasPropertyExplicitlySet("disasterRecoveryDetails")) {
                this.disasterRecoveryDetails(model.getDisasterRecoveryDetails());
            }
            if (model.wasPropertyExplicitlySet("dataRetentionPeriod")) {
                this.dataRetentionPeriod(model.getDataRetentionPeriod());
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

    /** Unique identifier that is immutable on creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Integration Instance Identifier, can be renamed. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Integration Instance Identifier, can be renamed.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Compartment Identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Standard or Enterprise type, Oracle Integration Generation 2 uses ENTERPRISE and STANDARD,
     * Oracle Integration 3 uses ENTERPRISEX and STANDARDX
     */
    public enum IntegrationInstanceType implements com.oracle.bmc.http.internal.BmcEnum {
        Standard("STANDARD"),
        Enterprise("ENTERPRISE"),
        Standardx("STANDARDX"),
        Enterprisex("ENTERPRISEX"),
        Healthcare("HEALTHCARE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IntegrationInstanceType.class);

        private final String value;
        private static java.util.Map<String, IntegrationInstanceType> map;

        static {
            map = new java.util.HashMap<>();
            for (IntegrationInstanceType v : IntegrationInstanceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IntegrationInstanceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IntegrationInstanceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IntegrationInstanceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Standard or Enterprise type, Oracle Integration Generation 2 uses ENTERPRISE and STANDARD,
     * Oracle Integration 3 uses ENTERPRISEX and STANDARDX
     */
    @com.fasterxml.jackson.annotation.JsonProperty("integrationInstanceType")
    private final IntegrationInstanceType integrationInstanceType;

    /**
     * Standard or Enterprise type, Oracle Integration Generation 2 uses ENTERPRISE and STANDARD,
     * Oracle Integration 3 uses ENTERPRISEX and STANDARDX
     *
     * @return the value
     */
    public IntegrationInstanceType getIntegrationInstanceType() {
        return integrationInstanceType;
    }

    /** The time the the IntegrationInstance was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the IntegrationInstance was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the IntegrationInstance was updated. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the IntegrationInstance was updated. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the integration instance. */
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
    /** The current state of the integration instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the integration instance.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Additional details of lifecycleState or substates */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional details of lifecycleState or substates
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * An message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
    private final String stateMessage;

    /**
     * An message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getStateMessage() {
        return stateMessage;
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
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"foo-namespace": {"bar-key": "value"}}}
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

    /** Bring your own license. */
    @com.fasterxml.jackson.annotation.JsonProperty("isByol")
    private final Boolean isByol;

    /**
     * Bring your own license.
     *
     * @return the value
     */
    public Boolean getIsByol() {
        return isByol;
    }

    /** The Integration Instance URL. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceUrl")
    private final String instanceUrl;

    /**
     * The Integration Instance URL.
     *
     * @return the value
     */
    public String getInstanceUrl() {
        return instanceUrl;
    }

    /** The Integration Instance Design Time URL */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceDesignTimeUrl")
    private final String instanceDesignTimeUrl;

    /**
     * The Integration Instance Design Time URL
     *
     * @return the value
     */
    public String getInstanceDesignTimeUrl() {
        return instanceDesignTimeUrl;
    }

    /** The number of configured message packs (if any) */
    @com.fasterxml.jackson.annotation.JsonProperty("messagePacks")
    private final Integer messagePacks;

    /**
     * The number of configured message packs (if any)
     *
     * @return the value
     */
    public Integer getMessagePacks() {
        return messagePacks;
    }

    /** The file server is enabled or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isFileServerEnabled")
    private final Boolean isFileServerEnabled;

    /**
     * The file server is enabled or not.
     *
     * @return the value
     */
    public Boolean getIsFileServerEnabled() {
        return isFileServerEnabled;
    }

    /** VisualBuilder is enabled or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isVisualBuilderEnabled")
    private final Boolean isVisualBuilderEnabled;

    /**
     * VisualBuilder is enabled or not.
     *
     * @return the value
     */
    public Boolean getIsVisualBuilderEnabled() {
        return isVisualBuilderEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customEndpoint")
    private final CustomEndpointDetails customEndpoint;

    public CustomEndpointDetails getCustomEndpoint() {
        return customEndpoint;
    }

    /** A list of alternate custom endpoints used for the integration instance URL. */
    @com.fasterxml.jackson.annotation.JsonProperty("alternateCustomEndpoints")
    private final java.util.List<CustomEndpointDetails> alternateCustomEndpoints;

    /**
     * A list of alternate custom endpoints used for the integration instance URL.
     *
     * @return the value
     */
    public java.util.List<CustomEndpointDetails> getAlternateCustomEndpoints() {
        return alternateCustomEndpoints;
    }

    /** The entitlement used for billing purposes. */
    public enum ConsumptionModel implements com.oracle.bmc.http.internal.BmcEnum {
        Ucm("UCM"),
        Gov("GOV"),
        Oic4Saas("OIC4SAAS"),

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
    /** The entitlement used for billing purposes. */
    @com.fasterxml.jackson.annotation.JsonProperty("consumptionModel")
    private final ConsumptionModel consumptionModel;

    /**
     * The entitlement used for billing purposes.
     *
     * @return the value
     */
    public ConsumptionModel getConsumptionModel() {
        return consumptionModel;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkEndpointDetails")
    private final NetworkEndpointDetails networkEndpointDetails;

    public NetworkEndpointDetails getNetworkEndpointDetails() {
        return networkEndpointDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("idcsInfo")
    private final IdcsInfoDetails idcsInfo;

    public IdcsInfoDetails getIdcsInfo() {
        return idcsInfo;
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

    /** Shape */
    public enum Shape implements com.oracle.bmc.http.internal.BmcEnum {
        Development("DEVELOPMENT"),
        Production("PRODUCTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Shape.class);

        private final String value;
        private static java.util.Map<String, Shape> map;

        static {
            map = new java.util.HashMap<>();
            for (Shape v : Shape.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Shape(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Shape create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Shape', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Shape */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final Shape shape;

    /**
     * Shape
     *
     * @return the value
     */
    public Shape getShape() {
        return shape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointOutboundConnection")
    private final OutboundConnection privateEndpointOutboundConnection;

    public OutboundConnection getPrivateEndpointOutboundConnection() {
        return privateEndpointOutboundConnection;
    }

    /** Is Disaster Recovery enabled for the integrationInstance */
    @com.fasterxml.jackson.annotation.JsonProperty("isDisasterRecoveryEnabled")
    private final Boolean isDisasterRecoveryEnabled;

    /**
     * Is Disaster Recovery enabled for the integrationInstance
     *
     * @return the value
     */
    public Boolean getIsDisasterRecoveryEnabled() {
        return isDisasterRecoveryEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("disasterRecoveryDetails")
    private final DisasterRecoveryDetails disasterRecoveryDetails;

    public DisasterRecoveryDetails getDisasterRecoveryDetails() {
        return disasterRecoveryDetails;
    }

    /** Data retention period set for given integration instance */
    public enum DataRetentionPeriod implements com.oracle.bmc.http.internal.BmcEnum {
        Months1("MONTHS_1"),
        Months3("MONTHS_3"),
        Months6("MONTHS_6"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DataRetentionPeriod.class);

        private final String value;
        private static java.util.Map<String, DataRetentionPeriod> map;

        static {
            map = new java.util.HashMap<>();
            for (DataRetentionPeriod v : DataRetentionPeriod.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DataRetentionPeriod(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DataRetentionPeriod create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DataRetentionPeriod', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Data retention period set for given integration instance */
    @com.fasterxml.jackson.annotation.JsonProperty("dataRetentionPeriod")
    private final DataRetentionPeriod dataRetentionPeriod;

    /**
     * Data retention period set for given integration instance
     *
     * @return the value
     */
    public DataRetentionPeriod getDataRetentionPeriod() {
        return dataRetentionPeriod;
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
        sb.append("IntegrationInstance(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", integrationInstanceType=")
                .append(String.valueOf(this.integrationInstanceType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", stateMessage=").append(String.valueOf(this.stateMessage));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", isByol=").append(String.valueOf(this.isByol));
        sb.append(", instanceUrl=").append(String.valueOf(this.instanceUrl));
        sb.append(", instanceDesignTimeUrl=").append(String.valueOf(this.instanceDesignTimeUrl));
        sb.append(", messagePacks=").append(String.valueOf(this.messagePacks));
        sb.append(", isFileServerEnabled=").append(String.valueOf(this.isFileServerEnabled));
        sb.append(", isVisualBuilderEnabled=").append(String.valueOf(this.isVisualBuilderEnabled));
        sb.append(", customEndpoint=").append(String.valueOf(this.customEndpoint));
        sb.append(", alternateCustomEndpoints=")
                .append(String.valueOf(this.alternateCustomEndpoints));
        sb.append(", consumptionModel=").append(String.valueOf(this.consumptionModel));
        sb.append(", networkEndpointDetails=").append(String.valueOf(this.networkEndpointDetails));
        sb.append(", idcsInfo=").append(String.valueOf(this.idcsInfo));
        sb.append(", attachments=").append(String.valueOf(this.attachments));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", privateEndpointOutboundConnection=")
                .append(String.valueOf(this.privateEndpointOutboundConnection));
        sb.append(", isDisasterRecoveryEnabled=")
                .append(String.valueOf(this.isDisasterRecoveryEnabled));
        sb.append(", disasterRecoveryDetails=")
                .append(String.valueOf(this.disasterRecoveryDetails));
        sb.append(", dataRetentionPeriod=").append(String.valueOf(this.dataRetentionPeriod));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IntegrationInstance)) {
            return false;
        }

        IntegrationInstance other = (IntegrationInstance) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.integrationInstanceType, other.integrationInstanceType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.stateMessage, other.stateMessage)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.isByol, other.isByol)
                && java.util.Objects.equals(this.instanceUrl, other.instanceUrl)
                && java.util.Objects.equals(this.instanceDesignTimeUrl, other.instanceDesignTimeUrl)
                && java.util.Objects.equals(this.messagePacks, other.messagePacks)
                && java.util.Objects.equals(this.isFileServerEnabled, other.isFileServerEnabled)
                && java.util.Objects.equals(
                        this.isVisualBuilderEnabled, other.isVisualBuilderEnabled)
                && java.util.Objects.equals(this.customEndpoint, other.customEndpoint)
                && java.util.Objects.equals(
                        this.alternateCustomEndpoints, other.alternateCustomEndpoints)
                && java.util.Objects.equals(this.consumptionModel, other.consumptionModel)
                && java.util.Objects.equals(
                        this.networkEndpointDetails, other.networkEndpointDetails)
                && java.util.Objects.equals(this.idcsInfo, other.idcsInfo)
                && java.util.Objects.equals(this.attachments, other.attachments)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(
                        this.privateEndpointOutboundConnection,
                        other.privateEndpointOutboundConnection)
                && java.util.Objects.equals(
                        this.isDisasterRecoveryEnabled, other.isDisasterRecoveryEnabled)
                && java.util.Objects.equals(
                        this.disasterRecoveryDetails, other.disasterRecoveryDetails)
                && java.util.Objects.equals(this.dataRetentionPeriod, other.dataRetentionPeriod)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.integrationInstanceType == null
                                ? 43
                                : this.integrationInstanceType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.stateMessage == null ? 43 : this.stateMessage.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.isByol == null ? 43 : this.isByol.hashCode());
        result = (result * PRIME) + (this.instanceUrl == null ? 43 : this.instanceUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceDesignTimeUrl == null
                                ? 43
                                : this.instanceDesignTimeUrl.hashCode());
        result = (result * PRIME) + (this.messagePacks == null ? 43 : this.messagePacks.hashCode());
        result =
                (result * PRIME)
                        + (this.isFileServerEnabled == null
                                ? 43
                                : this.isFileServerEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isVisualBuilderEnabled == null
                                ? 43
                                : this.isVisualBuilderEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.customEndpoint == null ? 43 : this.customEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.alternateCustomEndpoints == null
                                ? 43
                                : this.alternateCustomEndpoints.hashCode());
        result =
                (result * PRIME)
                        + (this.consumptionModel == null ? 43 : this.consumptionModel.hashCode());
        result =
                (result * PRIME)
                        + (this.networkEndpointDetails == null
                                ? 43
                                : this.networkEndpointDetails.hashCode());
        result = (result * PRIME) + (this.idcsInfo == null ? 43 : this.idcsInfo.hashCode());
        result = (result * PRIME) + (this.attachments == null ? 43 : this.attachments.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointOutboundConnection == null
                                ? 43
                                : this.privateEndpointOutboundConnection.hashCode());
        result =
                (result * PRIME)
                        + (this.isDisasterRecoveryEnabled == null
                                ? 43
                                : this.isDisasterRecoveryEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.disasterRecoveryDetails == null
                                ? 43
                                : this.disasterRecoveryDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.dataRetentionPeriod == null
                                ? 43
                                : this.dataRetentionPeriod.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.model;

/**
 * The information about new IntegrationInstance.
 * Some properties may not be applicable to specific integration types,
 * see [Differences in Instance Management](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/application-integration&id=INTOO-GUID-931B5E33-4FE6-4997-93E5-8748516F46AA__GUID-176E43D5-4116-4828-8120-B929DF2A6B5E)
 * for details.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateIntegrationInstanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateIntegrationInstanceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "integrationInstanceType",
        "freeformTags",
        "definedTags",
        "isByol",
        "idcsAt",
        "messagePacks",
        "isVisualBuilderEnabled",
        "customEndpoint",
        "alternateCustomEndpoints",
        "consumptionModel",
        "isFileServerEnabled",
        "isDisasterRecoveryEnabled",
        "networkEndpointDetails",
        "shape",
        "domainId"
    })
    public CreateIntegrationInstanceDetails(
            String displayName,
            String compartmentId,
            IntegrationInstanceType integrationInstanceType,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Boolean isByol,
            String idcsAt,
            Integer messagePacks,
            Boolean isVisualBuilderEnabled,
            CreateCustomEndpointDetails customEndpoint,
            java.util.List<CreateCustomEndpointDetails> alternateCustomEndpoints,
            ConsumptionModel consumptionModel,
            Boolean isFileServerEnabled,
            Boolean isDisasterRecoveryEnabled,
            NetworkEndpointDetails networkEndpointDetails,
            Shape shape,
            String domainId) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.integrationInstanceType = integrationInstanceType;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.isByol = isByol;
        this.idcsAt = idcsAt;
        this.messagePacks = messagePacks;
        this.isVisualBuilderEnabled = isVisualBuilderEnabled;
        this.customEndpoint = customEndpoint;
        this.alternateCustomEndpoints = alternateCustomEndpoints;
        this.consumptionModel = consumptionModel;
        this.isFileServerEnabled = isFileServerEnabled;
        this.isDisasterRecoveryEnabled = isDisasterRecoveryEnabled;
        this.networkEndpointDetails = networkEndpointDetails;
        this.shape = shape;
        this.domainId = domainId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Integration Instance Identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Integration Instance Identifier.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Compartment Identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Standard or Enterprise type,
         * Oracle Integration Generation 2 uses ENTERPRISE and STANDARD,
         * Oracle Integration 3 uses ENTERPRISEX and STANDARDX
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("integrationInstanceType")
        private IntegrationInstanceType integrationInstanceType;

        /**
         * Standard or Enterprise type,
         * Oracle Integration Generation 2 uses ENTERPRISE and STANDARD,
         * Oracle Integration 3 uses ENTERPRISEX and STANDARDX
         *
         * @param integrationInstanceType the value to set
         * @return this builder
         **/
        public Builder integrationInstanceType(IntegrationInstanceType integrationInstanceType) {
            this.integrationInstanceType = integrationInstanceType;
            this.__explicitlySet__.add("integrationInstanceType");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name,
         * type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name,
         * type or scope. Exists for cross-compatibility only.
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
         * Usage of predefined tag keys. These predefined keys are scoped to
         * namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to
         * namespaces.
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
        /**
         * Bring your own license.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isByol")
        private Boolean isByol;

        /**
         * Bring your own license.
         * @param isByol the value to set
         * @return this builder
         **/
        public Builder isByol(Boolean isByol) {
            this.isByol = isByol;
            this.__explicitlySet__.add("isByol");
            return this;
        }
        /**
         * IDCS Authentication token. This is required for all realms with IDCS. Its optional as its not required for non IDCS realms.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAt")
        private String idcsAt;

        /**
         * IDCS Authentication token. This is required for all realms with IDCS. Its optional as its not required for non IDCS realms.
         * @param idcsAt the value to set
         * @return this builder
         **/
        public Builder idcsAt(String idcsAt) {
            this.idcsAt = idcsAt;
            this.__explicitlySet__.add("idcsAt");
            return this;
        }
        /**
         * The number of configured message packs
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("messagePacks")
        private Integer messagePacks;

        /**
         * The number of configured message packs
         * @param messagePacks the value to set
         * @return this builder
         **/
        public Builder messagePacks(Integer messagePacks) {
            this.messagePacks = messagePacks;
            this.__explicitlySet__.add("messagePacks");
            return this;
        }
        /**
         * Visual Builder is enabled or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isVisualBuilderEnabled")
        private Boolean isVisualBuilderEnabled;

        /**
         * Visual Builder is enabled or not.
         * @param isVisualBuilderEnabled the value to set
         * @return this builder
         **/
        public Builder isVisualBuilderEnabled(Boolean isVisualBuilderEnabled) {
            this.isVisualBuilderEnabled = isVisualBuilderEnabled;
            this.__explicitlySet__.add("isVisualBuilderEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customEndpoint")
        private CreateCustomEndpointDetails customEndpoint;

        public Builder customEndpoint(CreateCustomEndpointDetails customEndpoint) {
            this.customEndpoint = customEndpoint;
            this.__explicitlySet__.add("customEndpoint");
            return this;
        }
        /**
         * A list of alternate custom endpoints to be used for the integration instance URL
         * (contact Oracle for alternateCustomEndpoints availability for a specific instance).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alternateCustomEndpoints")
        private java.util.List<CreateCustomEndpointDetails> alternateCustomEndpoints;

        /**
         * A list of alternate custom endpoints to be used for the integration instance URL
         * (contact Oracle for alternateCustomEndpoints availability for a specific instance).
         *
         * @param alternateCustomEndpoints the value to set
         * @return this builder
         **/
        public Builder alternateCustomEndpoints(
                java.util.List<CreateCustomEndpointDetails> alternateCustomEndpoints) {
            this.alternateCustomEndpoints = alternateCustomEndpoints;
            this.__explicitlySet__.add("alternateCustomEndpoints");
            return this;
        }
        /**
         * Optional parameter specifying which entitlement to use for billing purposes. Only required if the account possesses more than one entitlement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("consumptionModel")
        private ConsumptionModel consumptionModel;

        /**
         * Optional parameter specifying which entitlement to use for billing purposes. Only required if the account possesses more than one entitlement.
         * @param consumptionModel the value to set
         * @return this builder
         **/
        public Builder consumptionModel(ConsumptionModel consumptionModel) {
            this.consumptionModel = consumptionModel;
            this.__explicitlySet__.add("consumptionModel");
            return this;
        }
        /**
         * The file server is enabled or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFileServerEnabled")
        private Boolean isFileServerEnabled;

        /**
         * The file server is enabled or not.
         * @param isFileServerEnabled the value to set
         * @return this builder
         **/
        public Builder isFileServerEnabled(Boolean isFileServerEnabled) {
            this.isFileServerEnabled = isFileServerEnabled;
            this.__explicitlySet__.add("isFileServerEnabled");
            return this;
        }
        /**
         * Is Disaster Recovery enabled or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDisasterRecoveryEnabled")
        private Boolean isDisasterRecoveryEnabled;

        /**
         * Is Disaster Recovery enabled or not.
         * @param isDisasterRecoveryEnabled the value to set
         * @return this builder
         **/
        public Builder isDisasterRecoveryEnabled(Boolean isDisasterRecoveryEnabled) {
            this.isDisasterRecoveryEnabled = isDisasterRecoveryEnabled;
            this.__explicitlySet__.add("isDisasterRecoveryEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkEndpointDetails")
        private NetworkEndpointDetails networkEndpointDetails;

        public Builder networkEndpointDetails(NetworkEndpointDetails networkEndpointDetails) {
            this.networkEndpointDetails = networkEndpointDetails;
            this.__explicitlySet__.add("networkEndpointDetails");
            return this;
        }
        /**
         * Shape
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private Shape shape;

        /**
         * Shape
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(Shape shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * The OCID of the identity domain, that will be used to determine the
         * corresponding Idcs Stripe and create an Idcs application within the stripe.
         * This parameter is mutually exclusive with parameter: idcsAt, i.e only one of
         * two parameters should be specified.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domainId")
        private String domainId;

        /**
         * The OCID of the identity domain, that will be used to determine the
         * corresponding Idcs Stripe and create an Idcs application within the stripe.
         * This parameter is mutually exclusive with parameter: idcsAt, i.e only one of
         * two parameters should be specified.
         *
         * @param domainId the value to set
         * @return this builder
         **/
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            this.__explicitlySet__.add("domainId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateIntegrationInstanceDetails build() {
            CreateIntegrationInstanceDetails model =
                    new CreateIntegrationInstanceDetails(
                            this.displayName,
                            this.compartmentId,
                            this.integrationInstanceType,
                            this.freeformTags,
                            this.definedTags,
                            this.isByol,
                            this.idcsAt,
                            this.messagePacks,
                            this.isVisualBuilderEnabled,
                            this.customEndpoint,
                            this.alternateCustomEndpoints,
                            this.consumptionModel,
                            this.isFileServerEnabled,
                            this.isDisasterRecoveryEnabled,
                            this.networkEndpointDetails,
                            this.shape,
                            this.domainId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateIntegrationInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("integrationInstanceType")) {
                this.integrationInstanceType(model.getIntegrationInstanceType());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("isByol")) {
                this.isByol(model.getIsByol());
            }
            if (model.wasPropertyExplicitlySet("idcsAt")) {
                this.idcsAt(model.getIdcsAt());
            }
            if (model.wasPropertyExplicitlySet("messagePacks")) {
                this.messagePacks(model.getMessagePacks());
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
            if (model.wasPropertyExplicitlySet("isFileServerEnabled")) {
                this.isFileServerEnabled(model.getIsFileServerEnabled());
            }
            if (model.wasPropertyExplicitlySet("isDisasterRecoveryEnabled")) {
                this.isDisasterRecoveryEnabled(model.getIsDisasterRecoveryEnabled());
            }
            if (model.wasPropertyExplicitlySet("networkEndpointDetails")) {
                this.networkEndpointDetails(model.getNetworkEndpointDetails());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("domainId")) {
                this.domainId(model.getDomainId());
            }
            return this;
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
     * Integration Instance Identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Integration Instance Identifier.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Compartment Identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Standard or Enterprise type,
     * Oracle Integration Generation 2 uses ENTERPRISE and STANDARD,
     * Oracle Integration 3 uses ENTERPRISEX and STANDARDX
     *
     **/
    public enum IntegrationInstanceType {
        Standard("STANDARD"),
        Enterprise("ENTERPRISE"),
        Standardx("STANDARDX"),
        Enterprisex("ENTERPRISEX"),
        Healthcare("HEALTHCARE"),
        ;

        private final String value;
        private static java.util.Map<String, IntegrationInstanceType> map;

        static {
            map = new java.util.HashMap<>();
            for (IntegrationInstanceType v : IntegrationInstanceType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid IntegrationInstanceType: " + key);
        }
    };
    /**
     * Standard or Enterprise type,
     * Oracle Integration Generation 2 uses ENTERPRISE and STANDARD,
     * Oracle Integration 3 uses ENTERPRISEX and STANDARDX
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("integrationInstanceType")
    private final IntegrationInstanceType integrationInstanceType;

    /**
     * Standard or Enterprise type,
     * Oracle Integration Generation 2 uses ENTERPRISE and STANDARD,
     * Oracle Integration 3 uses ENTERPRISEX and STANDARDX
     *
     * @return the value
     **/
    public IntegrationInstanceType getIntegrationInstanceType() {
        return integrationInstanceType;
    }

    /**
     * Simple key-value pair that is applied without any predefined name,
     * type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name,
     * type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to
     * namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to
     * namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Bring your own license.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isByol")
    private final Boolean isByol;

    /**
     * Bring your own license.
     * @return the value
     **/
    public Boolean getIsByol() {
        return isByol;
    }

    /**
     * IDCS Authentication token. This is required for all realms with IDCS. Its optional as its not required for non IDCS realms.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAt")
    private final String idcsAt;

    /**
     * IDCS Authentication token. This is required for all realms with IDCS. Its optional as its not required for non IDCS realms.
     * @return the value
     **/
    public String getIdcsAt() {
        return idcsAt;
    }

    /**
     * The number of configured message packs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("messagePacks")
    private final Integer messagePacks;

    /**
     * The number of configured message packs
     * @return the value
     **/
    public Integer getMessagePacks() {
        return messagePacks;
    }

    /**
     * Visual Builder is enabled or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isVisualBuilderEnabled")
    private final Boolean isVisualBuilderEnabled;

    /**
     * Visual Builder is enabled or not.
     * @return the value
     **/
    public Boolean getIsVisualBuilderEnabled() {
        return isVisualBuilderEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customEndpoint")
    private final CreateCustomEndpointDetails customEndpoint;

    public CreateCustomEndpointDetails getCustomEndpoint() {
        return customEndpoint;
    }

    /**
     * A list of alternate custom endpoints to be used for the integration instance URL
     * (contact Oracle for alternateCustomEndpoints availability for a specific instance).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alternateCustomEndpoints")
    private final java.util.List<CreateCustomEndpointDetails> alternateCustomEndpoints;

    /**
     * A list of alternate custom endpoints to be used for the integration instance URL
     * (contact Oracle for alternateCustomEndpoints availability for a specific instance).
     *
     * @return the value
     **/
    public java.util.List<CreateCustomEndpointDetails> getAlternateCustomEndpoints() {
        return alternateCustomEndpoints;
    }

    /**
     * Optional parameter specifying which entitlement to use for billing purposes. Only required if the account possesses more than one entitlement.
     **/
    public enum ConsumptionModel {
        Ucm("UCM"),
        Gov("GOV"),
        Oic4Saas("OIC4SAAS"),
        ;

        private final String value;
        private static java.util.Map<String, ConsumptionModel> map;

        static {
            map = new java.util.HashMap<>();
            for (ConsumptionModel v : ConsumptionModel.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ConsumptionModel: " + key);
        }
    };
    /**
     * Optional parameter specifying which entitlement to use for billing purposes. Only required if the account possesses more than one entitlement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("consumptionModel")
    private final ConsumptionModel consumptionModel;

    /**
     * Optional parameter specifying which entitlement to use for billing purposes. Only required if the account possesses more than one entitlement.
     * @return the value
     **/
    public ConsumptionModel getConsumptionModel() {
        return consumptionModel;
    }

    /**
     * The file server is enabled or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFileServerEnabled")
    private final Boolean isFileServerEnabled;

    /**
     * The file server is enabled or not.
     * @return the value
     **/
    public Boolean getIsFileServerEnabled() {
        return isFileServerEnabled;
    }

    /**
     * Is Disaster Recovery enabled or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDisasterRecoveryEnabled")
    private final Boolean isDisasterRecoveryEnabled;

    /**
     * Is Disaster Recovery enabled or not.
     * @return the value
     **/
    public Boolean getIsDisasterRecoveryEnabled() {
        return isDisasterRecoveryEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkEndpointDetails")
    private final NetworkEndpointDetails networkEndpointDetails;

    public NetworkEndpointDetails getNetworkEndpointDetails() {
        return networkEndpointDetails;
    }

    /**
     * Shape
     **/
    public enum Shape {
        Development("DEVELOPMENT"),
        Production("PRODUCTION"),
        ;

        private final String value;
        private static java.util.Map<String, Shape> map;

        static {
            map = new java.util.HashMap<>();
            for (Shape v : Shape.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Shape: " + key);
        }
    };
    /**
     * Shape
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final Shape shape;

    /**
     * Shape
     * @return the value
     **/
    public Shape getShape() {
        return shape;
    }

    /**
     * The OCID of the identity domain, that will be used to determine the
     * corresponding Idcs Stripe and create an Idcs application within the stripe.
     * This parameter is mutually exclusive with parameter: idcsAt, i.e only one of
     * two parameters should be specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainId")
    private final String domainId;

    /**
     * The OCID of the identity domain, that will be used to determine the
     * corresponding Idcs Stripe and create an Idcs application within the stripe.
     * This parameter is mutually exclusive with parameter: idcsAt, i.e only one of
     * two parameters should be specified.
     *
     * @return the value
     **/
    public String getDomainId() {
        return domainId;
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
        sb.append("CreateIntegrationInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", integrationInstanceType=")
                .append(String.valueOf(this.integrationInstanceType));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", isByol=").append(String.valueOf(this.isByol));
        sb.append(", idcsAt=").append(String.valueOf(this.idcsAt));
        sb.append(", messagePacks=").append(String.valueOf(this.messagePacks));
        sb.append(", isVisualBuilderEnabled=").append(String.valueOf(this.isVisualBuilderEnabled));
        sb.append(", customEndpoint=").append(String.valueOf(this.customEndpoint));
        sb.append(", alternateCustomEndpoints=")
                .append(String.valueOf(this.alternateCustomEndpoints));
        sb.append(", consumptionModel=").append(String.valueOf(this.consumptionModel));
        sb.append(", isFileServerEnabled=").append(String.valueOf(this.isFileServerEnabled));
        sb.append(", isDisasterRecoveryEnabled=")
                .append(String.valueOf(this.isDisasterRecoveryEnabled));
        sb.append(", networkEndpointDetails=").append(String.valueOf(this.networkEndpointDetails));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", domainId=").append(String.valueOf(this.domainId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateIntegrationInstanceDetails)) {
            return false;
        }

        CreateIntegrationInstanceDetails other = (CreateIntegrationInstanceDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.integrationInstanceType, other.integrationInstanceType)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.isByol, other.isByol)
                && java.util.Objects.equals(this.idcsAt, other.idcsAt)
                && java.util.Objects.equals(this.messagePacks, other.messagePacks)
                && java.util.Objects.equals(
                        this.isVisualBuilderEnabled, other.isVisualBuilderEnabled)
                && java.util.Objects.equals(this.customEndpoint, other.customEndpoint)
                && java.util.Objects.equals(
                        this.alternateCustomEndpoints, other.alternateCustomEndpoints)
                && java.util.Objects.equals(this.consumptionModel, other.consumptionModel)
                && java.util.Objects.equals(this.isFileServerEnabled, other.isFileServerEnabled)
                && java.util.Objects.equals(
                        this.isDisasterRecoveryEnabled, other.isDisasterRecoveryEnabled)
                && java.util.Objects.equals(
                        this.networkEndpointDetails, other.networkEndpointDetails)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.domainId, other.domainId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.integrationInstanceType == null
                                ? 43
                                : this.integrationInstanceType.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.isByol == null ? 43 : this.isByol.hashCode());
        result = (result * PRIME) + (this.idcsAt == null ? 43 : this.idcsAt.hashCode());
        result = (result * PRIME) + (this.messagePacks == null ? 43 : this.messagePacks.hashCode());
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
                        + (this.isFileServerEnabled == null
                                ? 43
                                : this.isFileServerEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isDisasterRecoveryEnabled == null
                                ? 43
                                : this.isDisasterRecoveryEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.networkEndpointDetails == null
                                ? 43
                                : this.networkEndpointDetails.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.domainId == null ? 43 : this.domainId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

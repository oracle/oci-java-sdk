/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * An application contains functions and defined attributes shared between those functions, such as
 * network configuration and configuration. Avoid entering confidential information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Application.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Application extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "lifecycleState",
        "config",
        "subnetIds",
        "shape",
        "networkSecurityGroupIds",
        "syslogUrl",
        "traceConfig",
        "freeformTags",
        "definedTags",
        "timeCreated",
        "timeUpdated",
        "imagePolicyConfig"
    })
    public Application(
            String id,
            String compartmentId,
            String displayName,
            LifecycleState lifecycleState,
            java.util.Map<String, String> config,
            java.util.List<String> subnetIds,
            Shape shape,
            java.util.List<String> networkSecurityGroupIds,
            String syslogUrl,
            ApplicationTraceConfig traceConfig,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            ImagePolicyConfig imagePolicyConfig) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.config = config;
        this.subnetIds = subnetIds;
        this.shape = shape;
        this.networkSecurityGroupIds = networkSecurityGroupIds;
        this.syslogUrl = syslogUrl;
        this.traceConfig = traceConfig;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.imagePolicyConfig = imagePolicyConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the application.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the application.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the compartment that contains the application. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the application.
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
         * The display name of the application. The display name is unique within the compartment
         * containing the application.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the application. The display name is unique within the compartment
         * containing the application.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The current state of the application. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the application.
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
         * Application configuration for functions in this application (passed as environment
         * variables). Can be overridden by function configuration. Keys must be ASCII strings
         * consisting solely of letters, digits, and the '_' (underscore) character, and must not
         * begin with a digit. Values should be limited to printable unicode characters.
         *
         * <p>Example: {@code {"MY_FUNCTION_CONFIG": "ConfVal"}}
         *
         * <p>The maximum size for all configuration keys and values is limited to 4KB. This is
         * measured as the sum of octets necessary to represent each key and value in UTF-8.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("config")
        private java.util.Map<String, String> config;

        /**
         * Application configuration for functions in this application (passed as environment
         * variables). Can be overridden by function configuration. Keys must be ASCII strings
         * consisting solely of letters, digits, and the '_' (underscore) character, and must not
         * begin with a digit. Values should be limited to printable unicode characters.
         *
         * <p>Example: {@code {"MY_FUNCTION_CONFIG": "ConfVal"}}
         *
         * <p>The maximum size for all configuration keys and values is limited to 4KB. This is
         * measured as the sum of octets necessary to represent each key and value in UTF-8.
         *
         * @param config the value to set
         * @return this builder
         */
        public Builder config(java.util.Map<String, String> config) {
            this.config = config;
            this.__explicitlySet__.add("config");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s
         * of the subnets in which to run functions in the application.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
        private java.util.List<String> subnetIds;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s
         * of the subnets in which to run functions in the application.
         *
         * @param subnetIds the value to set
         * @return this builder
         */
        public Builder subnetIds(java.util.List<String> subnetIds) {
            this.subnetIds = subnetIds;
            this.__explicitlySet__.add("subnetIds");
            return this;
        }
        /**
         * Valid values are {@code GENERIC_X86}, {@code GENERIC_ARM} and {@code GENERIC_X86_ARM}.
         * Default is {@code GENERIC_X86}. Setting this to {@code GENERIC_X86}, will run the
         * functions in the application on X86 processor architecture. Setting this to {@code
         * GENERIC_ARM}, will run the functions in the application on ARM processor architecture.
         * When set to {@code GENERIC_X86_ARM}, functions in the application are run on either X86
         * or ARM processor architecture. Accepted values are: {@code GENERIC_X86}, {@code
         * GENERIC_ARM}, {@code GENERIC_X86_ARM}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private Shape shape;

        /**
         * Valid values are {@code GENERIC_X86}, {@code GENERIC_ARM} and {@code GENERIC_X86_ARM}.
         * Default is {@code GENERIC_X86}. Setting this to {@code GENERIC_X86}, will run the
         * functions in the application on X86 processor architecture. Setting this to {@code
         * GENERIC_ARM}, will run the functions in the application on ARM processor architecture.
         * When set to {@code GENERIC_X86_ARM}, functions in the application are run on either X86
         * or ARM processor architecture. Accepted values are: {@code GENERIC_X86}, {@code
         * GENERIC_ARM}, {@code GENERIC_X86_ARM}
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(Shape shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s
         * of the Network Security Groups to add the application to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
        private java.util.List<String> networkSecurityGroupIds;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s
         * of the Network Security Groups to add the application to.
         *
         * @param networkSecurityGroupIds the value to set
         * @return this builder
         */
        public Builder networkSecurityGroupIds(java.util.List<String> networkSecurityGroupIds) {
            this.networkSecurityGroupIds = networkSecurityGroupIds;
            this.__explicitlySet__.add("networkSecurityGroupIds");
            return this;
        }
        /**
         * A syslog URL to which to send all function logs. Supports tcp, udp, and tcp+tls. The
         * syslog URL must be reachable from all of the subnets configured for the application.
         * Note: If you enable the OCI Logging service for this application, the syslogUrl value is
         * ignored. Function logs are sent to the OCI Logging service, and not to the syslog URL.
         *
         * <p>Example: {@code tcp://logserver.myserver:1234}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("syslogUrl")
        private String syslogUrl;

        /**
         * A syslog URL to which to send all function logs. Supports tcp, udp, and tcp+tls. The
         * syslog URL must be reachable from all of the subnets configured for the application.
         * Note: If you enable the OCI Logging service for this application, the syslogUrl value is
         * ignored. Function logs are sent to the OCI Logging service, and not to the syslog URL.
         *
         * <p>Example: {@code tcp://logserver.myserver:1234}
         *
         * @param syslogUrl the value to set
         * @return this builder
         */
        public Builder syslogUrl(String syslogUrl) {
            this.syslogUrl = syslogUrl;
            this.__explicitlySet__.add("syslogUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("traceConfig")
        private ApplicationTraceConfig traceConfig;

        public Builder traceConfig(ApplicationTraceConfig traceConfig) {
            this.traceConfig = traceConfig;
            this.__explicitlySet__.add("traceConfig");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * The time the application was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2018-09-12T22:47:12.613Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the application was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2018-09-12T22:47:12.613Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the application was updated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2018-09-12T22:47:12.613Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the application was updated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2018-09-12T22:47:12.613Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imagePolicyConfig")
        private ImagePolicyConfig imagePolicyConfig;

        public Builder imagePolicyConfig(ImagePolicyConfig imagePolicyConfig) {
            this.imagePolicyConfig = imagePolicyConfig;
            this.__explicitlySet__.add("imagePolicyConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Application build() {
            Application model =
                    new Application(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.lifecycleState,
                            this.config,
                            this.subnetIds,
                            this.shape,
                            this.networkSecurityGroupIds,
                            this.syslogUrl,
                            this.traceConfig,
                            this.freeformTags,
                            this.definedTags,
                            this.timeCreated,
                            this.timeUpdated,
                            this.imagePolicyConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Application model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("config")) {
                this.config(model.getConfig());
            }
            if (model.wasPropertyExplicitlySet("subnetIds")) {
                this.subnetIds(model.getSubnetIds());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("networkSecurityGroupIds")) {
                this.networkSecurityGroupIds(model.getNetworkSecurityGroupIds());
            }
            if (model.wasPropertyExplicitlySet("syslogUrl")) {
                this.syslogUrl(model.getSyslogUrl());
            }
            if (model.wasPropertyExplicitlySet("traceConfig")) {
                this.traceConfig(model.getTraceConfig());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("imagePolicyConfig")) {
                this.imagePolicyConfig(model.getImagePolicyConfig());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the application.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the application.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the compartment that contains the application. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the application.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The display name of the application. The display name is unique within the compartment
     * containing the application.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the application. The display name is unique within the compartment
     * containing the application.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The current state of the application. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),
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
    /** The current state of the application. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the application.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Application configuration for functions in this application (passed as environment
     * variables). Can be overridden by function configuration. Keys must be ASCII strings
     * consisting solely of letters, digits, and the '_' (underscore) character, and must not begin
     * with a digit. Values should be limited to printable unicode characters.
     *
     * <p>Example: {@code {"MY_FUNCTION_CONFIG": "ConfVal"}}
     *
     * <p>The maximum size for all configuration keys and values is limited to 4KB. This is measured
     * as the sum of octets necessary to represent each key and value in UTF-8.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    private final java.util.Map<String, String> config;

    /**
     * Application configuration for functions in this application (passed as environment
     * variables). Can be overridden by function configuration. Keys must be ASCII strings
     * consisting solely of letters, digits, and the '_' (underscore) character, and must not begin
     * with a digit. Values should be limited to printable unicode characters.
     *
     * <p>Example: {@code {"MY_FUNCTION_CONFIG": "ConfVal"}}
     *
     * <p>The maximum size for all configuration keys and values is limited to 4KB. This is measured
     * as the sum of octets necessary to represent each key and value in UTF-8.
     *
     * @return the value
     */
    public java.util.Map<String, String> getConfig() {
        return config;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of
     * the subnets in which to run functions in the application.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
    private final java.util.List<String> subnetIds;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of
     * the subnets in which to run functions in the application.
     *
     * @return the value
     */
    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * Valid values are {@code GENERIC_X86}, {@code GENERIC_ARM} and {@code GENERIC_X86_ARM}.
     * Default is {@code GENERIC_X86}. Setting this to {@code GENERIC_X86}, will run the functions
     * in the application on X86 processor architecture. Setting this to {@code GENERIC_ARM}, will
     * run the functions in the application on ARM processor architecture. When set to {@code
     * GENERIC_X86_ARM}, functions in the application are run on either X86 or ARM processor
     * architecture. Accepted values are: {@code GENERIC_X86}, {@code GENERIC_ARM}, {@code
     * GENERIC_X86_ARM}
     */
    public enum Shape implements com.oracle.bmc.http.internal.BmcEnum {
        GenericX86("GENERIC_X86"),
        GenericArm("GENERIC_ARM"),
        GenericX86Arm("GENERIC_X86_ARM"),

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
    /**
     * Valid values are {@code GENERIC_X86}, {@code GENERIC_ARM} and {@code GENERIC_X86_ARM}.
     * Default is {@code GENERIC_X86}. Setting this to {@code GENERIC_X86}, will run the functions
     * in the application on X86 processor architecture. Setting this to {@code GENERIC_ARM}, will
     * run the functions in the application on ARM processor architecture. When set to {@code
     * GENERIC_X86_ARM}, functions in the application are run on either X86 or ARM processor
     * architecture. Accepted values are: {@code GENERIC_X86}, {@code GENERIC_ARM}, {@code
     * GENERIC_X86_ARM}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final Shape shape;

    /**
     * Valid values are {@code GENERIC_X86}, {@code GENERIC_ARM} and {@code GENERIC_X86_ARM}.
     * Default is {@code GENERIC_X86}. Setting this to {@code GENERIC_X86}, will run the functions
     * in the application on X86 processor architecture. Setting this to {@code GENERIC_ARM}, will
     * run the functions in the application on ARM processor architecture. When set to {@code
     * GENERIC_X86_ARM}, functions in the application are run on either X86 or ARM processor
     * architecture. Accepted values are: {@code GENERIC_X86}, {@code GENERIC_ARM}, {@code
     * GENERIC_X86_ARM}
     *
     * @return the value
     */
    public Shape getShape() {
        return shape;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of
     * the Network Security Groups to add the application to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
    private final java.util.List<String> networkSecurityGroupIds;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s of
     * the Network Security Groups to add the application to.
     *
     * @return the value
     */
    public java.util.List<String> getNetworkSecurityGroupIds() {
        return networkSecurityGroupIds;
    }

    /**
     * A syslog URL to which to send all function logs. Supports tcp, udp, and tcp+tls. The syslog
     * URL must be reachable from all of the subnets configured for the application. Note: If you
     * enable the OCI Logging service for this application, the syslogUrl value is ignored. Function
     * logs are sent to the OCI Logging service, and not to the syslog URL.
     *
     * <p>Example: {@code tcp://logserver.myserver:1234}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("syslogUrl")
    private final String syslogUrl;

    /**
     * A syslog URL to which to send all function logs. Supports tcp, udp, and tcp+tls. The syslog
     * URL must be reachable from all of the subnets configured for the application. Note: If you
     * enable the OCI Logging service for this application, the syslogUrl value is ignored. Function
     * logs are sent to the OCI Logging service, and not to the syslog URL.
     *
     * <p>Example: {@code tcp://logserver.myserver:1234}
     *
     * @return the value
     */
    public String getSyslogUrl() {
        return syslogUrl;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("traceConfig")
    private final ApplicationTraceConfig traceConfig;

    public ApplicationTraceConfig getTraceConfig() {
        return traceConfig;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The time the application was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2018-09-12T22:47:12.613Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the application was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2018-09-12T22:47:12.613Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the application was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2018-09-12T22:47:12.613Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the application was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2018-09-12T22:47:12.613Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("imagePolicyConfig")
    private final ImagePolicyConfig imagePolicyConfig;

    public ImagePolicyConfig getImagePolicyConfig() {
        return imagePolicyConfig;
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
        sb.append("Application(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", config=").append(String.valueOf(this.config));
        sb.append(", subnetIds=").append(String.valueOf(this.subnetIds));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", networkSecurityGroupIds=")
                .append(String.valueOf(this.networkSecurityGroupIds));
        sb.append(", syslogUrl=").append(String.valueOf(this.syslogUrl));
        sb.append(", traceConfig=").append(String.valueOf(this.traceConfig));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", imagePolicyConfig=").append(String.valueOf(this.imagePolicyConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Application)) {
            return false;
        }

        Application other = (Application) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.config, other.config)
                && java.util.Objects.equals(this.subnetIds, other.subnetIds)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(
                        this.networkSecurityGroupIds, other.networkSecurityGroupIds)
                && java.util.Objects.equals(this.syslogUrl, other.syslogUrl)
                && java.util.Objects.equals(this.traceConfig, other.traceConfig)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.imagePolicyConfig, other.imagePolicyConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.config == null ? 43 : this.config.hashCode());
        result = (result * PRIME) + (this.subnetIds == null ? 43 : this.subnetIds.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.networkSecurityGroupIds == null
                                ? 43
                                : this.networkSecurityGroupIds.hashCode());
        result = (result * PRIME) + (this.syslogUrl == null ? 43 : this.syslogUrl.hashCode());
        result = (result * PRIME) + (this.traceConfig == null ? 43 : this.traceConfig.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.imagePolicyConfig == null ? 43 : this.imagePolicyConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

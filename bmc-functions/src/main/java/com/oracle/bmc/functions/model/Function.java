/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * A function resource defines the code (Docker image) and configuration for a specific function.
 * Functions are defined in applications. Avoid entering confidential information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Function.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Function extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "lifecycleState",
        "applicationId",
        "compartmentId",
        "image",
        "imageDigest",
        "memoryInMBs",
        "config",
        "timeoutInSeconds",
        "provisionedConcurrencyConfig",
        "traceConfig",
        "freeformTags",
        "invokeEndpoint",
        "definedTags",
        "timeCreated",
        "timeUpdated"
    })
    public Function(
            String id,
            String displayName,
            LifecycleState lifecycleState,
            String applicationId,
            String compartmentId,
            String image,
            String imageDigest,
            Long memoryInMBs,
            java.util.Map<String, String> config,
            Integer timeoutInSeconds,
            FunctionProvisionedConcurrencyConfig provisionedConcurrencyConfig,
            FunctionTraceConfig traceConfig,
            java.util.Map<String, String> freeformTags,
            String invokeEndpoint,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.applicationId = applicationId;
        this.compartmentId = compartmentId;
        this.image = image;
        this.imageDigest = imageDigest;
        this.memoryInMBs = memoryInMBs;
        this.config = config;
        this.timeoutInSeconds = timeoutInSeconds;
        this.provisionedConcurrencyConfig = provisionedConcurrencyConfig;
        this.traceConfig = traceConfig;
        this.freeformTags = freeformTags;
        this.invokeEndpoint = invokeEndpoint;
        this.definedTags = definedTags;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the function.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the function.
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
         * The display name of the function. The display name is unique within the application
         * containing the function.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the function. The display name is unique within the application
         * containing the function.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The current state of the function. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the function.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The OCID of the application the function belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
        private String applicationId;

        /**
         * The OCID of the application the function belongs to.
         *
         * @param applicationId the value to set
         * @return this builder
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            this.__explicitlySet__.add("applicationId");
            return this;
        }
        /** The OCID of the compartment that contains the function. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the function.
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
         * The qualified name of the Docker image to use in the function, including the image tag.
         * The image should be in the OCI Registry that is in the same region as the function
         * itself. Example: {@code phx.ocir.io/ten/functions/function:0.0.1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("image")
        private String image;

        /**
         * The qualified name of the Docker image to use in the function, including the image tag.
         * The image should be in the OCI Registry that is in the same region as the function
         * itself. Example: {@code phx.ocir.io/ten/functions/function:0.0.1}
         *
         * @param image the value to set
         * @return this builder
         */
        public Builder image(String image) {
            this.image = image;
            this.__explicitlySet__.add("image");
            return this;
        }
        /**
         * The image digest for the version of the image that will be pulled when invoking this
         * function. If no value is specified, the digest currently associated with the image in the
         * OCI Registry will be used. Example: {@code
         * sha256:ca0eeb6fb05351dfc8759c20733c91def84cb8007aa89a5bf606bc8b315b9fc7}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("imageDigest")
        private String imageDigest;

        /**
         * The image digest for the version of the image that will be pulled when invoking this
         * function. If no value is specified, the digest currently associated with the image in the
         * OCI Registry will be used. Example: {@code
         * sha256:ca0eeb6fb05351dfc8759c20733c91def84cb8007aa89a5bf606bc8b315b9fc7}
         *
         * @param imageDigest the value to set
         * @return this builder
         */
        public Builder imageDigest(String imageDigest) {
            this.imageDigest = imageDigest;
            this.__explicitlySet__.add("imageDigest");
            return this;
        }
        /** Maximum usable memory for the function (MiB). */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInMBs")
        private Long memoryInMBs;

        /**
         * Maximum usable memory for the function (MiB).
         *
         * @param memoryInMBs the value to set
         * @return this builder
         */
        public Builder memoryInMBs(Long memoryInMBs) {
            this.memoryInMBs = memoryInMBs;
            this.__explicitlySet__.add("memoryInMBs");
            return this;
        }
        /**
         * Function configuration. Overrides application configuration. Keys must be ASCII strings
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
         * Function configuration. Overrides application configuration. Keys must be ASCII strings
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
        /** Timeout for executions of the function. Value in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
        private Integer timeoutInSeconds;

        /**
         * Timeout for executions of the function. Value in seconds.
         *
         * @param timeoutInSeconds the value to set
         * @return this builder
         */
        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            this.__explicitlySet__.add("timeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("provisionedConcurrencyConfig")
        private FunctionProvisionedConcurrencyConfig provisionedConcurrencyConfig;

        public Builder provisionedConcurrencyConfig(
                FunctionProvisionedConcurrencyConfig provisionedConcurrencyConfig) {
            this.provisionedConcurrencyConfig = provisionedConcurrencyConfig;
            this.__explicitlySet__.add("provisionedConcurrencyConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("traceConfig")
        private FunctionTraceConfig traceConfig;

        public Builder traceConfig(FunctionTraceConfig traceConfig) {
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
         * The base https invoke URL to set on a client in order to invoke a function. This URL will
         * never change over the lifetime of the function and can be cached.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("invokeEndpoint")
        private String invokeEndpoint;

        /**
         * The base https invoke URL to set on a client in order to invoke a function. This URL will
         * never change over the lifetime of the function and can be cached.
         *
         * @param invokeEndpoint the value to set
         * @return this builder
         */
        public Builder invokeEndpoint(String invokeEndpoint) {
            this.invokeEndpoint = invokeEndpoint;
            this.__explicitlySet__.add("invokeEndpoint");
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
         * The time the function was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2018-09-12T22:47:12.613Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the function was created, expressed in [RFC
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
         * The time the function was updated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2018-09-12T22:47:12.613Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the function was updated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2018-09-12T22:47:12.613Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Function build() {
            Function model =
                    new Function(
                            this.id,
                            this.displayName,
                            this.lifecycleState,
                            this.applicationId,
                            this.compartmentId,
                            this.image,
                            this.imageDigest,
                            this.memoryInMBs,
                            this.config,
                            this.timeoutInSeconds,
                            this.provisionedConcurrencyConfig,
                            this.traceConfig,
                            this.freeformTags,
                            this.invokeEndpoint,
                            this.definedTags,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Function model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("applicationId")) {
                this.applicationId(model.getApplicationId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("image")) {
                this.image(model.getImage());
            }
            if (model.wasPropertyExplicitlySet("imageDigest")) {
                this.imageDigest(model.getImageDigest());
            }
            if (model.wasPropertyExplicitlySet("memoryInMBs")) {
                this.memoryInMBs(model.getMemoryInMBs());
            }
            if (model.wasPropertyExplicitlySet("config")) {
                this.config(model.getConfig());
            }
            if (model.wasPropertyExplicitlySet("timeoutInSeconds")) {
                this.timeoutInSeconds(model.getTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("provisionedConcurrencyConfig")) {
                this.provisionedConcurrencyConfig(model.getProvisionedConcurrencyConfig());
            }
            if (model.wasPropertyExplicitlySet("traceConfig")) {
                this.traceConfig(model.getTraceConfig());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("invokeEndpoint")) {
                this.invokeEndpoint(model.getInvokeEndpoint());
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
     * the function.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the function.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The display name of the function. The display name is unique within the application
     * containing the function.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the function. The display name is unique within the application
     * containing the function.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The current state of the function. */
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
    /** The current state of the function. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the function.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The OCID of the application the function belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
    private final String applicationId;

    /**
     * The OCID of the application the function belongs to.
     *
     * @return the value
     */
    public String getApplicationId() {
        return applicationId;
    }

    /** The OCID of the compartment that contains the function. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the function.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The qualified name of the Docker image to use in the function, including the image tag. The
     * image should be in the OCI Registry that is in the same region as the function itself.
     * Example: {@code phx.ocir.io/ten/functions/function:0.0.1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    private final String image;

    /**
     * The qualified name of the Docker image to use in the function, including the image tag. The
     * image should be in the OCI Registry that is in the same region as the function itself.
     * Example: {@code phx.ocir.io/ten/functions/function:0.0.1}
     *
     * @return the value
     */
    public String getImage() {
        return image;
    }

    /**
     * The image digest for the version of the image that will be pulled when invoking this
     * function. If no value is specified, the digest currently associated with the image in the OCI
     * Registry will be used. Example: {@code
     * sha256:ca0eeb6fb05351dfc8759c20733c91def84cb8007aa89a5bf606bc8b315b9fc7}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imageDigest")
    private final String imageDigest;

    /**
     * The image digest for the version of the image that will be pulled when invoking this
     * function. If no value is specified, the digest currently associated with the image in the OCI
     * Registry will be used. Example: {@code
     * sha256:ca0eeb6fb05351dfc8759c20733c91def84cb8007aa89a5bf606bc8b315b9fc7}
     *
     * @return the value
     */
    public String getImageDigest() {
        return imageDigest;
    }

    /** Maximum usable memory for the function (MiB). */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInMBs")
    private final Long memoryInMBs;

    /**
     * Maximum usable memory for the function (MiB).
     *
     * @return the value
     */
    public Long getMemoryInMBs() {
        return memoryInMBs;
    }

    /**
     * Function configuration. Overrides application configuration. Keys must be ASCII strings
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
     * Function configuration. Overrides application configuration. Keys must be ASCII strings
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

    /** Timeout for executions of the function. Value in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
    private final Integer timeoutInSeconds;

    /**
     * Timeout for executions of the function. Value in seconds.
     *
     * @return the value
     */
    public Integer getTimeoutInSeconds() {
        return timeoutInSeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("provisionedConcurrencyConfig")
    private final FunctionProvisionedConcurrencyConfig provisionedConcurrencyConfig;

    public FunctionProvisionedConcurrencyConfig getProvisionedConcurrencyConfig() {
        return provisionedConcurrencyConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("traceConfig")
    private final FunctionTraceConfig traceConfig;

    public FunctionTraceConfig getTraceConfig() {
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
     * The base https invoke URL to set on a client in order to invoke a function. This URL will
     * never change over the lifetime of the function and can be cached.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("invokeEndpoint")
    private final String invokeEndpoint;

    /**
     * The base https invoke URL to set on a client in order to invoke a function. This URL will
     * never change over the lifetime of the function and can be cached.
     *
     * @return the value
     */
    public String getInvokeEndpoint() {
        return invokeEndpoint;
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
     * The time the function was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2018-09-12T22:47:12.613Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the function was created, expressed in [RFC
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
     * The time the function was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2018-09-12T22:47:12.613Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the function was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2018-09-12T22:47:12.613Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("Function(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", applicationId=").append(String.valueOf(this.applicationId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", image=").append(String.valueOf(this.image));
        sb.append(", imageDigest=").append(String.valueOf(this.imageDigest));
        sb.append(", memoryInMBs=").append(String.valueOf(this.memoryInMBs));
        sb.append(", config=").append(String.valueOf(this.config));
        sb.append(", timeoutInSeconds=").append(String.valueOf(this.timeoutInSeconds));
        sb.append(", provisionedConcurrencyConfig=")
                .append(String.valueOf(this.provisionedConcurrencyConfig));
        sb.append(", traceConfig=").append(String.valueOf(this.traceConfig));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", invokeEndpoint=").append(String.valueOf(this.invokeEndpoint));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Function)) {
            return false;
        }

        Function other = (Function) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.applicationId, other.applicationId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.image, other.image)
                && java.util.Objects.equals(this.imageDigest, other.imageDigest)
                && java.util.Objects.equals(this.memoryInMBs, other.memoryInMBs)
                && java.util.Objects.equals(this.config, other.config)
                && java.util.Objects.equals(this.timeoutInSeconds, other.timeoutInSeconds)
                && java.util.Objects.equals(
                        this.provisionedConcurrencyConfig, other.provisionedConcurrencyConfig)
                && java.util.Objects.equals(this.traceConfig, other.traceConfig)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.invokeEndpoint, other.invokeEndpoint)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationId == null ? 43 : this.applicationId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.image == null ? 43 : this.image.hashCode());
        result = (result * PRIME) + (this.imageDigest == null ? 43 : this.imageDigest.hashCode());
        result = (result * PRIME) + (this.memoryInMBs == null ? 43 : this.memoryInMBs.hashCode());
        result = (result * PRIME) + (this.config == null ? 43 : this.config.hashCode());
        result =
                (result * PRIME)
                        + (this.timeoutInSeconds == null ? 43 : this.timeoutInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.provisionedConcurrencyConfig == null
                                ? 43
                                : this.provisionedConcurrencyConfig.hashCode());
        result = (result * PRIME) + (this.traceConfig == null ? 43 : this.traceConfig.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.invokeEndpoint == null ? 43 : this.invokeEndpoint.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * A function resource defines the code (Docker image) and configuration for a specific function. Functions are defined in applications. Avoid entering confidential information.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Function.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Function {
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
        private String applicationId;

        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            this.__explicitlySet__.add("applicationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("image")
        private String image;

        public Builder image(String image) {
            this.image = image;
            this.__explicitlySet__.add("image");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageDigest")
        private String imageDigest;

        public Builder imageDigest(String imageDigest) {
            this.imageDigest = imageDigest;
            this.__explicitlySet__.add("imageDigest");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryInMBs")
        private Long memoryInMBs;

        public Builder memoryInMBs(Long memoryInMBs) {
            this.memoryInMBs = memoryInMBs;
            this.__explicitlySet__.add("memoryInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("config")
        private java.util.Map<String, String> config;

        public Builder config(java.util.Map<String, String> config) {
            this.config = config;
            this.__explicitlySet__.add("config");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
        private Integer timeoutInSeconds;

        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            this.__explicitlySet__.add("timeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("invokeEndpoint")
        private String invokeEndpoint;

        public Builder invokeEndpoint(String invokeEndpoint) {
            this.invokeEndpoint = invokeEndpoint;
            this.__explicitlySet__.add("invokeEndpoint");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Function build() {
            Function __instance__ =
                    new Function(
                            id,
                            displayName,
                            lifecycleState,
                            applicationId,
                            compartmentId,
                            image,
                            imageDigest,
                            memoryInMBs,
                            config,
                            timeoutInSeconds,
                            freeformTags,
                            invokeEndpoint,
                            definedTags,
                            timeCreated,
                            timeUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Function o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .lifecycleState(o.getLifecycleState())
                            .applicationId(o.getApplicationId())
                            .compartmentId(o.getCompartmentId())
                            .image(o.getImage())
                            .imageDigest(o.getImageDigest())
                            .memoryInMBs(o.getMemoryInMBs())
                            .config(o.getConfig())
                            .timeoutInSeconds(o.getTimeoutInSeconds())
                            .freeformTags(o.getFreeformTags())
                            .invokeEndpoint(o.getInvokeEndpoint())
                            .definedTags(o.getDefinedTags())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the function.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The display name of the function. The display name is unique within the application containing the function.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;
    /**
     * The current state of the function.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The current state of the function.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The OCID of the application the function belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
    String applicationId;

    /**
     * The OCID of the compartment that contains the function.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The qualified name of the Docker image to use in the function, including the image tag.
     * The image should be in the OCI Registry that is in the same region as the function itself.
     * Example: `phx.ocir.io/ten/functions/function:0.0.1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    String image;

    /**
     * The image digest for the version of the image that will be pulled when invoking this function.
     * If no value is specified, the digest currently associated with the image in the OCI Registry will be used.
     * Example: `sha256:ca0eeb6fb05351dfc8759c20733c91def84cb8007aa89a5bf606bc8b315b9fc7`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageDigest")
    String imageDigest;

    /**
     * Maximum usable memory for the function (MiB).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInMBs")
    Long memoryInMBs;

    /**
     * Function configuration. Overrides application configuration.
     * Keys must be ASCII strings consisting solely of letters, digits, and the '_' (underscore) character, and must not begin with a digit. Values should be limited to printable unicode characters.
     * <p>
     * Example: `{\"MY_FUNCTION_CONFIG\": \"ConfVal\"}`
     * <p>
     * The maximum size for all configuration keys and values is limited to 4KB. This is measured as the sum of octets necessary to represent each key and value in UTF-8.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    java.util.Map<String, String> config;

    /**
     * Timeout for executions of the function. Value in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
    Integer timeoutInSeconds;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The base https invoke URL to set on a client in order to invoke a function. This URL will never change over the lifetime of the function and can be cached.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("invokeEndpoint")
    String invokeEndpoint;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The time the function was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * <p>
     * Example: `2018-09-12T22:47:12.613Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time the function was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * <p>
     * Example: `2018-09-12T22:47:12.613Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

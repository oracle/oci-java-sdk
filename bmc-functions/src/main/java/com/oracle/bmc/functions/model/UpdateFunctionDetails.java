/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.functions.model;

/**
 * Updates attributes of a function.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateFunctionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateFunctionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        public UpdateFunctionDetails build() {
            UpdateFunctionDetails __instance__ =
                    new UpdateFunctionDetails(
                            image,
                            imageDigest,
                            memoryInMBs,
                            config,
                            timeoutInSeconds,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateFunctionDetails o) {
            Builder copiedBuilder =
                    image(o.getImage())
                            .imageDigest(o.getImageDigest())
                            .memoryInMBs(o.getMemoryInMBs())
                            .config(o.getConfig())
                            .timeoutInSeconds(o.getTimeoutInSeconds())
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
     * The qualified name of the Docker image to use in the function, including the image tag.
     * The image should be in the OCI Registry that is in the same region as the function itself.
     * If an image is specified but no value for imageDigest is provided, the digest currently associated with the image tag in the OCI Registry will be used.
     * Example: `phx.ocir.io/ten/functions/function:0.0.1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    String image;

    /**
     * The image digest for the version of the image that will be pulled when invoking this function.
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
     * Function configuration. These values are passed on to the function as environment variables, this overrides application configuration values.
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
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

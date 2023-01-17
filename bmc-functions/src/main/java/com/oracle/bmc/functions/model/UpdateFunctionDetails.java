/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * Updates attributes of a function. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateFunctionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateFunctionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "image",
        "imageDigest",
        "memoryInMBs",
        "config",
        "timeoutInSeconds",
        "provisionedConcurrencyConfig",
        "traceConfig",
        "freeformTags",
        "definedTags"
    })
    public UpdateFunctionDetails(
            String image,
            String imageDigest,
            Long memoryInMBs,
            java.util.Map<String, String> config,
            Integer timeoutInSeconds,
            FunctionProvisionedConcurrencyConfig provisionedConcurrencyConfig,
            FunctionTraceConfig traceConfig,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.image = image;
        this.imageDigest = imageDigest;
        this.memoryInMBs = memoryInMBs;
        this.config = config;
        this.timeoutInSeconds = timeoutInSeconds;
        this.provisionedConcurrencyConfig = provisionedConcurrencyConfig;
        this.traceConfig = traceConfig;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The qualified name of the Docker image to use in the function, including the image tag.
         * The image should be in the OCI Registry that is in the same region as the function
         * itself. If an image is specified but no value for imageDigest is provided, the digest
         * currently associated with the image tag in the OCI Registry will be used. Example: {@code
         * phx.ocir.io/ten/functions/function:0.0.1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("image")
        private String image;

        /**
         * The qualified name of the Docker image to use in the function, including the image tag.
         * The image should be in the OCI Registry that is in the same region as the function
         * itself. If an image is specified but no value for imageDigest is provided, the digest
         * currently associated with the image tag in the OCI Registry will be used. Example: {@code
         * phx.ocir.io/ten/functions/function:0.0.1}
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
         * function. Example: {@code
         * sha256:ca0eeb6fb05351dfc8759c20733c91def84cb8007aa89a5bf606bc8b315b9fc7}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("imageDigest")
        private String imageDigest;

        /**
         * The image digest for the version of the image that will be pulled when invoking this
         * function. Example: {@code
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
         * Function configuration. These values are passed on to the function as environment
         * variables, this overrides application configuration values. Keys must be ASCII strings
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
         * Function configuration. These values are passed on to the function as environment
         * variables, this overrides application configuration values. Keys must be ASCII strings
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
         * Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateFunctionDetails build() {
            UpdateFunctionDetails model =
                    new UpdateFunctionDetails(
                            this.image,
                            this.imageDigest,
                            this.memoryInMBs,
                            this.config,
                            this.timeoutInSeconds,
                            this.provisionedConcurrencyConfig,
                            this.traceConfig,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateFunctionDetails model) {
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
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The qualified name of the Docker image to use in the function, including the image tag. The
     * image should be in the OCI Registry that is in the same region as the function itself. If an
     * image is specified but no value for imageDigest is provided, the digest currently associated
     * with the image tag in the OCI Registry will be used. Example: {@code
     * phx.ocir.io/ten/functions/function:0.0.1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    private final String image;

    /**
     * The qualified name of the Docker image to use in the function, including the image tag. The
     * image should be in the OCI Registry that is in the same region as the function itself. If an
     * image is specified but no value for imageDigest is provided, the digest currently associated
     * with the image tag in the OCI Registry will be used. Example: {@code
     * phx.ocir.io/ten/functions/function:0.0.1}
     *
     * @return the value
     */
    public String getImage() {
        return image;
    }

    /**
     * The image digest for the version of the image that will be pulled when invoking this
     * function. Example: {@code
     * sha256:ca0eeb6fb05351dfc8759c20733c91def84cb8007aa89a5bf606bc8b315b9fc7}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imageDigest")
    private final String imageDigest;

    /**
     * The image digest for the version of the image that will be pulled when invoking this
     * function. Example: {@code
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
     * Function configuration. These values are passed on to the function as environment variables,
     * this overrides application configuration values. Keys must be ASCII strings consisting solely
     * of letters, digits, and the '_' (underscore) character, and must not begin with a digit.
     * Values should be limited to printable unicode characters.
     *
     * <p>Example: {@code {"MY_FUNCTION_CONFIG": "ConfVal"}}
     *
     * <p>The maximum size for all configuration keys and values is limited to 4KB. This is measured
     * as the sum of octets necessary to represent each key and value in UTF-8.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    private final java.util.Map<String, String> config;

    /**
     * Function configuration. These values are passed on to the function as environment variables,
     * this overrides application configuration values. Keys must be ASCII strings consisting solely
     * of letters, digits, and the '_' (underscore) character, and must not begin with a digit.
     * Values should be limited to printable unicode characters.
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
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
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
        sb.append("UpdateFunctionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("image=").append(String.valueOf(this.image));
        sb.append(", imageDigest=").append(String.valueOf(this.imageDigest));
        sb.append(", memoryInMBs=").append(String.valueOf(this.memoryInMBs));
        sb.append(", config=").append(String.valueOf(this.config));
        sb.append(", timeoutInSeconds=").append(String.valueOf(this.timeoutInSeconds));
        sb.append(", provisionedConcurrencyConfig=")
                .append(String.valueOf(this.provisionedConcurrencyConfig));
        sb.append(", traceConfig=").append(String.valueOf(this.traceConfig));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateFunctionDetails)) {
            return false;
        }

        UpdateFunctionDetails other = (UpdateFunctionDetails) o;
        return java.util.Objects.equals(this.image, other.image)
                && java.util.Objects.equals(this.imageDigest, other.imageDigest)
                && java.util.Objects.equals(this.memoryInMBs, other.memoryInMBs)
                && java.util.Objects.equals(this.config, other.config)
                && java.util.Objects.equals(this.timeoutInSeconds, other.timeoutInSeconds)
                && java.util.Objects.equals(
                        this.provisionedConcurrencyConfig, other.provisionedConcurrencyConfig)
                && java.util.Objects.equals(this.traceConfig, other.traceConfig)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

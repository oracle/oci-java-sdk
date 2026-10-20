/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Create Sandbox Warm Pool Details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateSandboxWarmPoolDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateSandboxWarmPoolDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "type",
        "containerImage",
        "shape",
        "desiredCapacity"
    })
    public CreateSandboxWarmPoolDetails(
            String name, Type type, String containerImage, Shape shape, Integer desiredCapacity) {
        super();
        this.name = name;
        this.type = type;
        this.containerImage = containerImage;
        this.shape = shape;
        this.desiredCapacity = desiredCapacity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique immutable name within the Project. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Unique immutable name within the Project.
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
         * MANAGED uses the service-provided python-3.11 runtime. CUSTOM uses a customer-provided
         * containerImage. Both types support named pool creation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * MANAGED uses the service-provided python-3.11 runtime. CUSTOM uses a customer-provided
         * containerImage. Both types support named pool creation.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Required for CUSTOM and must be omitted for MANAGED. A CUSTOM image must be a
         * digest-pinned same-region OCIR reference, using sha256 with exactly 64 lowercase
         * hexadecimal characters. The CP workflow prepares the template through the data plane,
         * reusing current BYOC image and Project identity validation. Successful configuration does
         * not guarantee image pull or runtime readiness.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("containerImage")
        private String containerImage;

        /**
         * Required for CUSTOM and must be omitted for MANAGED. A CUSTOM image must be a
         * digest-pinned same-region OCIR reference, using sha256 with exactly 64 lowercase
         * hexadecimal characters. The CP workflow prepares the template through the data plane,
         * reusing current BYOC image and Project identity validation. Successful configuration does
         * not guarantee image pull or runtime readiness.
         *
         * @param containerImage the value to set
         * @return this builder
         */
        public Builder containerImage(String containerImage) {
            this.containerImage = containerImage;
            this.__explicitlySet__.add("containerImage");
            return this;
        }
        /** Compute shape for each idle Sandbox member. */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private Shape shape;

        /**
         * Compute shape for each idle Sandbox member.
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
         * Desired number of idle members. Zero pauses idle prewarming. Once the pool is ACTIVE,
         * named-pool Sandbox creation can still cold-start from its available applied template when
         * no eligible warm member is available. Existing customer Sandboxes continue. A positive
         * target does not guarantee ready capacity. Existing service capacity validation still
         * applies.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("desiredCapacity")
        private Integer desiredCapacity;

        /**
         * Desired number of idle members. Zero pauses idle prewarming. Once the pool is ACTIVE,
         * named-pool Sandbox creation can still cold-start from its available applied template when
         * no eligible warm member is available. Existing customer Sandboxes continue. A positive
         * target does not guarantee ready capacity. Existing service capacity validation still
         * applies.
         *
         * @param desiredCapacity the value to set
         * @return this builder
         */
        public Builder desiredCapacity(Integer desiredCapacity) {
            this.desiredCapacity = desiredCapacity;
            this.__explicitlySet__.add("desiredCapacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSandboxWarmPoolDetails build() {
            CreateSandboxWarmPoolDetails model =
                    new CreateSandboxWarmPoolDetails(
                            this.name,
                            this.type,
                            this.containerImage,
                            this.shape,
                            this.desiredCapacity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSandboxWarmPoolDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("containerImage")) {
                this.containerImage(model.getContainerImage());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("desiredCapacity")) {
                this.desiredCapacity(model.getDesiredCapacity());
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

    /** Unique immutable name within the Project. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Unique immutable name within the Project.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * MANAGED uses the service-provided python-3.11 runtime. CUSTOM uses a customer-provided
     * containerImage. Both types support named pool creation.
     */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Managed("MANAGED"),
        Custom("CUSTOM"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
    /**
     * MANAGED uses the service-provided python-3.11 runtime. CUSTOM uses a customer-provided
     * containerImage. Both types support named pool creation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * MANAGED uses the service-provided python-3.11 runtime. CUSTOM uses a customer-provided
     * containerImage. Both types support named pool creation.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /**
     * Required for CUSTOM and must be omitted for MANAGED. A CUSTOM image must be a digest-pinned
     * same-region OCIR reference, using sha256 with exactly 64 lowercase hexadecimal characters.
     * The CP workflow prepares the template through the data plane, reusing current BYOC image and
     * Project identity validation. Successful configuration does not guarantee image pull or
     * runtime readiness.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("containerImage")
    private final String containerImage;

    /**
     * Required for CUSTOM and must be omitted for MANAGED. A CUSTOM image must be a digest-pinned
     * same-region OCIR reference, using sha256 with exactly 64 lowercase hexadecimal characters.
     * The CP workflow prepares the template through the data plane, reusing current BYOC image and
     * Project identity validation. Successful configuration does not guarantee image pull or
     * runtime readiness.
     *
     * @return the value
     */
    public String getContainerImage() {
        return containerImage;
    }

    /** Compute shape for each idle Sandbox member. */
    public enum Shape implements com.oracle.bmc.http.internal.BmcEnum {
        Small("SMALL"),
        Medium("MEDIUM"),
        Large("LARGE"),
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
    /** Compute shape for each idle Sandbox member. */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final Shape shape;

    /**
     * Compute shape for each idle Sandbox member.
     *
     * @return the value
     */
    public Shape getShape() {
        return shape;
    }

    /**
     * Desired number of idle members. Zero pauses idle prewarming. Once the pool is ACTIVE,
     * named-pool Sandbox creation can still cold-start from its available applied template when no
     * eligible warm member is available. Existing customer Sandboxes continue. A positive target
     * does not guarantee ready capacity. Existing service capacity validation still applies.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("desiredCapacity")
    private final Integer desiredCapacity;

    /**
     * Desired number of idle members. Zero pauses idle prewarming. Once the pool is ACTIVE,
     * named-pool Sandbox creation can still cold-start from its available applied template when no
     * eligible warm member is available. Existing customer Sandboxes continue. A positive target
     * does not guarantee ready capacity. Existing service capacity validation still applies.
     *
     * @return the value
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
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
        sb.append("CreateSandboxWarmPoolDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", containerImage=").append(String.valueOf(this.containerImage));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", desiredCapacity=").append(String.valueOf(this.desiredCapacity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSandboxWarmPoolDetails)) {
            return false;
        }

        CreateSandboxWarmPoolDetails other = (CreateSandboxWarmPoolDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.containerImage, other.containerImage)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.desiredCapacity, other.desiredCapacity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.containerImage == null ? 43 : this.containerImage.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.desiredCapacity == null ? 43 : this.desiredCapacity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

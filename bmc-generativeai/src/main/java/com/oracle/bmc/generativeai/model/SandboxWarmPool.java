/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * CP-owned configuration and management lifecycle of a Project-owned Sandbox warm pool. Get can
 * include best-effort runtime observations independently of lifecycle. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SandboxWarmPool.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SandboxWarmPool
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "projectId",
        "name",
        "type",
        "containerImage",
        "shape",
        "desiredCapacity",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "runtimeStatus"
    })
    public SandboxWarmPool(
            String projectId,
            String name,
            Type type,
            String containerImage,
            Shape shape,
            Integer desiredCapacity,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            SandboxWarmPoolRuntimeStatus runtimeStatus) {
        super();
        this.projectId = projectId;
        this.name = name;
        this.type = type;
        this.containerImage = containerImage;
        this.shape = shape;
        this.desiredCapacity = desiredCapacity;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.runtimeStatus = runtimeStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Owning Project OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        /**
         * Owning Project OCID.
         *
         * @param projectId the value to set
         * @return this builder
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }
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
        /** MANAGED uses the service runtime; CUSTOM uses a customer image. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * MANAGED uses the service runtime; CUSTOM uses a customer image.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Digest-pinned customer image for CUSTOM; omitted for MANAGED. */
        @com.fasterxml.jackson.annotation.JsonProperty("containerImage")
        private String containerImage;

        /**
         * Digest-pinned customer image for CUSTOM; omitted for MANAGED.
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
        /** Requested idle target, not observed capacity. */
        @com.fasterxml.jackson.annotation.JsonProperty("desiredCapacity")
        private Integer desiredCapacity;

        /**
         * Requested idle target, not observed capacity.
         *
         * @param desiredCapacity the value to set
         * @return this builder
         */
        public Builder desiredCapacity(Integer desiredCapacity) {
            this.desiredCapacity = desiredCapacity;
            this.__explicitlySet__.add("desiredCapacity");
            return this;
        }
        /**
         * CP management lifecycle. ACTIVE means the template and requested pool configuration were
         * applied and verified, independently of ready capacity. Scheduling, image-pull and runtime
         * capacity failures do not by themselves change ACTIVE to FAILED.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * CP management lifecycle. ACTIVE means the template and requested pool configuration were
         * applied and verified, independently of ready capacity. Scheduling, image-pull and runtime
         * capacity failures do not by themselves change ACTIVE to FAILED.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Additional information about the current CP management operation or failure. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current CP management operation or failure.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** Time the desired configuration was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time the desired configuration was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Time the configuration or management lifecycle last changed; not runtime readiness. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Time the configuration or management lifecycle last changed; not runtime readiness.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("runtimeStatus")
        private SandboxWarmPoolRuntimeStatus runtimeStatus;

        public Builder runtimeStatus(SandboxWarmPoolRuntimeStatus runtimeStatus) {
            this.runtimeStatus = runtimeStatus;
            this.__explicitlySet__.add("runtimeStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SandboxWarmPool build() {
            SandboxWarmPool model =
                    new SandboxWarmPool(
                            this.projectId,
                            this.name,
                            this.type,
                            this.containerImage,
                            this.shape,
                            this.desiredCapacity,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.runtimeStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SandboxWarmPool model) {
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
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
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("runtimeStatus")) {
                this.runtimeStatus(model.getRuntimeStatus());
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

    /** Owning Project OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    /**
     * Owning Project OCID.
     *
     * @return the value
     */
    public String getProjectId() {
        return projectId;
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

    /** MANAGED uses the service runtime; CUSTOM uses a customer image. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Managed("MANAGED"),
        Custom("CUSTOM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** MANAGED uses the service runtime; CUSTOM uses a customer image. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * MANAGED uses the service runtime; CUSTOM uses a customer image.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** Digest-pinned customer image for CUSTOM; omitted for MANAGED. */
    @com.fasterxml.jackson.annotation.JsonProperty("containerImage")
    private final String containerImage;

    /**
     * Digest-pinned customer image for CUSTOM; omitted for MANAGED.
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

    /** Requested idle target, not observed capacity. */
    @com.fasterxml.jackson.annotation.JsonProperty("desiredCapacity")
    private final Integer desiredCapacity;

    /**
     * Requested idle target, not observed capacity.
     *
     * @return the value
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }

    /**
     * CP management lifecycle. ACTIVE means the template and requested pool configuration were
     * applied and verified, independently of ready capacity. Scheduling, image-pull and runtime
     * capacity failures do not by themselves change ACTIVE to FAILED.
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        Failed("FAILED"),
        Deleting("DELETING"),
        Deleted("DELETED"),

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
    /**
     * CP management lifecycle. ACTIVE means the template and requested pool configuration were
     * applied and verified, independently of ready capacity. Scheduling, image-pull and runtime
     * capacity failures do not by themselves change ACTIVE to FAILED.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * CP management lifecycle. ACTIVE means the template and requested pool configuration were
     * applied and verified, independently of ready capacity. Scheduling, image-pull and runtime
     * capacity failures do not by themselves change ACTIVE to FAILED.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Additional information about the current CP management operation or failure. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current CP management operation or failure.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** Time the desired configuration was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time the desired configuration was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Time the configuration or management lifecycle last changed; not runtime readiness. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time the configuration or management lifecycle last changed; not runtime readiness.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("runtimeStatus")
    private final SandboxWarmPoolRuntimeStatus runtimeStatus;

    public SandboxWarmPoolRuntimeStatus getRuntimeStatus() {
        return runtimeStatus;
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
        sb.append("SandboxWarmPool(");
        sb.append("super=").append(super.toString());
        sb.append("projectId=").append(String.valueOf(this.projectId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", containerImage=").append(String.valueOf(this.containerImage));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", desiredCapacity=").append(String.valueOf(this.desiredCapacity));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", runtimeStatus=").append(String.valueOf(this.runtimeStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SandboxWarmPool)) {
            return false;
        }

        SandboxWarmPool other = (SandboxWarmPool) o;
        return java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.containerImage, other.containerImage)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.desiredCapacity, other.desiredCapacity)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.runtimeStatus, other.runtimeStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.containerImage == null ? 43 : this.containerImage.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.desiredCapacity == null ? 43 : this.desiredCapacity.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.runtimeStatus == null ? 43 : this.runtimeStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

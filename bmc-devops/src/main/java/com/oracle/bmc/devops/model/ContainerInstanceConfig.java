/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies ContainerInstance configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ContainerInstanceConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "containerConfigType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ContainerInstanceConfig extends ContainerConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment where the ContainerInstance will be created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the ContainerInstance will be created.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Availability domain where the ContainerInstance will be created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * Availability domain where the ContainerInstance will be created.
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The shape of the ContainerInstance. The shape determines the resources available to the ContainerInstance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * The shape of the ContainerInstance. The shape determines the resources available to the ContainerInstance.
         * @param shapeName the value to set
         * @return this builder
         **/
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
        private ShapeConfig shapeConfig;

        public Builder shapeConfig(ShapeConfig shapeConfig) {
            this.shapeConfig = shapeConfig;
            this.__explicitlySet__.add("shapeConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkChannel")
        private NetworkChannel networkChannel;

        public Builder networkChannel(NetworkChannel networkChannel) {
            this.networkChannel = networkChannel;
            this.__explicitlySet__.add("networkChannel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerInstanceConfig build() {
            ContainerInstanceConfig model =
                    new ContainerInstanceConfig(
                            this.compartmentId,
                            this.availabilityDomain,
                            this.shapeName,
                            this.shapeConfig,
                            this.networkChannel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerInstanceConfig model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
            }
            if (model.wasPropertyExplicitlySet("shapeConfig")) {
                this.shapeConfig(model.getShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("networkChannel")) {
                this.networkChannel(model.getNetworkChannel());
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

    @Deprecated
    public ContainerInstanceConfig(
            String compartmentId,
            String availabilityDomain,
            String shapeName,
            ShapeConfig shapeConfig,
            NetworkChannel networkChannel) {
        super();
        this.compartmentId = compartmentId;
        this.availabilityDomain = availabilityDomain;
        this.shapeName = shapeName;
        this.shapeConfig = shapeConfig;
        this.networkChannel = networkChannel;
    }

    /**
     * The OCID of the compartment where the ContainerInstance will be created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the ContainerInstance will be created.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Availability domain where the ContainerInstance will be created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * Availability domain where the ContainerInstance will be created.
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The shape of the ContainerInstance. The shape determines the resources available to the ContainerInstance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * The shape of the ContainerInstance. The shape determines the resources available to the ContainerInstance.
     * @return the value
     **/
    public String getShapeName() {
        return shapeName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
    private final ShapeConfig shapeConfig;

    public ShapeConfig getShapeConfig() {
        return shapeConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkChannel")
    private final NetworkChannel networkChannel;

    public NetworkChannel getNetworkChannel() {
        return networkChannel;
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
        sb.append("ContainerInstanceConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", shapeConfig=").append(String.valueOf(this.shapeConfig));
        sb.append(", networkChannel=").append(String.valueOf(this.networkChannel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerInstanceConfig)) {
            return false;
        }

        ContainerInstanceConfig other = (ContainerInstanceConfig) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.shapeConfig, other.shapeConfig)
                && java.util.Objects.equals(this.networkChannel, other.networkChannel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result = (result * PRIME) + (this.shapeConfig == null ? 43 : this.shapeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.networkChannel == null ? 43 : this.networkChannel.hashCode());
        return result;
    }
}

/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Properties related to a resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ResourceConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourceConfiguration
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sparkVersion",
        "driverShape",
        "executorShape",
        "totalExecutors"
    })
    public ResourceConfiguration(
            String sparkVersion, String driverShape, String executorShape, Integer totalExecutors) {
        super();
        this.sparkVersion = sparkVersion;
        this.driverShape = driverShape;
        this.executorShape = executorShape;
        this.totalExecutors = totalExecutors;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The version of the spark used while creating an Oracle Cloud Infrastructure Data Flow application.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sparkVersion")
        private String sparkVersion;

        /**
         * The version of the spark used while creating an Oracle Cloud Infrastructure Data Flow application.
         * @param sparkVersion the value to set
         * @return this builder
         **/
        public Builder sparkVersion(String sparkVersion) {
            this.sparkVersion = sparkVersion;
            this.__explicitlySet__.add("sparkVersion");
            return this;
        }
        /**
         * The VM shape of the driver used while creating an Oracle Cloud Infrastructure Data Flow application. It sets the driver cores and memory.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
        private String driverShape;

        /**
         * The VM shape of the driver used while creating an Oracle Cloud Infrastructure Data Flow application. It sets the driver cores and memory.
         * @param driverShape the value to set
         * @return this builder
         **/
        public Builder driverShape(String driverShape) {
            this.driverShape = driverShape;
            this.__explicitlySet__.add("driverShape");
            return this;
        }
        /**
         * The shape of the executor used while creating an Oracle Cloud Infrastructure Data Flow application. It sets the executor cores and memory.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
        private String executorShape;

        /**
         * The shape of the executor used while creating an Oracle Cloud Infrastructure Data Flow application. It sets the executor cores and memory.
         * @param executorShape the value to set
         * @return this builder
         **/
        public Builder executorShape(String executorShape) {
            this.executorShape = executorShape;
            this.__explicitlySet__.add("executorShape");
            return this;
        }
        /**
         * Number of executor VMs requested while creating an Oracle Cloud Infrastructure Data Flow application.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalExecutors")
        private Integer totalExecutors;

        /**
         * Number of executor VMs requested while creating an Oracle Cloud Infrastructure Data Flow application.
         * @param totalExecutors the value to set
         * @return this builder
         **/
        public Builder totalExecutors(Integer totalExecutors) {
            this.totalExecutors = totalExecutors;
            this.__explicitlySet__.add("totalExecutors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceConfiguration build() {
            ResourceConfiguration model =
                    new ResourceConfiguration(
                            this.sparkVersion,
                            this.driverShape,
                            this.executorShape,
                            this.totalExecutors);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceConfiguration model) {
            if (model.wasPropertyExplicitlySet("sparkVersion")) {
                this.sparkVersion(model.getSparkVersion());
            }
            if (model.wasPropertyExplicitlySet("driverShape")) {
                this.driverShape(model.getDriverShape());
            }
            if (model.wasPropertyExplicitlySet("executorShape")) {
                this.executorShape(model.getExecutorShape());
            }
            if (model.wasPropertyExplicitlySet("totalExecutors")) {
                this.totalExecutors(model.getTotalExecutors());
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
     * The version of the spark used while creating an Oracle Cloud Infrastructure Data Flow application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sparkVersion")
    private final String sparkVersion;

    /**
     * The version of the spark used while creating an Oracle Cloud Infrastructure Data Flow application.
     * @return the value
     **/
    public String getSparkVersion() {
        return sparkVersion;
    }

    /**
     * The VM shape of the driver used while creating an Oracle Cloud Infrastructure Data Flow application. It sets the driver cores and memory.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
    private final String driverShape;

    /**
     * The VM shape of the driver used while creating an Oracle Cloud Infrastructure Data Flow application. It sets the driver cores and memory.
     * @return the value
     **/
    public String getDriverShape() {
        return driverShape;
    }

    /**
     * The shape of the executor used while creating an Oracle Cloud Infrastructure Data Flow application. It sets the executor cores and memory.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
    private final String executorShape;

    /**
     * The shape of the executor used while creating an Oracle Cloud Infrastructure Data Flow application. It sets the executor cores and memory.
     * @return the value
     **/
    public String getExecutorShape() {
        return executorShape;
    }

    /**
     * Number of executor VMs requested while creating an Oracle Cloud Infrastructure Data Flow application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalExecutors")
    private final Integer totalExecutors;

    /**
     * Number of executor VMs requested while creating an Oracle Cloud Infrastructure Data Flow application.
     * @return the value
     **/
    public Integer getTotalExecutors() {
        return totalExecutors;
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
        sb.append("ResourceConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("sparkVersion=").append(String.valueOf(this.sparkVersion));
        sb.append(", driverShape=").append(String.valueOf(this.driverShape));
        sb.append(", executorShape=").append(String.valueOf(this.executorShape));
        sb.append(", totalExecutors=").append(String.valueOf(this.totalExecutors));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceConfiguration)) {
            return false;
        }

        ResourceConfiguration other = (ResourceConfiguration) o;
        return java.util.Objects.equals(this.sparkVersion, other.sparkVersion)
                && java.util.Objects.equals(this.driverShape, other.driverShape)
                && java.util.Objects.equals(this.executorShape, other.executorShape)
                && java.util.Objects.equals(this.totalExecutors, other.totalExecutors)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sparkVersion == null ? 43 : this.sparkVersion.hashCode());
        result = (result * PRIME) + (this.driverShape == null ? 43 : this.driverShape.hashCode());
        result =
                (result * PRIME)
                        + (this.executorShape == null ? 43 : this.executorShape.hashCode());
        result =
                (result * PRIME)
                        + (this.totalExecutors == null ? 43 : this.totalExecutors.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

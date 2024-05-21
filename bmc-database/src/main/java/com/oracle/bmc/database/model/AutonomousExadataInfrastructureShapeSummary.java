/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The shape of the Autonomous Exadata Infrastructure. The shape determines resources to allocate to the Autonomous Exadata Infrastructure (CPU cores, memory and storage).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to an administrator.
 * If you're an administrator who needs to write policies to give users access,
 * see [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AutonomousExadataInfrastructureShapeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutonomousExadataInfrastructureShapeSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "availableCoreCount",
        "minimumCoreCount",
        "coreCountIncrement",
        "minimumNodeCount",
        "maximumNodeCount"
    })
    public AutonomousExadataInfrastructureShapeSummary(
            String name,
            Integer availableCoreCount,
            Integer minimumCoreCount,
            Integer coreCountIncrement,
            Integer minimumNodeCount,
            Integer maximumNodeCount) {
        super();
        this.name = name;
        this.availableCoreCount = availableCoreCount;
        this.minimumCoreCount = minimumCoreCount;
        this.coreCountIncrement = coreCountIncrement;
        this.minimumNodeCount = minimumNodeCount;
        this.maximumNodeCount = maximumNodeCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the shape used for the Autonomous Exadata Infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the shape used for the Autonomous Exadata Infrastructure.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The maximum number of CPU cores that can be enabled on the Autonomous Exadata Infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableCoreCount")
        private Integer availableCoreCount;

        /**
         * The maximum number of CPU cores that can be enabled on the Autonomous Exadata Infrastructure.
         * @param availableCoreCount the value to set
         * @return this builder
         **/
        public Builder availableCoreCount(Integer availableCoreCount) {
            this.availableCoreCount = availableCoreCount;
            this.__explicitlySet__.add("availableCoreCount");
            return this;
        }
        /**
         * The minimum number of CPU cores that can be enabled on the Autonomous Exadata Infrastructure.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minimumCoreCount")
        private Integer minimumCoreCount;

        /**
         * The minimum number of CPU cores that can be enabled on the Autonomous Exadata Infrastructure.
         * @param minimumCoreCount the value to set
         * @return this builder
         **/
        public Builder minimumCoreCount(Integer minimumCoreCount) {
            this.minimumCoreCount = minimumCoreCount;
            this.__explicitlySet__.add("minimumCoreCount");
            return this;
        }
        /**
         * The increment in which core count can be increased or decreased.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("coreCountIncrement")
        private Integer coreCountIncrement;

        /**
         * The increment in which core count can be increased or decreased.
         * @param coreCountIncrement the value to set
         * @return this builder
         **/
        public Builder coreCountIncrement(Integer coreCountIncrement) {
            this.coreCountIncrement = coreCountIncrement;
            this.__explicitlySet__.add("coreCountIncrement");
            return this;
        }
        /**
         * The minimum number of nodes available for the shape.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minimumNodeCount")
        private Integer minimumNodeCount;

        /**
         * The minimum number of nodes available for the shape.
         * @param minimumNodeCount the value to set
         * @return this builder
         **/
        public Builder minimumNodeCount(Integer minimumNodeCount) {
            this.minimumNodeCount = minimumNodeCount;
            this.__explicitlySet__.add("minimumNodeCount");
            return this;
        }
        /**
         * The maximum number of nodes available for the shape.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maximumNodeCount")
        private Integer maximumNodeCount;

        /**
         * The maximum number of nodes available for the shape.
         * @param maximumNodeCount the value to set
         * @return this builder
         **/
        public Builder maximumNodeCount(Integer maximumNodeCount) {
            this.maximumNodeCount = maximumNodeCount;
            this.__explicitlySet__.add("maximumNodeCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousExadataInfrastructureShapeSummary build() {
            AutonomousExadataInfrastructureShapeSummary model =
                    new AutonomousExadataInfrastructureShapeSummary(
                            this.name,
                            this.availableCoreCount,
                            this.minimumCoreCount,
                            this.coreCountIncrement,
                            this.minimumNodeCount,
                            this.maximumNodeCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousExadataInfrastructureShapeSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("availableCoreCount")) {
                this.availableCoreCount(model.getAvailableCoreCount());
            }
            if (model.wasPropertyExplicitlySet("minimumCoreCount")) {
                this.minimumCoreCount(model.getMinimumCoreCount());
            }
            if (model.wasPropertyExplicitlySet("coreCountIncrement")) {
                this.coreCountIncrement(model.getCoreCountIncrement());
            }
            if (model.wasPropertyExplicitlySet("minimumNodeCount")) {
                this.minimumNodeCount(model.getMinimumNodeCount());
            }
            if (model.wasPropertyExplicitlySet("maximumNodeCount")) {
                this.maximumNodeCount(model.getMaximumNodeCount());
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
     * The name of the shape used for the Autonomous Exadata Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the shape used for the Autonomous Exadata Infrastructure.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The maximum number of CPU cores that can be enabled on the Autonomous Exadata Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableCoreCount")
    private final Integer availableCoreCount;

    /**
     * The maximum number of CPU cores that can be enabled on the Autonomous Exadata Infrastructure.
     * @return the value
     **/
    public Integer getAvailableCoreCount() {
        return availableCoreCount;
    }

    /**
     * The minimum number of CPU cores that can be enabled on the Autonomous Exadata Infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minimumCoreCount")
    private final Integer minimumCoreCount;

    /**
     * The minimum number of CPU cores that can be enabled on the Autonomous Exadata Infrastructure.
     * @return the value
     **/
    public Integer getMinimumCoreCount() {
        return minimumCoreCount;
    }

    /**
     * The increment in which core count can be increased or decreased.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("coreCountIncrement")
    private final Integer coreCountIncrement;

    /**
     * The increment in which core count can be increased or decreased.
     * @return the value
     **/
    public Integer getCoreCountIncrement() {
        return coreCountIncrement;
    }

    /**
     * The minimum number of nodes available for the shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minimumNodeCount")
    private final Integer minimumNodeCount;

    /**
     * The minimum number of nodes available for the shape.
     * @return the value
     **/
    public Integer getMinimumNodeCount() {
        return minimumNodeCount;
    }

    /**
     * The maximum number of nodes available for the shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maximumNodeCount")
    private final Integer maximumNodeCount;

    /**
     * The maximum number of nodes available for the shape.
     * @return the value
     **/
    public Integer getMaximumNodeCount() {
        return maximumNodeCount;
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
        sb.append("AutonomousExadataInfrastructureShapeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", availableCoreCount=").append(String.valueOf(this.availableCoreCount));
        sb.append(", minimumCoreCount=").append(String.valueOf(this.minimumCoreCount));
        sb.append(", coreCountIncrement=").append(String.valueOf(this.coreCountIncrement));
        sb.append(", minimumNodeCount=").append(String.valueOf(this.minimumNodeCount));
        sb.append(", maximumNodeCount=").append(String.valueOf(this.maximumNodeCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousExadataInfrastructureShapeSummary)) {
            return false;
        }

        AutonomousExadataInfrastructureShapeSummary other =
                (AutonomousExadataInfrastructureShapeSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.availableCoreCount, other.availableCoreCount)
                && java.util.Objects.equals(this.minimumCoreCount, other.minimumCoreCount)
                && java.util.Objects.equals(this.coreCountIncrement, other.coreCountIncrement)
                && java.util.Objects.equals(this.minimumNodeCount, other.minimumNodeCount)
                && java.util.Objects.equals(this.maximumNodeCount, other.maximumNodeCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.availableCoreCount == null
                                ? 43
                                : this.availableCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.minimumCoreCount == null ? 43 : this.minimumCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.coreCountIncrement == null
                                ? 43
                                : this.coreCountIncrement.hashCode());
        result =
                (result * PRIME)
                        + (this.minimumNodeCount == null ? 43 : this.minimumNodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.maximumNodeCount == null ? 43 : this.maximumNodeCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

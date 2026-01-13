/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.model;

/**
 * Service managed Fleet configuration of the batch context. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateServiceManagedFleetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateServiceManagedFleetDetails extends CreateFleetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the service managed fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the service managed fleet.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private FleetShape shape;

        public Builder shape(FleetShape shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** Maximum number of concurrent tasks for the service managed fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxConcurrentTasks")
        private Integer maxConcurrentTasks;

        /**
         * Maximum number of concurrent tasks for the service managed fleet.
         *
         * @param maxConcurrentTasks the value to set
         * @return this builder
         */
        public Builder maxConcurrentTasks(Integer maxConcurrentTasks) {
            this.maxConcurrentTasks = maxConcurrentTasks;
            this.__explicitlySet__.add("maxConcurrentTasks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateServiceManagedFleetDetails build() {
            CreateServiceManagedFleetDetails model =
                    new CreateServiceManagedFleetDetails(
                            this.name, this.shape, this.maxConcurrentTasks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateServiceManagedFleetDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("maxConcurrentTasks")) {
                this.maxConcurrentTasks(model.getMaxConcurrentTasks());
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

    @Deprecated
    public CreateServiceManagedFleetDetails(
            String name, FleetShape shape, Integer maxConcurrentTasks) {
        super();
        this.name = name;
        this.shape = shape;
        this.maxConcurrentTasks = maxConcurrentTasks;
    }

    /** Name of the service managed fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the service managed fleet.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final FleetShape shape;

    public FleetShape getShape() {
        return shape;
    }

    /** Maximum number of concurrent tasks for the service managed fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxConcurrentTasks")
    private final Integer maxConcurrentTasks;

    /**
     * Maximum number of concurrent tasks for the service managed fleet.
     *
     * @return the value
     */
    public Integer getMaxConcurrentTasks() {
        return maxConcurrentTasks;
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
        sb.append("CreateServiceManagedFleetDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", maxConcurrentTasks=").append(String.valueOf(this.maxConcurrentTasks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateServiceManagedFleetDetails)) {
            return false;
        }

        CreateServiceManagedFleetDetails other = (CreateServiceManagedFleetDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.maxConcurrentTasks, other.maxConcurrentTasks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.maxConcurrentTasks == null
                                ? 43
                                : this.maxConcurrentTasks.hashCode());
        return result;
    }
}

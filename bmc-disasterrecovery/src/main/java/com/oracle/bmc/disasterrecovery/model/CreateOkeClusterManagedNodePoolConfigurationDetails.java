/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Create managed node pool configuration properties for an OKE member. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateOkeClusterManagedNodePoolConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOkeClusterManagedNodePoolConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "minimum", "maximum"})
    public CreateOkeClusterManagedNodePoolConfigurationDetails(
            String id, Integer minimum, Integer maximum) {
        super();
        this.id = id;
        this.minimum = minimum;
        this.maximum = maximum;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the managed node pool in OKE cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the managed node pool in OKE cluster.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The minimum number to which nodes in the managed node pool could be scaled down. */
        @com.fasterxml.jackson.annotation.JsonProperty("minimum")
        private Integer minimum;

        /**
         * The minimum number to which nodes in the managed node pool could be scaled down.
         *
         * @param minimum the value to set
         * @return this builder
         */
        public Builder minimum(Integer minimum) {
            this.minimum = minimum;
            this.__explicitlySet__.add("minimum");
            return this;
        }
        /** The maximum number to which nodes in the managed node pool could be scaled up. */
        @com.fasterxml.jackson.annotation.JsonProperty("maximum")
        private Integer maximum;

        /**
         * The maximum number to which nodes in the managed node pool could be scaled up.
         *
         * @param maximum the value to set
         * @return this builder
         */
        public Builder maximum(Integer maximum) {
            this.maximum = maximum;
            this.__explicitlySet__.add("maximum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOkeClusterManagedNodePoolConfigurationDetails build() {
            CreateOkeClusterManagedNodePoolConfigurationDetails model =
                    new CreateOkeClusterManagedNodePoolConfigurationDetails(
                            this.id, this.minimum, this.maximum);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOkeClusterManagedNodePoolConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("minimum")) {
                this.minimum(model.getMinimum());
            }
            if (model.wasPropertyExplicitlySet("maximum")) {
                this.maximum(model.getMaximum());
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

    /** The OCID of the managed node pool in OKE cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the managed node pool in OKE cluster.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The minimum number to which nodes in the managed node pool could be scaled down. */
    @com.fasterxml.jackson.annotation.JsonProperty("minimum")
    private final Integer minimum;

    /**
     * The minimum number to which nodes in the managed node pool could be scaled down.
     *
     * @return the value
     */
    public Integer getMinimum() {
        return minimum;
    }

    /** The maximum number to which nodes in the managed node pool could be scaled up. */
    @com.fasterxml.jackson.annotation.JsonProperty("maximum")
    private final Integer maximum;

    /**
     * The maximum number to which nodes in the managed node pool could be scaled up.
     *
     * @return the value
     */
    public Integer getMaximum() {
        return maximum;
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
        sb.append("CreateOkeClusterManagedNodePoolConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", minimum=").append(String.valueOf(this.minimum));
        sb.append(", maximum=").append(String.valueOf(this.maximum));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOkeClusterManagedNodePoolConfigurationDetails)) {
            return false;
        }

        CreateOkeClusterManagedNodePoolConfigurationDetails other =
                (CreateOkeClusterManagedNodePoolConfigurationDetails) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.minimum, other.minimum)
                && java.util.Objects.equals(this.maximum, other.maximum)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.minimum == null ? 43 : this.minimum.hashCode());
        result = (result * PRIME) + (this.maximum == null ? 43 : this.maximum.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

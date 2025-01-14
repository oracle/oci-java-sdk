/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The configuration details for resource pool <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ResourcePoolSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourcePoolSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"poolSize", "isDisabled"})
    public ResourcePoolSummary(Integer poolSize, Boolean isDisabled) {
        super();
        this.poolSize = poolSize;
        this.isDisabled = isDisabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Resource pool size. */
        @com.fasterxml.jackson.annotation.JsonProperty("poolSize")
        private Integer poolSize;

        /**
         * Resource pool size.
         *
         * @param poolSize the value to set
         * @return this builder
         */
        public Builder poolSize(Integer poolSize) {
            this.poolSize = poolSize;
            this.__explicitlySet__.add("poolSize");
            return this;
        }
        /** Indicates if the resource pool should be deleted for the Autonomous Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDisabled")
        private Boolean isDisabled;

        /**
         * Indicates if the resource pool should be deleted for the Autonomous Database.
         *
         * @param isDisabled the value to set
         * @return this builder
         */
        public Builder isDisabled(Boolean isDisabled) {
            this.isDisabled = isDisabled;
            this.__explicitlySet__.add("isDisabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourcePoolSummary build() {
            ResourcePoolSummary model = new ResourcePoolSummary(this.poolSize, this.isDisabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourcePoolSummary model) {
            if (model.wasPropertyExplicitlySet("poolSize")) {
                this.poolSize(model.getPoolSize());
            }
            if (model.wasPropertyExplicitlySet("isDisabled")) {
                this.isDisabled(model.getIsDisabled());
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

    /** Resource pool size. */
    @com.fasterxml.jackson.annotation.JsonProperty("poolSize")
    private final Integer poolSize;

    /**
     * Resource pool size.
     *
     * @return the value
     */
    public Integer getPoolSize() {
        return poolSize;
    }

    /** Indicates if the resource pool should be deleted for the Autonomous Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDisabled")
    private final Boolean isDisabled;

    /**
     * Indicates if the resource pool should be deleted for the Autonomous Database.
     *
     * @return the value
     */
    public Boolean getIsDisabled() {
        return isDisabled;
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
        sb.append("ResourcePoolSummary(");
        sb.append("super=").append(super.toString());
        sb.append("poolSize=").append(String.valueOf(this.poolSize));
        sb.append(", isDisabled=").append(String.valueOf(this.isDisabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourcePoolSummary)) {
            return false;
        }

        ResourcePoolSummary other = (ResourcePoolSummary) o;
        return java.util.Objects.equals(this.poolSize, other.poolSize)
                && java.util.Objects.equals(this.isDisabled, other.isDisabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.poolSize == null ? 43 : this.poolSize.hashCode());
        result = (result * PRIME) + (this.isDisabled == null ? 43 : this.isDisabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

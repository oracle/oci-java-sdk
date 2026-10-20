/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Update Sandbox Warm Pool Details. <br>
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
        builder = UpdateSandboxWarmPoolDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateSandboxWarmPoolDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"desiredCapacity"})
    public UpdateSandboxWarmPoolDetails(Integer desiredCapacity) {
        super();
        this.desiredCapacity = desiredCapacity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Replacement idle target. If omitted, the current desired capacity is preserved. An empty
         * update object is allowed; an explicit null value is not allowed. Image, shape, name and
         * type are immutable. Zero pauses idle prewarming. Once the pool is ACTIVE, named-pool
         * Sandbox creation can still cold-start from its available applied template when no
         * eligible warm member is available. Reserved MANAGED default entries may be resized
         * through the existing Project configuration workflow. Named MANAGED and CUSTOM pools use
         * the same warm-pool lifecycle workflows. Existing customer Sandboxes continue, and unnamed
         * Sandbox creation keeps its existing behavior.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("desiredCapacity")
        private Integer desiredCapacity;

        /**
         * Replacement idle target. If omitted, the current desired capacity is preserved. An empty
         * update object is allowed; an explicit null value is not allowed. Image, shape, name and
         * type are immutable. Zero pauses idle prewarming. Once the pool is ACTIVE, named-pool
         * Sandbox creation can still cold-start from its available applied template when no
         * eligible warm member is available. Reserved MANAGED default entries may be resized
         * through the existing Project configuration workflow. Named MANAGED and CUSTOM pools use
         * the same warm-pool lifecycle workflows. Existing customer Sandboxes continue, and unnamed
         * Sandbox creation keeps its existing behavior.
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

        public UpdateSandboxWarmPoolDetails build() {
            UpdateSandboxWarmPoolDetails model =
                    new UpdateSandboxWarmPoolDetails(this.desiredCapacity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSandboxWarmPoolDetails model) {
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

    /**
     * Replacement idle target. If omitted, the current desired capacity is preserved. An empty
     * update object is allowed; an explicit null value is not allowed. Image, shape, name and type
     * are immutable. Zero pauses idle prewarming. Once the pool is ACTIVE, named-pool Sandbox
     * creation can still cold-start from its available applied template when no eligible warm
     * member is available. Reserved MANAGED default entries may be resized through the existing
     * Project configuration workflow. Named MANAGED and CUSTOM pools use the same warm-pool
     * lifecycle workflows. Existing customer Sandboxes continue, and unnamed Sandbox creation keeps
     * its existing behavior.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("desiredCapacity")
    private final Integer desiredCapacity;

    /**
     * Replacement idle target. If omitted, the current desired capacity is preserved. An empty
     * update object is allowed; an explicit null value is not allowed. Image, shape, name and type
     * are immutable. Zero pauses idle prewarming. Once the pool is ACTIVE, named-pool Sandbox
     * creation can still cold-start from its available applied template when no eligible warm
     * member is available. Reserved MANAGED default entries may be resized through the existing
     * Project configuration workflow. Named MANAGED and CUSTOM pools use the same warm-pool
     * lifecycle workflows. Existing customer Sandboxes continue, and unnamed Sandbox creation keeps
     * its existing behavior.
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
        sb.append("UpdateSandboxWarmPoolDetails(");
        sb.append("super=").append(super.toString());
        sb.append("desiredCapacity=").append(String.valueOf(this.desiredCapacity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSandboxWarmPoolDetails)) {
            return false;
        }

        UpdateSandboxWarmPoolDetails other = (UpdateSandboxWarmPoolDetails) o;
        return java.util.Objects.equals(this.desiredCapacity, other.desiredCapacity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.desiredCapacity == null ? 43 : this.desiredCapacity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

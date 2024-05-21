/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * The capacity of a hosting type dedicated AI cluster.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DedicatedAiClusterHostingCapacity.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "capacityType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DedicatedAiClusterHostingCapacity extends DedicatedAiClusterCapacity {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The total number of endpoints that can be hosted on this dedicated AI cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalEndpointCapacity")
        private Integer totalEndpointCapacity;

        /**
         * The total number of endpoints that can be hosted on this dedicated AI cluster.
         * @param totalEndpointCapacity the value to set
         * @return this builder
         **/
        public Builder totalEndpointCapacity(Integer totalEndpointCapacity) {
            this.totalEndpointCapacity = totalEndpointCapacity;
            this.__explicitlySet__.add("totalEndpointCapacity");
            return this;
        }
        /**
         * The number of endpoints hosted on this dedicated AI cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usedEndpointCapacity")
        private Integer usedEndpointCapacity;

        /**
         * The number of endpoints hosted on this dedicated AI cluster.
         * @param usedEndpointCapacity the value to set
         * @return this builder
         **/
        public Builder usedEndpointCapacity(Integer usedEndpointCapacity) {
            this.usedEndpointCapacity = usedEndpointCapacity;
            this.__explicitlySet__.add("usedEndpointCapacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DedicatedAiClusterHostingCapacity build() {
            DedicatedAiClusterHostingCapacity model =
                    new DedicatedAiClusterHostingCapacity(
                            this.totalEndpointCapacity, this.usedEndpointCapacity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DedicatedAiClusterHostingCapacity model) {
            if (model.wasPropertyExplicitlySet("totalEndpointCapacity")) {
                this.totalEndpointCapacity(model.getTotalEndpointCapacity());
            }
            if (model.wasPropertyExplicitlySet("usedEndpointCapacity")) {
                this.usedEndpointCapacity(model.getUsedEndpointCapacity());
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
    public DedicatedAiClusterHostingCapacity(
            Integer totalEndpointCapacity, Integer usedEndpointCapacity) {
        super();
        this.totalEndpointCapacity = totalEndpointCapacity;
        this.usedEndpointCapacity = usedEndpointCapacity;
    }

    /**
     * The total number of endpoints that can be hosted on this dedicated AI cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalEndpointCapacity")
    private final Integer totalEndpointCapacity;

    /**
     * The total number of endpoints that can be hosted on this dedicated AI cluster.
     * @return the value
     **/
    public Integer getTotalEndpointCapacity() {
        return totalEndpointCapacity;
    }

    /**
     * The number of endpoints hosted on this dedicated AI cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usedEndpointCapacity")
    private final Integer usedEndpointCapacity;

    /**
     * The number of endpoints hosted on this dedicated AI cluster.
     * @return the value
     **/
    public Integer getUsedEndpointCapacity() {
        return usedEndpointCapacity;
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
        sb.append("DedicatedAiClusterHostingCapacity(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", totalEndpointCapacity=").append(String.valueOf(this.totalEndpointCapacity));
        sb.append(", usedEndpointCapacity=").append(String.valueOf(this.usedEndpointCapacity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DedicatedAiClusterHostingCapacity)) {
            return false;
        }

        DedicatedAiClusterHostingCapacity other = (DedicatedAiClusterHostingCapacity) o;
        return java.util.Objects.equals(this.totalEndpointCapacity, other.totalEndpointCapacity)
                && java.util.Objects.equals(this.usedEndpointCapacity, other.usedEndpointCapacity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.totalEndpointCapacity == null
                                ? 43
                                : this.totalEndpointCapacity.hashCode());
        result =
                (result * PRIME)
                        + (this.usedEndpointCapacity == null
                                ? 43
                                : this.usedEndpointCapacity.hashCode());
        return result;
    }
}

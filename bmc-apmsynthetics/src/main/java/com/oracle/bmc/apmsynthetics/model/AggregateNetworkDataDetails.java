/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of the vantage point and corresponding execution times.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AggregateNetworkDataDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AggregateNetworkDataDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vantagePointExecutionTimes"})
    public AggregateNetworkDataDetails(
            java.util.List<VantagePointExecution> vantagePointExecutionTimes) {
        super();
        this.vantagePointExecutionTimes = vantagePointExecutionTimes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of VantagePointExecution items.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vantagePointExecutionTimes")
        private java.util.List<VantagePointExecution> vantagePointExecutionTimes;

        /**
         * List of VantagePointExecution items.
         * @param vantagePointExecutionTimes the value to set
         * @return this builder
         **/
        public Builder vantagePointExecutionTimes(
                java.util.List<VantagePointExecution> vantagePointExecutionTimes) {
            this.vantagePointExecutionTimes = vantagePointExecutionTimes;
            this.__explicitlySet__.add("vantagePointExecutionTimes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AggregateNetworkDataDetails build() {
            AggregateNetworkDataDetails model =
                    new AggregateNetworkDataDetails(this.vantagePointExecutionTimes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AggregateNetworkDataDetails model) {
            if (model.wasPropertyExplicitlySet("vantagePointExecutionTimes")) {
                this.vantagePointExecutionTimes(model.getVantagePointExecutionTimes());
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
     * List of VantagePointExecution items.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vantagePointExecutionTimes")
    private final java.util.List<VantagePointExecution> vantagePointExecutionTimes;

    /**
     * List of VantagePointExecution items.
     * @return the value
     **/
    public java.util.List<VantagePointExecution> getVantagePointExecutionTimes() {
        return vantagePointExecutionTimes;
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
        sb.append("AggregateNetworkDataDetails(");
        sb.append("super=").append(super.toString());
        sb.append("vantagePointExecutionTimes=")
                .append(String.valueOf(this.vantagePointExecutionTimes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AggregateNetworkDataDetails)) {
            return false;
        }

        AggregateNetworkDataDetails other = (AggregateNetworkDataDetails) o;
        return java.util.Objects.equals(
                        this.vantagePointExecutionTimes, other.vantagePointExecutionTimes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.vantagePointExecutionTimes == null
                                ? 43
                                : this.vantagePointExecutionTimes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

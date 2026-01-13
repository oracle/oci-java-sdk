/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * If a volume is being throttled at the current setting for a certain period of time, auto-tune
 * will gradually increase the volume\u2019s performance limited up to Maximum VPUs/GB. After the
 * volume has been idle at the current setting for a certain period of time, auto-tune will
 * gradually decrease the volume\u2019s performance limited down to Default/Minimum VPUs/GB. <br>
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
        builder = InstanceConfigurationPerformanceBasedAutotunePolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "autotuneType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstanceConfigurationPerformanceBasedAutotunePolicy
        extends InstanceConfigurationAutotunePolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This will be the maximum VPUs/GB performance level that the volume will be auto-tuned
         * temporarily based on performance monitoring.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxVpusPerGB")
        private Long maxVpusPerGB;

        /**
         * This will be the maximum VPUs/GB performance level that the volume will be auto-tuned
         * temporarily based on performance monitoring.
         *
         * @param maxVpusPerGB the value to set
         * @return this builder
         */
        public Builder maxVpusPerGB(Long maxVpusPerGB) {
            this.maxVpusPerGB = maxVpusPerGB;
            this.__explicitlySet__.add("maxVpusPerGB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceConfigurationPerformanceBasedAutotunePolicy build() {
            InstanceConfigurationPerformanceBasedAutotunePolicy model =
                    new InstanceConfigurationPerformanceBasedAutotunePolicy(this.maxVpusPerGB);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceConfigurationPerformanceBasedAutotunePolicy model) {
            if (model.wasPropertyExplicitlySet("maxVpusPerGB")) {
                this.maxVpusPerGB(model.getMaxVpusPerGB());
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
    public InstanceConfigurationPerformanceBasedAutotunePolicy(Long maxVpusPerGB) {
        super();
        this.maxVpusPerGB = maxVpusPerGB;
    }

    /**
     * This will be the maximum VPUs/GB performance level that the volume will be auto-tuned
     * temporarily based on performance monitoring.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxVpusPerGB")
    private final Long maxVpusPerGB;

    /**
     * This will be the maximum VPUs/GB performance level that the volume will be auto-tuned
     * temporarily based on performance monitoring.
     *
     * @return the value
     */
    public Long getMaxVpusPerGB() {
        return maxVpusPerGB;
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
        sb.append("InstanceConfigurationPerformanceBasedAutotunePolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", maxVpusPerGB=").append(String.valueOf(this.maxVpusPerGB));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceConfigurationPerformanceBasedAutotunePolicy)) {
            return false;
        }

        InstanceConfigurationPerformanceBasedAutotunePolicy other =
                (InstanceConfigurationPerformanceBasedAutotunePolicy) o;
        return java.util.Objects.equals(this.maxVpusPerGB, other.maxVpusPerGB)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.maxVpusPerGB == null ? 43 : this.maxVpusPerGB.hashCode());
        return result;
    }
}

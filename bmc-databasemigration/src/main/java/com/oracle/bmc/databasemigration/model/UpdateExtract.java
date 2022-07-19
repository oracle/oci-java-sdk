/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Parameters for Extract processes.
 * If an empty object is specified, the stored Extract details will be removed.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpdateExtract.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateExtract {
    @Deprecated
    @java.beans.ConstructorProperties({"performanceProfile", "longTransDuration"})
    public UpdateExtract(ExtractPerformanceProfile performanceProfile, Integer longTransDuration) {
        super();
        this.performanceProfile = performanceProfile;
        this.longTransDuration = longTransDuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Extract performance.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("performanceProfile")
        private ExtractPerformanceProfile performanceProfile;

        /**
         * Extract performance.
         *
         * @param performanceProfile the value to set
         * @return this builder
         **/
        public Builder performanceProfile(ExtractPerformanceProfile performanceProfile) {
            this.performanceProfile = performanceProfile;
            this.__explicitlySet__.add("performanceProfile");
            return this;
        }
        /**
         * Length of time (in seconds) that a transaction can be open before Extract generates a warning message that the transaction is long-running.
         * If not specified, Extract will not generate a warning on long-running transactions.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("longTransDuration")
        private Integer longTransDuration;

        /**
         * Length of time (in seconds) that a transaction can be open before Extract generates a warning message that the transaction is long-running.
         * If not specified, Extract will not generate a warning on long-running transactions.
         *
         * @param longTransDuration the value to set
         * @return this builder
         **/
        public Builder longTransDuration(Integer longTransDuration) {
            this.longTransDuration = longTransDuration;
            this.__explicitlySet__.add("longTransDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateExtract build() {
            UpdateExtract __instance__ = new UpdateExtract(performanceProfile, longTransDuration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateExtract o) {
            Builder copiedBuilder =
                    performanceProfile(o.getPerformanceProfile())
                            .longTransDuration(o.getLongTransDuration());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Extract performance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("performanceProfile")
    private final ExtractPerformanceProfile performanceProfile;

    /**
     * Extract performance.
     *
     * @return the value
     **/
    public ExtractPerformanceProfile getPerformanceProfile() {
        return performanceProfile;
    }

    /**
     * Length of time (in seconds) that a transaction can be open before Extract generates a warning message that the transaction is long-running.
     * If not specified, Extract will not generate a warning on long-running transactions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("longTransDuration")
    private final Integer longTransDuration;

    /**
     * Length of time (in seconds) that a transaction can be open before Extract generates a warning message that the transaction is long-running.
     * If not specified, Extract will not generate a warning on long-running transactions.
     *
     * @return the value
     **/
    public Integer getLongTransDuration() {
        return longTransDuration;
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
        sb.append("UpdateExtract(");
        sb.append("performanceProfile=").append(String.valueOf(this.performanceProfile));
        sb.append(", longTransDuration=").append(String.valueOf(this.longTransDuration));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateExtract)) {
            return false;
        }

        UpdateExtract other = (UpdateExtract) o;
        return java.util.Objects.equals(this.performanceProfile, other.performanceProfile)
                && java.util.Objects.equals(this.longTransDuration, other.longTransDuration)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.performanceProfile == null
                                ? 43
                                : this.performanceProfile.hashCode());
        result =
                (result * PRIME)
                        + (this.longTransDuration == null ? 43 : this.longTransDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}

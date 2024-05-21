/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Parameters for GoldenGate Extract processes.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateExtract.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateExtract extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"performanceProfile", "longTransDuration"})
    public CreateExtract(ExtractPerformanceProfile performanceProfile, Integer longTransDuration) {
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

        public CreateExtract build() {
            CreateExtract model =
                    new CreateExtract(this.performanceProfile, this.longTransDuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExtract model) {
            if (model.wasPropertyExplicitlySet("performanceProfile")) {
                this.performanceProfile(model.getPerformanceProfile());
            }
            if (model.wasPropertyExplicitlySet("longTransDuration")) {
                this.longTransDuration(model.getLongTransDuration());
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
        sb.append("CreateExtract(");
        sb.append("super=").append(super.toString());
        sb.append("performanceProfile=").append(String.valueOf(this.performanceProfile));
        sb.append(", longTransDuration=").append(String.valueOf(this.longTransDuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateExtract)) {
            return false;
        }

        CreateExtract other = (CreateExtract) o;
        return java.util.Objects.equals(this.performanceProfile, other.performanceProfile)
                && java.util.Objects.equals(this.longTransDuration, other.longTransDuration)
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

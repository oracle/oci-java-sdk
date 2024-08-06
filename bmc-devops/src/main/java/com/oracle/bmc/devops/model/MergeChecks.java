/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Criteria which must be satisfied to merge a pull request. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MergeChecks.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MergeChecks extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"lastBuildSucceeded"})
    public MergeChecks(MergeCheckSettingsValue lastBuildSucceeded) {
        super();
        this.lastBuildSucceeded = lastBuildSucceeded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates whether or not a pull request must have a successful build run and no queued
         * builds before it can be merged
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastBuildSucceeded")
        private MergeCheckSettingsValue lastBuildSucceeded;

        /**
         * Indicates whether or not a pull request must have a successful build run and no queued
         * builds before it can be merged
         *
         * @param lastBuildSucceeded the value to set
         * @return this builder
         */
        public Builder lastBuildSucceeded(MergeCheckSettingsValue lastBuildSucceeded) {
            this.lastBuildSucceeded = lastBuildSucceeded;
            this.__explicitlySet__.add("lastBuildSucceeded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MergeChecks build() {
            MergeChecks model = new MergeChecks(this.lastBuildSucceeded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MergeChecks model) {
            if (model.wasPropertyExplicitlySet("lastBuildSucceeded")) {
                this.lastBuildSucceeded(model.getLastBuildSucceeded());
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
     * Indicates whether or not a pull request must have a successful build run and no queued builds
     * before it can be merged
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastBuildSucceeded")
    private final MergeCheckSettingsValue lastBuildSucceeded;

    /**
     * Indicates whether or not a pull request must have a successful build run and no queued builds
     * before it can be merged
     *
     * @return the value
     */
    public MergeCheckSettingsValue getLastBuildSucceeded() {
        return lastBuildSucceeded;
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
        sb.append("MergeChecks(");
        sb.append("super=").append(super.toString());
        sb.append("lastBuildSucceeded=").append(String.valueOf(this.lastBuildSucceeded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MergeChecks)) {
            return false;
        }

        MergeChecks other = (MergeChecks) o;
        return java.util.Objects.equals(this.lastBuildSucceeded, other.lastBuildSucceeded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.lastBuildSucceeded == null
                                ? 43
                                : this.lastBuildSucceeded.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

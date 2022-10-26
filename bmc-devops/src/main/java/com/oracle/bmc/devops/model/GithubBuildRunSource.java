/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies details of build run through GitHub. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GithubBuildRunSource.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class GithubBuildRunSource extends BuildRunSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The trigger that invoked the build run. */
        @com.fasterxml.jackson.annotation.JsonProperty("triggerId")
        private String triggerId;

        /**
         * The trigger that invoked the build run.
         *
         * @param triggerId the value to set
         * @return this builder
         */
        public Builder triggerId(String triggerId) {
            this.triggerId = triggerId;
            this.__explicitlySet__.add("triggerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("triggerInfo")
        private TriggerInfo triggerInfo;

        public Builder triggerInfo(TriggerInfo triggerInfo) {
            this.triggerInfo = triggerInfo;
            this.__explicitlySet__.add("triggerInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GithubBuildRunSource build() {
            GithubBuildRunSource model = new GithubBuildRunSource(this.triggerId, this.triggerInfo);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GithubBuildRunSource model) {
            if (model.wasPropertyExplicitlySet("triggerId")) {
                this.triggerId(model.getTriggerId());
            }
            if (model.wasPropertyExplicitlySet("triggerInfo")) {
                this.triggerInfo(model.getTriggerInfo());
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
    public GithubBuildRunSource(String triggerId, TriggerInfo triggerInfo) {
        super();
        this.triggerId = triggerId;
        this.triggerInfo = triggerInfo;
    }

    /** The trigger that invoked the build run. */
    @com.fasterxml.jackson.annotation.JsonProperty("triggerId")
    private final String triggerId;

    /**
     * The trigger that invoked the build run.
     *
     * @return the value
     */
    public String getTriggerId() {
        return triggerId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("triggerInfo")
    private final TriggerInfo triggerInfo;

    public TriggerInfo getTriggerInfo() {
        return triggerInfo;
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
        sb.append("GithubBuildRunSource(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", triggerId=").append(String.valueOf(this.triggerId));
        sb.append(", triggerInfo=").append(String.valueOf(this.triggerInfo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GithubBuildRunSource)) {
            return false;
        }

        GithubBuildRunSource other = (GithubBuildRunSource) o;
        return java.util.Objects.equals(this.triggerId, other.triggerId)
                && java.util.Objects.equals(this.triggerInfo, other.triggerInfo)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.triggerId == null ? 43 : this.triggerId.hashCode());
        result = (result * PRIME) + (this.triggerInfo == null ? 43 : this.triggerInfo.hashCode());
        return result;
    }
}

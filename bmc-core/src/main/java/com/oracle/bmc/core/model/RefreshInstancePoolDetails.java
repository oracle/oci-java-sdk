/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The data to start an instance refresh for an instance pool. <br>
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
        builder = RefreshInstancePoolDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RefreshInstancePoolDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"maxHealthyPercent", "warmupSeconds", "isFullRefresh"})
    public RefreshInstancePoolDetails(
            Integer maxHealthyPercent, Integer warmupSeconds, Boolean isFullRefresh) {
        super();
        this.maxHealthyPercent = maxHealthyPercent;
        this.warmupSeconds = warmupSeconds;
        this.isFullRefresh = isFullRefresh;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The maximum percentage of healthy instances that can be in the pool during the refresh.
         * The service uses this value to calculate launch-before-terminate surge capacity.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxHealthyPercent")
        private Integer maxHealthyPercent;

        /**
         * The maximum percentage of healthy instances that can be in the pool during the refresh.
         * The service uses this value to calculate launch-before-terminate surge capacity.
         *
         * @param maxHealthyPercent the value to set
         * @return this builder
         */
        public Builder maxHealthyPercent(Integer maxHealthyPercent) {
            this.maxHealthyPercent = maxHealthyPercent;
            this.__explicitlySet__.add("maxHealthyPercent");
            return this;
        }
        /**
         * The number of seconds to wait after replacement instances are running and startup
         * lifecycle actions are complete before terminating old instances in the batch.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("warmupSeconds")
        private Integer warmupSeconds;

        /**
         * The number of seconds to wait after replacement instances are running and startup
         * lifecycle actions are complete before terminating old instances in the batch.
         *
         * @param warmupSeconds the value to set
         * @return this builder
         */
        public Builder warmupSeconds(Integer warmupSeconds) {
            this.warmupSeconds = warmupSeconds;
            this.__explicitlySet__.add("warmupSeconds");
            return this;
        }
        /**
         * Whether to refresh all eligible instances that existed when the refresh started, even if
         * they were launched from the target instance configuration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isFullRefresh")
        private Boolean isFullRefresh;

        /**
         * Whether to refresh all eligible instances that existed when the refresh started, even if
         * they were launched from the target instance configuration.
         *
         * @param isFullRefresh the value to set
         * @return this builder
         */
        public Builder isFullRefresh(Boolean isFullRefresh) {
            this.isFullRefresh = isFullRefresh;
            this.__explicitlySet__.add("isFullRefresh");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RefreshInstancePoolDetails build() {
            RefreshInstancePoolDetails model =
                    new RefreshInstancePoolDetails(
                            this.maxHealthyPercent, this.warmupSeconds, this.isFullRefresh);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RefreshInstancePoolDetails model) {
            if (model.wasPropertyExplicitlySet("maxHealthyPercent")) {
                this.maxHealthyPercent(model.getMaxHealthyPercent());
            }
            if (model.wasPropertyExplicitlySet("warmupSeconds")) {
                this.warmupSeconds(model.getWarmupSeconds());
            }
            if (model.wasPropertyExplicitlySet("isFullRefresh")) {
                this.isFullRefresh(model.getIsFullRefresh());
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
     * The maximum percentage of healthy instances that can be in the pool during the refresh. The
     * service uses this value to calculate launch-before-terminate surge capacity.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxHealthyPercent")
    private final Integer maxHealthyPercent;

    /**
     * The maximum percentage of healthy instances that can be in the pool during the refresh. The
     * service uses this value to calculate launch-before-terminate surge capacity.
     *
     * @return the value
     */
    public Integer getMaxHealthyPercent() {
        return maxHealthyPercent;
    }

    /**
     * The number of seconds to wait after replacement instances are running and startup lifecycle
     * actions are complete before terminating old instances in the batch.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("warmupSeconds")
    private final Integer warmupSeconds;

    /**
     * The number of seconds to wait after replacement instances are running and startup lifecycle
     * actions are complete before terminating old instances in the batch.
     *
     * @return the value
     */
    public Integer getWarmupSeconds() {
        return warmupSeconds;
    }

    /**
     * Whether to refresh all eligible instances that existed when the refresh started, even if they
     * were launched from the target instance configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isFullRefresh")
    private final Boolean isFullRefresh;

    /**
     * Whether to refresh all eligible instances that existed when the refresh started, even if they
     * were launched from the target instance configuration.
     *
     * @return the value
     */
    public Boolean getIsFullRefresh() {
        return isFullRefresh;
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
        sb.append("RefreshInstancePoolDetails(");
        sb.append("super=").append(super.toString());
        sb.append("maxHealthyPercent=").append(String.valueOf(this.maxHealthyPercent));
        sb.append(", warmupSeconds=").append(String.valueOf(this.warmupSeconds));
        sb.append(", isFullRefresh=").append(String.valueOf(this.isFullRefresh));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RefreshInstancePoolDetails)) {
            return false;
        }

        RefreshInstancePoolDetails other = (RefreshInstancePoolDetails) o;
        return java.util.Objects.equals(this.maxHealthyPercent, other.maxHealthyPercent)
                && java.util.Objects.equals(this.warmupSeconds, other.warmupSeconds)
                && java.util.Objects.equals(this.isFullRefresh, other.isFullRefresh)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.maxHealthyPercent == null ? 43 : this.maxHealthyPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.warmupSeconds == null ? 43 : this.warmupSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.isFullRefresh == null ? 43 : this.isFullRefresh.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

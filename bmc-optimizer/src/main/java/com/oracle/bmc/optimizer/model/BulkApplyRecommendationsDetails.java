/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * Details about bulk recommendation actions.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BulkApplyRecommendationsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BulkApplyRecommendationsDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("resourceActionIds")
        private java.util.List<String> resourceActionIds;

        public Builder resourceActionIds(java.util.List<String> resourceActionIds) {
            this.resourceActionIds = resourceActionIds;
            this.__explicitlySet__.add("resourceActionIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actions")
        private java.util.List<BulkApplyResourceAction> actions;

        public Builder actions(java.util.List<BulkApplyResourceAction> actions) {
            this.actions = actions;
            this.__explicitlySet__.add("actions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStatusEnd")
        private java.util.Date timeStatusEnd;

        public Builder timeStatusEnd(java.util.Date timeStatusEnd) {
            this.timeStatusEnd = timeStatusEnd;
            this.__explicitlySet__.add("timeStatusEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkApplyRecommendationsDetails build() {
            BulkApplyRecommendationsDetails __instance__ =
                    new BulkApplyRecommendationsDetails(
                            resourceActionIds, actions, status, timeStatusEnd);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkApplyRecommendationsDetails o) {
            Builder copiedBuilder =
                    resourceActionIds(o.getResourceActionIds())
                            .actions(o.getActions())
                            .status(o.getStatus())
                            .timeStatusEnd(o.getTimeStatusEnd());

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

    /**
     * The unique OCIDs of the resource actions that recommendations are applied to.
     * <p>
     * This field is deprecated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceActionIds")
    java.util.List<String> resourceActionIds;

    /**
     * The unique resource actions that recommendations are applied to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actions")
    java.util.List<BulkApplyResourceAction> actions;

    /**
     * The current status of the recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    /**
     * The date and time the current status will change. The format is defined by RFC3339.
     * <p>
     * For example, "The current {@code postponed} status of the resource action will end and change to {@code pending} on this
     * date and time."
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStatusEnd")
    java.util.Date timeStatusEnd;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

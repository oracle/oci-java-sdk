/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * Details about bulk recommendation actions. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BulkApplyRecommendationsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class BulkApplyRecommendationsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"resourceActionIds", "actions", "status", "timeStatusEnd"})
    public BulkApplyRecommendationsDetails(
            java.util.List<String> resourceActionIds,
            java.util.List<BulkApplyResourceAction> actions,
            Status status,
            java.util.Date timeStatusEnd) {
        super();
        this.resourceActionIds = resourceActionIds;
        this.actions = actions;
        this.status = status;
        this.timeStatusEnd = timeStatusEnd;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique OCIDs of the resource actions that recommendations are applied to.
         *
         * <p>This field is deprecated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceActionIds")
        private java.util.List<String> resourceActionIds;

        /**
         * The unique OCIDs of the resource actions that recommendations are applied to.
         *
         * <p>This field is deprecated.
         *
         * @param resourceActionIds the value to set
         * @return this builder
         */
        public Builder resourceActionIds(java.util.List<String> resourceActionIds) {
            this.resourceActionIds = resourceActionIds;
            this.__explicitlySet__.add("resourceActionIds");
            return this;
        }
        /** The unique resource actions that recommendations are applied to. */
        @com.fasterxml.jackson.annotation.JsonProperty("actions")
        private java.util.List<BulkApplyResourceAction> actions;

        /**
         * The unique resource actions that recommendations are applied to.
         *
         * @param actions the value to set
         * @return this builder
         */
        public Builder actions(java.util.List<BulkApplyResourceAction> actions) {
            this.actions = actions;
            this.__explicitlySet__.add("actions");
            return this;
        }
        /** The current status of the recommendation. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The current status of the recommendation.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The date and time the current status will change. The format is defined by RFC3339.
         *
         * <p>For example, "The current {@code postponed} status of the resource action will end and
         * change to {@code pending} on this date and time."
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStatusEnd")
        private java.util.Date timeStatusEnd;

        /**
         * The date and time the current status will change. The format is defined by RFC3339.
         *
         * <p>For example, "The current {@code postponed} status of the resource action will end and
         * change to {@code pending} on this date and time."
         *
         * @param timeStatusEnd the value to set
         * @return this builder
         */
        public Builder timeStatusEnd(java.util.Date timeStatusEnd) {
            this.timeStatusEnd = timeStatusEnd;
            this.__explicitlySet__.add("timeStatusEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkApplyRecommendationsDetails build() {
            BulkApplyRecommendationsDetails model =
                    new BulkApplyRecommendationsDetails(
                            this.resourceActionIds, this.actions, this.status, this.timeStatusEnd);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkApplyRecommendationsDetails model) {
            if (model.wasPropertyExplicitlySet("resourceActionIds")) {
                this.resourceActionIds(model.getResourceActionIds());
            }
            if (model.wasPropertyExplicitlySet("actions")) {
                this.actions(model.getActions());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeStatusEnd")) {
                this.timeStatusEnd(model.getTimeStatusEnd());
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
     * The unique OCIDs of the resource actions that recommendations are applied to.
     *
     * <p>This field is deprecated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceActionIds")
    private final java.util.List<String> resourceActionIds;

    /**
     * The unique OCIDs of the resource actions that recommendations are applied to.
     *
     * <p>This field is deprecated.
     *
     * @return the value
     */
    public java.util.List<String> getResourceActionIds() {
        return resourceActionIds;
    }

    /** The unique resource actions that recommendations are applied to. */
    @com.fasterxml.jackson.annotation.JsonProperty("actions")
    private final java.util.List<BulkApplyResourceAction> actions;

    /**
     * The unique resource actions that recommendations are applied to.
     *
     * @return the value
     */
    public java.util.List<BulkApplyResourceAction> getActions() {
        return actions;
    }

    /** The current status of the recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The current status of the recommendation.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /**
     * The date and time the current status will change. The format is defined by RFC3339.
     *
     * <p>For example, "The current {@code postponed} status of the resource action will end and
     * change to {@code pending} on this date and time."
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStatusEnd")
    private final java.util.Date timeStatusEnd;

    /**
     * The date and time the current status will change. The format is defined by RFC3339.
     *
     * <p>For example, "The current {@code postponed} status of the resource action will end and
     * change to {@code pending} on this date and time."
     *
     * @return the value
     */
    public java.util.Date getTimeStatusEnd() {
        return timeStatusEnd;
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
        sb.append("BulkApplyRecommendationsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("resourceActionIds=").append(String.valueOf(this.resourceActionIds));
        sb.append(", actions=").append(String.valueOf(this.actions));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeStatusEnd=").append(String.valueOf(this.timeStatusEnd));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkApplyRecommendationsDetails)) {
            return false;
        }

        BulkApplyRecommendationsDetails other = (BulkApplyRecommendationsDetails) o;
        return java.util.Objects.equals(this.resourceActionIds, other.resourceActionIds)
                && java.util.Objects.equals(this.actions, other.actions)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeStatusEnd, other.timeStatusEnd)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.resourceActionIds == null ? 43 : this.resourceActionIds.hashCode());
        result = (result * PRIME) + (this.actions == null ? 43 : this.actions.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStatusEnd == null ? 43 : this.timeStatusEnd.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

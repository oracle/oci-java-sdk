/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Describes the re-order parameters for the Scheduled Action resources. <br>
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
        builder = ReorderScheduledActionsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ReorderScheduledActionsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"schedulingWindowId", "scheduledActionIdOrders"})
    public ReorderScheduledActionsDetails(
            String schedulingWindowId, java.util.List<ActionOrderDetails> scheduledActionIdOrders) {
        super();
        this.schedulingWindowId = schedulingWindowId;
        this.scheduledActionIdOrders = scheduledActionIdOrders;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Scheduling Window.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schedulingWindowId")
        private String schedulingWindowId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Scheduling Window.
         *
         * @param schedulingWindowId the value to set
         * @return this builder
         */
        public Builder schedulingWindowId(String schedulingWindowId) {
            this.schedulingWindowId = schedulingWindowId;
            this.__explicitlySet__.add("schedulingWindowId");
            return this;
        }
        /**
         * List of action resources in a specific order. Example: [{actionOrder: 1,
         * actionResourceId: "resourceId1"}, {actionOrder: 2, actionResourceId: "resourceId2"}]
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledActionIdOrders")
        private java.util.List<ActionOrderDetails> scheduledActionIdOrders;

        /**
         * List of action resources in a specific order. Example: [{actionOrder: 1,
         * actionResourceId: "resourceId1"}, {actionOrder: 2, actionResourceId: "resourceId2"}]
         *
         * @param scheduledActionIdOrders the value to set
         * @return this builder
         */
        public Builder scheduledActionIdOrders(
                java.util.List<ActionOrderDetails> scheduledActionIdOrders) {
            this.scheduledActionIdOrders = scheduledActionIdOrders;
            this.__explicitlySet__.add("scheduledActionIdOrders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReorderScheduledActionsDetails build() {
            ReorderScheduledActionsDetails model =
                    new ReorderScheduledActionsDetails(
                            this.schedulingWindowId, this.scheduledActionIdOrders);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReorderScheduledActionsDetails model) {
            if (model.wasPropertyExplicitlySet("schedulingWindowId")) {
                this.schedulingWindowId(model.getSchedulingWindowId());
            }
            if (model.wasPropertyExplicitlySet("scheduledActionIdOrders")) {
                this.scheduledActionIdOrders(model.getScheduledActionIdOrders());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Scheduling Window.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schedulingWindowId")
    private final String schedulingWindowId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Scheduling Window.
     *
     * @return the value
     */
    public String getSchedulingWindowId() {
        return schedulingWindowId;
    }

    /**
     * List of action resources in a specific order. Example: [{actionOrder: 1, actionResourceId:
     * "resourceId1"}, {actionOrder: 2, actionResourceId: "resourceId2"}]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledActionIdOrders")
    private final java.util.List<ActionOrderDetails> scheduledActionIdOrders;

    /**
     * List of action resources in a specific order. Example: [{actionOrder: 1, actionResourceId:
     * "resourceId1"}, {actionOrder: 2, actionResourceId: "resourceId2"}]
     *
     * @return the value
     */
    public java.util.List<ActionOrderDetails> getScheduledActionIdOrders() {
        return scheduledActionIdOrders;
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
        sb.append("ReorderScheduledActionsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("schedulingWindowId=").append(String.valueOf(this.schedulingWindowId));
        sb.append(", scheduledActionIdOrders=")
                .append(String.valueOf(this.scheduledActionIdOrders));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReorderScheduledActionsDetails)) {
            return false;
        }

        ReorderScheduledActionsDetails other = (ReorderScheduledActionsDetails) o;
        return java.util.Objects.equals(this.schedulingWindowId, other.schedulingWindowId)
                && java.util.Objects.equals(
                        this.scheduledActionIdOrders, other.scheduledActionIdOrders)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.schedulingWindowId == null
                                ? 43
                                : this.schedulingWindowId.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledActionIdOrders == null
                                ? 43
                                : this.scheduledActionIdOrders.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * The resource action that a recommendation will be applied to.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BulkApplyResourceAction.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BulkApplyResourceAction {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceActionId",
        "status",
        "timeStatusEnd",
        "parameters",
        "strategyName"
    })
    public BulkApplyResourceAction(
            String resourceActionId,
            Status status,
            java.util.Date timeStatusEnd,
            java.util.Map<String, Object> parameters,
            String strategyName) {
        super();
        this.resourceActionId = resourceActionId;
        this.status = status;
        this.timeStatusEnd = timeStatusEnd;
        this.parameters = parameters;
        this.strategyName = strategyName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("resourceActionId")
        private String resourceActionId;

        public Builder resourceActionId(String resourceActionId) {
            this.resourceActionId = resourceActionId;
            this.__explicitlySet__.add("resourceActionId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.Map<String, Object> parameters;

        public Builder parameters(java.util.Map<String, Object> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("strategyName")
        private String strategyName;

        public Builder strategyName(String strategyName) {
            this.strategyName = strategyName;
            this.__explicitlySet__.add("strategyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkApplyResourceAction build() {
            BulkApplyResourceAction __instance__ =
                    new BulkApplyResourceAction(
                            resourceActionId, status, timeStatusEnd, parameters, strategyName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkApplyResourceAction o) {
            Builder copiedBuilder =
                    resourceActionId(o.getResourceActionId())
                            .status(o.getStatus())
                            .timeStatusEnd(o.getTimeStatusEnd())
                            .parameters(o.getParameters())
                            .strategyName(o.getStrategyName());

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
     * The unique OCIDs of the resource actions that recommendations are applied to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceActionId")
    private final String resourceActionId;

    public String getResourceActionId() {
        return resourceActionId;
    }

    /**
     * The current status of the recommendation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    public Status getStatus() {
        return status;
    }

    /**
     * The date and time the current status will change. The format is defined by RFC3339.
     * <p>
     * For example, "The current {@code postponed} status of the resource action will end and change to {@code pending} on this
     * date and time."
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStatusEnd")
    private final java.util.Date timeStatusEnd;

    public java.util.Date getTimeStatusEnd() {
        return timeStatusEnd;
    }

    /**
     * Additional parameter key-value pairs defining the resource action.
     * For example:
     * <p>
     * {@code {"timeAmount": 15, "timeUnit": "seconds"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.Map<String, Object> parameters;

    public java.util.Map<String, Object> getParameters() {
        return parameters;
    }

    /**
     * The name of the strategy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("strategyName")
    private final String strategyName;

    public String getStrategyName() {
        return strategyName;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BulkApplyResourceAction(");
        sb.append("resourceActionId=").append(String.valueOf(this.resourceActionId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeStatusEnd=").append(String.valueOf(this.timeStatusEnd));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", strategyName=").append(String.valueOf(this.strategyName));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkApplyResourceAction)) {
            return false;
        }

        BulkApplyResourceAction other = (BulkApplyResourceAction) o;
        return java.util.Objects.equals(this.resourceActionId, other.resourceActionId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeStatusEnd, other.timeStatusEnd)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.strategyName, other.strategyName)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.resourceActionId == null ? 43 : this.resourceActionId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStatusEnd == null ? 43 : this.timeStatusEnd.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.strategyName == null ? 43 : this.strategyName.hashCode());
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

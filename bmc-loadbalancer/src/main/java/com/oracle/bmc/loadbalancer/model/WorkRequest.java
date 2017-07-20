/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * Many of the API requests you use to create and configure load balancing do not take effect immediately.
 * In these cases, the request spawns an asynchronous work flow to fulfill the request. WorkRequest objects provide visibility
 * for in-progress work flows.
 * For more information about work requests, see [Viewing the State of a Work Request](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/Tasks/viewingworkrequest.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WorkRequest.Builder.class)
public class WorkRequest {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("errorDetails")
        private java.util.List<WorkRequestError> errorDetails;

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
        private String loadBalancerId;

        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        public WorkRequest build() {
            return new WorkRequest(
                    errorDetails,
                    id,
                    lifecycleState,
                    loadBalancerId,
                    message,
                    timeAccepted,
                    timeFinished,
                    type);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequest o) {
            return errorDetails(o.getErrorDetails())
                    .id(o.getId())
                    .lifecycleState(o.getLifecycleState())
                    .loadBalancerId(o.getLoadBalancerId())
                    .message(o.getMessage())
                    .timeAccepted(o.getTimeAccepted())
                    .timeFinished(o.getTimeFinished())
                    .type(o.getType());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @com.fasterxml.jackson.annotation.JsonProperty("errorDetails")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.List<WorkRequestError> errorDetails;

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm) of the work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String id;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Failed("FAILED"),
        Succeeded("SUCCEEDED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    LifecycleState lifecycleState;

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm) of the load balancer with which the work request
     * is associated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String loadBalancerId;

    /**
     * A collection of data, related to the load balancer provisioning process, that helps with debugging in the event of failure.
     * Possible data elements include:
     * <p>
     * - workflow name
     * - event ID
     * - work request ID
     * - load balancer ID
     * - workflow completion message
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String message;

    /**
     * The date and time the work request was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    java.util.Date timeAccepted;

    /**
     * The date and time the work request was completed, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    java.util.Date timeFinished;

    /**
     * The type of action the work request represents.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String type;
}

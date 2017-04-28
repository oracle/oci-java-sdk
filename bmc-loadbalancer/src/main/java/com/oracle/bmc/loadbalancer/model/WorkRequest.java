/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * Many of the API requests you use to create and configure load balancing do not take effect immediately.
 * In these cases, the request spawns an asynchronous work flow to fulfill the request. WorkRequest objects provide visibility
 * for in-progress work flows.
 * For more information about work requests, see [Viewing the State of a Work Request](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/Tasks/viewingworkrequest.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = WorkRequest.Builder.class)
public class WorkRequest {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("errorDetails")
        private List<WorkRequestError> errorDetails;

        @JsonProperty("id")
        private String id;

        @JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @JsonProperty("loadBalancerId")
        private String loadBalancerId;

        @JsonProperty("message")
        private String message;

        @JsonProperty("timeAccepted")
        private Date timeAccepted;

        @JsonProperty("timeFinished")
        private Date timeFinished;

        @JsonProperty("type")
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

        @JsonIgnore
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

    @JsonProperty("errorDetails")
    @Valid
    @NotNull
    List<WorkRequestError> errorDetails;

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm) of the work request.
     **/
    @JsonProperty("id")
    @Valid
    @NotNull
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
        private static Map<String, LifecycleState> map;

        static {
            map = new HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @JsonCreator
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

    @JsonProperty("lifecycleState")
    @Valid
    @NotNull
    LifecycleState lifecycleState;

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/identifiers.htm) of the load balancer with which the work request
     * is associated.
     *
     **/
    @JsonProperty("loadBalancerId")
    @Valid
    @NotNull
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
    @JsonProperty("message")
    @Valid
    @NotNull
    String message;

    /**
     * The date and time the work request was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeAccepted")
    @Valid
    @NotNull
    Date timeAccepted;

    /**
     * The date and time the work request was completed, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeFinished")
    Date timeFinished;

    /**
     * The type of action the work request represents.
     *
     **/
    @JsonProperty("type")
    @Valid
    @NotNull
    String type;
}

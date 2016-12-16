/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * Represents a router connectecting the edge of a VCN with the Internet. For more
 * information, see [Overview of the Networking Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/overview.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = InternetGateway.Builder.class)
public class InternetGateway {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("id")
        private String id;

        @JsonProperty("isEnabled")
        private Boolean isEnabled;

        @JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        @JsonProperty("vcnId")
        private String vcnId;

        public InternetGateway build() {
            return new InternetGateway(
                    compartmentId, displayName, id, isEnabled, lifecycleState, timeCreated, vcnId);
        }

        @JsonIgnore
        public Builder copy(InternetGateway o) {
            return compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .id(o.getId())
                    .isEnabled(o.getIsEnabled())
                    .lifecycleState(o.getLifecycleState())
                    .timeCreated(o.getTimeCreated())
                    .vcnId(o.getVcnId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the compartment containing the Internet Gateway.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The Internet Gateway's Oracle ID (OCID).
     **/
    @JsonProperty("id")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String id;

    /**
     * Whether the gateway is enabled. When the gateway is disabled, traffic is not
     * routed to/from the Internet, regardless of route rules.
     *
     **/
    @JsonProperty("isEnabled")
    Boolean isEnabled;
    /**
     * The Internet Gateway's current state.
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        ;

        private final String value;
        private static Map<String, LifecycleState> map;

        static {
            map = new HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
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
            throw new RuntimeException("Invalid LifecycleState: " + key);
        }
    };
    /**
     * The Internet Gateway's current state.
     **/
    @JsonProperty("lifecycleState")
    @Valid
    @NotNull
    LifecycleState lifecycleState;

    /**
     * The date and time the Internet Gateway was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    Date timeCreated;

    /**
     * The OCID of the VCN the Internet Gateway belongs to.
     **/
    @JsonProperty("vcnId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String vcnId;
}

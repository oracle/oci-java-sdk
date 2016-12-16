/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * An individual employee or system that needs to manage or use your company's Oracle Bare Metal Cloud Services
 * resources. Users might need to launch instances, manage remote disks, work with your cloud network, etc. Users
 * have one or more IAM Service credentials ({@link ApiKey},
 * {@link UIPassword}, and {@link SwiftPassword}).
 * For more information, see [User Credentials](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/usercredentials.htm)). End users of your
 * application are not typically IAM Service users. For conceptual information about users and other IAM Service
 * components, see [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access,
 * see [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = User.Builder.class)
public class User {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("id")
        private String id;

        @JsonProperty("compartmentId")
        private String compartmentId;

        @JsonProperty("name")
        private String name;

        @JsonProperty("description")
        private String description;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        @JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @JsonProperty("inactiveStatus")
        private Long inactiveStatus;

        public User build() {
            return new User(
                    id,
                    compartmentId,
                    name,
                    description,
                    timeCreated,
                    lifecycleState,
                    inactiveStatus);
        }

        @JsonIgnore
        public Builder copy(User o) {
            return id(o.getId())
                    .compartmentId(o.getCompartmentId())
                    .name(o.getName())
                    .description(o.getDescription())
                    .timeCreated(o.getTimeCreated())
                    .lifecycleState(o.getLifecycleState())
                    .inactiveStatus(o.getInactiveStatus());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the user.
     **/
    @JsonProperty("id")
    @Valid
    @NotNull
    String id;

    /**
     * The OCID of the tenancy containing the user.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    String compartmentId;

    /**
     * The name you assign to the user during creation. This is the user's login for the Console.
     * The name must be unique across all users in the tenancy and cannot be changed.
     *
     **/
    @JsonProperty("name")
    @Valid
    @NotNull
    @Size(min = 1, max = 100)
    String name;

    /**
     * The description you assign to the user. Does not have to be unique, and it's changeable.
     **/
    @JsonProperty("description")
    @Valid
    @NotNull
    @Size(min = 1, max = 400)
    String description;

    /**
     * Date and time the user was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    @Valid
    @NotNull
    Date timeCreated;
    /**
     * The user's current state. After creating a user, make sure its `lifecycleState` changes from CREATING to
     * ACTIVE before using it.
     *
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
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
     * The user's current state. After creating a user, make sure its `lifecycleState` changes from CREATING to
     * ACTIVE before using it.
     *
     **/
    @JsonProperty("lifecycleState")
    @Valid
    @NotNull
    @Size(min = 1, max = 64)
    LifecycleState lifecycleState;

    /**
     * Returned only if the user's `lifecycleState` is INACTIVE. A 16-bit value showing the reason why the user
     * is inactive:
     * <p>
     * - bit 0: SUSPENDED (reserved for future use)
     * - bit 1: DISABLED (reserved for future use)
     * - bit 2: BLOCKED (the user has exceeded the maximum number of failed login attempts for the Console)
     *
     **/
    @JsonProperty("inactiveStatus")
    Long inactiveStatus;
}

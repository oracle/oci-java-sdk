/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
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
 * A collection of related resources. Compartments are a fundamental component of Oracle Bare Metal Cloud Services
 * for organizing and isolating your cloud resources. You use them to clearly separate resources for the purposes
 * of measuring usage and billing, access (through the use of IAM Service policies), and isolation (separating the
 * resources for one project or business unit from another). A common approach is to create a compartment for each
 * major part of your organization. For more information, see
 * [Overview of the IAM Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/overview.htm) and also
 * [Setting Up Your Tenancy](https://docs.us-phoenix-1.oraclecloud.com/Content/GSG/Concepts/settinguptenancy.htm).
 *
 * To place a resource in a compartment, simply specify the compartment ID in the \"Create\" request object when
 * initially creating the resource. For example, to launch an instance into a particular compartment, specify
 * that compartment's OCID in the `LaunchInstance` request. You can't move an existing resource from one
 * compartment to another.
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access,
 * see [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = Compartment.Builder.class)
public class Compartment {
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

        public Compartment build() {
            return new Compartment(
                    id,
                    compartmentId,
                    name,
                    description,
                    timeCreated,
                    lifecycleState,
                    inactiveStatus);
        }

        @JsonIgnore
        public Builder copy(Compartment o) {
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
     * The OCID of the compartment.
     **/
    @JsonProperty("id")
    @Valid
    @NotNull
    String id;

    /**
     * The OCID of the tenancy containing the compartment.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    String compartmentId;

    /**
     * The name you assign to the compartment during creation. The name must be unique across all
     * compartments in the tenancy and cannot be changed.
     *
     **/
    @JsonProperty("name")
    @Valid
    @NotNull
    @Size(min = 1, max = 100)
    String name;

    /**
     * The description you assign to the compartment. Does not have to be unique, and it's changeable.
     **/
    @JsonProperty("description")
    @Valid
    @NotNull
    @Size(min = 1, max = 400)
    String description;

    /**
     * Date and time the compartment was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    @Valid
    @NotNull
    Date timeCreated;
    /**
     * The compartment's current state. After creating a compartment, make sure its `lifecycleState` changes from
     * CREATING to ACTIVE before using it.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),

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
    /**
     * The compartment's current state. After creating a compartment, make sure its `lifecycleState` changes from
     * CREATING to ACTIVE before using it.
     *
     **/
    @JsonProperty("lifecycleState")
    @Valid
    @NotNull
    @Size(min = 1, max = 64)
    LifecycleState lifecycleState;

    /**
     * The detailed status of INACTIVE lifecycleState.
     **/
    @JsonProperty("inactiveStatus")
    Long inactiveStatus;
}

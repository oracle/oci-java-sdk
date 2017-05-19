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
 * The resulting base object when you add an identity provider to your tenancy. A
 * {@link Saml2IdentityProvider}
 * is a specific type of `IdentityProvider` that supports the SAML 2.0 protocol. Each
 * `IdentityProvider` object has its own OCID. For more information, see
 * [Identity Providers and Federation](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/federation.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access,
 * see [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@NonFinal
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "protocol",
    defaultImpl = IdentityProvider.class
)
@JsonSubTypes({@JsonSubTypes.Type(value = Saml2IdentityProvider.class, name = "SAML2")})
public class IdentityProvider {

    /**
     * The OCID of the `IdentityProvider`.
     **/
    @JsonProperty("id")
    @Valid
    @NotNull
    String id;

    /**
     * The OCID of the tenancy containing the `IdentityProvider`.
     **/
    @JsonProperty("compartmentId")
    @Valid
    @NotNull
    String compartmentId;

    /**
     * The name you assign to the `IdentityProvider` during creation. The name
     * must be unique across all `IdentityProvider` objects in the tenancy and
     * cannot be changed. This is the name federated users see when choosing
     * which identity provider to use when signing in to the Oracle Bare Metal Cloud
     * Services Console.
     *
     **/
    @JsonProperty("name")
    @Valid
    @NotNull
    @Size(min = 1, max = 100)
    String name;

    /**
     * The description you assign to the `IdentityProvider` during creation. Does
     * not have to be unique, and it's changeable.
     *
     **/
    @JsonProperty("description")
    @Valid
    @NotNull
    @Size(min = 1, max = 400)
    String description;

    /**
     * The identity provider service or product (e.g., Oracle Identity Cloud Service).
     * Allowed value: `IDCS`.
     * <p>
     * Example: `IDCS`
     *
     **/
    @JsonProperty("productType")
    @Valid
    @NotNull
    @Size(min = 1, max = 64)
    String productType;

    /**
     * Date and time the `IdentityProvider` was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    @Valid
    @NotNull
    Date timeCreated;
    /**
     * The current state. After creating an `IdentityProvider`, make sure its
     * `lifecycleState` changes from CREATING to ACTIVE before using it.
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
     * The current state. After creating an `IdentityProvider`, make sure its
     * `lifecycleState` changes from CREATING to ACTIVE before using it.
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

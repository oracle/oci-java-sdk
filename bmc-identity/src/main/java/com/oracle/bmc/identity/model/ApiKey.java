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
 * A PEM-format RSA credential for securing requests to the Oracle Bare Metal Cloud Services REST API. Also known
 * as an *API signing key*. Specifically, this is the public key from the key pair. The private key remains with
 * the user calling the API. For information about generating a key pair
 * in the required PEM format, see [Required Keys and OCIDs](https://docs.us-phoenix-1.oraclecloud.com/Content/API/Concepts/apisigningkey.htm).
 * <p>
 **Important:** This is **not** the SSH key for accessing compute instances.
 * <p>
 * Each user can have a maximum of three API signing keys.
 * <p>
 * For more information about user credentials, see [User Credentials](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/usercredentials.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = ApiKey.Builder.class)
public class ApiKey {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("keyId")
        private String keyId;

        @JsonProperty("keyValue")
        private String keyValue;

        @JsonProperty("fingerprint")
        private String fingerprint;

        @JsonProperty("userId")
        private String userId;

        @JsonProperty("timeCreated")
        private Date timeCreated;

        @JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @JsonProperty("inactiveStatus")
        private Long inactiveStatus;

        public ApiKey build() {
            return new ApiKey(
                    keyId,
                    keyValue,
                    fingerprint,
                    userId,
                    timeCreated,
                    lifecycleState,
                    inactiveStatus);
        }

        @JsonIgnore
        public Builder copy(ApiKey o) {
            return keyId(o.getKeyId())
                    .keyValue(o.getKeyValue())
                    .fingerprint(o.getFingerprint())
                    .userId(o.getUserId())
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
     * An Oracle-assigned identifier for the key, in this format:
     * TENANCY_OCID/USER_OCID/KEY_FINGERPRINT.
     *
     **/
    @JsonProperty("keyId")
    String keyId;

    /**
     * The key's value.
     **/
    @JsonProperty("keyValue")
    String keyValue;

    /**
     * The key's fingerprint (e.g., 12:34:56:78:90:ab:cd:ef:12:34:56:78:90:ab:cd:ef).
     **/
    @JsonProperty("fingerprint")
    String fingerprint;

    /**
     * The OCID of the user the key belongs to.
     **/
    @JsonProperty("userId")
    String userId;

    /**
     * Date and time the `ApiKey` object was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @JsonProperty("timeCreated")
    Date timeCreated;
    /**
     * The API key's current state. After creating an `ApiKey` object, make sure its `lifecycleState` changes from
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
     * The API key's current state. After creating an `ApiKey` object, make sure its `lifecycleState` changes from
     * CREATING to ACTIVE before using it.
     *
     **/
    @JsonProperty("lifecycleState")
    @Size(min = 1, max = 64)
    LifecycleState lifecycleState;

    /**
     * The detailed status of INACTIVE lifecycleState.
     **/
    @JsonProperty("inactiveStatus")
    Long inactiveStatus;
}

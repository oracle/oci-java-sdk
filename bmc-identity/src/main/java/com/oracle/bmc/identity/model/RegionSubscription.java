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
 * An object that represents your tenancy's access to a particular region (i.e., a subscription), the status of that
 * access, and whether that region is the home region. For more information, see [Managing Regions](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Tasks/managingregions.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access,
 * see [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = RegionSubscription.Builder.class)
public class RegionSubscription {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("regionKey")
        private String regionKey;

        @JsonProperty("regionName")
        private String regionName;

        @JsonProperty("status")
        private Status status;

        @JsonProperty("isHomeRegion")
        private Boolean isHomeRegion;

        public RegionSubscription build() {
            return new RegionSubscription(regionKey, regionName, status, isHomeRegion);
        }

        @JsonIgnore
        public Builder copy(RegionSubscription o) {
            return regionKey(o.getRegionKey())
                    .regionName(o.getRegionName())
                    .status(o.getStatus())
                    .isHomeRegion(o.getIsHomeRegion());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The region's key.
     * <p>
     * Allowed values are:
     * - `PHX`
     * - `IAD`
     *
     **/
    @JsonProperty("regionKey")
    @Valid
    @NotNull
    @Size(min = 1, max = 16)
    String regionKey;

    /**
     * The region's name.
     * <p>
     * Allowed values are:
     * - `us-phoenix-1`
     * - `us-ashburn-1`
     *
     **/
    @JsonProperty("regionName")
    @Valid
    @NotNull
    @Size(min = 1, max = 16)
    String regionName;
    /**
     * The region subscription status.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        Ready("READY"),
        InProgress("IN_PROGRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static Map<String, Status> map;

        static {
            map = new HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The region subscription status.
     **/
    @JsonProperty("status")
    @Valid
    @NotNull
    Status status;

    /**
     * Indicates if the region is the home region or not.
     **/
    @JsonProperty("isHomeRegion")
    @Valid
    @NotNull
    Boolean isHomeRegion;
}

/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RegionSubscription.Builder.class
)
public class RegionSubscription {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("regionKey")
        private String regionKey;

        @com.fasterxml.jackson.annotation.JsonProperty("regionName")
        private String regionName;

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        @com.fasterxml.jackson.annotation.JsonProperty("isHomeRegion")
        private Boolean isHomeRegion;

        public RegionSubscription build() {
            return new RegionSubscription(regionKey, regionName, status, isHomeRegion);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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
     * - 'FRA'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regionKey")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 16)
    String regionKey;

    /**
     * The region's name.
     * <p>
     * Allowed values are:
     * - `us-phoenix-1`
     * - `us-ashburn-1`
     * - 'de-frankfurt-1'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regionName")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 16)
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
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
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
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    Status status;

    /**
     * Indicates if the region is the home region or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHomeRegion")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    Boolean isHomeRegion;
}

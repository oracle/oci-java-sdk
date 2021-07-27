/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * An object that represents your tenancy's access to a particular region (i.e., a subscription), the status of that
 * access, and whether that region is the home region. For more information, see [Managing Regions](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingregions.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access,
 * see [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RegionSubscription.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RegionSubscription {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("regionKey")
        private String regionKey;

        public Builder regionKey(String regionKey) {
            this.regionKey = regionKey;
            this.__explicitlySet__.add("regionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("regionName")
        private String regionName;

        public Builder regionName(String regionName) {
            this.regionName = regionName;
            this.__explicitlySet__.add("regionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHomeRegion")
        private Boolean isHomeRegion;

        public Builder isHomeRegion(Boolean isHomeRegion) {
            this.isHomeRegion = isHomeRegion;
            this.__explicitlySet__.add("isHomeRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RegionSubscription build() {
            RegionSubscription __instance__ =
                    new RegionSubscription(regionKey, regionName, status, isHomeRegion);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RegionSubscription o) {
            Builder copiedBuilder =
                    regionKey(o.getRegionKey())
                            .regionName(o.getRegionName())
                            .status(o.getStatus())
                            .isHomeRegion(o.getIsHomeRegion());

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

    /**
     * The region's key. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
     * for the full list of supported 3-letter region codes.
     * <p>
     * Example: {@code PHX}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regionKey")
    String regionKey;

    /**
     * The region's name. See [Regions and Availability Domains](https://docs.cloud.oracle.com/Content/General/Concepts/regions.htm)
     * for the full list of supported region names.
     * <p>
     * Example: {@code us-phoenix-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regionName")
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
    Status status;

    /**
     * Indicates if the region is the home region or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHomeRegion")
    Boolean isHomeRegion;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * DPD Configuration Details
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DpdConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DpdConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dpdMode")
        private DpdMode dpdMode;

        public Builder dpdMode(DpdMode dpdMode) {
            this.dpdMode = dpdMode;
            this.__explicitlySet__.add("dpdMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dpdTimeoutInSec")
        private Integer dpdTimeoutInSec;

        public Builder dpdTimeoutInSec(Integer dpdTimeoutInSec) {
            this.dpdTimeoutInSec = dpdTimeoutInSec;
            this.__explicitlySet__.add("dpdTimeoutInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DpdConfig build() {
            DpdConfig __instance__ = new DpdConfig(dpdMode, dpdTimeoutInSec);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DpdConfig o) {
            Builder copiedBuilder = dpdMode(o.getDpdMode()).dpdTimeoutInSec(o.getDpdTimeoutInSec());

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
     * dpd mode
     **/
    public enum DpdMode {
        InitiateAndRespond("INITIATE_AND_RESPOND"),
        RespondOnly("RESPOND_ONLY"),
        ;

        private final String value;
        private static java.util.Map<String, DpdMode> map;

        static {
            map = new java.util.HashMap<>();
            for (DpdMode v : DpdMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        DpdMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DpdMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DpdMode: " + key);
        }
    };
    /**
     * dpd mode
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dpdMode")
    DpdMode dpdMode;

    /**
     * DPD Timeout in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dpdTimeoutInSec")
    Integer dpdTimeoutInSec;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

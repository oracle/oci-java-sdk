/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details of the tenancy level global settings in Data Safe.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GlobalSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class GlobalSettings {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isPaidUsage")
        private Boolean isPaidUsage;

        public Builder isPaidUsage(Boolean isPaidUsage) {
            this.isPaidUsage = isPaidUsage;
            this.__explicitlySet__.add("isPaidUsage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("onlineRetentionPeriod")
        private Integer onlineRetentionPeriod;

        public Builder onlineRetentionPeriod(Integer onlineRetentionPeriod) {
            this.onlineRetentionPeriod = onlineRetentionPeriod;
            this.__explicitlySet__.add("onlineRetentionPeriod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("offlineRetentionPeriod")
        private Integer offlineRetentionPeriod;

        public Builder offlineRetentionPeriod(Integer offlineRetentionPeriod) {
            this.offlineRetentionPeriod = offlineRetentionPeriod;
            this.__explicitlySet__.add("offlineRetentionPeriod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GlobalSettings build() {
            GlobalSettings __instance__ =
                    new GlobalSettings(isPaidUsage, onlineRetentionPeriod, offlineRetentionPeriod);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GlobalSettings o) {
            Builder copiedBuilder =
                    isPaidUsage(o.getIsPaidUsage())
                            .onlineRetentionPeriod(o.getOnlineRetentionPeriod())
                            .offlineRetentionPeriod(o.getOfflineRetentionPeriod());

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
     * The paid usage option chosen by the customer admin.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPaidUsage")
    Boolean isPaidUsage;

    /**
     * The online retention period in months.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onlineRetentionPeriod")
    Integer onlineRetentionPeriod;

    /**
     * The offline retention period in months.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offlineRetentionPeriod")
    Integer offlineRetentionPeriod;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details for the audit retention months to be modified.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ChangeRetentionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ChangeRetentionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("onlineMonths")
        private Integer onlineMonths;

        public Builder onlineMonths(Integer onlineMonths) {
            this.onlineMonths = onlineMonths;
            this.__explicitlySet__.add("onlineMonths");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("offlineMonths")
        private Integer offlineMonths;

        public Builder offlineMonths(Integer offlineMonths) {
            this.offlineMonths = offlineMonths;
            this.__explicitlySet__.add("offlineMonths");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOverrideGlobalRetentionSetting")
        private Boolean isOverrideGlobalRetentionSetting;

        public Builder isOverrideGlobalRetentionSetting(Boolean isOverrideGlobalRetentionSetting) {
            this.isOverrideGlobalRetentionSetting = isOverrideGlobalRetentionSetting;
            this.__explicitlySet__.add("isOverrideGlobalRetentionSetting");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangeRetentionDetails build() {
            ChangeRetentionDetails __instance__ =
                    new ChangeRetentionDetails(
                            onlineMonths, offlineMonths, isOverrideGlobalRetentionSetting);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangeRetentionDetails o) {
            Builder copiedBuilder =
                    onlineMonths(o.getOnlineMonths())
                            .offlineMonths(o.getOfflineMonths())
                            .isOverrideGlobalRetentionSetting(
                                    o.getIsOverrideGlobalRetentionSetting());

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
     * Indicates the number of months the audit records will be stored online in Oracle Data Safe audit repository for
     * immediate reporting and analysis. Minimum: 1; Maximum:12 months
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onlineMonths")
    Integer onlineMonths;

    /**
     * Indicates the number of months the audit records will be stored offline in the Data Safe audit archive.
     * Minimum: 0; Maximum: 72 months.
     * If you have a requirement to store the audit data even longer in archive, please contact the Oracle Support.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offlineMonths")
    Integer offlineMonths;

    /**
     * Indicates whether audit retention settings like online and offline months is set at the
     * target level overriding the global audit retention settings.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOverrideGlobalRetentionSetting")
    Boolean isOverrideGlobalRetentionSetting;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}

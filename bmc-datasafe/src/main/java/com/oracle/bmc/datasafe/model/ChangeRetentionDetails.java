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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ChangeRetentionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ChangeRetentionDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "onlineMonths",
        "offlineMonths",
        "isOverrideGlobalRetentionSetting"
    })
    public ChangeRetentionDetails(
            Integer onlineMonths, Integer offlineMonths, Boolean isOverrideGlobalRetentionSetting) {
        super();
        this.onlineMonths = onlineMonths;
        this.offlineMonths = offlineMonths;
        this.isOverrideGlobalRetentionSetting = isOverrideGlobalRetentionSetting;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Indicates the number of months the audit records will be stored online in Oracle Data Safe audit repository for
     * immediate reporting and analysis. Minimum: 1; Maximum:12 months
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onlineMonths")
    private final Integer onlineMonths;

    public Integer getOnlineMonths() {
        return onlineMonths;
    }

    /**
     * Indicates the number of months the audit records will be stored offline in the Data Safe audit archive.
     * Minimum: 0; Maximum: 72 months.
     * If you have a requirement to store the audit data even longer in archive, please contact the Oracle Support.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offlineMonths")
    private final Integer offlineMonths;

    public Integer getOfflineMonths() {
        return offlineMonths;
    }

    /**
     * Indicates whether audit retention settings like online and offline months is set at the
     * target level overriding the global audit retention settings.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOverrideGlobalRetentionSetting")
    private final Boolean isOverrideGlobalRetentionSetting;

    public Boolean getIsOverrideGlobalRetentionSetting() {
        return isOverrideGlobalRetentionSetting;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ChangeRetentionDetails(");
        sb.append("onlineMonths=").append(String.valueOf(this.onlineMonths));
        sb.append(", offlineMonths=").append(String.valueOf(this.offlineMonths));
        sb.append(", isOverrideGlobalRetentionSetting=")
                .append(String.valueOf(this.isOverrideGlobalRetentionSetting));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeRetentionDetails)) {
            return false;
        }

        ChangeRetentionDetails other = (ChangeRetentionDetails) o;
        return java.util.Objects.equals(this.onlineMonths, other.onlineMonths)
                && java.util.Objects.equals(this.offlineMonths, other.offlineMonths)
                && java.util.Objects.equals(
                        this.isOverrideGlobalRetentionSetting,
                        other.isOverrideGlobalRetentionSetting)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.onlineMonths == null ? 43 : this.onlineMonths.hashCode());
        result =
                (result * PRIME)
                        + (this.offlineMonths == null ? 43 : this.offlineMonths.hashCode());
        result =
                (result * PRIME)
                        + (this.isOverrideGlobalRetentionSetting == null
                                ? 43
                                : this.isOverrideGlobalRetentionSetting.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}

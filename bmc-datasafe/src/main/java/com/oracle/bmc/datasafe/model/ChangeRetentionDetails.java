/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details for the audit retention months to be modified. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ChangeRetentionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ChangeRetentionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /**
         * Indicates the number of months the audit records will be stored online in Oracle Data
         * Safe audit repository for immediate reporting and analysis. Minimum: 1; Maximum:12 months
         */
        @com.fasterxml.jackson.annotation.JsonProperty("onlineMonths")
        private Integer onlineMonths;

        /**
         * Indicates the number of months the audit records will be stored online in Oracle Data
         * Safe audit repository for immediate reporting and analysis. Minimum: 1; Maximum:12 months
         *
         * @param onlineMonths the value to set
         * @return this builder
         */
        public Builder onlineMonths(Integer onlineMonths) {
            this.onlineMonths = onlineMonths;
            this.__explicitlySet__.add("onlineMonths");
            return this;
        }
        /**
         * Indicates the number of months the audit records will be stored offline in the Data Safe
         * audit archive. Minimum: 0; Maximum: 72 months. If you have a requirement to store the
         * audit data even longer in archive, please contact the Oracle Support.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("offlineMonths")
        private Integer offlineMonths;

        /**
         * Indicates the number of months the audit records will be stored offline in the Data Safe
         * audit archive. Minimum: 0; Maximum: 72 months. If you have a requirement to store the
         * audit data even longer in archive, please contact the Oracle Support.
         *
         * @param offlineMonths the value to set
         * @return this builder
         */
        public Builder offlineMonths(Integer offlineMonths) {
            this.offlineMonths = offlineMonths;
            this.__explicitlySet__.add("offlineMonths");
            return this;
        }
        /**
         * Indicates whether audit retention settings like online and offline months is set at the
         * target level overriding the global audit retention settings.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOverrideGlobalRetentionSetting")
        private Boolean isOverrideGlobalRetentionSetting;

        /**
         * Indicates whether audit retention settings like online and offline months is set at the
         * target level overriding the global audit retention settings.
         *
         * @param isOverrideGlobalRetentionSetting the value to set
         * @return this builder
         */
        public Builder isOverrideGlobalRetentionSetting(Boolean isOverrideGlobalRetentionSetting) {
            this.isOverrideGlobalRetentionSetting = isOverrideGlobalRetentionSetting;
            this.__explicitlySet__.add("isOverrideGlobalRetentionSetting");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangeRetentionDetails build() {
            ChangeRetentionDetails model =
                    new ChangeRetentionDetails(
                            this.onlineMonths,
                            this.offlineMonths,
                            this.isOverrideGlobalRetentionSetting);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangeRetentionDetails model) {
            if (model.wasPropertyExplicitlySet("onlineMonths")) {
                this.onlineMonths(model.getOnlineMonths());
            }
            if (model.wasPropertyExplicitlySet("offlineMonths")) {
                this.offlineMonths(model.getOfflineMonths());
            }
            if (model.wasPropertyExplicitlySet("isOverrideGlobalRetentionSetting")) {
                this.isOverrideGlobalRetentionSetting(model.getIsOverrideGlobalRetentionSetting());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Indicates the number of months the audit records will be stored online in Oracle Data Safe
     * audit repository for immediate reporting and analysis. Minimum: 1; Maximum:12 months
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onlineMonths")
    private final Integer onlineMonths;

    /**
     * Indicates the number of months the audit records will be stored online in Oracle Data Safe
     * audit repository for immediate reporting and analysis. Minimum: 1; Maximum:12 months
     *
     * @return the value
     */
    public Integer getOnlineMonths() {
        return onlineMonths;
    }

    /**
     * Indicates the number of months the audit records will be stored offline in the Data Safe
     * audit archive. Minimum: 0; Maximum: 72 months. If you have a requirement to store the audit
     * data even longer in archive, please contact the Oracle Support.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offlineMonths")
    private final Integer offlineMonths;

    /**
     * Indicates the number of months the audit records will be stored offline in the Data Safe
     * audit archive. Minimum: 0; Maximum: 72 months. If you have a requirement to store the audit
     * data even longer in archive, please contact the Oracle Support.
     *
     * @return the value
     */
    public Integer getOfflineMonths() {
        return offlineMonths;
    }

    /**
     * Indicates whether audit retention settings like online and offline months is set at the
     * target level overriding the global audit retention settings.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOverrideGlobalRetentionSetting")
    private final Boolean isOverrideGlobalRetentionSetting;

    /**
     * Indicates whether audit retention settings like online and offline months is set at the
     * target level overriding the global audit retention settings.
     *
     * @return the value
     */
    public Boolean getIsOverrideGlobalRetentionSetting() {
        return isOverrideGlobalRetentionSetting;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ChangeRetentionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("onlineMonths=").append(String.valueOf(this.onlineMonths));
        sb.append(", offlineMonths=").append(String.valueOf(this.offlineMonths));
        sb.append(", isOverrideGlobalRetentionSetting=")
                .append(String.valueOf(this.isOverrideGlobalRetentionSetting));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

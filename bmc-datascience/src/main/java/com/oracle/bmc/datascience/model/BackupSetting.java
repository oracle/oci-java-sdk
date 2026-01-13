/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Back up setting details of the model. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BackupSetting.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BackupSetting extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isBackupEnabled",
        "backupRegion",
        "customerNotificationType"
    })
    public BackupSetting(
            Boolean isBackupEnabled,
            String backupRegion,
            ModelSettingCustomerNotificationType customerNotificationType) {
        super();
        this.isBackupEnabled = isBackupEnabled;
        this.backupRegion = backupRegion;
        this.customerNotificationType = customerNotificationType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Boolean flag representing whether backup needs to be enabled/disabled for the model. */
        @com.fasterxml.jackson.annotation.JsonProperty("isBackupEnabled")
        private Boolean isBackupEnabled;

        /**
         * Boolean flag representing whether backup needs to be enabled/disabled for the model.
         *
         * @param isBackupEnabled the value to set
         * @return this builder
         */
        public Builder isBackupEnabled(Boolean isBackupEnabled) {
            this.isBackupEnabled = isBackupEnabled;
            this.__explicitlySet__.add("isBackupEnabled");
            return this;
        }
        /** OCI backup region for the model. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupRegion")
        private String backupRegion;

        /**
         * OCI backup region for the model.
         *
         * @param backupRegion the value to set
         * @return this builder
         */
        public Builder backupRegion(String backupRegion) {
            this.backupRegion = backupRegion;
            this.__explicitlySet__.add("backupRegion");
            return this;
        }
        /** Customer notification on backup success/failure events. */
        @com.fasterxml.jackson.annotation.JsonProperty("customerNotificationType")
        private ModelSettingCustomerNotificationType customerNotificationType;

        /**
         * Customer notification on backup success/failure events.
         *
         * @param customerNotificationType the value to set
         * @return this builder
         */
        public Builder customerNotificationType(
                ModelSettingCustomerNotificationType customerNotificationType) {
            this.customerNotificationType = customerNotificationType;
            this.__explicitlySet__.add("customerNotificationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackupSetting build() {
            BackupSetting model =
                    new BackupSetting(
                            this.isBackupEnabled, this.backupRegion, this.customerNotificationType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackupSetting model) {
            if (model.wasPropertyExplicitlySet("isBackupEnabled")) {
                this.isBackupEnabled(model.getIsBackupEnabled());
            }
            if (model.wasPropertyExplicitlySet("backupRegion")) {
                this.backupRegion(model.getBackupRegion());
            }
            if (model.wasPropertyExplicitlySet("customerNotificationType")) {
                this.customerNotificationType(model.getCustomerNotificationType());
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

    /** Boolean flag representing whether backup needs to be enabled/disabled for the model. */
    @com.fasterxml.jackson.annotation.JsonProperty("isBackupEnabled")
    private final Boolean isBackupEnabled;

    /**
     * Boolean flag representing whether backup needs to be enabled/disabled for the model.
     *
     * @return the value
     */
    public Boolean getIsBackupEnabled() {
        return isBackupEnabled;
    }

    /** OCI backup region for the model. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupRegion")
    private final String backupRegion;

    /**
     * OCI backup region for the model.
     *
     * @return the value
     */
    public String getBackupRegion() {
        return backupRegion;
    }

    /** Customer notification on backup success/failure events. */
    @com.fasterxml.jackson.annotation.JsonProperty("customerNotificationType")
    private final ModelSettingCustomerNotificationType customerNotificationType;

    /**
     * Customer notification on backup success/failure events.
     *
     * @return the value
     */
    public ModelSettingCustomerNotificationType getCustomerNotificationType() {
        return customerNotificationType;
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
        sb.append("BackupSetting(");
        sb.append("super=").append(super.toString());
        sb.append("isBackupEnabled=").append(String.valueOf(this.isBackupEnabled));
        sb.append(", backupRegion=").append(String.valueOf(this.backupRegion));
        sb.append(", customerNotificationType=")
                .append(String.valueOf(this.customerNotificationType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackupSetting)) {
            return false;
        }

        BackupSetting other = (BackupSetting) o;
        return java.util.Objects.equals(this.isBackupEnabled, other.isBackupEnabled)
                && java.util.Objects.equals(this.backupRegion, other.backupRegion)
                && java.util.Objects.equals(
                        this.customerNotificationType, other.customerNotificationType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isBackupEnabled == null ? 43 : this.isBackupEnabled.hashCode());
        result = (result * PRIME) + (this.backupRegion == null ? 43 : this.backupRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.customerNotificationType == null
                                ? 43
                                : this.customerNotificationType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

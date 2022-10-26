/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Parameters for the softReset {@link #instanceAction(InstanceActionRequest) instanceAction}. If
 * omitted, default values are used. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SoftResetActionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "actionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SoftResetActionDetails extends InstancePowerActionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * For instances that use a DenseIO shape, the flag denoting whether [reboot
         * migration](https://docs.cloud.oracle.com/iaas/Content/Compute/References/infrastructure-maintenance.htm#reboot)
         * is performed for the instance. The default value is {@code false}.
         *
         * <p>If the instance has a date in the Maintenance reboot field and you do nothing (or set
         * this flag to {@code false}), the instance will be rebuilt at the scheduled maintenance
         * time. The instance will experience 2-6 hours of downtime during the maintenance process.
         * The local NVMe-based SSD will be preserved.
         *
         * <p>If you want to minimize downtime and can delete the SSD, you can set this flag to
         * {@code true} and proactively reboot the instance before the scheduled maintenance time.
         * The instance will be reboot migrated to a healthy host and the SSD will be deleted. A
         * short downtime occurs during the migration.
         *
         * <p>*Caution:** When {@code true}, the SSD is permanently deleted. We recommend that you
         * create a backup of the SSD before proceeding.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("allowDenseRebootMigration")
        private Boolean allowDenseRebootMigration;

        /**
         * For instances that use a DenseIO shape, the flag denoting whether [reboot
         * migration](https://docs.cloud.oracle.com/iaas/Content/Compute/References/infrastructure-maintenance.htm#reboot)
         * is performed for the instance. The default value is {@code false}.
         *
         * <p>If the instance has a date in the Maintenance reboot field and you do nothing (or set
         * this flag to {@code false}), the instance will be rebuilt at the scheduled maintenance
         * time. The instance will experience 2-6 hours of downtime during the maintenance process.
         * The local NVMe-based SSD will be preserved.
         *
         * <p>If you want to minimize downtime and can delete the SSD, you can set this flag to
         * {@code true} and proactively reboot the instance before the scheduled maintenance time.
         * The instance will be reboot migrated to a healthy host and the SSD will be deleted. A
         * short downtime occurs during the migration.
         *
         * <p>*Caution:** When {@code true}, the SSD is permanently deleted. We recommend that you
         * create a backup of the SSD before proceeding.
         *
         * @param allowDenseRebootMigration the value to set
         * @return this builder
         */
        public Builder allowDenseRebootMigration(Boolean allowDenseRebootMigration) {
            this.allowDenseRebootMigration = allowDenseRebootMigration;
            this.__explicitlySet__.add("allowDenseRebootMigration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SoftResetActionDetails build() {
            SoftResetActionDetails model =
                    new SoftResetActionDetails(this.allowDenseRebootMigration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SoftResetActionDetails model) {
            if (model.wasPropertyExplicitlySet("allowDenseRebootMigration")) {
                this.allowDenseRebootMigration(model.getAllowDenseRebootMigration());
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

    @Deprecated
    public SoftResetActionDetails(Boolean allowDenseRebootMigration) {
        super();
        this.allowDenseRebootMigration = allowDenseRebootMigration;
    }

    /**
     * For instances that use a DenseIO shape, the flag denoting whether [reboot
     * migration](https://docs.cloud.oracle.com/iaas/Content/Compute/References/infrastructure-maintenance.htm#reboot)
     * is performed for the instance. The default value is {@code false}.
     *
     * <p>If the instance has a date in the Maintenance reboot field and you do nothing (or set this
     * flag to {@code false}), the instance will be rebuilt at the scheduled maintenance time. The
     * instance will experience 2-6 hours of downtime during the maintenance process. The local
     * NVMe-based SSD will be preserved.
     *
     * <p>If you want to minimize downtime and can delete the SSD, you can set this flag to {@code
     * true} and proactively reboot the instance before the scheduled maintenance time. The instance
     * will be reboot migrated to a healthy host and the SSD will be deleted. A short downtime
     * occurs during the migration.
     *
     * <p>*Caution:** When {@code true}, the SSD is permanently deleted. We recommend that you
     * create a backup of the SSD before proceeding.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("allowDenseRebootMigration")
    private final Boolean allowDenseRebootMigration;

    /**
     * For instances that use a DenseIO shape, the flag denoting whether [reboot
     * migration](https://docs.cloud.oracle.com/iaas/Content/Compute/References/infrastructure-maintenance.htm#reboot)
     * is performed for the instance. The default value is {@code false}.
     *
     * <p>If the instance has a date in the Maintenance reboot field and you do nothing (or set this
     * flag to {@code false}), the instance will be rebuilt at the scheduled maintenance time. The
     * instance will experience 2-6 hours of downtime during the maintenance process. The local
     * NVMe-based SSD will be preserved.
     *
     * <p>If you want to minimize downtime and can delete the SSD, you can set this flag to {@code
     * true} and proactively reboot the instance before the scheduled maintenance time. The instance
     * will be reboot migrated to a healthy host and the SSD will be deleted. A short downtime
     * occurs during the migration.
     *
     * <p>*Caution:** When {@code true}, the SSD is permanently deleted. We recommend that you
     * create a backup of the SSD before proceeding.
     *
     * @return the value
     */
    public Boolean getAllowDenseRebootMigration() {
        return allowDenseRebootMigration;
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
        sb.append("SoftResetActionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", allowDenseRebootMigration=")
                .append(String.valueOf(this.allowDenseRebootMigration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SoftResetActionDetails)) {
            return false;
        }

        SoftResetActionDetails other = (SoftResetActionDetails) o;
        return java.util.Objects.equals(
                        this.allowDenseRebootMigration, other.allowDenseRebootMigration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.allowDenseRebootMigration == null
                                ? 43
                                : this.allowDenseRebootMigration.hashCode());
        return result;
    }
}

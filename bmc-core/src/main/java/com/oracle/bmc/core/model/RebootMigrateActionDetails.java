/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Parameters for the {@code rebootMigrate} {@link #instanceAction(InstanceActionRequest)
 * instanceAction}. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RebootMigrateActionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "actionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RebootMigrateActionDetails extends InstancePowerActionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * For bare metal instances that have local storage, this must be set to true to verify that
         * the local storage will be deleted during the migration. For instances without, this
         * parameter has no effect.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deleteLocalStorage")
        private Boolean deleteLocalStorage;

        /**
         * For bare metal instances that have local storage, this must be set to true to verify that
         * the local storage will be deleted during the migration. For instances without, this
         * parameter has no effect.
         *
         * @param deleteLocalStorage the value to set
         * @return this builder
         */
        public Builder deleteLocalStorage(Boolean deleteLocalStorage) {
            this.deleteLocalStorage = deleteLocalStorage;
            this.__explicitlySet__.add("deleteLocalStorage");
            return this;
        }
        /**
         * If present, this parameter will set (or reset) the scheduled time that the instance will
         * be reboot migrated in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). This will also change the {@code
         * timeMaintenanceRebootDue} field on the instance.
         *
         * <p>If not present, the reboot migration will be triggered immediately.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
        private java.util.Date timeScheduled;

        /**
         * If present, this parameter will set (or reset) the scheduled time that the instance will
         * be reboot migrated in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). This will also change the {@code
         * timeMaintenanceRebootDue} field on the instance.
         *
         * <p>If not present, the reboot migration will be triggered immediately.
         *
         * @param timeScheduled the value to set
         * @return this builder
         */
        public Builder timeScheduled(java.util.Date timeScheduled) {
            this.timeScheduled = timeScheduled;
            this.__explicitlySet__.add("timeScheduled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RebootMigrateActionDetails build() {
            RebootMigrateActionDetails model =
                    new RebootMigrateActionDetails(this.deleteLocalStorage, this.timeScheduled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RebootMigrateActionDetails model) {
            if (model.wasPropertyExplicitlySet("deleteLocalStorage")) {
                this.deleteLocalStorage(model.getDeleteLocalStorage());
            }
            if (model.wasPropertyExplicitlySet("timeScheduled")) {
                this.timeScheduled(model.getTimeScheduled());
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
    public RebootMigrateActionDetails(Boolean deleteLocalStorage, java.util.Date timeScheduled) {
        super();
        this.deleteLocalStorage = deleteLocalStorage;
        this.timeScheduled = timeScheduled;
    }

    /**
     * For bare metal instances that have local storage, this must be set to true to verify that the
     * local storage will be deleted during the migration. For instances without, this parameter has
     * no effect.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deleteLocalStorage")
    private final Boolean deleteLocalStorage;

    /**
     * For bare metal instances that have local storage, this must be set to true to verify that the
     * local storage will be deleted during the migration. For instances without, this parameter has
     * no effect.
     *
     * @return the value
     */
    public Boolean getDeleteLocalStorage() {
        return deleteLocalStorage;
    }

    /**
     * If present, this parameter will set (or reset) the scheduled time that the instance will be
     * reboot migrated in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). This
     * will also change the {@code timeMaintenanceRebootDue} field on the instance.
     *
     * <p>If not present, the reboot migration will be triggered immediately.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
    private final java.util.Date timeScheduled;

    /**
     * If present, this parameter will set (or reset) the scheduled time that the instance will be
     * reboot migrated in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339). This
     * will also change the {@code timeMaintenanceRebootDue} field on the instance.
     *
     * <p>If not present, the reboot migration will be triggered immediately.
     *
     * @return the value
     */
    public java.util.Date getTimeScheduled() {
        return timeScheduled;
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
        sb.append("RebootMigrateActionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", deleteLocalStorage=").append(String.valueOf(this.deleteLocalStorage));
        sb.append(", timeScheduled=").append(String.valueOf(this.timeScheduled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RebootMigrateActionDetails)) {
            return false;
        }

        RebootMigrateActionDetails other = (RebootMigrateActionDetails) o;
        return java.util.Objects.equals(this.deleteLocalStorage, other.deleteLocalStorage)
                && java.util.Objects.equals(this.timeScheduled, other.timeScheduled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.deleteLocalStorage == null
                                ? 43
                                : this.deleteLocalStorage.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduled == null ? 43 : this.timeScheduled.hashCode());
        return result;
    }
}

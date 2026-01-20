/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.model;

/**
 * The details for scheduling deletion of the protected database <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScheduleProtectedDatabaseDeletionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScheduleProtectedDatabaseDeletionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"deletionSchedule"})
    public ScheduleProtectedDatabaseDeletionDetails(DeletionSchedule deletionSchedule) {
        super();
        this.deletionSchedule = deletionSchedule;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Defines a preferred schedule to delete a protected database after you terminate the
         * source database. * The default schedule is DELETE_AFTER_72_HOURS, so that the delete
         * operation can occur 72 hours (3 days) after the source database is terminated. * The
         * alternate schedule is DELETE_AFTER_RETENTION_PERIOD. Specify this option if you want to
         * delete a protected database only after the policy-defined backup retention period
         * expires.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deletionSchedule")
        private DeletionSchedule deletionSchedule;

        /**
         * Defines a preferred schedule to delete a protected database after you terminate the
         * source database. * The default schedule is DELETE_AFTER_72_HOURS, so that the delete
         * operation can occur 72 hours (3 days) after the source database is terminated. * The
         * alternate schedule is DELETE_AFTER_RETENTION_PERIOD. Specify this option if you want to
         * delete a protected database only after the policy-defined backup retention period
         * expires.
         *
         * @param deletionSchedule the value to set
         * @return this builder
         */
        public Builder deletionSchedule(DeletionSchedule deletionSchedule) {
            this.deletionSchedule = deletionSchedule;
            this.__explicitlySet__.add("deletionSchedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduleProtectedDatabaseDeletionDetails build() {
            ScheduleProtectedDatabaseDeletionDetails model =
                    new ScheduleProtectedDatabaseDeletionDetails(this.deletionSchedule);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduleProtectedDatabaseDeletionDetails model) {
            if (model.wasPropertyExplicitlySet("deletionSchedule")) {
                this.deletionSchedule(model.getDeletionSchedule());
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
     * Defines a preferred schedule to delete a protected database after you terminate the source
     * database. * The default schedule is DELETE_AFTER_72_HOURS, so that the delete operation can
     * occur 72 hours (3 days) after the source database is terminated. * The alternate schedule is
     * DELETE_AFTER_RETENTION_PERIOD. Specify this option if you want to delete a protected database
     * only after the policy-defined backup retention period expires.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deletionSchedule")
    private final DeletionSchedule deletionSchedule;

    /**
     * Defines a preferred schedule to delete a protected database after you terminate the source
     * database. * The default schedule is DELETE_AFTER_72_HOURS, so that the delete operation can
     * occur 72 hours (3 days) after the source database is terminated. * The alternate schedule is
     * DELETE_AFTER_RETENTION_PERIOD. Specify this option if you want to delete a protected database
     * only after the policy-defined backup retention period expires.
     *
     * @return the value
     */
    public DeletionSchedule getDeletionSchedule() {
        return deletionSchedule;
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
        sb.append("ScheduleProtectedDatabaseDeletionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("deletionSchedule=").append(String.valueOf(this.deletionSchedule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduleProtectedDatabaseDeletionDetails)) {
            return false;
        }

        ScheduleProtectedDatabaseDeletionDetails other =
                (ScheduleProtectedDatabaseDeletionDetails) o;
        return java.util.Objects.equals(this.deletionSchedule, other.deletionSchedule)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.deletionSchedule == null ? 43 : this.deletionSchedule.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

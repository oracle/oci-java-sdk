/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The maximum possible date and time that a maintenance reboot can be extended. <br>
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
        builder = InstanceMaintenanceReboot.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstanceMaintenanceReboot
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeMaintenanceRebootDueMax"})
    public InstanceMaintenanceReboot(java.util.Date timeMaintenanceRebootDueMax) {
        super();
        this.timeMaintenanceRebootDueMax = timeMaintenanceRebootDueMax;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The maximum extension date and time for the maintenance reboot, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). The range for the maintenance extension
         * is between 1 and 14 days from the initial scheduled maintenance date. Example: {@code
         * 2018-05-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceRebootDueMax")
        private java.util.Date timeMaintenanceRebootDueMax;

        /**
         * The maximum extension date and time for the maintenance reboot, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). The range for the maintenance extension
         * is between 1 and 14 days from the initial scheduled maintenance date. Example: {@code
         * 2018-05-25T21:10:29.600Z}
         *
         * @param timeMaintenanceRebootDueMax the value to set
         * @return this builder
         */
        public Builder timeMaintenanceRebootDueMax(java.util.Date timeMaintenanceRebootDueMax) {
            this.timeMaintenanceRebootDueMax = timeMaintenanceRebootDueMax;
            this.__explicitlySet__.add("timeMaintenanceRebootDueMax");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceMaintenanceReboot build() {
            InstanceMaintenanceReboot model =
                    new InstanceMaintenanceReboot(this.timeMaintenanceRebootDueMax);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceMaintenanceReboot model) {
            if (model.wasPropertyExplicitlySet("timeMaintenanceRebootDueMax")) {
                this.timeMaintenanceRebootDueMax(model.getTimeMaintenanceRebootDueMax());
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
     * The maximum extension date and time for the maintenance reboot, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). The range for the maintenance extension is
     * between 1 and 14 days from the initial scheduled maintenance date. Example: {@code
     * 2018-05-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceRebootDueMax")
    private final java.util.Date timeMaintenanceRebootDueMax;

    /**
     * The maximum extension date and time for the maintenance reboot, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). The range for the maintenance extension is
     * between 1 and 14 days from the initial scheduled maintenance date. Example: {@code
     * 2018-05-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeMaintenanceRebootDueMax() {
        return timeMaintenanceRebootDueMax;
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
        sb.append("InstanceMaintenanceReboot(");
        sb.append("super=").append(super.toString());
        sb.append("timeMaintenanceRebootDueMax=")
                .append(String.valueOf(this.timeMaintenanceRebootDueMax));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceMaintenanceReboot)) {
            return false;
        }

        InstanceMaintenanceReboot other = (InstanceMaintenanceReboot) o;
        return java.util.Objects.equals(
                        this.timeMaintenanceRebootDueMax, other.timeMaintenanceRebootDueMax)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeMaintenanceRebootDueMax == null
                                ? 43
                                : this.timeMaintenanceRebootDueMax.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

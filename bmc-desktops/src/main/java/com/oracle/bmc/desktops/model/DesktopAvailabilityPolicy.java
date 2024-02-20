/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.model;

/**
 * Provides the start and stop schedule information for desktop availability of the desktop pool.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DesktopAvailabilityPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DesktopAvailabilityPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"startSchedule", "stopSchedule"})
    public DesktopAvailabilityPolicy(DesktopSchedule startSchedule, DesktopSchedule stopSchedule) {
        super();
        this.startSchedule = startSchedule;
        this.stopSchedule = stopSchedule;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("startSchedule")
        private DesktopSchedule startSchedule;

        public Builder startSchedule(DesktopSchedule startSchedule) {
            this.startSchedule = startSchedule;
            this.__explicitlySet__.add("startSchedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stopSchedule")
        private DesktopSchedule stopSchedule;

        public Builder stopSchedule(DesktopSchedule stopSchedule) {
            this.stopSchedule = stopSchedule;
            this.__explicitlySet__.add("stopSchedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DesktopAvailabilityPolicy build() {
            DesktopAvailabilityPolicy model =
                    new DesktopAvailabilityPolicy(this.startSchedule, this.stopSchedule);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DesktopAvailabilityPolicy model) {
            if (model.wasPropertyExplicitlySet("startSchedule")) {
                this.startSchedule(model.getStartSchedule());
            }
            if (model.wasPropertyExplicitlySet("stopSchedule")) {
                this.stopSchedule(model.getStopSchedule());
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

    @com.fasterxml.jackson.annotation.JsonProperty("startSchedule")
    private final DesktopSchedule startSchedule;

    public DesktopSchedule getStartSchedule() {
        return startSchedule;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stopSchedule")
    private final DesktopSchedule stopSchedule;

    public DesktopSchedule getStopSchedule() {
        return stopSchedule;
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
        sb.append("DesktopAvailabilityPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("startSchedule=").append(String.valueOf(this.startSchedule));
        sb.append(", stopSchedule=").append(String.valueOf(this.stopSchedule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DesktopAvailabilityPolicy)) {
            return false;
        }

        DesktopAvailabilityPolicy other = (DesktopAvailabilityPolicy) o;
        return java.util.Objects.equals(this.startSchedule, other.startSchedule)
                && java.util.Objects.equals(this.stopSchedule, other.stopSchedule)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.startSchedule == null ? 43 : this.startSchedule.hashCode());
        result = (result * PRIME) + (this.stopSchedule == null ? 43 : this.stopSchedule.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

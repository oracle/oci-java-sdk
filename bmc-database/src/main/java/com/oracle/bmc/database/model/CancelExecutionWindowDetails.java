/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Describe the parameters to create a new execution window after this execution window is canceled.
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CancelExecutionWindowDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CancelExecutionWindowDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeScheduledOfNewWindow",
        "windowDurationInMinsOfNewWindow",
        "isEnforcedDurationOfNewWindow"
    })
    public CancelExecutionWindowDetails(
            java.util.Date timeScheduledOfNewWindow,
            Integer windowDurationInMinsOfNewWindow,
            Boolean isEnforcedDurationOfNewWindow) {
        super();
        this.timeScheduledOfNewWindow = timeScheduledOfNewWindow;
        this.windowDurationInMinsOfNewWindow = windowDurationInMinsOfNewWindow;
        this.isEnforcedDurationOfNewWindow = isEnforcedDurationOfNewWindow;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** New scheduled date and time of the execution window. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduledOfNewWindow")
        private java.util.Date timeScheduledOfNewWindow;

        /**
         * New scheduled date and time of the execution window.
         *
         * @param timeScheduledOfNewWindow the value to set
         * @return this builder
         */
        public Builder timeScheduledOfNewWindow(java.util.Date timeScheduledOfNewWindow) {
            this.timeScheduledOfNewWindow = timeScheduledOfNewWindow;
            this.__explicitlySet__.add("timeScheduledOfNewWindow");
            return this;
        }
        /**
         * Duration window allows user to set a duration they plan to allocate for Scheduling
         * window. The duration is in minutes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("windowDurationInMinsOfNewWindow")
        private Integer windowDurationInMinsOfNewWindow;

        /**
         * Duration window allows user to set a duration they plan to allocate for Scheduling
         * window. The duration is in minutes.
         *
         * @param windowDurationInMinsOfNewWindow the value to set
         * @return this builder
         */
        public Builder windowDurationInMinsOfNewWindow(Integer windowDurationInMinsOfNewWindow) {
            this.windowDurationInMinsOfNewWindow = windowDurationInMinsOfNewWindow;
            this.__explicitlySet__.add("windowDurationInMinsOfNewWindow");
            return this;
        }
        /**
         * Indicates if duration the user plans to allocate for scheduling window is strictly
         * enforced. The default value is {@code FALSE}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedDurationOfNewWindow")
        private Boolean isEnforcedDurationOfNewWindow;

        /**
         * Indicates if duration the user plans to allocate for scheduling window is strictly
         * enforced. The default value is {@code FALSE}.
         *
         * @param isEnforcedDurationOfNewWindow the value to set
         * @return this builder
         */
        public Builder isEnforcedDurationOfNewWindow(Boolean isEnforcedDurationOfNewWindow) {
            this.isEnforcedDurationOfNewWindow = isEnforcedDurationOfNewWindow;
            this.__explicitlySet__.add("isEnforcedDurationOfNewWindow");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CancelExecutionWindowDetails build() {
            CancelExecutionWindowDetails model =
                    new CancelExecutionWindowDetails(
                            this.timeScheduledOfNewWindow,
                            this.windowDurationInMinsOfNewWindow,
                            this.isEnforcedDurationOfNewWindow);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CancelExecutionWindowDetails model) {
            if (model.wasPropertyExplicitlySet("timeScheduledOfNewWindow")) {
                this.timeScheduledOfNewWindow(model.getTimeScheduledOfNewWindow());
            }
            if (model.wasPropertyExplicitlySet("windowDurationInMinsOfNewWindow")) {
                this.windowDurationInMinsOfNewWindow(model.getWindowDurationInMinsOfNewWindow());
            }
            if (model.wasPropertyExplicitlySet("isEnforcedDurationOfNewWindow")) {
                this.isEnforcedDurationOfNewWindow(model.getIsEnforcedDurationOfNewWindow());
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

    /** New scheduled date and time of the execution window. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduledOfNewWindow")
    private final java.util.Date timeScheduledOfNewWindow;

    /**
     * New scheduled date and time of the execution window.
     *
     * @return the value
     */
    public java.util.Date getTimeScheduledOfNewWindow() {
        return timeScheduledOfNewWindow;
    }

    /**
     * Duration window allows user to set a duration they plan to allocate for Scheduling window.
     * The duration is in minutes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("windowDurationInMinsOfNewWindow")
    private final Integer windowDurationInMinsOfNewWindow;

    /**
     * Duration window allows user to set a duration they plan to allocate for Scheduling window.
     * The duration is in minutes.
     *
     * @return the value
     */
    public Integer getWindowDurationInMinsOfNewWindow() {
        return windowDurationInMinsOfNewWindow;
    }

    /**
     * Indicates if duration the user plans to allocate for scheduling window is strictly enforced.
     * The default value is {@code FALSE}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnforcedDurationOfNewWindow")
    private final Boolean isEnforcedDurationOfNewWindow;

    /**
     * Indicates if duration the user plans to allocate for scheduling window is strictly enforced.
     * The default value is {@code FALSE}.
     *
     * @return the value
     */
    public Boolean getIsEnforcedDurationOfNewWindow() {
        return isEnforcedDurationOfNewWindow;
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
        sb.append("CancelExecutionWindowDetails(");
        sb.append("super=").append(super.toString());
        sb.append("timeScheduledOfNewWindow=")
                .append(String.valueOf(this.timeScheduledOfNewWindow));
        sb.append(", windowDurationInMinsOfNewWindow=")
                .append(String.valueOf(this.windowDurationInMinsOfNewWindow));
        sb.append(", isEnforcedDurationOfNewWindow=")
                .append(String.valueOf(this.isEnforcedDurationOfNewWindow));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CancelExecutionWindowDetails)) {
            return false;
        }

        CancelExecutionWindowDetails other = (CancelExecutionWindowDetails) o;
        return java.util.Objects.equals(
                        this.timeScheduledOfNewWindow, other.timeScheduledOfNewWindow)
                && java.util.Objects.equals(
                        this.windowDurationInMinsOfNewWindow, other.windowDurationInMinsOfNewWindow)
                && java.util.Objects.equals(
                        this.isEnforcedDurationOfNewWindow, other.isEnforcedDurationOfNewWindow)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeScheduledOfNewWindow == null
                                ? 43
                                : this.timeScheduledOfNewWindow.hashCode());
        result =
                (result * PRIME)
                        + (this.windowDurationInMinsOfNewWindow == null
                                ? 43
                                : this.windowDurationInMinsOfNewWindow.hashCode());
        result =
                (result * PRIME)
                        + (this.isEnforcedDurationOfNewWindow == null
                                ? 43
                                : this.isEnforcedDurationOfNewWindow.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

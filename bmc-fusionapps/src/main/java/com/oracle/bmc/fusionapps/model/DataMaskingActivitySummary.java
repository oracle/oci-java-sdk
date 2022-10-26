/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Summary of the data masking activity. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DataMaskingActivitySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DataMaskingActivitySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "lifecycleState",
        "timeMaskingStart",
        "timeMaskingFinish"
    })
    public DataMaskingActivitySummary(
            String id,
            DataMaskingActivity.LifecycleState lifecycleState,
            java.util.Date timeMaskingStart,
            java.util.Date timeMaskingFinish) {
        super();
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.timeMaskingStart = timeMaskingStart;
        this.timeMaskingFinish = timeMaskingFinish;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier that is immutable on creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The current state of the data masking activity Scheduled, In progress , Failed, Completed
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private DataMaskingActivity.LifecycleState lifecycleState;

        /**
         * The current state of the data masking activity Scheduled, In progress , Failed, Completed
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(DataMaskingActivity.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The time the data masking activity started. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeMaskingStart")
        private java.util.Date timeMaskingStart;

        /**
         * The time the data masking activity started. An RFC3339 formatted datetime string.
         *
         * @param timeMaskingStart the value to set
         * @return this builder
         */
        public Builder timeMaskingStart(java.util.Date timeMaskingStart) {
            this.timeMaskingStart = timeMaskingStart;
            this.__explicitlySet__.add("timeMaskingStart");
            return this;
        }
        /**
         * The time the data masking activity actually completed / cancelled / failed. An RFC3339
         * formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeMaskingFinish")
        private java.util.Date timeMaskingFinish;

        /**
         * The time the data masking activity actually completed / cancelled / failed. An RFC3339
         * formatted datetime string.
         *
         * @param timeMaskingFinish the value to set
         * @return this builder
         */
        public Builder timeMaskingFinish(java.util.Date timeMaskingFinish) {
            this.timeMaskingFinish = timeMaskingFinish;
            this.__explicitlySet__.add("timeMaskingFinish");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataMaskingActivitySummary build() {
            DataMaskingActivitySummary model =
                    new DataMaskingActivitySummary(
                            this.id,
                            this.lifecycleState,
                            this.timeMaskingStart,
                            this.timeMaskingFinish);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataMaskingActivitySummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeMaskingStart")) {
                this.timeMaskingStart(model.getTimeMaskingStart());
            }
            if (model.wasPropertyExplicitlySet("timeMaskingFinish")) {
                this.timeMaskingFinish(model.getTimeMaskingFinish());
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

    /** Unique identifier that is immutable on creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The current state of the data masking activity Scheduled, In progress , Failed, Completed */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final DataMaskingActivity.LifecycleState lifecycleState;

    /**
     * The current state of the data masking activity Scheduled, In progress , Failed, Completed
     *
     * @return the value
     */
    public DataMaskingActivity.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The time the data masking activity started. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaskingStart")
    private final java.util.Date timeMaskingStart;

    /**
     * The time the data masking activity started. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeMaskingStart() {
        return timeMaskingStart;
    }

    /**
     * The time the data masking activity actually completed / cancelled / failed. An RFC3339
     * formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaskingFinish")
    private final java.util.Date timeMaskingFinish;

    /**
     * The time the data masking activity actually completed / cancelled / failed. An RFC3339
     * formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeMaskingFinish() {
        return timeMaskingFinish;
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
        sb.append("DataMaskingActivitySummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeMaskingStart=").append(String.valueOf(this.timeMaskingStart));
        sb.append(", timeMaskingFinish=").append(String.valueOf(this.timeMaskingFinish));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataMaskingActivitySummary)) {
            return false;
        }

        DataMaskingActivitySummary other = (DataMaskingActivitySummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeMaskingStart, other.timeMaskingStart)
                && java.util.Objects.equals(this.timeMaskingFinish, other.timeMaskingFinish)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMaskingStart == null ? 43 : this.timeMaskingStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMaskingFinish == null ? 43 : this.timeMaskingFinish.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

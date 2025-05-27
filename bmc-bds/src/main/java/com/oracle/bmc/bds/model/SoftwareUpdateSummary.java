/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The software update that is currently available for the cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SoftwareUpdateSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SoftwareUpdateSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "softwareUpdateKey",
        "softwareUpdateVersion",
        "timeReleased",
        "softwareUpdateType",
        "lifecycleState"
    })
    public SoftwareUpdateSummary(
            String softwareUpdateKey,
            String softwareUpdateVersion,
            java.util.Date timeReleased,
            SoftwareUpdate.SoftwareUpdateType softwareUpdateType,
            SoftwareUpdate.LifecycleState lifecycleState) {
        super();
        this.softwareUpdateKey = softwareUpdateKey;
        this.softwareUpdateVersion = softwareUpdateVersion;
        this.timeReleased = timeReleased;
        this.softwareUpdateType = softwareUpdateType;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier of a given software update */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareUpdateKey")
        private String softwareUpdateKey;

        /**
         * Unique identifier of a given software update
         *
         * @param softwareUpdateKey the value to set
         * @return this builder
         */
        public Builder softwareUpdateKey(String softwareUpdateKey) {
            this.softwareUpdateKey = softwareUpdateKey;
            this.__explicitlySet__.add("softwareUpdateKey");
            return this;
        }
        /** The version of the software update. */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareUpdateVersion")
        private String softwareUpdateVersion;

        /**
         * The version of the software update.
         *
         * @param softwareUpdateVersion the value to set
         * @return this builder
         */
        public Builder softwareUpdateVersion(String softwareUpdateVersion) {
            this.softwareUpdateVersion = softwareUpdateVersion;
            this.__explicitlySet__.add("softwareUpdateVersion");
            return this;
        }
        /** The time when the software update was released. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
        private java.util.Date timeReleased;

        /**
         * The time when the software update was released.
         *
         * @param timeReleased the value to set
         * @return this builder
         */
        public Builder timeReleased(java.util.Date timeReleased) {
            this.timeReleased = timeReleased;
            this.__explicitlySet__.add("timeReleased");
            return this;
        }
        /** Type of current software update. */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareUpdateType")
        private SoftwareUpdate.SoftwareUpdateType softwareUpdateType;

        /**
         * Type of current software update.
         *
         * @param softwareUpdateType the value to set
         * @return this builder
         */
        public Builder softwareUpdateType(SoftwareUpdate.SoftwareUpdateType softwareUpdateType) {
            this.softwareUpdateType = softwareUpdateType;
            this.__explicitlySet__.add("softwareUpdateType");
            return this;
        }
        /** The lifecycle state of the software update. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SoftwareUpdate.LifecycleState lifecycleState;

        /**
         * The lifecycle state of the software update.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(SoftwareUpdate.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SoftwareUpdateSummary build() {
            SoftwareUpdateSummary model =
                    new SoftwareUpdateSummary(
                            this.softwareUpdateKey,
                            this.softwareUpdateVersion,
                            this.timeReleased,
                            this.softwareUpdateType,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SoftwareUpdateSummary model) {
            if (model.wasPropertyExplicitlySet("softwareUpdateKey")) {
                this.softwareUpdateKey(model.getSoftwareUpdateKey());
            }
            if (model.wasPropertyExplicitlySet("softwareUpdateVersion")) {
                this.softwareUpdateVersion(model.getSoftwareUpdateVersion());
            }
            if (model.wasPropertyExplicitlySet("timeReleased")) {
                this.timeReleased(model.getTimeReleased());
            }
            if (model.wasPropertyExplicitlySet("softwareUpdateType")) {
                this.softwareUpdateType(model.getSoftwareUpdateType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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

    /** Unique identifier of a given software update */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareUpdateKey")
    private final String softwareUpdateKey;

    /**
     * Unique identifier of a given software update
     *
     * @return the value
     */
    public String getSoftwareUpdateKey() {
        return softwareUpdateKey;
    }

    /** The version of the software update. */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareUpdateVersion")
    private final String softwareUpdateVersion;

    /**
     * The version of the software update.
     *
     * @return the value
     */
    public String getSoftwareUpdateVersion() {
        return softwareUpdateVersion;
    }

    /** The time when the software update was released. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
    private final java.util.Date timeReleased;

    /**
     * The time when the software update was released.
     *
     * @return the value
     */
    public java.util.Date getTimeReleased() {
        return timeReleased;
    }

    /** Type of current software update. */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareUpdateType")
    private final SoftwareUpdate.SoftwareUpdateType softwareUpdateType;

    /**
     * Type of current software update.
     *
     * @return the value
     */
    public SoftwareUpdate.SoftwareUpdateType getSoftwareUpdateType() {
        return softwareUpdateType;
    }

    /** The lifecycle state of the software update. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final SoftwareUpdate.LifecycleState lifecycleState;

    /**
     * The lifecycle state of the software update.
     *
     * @return the value
     */
    public SoftwareUpdate.LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("SoftwareUpdateSummary(");
        sb.append("super=").append(super.toString());
        sb.append("softwareUpdateKey=").append(String.valueOf(this.softwareUpdateKey));
        sb.append(", softwareUpdateVersion=").append(String.valueOf(this.softwareUpdateVersion));
        sb.append(", timeReleased=").append(String.valueOf(this.timeReleased));
        sb.append(", softwareUpdateType=").append(String.valueOf(this.softwareUpdateType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SoftwareUpdateSummary)) {
            return false;
        }

        SoftwareUpdateSummary other = (SoftwareUpdateSummary) o;
        return java.util.Objects.equals(this.softwareUpdateKey, other.softwareUpdateKey)
                && java.util.Objects.equals(this.softwareUpdateVersion, other.softwareUpdateVersion)
                && java.util.Objects.equals(this.timeReleased, other.timeReleased)
                && java.util.Objects.equals(this.softwareUpdateType, other.softwareUpdateType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.softwareUpdateKey == null ? 43 : this.softwareUpdateKey.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareUpdateVersion == null
                                ? 43
                                : this.softwareUpdateVersion.hashCode());
        result = (result * PRIME) + (this.timeReleased == null ? 43 : this.timeReleased.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareUpdateType == null
                                ? 43
                                : this.softwareUpdateType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details about the given BDS type of software update. Previously known as Micro Service Patch.
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BdsSoftwareUpdate.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "softwareUpdateType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BdsSoftwareUpdate extends SoftwareUpdate {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("softwareUpdateKey")
        private String softwareUpdateKey;

        public Builder softwareUpdateKey(String softwareUpdateKey) {
            this.softwareUpdateKey = softwareUpdateKey;
            this.__explicitlySet__.add("softwareUpdateKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("softwareUpdateVersion")
        private String softwareUpdateVersion;

        public Builder softwareUpdateVersion(String softwareUpdateVersion) {
            this.softwareUpdateVersion = softwareUpdateVersion;
            this.__explicitlySet__.add("softwareUpdateVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeReleased")
        private java.util.Date timeReleased;

        public Builder timeReleased(java.util.Date timeReleased) {
            this.timeReleased = timeReleased;
            this.__explicitlySet__.add("timeReleased");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The due date for the software update. Big Data Service will be updated automatically
         * after this date.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDue")
        private java.util.Date timeDue;

        /**
         * The due date for the software update. Big Data Service will be updated automatically
         * after this date.
         *
         * @param timeDue the value to set
         * @return this builder
         */
        public Builder timeDue(java.util.Date timeDue) {
            this.timeDue = timeDue;
            this.__explicitlySet__.add("timeDue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BdsSoftwareUpdate build() {
            BdsSoftwareUpdate model =
                    new BdsSoftwareUpdate(
                            this.softwareUpdateKey,
                            this.softwareUpdateVersion,
                            this.timeReleased,
                            this.lifecycleState,
                            this.timeDue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BdsSoftwareUpdate model) {
            if (model.wasPropertyExplicitlySet("softwareUpdateKey")) {
                this.softwareUpdateKey(model.getSoftwareUpdateKey());
            }
            if (model.wasPropertyExplicitlySet("softwareUpdateVersion")) {
                this.softwareUpdateVersion(model.getSoftwareUpdateVersion());
            }
            if (model.wasPropertyExplicitlySet("timeReleased")) {
                this.timeReleased(model.getTimeReleased());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeDue")) {
                this.timeDue(model.getTimeDue());
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
    public BdsSoftwareUpdate(
            String softwareUpdateKey,
            String softwareUpdateVersion,
            java.util.Date timeReleased,
            LifecycleState lifecycleState,
            java.util.Date timeDue) {
        super(softwareUpdateKey, softwareUpdateVersion, timeReleased, lifecycleState);
        this.timeDue = timeDue;
    }

    /**
     * The due date for the software update. Big Data Service will be updated automatically after
     * this date.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDue")
    private final java.util.Date timeDue;

    /**
     * The due date for the software update. Big Data Service will be updated automatically after
     * this date.
     *
     * @return the value
     */
    public java.util.Date getTimeDue() {
        return timeDue;
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
        sb.append("BdsSoftwareUpdate(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", timeDue=").append(String.valueOf(this.timeDue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BdsSoftwareUpdate)) {
            return false;
        }

        BdsSoftwareUpdate other = (BdsSoftwareUpdate) o;
        return java.util.Objects.equals(this.timeDue, other.timeDue) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.timeDue == null ? 43 : this.timeDue.hashCode());
        return result;
    }
}

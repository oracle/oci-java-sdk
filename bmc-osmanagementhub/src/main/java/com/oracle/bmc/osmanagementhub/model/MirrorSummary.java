/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Summary of a Mirror <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MirrorSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MirrorSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "type",
        "osFamily",
        "archType",
        "state",
        "percentage",
        "timeLastSynced",
        "log"
    })
    public MirrorSummary(
            String id,
            String displayName,
            MirrorType type,
            OsFamily osFamily,
            ArchType archType,
            MirrorState state,
            Integer percentage,
            java.util.Date timeLastSynced,
            String log) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.type = type;
        this.osFamily = osFamily;
        this.archType = archType;
        this.state = state;
        this.percentage = percentage;
        this.timeLastSynced = timeLastSynced;
        this.log = log;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of a software source */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID of a software source
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Display name of the mirror */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the mirror
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Type of the mirror */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private MirrorType type;

        /**
         * Type of the mirror
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(MirrorType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The OS family the Software Source belongs to */
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamily osFamily;

        /**
         * The OS family the Software Source belongs to
         *
         * @param osFamily the value to set
         * @return this builder
         */
        public Builder osFamily(OsFamily osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /** The architecture type supported by the Software Source */
        @com.fasterxml.jackson.annotation.JsonProperty("archType")
        private ArchType archType;

        /**
         * The architecture type supported by the Software Source
         *
         * @param archType the value to set
         * @return this builder
         */
        public Builder archType(ArchType archType) {
            this.archType = archType;
            this.__explicitlySet__.add("archType");
            return this;
        }
        /** Current state of the mirror */
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private MirrorState state;

        /**
         * Current state of the mirror
         *
         * @param state the value to set
         * @return this builder
         */
        public Builder state(MirrorState state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /** A decimal number representing the completness percentage */
        @com.fasterxml.jackson.annotation.JsonProperty("percentage")
        private Integer percentage;

        /**
         * A decimal number representing the completness percentage
         *
         * @param percentage the value to set
         * @return this builder
         */
        public Builder percentage(Integer percentage) {
            this.percentage = percentage;
            this.__explicitlySet__.add("percentage");
            return this;
        }
        /** Timestamp of the last time the mirror was sync */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSynced")
        private java.util.Date timeLastSynced;

        /**
         * Timestamp of the last time the mirror was sync
         *
         * @param timeLastSynced the value to set
         * @return this builder
         */
        public Builder timeLastSynced(java.util.Date timeLastSynced) {
            this.timeLastSynced = timeLastSynced;
            this.__explicitlySet__.add("timeLastSynced");
            return this;
        }
        /** The current log from the management station plugin. */
        @com.fasterxml.jackson.annotation.JsonProperty("log")
        private String log;

        /**
         * The current log from the management station plugin.
         *
         * @param log the value to set
         * @return this builder
         */
        public Builder log(String log) {
            this.log = log;
            this.__explicitlySet__.add("log");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MirrorSummary build() {
            MirrorSummary model =
                    new MirrorSummary(
                            this.id,
                            this.displayName,
                            this.type,
                            this.osFamily,
                            this.archType,
                            this.state,
                            this.percentage,
                            this.timeLastSynced,
                            this.log);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MirrorSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
            }
            if (model.wasPropertyExplicitlySet("archType")) {
                this.archType(model.getArchType());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("percentage")) {
                this.percentage(model.getPercentage());
            }
            if (model.wasPropertyExplicitlySet("timeLastSynced")) {
                this.timeLastSynced(model.getTimeLastSynced());
            }
            if (model.wasPropertyExplicitlySet("log")) {
                this.log(model.getLog());
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

    /** OCID of a software source */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID of a software source
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Display name of the mirror */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the mirror
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Type of the mirror */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final MirrorType type;

    /**
     * Type of the mirror
     *
     * @return the value
     */
    public MirrorType getType() {
        return type;
    }

    /** The OS family the Software Source belongs to */
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamily osFamily;

    /**
     * The OS family the Software Source belongs to
     *
     * @return the value
     */
    public OsFamily getOsFamily() {
        return osFamily;
    }

    /** The architecture type supported by the Software Source */
    @com.fasterxml.jackson.annotation.JsonProperty("archType")
    private final ArchType archType;

    /**
     * The architecture type supported by the Software Source
     *
     * @return the value
     */
    public ArchType getArchType() {
        return archType;
    }

    /** Current state of the mirror */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final MirrorState state;

    /**
     * Current state of the mirror
     *
     * @return the value
     */
    public MirrorState getState() {
        return state;
    }

    /** A decimal number representing the completness percentage */
    @com.fasterxml.jackson.annotation.JsonProperty("percentage")
    private final Integer percentage;

    /**
     * A decimal number representing the completness percentage
     *
     * @return the value
     */
    public Integer getPercentage() {
        return percentage;
    }

    /** Timestamp of the last time the mirror was sync */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSynced")
    private final java.util.Date timeLastSynced;

    /**
     * Timestamp of the last time the mirror was sync
     *
     * @return the value
     */
    public java.util.Date getTimeLastSynced() {
        return timeLastSynced;
    }

    /** The current log from the management station plugin. */
    @com.fasterxml.jackson.annotation.JsonProperty("log")
    private final String log;

    /**
     * The current log from the management station plugin.
     *
     * @return the value
     */
    public String getLog() {
        return log;
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
        sb.append("MirrorSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", archType=").append(String.valueOf(this.archType));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", percentage=").append(String.valueOf(this.percentage));
        sb.append(", timeLastSynced=").append(String.valueOf(this.timeLastSynced));
        sb.append(", log=").append(String.valueOf(this.log));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MirrorSummary)) {
            return false;
        }

        MirrorSummary other = (MirrorSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.archType, other.archType)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.percentage, other.percentage)
                && java.util.Objects.equals(this.timeLastSynced, other.timeLastSynced)
                && java.util.Objects.equals(this.log, other.log)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.archType == null ? 43 : this.archType.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.percentage == null ? 43 : this.percentage.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastSynced == null ? 43 : this.timeLastSynced.hashCode());
        result = (result * PRIME) + (this.log == null ? 43 : this.log.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

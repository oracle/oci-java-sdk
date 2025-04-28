/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides summary information for a software source mirror. <br>
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
        "log",
        "packageCount",
        "size"
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
            String log,
            Integer packageCount,
            Long size) {
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
        this.packageCount = packageCount;
        this.size = size;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * software source.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * software source.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Display name of the mirror. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the mirror.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Type of software source. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private MirrorType type;

        /**
         * Type of software source.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(MirrorType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The OS family of the software source. */
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamily osFamily;

        /**
         * The OS family of the software source.
         *
         * @param osFamily the value to set
         * @return this builder
         */
        public Builder osFamily(OsFamily osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /** The architecture type supported by the software source. */
        @com.fasterxml.jackson.annotation.JsonProperty("archType")
        private ArchType archType;

        /**
         * The architecture type supported by the software source.
         *
         * @param archType the value to set
         * @return this builder
         */
        public Builder archType(ArchType archType) {
            this.archType = archType;
            this.__explicitlySet__.add("archType");
            return this;
        }
        /** Current state of the software source mirror. */
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private MirrorState state;

        /**
         * Current state of the software source mirror.
         *
         * @param state the value to set
         * @return this builder
         */
        public Builder state(MirrorState state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /**
         * A decimal number representing the percentage of the software source that has been synced.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("percentage")
        private Integer percentage;

        /**
         * A decimal number representing the percentage of the software source that has been synced.
         *
         * @param percentage the value to set
         * @return this builder
         */
        public Builder percentage(Integer percentage) {
            this.percentage = percentage;
            this.__explicitlySet__.add("percentage");
            return this;
        }
        /**
         * Time that the software source was last synced (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSynced")
        private java.util.Date timeLastSynced;

        /**
         * Time that the software source was last synced (in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) format).
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
        /** The number of packages within the mirrored software source. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageCount")
        private Integer packageCount;

        /**
         * The number of packages within the mirrored software source.
         *
         * @param packageCount the value to set
         * @return this builder
         */
        public Builder packageCount(Integer packageCount) {
            this.packageCount = packageCount;
            this.__explicitlySet__.add("packageCount");
            return this;
        }
        /** The size the mirrored software source in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private Long size;

        /**
         * The size the mirrored software source in bytes.
         *
         * @param size the value to set
         * @return this builder
         */
        public Builder size(Long size) {
            this.size = size;
            this.__explicitlySet__.add("size");
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
                            this.log,
                            this.packageCount,
                            this.size);
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
            if (model.wasPropertyExplicitlySet("packageCount")) {
                this.packageCount(model.getPackageCount());
            }
            if (model.wasPropertyExplicitlySet("size")) {
                this.size(model.getSize());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * software source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * software source.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Display name of the mirror. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the mirror.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Type of software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final MirrorType type;

    /**
     * Type of software source.
     *
     * @return the value
     */
    public MirrorType getType() {
        return type;
    }

    /** The OS family of the software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamily osFamily;

    /**
     * The OS family of the software source.
     *
     * @return the value
     */
    public OsFamily getOsFamily() {
        return osFamily;
    }

    /** The architecture type supported by the software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("archType")
    private final ArchType archType;

    /**
     * The architecture type supported by the software source.
     *
     * @return the value
     */
    public ArchType getArchType() {
        return archType;
    }

    /** Current state of the software source mirror. */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final MirrorState state;

    /**
     * Current state of the software source mirror.
     *
     * @return the value
     */
    public MirrorState getState() {
        return state;
    }

    /** A decimal number representing the percentage of the software source that has been synced. */
    @com.fasterxml.jackson.annotation.JsonProperty("percentage")
    private final Integer percentage;

    /**
     * A decimal number representing the percentage of the software source that has been synced.
     *
     * @return the value
     */
    public Integer getPercentage() {
        return percentage;
    }

    /**
     * Time that the software source was last synced (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSynced")
    private final java.util.Date timeLastSynced;

    /**
     * Time that the software source was last synced (in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) format).
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

    /** The number of packages within the mirrored software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageCount")
    private final Integer packageCount;

    /**
     * The number of packages within the mirrored software source.
     *
     * @return the value
     */
    public Integer getPackageCount() {
        return packageCount;
    }

    /** The size the mirrored software source in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final Long size;

    /**
     * The size the mirrored software source in bytes.
     *
     * @return the value
     */
    public Long getSize() {
        return size;
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
        sb.append(", packageCount=").append(String.valueOf(this.packageCount));
        sb.append(", size=").append(String.valueOf(this.size));
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
                && java.util.Objects.equals(this.packageCount, other.packageCount)
                && java.util.Objects.equals(this.size, other.size)
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
        result = (result * PRIME) + (this.packageCount == null ? 43 : this.packageCount.hashCode());
        result = (result * PRIME) + (this.size == null ? 43 : this.size.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

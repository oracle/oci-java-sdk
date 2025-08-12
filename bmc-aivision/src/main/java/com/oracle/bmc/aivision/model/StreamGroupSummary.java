/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Summary for a Stream Group <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = StreamGroupSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class StreamGroupSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "timeCreated",
        "timeUpdated",
        "isEnabled",
        "lifecycleState",
        "streamSourceIds",
        "streamOverlaps",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public StreamGroupSummary(
            String id,
            String compartmentId,
            String displayName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Boolean isEnabled,
            StreamGroup.LifecycleState lifecycleState,
            java.util.List<String> streamSourceIds,
            java.util.List<StreamGroupOverlap> streamOverlaps,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.isEnabled = isEnabled;
        this.lifecycleState = lifecycleState;
        this.streamSourceIds = streamSourceIds;
        this.streamOverlaps = streamOverlaps;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * streamGroup.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * streamGroup.
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
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * compartment
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * compartment
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** A human-friendly name for the streamGroup. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A human-friendly name for the streamGroup.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** When the streamGroup was created, as an RFC3339 datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * When the streamGroup was created, as an RFC3339 datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** When the streamGroup was updated, as an RFC3339 datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * When the streamGroup was updated, as an RFC3339 datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Stream */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Stream
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /** The current state of the streamGroup. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private StreamGroup.LifecycleState lifecycleState;

        /**
         * The current state of the streamGroup.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(StreamGroup.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** List of streamSource OCIDs associated with the stream group */
        @com.fasterxml.jackson.annotation.JsonProperty("streamSourceIds")
        private java.util.List<String> streamSourceIds;

        /**
         * List of streamSource OCIDs associated with the stream group
         *
         * @param streamSourceIds the value to set
         * @return this builder
         */
        public Builder streamSourceIds(java.util.List<String> streamSourceIds) {
            this.streamSourceIds = streamSourceIds;
            this.__explicitlySet__.add("streamSourceIds");
            return this;
        }
        /** List of streamSource OCIDs where the streamSource overlaps in field of view. */
        @com.fasterxml.jackson.annotation.JsonProperty("streamOverlaps")
        private java.util.List<StreamGroupOverlap> streamOverlaps;

        /**
         * List of streamSource OCIDs where the streamSource overlaps in field of view.
         *
         * @param streamOverlaps the value to set
         * @return this builder
         */
        public Builder streamOverlaps(java.util.List<StreamGroupOverlap> streamOverlaps) {
            this.streamOverlaps = streamOverlaps;
            this.__explicitlySet__.add("streamOverlaps");
            return this;
        }
        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. It
         * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * A simple key-value pair that is applied without any predefined name, type, or scope. It
         * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. For example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. For example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StreamGroupSummary build() {
            StreamGroupSummary model =
                    new StreamGroupSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.timeCreated,
                            this.timeUpdated,
                            this.isEnabled,
                            this.lifecycleState,
                            this.streamSourceIds,
                            this.streamOverlaps,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StreamGroupSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("streamSourceIds")) {
                this.streamSourceIds(model.getStreamSourceIds());
            }
            if (model.wasPropertyExplicitlySet("streamOverlaps")) {
                this.streamOverlaps(model.getStreamOverlaps());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * streamGroup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * streamGroup.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of compartment
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of compartment
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** A human-friendly name for the streamGroup. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A human-friendly name for the streamGroup.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** When the streamGroup was created, as an RFC3339 datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * When the streamGroup was created, as an RFC3339 datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** When the streamGroup was updated, as an RFC3339 datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * When the streamGroup was updated, as an RFC3339 datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Stream */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Stream
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /** The current state of the streamGroup. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final StreamGroup.LifecycleState lifecycleState;

    /**
     * The current state of the streamGroup.
     *
     * @return the value
     */
    public StreamGroup.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** List of streamSource OCIDs associated with the stream group */
    @com.fasterxml.jackson.annotation.JsonProperty("streamSourceIds")
    private final java.util.List<String> streamSourceIds;

    /**
     * List of streamSource OCIDs associated with the stream group
     *
     * @return the value
     */
    public java.util.List<String> getStreamSourceIds() {
        return streamSourceIds;
    }

    /** List of streamSource OCIDs where the streamSource overlaps in field of view. */
    @com.fasterxml.jackson.annotation.JsonProperty("streamOverlaps")
    private final java.util.List<StreamGroupOverlap> streamOverlaps;

    /**
     * List of streamSource OCIDs where the streamSource overlaps in field of view.
     *
     * @return the value
     */
    public java.util.List<StreamGroupOverlap> getStreamOverlaps() {
        return streamOverlaps;
    }

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. It
     * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * A simple key-value pair that is applied without any predefined name, type, or scope. It
     * exists for cross-compatibility only. For example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
     * example: {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
     * example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. For example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. For example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("StreamGroupSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", streamSourceIds=").append(String.valueOf(this.streamSourceIds));
        sb.append(", streamOverlaps=").append(String.valueOf(this.streamOverlaps));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StreamGroupSummary)) {
            return false;
        }

        StreamGroupSummary other = (StreamGroupSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.streamSourceIds, other.streamSourceIds)
                && java.util.Objects.equals(this.streamOverlaps, other.streamOverlaps)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.streamSourceIds == null ? 43 : this.streamSourceIds.hashCode());
        result =
                (result * PRIME)
                        + (this.streamOverlaps == null ? 43 : this.streamOverlaps.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

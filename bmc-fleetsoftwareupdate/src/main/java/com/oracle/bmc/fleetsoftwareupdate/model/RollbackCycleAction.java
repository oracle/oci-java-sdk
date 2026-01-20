/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Rollback Cycle Exadata Fleet Update Action details. This will rollback all the targets in the
 * maintenance cycle with the Collection in place. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RollbackCycleAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RollbackCycleAction extends FsuAction {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ActionLifecycleStates lifecycleState;

        public Builder lifecycleState(ActionLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** OCID identifier for the Exadata Fleet Update Cycle the Action will be part of. */
        @com.fasterxml.jackson.annotation.JsonProperty("fsuCycleId")
        private String fsuCycleId;

        /**
         * OCID identifier for the Exadata Fleet Update Cycle the Action will be part of.
         *
         * @param fsuCycleId the value to set
         * @return this builder
         */
        public Builder fsuCycleId(String fsuCycleId) {
            this.fsuCycleId = fsuCycleId;
            this.__explicitlySet__.add("fsuCycleId");
            return this;
        }
        /** OCID identifier for the Exadata Fleet Update Action. */
        @com.fasterxml.jackson.annotation.JsonProperty("relatedFsuActionId")
        private String relatedFsuActionId;

        /**
         * OCID identifier for the Exadata Fleet Update Action.
         *
         * @param relatedFsuActionId the value to set
         * @return this builder
         */
        public Builder relatedFsuActionId(String relatedFsuActionId) {
            this.relatedFsuActionId = relatedFsuActionId;
            this.__explicitlySet__.add("relatedFsuActionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("progress")
        private FsuActionProgressDetails progress;

        public Builder progress(FsuActionProgressDetails progress) {
            this.progress = progress;
            this.__explicitlySet__.add("progress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RollbackCycleAction build() {
            RollbackCycleAction model =
                    new RollbackCycleAction(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.timeCreated,
                            this.timeStarted,
                            this.timeFinished,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.fsuCycleId,
                            this.relatedFsuActionId,
                            this.progress);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RollbackCycleAction model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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
            if (model.wasPropertyExplicitlySet("fsuCycleId")) {
                this.fsuCycleId(model.getFsuCycleId());
            }
            if (model.wasPropertyExplicitlySet("relatedFsuActionId")) {
                this.relatedFsuActionId(model.getRelatedFsuActionId());
            }
            if (model.wasPropertyExplicitlySet("progress")) {
                this.progress(model.getProgress());
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
    public RollbackCycleAction(
            String id,
            String displayName,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            java.util.Date timeUpdated,
            ActionLifecycleStates lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String fsuCycleId,
            String relatedFsuActionId,
            FsuActionProgressDetails progress) {
        super(
                id,
                displayName,
                compartmentId,
                timeCreated,
                timeStarted,
                timeFinished,
                timeUpdated,
                lifecycleState,
                lifecycleDetails,
                freeformTags,
                definedTags,
                systemTags);
        this.fsuCycleId = fsuCycleId;
        this.relatedFsuActionId = relatedFsuActionId;
        this.progress = progress;
    }

    /** OCID identifier for the Exadata Fleet Update Cycle the Action will be part of. */
    @com.fasterxml.jackson.annotation.JsonProperty("fsuCycleId")
    private final String fsuCycleId;

    /**
     * OCID identifier for the Exadata Fleet Update Cycle the Action will be part of.
     *
     * @return the value
     */
    public String getFsuCycleId() {
        return fsuCycleId;
    }

    /** OCID identifier for the Exadata Fleet Update Action. */
    @com.fasterxml.jackson.annotation.JsonProperty("relatedFsuActionId")
    private final String relatedFsuActionId;

    /**
     * OCID identifier for the Exadata Fleet Update Action.
     *
     * @return the value
     */
    public String getRelatedFsuActionId() {
        return relatedFsuActionId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("progress")
    private final FsuActionProgressDetails progress;

    public FsuActionProgressDetails getProgress() {
        return progress;
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
        sb.append("RollbackCycleAction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", fsuCycleId=").append(String.valueOf(this.fsuCycleId));
        sb.append(", relatedFsuActionId=").append(String.valueOf(this.relatedFsuActionId));
        sb.append(", progress=").append(String.valueOf(this.progress));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RollbackCycleAction)) {
            return false;
        }

        RollbackCycleAction other = (RollbackCycleAction) o;
        return java.util.Objects.equals(this.fsuCycleId, other.fsuCycleId)
                && java.util.Objects.equals(this.relatedFsuActionId, other.relatedFsuActionId)
                && java.util.Objects.equals(this.progress, other.progress)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fsuCycleId == null ? 43 : this.fsuCycleId.hashCode());
        result =
                (result * PRIME)
                        + (this.relatedFsuActionId == null
                                ? 43
                                : this.relatedFsuActionId.hashCode());
        result = (result * PRIME) + (this.progress == null ? 43 : this.progress.hashCode());
        return result;
    }
}

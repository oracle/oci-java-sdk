/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Update Patch Exadata Fleet Update Cycle resource details. If automated maintenance is enabled for
 * the associated Exadata Fleet Update Collection, updating Exadata Fleet Update Cycle will not
 * affect the Exadata Fleet Update Collection. <br>
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
        builder = UpdatePatchFsuCycle.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdatePatchFsuCycle extends UpdateFsuCycleDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("goalVersionDetails")
        private FsuGoalVersionDetails goalVersionDetails;

        public Builder goalVersionDetails(FsuGoalVersionDetails goalVersionDetails) {
            this.goalVersionDetails = goalVersionDetails;
            this.__explicitlySet__.add("goalVersionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("batchingStrategy")
        private UpdateBatchingStrategyDetails batchingStrategy;

        public Builder batchingStrategy(UpdateBatchingStrategyDetails batchingStrategy) {
            this.batchingStrategy = batchingStrategy;
            this.__explicitlySet__.add("batchingStrategy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("diagnosticsCollection")
        private DiagnosticsCollectionDetails diagnosticsCollection;

        public Builder diagnosticsCollection(DiagnosticsCollectionDetails diagnosticsCollection) {
            this.diagnosticsCollection = diagnosticsCollection;
            this.__explicitlySet__.add("diagnosticsCollection");
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
        /**
         * Ignore patch conflicts or missing patches between the source and goal homes. This
         * attribute will be ignored for Exadata Image (Guest OS) maintenance update.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isIgnorePatches")
        private Boolean isIgnorePatches;

        /**
         * Ignore patch conflicts or missing patches between the source and goal homes. This
         * attribute will be ignored for Exadata Image (Guest OS) maintenance update.
         *
         * @param isIgnorePatches the value to set
         * @return this builder
         */
        public Builder isIgnorePatches(Boolean isIgnorePatches) {
            this.isIgnorePatches = isIgnorePatches;
            this.__explicitlySet__.add("isIgnorePatches");
            return this;
        }
        /**
         * List of identifiers of patches to ignore. Specify an empty array to unset the field. This
         * attribute will be ignored for Exadata Image (Guest OS) maintenance update.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isIgnoreMissingPatches")
        private java.util.List<String> isIgnoreMissingPatches;

        /**
         * List of identifiers of patches to ignore. Specify an empty array to unset the field. This
         * attribute will be ignored for Exadata Image (Guest OS) maintenance update.
         *
         * @param isIgnoreMissingPatches the value to set
         * @return this builder
         */
        public Builder isIgnoreMissingPatches(java.util.List<String> isIgnoreMissingPatches) {
            this.isIgnoreMissingPatches = isIgnoreMissingPatches;
            this.__explicitlySet__.add("isIgnoreMissingPatches");
            return this;
        }
        /** Timeout for session draining for database services specified in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxDrainTimeoutInSeconds")
        private Integer maxDrainTimeoutInSeconds;

        /**
         * Timeout for session draining for database services specified in seconds.
         *
         * @param maxDrainTimeoutInSeconds the value to set
         * @return this builder
         */
        public Builder maxDrainTimeoutInSeconds(Integer maxDrainTimeoutInSeconds) {
            this.maxDrainTimeoutInSeconds = maxDrainTimeoutInSeconds;
            this.__explicitlySet__.add("maxDrainTimeoutInSeconds");
            return this;
        }
        /**
         * Ensure that database services are online on the same VMs before and after the maintenance
         * update.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isKeepPlacement")
        private Boolean isKeepPlacement;

        /**
         * Ensure that database services are online on the same VMs before and after the maintenance
         * update.
         *
         * @param isKeepPlacement the value to set
         * @return this builder
         */
        public Builder isKeepPlacement(Boolean isKeepPlacement) {
            this.isKeepPlacement = isKeepPlacement;
            this.__explicitlySet__.add("isKeepPlacement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatePatchFsuCycle build() {
            UpdatePatchFsuCycle model =
                    new UpdatePatchFsuCycle(
                            this.displayName,
                            this.goalVersionDetails,
                            this.batchingStrategy,
                            this.diagnosticsCollection,
                            this.freeformTags,
                            this.definedTags,
                            this.isIgnorePatches,
                            this.isIgnoreMissingPatches,
                            this.maxDrainTimeoutInSeconds,
                            this.isKeepPlacement);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePatchFsuCycle model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("goalVersionDetails")) {
                this.goalVersionDetails(model.getGoalVersionDetails());
            }
            if (model.wasPropertyExplicitlySet("batchingStrategy")) {
                this.batchingStrategy(model.getBatchingStrategy());
            }
            if (model.wasPropertyExplicitlySet("diagnosticsCollection")) {
                this.diagnosticsCollection(model.getDiagnosticsCollection());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("isIgnorePatches")) {
                this.isIgnorePatches(model.getIsIgnorePatches());
            }
            if (model.wasPropertyExplicitlySet("isIgnoreMissingPatches")) {
                this.isIgnoreMissingPatches(model.getIsIgnoreMissingPatches());
            }
            if (model.wasPropertyExplicitlySet("maxDrainTimeoutInSeconds")) {
                this.maxDrainTimeoutInSeconds(model.getMaxDrainTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("isKeepPlacement")) {
                this.isKeepPlacement(model.getIsKeepPlacement());
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
    public UpdatePatchFsuCycle(
            String displayName,
            FsuGoalVersionDetails goalVersionDetails,
            UpdateBatchingStrategyDetails batchingStrategy,
            DiagnosticsCollectionDetails diagnosticsCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Boolean isIgnorePatches,
            java.util.List<String> isIgnoreMissingPatches,
            Integer maxDrainTimeoutInSeconds,
            Boolean isKeepPlacement) {
        super(
                displayName,
                goalVersionDetails,
                batchingStrategy,
                diagnosticsCollection,
                freeformTags,
                definedTags);
        this.isIgnorePatches = isIgnorePatches;
        this.isIgnoreMissingPatches = isIgnoreMissingPatches;
        this.maxDrainTimeoutInSeconds = maxDrainTimeoutInSeconds;
        this.isKeepPlacement = isKeepPlacement;
    }

    /**
     * Ignore patch conflicts or missing patches between the source and goal homes. This attribute
     * will be ignored for Exadata Image (Guest OS) maintenance update.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isIgnorePatches")
    private final Boolean isIgnorePatches;

    /**
     * Ignore patch conflicts or missing patches between the source and goal homes. This attribute
     * will be ignored for Exadata Image (Guest OS) maintenance update.
     *
     * @return the value
     */
    public Boolean getIsIgnorePatches() {
        return isIgnorePatches;
    }

    /**
     * List of identifiers of patches to ignore. Specify an empty array to unset the field. This
     * attribute will be ignored for Exadata Image (Guest OS) maintenance update.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isIgnoreMissingPatches")
    private final java.util.List<String> isIgnoreMissingPatches;

    /**
     * List of identifiers of patches to ignore. Specify an empty array to unset the field. This
     * attribute will be ignored for Exadata Image (Guest OS) maintenance update.
     *
     * @return the value
     */
    public java.util.List<String> getIsIgnoreMissingPatches() {
        return isIgnoreMissingPatches;
    }

    /** Timeout for session draining for database services specified in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxDrainTimeoutInSeconds")
    private final Integer maxDrainTimeoutInSeconds;

    /**
     * Timeout for session draining for database services specified in seconds.
     *
     * @return the value
     */
    public Integer getMaxDrainTimeoutInSeconds() {
        return maxDrainTimeoutInSeconds;
    }

    /**
     * Ensure that database services are online on the same VMs before and after the maintenance
     * update.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isKeepPlacement")
    private final Boolean isKeepPlacement;

    /**
     * Ensure that database services are online on the same VMs before and after the maintenance
     * update.
     *
     * @return the value
     */
    public Boolean getIsKeepPlacement() {
        return isKeepPlacement;
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
        sb.append("UpdatePatchFsuCycle(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isIgnorePatches=").append(String.valueOf(this.isIgnorePatches));
        sb.append(", isIgnoreMissingPatches=").append(String.valueOf(this.isIgnoreMissingPatches));
        sb.append(", maxDrainTimeoutInSeconds=")
                .append(String.valueOf(this.maxDrainTimeoutInSeconds));
        sb.append(", isKeepPlacement=").append(String.valueOf(this.isKeepPlacement));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePatchFsuCycle)) {
            return false;
        }

        UpdatePatchFsuCycle other = (UpdatePatchFsuCycle) o;
        return java.util.Objects.equals(this.isIgnorePatches, other.isIgnorePatches)
                && java.util.Objects.equals(
                        this.isIgnoreMissingPatches, other.isIgnoreMissingPatches)
                && java.util.Objects.equals(
                        this.maxDrainTimeoutInSeconds, other.maxDrainTimeoutInSeconds)
                && java.util.Objects.equals(this.isKeepPlacement, other.isKeepPlacement)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isIgnorePatches == null ? 43 : this.isIgnorePatches.hashCode());
        result =
                (result * PRIME)
                        + (this.isIgnoreMissingPatches == null
                                ? 43
                                : this.isIgnoreMissingPatches.hashCode());
        result =
                (result * PRIME)
                        + (this.maxDrainTimeoutInSeconds == null
                                ? 43
                                : this.maxDrainTimeoutInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.isKeepPlacement == null ? 43 : this.isKeepPlacement.hashCode());
        return result;
    }
}

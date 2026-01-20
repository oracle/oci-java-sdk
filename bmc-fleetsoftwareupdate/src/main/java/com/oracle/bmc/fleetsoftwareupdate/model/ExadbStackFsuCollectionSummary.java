/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Summary of 'EXADB_STACK' type Exadata Fleet Update Collection. Currently, components allowed in
 * an Exadata software stack are 'GUEST_OS' and 'GI'. At least two distinct component types are
 * required for an Exadata software stack. <br>
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
        builder = ExadbStackFsuCollectionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExadbStackFsuCollectionSummary extends FsuCollectionSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
        private CollectionServiceTypes serviceType;

        public Builder serviceType(CollectionServiceTypes serviceType) {
            this.serviceType = serviceType;
            this.__explicitlySet__.add("serviceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("activeFsuCycle")
        private ActiveCycleDetails activeFsuCycle;

        public Builder activeFsuCycle(ActiveCycleDetails activeFsuCycle) {
            this.activeFsuCycle = activeFsuCycle;
            this.__explicitlySet__.add("activeFsuCycle");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetCount")
        private Integer targetCount;

        public Builder targetCount(Integer targetCount) {
            this.targetCount = targetCount;
            this.__explicitlySet__.add("targetCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
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
        private CollectionLifecycleStates lifecycleState;

        public Builder lifecycleState(CollectionLifecycleStates lifecycleState) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("lastCompletedFsuCycleId")
        private String lastCompletedFsuCycleId;

        public Builder lastCompletedFsuCycleId(String lastCompletedFsuCycleId) {
            this.lastCompletedFsuCycleId = lastCompletedFsuCycleId;
            this.__explicitlySet__.add("lastCompletedFsuCycleId");
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
        /** Summary of components in an Exadata software stack. */
        @com.fasterxml.jackson.annotation.JsonProperty("components")
        private java.util.List<SoftwareComponentSummary> components;

        /**
         * Summary of components in an Exadata software stack.
         *
         * @param components the value to set
         * @return this builder
         */
        public Builder components(java.util.List<SoftwareComponentSummary> components) {
            this.components = components;
            this.__explicitlySet__.add("components");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadbStackFsuCollectionSummary build() {
            ExadbStackFsuCollectionSummary model =
                    new ExadbStackFsuCollectionSummary(
                            this.id,
                            this.displayName,
                            this.serviceType,
                            this.compartmentId,
                            this.activeFsuCycle,
                            this.targetCount,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.lastCompletedFsuCycleId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.components);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadbStackFsuCollectionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("serviceType")) {
                this.serviceType(model.getServiceType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("activeFsuCycle")) {
                this.activeFsuCycle(model.getActiveFsuCycle());
            }
            if (model.wasPropertyExplicitlySet("targetCount")) {
                this.targetCount(model.getTargetCount());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
            if (model.wasPropertyExplicitlySet("lastCompletedFsuCycleId")) {
                this.lastCompletedFsuCycleId(model.getLastCompletedFsuCycleId());
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
            if (model.wasPropertyExplicitlySet("components")) {
                this.components(model.getComponents());
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
    public ExadbStackFsuCollectionSummary(
            String id,
            String displayName,
            CollectionServiceTypes serviceType,
            String compartmentId,
            ActiveCycleDetails activeFsuCycle,
            Integer targetCount,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            CollectionLifecycleStates lifecycleState,
            String lifecycleDetails,
            String lastCompletedFsuCycleId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.List<SoftwareComponentSummary> components) {
        super(
                id,
                displayName,
                serviceType,
                compartmentId,
                activeFsuCycle,
                targetCount,
                timeCreated,
                timeUpdated,
                lifecycleState,
                lifecycleDetails,
                lastCompletedFsuCycleId,
                freeformTags,
                definedTags,
                systemTags);
        this.components = components;
    }

    /** Summary of components in an Exadata software stack. */
    @com.fasterxml.jackson.annotation.JsonProperty("components")
    private final java.util.List<SoftwareComponentSummary> components;

    /**
     * Summary of components in an Exadata software stack.
     *
     * @return the value
     */
    public java.util.List<SoftwareComponentSummary> getComponents() {
        return components;
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
        sb.append("ExadbStackFsuCollectionSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", components=").append(String.valueOf(this.components));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadbStackFsuCollectionSummary)) {
            return false;
        }

        ExadbStackFsuCollectionSummary other = (ExadbStackFsuCollectionSummary) o;
        return java.util.Objects.equals(this.components, other.components) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.components == null ? 43 : this.components.hashCode());
        return result;
    }
}

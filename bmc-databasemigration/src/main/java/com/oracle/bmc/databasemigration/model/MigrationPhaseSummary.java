/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Migration Phase Summary of details.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MigrationPhaseSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MigrationPhaseSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "recommendedAction", "supportedActions"})
    public MigrationPhaseSummary(
            OdmsJobPhases name,
            OdmsPhaseActions recommendedAction,
            java.util.List<OdmsPhaseActions> supportedActions) {
        super();
        this.name = name;
        this.recommendedAction = recommendedAction;
        this.supportedActions = supportedActions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * ODMS Job phase name
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private OdmsJobPhases name;

        /**
         * ODMS Job phase name
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(OdmsJobPhases name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Action recommended for this phase. If not included in the response, there is no recommended action for the phase.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recommendedAction")
        private OdmsPhaseActions recommendedAction;

        /**
         * Action recommended for this phase. If not included in the response, there is no recommended action for the phase.
         *
         * @param recommendedAction the value to set
         * @return this builder
         **/
        public Builder recommendedAction(OdmsPhaseActions recommendedAction) {
            this.recommendedAction = recommendedAction;
            this.__explicitlySet__.add("recommendedAction");
            return this;
        }
        /**
         * Array of actions for the corresponding phase. Empty array would indicate there is no supported action for the phase.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportedActions")
        private java.util.List<OdmsPhaseActions> supportedActions;

        /**
         * Array of actions for the corresponding phase. Empty array would indicate there is no supported action for the phase.
         *
         * @param supportedActions the value to set
         * @return this builder
         **/
        public Builder supportedActions(java.util.List<OdmsPhaseActions> supportedActions) {
            this.supportedActions = supportedActions;
            this.__explicitlySet__.add("supportedActions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MigrationPhaseSummary build() {
            MigrationPhaseSummary model =
                    new MigrationPhaseSummary(
                            this.name, this.recommendedAction, this.supportedActions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MigrationPhaseSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("recommendedAction")) {
                this.recommendedAction(model.getRecommendedAction());
            }
            if (model.wasPropertyExplicitlySet("supportedActions")) {
                this.supportedActions(model.getSupportedActions());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * ODMS Job phase name
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final OdmsJobPhases name;

    /**
     * ODMS Job phase name
     *
     * @return the value
     **/
    public OdmsJobPhases getName() {
        return name;
    }

    /**
     * Action recommended for this phase. If not included in the response, there is no recommended action for the phase.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendedAction")
    private final OdmsPhaseActions recommendedAction;

    /**
     * Action recommended for this phase. If not included in the response, there is no recommended action for the phase.
     *
     * @return the value
     **/
    public OdmsPhaseActions getRecommendedAction() {
        return recommendedAction;
    }

    /**
     * Array of actions for the corresponding phase. Empty array would indicate there is no supported action for the phase.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedActions")
    private final java.util.List<OdmsPhaseActions> supportedActions;

    /**
     * Array of actions for the corresponding phase. Empty array would indicate there is no supported action for the phase.
     *
     * @return the value
     **/
    public java.util.List<OdmsPhaseActions> getSupportedActions() {
        return supportedActions;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MigrationPhaseSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", recommendedAction=").append(String.valueOf(this.recommendedAction));
        sb.append(", supportedActions=").append(String.valueOf(this.supportedActions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MigrationPhaseSummary)) {
            return false;
        }

        MigrationPhaseSummary other = (MigrationPhaseSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.recommendedAction, other.recommendedAction)
                && java.util.Objects.equals(this.supportedActions, other.supportedActions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendedAction == null ? 43 : this.recommendedAction.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedActions == null ? 43 : this.supportedActions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

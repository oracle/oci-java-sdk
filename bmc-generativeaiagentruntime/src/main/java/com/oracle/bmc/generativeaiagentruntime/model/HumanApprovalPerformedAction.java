/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * An action describing user approval to the agent. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HumanApprovalPerformedAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "performedActionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HumanApprovalPerformedAction extends PerformedAction {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("actionId")
        private String actionId;

        public Builder actionId(String actionId) {
            this.actionId = actionId;
            this.__explicitlySet__.add("actionId");
            return this;
        }
        /** The chosen approval or denial option to the agent. */
        @com.fasterxml.jackson.annotation.JsonProperty("chosenOption")
        private ChosenOption chosenOption;

        /**
         * The chosen approval or denial option to the agent.
         *
         * @param chosenOption the value to set
         * @return this builder
         */
        public Builder chosenOption(ChosenOption chosenOption) {
            this.chosenOption = chosenOption;
            this.__explicitlySet__.add("chosenOption");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HumanApprovalPerformedAction build() {
            HumanApprovalPerformedAction model =
                    new HumanApprovalPerformedAction(this.actionId, this.chosenOption);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HumanApprovalPerformedAction model) {
            if (model.wasPropertyExplicitlySet("actionId")) {
                this.actionId(model.getActionId());
            }
            if (model.wasPropertyExplicitlySet("chosenOption")) {
                this.chosenOption(model.getChosenOption());
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
    public HumanApprovalPerformedAction(String actionId, ChosenOption chosenOption) {
        super(actionId);
        this.chosenOption = chosenOption;
    }

    /** The chosen approval or denial option to the agent. */
    public enum ChosenOption implements com.oracle.bmc.http.internal.BmcEnum {
        Approve("APPROVE"),
        Deny("DENY"),
        ;

        private final String value;
        private static java.util.Map<String, ChosenOption> map;

        static {
            map = new java.util.HashMap<>();
            for (ChosenOption v : ChosenOption.values()) {
                map.put(v.getValue(), v);
            }
        }

        ChosenOption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ChosenOption create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ChosenOption: " + key);
        }
    };
    /** The chosen approval or denial option to the agent. */
    @com.fasterxml.jackson.annotation.JsonProperty("chosenOption")
    private final ChosenOption chosenOption;

    /**
     * The chosen approval or denial option to the agent.
     *
     * @return the value
     */
    public ChosenOption getChosenOption() {
        return chosenOption;
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
        sb.append("HumanApprovalPerformedAction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", chosenOption=").append(String.valueOf(this.chosenOption));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HumanApprovalPerformedAction)) {
            return false;
        }

        HumanApprovalPerformedAction other = (HumanApprovalPerformedAction) o;
        return java.util.Objects.equals(this.chosenOption, other.chosenOption)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.chosenOption == null ? 43 : this.chosenOption.hashCode());
        return result;
    }
}

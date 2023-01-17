/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Details of Target ResponderRecipe <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TargetResponderRecipe.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class TargetResponderRecipe
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "responderRecipeId",
        "compartmentId",
        "displayName",
        "description",
        "owner",
        "timeCreated",
        "timeUpdated",
        "responderRules",
        "effectiveResponderRules"
    })
    public TargetResponderRecipe(
            String id,
            String responderRecipeId,
            String compartmentId,
            String displayName,
            String description,
            OwnerType owner,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.List<TargetResponderRecipeResponderRule> responderRules,
            java.util.List<TargetResponderRecipeResponderRule> effectiveResponderRules) {
        super();
        this.id = id;
        this.responderRecipeId = responderRecipeId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.owner = owner;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.responderRules = responderRules;
        this.effectiveResponderRules = effectiveResponderRules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier of TargetResponderRecipe that can't be changed after creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier of TargetResponderRecipe that can't be changed after creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Unique identifier for Responder Recipe of which this is an extension. */
        @com.fasterxml.jackson.annotation.JsonProperty("responderRecipeId")
        private String responderRecipeId;

        /**
         * Unique identifier for Responder Recipe of which this is an extension.
         *
         * @param responderRecipeId the value to set
         * @return this builder
         */
        public Builder responderRecipeId(String responderRecipeId) {
            this.responderRecipeId = responderRecipeId;
            this.__explicitlySet__.add("responderRecipeId");
            return this;
        }
        /** Compartment Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** ResponderRecipe display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * ResponderRecipe display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** ResponderRecipe description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * ResponderRecipe description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Owner of ResponderRecipe */
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private OwnerType owner;

        /**
         * Owner of ResponderRecipe
         *
         * @param owner the value to set
         * @return this builder
         */
        public Builder owner(OwnerType owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /**
         * The date and time the target responder recipe rule was created. Format defined by
         * RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the target responder recipe rule was created. Format defined by
         * RFC3339.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the target responder recipe rule was updated. Format defined by
         * RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the target responder recipe rule was updated. Format defined by
         * RFC3339.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** List of responder rules associated with the recipe - user input */
        @com.fasterxml.jackson.annotation.JsonProperty("responderRules")
        private java.util.List<TargetResponderRecipeResponderRule> responderRules;

        /**
         * List of responder rules associated with the recipe - user input
         *
         * @param responderRules the value to set
         * @return this builder
         */
        public Builder responderRules(
                java.util.List<TargetResponderRecipeResponderRule> responderRules) {
            this.responderRules = responderRules;
            this.__explicitlySet__.add("responderRules");
            return this;
        }
        /** List of responder rules associated with the recipe after applying all defaults */
        @com.fasterxml.jackson.annotation.JsonProperty("effectiveResponderRules")
        private java.util.List<TargetResponderRecipeResponderRule> effectiveResponderRules;

        /**
         * List of responder rules associated with the recipe after applying all defaults
         *
         * @param effectiveResponderRules the value to set
         * @return this builder
         */
        public Builder effectiveResponderRules(
                java.util.List<TargetResponderRecipeResponderRule> effectiveResponderRules) {
            this.effectiveResponderRules = effectiveResponderRules;
            this.__explicitlySet__.add("effectiveResponderRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TargetResponderRecipe build() {
            TargetResponderRecipe model =
                    new TargetResponderRecipe(
                            this.id,
                            this.responderRecipeId,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.owner,
                            this.timeCreated,
                            this.timeUpdated,
                            this.responderRules,
                            this.effectiveResponderRules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetResponderRecipe model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("responderRecipeId")) {
                this.responderRecipeId(model.getResponderRecipeId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("responderRules")) {
                this.responderRules(model.getResponderRules());
            }
            if (model.wasPropertyExplicitlySet("effectiveResponderRules")) {
                this.effectiveResponderRules(model.getEffectiveResponderRules());
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

    /** Unique identifier of TargetResponderRecipe that can't be changed after creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier of TargetResponderRecipe that can't be changed after creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Unique identifier for Responder Recipe of which this is an extension. */
    @com.fasterxml.jackson.annotation.JsonProperty("responderRecipeId")
    private final String responderRecipeId;

    /**
     * Unique identifier for Responder Recipe of which this is an extension.
     *
     * @return the value
     */
    public String getResponderRecipeId() {
        return responderRecipeId;
    }

    /** Compartment Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** ResponderRecipe display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * ResponderRecipe display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** ResponderRecipe description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * ResponderRecipe description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Owner of ResponderRecipe */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final OwnerType owner;

    /**
     * Owner of ResponderRecipe
     *
     * @return the value
     */
    public OwnerType getOwner() {
        return owner;
    }

    /**
     * The date and time the target responder recipe rule was created. Format defined by RFC3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the target responder recipe rule was created. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the target responder recipe rule was updated. Format defined by RFC3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the target responder recipe rule was updated. Format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** List of responder rules associated with the recipe - user input */
    @com.fasterxml.jackson.annotation.JsonProperty("responderRules")
    private final java.util.List<TargetResponderRecipeResponderRule> responderRules;

    /**
     * List of responder rules associated with the recipe - user input
     *
     * @return the value
     */
    public java.util.List<TargetResponderRecipeResponderRule> getResponderRules() {
        return responderRules;
    }

    /** List of responder rules associated with the recipe after applying all defaults */
    @com.fasterxml.jackson.annotation.JsonProperty("effectiveResponderRules")
    private final java.util.List<TargetResponderRecipeResponderRule> effectiveResponderRules;

    /**
     * List of responder rules associated with the recipe after applying all defaults
     *
     * @return the value
     */
    public java.util.List<TargetResponderRecipeResponderRule> getEffectiveResponderRules() {
        return effectiveResponderRules;
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
        sb.append("TargetResponderRecipe(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", responderRecipeId=").append(String.valueOf(this.responderRecipeId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", responderRules=").append(String.valueOf(this.responderRules));
        sb.append(", effectiveResponderRules=")
                .append(String.valueOf(this.effectiveResponderRules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetResponderRecipe)) {
            return false;
        }

        TargetResponderRecipe other = (TargetResponderRecipe) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.responderRecipeId, other.responderRecipeId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.responderRules, other.responderRules)
                && java.util.Objects.equals(
                        this.effectiveResponderRules, other.effectiveResponderRules)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.responderRecipeId == null ? 43 : this.responderRecipeId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.responderRules == null ? 43 : this.responderRules.hashCode());
        result =
                (result * PRIME)
                        + (this.effectiveResponderRules == null
                                ? 43
                                : this.effectiveResponderRules.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

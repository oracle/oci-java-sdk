/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to update the subsetting rule <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateSubsettingRuleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateSubsettingRuleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "scope",
        "subsetRuleEntry",
        "ruleCombinationMode",
        "relatedTablesPropagation",
        "peerTablesAction"
    })
    public UpdateSubsettingRuleDetails(
            String displayName,
            String description,
            SubsetScope scope,
            SubsetRuleEntry subsetRuleEntry,
            RuleCombinationMode ruleCombinationMode,
            RelatedTablesPropagation relatedTablesPropagation,
            PeerTablesAction peerTablesAction) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.scope = scope;
        this.subsetRuleEntry = subsetRuleEntry;
        this.ruleCombinationMode = ruleCombinationMode;
        this.relatedTablesPropagation = relatedTablesPropagation;
        this.peerTablesAction = peerTablesAction;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The display name of the subset rule */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the subset rule
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The description of the subset rule */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the subset rule
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private SubsetScope scope;

        public Builder scope(SubsetScope scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subsetRuleEntry")
        private SubsetRuleEntry subsetRuleEntry;

        public Builder subsetRuleEntry(SubsetRuleEntry subsetRuleEntry) {
            this.subsetRuleEntry = subsetRuleEntry;
            this.__explicitlySet__.add("subsetRuleEntry");
            return this;
        }
        /**
         * Specifies how this rule combines with other rules. UNION evaluates this rule
         * independently and adds matching rows to the result set. SERIAL applies this rule
         * sequentially to filter rows selected by a compatible preceding rule.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ruleCombinationMode")
        private RuleCombinationMode ruleCombinationMode;

        /**
         * Specifies how this rule combines with other rules. UNION evaluates this rule
         * independently and adds matching rows to the result set. SERIAL applies this rule
         * sequentially to filter rows selected by a compatible preceding rule.
         *
         * @param ruleCombinationMode the value to set
         * @return this builder
         */
        public Builder ruleCombinationMode(RuleCombinationMode ruleCombinationMode) {
            this.ruleCombinationMode = ruleCombinationMode;
            this.__explicitlySet__.add("ruleCombinationMode");
            return this;
        }
        /** Strategy to be applied while propagating subsetting rule to related tables */
        @com.fasterxml.jackson.annotation.JsonProperty("relatedTablesPropagation")
        private RelatedTablesPropagation relatedTablesPropagation;

        /**
         * Strategy to be applied while propagating subsetting rule to related tables
         *
         * @param relatedTablesPropagation the value to set
         * @return this builder
         */
        public Builder relatedTablesPropagation(RelatedTablesPropagation relatedTablesPropagation) {
            this.relatedTablesPropagation = relatedTablesPropagation;
            this.__explicitlySet__.add("relatedTablesPropagation");
            return this;
        }
        /** Strategy to be applied while processing peer tables */
        @com.fasterxml.jackson.annotation.JsonProperty("peerTablesAction")
        private PeerTablesAction peerTablesAction;

        /**
         * Strategy to be applied while processing peer tables
         *
         * @param peerTablesAction the value to set
         * @return this builder
         */
        public Builder peerTablesAction(PeerTablesAction peerTablesAction) {
            this.peerTablesAction = peerTablesAction;
            this.__explicitlySet__.add("peerTablesAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSubsettingRuleDetails build() {
            UpdateSubsettingRuleDetails model =
                    new UpdateSubsettingRuleDetails(
                            this.displayName,
                            this.description,
                            this.scope,
                            this.subsetRuleEntry,
                            this.ruleCombinationMode,
                            this.relatedTablesPropagation,
                            this.peerTablesAction);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSubsettingRuleDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("subsetRuleEntry")) {
                this.subsetRuleEntry(model.getSubsetRuleEntry());
            }
            if (model.wasPropertyExplicitlySet("ruleCombinationMode")) {
                this.ruleCombinationMode(model.getRuleCombinationMode());
            }
            if (model.wasPropertyExplicitlySet("relatedTablesPropagation")) {
                this.relatedTablesPropagation(model.getRelatedTablesPropagation());
            }
            if (model.wasPropertyExplicitlySet("peerTablesAction")) {
                this.peerTablesAction(model.getPeerTablesAction());
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

    /** The display name of the subset rule */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the subset rule
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The description of the subset rule */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the subset rule
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final SubsetScope scope;

    public SubsetScope getScope() {
        return scope;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("subsetRuleEntry")
    private final SubsetRuleEntry subsetRuleEntry;

    public SubsetRuleEntry getSubsetRuleEntry() {
        return subsetRuleEntry;
    }

    /**
     * Specifies how this rule combines with other rules. UNION evaluates this rule independently
     * and adds matching rows to the result set. SERIAL applies this rule sequentially to filter
     * rows selected by a compatible preceding rule.
     */
    public enum RuleCombinationMode implements com.oracle.bmc.http.internal.BmcEnum {
        Union("UNION"),
        Serial("SERIAL"),
        ;

        private final String value;
        private static java.util.Map<String, RuleCombinationMode> map;

        static {
            map = new java.util.HashMap<>();
            for (RuleCombinationMode v : RuleCombinationMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        RuleCombinationMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RuleCombinationMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RuleCombinationMode: " + key);
        }
    };
    /**
     * Specifies how this rule combines with other rules. UNION evaluates this rule independently
     * and adds matching rows to the result set. SERIAL applies this rule sequentially to filter
     * rows selected by a compatible preceding rule.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ruleCombinationMode")
    private final RuleCombinationMode ruleCombinationMode;

    /**
     * Specifies how this rule combines with other rules. UNION evaluates this rule independently
     * and adds matching rows to the result set. SERIAL applies this rule sequentially to filter
     * rows selected by a compatible preceding rule.
     *
     * @return the value
     */
    public RuleCombinationMode getRuleCombinationMode() {
        return ruleCombinationMode;
    }

    /** Strategy to be applied while propagating subsetting rule to related tables */
    public enum RelatedTablesPropagation implements com.oracle.bmc.http.internal.BmcEnum {
        AncestorsAndDescendants("ANCESTORS_AND_DESCENDANTS"),
        Ancestors("ANCESTORS"),
        Descendants("DESCENDANTS"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, RelatedTablesPropagation> map;

        static {
            map = new java.util.HashMap<>();
            for (RelatedTablesPropagation v : RelatedTablesPropagation.values()) {
                map.put(v.getValue(), v);
            }
        }

        RelatedTablesPropagation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RelatedTablesPropagation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RelatedTablesPropagation: " + key);
        }
    };
    /** Strategy to be applied while propagating subsetting rule to related tables */
    @com.fasterxml.jackson.annotation.JsonProperty("relatedTablesPropagation")
    private final RelatedTablesPropagation relatedTablesPropagation;

    /**
     * Strategy to be applied while propagating subsetting rule to related tables
     *
     * @return the value
     */
    public RelatedTablesPropagation getRelatedTablesPropagation() {
        return relatedTablesPropagation;
    }

    /** Strategy to be applied while processing peer tables */
    public enum PeerTablesAction implements com.oracle.bmc.http.internal.BmcEnum {
        MinimumRows("MINIMUM_ROWS"),
        Subset("SUBSET"),
        MaximumRows("MAXIMUM_ROWS"),
        ;

        private final String value;
        private static java.util.Map<String, PeerTablesAction> map;

        static {
            map = new java.util.HashMap<>();
            for (PeerTablesAction v : PeerTablesAction.values()) {
                map.put(v.getValue(), v);
            }
        }

        PeerTablesAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PeerTablesAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PeerTablesAction: " + key);
        }
    };
    /** Strategy to be applied while processing peer tables */
    @com.fasterxml.jackson.annotation.JsonProperty("peerTablesAction")
    private final PeerTablesAction peerTablesAction;

    /**
     * Strategy to be applied while processing peer tables
     *
     * @return the value
     */
    public PeerTablesAction getPeerTablesAction() {
        return peerTablesAction;
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
        sb.append("UpdateSubsettingRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", subsetRuleEntry=").append(String.valueOf(this.subsetRuleEntry));
        sb.append(", ruleCombinationMode=").append(String.valueOf(this.ruleCombinationMode));
        sb.append(", relatedTablesPropagation=")
                .append(String.valueOf(this.relatedTablesPropagation));
        sb.append(", peerTablesAction=").append(String.valueOf(this.peerTablesAction));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSubsettingRuleDetails)) {
            return false;
        }

        UpdateSubsettingRuleDetails other = (UpdateSubsettingRuleDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.subsetRuleEntry, other.subsetRuleEntry)
                && java.util.Objects.equals(this.ruleCombinationMode, other.ruleCombinationMode)
                && java.util.Objects.equals(
                        this.relatedTablesPropagation, other.relatedTablesPropagation)
                && java.util.Objects.equals(this.peerTablesAction, other.peerTablesAction)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result =
                (result * PRIME)
                        + (this.subsetRuleEntry == null ? 43 : this.subsetRuleEntry.hashCode());
        result =
                (result * PRIME)
                        + (this.ruleCombinationMode == null
                                ? 43
                                : this.ruleCombinationMode.hashCode());
        result =
                (result * PRIME)
                        + (this.relatedTablesPropagation == null
                                ? 43
                                : this.relatedTablesPropagation.hashCode());
        result =
                (result * PRIME)
                        + (this.peerTablesAction == null ? 43 : this.peerTablesAction.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

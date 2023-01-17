/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * A recommended protection rule for a web application. This recommendation can be accepted to apply
 * it to the Web Application Firewall configuration for this policy.
 *
 * <p>Use the {@code POST /waasPolicies/{waasPolicyId}/actions/acceptWafConfigRecommendations}
 * method to accept recommended protection rules. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Recommendation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Recommendation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modSecurityRuleIds",
        "name",
        "description",
        "labels",
        "recommendedAction"
    })
    public Recommendation(
            String key,
            java.util.List<String> modSecurityRuleIds,
            String name,
            String description,
            java.util.List<String> labels,
            String recommendedAction) {
        super();
        this.key = key;
        this.modSecurityRuleIds = modSecurityRuleIds;
        this.name = name;
        this.description = description;
        this.labels = labels;
        this.recommendedAction = recommendedAction;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique key for the recommended protection rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique key for the recommended protection rule.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The list of the ModSecurity rule IDs associated with the protection rule. For more
         * information about ModSecurity's open source WAF rules, see [Mod Security's
         * documentation](https://www.modsecurity.org/CRS/Documentation/index.html).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("modSecurityRuleIds")
        private java.util.List<String> modSecurityRuleIds;

        /**
         * The list of the ModSecurity rule IDs associated with the protection rule. For more
         * information about ModSecurity's open source WAF rules, see [Mod Security's
         * documentation](https://www.modsecurity.org/CRS/Documentation/index.html).
         *
         * @param modSecurityRuleIds the value to set
         * @return this builder
         */
        public Builder modSecurityRuleIds(java.util.List<String> modSecurityRuleIds) {
            this.modSecurityRuleIds = modSecurityRuleIds;
            this.__explicitlySet__.add("modSecurityRuleIds");
            return this;
        }
        /** The name of the recommended protection rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the recommended protection rule.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The description of the recommended protection rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the recommended protection rule.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The list of labels for the recommended protection rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        /**
         * The list of labels for the recommended protection rule.
         *
         * @param labels the value to set
         * @return this builder
         */
        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }
        /** The recommended action to apply to the protection rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("recommendedAction")
        private String recommendedAction;

        /**
         * The recommended action to apply to the protection rule.
         *
         * @param recommendedAction the value to set
         * @return this builder
         */
        public Builder recommendedAction(String recommendedAction) {
            this.recommendedAction = recommendedAction;
            this.__explicitlySet__.add("recommendedAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Recommendation build() {
            Recommendation model =
                    new Recommendation(
                            this.key,
                            this.modSecurityRuleIds,
                            this.name,
                            this.description,
                            this.labels,
                            this.recommendedAction);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Recommendation model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modSecurityRuleIds")) {
                this.modSecurityRuleIds(model.getModSecurityRuleIds());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("labels")) {
                this.labels(model.getLabels());
            }
            if (model.wasPropertyExplicitlySet("recommendedAction")) {
                this.recommendedAction(model.getRecommendedAction());
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

    /** The unique key for the recommended protection rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique key for the recommended protection rule.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /**
     * The list of the ModSecurity rule IDs associated with the protection rule. For more
     * information about ModSecurity's open source WAF rules, see [Mod Security's
     * documentation](https://www.modsecurity.org/CRS/Documentation/index.html).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modSecurityRuleIds")
    private final java.util.List<String> modSecurityRuleIds;

    /**
     * The list of the ModSecurity rule IDs associated with the protection rule. For more
     * information about ModSecurity's open source WAF rules, see [Mod Security's
     * documentation](https://www.modsecurity.org/CRS/Documentation/index.html).
     *
     * @return the value
     */
    public java.util.List<String> getModSecurityRuleIds() {
        return modSecurityRuleIds;
    }

    /** The name of the recommended protection rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the recommended protection rule.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The description of the recommended protection rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the recommended protection rule.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The list of labels for the recommended protection rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<String> labels;

    /**
     * The list of labels for the recommended protection rule.
     *
     * @return the value
     */
    public java.util.List<String> getLabels() {
        return labels;
    }

    /** The recommended action to apply to the protection rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("recommendedAction")
    private final String recommendedAction;

    /**
     * The recommended action to apply to the protection rule.
     *
     * @return the value
     */
    public String getRecommendedAction() {
        return recommendedAction;
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
        sb.append("Recommendation(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modSecurityRuleIds=").append(String.valueOf(this.modSecurityRuleIds));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append(", recommendedAction=").append(String.valueOf(this.recommendedAction));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Recommendation)) {
            return false;
        }

        Recommendation other = (Recommendation) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modSecurityRuleIds, other.modSecurityRuleIds)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.labels, other.labels)
                && java.util.Objects.equals(this.recommendedAction, other.recommendedAction)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.modSecurityRuleIds == null
                                ? 43
                                : this.modSecurityRuleIds.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendedAction == null ? 43 : this.recommendedAction.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

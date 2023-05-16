/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.governancerulescontrolplane.model;

/**
 * Represents the governance rule shown to the child which is a subset of governance rule resource
 * in parent tenancy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220504")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EnforcedGovernanceRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EnforcedGovernanceRule
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "governanceRuleDisplayName",
        "type",
        "template",
        "lifecycleState",
        "timeCreated",
        "timeUpdated"
    })
    public EnforcedGovernanceRule(
            String id,
            String compartmentId,
            String governanceRuleDisplayName,
            GovernanceRuleType type,
            Template template,
            GovernanceRuleLifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.governanceRuleDisplayName = governanceRuleDisplayName;
        this.type = type;
        this.template = template;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Oracle ID
         * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
         * enforced governance rule.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The Oracle ID
         * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
         * enforced governance rule.
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
         * The Oracle ID
         * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
         * child's root compartment to which the governance rule is attached.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The Oracle ID
         * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
         * child's root compartment to which the governance rule is attached.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Display name of the governance rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("governanceRuleDisplayName")
        private String governanceRuleDisplayName;

        /**
         * Display name of the governance rule.
         *
         * @param governanceRuleDisplayName the value to set
         * @return this builder
         */
        public Builder governanceRuleDisplayName(String governanceRuleDisplayName) {
            this.governanceRuleDisplayName = governanceRuleDisplayName;
            this.__explicitlySet__.add("governanceRuleDisplayName");
            return this;
        }
        /**
         * Type of the governance rule, can be one of QUOTA, TAG, ALLOWED_REGIONS.
         *
         * <p>Example: {@code QUOTA}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private GovernanceRuleType type;

        /**
         * Type of the governance rule, can be one of QUOTA, TAG, ALLOWED_REGIONS.
         *
         * <p>Example: {@code QUOTA}
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(GovernanceRuleType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("template")
        private Template template;

        public Builder template(Template template) {
            this.template = template;
            this.__explicitlySet__.add("template");
            return this;
        }
        /** The current state of the governance rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private GovernanceRuleLifecycleState lifecycleState;

        /**
         * The current state of the governance rule.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(GovernanceRuleLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Date and time the governance rule was created. An RFC3339 formatted datetime string.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time the governance rule was created. An RFC3339 formatted datetime string.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
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
         * Date and time the governance rule was updated. An RFC3339 formatted datetime string.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Date and time the governance rule was updated. An RFC3339 formatted datetime string.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EnforcedGovernanceRule build() {
            EnforcedGovernanceRule model =
                    new EnforcedGovernanceRule(
                            this.id,
                            this.compartmentId,
                            this.governanceRuleDisplayName,
                            this.type,
                            this.template,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EnforcedGovernanceRule model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("governanceRuleDisplayName")) {
                this.governanceRuleDisplayName(model.getGovernanceRuleDisplayName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("template")) {
                this.template(model.getTemplate());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * The Oracle ID
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
     * enforced governance rule.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The Oracle ID
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
     * enforced governance rule.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The Oracle ID
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
     * child's root compartment to which the governance rule is attached.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The Oracle ID
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
     * child's root compartment to which the governance rule is attached.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Display name of the governance rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("governanceRuleDisplayName")
    private final String governanceRuleDisplayName;

    /**
     * Display name of the governance rule.
     *
     * @return the value
     */
    public String getGovernanceRuleDisplayName() {
        return governanceRuleDisplayName;
    }

    /**
     * Type of the governance rule, can be one of QUOTA, TAG, ALLOWED_REGIONS.
     *
     * <p>Example: {@code QUOTA}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final GovernanceRuleType type;

    /**
     * Type of the governance rule, can be one of QUOTA, TAG, ALLOWED_REGIONS.
     *
     * <p>Example: {@code QUOTA}
     *
     * @return the value
     */
    public GovernanceRuleType getType() {
        return type;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("template")
    private final Template template;

    public Template getTemplate() {
        return template;
    }

    /** The current state of the governance rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final GovernanceRuleLifecycleState lifecycleState;

    /**
     * The current state of the governance rule.
     *
     * @return the value
     */
    public GovernanceRuleLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Date and time the governance rule was created. An RFC3339 formatted datetime string.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time the governance rule was created. An RFC3339 formatted datetime string.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Date and time the governance rule was updated. An RFC3339 formatted datetime string.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Date and time the governance rule was updated. An RFC3339 formatted datetime string.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("EnforcedGovernanceRule(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", governanceRuleDisplayName=")
                .append(String.valueOf(this.governanceRuleDisplayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", template=").append(String.valueOf(this.template));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnforcedGovernanceRule)) {
            return false;
        }

        EnforcedGovernanceRule other = (EnforcedGovernanceRule) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.governanceRuleDisplayName, other.governanceRuleDisplayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.template, other.template)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
        result =
                (result * PRIME)
                        + (this.governanceRuleDisplayName == null
                                ? 43
                                : this.governanceRuleDisplayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.template == null ? 43 : this.template.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

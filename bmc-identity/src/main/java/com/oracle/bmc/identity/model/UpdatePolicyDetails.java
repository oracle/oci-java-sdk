/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdatePolicyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdatePolicyDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "statements",
        "versionDate",
        "freeformTags",
        "definedTags"
    })
    public UpdatePolicyDetails(
            String description,
            java.util.List<String> statements,
            java.util.Date versionDate,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.description = description;
        this.statements = statements;
        this.versionDate = versionDate;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The description you assign to the policy. Does not have to be unique, and it's changeable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description you assign to the policy. Does not have to be unique, and it's changeable.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * An array of policy statements written in the policy language. See
         * [How Policies Work](https://docs.cloud.oracle.com/Content/Identity/policieshow/how-policies-work.htm) and
         * [Common Policies](https://docs.cloud.oracle.com/Content/Identity/policiescommon/commonpolicies.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statements")
        private java.util.List<String> statements;

        /**
         * An array of policy statements written in the policy language. See
         * [How Policies Work](https://docs.cloud.oracle.com/Content/Identity/policieshow/how-policies-work.htm) and
         * [Common Policies](https://docs.cloud.oracle.com/Content/Identity/policiescommon/commonpolicies.htm).
         *
         * @param statements the value to set
         * @return this builder
         **/
        public Builder statements(java.util.List<String> statements) {
            this.statements = statements;
            this.__explicitlySet__.add("statements");
            return this;
        }
        /**
         * The version of the policy. If null or set to an empty string, when a request comes in for authorization, the
         * policy will be evaluated according to the current behavior of the services at that moment. If set to a particular
         * date (YYYY-MM-DD), the policy will be evaluated according to the behavior of the services on that date.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("versionDate")
        private java.util.Date versionDate;

        /**
         * The version of the policy. If null or set to an empty string, when a request comes in for authorization, the
         * policy will be evaluated according to the current behavior of the services at that moment. If set to a particular
         * date (YYYY-MM-DD), the policy will be evaluated according to the behavior of the services on that date.
         *
         * @param versionDate the value to set
         * @return this builder
         **/
        public Builder versionDate(java.util.Date versionDate) {
            this.versionDate = versionDate;
            this.__explicitlySet__.add("versionDate");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatePolicyDetails build() {
            UpdatePolicyDetails model =
                    new UpdatePolicyDetails(
                            this.description,
                            this.statements,
                            this.versionDate,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePolicyDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("statements")) {
                this.statements(model.getStatements());
            }
            if (model.wasPropertyExplicitlySet("versionDate")) {
                this.versionDate(model.getVersionDate());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The description you assign to the policy. Does not have to be unique, and it's changeable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description you assign to the policy. Does not have to be unique, and it's changeable.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * An array of policy statements written in the policy language. See
     * [How Policies Work](https://docs.cloud.oracle.com/Content/Identity/policieshow/how-policies-work.htm) and
     * [Common Policies](https://docs.cloud.oracle.com/Content/Identity/policiescommon/commonpolicies.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statements")
    private final java.util.List<String> statements;

    /**
     * An array of policy statements written in the policy language. See
     * [How Policies Work](https://docs.cloud.oracle.com/Content/Identity/policieshow/how-policies-work.htm) and
     * [Common Policies](https://docs.cloud.oracle.com/Content/Identity/policiescommon/commonpolicies.htm).
     *
     * @return the value
     **/
    public java.util.List<String> getStatements() {
        return statements;
    }

    /**
     * The version of the policy. If null or set to an empty string, when a request comes in for authorization, the
     * policy will be evaluated according to the current behavior of the services at that moment. If set to a particular
     * date (YYYY-MM-DD), the policy will be evaluated according to the behavior of the services on that date.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionDate")
    private final java.util.Date versionDate;

    /**
     * The version of the policy. If null or set to an empty string, when a request comes in for authorization, the
     * policy will be evaluated according to the current behavior of the services at that moment. If set to a particular
     * date (YYYY-MM-DD), the policy will be evaluated according to the behavior of the services on that date.
     *
     * @return the value
     **/
    public java.util.Date getVersionDate() {
        return versionDate;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdatePolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", statements=").append(String.valueOf(this.statements));
        sb.append(", versionDate=").append(String.valueOf(this.versionDate));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePolicyDetails)) {
            return false;
        }

        UpdatePolicyDetails other = (UpdatePolicyDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.statements, other.statements)
                && java.util.Objects.equals(this.versionDate, other.versionDate)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.statements == null ? 43 : this.statements.hashCode());
        result = (result * PRIME) + (this.versionDate == null ? 43 : this.versionDate.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

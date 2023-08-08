/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * User Schema Attribute Settings <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UserAttributesSettingsAttributeSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UserAttributesSettingsAttributeSettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "endUserMutability",
        "endUserMutabilityCanonicalValues"
    })
    public UserAttributesSettingsAttributeSettings(
            String name,
            String endUserMutability,
            java.util.List<String> endUserMutabilityCanonicalValues) {
        super();
        this.name = name;
        this.endUserMutability = endUserMutability;
        this.endUserMutabilityCanonicalValues = endUserMutabilityCanonicalValues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Fully-qualified attribute or complex mapping Name
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Fully-qualified attribute or complex mapping Name
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: true - returned: default - type: string - uniqueness: none
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * End User mutability
         *
         * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq "mutabilityValues"
         * and attrValues.value eq "$(endUserMutability)" - idcsCanonicalValueSourceResourceType:
         * AllowedValue - caseExact: false - multiValued: false - mutability: readWrite - required:
         * true - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("endUserMutability")
        private String endUserMutability;

        /**
         * End User mutability
         *
         * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq "mutabilityValues"
         * and attrValues.value eq "$(endUserMutability)" - idcsCanonicalValueSourceResourceType:
         * AllowedValue - caseExact: false - multiValued: false - mutability: readWrite - required:
         * true - returned: default - type: string - uniqueness: none
         *
         * @param endUserMutability the value to set
         * @return this builder
         */
        public Builder endUserMutability(String endUserMutability) {
            this.endUserMutability = endUserMutability;
            this.__explicitlySet__.add("endUserMutability");
            return this;
        }
        /**
         * Specifies the list of User mutabilities allowed.
         *
         * <p>*Added In:** 18.3.4
         *
         * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq "mutabilityValues"
         * and attrValues.value eq "$(endUserMutability)" - idcsCanonicalValueSourceResourceType:
         * AllowedValue - caseExact: true - multiValued: true - mutability: readWrite - required:
         * false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("endUserMutabilityCanonicalValues")
        private java.util.List<String> endUserMutabilityCanonicalValues;

        /**
         * Specifies the list of User mutabilities allowed.
         *
         * <p>*Added In:** 18.3.4
         *
         * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq "mutabilityValues"
         * and attrValues.value eq "$(endUserMutability)" - idcsCanonicalValueSourceResourceType:
         * AllowedValue - caseExact: true - multiValued: true - mutability: readWrite - required:
         * false - returned: default - type: string - uniqueness: none
         *
         * @param endUserMutabilityCanonicalValues the value to set
         * @return this builder
         */
        public Builder endUserMutabilityCanonicalValues(
                java.util.List<String> endUserMutabilityCanonicalValues) {
            this.endUserMutabilityCanonicalValues = endUserMutabilityCanonicalValues;
            this.__explicitlySet__.add("endUserMutabilityCanonicalValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserAttributesSettingsAttributeSettings build() {
            UserAttributesSettingsAttributeSettings model =
                    new UserAttributesSettingsAttributeSettings(
                            this.name,
                            this.endUserMutability,
                            this.endUserMutabilityCanonicalValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserAttributesSettingsAttributeSettings model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("endUserMutability")) {
                this.endUserMutability(model.getEndUserMutability());
            }
            if (model.wasPropertyExplicitlySet("endUserMutabilityCanonicalValues")) {
                this.endUserMutabilityCanonicalValues(model.getEndUserMutabilityCanonicalValues());
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
     * Fully-qualified attribute or complex mapping Name
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Fully-qualified attribute or complex mapping Name
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * End User mutability
     *
     * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq "mutabilityValues" and
     * attrValues.value eq "$(endUserMutability)" - idcsCanonicalValueSourceResourceType:
     * AllowedValue - caseExact: false - multiValued: false - mutability: readWrite - required: true
     * - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endUserMutability")
    private final String endUserMutability;

    /**
     * End User mutability
     *
     * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq "mutabilityValues" and
     * attrValues.value eq "$(endUserMutability)" - idcsCanonicalValueSourceResourceType:
     * AllowedValue - caseExact: false - multiValued: false - mutability: readWrite - required: true
     * - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getEndUserMutability() {
        return endUserMutability;
    }

    /**
     * Specifies the list of User mutabilities allowed.
     *
     * <p>*Added In:** 18.3.4
     *
     * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq "mutabilityValues" and
     * attrValues.value eq "$(endUserMutability)" - idcsCanonicalValueSourceResourceType:
     * AllowedValue - caseExact: true - multiValued: true - mutability: readWrite - required: false
     * - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endUserMutabilityCanonicalValues")
    private final java.util.List<String> endUserMutabilityCanonicalValues;

    /**
     * Specifies the list of User mutabilities allowed.
     *
     * <p>*Added In:** 18.3.4
     *
     * <p>*SCIM++ Properties:** - idcsCanonicalValueSourceFilter: attrName eq "mutabilityValues" and
     * attrValues.value eq "$(endUserMutability)" - idcsCanonicalValueSourceResourceType:
     * AllowedValue - caseExact: true - multiValued: true - mutability: readWrite - required: false
     * - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getEndUserMutabilityCanonicalValues() {
        return endUserMutabilityCanonicalValues;
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
        sb.append("UserAttributesSettingsAttributeSettings(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", endUserMutability=").append(String.valueOf(this.endUserMutability));
        sb.append(", endUserMutabilityCanonicalValues=")
                .append(String.valueOf(this.endUserMutabilityCanonicalValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserAttributesSettingsAttributeSettings)) {
            return false;
        }

        UserAttributesSettingsAttributeSettings other = (UserAttributesSettingsAttributeSettings) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.endUserMutability, other.endUserMutability)
                && java.util.Objects.equals(
                        this.endUserMutabilityCanonicalValues,
                        other.endUserMutabilityCanonicalValues)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.endUserMutability == null ? 43 : this.endUserMutability.hashCode());
        result =
                (result * PRIME)
                        + (this.endUserMutabilityCanonicalValues == null
                                ? 43
                                : this.endUserMutabilityCanonicalValues.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

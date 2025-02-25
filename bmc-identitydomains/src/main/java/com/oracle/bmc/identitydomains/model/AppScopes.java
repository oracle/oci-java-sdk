/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Scopes defined by this App. Used when this App acts as an OAuth Resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AppScopes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AppScopes extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "value",
        "fqs",
        "description",
        "displayName",
        "requiresConsent",
        "readOnly"
    })
    public AppScopes(
            String value,
            String fqs,
            String description,
            String displayName,
            Boolean requiresConsent,
            Boolean readOnly) {
        super();
        this.value = value;
        this.fqs = fqs;
        this.description = description;
        this.displayName = displayName;
        this.requiresConsent = requiresConsent;
        this.readOnly = readOnly;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OAuth scope.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * OAuth scope.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The fully qualified value of this scope within this App. A fully qualified scope combines the 'value' of each scope with the value of 'audience'. Each value of 'fqs' must be unique across the system. Used only when this App acts as an OAuth Resource.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: server
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fqs")
        private String fqs;

        /**
         * The fully qualified value of this scope within this App. A fully qualified scope combines the 'value' of each scope with the value of 'audience'. Each value of 'fqs' must be unique across the system. Used only when this App acts as an OAuth Resource.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: server
         * @param fqs the value to set
         * @return this builder
         **/
        public Builder fqs(String fqs) {
            this.fqs = fqs;
            this.__explicitlySet__.add("fqs");
            return this;
        }
        /**
         * OAuth scope description
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * OAuth scope description
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * OAuth scope display name
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * OAuth scope display name
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * If true, indicates that a user must provide consent to access this scope. Note: Used only when this App acts as an OAuth Resource.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requiresConsent")
        private Boolean requiresConsent;

        /**
         * If true, indicates that a user must provide consent to access this scope. Note: Used only when this App acts as an OAuth Resource.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param requiresConsent the value to set
         * @return this builder
         **/
        public Builder requiresConsent(Boolean requiresConsent) {
            this.requiresConsent = requiresConsent;
            this.__explicitlySet__.add("requiresConsent");
            return this;
        }
        /**
         * If true, indicates that this value must be protected.
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
        private Boolean readOnly;

        /**
         * If true, indicates that this value must be protected.
         * <p>
         **Added In:** 18.2.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         * @param readOnly the value to set
         * @return this builder
         **/
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            this.__explicitlySet__.add("readOnly");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppScopes build() {
            AppScopes model =
                    new AppScopes(
                            this.value,
                            this.fqs,
                            this.description,
                            this.displayName,
                            this.requiresConsent,
                            this.readOnly);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppScopes model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("fqs")) {
                this.fqs(model.getFqs());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("requiresConsent")) {
                this.requiresConsent(model.getRequiresConsent());
            }
            if (model.wasPropertyExplicitlySet("readOnly")) {
                this.readOnly(model.getReadOnly());
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
     * OAuth scope.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * OAuth scope.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * The fully qualified value of this scope within this App. A fully qualified scope combines the 'value' of each scope with the value of 'audience'. Each value of 'fqs' must be unique across the system. Used only when this App acts as an OAuth Resource.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: server
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fqs")
    private final String fqs;

    /**
     * The fully qualified value of this scope within this App. A fully qualified scope combines the 'value' of each scope with the value of 'audience'. Each value of 'fqs' must be unique across the system. Used only when this App acts as an OAuth Resource.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: server
     * @return the value
     **/
    public String getFqs() {
        return fqs;
    }

    /**
     * OAuth scope description
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * OAuth scope description
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * OAuth scope display name
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * OAuth scope display name
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * If true, indicates that a user must provide consent to access this scope. Note: Used only when this App acts as an OAuth Resource.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requiresConsent")
    private final Boolean requiresConsent;

    /**
     * If true, indicates that a user must provide consent to access this scope. Note: Used only when this App acts as an OAuth Resource.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getRequiresConsent() {
        return requiresConsent;
    }

    /**
     * If true, indicates that this value must be protected.
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
    private final Boolean readOnly;

    /**
     * If true, indicates that this value must be protected.
     * <p>
     **Added In:** 18.2.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getReadOnly() {
        return readOnly;
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
        sb.append("AppScopes(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", fqs=").append(String.valueOf(this.fqs));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", requiresConsent=").append(String.valueOf(this.requiresConsent));
        sb.append(", readOnly=").append(String.valueOf(this.readOnly));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppScopes)) {
            return false;
        }

        AppScopes other = (AppScopes) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.fqs, other.fqs)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.requiresConsent, other.requiresConsent)
                && java.util.Objects.equals(this.readOnly, other.readOnly)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.fqs == null ? 43 : this.fqs.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.requiresConsent == null ? 43 : this.requiresConsent.hashCode());
        result = (result * PRIME) + (this.readOnly == null ? 43 : this.readOnly.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Controls whether a user can update themselves or not via User related APIs
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExtensionSelfChangeUser.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExtensionSelfChangeUser
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"allowSelfChange"})
    public ExtensionSelfChangeUser(Boolean allowSelfChange) {
        super();
        this.allowSelfChange = allowSelfChange;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If true, allows requesting user to update themselves. If false, requesting user can't update themself (default).
         * <p>
         **Added In:** 2205182039
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: writeOnly
         *  - required: false
         *  - returned: never
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowSelfChange")
        private Boolean allowSelfChange;

        /**
         * If true, allows requesting user to update themselves. If false, requesting user can't update themself (default).
         * <p>
         **Added In:** 2205182039
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: writeOnly
         *  - required: false
         *  - returned: never
         *  - type: boolean
         *  - uniqueness: none
         * @param allowSelfChange the value to set
         * @return this builder
         **/
        public Builder allowSelfChange(Boolean allowSelfChange) {
            this.allowSelfChange = allowSelfChange;
            this.__explicitlySet__.add("allowSelfChange");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionSelfChangeUser build() {
            ExtensionSelfChangeUser model = new ExtensionSelfChangeUser(this.allowSelfChange);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionSelfChangeUser model) {
            if (model.wasPropertyExplicitlySet("allowSelfChange")) {
                this.allowSelfChange(model.getAllowSelfChange());
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
     * If true, allows requesting user to update themselves. If false, requesting user can't update themself (default).
     * <p>
     **Added In:** 2205182039
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: writeOnly
     *  - required: false
     *  - returned: never
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowSelfChange")
    private final Boolean allowSelfChange;

    /**
     * If true, allows requesting user to update themselves. If false, requesting user can't update themself (default).
     * <p>
     **Added In:** 2205182039
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: writeOnly
     *  - required: false
     *  - returned: never
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getAllowSelfChange() {
        return allowSelfChange;
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
        sb.append("ExtensionSelfChangeUser(");
        sb.append("super=").append(super.toString());
        sb.append("allowSelfChange=").append(String.valueOf(this.allowSelfChange));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionSelfChangeUser)) {
            return false;
        }

        ExtensionSelfChangeUser other = (ExtensionSelfChangeUser) o;
        return java.util.Objects.equals(this.allowSelfChange, other.allowSelfChange)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.allowSelfChange == null ? 43 : this.allowSelfChange.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

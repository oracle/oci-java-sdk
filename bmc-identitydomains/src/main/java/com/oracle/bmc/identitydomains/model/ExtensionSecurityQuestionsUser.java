/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * This extension defines attributes used to store Security Questions of User.
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
    builder = ExtensionSecurityQuestionsUser.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExtensionSecurityQuestionsUser
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"secQuestions"})
    public ExtensionSecurityQuestionsUser(java.util.List<UserExtSecQuestions> secQuestions) {
        super();
        this.secQuestions = secQuestions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Security question and answers provided by end-user for Account recovery and/or MFA. While setting up security questions, end-user can also provide hint along with answer.
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value]
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: request
         *  - type: complex
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("secQuestions")
        private java.util.List<UserExtSecQuestions> secQuestions;

        /**
         * Security question and answers provided by end-user for Account recovery and/or MFA. While setting up security questions, end-user can also provide hint along with answer.
         * <p>
         **SCIM++ Properties:**
         *  - idcsCompositeKey: [value]
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: request
         *  - type: complex
         *  - uniqueness: none
         * @param secQuestions the value to set
         * @return this builder
         **/
        public Builder secQuestions(java.util.List<UserExtSecQuestions> secQuestions) {
            this.secQuestions = secQuestions;
            this.__explicitlySet__.add("secQuestions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionSecurityQuestionsUser build() {
            ExtensionSecurityQuestionsUser model =
                    new ExtensionSecurityQuestionsUser(this.secQuestions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionSecurityQuestionsUser model) {
            if (model.wasPropertyExplicitlySet("secQuestions")) {
                this.secQuestions(model.getSecQuestions());
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
     * Security question and answers provided by end-user for Account recovery and/or MFA. While setting up security questions, end-user can also provide hint along with answer.
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value]
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: request
     *  - type: complex
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secQuestions")
    private final java.util.List<UserExtSecQuestions> secQuestions;

    /**
     * Security question and answers provided by end-user for Account recovery and/or MFA. While setting up security questions, end-user can also provide hint along with answer.
     * <p>
     **SCIM++ Properties:**
     *  - idcsCompositeKey: [value]
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: request
     *  - type: complex
     *  - uniqueness: none
     * @return the value
     **/
    public java.util.List<UserExtSecQuestions> getSecQuestions() {
        return secQuestions;
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
        sb.append("ExtensionSecurityQuestionsUser(");
        sb.append("super=").append(super.toString());
        sb.append("secQuestions=").append(String.valueOf(this.secQuestions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionSecurityQuestionsUser)) {
            return false;
        }

        ExtensionSecurityQuestionsUser other = (ExtensionSecurityQuestionsUser) o;
        return java.util.Objects.equals(this.secQuestions, other.secQuestions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.secQuestions == null ? 43 : this.secQuestions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

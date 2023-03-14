/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Security question and answers provided by end-user for Account recovery and/or MFA. While setting
 * up security questions, end-user can also provide hint along with answer.
 *
 * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability: readWrite
 * - required: false - returned: request - type: complex - uniqueness: none <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UserExtSecQuestions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UserExtSecQuestions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"value", "ref", "answer", "hintText"})
    public UserExtSecQuestions(String value, String ref, String answer, String hintText) {
        super();
        this.value = value;
        this.ref = ref;
        this.answer = answer;
        this.hintText = hintText;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Id of the question selected by user while setting up Security Question.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: always - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Id of the question selected by user while setting up Security Question.
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: always - type: string - uniqueness:
         * none
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The URI of the corresponding SecurityQuestion resource
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: reference - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * The URI of the corresponding SecurityQuestion resource
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: reference - uniqueness: none
         *
         * @param ref the value to set
         * @return this builder
         */
        public Builder ref(String ref) {
            this.ref = ref;
            this.__explicitlySet__.add("ref");
            return this;
        }
        /**
         * Answer provided by an user for a security question.
         *
         * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Answer - idcsSearchable: false -
         * idcsSensitive: hash - multiValued: false - mutability: writeOnly - required: true -
         * returned: never - type: string - uniqueness: none - idcsPii: true
         */
        @com.fasterxml.jackson.annotation.JsonProperty("answer")
        private String answer;

        /**
         * Answer provided by an user for a security question.
         *
         * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Answer - idcsSearchable: false -
         * idcsSensitive: hash - multiValued: false - mutability: writeOnly - required: true -
         * returned: never - type: string - uniqueness: none - idcsPii: true
         *
         * @param answer the value to set
         * @return this builder
         */
        public Builder answer(String answer) {
            this.answer = answer;
            this.__explicitlySet__.add("answer");
            return this;
        }
        /**
         * Hint for an answer given by user while setting up Security Question.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hintText")
        private String hintText;

        /**
         * Hint for an answer given by user while setting up Security Question.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite
         * - required: false - returned: default - type: string - uniqueness: none
         *
         * @param hintText the value to set
         * @return this builder
         */
        public Builder hintText(String hintText) {
            this.hintText = hintText;
            this.__explicitlySet__.add("hintText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UserExtSecQuestions build() {
            UserExtSecQuestions model =
                    new UserExtSecQuestions(this.value, this.ref, this.answer, this.hintText);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserExtSecQuestions model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("ref")) {
                this.ref(model.getRef());
            }
            if (model.wasPropertyExplicitlySet("answer")) {
                this.answer(model.getAnswer());
            }
            if (model.wasPropertyExplicitlySet("hintText")) {
                this.hintText(model.getHintText());
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
     * Id of the question selected by user while setting up Security Question.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Id of the question selected by user while setting up Security Question.
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * The URI of the corresponding SecurityQuestion resource
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: reference - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * The URI of the corresponding SecurityQuestion resource
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: reference - uniqueness: none
     *
     * @return the value
     */
    public String getRef() {
        return ref;
    }

    /**
     * Answer provided by an user for a security question.
     *
     * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Answer - idcsSearchable: false -
     * idcsSensitive: hash - multiValued: false - mutability: writeOnly - required: true - returned:
     * never - type: string - uniqueness: none - idcsPii: true
     */
    @com.fasterxml.jackson.annotation.JsonProperty("answer")
    private final String answer;

    /**
     * Answer provided by an user for a security question.
     *
     * <p>*SCIM++ Properties:** - idcsCsvAttributeName: Answer - idcsSearchable: false -
     * idcsSensitive: hash - multiValued: false - mutability: writeOnly - required: true - returned:
     * never - type: string - uniqueness: none - idcsPii: true
     *
     * @return the value
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Hint for an answer given by user while setting up Security Question.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hintText")
    private final String hintText;

    /**
     * Hint for an answer given by user while setting up Security Question.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readWrite -
     * required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getHintText() {
        return hintText;
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
        sb.append("UserExtSecQuestions(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(", answer=").append(String.valueOf(this.answer));
        sb.append(", hintText=").append(String.valueOf(this.hintText));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserExtSecQuestions)) {
            return false;
        }

        UserExtSecQuestions other = (UserExtSecQuestions) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.answer, other.answer)
                && java.util.Objects.equals(this.hintText, other.hintText)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result = (result * PRIME) + (this.answer == null ? 43 : this.answer.hashCode());
        result = (result * PRIME) + (this.hintText == null ? 43 : this.hintText.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

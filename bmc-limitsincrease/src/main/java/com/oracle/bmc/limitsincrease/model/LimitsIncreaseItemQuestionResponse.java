/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limitsincrease.model;

/**
 * A question and its response.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LimitsIncreaseItemQuestionResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LimitsIncreaseItemQuestionResponse
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "questionText", "questionResponse"})
    public LimitsIncreaseItemQuestionResponse(
            String id, String questionText, String questionResponse) {
        super();
        this.id = id;
        this.questionText = questionText;
        this.questionResponse = questionResponse;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the question.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the question.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The text of the question.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("questionText")
        private String questionText;

        /**
         * The text of the question.
         * @param questionText the value to set
         * @return this builder
         **/
        public Builder questionText(String questionText) {
            this.questionText = questionText;
            this.__explicitlySet__.add("questionText");
            return this;
        }
        /**
         * The response to the question.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("questionResponse")
        private String questionResponse;

        /**
         * The response to the question.
         * @param questionResponse the value to set
         * @return this builder
         **/
        public Builder questionResponse(String questionResponse) {
            this.questionResponse = questionResponse;
            this.__explicitlySet__.add("questionResponse");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LimitsIncreaseItemQuestionResponse build() {
            LimitsIncreaseItemQuestionResponse model =
                    new LimitsIncreaseItemQuestionResponse(
                            this.id, this.questionText, this.questionResponse);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LimitsIncreaseItemQuestionResponse model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("questionText")) {
                this.questionText(model.getQuestionText());
            }
            if (model.wasPropertyExplicitlySet("questionResponse")) {
                this.questionResponse(model.getQuestionResponse());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the question.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the question.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The text of the question.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("questionText")
    private final String questionText;

    /**
     * The text of the question.
     * @return the value
     **/
    public String getQuestionText() {
        return questionText;
    }

    /**
     * The response to the question.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("questionResponse")
    private final String questionResponse;

    /**
     * The response to the question.
     * @return the value
     **/
    public String getQuestionResponse() {
        return questionResponse;
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
        sb.append("LimitsIncreaseItemQuestionResponse(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", questionText=").append(String.valueOf(this.questionText));
        sb.append(", questionResponse=").append(String.valueOf(this.questionResponse));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LimitsIncreaseItemQuestionResponse)) {
            return false;
        }

        LimitsIncreaseItemQuestionResponse other = (LimitsIncreaseItemQuestionResponse) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.questionText, other.questionText)
                && java.util.Objects.equals(this.questionResponse, other.questionResponse)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.questionText == null ? 43 : this.questionText.hashCode());
        result =
                (result * PRIME)
                        + (this.questionResponse == null ? 43 : this.questionResponse.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

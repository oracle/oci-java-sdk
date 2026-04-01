/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limitsincrease.model;

/**
 * A summary of properties for a question to be asked for a certain limit.
 * Example questions include database version for some limits in Autonomous AI Database or email domain for some limits in Email Delivery.
 * For more information, see
 * [Creating a Limit Increase Request](https://docs.oracle.com/iaas/Content/General/service-limits/create-request.htm).
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
    builder = LimitsIncreaseQuestionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LimitsIncreaseQuestionSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "service",
        "limitName",
        "questionText",
        "questionType",
        "options",
        "isRequired"
    })
    public LimitsIncreaseQuestionSummary(
            String id,
            String service,
            String limitName,
            String questionText,
            QuestionType questionType,
            java.util.Map<String, String> options,
            Boolean isRequired) {
        super();
        this.id = id;
        this.service = service;
        this.limitName = limitName;
        this.questionText = questionText;
        this.questionType = questionType;
        this.options = options;
        this.isRequired = isRequired;
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
         * The name of the service for the question.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private String service;

        /**
         * The name of the service for the question.
         * @param service the value to set
         * @return this builder
         **/
        public Builder service(String service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }
        /**
         * The name of the limit for the question (empty if the question is for the service).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("limitName")
        private String limitName;

        /**
         * The name of the limit for the question (empty if the question is for the service).
         * @param limitName the value to set
         * @return this builder
         **/
        public Builder limitName(String limitName) {
            this.limitName = limitName;
            this.__explicitlySet__.add("limitName");
            return this;
        }
        /**
         * The text for the question.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("questionText")
        private String questionText;

        /**
         * The text for the question.
         * @param questionText the value to set
         * @return this builder
         **/
        public Builder questionText(String questionText) {
            this.questionText = questionText;
            this.__explicitlySet__.add("questionText");
            return this;
        }
        /**
         * The type of question.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("questionType")
        private QuestionType questionType;

        /**
         * The type of question.
         * @param questionType the value to set
         * @return this builder
         **/
        public Builder questionType(QuestionType questionType) {
            this.questionType = questionType;
            this.__explicitlySet__.add("questionType");
            return this;
        }
        /**
         * Set options for the question. Applies to questions that aren't free text.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private java.util.Map<String, String> options;

        /**
         * Set options for the question. Applies to questions that aren't free text.
         * @param options the value to set
         * @return this builder
         **/
        public Builder options(java.util.Map<String, String> options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }
        /**
         * When {@code true}, requires an answer to the question.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
        private Boolean isRequired;

        /**
         * When {@code true}, requires an answer to the question.
         * @param isRequired the value to set
         * @return this builder
         **/
        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            this.__explicitlySet__.add("isRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LimitsIncreaseQuestionSummary build() {
            LimitsIncreaseQuestionSummary model =
                    new LimitsIncreaseQuestionSummary(
                            this.id,
                            this.service,
                            this.limitName,
                            this.questionText,
                            this.questionType,
                            this.options,
                            this.isRequired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LimitsIncreaseQuestionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("service")) {
                this.service(model.getService());
            }
            if (model.wasPropertyExplicitlySet("limitName")) {
                this.limitName(model.getLimitName());
            }
            if (model.wasPropertyExplicitlySet("questionText")) {
                this.questionText(model.getQuestionText());
            }
            if (model.wasPropertyExplicitlySet("questionType")) {
                this.questionType(model.getQuestionType());
            }
            if (model.wasPropertyExplicitlySet("options")) {
                this.options(model.getOptions());
            }
            if (model.wasPropertyExplicitlySet("isRequired")) {
                this.isRequired(model.getIsRequired());
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
     * The name of the service for the question.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final String service;

    /**
     * The name of the service for the question.
     * @return the value
     **/
    public String getService() {
        return service;
    }

    /**
     * The name of the limit for the question (empty if the question is for the service).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("limitName")
    private final String limitName;

    /**
     * The name of the limit for the question (empty if the question is for the service).
     * @return the value
     **/
    public String getLimitName() {
        return limitName;
    }

    /**
     * The text for the question.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("questionText")
    private final String questionText;

    /**
     * The text for the question.
     * @return the value
     **/
    public String getQuestionText() {
        return questionText;
    }

    /**
     * The type of question.
     **/
    public enum QuestionType {
        Text("TEXT"),
        Number("NUMBER"),
        Radio("RADIO"),
        Checkbox("CHECKBOX"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(QuestionType.class);

        private final String value;
        private static java.util.Map<String, QuestionType> map;

        static {
            map = new java.util.HashMap<>();
            for (QuestionType v : QuestionType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        QuestionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static QuestionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'QuestionType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of question.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("questionType")
    private final QuestionType questionType;

    /**
     * The type of question.
     * @return the value
     **/
    public QuestionType getQuestionType() {
        return questionType;
    }

    /**
     * Set options for the question. Applies to questions that aren't free text.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    private final java.util.Map<String, String> options;

    /**
     * Set options for the question. Applies to questions that aren't free text.
     * @return the value
     **/
    public java.util.Map<String, String> getOptions() {
        return options;
    }

    /**
     * When {@code true}, requires an answer to the question.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    private final Boolean isRequired;

    /**
     * When {@code true}, requires an answer to the question.
     * @return the value
     **/
    public Boolean getIsRequired() {
        return isRequired;
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
        sb.append("LimitsIncreaseQuestionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", service=").append(String.valueOf(this.service));
        sb.append(", limitName=").append(String.valueOf(this.limitName));
        sb.append(", questionText=").append(String.valueOf(this.questionText));
        sb.append(", questionType=").append(String.valueOf(this.questionType));
        sb.append(", options=").append(String.valueOf(this.options));
        sb.append(", isRequired=").append(String.valueOf(this.isRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LimitsIncreaseQuestionSummary)) {
            return false;
        }

        LimitsIncreaseQuestionSummary other = (LimitsIncreaseQuestionSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.service, other.service)
                && java.util.Objects.equals(this.limitName, other.limitName)
                && java.util.Objects.equals(this.questionText, other.questionText)
                && java.util.Objects.equals(this.questionType, other.questionType)
                && java.util.Objects.equals(this.options, other.options)
                && java.util.Objects.equals(this.isRequired, other.isRequired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result = (result * PRIME) + (this.limitName == null ? 43 : this.limitName.hashCode());
        result = (result * PRIME) + (this.questionText == null ? 43 : this.questionText.hashCode());
        result = (result * PRIME) + (this.questionType == null ? 43 : this.questionType.hashCode());
        result = (result * PRIME) + (this.options == null ? 43 : this.options.hashCode());
        result = (result * PRIME) + (this.isRequired == null ? 43 : this.isRequired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Details related to the voice available for the given language code and voice type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VoiceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VoiceSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "voiceId",
        "displayName",
        "description",
        "gender",
        "supportedModels",
        "languageCode",
        "languageDescription",
        "sampleRateInHertz",
        "wordsPerMinute",
        "isDefaultVoice"
    })
    public VoiceSummary(
            String voiceId,
            String displayName,
            String description,
            Gender gender,
            java.util.List<String> supportedModels,
            LanguageCode languageCode,
            String languageDescription,
            Integer sampleRateInHertz,
            Integer wordsPerMinute,
            Boolean isDefaultVoice) {
        super();
        this.voiceId = voiceId;
        this.displayName = displayName;
        this.description = description;
        this.gender = gender;
        this.supportedModels = supportedModels;
        this.languageCode = languageCode;
        this.languageDescription = languageDescription;
        this.sampleRateInHertz = sampleRateInHertz;
        this.wordsPerMinute = wordsPerMinute;
        this.isDefaultVoice = isDefaultVoice;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique Id of the voice.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("voiceId")
        private String voiceId;

        /**
         * Unique Id of the voice.
         * @param voiceId the value to set
         * @return this builder
         **/
        public Builder voiceId(String voiceId) {
            this.voiceId = voiceId;
            this.__explicitlySet__.add("voiceId");
            return this;
        }
        /**
         * A user-friendly display name of the language for the user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name of the language for the user.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A small description of the voice like its language and voice type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A small description of the voice like its language and voice type.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Gender of the speaker.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gender")
        private Gender gender;

        /**
         * Gender of the speaker.
         * @param gender the value to set
         * @return this builder
         **/
        public Builder gender(Gender gender) {
            this.gender = gender;
            this.__explicitlySet__.add("gender");
            return this;
        }
        /**
         * Models the particular speaker is aligned to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportedModels")
        private java.util.List<String> supportedModels;

        /**
         * Models the particular speaker is aligned to.
         * @param supportedModels the value to set
         * @return this builder
         **/
        public Builder supportedModels(java.util.List<String> supportedModels) {
            this.supportedModels = supportedModels;
            this.__explicitlySet__.add("supportedModels");
            return this;
        }
        /**
         * An abbreviated notation of region to which the language and accent of the speaker belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
        private LanguageCode languageCode;

        /**
         * An abbreviated notation of region to which the language and accent of the speaker belongs to.
         * @param languageCode the value to set
         * @return this builder
         **/
        public Builder languageCode(LanguageCode languageCode) {
            this.languageCode = languageCode;
            this.__explicitlySet__.add("languageCode");
            return this;
        }
        /**
         * A description of region to which the language and accent of the speaker belongs to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("languageDescription")
        private String languageDescription;

        /**
         * A description of region to which the language and accent of the speaker belongs to.
         * @param languageDescription the value to set
         * @return this builder
         **/
        public Builder languageDescription(String languageDescription) {
            this.languageDescription = languageDescription;
            this.__explicitlySet__.add("languageDescription");
            return this;
        }
        /**
         * The sample rate of the speaker in Hertz.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sampleRateInHertz")
        private Integer sampleRateInHertz;

        /**
         * The sample rate of the speaker in Hertz.
         * @param sampleRateInHertz the value to set
         * @return this builder
         **/
        public Builder sampleRateInHertz(Integer sampleRateInHertz) {
            this.sampleRateInHertz = sampleRateInHertz;
            this.__explicitlySet__.add("sampleRateInHertz");
            return this;
        }
        /**
         * The number of words the speaker can narrate per minute. It signifies the speed of the speech produced by the speaker.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("wordsPerMinute")
        private Integer wordsPerMinute;

        /**
         * The number of words the speaker can narrate per minute. It signifies the speed of the speech produced by the speaker.
         * @param wordsPerMinute the value to set
         * @return this builder
         **/
        public Builder wordsPerMinute(Integer wordsPerMinute) {
            this.wordsPerMinute = wordsPerMinute;
            this.__explicitlySet__.add("wordsPerMinute");
            return this;
        }
        /**
         * Whether this voice id is default voice used for inference.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefaultVoice")
        private Boolean isDefaultVoice;

        /**
         * Whether this voice id is default voice used for inference.
         * @param isDefaultVoice the value to set
         * @return this builder
         **/
        public Builder isDefaultVoice(Boolean isDefaultVoice) {
            this.isDefaultVoice = isDefaultVoice;
            this.__explicitlySet__.add("isDefaultVoice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VoiceSummary build() {
            VoiceSummary model =
                    new VoiceSummary(
                            this.voiceId,
                            this.displayName,
                            this.description,
                            this.gender,
                            this.supportedModels,
                            this.languageCode,
                            this.languageDescription,
                            this.sampleRateInHertz,
                            this.wordsPerMinute,
                            this.isDefaultVoice);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VoiceSummary model) {
            if (model.wasPropertyExplicitlySet("voiceId")) {
                this.voiceId(model.getVoiceId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("gender")) {
                this.gender(model.getGender());
            }
            if (model.wasPropertyExplicitlySet("supportedModels")) {
                this.supportedModels(model.getSupportedModels());
            }
            if (model.wasPropertyExplicitlySet("languageCode")) {
                this.languageCode(model.getLanguageCode());
            }
            if (model.wasPropertyExplicitlySet("languageDescription")) {
                this.languageDescription(model.getLanguageDescription());
            }
            if (model.wasPropertyExplicitlySet("sampleRateInHertz")) {
                this.sampleRateInHertz(model.getSampleRateInHertz());
            }
            if (model.wasPropertyExplicitlySet("wordsPerMinute")) {
                this.wordsPerMinute(model.getWordsPerMinute());
            }
            if (model.wasPropertyExplicitlySet("isDefaultVoice")) {
                this.isDefaultVoice(model.getIsDefaultVoice());
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
     * Unique Id of the voice.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("voiceId")
    private final String voiceId;

    /**
     * Unique Id of the voice.
     * @return the value
     **/
    public String getVoiceId() {
        return voiceId;
    }

    /**
     * A user-friendly display name of the language for the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name of the language for the user.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A small description of the voice like its language and voice type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A small description of the voice like its language and voice type.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Gender of the speaker.
     **/
    public enum Gender {
        Male("MALE"),
        Female("FEMALE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Gender.class);

        private final String value;
        private static java.util.Map<String, Gender> map;

        static {
            map = new java.util.HashMap<>();
            for (Gender v : Gender.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Gender(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Gender create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Gender', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Gender of the speaker.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gender")
    private final Gender gender;

    /**
     * Gender of the speaker.
     * @return the value
     **/
    public Gender getGender() {
        return gender;
    }

    /**
     * Models the particular speaker is aligned to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedModels")
    private final java.util.List<String> supportedModels;

    /**
     * Models the particular speaker is aligned to.
     * @return the value
     **/
    public java.util.List<String> getSupportedModels() {
        return supportedModels;
    }

    /**
     * An abbreviated notation of region to which the language and accent of the speaker belongs to.
     **/
    public enum LanguageCode {
        EnUs("en-US"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LanguageCode.class);

        private final String value;
        private static java.util.Map<String, LanguageCode> map;

        static {
            map = new java.util.HashMap<>();
            for (LanguageCode v : LanguageCode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LanguageCode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LanguageCode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LanguageCode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * An abbreviated notation of region to which the language and accent of the speaker belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    private final LanguageCode languageCode;

    /**
     * An abbreviated notation of region to which the language and accent of the speaker belongs to.
     * @return the value
     **/
    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    /**
     * A description of region to which the language and accent of the speaker belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languageDescription")
    private final String languageDescription;

    /**
     * A description of region to which the language and accent of the speaker belongs to.
     * @return the value
     **/
    public String getLanguageDescription() {
        return languageDescription;
    }

    /**
     * The sample rate of the speaker in Hertz.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sampleRateInHertz")
    private final Integer sampleRateInHertz;

    /**
     * The sample rate of the speaker in Hertz.
     * @return the value
     **/
    public Integer getSampleRateInHertz() {
        return sampleRateInHertz;
    }

    /**
     * The number of words the speaker can narrate per minute. It signifies the speed of the speech produced by the speaker.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wordsPerMinute")
    private final Integer wordsPerMinute;

    /**
     * The number of words the speaker can narrate per minute. It signifies the speed of the speech produced by the speaker.
     * @return the value
     **/
    public Integer getWordsPerMinute() {
        return wordsPerMinute;
    }

    /**
     * Whether this voice id is default voice used for inference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefaultVoice")
    private final Boolean isDefaultVoice;

    /**
     * Whether this voice id is default voice used for inference.
     * @return the value
     **/
    public Boolean getIsDefaultVoice() {
        return isDefaultVoice;
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
        sb.append("VoiceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("voiceId=").append(String.valueOf(this.voiceId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", gender=").append(String.valueOf(this.gender));
        sb.append(", supportedModels=").append(String.valueOf(this.supportedModels));
        sb.append(", languageCode=").append(String.valueOf(this.languageCode));
        sb.append(", languageDescription=").append(String.valueOf(this.languageDescription));
        sb.append(", sampleRateInHertz=").append(String.valueOf(this.sampleRateInHertz));
        sb.append(", wordsPerMinute=").append(String.valueOf(this.wordsPerMinute));
        sb.append(", isDefaultVoice=").append(String.valueOf(this.isDefaultVoice));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VoiceSummary)) {
            return false;
        }

        VoiceSummary other = (VoiceSummary) o;
        return java.util.Objects.equals(this.voiceId, other.voiceId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.gender, other.gender)
                && java.util.Objects.equals(this.supportedModels, other.supportedModels)
                && java.util.Objects.equals(this.languageCode, other.languageCode)
                && java.util.Objects.equals(this.languageDescription, other.languageDescription)
                && java.util.Objects.equals(this.sampleRateInHertz, other.sampleRateInHertz)
                && java.util.Objects.equals(this.wordsPerMinute, other.wordsPerMinute)
                && java.util.Objects.equals(this.isDefaultVoice, other.isDefaultVoice)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.voiceId == null ? 43 : this.voiceId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.gender == null ? 43 : this.gender.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedModels == null ? 43 : this.supportedModels.hashCode());
        result = (result * PRIME) + (this.languageCode == null ? 43 : this.languageCode.hashCode());
        result =
                (result * PRIME)
                        + (this.languageDescription == null
                                ? 43
                                : this.languageDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.sampleRateInHertz == null ? 43 : this.sampleRateInHertz.hashCode());
        result =
                (result * PRIME)
                        + (this.wordsPerMinute == null ? 43 : this.wordsPerMinute.hashCode());
        result =
                (result * PRIME)
                        + (this.isDefaultVoice == null ? 43 : this.isDefaultVoice.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

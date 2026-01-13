/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Details for the request to summarize text. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SummarizeTextDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SummarizeTextDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "input",
        "servingMode",
        "compartmentId",
        "isEcho",
        "temperature",
        "additionalCommand",
        "length",
        "format",
        "extractiveness"
    })
    public SummarizeTextDetails(
            String input,
            ServingMode servingMode,
            String compartmentId,
            Boolean isEcho,
            Double temperature,
            String additionalCommand,
            Length length,
            Format format,
            Extractiveness extractiveness) {
        super();
        this.input = input;
        this.servingMode = servingMode;
        this.compartmentId = compartmentId;
        this.isEcho = isEcho;
        this.temperature = temperature;
        this.additionalCommand = additionalCommand;
        this.length = length;
        this.format = format;
        this.extractiveness = extractiveness;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The input string to be summarized. */
        @com.fasterxml.jackson.annotation.JsonProperty("input")
        private String input;

        /**
         * The input string to be summarized.
         *
         * @param input the value to set
         * @return this builder
         */
        public Builder input(String input) {
            this.input = input;
            this.__explicitlySet__.add("input");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("servingMode")
        private ServingMode servingMode;

        public Builder servingMode(ServingMode servingMode) {
            this.servingMode = servingMode;
            this.__explicitlySet__.add("servingMode");
            return this;
        }
        /** The OCID of compartment in which to call the Generative AI service to summarize text. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of compartment in which to call the Generative AI service to summarize text.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Whether or not to include the original inputs in the response. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEcho")
        private Boolean isEcho;

        /**
         * Whether or not to include the original inputs in the response.
         *
         * @param isEcho the value to set
         * @return this builder
         */
        public Builder isEcho(Boolean isEcho) {
            this.isEcho = isEcho;
            this.__explicitlySet__.add("isEcho");
            return this;
        }
        /**
         * A number that sets the randomness of the generated output. Lower temperatures mean less
         * random generations.
         *
         * <p>Use lower numbers for tasks with a correct answer such as question answering or
         * summarizing. High temperatures can generate hallucinations or factually incorrect
         * information. Start with temperatures lower than 1.0, and increase the temperature for
         * more creative outputs, as you regenerate the prompts to refine the outputs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("temperature")
        private Double temperature;

        /**
         * A number that sets the randomness of the generated output. Lower temperatures mean less
         * random generations.
         *
         * <p>Use lower numbers for tasks with a correct answer such as question answering or
         * summarizing. High temperatures can generate hallucinations or factually incorrect
         * information. Start with temperatures lower than 1.0, and increase the temperature for
         * more creative outputs, as you regenerate the prompts to refine the outputs.
         *
         * @param temperature the value to set
         * @return this builder
         */
        public Builder temperature(Double temperature) {
            this.temperature = temperature;
            this.__explicitlySet__.add("temperature");
            return this;
        }
        /**
         * A free-form instruction for modifying how the summaries get generated. Should complete
         * the sentence "Generate a summary _". For example, "focusing on the next steps" or
         * "written by Yoda".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalCommand")
        private String additionalCommand;

        /**
         * A free-form instruction for modifying how the summaries get generated. Should complete
         * the sentence "Generate a summary _". For example, "focusing on the next steps" or
         * "written by Yoda".
         *
         * @param additionalCommand the value to set
         * @return this builder
         */
        public Builder additionalCommand(String additionalCommand) {
            this.additionalCommand = additionalCommand;
            this.__explicitlySet__.add("additionalCommand");
            return this;
        }
        /**
         * Indicates the approximate length of the summary. If "AUTO" is selected, the best option
         * will be picked based on the input text.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private Length length;

        /**
         * Indicates the approximate length of the summary. If "AUTO" is selected, the best option
         * will be picked based on the input text.
         *
         * @param length the value to set
         * @return this builder
         */
        public Builder length(Length length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }
        /**
         * Indicates the style in which the summary will be delivered - in a free form paragraph or
         * in bullet points. If "AUTO" is selected, the best option will be picked based on the
         * input text.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("format")
        private Format format;

        /**
         * Indicates the style in which the summary will be delivered - in a free form paragraph or
         * in bullet points. If "AUTO" is selected, the best option will be picked based on the
         * input text.
         *
         * @param format the value to set
         * @return this builder
         */
        public Builder format(Format format) {
            this.format = format;
            this.__explicitlySet__.add("format");
            return this;
        }
        /**
         * Controls how close to the original text the summary is. High extractiveness summaries
         * will lean towards reusing sentences verbatim, while low extractiveness summaries will
         * tend to paraphrase more.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("extractiveness")
        private Extractiveness extractiveness;

        /**
         * Controls how close to the original text the summary is. High extractiveness summaries
         * will lean towards reusing sentences verbatim, while low extractiveness summaries will
         * tend to paraphrase more.
         *
         * @param extractiveness the value to set
         * @return this builder
         */
        public Builder extractiveness(Extractiveness extractiveness) {
            this.extractiveness = extractiveness;
            this.__explicitlySet__.add("extractiveness");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SummarizeTextDetails build() {
            SummarizeTextDetails model =
                    new SummarizeTextDetails(
                            this.input,
                            this.servingMode,
                            this.compartmentId,
                            this.isEcho,
                            this.temperature,
                            this.additionalCommand,
                            this.length,
                            this.format,
                            this.extractiveness);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummarizeTextDetails model) {
            if (model.wasPropertyExplicitlySet("input")) {
                this.input(model.getInput());
            }
            if (model.wasPropertyExplicitlySet("servingMode")) {
                this.servingMode(model.getServingMode());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("isEcho")) {
                this.isEcho(model.getIsEcho());
            }
            if (model.wasPropertyExplicitlySet("temperature")) {
                this.temperature(model.getTemperature());
            }
            if (model.wasPropertyExplicitlySet("additionalCommand")) {
                this.additionalCommand(model.getAdditionalCommand());
            }
            if (model.wasPropertyExplicitlySet("length")) {
                this.length(model.getLength());
            }
            if (model.wasPropertyExplicitlySet("format")) {
                this.format(model.getFormat());
            }
            if (model.wasPropertyExplicitlySet("extractiveness")) {
                this.extractiveness(model.getExtractiveness());
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

    /** The input string to be summarized. */
    @com.fasterxml.jackson.annotation.JsonProperty("input")
    private final String input;

    /**
     * The input string to be summarized.
     *
     * @return the value
     */
    public String getInput() {
        return input;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("servingMode")
    private final ServingMode servingMode;

    public ServingMode getServingMode() {
        return servingMode;
    }

    /** The OCID of compartment in which to call the Generative AI service to summarize text. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of compartment in which to call the Generative AI service to summarize text.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Whether or not to include the original inputs in the response. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEcho")
    private final Boolean isEcho;

    /**
     * Whether or not to include the original inputs in the response.
     *
     * @return the value
     */
    public Boolean getIsEcho() {
        return isEcho;
    }

    /**
     * A number that sets the randomness of the generated output. Lower temperatures mean less
     * random generations.
     *
     * <p>Use lower numbers for tasks with a correct answer such as question answering or
     * summarizing. High temperatures can generate hallucinations or factually incorrect
     * information. Start with temperatures lower than 1.0, and increase the temperature for more
     * creative outputs, as you regenerate the prompts to refine the outputs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("temperature")
    private final Double temperature;

    /**
     * A number that sets the randomness of the generated output. Lower temperatures mean less
     * random generations.
     *
     * <p>Use lower numbers for tasks with a correct answer such as question answering or
     * summarizing. High temperatures can generate hallucinations or factually incorrect
     * information. Start with temperatures lower than 1.0, and increase the temperature for more
     * creative outputs, as you regenerate the prompts to refine the outputs.
     *
     * @return the value
     */
    public Double getTemperature() {
        return temperature;
    }

    /**
     * A free-form instruction for modifying how the summaries get generated. Should complete the
     * sentence "Generate a summary _". For example, "focusing on the next steps" or "written by
     * Yoda".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalCommand")
    private final String additionalCommand;

    /**
     * A free-form instruction for modifying how the summaries get generated. Should complete the
     * sentence "Generate a summary _". For example, "focusing on the next steps" or "written by
     * Yoda".
     *
     * @return the value
     */
    public String getAdditionalCommand() {
        return additionalCommand;
    }

    /**
     * Indicates the approximate length of the summary. If "AUTO" is selected, the best option will
     * be picked based on the input text.
     */
    public enum Length implements com.oracle.bmc.http.internal.BmcEnum {
        Short("SHORT"),
        Medium("MEDIUM"),
        Long("LONG"),
        Auto("AUTO"),
        ;

        private final String value;
        private static java.util.Map<String, Length> map;

        static {
            map = new java.util.HashMap<>();
            for (Length v : Length.values()) {
                map.put(v.getValue(), v);
            }
        }

        Length(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Length create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Length: " + key);
        }
    };
    /**
     * Indicates the approximate length of the summary. If "AUTO" is selected, the best option will
     * be picked based on the input text.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    private final Length length;

    /**
     * Indicates the approximate length of the summary. If "AUTO" is selected, the best option will
     * be picked based on the input text.
     *
     * @return the value
     */
    public Length getLength() {
        return length;
    }

    /**
     * Indicates the style in which the summary will be delivered - in a free form paragraph or in
     * bullet points. If "AUTO" is selected, the best option will be picked based on the input text.
     */
    public enum Format implements com.oracle.bmc.http.internal.BmcEnum {
        Paragraph("PARAGRAPH"),
        Bullets("BULLETS"),
        Auto("AUTO"),
        ;

        private final String value;
        private static java.util.Map<String, Format> map;

        static {
            map = new java.util.HashMap<>();
            for (Format v : Format.values()) {
                map.put(v.getValue(), v);
            }
        }

        Format(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Format create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Format: " + key);
        }
    };
    /**
     * Indicates the style in which the summary will be delivered - in a free form paragraph or in
     * bullet points. If "AUTO" is selected, the best option will be picked based on the input text.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    private final Format format;

    /**
     * Indicates the style in which the summary will be delivered - in a free form paragraph or in
     * bullet points. If "AUTO" is selected, the best option will be picked based on the input text.
     *
     * @return the value
     */
    public Format getFormat() {
        return format;
    }

    /**
     * Controls how close to the original text the summary is. High extractiveness summaries will
     * lean towards reusing sentences verbatim, while low extractiveness summaries will tend to
     * paraphrase more.
     */
    public enum Extractiveness implements com.oracle.bmc.http.internal.BmcEnum {
        Low("LOW"),
        Medium("MEDIUM"),
        High("HIGH"),
        Auto("AUTO"),
        ;

        private final String value;
        private static java.util.Map<String, Extractiveness> map;

        static {
            map = new java.util.HashMap<>();
            for (Extractiveness v : Extractiveness.values()) {
                map.put(v.getValue(), v);
            }
        }

        Extractiveness(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Extractiveness create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Extractiveness: " + key);
        }
    };
    /**
     * Controls how close to the original text the summary is. High extractiveness summaries will
     * lean towards reusing sentences verbatim, while low extractiveness summaries will tend to
     * paraphrase more.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extractiveness")
    private final Extractiveness extractiveness;

    /**
     * Controls how close to the original text the summary is. High extractiveness summaries will
     * lean towards reusing sentences verbatim, while low extractiveness summaries will tend to
     * paraphrase more.
     *
     * @return the value
     */
    public Extractiveness getExtractiveness() {
        return extractiveness;
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
        sb.append("SummarizeTextDetails(");
        sb.append("super=").append(super.toString());
        sb.append("input=").append(String.valueOf(this.input));
        sb.append(", servingMode=").append(String.valueOf(this.servingMode));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isEcho=").append(String.valueOf(this.isEcho));
        sb.append(", temperature=").append(String.valueOf(this.temperature));
        sb.append(", additionalCommand=").append(String.valueOf(this.additionalCommand));
        sb.append(", length=").append(String.valueOf(this.length));
        sb.append(", format=").append(String.valueOf(this.format));
        sb.append(", extractiveness=").append(String.valueOf(this.extractiveness));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeTextDetails)) {
            return false;
        }

        SummarizeTextDetails other = (SummarizeTextDetails) o;
        return java.util.Objects.equals(this.input, other.input)
                && java.util.Objects.equals(this.servingMode, other.servingMode)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isEcho, other.isEcho)
                && java.util.Objects.equals(this.temperature, other.temperature)
                && java.util.Objects.equals(this.additionalCommand, other.additionalCommand)
                && java.util.Objects.equals(this.length, other.length)
                && java.util.Objects.equals(this.format, other.format)
                && java.util.Objects.equals(this.extractiveness, other.extractiveness)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.input == null ? 43 : this.input.hashCode());
        result = (result * PRIME) + (this.servingMode == null ? 43 : this.servingMode.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.isEcho == null ? 43 : this.isEcho.hashCode());
        result = (result * PRIME) + (this.temperature == null ? 43 : this.temperature.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalCommand == null ? 43 : this.additionalCommand.hashCode());
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        result = (result * PRIME) + (this.format == null ? 43 : this.format.hashCode());
        result =
                (result * PRIME)
                        + (this.extractiveness == null ? 43 : this.extractiveness.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

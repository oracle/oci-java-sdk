/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The value of a form field.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "valueType",
    defaultImpl = FieldValue.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ValueTime.class, name = "TIME"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ValueInteger.class,
        name = "INTEGER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ValueDate.class, name = "DATE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ValueNumber.class, name = "NUMBER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ValueString.class, name = "STRING"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ValuePhoneNumber.class,
        name = "PHONE_NUMBER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ValueArray.class, name = "ARRAY")
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class FieldValue extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"text", "confidence", "boundingPolygon", "wordIndexes"})
    protected FieldValue(
            String text,
            Float confidence,
            BoundingPolygon boundingPolygon,
            java.util.List<Integer> wordIndexes) {
        super();
        this.text = text;
        this.confidence = confidence;
        this.boundingPolygon = boundingPolygon;
        this.wordIndexes = wordIndexes;
    }

    /**
     * The detected text of a field.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * The detected text of a field.
     * @return the value
     **/
    public String getText() {
        return text;
    }

    /**
     * The confidence score between 0 and 1.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    private final Float confidence;

    /**
     * The confidence score between 0 and 1.
     * @return the value
     **/
    public Float getConfidence() {
        return confidence;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("boundingPolygon")
    private final BoundingPolygon boundingPolygon;

    public BoundingPolygon getBoundingPolygon() {
        return boundingPolygon;
    }

    /**
     * The indexes of the words in the field value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wordIndexes")
    private final java.util.List<Integer> wordIndexes;

    /**
     * The indexes of the words in the field value.
     * @return the value
     **/
    public java.util.List<Integer> getWordIndexes() {
        return wordIndexes;
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
        sb.append("FieldValue(");
        sb.append("super=").append(super.toString());
        sb.append("text=").append(String.valueOf(this.text));
        sb.append(", confidence=").append(String.valueOf(this.confidence));
        sb.append(", boundingPolygon=").append(String.valueOf(this.boundingPolygon));
        sb.append(", wordIndexes=").append(String.valueOf(this.wordIndexes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FieldValue)) {
            return false;
        }

        FieldValue other = (FieldValue) o;
        return java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.confidence, other.confidence)
                && java.util.Objects.equals(this.boundingPolygon, other.boundingPolygon)
                && java.util.Objects.equals(this.wordIndexes, other.wordIndexes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.confidence == null ? 43 : this.confidence.hashCode());
        result =
                (result * PRIME)
                        + (this.boundingPolygon == null ? 43 : this.boundingPolygon.hashCode());
        result = (result * PRIME) + (this.wordIndexes == null ? 43 : this.wordIndexes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The type of data detected.
     *
     **/
    public enum ValueType {
        String("STRING"),
        Date("DATE"),
        Time("TIME"),
        PhoneNumber("PHONE_NUMBER"),
        Number("NUMBER"),
        Integer("INTEGER"),
        Array("ARRAY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ValueType.class);

        private final String value;
        private static java.util.Map<String, ValueType> map;

        static {
            map = new java.util.HashMap<>();
            for (ValueType v : ValueType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ValueType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ValueType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ValueType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}

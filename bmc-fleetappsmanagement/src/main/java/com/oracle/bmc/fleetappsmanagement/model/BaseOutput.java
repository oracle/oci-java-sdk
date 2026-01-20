/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Base output. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = BaseOutput.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ListOutput.class, name = "LIST"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OcidOutput.class, name = "OCID"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = CsvOutput.class, name = "CSV"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CopyableStringOutput.class,
            name = "COPYABLESTRING"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = JsonOutput.class, name = "JSON"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = NumberOutput.class,
            name = "NUMBER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = StringOutput.class,
            name = "STRING"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = MapOutput.class, name = "MAP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = LinkOutput.class, name = "LINK"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = BoolOutput.class, name = "boolean")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class BaseOutput extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"title", "description", "isSensitive", "format", "visible"})
    protected BaseOutput(
            String title, String description, Boolean isSensitive, String format, String visible) {
        super();
        this.title = title;
        this.description = description;
        this.isSensitive = isSensitive;
        this.format = format;
        this.visible = visible;
    }

    /** Output label shown to the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * Output label shown to the user.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /** Extended help or summary for understanding output. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Extended help or summary for understanding output.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** If true, marks this output as sensitive. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
    private final Boolean isSensitive;

    /**
     * If true, marks this output as sensitive.
     *
     * @return the value
     */
    public Boolean getIsSensitive() {
        return isSensitive;
    }

    /** Hint about formatting or rendering the output value. */
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    private final String format;

    /**
     * Hint about formatting or rendering the output value.
     *
     * @return the value
     */
    public String getFormat() {
        return format;
    }

    /** Expression to show/hide this output. */
    @com.fasterxml.jackson.annotation.JsonProperty("visible")
    private final String visible;

    /**
     * Expression to show/hide this output.
     *
     * @return the value
     */
    public String getVisible() {
        return visible;
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
        sb.append("BaseOutput(");
        sb.append("super=").append(super.toString());
        sb.append("title=").append(String.valueOf(this.title));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isSensitive=").append(String.valueOf(this.isSensitive));
        sb.append(", format=").append(String.valueOf(this.format));
        sb.append(", visible=").append(String.valueOf(this.visible));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseOutput)) {
            return false;
        }

        BaseOutput other = (BaseOutput) o;
        return java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isSensitive, other.isSensitive)
                && java.util.Objects.equals(this.format, other.format)
                && java.util.Objects.equals(this.visible, other.visible)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isSensitive == null ? 43 : this.isSensitive.hashCode());
        result = (result * PRIME) + (this.format == null ? 43 : this.format.hashCode());
        result = (result * PRIME) + (this.visible == null ? 43 : this.visible.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Data type of the output value (such as STRING, NUMBER, OCID, etc). */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Array("ARRAY"),
        Boolean("BOOLEAN"),
        Number("NUMBER"),
        String("STRING"),
        Copyablestring("COPYABLESTRING"),
        Map("MAP"),
        List("LIST"),
        Json("JSON"),
        Csv("CSV"),
        Link("LINK"),
        Ocid("OCID"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}

/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Label for the attribute to be shown in the UI.
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
    builder = AppAttrRenderingMetadata.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AppAttrRenderingMetadata
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "label",
        "helptext",
        "widget",
        "datatype",
        "section",
        "order",
        "required",
        "regexp",
        "readOnly",
        "visible",
        "minLength",
        "maxLength",
        "minSize",
        "maxSize"
    })
    public AppAttrRenderingMetadata(
            String name,
            String label,
            String helptext,
            Widget widget,
            String datatype,
            Section section,
            Integer order,
            Boolean required,
            String regexp,
            Boolean readOnly,
            Boolean visible,
            Integer minLength,
            Integer maxLength,
            Integer minSize,
            Integer maxSize) {
        super();
        this.name = name;
        this.label = label;
        this.helptext = helptext;
        this.widget = widget;
        this.datatype = datatype;
        this.section = section;
        this.order = order;
        this.required = required;
        this.regexp = regexp;
        this.readOnly = readOnly;
        this.visible = visible;
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the attribute.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the attribute.
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Label for the attribute to be shown in the UI.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        /**
         * Label for the attribute to be shown in the UI.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param label the value to set
         * @return this builder
         **/
        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }
        /**
         * Help text for the attribute. It can contain HTML tags.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("helptext")
        private String helptext;

        /**
         * Help text for the attribute. It can contain HTML tags.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param helptext the value to set
         * @return this builder
         **/
        public Builder helptext(String helptext) {
            this.helptext = helptext;
            this.__explicitlySet__.add("helptext");
            return this;
        }
        /**
         * UI widget to use for the attribute.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("widget")
        private Widget widget;

        /**
         * UI widget to use for the attribute.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param widget the value to set
         * @return this builder
         **/
        public Builder widget(Widget widget) {
            this.widget = widget;
            this.__explicitlySet__.add("widget");
            return this;
        }
        /**
         * Data type of the attribute.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("datatype")
        private String datatype;

        /**
         * Data type of the attribute.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param datatype the value to set
         * @return this builder
         **/
        public Builder datatype(String datatype) {
            this.datatype = datatype;
            this.__explicitlySet__.add("datatype");
            return this;
        }
        /**
         * UI widget to use for the attribute.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("section")
        private Section section;

        /**
         * UI widget to use for the attribute.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param section the value to set
         * @return this builder
         **/
        public Builder section(Section section) {
            this.section = section;
            this.__explicitlySet__.add("section");
            return this;
        }
        /**
         * Data type of the attribute.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("order")
        private Integer order;

        /**
         * Data type of the attribute.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param order the value to set
         * @return this builder
         **/
        public Builder order(Integer order) {
            this.order = order;
            this.__explicitlySet__.add("order");
            return this;
        }
        /**
         * Attribute is required or optional.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("required")
        private Boolean required;

        /**
         * Attribute is required or optional.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param required the value to set
         * @return this builder
         **/
        public Builder required(Boolean required) {
            this.required = required;
            this.__explicitlySet__.add("required");
            return this;
        }
        /**
         * Regular expression of the attribute for validation.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("regexp")
        private String regexp;

        /**
         * Regular expression of the attribute for validation.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param regexp the value to set
         * @return this builder
         **/
        public Builder regexp(String regexp) {
            this.regexp = regexp;
            this.__explicitlySet__.add("regexp");
            return this;
        }
        /**
         * Is the attribute readOnly.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
        private Boolean readOnly;

        /**
         * Is the attribute readOnly.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
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
        /**
         * Indicates whether the attribute is to be shown on the application creation UI.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("visible")
        private Boolean visible;

        /**
         * Indicates whether the attribute is to be shown on the application creation UI.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: boolean
         *  - uniqueness: none
         * @param visible the value to set
         * @return this builder
         **/
        public Builder visible(Boolean visible) {
            this.visible = visible;
            this.__explicitlySet__.add("visible");
            return this;
        }
        /**
         * Minimum length of the attribute.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minLength")
        private Integer minLength;

        /**
         * Minimum length of the attribute.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param minLength the value to set
         * @return this builder
         **/
        public Builder minLength(Integer minLength) {
            this.minLength = minLength;
            this.__explicitlySet__.add("minLength");
            return this;
        }
        /**
         * Maximum length of the attribute.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxLength")
        private Integer maxLength;

        /**
         * Maximum length of the attribute.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param maxLength the value to set
         * @return this builder
         **/
        public Builder maxLength(Integer maxLength) {
            this.maxLength = maxLength;
            this.__explicitlySet__.add("maxLength");
            return this;
        }
        /**
         * Minimum size of the attribute..
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minSize")
        private Integer minSize;

        /**
         * Minimum size of the attribute..
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param minSize the value to set
         * @return this builder
         **/
        public Builder minSize(Integer minSize) {
            this.minSize = minSize;
            this.__explicitlySet__.add("minSize");
            return this;
        }
        /**
         * Maximum size of the attribute.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxSize")
        private Integer maxSize;

        /**
         * Maximum size of the attribute.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param maxSize the value to set
         * @return this builder
         **/
        public Builder maxSize(Integer maxSize) {
            this.maxSize = maxSize;
            this.__explicitlySet__.add("maxSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppAttrRenderingMetadata build() {
            AppAttrRenderingMetadata model =
                    new AppAttrRenderingMetadata(
                            this.name,
                            this.label,
                            this.helptext,
                            this.widget,
                            this.datatype,
                            this.section,
                            this.order,
                            this.required,
                            this.regexp,
                            this.readOnly,
                            this.visible,
                            this.minLength,
                            this.maxLength,
                            this.minSize,
                            this.maxSize);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppAttrRenderingMetadata model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("helptext")) {
                this.helptext(model.getHelptext());
            }
            if (model.wasPropertyExplicitlySet("widget")) {
                this.widget(model.getWidget());
            }
            if (model.wasPropertyExplicitlySet("datatype")) {
                this.datatype(model.getDatatype());
            }
            if (model.wasPropertyExplicitlySet("section")) {
                this.section(model.getSection());
            }
            if (model.wasPropertyExplicitlySet("order")) {
                this.order(model.getOrder());
            }
            if (model.wasPropertyExplicitlySet("required")) {
                this.required(model.getRequired());
            }
            if (model.wasPropertyExplicitlySet("regexp")) {
                this.regexp(model.getRegexp());
            }
            if (model.wasPropertyExplicitlySet("readOnly")) {
                this.readOnly(model.getReadOnly());
            }
            if (model.wasPropertyExplicitlySet("visible")) {
                this.visible(model.getVisible());
            }
            if (model.wasPropertyExplicitlySet("minLength")) {
                this.minLength(model.getMinLength());
            }
            if (model.wasPropertyExplicitlySet("maxLength")) {
                this.maxLength(model.getMaxLength());
            }
            if (model.wasPropertyExplicitlySet("minSize")) {
                this.minSize(model.getMinSize());
            }
            if (model.wasPropertyExplicitlySet("maxSize")) {
                this.maxSize(model.getMaxSize());
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
     * Name of the attribute.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the attribute.
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Label for the attribute to be shown in the UI.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    /**
     * Label for the attribute to be shown in the UI.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getLabel() {
        return label;
    }

    /**
     * Help text for the attribute. It can contain HTML tags.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("helptext")
    private final String helptext;

    /**
     * Help text for the attribute. It can contain HTML tags.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getHelptext() {
        return helptext;
    }

    /**
     * UI widget to use for the attribute.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    public enum Widget {
        Inputtext("inputtext"),
        Checkbox("checkbox"),
        Textarea("textarea"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Widget.class);

        private final String value;
        private static java.util.Map<String, Widget> map;

        static {
            map = new java.util.HashMap<>();
            for (Widget v : Widget.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Widget(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Widget create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Widget', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * UI widget to use for the attribute.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("widget")
    private final Widget widget;

    /**
     * UI widget to use for the attribute.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public Widget getWidget() {
        return widget;
    }

    /**
     * Data type of the attribute.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("datatype")
    private final String datatype;

    /**
     * Data type of the attribute.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getDatatype() {
        return datatype;
    }

    /**
     * UI widget to use for the attribute.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    public enum Section {
        Saml("saml"),
        General("general"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Section.class);

        private final String value;
        private static java.util.Map<String, Section> map;

        static {
            map = new java.util.HashMap<>();
            for (Section v : Section.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Section(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Section create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Section', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * UI widget to use for the attribute.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("section")
    private final Section section;

    /**
     * UI widget to use for the attribute.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public Section getSection() {
        return section;
    }

    /**
     * Data type of the attribute.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("order")
    private final Integer order;

    /**
     * Data type of the attribute.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getOrder() {
        return order;
    }

    /**
     * Attribute is required or optional.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("required")
    private final Boolean required;

    /**
     * Attribute is required or optional.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getRequired() {
        return required;
    }

    /**
     * Regular expression of the attribute for validation.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regexp")
    private final String regexp;

    /**
     * Regular expression of the attribute for validation.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getRegexp() {
        return regexp;
    }

    /**
     * Is the attribute readOnly.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("readOnly")
    private final Boolean readOnly;

    /**
     * Is the attribute readOnly.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * Indicates whether the attribute is to be shown on the application creation UI.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("visible")
    private final Boolean visible;

    /**
     * Indicates whether the attribute is to be shown on the application creation UI.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getVisible() {
        return visible;
    }

    /**
     * Minimum length of the attribute.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minLength")
    private final Integer minLength;

    /**
     * Minimum length of the attribute.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getMinLength() {
        return minLength;
    }

    /**
     * Maximum length of the attribute.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxLength")
    private final Integer maxLength;

    /**
     * Maximum length of the attribute.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * Minimum size of the attribute..
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minSize")
    private final Integer minSize;

    /**
     * Minimum size of the attribute..
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getMinSize() {
        return minSize;
    }

    /**
     * Maximum size of the attribute.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxSize")
    private final Integer maxSize;

    /**
     * Maximum size of the attribute.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getMaxSize() {
        return maxSize;
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
        sb.append("AppAttrRenderingMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", label=").append(String.valueOf(this.label));
        sb.append(", helptext=").append(String.valueOf(this.helptext));
        sb.append(", widget=").append(String.valueOf(this.widget));
        sb.append(", datatype=").append(String.valueOf(this.datatype));
        sb.append(", section=").append(String.valueOf(this.section));
        sb.append(", order=").append(String.valueOf(this.order));
        sb.append(", required=").append(String.valueOf(this.required));
        sb.append(", regexp=").append(String.valueOf(this.regexp));
        sb.append(", readOnly=").append(String.valueOf(this.readOnly));
        sb.append(", visible=").append(String.valueOf(this.visible));
        sb.append(", minLength=").append(String.valueOf(this.minLength));
        sb.append(", maxLength=").append(String.valueOf(this.maxLength));
        sb.append(", minSize=").append(String.valueOf(this.minSize));
        sb.append(", maxSize=").append(String.valueOf(this.maxSize));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppAttrRenderingMetadata)) {
            return false;
        }

        AppAttrRenderingMetadata other = (AppAttrRenderingMetadata) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.helptext, other.helptext)
                && java.util.Objects.equals(this.widget, other.widget)
                && java.util.Objects.equals(this.datatype, other.datatype)
                && java.util.Objects.equals(this.section, other.section)
                && java.util.Objects.equals(this.order, other.order)
                && java.util.Objects.equals(this.required, other.required)
                && java.util.Objects.equals(this.regexp, other.regexp)
                && java.util.Objects.equals(this.readOnly, other.readOnly)
                && java.util.Objects.equals(this.visible, other.visible)
                && java.util.Objects.equals(this.minLength, other.minLength)
                && java.util.Objects.equals(this.maxLength, other.maxLength)
                && java.util.Objects.equals(this.minSize, other.minSize)
                && java.util.Objects.equals(this.maxSize, other.maxSize)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.helptext == null ? 43 : this.helptext.hashCode());
        result = (result * PRIME) + (this.widget == null ? 43 : this.widget.hashCode());
        result = (result * PRIME) + (this.datatype == null ? 43 : this.datatype.hashCode());
        result = (result * PRIME) + (this.section == null ? 43 : this.section.hashCode());
        result = (result * PRIME) + (this.order == null ? 43 : this.order.hashCode());
        result = (result * PRIME) + (this.required == null ? 43 : this.required.hashCode());
        result = (result * PRIME) + (this.regexp == null ? 43 : this.regexp.hashCode());
        result = (result * PRIME) + (this.readOnly == null ? 43 : this.readOnly.hashCode());
        result = (result * PRIME) + (this.visible == null ? 43 : this.visible.hashCode());
        result = (result * PRIME) + (this.minLength == null ? 43 : this.minLength.hashCode());
        result = (result * PRIME) + (this.maxLength == null ? 43 : this.maxLength.hashCode());
        result = (result * PRIME) + (this.minSize == null ? 43 : this.minSize.hashCode());
        result = (result * PRIME) + (this.maxSize == null ? 43 : this.maxSize.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}

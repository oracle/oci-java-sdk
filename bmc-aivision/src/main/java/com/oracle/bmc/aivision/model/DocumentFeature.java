/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * Type of document analysis.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "featureType",
    defaultImpl = DocumentFeature.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DocumentTableDetectionFeature.class,
        name = "TABLE_DETECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DocumentKeyValueDetectionFeature.class,
        name = "KEY_VALUE_DETECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DocumentClassificationFeature.class,
        name = "DOCUMENT_CLASSIFICATION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DocumentTextDetectionFeature.class,
        name = "TEXT_DETECTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DocumentLanguageClassificationFeature.class,
        name = "LANGUAGE_CLASSIFICATION"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DocumentFeature {

    /**
     * Type of document analysis requested
     * Allowed values are:
     * - {@code LANGUAGE_CLASSIFICATION}: Detect the language.
     * - {@code TEXT_DETECTION}: Recognize text.
     * - {@code TABLE_DETECTION}: Detect and extract data in tables.
     * - {@code KEY_VALUE_DETECTION}: Extract form fields.
     * - {@code DOCUMENT_CLASSIFICATION}: Identify the type of document.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum FeatureType {
        LanguageClassification("LANGUAGE_CLASSIFICATION"),
        TextDetection("TEXT_DETECTION"),
        TableDetection("TABLE_DETECTION"),
        KeyValueDetection("KEY_VALUE_DETECTION"),
        DocumentClassification("DOCUMENT_CLASSIFICATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, FeatureType> map;

        static {
            map = new java.util.HashMap<>();
            for (FeatureType v : FeatureType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FeatureType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FeatureType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FeatureType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}

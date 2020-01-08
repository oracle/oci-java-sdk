/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

/**
 * Validates a definedTag value. Each validator performs validation steps in addition to the standard
 * validation for definedTag values. For more information, see
 * [Limits on Tags](https://docs.cloud.oracle.com/Content/Identity/Concepts/taggingoverview.htm#Limits).
 * <p>
 * If you define a validator after a value has been set for a defined tag, then any updates that
 * attempt to change the value must pass the additional validation defined by the current rule.
 * Previously set values (even those that would fail the current validation) are not updated. You can
 * still update other attributes to resources that contain a non-valid defined tag.
 * <p>
 * To clear the validator call UpdateTag with
 * [DefaultTagDefinitionValidator](https://docs.cloud.oracle.com/api/#/en/identity/latest/datatypes/DefaultTagDefinitionValidator).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "validatorType",
    defaultImpl = BaseTagDefinitionValidator.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DefaultTagDefinitionValidator.class,
        name = "DEFAULT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = EnumTagDefinitionValidator.class,
        name = "ENUM"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class BaseTagDefinitionValidator {

    /**
     * Specifies the type of validation: a static value (no validation) or a list.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ValidatorType {
        Enum("ENUM"),
        Default("DEFAULT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ValidatorType> map;

        static {
            map = new java.util.HashMap<>();
            for (ValidatorType v : ValidatorType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ValidatorType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ValidatorType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ValidatorType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}

/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.securityattribute.model;

/**
 * Validates a security attribute value. Each validator performs validation steps in addition to the
 * standard validation for security attribute values. For more information, see [Limits on Security
 * Attributes](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm).
 *
 * <p>If you define a validator after a value has been set for a security attribute, then any
 * updates that attempt to change the value must pass the additional validation defined by the
 * current rule. Previously set values (even those that would fail the current validation) are not
 * updated. You can still update other attributes to resources that contain a non-valid security
 * attribute.
 *
 * <p>To clear the validator call UpdateSecurityAttribute with
 * [DefaultSecuirtyAttributeValidator](https://docs.oracle.com/iaas/api/#/en/securityattribute/latest/datatypes/DefaultTagDefinitionValidator).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240815")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "validatorType",
        defaultImpl = BaseSecurityAttributeValidator.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = EnumSecurityAttributeValidator.class,
            name = "ENUM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DefaultSecurityAttributeValidator.class,
            name = "DEFAULT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class BaseSecurityAttributeValidator
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected BaseSecurityAttributeValidator() {
        super();
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
        sb.append("BaseSecurityAttributeValidator(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseSecurityAttributeValidator)) {
            return false;
        }

        BaseSecurityAttributeValidator other = (BaseSecurityAttributeValidator) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Specifies the type of validation: a static value (no validation) or a list. */
    public enum ValidatorType implements com.oracle.bmc.http.internal.BmcEnum {
        Enum("ENUM"),
        Default("DEFAULT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ValidatorType.class);

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
